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

/// Spawn `idm --serve` on a port that is really ours, retrying if it is not.
///
/// free_port() only FINDS a port and lets it go — the trap this repo already
/// documents — and these tests run as parallel threads in one binary, so two
/// of them can be handed the same number. The loser's server exits with
/// "address in use" while a plain TcpStream::connect still succeeds, because
/// the WINNER is listening there: the test then drives another test's server
/// and dies with ConnectionReset the moment that test tears it down.
///
/// A port is only ours if our own child is still alive while it answers.
fn start_server(out: &PathBuf, state: &PathBuf, extra: &[&str]) -> (Child, String) {
    for _ in 0..8 {
        let addr = format!("127.0.0.1:{}", free_port());
        let mut child = spawn_server(&addr, out, state, extra);
        let deadline = Instant::now() + Duration::from_secs(15);
        loop {
            if matches!(child.try_wait(), Ok(Some(_))) {
                break; // lost the race for this port; take another
            }
            if TcpStream::connect(&addr).is_ok() {
                // Something answers -- but a successful connect does not say
                // WHOSE server it is. When another test in this binary drew
                // the same number and won, our child is already dying on
                // "address in use" while the winner happily answers us, and
                // without this check we would adopt a stranger's server and
                // lose it the moment its real owner killed it
                // (ConnectionRefused halfway through a test).
                //
                // The loser exits within milliseconds of the failed bind, so
                // settling before we commit is enough to tell the two apart.
                thread::sleep(Duration::from_millis(250));
                if matches!(child.try_wait(), Ok(Some(_))) {
                    break; // it was not ours after all
                }
                return (child, addr);
            }
            if Instant::now() > deadline {
                let _ = child.kill();
                panic!("idm --serve never came up on {}", addr);
            }
            thread::sleep(Duration::from_millis(100));
        }
    }
    panic!("could not get a port of our own for idm --serve");
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
    let (mut srv, addr) = start_server(&out, &state, &["--max-concurrent", "2"]);

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
    let (mut srv, addr) = start_server(&out, &state, &[]);
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
    let (mut srv, addr) = start_server(&out, &state, &["--max-concurrent", "1"]);

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
    let tmp = unique_dir("auth");
    let out = tmp.join("out");
    let state = tmp.join("state");
    std::fs::create_dir_all(&out).unwrap();
    std::fs::create_dir_all(&state).unwrap();

    let (mut srv, addr) = start_server(&out, &state, &[]);

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

    // Where the "Save To" tab points -- deliberately NOT the server's out dir,
    // and deliberately not created in advance: the server must create it.
    let category_dir = unique_dir("category").join("Video");

    let (mut srv, addr) = start_server(&out, &state, &["--max-concurrent", "2"]);

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
    let (mut srv, addr) = start_server(&out, &state, &["--max-concurrent", "2"]);

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
    assert_eq!(it["ignore_mtime"].as_bool(), Some(true), "item: {}", it);
    // The option was stored -- but /api/items must not hand the password back
    // out: every holder of the API token would get it, the built-in web UI
    // included.
    assert_eq!(it["auth"].as_str(), Some(""), "/api/items leaks auth: {}", it);
    // And since step 2 the queue file holds a vault reference, not the
    // password: the user half stays readable, the secret half does not.
    let queue = std::fs::read_to_string(state.join("queue.json")).expect("queue.json");
    assert!(!queue.contains("s3cret"), "plaintext password in queue.json: {}", queue);
    assert!(queue.contains("\"auth_user\": \"alice\""), "the user got lost: {}", queue);
    assert!(queue.contains("secret:"), "no vault reference was stored: {}", queue);

    // A rate-limited download must still complete correctly.
    wait_status(&addr, id, "done", 60);
    let got = std::fs::read(out.join("file.bin")).expect("file.bin missing");
    assert_eq!(crc32(&got), crc32(&data), "crc mismatch with a rate limit");

    let _ = srv.kill();
    let _ = srv.wait();
}

