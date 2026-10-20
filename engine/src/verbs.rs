// The verbs on the `idm` binary: --version, --gui, update and uninstall.
//
// They are dispatched BEFORE clap sees the arguments. `url` is an optional
// positional, so `Args::parse()` would happily read `update` as a URL, and
// teaching clap about real subcommands would change how every existing
// invocation parses -- including the ones hanging off the browser E2E chain.
// Pre-dispatch leaves that parser untouched: a first argument that is not one
// of these exact words falls straight through to it.
//
// `idm-host` is deliberately NOT a verb here. Native-messaging manifests
// cannot pass arguments, so folding the host in would mean dispatching on
// argv[0], and the host is the one link a real browser verifies in CI.

use std::io::IsTerminal;
use std::path::{Path, PathBuf};
use crate::console::HideConsole;

pub const AFTER_HELP: &str = "\
Verbs (must be the first argument):
  idm --gui [ARGS…]        open the native window
  idm update [--check] [--rollback] [--progress-file PATH]
                           install the newest release (--check only looks)
  idm uninstall [--yes] [--purge] [--dry-run]
                           remove the installation
  idm --version            print the installed version

Everything else is a download: idm URL [OPTIONS]";

/// Where the installation lives. `IDM_DIR` wins; otherwise the per-user
/// default, which `install.sh` and `install.ps1` use too.
pub fn idm_dir() -> PathBuf {
    if let Some(d) = std::env::var_os("IDM_DIR") {
        if !d.is_empty() {
            return PathBuf::from(d);
        }
    }
    let home = std::env::var_os("HOME")
        .or_else(|| std::env::var_os("USERPROFILE"))
        .map(PathBuf::from)
        .unwrap_or_else(|| PathBuf::from("."));
    home.join(".idm")
}

/// Handle a verb. `None` means "not a verb" — carry on into clap.
///
/// Async because `update` talks HTTP, and main is already inside the runtime;
/// calling block_on from a runtime thread would panic.
pub async fn dispatch() -> Option<i32> {
    let argv: Vec<String> = std::env::args().collect();
    let first = argv.get(1)?.as_str();
    let rest = &argv[2..];
    match first {
        "--version" | "-V" => {
            println!("idm {}", env!("CARGO_PKG_VERSION"));
            Some(0)
        }
        "--gui" | "gui" => Some(run_gui(rest)),
        "update" => Some(run_update(rest).await),
        "uninstall" => Some(run_uninstall(rest)),
        _ => None,
    }
}

// --- the window ---------------------------------------------------------------

fn run_gui(extra: &[String]) -> i32 {
    let dir = idm_dir();
    let script = dir.join("gui").join("idm_gui.py");
    if !script.is_file() {
        eprintln!(
            "[x] okno nelze spustit: chybí {}\n    \
             Zkontroluj IDM_DIR (teď {}) nebo přeinstaluj.",
            script.display(),
            dir.display(),
        );
        return 1;
    }
    let configured = std::env::var("IDM_PYTHON").ok();
    let candidates = python_candidates(cfg!(windows), configured.as_deref());
    // Without tkinter the window used to die into a log nobody reads. Say it
    // here, where the user can see it.
    let has_tk = |c: &[String]| {
        std::process::Command::new(&c[0])
            .hide_console()
            .args(&c[1..])
            .args(["-c", "import tkinter"])
            .stdout(std::process::Stdio::null())
            .stderr(std::process::Stdio::null())
            .status()
            .map(|s| s.success())
            .unwrap_or(false)
    };
    let Some(python) = candidates.iter().find(|c| has_tk(c)) else {
        let tried: Vec<String> = candidates.iter().map(|c| c.join(" ")).collect();
        if cfg!(windows) {
            eprintln!(
                "[x] okno nelze spustit: žádný Python s tkinter ({}).\n    \
                 Nainstaluj Python z python.org (tkinter obsahuje), nebo \
                 `winget install Python.Python.3.12`, případně nastav IDM_PYTHON.",
                tried.join(", "),
            );
        } else {
            eprintln!(
                "[x] okno nelze spustit: '{}' nemá modul tkinter.\n    \
                 Doinstaluj např.: sudo apt-get install -y python3 python3-tk",
                tried.join(", "),
            );
        }
        return 1;
    };
    let shown = python.join(" ");

    let mut cmd = std::process::Command::new(&python[0]);
    cmd.hide_console();
    cmd.args(&python[1..])
        .arg(&script)
        .arg("--engine")
        .arg(dir.join("bin").join(exe("idm")))
        .arg("--state-dir")
        .arg(dir.join("state"))
        .arg("--autostart")
        .args(extra);
    match cmd.status() {
        Ok(s) => s.code().unwrap_or(0),
        Err(e) => {
            eprintln!("[x] nepodařilo se spustit {shown}: {e}");
            1
        }
    }
}

