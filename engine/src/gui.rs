// idm-gui — a download-manager window as a tiny self-contained web UI.
//
// `idm --serve ADDR --output-dir DIR --state-dir SDIR [--max-concurrent N]`
// starts an HTTP server that:
//   * serves the manager UI at `GET /`
//   * exposes a JSON queue API (`/api/items`, `/api/add`, `/api/pause`,
//     `/api/resume`, `/api/remove`)
//   * runs downloads by spawning this same binary in download mode
//   * persists the queue to `SDIR/queue.json` so it survives a restart
//
// No new dependencies: the HTTP server is a hand-rolled `tokio::net` loop and
// the progress of a running download is read from the engine's `.idmmeta`
// sidecar (which the downloader already maintains for resume).

use std::collections::HashMap;
use std::path::{Path, PathBuf};
use std::sync::atomic::{AtomicU64, Ordering};
use std::sync::Arc;

use serde::{Deserialize, Serialize};
use tokio::io::{AsyncReadExt, AsyncWriteExt};
use tokio::net::{TcpListener, TcpStream};
use tokio::process::Command;
use tokio::sync::{mpsc, Mutex, Semaphore};

/// The manager UI (vanilla JS, talks only to our own /api endpoints).
const INDEX_HTML: &str = r#"<!doctype html>
<html lang="cs"><head><meta charset="utf-8">
<meta name="viewport" content="width=device-width,initial-scale=1">
<title>IDM — stahování</title>
<style>
body{font:14px system-ui,sans-serif;margin:0;background:#111;color:#eee}
header{padding:12px 16px;background:#1b1b1b;border-bottom:1px solid #333}
h1{margin:0;font-size:16px}
form{display:flex;gap:8px;padding:12px 16px}
input{flex:1;padding:8px;background:#1b1b1b;border:1px solid #333;color:#eee;border-radius:4px}
button{padding:8px 12px;background:#2d6cdf;color:#fff;border:0;border-radius:4px;cursor:pointer}
button.sec{background:#333}
table{width:100%;border-collapse:collapse}
td,th{padding:8px 12px;border-bottom:1px solid #222;text-align:left;font-size:13px}
.bar{height:6px;background:#333;border-radius:3px;overflow:hidden;margin-top:4px}
.bar i{display:block;height:100%;background:#2d6cdf}
.done{color:#4caf50}.paused{color:#ff9800}.error{color:#e53935}.running{color:#2d6cdf}
</style></head>
<body>
<header><h1>IDM — správce stahování</h1></header>
<form id="add"><input id="url" placeholder="https://... (URL souboru nebo videa)" autocomplete="off"><button>Stáhnout</button></form>
<table><thead><tr><th>#</th><th>Soubor</th><th>Stav</th><th>Velikost</th><th></th></tr></thead><tbody id="rows"></tbody></table>
<script>
async function api(path, body){
  const o = body ? {method:'POST',headers:{'Content-Type':'application/json'},body:JSON.stringify(body)} : {};
  const r = await fetch(path, o); return r.json();
}
function fmt(n){ if(!n) return '—'; const u=['B','KB','MB','GB']; let i=0;
  while(n>=1024 && i<u.length-1){ n/=1024; i++; } return n.toFixed(i?1:0)+' '+u[i]; }
function name(u){ try { return decodeURIComponent(new URL(u).pathname.split('/').pop()||u); } catch(e){ return u; } }
async function refresh(){
  const d = await api('/api/items'); const tb = document.getElementById('rows'); tb.innerHTML='';
  for(const it of d.items){
    const pct = it.total ? Math.min(100, it.downloaded/it.total*100) : 0;
    const tr = document.createElement('tr');
    tr.innerHTML = '<td>'+it.id+'</td>'
      + '<td>'+name(it.url)+'<div class="bar"><i style="width:'+pct+'%"></i></div></td>'
      + '<td class="'+it.status+'">'+it.status+(it.error?' ('+it.error+')':'')+'</td>'
      + '<td>'+fmt(it.downloaded)+' / '+fmt(it.total)+'</td>';
    const td = document.createElement('td');
    if(it.status==='running' || it.status==='pending')
      td.innerHTML = '<button class="sec" data-a="pause" data-i="'+it.id+'">Pauza</button>';
    else if(it.status==='paused' || it.status==='error')
      td.innerHTML = '<button class="sec" data-a="resume" data-i="'+it.id+'">Pokračovat</button>';
    td.innerHTML += ' <button class="sec" data-a="remove" data-i="'+it.id+'">Odebrat</button>';
    tr.appendChild(td); tb.appendChild(tr);
  }
}
document.getElementById('add').addEventListener('submit', async e=>{
  e.preventDefault(); const u = document.getElementById('url').value.trim(); if(!u) return;
  await api('/api/add', {url:u}); document.getElementById('url').value=''; refresh();
});
document.getElementById('rows').addEventListener('click', async e=>{
  const b = e.target.closest('button'); if(!b) return;
  await api('/api/'+b.dataset.a, {id:+b.dataset.i}); refresh();
});
refresh(); setInterval(refresh, 1000);
</script></body></html>
"#;

/// One queue entry. This is exactly what gets persisted to disk.
#[derive(Clone, Serialize, Deserialize)]
struct Item {
    id: u64,
    url: String,
    output: PathBuf,
    #[serde(default = "default_conns")]
    connections: usize,
    #[serde(default)]
    status: String,
    #[serde(default)]
    downloaded: u64,
    #[serde(default)]
    total: u64,
    #[serde(default)]
    error: Option<String>,
}

fn default_conns() -> usize {
    4
}

/// Control messages sent to a running download task.
enum Ctrl {
    Pause,
    Remove,
}

struct State {
    items: Mutex<Vec<Item>>,
    ctrl: Mutex<HashMap<u64, mpsc::Sender<Ctrl>>>,
    next_id: AtomicU64,
    output_dir: PathBuf,
    state_path: PathBuf,
    engine: PathBuf,
    sem: Arc<Semaphore>,
}

/// Minimal view of the engine's `.idmmeta` sidecar (progress + total size).
#[derive(Deserialize)]
struct MetaLite {
    #[serde(default)]
    total: u64,
    #[serde(default)]
    segments: Vec<SegLite>,
}

#[derive(Deserialize)]
struct SegLite {
    #[serde(default)]
    downloaded: u64,
}

fn meta_path(out: &Path) -> PathBuf {
    let mut s = out.as_os_str().to_os_string();
    s.push(".idmmeta");
    PathBuf::from(s)
}

fn read_meta(out: &Path) -> Option<(u64, u64)> {
    let raw = std::fs::read_to_string(meta_path(out)).ok()?;
    let m: MetaLite = serde_json::from_str(&raw).ok()?;
    let dl: u64 = m.segments.iter().map(|s| s.downloaded).sum();
    Some((m.total, dl))
}

fn basename(url: &str) -> String {
    let u = url.trim_end_matches('/');
    let n = u.rsplit('/').next().unwrap_or("download.bin");
    let n = n.split('?').next().unwrap_or(n);
    if n.is_empty() {
        "download.bin".to_string()
    } else {
        n.to_string()
    }
}

fn load_items(path: &Path) -> Vec<Item> {
    let raw = match std::fs::read_to_string(path) {
        Ok(r) => r,
        Err(_) => return Vec::new(),
    };
    let mut items: Vec<Item> = serde_json::from_str(&raw).unwrap_or_default();
    // A previous process is gone, so anything that was mid-flight is paused.
    for i in &mut items {
        if i.status == "running" || i.status == "pending" {
            i.status = "paused".to_string();
        }
    }
    items
}

async fn save(st: &State) {
    let items = st.items.lock().await.clone();
    if let Ok(s) = serde_json::to_string_pretty(&items) {
        let _ = tokio::fs::write(&st.state_path, s).await;
    }
}

async fn set_status(st: &State, id: u64, status: &str, err: Option<String>) {
    {
        let mut g = st.items.lock().await;
        if let Some(i) = g.iter_mut().find(|i| i.id == id) {
            i.status = status.to_string();
            i.error = err;
        }
    }
    save(st).await;
}

async fn get_status(st: &State, id: u64) -> String {
    st.items
        .lock()
        .await
        .iter()
        .find(|i| i.id == id)
        .map(|i| i.status.clone())
        .unwrap_or_default()
}

async fn finish_item(st: &State, id: u64, size: u64) {
    {
        let mut g = st.items.lock().await;
        if let Some(i) = g.iter_mut().find(|i| i.id == id) {
            i.status = "done".to_string();
            i.error = None;
            i.total = size;
            i.downloaded = size;
        }
    }
    save(st).await;
}

async fn add_item(st: &Arc<State>, url: String, conns: usize) -> u64 {
    let id = st.next_id.fetch_add(1, Ordering::SeqCst);
    let output = st.output_dir.join(basename(&url));
    let item = Item {
        id,
        url,
        output,
        connections: conns.max(1),
        status: "pending".to_string(),
        downloaded: 0,
        total: 0,
        error: None,
    };
    st.items.lock().await.push(item);
    save(st).await;
    let st2 = st.clone();
    tokio::spawn(async move { run_item(st2, id).await; });
    id
}

/// Run one download, watching for pause/remove requests and progress updates.
async fn run_item(st: Arc<State>, id: u64) {
    let permit = match st.sem.clone().acquire_owned().await {
        Ok(p) => p,
        Err(_) => return,
    };
    let (url, output, conns) = {
        let g = st.items.lock().await;
        match g.iter().find(|i| i.id == id) {
            Some(i) => (i.url.clone(), i.output.clone(), i.connections),
            None => return,
        }
    };

    set_status(&st, id, "running", None).await;

    let mut cmd = Command::new(&st.engine);
    cmd.arg("-n")
        .arg(conns.to_string())
        .arg("-o")
        .arg(&output)
        .arg("--resume")
        .arg(&url);
    cmd.stdout(std::process::Stdio::null())
        .stderr(std::process::Stdio::null());

    let mut child = match cmd.spawn() {
        Ok(c) => c,
        Err(e) => {
            set_status(&st, id, "error", Some(format!("spawn failed: {}", e))).await;
            return;
        }
    };

    let (ctx, mut crx) = mpsc::channel::<Ctrl>(4);
    st.ctrl.lock().await.insert(id, ctx);

    loop {
        match child.try_wait() {
            Ok(Some(status)) => {
                if status.success() {
                    let size = std::fs::metadata(&output).map(|m| m.len()).unwrap_or(0);
                    finish_item(&st, id, size).await;
                } else {
                    let cur = get_status(&st, id).await;
                    if cur != "paused" && cur != "done" {
                        set_status(
                            &st,
                            id,
                            "error",
                            Some(format!("engine exited with {}", status)),
                        )
                        .await;
                    }
                }
                break;
            }
            Ok(None) => {}
            Err(e) => {
                set_status(&st, id, "error", Some(e.to_string())).await;
                break;
            }
        }

        tokio::select! {
            maybe = crx.recv() => {
                match maybe {
                    Some(Ctrl::Pause) => {
                        let _ = child.kill().await;
                        set_status(&st, id, "paused", None).await;
                        break;
                    }
                    Some(Ctrl::Remove) => {
                        let _ = child.kill().await;
                        break;
                    }
                    None => break,
                }
            }
            _ = tokio::time::sleep(std::time::Duration::from_millis(300)) => {
                // NOTE: read_meta() appends ".idmmeta" itself, so pass the
                // download path, not the sidecar path.
                if let Some((total, dl)) = read_meta(&output) {
                    {
                        let mut g = st.items.lock().await;
                        if let Some(i) = g.iter_mut().find(|i| i.id == id) {
                            i.total = total;
                            i.downloaded = dl;
                        }
                    }
                    save(&st).await;
                }
            }
        }
    }

    st.ctrl.lock().await.remove(&id);
    drop(permit);
}

// ---------- HTTP ----------

fn find_sub(hay: &[u8], needle: &[u8]) -> Option<usize> {
    hay.windows(needle.len()).position(|w| w == needle)
}

fn content_length(head: &str) -> usize {
    for l in head.lines() {
        let ll = l.to_ascii_lowercase();
        if let Some(v) = ll.strip_prefix("content-length:") {
            return v.trim().parse().unwrap_or(0);
        }
    }
    0
}

async fn read_req(sock: &mut TcpStream) -> std::io::Result<(String, String, Vec<u8>)> {
    let mut buf = Vec::new();
    let mut tmp = [0u8; 4096];
    let mut header_end: Option<usize> = None;
    loop {
        let n = sock.read(&mut tmp).await?;
        if n == 0 {
            break;
        }
        buf.extend_from_slice(&tmp[..n]);
        if header_end.is_none() {
            if let Some(p) = find_sub(&buf, b"\r\n\r\n") {
                header_end = Some(p + 4);
            }
        }
        if let Some(he) = header_end {
            let head = String::from_utf8_lossy(&buf[..he]).to_string();
            if buf.len() >= he + content_length(&head) {
                break;
            }
        }
    }
    let he = header_end.unwrap_or(buf.len());
    let head = String::from_utf8_lossy(&buf[..he]).to_string();
    let mut lines = head.lines();
    let req_line = lines.next().unwrap_or("");
    let mut parts = req_line.split_whitespace();
    let method = parts.next().unwrap_or("").to_string();
    let path = parts.next().unwrap_or("/").split('?').next().unwrap_or("/").to_string();
    let cl = content_length(&head);
    let body = if buf.len() >= he + cl && cl > 0 {
        buf[he..he + cl].to_vec()
    } else {
        Vec::new()
    };
    Ok((method, path, body))
}

fn reason(code: u16) -> &'static str {
    match code {
        200 => "OK",
        400 => "Bad Request",
        404 => "Not Found",
        405 => "Method Not Allowed",
        _ => "OK",
    }
}

async fn respond(sock: &mut TcpStream, code: u16, ctype: &str, body: &[u8]) {
    let head = format!(
        "HTTP/1.1 {} {}\r\nContent-Type: {}\r\nContent-Length: {}\r\nConnection: close\r\n\r\n",
        code,
        reason(code),
        ctype,
        body.len()
    );
    let _ = sock.write_all(head.as_bytes()).await;
    let _ = sock.write_all(body).await;
    let _ = sock.flush().await;
}

async fn handle_conn(mut sock: TcpStream, st: Arc<State>) {
    let (method, path, body) = match read_req(&mut sock).await {
        Ok(r) => r,
        Err(_) => return,
    };
    let json = "application/json";

    match (method.as_str(), path.as_str()) {
        ("GET", "/") => {
            respond(&mut sock, 200, "text/html; charset=utf-8", INDEX_HTML.as_bytes()).await;
        }
        ("GET", "/api/items") => {
            let items = st.items.lock().await.clone();
            let v = serde_json::json!({ "items": items });
            respond(&mut sock, 200, json, v.to_string().as_bytes()).await;
        }
        ("POST", "/api/add") => {
            let v: serde_json::Value = serde_json::from_slice(&body).unwrap_or_default();
            let url = v["url"].as_str().unwrap_or("").to_string();
            if url.is_empty() {
                respond(&mut sock, 400, json, br#"{"ok":false,"error":"missing url"}"#).await;
                return;
            }
            let conns = v["connections"].as_u64().unwrap_or(4) as usize;
            let id = add_item(&st, url, conns).await;
            let out = serde_json::json!({ "ok": true, "id": id });
            respond(&mut sock, 200, json, out.to_string().as_bytes()).await;
        }
        ("POST", "/api/pause") => {
            let v: serde_json::Value = serde_json::from_slice(&body).unwrap_or_default();
            let id = v["id"].as_u64().unwrap_or(0);
            if let Some(tx) = st.ctrl.lock().await.get(&id) {
                let _ = tx.send(Ctrl::Pause).await;
            }
            respond(&mut sock, 200, json, br#"{"ok":true}"#).await;
        }
        ("POST", "/api/resume") => {
            let v: serde_json::Value = serde_json::from_slice(&body).unwrap_or_default();
            let id = v["id"].as_u64().unwrap_or(0);
            let exists = st.items.lock().await.iter().any(|i| i.id == id);
            if exists {
                set_status(&st, id, "pending", None).await;
                let st2 = st.clone();
                tokio::spawn(async move { run_item(st2, id).await });
            }
            respond(&mut sock, 200, json, br#"{"ok":true}"#).await;
        }
        ("POST", "/api/remove") => {
            let v: serde_json::Value = serde_json::from_slice(&body).unwrap_or_default();
            let id = v["id"].as_u64().unwrap_or(0);
            if let Some(tx) = st.ctrl.lock().await.get(&id) {
                let _ = tx.send(Ctrl::Remove).await;
            }
            st.items.lock().await.retain(|i| i.id != id);
            st.ctrl.lock().await.remove(&id);
            save(&st).await;
            respond(&mut sock, 200, json, br#"{"ok":true}"#).await;
        }
        ("GET", _) | ("POST", _) => {
            respond(&mut sock, 404, "text/plain", b"not found").await;
        }
        _ => {
            respond(&mut sock, 405, "text/plain", b"method not allowed").await;
        }
    }
}

/// Start the manager UI + queue server. Runs until the process is killed.
pub async fn serve(
    addr: String,
    output_dir: PathBuf,
    state_dir: PathBuf,
    max_concurrent: usize,
    engine: PathBuf,
) -> anyhow::Result<()> {
    tokio::fs::create_dir_all(&output_dir).await.ok();
    tokio::fs::create_dir_all(&state_dir).await.ok();
    let state_path = state_dir.join("queue.json");

    let items = load_items(&state_path);
    let next = items.iter().map(|i| i.id).max().unwrap_or(0) + 1;

    let st = Arc::new(State {
        items: Mutex::new(items),
        ctrl: Mutex::new(HashMap::new()),
        next_id: AtomicU64::new(next),
        output_dir,
        state_path,
        engine,
        sem: Arc::new(Semaphore::new(max_concurrent.max(1))),
    });

    let listener = TcpListener::bind(&addr)
        .await
        .map_err(|e| anyhow::anyhow!("cannot bind {}: {}", addr, e))?;
    println!("[*] IDM GUI on http://{}", addr);
    println!("[*] downloads -> {}", st.output_dir.display());

    loop {
        match listener.accept().await {
            Ok((sock, _)) => {
                let st = st.clone();
                tokio::spawn(async move {
                    handle_conn(sock, st).await;
                });
            }
            Err(e) => {
                eprintln!("[!] accept: {}", e);
            }
        }
    }
}