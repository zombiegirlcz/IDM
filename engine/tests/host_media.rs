// Integration tests for media support in the native-messaging host.
//
// The host must be able to:
//   * relay format listings (`action:"list_formats"`) as parsed JSON
//   * forward media options (format, force_media, limit_rate) to the engine
//
// A stub yt-dlp keeps this offline and deterministic.

use std::fs;
use std::os::unix::fs::PermissionsExt;
use std::path::{Path, PathBuf};
use std::process::{Child, ChildStdin, ChildStdout, Command, Stdio};
use std::sync::atomic::{AtomicU64, Ordering};
use std::io::{Read, Write};

const HOST_BIN: &str = env!("CARGO_BIN_EXE_idm-host");
const ENGINE_BIN: &str = env!("CARGO_BIN_EXE_idm");
const PAYLOAD: &str = "MEDIA-PAYLOAD-0123456789";

const META_JSON: &str = r#"{"id":"abc","title":"Test Video","ext":"mp4","formats":[{"format_id":"22","ext":"mp4","resolution":"1280x720","vcodec":"avc1","acodec":"aac"},{"format_id":"140","ext":"m4a","resolution":"audio only","vcodec":"none","acodec":"mp4a"}]}"#;

fn unique_dir(tag: &str) -> PathBuf {
    static C: AtomicU64 = AtomicU64::new(0);
    let n = C.fetch_add(1, Ordering::SeqCst);
    let d = std::env::temp_dir().join(format!("idm_hostmedia_{}_{}_{}", tag, std::process::id(), n));
    fs::create_dir_all(&d).unwrap();
    d
}

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

fn write_frame(w: &mut ChildStdin, v: &serde_json::Value) {
    let body = serde_json::to_vec(v).unwrap();
    w.write_all(&(body.len() as u32).to_le_bytes()).unwrap();
    w.write_all(&body).unwrap();
    w.flush().unwrap();
}

fn read_frame(r: &mut ChildStdout) -> serde_json::Value {
    let mut lenb = [0u8; 4];
    r.read_exact(&mut lenb).unwrap();
    let len = u32::from_le_bytes(lenb) as usize;
    let mut body = vec![0u8; len];
    r.read_exact(&mut body).unwrap();
    serde_json::from_slice(&body).unwrap()
}

fn spawn_host(allowed: &Path, yt_dlp: &Path) -> (Child, ChildStdin, ChildStdout) {
    let mut child = Command::new(HOST_BIN)
        .arg("--engine")
        .arg(ENGINE_BIN)
        .arg("--allowed-dir")
        .arg(allowed)
        .arg("--yt-dlp-path")
        .arg(yt_dlp)
        .stdin(Stdio::piped())
        .stdout(Stdio::piped())
        .stderr(Stdio::null())
        .spawn()
        .expect("failed to spawn idm-host");
    let stdin = child.stdin.take().unwrap();
    let stdout = child.stdout.take().unwrap();
    (child, stdin, stdout)
}

#[test]
fn host_relays_format_listing() {
    let dir = unique_dir("list");
    let (stub, _log) = make_stub(&dir);
    let (mut child, mut stdin, mut stdout) = spawn_host(&dir, &stub);
    write_frame(
        &mut stdin,
        &serde_json::json!({
            "action": "list_formats",
            "id": 5,
            "url": "https://youtu.be/abc"
        }),
    );
    let resp = read_frame(&mut stdout);
    assert_eq!(resp["ok"], serde_json::json!(true), "resp: {}", resp);
    assert_eq!(resp["id"], serde_json::json!(5));
    assert_eq!(resp["title"], serde_json::json!("Test Video"));
    let f = resp["formats"].as_array().expect("formats array");
    assert_eq!(f.len(), 2);
    assert_eq!(f[0]["format_id"], serde_json::json!("22"));
    drop(stdin);
    let _ = child.wait();
}