/// The interpreters to try for the window, in order, each as program + args.
///
/// Windows has no `python3`: a python.org or winget install provides
/// pythonw/python and the `py` launcher, and "python3" is at best the
/// Microsoft Store stub. install.ps1 persists the one it found as IDM_PYTHON,
/// which goes first everywhere.
pub fn python_candidates(windows: bool, configured: Option<&str>) -> Vec<Vec<String>> {
    let one = |s: &str| vec![s.to_string()];
    let mut out = Vec::new();
    if let Some(c) = configured.filter(|c| !c.trim().is_empty()) {
        out.push(one(c));
        if !windows {
            return out;
        }
    }
    if windows {
        out.push(one("pythonw"));
        out.push(one("python"));
        out.push(vec!["py".into(), "-3".into()]);
    } else {
        out.push(one("python3"));
    }
    out
}

fn exe(name: &str) -> String {
    if cfg!(windows) {
        format!("{name}.exe")
    } else {
        name.to_string()
    }
}

// --- update --------------------------------------------------------------------

async fn run_update(flags: &[String]) -> i32 {
    let dir = idm_dir();
    let check_only = flags.iter().any(|f| f == "--check");
    let roll = flags.iter().any(|f| f == "--rollback");
    let progress_file = flag_value(flags, "--progress-file").map(PathBuf::from);

    if roll {
        return match crate::update::rollback(&dir) {
            Ok(v) => {
                println!("vráceno na {v}");
                0
            }
            Err(e) => {
                eprintln!("[x] rollback selhal: {e:#}");
                1
            }
        };
    }

    if check_only {
        return match crate::update::check(&dir).await {
            Ok(c) if c.newer => {
                println!("je nová verze: {} (máš {})", c.latest, c.installed);
                println!("nainstaluj ji: idm update");
                0
            }
            Ok(c) => {
                println!("{} je aktuální", c.installed);
                0
            }
            Err(e) => {
                eprintln!("[x] kontrolu verze nelze provést: {e:#}");
                1
            }
        };
    }

    let mut prog = crate::update::Progress::new(progress_file);
    match crate::update::apply(&dir, &mut prog).await {
        Ok(v) => {
            println!("hotovo — {v}");
            0
        }
        Err(e) => {
            // The window reads the reason out of the progress file; a terminal
            // reads it here. Both have to get it.
            let msg = format!("{e:#}");
            prog.failed(&msg);
            eprintln!("[x] aktualizace selhala: {msg}");
            1
        }
    }
}

/// `--flag VALUE` out of a flat argument list.
fn flag_value(flags: &[String], name: &str) -> Option<String> {
    let i = flags.iter().position(|f| f == name)?;
    flags.get(i + 1).cloned()
}

// --- uninstall -------------------------------------------------------------------

/// Everything an uninstall would touch. Built before anything is removed so
/// `--dry-run` can print exactly what `--yes` would do.
pub struct UninstallPlan {
    pub dir: PathBuf,
    pub state: PathBuf,
    pub keep_state: bool,
    pub files: Vec<PathBuf>,
    pub rc_files: Vec<PathBuf>,
}

