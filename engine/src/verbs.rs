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

pub const AFTER_HELP: &str = "\
Verbs (must be the first argument):
  idm --gui [ARGS…]        open the native window
  idm update               check for a newer release
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
pub fn dispatch() -> Option<i32> {
    let argv: Vec<String> = std::env::args().collect();
    let first = argv.get(1)?.as_str();
    let rest = &argv[2..];
    match first {
        "--version" | "-V" => {
            println!("idm {}", env!("CARGO_PKG_VERSION"));
            Some(0)
        }
        "--gui" | "gui" => Some(run_gui(rest)),
        "update" => Some(run_update()),
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
    let python = std::env::var("IDM_PYTHON").unwrap_or_else(|_| "python3".into());
    // Without tkinter the window used to die into a log nobody reads. Say it
    // here, where the user can see it.
    let has_tk = std::process::Command::new(&python)
        .args(["-c", "import tkinter"])
        .stdout(std::process::Stdio::null())
        .stderr(std::process::Stdio::null())
        .status()
        .map(|s| s.success())
        .unwrap_or(false);
    if !has_tk {
        eprintln!(
            "[x] okno nelze spustit: '{python}' nemá modul tkinter.\n    \
             Doinstaluj např.: sudo apt-get install -y python3 python3-tk",
        );
        return 1;
    }

    let mut cmd = std::process::Command::new(&python);
    cmd.arg(&script)
        .arg("--engine")
        .arg(dir.join("bin").join(exe("idm")))
        .arg("--state-dir")
        .arg(dir.join("state"))
        .arg("--autostart")
        .args(extra);
    match cmd.status() {
        Ok(s) => s.code().unwrap_or(0),
        Err(e) => {
            eprintln!("[x] nepodařilo se spustit {python}: {e}");
            1
        }
    }
}

fn exe(name: &str) -> String {
    if cfg!(windows) {
        format!("{name}.exe")
    } else {
        name.to_string()
    }
}

// --- update --------------------------------------------------------------------

fn run_update() -> i32 {
    let dir = idm_dir();
    let installed = std::fs::read_to_string(dir.join("VERSION"))
        .ok()
        .map(|s| s.trim().to_string())
        .filter(|s| !s.is_empty());
    println!("idm {}", env!("CARGO_PKG_VERSION"));
    match installed {
        Some(tag) => println!("nainstalováno z: {tag}  ({})", dir.display()),
        None => println!("instalační složka: {}", dir.display()),
    }
    // Fetching the release index and swapping the binaries is cycle B; the
    // verb exists now so the GUI and the docs can rely on it.
    println!("kontrola nové verze zatím není hotová (bude v příští verzi)");
    0
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

fn run_uninstall(flags: &[String]) -> i32 {
    let dry = flags.iter().any(|f| f == "--dry-run");
    let yes = flags.iter().any(|f| f == "--yes" || f == "-y");
    let purge = flags.iter().any(|f| f == "--purge");
    let plan = uninstall_plan(idm_dir(), purge);

    println!("odinstalace z {}", plan.dir.display());
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
}
