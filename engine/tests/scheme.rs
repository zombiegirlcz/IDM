// Shell-integration tests: IDM-style URL schemes.
//
// Real IDM registers the custom schemes `idmdwnlmfv9:` and `idmreg:` so that
// anything (a shell context menu, another app) can hand it a download by
// wrapping the target URL:
//
//     idmdwnlmfv9://https://example.com/file.zip
//     idmdwnlmfv9://idmreg://<opaque-trigger>     (a "wake up" ping, no download)
//
// The engine must unwrap `idmdwnlmfv9:` and download the inner http(s) URL,
// and it must treat an `idmreg:` trigger as a harmless no-op success.

use std::io::{Read, Write};
use std::net::{TcpListener, TcpStream};
use std::path::PathBuf;
use std::process::Command;
use std::sync::atomic::{AtomicU64, Ordering};
use std::sync::Arc;
use std::thread;

const IDM: &str = env!("CARGO_BIN_EXE_idm");

fn unique_dir(tag: &str) -> PathBuf {
    static C: AtomicU64 = AtomicU64::new(0);
    let n = C.fetch_add(1, Ordering::SeqCst);
    let d = std::env::temp_dir().join(format!("idm_scheme_{}_{}_{}", tag, std::process::id(), n));
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

fn start_origin(data: Arc<Vec<u8>>) -> String {
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
    addr
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

/// `idm idmdwnlmfv9://http://host/file.bin -o out` must download the inner URL.
#[test]
fn unwraps_idmdwnlmfv9_scheme() {
    let data = make_data(900_000);
    let origin = start_origin(data.clone());
    let dir = unique_dir("wrap");
    let out = dir.join("wrapped.bin");

    let wrapped = format!("idmdwnlmfv9://{}/file.bin", origin);
    let status = Command::new(IDM)
        .arg("-n")
        .arg("2")
        .arg("-o")
        .arg(&out)
        .arg(&wrapped)
        .status()
        .unwrap();
    assert!(status.success(), "engine exited with {} for {}", status, wrapped);

    let got = std::fs::read(&out).unwrap();
    assert_eq!(got.len(), data.len(), "size mismatch after scheme unwrap");
    assert_eq!(crc32(&got), crc32(&data), "crc mismatch after scheme unwrap");
}

/// A bare `idmreg:` trigger is not a download; it must succeed without writing.
#[test]
fn idmreg_trigger_is_a_noop_success() {
    let dir = unique_dir("trigger");
    let out = dir.join("should-not-exist.bin");

    let status = Command::new(IDM)
        .arg("-o")
        .arg(&out)
        .arg("idmdwnlmfv9://idmreg://abc123")
        .status()
        .unwrap();
    assert!(
        status.success(),
        "an idmreg trigger must exit 0, got {}",
        status
    );
    assert!(
        !out.exists(),
        "an idmreg trigger must not create a download file ({})",
        out.display()
    );
}