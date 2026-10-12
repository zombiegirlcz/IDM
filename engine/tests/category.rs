// Auto-categorisation tests (IDM-style folder routing).
//
// `idm --category-dir <BASE>` must place the file into a subfolder chosen from
// the URL extension: .mp4 -> Video, .mp3 -> Music, .pdf -> Documents,
// .zip -> Compressed, .exe -> Programs, everything else -> Other.

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
    let d = std::env::temp_dir().join(format!("idm_cat_{}_{}_{}", tag, std::process::id(), n));
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

fn fetch(tag: &str, base: &PathBuf, name: &str, origin: &str, data: &Arc<Vec<u8>>) -> PathBuf {
    let status = Command::new(IDM)
        .arg("--category-dir")
        .arg(base)
        .arg("-n")
        .arg("2")
        .arg(format!("{}/{}", origin, name))
        .status()
        .unwrap();
    assert!(status.success(), "{} exited with {}", tag, status);
    let got = std::fs::read(name_path(base, name)).unwrap_or_else(|e| {
        panic!("{} not downloaded into expected category: {}", tag, e)
    });
    assert_eq!(crc32(&got), crc32(data), "{} crc mismatch", tag);
    name_path(base, name)
}

/// Expected on-disk path for a URL basename under a category base dir.
fn name_path(base: &PathBuf, name: &str) -> PathBuf {
    let cat = match name.rsplit('.').next().unwrap_or("") {
        "mp4" | "mkv" | "avi" | "mov" | "webm" => "Video",
        "mp3" | "m4a" | "flac" | "wav" | "ogg" => "Music",
        "pdf" | "doc" | "docx" | "txt" | "epub" => "Documents",
        "zip" | "rar" | "7z" | "tar" | "gz" => "Compressed",
        "exe" | "msi" | "deb" | "apk" | "dmg" => "Programs",
        _ => "Other",
    };
    base.join(cat).join(name)
}

#[test]
fn routes_files_into_category_subdirs() {
    let data = make_data(400_000);
    let origin = start_origin(data.clone());
    let base = unique_dir("cat");

    for name in ["movie.mp4", "song.mp3", "book.pdf", "archive.zip", "setup.exe", "data.bin"] {
        fetch(name, &base, name, &origin, &data);
    }
}
