// `idm update` — the self-update path.
//
// The engine is a downloader, so it downloads its own release: fetch the tag
// from the release API, pull the archive, verify the published .sha256, unpack
// to a staging directory and only then swap bin/ gui/ assets/ into place. The
// previous versions are kept next door, because an update that cannot be
// undone is a trap -- "it installed itself and now it is broken" has to have
// an answer.
//
// Nothing here touches the network: IDM_UPDATE_API and IDM_UPDATE_BASE point
// the engine at a local server.

use std::io::{Read, Write};
use std::net::TcpListener;
use std::path::{Path, PathBuf};
use std::process::Command;
use std::sync::atomic::{AtomicU64, Ordering};
use std::thread;

const IDM: &str = env!("CARGO_BIN_EXE_idm");
const VERSION: &str = env!("CARGO_PKG_VERSION");

fn unique_dir(tag: &str) -> PathBuf {
    static C: AtomicU64 = AtomicU64::new(0);
    let n = C.fetch_add(1, Ordering::SeqCst);
    let d = std::env::temp_dir().join(format!("idm_upd_{}_{}_{}", tag, std::process::id(), n));
    std::fs::create_dir_all(&d).unwrap();
    d
}

/// A plausible installation: what install.sh leaves behind.
fn fake_install(version: &str) -> PathBuf {
    let dir = unique_dir("inst");
    for sub in ["bin", "gui", "assets", "state", "extension"] {
        std::fs::create_dir_all(dir.join(sub)).unwrap();
    }
    std::fs::write(dir.join("bin").join("idm"), "OLD-ENGINE").unwrap();
    std::fs::write(dir.join("bin").join("idm-host"), "OLD-HOST").unwrap();
    std::fs::write(dir.join("gui").join("idm_gui.py"), "OLD-GUI").unwrap();
    std::fs::write(dir.join("assets").join("idm.png"), "OLD-ICON").unwrap();
    std::fs::write(dir.join("extension").join("manifest.json"), "OLD-EXT").unwrap();
    // State must survive every path through this code.
    std::fs::write(dir.join("state").join("queue.json"), "[{\"id\":\"mine\"}]").unwrap();
    std::fs::write(dir.join("state").join("secrets.json"), "{\"v\":1}").unwrap();
    std::fs::write(dir.join("VERSION"), format!("{version}\n")).unwrap();
    dir
}

/// The release archive, built the way release.yml builds it (flat, plus assets/).
fn fake_archive() -> (PathBuf, String) {
    fake_archive_with(true, &[])
}

/// The same archive, with or without extension/ and with extra flat files --
/// release v2.1.9 shipped a Windows zip with no extension/ at all.
fn fake_archive_with(with_extension: bool, extra: &[(&str, &str)]) -> (PathBuf, String) {
    let dir = unique_dir("arch");
    let stage = dir.join("dist");
    std::fs::create_dir_all(stage.join("assets")).unwrap();
    std::fs::write(stage.join("idm"), "NEW-ENGINE").unwrap();
    std::fs::write(stage.join("idm-host"), "NEW-HOST").unwrap();
    std::fs::write(stage.join("idm_gui.py"), "NEW-GUI").unwrap();
    std::fs::write(stage.join("assets").join("idm.png"), "NEW-ICON").unwrap();
    if with_extension {
        std::fs::create_dir_all(stage.join("extension")).unwrap();
        std::fs::write(stage.join("extension").join("manifest.json"), "NEW-EXT").unwrap();
    }
    for (name, body) in extra {
        std::fs::write(stage.join(name), body).unwrap();
    }
    let tar = dir.join("release.tar.gz");
    let ok = Command::new("tar")
        .arg("-czf")
        .arg(&tar)
        .arg("-C")
        .arg(&stage)
        .arg(".")
        .status()
        .expect("tar")
        .success();
    assert!(ok, "tar failed");
    let sha = sha256_hex(&std::fs::read(&tar).unwrap());
    (tar, sha)
}

