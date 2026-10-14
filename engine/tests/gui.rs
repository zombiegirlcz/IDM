// GUI / queue-API tests (IDM-style download manager window as a web UI).
//
// `idm --serve ADDR --output-dir DIR --state-dir SDIR` must:
//   * serve a small HTML UI at `GET /`
//   * expose a JSON queue API (`/api/items`, `/api/add`, `/api/pause`,
//     `/api/resume`, `/api/remove`)
//   * actually download the added URL into DIR (verified by CRC32)
//   * persist the queue in SDIR so it survives a restart
//   * let the user pause (kill the worker, meta survives) and resume
//
// Everything is local: the HTTP requests are hand-rolled over TcpStream and
// the origin is a tiny Range-capable server in this file.

use std::io::{Read, Write};
use std::net::{TcpListener, TcpStream};
use std::path::PathBuf;
use std::process::{Child, Command, Stdio};
use std::sync::atomic::{AtomicU64, Ordering};
use std::sync::Arc;
use std::thread;
use std::time::{Duration, Instant};

const IDM: &str = env!("CARGO_BIN_EXE_idm");

fn unique_dir(tag: &str) -> PathBuf {
    static C: AtomicU64 = AtomicU64::new(0);
    let n = C.fetch_add(1, Ordering::SeqCst);
    let d = std::env::temp_dir().join(format!("idm_gui_{}_{}_{}", tag, std::process::id(), n));
    std::fs::create_dir_all(&d).unwrap();
    d
}

fn make_data(len: usize) -> Arc<Vec<u8>> {
    let v: Vec<u8> = (0..len)
        .map(|i| ((i as u64).wrapping_mul(2654435761) >> 13) as u8)
        .collect();
    Arc::new(v)
}

fn crc32(data: &[u8]) -> u32 {
    let mut h = crc32fast::Hasher::new();
    h.update(data);
    h.finalize()
}

// ---------- origin server ----------

/// Range-capable origin. When `slow_chunk > 0`, every response body is
/// dribbled out in `slow_chunk`-byte pieces with `slow_delay_ms` between them,
/// which keeps a download "in flight" long enough to pause it.
fn start_origin(data: Arc<Vec<u8>>, slow_chunk: usize, slow_delay_ms: u64) -> String {
    let listener = TcpListener::bind("127.0.0.1:0").unwrap();
    let addr = format!("http://{}", listener.local_addr().unwrap());
    thread::spawn(move || {
        for stream in listener.incoming() {
            let data = data.clone();
            if let Ok(s) = stream {
                thread::spawn(move || {
                    let _ = origin_handle(s, data, slow_chunk, slow_delay_ms);
                });
            }
        }
    });
    addr
}

fn origin_handle(
    mut s: TcpStream,
    data: Arc<Vec<u8>>,
    slow_chunk: usize,
    slow_delay_ms: u64,
) -> std::io::Result<()> {
    let mut buf = Vec::new();
    let mut tmp = [0u8; 1024];
    loop {
        let n = s.read(&mut tmp)?;
        if n == 0 {
            return Ok(());
        }
        buf.extend_from_slice(&tmp[..n]);
        if buf.windows(4).any(|w| w == b"\r\n\r\n") {
            break;
        }
    }
    let req = String::from_utf8_lossy(&buf).to_string();
    let mut lines = req.lines();
    let method = lines.next().unwrap_or("").split_whitespace().next().unwrap_or("GET");
    let mut range: Option<(u64, u64)> = None;
    for l in lines {
        let ll = l.to_ascii_lowercase();
        if let Some(v) = ll.strip_prefix("range:") {
            if let Some(r) = v.trim().strip_prefix("bytes=") {
                let mut it = r.split(',').next().unwrap_or("").split('-');
                let a = it.next().unwrap_or("").trim().parse::<u64>().ok();
                let b = it.next().unwrap_or("").trim().parse::<u64>().ok();
                if let Some(a) = a {
                    range = Some((a, b.unwrap_or(data.len() as u64 - 1)));
                }
            }
        }
    }
    let total = data.len() as u64;
    if method == "HEAD" {
        let h = format!(
            "HTTP/1.1 200 OK\r\nContent-Length: {}\r\nAccept-Ranges: bytes\r\nETag: \"e\"\r\nConnection: close\r\n\r\n",
            total
        );
        s.write_all(h.as_bytes())?;
        return Ok(());
    }

    let (head, body): (String, Vec<u8>) = if let Some((a, b)) = range {
        let b = b.min(total.saturating_sub(1));
        let slice = data[a as usize..=b as usize].to_vec();
        (
            format!(
                "HTTP/1.1 206 Partial Content\r\nContent-Length: {}\r\nContent-Range: bytes {}-{}/{}\r\nAccept-Ranges: bytes\r\nConnection: close\r\n\r\n",
                slice.len(), a, b, total
            ),
            slice,
        )
    } else {
        (
            format!(
                "HTTP/1.1 200 OK\r\nContent-Length: {}\r\nAccept-Ranges: bytes\r\nETag: \"e\"\r\nConnection: close\r\n\r\n",
                total
            ),
            data.to_vec(),
        )
    };
    s.write_all(head.as_bytes())?;
    if slow_chunk == 0 {
        s.write_all(&body)?;
    } else {
        let mut off = 0usize;
        while off < body.len() {
            let end = (off + slow_chunk).min(body.len());
            s.write_all(&body[off..end])?;
            s.flush()?;
            off = end;
            thread::sleep(Duration::from_millis(slow_delay_ms));
        }
    }
    Ok(())
}

