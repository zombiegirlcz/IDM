// `idm update` — the engine updating itself.
//
// It is a downloader, so it downloads its own release: ask the release API for
// the latest tag, pull the archive, verify the published .sha256, unpack into a
// staging directory, and only then swap bin/ gui/ assets/ into place. During
// the swap the previous trees sit next door as bin.old/ gui.old/ assets.old,
// so a swap that dies half way can be undone with `idm update --rollback`.
// Once it succeeds they are deleted -- or, while something still runs from
// them (Windows), moved to .trash/ and deleted by the next command.
//
// What is deliberately NOT touched: state/ (the queue and the vault),
// the browser manifests and the ~/.local/bin symlink. None of those paths
// change across versions, so re-registering anything would only add ways
// to fail. extension/ IS touched — it travels with the release and is
// replaced by the same atomic swap that updates bin/ gui/ assets/.
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
/// bin/ carries the engine (idm, idm-host), gui/ the native window
/// (idm_gui.py), assets/ the icons, extension/ the browser extension.
/// One `idm update` replaces all of them atomically — GUI, CLI and the
/// extension in a single swap.
const TREES: [&str; 4] = ["bin", "gui", "assets", "extension"];

/// Where a tree goes when it cannot be deleted yet. On Windows the previous
/// bin/ is still busy right after the swap -- the updater runs from it, so do
/// the window's `idm --serve` and the browser's idm-host.exe -- and Windows
/// will not delete a running exe. It can rename one, though, so the tree is
/// moved here, out of the install directory's sight, and the next command
/// that starts after those processes are gone deletes it (`sweep_leftovers`).
const TRASH: &str = ".trash";

/// The flat files of the archive that belong in bin/. Every helper the
/// installers put there has to be listed: `idm update` dropping
/// ensure-ytdlp.* left a machine without yt-dlp unable to fetch any video.
const BIN_SCRIPTS: [&str; 4] = [
    "ensure-aria2.sh",
    "ensure-aria2.ps1",
    "ensure-ytdlp.sh",
    "ensure-ytdlp.ps1",
];

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
    let _ = write_cache(dir, &installed, &latest);
    Ok(Check { installed, latest, newer })
}

/// Write the cache: what is installed, what the last check saw, and whether
/// that is newer. One function so every writer agrees on the shape.
fn write_cache(dir: &Path, installed: &str, latest: &str) -> std::io::Result<()> {
    let now = SystemTime::now()
        .duration_since(UNIX_EPOCH)
        .map(|d| d.as_secs())
        .unwrap_or(0);
    write_atomic(
        &dir.join("state").join("update.json"),
        &serde_json::json!({
            "checked_at": now,
            "installed": installed,
            "latest": latest,
            "newer": is_newer(installed, latest),
        })
        .to_string(),
    )
}

