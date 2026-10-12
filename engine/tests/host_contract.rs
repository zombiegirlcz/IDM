// Contract tests binding the two halves of the native-messaging chain:
//   * the host must ECHO the request `id` back in its response, because
//     background.js correlates replies via a pending map keyed by `id`
//     (without the echo the watchdog always fires -> "cannot_contact_idm")
//
// Framing: [4-byte little-endian length][JSON payload] on stdin/stdout.

use std::io::{Read, Write};
use std::net::{TcpListener, TcpStream};
use std::path::{Path, PathBuf};
use std::process::{Child, ChildStdin, ChildStdout, Command, Stdio};
use std::sync::atomic::{AtomicU64, Ordering};
use std::sync::Arc;
use std::thread;

const HOST_BIN: &str = env!("CARGO_BIN_EXE_idm-host");
const ENGINE_BIN: &str = env!("CARGO_BIN_EXE_idm");

fn unique_dir(tag: &str) -> PathBuf {
    static C: AtomicU64 = AtomicU64::new(0);
    let n = C.fetch_add(1, Ordering::SeqCst);
    let d = std::env::temp_dir().join(format!("idm_contract_{}_{}_{}", tag, std::process::id(), n));
    std::fs::create_dir_all(&d).unwrap();
    d
}

fn make_data(len: usize) -> Arc<Vec<u8>> {
    let v: Vec<u8> = (0..len)
        .map(|i| ((i as u64).wrapping_mul(2654435761) >> 13) as u8)
        .collect();
    Arc::new(v)
}

// ---- minimal Range-capable HTTP server ----

struct Server {
    addr: String,
}

fn start_server(data: Arc<Vec<u8>>) -> Server {
    let listener = TcpListener::bind("127.0.0.1:0").unwrap();
    let addr = format!("http://{}", listener.local_addr().unwrap());
    thread::spawn(move || {
        for stream in listener.incoming() {
            let data = data.clone();
            if let Ok(s) = stream {
                thread::spawn(move || {
                    let _ = handle(s, data);
                });
            }
        }
    });
    Server { addr }
}

fn handle(mut s: TcpStream, data: Arc<Vec<u8>>) -> std::io::Result<()> {
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
                let r = r.split(',').next().unwrap_or("");
                let mut it = r.split('-');
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
    if let Some((a, b)) = range {
        let b = b.min(total.saturating_sub(1));
        let slice = data[a as usize..=b as usize].to_vec();
        let h = format!(
            "HTTP/1.1 206 Partial Content\r\nContent-Length: {}\r\nContent-Range: bytes {}-{}/{}\r\nAccept-Ranges: bytes\r\nConnection: close\r\n\r\n",
            slice.len(), a, b, total
        );
        s.write_all(h.as_bytes())?;
        s.write_all(&slice)?;
    } else {
        let h = format!(
            "HTTP/1.1 200 OK\r\nContent-Length: {}\r\nAccept-Ranges: bytes\r\nETag: \"e\"\r\nConnection: close\r\n\r\n",
            total
        );
        s.write_all(h.as_bytes())?;
        s.write_all(&data)?;
    }
    Ok(())
}

// ---- framing helpers ----

fn write_frame(w: &mut ChildStdin, v: &serde_json::Value) {
    let body = serde_json::to_vec(v).unwrap();
    w.write_all(&(body.len() as u32).to_le_bytes()).unwrap();
    w.write_all(&body).unwrap();
    w.flush().unwrap();
}

fn read_frame(r: &mut ChildStdout) -> serde_json::Value {
    let mut lenb = [0u8; 4];
    r.read_exact(&mut lenb).unwrap();
    let len = u32::from_le_bytes(lenb) as usize;
    let mut body = vec![0u8; len];
    r.read_exact(&mut body).unwrap();
    serde_json::from_slice(&body).unwrap()
}

fn spawn_host(allowed: &Path) -> (Child, ChildStdin, ChildStdout) {
    let mut child = Command::new(HOST_BIN)
        .arg("--engine")
        .arg(ENGINE_BIN)
        .arg("--allowed-dir")
        .arg(allowed)
        .stdin(Stdio::piped())
        .stdout(Stdio::piped())
        .stderr(Stdio::null())
        .spawn()
        .expect("failed to spawn idm-host");
    let stdin = child.stdin.take().unwrap();
    let stdout = child.stdout.take().unwrap();
    (child, stdin, stdout)
}

/// The core contract: whatever `id` the client sends must come back unchanged.
#[test]
fn host_echoes_request_id_on_ping() {
    let dir = unique_dir("ping");
    let (mut child, mut stdin, mut stdout) = spawn_host(&dir);
    write_frame(&mut stdin, &serde_json::json!({"action": "ping", "id": 42}));
    let resp = read_frame(&mut stdout);
    assert_eq!(resp["ok"], serde_json::json!(true), "ping response: {}", resp);
    assert_eq!(resp["msg"], serde_json::json!("pong"));
    assert_eq!(resp["id"], serde_json::json!(42), "host must echo request id: {}", resp);
    drop(stdin);
    let _ = child.wait();
}

#[test]
fn host_echoes_request_id_on_download() {
    let data = make_data(1_000_000);
    let srv = start_server(data.clone());
    let dir = unique_dir("dl");
    let out = dir.join("out.bin");
    let (mut child, mut stdin, mut stdout) = spawn_host(&dir);
    write_frame(
        &mut stdin,
        &serde_json::json!({
            "action": "download",
            "id": 7,
            "url": format!("{}/file.bin", srv.addr),
            "output": out.to_string_lossy(),
            "connections": 4
        }),
    );
    let resp = read_frame(&mut stdout);
    assert_eq!(resp["ok"], serde_json::json!(true), "download response: {}", resp);
    assert_eq!(resp["id"], serde_json::json!(7), "host must echo request id: {}", resp);
    drop(stdin);
    let _ = child.wait();
}

#[test]
fn host_echoes_request_id_on_error() {
    let dir = unique_dir("err");
    let (mut child, mut stdin, mut stdout) = spawn_host(&dir);
    write_frame(
        &mut stdin,
        &serde_json::json!({"action": "download", "id": 99, "url": "ftp://x/y"}),
    );
    let resp = read_frame(&mut stdout);
    assert_eq!(resp["ok"], serde_json::json!(false), "must reject: {}", resp);
    assert_eq!(resp["id"], serde_json::json!(99), "error reply must echo id: {}", resp);
    let _ = dir;
    drop(stdin);
    let _ = child.wait();
}

#[test]
fn host_omits_id_when_request_has_none() {
    let dir = unique_dir("noid");
    let (mut child, mut stdin, mut stdout) = spawn_host(&dir);
    write_frame(&mut stdin, &serde_json::json!({"action": "ping"}));
    let resp = read_frame(&mut stdout);
    assert_eq!(resp["ok"], serde_json::json!(true));
    // Backwards compatible: no id in, no id out (still fine for old callers).
    assert!(resp.get("id").is_none() || resp["id"].is_null(), "unexpected id: {}", resp);
    drop(stdin);
    let _ = child.wait();
}