// ---------- tiny HTTP client ----------

/// Every /api/* request must carry the token the server was started with.
const API_TOKEN: &str = "testtoken0123456789";

fn http_req(addr: &str, method: &str, path: &str, body: Option<&str>) -> (u16, String) {
    let mut s = TcpStream::connect(addr).expect("connect to idm --serve");
    s.set_read_timeout(Some(Duration::from_secs(20))).unwrap();
    let body = body.unwrap_or("");
    let req = format!(
        "{} {} HTTP/1.1\r\nHost: {}\r\nContent-Type: application/json\r\nX-IDM-Token: {}\r\nContent-Length: {}\r\nConnection: close\r\n\r\n{}",
        method, path, addr, API_TOKEN, body.len(), body
    );
    s.write_all(req.as_bytes()).unwrap();
    s.flush().unwrap();
    let mut resp = Vec::new();
    s.read_to_end(&mut resp).unwrap();
    let text = String::from_utf8_lossy(&resp).to_string();
    let status: u16 = text
        .split_whitespace()
        .nth(1)
        .and_then(|c| c.parse().ok())
        .unwrap_or(0);
    let body = text
        .split_once("\r\n\r\n")
        .map(|(_, b)| b.to_string())
        .unwrap_or_default();
    (status, body)
}

fn json(addr: &str, path: &str) -> serde_json::Value {
    let (st, body) = http_req(addr, "GET", path, None);
    assert_eq!(st, 200, "GET {} returned {} ({})", path, st, body);
    serde_json::from_str(&body).unwrap_or_else(|e| panic!("GET {} not JSON: {} / {}", path, e, body))
}

// ---------- server control ----------

fn free_port() -> u16 {
    let l = TcpListener::bind("127.0.0.1:0").unwrap();
    l.local_addr().unwrap().port()
}

fn spawn_server(addr: &str, out_dir: &PathBuf, state_dir: &PathBuf, extra: &[&str]) -> Child {
    let mut cmd = Command::new(IDM);
    cmd.arg("--serve")
        .arg(addr)
        .arg("--output-dir")
        .arg(out_dir)
        .arg("--state-dir")
        .arg(state_dir)
        .arg("--api-token")
        .arg(API_TOKEN);
    for a in extra {
        cmd.arg(a);
    }
    cmd.stdout(Stdio::null()).stderr(Stdio::null());
    cmd.spawn().expect("failed to spawn idm --serve")
}

fn wait_ready(addr: &str) {
    let deadline = Instant::now() + Duration::from_secs(15);
    loop {
        if TcpStream::connect(addr).is_ok() {
            return;
        }
        if Instant::now() > deadline {
            panic!("idm --serve never came up on {}", addr);
        }
        thread::sleep(Duration::from_millis(100));
    }
}

fn find_item(items: &serde_json::Value, id: u64) -> serde_json::Value {
    items["items"]
        .as_array()
        .expect("items array")
        .iter()
        .find(|i| i["id"].as_u64() == Some(id))
        .cloned()
        .unwrap_or_else(|| panic!("item {} not in {}", id, items))
}

fn wait_status(addr: &str, id: u64, want: &str, secs: u64) -> serde_json::Value {
    let deadline = Instant::now() + Duration::from_secs(secs);
    loop {
        let items = json(addr, "/api/items");
        let it = find_item(&items, id);
        if it["status"].as_str() == Some(want) {
            return it;
        }
        if Instant::now() > deadline {
            panic!("item {} never reached status '{}' (last: {})", id, want, it);
        }
        thread::sleep(Duration::from_millis(200));
    }
}

