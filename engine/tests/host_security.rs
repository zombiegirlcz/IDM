// Security / trust-boundary tests for the native-messaging host (`idm-host`).
//
// The host is a trust boundary: input from a browser extension causes it to
// spawn a process and write files. It must reject:
//   * URLs whose scheme is not http/https (ftp, file, javascript, data, ...)
//   * output paths that escape an explicitly allowed directory

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
    let d = std::env::temp_dir().join(format!("idm_sec_{}_{}_{}", tag, std::process::id(), n));
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

fn spawn_host(allowed_dir: Option<&Path>) -> (Child, ChildStdin, ChildStdout) {
    let mut cmd = Command::new(HOST_BIN);
    cmd.arg("--engine").arg(ENGINE_BIN);
    if let Some(d) = allowed_dir {
        cmd.arg("--allowed-dir").arg(d);
    }
    let mut child = cmd
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
fn rejects_non_http_urls() {
    let dir = unique_dir("url");
    let (mut child, mut stdin, mut stdout) = spawn_host(Some(&dir));
    let out = dir.join("o.bin");
    for u in [
        "ftp://example.com/x",
        "file:///etc/passwd",
        "javascript:alert(1)",
        "data:text/plain,hi",
    ] {
        write_frame(
            &mut stdin,
            &serde_json::json!({
                "action": "download",
                "url": u,
                "output": out.to_string_lossy(),
                "connections": 2
            }),
        );
        let resp = read_frame(&mut stdout);
        assert_eq!(resp["ok"], serde_json::json!(false), "url {} must be rejected: {}", u, resp);
        let err = resp["error"].as_str().unwrap_or("");
        assert!(
            err.contains("scheme") || err.contains("url"),
            "rejection must mention url/scheme, got: {}",
            err
        );
    }
    drop(stdin);
    let _ = child.wait();
}

#[test]
fn rejects_output_outside_allowed_dir() {
    let root = unique_dir("out");
    let allowed = root.join("allowed");
    std::fs::create_dir_all(&allowed).unwrap();
    let (mut child, mut stdin, mut stdout) = spawn_host(Some(&allowed));

    // One directory above `allowed`, and an absolute path outside it.
    for outside in [root.join("evil.bin"), PathBuf::from("/tmp/idm_escape.bin")] {
        write_frame(
            &mut stdin,
            &serde_json::json!({
                "action": "download",
                "url": "http://127.0.0.1:9/x",
                "output": outside.to_string_lossy(),
                "connections": 2
            }),
        );
        let resp = read_frame(&mut stdout);
        assert_eq!(
            resp["ok"],
            serde_json::json!(false),
            "outside path {} must be rejected: {}",
            outside.display(),
            resp
        );
        let err = resp["error"].as_str().unwrap_or("");
        assert!(
            err.contains("outside") || err.contains("allowed"),
            "rejection must mention allowed dir, got: {}",
            err
        );
    }
    drop(stdin);
    let _ = child.wait();
}

#[test]
fn accepts_output_inside_allowed_dir() {
    let data = make_data(1_000_000);
    let srv = start_server(data.clone());
    let root = unique_dir("ok");
    let allowed = root.join("allowed");
    std::fs::create_dir_all(&allowed).unwrap();
    let out = allowed.join("ok.bin");

    let (mut child, mut stdin, mut stdout) = spawn_host(Some(&allowed));
    write_frame(
        &mut stdin,
        &serde_json::json!({
            "action": "download",
            "url": format!("{}/file.bin", srv.addr),
            "output": out.to_string_lossy(),
            "connections": 4
        }),
    );
    let resp = read_frame(&mut stdout);
    assert_eq!(resp["ok"], serde_json::json!(true), "download response: {}", resp);
    let got = std::fs::read(&out).expect("output must exist");
    assert_eq!(got.len(), data.len(), "size mismatch");
    assert_eq!(crc32(&got), crc32(&data), "crc mismatch");
    drop(stdin);
    let _ = child.wait();
}

// ---- fail-closed: --allowed-dir is mandatory ----

fn try_write_frame(w: &mut ChildStdin, v: &serde_json::Value) -> std::io::Result<()> {
    let body = serde_json::to_vec(v).unwrap();
    w.write_all(&(body.len() as u32).to_le_bytes())?;
    w.write_all(&body)?;
    w.flush()
}

/// Without `--allowed-dir` the host must fail closed: non-zero exit and no
/// file written, so a page can never cause an unconstrained write.
#[test]
fn fails_closed_without_allowed_dir() {
    let dir = unique_dir("noallowed");
    let out = dir.join("should_not_exist.bin");
    let mut child = Command::new(HOST_BIN)
        .arg("--engine")
        .arg(ENGINE_BIN)
        .stdin(Stdio::piped())
        .stdout(Stdio::piped())
        .stderr(Stdio::null())
        .spawn()
        .expect("failed to spawn idm-host");
    {
        let mut stdin = child.stdin.take().unwrap();
        let _ = try_write_frame(
            &mut stdin,
            &serde_json::json!({
                "action": "download",
                "url": "http://127.0.0.1:9/x",
                "output": out.to_string_lossy(),
                "connections": 2
            }),
        );
    }
    let status = child.wait().unwrap();
    assert!(
        !status.success(),
        "host must fail closed (non-zero exit) without --allowed-dir, got {}",
        status
    );
    assert!(!out.exists(), "no file may be written without --allowed-dir");
}

/// `..` traversal and absolute paths outside the allowed dir must be rejected.
#[test]
fn rejects_parent_traversal() {
    let root = unique_dir("trav");
    let allowed = root.join("allowed");
    std::fs::create_dir_all(&allowed).unwrap();
    let (mut child, mut stdin, mut stdout) = spawn_host(Some(&allowed));
    for p in [
        "../escape.bin",
        "sub/../../escape.bin",
        "/etc/passwd",
        "/tmp/idm_trav_escape.bin",
    ] {
        write_frame(
            &mut stdin,
            &serde_json::json!({
                "action": "download",
                "url": "http://127.0.0.1:9/x",
                "output": p,
                "connections": 2
            }),
        );
        let resp = read_frame(&mut stdout);
        assert_eq!(resp["ok"], serde_json::json!(false), "path {} must be rejected: {}", p, resp);
    }
    drop(stdin);
    let _ = child.wait();
}

/// A symlink inside the allowed dir pointing outside it must not be usable.
#[test]
fn rejects_symlink_escape() {
    let root = unique_dir("symlink");
    let allowed = root.join("allowed");
    let outside = root.join("outside");
    std::fs::create_dir_all(&allowed).unwrap();
    std::fs::create_dir_all(&outside).unwrap();
    #[cfg(unix)]
    {
        std::os::unix::fs::symlink(&outside, allowed.join("link")).unwrap();
    }
    let (mut child, mut stdin, mut stdout) = spawn_host(Some(&allowed));
    let evil = allowed.join("link").join("evil.bin");
    write_frame(
        &mut stdin,
        &serde_json::json!({
            "action": "download",
            "url": "http://127.0.0.1:9/x",
            "output": evil.to_string_lossy(),
            "connections": 2
        }),
    );
    let resp = read_frame(&mut stdout);
    assert_eq!(
        resp["ok"],
        serde_json::json!(false),
        "symlink escape must be rejected: {}",
        resp
    );
    assert!(
        !outside.join("evil.bin").exists(),
        "nothing may be written through the symlink"
    );
    drop(stdin);
    let _ = child.wait();
}