fn sha256_hex(bytes: &[u8]) -> String {
    use sha2::{Digest, Sha256};
    let mut h = Sha256::new();
    h.update(bytes);
    h.finalize().iter().map(|b| format!("{b:02x}")).collect()
}

/// Serves the release API and the archive. `sha` is what the .sha256 file will
/// claim, so a test can publish a wrong one on purpose.
fn serve(tag: &str, archive: &Path, sha: &str) -> String {
    let listener = TcpListener::bind("127.0.0.1:0").unwrap();
    let addr = format!("http://{}", listener.local_addr().unwrap());
    let tag = tag.to_string();
    let body = std::fs::read(archive).unwrap();
    let sha = sha.to_string();
    thread::spawn(move || {
        for mut s in listener.incoming().flatten() {
            let mut buf = [0u8; 2048];
            let n = s.read(&mut buf).unwrap_or(0);
            let req = String::from_utf8_lossy(&buf[..n]).to_string();
            let path = req.split_whitespace().nth(1).unwrap_or("/").to_string();
            let (ctype, payload): (&str, Vec<u8>) = if path.contains("releases/latest") {
                (
                    "application/json",
                    format!("{{\"tag_name\":\"{tag}\",\"name\":\"IDM {tag}\"}}").into_bytes(),
                )
            } else if path.ends_with(".sha256") {
                (
                    "text/plain",
                    format!("{sha}  idm.tar.gz\n").into_bytes(),
                )
            } else {
                ("application/octet-stream", body.clone())
            };
            let head = format!(
                "HTTP/1.1 200 OK\r\nContent-Type: {}\r\nContent-Length: {}\r\nConnection: close\r\n\r\n",
                ctype,
                payload.len()
            );
            let _ = s.write_all(head.as_bytes());
            let _ = s.write_all(&payload);
        }
    });
    addr
}

fn run(dir: &Path, args: &[&str], api: &str, base: &str) -> (bool, String) {
    let out = Command::new(IDM)
        .args(args)
        .env("IDM_DIR", dir)
        .env("IDM_UPDATE_API", format!("{api}/repos/x/y/releases/latest"))
        .env("IDM_UPDATE_BASE", base)
        .output()
        .expect("spawn idm");
    let mut s = String::from_utf8_lossy(&out.stdout).to_string();
    s.push_str(&String::from_utf8_lossy(&out.stderr));
    (out.status.success(), s)
}

#[test]
fn check_reports_a_newer_release_without_touching_anything() {
    let dir = fake_install(VERSION);
    let (archive, sha) = fake_archive();
    let addr = serve("v9.9.9", &archive, &sha);
    let (ok, out) = run(&dir, &["update", "--check"], &addr, &addr);
    assert!(ok, "check must succeed: {out}");
    assert!(out.contains("9.9.9"), "must name the new version: {out:?}");
    assert_eq!(
        std::fs::read_to_string(dir.join("bin").join("idm")).unwrap(),
        "OLD-ENGINE",
        "--check must not install anything",
    );
}

#[test]
fn check_says_so_when_there_is_nothing_newer() {
    let dir = fake_install(VERSION);
    let (archive, sha) = fake_archive();
    let addr = serve(&format!("v{VERSION}"), &archive, &sha);
    let (ok, out) = run(&dir, &["update", "--check"], &addr, &addr);
    assert!(ok, "check must succeed: {out}");
    assert!(
        out.to_lowercase().contains("aktuální") || out.to_lowercase().contains("up to date"),
        "must say it is current: {out:?}",
    );
}