/// Queues had no representation at all: the Item carried no field saying which
/// queue a download was in, so the GUI's "Start Queue" could only resume
/// everything. The engine records the membership; the GUI decides what a queue
/// means and when it runs.
#[test]
fn api_records_and_moves_queue_membership() {
    let data = make_data(100_000);
    let origin = start_origin(data.clone(), 0, 0);
    let out = unique_dir("out");
    let state = unique_dir("state");
    let (mut srv, addr) = start_server(&out, &state, &["--max-concurrent", "2"]);

    // A download added into a named queue keeps that name.
    let body = serde_json::json!({
        "url": format!("{}/file.bin", origin),
        "connections": 2,
        "queue": "Night queue",
    })
    .to_string();
    let (st, resp) = http_req(&addr, "POST", "/api/add", Some(&body));
    assert_eq!(st, 200, "POST /api/add returned {}: {}", st, resp);
    let id = serde_json::from_str::<serde_json::Value>(&resp).unwrap()["id"]
        .as_u64()
        .expect("add must return an id");

    let it = find_item(&json(&addr, "/api/items"), id);
    assert_eq!(it["queue"].as_str(), Some("Night queue"), "item: {}", it);

    // It can be moved to another queue, and back out to the main one.
    let (st, resp) = http_req(
        &addr,
        "POST",
        "/api/set-queue",
        Some(&serde_json::json!({"id": id, "queue": "Main download queue"}).to_string()),
    );
    assert_eq!(st, 200, "set-queue returned {}: {}", st, resp);
    let it = find_item(&json(&addr, "/api/items"), id);
    assert_eq!(it["queue"].as_str(), Some("Main download queue"), "item: {}", it);

    let (st, _r) = http_req(
        &addr,
        "POST",
        "/api/set-queue",
        Some(&serde_json::json!({"id": id, "queue": ""}).to_string()),
    );
    assert_eq!(st, 200);
    let it = find_item(&json(&addr, "/api/items"), id);
    assert_eq!(it["queue"].as_str(), Some(""), "item: {}", it);

    // Moving a download that does not exist must say so rather than succeed.
    let (st, _r) = http_req(
        &addr,
        "POST",
        "/api/set-queue",
        Some(&serde_json::json!({"id": 99999, "queue": "X"}).to_string()),
    );
    assert_eq!(st, 404, "set-queue on an unknown id must be a 404");

    let _ = srv.kill();
    let _ = srv.wait();
}

/// A failed download used to be marked "error" and left there. With a retry
/// budget (the Scheduler's "number of retries for each file") it goes back to
/// pending and is attempted again, and only gives up once the budget is spent.
#[test]
fn a_failed_download_is_retried_until_the_budget_runs_out() {
    let out = unique_dir("out");
    let state = unique_dir("state");

    // Nothing is listening here, so every attempt fails fast. Port 9 (discard)
    // rather than free_port(): that only *finds* a free port and lets it go,
    // so a parallel test's origin could take it over and answer with real
    // data -- which is exactly how this test failed, ending up "done" with
    // another test's 80000 bytes.
    let dead_port = 9;

    let (mut srv, addr) = start_server(&out, &state, &["--max-concurrent", "2"]);

    let body = serde_json::json!({
        "url": format!("http://127.0.0.1:{}/missing.bin", dead_port),
        "connections": 1,
        "retries": 1,
    })
    .to_string();
    let (st, resp) = http_req(&addr, "POST", "/api/add", Some(&body));
    assert_eq!(st, 200, "POST /api/add returned {}: {}", st, resp);
    let id = serde_json::from_str::<serde_json::Value>(&resp).unwrap()["id"]
        .as_u64()
        .expect("add must return an id");

    // It must end up failed, but only after spending the retry: the engine
    // waits RETRY_DELAY_SECS (5s) between attempts, so allow for both.
    let it = wait_status(&addr, id, "error", 60);
    assert_eq!(
        it["attempts"].as_u64(),
        Some(1),
        "the retry budget must be spent exactly once: {}",
        it
    );
    assert_eq!(it["retries"].as_u64(), Some(1), "item: {}", it);

    let _ = srv.kill();
    let _ = srv.wait();
}

