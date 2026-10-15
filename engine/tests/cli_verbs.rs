// The `idm` binary is the single tool the user runs: downloads, the window,
// updates and uninstall. `idm-host` deliberately stays a separate binary —
// it is the only link a real browser verifies, and native-messaging manifests
// cannot pass arguments.
//
// The verbs are dispatched BEFORE clap sees the arguments, because `url` is an
// optional positional and would happily swallow `update`. These tests pin both
// halves of that contract: the verbs work, and a URL that looks like one is
// still a URL.

use std::path::PathBuf;
use std::process::Command;
use std::sync::atomic::{AtomicU64, Ordering};

const IDM: &str = env!("CARGO_BIN_EXE_idm");

fn unique_dir(tag: &str) -> PathBuf {
    static C: AtomicU64 = AtomicU64::new(0);
    let n = C.fetch_add(1, Ordering::SeqCst);
    let d = std::env::temp_dir().join(format!("idm_verb_{}_{}_{}", tag, std::process::id(), n));
    std::fs::create_dir_all(&d).unwrap();
    d
}

fn run(args: &[&str], idm_dir: Option<&PathBuf>) -> (bool, String) {
    let mut c = Command::new(IDM);
    c.args(args);
    match idm_dir {
        Some(d) => {
            c.env("IDM_DIR", d);
        }
        None => {
            c.env_remove("IDM_DIR");
        }
    }
    let out = c.output().expect("spawn idm");
    let mut s = String::from_utf8_lossy(&out.stdout).to_string();
    s.push_str(&String::from_utf8_lossy(&out.stderr));
    (out.status.success(), s)
}

#[test]
fn version_flag_prints_the_crate_version() {
    // Until now `idm --version` was an error ("unexpected argument"), which is
    // why the window had to read VERSION out of idm_gui.py.
    let (ok, out) = run(&["--version"], None);
    assert!(ok, "idm --version must succeed, got: {out}");
    assert!(
        out.contains(env!("CARGO_PKG_VERSION")),
        "expected the crate version in {out:?}",
    );
}

#[test]
fn help_lists_the_verbs() {
    // Pre-dispatch means clap cannot generate these; if they are not written
    // into the help text by hand, they are invisible.
    let (ok, out) = run(&["--help"], None);
    assert!(ok, "idm --help must succeed");
    for verb in ["--gui", "update", "uninstall"] {
        assert!(out.contains(verb), "help must mention {verb}, got: {out}");
    }
}

#[test]
fn update_reports_the_installed_version() {
    // Cycle B does the real work; the verb must already exist and be honest.
    let (ok, out) = run(&["update"], None);
    assert!(ok, "idm update must succeed, got: {out}");
    assert!(
        out.contains(env!("CARGO_PKG_VERSION")),
        "update must report the installed version, got: {out:?}",
    );
}

#[test]
fn gui_reports_the_missing_script_instead_of_dying_silently() {
    // The old launcher wrote a log nobody reads. Running `idm --gui` from a
    // terminal must say what is wrong, with the path it looked at.
    let dir = unique_dir("gui");
    let (ok, out) = run(&["--gui"], Some(&dir));
    assert!(!ok, "a missing GUI script must be an error");
    let want = dir.join("gui").join("idm_gui.py");
    assert!(
        out.contains(&want.to_string_lossy().to_string()),
        "the error must name {want:?}, got: {out:?}",
    );
}

#[test]
fn uninstall_dry_run_lists_what_it_would_remove() {
    // Removing an install is irreversible, so the plan has to be inspectable.
    let dir = unique_dir("uninst");
    std::fs::create_dir_all(dir.join("bin")).unwrap();
    let (ok, out) = run(&["uninstall", "--dry-run"], Some(&dir));
    assert!(ok, "dry run must succeed, got: {out}");
    assert!(
        out.contains(&dir.to_string_lossy().to_string()),
        "the plan must name the install dir, got: {out:?}",
    );
    assert!(dir.exists(), "a dry run must not remove anything");
}

#[test]
fn uninstall_keeps_state_unless_asked() {
    // Losing saved passwords is worse than leaving a directory behind, so a
    // non-interactive uninstall preserves state/ and says so.
    let dir = unique_dir("keep");
    std::fs::create_dir_all(dir.join("bin")).unwrap();
    std::fs::create_dir_all(dir.join("state")).unwrap();
    std::fs::write(dir.join("state").join("secrets.json"), "{}").unwrap();
    let (ok, out) = run(&["uninstall", "--yes"], Some(&dir));
    assert!(ok, "uninstall --yes must succeed, got: {out}");
    assert!(
        dir.join("state").join("secrets.json").exists(),
        "state must survive a non-interactive uninstall",
    );
    assert!(
        !dir.join("bin").exists(),
        "the program itself must be gone, got: {out}",
    );
}

#[test]
fn uninstall_purge_removes_state_too() {
    let dir = unique_dir("purge");
    std::fs::create_dir_all(dir.join("bin")).unwrap();
    std::fs::create_dir_all(dir.join("state")).unwrap();
    std::fs::write(dir.join("state").join("queue.json"), "[]").unwrap();
    let (ok, out) = run(&["uninstall", "--yes", "--purge"], Some(&dir));
    assert!(ok, "uninstall --purge must succeed, got: {out}");
    assert!(!dir.exists(), "--purge must remove the whole directory");
}

#[test]
fn a_url_that_looks_like_a_verb_is_still_a_url() {
    // Pre-dispatch only fires on a bare first argument. `idm http://.../update`
    // must never be mistaken for the update verb.
    let (ok, out) = run(&["https://127.0.0.1:9/update", "-o", "/dev/null"], None);
    assert!(!ok, "the download must be attempted and fail to connect");
    assert!(
        !out.contains("nainstalovaná verze") && !out.contains("installed version"),
        "must not have run the update verb, got: {out:?}",
    );
}

#[test]
fn uninstall_finds_a_localized_desktop_directory() {
    // install.sh resolves the Desktop through user-dirs.dirs, so on a Czech or
    // German system the icon is in ~/Plocha or ~/Schreibtisch. Hardcoding
    // ~/Desktop here would leave the shortcut behind pointing at nothing.
    let home = unique_dir("home");
    let cfg = home.join(".config");
    std::fs::create_dir_all(&cfg).unwrap();
    std::fs::write(
        cfg.join("user-dirs.dirs"),
        "XDG_DOWNLOAD_DIR=\"$HOME/Stazene\"\nXDG_DESKTOP_DIR=\"$HOME/Plocha\"\n",
    )
    .unwrap();
    let desk = home.join("Plocha");
    std::fs::create_dir_all(&desk).unwrap();
    std::fs::write(desk.join("idm.desktop"), "[Desktop Entry]\n").unwrap();

    let dir = unique_dir("loc");
    std::fs::create_dir_all(dir.join("bin")).unwrap();
    let out = Command::new(IDM)
        .args(["uninstall", "--yes", "--purge"])
        .env("IDM_DIR", &dir)
        .env("HOME", &home)
        .env("XDG_CONFIG_HOME", &cfg)
        .output()
        .expect("spawn idm");
    assert!(out.status.success());
    assert!(
        !desk.join("idm.desktop").exists(),
        "the localized desktop entry must be removed: {}",
        String::from_utf8_lossy(&out.stdout),
    );
}