/// Bring the cache up to date with the installation on disk.
///
/// The cache is written by `update --check` and by the window, but the
/// version it records can stop being the version that is installed: a manual
/// install, a rollback, or the swap at the end of `idm update` all change
/// VERSION without touching state/. A cache that says `installed: 2.0.2` on a
/// machine running 2.0.7 makes every command claim a newer release is
/// available -- reported from Windows as "it still says 2.0.3".
///
/// Returns true when the file was rewritten.
pub fn reconcile_cache(dir: &Path) -> bool {
    let path = dir.join("state").join("update.json");
    let Ok(text) = std::fs::read_to_string(&path) else {
        // No cache is not a lie, and guessing a `latest` would be.
        return false;
    };
    let Ok(json) = serde_json::from_str::<serde_json::Value>(&text) else {
        return false;
    };
    let cached = json
        .get("installed")
        .and_then(|v| v.as_str())
        .unwrap_or("")
        .to_string();
    let now_installed = installed_version(dir);
    if normalize(&cached) == normalize(&now_installed) {
        return false;
    }
    let latest = json
        .get("latest")
        .and_then(|v| v.as_str())
        .unwrap_or(&now_installed)
        .to_string();
    let _ = write_cache(dir, &now_installed, &latest);
    true
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
    stop_hosts(dir);
    if let Err(e) = swap_in(dir, &trees) {
        // Undone completely, the installation is the one we started from and
        // the staging directory is just a download: without it the next
        // command may sweep a stuck .old that blocked this swap. Undone only
        // in part, the .old trees are the way back and .update keeps the
        // sweep off them.
        if e.undone {
            let _ = discard(dir, &stage);
        }
        return Err(e.into());
    }
    write_atomic(&dir.join("VERSION"), &format!("{}\n", c.latest))?;
    // The cache was written by `check` a moment ago, when VERSION still named
    // the OLD version -- so it says a newer release exists, which is what
    // every subsequent command would repeat. Re-stamp it with what is
    // actually installed now.
    let _ = write_cache(dir, &c.latest, &c.latest);
    // The update succeeded: the .old trees are only needed for rollback, and
    // keeping them around clutters the install directory (and an empty-looking
    // extension.old/ confuses Chrome). What is still busy -- on Windows, the
    // bin.old this very process runs from -- goes to the trash instead.
    for name in TREES.iter() {
        let _ = discard(dir, &dir.join(format!("{name}.old")));
    }
    let _ = std::fs::remove_file(dir.join("VERSION.old"));
    // Last: while .update exists, the sweep treats any .old as the rollback
    // copy of an interrupted swap and leaves it alone.
    let _ = discard(dir, &stage);

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
    let status = std::process::Command::new(tar_program())
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

/// Which tar to run. On Windows the one in System32 is bsdtar and reads .zip;
/// a GNU tar earlier on PATH (Git's usr\bin, MSYS) does not.
fn tar_program() -> PathBuf {
    if cfg!(windows) {
        if let Some(root) = std::env::var_os("SystemRoot") {
            let t = PathBuf::from(root).join("System32").join("tar.exe");
            if t.is_file() {
                return t;
            }
        }
    }
    PathBuf::from("tar")
}

/// The archive is flat (plus assets/, extension/); the installation is not.
/// Build the bin/ gui/ assets/ extension/ trees next to it, exactly as
/// install.sh arranges them. One `idm update` replaces all four atomically.
///
/// A tree is staged only when the archive actually carries something for it;
/// `swap_in` skips the ones that were not staged. An archive with no
/// extension/ (the Windows zip up to 2.1.9) says nothing about the extension,
/// and swapping in an empty directory left Chrome with no manifest to load.
fn arrange(unpack: &Path, stage: &Path) -> anyhow::Result<Vec<PathBuf>> {
    let bin = stage.join("bin.new");
    let gui = stage.join("gui.new");
    let assets = stage.join("assets.new");
    let extension = stage.join("extension.new");
    let exe = |n: &str| if cfg!(windows) { format!("{n}.exe") } else { n.to_string() };
    let bin_files = [exe("idm"), exe("idm-host")]
        .into_iter()
        .chain(BIN_SCRIPTS.iter().map(|s| s.to_string()));
    for name in bin_files {
        let src = unpack.join(&name);
        if src.is_file() {
            std::fs::create_dir_all(&bin)?;
            std::fs::copy(&src, bin.join(&name))?;
            make_executable(&bin.join(&name));
        }
    }
    if !bin.join(exe("idm")).is_file() {
        anyhow::bail!("archiv neobsahuje binárku idm — aktualizace zrušena");
    }
    let g = unpack.join("idm_gui.py");
    if g.is_file() {
        std::fs::create_dir_all(&gui)?;
        std::fs::copy(&g, gui.join("idm_gui.py"))?;
    }
    for a in ["idm.png", "idm.ico"] {
        let src = unpack.join("assets").join(a);
        if src.is_file() {
            std::fs::create_dir_all(&assets)?;
            std::fs::copy(&src, assets.join(a))?;
        }
    }
    // extension/ travels with the release so the browser extension is
    // refreshed by the same `idm update` that refreshes the engine and the
    // window. The user still has to reload the extension in the browser
    // (browsers do not let a native host do that), but the files on disk are
    // current after a single update.
    let ext_src = unpack.join("extension");
    if ext_src.join("manifest.json").is_file() {
        copy_dir_all(&ext_src, &extension)?;
    }
    Ok(vec![bin, gui, assets, extension])
}

/// Recursively copy a directory, creating parents as needed.
fn copy_dir_all(src: &Path, dst: &Path) -> anyhow::Result<()> {
    std::fs::create_dir_all(dst)?;
    for entry in std::fs::read_dir(src)? {
        let entry = entry?;
        let s = entry.path();
        let d = dst.join(entry.file_name());
        if s.is_dir() {
            copy_dir_all(&s, &d)?;
        } else {
            std::fs::copy(&s, &d)?;
        }
    }
    Ok(())
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
///
/// All or nothing: when a tree cannot be swapped, the renames already done
/// are put back (the new tree to its staging path, `<name>.old` to live)
/// before the error is returned. A new bin\ next to the old gui\ and the old
/// VERSION is the mixed install this exists to prevent.
fn swap_in(dir: &Path, trees: &[PathBuf]) -> Result<(), SwapError> {
    let mut done: Vec<Swapped> = Vec::new();
    for (i, name) in TREES.iter().enumerate() {
        let new = &trees[i];
        if !new.is_dir() {
            continue;
        }
        let live = dir.join(name);
        let old = dir.join(format!("{name}.old"));
        let fail = |done: &[Swapped], error| SwapError { tree: *name, error, undone: undo_swap(done) };
        // A bin.old an earlier update could not delete would make the rename
        // below fail: no platform renames a directory onto a non-empty one.
        if let Err(e) = discard(dir, &old) {
            return Err(fail(&done[..], e));
        }
        let had = live.exists();
        if had {
            if let Err(e) = rename(&live, &old) {
                return Err(fail(&done[..], e));
            }
        }
        if let Err(e) = rename(new, &live) {
            // Half of this tree's swap is done too: live already went to old.
            done.push(Swapped { live, staged: None, old: Some(old) });
            return Err(fail(&done[..], e));
        }
        done.push(Swapped { live, staged: Some(new.clone()), old: had.then_some(old) });
    }
    // VERSION moves with them, so --rollback restores the right number.
    let v = dir.join("VERSION");
    if v.is_file() {
        let _ = std::fs::copy(&v, dir.join("VERSION.old"));
    }
    Ok(())
}

/// One tree `swap_in` has moved: where its new version came from (now at
/// `live`), and where the version it replaced went.
struct Swapped {
    live: PathBuf,
    staged: Option<PathBuf>,
    old: Option<PathBuf>,
}

/// Put back what `swap_in` already did, newest first. True when every step
/// was undone, i.e. the installation is the one the update started from.
fn undo_swap(done: &[Swapped]) -> bool {
    let mut whole = true;
    for s in done.iter().rev() {
        if let Some(staged) = &s.staged {
            if rename(&s.live, staged).is_err() {
                // Moving the old tree back would need live empty.
                whole = false;
                continue;
            }
        }
        if let Some(old) = &s.old {
            if rename(old, &s.live).is_err() {
                whole = false;
            }
        }
    }
    whole
}

/// A swap that failed at `tree`, and whether what it had already done was
/// put back.
#[derive(Debug)]
struct SwapError {
    tree: &'static str,
    error: std::io::Error,
    undone: bool,
}

impl std::fmt::Display for SwapError {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        if self.undone {
            write!(
                f,
                "{} nelze vyměnit ({}); instalace zůstala beze změny",
                self.tree, self.error
            )
        } else {
            write!(
                f,
                "{} nelze vyměnit ({}) a vrátit předchozí stav se nepovedlo \
                 — zkus `idm update --rollback`",
                self.tree, self.error
            )
        }
    }
}

impl std::error::Error for SwapError {}

/// Get `path` out of the install directory: delete it, or -- when something
/// in it is still in use -- move it into the trash for `sweep_leftovers`.
/// Ok means `path` no longer exists.
fn discard(dir: &Path, path: &Path) -> std::io::Result<()> {
    if std::fs::symlink_metadata(path).is_err() {
        return Ok(());
    }
    let removed = if path.is_dir() {
        std::fs::remove_dir_all(path)
    } else {
        std::fs::remove_file(path)
    };
    if removed.is_ok() || std::fs::symlink_metadata(path).is_err() {
        return Ok(());
    }
    let name = path
        .file_name()
        .map(|n| n.to_string_lossy().to_string())
        .unwrap_or_else(|| "tree".into());
    let stamp = SystemTime::now()
        .duration_since(UNIX_EPOCH)
        .map(|d| d.as_nanos())
        .unwrap_or(0);
    let trash = dir.join(TRASH);
    let mut last = None;
    // Twice: a sweep in another process may remove an empty trash directory
    // between our create_dir_all and the rename.
    for i in 0..2 {
        std::fs::create_dir_all(&trash)?;
        match rename(path, &trash.join(format!("{name}-{stamp}-{i}"))) {
            Ok(()) => return Ok(()),
            Err(e) => last = Some(e),
        }
    }
    Err(last.unwrap_or_else(|| std::io::Error::other("discard failed")))
}

/// Delete what an earlier update could not, now that the processes holding
/// it may be gone. Runs at the start of every command except `update`.
///
/// The trash is always fair game. *.old trees are swept only when there is
/// no .update: a finished update removes its staging directory, an
/// interrupted one leaves it -- and then the .old trees are the rollback
/// copy, not litter. Stale bin.old from 2.1.9 and earlier (which left them
/// behind on Windows) has no .update next to it, so it goes too.
pub fn sweep_leftovers(dir: &Path) {
    let trash = dir.join(TRASH);
    if let Ok(entries) = std::fs::read_dir(&trash) {
        for e in entries.flatten() {
            let p = e.path();
            let _ = if p.is_dir() {
                std::fs::remove_dir_all(&p)
            } else {
                std::fs::remove_file(&p)
            };
        }
        // Fails while something is still in use, which is the point.
        let _ = std::fs::remove_dir(&trash);
    }
    if dir.join(".update").exists() {
        return;
    }
    for name in TREES.iter() {
        let _ = discard(dir, &dir.join(format!("{name}.old")));
        // What a rollback replaced and could not delete (Windows: the bin\
        // `idm update --rollback` was running from) is litter just the same.
        let _ = discard(dir, &dir.join(format!("{name}.rollback")));
    }
    let _ = std::fs::remove_file(dir.join("VERSION.old"));
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
        // Through discard(), not remove_dir_all: on Windows the tree being
        // replaced holds the running `idm update --rollback`, cannot be
        // deleted, and a bin.rollback left in place would make the next
        // rollback's rename fail. In the trash it waits for the sweep.
        discard(dir, &scratch)?;
        if live.exists() {
            rename(&live, &scratch)?;
        }
        rename(&old, &live)?;
        let _ = discard(dir, &scratch);
    }
    let vold = dir.join("VERSION.old");
    if vold.is_file() {
        let _ = std::fs::copy(&vold, dir.join("VERSION"));
        let _ = std::fs::remove_file(&vold);
    }
    // A rollback changes what is installed just as much as an update does.
    let now = installed_version(dir);
    if let Ok(text) = std::fs::read_to_string(dir.join("state").join("update.json")) {
        if let Ok(json) = serde_json::from_str::<serde_json::Value>(&text) {
            let latest = json
                .get("latest")
                .and_then(|v| v.as_str())
                .unwrap_or(&now)
                .to_string();
            let _ = write_cache(dir, &now, &latest);
        }
    }
    Ok(now)
}