#[test]
fn check_caches_its_answer_so_the_cli_can_tell_you_without_a_request() {
    // A download must not pay for a release lookup. The notice the CLI prints
    // comes from this cache, written by whoever checked last.
    let dir = fake_install(VERSION);
    let (archive, sha) = fake_archive();
    let addr = serve("v9.9.9", &archive, &sha);
    let (ok, _) = run(&dir, &["update", "--check"], &addr, &addr);
    assert!(ok);
    let cache = std::fs::read_to_string(dir.join("state").join("update.json"))
        .expect("the check must leave a cache in state/");
    assert!(cache.contains("9.9.9"), "cache must hold the tag: {cache}");
}

#[test]
fn update_swaps_the_program_and_keeps_the_previous_version() {
    let dir = fake_install(VERSION);
    let (archive, sha) = fake_archive();
    let addr = serve("v9.9.9", &archive, &sha);
    let (ok, out) = run(&dir, &["update"], &addr, &addr);
    assert!(ok, "update must succeed: {out}");

    assert_eq!(std::fs::read_to_string(dir.join("bin").join("idm")).unwrap(), "NEW-ENGINE");
    assert_eq!(std::fs::read_to_string(dir.join("bin").join("idm-host")).unwrap(), "NEW-HOST");
    assert_eq!(std::fs::read_to_string(dir.join("gui").join("idm_gui.py")).unwrap(), "NEW-GUI");
    assert_eq!(
        std::fs::read_to_string(dir.join("assets").join("idm.png")).unwrap(),
        "NEW-ICON",
    );
    assert_eq!(
        std::fs::read_to_string(dir.join("extension").join("manifest.json")).unwrap(),
        "NEW-EXT",
        "the extension must be updated by the same swap",
    );
    assert_eq!(std::fs::read_to_string(dir.join("VERSION")).unwrap().trim(), "v9.9.9");

    // The installed binary has to stay executable, or the next launch is dead.
    #[cfg(unix)]
    {
        use std::os::unix::fs::PermissionsExt;
        let mode = std::fs::metadata(dir.join("bin").join("idm")).unwrap().permissions().mode();
        assert_ne!(mode & 0o111, 0, "the new engine must be executable (mode {mode:o})");
    }

    // The .old trees are cleaned up after a successful swap -- they only
    // clutter the install directory and an empty-looking extension.old/
    // confuses Chrome. Rollback is intentionally not available after update
    // completes; reinstall the previous release if needed.
    for name in ["bin", "gui", "assets", "extension"] {
        assert!(
            !dir.join(format!("{name}.old")).exists(),
            "{name}.old must be removed after successful update",
        );
    }
    assert!(!dir.join("VERSION.old").exists(), "VERSION.old must be removed");
    // And the staging directory must not be left lying around.
    assert!(!dir.join(".update").exists(), "staging must be cleaned up");
}

#[test]
fn update_never_touches_the_queue_or_the_vault() {
    let dir = fake_install(VERSION);
    let (archive, sha) = fake_archive();
    let addr = serve("v9.9.9", &archive, &sha);
    let (ok, out) = run(&dir, &["update"], &addr, &addr);
    assert!(ok, "{out}");
    assert_eq!(
        std::fs::read_to_string(dir.join("state").join("queue.json")).unwrap(),
        "[{\"id\":\"mine\"}]",
    );
    assert_eq!(
        std::fs::read_to_string(dir.join("state").join("secrets.json")).unwrap(),
        "{\"v\":1}",
    );
}

#[test]
fn a_wrong_checksum_leaves_the_installation_alone() {
    // The one thing standing between a tampered archive and the user's
    // machine. It must fail BEFORE anything is swapped, not half way.
    let dir = fake_install(VERSION);
    let (archive, _) = fake_archive();
    let addr = serve("v9.9.9", &archive, &"0".repeat(64));
    let (ok, out) = run(&dir, &["update"], &addr, &addr);
    assert!(!ok, "a bad checksum must fail the update: {out}");
    assert!(
        out.to_lowercase().contains("sou\u{10d}et") || out.to_lowercase().contains("checksum"),
        "the error must say what failed: {out:?}",
    );
    assert_eq!(
        std::fs::read_to_string(dir.join("bin").join("idm")).unwrap(),
        "OLD-ENGINE",
        "nothing may be swapped when the archive is not trusted",
    );
    assert!(!dir.join("bin.old").exists(), "and no rollback copy either");
}

