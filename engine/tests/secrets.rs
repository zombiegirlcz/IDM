//! The secret vault: step 2 of
//! docs/superpowers/specs/2026-10-14-auth-at-rest-design.md.
//!
//! Passwords stop living in STATE_DIR as plaintext. They go into
//! `secrets.json`, encrypted with ChaCha20-Poly1305 under a 32-byte key that
//! lives in the OS keyring when there is one and in `secrets.key` (0600) when
//! there is not. Everything here drives the CLI, because the engine is a
//! binary crate: `--secrets-set` reads the value from stdin and prints a
//! reference, `--secrets-get REF` prints the value back, `--secrets-del REF`
//! forgets it. The value never travels through argv.

use std::io::Write;
use std::path::PathBuf;
use std::process::{Command, Stdio};
use std::sync::atomic::{AtomicU64, Ordering};

const IDM: &str = env!("CARGO_BIN_EXE_idm");

fn unique_dir(tag: &str) -> PathBuf {
    static C: AtomicU64 = AtomicU64::new(0);
    let n = C.fetch_add(1, Ordering::SeqCst);
    let d = std::env::temp_dir().join(format!("idm_secrets_{}_{}_{}", tag, std::process::id(), n));
    std::fs::create_dir_all(&d).unwrap();
    d
}

/// Run one vault command. `stdin` is the value for --secrets-set.
fn vault(dir: &PathBuf, args: &[&str], stdin: Option<&str>) -> (bool, String, String) {
    let mut child = Command::new(IDM)
        .arg("--state-dir")
        .arg(dir)
        .args(args)
        // No keyring in CI or in a container: the file fallback is what these
        // tests exercise. A machine with a working Secret Service would
        // otherwise leave entries behind.
        .env("IDM_NO_KEYRING", "1")
        .stdin(Stdio::piped())
        .stdout(Stdio::piped())
        .stderr(Stdio::piped())
        .spawn()
        .unwrap();
    if let Some(v) = stdin {
        child.stdin.as_mut().unwrap().write_all(v.as_bytes()).unwrap();
    }
    drop(child.stdin.take());
    let out = child.wait_with_output().unwrap();
    (
        out.status.success(),
        String::from_utf8_lossy(&out.stdout).trim().to_string(),
        String::from_utf8_lossy(&out.stderr).to_string(),
    )
}

fn set(dir: &PathBuf, value: &str) -> String {
    let (ok, r, err) = vault(dir, &["--secrets-set"], Some(value));
    assert!(ok, "--secrets-set failed: {}", err);
    assert!(r.starts_with("secret:"), "a reference must be returned, got {:?}", r);
    r
}

fn get(dir: &PathBuf, r: &str) -> (bool, String) {
    let (ok, v, _err) = vault(dir, &["--secrets-get", r], None);
    (ok, v)
}

#[test]
fn a_secret_survives_a_round_trip() {
    let dir = unique_dir("round");
    let r = set(&dir, "s3cret:with:colons");
    let (ok, v) = get(&dir, &r);
    assert!(ok, "--secrets-get failed");
    assert_eq!(v, "s3cret:with:colons", "a colon in the password must survive");
}

#[test]
fn the_plaintext_is_nowhere_in_the_file() {
    let dir = unique_dir("opaque");
    let r = set(&dir, "tr0ub4dor");
    let raw = std::fs::read_to_string(dir.join("secrets.json")).expect("secrets.json");
    assert!(!raw.contains("tr0ub4dor"), "the vault stores plaintext: {}", raw);
    assert!(!raw.contains(r.trim_start_matches("secret:")), "the id leaks: {}", raw);
    let v: serde_json::Value = serde_json::from_str(&raw).unwrap();
    assert_eq!(v["v"].as_u64(), Some(1));
    assert_eq!(v["alg"].as_str(), Some("chacha20poly1305"));
    assert_eq!(v["key"].as_str(), Some("file"), "no keyring here");
    assert!(v["nonce"].as_str().unwrap_or("").len() >= 16, "a nonce is needed: {}", v);
}

#[test]
fn several_secrets_live_side_by_side() {
    let dir = unique_dir("many");
    let a = set(&dir, "first");
    let b = set(&dir, "second");
    assert_ne!(a, b, "every secret gets its own reference");
    assert_eq!(get(&dir, &a).1, "first");
    assert_eq!(get(&dir, &b).1, "second", "writing one must not lose the other");
}