// --- Windows: what holds bin\ ------------------------------------------------

/// Stop the native hosts that run from this installation's bin\, so bin\ can
/// be renamed.
///
/// Verified on a real Windows box: a running exe does not stop its directory
/// being renamed, but a process whose working directory is inside it does
/// ("used by another process"). Chrome starts the native host with its
/// working directory in the host's own folder, so with the browser open,
/// bin\idm-host.exe pinned bin\ and the update failed. The host keeps no
/// state -- the extension reconnects on its next message -- so it is simply
/// stopped. `idm.exe --serve` is not: its working directory is the install
/// root, and the window that owns it would lose its server.
///
/// No windows crate here, so PowerShell does the listing and the stopping,
/// with its console hidden. Every failure is ignored: when nothing could be
/// stopped, the rename that follows reports the real error.
fn stop_hosts(dir: &Path) {
    if !cfg!(windows) {
        return;
    }
    let bin = std::path::absolute(dir.join("bin")).unwrap_or_else(|_| dir.join("bin"));
    // Single quotes only: the script travels as one argv element, and double
    // quotes would have to survive two layers of Windows command-line quoting.
    let listing = powershell(
        "Get-CimInstance Win32_Process -Filter 'Name=''idm-host.exe''' \
         -ErrorAction SilentlyContinue | ForEach-Object { \
         $_.ProcessId.ToString() + [char]9 + $_.ExecutablePath }",
        None,
    );
    let pids = hosts_to_stop(&bin.to_string_lossy(), &listing, std::process::id());
    if pids.is_empty() {
        return;
    }
    let ids: Vec<String> = pids.iter().map(|p| p.to_string()).collect();
    // Waited for: the working directory is released when the process is gone,
    // not when it has been asked to go.
    powershell(
        "$ids = $env:IDM_STOP_PIDS -split ',' | ForEach-Object { [int]$_ }; \
         Stop-Process -Id $ids -Force -ErrorAction SilentlyContinue; \
         Wait-Process -Id $ids -Timeout 10 -ErrorAction SilentlyContinue",
        Some(&ids.join(",")),
    );
}