pub fn uninstall_plan(dir: PathBuf, purge: bool) -> UninstallPlan {
    let home = std::env::var_os("HOME")
        .or_else(|| std::env::var_os("USERPROFILE"))
        .map(PathBuf::from)
        .unwrap_or_else(|| PathBuf::from("."));
    let data = std::env::var_os("XDG_DATA_HOME")
        .map(PathBuf::from)
        .unwrap_or_else(|| home.join(".local").join("share"));
    let mut files = vec![
        home.join(".local").join("bin").join("idm"),
        desktop_dir(&home).join("idm.desktop"),
    ];
    for app in ["idm-desktop", "idm-download", "idm-scheme"] {
        files.push(data.join("applications").join(format!("{app}.desktop")));
    }
    UninstallPlan {
        state: dir.join("state"),
        dir,
        keep_state: !purge,
        files,
        rc_files: [".zshrc", ".bashrc", ".profile"]
            .iter()
            .map(|f| home.join(f))
            .collect(),
    }
}

/// The Desktop directory, the way install.sh resolves it. A localized system
/// puts the icon in ~/Plocha or ~/Schreibtisch, and a hardcoded ~/Desktop
/// would leave the shortcut behind.
pub fn desktop_dir(home: &Path) -> PathBuf {
    let cfg = std::env::var_os("XDG_CONFIG_HOME")
        .map(PathBuf::from)
        .unwrap_or_else(|| home.join(".config"));
    if let Ok(text) = std::fs::read_to_string(cfg.join("user-dirs.dirs")) {
        if let Some(d) = parse_user_dir(&text, "XDG_DESKTOP_DIR", home) {
            return d;
        }
    }
    home.join("Desktop")
}

/// `XDG_DESKTOP_DIR="$HOME/Plocha"` — one shell assignment per line, with the
/// value quoted and `$HOME` spelled literally.
fn parse_user_dir(text: &str, key: &str, home: &Path) -> Option<PathBuf> {
    for line in text.lines() {
        let line = line.trim();
        let Some(rest) = line.strip_prefix(key).and_then(|r| r.strip_prefix('=')) else {
            continue;
        };
        let value = rest.trim().trim_matches('"');
        if value.is_empty() {
            continue;
        }
        let expanded = match value.strip_prefix("$HOME/") {
            Some(tail) => home.join(tail),
            None => PathBuf::from(value),
        };
        // An unset entry points at $HOME itself; that is not a Desktop.
        if expanded == home {
            continue;
        }
        return Some(expanded);
    }
    None
}

/// Drop the `# >>> IDM >>>` block, and the loose pre-0.2 lines that came
/// before the block existed. Returns the new contents, or `None` when there
/// was nothing of ours in the file.
pub fn strip_rc_block(text: &str) -> Option<String> {
    let mut out = String::with_capacity(text.len());
    let mut skipping = false;
    let mut touched = false;
    for line in text.lines() {
        let t = line.trim();
        if t == "# >>> IDM >>>" {
            skipping = true;
            touched = true;
            continue;
        }
        if t == "# <<< IDM <<<" {
            skipping = false;
            continue;
        }
        if skipping {
            continue;
        }
        if t.starts_with("# IDM (added by install.sh")
            || (t.starts_with("export PATH=\"") && t.contains("/idm/bin:$PATH\""))
        {
            touched = true;
            continue;
        }
        out.push_str(line);
        out.push('\n');
    }
    touched.then_some(out)
}

/// What `idm uninstall` runs on Windows: the installation's own install.ps1.
///
/// Removing files is the small part there. The registry keys of every
/// browser, the Desktop and Start-menu shortcuts, the user variables and the
/// PATH entry are what install.ps1 created and knows how to remove; the bash
/// scripts the Linux path calls do not exist. Everything travels in the
/// environment, so no path ever becomes PowerShell source. It first waits for
/// this idm.exe to exit -- Windows will not delete a running exe -- and its
/// output goes to a log, since by then nobody is watching a console.
pub const UNINSTALL_SCRIPT: &str = "\
Wait-Process -Id ([int]$env:IDM_WAIT_PID) -Timeout 30 -ErrorAction SilentlyContinue; \
if ($env:IDM_UNINSTALL_PURGE -eq '1') { \
  & $env:IDM_UNINSTALL_PS1 -Uninstall -Purge -Prefix $env:IDM_UNINSTALL_DIR *> $env:IDM_UNINSTALL_LOG \
} else { \
  & $env:IDM_UNINSTALL_PS1 -Uninstall -Prefix $env:IDM_UNINSTALL_DIR *> $env:IDM_UNINSTALL_LOG \
}";

