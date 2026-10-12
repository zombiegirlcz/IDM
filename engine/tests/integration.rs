// Integration tests for the idm-engine binary against a local HTTP server.
// Covers: multi-connection Range, no-Range fallback, kill+resume, and
// retry/backoff when the server drops a connection mid-body.

use std::io::{Read, Write};
use std::net::{TcpListener, TcpStream};
use std::path::PathBuf;
use std::process::{Command, Stdio};
use std::sync::atomic::{AtomicU64, AtomicUsize, Ordering};
use std::sync::Arc;
use std::thread;
use std::time::Duration;

const BIN: &str = env!("CARGO_BIN_EXE_idm");

fn unique_dir(tag: &str) -> PathBuf {
    static C: AtomicU64 = AtomicU64::new(0);
    let n = C.fetch_add(1, Ordering::SeqCst);
    let d = std::env::temp_dir().join(format!("idm_it_{}_{}_{}", tag, std::process::id(), n));
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

#[derive(Clone, Copy)]
struct Cfg {
    support_range: bool,
    throttle: Option<(usize, u64)>,
    /// 1-based index of the GET request that should be cut short.
    fail_on_get: Option<usize>,
    /// How many body bytes to send before cutting the failed request.
    fail_after: usize,
}

struct Server {
    addr: String,
}

fn start_server(data: Arc<Vec<u8>>, cfg: Cfg) -> Server {
    let listener = TcpListener::bind("127.0.0.1:0").unwrap();
    let addr = format!("http://{}", listener.local_addr().unwrap());
    let gets = Arc::new(AtomicUsize::new(0));
    thread::spawn(move || {
        for stream in listener.incoming() {
            let data = data.clone();
            let gets = gets.clone();
            match stream {
                Ok(s) => {
                    thread::spawn(move || {
                        let _ = handle(s, data, cfg, gets);
                    });
                }
                Err(_) => continue,
            }
        }
    });
    Server { addr }
}

fn handle(
    mut s: TcpStream,
    data: Arc<Vec<u8>>,
    cfg: Cfg,
    gets: Arc<AtomicUsize>,
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
        if buf.len() > 64 * 1024 {
            return Ok(());
        }
    }
    let req = String::from_utf8_lossy(&buf).to_string();
    let mut lines = req.lines();
    let request_line = lines.next().unwrap_or("");
    let mut parts = request_line.split_whitespace();
    let method = parts.next().unwrap_or("GET");

    let mut has_range_hdr = false;
    let mut range: Option<(u64, u64)> = None;
    for l in lines {
        let ll = l.to_ascii_lowercase();
        if let Some(v) = ll.strip_prefix("range:") {
            has_range_hdr = true;
            let v = v.trim();
            if let Some(r) = v.strip_prefix("bytes=") {
                let r = r.split(',').next().unwrap_or("");
                let mut it = r.split('-');
                let a = it.next().unwrap_or("").trim().parse::<u64>().ok();
                let b = it.next().unwrap_or("").trim().parse::<u64>().ok();
                if let Some(a) = a {
                    let end = b.unwrap_or(data.len() as u64 - 1);
                    range = Some((a, end));
                }
            }
        }
    }

    let total = data.len() as u64;
    let etag = "\"testetag\"";
    let lastmod = "Thu, 01 Oct 2026 12:38:30 GMT";

    if method == "HEAD" {
        let h = format!(
            "HTTP/1.1 200 OK\r\nContent-Length: {}\r\nAccept-Ranges: {}\r\nETag: {}\r\nLast-Modified: {}\r\nConnection: close\r\n\r\n",
            total,
            if cfg.support_range { "bytes" } else { "none" },
            etag,
            lastmod
        );
        s.write_all(h.as_bytes())?;
        return Ok(());
    }

    let get_no = gets.fetch_add(1, Ordering::SeqCst) + 1;
    let should_fail = cfg.fail_on_get == Some(get_no);

    let use_range = cfg.support_range && has_range_hdr && range.is_some();
    if use_range {
        let (a, b) = range.unwrap();
        let b = b.min(total.saturating_sub(1));
        if a > b || a >= total {
            let h = "HTTP/1.1 416 Range Not Satisfiable\r\nContent-Length: 0\r\nConnection: close\r\n\r\n";
            s.write_all(h.as_bytes())?;
            return Ok(());
        }
        let slice = data[a as usize..=b as usize].to_vec();
        let h = format!(
            "HTTP/1.1 206 Partial Content\r\nContent-Length: {}\r\nContent-Range: bytes {}-{}/{}\r\nETag: {}\r\nLast-Modified: {}\r\nAccept-Ranges: bytes\r\nConnection: close\r\n\r\n",
            slice.len(),
            a,
            b,
            total,
            etag,
            lastmod
        );
        s.write_all(h.as_bytes())?;
        if should_fail {
            // Promise full Content-Length, but cut the body early and drop.
            let cut = cfg.fail_after.min(slice.len());
            s.write_all(&slice[..cut])?;
            s.flush()?;
            let _ = s.shutdown(std::net::Shutdown::Both);
            return Ok(());
        }
        write_body(&mut s, &slice, cfg.throttle)?;
    } else {
        let h = format!(
            "HTTP/1.1 200 OK\r\nContent-Length: {}\r\nAccept-Ranges: none\r\nETag: {}\r\nLast-Modified: {}\r\nConnection: close\r\n\r\n",
            total, etag, lastmod
        );
        s.write_all(h.as_bytes())?;
        if should_fail {
            let cut = cfg.fail_after.min(data.len());
            s.write_all(&data[..cut])?;
            s.flush()?;
            let _ = s.shutdown(std::net::Shutdown::Both);
            return Ok(());
        }
        write_body(&mut s, &data, cfg.throttle)?;
    }
    Ok(())
}