/// Run a PowerShell snippet and return its stdout ("" on any failure). The
/// pids travel in the environment, so nothing is ever interpolated into code.
fn powershell(script: &str, pids: Option<&str>) -> String {
    let exe = std::env::var_os("SystemRoot")
        .map(|r| {
            PathBuf::from(r)
                .join("System32")
                .join("WindowsPowerShell")
                .join("v1.0")
                .join("powershell.exe")
        })
        .filter(|p| p.is_file())
        .unwrap_or_else(|| PathBuf::from("powershell"));
    let mut cmd = std::process::Command::new(exe);
    cmd.hide_console()
        .args(["-NoProfile", "-NonInteractive", "-Command", script])
        .stdin(std::process::Stdio::null());
    if let Some(p) = pids {
        cmd.env("IDM_STOP_PIDS", p);
    }
    cmd.output()
        .map(|o| String::from_utf8_lossy(&o.stdout).to_string())
        .unwrap_or_default()
}

/// Which of the listed idm-host.exe processes run from `bin`: the pids of
/// `listing` lines (`<pid>\t<ExecutablePath>`) to stop before the swap.
///
/// Only a host directly in this bin\ qualifies -- the real Internet Download
/// Manager or another IDM installation is somebody else's -- and never this
/// process. Compared the way Windows compares paths: case-insensitive, either
/// separator.
fn hosts_to_stop(bin: &str, listing: &str, me: u32) -> Vec<u32> {
    let norm = |p: &str| p.trim().replace('/', "\\").to_lowercase();
    let want = format!("{}\\idm-host.exe", norm(bin).trim_end_matches('\\'));
    listing
        .lines()
        .filter_map(|line| {
            let (pid, path) = line.split_once('\t')?;
            let pid: u32 = pid.trim().parse().ok()?;
            (pid != me && norm(path) == want).then_some(pid)
        })
        .collect()
}