// ---------- tests ----------

#[test]
fn serve_ui_and_api_downloads_through_queue() {
    let data = make_data(1_500_000);
    let origin = start_origin(data.clone(), 0, 0);
    let out = unique_dir("out");
    let state = unique_dir("state");
    let port = free_port();
    let addr = format!("127.0.0.1:{}", port);

    let mut srv = spawn_server(&addr, &out, &state, &["--max-concurrent", "2"]);
    wait_ready(&addr);

    // The UI itself must be served.
    let (st, html) = http_req(&addr, "GET", "/", None);
    assert_eq!(st, 200, "GET / must return the UI");
    let low = html.to_lowercase();
    assert!(
        low.contains("<html") || low.contains("<!doctype"),
        "UI must be HTML: {}",
        &html[..html.len().min(200)]
    );
    assert!(low.contains("idm"), "UI should mention idm");

    // Add a download through the API.
    let body = serde_json::json!({"url": format!("{}/file.bin", origin), "connections": 4}).to_string();
    let (st, resp) = http_req(&addr, "POST", "/api/add", Some(&body));
    assert_eq!(st, 200, "POST /api/add returned {}: {}", st, resp);
    let added: serde_json::Value = serde_json::from_str(&resp).unwrap();
    assert_eq!(added["ok"], serde_json::json!(true), "add resp: {}", resp);
    let id = added["id"].as_u64().expect("add must return an id");

    // It must actually finish, and the file must be bit-identical.
    wait_status(&addr, id, "done", 40);
    let file = out.join("file.bin");
    let got = std::fs::read(&file).unwrap_or_else(|e| panic!("{} missing: {}", file.display(), e));
    assert_eq!(got.len(), data.len(), "size mismatch");
    assert_eq!(crc32(&got), crc32(&data), "crc mismatch via GUI queue");

    let items = json(&addr, "/api/items");
    let it = find_item(&items, id);
    assert_eq!(it["downloaded"].as_u64(), Some(data.len() as u64));
    assert_eq!(it["total"].as_u64(), Some(data.len() as u64));

    let _ = srv.kill();
    let _ = srv.wait();
}

#[test]
fn queue_persists_across_restart() {
    let data = make_data(700_000);
    let origin = start_origin(data.clone(), 0, 0);
    let out = unique_dir("pout");
    let state = unique_dir("pstate");
    let port = free_port();
    let addr = format!("127.0.0.1:{}", port);

    let mut srv = spawn_server(&addr, &out, &state, &[]);
    wait_ready(&addr);
    let body = serde_json::json!({"url": format!("{}/one.bin", origin)}).to_string();
    let (st, resp) = http_req(&addr, "POST", "/api/add", Some(&body));
    assert_eq!(st, 200, "add: {}", resp);
    let id: u64 = serde_json::from_str::<serde_json::Value>(&resp).unwrap()["id"]
        .as_u64()
        .unwrap();
    wait_status(&addr, id, "done", 40);
    let _ = srv.kill();
    let _ = srv.wait();

    // Fresh process, same state dir: the finished item must still be listed.
    let mut srv2 = spawn_server(&addr, &out, &state, &[]);
    wait_ready(&addr);
    let items = json(&addr, "/api/items");
    let it = find_item(&items, id);
    assert_eq!(it["status"].as_str(), Some("done"), "item must survive restart: {}", it);
    assert!(it["url"].as_str().unwrap_or("").ends_with("one.bin"));

    let _ = srv2.kill();
    let _ = srv2.wait();
}

