// Native-messaging host: --allowed-dir fallback via environment.
//
// On Windows, Chrome/Edge spawn a native-messaging host with NO arguments, so
// there is no way to pass `--allowed-dir` on the command line (and there is no
// shell wrapper like on Linux). The host must therefore also accept the allowed
// directory from the `IDM_ALLOWED_DIR` environment variable, which the installer
// persists for the user with `setx` and which browsers inherit.
//
// Fail-closed is preserved: with neither the flag nor the variable, the host
// still refuses to do anything (covered by host_security.rs).

use std::fs;
use std::io::{Read, Write};
use std::path::{Path, PathBuf};
use std::process::{Child, ChildStdin, ChildStdout, Command, Stdio};
use std::sync::atomic::{AtomicU64, Ordering};

const HOST_BIN: &str = env!("CARGO_BIN_EXE_idm-host");
const ENGINE_BIN: &str = env!("CARGO_BIN_EXE_idm");

fn unique_dir(tag: &str) -> PathBuf {
    static C: AtomicU64 = AtomicU64::new(0);
    let n = C.fetch_add(1, Ordering::SeqCst);
    let d = std::env::temp_dir().join(format!("idm_envdir_{}_{}_{}", tag, std::process::id(), n));
    fs::create_dir_all(&d).unwrap();
    d
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

/// Spawn the host with NO --allowed-dir; the directory comes from the env var.
fn spawn_host_env_only(allowed: &Path) -> (Child, ChildStdin, ChildStdout) {
    let mut child = Command::new(HOST_BIN)
        .arg("--engine")
        .arg(ENGINE_BIN)
        .env("IDM_ALLOWED_DIR", allowed)
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
fn host_accepts_allowed_dir_from_environment() {
    let dir = unique_dir("env");
    let (mut child, mut stdin, mut stdout) = spawn_host_env_only(&dir);

    // ping must work at all (i.e. the host came up with a usable allowed dir)
    write_frame(&mut stdin, &serde_json::json!({"action": "ping", "id": 1}));
    let pong = read_frame(&mut stdout);
    assert_eq!(pong["ok"], serde_json::json!(true), "resp: {}", pong);

    // and an output path inside that dir must be accepted
    let out = dir.join("env.bin");
    write_frame(
        &mut stdin,
        &serde_json::json!({
            "action": "download",
            "id": 2,
            "url": "http://127.0.0.1:9/never.bin",
            "output": out.to_string_lossy(),
        }),
    );
    let resp = read_frame(&mut stdout);
    // The download itself fails (nothing listens on port 9), but the path must
    // NOT be rejected as outside the allowed dir — that is the whole point.
    let err = resp["error"].as_str().unwrap_or("").to_string();
    assert!(
        !err.contains("outside allowed dir"),
        "the env-provided allowed dir must be honoured, got: {}",
        resp
    );

    drop(stdin);
    let _ = child.wait();
}