// `idm update` — the engine updating itself.
//
// It is a downloader, so it downloads its own release: ask the release API for
// the latest tag, pull the archive, verify the published .sha256, unpack into a
// staging directory, and only then swap bin/ gui/ assets/ into place. The
// previous trees are kept next door as bin.old/ gui.old/ assets.old, because
// an update that installs itself without asking has to have an answer to "it
// installed itself and now it is broken": `idm update --rollback`.
//
// What is deliberately NOT touched: state/ (the queue and the vault),
// extension/, the browser manifests and the ~/.local/bin symlink. None of
// those paths change across versions, so re-registering anything would only
// add ways to fail.
//
// IDM_UPDATE_API and IDM_UPDATE_BASE override the endpoints; the tests point
// them at a local server, so nothing here needs the network.

use sha2::{Digest, Sha256};
use std::io::Write;
use std::path::{Path, PathBuf};
use std::time::{Duration, Instant, SystemTime, UNIX_EPOCH};
use crate::console::HideConsole;

const REPO: &str = "zombiegirlcz/IDM";
/// The three trees a release replaces, in the order they are swapped.
const TREES: [&str; 3] = ["bin", "gui", "assets"];

fn api_url() -> String {
    std::env::var("IDM_UPDATE_API").unwrap_or_else(|_| {
        format!("https://api.github.com/repos/{REPO}/releases/latest")
    })
}

fn base_url() -> String {
    std::env::var("IDM_UPDATE_BASE")
        .unwrap_or_else(|_| format!("https://github.com/{REPO}/releases/latest/download"))
}

/// The asset this build can install. A release carries one archive per
/// platform, and installing the wrong one is worse than refusing.
pub fn asset_name() -> Option<&'static str> {
    match (std::env::consts::OS, std::env::consts::ARCH) {
        ("windows", "x86_64") => Some("idm-windows-x64.zip"),
        ("linux", "x86_64") => Some("idm-linux-x64.tar.gz"),
        ("linux", "aarch64") => Some("idm-linux-arm64.tar.gz"),
        _ => None,
    }
}

/// `v0.1.6` and `0.1.6` are the same version written two ways.
pub fn normalize(tag: &str) -> &str {
    tag.trim().trim_start_matches('v')
}

/// Compare dotted numeric versions. Anything unparseable sorts as 0, so a
/// VERSION file saying `local:/home/u/IDM` never claims to be ahead of a
/// release -- but it does not block one either.
pub fn is_newer(installed: &str, latest: &str) -> bool {
    let parts = |s: &str| -> Vec<u64> {
        normalize(s)
            .split(['.', '-', '+'])
            .map(|p| p.parse::<u64>().unwrap_or(0))
            .collect()
    };
    let (a, b) = (parts(installed), parts(latest));
    for i in 0..a.len().max(b.len()) {
        let (x, y) = (a.get(i).copied().unwrap_or(0), b.get(i).copied().unwrap_or(0));
        if x != y {
            return y > x;
        }
    }
    false
}

/// What is installed right now: the tag install.sh (or a previous update)
/// recorded, falling back to the version compiled into this binary.
pub fn installed_version(dir: &Path) -> String {
    let from_file = std::fs::read_to_string(dir.join("VERSION"))
        .ok()
        .map(|s| s.trim().to_string())
        .filter(|s| !s.is_empty() && normalize(s).chars().next().is_some_and(|c| c.is_ascii_digit()));
    from_file.unwrap_or_else(|| env!("CARGO_PKG_VERSION").to_string())
}

// --- progress ----------------------------------------------------------------

/// One line of JSON the window polls. Written atomically, like every other
/// file this project leaves for another process to read.
pub struct Progress {
    path: Option<PathBuf>,
    last: Option<Instant>,
}

impl Progress {
    pub fn new(path: Option<PathBuf>) -> Self {
        Self { path, last: None }
    }

    pub fn phase(&mut self, phase: &str) {
        self.write(phase, 0.0, 0, false, None, true);
    }