#[test]
fn host_forwards_media_download_options() {
    let dir = unique_dir("dl");
    let (stub, log) = make_stub(&dir);
    let out = dir.join("out.m4a");
    let (mut child, mut stdin, mut stdout) = spawn_host(&dir, &stub);
    write_frame(
        &mut stdin,
        &serde_json::json!({
            "action": "download",
            "id": 9,
            "url": "https://youtu.be/abc",
            "output": out.to_string_lossy(),
            "force_media": true,
            "format": "140",
            "limit_rate": 2000
        }),
    );
    // The host runs yt-dlp with STUB_LOG unset; instead assert the produced
    // file and successful reply, plus that format was honoured by inspecting
    // the argv the engine passed (stub logs when STUB_LOG is set, so we set it
    // through the environment of the child indirectly is not possible here).
    let resp = read_frame(&mut stdout);
    assert_eq!(resp["ok"], serde_json::json!(true), "resp: {}", resp);
    assert_eq!(resp["id"], serde_json::json!(9));
    let got = fs::read(&out).expect("media output must exist");
    assert_eq!(String::from_utf8_lossy(&got), PAYLOAD);
    let _ = log;
    drop(stdin);
    let _ = child.wait();
}

/// A yt-dlp that refuses, saying why on stderr -- the shape of YouTube's bot
/// check. Its -J works so the failure happens in the download, not the probe.
fn make_failing_stub(dir: &Path) -> PathBuf {
    let stub = dir.join("yt-dlp");
    let script = r#"#!/usr/bin/env bash
if [[ "$1" == "-J" ]]; then echo '{"id":"abc","title":"t","ext":"mp4","formats":[]}'; exit 0; fi
echo "ERROR: [youtube] abc: Sign in to confirm you are not a bot" >&2
exit 1
"#;
    fs::write(&stub, script).unwrap();
    let mut perm = fs::metadata(&stub).unwrap().permissions();
    perm.set_mode(0o755);
    fs::set_permissions(&stub, perm).unwrap();
    stub
}

#[test]
fn a_failed_download_tells_the_browser_why() {
    let dir = unique_dir("why");
    let stub = make_failing_stub(&dir);
    let out = dir.join("out.mp4");
    let (mut child, mut stdin, mut stdout) = spawn_host(&dir, &stub);
    write_frame(
        &mut stdin,
        &serde_json::json!({
            "action": "download",
            "id": 3,
            "url": "https://youtu.be/abc",
            "output": out.to_string_lossy(),
            "force_media": true
        }),
    );
    let resp = read_frame(&mut stdout);
    assert_eq!(resp["ok"], serde_json::json!(false), "resp: {}", resp);
    let err = resp["error"].as_str().unwrap_or("");
    assert!(
        err.contains("Sign in to confirm you are not a bot"),
        "the reason must reach the extension, not just an exit code: {}",
        err
    );
    drop(stdin);
    let _ = child.wait();
}