/// Without a budget, a failure is final -- no retry loop on a permanent error.
#[test]
fn a_failed_download_without_a_budget_is_not_retried() {
    let out = unique_dir("out");
    let state = unique_dir("state");
    // Port 9, for the same reason as in the test above: a free_port() result
    // can be bound by a parallel test before this download reaches it.
    let dead_port = 9;

    let (mut srv, addr) = start_server(&out, &state, &["--max-concurrent", "2"]);

    let body = serde_json::json!({
        "url": format!("http://127.0.0.1:{}/missing.bin", dead_port),
        "connections": 1,
    })
    .to_string();
    let (_st, resp) = http_req(&addr, "POST", "/api/add", Some(&body));
    let id = serde_json::from_str::<serde_json::Value>(&resp).unwrap()["id"]
        .as_u64()
        .unwrap();

    let it = wait_status(&addr, id, "error", 30);
    assert_eq!(it["attempts"].as_u64(), Some(0), "item: {}", it);

    let _ = srv.kill();
    let _ = srv.wait();
}

/// Properties: the dialog's OK button has to change something.
///
/// `POST /api/update` edits the three fields the Properties dialog shows (url,
/// output, description). Editing the URL or the target of a download that is
/// already running would race the worker writing that file, so those two are
/// refused while it is in flight; the description is free-form metadata and is
/// always accepted.
#[test]
fn api_update_edits_the_properties_fields() {
    let data = make_data(200_000);
    let origin = start_origin(data.clone(), 0, 0);
    let out = unique_dir("out");
    let state = unique_dir("state");
    let (mut srv, addr) = start_server(&out, &state, &["--max-concurrent", "1"]);

    let body = serde_json::json!({"url": format!("{}/old.bin", origin), "connections": 2})
        .to_string();
    let (st, resp) = http_req(&addr, "POST", "/api/add", Some(&body));
    assert_eq!(st, 200, "add failed: {}", resp);
    let id: u64 = serde_json::from_str::<serde_json::Value>(&resp).unwrap()["id"]
        .as_u64()
        .unwrap();

    // An item starts downloading as soon as it is added and a retarget of a
    // live download is refused by design, so let this small file finish first.
    // A finished item is the normal case for Properties anyway: IDM shows the
    // Progress dialog while a download runs and Properties once it is done.
    wait_status(&addr, id, "done", 40);

    let new_url = format!("{}/new.bin", origin);
    let new_out = out.join("renamed.bin");
    let upd = serde_json::json!({
        "id": id,
        "url": new_url,
        "output": new_out.to_string_lossy(),
        "description": "a note from the Properties dialog",
    })
    .to_string();
    let (st, resp) = http_req(&addr, "POST", "/api/update", Some(&upd));
    assert_eq!(st, 200, "POST /api/update returned {}: {}", st, resp);

    let it = find_item(&json(&addr, "/api/items"), id);
    assert_eq!(it["url"].as_str(), Some(new_url.as_str()), "url not updated: {}", it);
    assert_eq!(
        it["output"].as_str(),
        Some(new_out.to_string_lossy().as_ref()),
        "output not updated: {}",
        it
    );
    assert_eq!(
        it["description"].as_str(),
        Some("a note from the Properties dialog"),
        "description not stored: {}",
        it
    );

    // Fields the request omits must stay as they are.
    let only_desc = serde_json::json!({"id": id, "description": "second note"}).to_string();
    let (st, _) = http_req(&addr, "POST", "/api/update", Some(&only_desc));
    assert_eq!(st, 200);
    let it = find_item(&json(&addr, "/api/items"), id);
    assert_eq!(it["description"].as_str(), Some("second note"));
    assert_eq!(it["url"].as_str(), Some(new_url.as_str()), "url must survive: {}", it);

    // An unknown id is a 404, not a silent success.
    let (st, resp) = http_req(
        &addr,
        "POST",
        "/api/update",
        Some(&serde_json::json!({"id": 9999, "description": "x"}).to_string()),
    );
    assert_eq!(st, 404, "unknown id must 404, got {}: {}", st, resp);

    let _ = srv.kill();
    let _ = srv.wait();
}