/// The environment UNINSTALL_SCRIPT runs with, or `None` when the
/// installation has no install.ps1 to hand off to.
pub fn uninstall_handoff(
    dir: &Path,
    purge: bool,
    wait_pid: u32,
    temp: &Path,
) -> Option<Vec<(String, String)>> {
    let ps1 = dir.join("install.ps1");
    if !ps1.is_file() {
        return None;
    }
    let s = |p: &Path| p.to_string_lossy().to_string();
    Some(vec![
        ("IDM_UNINSTALL_PS1".into(), s(&ps1)),
        ("IDM_UNINSTALL_DIR".into(), s(dir)),
        ("IDM_UNINSTALL_PURGE".into(), if purge { "1" } else { "0" }.into()),
        ("IDM_WAIT_PID".into(), wait_pid.to_string()),
        ("IDM_UNINSTALL_LOG".into(), s(&temp.join("idm-uninstall.log"))),
    ])
}

/// Start UNINSTALL_SCRIPT and leave it running. Not waited for: install.ps1
/// stops what runs from the installation and deletes bin\idm.exe, so this
/// process has to be gone first.
fn spawn_windows_uninstall(env: &[(String, String)]) -> std::io::Result<()> {
    let ps = std::env::var_os("SystemRoot")
        .map(|r| {
            PathBuf::from(r)
                .join("System32")
                .join("WindowsPowerShell")
                .join("v1.0")
                .join("powershell.exe")
        })
        .filter(|p| p.is_file())
        .unwrap_or_else(|| PathBuf::from("powershell"));
    let mut cmd = std::process::Command::new(ps);
    cmd.hide_console()
        .args(["-NoProfile", "-NonInteractive", "-ExecutionPolicy", "Bypass", "-Command", UNINSTALL_SCRIPT])
        .stdin(std::process::Stdio::null())
        .stdout(std::process::Stdio::null())
        .stderr(std::process::Stdio::null());
    for (k, v) in env {
        cmd.env(k, v);
    }
    cmd.spawn().map(|_| ())
}

fn run_uninstall(flags: &[String]) -> i32 {
    let dry = flags.iter().any(|f| f == "--dry-run");
    let yes = flags.iter().any(|f| f == "--yes" || f == "-y");
    let purge = flags.iter().any(|f| f == "--purge");
    let plan = uninstall_plan(idm_dir(), purge);
    let temp = std::env::temp_dir();
    let handoff = if cfg!(windows) {
        uninstall_handoff(&plan.dir, purge, std::process::id(), &temp)
    } else {
        None
    };

    println!("odinstalace z {}", plan.dir.display());
    if handoff.is_some() {
        println!(
            "  spustit {} -Uninstall{} (registr prohlížečů, zástupci, proměnné, PATH)",
            plan.dir.join("install.ps1").display(),
            if purge { " -Purge" } else { "" },
        );
    }
    for p in plan.files.iter() {
        if p.exists() || p.is_symlink() {
            println!("  smazat  {}", p.display());
        }
    }
    for rc in plan.rc_files.iter() {
        if std::fs::read_to_string(rc)
            .ok()
            .and_then(|t| strip_rc_block(&t))
            .is_some()
        {
            println!("  upravit {}", rc.display());
        }
    }
    if plan.keep_state && plan.state.is_dir() {
        println!("  nechat  {} (fronta a hesla; smazat: --purge)", plan.state.display());
    }

    if dry {
        println!("(--dry-run: nic se nesmazalo)");
        return 0;
    }
    if !yes {
        if !std::io::stdin().is_terminal() {
            eprintln!("[x] neinteraktivní běh: potvrď smazání pomocí --yes");
            return 1;
        }
        eprint!("Opravdu odinstalovat? [a/N] ");
        use std::io::Write;
        let _ = std::io::stderr().flush();
        let mut line = String::new();
        if std::io::stdin().read_line(&mut line).is_err()
            || !matches!(line.trim().to_lowercase().as_str(), "a" | "y" | "ano" | "yes")
        {
            println!("zrušeno");
            return 0;
        }
    }

    if let Some(env) = handoff {
        return match spawn_windows_uninstall(&env) {
            Ok(()) => {
                println!(
                    "odinstalace běží na pozadí, jakmile tenhle proces skončí \
                     (průběh: {})",
                    temp.join("idm-uninstall.log").display(),
                );
                0
            }
            Err(e) => {
                eprintln!("[x] install.ps1 -Uninstall nelze spustit: {e}");
                1
            }
        };
    }
    if cfg!(windows) {
        eprintln!(
            "[!] {} chybí: smažu soubory, ale registr, zástupce a proměnné \
             odstraní až install.ps1 -Uninstall",
            plan.dir.join("install.ps1").display(),
        );
    }

    run_integration_uninstall(&plan.dir);

    for p in plan.files.iter() {
        if p.is_symlink() || p.exists() {
            let _ = std::fs::remove_file(p);
        }
    }
    for rc in plan.rc_files.iter() {
        if let Ok(text) = std::fs::read_to_string(rc) {
            if let Some(stripped) = strip_rc_block(&text) {
                let _ = write_atomic(rc, &stripped);
            }
        }
    }

    if plan.keep_state {
        remove_all_but_state(&plan.dir);
        if plan.state.is_dir() {
            println!("hotovo — stav zůstal v {}", plan.state.display());
        } else {
            println!("hotovo — odstraněno");
        }
    } else {
        let _ = std::fs::remove_dir_all(&plan.dir);
        println!("hotovo — odstraněno včetně stavu");
    }
    0
}

