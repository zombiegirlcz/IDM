// Integration test: the native host must honour `category_dir` and route the
// downloaded file into the matching type subfolder (IDM-style).

use std::fs;
use std::io::{Read, Write};
use std::os::unix::fs::PermissionsExt;
use std::path::{Path, PathBuf};
use std::process::{Child, ChildStdin, ChildStdout, Command, Stdio};
use std::sync::atomic::{AtomicU64, Ordering};

const HOST_BIN: &str = env!("CARGO_BIN_EXE_idm-host");
const ENGINE_BIN: &str = env!("CARGO_BIN_EXE_idm");

fn unique_dir(tag: &str) -> PathBuf {
    static C: AtomicU64 = AtomicU64::new(0);
    let n = C.fetch_add(1, Ordering::SeqCst);
    let d = std::env::temp_dir().join(format!("idm_hostcat_{}_{}_{}", tag, std::process::id(), n));
    fs::create_dir_all(&d).unwrap();
    d
}

fn make_stub(dir: &Path) -> PathBuf {
    let stub = dir.join("yt-dlp");
    // Stub prints canned JSON for -J, otherwise writes a payload to -o.
    let mut script = String::new();
    script.push_str("#!/usr/bin/env bash\n");
    script.push_str("if [ \"$1\" = \"-J\" ]; then echo '{\"id\":\"x\",\"formats\":[]}'; exit 0; fi\n");
    script.push_str("out=\"\"\n");
    script.push_str("while [ $# -gt 0 ]; do\n");
    script.push_str("  if [ \"$1\" = \"-o\" ]; then out=\"$2\"; shift 2; else shift; fi\n");
    script.push_str("done\n");
    script.push_str("printf 'CAT-PAYLOAD' > \"$out\"\n");
    fs::write(&stub, script).unwrap();
    let mut perm = fs::metadata(&stub).unwrap().permissions();
    perm.set_mode(0o755);
    fs::set_permissions(&stub, perm).unwrap();
    stub
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
fn host_routes_into_category_dir() {
    let dir = unique_dir("cat");
    let stub = make_stub(&dir);
    let (mut child, mut stdin, mut stdout) = spawn_host(&dir, &stub);

    write_frame(
        &mut stdin,
        &serde_json::json!({
            "action": "download",
            "id": 1,
            "url": "https://example.com/movie.mp4",
            "force_media": true,
            "category_dir": dir.to_string_lossy()
        }),
    );
    let resp = read_frame(&mut stdout);
    assert_eq!(resp["ok"], serde_json::json!(true), "resp: {}", resp);

    let expected = dir.join("Video").join("movie.mp4");
    assert!(
        expected.exists(),
        "host must route movie.mp4 into Video/ (looked for {})",
        expected.display()
    );
    let got = fs::read(&expected).unwrap();
    assert_eq!(String::from_utf8_lossy(&got), "CAT-PAYLOAD");

    drop(stdin);
    let _ = child.wait();
}
