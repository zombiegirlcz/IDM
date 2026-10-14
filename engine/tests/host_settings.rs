// `get_settings`: the only channel through which the extension can learn about
// settings.json (see
// docs/superpowers/specs/2026-10-14-extension-settings-channel-design.md).
//
// Two properties matter here. First, the host returns an explicit WHITELIST of
// five capture-relevant fields, so secrets that share the file — auth
// credentials, proxy, local paths — cannot reach a web page even if a future
// field is added without anyone thinking of this boundary. Second, the answer
// never fails: with no --settings, a missing file or broken JSON the host
// reports source "default" and ok:true, because a broken settings file must not
// silently switch capture off.
//
// Framing: [4-byte little-endian length][JSON payload] on stdin/stdout.

use std::io::{Read, Write};
use std::path::{Path, PathBuf};
use std::process::{Child, ChildStdin, ChildStdout, Command, Stdio};
use std::sync::atomic::{AtomicU64, Ordering};

const HOST_BIN: &str = env!("CARGO_BIN_EXE_idm-host");
const ENGINE_BIN: &str = env!("CARGO_BIN_EXE_idm");

fn unique_dir(tag: &str) -> PathBuf {
    static C: AtomicU64 = AtomicU64::new(0);
    let n = C.fetch_add(1, Ordering::SeqCst);
    let d = std::env::temp_dir().join(format!("idm_settings_{}_{}_{}", tag, std::process::id(), n));
    std::fs::create_dir_all(&d).unwrap();
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

fn spawn_host(allowed_dir: &Path, settings: Option<&Path>) -> (Child, ChildStdin, ChildStdout) {
    spawn_host_env(allowed_dir, settings, None)
}

fn spawn_host_env(
    allowed_dir: &Path,
    settings: Option<&Path>,
    env_settings: Option<&Path>,
) -> (Child, ChildStdin, ChildStdout) {
    let mut cmd = Command::new(HOST_BIN);
    cmd.arg("--engine").arg(ENGINE_BIN);
    cmd.arg("--allowed-dir").arg(allowed_dir);
    if let Some(s) = settings {
        cmd.arg("--settings").arg(s);
    }
    match env_settings {
        Some(p) => {
            cmd.env("IDM_SETTINGS", p);
        }
        None => {
            cmd.env_remove("IDM_SETTINGS");
        }
    }
    let mut child = cmd
        .stdin(Stdio::piped())
        .stdout(Stdio::piped())
        .stderr(Stdio::null())
        .spawn()
        .expect("failed to spawn idm-host");
    let stdin = child.stdin.take().unwrap();
    let stdout = child.stdout.take().unwrap();
    (child, stdin, stdout)
}

fn ask(allowed: &Path, settings: Option<&Path>) -> serde_json::Value {
    let (mut child, mut stdin, mut stdout) = spawn_host(allowed, settings);
    write_frame(&mut stdin, &serde_json::json!({"action": "get_settings", "id": 7}));
    let resp = read_frame(&mut stdout);
    drop(stdin);
    let _ = child.wait();
    resp
}

// A settings.json shaped like the one gui/idm_gui.py writes, secrets included.
fn full_settings() -> serde_json::Value {
    serde_json::json!({
        "general": {
            "launch_on_startup": true,
            "force_keys": "Ctrl+Shift",
            "prevent_keys": "Alt",
            "browsers": ["/usr/bin/chromium"]
        },
        "file_types": {
            "auto": ["zip", "mp4"],
            "exclude_sites": ["*.example.com"],
            "exclude_addresses": ["*/ads/*"]
        },
        "connection": {"max_connections": 12, "exceptions": []},
        "save_to": {"default_dir": "/home/secret/Downloads", "temp_dir": "/tmp/secret"},
        "proxy": {"http": "http://proxy.local:3128"},
        "auth": {"user": "admin", "password": "hunter2"}
    })
}

#[test]
fn returns_the_capture_relevant_fields_from_the_file() {
    let dir = unique_dir("read");
    let path = dir.join("settings.json");
    std::fs::write(&path, serde_json::to_vec_pretty(&full_settings()).unwrap()).unwrap();

    let resp = ask(&dir, Some(&path));
    assert_eq!(resp["ok"], serde_json::json!(true), "{}", resp);
    assert_eq!(resp["id"], serde_json::json!(7), "the id must be echoed: {}", resp);
    assert_eq!(resp["source"], serde_json::json!("file"), "{}", resp);

    let s = &resp["settings"];
    assert_eq!(s["file_types"]["auto"], serde_json::json!(["zip", "mp4"]));
    assert_eq!(s["file_types"]["exclude_sites"], serde_json::json!(["*.example.com"]));
    assert_eq!(s["file_types"]["exclude_addresses"], serde_json::json!(["*/ads/*"]));
    assert_eq!(s["general"]["force_keys"], serde_json::json!("Ctrl+Shift"));
    assert_eq!(s["general"]["prevent_keys"], serde_json::json!("Alt"));
    assert_eq!(s["connection"]["max_connections"], serde_json::json!(12));
}

#[test]
fn never_leaks_credentials_paths_or_unrelated_fields() {
    let dir = unique_dir("leak");
    let path = dir.join("settings.json");
    std::fs::write(&path, serde_json::to_vec(&full_settings()).unwrap()).unwrap();

    let resp = ask(&dir, Some(&path));
    let whole = resp.to_string();
    for secret in ["hunter2", "admin", "proxy.local", "/home/secret", "/tmp/secret", "chromium"] {
        assert!(
            !whole.contains(secret),
            "{} must not reach the browser, got: {}",
            secret,
            whole
        );
    }

    // Whitelist, not blacklist: only the three sections, with only known keys.
    let s = resp["settings"].as_object().expect("settings object");
    let mut sections: Vec<&str> = s.keys().map(|k| k.as_str()).collect();
    sections.sort();
    assert_eq!(sections, ["connection", "file_types", "general"]);

    let mut general: Vec<&str> = s["general"].as_object().unwrap().keys().map(|k| k.as_str()).collect();
    general.sort();
    assert_eq!(general, ["force_keys", "prevent_keys"]);

    let mut conn: Vec<&str> = s["connection"].as_object().unwrap().keys().map(|k| k.as_str()).collect();
    conn.sort();
    assert_eq!(conn, ["max_connections"]);

    let mut ft: Vec<&str> = s["file_types"].as_object().unwrap().keys().map(|k| k.as_str()).collect();
    ft.sort();
    assert_eq!(ft, ["auto", "exclude_addresses", "exclude_sites"]);
}

#[test]
fn reports_default_when_the_flag_is_absent() {
    let dir = unique_dir("noflag");
    let resp = ask(&dir, None);
    assert_eq!(resp["ok"], serde_json::json!(true), "{}", resp);
    assert_eq!(resp["source"], serde_json::json!("default"), "{}", resp);
    assert_eq!(resp["settings"], serde_json::Value::Null, "{}", resp);
}

#[test]
fn reports_default_when_the_file_is_missing() {
    let dir = unique_dir("missing");
    let resp = ask(&dir, Some(&dir.join("nope.json")));
    assert_eq!(resp["ok"], serde_json::json!(true), "{}", resp);
    assert_eq!(resp["source"], serde_json::json!("default"), "{}", resp);
    assert_eq!(resp["settings"], serde_json::Value::Null, "{}", resp);
}

#[test]
fn reports_default_when_the_file_is_broken() {
    let dir = unique_dir("broken");
    let path = dir.join("settings.json");
    std::fs::write(&path, b"{not json at all").unwrap();
    let resp = ask(&dir, Some(&path));
    assert_eq!(
        resp["ok"],
        serde_json::json!(true),
        "a broken file must not fail the call: {}",
        resp
    );
    assert_eq!(resp["source"], serde_json::json!("default"), "{}", resp);
    assert_eq!(resp["settings"], serde_json::Value::Null, "{}", resp);
}

#[test]
fn a_field_of_the_wrong_type_is_dropped_without_taking_the_rest_down() {
    let dir = unique_dir("types");
    let path = dir.join("settings.json");
    std::fs::write(
        &path,
        serde_json::to_vec(&serde_json::json!({
            "file_types": {"auto": "zip", "exclude_sites": ["a.com"]},
            "general": {"force_keys": 42, "prevent_keys": "Alt"},
            "connection": {"max_connections": "eight"}
        }))
        .unwrap(),
    )
    .unwrap();

    let resp = ask(&dir, Some(&path));
    assert_eq!(resp["ok"], serde_json::json!(true), "{}", resp);
    assert_eq!(resp["source"], serde_json::json!("file"), "{}", resp);
    let s = &resp["settings"];
    // Dropped fields are simply absent; the extension fills them from its own
    // defaults (normalizeCaptureSettings in extension/settings.js).
    assert!(s["file_types"].get("auto").is_none(), "{}", resp);
    assert_eq!(s["file_types"]["exclude_sites"], serde_json::json!(["a.com"]));
    assert!(s["general"].get("force_keys").is_none(), "{}", resp);
    assert_eq!(s["general"]["prevent_keys"], serde_json::json!("Alt"));
    assert!(s["connection"].get("max_connections").is_none(), "{}", resp);
}

fn ask_env(allowed: &Path, settings: Option<&Path>, env: Option<&Path>) -> serde_json::Value {
    let (mut child, mut stdin, mut stdout) = spawn_host_env(allowed, settings, env);
    write_frame(&mut stdin, &serde_json::json!({"action": "get_settings"}));
    let resp = read_frame(&mut stdout);
    drop(stdin);
    let _ = child.wait();
    resp
}

// Windows browsers spawn the host with no arguments and there is no wrapper to
// add --settings, exactly as with --allowed-dir / IDM_ALLOWED_DIR.
#[test]
fn falls_back_to_the_idm_settings_variable() {
    let dir = unique_dir("env");
    let path = dir.join("settings.json");
    std::fs::write(&path, serde_json::to_vec(&full_settings()).unwrap()).unwrap();

    let resp = ask_env(&dir, None, Some(&path));
    assert_eq!(resp["source"], serde_json::json!("file"), "{}", resp);
    assert_eq!(resp["settings"]["connection"]["max_connections"], serde_json::json!(12));
}

#[test]
fn the_flag_wins_over_the_variable() {
    let dir = unique_dir("both");
    let from_flag = dir.join("flag.json");
    let from_env = dir.join("env.json");
    std::fs::write(
        &from_flag,
        serde_json::to_vec(&serde_json::json!({"connection": {"max_connections": 3}})).unwrap(),
    )
    .unwrap();
    std::fs::write(
        &from_env,
        serde_json::to_vec(&serde_json::json!({"connection": {"max_connections": 99}})).unwrap(),
    )
    .unwrap();

    let resp = ask_env(&dir, Some(&from_flag), Some(&from_env));
    assert_eq!(resp["settings"]["connection"]["max_connections"], serde_json::json!(3), "{}", resp);
}

#[test]
fn an_empty_variable_is_treated_as_unset() {
    let dir = unique_dir("empty");
    let (mut child, mut stdin, mut stdout) = {
        let mut cmd = Command::new(HOST_BIN);
        cmd.arg("--engine").arg(ENGINE_BIN);
        cmd.arg("--allowed-dir").arg(&dir);
        cmd.env("IDM_SETTINGS", "");
        let mut c = cmd
            .stdin(Stdio::piped())
            .stdout(Stdio::piped())
            .stderr(Stdio::null())
            .spawn()
            .expect("failed to spawn idm-host");
        let i = c.stdin.take().unwrap();
        let o = c.stdout.take().unwrap();
        (c, i, o)
    };
    write_frame(&mut stdin, &serde_json::json!({"action": "get_settings"}));
    let resp = read_frame(&mut stdout);
    drop(stdin);
    let _ = child.wait();
    assert_eq!(resp["source"], serde_json::json!("default"), "{}", resp);
}