/// Let the shell/host integration remove its own browser manifests; they know
/// which browser directories they linked into. Missing scripts are fine — a
/// partial install is still worth cleaning up.
fn run_integration_uninstall(dir: &Path) {
    for script in ["install-shell.sh", "install-host.sh"] {
        let p = dir.join("extension").join(script);
        if !p.is_file() {
            continue;
        }
        let _ = std::process::Command::new("bash")
            .hide_console()
            .arg(&p)
            .arg("--uninstall")
            .env("IDM_ENGINE_BIN", dir.join("bin").join(exe("idm")))
            .env("IDM_STATE_DIR", dir.join("state"))
            .env("IDM_NATIVE_DIR", dir.join("native"))
            .stdout(std::process::Stdio::null())
            .stderr(std::process::Stdio::null())
            .status();
    }
}

fn remove_all_but_state(dir: &Path) {
    let Ok(entries) = std::fs::read_dir(dir) else {
        return;
    };
    for e in entries.flatten() {
        if e.file_name() == "state" {
            continue;
        }
        let p = e.path();
        if p.is_dir() {
            let _ = std::fs::remove_dir_all(&p);
        } else {
            let _ = std::fs::remove_file(&p);
        }
    }
    // An install whose state is gone leaves nothing worth keeping.
    let _ = std::fs::remove_dir(dir);
}

