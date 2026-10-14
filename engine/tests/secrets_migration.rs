//! Passwords already on disk have to end up in the vault without anybody
//! losing one. Second half of step 2 of
//! docs/superpowers/specs/2026-10-14-auth-at-rest-design.md.
//!
//! Three rules, in order of importance:
//!   * a password that arrives over /api/add is stored as a reference, so no
//!     new plaintext ever reaches queue.json;
//!   * an existing plaintext queue.json keeps working, and migrates on the
//!     next write, leaving a .pre-secrets backup behind;
//!   * if the vault cannot be written, the plaintext STAYS. Having a password
//!     in the clear for another day is better than losing it.

use std::io::{Read, Write};
use std::net::{TcpStream};
use std::path::PathBuf;
use std::process::{Child, Command, Stdio};
use std::sync::atomic::{AtomicU64, Ordering};
use std::thread;
use std::time::{Duration, Instant};

const IDM: &str = env!("CARGO_BIN_EXE_idm");
const API_TOKEN: &str = "testtoken0123456789";

fn unique_dir(tag: &str) -> PathBuf {
    static C: AtomicU64 = AtomicU64::new(0);
    let n = C.fetch_add(1, Ordering::SeqCst);
    let d = std::env::temp_dir().join(format!("idm_mig_{}_{}_{}", tag, std::process::id(), n));
    std::fs::create_dir_all(&d).unwrap();
    d
}

fn free_port() -> u16 {
    let l = std::net::TcpListener::bind("127.0.0.1:0").unwrap();
    l.local_addr().unwrap().port()
}

