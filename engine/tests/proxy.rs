// Proxy support tests.
//
// IDM can route downloads through a proxy. We test that `--proxy` is actually
// used by downloading through a minimal HTTP forward proxy that we run
// ourselves: if the engine ignored --proxy, the request would go straight to
// the origin and the proxy would never see it.

use std::io::{Read, Write};
use std::net::{TcpListener, TcpStream};
use std::path::PathBuf;
use std::process::Command;
use std::sync::atomic::{AtomicBool, AtomicU64, Ordering};
use std::sync::Arc;
use std::thread;

const IDM: &str = env!("CARGO_BIN_EXE_idm");

fn unique_dir(tag: &str) -> PathBuf {
    static C: AtomicU64 = AtomicU64::new(0);
    let n = C.fetch_add(1, Ordering::SeqCst);
    let d = std::env::temp_dir().join(format!("idm_proxy_{}_{}_{}", tag, std::process::id(), n));
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

/// Minimal Range-capable origin server.
fn start_origin(data: Arc<Vec<u8>>) -> String {
    let listener = TcpListener::bind("127.0.0.1:0").unwrap();
    let addr = format!("http://{}", listener.local_addr().unwrap());
    thread::spawn(move || {
        for stream in listener.incoming() {
            let data = data.clone();
            if let Ok(s) = stream {
                thread::spawn(move || {
                    let _ = origin_handle(s, data);
                });
            }
        }
    });
    addr
}

fn origin_handle(mut s: TcpStream, data: Arc<Vec<u8>>) -> std::io::Result<()> {
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

/// Minimal HTTP forward proxy: reads an absolute-URI request, connects to the
/// target, rewrites the request line to origin-form and pipes the response.
/// `seen` flips to true when at least one request passes through.
fn start_proxy(seen: Arc<AtomicBool>) -> String {
    let listener = TcpListener::bind("127.0.0.1:0").unwrap();
    let addr = format!("http://{}", listener.local_addr().unwrap());
    thread::spawn(move || {
        for stream in listener.incoming() {
            let seen = seen.clone();
            if let Ok(s) = stream {
                thread::spawn(move || {
                    let _ = proxy_handle(s, seen);
                });
            }
        }
    });
    addr
}

fn proxy_handle(mut s: TcpStream, seen: Arc<AtomicBool>) -> std::io::Result<()> {
    let mut buf = Vec::new();
    let mut tmp = [0u8; 4096];
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
    let head_end = buf.windows(4).position(|w| w == b"\r\n\r\n").unwrap() + 4;
    let head = String::from_utf8_lossy(&buf[..head_end]).to_string();
    let mut lines = head.lines();
    let request_line = lines.next().unwrap_or("").to_string();
    let mut parts = request_line.split_whitespace();
    let method = parts.next().unwrap_or("GET").to_string();
    let target = parts.next().unwrap_or("").to_string();
    let version = parts.next().unwrap_or("HTTP/1.1").to_string();

    // Absolute URI: http://host:port/path
    let rest = match target.strip_prefix("http://") {
        Some(r) => r,
        None => return Ok(()),
    };
    let (authority, path) = match rest.find('/') {
        Some(i) => (&rest[..i], &rest[i..]),
        None => (rest, "/"),
    };
    let authority = if authority.contains(':') {
        authority.to_string()
    } else {
        format!("{}:80", authority)
    };

    seen.store(true, Ordering::SeqCst);

    let mut up = TcpStream::connect(&authority)?;
    // Rewrite to origin-form; drop proxy-specific hop-by-hop headers.
    let mut out = format!("{} {} {}\r\n", method, path, version);
    for l in lines {
        let ll = l.to_ascii_lowercase();
        if ll.starts_with("proxy-connection:") || ll.starts_with("proxy-authorization:") {
            continue;
        }
        out.push_str(l);
        out.push_str("\r\n");
    }
    out.push_str("\r\n");
    up.write_all(out.as_bytes())?;
    up.flush()?;

    // Pipe the response back.
    let mut resp = Vec::new();
    up.read_to_end(&mut resp)?;
    s.write_all(&resp)?;
    s.flush()?;
    Ok(())
}

#[test]
fn download_through_http_proxy() {
    let data = make_data(1_500_000);
    let origin = start_origin(data.clone());
    let seen = Arc::new(AtomicBool::new(false));
    let proxy = start_proxy(seen.clone());

    let dir = unique_dir("dl");
    let out = dir.join("out.bin");

    let status = Command::new(IDM)
        .arg("--proxy")
        .arg(&proxy)
        .arg("-n")
        .arg("4")
        .arg("-o")
        .arg(&out)
        .arg(format!("{}/file.bin", origin))
        .status()
        .unwrap();
    assert!(status.success(), "engine exited with {}", status);

    let got = std::fs::read(&out).unwrap();
    assert_eq!(got.len(), data.len(), "size mismatch");
    assert_eq!(crc32(&got), crc32(&data), "crc mismatch through proxy");
    assert!(
        seen.load(Ordering::SeqCst),
        "the proxy must have been used; otherwise --proxy is ignored"
    );
}
