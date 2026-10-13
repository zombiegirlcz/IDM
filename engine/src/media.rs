// media.rs — yt-dlp backend: media detection, format listing and downloads.
//
// Used by the engine when a URL is a stream / known media site (or when
// --force-media is given). The yt-dlp binary is configurable via --yt-dlp, so
// tests can substitute a stub script and nothing here needs the network.

use anyhow::{bail, Context};
use std::path::{Path, PathBuf};

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

fn apply_auth(cmd: &mut tokio::process::Command, cookie: Option<&str>, referer: Option<&str>) {
    if let Some(c) = cookie {
        cmd.arg("--add-header").arg(format!("Cookie: {}", c));
    }
    if let Some(r) = referer {
        cmd.arg("--referer").arg(r);
    }
}

/// Run `yt-dlp -J` and return the parsed metadata JSON.
pub async fn probe_json(
    yt_dlp: &Path,
    url: &str,
    cookie: Option<&str>,
    referer: Option<&str>,
    proxy: Option<&str>,
) -> anyhow::Result<serde_json::Value> {
    let mut cmd = tokio::process::Command::new(yt_dlp);
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
) -> anyhow::Result<PathBuf> {
    let mut cmd = tokio::process::Command::new(yt_dlp);
    cmd.arg("--no-playlist").arg("--no-warnings");
    if let Some(p) = proxy {
        cmd.arg("--proxy").arg(p);
    }
    if let Some(f) = format {
        cmd.arg("-f").arg(f);
    }
    if limit_rate > 0 {
        cmd.arg("--limit-rate").arg(limit_rate.to_string());
    }
    if continue_ {
        cmd.arg("--continue");
    }
    apply_auth(&mut cmd, cookie, referer);
    cmd.arg("-o").arg(out);
    // `--` so a URL starting with `-` is never parsed as an option.
    cmd.arg("--").arg(url);
    let status = cmd
        .status()
        .await
        .with_context(|| format!("running {}", yt_dlp.display()))?;
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
    let mut best: Option<(std::time::SystemTime, PathBuf)> = None;
    for e in std::fs::read_dir(dir).ok()?.flatten() {
        let p = e.path();
        if p.file_stem() != Some(stem.as_os_str()) || !p.is_file() {
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
    fn sanitize_strips_path_separators() {
        assert_eq!(sanitize("a/b\\c"), "a_b_c");
        assert_eq!(sanitize("   "), "download");
    }
}