/// The edit must survive a restart: the Properties dialog writes to the queue
/// file, not just to memory.
#[test]
fn api_update_persists_across_restart() {
    let data = make_data(100_000);
    let origin = start_origin(data, 0, 0);
    let out = unique_dir("out");
    let state = unique_dir("state");
    let (mut srv, addr) = start_server(&out, &state, &["--max-concurrent", "1"]);
    let body =
        serde_json::json!({"url": format!("{}/f.bin", origin), "connections": 2}).to_string();
    let (_, resp) = http_req(&addr, "POST", "/api/add", Some(&body));
    let id = serde_json::from_str::<serde_json::Value>(&resp).unwrap()["id"]
        .as_u64()
        .unwrap();
    wait_status(&addr, id, "done", 40);
    let (st, _) = http_req(
        &addr,
        "POST",
        "/api/update",
        Some(&serde_json::json!({"id": id, "description": "survives"}).to_string()),
    );
    assert_eq!(st, 200);
    let _ = srv.kill();
    let _ = srv.wait();

    let port2 = free_port();
    let addr2 = format!("127.0.0.1:{}", port2);
    let mut srv2 = spawn_server(&addr2, &out, &state, &["--max-concurrent", "1"]);
    wait_ready(&addr2);
    let it = find_item(&json(&addr2, "/api/items"), id);
    assert_eq!(it["description"].as_str(), Some("survives"), "edit was not saved: {}", it);
    let _ = srv2.kill();
    let _ = srv2.wait();
}

/// Retargeting a download that is in flight would mean two writers for one
/// file, so url/output are refused while it runs. The description is not.
#[test]
fn api_update_refuses_to_retarget_a_running_download() {
    // A slow origin so the download is still running when we try to edit it.
    // Sized to take minutes rather than seconds: at 4 MB this finished inside
    // the ~10 s it took to get here on a loaded runner, and a finished
    // download is editable, which made the test flaky.
    let data = make_data(40_000_000);
    let origin = start_origin(data, 16_384, 40);
    let out = unique_dir("out");
    let state = unique_dir("state");
    let (mut srv, addr) = start_server(&out, &state, &["--max-concurrent", "2"]);
    let body =
        serde_json::json!({"url": format!("{}/slow.bin", origin), "connections": 1}).to_string();
    let (_, resp) = http_req(&addr, "POST", "/api/add", Some(&body));
    let id = serde_json::from_str::<serde_json::Value>(&resp).unwrap()["id"]
        .as_u64()
        .unwrap();
    wait_status(&addr, id, "running", 20);

    let (st, resp) = http_req(
        &addr,
        "POST",
        "/api/update",
        Some(&serde_json::json!({"id": id, "url": "http://example.com/other"}).to_string()),
    );
    assert_eq!(st, 409, "retargeting a running download must be refused, got {}", resp);
    let it = find_item(&json(&addr, "/api/items"), id);
    assert!(
        it["url"].as_str().unwrap_or("").contains("slow.bin"),
        "the url must not have changed: {}",
        it
    );

    // ...but a note about it is harmless.
    let (st, resp) = http_req(
        &addr,
        "POST",
        "/api/update",
        Some(&serde_json::json!({"id": id, "description": "while running"}).to_string()),
    );
    assert_eq!(st, 200, "a description edit must be allowed while running: {}", resp);

    let _ = srv.kill();
    let _ = srv.wait();
}

