// media.rs — yt-dlp backend: media detection, format listing and downloads.
//
// Used by the engine when a URL is a stream / known media site (or when
// --force-media is given). The yt-dlp binary is configurable via --yt-dlp, so
// tests can substitute a stub script and nothing here needs the network.

use anyhow::{bail, Context};
use std::path::{Path, PathBuf};
use crate::console::HideConsole;

/// Hosts where a plain HTTP download is the wrong tool.
const MEDIA_HOSTS: &[&str] = &[
    "youtube.com",
    "youtu.be",
    "vimeo.com",
    "dailymotion.com",
    "twitch.tv",
    "tiktok.com",
    "twitter.com",
    "x.com",
    "facebook.com",
    "fb.watch",
    "instagram.com",
    "soundcloud.com",
    "bilibili.com",
    "streamable.com",
    "reddit.com",
    "nicovideo.jp",
    "bandcamp.com",
    "mixcloud.com",
];

/// Streaming manifest extensions (HLS / DASH / HDS).
const MEDIA_EXTS: &[&str] = &[".m3u8", ".mpd", ".f4m"];

/// The path component of a URL (everything after `host[:port]`), query and
/// fragment stripped. For `https://x.example/a/b/?q#f` this is `a/b/`.
fn url_path(url: &str) -> String {
    let no_frag = url.split('#').next().unwrap_or(url);
    let no_query = no_frag.split('?').next().unwrap_or(no_frag);
    let after_scheme = match no_query.split_once("://") {
        Some((_, rest)) => rest,
        None => no_query,
    };
    match after_scheme.split_once('/') {
        Some((_, path)) => path.to_string(),
        None => String::new(),
    }
}

/// The last non-empty path segment of a URL (never the host), or the host when
/// the URL has no path at all (`https://x.example` -> `x.example`).
fn last_segment(url: &str) -> String {
    let path = url_path(url);
    match path.split('/').rev().find(|s| !s.is_empty()) {
        Some(seg) => seg.to_string(),
        None => {
            // No path: fall back to the authority (host[:port]) so a bare host
            // still yields a usable name.
            let no_frag = url.split('#').next().unwrap_or(url);
            let no_query = no_frag.split('?').next().unwrap_or(no_frag);
            let after_scheme = match no_query.split_once("://") {
                Some((_, rest)) => rest,
                None => no_query,
            };
            let authority = after_scheme.split(['/', '?', '#']).next().unwrap_or("");
            let host = authority.rsplit('@').next().unwrap_or(authority);
            host.split(':').next().unwrap_or(host).to_string()
        }
    }
}

/// True when the URL's last path segment carries a file extension.
///
/// A URL *with* one (`/file.mp4`, `/archive.zip`) names a file and is fetched
/// directly; one *without* it (`/watch/123`, `/videos/1062766/slug/`) names a
/// page, and if the server then answers `text/html` it is a web page, not a
/// file to save (see `run()` in main.rs).
///
/// A trailing dot counts as "no extension" (a Windows-hostile name we must not
/// invent ourselves).
pub fn has_file_extension(url: &str) -> bool {
    // Only the PATH can name a file. A bare host (`https://x.example/`) has no
    // path segment and therefore no extension, even though the host has a dot.
    let path = url_path(url);
    let seg = match path.split('/').rev().find(|s| !s.is_empty()) {
        Some(s) => s,
        None => return false,
    };
    match seg.rsplit_once('.') {
        Some((stem, ext)) => !stem.is_empty() && !ext.is_empty(),
        None => false,
    }
}

/// True when `url` looks like a media/stream URL rather than a plain file.
pub fn is_media_url(url: &str) -> bool {
    let u = url.to_ascii_lowercase();
    if MEDIA_EXTS.iter().any(|e| u.contains(e)) {
        return true;
    }
    if let Some(pos) = u.find("://") {
        let rest = &u[pos + 3..];
        let authority = rest.split(['/', '?', '#']).next().unwrap_or("");
        let host = authority.rsplit('@').next().unwrap_or(authority);
        let host = host.split(':').next().unwrap_or(host);
        for h in MEDIA_HOSTS {
            if host == *h || host.ends_with(&format!(".{}", h)) {
                return true;
            }
        }
    }
    false
}

