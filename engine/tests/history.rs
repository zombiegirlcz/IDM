// Download-history tests (IDM keeps a list of completed downloads).
//
// `idm --history <FILE>` must append one JSON object per completed download,
// recording the url, the on-disk path, the size and the CRC32. We run two
// downloads and assert both records are present and correct (append, not
// overwrite).

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
    let d = std::env::temp_dir().join(format!("idm_hist_{}_{}_{}", tag, std::process::id(), n));
    std::fs::create_dir_all(&d).unwrap();
    d
}

fn make_data(seed: u64, len: usize) -> Arc<Vec<u8>> {
    let v: Vec<u8> = (0..len)
        .map(|i| (((i as u64).wrapping_add(seed)).wrapping_mul(2654435761) >> 13) as u8)
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
fn history_records_every_completed_download() {
    let a = make_data(10, 300_000);
    let b = make_data(20, 700_000);
    let sa = start_origin(a.clone());
    let sb = start_origin(b.clone());

    let dir = unique_dir("log");
    let hist = dir.join("history.jsonl");

    for (origin, name) in [(&sa, "one.bin"), (&sb, "two.bin")] {
        let out = dir.join(name);
        let status = Command::new(IDM)
            .arg("--history")
            .arg(&hist)
            .arg("-n")
            .arg("2")
            .arg("-o")
            .arg(&out)
            .arg(format!("{}/{}", origin, name))
            .status()
            .unwrap();
        assert!(status.success(), "download {} failed", name);
    }

    let raw = std::fs::read_to_string(&hist).expect("history file must exist");
    let lines: Vec<&str> = raw.lines().filter(|l| !l.trim().is_empty()).collect();
    assert_eq!(lines.len(), 2, "expected 2 records, got: {}", raw);

    for (line, name, data) in [
        (lines[0], "one.bin", &a),
        (lines[1], "two.bin", &b),
    ] {
        let v: serde_json::Value = serde_json::from_str(line).expect("history line must be JSON");
        assert!(
            v["url"].as_str().unwrap_or("").ends_with(name),
            "url mismatch in {}",
            line
        );
        assert!(
            v["path"].as_str().unwrap_or("").ends_with(name),
            "path mismatch in {}",
            line
        );
        assert_eq!(v["size"].as_u64(), Some(data.len() as u64), "size in {}", line);
        assert_eq!(
            v["crc32"].as_str().unwrap_or(""),
            format!("{:08x}", crc32(data)),
            "crc in {}",
            line
        );
        assert!(v["at"].is_string(), "timestamp missing in {}", line);
    }
}