    pub fn bytes(&mut self, phase: &str, got: u64, total: u64, speed: u64) {
        let percent = if total > 0 {
            (got as f64 / total as f64) * 100.0
        } else {
            0.0
        };
        // Throttled: a progress file rewritten per chunk is pure syscall noise.
        let due = self
            .last
            .map(|t| t.elapsed() >= Duration::from_millis(200))
            .unwrap_or(true);
        if due {
            self.last = Some(Instant::now());
            self.write(phase, percent, speed, false, None, false);
        }
    }

    pub fn done(&mut self, phase: &str) {
        self.write(phase, 100.0, 0, true, None, true);
    }

    pub fn failed(&mut self, error: &str) {
        self.write("error", 0.0, 0, true, Some(error), true);
    }

    fn write(
        &mut self,
        phase: &str,
        percent: f64,
        speed: u64,
        done: bool,
        error: Option<&str>,
        force: bool,
    ) {
        let Some(path) = self.path.clone() else { return };
        if force {
            self.last = Some(Instant::now());
        }
        let body = serde_json::json!({
            "phase": phase,
            "percent": (percent * 10.0).round() / 10.0,
            "speed_bps": speed,
            "done": done,
            "error": error,
        });
        let _ = write_atomic(&path, &body.to_string());
    }
}

fn write_atomic(path: &Path, contents: &str) -> std::io::Result<()> {
    let tmp = path.with_extension("tmp");
    if let Some(parent) = path.parent() {
        std::fs::create_dir_all(parent)?;
    }
    {
        let mut f = std::fs::File::create(&tmp)?;
        f.write_all(contents.as_bytes())?;
        f.sync_all()?;
    }
    std::fs::rename(&tmp, path)
}

// --- checking ----------------------------------------------------------------

pub struct Check {
    pub installed: String,
    pub latest: String,
    pub newer: bool,
}

async fn client() -> anyhow::Result<reqwest::Client> {
    Ok(reqwest::Client::builder()
        // GitHub's API rejects a request without one.
        .user_agent(concat!("idm/", env!("CARGO_PKG_VERSION")))
        .timeout(Duration::from_secs(30))
        .build()?)
}

pub async fn check(dir: &Path) -> anyhow::Result<Check> {
    let c = client().await?;
    let text = c.get(api_url()).send().await?.error_for_status()?.text().await?;
    let json: serde_json::Value = serde_json::from_str(&text)?;
    let latest = json
        .get("tag_name")
        .and_then(|v| v.as_str())
        .map(|s| s.to_string())
        .ok_or_else(|| anyhow::anyhow!("release API neuvedlo tag_name"))?;
    let installed = installed_version(dir);
    let newer = is_newer(&installed, &latest);
    // Cached so a plain download never pays for a release lookup: the notice
    // the CLI prints comes from here, not from the network.
    let now = SystemTime::now()
        .duration_since(UNIX_EPOCH)
        .map(|d| d.as_secs())
        .unwrap_or(0);
    let _ = write_atomic(
        &dir.join("state").join("update.json"),
        &serde_json::json!({
            "checked_at": now,
            "installed": installed,
            "latest": latest,
            "newer": newer,
        })
        .to_string(),
    );
    Ok(Check { installed, latest, newer })
}

/// The cached answer, for printing a notice without asking the network.
/// `None` when there is no cache, it is older than a week, or nothing is new.
pub fn cached_notice(dir: &Path, max_age: Duration) -> Option<String> {
    let text = std::fs::read_to_string(dir.join("state").join("update.json")).ok()?;
    let json: serde_json::Value = serde_json::from_str(&text).ok()?;
    if !json.get("newer").and_then(|v| v.as_bool()).unwrap_or(false) {
        return None;
    }
    let checked = json.get("checked_at").and_then(|v| v.as_u64()).unwrap_or(0);
    let now = SystemTime::now()
        .duration_since(UNIX_EPOCH)
        .map(|d| d.as_secs())
        .unwrap_or(0);
    if now.saturating_sub(checked) > max_age.as_secs() {
        return None;
    }
    json.get("latest").and_then(|v| v.as_str()).map(|s| s.to_string())
}

// --- applying ----------------------------------------------------------------