/// Whether a failed rename is worth trying again: access denied, a sharing or
/// a lock violation -- what Windows says while Defender scans a freshly
/// unpacked exe or an Explorer window looks into the tree, and stops saying a
/// moment later. Nowhere else: EACCES on Linux is a permission, and retrying
/// it only makes a failing update slower.
fn transient(e: &std::io::Error) -> bool {
    cfg!(windows) && matches!(e.raw_os_error(), Some(5 | 32 | 33))
}

/// Run `op` again, after a growing pause, while it fails with an error
/// `is_transient` accepts and `budget` is not spent.
fn retry_io<T>(
    budget: Duration,
    is_transient: impl Fn(&std::io::Error) -> bool,
    mut op: impl FnMut() -> std::io::Result<T>,
) -> std::io::Result<T> {
    let started = Instant::now();
    let mut pause = Duration::from_millis(25);
    loop {
        match op() {
            Err(e) if is_transient(&e) && started.elapsed() + pause <= budget => {
                std::thread::sleep(pause);
                pause = (pause * 2).min(Duration::from_millis(400));
            }
            r => return r,
        }
    }
}

/// How long a rename may keep failing transiently before the failure counts.
const RENAME_BUDGET: Duration = Duration::from_secs(2);

/// `std::fs::rename`, patient with what Windows means only for a moment.
fn rename(from: &Path, to: &Path) -> std::io::Result<()> {
    retry_io(RENAME_BUDGET, transient, || std::fs::rename(from, to))
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

    // --- which hosts the swap stops ---------------------------------------

    const BIN: &str = r"C:\Users\u\.idm\bin";

    #[test]
    fn a_host_running_from_bin_is_stopped() {
        let listing = "4242\tC:\\Users\\u\\.idm\\bin\\idm-host.exe\n";
        assert_eq!(hosts_to_stop(BIN, listing, 1), vec![4242]);
    }

    #[test]
    fn the_path_is_compared_the_way_windows_compares_it() {
        // Case-insensitive, either separator: Win32_Process reports what the
        // process was started with, and IDM_DIR may be spelled differently.
        let listing = "7\tc:/users/U/.IDM/BIN/IDM-HOST.EXE\r\n";
        assert_eq!(hosts_to_stop(BIN, listing, 1), vec![7]);
        assert_eq!(hosts_to_stop(&format!("{BIN}\\"), listing, 1), vec![7]);
    }

    #[test]
    fn a_host_of_another_installation_is_left_alone() {
        // The real Internet Download Manager, a second IDM checkout, a
        // directory whose name merely starts with "bin".
        let listing = [
            "10\tC:\\Program Files\\IDM\\idm-host.exe",
            "11\tC:\\Users\\u\\.idm\\bin2\\idm-host.exe",
            "12\tC:\\Users\\u\\.idm\\idm-host.exe",
            "13\tC:\\Users\\u\\other\\.idm\\bin\\idm-host.exe",
        ]
        .join("\n");
        assert!(hosts_to_stop(BIN, &listing, 1).is_empty());
    }

    #[test]
    fn the_updater_never_stops_itself_or_a_line_it_cannot_read() {
        let listing = [
            "99\tC:\\Users\\u\\.idm\\bin\\idm-host.exe",
            // ExecutablePath is empty for a process of another user.
            "15\t",
            "not-a-pid\tC:\\Users\\u\\.idm\\bin\\idm-host.exe",
            "",
        ]
        .join("\n");
        assert!(hosts_to_stop(BIN, &listing, 99).is_empty());
    }

    // --- retrying a rename ------------------------------------------------

    fn denied() -> std::io::Error {
        std::io::Error::from(std::io::ErrorKind::PermissionDenied)
    }

    #[test]
    fn a_transient_error_is_retried_until_it_clears() {
        let mut calls = 0;
        let r = retry_io(Duration::from_secs(2), |_| true, || {
            calls += 1;
            if calls < 3 { Err(denied()) } else { Ok(calls) }
        });
        assert_eq!(r.ok(), Some(3), "the third attempt succeeded");
    }

    #[test]
    fn a_permanent_error_is_not_retried() {
        let mut calls = 0;
        let r: std::io::Result<()> = retry_io(Duration::from_secs(2), |_| false, || {
            calls += 1;
            Err(denied())
        });
        assert!(r.is_err());
        assert_eq!(calls, 1);
    }

    #[test]
    fn retrying_stops_when_the_budget_is_spent() {
        let started = Instant::now();
        let mut calls = 0;
        let r: std::io::Result<()> = retry_io(Duration::from_millis(300), |_| true, || {
            calls += 1;
            Err(denied())
        });
        assert!(r.is_err());
        assert!(calls > 1, "it must have retried at least once");
        assert!(started.elapsed() < Duration::from_secs(2), "{:?}", started.elapsed());
    }

    #[cfg(windows)]
    #[test]
    fn a_sharing_violation_and_access_denied_are_transient() {
        // ERROR_ACCESS_DENIED, ERROR_SHARING_VIOLATION, ERROR_LOCK_VIOLATION:
        // what a Defender scan or an Explorer window holding the tree gives.
        for code in [5, 32, 33] {
            assert!(transient(&std::io::Error::from_raw_os_error(code)), "{code}");
        }
        assert!(!transient(&std::io::Error::from_raw_os_error(2)), "not found is final");
    }

    #[cfg(not(windows))]
    #[test]
    fn nothing_is_transient_off_windows() {
        // EACCES on Linux is a permission, not a scanner: retrying it only
        // makes a failing update slower.
        assert!(!transient(&std::io::Error::from_raw_os_error(13)));
    }
}
