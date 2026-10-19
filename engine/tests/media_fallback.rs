// An unsupported media URL must still download.
//
// Reported: a URL that yt-dlp does not understand failed outright, even
// though the URL names a perfectly ordinary file. That is a statement about
// yt-dlp's extractor list, not about the URL -- the plain Range downloader
// handles it, and refusing to try it is the engine being pedantic at the
// user's expense.
//
// The line is drawn at *what* yt-dlp says. "Unsupported URL" / "is not a
// valid URL" mean the URL is not media and the direct path is the right
// answer. "Unable to extract" / "No video formats found" mean the URL *is*
// media and the extraction failed -- falling back there would save the HTML
// page, so those stay errors.
//
// An explicit --force-media / --yt-dlp is a promise, not a guess: no
// fallback, because the user asked for the backend by name.

use std::fs;
use std::io::{Read, Write};
use std::net::TcpListener;
use std::os::unix::fs::PermissionsExt;
use std::path::{Path, PathBuf};
use std::process::Command;
use std::sync::atomic::{AtomicU64, Ordering};
use std::thread;

const IDM: &str = env!("CARGO_BIN_EXE_idm");
const PAYLOAD: &str = "DIRECT-PAYLOAD-0123456789";

fn unique_dir(tag: &str) -> PathBuf {
    static C: AtomicU64 = AtomicU64::new(0);
    let n = C.fetch_add(1, Ordering::SeqCst);
    let d = std::env::temp_dir().join(format!("idm_mfall_{}_{}_{}", tag, std::process::id(), n));
    fs::create_dir_all(&d).unwrap();
    d
}

/// A stub yt-dlp that refuses every URL with `message`, the way the real one
/// does for a site it has no extractor for.
fn make_refusing_stub(dir: &Path, message: &str) -> PathBuf {
    let stub = dir.join("yt-dlp");
    let script = format!(
        "#!/usr/bin/env bash\n\
         echo 'ERROR: {msg}' >&2\n\
         exit 1\n",
        msg = message
    );
    fs::write(&stub, script).unwrap();
    let mut perm = fs::metadata(&stub).unwrap().permissions();
    perm.set_mode(0o755);
    fs::set_permissions(&stub, perm).unwrap();
    stub
}

/// A one-shot HTTP origin that answers every request with PAYLOAD.
///
/// The direct path probes first (HEAD / Range 0-0) and then downloads, so the
/// server serves a handful of connections; `Accept-Ranges: none` keeps it a
/// single-connection transfer, which is all this test needs.
fn start_origin(payload: &'static str) -> String {
    let listener = TcpListener::bind("127.0.0.1:0").unwrap();
    let addr = listener.local_addr().unwrap();
    thread::spawn(move || {
        for _ in 0..8 {
            let Ok((mut s, _)) = listener.accept() else {
                break;
            };
            let mut buf = [0u8; 4096];
            let _ = s.read(&mut buf);
            let head = format!(
                "HTTP/1.1 200 OK\r\nContent-Length: {}\r\n\
                 Accept-Ranges: none\r\nConnection: close\r\n\r\n",
                payload.len()
            );
            let _ = s.write_all(head.as_bytes());
            let _ = s.write_all(payload.as_bytes());
            let _ = s.flush();
        }
    });
    format!("http://{}/video.m3u8", addr)
}

#[test]
fn an_unsupported_media_url_falls_back_to_the_direct_downloader() {
    let dir = unique_dir("fallback");
    let stub = make_refusing_stub(&dir, "Unsupported URL: https://example.com/x");
    let url = start_origin(PAYLOAD);
    let out_file = dir.join("out.bin");

    let out = Command::new(IDM)
        .arg("--yt-dlp-path")
        .arg(&stub)
        .arg("-o")
        .arg(&out_file)
        .arg(&url)
        .output()
        .unwrap();

    assert!(
        out.status.success(),
        "the direct downloader should have saved it; stderr: {}",
        String::from_utf8_lossy(&out.stderr)
    );
    let got = fs::read(&out_file).expect("fallback must produce the file");
    assert_eq!(String::from_utf8_lossy(&got), PAYLOAD);
}

#[test]
fn force_media_does_not_fall_back() {
    // Asking for the media backend by name is a promise: a URL it cannot
    // handle is an error the user needs to see, not a silent switch.
    let dir = unique_dir("forced");
    let stub = make_refusing_stub(&dir, "Unsupported URL: https://example.com/x");
    let url = start_origin(PAYLOAD);
    let out_file = dir.join("out.bin");

    let out = Command::new(IDM)
        .arg("--yt-dlp-path")
        .arg(&stub)
        .arg("--force-media")
        .arg("-o")
        .arg(&out_file)
        .arg(&url)
        .output()
        .unwrap();

    assert!(!out.status.success(), "an explicit media request must not fall back");
    assert!(
        !out_file.exists(),
        "no file must be produced when --force-media fails"
    );
    let err = String::from_utf8_lossy(&out.stderr).to_lowercase();
    assert!(err.contains("unsupported"), "the reason must be visible: {}", err);
}

#[test]
fn an_extraction_failure_does_not_fall_back() {
    // "Unable to extract" means the URL *is* media and the extractor broke.
    // Downloading it plainly would save the HTML page under a media name.
    let dir = unique_dir("extract");
    let stub = make_refusing_stub(&dir, "Unable to extract video data");
    let url = start_origin(PAYLOAD);
    let out_file = dir.join("out.bin");

    let out = Command::new(IDM)
        .arg("--yt-dlp-path")
        .arg(&stub)
        .arg("-o")
        .arg(&out_file)
        .arg(&url)
        .output()
        .unwrap();

    assert!(
        !out.status.success(),
        "an extraction failure must stay an error; stderr: {}",
        String::from_utf8_lossy(&out.stderr)
    );
    assert!(
        !out_file.exists(),
        "the HTML page must not be saved under a media name"
    );
}