/// The media options the GUI's Download File Info dialog resolves: a yt-dlp
/// format selector plus the Cookie/Referer a protected media page needs. Like
/// the other Options values they have to be stored on the item, so a resume or
/// a retry runs with the same format instead of silently picking "best".
#[test]
fn api_add_stores_the_media_options() {
    let data = make_data(50_000);
    let origin = start_origin(data, 0, 0);
    let out = unique_dir("out");
    let state = unique_dir("state");
    let (mut srv, addr) = start_server(&out, &state, &["--max-concurrent", "1"]);

    let body = serde_json::json!({
        "url": format!("{}/clip.bin", origin),
        "connections": 1,
        "format": "137+140",
        "cookie": "SID=abc",
        "referer": "https://example.com/watch",
        "force_media": true,
    })
    .to_string();
    let (st, resp) = http_req(&addr, "POST", "/api/add", Some(&body));
    assert_eq!(st, 200, "add failed: {}", resp);
    let id = serde_json::from_str::<serde_json::Value>(&resp).unwrap()["id"]
        .as_u64()
        .unwrap();

    let it = find_item(&json(&addr, "/api/items"), id);
    assert_eq!(it["format"].as_str(), Some("137+140"), "format not stored: {}", it);
    assert_eq!(it["cookie"].as_str(), Some("SID=abc"), "cookie not stored: {}", it);
    assert_eq!(
        it["referer"].as_str(),
        Some("https://example.com/watch"),
        "referer not stored: {}",
        it
    );
    assert_eq!(it["force_media"].as_bool(), Some(true), "force_media not stored: {}", it);

    let _ = srv.kill();
    let _ = srv.wait();
}

/// The GUI cannot run the engine itself -- it only speaks to the API -- so
/// listing the formats of a URL needs an endpoint. `POST /api/formats` runs the
/// engine's --list-formats and hands the summary through.
#[test]
fn api_formats_reports_what_the_backend_offers() {
    let out = unique_dir("out");
    let state = unique_dir("state");

    // A stub standing in for yt-dlp: --list-formats shells out to it, so the
    // test needs no network and no real yt-dlp.
    let fake = state.join("fake-yt-dlp");
    std::fs::write(
        &fake,
        r#"#!/bin/sh
cat <<'JSON'
{"id":"vid1","title":"A clip","ext":"mp4","formats":[
 {"format_id":"137","ext":"mp4","resolution":"1920x1080","vcodec":"avc1","acodec":"none","filesize":5000,"format_note":"1080p"},
 {"format_id":"140","ext":"m4a","resolution":"audio only","vcodec":"none","acodec":"mp4a"}]}
JSON
"#,
    )
    .unwrap();
    #[cfg(unix)]
    {
        use std::os::unix::fs::PermissionsExt;
        std::fs::set_permissions(&fake, std::fs::Permissions::from_mode(0o755)).unwrap();
    }

    let (mut srv, addr) = start_server(&out, &state, &["--max-concurrent", "1", "--yt-dlp", fake.to_str().unwrap()]);

    let body = serde_json::json!({"url": "https://example.com/watch?v=vid1"}).to_string();
    let (st, resp) = http_req(&addr, "POST", "/api/formats", Some(&body));
    assert_eq!(st, 200, "POST /api/formats returned {}: {}", st, resp);
    let v: serde_json::Value = serde_json::from_str(&resp).unwrap();
    assert_eq!(v["ok"].as_bool(), Some(true), "{}", v);
    assert_eq!(v["title"].as_str(), Some("A clip"), "{}", v);
    let fmts = v["formats"].as_array().unwrap_or_else(|| panic!("no formats: {}", v));
    assert_eq!(fmts.len(), 2, "{}", v);
    assert_eq!(fmts[0]["format_id"].as_str(), Some("137"));
    assert_eq!(fmts[0]["resolution"].as_str(), Some("1920x1080"));
    // `kind` is what lets the dialog label a row "video only" / "audio only".
    assert!(fmts[0]["kind"].is_string(), "each format needs a kind: {}", v);

    // A URL with nothing to list must be an answer, not a hang or a 500.
    let (st, resp) = http_req(
        &addr,
        "POST",
        "/api/formats",
        Some(&serde_json::json!({"url": ""}).to_string()),
    );
    assert_eq!(st, 400, "an empty url must be refused, got {}: {}", st, resp);

    let _ = srv.kill();
    let _ = srv.wait();
}