/// True when the configured yt-dlp binary can actually be run.
///
/// A bare name (`yt-dlp`) is looked up on PATH; an explicit path is checked
/// directly. This gates the HTML-page -> media-backend switch in main.rs so a
/// machine without yt-dlp still saves web pages the plain way instead of
/// failing on a missing backend.
pub fn yt_dlp_available(bin: &Path) -> bool {
    let s = bin.to_string_lossy();
    let has_sep = s.contains('/') || s.contains('\\');
    if has_sep || bin.is_absolute() {
        return bin.is_file();
    }
    if let Ok(path) = std::env::var("PATH") {
        for dir in std::env::split_paths(&path) {
            if dir.join(s.as_ref()).is_file() {
                return true;
            }
            #[cfg(windows)]
            if dir.join(format!("{}.exe", s)).is_file() {
                return true;
            }
        }
    }
    false
}

fn apply_auth(cmd: &mut tokio::process::Command, cookie: Option<&str>, referer: Option<&str>) {
    if let Some(c) = cookie {
        cmd.arg("--add-header").arg(format!("Cookie: {}", c));
    }
    if let Some(r) = referer {
        cmd.arg("--referer").arg(r);
    }
}

/// Run `yt-dlp -J` and return the parsed metadata JSON.
/// How hard to pull. A fragmented format (DASH, HLS) arrives in hundreds of
/// pieces, and one at a time is why a 450 MB video can take an hour and a
/// half; `connections` is the number the user already set, so it is the
/// natural answer for both knobs here.
/// What to ask yt-dlp for when the user did not say.
///
/// Prefer mp4 video with m4a audio, then any mp4, then whatever exists: the
/// last step matters, because a format-only selector would fail outright on
/// sites that have no mp4 at all.
pub const DEFAULT_FORMAT: &str =
    "bv*[ext=mp4]+ba[ext=m4a]/b[ext=mp4]/bv*+ba/b";

pub struct Speed {
    /// Parallel fragments for yt-dlp's own downloader.
    pub connections: usize,
    /// aria2c, when the user asked for it: yt-dlp resolves the media URL and
    /// hands the actual transfer over.
    pub aria2c: Option<std::path::PathBuf>,
}

fn apply_speed(cmd: &mut tokio::process::Command, speed: &Speed) {
    let n = speed.connections.max(1);
    if let Some(aria2c) = &speed.aria2c {
        // yt-dlp calls it --downloader (--external-downloader is the old
        // alias). The args go per-downloader, hence the "aria2c:" prefix.
        cmd.arg("--downloader").arg(aria2c);
        cmd.arg("--downloader-args")
            .arg(format!("aria2c:-x {} -s {} -k 1M --file-allocation=none", n, n));
    }
    // Harmless next to aria2c (which then does the splitting) and the whole
    // difference on the plain path.
    cmd.arg("--concurrent-fragments").arg(n.to_string());
}

/// yt-dlp needs the URL, never the server password: whatever variable
/// `--auth-env` named is removed from the child's environment, so it cannot be
/// read out of /proc/<child>/environ either.
fn scrub_auth_env(cmd: &mut tokio::process::Command, auth_env: Option<&str>) {
    if let Some(name) = auth_env {
        cmd.env_remove(name);
    }
}

pub async fn probe_json(
    yt_dlp: &Path,
    url: &str,
    cookie: Option<&str>,
    referer: Option<&str>,
    proxy: Option<&str>,
    auth_env: Option<&str>,
) -> anyhow::Result<serde_json::Value> {
    let mut cmd = tokio::process::Command::new(yt_dlp);
    cmd.hide_console();
    scrub_auth_env(&mut cmd, auth_env);
    cmd.arg("-J").arg("--no-playlist").arg("--no-warnings");
    apply_auth(&mut cmd, cookie, referer);
    if let Some(p) = proxy {
        cmd.arg("--proxy").arg(p);
    }
    cmd.arg(url);
    let out = cmd
        .output()
        .await
        .with_context(|| format!("running {} -J", yt_dlp.display()))?;
    if !out.status.success() {
        bail!(
            "yt-dlp -J failed: {}",
            String::from_utf8_lossy(&out.stderr).trim()
        );
    }
    let v: serde_json::Value =
        serde_json::from_slice(&out.stdout).context("parsing yt-dlp -J output")?;
    Ok(v)
}