#[test]
fn rollback_puts_the_previous_version_back() {
    // .old trees are no longer left behind by a successful update, so set
    // them up manually to exercise rollback in isolation: live tree holds the
    // current (buggy) version, .old holds the previous (good) version.
    let dir = fake_install(VERSION);
    let (_archive, _sha) = fake_archive();
    let addr = serve("v9.9.9", &std::path::Path::new("/dev/null"), "unused");

    // Live tree: the "new" version we want to roll back from.
    std::fs::write(dir.join("bin").join("idm"), "NEW-ENGINE").unwrap();
    std::fs::write(dir.join("gui").join("idm_gui.py"), "NEW-GUI").unwrap();
    std::fs::write(dir.join("assets").join("idm.png"), "NEW-ICON").unwrap();
    std::fs::write(dir.join("extension").join("manifest.json"), "NEW-EXT").unwrap();
    std::fs::write(dir.join("VERSION"), "v9.9.9\n").unwrap();

    // .old trees: the previous version to roll back to.
    for name in ["bin", "gui", "assets", "extension"] {
        std::fs::create_dir_all(dir.join(format!("{name}.old"))).unwrap();
    }
    std::fs::write(dir.join("bin.old").join("idm"), "OLD-ENGINE").unwrap();
    std::fs::write(dir.join("gui.old").join("idm_gui.py"), "OLD-GUI").unwrap();
    std::fs::write(dir.join("assets.old").join("idm.png"), "OLD-ICON").unwrap();
    std::fs::write(dir.join("extension.old").join("manifest.json"), "OLD-EXT").unwrap();
    std::fs::write(dir.join("VERSION.old"), format!("{VERSION}\n")).unwrap();

    let (ok, out) = run(&dir, &["update", "--rollback"], &addr, &addr);
    assert!(ok, "rollback must succeed: {out}");
    assert_eq!(std::fs::read_to_string(dir.join("bin").join("idm")).unwrap(), "OLD-ENGINE");
    assert_eq!(std::fs::read_to_string(dir.join("gui").join("idm_gui.py")).unwrap(), "OLD-GUI");
    assert_eq!(
        std::fs::read_to_string(dir.join("extension").join("manifest.json")).unwrap(),
        "OLD-EXT",
    );
    assert_eq!(std::fs::read_to_string(dir.join("VERSION")).unwrap().trim(), VERSION);
}

#[test]
fn rollback_with_nothing_to_roll_back_to_is_an_honest_error() {
    let dir = fake_install(VERSION);
    let (archive, sha) = fake_archive();
    let addr = serve("v9.9.9", &archive, &sha);
    let (ok, out) = run(&dir, &["update", "--rollback"], &addr, &addr);
    assert!(!ok, "there is no previous version: {out}");
    assert_eq!(std::fs::read_to_string(dir.join("bin").join("idm")).unwrap(), "OLD-ENGINE");
}

#[test]
fn a_progress_file_reports_percent_and_speed_for_the_window() {
    // The GUI shows an install dialog with a progress bar, so the numbers have
    // to come from somewhere structured. Polling a file keeps the window and
    // the updater independent processes.
    let dir = fake_install(VERSION);
    let (archive, sha) = fake_archive();
    let addr = serve("v9.9.9", &archive, &sha);
    let prog = dir.join("state").join("progress.json");
    let (ok, out) = run(
        &dir,
        &["update", "--progress-file", prog.to_str().unwrap()],
        &addr,
        &addr,
    );
    assert!(ok, "{out}");
    let text = std::fs::read_to_string(&prog).expect("progress file must exist");
    for key in ["phase", "percent", "speed_bps", "done"] {
        assert!(text.contains(key), "progress must report {key}: {text}");
    }
    assert!(text.contains("\"done\":true"), "the last write must be final: {text}");
}