/// IDM's `/f NAME` asks for the saved file to be called NAME. The engine
/// derives the name from the URL, so /api/add needs to be told; and because the
/// value can come from a desktop file association, a name containing a path
/// must not be able to write outside the download directory.
#[test]
fn api_add_honours_a_requested_filename() {
    let data = make_data(80_000);
    let origin = start_origin(data.clone(), 0, 0);
    let out = unique_dir("out");
    let state = unique_dir("state");
    let (mut srv, addr) = start_server(&out, &state, &["--max-concurrent", "2"]);

    let body = serde_json::json!({
        "url": format!("{}/ugly-slug.bin", origin),
        "connections": 2,
        "filename": "Nice Name.bin",
    })
    .to_string();
    let (st, resp) = http_req(&addr, "POST", "/api/add", Some(&body));
    assert_eq!(st, 200, "add failed: {}", resp);
    let id = serde_json::from_str::<serde_json::Value>(&resp).unwrap()["id"]
        .as_u64()
        .unwrap();
    wait_status(&addr, id, "done", 40);

    let file = out.join("Nice Name.bin");
    let got = std::fs::read(&file).unwrap_or_else(|e| panic!("{} missing: {}", file.display(), e));
    assert_eq!(crc32(&got), crc32(&data), "crc mismatch for the renamed file");
    assert!(
        !out.join("ugly-slug.bin").exists(),
        "the URL-derived name must not be used as well"
    );

    // A traversal attempt keeps only the file component.
    let escape = serde_json::json!({
        "url": format!("{}/x.bin", origin),
        "connections": 1,
        "filename": "../../escaped.bin",
    })
    .to_string();
    let (st, resp) = http_req(&addr, "POST", "/api/add", Some(&escape));
    assert_eq!(st, 200, "add failed: {}", resp);
    let id2 = serde_json::from_str::<serde_json::Value>(&resp).unwrap()["id"]
        .as_u64()
        .unwrap();
    let it = find_item(&json(&addr, "/api/items"), id2);
    let output = it["output"].as_str().unwrap_or("");
    assert!(
        output.starts_with(out.to_string_lossy().as_ref()),
        "a filename with .. must stay inside the output dir, got {}",
        output
    );
    assert!(output.ends_with("escaped.bin"), "got {}", output);

    let _ = srv.kill();
    let _ = srv.wait();
}

/// The queue file holds server passwords, so it must not be world-readable.
/// The api-token file next to it has been 0600 all along; queue.json was not.
#[cfg(unix)]
#[test]
fn queue_file_is_not_world_readable() {
    use std::os::unix::fs::PermissionsExt;

    let data = make_data(1000);
    let origin = start_origin(data.clone(), 0, 0);
    let out = unique_dir("out");
    let state = unique_dir("state");
    let (mut srv, addr) = start_server(&out, &state, &[]);

    let body = serde_json::json!({
        "url": format!("{}/file.bin", origin),
        "auth": "alice:s3cret",
    })
    .to_string();
    let (st, resp) = http_req(&addr, "POST", "/api/add", Some(&body));
    assert_eq!(st, 200, "POST /api/add returned {}: {}", st, resp);

    let path = state.join("queue.json");
    for _ in 0..100 {
        if path.exists() {
            break;
        }
        std::thread::sleep(std::time::Duration::from_millis(100));
    }
    assert!(path.exists(), "queue.json never appeared at {}", path.display());
    let mode = std::fs::metadata(&path).unwrap().permissions().mode() & 0o777;
    assert_eq!(mode, 0o600, "queue.json is {:o}, must be 600", mode);

    let _ = srv.kill();
}