fn kind_of(vcodec: &str, acodec: &str) -> &'static str {
    let has_v = !vcodec.is_empty() && vcodec != "none";
    let has_a = !acodec.is_empty() && acodec != "none";
    match (has_v, has_a) {
        (true, true) => "video+audio",
        (true, false) => "video",
        (false, true) => "audio",
        _ => "other",
    }
}

/// Compact, UI-friendly summary of a yt-dlp metadata blob.
pub fn summarize(meta: &serde_json::Value) -> serde_json::Value {
    let mut list = Vec::new();
    if let Some(arr) = meta.get("formats").and_then(|v| v.as_array()) {
        for f in arr {
            let vcodec = f.get("vcodec").and_then(|v| v.as_str()).unwrap_or("none");
            let acodec = f.get("acodec").and_then(|v| v.as_str()).unwrap_or("none");
            list.push(serde_json::json!({
                "format_id": f.get("format_id"),
                "ext": f.get("ext"),
                "resolution": f.get("resolution"),
                "vcodec": vcodec,
                "acodec": acodec,
                "filesize": f.get("filesize"),
                "note": f.get("format_note"),
                "kind": kind_of(vcodec, acodec),
            }));
        }
    }
    serde_json::json!({
        "id": meta.get("id"),
        "title": meta.get("title"),
        "ext": meta.get("ext"),
        "formats": list,
    })
}

/// File name for a plain URL, used as the default `--output` and by the GUI
/// queue. Unlike a naive `rsplit('/')`, a URL ending in `/` or `/?query` does
/// not collapse to an empty string: the last *non-empty* path segment wins, so
/// `https://x/some-slug/?utm=1` becomes `some-slug` instead of `download.bin`.
pub fn filename_from_url(url: &str) -> String {
    let name = sanitize(&last_segment(url));
    if name.is_empty() || name == "download" || name == "." || name == ".." {
        "download.bin".to_string()
    } else {
        name
    }
}

/// Make a filesystem-safe file name (no path separators).
pub fn sanitize(name: &str) -> String {
    let s: String = name
        .chars()
        .map(|c| {
            if c.is_alphanumeric() || " .-_()[]".contains(c) {
                c
            } else {
                '_'
            }
        })
        .collect();
    let s = s.trim().to_string();
    if s.is_empty() {
        "download".to_string()
    } else {
        s
    }
}

/// Derive `<title>.<ext>` from metadata, honouring an explicit format id.
pub fn output_name(meta: &serde_json::Value, format: Option<&str>) -> PathBuf {
    let title = meta
        .get("title")
        .and_then(|v| v.as_str())
        .unwrap_or("download");
    let ext = format
        .and_then(|fid| {
            meta.get("formats").and_then(|v| v.as_array()).and_then(|a| {
                a.iter()
                    .find(|f| f.get("format_id").and_then(|v| v.as_str()) == Some(fid))
            })
        })
        .and_then(|f| f.get("ext").and_then(|v| v.as_str()))
        .map(String::from)
        .or_else(|| meta.get("ext").and_then(|v| v.as_str()).map(String::from))
        .unwrap_or_else(|| "mp4".to_string());
    PathBuf::from(format!("{}.{}", sanitize(title), ext))
}