#[test]
fn a_plain_download_mentions_a_newer_version_without_asking_the_network() {
    // The CLI must not pay a release lookup per download, and it must not go
    // quiet about an update either. The notice comes from the cache that
    // `--check` (or the window) wrote.
    let dir = fake_install(VERSION);
    let (archive, sha) = fake_archive();
    let addr = serve("v9.9.9", &archive, &sha);
    let now = std::time::SystemTime::now()
        .duration_since(std::time::UNIX_EPOCH)
        .unwrap()
        .as_secs();
    std::fs::write(
        dir.join("state").join("update.json"),
        format!("{{\"checked_at\":{now},\"installed\":\"{VERSION}\",\"latest\":\"v9.9.9\",\"newer\":true}}"),
    )
    .unwrap();

    let out = dir.join("f.bin");
    let res = Command::new(IDM)
        .arg(format!("{addr}/file.bin"))
        .arg("-o")
        .arg(&out)
        .env("IDM_DIR", &dir)
        // No update endpoints: the notice must not need them.
        .env_remove("IDM_UPDATE_API")
        .env_remove("IDM_UPDATE_BASE")
        .output()
        .expect("spawn idm");
    let text = format!(
        "{}{}",
        String::from_utf8_lossy(&res.stdout),
        String::from_utf8_lossy(&res.stderr)
    );
    assert!(res.status.success(), "the download must still succeed: {text}");
    assert!(out.is_file(), "and write the file: {text}");
    assert!(text.contains("9.9.9"), "it must mention the new version: {text:?}");
    assert!(text.contains("idm update"), "and how to get it: {text:?}");
}

#[test]
fn a_stale_cache_says_nothing() {
    let dir = fake_install(VERSION);
    let (archive, sha) = fake_archive();
    let addr = serve("v9.9.9", &archive, &sha);
    // Checked a year ago: the answer is not worth repeating as news.
    std::fs::write(
        dir.join("state").join("update.json"),
        format!("{{\"checked_at\":1,\"installed\":\"{VERSION}\",\"latest\":\"v9.9.9\",\"newer\":true}}"),
    )
    .unwrap();
    let out = dir.join("f.bin");
    let res = Command::new(IDM)
        .arg(format!("{addr}/file.bin"))
        .arg("-o")
        .arg(&out)
        .env("IDM_DIR", &dir)
        .output()
        .expect("spawn idm");
    let text = format!(
        "{}{}",
        String::from_utf8_lossy(&res.stdout),
        String::from_utf8_lossy(&res.stderr)
    );
    assert!(res.status.success(), "{text}");
    assert!(!text.contains("9.9.9"), "a stale cache must stay quiet: {text:?}");
}

/// The cache has to describe what is installed NOW, not what was installed
/// when it was last written.
///
/// Reported from the Windows box right after installing 2.0.7 by hand: every
/// command still said "je nová verze v2.0.3". The cache in state/update.json
/// was written by a check that ran on 2.0.2, and nothing ever corrected its
/// `installed` field -- so the notice compared today's binary against a
/// version the machine no longer had.
#[test]
fn a_finished_update_stamps_the_version_it_installed() {
    let dir = fake_install(VERSION);
    let (archive, sha) = fake_archive();
    let addr = serve("v9.9.9", &archive, &sha);
    let (ok, out) = run(&dir, &["update"], &addr, &addr);
    assert!(ok, "update must succeed: {out}");

    let text = std::fs::read_to_string(dir.join("state").join("update.json"))
        .expect("an update must leave a cache behind");
    let v: serde_json::Value = serde_json::from_str(&text).expect("cache must be JSON");
    assert_eq!(
        v["installed"], "v9.9.9",
        "the cache must name the version that is now on disk: {text}",
    );
    assert_eq!(
        v["newer"], false,
        "a just-installed release cannot be newer than itself: {text}",
    );
    let checked = v["checked_at"].as_u64().unwrap_or(0);
    let now = std::time::SystemTime::now()
        .duration_since(std::time::UNIX_EPOCH)
        .unwrap()
        .as_secs();
    assert!(now.saturating_sub(checked) < 120, "the stamp must be fresh: {text}");
}

