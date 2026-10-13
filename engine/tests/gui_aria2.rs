// GUI aria2 switch.
//
// The user asked for a toggle so the GUI can download via aria2. We check the
// queue API accepts `"aria2": true` on `/api/add` and that the item records it,
// so a download started from the window actually goes through aria2c.

use std::io::{Read, Write};
use std::net::{TcpListener, TcpStream};
use std::path::PathBuf;
use std::process::{Child, Command, Stdio};
use std::sync::atomic::{AtomicU64, Ordering};
use std::thread;
use std::time::{Duration, Instant};

const IDM: &str = env!("CARGO_BIN_EXE_idm");

fn unique_dir(tag: &str) -> PathBuf {
    static C: AtomicU64 = AtomicU64::new(0);
    let n = C.fetch_add(1, Ordering::SeqCst);
    let d = std::env::temp_dir().join(format!("idm_guiaria_{}_{}_{}", tag, std::process::id(), n));
    std::fs::create_dir_all(&d).unwrap();
    d
}

fn free_port() -> u16 {
    TcpListener::bind("127.0.0.1:0").unwrap().local_addr().unwrap().port()
}

fn spawn_server(addr: &str, out: &PathBuf, state: &PathBuf) -> Child {
    let mut cmd = Command::new(IDM);
    cmd.arg("--serve").arg(addr).arg("--output-dir").arg(out).arg("--state-dir").arg(state)
        .stdout(Stdio::null()).stderr(Stdio::null());
    cmd.spawn().unwrap()
}

fn http(addr: &str, method: &str, path: &str, body: Option<&str>) -> (u16, String) {
    let mut s = TcpStream::connect(addr).expect("connect");
    s.set_read_timeout(Some(Duration::from_secs(10))).unwrap();
    let b = body.unwrap_or("");
    let req = format!(
        "{} {} HTTP/1.1\r\nHost: {}\r\nContent-Type: application/json\r\nContent-Length: {}\r\nConnection: close\r\n\r\n{}",
        method, path, addr, b.len(), b
    );
    s.write_all(req.as_bytes()).unwrap();
    let mut resp = Vec::new();
    let _ = s.read_to_end(&mut resp);
    let text = String::from_utf8_lossy(&resp).to_string();
    let status = text.split_whitespace().nth(1).and_then(|c| c.parse().ok()).unwrap_or(0);
    let body = text.split_once("\r\n\r\n").map(|(_, x)| x.to_string()).unwrap_or_default();
    (status, body)
}

fn wait_ready(addr: &str) {
    let deadline = Instant::now() + Duration::from_secs(15);
    while Instant::now() < deadline {
        if TcpStream::connect(addr).is_ok() {
            return;
        }
        thread::sleep(Duration::from_millis(100));
    }
    panic!("idm --serve never came up");
}

#[test]
fn queue_api_accepts_aria2_flag() {
    let out = unique_dir("out");
    let state = unique_dir("state");
    let port = free_port();
    let addr = format!("127.0.0.1:{}", port);
    let mut srv = spawn_server(&addr, &out, &state);
    wait_ready(&addr);

    let body = serde_json::json!({
        "url": "http://127.0.0.1:9/never.bin",
        "aria2": true,
        "connections": 2
    })
    .to_string();
    let (st, resp) = http(&addr, "POST", "/api/add", Some(&body));
    assert_eq!(st, 200, "add returned {}: {}", st, resp);
    let v: serde_json::Value = serde_json::from_str(&resp).unwrap();
    assert_eq!(v["ok"], serde_json::json!(true), "resp: {}", resp);
    let id = v["id"].as_u64().unwrap();

    // The queue must remember the aria2 flag for that item.
    let deadline = Instant::now() + Duration::from_secs(10);
    loop {
        let (st, items) = http(&addr, "GET", "/api/items", None);
        assert_eq!(st, 200);
        let v: serde_json::Value = serde_json::from_str(&items).unwrap();
        if let Some(it) = v["items"].as_array().and_then(|a| a.iter().find(|i| i["id"].as_u64() == Some(id))) {
            assert_eq!(it["aria2"], serde_json::json!(true), "item must carry aria2: {}", it);
            break;
        }
        if Instant::now() > deadline {
            panic!("item {} never appeared", id);
        }
        thread::sleep(Duration::from_millis(150));
    }

    let _ = srv.kill();
    let _ = srv.wait();
}