/// Download via yt-dlp into `out`; returns the file that was actually written.
#[allow(clippy::too_many_arguments)]
pub async fn download(
    yt_dlp: &Path,
    url: &str,
    out: &Path,
    format: Option<&str>,
    limit_rate: u64,
    continue_: bool,
    cookie: Option<&str>,
    referer: Option<&str>,
    proxy: Option<&str>,
    auth_env: Option<&str>,
    speed: Speed,
) -> anyhow::Result<PathBuf> {
    let mut cmd = tokio::process::Command::new(yt_dlp);
    cmd.hide_console();
    scrub_auth_env(&mut cmd, auth_env);
    cmd.arg("--no-playlist").arg("--no-warnings");
    apply_speed(&mut cmd, &speed);
    if let Some(p) = proxy {
        cmd.arg("--proxy").arg(p);
    }
    // yt-dlp's own default is "best", which on YouTube means VP9/Opus in a
    // webm container -- a file plenty of players and editors will not touch.
    // A general-purpose downloader should hand back an mp4 unless it was
    // asked for something else, so mp4 is preferred and the fallbacks keep
    // the download working when no mp4 exists.
    cmd.arg("-f").arg(format.unwrap_or(DEFAULT_FORMAT));
    // Where a merge is needed anyway, merge into mp4.
    if format.is_none() {
        cmd.arg("--merge-output-format").arg("mp4");
    }
    if limit_rate > 0 {
        cmd.arg("--limit-rate").arg(limit_rate.to_string());
    }
    if continue_ {
        cmd.arg("--continue");
    }
    apply_auth(&mut cmd, cookie, referer);
    cmd.arg("-o").arg(out);
    // One progress line per update instead of a carriage-returned bar, so it
    // can be read line by line. Without this the whole bar arrives as a
    // single enormous line and the queue learns nothing until the end.
    cmd.arg("--newline");
    // `--` so a URL starting with `-` is never parsed as an option.
    cmd.arg("--").arg(url);
    // yt-dlp's progress is the only thing that can tell the window how far
    // along a media download is; sending it to /dev/null is what made a
    // working download look identical to a hung one.
    cmd.stdout(std::process::Stdio::piped());
    let mut child = cmd
        .spawn()
        .with_context(|| format!("running {}", yt_dlp.display()))?;
    if let Some(stdout) = child.stdout.take() {
        use tokio::io::{AsyncBufReadExt, BufReader};
        let meta = progress_meta_path(out);
        let mut lines = BufReader::new(stdout).lines();
        while let Ok(Some(line)) = lines.next_line().await {
            // Pass it through: in a terminal this is the progress the user
            // expects to see.
            println!("{}", line);
            if let Some(p) = parse_progress(&line) {
                write_progress_meta(&meta, p);
            }
        }
    }
    let status = child
        .wait()
        .await
        .with_context(|| format!("waiting for {}", yt_dlp.display()))?;
    // The sidecar is the queue's view of a download in flight; once it has
    // finished, the real file is the truth.
    let _ = std::fs::remove_file(progress_meta_path(out));
    if !status.success() {
        bail!("yt-dlp exited with {}", status);
    }
    if out.exists() {
        return Ok(out.to_path_buf());
    }
    // yt-dlp's merger picks the container, so `video.mp4` can legitimately come
    // out as `video.webm` / `video.mkv`. Find the file it actually wrote before
    // declaring failure.
    if let Some(actual) = sibling_with_stem(out) {
        return Ok(actual);
    }
    bail!("yt-dlp reported success but {} was not created", out.display())
}