/// A check that finds nothing new is still evidence about what is installed,
/// so it stamps too -- otherwise an install done outside `idm update` leaves
/// the cache lying until somebody happens to check.
#[test]
fn a_check_that_finds_nothing_new_stamps_what_it_saw() {
    let dir = fake_install("2.0.0");
    let (archive, sha) = fake_archive();
    let addr = serve("v2.0.0", &archive, &sha);
    let (ok, out) = run(&dir, &["update", "--check"], &addr, &addr);
    assert!(ok, "{out}");

    let text = std::fs::read_to_string(dir.join("state").join("update.json")).unwrap();
    let v: serde_json::Value = serde_json::from_str(&text).unwrap();
    assert_eq!(v["installed"], "2.0.0", "{text}");
    assert_eq!(v["newer"], false, "{text}");
}

/// A stale cache is repaired by whatever runs next, not only by an update.
///
/// `idm update` and `--check` are not the only ways a version changes on disk:
/// install.sh, install.ps1 and a manual copy all write VERSION and know
/// nothing about state/update.json. The only thing that can notice is the
/// next command, so it does.
#[test]
fn a_stale_cache_is_rewritten_by_the_next_command() {
    let dir = fake_install("2.0.7");
    let now = std::time::SystemTime::now()
        .duration_since(std::time::UNIX_EPOCH)
        .unwrap()
        .as_secs();
    // What a machine that last checked on 2.0.2 still has lying around.
    std::fs::write(
        dir.join("state").join("update.json"),
        format!(
            "{{\"checked_at\":{now},\"installed\":\"2.0.2\",\"latest\":\"v2.0.3\",\"newer\":true}}"
        ),
    )
    .unwrap();

    let out_file = dir.join("f.bin");
    let res = Command::new(IDM)
        .arg("https://example.invalid/f.bin")
        .arg("-o")
        .arg(&out_file)
        .env("IDM_DIR", &dir)
        .output()
        .expect("spawn idm");
    // The download itself is expected to fail (no such host); the cache is
    // what this is about.
    let text = format!(
        "{}{}",
        String::from_utf8_lossy(&res.stdout),
        String::from_utf8_lossy(&res.stderr)
    );
    assert!(
        !text.contains("2.0.3"),
        "a repaired cache must stop announcing 2.0.3: {text:?}",
    );

    let cache = std::fs::read_to_string(dir.join("state").join("update.json")).unwrap();
    let v: serde_json::Value = serde_json::from_str(&cache).unwrap();
    assert_eq!(
        v["installed"], "2.0.7",
        "the cache must name what is installed: {cache}",
    );
    assert_eq!(v["newer"], false, "and stop claiming to be behind: {cache}");
}

// --- Windows: what an update leaves behind ----------------------------------
//
// Reproduced on a real Windows 11 box going 2.1.8 -> 2.1.9: afterwards the
// install directory held bin.old\idm.exe (the updater itself, and the window's
// server, were still running from it -- Windows will not delete a running
// exe), extension\ was EMPTY, and bin\ had lost ensure-ytdlp.ps1.

