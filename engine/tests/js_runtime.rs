// yt-dlp needs a JavaScript runtime to solve YouTube's challenges, and only
// enables deno by default. A shell has deno/node on PATH; a browser-spawned
// native host or an autostarted window does not, so the engine looks for one
// itself and names it with --js-runtimes.
//
// A stub yt-dlp logs its argv, fake runtimes are just files on a controlled
// PATH. Nothing here touches the network.

use std::fs;
use std::os::unix::fs::PermissionsExt;
use std::path::{Path, PathBuf};
use std::process::Command;
use std::sync::atomic::{AtomicU64, Ordering};

const IDM: &str = env!("CARGO_BIN_EXE_idm");

fn unique_dir(tag: &str) -> PathBuf {
    static C: AtomicU64 = AtomicU64::new(0);
    let n = C.fetch_add(1, Ordering::SeqCst);
    let d = std::env::temp_dir().join(format!("idm_jsrt_{}_{}_{}", tag, std::process::id(), n));
    fs::create_dir_all(&d).unwrap();
    d
}

fn exe(path: &Path, body: &str) {
    fs::write(path, body).unwrap();
    let mut perm = fs::metadata(path).unwrap().permissions();
    perm.set_mode(0o755);
    fs::set_permissions(path, perm).unwrap();
}

/// yt-dlp stub: answers --version, logs every other argv.
fn stub(dir: &Path, version: &str) -> (PathBuf, PathBuf) {
    let s = dir.join("yt-dlp");
    let log = dir.join("argv.log");
    exe(
        &s,
        &format!(
            r#"#!/usr/bin/env bash
if [[ "$1" == "--version" ]]; then echo {version}; exit 0; fi
echo "$*" >> "{log}"
if [[ "$*" == *"-J"* ]]; then echo '{{"id":"a","title":"t","ext":"mp4","formats":[]}}'; exit 0; fi
out=""
while [[ $# -gt 0 ]]; do if [[ "$1" == "-o" ]]; then out="$2"; shift 2; else shift; fi; done
printf 'x' > "$out"
"#,
            version = version,
            log = log.display()
        ),
    );
    (s, log)
}

/// A directory holding fake runtimes, and the PATH that finds them.
fn runtimes(dir: &Path, names: &[&str]) -> (PathBuf, String) {
    let bin = dir.join("rt");
    fs::create_dir_all(&bin).unwrap();
    for n in names {
        exe(&bin.join(n), "#!/bin/sh\n");
    }
    let path = format!("{}:/usr/bin:/bin", bin.display());
    (bin, path)
}

fn list_formats(stub: &Path, path_env: &str, home: &Path) {
    let out = Command::new(IDM)
        .env("PATH", path_env)
        .env("HOME", home)
        .arg("--yt-dlp-path")
        .arg(stub)
        .arg("--list-formats")
        .arg("https://youtu.be/abc")
        .output()
        .unwrap();
    assert!(out.status.success(), "stderr: {}", String::from_utf8_lossy(&out.stderr));
}

#[test]
fn deno_on_path_is_named_to_yt_dlp() {
    let dir = unique_dir("deno");
    let (s, log) = stub(&dir, "2026.08.19");
    let (bin, path) = runtimes(&dir, &["deno"]);
    list_formats(&s, &path, &dir);
    let argv = fs::read_to_string(&log).unwrap();
    assert!(
        argv.contains(&format!("--js-runtimes deno:{}", bin.join("deno").display())),
        "argv: {}",
        argv
    );
}

#[test]
fn deno_is_preferred_over_node() {
    let dir = unique_dir("pref");
    let (s, log) = stub(&dir, "2026.08.19");
    let (_bin, path) = runtimes(&dir, &["node", "deno"]);
    list_formats(&s, &path, &dir);
    let argv = fs::read_to_string(&log).unwrap();
    assert!(argv.contains("--js-runtimes deno:"), "argv: {}", argv);
    assert!(!argv.contains("node:"), "argv: {}", argv);
}

#[test]
fn node_is_used_when_it_is_all_there_is() {
    let dir = unique_dir("node");
    let (s, log) = stub(&dir, "2026.08.19");
    let (bin, path) = runtimes(&dir, &["node"]);
    list_formats(&s, &path, &dir);
    let argv = fs::read_to_string(&log).unwrap();
    assert!(
        argv.contains(&format!("--js-runtimes node:{}", bin.join("node").display())),
        "argv: {}",
        argv
    );
}

#[test]
fn deno_in_the_home_directory_is_found_without_path() {
    let dir = unique_dir("home");
    let (s, log) = stub(&dir, "2026.08.19");
    let home = dir.join("home");
    fs::create_dir_all(home.join(".deno/bin")).unwrap();
    exe(&home.join(".deno/bin/deno"), "#!/bin/sh\n");
    list_formats(&s, "/usr/bin:/bin", &home);
    let argv = fs::read_to_string(&log).unwrap();
    assert!(
        argv.contains(&format!("--js-runtimes deno:{}", home.join(".deno/bin/deno").display())),
        "argv: {}",
        argv
    );
}

#[test]
fn an_old_yt_dlp_is_not_given_a_flag_it_would_reject() {
    let dir = unique_dir("old");
    let (s, log) = stub(&dir, "2025.01.15");
    let (_bin, path) = runtimes(&dir, &["deno"]);
    list_formats(&s, &path, &dir);
    let argv = fs::read_to_string(&log).unwrap();
    assert!(!argv.contains("--js-runtimes"), "argv: {}", argv);
}

#[test]
fn the_download_gets_the_runtime_too() {
    let dir = unique_dir("dl");
    let (s, log) = stub(&dir, "2026.08.19");
    let (_bin, path) = runtimes(&dir, &["deno"]);
    let out = Command::new(IDM)
        .env("PATH", &path)
        .env("HOME", &dir)
        .arg("--yt-dlp-path")
        .arg(&s)
        .arg("--force-media")
        .arg("-o")
        .arg(dir.join("clip.mp4"))
        .arg("--")
        .arg("https://youtu.be/abc")
        .output()
        .unwrap();
    assert!(out.status.success(), "stderr: {}", String::from_utf8_lossy(&out.stderr));
    let argv = fs::read_to_string(&log).unwrap();
    assert!(argv.contains("--js-runtimes deno:"), "argv: {}", argv);
}

// A pip-installed yt-dlp has the runtime but not the challenge solver
// scripts (yt-dlp-ejs); without them YouTube offers only storyboards and
// every format selector fails with "Requested format is not available".
#[test]
fn the_solver_scripts_are_allowed_to_be_fetched_with_the_runtime() {
    let dir = unique_dir("ejs");
    let (s, log) = stub(&dir, "2026.08.19");
    let (_bin, path) = runtimes(&dir, &["deno"]);
    list_formats(&s, &path, &dir);
    let argv = fs::read_to_string(&log).unwrap();
    assert!(argv.contains("--remote-components ejs:github"), "argv: {}", argv);
}

#[test]
fn an_old_yt_dlp_is_not_given_remote_components_either() {
    let dir = unique_dir("ejs_old");
    let (s, log) = stub(&dir, "2025.01.15");
    let (_bin, path) = runtimes(&dir, &["deno"]);
    list_formats(&s, &path, &dir);
    let argv = fs::read_to_string(&log).unwrap();
    assert!(!argv.contains("--remote-components"), "argv: {}", argv);
}