/// Newest `<stem>.*` file next to `out` (the file yt-dlp really produced).
fn sibling_with_stem(out: &Path) -> Option<PathBuf> {
    let dir = match out.parent() {
        Some(p) if !p.as_os_str().is_empty() => p.to_path_buf(),
        _ => PathBuf::from("."),
    };
    let stem = out.file_stem()?.to_owned();
    // yt-dlp may REPLACE the extension (video.mp4 -> video.webm) or APPEND
    // one (video.mp4 -> video.mp4.webm); which of the two depends on the
    // format it merged. Only the first was handled, so a finished 723 MB
    // download was reported as "was not created" -- and in the queue that
    // means an error, a retry, and the whole video fetched again.
    let full = out.file_name()?.to_owned();
    let mut best: Option<(std::time::SystemTime, PathBuf)> = None;
    for e in std::fs::read_dir(dir).ok()?.flatten() {
        let p = e.path();
        if !p.is_file() {
            continue;
        }
        let matches_stem = p.file_stem() == Some(stem.as_os_str());
        // The appended case: the whole requested name is this file's stem.
        let matches_full = p.file_stem() == Some(full.as_os_str());
        if !matches_stem && !matches_full {
            continue;
        }
        // Skip yt-dlp's own leftovers (.part, .ytdl).
        if matches!(
            p.extension().and_then(|x| x.to_str()),
            Some("part") | Some("ytdl")
        ) {
            continue;
        }
        let mtime = e
            .metadata()
            .and_then(|m| m.modified())
            .unwrap_or(std::time::UNIX_EPOCH);
        if best.as_ref().map(|(t, _)| mtime > *t).unwrap_or(true) {
            best = Some((mtime, p));
        }
    }
    best.map(|(_, p)| p)
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn detects_media_urls() {
        assert!(is_media_url("https://www.youtube.com/watch?v=abc"));
        assert!(is_media_url("https://youtu.be/abc"));
        assert!(is_media_url("https://example.com/master.m3u8"));
        assert!(is_media_url("https://cdn.example.com/x.mpd?token=1"));
        assert!(!is_media_url("https://example.com/file.zip"));
        assert!(!is_media_url("https://example.com/file.mp4"));
        assert!(!is_media_url("https://notyoutube.com/file.bin"));
    }

    #[test]
    fn summarizes_formats_with_kind() {
        let meta = serde_json::json!({
            "id": "abc",
            "title": "T",
            "ext": "mp4",
            "formats": [
                {"format_id":"22","ext":"mp4","resolution":"1280x720","vcodec":"avc1","acodec":"aac","filesize":1000,"format_note":"720p"},
                {"format_id":"140","ext":"m4a","resolution":"audio only","vcodec":"none","acodec":"mp4a"}
            ]
        });
        let s = summarize(&meta);
        assert_eq!(s["title"], "T");
        let f = s["formats"].as_array().unwrap();
        assert_eq!(f.len(), 2);
        assert_eq!(f[0]["kind"], "video+audio");
        assert_eq!(f[1]["kind"], "audio");
    }

    #[test]
    fn output_name_uses_title_and_format_ext() {
        let meta = serde_json::json!({
            "title": "My: Video / Clip",
            "ext": "mp4",
            "formats": [{"format_id":"140","ext":"m4a"}]
        });
        assert_eq!(output_name(&meta, None), PathBuf::from("My_ Video _ Clip.mp4"));
        assert_eq!(output_name(&meta, Some("140")), PathBuf::from("My_ Video _ Clip.m4a"));
    }

    #[test]
    fn yt_dlp_available_checks_path_and_explicit_paths() {
        // An explicit path that does not exist is unavailable.
        assert!(!yt_dlp_available(Path::new("/nonexistent/yt-dlp")));
        // A binary that exists is available.
        assert!(yt_dlp_available(Path::new("/bin/sh")));
        // A bare name that is not installed is unavailable.
        assert!(!yt_dlp_available(Path::new("definitely-not-installed-xyz")));
    }

    #[test]
    fn sanitize_strips_path_separators() {
        assert_eq!(sanitize("a/b\\c"), "a_b_c");
        assert_eq!(sanitize("   "), "download");
    }

    #[test]
    fn filename_from_url_keeps_the_slug_before_query_and_slash() {
        // The bug that produced `download.bin` (a real video-page URL).
        assert_eq!(
            filename_from_url(
                "https://www.lesbian8.com/videos/1062766/experiences-this-babe/?utm_source=donnie"
            ),
            "experiences-this-babe"
        );
        // Trailing slash with a query right after it.
        assert_eq!(
            filename_from_url("https://x.example/charma-kelley/?utm_source=donnie"),
            "charma-kelley"
        );
        // Plain file names still work.
        assert_eq!(filename_from_url("https://x.example/a/b/file.zip"), "file.zip");

        // A URL with an extension is a file; one without is a page.
        assert!(has_file_extension("https://x.example/a/file.zip"));
        assert!(!has_file_extension("https://x.example/videos/1062766/slug/"));
        assert!(!has_file_extension("https://x.example/watch?v=abc"));
        assert!(!has_file_extension("https://x.example/"));
        // A dotless segment with a trailing dot is NOT a file either.
        assert!(!has_file_extension("https://x.example/weird."));
        // A bare host (or a root URL) has no path segment, so the host itself
        // is the most useful name -- better than a generic `download.bin`.
        assert_eq!(filename_from_url("https://x.example/"), "x.example");
        assert_eq!(filename_from_url("https://x.example"), "x.example");
        // A truly empty string still falls back safely.
        assert_eq!(filename_from_url(""), "download.bin");
    }
}

/// Where the queue looks for a running download's progress.
fn progress_meta_path(out: &Path) -> std::path::PathBuf {
    let mut s = out.as_os_str().to_os_string();
    s.push(".idmmeta");
    std::path::PathBuf::from(s)
}