/// Writing in place lets a reader see a torn file; the rest of the project
/// writes tmp+rename for the same reason.
fn write_atomic(path: &Path, contents: &str) -> std::io::Result<()> {
    let tmp = path.with_extension("idm.tmp");
    std::fs::write(&tmp, contents)?;
    std::fs::rename(&tmp, path)
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn parses_a_localized_desktop_entry() {
        let home = PathBuf::from("/home/u");
        let text = "XDG_DOWNLOAD_DIR=\"$HOME/Stazene\"\nXDG_DESKTOP_DIR=\"$HOME/Plocha\"\n";
        assert_eq!(
            parse_user_dir(text, "XDG_DESKTOP_DIR", &home),
            Some(PathBuf::from("/home/u/Plocha")),
        );
    }

    #[test]
    fn an_unset_desktop_entry_is_not_a_desktop() {
        // `XDG_DESKTOP_DIR="$HOME/"` is how the spec spells "no Desktop";
        // treating it as one would make us delete out of $HOME.
        let home = PathBuf::from("/home/u");
        assert_eq!(parse_user_dir("XDG_DESKTOP_DIR=\"$HOME/\"\n", "XDG_DESKTOP_DIR", &home), None);
    }

    #[test]
    fn strip_rc_block_keeps_unrelated_lines() {
        let text = "# mine\n# >>> IDM >>>\nexport IDM_DIR=\"/x\"\n# <<< IDM <<<\nalias l=ls\n";
        assert_eq!(strip_rc_block(text).unwrap(), "# mine\nalias l=ls\n");
    }

    #[test]
    fn strip_rc_block_also_drops_the_pre_0_2_lines() {
        let text = "# IDM (added by install.sh; removed by --uninstall)\n\
                    export PATH=\"/home/u/.local/share/idm/bin:$PATH\"\n# mine\n";
        assert_eq!(strip_rc_block(text).unwrap(), "# mine\n");
    }

    #[test]
    fn strip_rc_block_reports_an_untouched_file() {
        assert!(strip_rc_block("# mine\nalias l=ls\n").is_none());
    }

    // --- Windows: which Python opens the window ----------------------------

    fn names(c: &[Vec<String>]) -> Vec<String> {
        c.iter().map(|v| v.join(" ")).collect()
    }

    #[test]
    fn windows_has_no_python3_so_the_python_org_names_are_tried() {
        // A python.org or winget install provides pythonw/python and the py
        // launcher; "python3" is at best the Microsoft Store stub.
        assert_eq!(names(&python_candidates(true, None)), ["pythonw", "python", "py -3"]);
    }

    #[test]
    fn the_python_the_installer_found_comes_first() {
        let c = python_candidates(true, Some(r"C:\Py\pythonw.exe"));
        assert_eq!(names(&c)[0], r"C:\Py\pythonw.exe");
        let c = python_candidates(false, Some("/opt/py/bin/python3"));
        assert_eq!(names(&c), ["/opt/py/bin/python3"]);
    }

    #[test]
    fn linux_keeps_python3() {
        assert_eq!(names(&python_candidates(false, None)), ["python3"]);
        // An empty variable is not a choice.
        assert_eq!(names(&python_candidates(false, Some(""))), ["python3"]);
    }

    // --- Windows: uninstall hands off to install.ps1 -----------------------

    fn scratch(tag: &str) -> PathBuf {
        let d = std::env::temp_dir().join(format!("idm_verbs_{tag}_{}", std::process::id()));
        let _ = std::fs::remove_dir_all(&d);
        std::fs::create_dir_all(&d).unwrap();
        d
    }

    #[test]
    fn without_install_ps1_there_is_nothing_to_hand_off_to() {
        let d = scratch("noscript");
        assert!(uninstall_handoff(&d, false, 42, Path::new("/tmp")).is_none());
    }

    #[test]
    fn the_handoff_names_the_script_the_prefix_and_what_to_wait_for() {
        let d = scratch("script");
        std::fs::write(d.join("install.ps1"), "# stub").unwrap();
        let env: std::collections::HashMap<String, String> =
            uninstall_handoff(&d, true, 4242, Path::new("/tmp/t")).unwrap().into_iter().collect();
        assert_eq!(env["IDM_UNINSTALL_PS1"], d.join("install.ps1").to_string_lossy());
        assert_eq!(env["IDM_UNINSTALL_DIR"], d.to_string_lossy());
        assert_eq!(env["IDM_UNINSTALL_PURGE"], "1");
        assert_eq!(env["IDM_WAIT_PID"], "4242");
        assert_eq!(
            env["IDM_UNINSTALL_LOG"],
            Path::new("/tmp/t").join("idm-uninstall.log").to_string_lossy(),
        );
        let keep: std::collections::HashMap<String, String> =
            uninstall_handoff(&d, false, 1, Path::new("/tmp")).unwrap().into_iter().collect();
        assert_eq!(keep["IDM_UNINSTALL_PURGE"], "0", "state\\ is kept unless --purge");
    }

    #[test]
    fn the_uninstall_script_takes_everything_from_the_environment() {
        // Paths never become PowerShell source: a user name with a quote in
        // it must not be able to change what runs.
        for var in ["IDM_UNINSTALL_PS1", "IDM_UNINSTALL_DIR", "IDM_UNINSTALL_PURGE",
                    "IDM_WAIT_PID", "IDM_UNINSTALL_LOG"] {
            assert!(UNINSTALL_SCRIPT.contains(&format!("$env:{var}")), "{var}");
        }
        assert!(UNINSTALL_SCRIPT.contains("Wait-Process"),
                "idm.exe must be gone before bin\\idm.exe is deleted");
        assert!(UNINSTALL_SCRIPT.contains("-Uninstall -Purge"));
    }
}
