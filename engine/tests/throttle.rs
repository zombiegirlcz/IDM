// Speed-limit tests.
//
// `idm --limit-rate N` must actually slow the transfer down. We serve a known
// payload and assert the wall-clock time is at least what N implies (with a
// generous margin, since the limit is enforced per segment).

use std::io::{Read, Write};
use std::net::{TcpListener, TcpStream};
use std::path::PathBuf;
use std::process::Command;
use std::sync::atomic::{AtomicU64, Ordering};
use std::sync::Arc;
use std::thread;
use std::time::{Duration, Instant};

const IDM: &str = env!("CARGO_BIN_EXE_idm");

fn unique_dir(tag: &str) -> PathBuf {
    static C: AtomicU64 = AtomicU64::new(0);
    let n = C.fetch_add(1, Ordering::SeqCst);
    let d = std::env::temp_dir().join(format!("idm_thr_{}_{}_{}", tag, std::process::id(), n));
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

#[test]
fn limit_rate_slows_the_transfer() {
    // 1.6 MB at 400 kB/s (single connection) => >= ~4s of enforced throttling.
    let data = make_data(1_600_000);
    let origin = start_origin(data.clone());
    let dir = unique_dir("slow");
    let out = dir.join("out.bin");

    let t0 = Instant::now();
    let status = Command::new(IDM)
        .arg("--limit-rate")
        .arg("400000")
        .arg("-n")
        .arg("1")
        .arg("-o")
        .arg(&out)
        .arg(format!("{}/file.bin", origin))
        .status()
        .unwrap();
    let elapsed = t0.elapsed();
    assert!(status.success(), "engine exited with {}", status);

    let got = std::fs::read(&out).unwrap();
    assert_eq!(crc32(&got), crc32(&data), "crc mismatch under throttle");

    assert!(
        elapsed >= Duration::from_millis(2500),
        "transfer finished in {:?}; --limit-rate 400000 was not enforced",
        elapsed
    );
}