#[test]
fn two_writes_do_not_reuse_the_nonce() {
    let dir = unique_dir("nonce");
    set(&dir, "first");
    let n1 = serde_json::from_str::<serde_json::Value>(
        &std::fs::read_to_string(dir.join("secrets.json")).unwrap(),
    )
    .unwrap()["nonce"]
        .as_str()
        .unwrap()
        .to_string();
    set(&dir, "second");
    let n2 = serde_json::from_str::<serde_json::Value>(
        &std::fs::read_to_string(dir.join("secrets.json")).unwrap(),
    )
    .unwrap()["nonce"]
        .as_str()
        .unwrap()
        .to_string();
    assert_ne!(n1, n2, "the whole vault is re-encrypted, so the nonce must be new");
}

#[test]
fn a_deleted_secret_is_gone() {
    let dir = unique_dir("del");
    let a = set(&dir, "first");
    let b = set(&dir, "second");
    let (ok, _, err) = vault(&dir, &["--secrets-del", &a], None);
    assert!(ok, "--secrets-del failed: {}", err);
    assert!(!get(&dir, &a).0, "a deleted secret must not resolve");
    assert_eq!(get(&dir, &b).1, "second", "deleting one must not lose the other");
}

#[test]
fn an_unknown_reference_is_an_error_not_an_empty_string() {
    let dir = unique_dir("unknown");
    set(&dir, "first");
    let (ok, v) = get(&dir, "secret:0123456789abcdef");
    assert!(!ok, "an unknown reference must fail, got {:?}", v);
    assert!(v.is_empty(), "nothing may be printed for an unknown reference");
}

#[test]
fn tampering_with_the_ciphertext_is_detected() {
    let dir = unique_dir("tamper");
    let r = set(&dir, "first");
    let path = dir.join("secrets.json");
    let mut v: serde_json::Value =
        serde_json::from_str(&std::fs::read_to_string(&path).unwrap()).unwrap();
    // Flip one base64 character of the ciphertext -- but NOT near the end.
    //
    // This used to change the second-to-last character, 'A' <-> 'B'. When the
    // ciphertext length is 2 (mod 3) the encoding ends with one '=', and the
    // character in that slot carries two bits that decoding throws away: an
    // 'A' -> 'B' flip there changes only the lowest of them, so the "tampered"
    // file decoded back to the ORIGINAL bytes and the vault unlocked exactly
    // as it should. The test passed by not testing anything, roughly one run
    // in seventy -- in a test whose whole job is to prove a forged vault is
    // refused.
    //
    // The first quartet has no padding, so every bit of it reaches the
    // plaintext. Assert the decoded content really moved, rather than trust it.
    let ct = v["ct"].as_str().unwrap().to_string();
    let mut bytes = ct.clone().into_bytes();
    assert!(bytes.len() > 8, "ciphertext too short to tamper with: {ct}");
    bytes[1] = if bytes[1] == b'A' { b'B' } else { b'A' };
    let forged = String::from_utf8(bytes).unwrap();
    assert_ne!(forged, ct, "the tamper must actually change the ciphertext");
    v["ct"] = serde_json::Value::String(forged);
    std::fs::write(&path, v.to_string()).unwrap();

    let (ok, out) = get(&dir, &r);
    assert!(!ok, "a tampered vault must fail, not return a value");
    assert!(out.is_empty(), "nothing may be printed from a tampered vault");
}

#[cfg(unix)]
#[test]
fn the_vault_and_its_key_are_not_world_readable() {
    use std::os::unix::fs::PermissionsExt;

    let dir = unique_dir("perm");
    set(&dir, "first");
    for name in ["secrets.json", "secrets.key"] {
        let p = dir.join(name);
        assert!(p.exists(), "{} must exist", name);
        let mode = std::fs::metadata(&p).unwrap().permissions().mode() & 0o777;
        assert_eq!(mode, 0o600, "{} is {:o}, must be 600", name, mode);
    }
}

#[test]
fn a_file_key_is_not_silently_accepted_for_a_keyring_vault() {
    let dir = unique_dir("downgrade");
    let r = set(&dir, "first");
    let path = dir.join("secrets.json");
    let mut v: serde_json::Value =
        serde_json::from_str(&std::fs::read_to_string(&path).unwrap()).unwrap();
    // Claim the key lives in the keyring. Reading must then go to the keyring
    // and fail, rather than fall back to the file sitting right there -- that
    // fallback would let anyone who can delete a keyring entry downgrade the
    // vault to a key they control.
    v["key"] = serde_json::Value::String("keyring".to_string());
    std::fs::write(&path, v.to_string()).unwrap();

    let (ok, out) = get(&dir, &r);
    assert!(!ok, "a keyring vault must not read the local key file");
    assert!(out.is_empty(), "nothing may be printed");
}