pub async fn apply(dir: &Path, prog: &mut Progress) -> anyhow::Result<String> {
    let asset = asset_name()
        .ok_or_else(|| anyhow::anyhow!("pro tuhle platformu se release nevydává"))?;

    prog.phase("check");
    let c = check(dir).await?;
    if !c.newer {
        prog.done("uptodate");
        return Ok(c.installed);
    }

    let stage = dir.join(".update");
    // A leftover staging directory from an interrupted run is not state.
    let _ = std::fs::remove_dir_all(&stage);
    std::fs::create_dir_all(&stage)?;

    let url = format!("{}/{}", base_url().trim_end_matches('/'), asset);
    let archive = stage.join(asset);
    download(&url, &archive, prog).await?;

    prog.phase("verify");
    verify_checksum(&url, &archive).await?;

    prog.phase("unpack");
    let unpack = stage.join("unpack");
    std::fs::create_dir_all(&unpack)?;
    extract(&archive, &unpack)?;
    let trees = arrange(&unpack, &stage)?;

    prog.phase("swap");
    swap_in(dir, &trees)?;
    write_atomic(&dir.join("VERSION"), &format!("{}\n", c.latest))?;
    let _ = std::fs::remove_dir_all(&stage);

    prog.done("done");
    Ok(c.latest)
}

async fn download(url: &str, dest: &Path, prog: &mut Progress) -> anyhow::Result<()> {
    use futures_util::StreamExt;
    let c = client().await?;
    let resp = c.get(url).send().await?.error_for_status()?;
    let total = resp.content_length().unwrap_or(0);
    let mut f = std::fs::File::create(dest)?;
    let mut got: u64 = 0;
    let started = Instant::now();
    let mut stream = resp.bytes_stream();
    while let Some(chunk) = stream.next().await {
        let chunk = chunk?;
        f.write_all(&chunk)?;
        got += chunk.len() as u64;
        let secs = started.elapsed().as_secs_f64().max(0.001);
        prog.bytes("download", got, total, (got as f64 / secs) as u64);
    }
    f.sync_all()?;
    Ok(())
}

async fn verify_checksum(url: &str, archive: &Path) -> anyhow::Result<()> {
    let c = client().await?;
    let published = c
        .get(format!("{url}.sha256"))
        .send()
        .await?
        .error_for_status()?
        .text()
        .await?;
    let want = published
        .split_whitespace()
        .next()
        .unwrap_or("")
        .to_lowercase();
    if want.len() != 64 {
        anyhow::bail!("k archivu není použitelný .sha256 — aktualizace zrušena");
    }
    let mut h = Sha256::new();
    h.update(std::fs::read(archive)?);
    let got: String = h.finalize().iter().map(|b| format!("{b:02x}")).collect();
    if got != want {
        anyhow::bail!("kontrolní součet nesouhlasí (čekáno {want}, získáno {got})");
    }
    Ok(())
}

/// `tar` handles both the .tar.gz and (as bsdtar, which is what Windows ships
/// since 1803) the .zip, so there is no archive crate to keep up to date.
fn extract(archive: &Path, into: &Path) -> anyhow::Result<()> {
    let status = std::process::Command::new("tar")
        .hide_console()
        .arg("-xf")
        .arg(archive)
        .arg("-C")
        .arg(into)
        .status()?;
    if !status.success() {
        anyhow::bail!("rozbalení archivu selhalo ({status})");
    }
    Ok(())
}