fn spawn_server(addr: &str, out_dir: &PathBuf, state_dir: &PathBuf) -> Child {
    Command::new(IDM)
        .arg("--serve")
        .arg(addr)
        .arg("--output-dir")
        .arg(out_dir)
        .arg("--state-dir")
        .arg(state_dir)
        .arg("--api-token")
        .arg(API_TOKEN)
        .env("IDM_NO_KEYRING", "1")
        .stdout(Stdio::null())
        .stderr(Stdio::null())
        .spawn()
        .expect("failed to spawn idm --serve")
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

fn http_req(addr: &str, method: &str, path: &str, body: Option<&str>) -> (u16, String) {
    let mut s = TcpStream::connect(addr).unwrap();
    let b = body.unwrap_or("");
    let req = format!(
        "{} {} HTTP/1.1\r\nHost: x\r\nX-IDM-Token: {}\r\nContent-Type: application/json\r\nContent-Length: {}\r\nConnection: close\r\n\r\n{}",
        method, path, API_TOKEN, b.len(), b
    );
    s.write_all(req.as_bytes()).unwrap();
    let mut out = String::new();
    s.read_to_string(&mut out).unwrap();
    let status = out
        .split_whitespace()
        .nth(1)
        .and_then(|c| c.parse::<u16>().ok())
        .unwrap_or(0);
    let body = out.split("\r\n\r\n").nth(1).unwrap_or("").to_string();
    (status, body)
}

fn add(addr: &str, body: serde_json::Value) -> u64 {
    let (st, resp) = http_req(addr, "POST", "/api/add", Some(&body.to_string()));
    assert_eq!(st, 200, "POST /api/add returned {}: {}", st, resp);
    serde_json::from_str::<serde_json::Value>(&resp).unwrap()["id"]
        .as_u64()
        .expect("add must return an id")
}

fn read_queue(state: &PathBuf) -> String {
    let path = state.join("queue.json");
    for _ in 0..100 {
        if path.exists() {
            break;
        }
        thread::sleep(Duration::from_millis(100));
    }
    std::fs::read_to_string(&path).expect("queue.json")
}

#[test]
fn a_password_from_the_api_is_stored_as_a_reference() {
    let out = unique_dir("out");
    let state = unique_dir("state");
    let port = free_port();
    let addr = format!("127.0.0.1:{}", port);
    let mut srv = spawn_server(&addr, &out, &state);
    wait_ready(&addr);

    // The old shape -- "user:password" in one field -- is what an older GUI
    // sends, and it must not land in queue.json as it did before.
    add(&addr, serde_json::json!({ "url": "http://127.0.0.1:9/f.bin", "auth": "alice:s3cret" }));

    let queue = read_queue(&state);
    assert!(!queue.contains("s3cret"), "queue.json still holds plaintext: {}", queue);
    assert!(queue.contains("auth_ref"), "no reference was stored: {}", queue);
    assert!(queue.contains("\"auth_user\": \"alice\""), "the user got lost: {}", queue);
    assert!(state.join("secrets.json").exists(), "no vault was created");

    let _ = srv.kill();
}

#[test]
fn the_api_also_takes_a_reference_directly() {
    let out = unique_dir("out");
    let state = unique_dir("state");

    // A reference the GUI made with `idm --secrets-set`.
    let mut child = Command::new(IDM)
        .arg("--state-dir")
        .arg(&state)
        .arg("--secrets-set")
        .env("IDM_NO_KEYRING", "1")
        .stdin(Stdio::piped())
        .stdout(Stdio::piped())
        .spawn()
        .unwrap();
    child.stdin.as_mut().unwrap().write_all(b"s3cret").unwrap();
    drop(child.stdin.take());
    let o = child.wait_with_output().unwrap();
    let reference = String::from_utf8_lossy(&o.stdout).trim().to_string();
    assert!(reference.starts_with("secret:"), "got {:?}", reference);

    let port = free_port();
    let addr = format!("127.0.0.1:{}", port);
    let mut srv = spawn_server(&addr, &out, &state);
    wait_ready(&addr);
    add(
        &addr,
        serde_json::json!({
            "url": "http://127.0.0.1:9/f.bin",
            "auth_user": "alice",
            "auth_password_ref": reference,
        }),
    );

    let queue = read_queue(&state);
    assert!(!queue.contains("s3cret"), "plaintext in queue.json: {}", queue);
    assert!(queue.contains(&reference), "the reference was dropped: {}", queue);

    let _ = srv.kill();
}

#[test]
fn an_old_plaintext_queue_migrates_on_the_next_write() {
    let out = unique_dir("out");
    let state = unique_dir("state");
    // What an older build left behind.
    std::fs::write(
        state.join("queue.json"),
        serde_json::json!([{
            "id": 1,
            "url": "http://127.0.0.1:9/old.bin",
            "output": out.join("old.bin"),
            "auth": "alice:s3cret",
            "status": "paused"
        }])
        .to_string(),
    )
    .unwrap();

    let port = free_port();
    let addr = format!("127.0.0.1:{}", port);
    let mut srv = spawn_server(&addr, &out, &state);
    wait_ready(&addr);

    // The old item is still there: reading a plaintext queue must not drop it.
    let (st, items) = http_req(&addr, "GET", "/api/items", None);
    assert_eq!(st, 200, "GET /api/items returned {}", st);
    assert!(items.contains("old.bin"), "the old item vanished: {}", items);

    // Any write migrates the file.
    add(&addr, serde_json::json!({ "url": "http://127.0.0.1:9/new.bin" }));
    let mut queue = read_queue(&state);
    for _ in 0..50 {
        if !queue.contains("s3cret") {
            break;
        }
        thread::sleep(Duration::from_millis(100));
        queue = read_queue(&state);
    }
    assert!(!queue.contains("s3cret"), "plaintext survived the migration: {}", queue);
    assert!(queue.contains("auth_ref"), "no reference after migration: {}", queue);
    assert!(
        state.join("queue.json.pre-secrets").exists(),
        "the only way back to an older build is the backup, and it is missing"
    );
    let backup = std::fs::read_to_string(state.join("queue.json.pre-secrets")).unwrap();
    assert!(backup.contains("s3cret"), "the backup must hold the original: {}", backup);

    let _ = srv.kill();
}

#[test]
fn a_broken_vault_keeps_the_plaintext() {
    let out = unique_dir("out");
    let state = unique_dir("state");
    std::fs::write(
        state.join("queue.json"),
        serde_json::json!([{
            "id": 1,
            "url": "http://127.0.0.1:9/old.bin",
            "output": out.join("old.bin"),
            "auth": "alice:s3cret",
            "status": "paused"
        }])
        .to_string(),
    )
    .unwrap();
    // A vault that cannot be opened: migration has nowhere to put the
    // password, so it must leave it alone rather than drop it on the floor.
    std::fs::write(state.join("secrets.json"), "{not json at all").unwrap();

    let port = free_port();
    let addr = format!("127.0.0.1:{}", port);
    let mut srv = spawn_server(&addr, &out, &state);
    wait_ready(&addr);
    add(&addr, serde_json::json!({ "url": "http://127.0.0.1:9/new.bin" }));
    thread::sleep(Duration::from_millis(600));

    let queue = read_queue(&state);
    assert!(
        queue.contains("s3cret"),
        "a failed migration must not lose the password: {}",
        queue
    );

    let _ = srv.kill();
}