/// An archive without extension/ says nothing about the extension. Replacing
/// the installed one with an empty directory is what made Chrome refuse to
/// load it ("Manifest file is missing or unreadable").
#[test]
fn an_archive_without_an_extension_leaves_the_installed_one_alone() {
    let dir = fake_install(VERSION);
    let (archive, sha) = fake_archive_with(false, &[]);
    let addr = serve("v9.9.9", &archive, &sha);
    let (ok, out) = run(&dir, &["update"], &addr, &addr);
    assert!(ok, "update must succeed: {out}");
    assert_eq!(
        std::fs::read_to_string(dir.join("bin").join("idm")).unwrap(),
        "NEW-ENGINE",
        "the update itself must have happened",
    );
    assert_eq!(
        std::fs::read_to_string(dir.join("extension").join("manifest.json")).ok().as_deref(),
        Some("OLD-EXT"),
        "extension/ must not be swapped for an empty directory",
    );
}

/// bin/ is everything the archive ships flat for it, not a hand-kept list
/// that forgot the yt-dlp installer: without it, a video page on a machine
/// with no yt-dlp fails with "the installer script ... is missing".
#[test]
fn update_keeps_the_yt_dlp_and_aria2_installers() {
    let dir = fake_install(VERSION);
    let scripts = [
        ("ensure-ytdlp.sh", "YTDLP-SH"),
        ("ensure-ytdlp.ps1", "YTDLP-PS1"),
        ("ensure-aria2.sh", "ARIA2-SH"),
        ("ensure-aria2.ps1", "ARIA2-PS1"),
    ];
    let (archive, sha) = fake_archive_with(true, &scripts);
    let addr = serve("v9.9.9", &archive, &sha);
    let (ok, out) = run(&dir, &["update"], &addr, &addr);
    assert!(ok, "update must succeed: {out}");
    for (name, body) in scripts {
        assert_eq!(
            std::fs::read_to_string(dir.join("bin").join(name)).ok().as_deref(),
            Some(body),
            "bin/{name} must come from the archive",
        );
    }
}

/// A directory whose entries cannot be removed, standing in for a running
/// .exe on Windows. `None` when this process can delete it anyway (root),
/// because then the test would prove nothing.
#[cfg(unix)]
fn undeletable(parent: &Path) -> Option<PathBuf> {
    use std::os::unix::fs::PermissionsExt;
    let locked = parent.join("locked");
    std::fs::create_dir_all(&locked).unwrap();
    std::fs::write(locked.join("idm.exe"), "RUNNING").unwrap();
    std::fs::set_permissions(&locked, std::fs::Permissions::from_mode(0o555)).unwrap();
    if std::fs::remove_file(locked.join("idm.exe")).is_ok() {
        eprintln!("skip: this user can delete from a 0555 directory (root?)");
        std::fs::set_permissions(&locked, std::fs::Permissions::from_mode(0o755)).unwrap();
        return None;
    }
    Some(locked)
}

#[cfg(unix)]
fn unlock(dir: &Path) {
    use std::os::unix::fs::PermissionsExt;
    let Ok(walk) = std::fs::read_dir(dir) else { return };
    for e in walk.flatten() {
        let p = e.path();
        if p.is_dir() {
            let _ = std::fs::set_permissions(&p, std::fs::Permissions::from_mode(0o755));
            unlock(&p);
        }
    }
}

/// Names a user would see next to bin/ gui/ assets/ extension/ state/.
fn leftovers(dir: &Path) -> Vec<String> {
    std::fs::read_dir(dir)
        .unwrap()
        .flatten()
        .map(|e| e.file_name().to_string_lossy().to_string())
        .filter(|n| n.ends_with(".old") || n.ends_with(".new") || n.ends_with(".rollback"))
        .collect()
}

