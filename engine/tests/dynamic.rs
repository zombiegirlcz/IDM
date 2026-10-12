// Dynamic segmentation tests (IDM-style adaptive splitting).
//
// IDM does not just split a file into N fixed segments: while downloading it
// watches each connection and, when one segment is much slower than the rest,
// it splits that slow segment so the fast connections are not held back.
//
// We prove the behaviour by counting Range requests. The origin deliberately
// throttles any request whose start is in the *second half* of the file, so a
// naive fixed split leaves one very slow segment. With `--dynamic` the engine
// must chop that slow segment and issue more than N range requests, while the
// bytes still come out bit-identical.

use std::io::{Read, Write};
use std::net::{TcpListener, TcpStream};
use std::path::PathBuf;
use std::process::Command;
use std::sync::atomic::{AtomicU64, Ordering};
use std::sync::{Arc, Mutex};
use std::thread;
use std::time::Duration;

const IDM: &str = env!("CARGO_BIN_EXE_idm");

fn unique_dir(tag: &str) -> PathBuf {
    static C: AtomicU64 = AtomicU64::new(0);
    let n = C.fetch_add(1, Ordering::SeqCst);
    let d = std::env::temp_dir().join(format!("idm_dyn_{}_{}_{}", tag, std::process::id(), n));
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

/// Range requests the origin saw ("start-end").
#[derive(Default)]
struct Seen {
    ranges: Mutex<Vec<(u64, u64)>>,
}

fn start_origin(data: Arc<Vec<u8>>, seen: Arc<Seen>) -> String {
    let listener = TcpListener::bind("127.0.0.1:0").unwrap();
    let addr = format!("http://{}", listener.local_addr().unwrap());
    thread::spawn(move || {
        for stream in listener.incoming() {
            let data = data.clone();
            let seen = seen.clone();
            if let Ok(s) = stream {
                thread::spawn(move || {
                    let _ = handle(s, data, seen);
                });
            }
        }
    });
    addr
}

fn handle(mut s: TcpStream, data: Arc<Vec<u8>>, seen: Arc<Seen>) -> std::io::Result<()> {
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
        seen.ranges.lock().unwrap().push((a, b));

        // Any request that *starts* in the second half is intentionally slow.
        // A fixed split leaves one such segment; a dynamic downloader splits it
        // away and ends up issuing more than N requests.
        let slow = a >= total / 2;

        let slice = data[a as usize..=b as usize].to_vec();
        let h = format!(
            "HTTP/1.1 206 Partial Content\r\nContent-Length: {}\r\nContent-Range: bytes {}-{}/{}\r\nAccept-Ranges: bytes\r\nConnection: close\r\n\r\n",
            slice.len(), a, b, total
        );
        s.write_all(h.as_bytes())?;
        if slow {
            // Dribble the body out slowly so the naive engine's second segment
            // lags far behind the first.
            let chunk = 64 * 1024;
            let mut off = 0usize;
            while off < slice.len() {
                let end = (off + chunk).min(slice.len());
                s.write_all(&slice[off..end])?;
                s.flush()?;
                off = end;
                thread::sleep(Duration::from_millis(120));
            }
        } else {
            s.write_all(&slice)?;
        }
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

const SIZE: usize = 6_000_000;
const CONNS: usize = 2;

#[test]
fn dynamic_splits_slow_segment() {
    let data = make_data(SIZE);
    let seen = Arc::new(Seen::default());
    let origin = start_origin(data.clone(), seen.clone());
    let dir = unique_dir("dyn");
    let out = dir.join("out.bin");

    let status = Command::new(IDM)
        .arg("--dynamic")
        .arg("--min-split")
        .arg("400000")
        .arg("-n")
        .arg(CONNS.to_string())
        .arg("-o")
        .arg(&out)
        .arg(format!("{}/file.bin", origin))
        .status()
        .unwrap();
    assert!(status.success(), "dynamic run exited with {}", status);

    let got = std::fs::read(&out).unwrap();
    assert_eq!(got.len(), data.len(), "size mismatch");
    assert_eq!(crc32(&got), crc32(&data), "crc mismatch after dynamic split");

    let ranges = seen.ranges.lock().unwrap().clone();
    assert!(
        ranges.len() > CONNS,
        "expected more than {} range requests (proof of splitting), saw {}: {:?}",
        CONNS,
        ranges.len(),
        ranges
    );
}

#[test]
fn static_does_not_split() {
    // Control: the same origin without --dynamic must keep the fixed split.
    let data = make_data(SIZE);
    let seen = Arc::new(Seen::default());
    let origin = start_origin(data.clone(), seen.clone());
    let dir = unique_dir("static");
    let out = dir.join("out.bin");

    let status = Command::new(IDM)
        .arg("-n")
        .arg(CONNS.to_string())
        .arg("-o")
        .arg(&out)
        .arg(format!("{}/file.bin", origin))
        .status()
        .unwrap();
    assert!(status.success(), "static run exited with {}", status);
    assert_eq!(crc32(&std::fs::read(&out).unwrap()), crc32(&data));

    let ranges = seen.ranges.lock().unwrap().clone();
    assert_eq!(
        ranges.len(),
        CONNS,
        "without --dynamic there must be exactly {} requests, saw {:?}",
        CONNS,
        ranges
    );
}