#[test]
fn pause_resume_and_remove() {
    // Dribble the body so the download is still running when we pause it.
    let data = make_data(4_000_000);
    let origin = start_origin(data.clone(), 64 * 1024, 120);
    let out = unique_dir("prout");
    let state = unique_dir("prstate");
    let port = free_port();
    let addr = format!("127.0.0.1:{}", port);

    let mut srv = spawn_server(&addr, &out, &state, &["--max-concurrent", "1"]);
    wait_ready(&addr);

    let body = serde_json::json!({"url": format!("{}/slow.bin", origin), "connections": 1}).to_string();
    let (st, resp) = http_req(&addr, "POST", "/api/add", Some(&body));
    assert_eq!(st, 200, "add: {}", resp);
    let id: u64 = serde_json::from_str::<serde_json::Value>(&resp).unwrap()["id"]
        .as_u64()
        .unwrap();

    // Let it get going, then pause. We wait until the engine has actually
    // reported progress (the GUI reads it from the .idmmeta sidecar, which the
    // engine flushes once a second), otherwise a pause could race the very
    // first flush and legitimately show 0 bytes.
    wait_status(&addr, id, "running", 20);
    let deadline = Instant::now() + Duration::from_secs(30);
    loop {
        let it = find_item(&json(&addr, "/api/items"), id);
        if it["downloaded"].as_u64().unwrap_or(0) > 0 {
            break;
        }
        if Instant::now() > deadline {
            panic!("no progress reported before pause: {}", it);
        }
        thread::sleep(Duration::from_millis(200));
    }
    let p = serde_json::json!({"id": id}).to_string();
    let (st, resp) = http_req(&addr, "POST", "/api/pause", Some(&p));
    assert_eq!(st, 200, "pause: {}", resp);
    let paused = wait_status(&addr, id, "paused", 10);

    // Progress must not advance while paused.
    let d1 = paused["downloaded"].as_u64().unwrap_or(0);
    thread::sleep(Duration::from_millis(1000));
    let d2 = find_item(&json(&addr, "/api/items"), id)["downloaded"].as_u64().unwrap_or(0);
    assert_eq!(d1, d2, "downloaded must not advance while paused ({} -> {})", d1, d2);
    assert!(d1 > 0, "some progress should have happened before the pause");

    // Resume and finish.
    let (st, resp) = http_req(&addr, "POST", "/api/resume", Some(&p));
    assert_eq!(st, 200, "resume: {}", resp);
    wait_status(&addr, id, "done", 60);
    let file = out.join("slow.bin");
    let got = std::fs::read(&file).unwrap();
    assert_eq!(crc32(&got), crc32(&data), "crc mismatch after pause/resume");

    // Remove it from the list.
    let (st, resp) = http_req(&addr, "POST", "/api/remove", Some(&p));
    assert_eq!(st, 200, "remove: {}", resp);
    let items = json(&addr, "/api/items");
    let still = items["items"]
        .as_array()
        .unwrap()
        .iter()
        .any(|i| i["id"].as_u64() == Some(id));
    assert!(!still, "item must be gone after /api/remove: {}", items);

    let _ = srv.kill();
    let _ = srv.wait();
}
/// The API lives on loopback, i.e. inside reach of every page in the user's
/// browser. A request that does not prove it comes from our own UI must be
/// refused — otherwise any visited site can enqueue downloads (CSRF).
#[test]
fn api_rejects_unauthenticated_and_cross_origin_requests() {
    let port = free_port();
    let addr = format!("127.0.0.1:{}", port);
    let tmp = std::env::temp_dir().join(format!("idm_gui_auth_{}", port));
    let out = tmp.join("out");
    let state = tmp.join("state");
    std::fs::create_dir_all(&out).unwrap();
    std::fs::create_dir_all(&state).unwrap();

    let mut srv = spawn_server(&addr, &out, &state, &[]);
    wait_ready(&addr);

    // Raw request with full control over the headers.
    let raw = |extra: &str, body: &str| -> u16 {
        let mut s = TcpStream::connect(&addr).unwrap();
        s.set_read_timeout(Some(Duration::from_secs(10))).unwrap();
        let req = format!(
            "POST /api/add HTTP/1.1\r\nHost: {}\r\n{}Content-Length: {}\r\nConnection: close\r\n\r\n{}",
            addr,
            extra,
            body.len(),
            body
        );
        s.write_all(req.as_bytes()).unwrap();
        s.flush().unwrap();
        let mut resp = Vec::new();
        s.read_to_end(&mut resp).unwrap();
        String::from_utf8_lossy(&resp)
            .split_whitespace()
            .nth(1)
            .and_then(|c| c.parse().ok())
            .unwrap_or(0)
    };

    let body = r#"{"url":"http://127.0.0.1:1/x.bin"}"#;

    // No token at all.
    assert_eq!(
        raw("Content-Type: application/json\r\n", body),
        403,
        "a request without X-IDM-Token must be refused"
    );

    // Wrong token.
    assert_eq!(
        raw("Content-Type: application/json\r\nX-IDM-Token: nope\r\n", body),
        403,
        "a request with the wrong token must be refused"
    );

    // Right token, but sent from another origin / as a cross-site form post —
    // the two shapes a hostile page can actually produce.
    let ok_token = format!("X-IDM-Token: {}\r\n", API_TOKEN);
    assert_eq!(
        raw(
            &format!(
                "Content-Type: application/json\r\n{}Origin: http://evil.example\r\n",
                ok_token
            ),
            body
        ),
        403,
        "a cross-origin request must be refused even with a valid token"
    );
    assert_eq!(
        raw(
            &format!("Content-Type: text/plain\r\n{}", ok_token),
            body
        ),
        403,
        "a non-JSON content type (a plain form post) must be refused"
    );

    // And the real UI's shape still works.
    let (st, resp) = http_req(&addr, "GET", "/api/items", None);
    assert_eq!(st, 200, "our own UI must still be served: {}", resp);

    let _ = srv.kill();
    let _ = srv.wait();
}