/// The archive is flat (plus assets/); the installation is not. Build the
/// bin/ gui/ assets/ trees next to it, exactly as install.sh arranges them.
fn arrange(unpack: &Path, stage: &Path) -> anyhow::Result<Vec<PathBuf>> {
    let bin = stage.join("bin.new");
    let gui = stage.join("gui.new");
    let assets = stage.join("assets.new");
    for d in [&bin, &gui, &assets] {
        std::fs::create_dir_all(d)?;
    }
    let exe = |n: &str| if cfg!(windows) { format!("{n}.exe") } else { n.to_string() };
    for name in [exe("idm"), exe("idm-host"), "ensure-aria2.sh".into(), "ensure-aria2.ps1".into()] {
        let src = unpack.join(&name);
        if src.is_file() {
            std::fs::copy(&src, bin.join(&name))?;
            make_executable(&bin.join(&name));
        }
    }
    if !bin.join(exe("idm")).is_file() {
        anyhow::bail!("archiv neobsahuje binárku idm — aktualizace zrušena");
    }
    let g = unpack.join("idm_gui.py");
    if g.is_file() {
        std::fs::copy(&g, gui.join("idm_gui.py"))?;
    }
    for a in ["idm.png", "idm.ico"] {
        let src = unpack.join("assets").join(a);
        if src.is_file() {
            std::fs::copy(&src, assets.join(a))?;
        }
    }
    Ok(vec![bin, gui, assets])
}

#[cfg(unix)]
fn make_executable(p: &Path) {
    use std::os::unix::fs::PermissionsExt;
    let _ = std::fs::set_permissions(p, std::fs::Permissions::from_mode(0o755));
}

#[cfg(not(unix))]
fn make_executable(_p: &Path) {}

/// Move each new tree into place, keeping the one it replaces as `<name>.old`.
/// Renames only, so the window of a half-swapped install is as small as the
/// filesystem allows -- and on Windows renaming a directory holding a running
/// .exe is permitted, where overwriting the file is not.
fn swap_in(dir: &Path, trees: &[PathBuf]) -> anyhow::Result<()> {
    for (i, name) in TREES.iter().enumerate() {
        let new = &trees[i];
        if !new.is_dir() {
            continue;
        }
        let live = dir.join(name);
        let old = dir.join(format!("{name}.old"));
        let _ = std::fs::remove_dir_all(&old);
        if live.exists() {
            std::fs::rename(&live, &old)?;
        }
        std::fs::rename(new, &live)?;
    }
    // VERSION moves with them, so --rollback restores the right number.
    let v = dir.join("VERSION");
    if v.is_file() {
        let _ = std::fs::copy(&v, dir.join("VERSION.old"));
    }
    Ok(())
}

pub fn rollback(dir: &Path) -> anyhow::Result<String> {
    let have: Vec<&str> = TREES
        .iter()
        .copied()
        .filter(|n| dir.join(format!("{n}.old")).is_dir())
        .collect();
    if have.is_empty() {
        anyhow::bail!(
            "není kam se vrátit: v {} nejsou žádné .old verze",
            dir.display()
        );
    }
    for name in have {
        let live = dir.join(name);
        let old = dir.join(format!("{name}.old"));
        let scratch = dir.join(format!("{name}.rollback"));
        let _ = std::fs::remove_dir_all(&scratch);
        if live.exists() {
            std::fs::rename(&live, &scratch)?;
        }
        std::fs::rename(&old, &live)?;
        let _ = std::fs::remove_dir_all(&scratch);
    }
    let vold = dir.join("VERSION.old");
    if vold.is_file() {
        let _ = std::fs::copy(&vold, dir.join("VERSION"));
        let _ = std::fs::remove_file(&vold);
    }
    Ok(installed_version(dir))
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn a_v_prefix_is_not_a_different_version() {
        assert!(!is_newer("0.1.5", "v0.1.5"));
        assert!(is_newer("v0.1.5", "0.1.6"));
    }

    #[test]
    fn compares_numerically_not_as_text() {
        // "0.1.10" < "0.1.9" as strings, which is exactly the bug to avoid.
        assert!(is_newer("0.1.9", "0.1.10"));
        assert!(!is_newer("0.1.10", "0.1.9"));
        assert!(is_newer("0.9.0", "1.0.0"));
    }

    #[test]
    fn a_missing_component_is_zero() {
        assert!(is_newer("0.1", "0.1.1"));
        assert!(!is_newer("0.1.0", "0.1"));
    }

    #[test]
    fn an_unparseable_installed_version_does_not_claim_to_be_ahead() {
        // IDM_LOCAL_SOURCE writes `local:/path` into VERSION.
        assert!(is_newer("local:/home/u/IDM", "0.0.1"));
    }
}