/// /api/items must not hand out the proxy password either: it travels inside
/// the proxy URL's user-info, which is just as readable as `auth` was.
#[test]
fn api_items_redacts_the_proxy_password() {
    let data = make_data(1000);
    let origin = start_origin(data.clone(), 0, 0);
    let out = unique_dir("out");
    let state = unique_dir("state");
    let (mut srv, addr) = start_server(&out, &state, &[]);

    let body = serde_json::json!({
        "url": format!("{}/file.bin", origin),
        "proxy": "http://bob:hunter2@proxy.example:8080",
    })
    .to_string();
    let (st, resp) = http_req(&addr, "POST", "/api/add", Some(&body));
    assert_eq!(st, 200, "POST /api/add returned {}: {}", st, resp);
    let id = serde_json::from_str::<serde_json::Value>(&resp).unwrap()["id"]
        .as_u64()
        .expect("add must return an id");

    let it = find_item(&json(&addr, "/api/items"), id);
    let proxy = it["proxy"].as_str().unwrap_or("");
    assert!(!proxy.contains("hunter2"), "/api/items leaks the proxy password: {}", proxy);
    // The host is not a secret, and the GUI shows it.
    assert!(proxy.contains("proxy.example"), "the proxy host got lost: {}", proxy);
    assert!(proxy.contains("bob"), "the proxy user got lost: {}", proxy);

    let _ = srv.kill();
}

/// Stub yt-dlp for the queue: writes its payload under a different extension
/// than `-o` asked for, exactly as the real one does when its merger picks a
/// container.
fn make_media_stub(dir: &PathBuf) -> PathBuf {
    use std::os::unix::fs::PermissionsExt;
    let stub = dir.join("yt-dlp");
    std::fs::write(
        &stub,
        r#"#!/usr/bin/env bash
if [[ "$1" == "-J" ]]; then
  echo '{"id":"abc","title":"Queued Video","ext":"webm"}'
  exit 0
fi
out=""
while [[ $# -gt 0 ]]; do
  if [[ "$1" == "-o" ]]; then out="$2"; shift 2; else shift; fi
done
printf 'QUEUED-MEDIA-PAYLOAD' > "${out%.*}.webm"
"#,
    )
    .unwrap();
    let mut perm = std::fs::metadata(&stub).unwrap().permissions();
    perm.set_mode(0o755);
    std::fs::set_permissions(&stub, perm).unwrap();
    stub
}

#[test]
fn a_finished_media_download_reports_its_real_name_and_size() {
    // What the window showed after queueing three YouTube links: three rows
    // named "watch", "watch" and a slug, each with "-" for size, while the
    // files on disk were .webm/.mp4 of a few hundred megabytes. The queue
    // guessed the name from the URL at add time and never learned better,
    // because the child's stdout is discarded.
    const PAYLOAD_LEN: u64 = 20; // "QUEUED-MEDIA-PAYLOAD"
    let out = unique_dir("mout");
    let state = unique_dir("mstate");
    let stub = make_media_stub(&state);

    let (mut srv, addr) = start_server(&out, &state, &["--yt-dlp", stub.to_str().unwrap()]);

    let body = serde_json::json!({"url": "https://youtu.be/abc"}).to_string();
    let (st, resp) = http_req(&addr, "POST", "/api/add", Some(&body));
    assert_eq!(st, 200, "POST /api/add returned {}: {}", st, resp);
    let id = serde_json::from_str::<serde_json::Value>(&resp).unwrap()["id"]
        .as_u64()
        .expect("add must return an id");

    let it = wait_status(&addr, id, "done", 40);

    let real = out.join("abc.webm");
    assert!(real.exists(), "the stub writes {}", real.display());

    assert_eq!(
        it["output"].as_str(),
        real.to_str(),
        "the queue must name the file that exists, not the guess from the URL: {}",
        it
    );
    assert_eq!(
        it["total"].as_u64(),
        Some(PAYLOAD_LEN),
        "a finished download has a known size, so the Size column must not stay '-': {}",
        it
    );
    assert_eq!(it["downloaded"].as_u64(), Some(PAYLOAD_LEN), "item: {}", it);

    let _ = srv.kill();
    let _ = srv.wait();
}
