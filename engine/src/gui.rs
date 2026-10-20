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
use crate::console::HideConsole;

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
input.desc{width:100%;flex:none;padding:4px 6px;font:inherit}
</style></head>
<body>
<header><h1>IDM — správce stahování</h1></header>
<form id="add"><input id="url" placeholder="https://... (URL souboru nebo videa)" autocomplete="off"><button>Stáhnout</button></form>
<table><thead><tr><th>#</th><th>Soubor</th><th>Stav</th><th>Velikost</th><th>Popis</th><th></th></tr></thead><tbody id="rows"></tbody></table>
<script>
const TOKEN = '__IDM_TOKEN__';
async function api(path, body){
  const o = body
    ? {method:'POST',headers:{'Content-Type':'application/json','X-IDM-Token':TOKEN},body:JSON.stringify(body)}
    : {headers:{'X-IDM-Token':TOKEN}};
  const r = await fetch(path, o); return r.json();
}
function fmt(n){ if(!n) return '—'; const u=['B','KB','MB','GB']; let i=0;
  while(n>=1024 && i<u.length-1){ n/=1024; i++; } return n.toFixed(i?1:0)+' '+u[i]; }
function name(u){ try { return decodeURIComponent(new URL(u).pathname.split('/').pop()||u); } catch(e){ return u; } }
async function refresh(){
  // Never rebuild the table while a description is being typed: the poll runs
  // every second and would throw the half-written note away.
  const ae = document.activeElement;
  if(ae && ae.dataset && ae.dataset.a==='desc') return;
  const d = await api('/api/items'); const tb = document.getElementById('rows'); tb.innerHTML='';
  for(const it of d.items){
    const pct = it.total ? Math.min(100, it.downloaded/it.total*100) : 0;
    const tr = document.createElement('tr');
    tr.innerHTML = '<td>'+it.id+'</td>'
      + '<td>'+name(it.url)+'<div class="bar"><i style="width:'+pct+'%"></i></div></td>'
      + '<td class="'+it.status+'">'+it.status+(it.error?' ('+it.error+')':'')+'</td>'
      + '<td>'+fmt(it.downloaded)+' / '+fmt(it.total)+'</td>';
    // The description is free-form user text, so it goes in through .value
    // rather than innerHTML.
    const dtd = document.createElement('td');
    const di = document.createElement('input');
    di.className='desc'; di.dataset.a='desc'; di.dataset.i=it.id;
    di.placeholder='popis'; di.value=it.description||'';
    dtd.appendChild(di); tr.appendChild(dtd);
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
document.getElementById('rows').addEventListener('change', async e=>{
  const i = e.target.closest('input[data-a="desc"]'); if(!i) return;
  await api('/api/update', {id:+i.dataset.i, description:i.value});
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
    /// Download through aria2c instead of the built-in engine.
    #[serde(default)]
    aria2: bool,
    /// Options the GUI resolved from its Options dialog (settings.json).
    /// Empty means "use the engine default", so an older queue file still loads.
    #[serde(default)]
    user_agent: String,
    #[serde(default)]
    proxy: String,
    /// Bytes/second cap, converted from the Connection tab's quota. 0 = off.
    #[serde(default)]
    limit_rate: u64,
    /// HTTP basic credentials as USER:PASSWORD, from the Site Logins tab.
    /// LEGACY: only still read, so a queue file written by an older build
    /// keeps working. New entries use auth_user + auth_ref and leave this
    /// empty; the migration in `save` empties it once the password is in the
    /// vault.
    #[serde(default)]
    auth: String,
    /// The user half of the credentials. Not a secret -- it is on screen in
    /// the Site Logins list -- and kept apart from the password so that a
    /// password containing a colon stays unambiguous.
    #[serde(default)]
    auth_user: String,
    /// `secret:<16 hex>` pointing into STATE_DIR/secrets.json.
    #[serde(default)]
    auth_ref: String,
    /// Resume even when the server reports a different Last-Modified.
    #[serde(default)]
    ignore_mtime: bool,
    /// Which queue this download belongs to. Empty = the main queue. The GUI
    /// starts and stops queues; the engine only records the membership.
    #[serde(default)]
    queue: String,
    /// How many times a failed download may be retried (the Scheduler's
    /// "number of retries for each file"). 0 = fail immediately.
    #[serde(default)]
    retries: u32,
    /// Retries already spent. Reset when the download is resumed by hand.
    #[serde(default)]
    attempts: u32,
    /// Unix seconds at which the next attempt is due. 0 = nothing scheduled.
    /// A timestamp on the item rather than a sleeping task, so a retry also
    /// survives a restart -- and so run_item never has to call itself, which
    /// makes its future's type refer to itself and does not compile.
    #[serde(default)]
    retry_at: u64,
    /// yt-dlp format selector chosen in the Download File Info dialog
    /// (e.g. "137+140"). Empty = let the backend pick.
    #[serde(default)]
    format: String,
    /// Raw Cookie header, for media behind a login.
    #[serde(default)]
    cookie: String,
    #[serde(default)]
    referer: String,
    /// Browser to read cookies from for yt-dlp (chrome, chromium, firefox, ...)
    #[serde(default)]
    cookies_from_browser: String,
    /// Private Netscape file holding the browser's cookies for this item
    /// (sent by the extension). Only the path is persisted; the file lives
    /// in STATE_DIR/cookies and is removed when the item finishes or goes.
    #[serde(default)]
    cookies_file: String,
    /// Force the yt-dlp path even for a URL that does not look like media.
    #[serde(default)]
    force_media: bool,
    /// Free-form note from the Properties dialog. Metadata only: nothing in
    /// the engine reads it, it just has to survive a restart.
    #[serde(default)]
    description: String,
    #[serde(default)]
    status: String,
    #[serde(default)]
    downloaded: u64,
    #[serde(default)]
    total: u64,
    #[serde(default)]
    error: Option<String>,
}

impl Item {
    /// A copy safe to hand out over the API: no server password, and no proxy
    /// password inside the proxy URL's user-info.
    ///
    /// This is a clone rather than a `skip_serializing` attribute on the field,
    /// because the very same Serialize impl writes `queue.json`, which does
    /// need the credentials to survive a restart.
    fn redacted(&self) -> Item {
        let mut out = self.clone();
        out.auth = String::new();
        out.proxy = redact_url_password(&out.proxy);
        out
    }
}

/// `http://bob:hunter2@host:8080` -> `http://bob@host:8080`. Anything without
/// user-info comes back untouched -- a proxy host is not a secret.
fn redact_url_password(url: &str) -> String {
    let (scheme, rest) = match url.split_once("//") {
        Some((s, r)) => (s, r),
        None => return url.to_string(),
    };
    let (userinfo, host) = match rest.rsplit_once('@') {
        Some((u, h)) => (u, h),
        None => return url.to_string(),
    };
    let user = userinfo.split_once(':').map(|(u, _)| u).unwrap_or(userinfo);
    format!("{}//{}@{}", scheme, user, host)
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
    /// Passed through to the child engine, so the media backend the user
    /// configured is also the one a queued download and /api/formats use.
    yt_dlp: PathBuf,
    sem: Arc<Semaphore>,
    /// Shared secret every /api/* request must present (see `authorized`).
    token: String,
    /// Our own origin, e.g. `http://127.0.0.1:8080`.
    origin: String,
    /// Live transfer rate per item. Deliberately NOT part of `Item`: a speed
    /// is a reading, not state, and persisting it into queue.json would make a
    /// restart display a rate nothing is producing.
    rates: Mutex<HashMap<u64, Rate>>,
}

/// A smoothed transfer rate, sampled from the sidecar the queue already polls
/// for progress. The raw difference across one 300 ms look jumps around far
/// too much to read, so each sample is blended into the previous one.
struct Rate {
    at: std::time::Instant,
    bytes: u64,
    bps: f64,
}

/// Blend a fresh sample into the running figure. Pure, so the arithmetic can
/// be tested without waiting for real seconds to pass.
fn blend_rate(prev_bps: f64, delta_bytes: u64, delta: std::time::Duration) -> f64 {
    let secs = delta.as_secs_f64();
    if secs <= 0.0 {
        return prev_bps;
    }
    let instant = delta_bytes as f64 / secs;
    if prev_bps <= 0.0 {
        instant
    } else {
        // Two parts history to one part news: steady enough to read, quick
        // enough to notice a stall.
        prev_bps * 0.7 + instant * 0.3
    }
}

/// Seconds left at the current rate. `None` while there is nothing to divide
/// by -- an unknown size or a standing start -- because a made-up ETA is worse
/// than an empty cell.
fn eta_secs(total: u64, downloaded: u64, bps: f64) -> Option<u64> {
    if total == 0 || bps < 1.0 || downloaded >= total {
        return None;
    }
    Some(((total - downloaded) as f64 / bps).ceil() as u64)
}

/// Request headers we care about, lowercased names -> raw values.
fn header(head: &str, name: &str) -> Option<String> {
    for l in head.lines().skip(1) {
        let (k, v) = l.split_once(':')?;
        if k.trim().eq_ignore_ascii_case(name) {
            return Some(v.trim().to_string());
        }
    }
    None
}

/// Gate for the whole /api surface.
///
/// The server listens on loopback, which means *every* page in the user's
/// browser can reach it. Without this a visited web page could enqueue
/// downloads (CSRF), so we require all three of:
///   * `X-IDM-Token` matching the secret handed to our own UI / the native GUI,
///   * no cross-origin `Origin` header,
///   * `Content-Type: application/json` on writes, which a browser cannot send
///     cross-origin without a preflight we never answer.
fn authorized(head: &str, st: &State, write: bool) -> Result<(), &'static str> {
    match header(head, "origin") {
        Some(o) if o != st.origin && o != "null" => return Err("cross-origin request rejected"),
        _ => {}
    }
    if let Some(s) = header(head, "sec-fetch-site") {
        if s != "same-origin" && s != "none" {
            return Err("cross-site request rejected");
        }
    }
    if write {
        let ct = header(head, "content-type").unwrap_or_default();
        if !ct.to_ascii_lowercase().starts_with("application/json") {
            return Err("expected Content-Type: application/json");
        }
    }
    let given = header(head, "x-idm-token").unwrap_or_default();
    if given.as_bytes() != st.token.as_bytes() {
        return Err("missing or invalid X-IDM-Token");
    }
    Ok(())
}

/// A token with no dependency on a RNG crate: OS randomness, hex-encoded.
fn new_token() -> String {
    let mut buf = [0u8; 24];
    if std::fs::File::open("/dev/urandom")
        .and_then(|mut f| std::io::Read::read_exact(&mut f, &mut buf))
        .is_err()
    {
        // Windows / no /dev/urandom: mix in whatever varies per process.
        let seed = std::time::SystemTime::now()
            .duration_since(std::time::UNIX_EPOCH)
            .map(|d| d.as_nanos())
            .unwrap_or(0)
            ^ (std::process::id() as u128) << 64;
        for (i, b) in buf.iter_mut().enumerate() {
            *b = ((seed >> (i % 16 * 8)) as u8) ^ (i as u8).wrapping_mul(31);
        }
    }
    buf.iter().map(|b| format!("{:02x}", b)).collect()
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

#[derive(Deserialize)]
struct ReportLite {
    #[serde(default)]
    file: String,
    #[serde(default)]
    total: u64,
}

/// Where the child engine should write its report for item `id`.
///
/// Beside queue.json in the state dir, never in the download directory: it is
/// bookkeeping, and the user's Downloads folder is not ours to litter.
fn report_path(state_path: &Path, id: u64) -> PathBuf {
    let dir = state_path.parent().unwrap_or(Path::new("."));
    dir.join("reports").join(format!("{}.json", id))
}

/// The file a report may rename an item to, if any.
///
/// yt-dlp's merger picks the container, so the name we asked for and the name
/// on disk legitimately differ — but only within the same directory. A report
/// naming anything elsewhere is refused rather than trusted: the queue's
/// output path is what later deletes, opens and reveals the file.
fn accept_reported_file(asked: &Path, reported: &str) -> Option<PathBuf> {
    if reported.is_empty() {
        return None;
    }
    let got = PathBuf::from(reported);
    if got == asked {
        return None;
    }
    if got.parent() != asked.parent() {
        return None;
    }
    if got.file_name().is_none() {
        return None;
    }
    Some(got)
}

/// (real file, size) from a child's report, when it wrote one.
fn read_report(path: &Path, asked: &Path) -> Option<(Option<PathBuf>, u64)> {
    let raw = std::fs::read_to_string(path).ok()?;
    let r: ReportLite = serde_json::from_str(&raw).ok()?;
    Some((accept_reported_file(asked, &r.file), r.total))
}

/// File name for a URL, safe to join onto the output directory.
///
/// The name comes from a remote URL, so it is sanitized: no path separators
/// (a backslash is one on Windows), no `..`, nothing that could escape the
/// download directory.
fn basename(url: &str) -> String {
    // Shared with the engine's --output fallback so both agree, and so a URL
    // like `.../slug/?utm=...` yields `slug` instead of an empty name that
    // would make the queue write into the download directory itself.
    crate::media::filename_from_url(url)
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

/// The vault that belongs to this server's state directory.
fn vault_of(st: &State) -> crate::secrets::Vault {
    let dir = st
        .state_path
        .parent()
        .map(|p| p.to_path_buf())
        .unwrap_or_else(|| std::path::PathBuf::from("."));
    crate::secrets::Vault::new(&dir)
}

/// "user:password" -> (user, password). Split on the FIRST colon, so a
/// password containing one survives, exactly as the engine has always done.
fn split_auth(auth: &str) -> (String, String) {
    match auth.split_once(':') {
        Some((u, p)) => (u.to_string(), p.to_string()),
        None => (auth.to_string(), String::new()),
    }
}

/// Move any plaintext password left by an older build into the vault. Runs on
/// the way to disk, never on the way in: reading a queue file stays reading.
///
/// A failure leaves the plaintext exactly where it is. Losing a password is
/// worse for the user than keeping it in the clear a little longer, so this
/// reports and gives up rather than writing an entry it cannot resolve later.
async fn migrate_plaintext_auth(st: &State, items: &mut Vec<Item>) {
    if !items.iter().any(|i| !i.auth.is_empty() && i.auth_ref.is_empty()) {
        return;
    }
    // The only way back to an older build. Written before anything changes.
    if st.state_path.exists() {
        let backup = st.state_path.with_extension("json.pre-secrets");
        if !backup.exists() {
            if let Ok(raw) = tokio::fs::read(&st.state_path).await {
                let _ = tokio::fs::write(&backup, &raw).await;
                #[cfg(unix)]
                {
                    use std::os::unix::fs::PermissionsExt;
                    let _ = std::fs::set_permissions(
                        &backup,
                        std::fs::Permissions::from_mode(0o600),
                    );
                }
            }
        }
    }
    let vault = vault_of(st);
    for i in items.iter_mut() {
        if i.auth.is_empty() || !i.auth_ref.is_empty() {
            continue;
        }
        let (user, pass) = split_auth(&i.auth);
        match vault.set(&pass) {
            Ok(r) => {
                i.auth_user = user;
                i.auth_ref = r;
                i.auth = String::new();
            }
            Err(e) => eprintln!("[!] cannot migrate a stored password: {:#}", e),
        }
    }
}

async fn save(st: &State) {
    {
        let mut g = st.items.lock().await;
        let mut items = g.clone();
        migrate_plaintext_auth(st, &mut items).await;
        *g = items;
    }
    let items = st.items.lock().await.clone();
    if let Ok(s) = serde_json::to_string_pretty(&items) {
        // Atomically: a plain write leaves the file truncated for as long as
        // it takes to fill it again, so a reader -- or a crash -- can see half
        // a queue. Writing a temp file and renaming it means the queue is
        // always either the old one or the new one.
        //
        // 0600 from the first byte, too: the queue holds a vault reference and
        // a proxy URL that can carry a password. Windows has no modes; there
        // the file inherits the per-user ACL of its directory.
        let tmp = st.state_path.with_extension("json.tmp");
        let wrote = {
            let mut opts = std::fs::OpenOptions::new();
            opts.write(true).create(true).truncate(true);
            #[cfg(unix)]
            {
                use std::os::unix::fs::OpenOptionsExt;
                opts.mode(0o600);
            }
            match opts.open(&tmp) {
                Ok(mut f) => {
                    // No fsync: save() runs on every status change, and the
                    // rename below is what readers need. Durability across a
                    // power cut is not worth an fsync per progress update.
                    use std::io::Write;
                    f.write_all(s.as_bytes()).is_ok()
                }
                Err(_) => false,
            }
        };
        if wrote {
            let _ = std::fs::rename(&tmp, &st.state_path);
        }
        #[cfg(unix)]
        {
            use std::os::unix::fs::PermissionsExt;
            let _ = std::fs::set_permissions(
                &st.state_path,
                std::fs::Permissions::from_mode(0o600),
            );
        }
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

async fn finish_item(st: &State, id: u64, size: u64, file: Option<PathBuf>) {
    {
        let mut g = st.items.lock().await;
        if let Some(i) = g.iter_mut().find(|i| i.id == id) {
            i.status = "done".to_string();
            i.error = None;
            i.total = size;
            i.downloaded = size;
            // Done: the session cookies have nothing left to do on disk.
            if !i.cookies_file.is_empty() {
                let _ = std::fs::remove_file(&i.cookies_file);
                i.cookies_file.clear();
            }
            if let Some(f) = file {
                i.output = f;
            }
        }
    }
    save(st).await;
}

/// How long a failed download waits before its next attempt.
const RETRY_DELAY_SECS: u64 = 5;

/// Per-download options the GUI sends with /api/add.
///
/// They come straight from the Options dialog: without them every download ran
/// with the engine defaults and the dialog was decoration.
#[derive(Default, Clone)]
struct AddOptions {
    out_dir: String,
    user_agent: String,
    proxy: String,
    limit_rate: u64,
    auth: String,
    auth_user: String,
    auth_password_ref: String,
    ignore_mtime: bool,
    queue: String,
    retries: u32,
    format: String,
    cookie: String,
    referer: String,
    cookies_from_browser: String,
    /// Browser cookies (`chrome.cookies` objects) for yt-dlp.
    cookies: Vec<serde_json::Value>,
    force_media: bool,
    /// Target file name, from IDM's `/f NAME`. Empty = derive it from the URL.
    filename: String,
}

async fn add_item(
    st: &Arc<State>,
    url: String,
    conns: usize,
    aria2: bool,
    opts: AddOptions,
) -> u64 {
    let id = st.next_id.fetch_add(1, Ordering::SeqCst);
    // The GUI's "Save To" tab (default directory, or the directory for this
    // file's category) wins over the server-wide output dir.
    let dir = if opts.out_dir.is_empty() {
        st.output_dir.clone()
    } else {
        PathBuf::from(&opts.out_dir)
    };
    if !opts.out_dir.is_empty() {
        let _ = std::fs::create_dir_all(&dir);
    }
    // `/f NAME` renames the target. The value can arrive from a desktop file
    // association, so only the file component is kept: a name carrying `..` or
    // an absolute path must not write outside the download directory.
    let wanted = Path::new(&opts.filename)
        .file_name()
        .map(|n| n.to_string_lossy().to_string())
        .filter(|n| !n.is_empty() && n != "." && n != "..")
        .unwrap_or_else(|| basename(&url));
    let output = dir.join(wanted);

    // Credentials: a reference the GUI already made, or the legacy
    // "user:password" field, whose password goes into the vault right here so
    // that no new plaintext reaches queue.json. If the vault refuses, the
    // plaintext is kept -- a download that cannot authenticate is worse than a
    // password that waits one more day for its migration.
    let (auth_user, auth_ref, plain_auth) = if !opts.auth_password_ref.is_empty() {
        (opts.auth_user.clone(), opts.auth_password_ref.clone(), String::new())
    } else if !opts.auth.is_empty() {
        let (user, pass) = split_auth(&opts.auth);
        match vault_of(st).set(&pass) {
            Ok(r) => (user, r, String::new()),
            Err(e) => {
                eprintln!("[!] cannot store the password in the vault: {:#}", e);
                (String::new(), String::new(), opts.auth.clone())
            }
        }
    } else {
        (opts.auth_user.clone(), String::new(), String::new())
    };

    let cookies_file = crate::cookies::netscape_file(&opts.cookies)
        .and_then(|body| {
            let dir = st.state_path.parent()?.join("cookies");
            std::fs::create_dir_all(&dir).ok()?;
            let path = dir.join(format!("item-{}.txt", id));
            let _ = std::fs::remove_file(&path);
            crate::cookies::write_private(&path, &body).ok()?;
            Some(path.to_string_lossy().to_string())
        })
        .unwrap_or_default();

    let item = Item {
        id,
        url,
        output,
        connections: conns.max(1),
        aria2,
        user_agent: opts.user_agent,
        proxy: opts.proxy,
        limit_rate: opts.limit_rate,
        auth: plain_auth,
        auth_user,
        auth_ref,
        ignore_mtime: opts.ignore_mtime,
        queue: opts.queue,
        retries: opts.retries,
        format: opts.format,
        cookie: opts.cookie,
        referer: opts.referer,
        cookies_from_browser: opts.cookies_from_browser,
        cookies_file,
        force_media: opts.force_media,
        attempts: 0,
        retry_at: 0,
        description: String::new(),
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

/// Kill a download child *and* everything it spawned.
///
/// The child runs in its own process group (see `run_item`), so one signal to
/// `-pid` reaches an aria2c grandchild too. Without this, pause stops the
/// engine but leaves aria2c writing into the same output file.
async fn kill_tree(child: &mut tokio::process::Child) {
    #[cfg(unix)]
    if let Some(pid) = child.id() {
        // SAFETY: plain kill(2) on a group we created ourselves.
        unsafe {
            libc::kill(-(pid as i32), libc::SIGKILL);
        }
        let _ = child.wait().await;
        return;
    }
    let _ = child.kill().await;
}

/// How many lines of a child's stderr are worth keeping.
const STDERR_TAIL_LINES: usize = 5;

/// The longest error we will put in an item -- it has to fit a table cell.
const ERROR_MAX_CHARS: usize = 300;

/// What to tell the user about a child that exited badly.
///
/// The exit status on its own ("exit status: 1") is the same sentence for a
/// missing yt-dlp, an unwritable directory and a refused connection, so the
/// child's own last words are what actually goes in. The status is kept as a
/// suffix for the case where the child died saying nothing at all.
async fn child_error(tail: &Arc<Mutex<Vec<String>>>, status: std::process::ExitStatus) -> String {
    let lines = tail.lock().await;
    let said = lines
        .iter()
        .rev()
        .find(|l| !l.is_empty())
        .cloned()
        .unwrap_or_default();
    if said.is_empty() {
        return format!("engine exited with {}", status);
    }
    let mut msg = said;
    if msg.chars().count() > ERROR_MAX_CHARS {
        msg = msg.chars().take(ERROR_MAX_CHARS).collect::<String>() + "...";
    }
    msg
}


/// Run one download, watching for pause/remove requests and progress updates.
async fn run_item(st: Arc<State>, id: u64) {
    // Belt and braces next to the /api/resume guard: never two engines per item.
    if st.ctrl.lock().await.contains_key(&id) {
        return;
    }
    let permit = match st.sem.clone().acquire_owned().await {
        Ok(p) => p,
        Err(_) => return,
    };
    let (
        url,
        output,
        conns,
        aria2,
        user_agent,
        proxy,
        limit_rate,
        auth,
        auth_user,
        auth_ref,
        ignore_mtime,
        format,
        cookie,
        referer,
        cookies_from_browser,
        cookies_file,
        force_media,
    ) = {
        let g = st.items.lock().await;
        match g.iter().find(|i| i.id == id) {
            Some(i) => (
                i.url.clone(),
                i.output.clone(),
                i.connections,
                i.aria2,
                i.user_agent.clone(),
                i.proxy.clone(),
                i.limit_rate,
                i.auth.clone(),
                i.auth_user.clone(),
                i.auth_ref.clone(),
                i.ignore_mtime,
                i.format.clone(),
                i.cookie.clone(),
                i.referer.clone(),
                i.cookies_from_browser.clone(),
                i.cookies_file.clone(),
                i.force_media,
            ),
            None => return,
        }
    };

    // Unlock the stored password now, at the moment of use. A vault that will
    // not open ends the download with an error instead of trying without
    // credentials: the server would answer 401 in the middle of a resume and
    // the failure would read like a network fault.
    let credentials = if !auth_ref.is_empty() {
        match vault_of(&st).get(&auth_ref) {
            Ok(pass) => format!("{}:{}", auth_user, pass),
            Err(e) => {
                eprintln!("[x] {:#}", e);
                set_status(
                    &st,
                    id,
                    "error",
                    Some("cannot unlock stored password".to_string()),
                )
                .await;
                return;
            }
        }
    } else {
        // Legacy plaintext, from a queue file not migrated yet.
        auth
    };

    set_status(&st, id, "running", None).await;

    let mut cmd = Command::new(&st.engine);
    cmd.hide_console();
    cmd.arg("-n")
        .arg(conns.to_string())
        .arg("-o")
        .arg(&output);
    if aria2 {
        // The engine auto-installs aria2c if missing, so this works on a clean
        // machine too.
        cmd.arg("--aria2");
    } else {
        cmd.arg("--resume");
    }
    // Options-dialog values. Empty means "leave the engine default alone".
    if !user_agent.is_empty() {
        cmd.arg("--user-agent").arg(&user_agent);
    }
    if !proxy.is_empty() {
        cmd.arg("--proxy").arg(&proxy);
    }
    if limit_rate > 0 {
        cmd.arg("--limit-rate").arg(limit_rate.to_string());
    }
    if !credentials.is_empty() {
        // Through the environment, not argv: process arguments are readable by
        // every process of this user (`ps`, /proc/<pid>/cmdline), while
        // /proc/<pid>/environ is readable only by the owner. The engine reads
        // the variable named here and keeps it from its own children.
        cmd.env("IDM_AUTH", &credentials);
        cmd.arg("--auth-env").arg("IDM_AUTH");
    }
    if ignore_mtime {
        cmd.arg("--ignore-mtime");
    }
    // Media options from the Download File Info dialog. The format selector is
    // the reason these are stored per item: a retry or a resume that fell back
    // to "best" would quietly fetch a different file than the user picked.
    if !format.is_empty() {
        cmd.arg("--format").arg(&format);
    }
    if !cookie.is_empty() {
        cmd.arg("--cookie").arg(&cookie);
    }
    if !referer.is_empty() {
        cmd.arg("--referer").arg(&referer);
    }
    if !cookies_from_browser.is_empty() {
        cmd.arg("--cookies-from-browser").arg(&cookies_from_browser);
    }
    // The engine turns this into yt-dlp's --cookies (see media::apply_auth).
    if !cookies_file.is_empty() && Path::new(&cookies_file).is_file() {
        cmd.env("IDM_COOKIES_FILE", &cookies_file);
    }
    if force_media {
        cmd.arg("--force-media");
    }
    cmd.arg("--yt-dlp-path").arg(&st.yt_dlp);
    // The child's stdout goes to /dev/null, so this file is the only way back:
    // it says which file was really written (yt-dlp renames) and how big it is.
    let report = report_path(&st.state_path, id);
    let _ = std::fs::remove_file(&report);
    cmd.arg("--report").arg(&report);
    // `--` so a URL starting with `-` is never parsed as a flag by the child.
    cmd.arg("--").arg(&url);
    // stdout is progress noise and goes nowhere, but stderr is the only place
    // the child ever says WHY it failed. Discarding it left every failure
    // looking like "engine exited with exit status: 1" -- the same silence the
    // GUI used to have about "address in use", one level down.
    cmd.stdout(std::process::Stdio::null())
        .stderr(std::process::Stdio::piped());
    // Own process group, so pause/remove can take down the whole tree
    // (the engine *and* an aria2c it may have spawned) instead of orphaning a
    // grandchild that keeps writing the same file.
    #[cfg(unix)]
    cmd.process_group(0);

    let mut child = match cmd.spawn() {
        Ok(c) => c,
        Err(e) => {
            set_status(&st, id, "error", Some(format!("spawn failed: {}", e))).await;
            return;
        }
    };

    // Drain stderr as it arrives. A pipe nobody reads fills up and then the
    // child blocks writing to it, so this is not optional once it is piped.
    // Only the last few lines are kept: the error ends up in a table cell and
    // in queue.json, and a wall of output is as unusable as none.
    let tail: Arc<Mutex<Vec<String>>> = Arc::new(Mutex::new(Vec::new()));
    let mut stderr_task: Option<tokio::task::JoinHandle<()>> = None;
    if let Some(err) = child.stderr.take() {
        let tail = Arc::clone(&tail);
        stderr_task = Some(tokio::spawn(async move {
            use tokio::io::{AsyncBufReadExt, BufReader};
            let mut lines = BufReader::new(err).lines();
            while let Ok(Some(line)) = lines.next_line().await {
                let line = line.trim().to_string();
                if line.is_empty() {
                    continue;
                }
                let mut t = tail.lock().await;
                if t.len() == STDERR_TAIL_LINES {
                    t.remove(0);
                }
                t.push(line);
            }
        }));
    }

    let (ctx, mut crx) = mpsc::channel::<Ctrl>(4);
    st.ctrl.lock().await.insert(id, ctx);

    loop {
        match child.try_wait() {
            Ok(Some(status)) => {
                // The drain task may not have been polled yet: when the child
                // dies fast, try_wait can see the exit before the reader has
                // consumed the last lines, and child_error would then report
                // the bare status instead of the child's own words. Bounded
                // wait, so a grandchild holding the pipe open cannot hang us.
                if let Some(h) = stderr_task.take() {
                    let _ = tokio::time::timeout(
                        std::time::Duration::from_millis(500),
                        h,
                    )
                    .await;
                }
                if status.success() {
                    // metadata(&output) was the old answer, and it is wrong
                    // whenever the child wrote a different name: it reported
                    // zero, so the queue showed "-" for the size of a finished
                    // download. The report knows both; the stat stays as the
                    // fallback for a child too old to write one.
                    let (real, size) = match read_report(&report, &output) {
                        Some((f, t)) if t > 0 => (f, t),
                        Some((f, _)) => {
                            let p = f.clone().unwrap_or_else(|| output.clone());
                            (f, std::fs::metadata(&p).map(|m| m.len()).unwrap_or(0))
                        }
                        None => (
                            None,
                            std::fs::metadata(&output).map(|m| m.len()).unwrap_or(0),
                        ),
                    };
                    let _ = std::fs::remove_file(&report);
                    finish_item(&st, id, size, real).await;
                } else {
                    let cur = get_status(&st, id).await;
                    if cur != "paused" && cur != "done" {
                        // A failed download goes back to the end of the queue
                        // while it still has attempts left, instead of just
                        // being marked as failed.
                        let budget = {
                            let mut items = st.items.lock().await;
                            match items.iter_mut().find(|i| i.id == id) {
                                Some(i) if i.attempts < i.retries => {
                                    i.attempts += 1;
                                    i.retry_at = now_secs() + RETRY_DELAY_SECS;
                                    Some((i.attempts, i.retries))
                                }
                                _ => None,
                            }
                        };
                        if let Some((attempt, total)) = budget {
                            save(&st).await;
                            set_status(
                                &st,
                                id,
                                "pending",
                                Some(format!(
                                    "retry {}/{} after {}",
                                    attempt,
                                    total,
                                    child_error(&tail, status).await
                                )),
                            )
                            .await;
                            break;
                        }
                        set_status(
                            &st,
                            id,
                            "error",
                            Some(child_error(&tail, status).await),
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
                        kill_tree(&mut child).await;
                        set_status(&st, id, "paused", None).await;
                        break;
                    }
                    Some(Ctrl::Remove) => {
                        kill_tree(&mut child).await;
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
                    // Same look, one more reading: the difference since the
                    // previous sample IS the speed, so /api/items can answer
                    // "how fast" and "how long" without a second source.
                    {
                        let now = std::time::Instant::now();
                        let mut r = st.rates.lock().await;
                        let next = match r.get(&id) {
                            Some(prev) => Rate {
                                at: now,
                                bytes: dl,
                                bps: blend_rate(
                                    prev.bps,
                                    dl.saturating_sub(prev.bytes),
                                    now.duration_since(prev.at),
                                ),
                            },
                            None => Rate { at: now, bytes: dl, bps: 0.0 },
                        };
                        r.insert(id, next);
                    }
                    save(&st).await;
                }
            }
        }
    }

    st.ctrl.lock().await.remove(&id);
    drop(permit);
}

fn now_secs() -> u64 {
    std::time::SystemTime::now()
        .duration_since(std::time::UNIX_EPOCH)
        .map(|d| d.as_secs())
        .unwrap_or(0)
}

/// Re-runs downloads whose retry has come due.
///
/// A separate top-level task rather than run_item re-invoking itself: the
/// recursion would make run_item's future contain its own type, which the
/// compiler cannot prove Send. It also picks up a retry that was still
/// pending when the engine was restarted.
async fn retry_sweeper(st: Arc<State>) {
    loop {
        tokio::time::sleep(std::time::Duration::from_secs(1)).await;
        let now = now_secs();
        let due: Vec<u64> = {
            let items = st.items.lock().await;
            items
                .iter()
                .filter(|i| i.retry_at > 0 && i.retry_at <= now && i.status == "pending")
                .map(|i| i.id)
                .collect()
        };
        for id in due {
            // Clear the stamp first, so one due retry starts exactly one run
            // even if the sweeper ticks again while it is starting. Pausing or
            // removing the item in the meantime takes it out of this list.
            {
                let mut items = st.items.lock().await;
                match items.iter_mut().find(|i| i.id == id) {
                    Some(i) => i.retry_at = 0,
                    None => continue,
                }
            }
            if st.ctrl.lock().await.contains_key(&id) {
                continue;
            }
            let st2 = st.clone();
            tokio::spawn(async move { run_item(st2, id).await });
        }
    }
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

/// Returns `(method, path, raw head, body)`.
async fn read_req(sock: &mut TcpStream) -> std::io::Result<(String, String, String, Vec<u8>)> {
    // A local API request is tiny; refuse to buffer more than this so a stray
    // (or hostile) client cannot grow our memory without bound.
    const MAX_REQ: usize = 1 << 20;
    let mut buf = Vec::new();
    let mut tmp = [0u8; 4096];
    let mut header_end: Option<usize> = None;
    loop {
        let n = sock.read(&mut tmp).await?;
        if n == 0 {
            break;
        }
        buf.extend_from_slice(&tmp[..n]);
        if buf.len() > MAX_REQ {
            return Err(std::io::Error::new(
                std::io::ErrorKind::InvalidData,
                "request too large",
            ));
        }
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
    Ok((method, path, head, body))
}

fn reason(code: u16) -> &'static str {
    match code {
        200 => "OK",
        400 => "Bad Request",
        403 => "Forbidden",
        404 => "Not Found",
        405 => "Method Not Allowed",
        409 => "Conflict",
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
    let (method, path, head, body) = match read_req(&mut sock).await {
        Ok(r) => r,
        Err(_) => return,
    };
    let json = "application/json";

    if path.starts_with("/api/") {
        if let Err(why) = authorized(&head, &st, method == "POST") {
            let msg = serde_json::json!({ "ok": false, "error": why });
            respond(&mut sock, 403, json, msg.to_string().as_bytes()).await;
            return;
        }
    }

    match (method.as_str(), path.as_str()) {
        ("GET", "/") => {
            let page = INDEX_HTML.replace("__IDM_TOKEN__", &st.token);
            respond(&mut sock, 200, "text/html; charset=utf-8", page.as_bytes()).await;
        }
        ("GET", "/api/items") => {
            // Redacted: every holder of the API token -- the built-in web UI
            // among them -- can read this, and none of them needs the
            // passwords back.
            let items: Vec<Item> =
                st.items.lock().await.iter().map(Item::redacted).collect();
            // speed_bps and time_left_s are added here rather than carried on
            // Item, so they reach the window without ever reaching queue.json.
            let rates = st.rates.lock().await;
            let items: Vec<serde_json::Value> = items
                .iter()
                .map(|i| {
                    let mut v = serde_json::to_value(i).unwrap_or_default();
                    let running = i.status == "running";
                    let bps = if running {
                        rates.get(&i.id).map(|r| r.bps).unwrap_or(0.0)
                    } else {
                        0.0
                    };
                    let left = if running {
                        eta_secs(i.total, i.downloaded, bps).unwrap_or(0)
                    } else {
                        0
                    };
                    v["speed_bps"] = serde_json::json!(bps.round() as u64);
                    v["time_left_s"] = serde_json::json!(left);
                    v
                })
                .collect();
            drop(rates);
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
            let use_aria2 = v["aria2"].as_bool().unwrap_or(false);
            let opts = AddOptions {
                out_dir: v["out_dir"].as_str().unwrap_or("").to_string(),
                user_agent: v["user_agent"].as_str().unwrap_or("").to_string(),
                proxy: v["proxy"].as_str().unwrap_or("").to_string(),
                limit_rate: v["limit_rate"].as_u64().unwrap_or(0),
                auth: v["auth"].as_str().unwrap_or("").to_string(),
                auth_user: v["auth_user"].as_str().unwrap_or("").to_string(),
                auth_password_ref: v["auth_password_ref"].as_str().unwrap_or("").to_string(),
                ignore_mtime: v["ignore_mtime"].as_bool().unwrap_or(false),
                queue: v["queue"].as_str().unwrap_or("").to_string(),
                retries: v["retries"].as_u64().unwrap_or(0) as u32,
                format: v["format"].as_str().unwrap_or("").to_string(),
                cookie: v["cookie"].as_str().unwrap_or("").to_string(),
                referer: v["referer"].as_str().unwrap_or("").to_string(),
                cookies_from_browser: v["cookies_from_browser"].as_str().unwrap_or("").to_string(),
                cookies: v["cookies"].as_array().cloned().unwrap_or_default(),
                force_media: v["force_media"].as_bool().unwrap_or(false),
                filename: v["filename"].as_str().unwrap_or("").to_string(),
            };
            let id = add_item(&st, url, conns, use_aria2, opts).await;
            let out = serde_json::json!({ "ok": true, "id": id });
            respond(&mut sock, 200, json, out.to_string().as_bytes()).await;
        }
        ("POST", "/api/set-queue") => {
            // Move a download between queues. The GUI decides what a queue
            // means; here it is just a label stored with the item.
            let v: serde_json::Value = serde_json::from_slice(&body).unwrap_or_default();
            let id = v["id"].as_u64().unwrap_or(0);
            let queue = v["queue"].as_str().unwrap_or("").to_string();
            let mut found = false;
            {
                let mut items = st.items.lock().await;
                if let Some(it) = items.iter_mut().find(|i| i.id == id) {
                    it.queue = queue;
                    found = true;
                }
            }
            if found {
                save(&st).await;
                respond(&mut sock, 200, json, br#"{"ok":true}"#).await;
            } else {
                respond(&mut sock, 404, json, br#"{"ok":false,"error":"no such item"}"#).await;
            }
        }
        ("POST", "/api/update") => {
            // Properties: edit the three fields the dialog shows. Only the keys
            // present in the body change, so the dialog can send a single field.
            let v: serde_json::Value = serde_json::from_slice(&body).unwrap_or_default();
            let id = v["id"].as_u64().unwrap_or(0);
            let new_url = v.get("url").and_then(|x| x.as_str());
            let new_out = v.get("output").and_then(|x| x.as_str());
            let new_desc = v.get("description").and_then(|x| x.as_str());

            // Retargeting a download that is in flight would leave the running
            // worker writing the old file while the item claims the new one.
            // The description is metadata and is always safe to change.
            let running = st.ctrl.lock().await.contains_key(&id);
            if running && (new_url.is_some() || new_out.is_some()) {
                let msg = br#"{"ok":false,"error":"download is running; pause it first"}"#;
                respond(&mut sock, 409, json, msg).await;
                return;
            }

            let mut found = false;
            {
                let mut items = st.items.lock().await;
                if let Some(it) = items.iter_mut().find(|i| i.id == id) {
                    if let Some(u) = new_url {
                        if !u.is_empty() {
                            it.url = u.to_string();
                        }
                    }
                    if let Some(o) = new_out {
                        if !o.is_empty() {
                            it.output = PathBuf::from(o);
                        }
                    }
                    if let Some(d) = new_desc {
                        it.description = d.to_string();
                    }
                    found = true;
                }
            }
            if found {
                save(&st).await;
                respond(&mut sock, 200, json, br#"{"ok":true}"#).await;
            } else {
                respond(&mut sock, 404, json, br#"{"ok":false,"error":"no such item"}"#).await;
            }
        }
        ("POST", "/api/secrets") => {
            // The GUI has no engine binary to shell out to, so this is how a
            // password gets into the vault. The value arrives in the body, the
            // same loopback channel that has always carried `auth`; what the
            // caller gets back is only a reference. There is deliberately no
            // endpoint that reads one back out.
            let v: serde_json::Value = serde_json::from_slice(&body).unwrap_or_default();
            let value = v["value"].as_str().unwrap_or("");
            if value.is_empty() {
                respond(&mut sock, 400, json, br#"{"ok":false,"error":"missing value"}"#).await;
                return;
            }
            match vault_of(&st).set(value) {
                Ok(r) => {
                    let msg = serde_json::json!({ "ok": true, "ref": r });
                    respond(&mut sock, 200, json, msg.to_string().as_bytes()).await;
                }
                Err(e) => {
                    // The GUI keeps the plaintext when this fails, so the
                    // reason matters more than the status code.
                    let msg = serde_json::json!({ "ok": false, "error": format!("{:#}", e) });
                    respond(&mut sock, 500, json, msg.to_string().as_bytes()).await;
                }
            }
        }
        ("GET", "/api/secrets-status") => {
            // For the line under Options -> Site Logins.
            let vault = vault_of(&st);
            let status = if !vault.exists() {
                "not stored yet".to_string()
            } else {
                match vault.key_source() {
                    Ok(src) => src.describe().to_string(),
                    Err(e) => format!("unreadable vault ({:#})", e),
                }
            };
            let msg = serde_json::json!({ "ok": true, "status": status });
            respond(&mut sock, 200, json, msg.to_string().as_bytes()).await;
        }
        ("POST", "/api/formats") => {
            // The GUI speaks only to this API, so listing a media URL's formats
            // has to happen here: run the engine's --list-formats and pass the
            // summary through. Read-only -- nothing is queued.
            let v: serde_json::Value = serde_json::from_slice(&body).unwrap_or_default();
            let url = v["url"].as_str().unwrap_or("").to_string();
            if url.is_empty() {
                respond(&mut sock, 400, json, br#"{"ok":false,"error":"missing url"}"#).await;
                return;
            }
            let mut cmd = Command::new(&st.engine);
            cmd.hide_console();
            cmd.arg("--list-formats").arg("--yt-dlp-path").arg(&st.yt_dlp);
            if let Some(c) = v["cookie"].as_str().filter(|s| !s.is_empty()) {
                cmd.arg("--cookie").arg(c);
            }
            if let Some(r) = v["referer"].as_str().filter(|s| !s.is_empty()) {
                cmd.arg("--referer").arg(r);
            }
            if let Some(b) = v["cookies_from_browser"].as_str().filter(|s| !s.is_empty()) {
                cmd.arg("--cookies-from-browser").arg(b);
            }
            if let Some(p) = v["proxy"].as_str().filter(|s| !s.is_empty()) {
                cmd.arg("--proxy").arg(p);
            }
            cmd.arg("--").arg(&url);
            match cmd.output().await {
                Ok(o) if o.status.success() => {
                    match serde_json::from_slice::<serde_json::Value>(&o.stdout) {
                        Ok(summary) => {
                            let mut out = serde_json::json!({"ok": true});
                            if let (Some(dst), Some(src)) =
                                (out.as_object_mut(), summary.as_object())
                            {
                                for (k, val) in src {
                                    dst.insert(k.clone(), val.clone());
                                }
                            }
                            respond(&mut sock, 200, json, out.to_string().as_bytes()).await;
                        }
                        Err(e) => {
                            let msg = serde_json::json!({
                                "ok": false,
                                "error": format!("cannot parse the format list: {}", e)
                            });
                            respond(&mut sock, 502, json, msg.to_string().as_bytes()).await;
                        }
                    }
                }
                Ok(o) => {
                    // No formats is a normal answer for a plain file URL, not a
                    // server error: report it so the dialog can stay quiet.
                    let err = String::from_utf8_lossy(&o.stderr);
                    let msg = serde_json::json!({
                        "ok": false,
                        "error": err.lines().last().unwrap_or("no formats").to_string()
                    });
                    respond(&mut sock, 200, json, msg.to_string().as_bytes()).await;
                }
                Err(e) => {
                    let msg =
                        serde_json::json!({"ok": false, "error": format!("spawn failed: {}", e)});
                    respond(&mut sock, 500, json, msg.to_string().as_bytes()).await;
                }
            }
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
            let status = st
                .items
                .lock()
                .await
                .iter()
                .find(|i| i.id == id)
                .map(|i| i.status.clone());
            // Resuming something that is already in flight would start a second
            // engine process writing the same file.
            let live = st.ctrl.lock().await.contains_key(&id);
            match status {
                None => {
                    respond(&mut sock, 404, json, br#"{"ok":false,"error":"no such item"}"#).await;
                }
                Some(s) if live || s == "running" || s == "pending" => {
                    let msg = serde_json::json!({ "ok": false, "error": "already running" });
                    respond(&mut sock, 409, json, msg.to_string().as_bytes()).await;
                }
                Some(_) => {
                    set_status(&st, id, "pending", None).await;
                    let st2 = st.clone();
                    tokio::spawn(async move { run_item(st2, id).await });
                    respond(&mut sock, 200, json, br#"{"ok":true}"#).await;
                }
            }
        }
        ("POST", "/api/remove") => {
            let v: serde_json::Value = serde_json::from_slice(&body).unwrap_or_default();
            let id = v["id"].as_u64().unwrap_or(0);
            if let Some(tx) = st.ctrl.lock().await.get(&id) {
                let _ = tx.send(Ctrl::Remove).await;
            }
            st.items.lock().await.retain(|i| {
                if i.id == id && !i.cookies_file.is_empty() {
                    let _ = std::fs::remove_file(&i.cookies_file);
                }
                i.id != id
            });
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
    yt_dlp: PathBuf,
    api_token: Option<String>,
) -> anyhow::Result<()> {
    tokio::fs::create_dir_all(&output_dir).await.ok();
    tokio::fs::create_dir_all(&state_dir).await.ok();
    let state_path = state_dir.join("queue.json");

    // The API secret. Callers that are not our own UI (the native GUI) read it
    // from `STATE_DIR/api-token`, which is owner-readable only.
    let token = api_token.unwrap_or_else(new_token);
    let token_path = state_dir.join("api-token");
    tokio::fs::write(&token_path, &token).await.ok();
    // Where we listen, for the native host: a download from the browser goes
    // into this queue (and shows its progress here) when it can find us.
    let addr_path = state_dir.join("api-addr");
    tokio::fs::write(&addr_path, &addr).await.ok();
    #[cfg(unix)]
    {
        use std::os::unix::fs::PermissionsExt;
        let _ = std::fs::set_permissions(&token_path, std::fs::Permissions::from_mode(0o600));
        let _ = std::fs::set_permissions(&addr_path, std::fs::Permissions::from_mode(0o600));
    }

    let items = load_items(&state_path);
    let next = items.iter().map(|i| i.id).max().unwrap_or(0) + 1;

    let st = Arc::new(State {
        items: Mutex::new(items),
        ctrl: Mutex::new(HashMap::new()),
        next_id: AtomicU64::new(next),
        output_dir,
        state_path,
        engine,
        yt_dlp,
        sem: Arc::new(Semaphore::new(max_concurrent.max(1))),
        token,
        origin: format!("http://{}", addr),
        rates: Mutex::new(HashMap::new()),
    });

    // Failed downloads with retries left come back through here.
    tokio::spawn(retry_sweeper(st.clone()));

    let listener = TcpListener::bind(&addr)
        .await
        .map_err(|e| anyhow::anyhow!("cannot bind {}: {}", addr, e))?;
    println!("[*] IDM GUI on http://{}", addr);
    println!("[*] downloads -> {}", st.output_dir.display());
    println!("[*] api token -> {}", token_path.display());

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
#[cfg(test)]
mod tests {
    use super::*;
    use std::time::Duration;

    #[test]
    fn a_first_sample_is_the_rate_itself() {
        // Nothing to blend with yet, so the instant reading stands.
        assert_eq!(blend_rate(0.0, 1_000_000, Duration::from_secs(1)), 1_000_000.0);
    }

    #[test]
    fn a_sample_is_blended_not_replaced() {
        // A single slow 300 ms window must not make the figure collapse.
        let r = blend_rate(1_000_000.0, 0, Duration::from_millis(300));
        assert!(r > 600_000.0 && r < 1_000_000.0, "got {r}");
    }

    #[test]
    fn a_zero_length_window_changes_nothing() {
        // Two looks in the same instant would otherwise divide by zero.
        assert_eq!(blend_rate(500.0, 10, Duration::from_secs(0)), 500.0);
    }

    #[test]
    fn eta_is_what_is_left_over_the_rate() {
        assert_eq!(eta_secs(1000, 400, 100.0), Some(6));
    }

    #[test]
    fn eta_refuses_to_invent_a_number() {
        // An unknown size, a standing start, and an item already at 100% --
        // an empty cell is better than a made-up one in all three.
        assert_eq!(eta_secs(0, 400, 100.0), None);
        assert_eq!(eta_secs(1000, 400, 0.0), None);
        assert_eq!(eta_secs(1000, 1000, 100.0), None);
    }

    #[test]
    fn a_report_may_rename_within_the_same_directory() {
        // yt-dlp's merger picks the container: -o clip.mp4 legitimately
        // produces clip.webm, and the queue has to follow it there.
        let asked = Path::new("/dl/clip.mp4");
        assert_eq!(
            accept_reported_file(asked, "/dl/clip.webm"),
            Some(PathBuf::from("/dl/clip.webm"))
        );
    }

    #[test]
    fn a_report_naming_the_same_file_changes_nothing() {
        assert_eq!(accept_reported_file(Path::new("/dl/a.bin"), "/dl/a.bin"), None);
        assert_eq!(accept_reported_file(Path::new("/dl/a.bin"), ""), None);
    }

    #[test]
    fn a_report_cannot_move_an_item_out_of_its_directory() {
        // The queue's output path is what later deletes, opens and reveals the
        // file, so a report pointing elsewhere is refused rather than trusted.
        let asked = Path::new("/dl/clip.mp4");
        assert_eq!(accept_reported_file(asked, "/etc/passwd"), None);
        assert_eq!(accept_reported_file(asked, "/dl/sub/clip.webm"), None);
        assert_eq!(accept_reported_file(asked, "../clip.webm"), None);
    }

    #[test]
    fn reports_live_beside_the_queue_not_in_the_download_dir() {
        assert_eq!(
            report_path(Path::new("/state/queue.json"), 7),
            PathBuf::from("/state/reports/7.json")
        );
    }
}
