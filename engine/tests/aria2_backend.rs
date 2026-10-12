// aria2c backend tests.
//
// aria2c is a mature, battle-tested downloader, so the engine can hand a
// download over to it instead of using its own Range code (`--aria2`). These
// tests prove two things without touching the network:
//
//   * `--aria2` really delegates to aria2c and produces bit-identical bytes
//   * the options we promise (connections, resume, limit, proxy, headers) are
//     actually passed on the aria2c command line
//
// The second is checked with a stub aria2c that logs its argv and writes a
// payload, so it stays offline and deterministic.

use std::fs;
use std::io::{Read, Write};
use std::net::{TcpListener, TcpStream};
use std::os::unix::fs::PermissionsExt;
use std::path::{Path, PathBuf};
use std::process::Command;
use std::sync::atomic::{AtomicU64, Ordering};
use std::sync::Arc;
use std::thread;

const IDM: &str = env!("CARGO_BIN_EXE_idm");

fn unique_dir(tag: &str) -> PathBuf {
    static C: AtomicU64 = AtomicU64::new(0);
    let n = C.fetch_add(1, Ordering::SeqCst);
    let d = std::env::temp_dir().join(format!("idm_aria2_{}_{}_{}", tag, std::process::id(), n));
    fs::create_dir_all(&d).unwrap();
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

fn aria2_available() -> bool {
    Command::new("aria2c")
        .arg("--version")
        .output()
        .map(|o| o.status.success())
        .unwrap_or(false)
}

/// A stub aria2c: logs its argv, then writes a fixed payload to the -o path
/// inside the -d directory. Keeps the option-forwarding test offline.
fn make_stub(dir: &Path, payload: &str) -> (PathBuf, PathBuf) {
    let stub = dir.join("aria2c-stub");
    let log = dir.join("aria2-argv.log");
    let script = format!(
        r#"#!/usr/bin/env bash
if [ -n "${{STUB_LOG:-}}" ]; then printf '%s\n' "$*" >> "$STUB_LOG"; fi
d=""; o=""
while [ $# -gt 0 ]; do
  case "$1" in
    -d) d="$2"; shift 2;;
    -o) o="$2"; shift 2;;
    *) shift;;
  esac
done
[ -n "$d" ] && mkdir -p "$d"
printf '{payload}' > "$d/$o"
exit 0
"#,
        payload = payload
    );
    fs::write(&stub, script).unwrap();
    let mut perm = fs::metadata(&stub).unwrap().permissions();
    perm.set_mode(0o755);
    fs::set_permissions(&stub, perm).unwrap();
    (stub, log)
}

#[test]
fn aria2_backend_downloads_real_file() {
    if !aria2_available() {
        eprintln!("skipping: aria2c not installed");
        return;
    }
    let data = make_data(2_000_000);
    let origin = start_origin(data.clone());
    let dir = unique_dir("real");
    let out = dir.join("file.bin");

    let status = Command::new(IDM)
        .arg("--aria2")
        .arg("-n")
        .arg("4")
        .arg("-o")
        .arg(&out)
        .arg(format!("{}/file.bin", origin))
        .status()
        .unwrap();
    assert!(status.success(), "engine exited with {}", status);

    let got = fs::read(&out).unwrap();
    assert_eq!(got.len(), data.len(), "size mismatch via aria2");
    assert_eq!(crc32(&got), crc32(&data), "crc mismatch via aria2");
}

#[test]
fn aria2_backend_forwards_options() {
    let dir = unique_dir("opts");
    let (stub, log) = make_stub(&dir, "ARIA2-PAYLOAD-0123456789");
    let out = dir.join("out.bin");

    let status = Command::new(IDM)
        .arg("--aria2")
        .arg("--aria2-path")
        .arg(&stub)
        .arg("-n")
        .arg("6")
        .arg("-o")
        .arg(&out)
        .arg("--limit-rate")
        .arg("123456")
        .arg("--cookie")
        .arg("a=b")
        .arg("--referer")
        .arg("https://ref.example/")
        .arg("--proxy")
        .arg("http://127.0.0.1:8080")
        .arg("https://example.com/big.bin")
        .env("STUB_LOG", &log)
        .status()
        .unwrap();
    assert!(status.success(), "engine exited with {}", status);

    let argv = fs::read_to_string(&log).expect("stub must have logged argv");
    assert!(argv.contains("-x"), "must pass -x (connections): {}", argv);
    assert!(argv.contains("6"), "must pass the connection count: {}", argv);
    assert!(argv.contains("-c") || argv.contains("--continue"), "must pass continue: {}", argv);
    assert!(argv.contains("123456"), "must forward --limit-rate: {}", argv);
    assert!(argv.contains("a=b"), "must forward the cookie: {}", argv);
    assert!(argv.contains("ref.example"), "must forward the referer: {}", argv);
    assert!(argv.contains("8080"), "must forward the proxy: {}", argv);

    let got = fs::read(&out).unwrap();
    assert_eq!(String::from_utf8_lossy(&got), "ARIA2-PAYLOAD-0123456789");
}