// Integration tests for the Chrome native-messaging host (`idm-host`).
//
// Protocol: stdin/stdout carry frames of [4-byte little-endian length][JSON bytes].
// The host spawns the engine binary passed via `--engine <path>`.

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
    let d = std::env::temp_dir().join(format!("idm_host_{}_{}_{}", tag, std::process::id(), n));
    std::fs::create_dir_all(&d).unwrap();
    d
}

fn crc32(data: &[u8]) -> u32 {
    let mut h = crc32fast::Hasher::new();
    h.update(data);
    h.finalize()
}

fn make_data(len: usize) -> Arc<Vec<u8>> {
    let v: Vec<u8> = (0..len)
        .map(|i| ((i as u64).wrapping_mul(2654435761) >> 13) as u8)
        .collect();
    Arc::new(v)
}

// ---- minimal Range-capable HTTP server (same shape as integration.rs) ----

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

// ---- native messaging framing helpers ----

fn write_frame(w: &mut ChildStdin, v: &serde_json::Value) {
    let body = serde_json::to_vec(v).unwrap();
    let len = body.len() as u32;
    w.write_all(&len.to_le_bytes()).unwrap();
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

#[test]
fn ping_roundtrip() {
    let dir = unique_dir("ping");
    let (mut child, mut stdin, mut stdout) = spawn_host(&dir);
    write_frame(&mut stdin, &serde_json::json!({"action": "ping"}));
    let resp = read_frame(&mut stdout);
    assert_eq!(resp["ok"], serde_json::json!(true), "ping response: {}", resp);
    assert_eq!(resp["msg"], serde_json::json!("pong"));
    drop(stdin);
    let _ = child.wait();
}

#[test]
fn download_spawns_engine_and_verifies_crc() {
    let data = make_data(2_000_000);
    let srv = start_server(data.clone());
    let dir = unique_dir("dl");
    let out = dir.join("out.bin");
    let url = format!("{}/file.bin", srv.addr);

    let (mut child, mut stdin, mut stdout) = spawn_host(&dir);
    write_frame(
        &mut stdin,
        &serde_json::json!({
            "action": "download",
            "url": url,
            "output": out.to_string_lossy(),
            "connections": 4
        }),
    );
    let resp = read_frame(&mut stdout);

    assert_eq!(resp["ok"], serde_json::json!(true), "download response: {}", resp);
    let got = std::fs::read(&out).expect("output file must exist");
    assert_eq!(got.len(), data.len(), "size mismatch");
    assert_eq!(crc32(&got), crc32(&data), "crc mismatch on disk");

    // Host must report the same size + crc in its response.
    assert_eq!(resp["size"].as_u64().unwrap(), data.len() as u64);
    let reported = resp["crc32"].as_str().unwrap();
    assert_eq!(reported, format!("{:08x}", crc32(&data)), "crc32 in response");

    drop(stdin);
    let _ = child.wait();
}
