// Scheduler tests (IDM-style "naplánované stahování").
//
// `idm --start-in <SECONDS>` must wait before issuing the first request.
// We prove it by timestamping the first request the origin sees: if the engine
// ignored --start-in, that request would arrive almost immediately.

use std::io::{Read, Write};
use std::net::{TcpListener, TcpStream};
use std::path::PathBuf;
use std::process::Command;
use std::sync::atomic::{AtomicU64, Ordering};
use std::sync::{Arc, Mutex};
use std::thread;
use std::time::{Duration, Instant};

const IDM: &str = env!("CARGO_BIN_EXE_idm");

fn unique_dir(tag: &str) -> PathBuf {
    static C: AtomicU64 = AtomicU64::new(0);
    let n = C.fetch_add(1, Ordering::SeqCst);
    let d = std::env::temp_dir().join(format!("idm_sched_{}_{}_{}", tag, std::process::id(), n));
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

/// Origin server that records the Instant of the first request it sees.
fn start_origin(data: Arc<Vec<u8>>, first_seen: Arc<Mutex<Option<Instant>>>) -> String {
    let listener = TcpListener::bind("127.0.0.1:0").unwrap();
    let addr = format!("http://{}", listener.local_addr().unwrap());
    thread::spawn(move || {
        for stream in listener.incoming() {
            let data = data.clone();
            let first_seen = first_seen.clone();
            if let Ok(s) = stream {
                {
                    let mut g = first_seen.lock().unwrap();
                    if g.is_none() {
                        *g = Some(Instant::now());
                    }
                }
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
fn start_in_delays_first_request() {
    let data = make_data(600_000);
    let first_seen = Arc::new(Mutex::new(None));
    let origin = start_origin(data.clone(), first_seen.clone());

    let dir = unique_dir("wait");
    let out = dir.join("out.bin");

    let t0 = Instant::now();
    let status = Command::new(IDM)
        .arg("--start-in")
        .arg("2")
        .arg("-n")
        .arg("2")
        .arg("-o")
        .arg(&out)
        .arg(format!("{}/file.bin", origin))
        .status()
        .unwrap();
    let elapsed = t0.elapsed();
    assert!(status.success(), "engine exited with {}", status);

    let got = std::fs::read(&out).unwrap();
    assert_eq!(crc32(&got), crc32(&data), "crc mismatch after scheduled run");

    let first = first_seen.lock().unwrap().expect("origin never saw a request");
    let delay = first.duration_since(t0);
    assert!(
        delay >= Duration::from_millis(1700),
        "first request arrived after only {:?}; --start-in 2 was ignored",
        delay
    );
    assert!(
        elapsed >= Duration::from_millis(1700),
        "whole run took {:?}, too fast for a 2s schedule",
        elapsed
    );
}