/// Write the sidecar the queue reads (total + one segment's downloaded).
///
/// The shape matches what the Range downloader writes, because gui.rs reads
/// one format and should not have to learn a second.
fn write_progress_meta(path: &Path, p: Progress) {
    let downloaded = ((p.total as f64) * (p.percent / 100.0)) as u64;
    let body = serde_json::json!({
        "url": "",
        "total": p.total,
        "connections": 1,
        "segments": [{"start": 0, "end": p.total, "downloaded": downloaded}],
    })
    .to_string();
    // Written whole and renamed: a reader polling every 300 ms must never
    // catch a half-written file.
    let tmp = path.with_extension("idmmeta.tmp");
    if std::fs::write(&tmp, body).is_ok() {
        let _ = std::fs::rename(&tmp, path);
    }
}

/// One line of yt-dlp progress, as the queue needs it.
#[derive(Debug, Clone, Copy, PartialEq)]
pub struct Progress {
    pub percent: f64,
    pub total: u64,
}

/// Parse a `[download] ... % of ... ` line, or None for anything else.
///
/// Without this a yt-dlp download shows no size, no speed and no ETA in the
/// window for its whole duration, which is indistinguishable from a download
/// that has hung -- and that is exactly how it was reported.
pub fn parse_progress(line: &str) -> Option<Progress> {
    let rest = line.trim().strip_prefix("[download]")?.trim_start();
    let (pct_str, rest) = rest.split_once('%')?;
    let percent: f64 = pct_str.trim().parse().ok()?;
    // " of  100.00MiB at ..." -- the tilde appears when the size is an
    // estimate, which it is for most fragmented formats.
    let rest = rest.trim_start().strip_prefix("of")?.trim_start();
    let size = rest.trim_start_matches('~');
    let end = size
        .find(|c: char| c.is_whitespace())
        .unwrap_or(size.len());
    let total = parse_size(&size[..end])?;
    Some(Progress { percent, total })
}

/// "100.00MiB" -> bytes. yt-dlp uses binary units.
fn parse_size(s: &str) -> Option<u64> {
    let digits_end = s
        .find(|c: char| !c.is_ascii_digit() && c != '.')
        .unwrap_or(s.len());
    let value: f64 = s[..digits_end].parse().ok()?;
    let mult: f64 = match s[digits_end..].trim() {
        "" | "B" => 1.0,
        "KiB" | "K" => 1024.0,
        "MiB" | "M" => 1024.0 * 1024.0,
        "GiB" | "G" => 1024.0 * 1024.0 * 1024.0,
        "TiB" | "T" => 1024.0_f64.powi(4),
        _ => return None,
    };
    Some((value * mult) as u64)
}

#[cfg(test)]
mod progress_tests {
    use super::*;

    #[test]
    fn real_yt_dlp_lines_are_understood() {
        let cases: &[(&str, f64, u64)] = &[
            ("[download]   0.0% of  100.00MiB at  Unknown B/s ETA Unknown", 0.0, 104_857_600),
            ("[download]  45.2% of  100.00MiB at   1.50MiB/s ETA 00:30", 45.2, 104_857_600),
            // The tilde marks an estimated size, which fragmented formats give.
            ("[download]  45.2% of ~100.00MiB at   1.50MiB/s ETA 00:30", 45.2, 104_857_600),
            ("[download] 100% of  100.00MiB in 00:01:23", 100.0, 104_857_600),
            ("[download]   3.1% of    1.50GiB at   5.00MiB/s ETA 05:00", 3.1, 1_610_612_736),
            ("[download]  12.0% of  512.00KiB at 100.00KiB/s ETA 00:05", 12.0, 524_288),
        ];
        for (line, pct, total) in cases {
            let got = parse_progress(line).unwrap_or_else(|| panic!("not parsed: {:?}", line));
            assert!((got.percent - pct).abs() < 0.05, "{:?}: {}", line, got.percent);
            assert_eq!(got.total, *total, "{:?}", line);
        }
    }

    #[test]
    fn everything_else_is_ignored() {
        for line in [
            "[youtube] Extracting URL: https://...",
            "[info] Downloading 1 format(s): 299+140",
            "[Merger] Merging formats into \"video.mp4\"",
            "",
            "[download] Destination: video.f299.mp4",
            // A percentage with no size is no use to the queue.
            "[download]  45.2%",
        ] {
            assert!(parse_progress(line).is_none(), "parsed: {:?}", line);
        }
    }

    #[test]
    fn an_unknown_unit_is_not_guessed_at() {
        assert!(parse_size("100.00XiB").is_none());
    }
}