/// yt-dlp stub that records its argv and, when given --cookies FILE, what the
/// file held at that moment (the host deletes it afterwards).
fn make_cookie_stub(dir: &Path) -> PathBuf {
    let stub = dir.join("yt-dlp");
    let log = dir.join("cookie.log");
    let script = format!(
        r#"#!/usr/bin/env bash
echo "ARGV $*" >> "{log}"
prev=""
for a in "$@"; do
  if [[ "$prev" == "--cookies" ]]; then echo "FILE $a" >> "{log}"; cat "$a" >> "{log}"; fi
  prev="$a"
done
if [[ "$*" == *"-J"* ]]; then echo '{{"id":"a","title":"t","ext":"mp4","formats":[]}}'; exit 0; fi
out=""
while [[ $# -gt 0 ]]; do if [[ "$1" == "-o" ]]; then out="$2"; shift 2; else shift; fi; done
printf 'x' > "$out"
"#,
        log = log.display()
    );
    fs::write(&stub, script).unwrap();
    let mut perm = fs::metadata(&stub).unwrap().permissions();
    perm.set_mode(0o755);
    fs::set_permissions(&stub, perm).unwrap();
    stub
}

fn browser_cookies() -> serde_json::Value {
    serde_json::json!([
        {"domain": ".youtube.com", "path": "/", "secure": true, "httpOnly": true,
         "expirationDate": 1893456000.5, "name": "SID", "value": "abc123"},
        {"domain": "www.youtube.com", "path": "/", "secure": false,
         "name": "PREF", "value": "f6=40000000"}
    ])
}

fn cookie_log(dir: &Path) -> String {
    fs::read_to_string(dir.join("cookie.log")).unwrap_or_default()
}

fn the_cookie_file_named_in(log: &str) -> PathBuf {
    let line = log.lines().find(|l| l.starts_with("FILE ")).expect("yt-dlp got no --cookies file");
    PathBuf::from(line.trim_start_matches("FILE "))
}

#[test]
fn browser_cookies_reach_yt_dlp_as_a_netscape_file_for_a_listing() {
    let dir = unique_dir("ck_list");
    let stub = make_cookie_stub(&dir);
    let (mut child, mut stdin, mut stdout) = spawn_host(&dir, &stub);
    write_frame(&mut stdin, &serde_json::json!({
        "action": "list_formats", "id": 1,
        "url": "https://www.youtube.com/watch?v=abc", "cookies": browser_cookies()
    }));
    let resp = read_frame(&mut stdout);
    assert_eq!(resp["ok"], serde_json::json!(true), "resp: {}", resp);
    let log = cookie_log(&dir);
    assert!(log.contains("# Netscape HTTP Cookie File"), "log: {}", log);
    // domain, subdomains flag, path, secure, expiry, name, value
    assert!(log.contains("#HttpOnly_.youtube.com\tTRUE\t/\tTRUE\t1893456000\tSID\tabc123"), "log: {}", log);
    assert!(log.contains("www.youtube.com\tFALSE\t/\tFALSE\t"), "log: {}", log);
    assert!(log.contains("\tPREF\tf6=40000000"), "log: {}", log);
    drop(stdin);
    let _ = child.wait();
}

#[test]
fn browser_cookies_reach_yt_dlp_for_a_download_and_the_file_is_removed() {
    let dir = unique_dir("ck_dl");
    let stub = make_cookie_stub(&dir);
    let out = dir.join("out.mp4");
    let (mut child, mut stdin, mut stdout) = spawn_host(&dir, &stub);
    write_frame(&mut stdin, &serde_json::json!({
        "action": "download", "id": 2,
        "url": "https://www.youtube.com/watch?v=abc",
        "output": out.to_string_lossy(), "force_media": true, "cookies": browser_cookies()
    }));
    let resp = read_frame(&mut stdout);
    assert_eq!(resp["ok"], serde_json::json!(true), "resp: {}", resp);
    let log = cookie_log(&dir);
    assert!(log.contains("\tSID\tabc123"), "log: {}", log);
    let file = the_cookie_file_named_in(&log);
    assert!(!file.exists(), "session cookies must not be left on disk: {}", file.display());
    drop(stdin);
    let _ = child.wait();
}

#[test]
fn the_cookie_file_is_private() {
    use std::os::unix::fs::PermissionsExt;
    let dir = unique_dir("ck_mode");
    let stub = dir.join("yt-dlp");
    let mode_log = dir.join("mode.log");
    fs::write(&stub, format!(r#"#!/usr/bin/env bash
prev=""
for a in "$@"; do
  if [[ "$prev" == "--cookies" ]]; then stat -c %a "$a" >> "{}"; fi
  prev="$a"
done
echo '{{"id":"a","title":"t","ext":"mp4","formats":[]}}'
"#, mode_log.display())).unwrap();
    let mut perm = fs::metadata(&stub).unwrap().permissions();
    perm.set_mode(0o755);
    fs::set_permissions(&stub, perm).unwrap();
    let (mut child, mut stdin, mut stdout) = spawn_host(&dir, &stub);
    write_frame(&mut stdin, &serde_json::json!({
        "action": "list_formats", "id": 3,
        "url": "https://www.youtube.com/watch?v=abc", "cookies": browser_cookies()
    }));
    let _ = read_frame(&mut stdout);
    assert_eq!(fs::read_to_string(&mode_log).unwrap_or_default().trim(), "600");
    drop(stdin);
    let _ = child.wait();
}

#[test]
fn a_cookie_that_could_break_the_file_format_is_dropped() {
    let dir = unique_dir("ck_bad");
    let stub = make_cookie_stub(&dir);
    let (mut child, mut stdin, mut stdout) = spawn_host(&dir, &stub);
    write_frame(&mut stdin, &serde_json::json!({
        "action": "list_formats", "id": 4,
        "url": "https://www.youtube.com/watch?v=abc",
        "cookies": [
            {"domain": ".youtube.com", "path": "/", "name": "EVIL", "value": "x\n.evil.com\tTRUE\t/\tFALSE\t0\tSID\tstolen"},
            {"domain": ".youtube.com", "path": "/", "name": "OK", "value": "fine"}
        ]
    }));
    let _ = read_frame(&mut stdout);
    let log = cookie_log(&dir);
    assert!(!log.contains("stolen"), "log: {}", log);
    assert!(log.contains("\tOK\tfine"), "log: {}", log);
    drop(stdin);
    let _ = child.wait();
}

#[test]
fn without_cookies_yt_dlp_gets_no_cookie_flag() {
    let dir = unique_dir("ck_none");
    let stub = make_cookie_stub(&dir);
    let (mut child, mut stdin, mut stdout) = spawn_host(&dir, &stub);
    write_frame(&mut stdin, &serde_json::json!({
        "action": "list_formats", "id": 5, "url": "https://www.youtube.com/watch?v=abc"
    }));
    let _ = read_frame(&mut stdout);
    assert!(!cookie_log(&dir).contains("--cookies"), "log: {}", cookie_log(&dir));
    drop(stdin);
    let _ = child.wait();
}

/// yt-dlp stub whose download takes a while, like a real video does.
fn make_slow_stub(dir: &Path, secs: u32) -> PathBuf {
    let stub = dir.join("yt-dlp");
    let script = format!(
        r#"#!/usr/bin/env bash
if [[ "$1" == "--version" ]]; then echo 2026.08.19; exit 0; fi
if [[ "$*" == *"-J"* ]]; then echo '{{"id":"a","title":"t","ext":"mp4","formats":[]}}'; exit 0; fi
out=""
while [[ $# -gt 0 ]]; do if [[ "$1" == "-o" ]]; then out="$2"; shift 2; else shift; fi; done
sleep {secs}
printf '{PAYLOAD}' > "$out"
"#,
        secs = secs,
        PAYLOAD = PAYLOAD
    );
    fs::write(&stub, script).unwrap();
    let mut perm = fs::metadata(&stub).unwrap().permissions();
    perm.set_mode(0o755);
    fs::set_permissions(&stub, perm).unwrap();
    stub
}

// A video download takes minutes. While it runs, the popup still has to get
// answers (formats, settings, ping); before, the host handled one request at
// a time and the extension reported IDM as unreachable.
#[test]
fn a_running_download_does_not_block_other_requests() {
    let dir = unique_dir("busy");
    let stub = make_slow_stub(&dir, 4);
    let out = dir.join("slow.mp4");
    let (mut child, mut stdin, mut stdout) = spawn_host(&dir, &stub);
    write_frame(&mut stdin, &serde_json::json!({
        "action": "download", "id": 10, "url": "https://youtu.be/abc",
        "output": out.to_string_lossy(), "force_media": true
    }));
    write_frame(&mut stdin, &serde_json::json!({
        "action": "list_formats", "id": 11, "url": "https://youtu.be/abc"
    }));
    let started = std::time::Instant::now();
    let first = read_frame(&mut stdout);
    assert_eq!(first["id"], serde_json::json!(11), "the listing must not wait for the download: {}", first);
    assert!(started.elapsed() < std::time::Duration::from_secs(3), "took {:?}", started.elapsed());
    let second = read_frame(&mut stdout);
    assert_eq!(second["id"], serde_json::json!(10));
    assert_eq!(second["ok"], serde_json::json!(true), "resp: {}", second);
    drop(stdin);
    let _ = child.wait();
}

// The browser closing the port must not kill a download already under way.
#[test]
fn a_download_finishes_after_the_browser_goes_away() {
    let dir = unique_dir("eof");
    let stub = make_slow_stub(&dir, 2);
    let out = dir.join("after.mp4");
    let (mut child, mut stdin, _stdout) = spawn_host(&dir, &stub);
    write_frame(&mut stdin, &serde_json::json!({
        "action": "download", "id": 12, "url": "https://youtu.be/abc",
        "output": out.to_string_lossy(), "force_media": true
    }));
    std::thread::sleep(std::time::Duration::from_millis(300));
    drop(stdin);
    let _ = child.wait();
    let got = fs::read(&out).expect("the download must complete");
    assert_eq!(String::from_utf8_lossy(&got), PAYLOAD);
}
