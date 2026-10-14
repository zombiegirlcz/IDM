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

/// `--aria2` on a video page used to hand the *page* URL to aria2c, which
/// dutifully saved the HTML: the aria2 branch sat in front of the media
/// detection. The two have to combine instead -- yt-dlp works out the real
/// media URL, aria2c moves the bytes -- which is what yt-dlp's own
/// `--downloader` option is for.
#[test]
fn aria2_and_the_media_backend_combine_instead_of_competing() {
    let dir = unique_dir("combo");
    let (stub, log) = make_stub(&dir);
    // A stub aria2c that writes nothing: if the engine took the plain aria2
    // branch it would "succeed" with no output file, which the assertions
    // below catch. Here it should only ever be *named* to yt-dlp.
    let aria2c = dir.join("aria2c");
    fs::write(&aria2c, "#!/usr/bin/env bash\nexit 0\n").unwrap();
    fs::set_permissions(&aria2c, fs::Permissions::from_mode(0o755)).unwrap();
    let out_file = dir.join("video.mp4");
    let out = Command::new(IDM)
        .env("STUB_LOG", &log)
        .arg("--yt-dlp")
        .arg(&stub)
        .arg("--aria2")
        .arg("--aria2-path")
        .arg(&aria2c)
        .arg("--force-media")
        .arg("-n")
        .arg("8")
        .arg("-o")
        .arg(&out_file)
        .arg("https://youtu.be/abc")
        .output()
        .unwrap();
    assert!(out.status.success(), "stderr: {}", String::from_utf8_lossy(&out.stderr));
    let got = fs::read(&out_file).expect("media output must exist");
    assert_eq!(String::from_utf8_lossy(&got), PAYLOAD);

    let argv = fs::read_to_string(&log).expect("the stub must have logged argv");
    assert!(
        argv.contains("--downloader"),
        "yt-dlp must be told to use an external downloader: {}",
        argv
    );
    assert!(argv.contains("aria2c"), "and that downloader must be aria2c: {}", argv);
    assert!(
        argv.contains(&aria2c.display().to_string()),
        "yt-dlp must be given the resolved aria2c path: {}",
        argv
    );
    // The whole point is parallel connections; -n has to reach aria2c.
    assert!(
        argv.contains("--downloader-args") && argv.contains("-x 8") || argv.contains("-x8"),
        "the connection count must reach aria2c: {}",
        argv
    );
}

/// Without --aria2, a fragmented format is still slow one fragment at a time.
/// yt-dlp can fetch several at once, and --connections is the natural number.
#[test]
fn the_connection_count_becomes_concurrent_fragments() {
    let dir = unique_dir("frag");
    let (stub, log) = make_stub(&dir);
    let out_file = dir.join("video.mp4");
    let out = Command::new(IDM)
        .env("STUB_LOG", &log)
        .arg("--yt-dlp")
        .arg(&stub)
        .arg("--force-media")
        .arg("-n")
        .arg("8")
        .arg("-o")
        .arg(&out_file)
        .arg("https://youtu.be/abc")
        .output()
        .unwrap();
    assert!(out.status.success(), "stderr: {}", String::from_utf8_lossy(&out.stderr));
    let argv = fs::read_to_string(&log).expect("the stub must have logged argv");
    assert!(
        argv.contains("--concurrent-fragments 8") || argv.contains("-N 8"),
        "8 connections must mean 8 fragments at a time: {}",
        argv
    );
}

/// A plain file with --aria2 must keep going straight to aria2c: no yt-dlp in
/// the way, no HEAD probe turning a download into a media guess.
#[test]
fn a_plain_file_with_aria2_does_not_go_near_yt_dlp() {
    let dir = unique_dir("plain");
    let (stub, log) = make_stub(&dir);
    let out = Command::new(IDM)
        .env("STUB_LOG", &log)
        .arg("--yt-dlp")
        .arg(&stub)
        .arg("--aria2")
        .arg("--aria2-path")
        .arg(dir.join("definitely-not-aria2c"))
        .arg("--ensure-aria2")
        .arg(dir.join("no-installer"))
        .arg("-o")
        .arg(dir.join("f.bin"))
        .arg("http://127.0.0.1:9/f.bin")
        .output()
        .unwrap();
    // It fails -- there is no aria2c and no installer -- and that failure is
    // the proof it went to the aria2 branch rather than to yt-dlp.
    assert!(!out.status.success(), "expected the missing-aria2c failure");
    let err = String::from_utf8_lossy(&out.stderr);
    assert!(err.contains("aria2"), "stderr should name aria2: {}", err);
    assert!(!log.exists(), "yt-dlp must not be invoked for a plain file");
}