/// The GUI's Options dialog resolves a target directory, a user agent and a
/// proxy per download and sends them with /api/add. Before this, the server
/// ignored them: everything landed in the server-wide output dir and ran with
/// the engine defaults, which made the whole dialog decoration.
#[test]
fn api_add_honours_the_gui_download_options() {
    let data = make_data(300_000);
    let origin = start_origin(data.clone(), 0, 0);
    let out = unique_dir("out");
    let state = unique_dir("state");
    let port = free_port();
    let addr = format!("127.0.0.1:{}", port);

    // Where the "Save To" tab points -- deliberately NOT the server's out dir,
    // and deliberately not created in advance: the server must create it.
    let category_dir = unique_dir("category").join("Video");

    let mut srv = spawn_server(&addr, &out, &state, &["--max-concurrent", "2"]);
    wait_ready(&addr);

    let body = serde_json::json!({
        "url": format!("{}/file.bin", origin),
        "connections": 4,
        "out_dir": category_dir.to_string_lossy(),
        "user_agent": "IDM/6.43",
        "proxy": "",
    })
    .to_string();
    let (st, resp) = http_req(&addr, "POST", "/api/add", Some(&body));
    assert_eq!(st, 200, "POST /api/add returned {}: {}", st, resp);
    let added: serde_json::Value = serde_json::from_str(&resp).unwrap();
    let id = added["id"].as_u64().expect("add must return an id");

    wait_status(&addr, id, "done", 40);

    // The file must be in the directory the GUI asked for, not the default one.
    let file = category_dir.join("file.bin");
    let got = std::fs::read(&file)
        .unwrap_or_else(|e| panic!("{} missing: {}", file.display(), e));
    assert_eq!(crc32(&got), crc32(&data), "crc mismatch in the category dir");
    assert!(
        !out.join("file.bin").exists(),
        "out_dir was ignored: the file also landed in the server output dir"
    );

    // The user agent must be remembered, so a resume runs with it too.
    let it = find_item(&json(&addr, "/api/items"), id);
    assert_eq!(
        it["user_agent"].as_str(),
        Some("IDM/6.43"),
        "user_agent must be stored on the item: {}",
        it
    );

    let _ = srv.kill();
    let _ = srv.wait();
}

/// The second batch of Options values the GUI resolves per download: the
/// Connection tab's quota (converted to a byte rate), the Site Logins
/// credentials and the "ignore modification time" switch. They have to be
/// stored on the item, not just accepted, so a resume runs with them too.
#[test]
fn api_add_stores_rate_auth_and_mtime_options() {
    let data = make_data(200_000);
    let origin = start_origin(data.clone(), 0, 0);
    let out = unique_dir("out");
    let state = unique_dir("state");
    let port = free_port();
    let addr = format!("127.0.0.1:{}", port);

    let mut srv = spawn_server(&addr, &out, &state, &["--max-concurrent", "2"]);
    wait_ready(&addr);

    let body = serde_json::json!({
        "url": format!("{}/file.bin", origin),
        "connections": 2,
        "limit_rate": 65536,
        "auth": "alice:s3cret",
        "ignore_mtime": true,
    })
    .to_string();
    let (st, resp) = http_req(&addr, "POST", "/api/add", Some(&body));
    assert_eq!(st, 200, "POST /api/add returned {}: {}", st, resp);
    let added: serde_json::Value = serde_json::from_str(&resp).unwrap();
    let id = added["id"].as_u64().expect("add must return an id");

    let it = find_item(&json(&addr, "/api/items"), id);
    assert_eq!(it["limit_rate"].as_u64(), Some(65536), "item: {}", it);
    assert_eq!(it["auth"].as_str(), Some("alice:s3cret"), "item: {}", it);
    assert_eq!(it["ignore_mtime"].as_bool(), Some(true), "item: {}", it);

    // A rate-limited download must still complete correctly.
    wait_status(&addr, id, "done", 60);
    let got = std::fs::read(out.join("file.bin")).expect("file.bin missing");
    assert_eq!(crc32(&got), crc32(&data), "crc mismatch with a rate limit");

    let _ = srv.kill();
    let _ = srv.wait();
}