fn write_body(s: &mut TcpStream, body: &[u8], throttle: Option<(usize, u64)>) -> std::io::Result<()> {
    match throttle {
        None => s.write_all(body)?,
        Some((chunk, delay_ms)) => {
            let mut off = 0;
            while off < body.len() {
                let end = (off + chunk).min(body.len());
                s.write_all(&body[off..end])?;
                s.flush()?;
                off = end;
                thread::sleep(Duration::from_millis(delay_ms));
            }
        }
    }
    Ok(())
}

fn run_engine(out: &PathBuf, url: &str, extra: &[&str]) -> std::process::ExitStatus {
    let mut cmd = Command::new(BIN);
    cmd.arg("-n").arg("4").arg("-o").arg(out);
    for e in extra {
        cmd.arg(e);
    }
    cmd.arg(url);
    cmd.status().unwrap()
}

#[test]
fn range_support_multi_connection() {
    let data = make_data(2_000_000);
    let srv = start_server(
        data.clone(),
        Cfg { support_range: true, throttle: None, fail_on_get: None, fail_after: 0 },
    );
    let dir = unique_dir("range");
    let out = dir.join("out.bin");
    let status = run_engine(&out, &format!("{}/file.bin", srv.addr), &[]);
    assert!(status.success(), "engine exited with {}", status);
    let got = std::fs::read(&out).unwrap();
    assert_eq!(got.len(), data.len(), "size mismatch");
    assert_eq!(crc32(&got), crc32(&data), "crc mismatch");
}

#[test]
fn no_range_fallback_single_connection() {
    let data = make_data(1_500_000);
    let srv = start_server(
        data.clone(),
        Cfg { support_range: false, throttle: None, fail_on_get: None, fail_after: 0 },
    );
    let dir = unique_dir("norange");
    let out = dir.join("out.bin");
    let status = run_engine(&out, &format!("{}/file.bin", srv.addr), &[]);
    assert!(status.success(), "engine exited with {}", status);
    let got = std::fs::read(&out).unwrap();
    assert_eq!(got.len(), data.len(), "size mismatch");
    assert_eq!(crc32(&got), crc32(&data), "crc mismatch");
}

#[test]
fn resume_after_kill() {
    let data = make_data(16_000_000);
    let srv = start_server(
        data.clone(),
        Cfg {
            support_range: true,
            throttle: Some((32768, 25)),
            fail_on_get: None,
            fail_after: 0,
        },
    );
    let dir = unique_dir("resume");
    let out = dir.join("out.bin");
    let meta = dir.join("out.bin.idmmeta");
    let url = format!("{}/f.bin", srv.addr);

    let mut child = Command::new(BIN)
        .arg("-n")
        .arg("4")
        .arg("-o")
        .arg(&out)
        .arg(&url)
        .stdout(Stdio::null())
        .stderr(Stdio::null())
        .spawn()
        .unwrap();
    thread::sleep(Duration::from_millis(1500));
    child.kill().unwrap();
    let _ = child.wait();

    assert!(meta.exists(), "meta file must exist after kill (resume state)");
    let raw = std::fs::read_to_string(&meta).unwrap();
    let v: serde_json::Value = serde_json::from_str(&raw).expect("meta must be valid JSON");
    assert_eq!(v["total"].as_u64().unwrap(), data.len() as u64);

    let status = run_engine(&out, &url, &["--resume"]);
    assert!(status.success(), "resume exited with {}", status);
    let got = std::fs::read(&out).unwrap();
    assert_eq!(got.len(), data.len(), "size mismatch after resume");
    assert_eq!(crc32(&got), crc32(&data), "crc mismatch after resume");
    assert!(!meta.exists(), "meta file must be cleaned up after success");
}

/// Server drops the 2nd GET mid-body. Engine must reconnect from the last
/// written offset and still produce a byte-exact file.
#[test]
fn retry_on_connection_drop() {
    let data = make_data(4_000_000);
    let srv = start_server(
        data.clone(),
        Cfg {
            support_range: true,
            throttle: None,
            fail_on_get: Some(2),
            fail_after: 65_536,
        },
    );
    let dir = unique_dir("retry");
    let out = dir.join("out.bin");
    let status = run_engine(&out, &format!("{}/file.bin", srv.addr), &[]);
    assert!(status.success(), "engine exited with {} (expected retry)", status);
    let got = std::fs::read(&out).unwrap();
    assert_eq!(got.len(), data.len(), "size mismatch after retry");
    assert_eq!(crc32(&got), crc32(&data), "crc mismatch after retry");
}
