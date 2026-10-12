// Integration tests for the media (yt-dlp) backend of the engine.
//
// The real yt-dlp is never required: a stub script is generated per test that
// prints deterministic `-J` metadata, writes a payload for downloads, and logs
// its argv so we can assert flag passthrough (format, limit-rate, cookie,
// referer). Nothing here touches the network.

use std::fs;
use std::os::unix::fs::PermissionsExt;
use std::path::{Path, PathBuf};
use std::process::Command;
use std::sync::atomic::{AtomicU64, Ordering};

const IDM: &str = env!("CARGO_BIN_EXE_idm");
const PAYLOAD: &str = "MEDIA-PAYLOAD-0123456789";

fn unique_dir(tag: &str) -> PathBuf {
    static C: AtomicU64 = AtomicU64::new(0);
    let n = C.fetch_add(1, Ordering::SeqCst);
    let d = std::env::temp_dir().join(format!("idm_media_{}_{}_{}", tag, std::process::id(), n));
    fs::create_dir_all(&d).unwrap();
    d
}

const META_JSON: &str = r#"{"id":"abc","title":"Test Video","ext":"mp4","formats":[{"format_id":"22","ext":"mp4","resolution":"1280x720","vcodec":"avc1","acodec":"aac","filesize":1234,"format_note":"720p"},{"format_id":"140","ext":"m4a","resolution":"audio only","vcodec":"none","acodec":"mp4a"}]}"#;

/// Write a stub yt-dlp; returns (stub path, argv log path).
fn make_stub(dir: &Path) -> (PathBuf, PathBuf) {
    let stub = dir.join("yt-dlp");
    let log = dir.join("argv.log");
    let script = format!(
        r#"#!/usr/bin/env bash
if [[ "$1" == "-J" ]]; then
  cat <<'JSON'
{META}
JSON
  exit 0
fi
if [[ -n "${{STUB_LOG:-}}" ]]; then echo "$*" >> "$STUB_LOG"; fi
out=""
while [[ $# -gt 0 ]]; do
  if [[ "$1" == "-o" ]]; then out="$2"; shift 2; else shift; fi
done
printf '{PAYLOAD}' > "$out"
"#,
        META = META_JSON,
        PAYLOAD = PAYLOAD
    );
    fs::write(&stub, script).unwrap();
    let mut perm = fs::metadata(&stub).unwrap().permissions();
    perm.set_mode(0o755);
    fs::set_permissions(&stub, perm).unwrap();
    (stub, log)
}

#[test]
fn list_formats_returns_summary_json() {
    let dir = unique_dir("list");
    let (stub, _log) = make_stub(&dir);
    let out = Command::new(IDM)
        .arg("--yt-dlp")
        .arg(&stub)
        .arg("--list-formats")
        .arg("https://youtu.be/abc")
        .output()
        .unwrap();
    assert!(out.status.success(), "stderr: {}", String::from_utf8_lossy(&out.stderr));
    let v: serde_json::Value = serde_json::from_slice(&out.stdout).expect("summary must be JSON");
    assert_eq!(v["title"], "Test Video");
    let f = v["formats"].as_array().unwrap();
    assert_eq!(f.len(), 2);
    assert_eq!(f[0]["format_id"], "22");
    assert_eq!(f[0]["kind"], "video+audio");
    assert_eq!(f[1]["format_id"], "140");
    assert_eq!(f[1]["kind"], "audio");
}

#[test]
fn media_download_passes_format_and_auth_flags() {
    let dir = unique_dir("dl");
    let (stub, log) = make_stub(&dir);
    let out_file = dir.join("out.m4a");
    let out = Command::new(IDM)
        .env("STUB_LOG", &log)
        .arg("--yt-dlp")
        .arg(&stub)
        .arg("--force-media")
        .arg("--format")
        .arg("140")
        .arg("--limit-rate")
        .arg("1000")
        .arg("--cookie")
        .arg("a=b")
        .arg("--referer")
        .arg("https://ref/")
        .arg("-o")
        .arg(&out_file)
        .arg("https://youtu.be/abc")
        .output()
        .unwrap();
    assert!(out.status.success(), "stderr: {}", String::from_utf8_lossy(&out.stderr));

    let got = fs::read(&out_file).expect("media output must exist");
    assert_eq!(String::from_utf8_lossy(&got), PAYLOAD);

    let argv = fs::read_to_string(&log).expect("stub must have logged argv");
    assert!(argv.contains("-f 140"), "format must be passed: {}", argv);
    assert!(argv.contains("--limit-rate 1000"), "limit-rate must be passed: {}", argv);
    assert!(argv.contains("Cookie: a=b"), "cookie must be passed: {}", argv);
    assert!(argv.contains("--referer https://ref/"), "referer must be passed: {}", argv);
}

#[test]
fn auto_detects_media_url_without_force_flag() {
    let dir = unique_dir("auto");
    let (stub, log) = make_stub(&dir);
    let out_file = dir.join("auto.mp4");
    let out = Command::new(IDM)
        .env("STUB_LOG", &log)
        .arg("--yt-dlp")
        .arg(&stub)
        .arg("-o")
        .arg(&out_file)
        .arg("https://www.youtube.com/watch?v=abc")
        .output()
        .unwrap();
    assert!(out.status.success(), "stderr: {}", String::from_utf8_lossy(&out.stderr));
    let got = fs::read(&out_file).expect("media output must exist");
    assert_eq!(String::from_utf8_lossy(&got), PAYLOAD);
    assert!(log.exists(), "yt-dlp stub must have been invoked for a media URL");
}

#[test]
fn no_media_skips_the_backend() {
    let dir = unique_dir("nomedia");
    let (stub, log) = make_stub(&dir);
    let out = Command::new(IDM)
        .env("STUB_LOG", &log)
        .arg("--yt-dlp")
        .arg(&stub)
        .arg("--no-media")
        .arg("https://youtu.be/abc")
        .output()
        .unwrap();
    // The direct path is attempted against youtu.be, which fails here, but the
    // point is that yt-dlp was never invoked.
    assert!(!log.exists(), "--no-media must not call yt-dlp: {}", out.stderr.len());
}