/// The previous bin/ cannot always be deleted right after the swap: on
/// Windows the updater and the window's server are running from it. It must
/// still disappear from the install directory, not linger as bin.old.
#[cfg(unix)]
#[test]
fn an_old_tree_that_cannot_be_deleted_yet_is_moved_out_of_sight() {
    let dir = fake_install(VERSION);
    let Some(_locked) = undeletable(&dir.join("bin")) else { return };
    let (archive, sha) = fake_archive();
    let addr = serve("v9.9.9", &archive, &sha);
    let (ok, out) = run(&dir, &["update"], &addr, &addr);
    let left = leftovers(&dir);
    unlock(&dir);
    assert!(ok, "update must succeed: {out}");
    assert_eq!(
        std::fs::read_to_string(dir.join("bin").join("idm")).unwrap(),
        "NEW-ENGINE",
    );
    assert!(left.is_empty(), "nothing may be left next to bin/: {left:?}");
}

/// A bin.old an earlier version could not delete must not block the next
/// update: renaming bin/ onto a non-empty bin.old fails on every platform.
#[cfg(unix)]
#[test]
fn a_stuck_old_tree_from_an_earlier_update_does_not_block_the_next_one() {
    let dir = fake_install(VERSION);
    std::fs::create_dir_all(dir.join("bin.old")).unwrap();
    let Some(_locked) = undeletable(&dir.join("bin.old")) else { return };
    let (archive, sha) = fake_archive();
    let addr = serve("v9.9.9", &archive, &sha);
    let (ok, out) = run(&dir, &["update"], &addr, &addr);
    let left = leftovers(&dir);
    unlock(&dir);
    assert!(ok, "update must succeed over a stuck bin.old: {out}");
    assert_eq!(
        std::fs::read_to_string(dir.join("bin").join("idm")).unwrap(),
        "NEW-ENGINE",
    );
    assert!(left.is_empty(), "nothing may be left next to bin/: {left:?}");
}

/// What could not be deleted during the update is deleted by the next run of
/// the engine, once the processes that held it are gone -- including stale
/// *.old trees left by versions that predate the trash.
#[test]
fn leftovers_are_swept_by_the_next_command() {
    let dir = fake_install(VERSION);
    std::fs::create_dir_all(dir.join(".trash").join("bin-1")).unwrap();
    std::fs::write(dir.join(".trash").join("bin-1").join("idm.exe"), "STALE").unwrap();
    std::fs::create_dir_all(dir.join("bin.old")).unwrap();
    std::fs::write(dir.join("bin.old").join("idm.exe"), "STALE").unwrap();
    std::fs::write(dir.join("VERSION.old"), "2.1.8\n").unwrap();

    let res = Command::new(IDM)
        .arg("--version")
        .env("IDM_DIR", &dir)
        .output()
        .expect("spawn idm");
    assert!(res.status.success());
    assert!(!dir.join(".trash").exists(), "the trash must be emptied and removed");
    assert!(!dir.join("bin.old").exists(), "a stale bin.old must be swept");
    assert!(!dir.join("VERSION.old").exists(), "and VERSION.old with it");
    // What is installed is not a leftover.
    assert_eq!(std::fs::read_to_string(dir.join("bin").join("idm")).unwrap(), "OLD-ENGINE");
    assert!(dir.join("state").join("queue.json").is_file());
}

/// An update that died half way through the swap leaves its staging
/// directory behind, and then the .old trees are the only way back
/// (`idm update --rollback`). The sweep must leave those alone.
#[test]
fn an_interrupted_swap_keeps_its_old_trees_for_rollback() {
    let dir = fake_install(VERSION);
    std::fs::create_dir_all(dir.join(".update").join("unpack")).unwrap();
    std::fs::create_dir_all(dir.join("bin.old")).unwrap();
    std::fs::write(dir.join("bin.old").join("idm"), "PREVIOUS").unwrap();

    let res = Command::new(IDM)
        .arg("--version")
        .env("IDM_DIR", &dir)
        .output()
        .expect("spawn idm");
    assert!(res.status.success());
    assert_eq!(
        std::fs::read_to_string(dir.join("bin.old").join("idm")).ok().as_deref(),
        Some("PREVIOUS"),
        "an interrupted update's rollback copy must survive the sweep",
    );
}
