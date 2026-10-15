// When a download's engine process dies, say WHY.
//
// The queue runs one `idm` child per download and starts it with
// stderr(Stdio::null()), so the only thing that ever reached the item was
//
//     engine exited with exit status: 1
//
// That sentence is useless to a user and useless to whoever is debugging:
// a missing yt-dlp, an unwritable output directory, a refused connection and
// a bad proxy all produce it. It is the same mistake the GUI was making when
// it swallowed "address in use" into /dev/null -- a failure with the reason
// thrown away is a failure nobody can act on.
//
// Reported from Windows as "it downloads nothing", with no way from here to
// find out what the child was complaining about.

use std::io::{Read, Write};
use std::net::{TcpListener, TcpStream};
use std::path::PathBuf;
use std::process::{Child, Command, Stdio};
use std::sync::atomic::{AtomicU64, Ordering};
use std::thread;
use std::time::{Duration, Instant};

const IDM: &str = env!("CARGO_BIN_EXE_idm");
const TOKEN: &str = "testtoken0123456789";

fn unique_dir(tag: &str) -> PathBuf {
    static C: AtomicU64 = AtomicU64::new(0);
    let n = C.fetch_add(1, Ordering::SeqCst);
    let d = std::env::temp_dir().join(format!("idm_cherr_{}_{}_{}", tag, std::process::id(), n));
    std::fs::create_dir_all(&d).unwrap();
    d
}

fn free_port() -> u16 {
    TcpListener::bind("127.0.0.1:0").unwrap().local_addr().unwrap().port()
}

/// Start our own server, and make sure the one that answers is ours.
fn start_server(out: &PathBuf, state: &PathBuf) -> (Child, String) {
    for _ in 0..8 {
        let addr = format!("127.0.0.1:{}", free_port());
        let mut child = Command::new(IDM)
            .arg("--serve").arg(&addr)
            .arg("--output-dir").arg(out)
            .arg("--state-dir").arg(state)
            .arg("--api-token").arg(TOKEN)
            .stdout(Stdio::null()).stderr(Stdio::null())
            .spawn()
            .unwrap();
        let deadline = Instant::now() + Duration::from_secs(15);
        loop {
            if matches!(child.try_wait(), Ok(Some(_))) {
                break; // lost the race for this port
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
            thread::sleep(Duration::from_millis(50));
        }
    }
    panic!("could not get a port of our own");
}

fn http(addr: &str, method: &str, path: &str, body: Option<&str>) -> (u16, String) {
    let mut s = TcpStream::connect(addr).expect("connect");
    s.set_read_timeout(Some(Duration::from_secs(10))).unwrap();
    let b = body.unwrap_or("");
    let req = format!(
        "{} {} HTTP/1.1\r\nHost: {}\r\nContent-Type: application/json\r\n\
         X-IDM-Token: {}\r\nContent-Length: {}\r\nConnection: close\r\n\r\n{}",
        method, path, addr, TOKEN, b.len(), b
    );
    s.write_all(req.as_bytes()).unwrap();
    let mut resp = Vec::new();
    let _ = s.read_to_end(&mut resp);
    let text = String::from_utf8_lossy(&resp).to_string();
    let status = text.split_whitespace().nth(1).and_then(|c| c.parse().ok()).unwrap_or(0);
    let body = text.split_once("\r\n\r\n").map(|(_, x)| x.to_string()).unwrap_or_default();
    (status, body)
}

/// Wait for the item to reach "error" and return what it says.
fn wait_for_error(addr: &str, id: u64) -> String {
    let deadline = Instant::now() + Duration::from_secs(60);
    loop {
        let (_, items) = http(addr, "GET", "/api/items", None);
        let v: serde_json::Value = serde_json::from_str(&items).unwrap();
        if let Some(it) = v["items"].as_array()
            .and_then(|a| a.iter().find(|i| i["id"].as_u64() == Some(id)))
        {
            if it["status"] == "error" {
                return it["error"].as_str().unwrap_or("").to_string();
            }
        }
        if Instant::now() > deadline {
            panic!("item {} never reached an error state: {}", id, items);
        }
        thread::sleep(Duration::from_millis(200));
    }
}

#[test]
fn a_failed_download_reports_what_the_child_said() {
    let out = unique_dir("out");
    let state = unique_dir("state");
    let (mut srv, addr) = start_server(&out, &state);

    // Port 9 is discard: the connection is refused at once, so the child
    // fails quickly and for a reason it can describe. retries 1 keeps the
    // test short -- and on Windows ten retries of this is the console
    // flicker that was reported.
    let body = serde_json::json!({
        "url": "http://127.0.0.1:9/nothing.bin",
        "connections": 1,
        "retries": 1
    }).to_string();
    let (st, resp) = http(&addr, "POST", "/api/add", Some(&body));
    assert_eq!(st, 200, "add returned {}: {}", st, resp);
    let id = serde_json::from_str::<serde_json::Value>(&resp).unwrap()["id"]
        .as_u64().unwrap();

    let err = wait_for_error(&addr, id);

    // The exit status alone is what we are trying to get away from.
    assert!(
        err.trim() != "engine exited with exit status: 1",
        "the item only knows the exit code: {:?}", err
    );
    let lower = err.to_lowercase();
    assert!(
        lower.contains("connect") || lower.contains("refused")
            || lower.contains("connection") || lower.contains("os error"),
        "the error should repeat what the child complained about, got {:?}",
        err
    );

    let _ = srv.kill();
    let _ = srv.wait();
}

#[test]
fn the_reported_error_stays_short_enough_to_show() {
    // The item's error ends up in a table cell and in the queue file; a wall
    // of output would be as unusable as no output.
    let out = unique_dir("out2");
    let state = unique_dir("state2");
    let (mut srv, addr) = start_server(&out, &state);

    let body = serde_json::json!({
        "url": "http://127.0.0.1:9/nothing.bin",
        "connections": 1,
        "retries": 1
    }).to_string();
    let (_, resp) = http(&addr, "POST", "/api/add", Some(&body));
    let id = serde_json::from_str::<serde_json::Value>(&resp).unwrap()["id"]
        .as_u64().unwrap();

    let err = wait_for_error(&addr, id);
    assert!(err.len() <= 400, "error is {} chars: {:?}", err.len(), err);

    let _ = srv.kill();
    let _ = srv.wait();
}
