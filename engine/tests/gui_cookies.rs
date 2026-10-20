// Downloads from the browser extension go through the window's queue, so the
// user sees their progress. Two things make that possible:
//   * the server says where it listens (STATE_DIR/api-addr, next to
//     api-token), so the native host can find it;
//   * /api/add takes the browser's cookies, keeps them in a private file
//     for as long as the item lives, and hands them to yt-dlp -- a logged-in
//     YouTube session needs them, and they must never reach queue.json.

use std::io::{Read, Write};
use std::net::{TcpListener, TcpStream};
use std::os::unix::fs::PermissionsExt;
use std::path::{Path, PathBuf};
use std::process::{Child, Command, Stdio};
use std::sync::atomic::{AtomicU64, Ordering};
use std::thread;
use std::time::{Duration, Instant};

const IDM: &str = env!("CARGO_BIN_EXE_idm");
const API_TOKEN: &str = "testtoken0123456789";

fn unique_dir(tag: &str) -> PathBuf {
    static C: AtomicU64 = AtomicU64::new(0);
    let n = C.fetch_add(1, Ordering::SeqCst);
    let d = std::env::temp_dir().join(format!("idm_guick_{}_{}_{}", tag, std::process::id(), n));
    std::fs::create_dir_all(&d).unwrap();
    d
}

fn http_req(addr: &str, method: &str, path: &str, body: Option<&str>) -> (u16, String) {
    let mut s = TcpStream::connect(addr).expect("connect to idm --serve");
    s.set_read_timeout(Some(Duration::from_secs(20))).unwrap();
    let body = body.unwrap_or("");
    let req = format!(
        "{} {} HTTP/1.1\r\nHost: {}\r\nContent-Type: application/json\r\nX-IDM-Token: {}\r\nContent-Length: {}\r\nConnection: close\r\n\r\n{}",
        method, path, addr, API_TOKEN, body.len(), body
    );
    s.write_all(req.as_bytes()).unwrap();
    let mut resp = Vec::new();
    s.read_to_end(&mut resp).unwrap();
    let text = String::from_utf8_lossy(&resp).to_string();
    let status = text.split_whitespace().nth(1).and_then(|c| c.parse().ok()).unwrap_or(0);
    let body = text.split_once("\r\n\r\n").map(|(_, b)| b.to_string()).unwrap_or_default();
    (status, body)
}

fn free_port() -> u16 {
    TcpListener::bind("127.0.0.1:0").unwrap().local_addr().unwrap().port()
}

/// Same rule as engine/tests/gui.rs: a port is ours only while our child lives.
fn start_server(out: &Path, state: &Path, extra: &[&str]) -> (Child, String) {
    for _ in 0..8 {
        let addr = format!("127.0.0.1:{}", free_port());
        let mut child = Command::new(IDM)
            .arg("--serve").arg(&addr)
            .arg("--output-dir").arg(out)
            .arg("--state-dir").arg(state)
            .arg("--api-token").arg(API_TOKEN)
            .args(extra)
            .stdout(Stdio::null()).stderr(Stdio::null())
            .spawn().unwrap();
        let deadline = Instant::now() + Duration::from_secs(15);
        loop {
            if matches!(child.try_wait(), Ok(Some(_))) {
                break;
            }
            if TcpStream::connect(&addr).is_ok() {
                thread::sleep(Duration::from_millis(250));
                if matches!(child.try_wait(), Ok(Some(_))) {
                    break;
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
    panic!("could not get a port of our own");
}

fn item(addr: &str, id: u64) -> serde_json::Value {
    let (_, body) = http_req(addr, "GET", "/api/items", None);
    let v: serde_json::Value = serde_json::from_str(&body).unwrap();
    v["items"].as_array().unwrap().iter().find(|i| i["id"].as_u64() == Some(id)).cloned().unwrap()
}

fn wait_status(addr: &str, id: u64, want: &str) -> serde_json::Value {
    let deadline = Instant::now() + Duration::from_secs(30);
    loop {
        let it = item(addr, id);
        if it["status"].as_str() == Some(want) {
            return it;
        }
        assert!(Instant::now() < deadline, "item never reached {}: {}", want, it);
        thread::sleep(Duration::from_millis(200));
    }
}

/// yt-dlp stub: logs what any --cookies file held, writes a small payload.
fn stub(dir: &Path) -> (PathBuf, PathBuf) {
    let s = dir.join("yt-dlp");
    let log = dir.join("cookie.log");
    std::fs::write(&s, format!(r#"#!/usr/bin/env bash
if [[ "$1" == "--version" ]]; then echo 2026.08.19; exit 0; fi
prev=""
for a in "$@"; do
  if [[ "$prev" == "--cookies" ]]; then echo "FILE $a" >> "{log}"; cat "$a" >> "{log}"; fi
  prev="$a"
done
if [[ "$*" == *"-J"* ]]; then echo '{{"id":"a","title":"t","ext":"mp4","formats":[]}}'; exit 0; fi
out=""
while [[ $# -gt 0 ]]; do if [[ "$1" == "-o" ]]; then out="$2"; shift 2; else shift; fi; done
printf 'payload' > "$out"
"#, log = log.display())).unwrap();
    let mut p = std::fs::metadata(&s).unwrap().permissions();
    p.set_mode(0o755);
    std::fs::set_permissions(&s, p).unwrap();
    (s, log)
}

#[test]
fn the_server_says_where_it_listens() {
    let out = unique_dir("out");
    let state = unique_dir("state");
    let (mut srv, addr) = start_server(&out, &state, &[]);
    let written = std::fs::read_to_string(state.join("api-addr")).unwrap_or_default();
    assert_eq!(written.trim(), addr);
    let mode = std::fs::metadata(state.join("api-addr")).unwrap().permissions().mode() & 0o777;
    assert_eq!(mode, 0o600);
    let _ = srv.kill();
    let _ = srv.wait();
}

#[test]
fn browser_cookies_on_an_added_item_reach_yt_dlp_and_not_the_queue_file() {
    let out = unique_dir("out");
    let state = unique_dir("state");
    let (yt, log) = stub(&state);
    let (mut srv, addr) = start_server(&out, &state, &["--yt-dlp-path", yt.to_str().unwrap()]);
    let body = serde_json::json!({
        "url": "https://www.youtube.com/watch?v=abc",
        "connections": 1,
        "force_media": true,
        "filename": "clip.mp4",
        "cookies": [
            {"domain": ".youtube.com", "path": "/", "secure": true, "httpOnly": true,
             "expirationDate": 1893456000, "name": "SID", "value": "secret-sid-value"}
        ]
    }).to_string();
    let (st, resp) = http_req(&addr, "POST", "/api/add", Some(&body));
    assert_eq!(st, 200, "{}", resp);
    let id = serde_json::from_str::<serde_json::Value>(&resp).unwrap()["id"].as_u64().unwrap();
    wait_status(&addr, id, "done");

    let logged = std::fs::read_to_string(&log).unwrap_or_default();
    assert!(logged.contains("#HttpOnly_.youtube.com\tTRUE\t/\tTRUE\t1893456000\tSID\tsecret-sid-value"), "log: {}", logged);
    let file = PathBuf::from(logged.lines().find(|l| l.starts_with("FILE ")).unwrap().trim_start_matches("FILE "));
    assert!(!file.exists(), "a finished item must not leave its cookies behind: {}", file.display());

    let queue = std::fs::read_to_string(state.join("queue.json")).unwrap();
    assert!(!queue.contains("secret-sid-value"), "cookies leaked into queue.json");
    let _ = srv.kill();
    let _ = srv.wait();
}
