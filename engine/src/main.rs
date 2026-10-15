// idm-engine — multi-connection HTTP(S) downloader with resume + media backend.
// Proof of concept for the IDM-like engine (see ../ENGINE_SPEC.md).
//
// Two download paths:
//   * direct: multi-connection HTTP Range with resume (the IDM core)
//   * media:  yt-dlp backend for HLS/DASH and known media sites, with format
//             listing (--list-formats) and selection (--format)

use clap::Parser;
use futures_util::StreamExt;
use serde::{Deserialize, Serialize};
use std::collections::{HashMap, VecDeque};
use std::path::{Path, PathBuf};
use std::sync::atomic::{AtomicBool, AtomicU64, AtomicUsize, Ordering};
use std::sync::Arc;
use tokio::fs::OpenOptions as TokioOpenOptions;
use tokio::sync::{Mutex, Semaphore};
use crate::console::HideConsole;

mod console;
mod gui;
mod media;
mod secrets;
mod update;
mod verbs;

#[derive(Parser, Debug)]
#[command(name = "idm", version, about = "Multi-connection downloader with resume (IDM-like POC)")]
#[command(after_help = verbs::AFTER_HELP)]
struct Args {
    /// URL to download
    url: Option<String>,

    /// Output path (default: last path segment of URL, or media title)
    #[arg(short, long)]
    output: Option<PathBuf>,

    /// Write a JSON summary of the finished download here
    ///
    /// The queue spawns this binary with stdout discarded, so the "done -> X"
    /// line never reaches it. yt-dlp's merger also picks its own container, so
    /// the file that appears is often not the one `-o` asked for. This is how
    /// the caller learns what was really written, and how big it is.
    #[arg(long)]
    report: Option<PathBuf>,

    /// Number of parallel connections
    #[arg(short = 'n', long, default_value_t = 4)]
    connections: usize,

    /// Resume from a previous partial download
    #[arg(long, default_value_t = false)]
    resume: bool,

    /// User-Agent header
    #[arg(long, default_value = "Mozilla/5.0 (compatible; idm-engine/0.1)")]
    user_agent: String,

    /// Path to the yt-dlp binary (used with --yt-dlp)
    ///
    /// This used to be spelled --yt-dlp, which read like a switch next to
    /// --aria2 and silently swallowed the URL that followed it. The pair now
    /// mirrors aria2: --yt-dlp chooses the backend, --yt-dlp-path says where
    /// the binary is.
    #[arg(long = "yt-dlp-path", default_value = "yt-dlp")]
    yt_dlp_path: PathBuf,

    /// Use yt-dlp for this URL, even if it does not look like media
    #[arg(long = "yt-dlp", default_value_t = false)]
    yt_dlp: bool,

    /// Delegate the download to aria2c instead of the built-in Range engine
    #[arg(long, default_value_t = false)]
    aria2: bool,

    /// Path to the aria2c binary (used with --aria2)
    #[arg(long, default_value = "aria2c")]
    aria2_path: PathBuf,

    /// Script that installs aria2c when it is missing (used with --aria2)
    #[arg(long, default_value = "")]
    ensure_aria2: String,

    /// Never use yt-dlp; always download the URL directly
    #[arg(long, default_value_t = false)]
    no_media: bool,

    /// Always use yt-dlp, even for URLs that do not look like media
    #[arg(long, default_value_t = false)]
    force_media: bool,

    /// yt-dlp format selector (e.g. 22, 137+140, bestvideo+bestaudio)
    #[arg(long)]
    format: Option<String>,

    /// Print available formats as JSON and exit
    #[arg(long, default_value_t = false)]
    list_formats: bool,

    /// Speed limit in bytes/second (0 = unlimited)
    #[arg(long, default_value_t = 0)]
    limit_rate: u64,

    /// Raw Cookie header value sent with requests
    #[arg(long)]
    cookie: Option<String>,

    /// Referer header sent with requests
    #[arg(long)]
    referer: Option<String>,

    /// Route requests through a proxy, e.g. http://127.0.0.1:8080 or socks5://host:1080
    #[arg(long)]
    proxy: Option<String>,

    /// HTTP basic credentials as USER:PASSWORD (the GUI's Site Logins tab)
    #[arg(long)]
    auth: Option<String>,

    /// Name of an environment variable holding USER:PASSWORD, read instead of
    /// --auth. Process arguments are world-readable through `ps` and
    /// /proc/<pid>/cmdline; a variable is not, so this is how the GUI passes a
    /// password. Takes precedence over --auth, and is unset from our own
    /// environment once read so that yt-dlp and aria2c do not inherit it.
    #[arg(long)]
    auth_env: Option<String>,

    /// Resume even when the server reports a different modification time
    #[arg(long, default_value_t = false)]
    ignore_mtime: bool,

    /// Download every URL listed in FILE (one per line, '#' comments)
    #[arg(long)]
    queue: Option<PathBuf>,

    /// Directory for --queue downloads (default: current dir)
    #[arg(long)]
    output_dir: Option<PathBuf>,

    /// Wait SECONDS before starting the download
    #[arg(long, default_value_t = 0)]
    start_in: u64,

    /// Start at a wall-clock time, e.g. 2026-10-13T03:00 or 03:00
    #[arg(long)]
    start_at: Option<String>,

    /// Route the file into a type subfolder under BASE (Video/, Music/, ...)
    #[arg(long)]
    category_dir: Option<PathBuf>,

    /// Append one JSON line per completed download to FILE (history)
    #[arg(long)]
    history: Option<PathBuf>,

    /// Adaptive segmentation: split slow segments while downloading (IDM-style)
    #[arg(long, default_value_t = false)]
    dynamic: bool,

    /// Smallest segment that --dynamic is allowed to split (bytes)
    #[arg(long, default_value_t = 1000000)]
    min_split: u64,

    /// Run the GUI/queue HTTP server on ADDR (e.g. 127.0.0.1:8080)
    #[arg(long)]
    serve: Option<String>,

    /// Directory for the persisted queue (used by --serve)
    #[arg(long)]
    state_dir: Option<PathBuf>,

    /// Store the password read from STDIN in the vault and print its
    /// reference. Through stdin, never argv: arguments are world-readable.
    #[arg(long)]
    secrets_set: bool,

    /// Print the password behind a `secret:<id>` reference to stdout.
    #[arg(long, value_name = "REF")]
    secrets_get: Option<String>,

    /// Forget the password behind a `secret:<id>` reference.
    #[arg(long, value_name = "REF")]
    secrets_del: Option<String>,

    /// Print where the vault key lives, for the GUI's status line.
    #[arg(long)]
    secrets_status: bool,

    /// Max simultaneous downloads in --serve mode
    #[arg(long, default_value_t = 2)]
    max_concurrent: usize,

    /// Secret required on every /api/* request in --serve mode.
    /// Generated and written to STATE_DIR/api-token when not given.
    #[arg(long)]
    api_token: Option<String>,
}

#[derive(Serialize, Deserialize, Clone, Debug)]
struct SegmentState {
    start: u64,
    end: u64,
    done: bool,
    downloaded: u64,
}

#[derive(Serialize, Deserialize, Clone, Debug)]
struct Meta {
    url: String,
    etag: Option<String>,
    last_modified: Option<String>,
    total: u64,
    connections: usize,
    segments: Vec<SegmentState>,
}

/// Shared HTTP options for the direct (Range) downloader.
#[derive(Clone, Debug)]
struct Net {
    ua: String,
    cookie: Option<String>,
    referer: Option<String>,
    limit_rate: u64,
    /// HTTP basic credentials as USER:PASSWORD, from --auth.
    auth: Option<String>,
}

/// The credentials to use: `--auth-env NAME` beats `--auth`. An unset or empty
/// variable means no credentials at all -- never the name itself.
///
/// The variable stays in our own environment (/proc/<pid>/environ is readable
/// only by the owner, unlike cmdline) rather than being removed here: mutating
/// the environment of a process whose async runtime is already up is not
/// sound. Children get it stripped at spawn time instead, through
/// `strip_auth_env`.
fn auth_from(args: &Args) -> Option<String> {
    if let Some(name) = args.auth_env.as_deref() {
        return match std::env::var(name) {
            Ok(v) if !v.is_empty() => Some(v),
            _ => None,
        };
    }
    args.auth.clone()
}

/// Keep the credentials out of a child process (yt-dlp, aria2c): they need the
/// URL, never the password.
fn strip_auth_env(cmd: &mut tokio::process::Command, args: &Args) {
    if let Some(name) = args.auth_env.as_deref() {
        cmd.env_remove(name);
    }
}

impl Net {
    fn apply(&self, rb: reqwest::RequestBuilder) -> reqwest::RequestBuilder {
        let mut rb = rb.header("User-Agent", &self.ua);
        if let Some(c) = &self.cookie {
            rb = rb.header("Cookie", c);
        }
        if let Some(r) = &self.referer {
            rb = rb.header("Referer", r);
        }
        if let Some(a) = &self.auth {
            // "user:password", password optional. Split on the FIRST colon so a
            // password containing one survives.
            let (user, pass) = match a.split_once(':') {
                Some((u, p)) => (u, Some(p.to_string())),
                None => (a.as_str(), None),
            };
            rb = rb.basic_auth(user, pass);
        }
        rb
    }
}

fn out_path_for(url: &str, output: Option<&Path>) -> PathBuf {
    if let Some(o) = output {
        return o.to_path_buf();
    }
    // One shared helper so the engine and the GUI never disagree on the name
    // and neither can produce an empty string (which would make a later
    // `dir.join(name)` resolve to `dir` itself).
    PathBuf::from(media::filename_from_url(url))
}

/// IDM-style category folder for a URL, chosen by its extension.
fn category_subdir(url: &str) -> &'static str {
    let name = url
        .trim_end_matches('/')
        .rsplit('/')
        .next()
        .unwrap_or("")
        .split('?')
        .next()
        .unwrap_or("");
    category_subdir_for_name(name)
}

/// IDM-style category folder chosen from an already-resolved file name.
fn category_subdir_for_name(name: &str) -> &'static str {
    let ext = name.rsplit('.').next().unwrap_or("").to_ascii_lowercase();
    match ext.as_str() {
        "mp4" | "mkv" | "avi" | "mov" | "webm" | "flv" | "m4v" => "Video",
        "mp3" | "m4a" | "flac" | "wav" | "ogg" | "aac" | "opus" => "Music",
        "pdf" | "doc" | "docx" | "txt" | "epub" | "rtf" | "odt" => "Documents",
        "zip" | "rar" | "7z" | "tar" | "gz" | "bz2" | "xz" => "Compressed",
        "exe" | "msi" | "deb" | "apk" | "dmg" | "rpm" | "appimage" => "Programs",
        _ => "Other",
    }
}

/// Resolve the on-disk path for a URL, honouring --output, --category-dir and
/// --output-dir (in that order of precedence).
///
/// Without any of them the name is relative, i.e. it lands in the process CWD.
/// That is fine for a shell invocation but never for a URL that arrives from
/// the outside (scheme handler, browser), which is why the callers always pass
/// `--output-dir` through.
fn resolve_out_path(
    url: &str,
    output: Option<&Path>,
    category_dir: Option<&Path>,
    output_dir: Option<&Path>,
) -> PathBuf {
    if let Some(o) = output {
        return o.to_path_buf();
    }
    let p = out_path_for(url, None);
    let name = p.file_name().map(|n| n.to_owned()).unwrap_or_default();
    if let Some(base) = category_dir {
        return base.join(category_subdir(url)).join(name);
    }
    if let Some(base) = output_dir {
        return base.join(name);
    }
    out_path_for(url, None)
}

/// A free file name next to `p`: `file.bin`, `file (1).bin`, `file (2).bin`, …
///
/// Only used for a name we derived from the URL ourselves. An explicit
/// `--output` is obeyed to the letter, and `--resume` must of course reuse the
/// existing file. Without this, a captured URL whose last path segment happens
/// to match something already in the download directory would overwrite it.
fn free_path(p: &Path) -> PathBuf {
    if !p.exists() {
        return p.to_path_buf();
    }
    let dir = p.parent().map(|d| d.to_path_buf()).unwrap_or_default();
    let stem = p.file_stem().map(|s| s.to_string_lossy().to_string()).unwrap_or_default();
    let ext = p.extension().map(|e| e.to_string_lossy().to_string());
    for i in 1..10_000u32 {
        let name = match &ext {
            Some(e) => format!("{} ({}).{}", stem, i, e),
            None => format!("{} ({})", stem, i),
        };
        let cand = dir.join(name);
        if !cand.exists() {
            return cand;
        }
    }
    p.to_path_buf()
}

fn meta_path(out: &Path) -> PathBuf {
    let mut s = out.as_os_str().to_os_string();
    s.push(".idmmeta");
    PathBuf::from(s)
}

/// Size + CRC32 of a file on disk.
fn crc32_file(path: &Path) -> anyhow::Result<(u64, u32)> {
    use std::io::Read;
    let mut f = std::fs::File::open(path)?;
    let mut hasher = crc32fast::Hasher::new();
    let mut buf = vec![0u8; 1 << 20];
    let mut total = 0u64;
    loop {
        let n = f.read(&mut buf)?;
        if n == 0 {
            break;
        }
        hasher.update(&buf[..n]);
        total += n as u64;
    }
    Ok((total, hasher.finalize()))
}

#[derive(Debug)]
struct Probe {
    total: u64,
    ranges: bool,
    etag: Option<String>,
    last_modified: Option<String>,
}

/// Content-Type of a URL from a HEAD request (lowercased, parameters stripped),
/// or None when it cannot be determined. Used to tell a web page (text/html)
/// from a file so a video page is not saved as an HTML document.
async fn probe_content_type(client: &reqwest::Client, url: &str, net: &Net) -> Option<String> {
    let r = net.apply(client.head(url)).send().await.ok()?;
    if !r.status().is_success() {
        return None;
    }
    r.headers()
        .get(reqwest::header::CONTENT_TYPE)
        .and_then(|v| v.to_str().ok())
        .map(|v| v.split(';').next().unwrap_or(v).trim().to_ascii_lowercase())
}

async fn probe(client: &reqwest::Client, url: &str, net: &Net) -> anyhow::Result<Probe> {
    let head = net.apply(client.head(url)).send().await;
    let (total, ranges, etag, last_modified, ok) = match head {
        Ok(r) if r.status().is_success() => {
            let h = r.headers();
            let len = h
                .get(reqwest::header::CONTENT_LENGTH)
                .and_then(|v| v.to_str().ok())
                .and_then(|v| v.parse::<u64>().ok())
                .unwrap_or(0);
            let ar = h
                .get(reqwest::header::ACCEPT_RANGES)
                .and_then(|v| v.to_str().ok())
                .map(|v| v.to_ascii_lowercase().contains("bytes"))
                .unwrap_or(false);
            let et = h
                .get(reqwest::header::ETAG)
                .and_then(|v| v.to_str().ok())
                .map(String::from);
            let lm = h
                .get(reqwest::header::LAST_MODIFIED)
                .and_then(|v| v.to_str().ok())
                .map(String::from);
            (len, ar, et, lm, true)
        }
        _ => (0, false, None, None, false),
    };

    if ok && total > 0 {
        return Ok(Probe { total, ranges, etag, last_modified });
    }

    let r = net
        .apply(client.get(url))
        .header("Range", "bytes=0-0")
        .send()
        .await?;
    let status = r.status();
    let h = r.headers().clone();
    let etag = h
        .get(reqwest::header::ETAG)
        .and_then(|v| v.to_str().ok())
        .map(String::from);
    let last_modified = h
        .get(reqwest::header::LAST_MODIFIED)
        .and_then(|v| v.to_str().ok())
        .map(String::from);

    if status == reqwest::StatusCode::PARTIAL_CONTENT {
        let cr = h
            .get(reqwest::header::CONTENT_RANGE)
            .and_then(|v| v.to_str().ok())
            .unwrap_or("");
        let total = cr
            .rsplit('/')
            .next()
            .and_then(|v| v.trim().parse::<u64>().ok())
            .unwrap_or(0);
        return Ok(Probe { total, ranges: true, etag, last_modified });
    }

    let len = h
        .get(reqwest::header::CONTENT_LENGTH)
        .and_then(|v| v.to_str().ok())
        .and_then(|v| v.parse::<u64>().ok())
        .unwrap_or(0);
    Ok(Probe { total: len, ranges: false, etag, last_modified })
}

fn build_segments(total: u64, n: usize) -> Vec<SegmentState> {
    let n = std::cmp::max(1, n) as u64;
    let chunk = (total + n - 1) / n;
    let mut segs = Vec::new();
    let mut start = 0u64;
    while start < total {
        let end = std::cmp::min(start + chunk - 1, total - 1);
        segs.push(SegmentState { start, end, done: false, downloaded: 0 });
        start = end + 1;
    }
    segs
}

/// Positional write that works on both Unix and Windows.
///
/// Unix has `FileExt::write_all_at`; Windows has `FileExt::seek_write`, which
/// does not guarantee to write the whole buffer, so we loop.
fn write_at(file: &std::fs::File, buf: &[u8], offset: u64) -> std::io::Result<()> {
    #[cfg(unix)]
    {
        use std::os::unix::fs::FileExt;
        file.write_all_at(buf, offset)
    }
    #[cfg(windows)]
    {
        use std::os::windows::fs::FileExt;
        let mut written = 0usize;
        while written < buf.len() {
            let n = file.seek_write(&buf[written..], offset + written as u64)?;
            if n == 0 {
                return Err(std::io::Error::new(
                    std::io::ErrorKind::WriteZero,
                    "failed to write whole buffer",
                ));
            }
            written += n;
        }
        Ok(())
    }
}

#[allow(clippy::too_many_arguments)]
async fn download_segment(
    client: Arc<reqwest::Client>,
    url: String,
    net: Net,
    seg_index: usize,
    start: u64,
    end: u64,
    out: Arc<std::fs::File>,
    resume_from: u64,
    progress_tx: tokio::sync::mpsc::UnboundedSender<(usize, u64)>,
) -> anyhow::Result<()> {
    let mut pos = start + resume_from;
    if pos > end {
        return Ok(());
    }

    let started = std::time::Instant::now();
    let mut written: u64 = 0;

    // Retry the connection from the last written offset on any transport error.
    const MAX_ATTEMPTS: u32 = 6;
    let mut attempt: u32 = 0;
    'retry: loop {
        attempt += 1;
        let resp = match net
            .apply(client.get(&url))
            .header("Range", format!("bytes={}-{}", pos, end))
            .send()
            .await
        {
            Ok(r) => r,
            Err(e) => {
                if attempt >= MAX_ATTEMPTS {
                    anyhow::bail!("segment {}: {} attempts exhausted: {}", seg_index, MAX_ATTEMPTS, e);
                }
                let backoff = std::time::Duration::from_millis(100 * 2u64.pow(attempt.min(5)));
                tokio::time::sleep(backoff).await;
                continue 'retry;
            }
        };

        let status = resp.status();
        if status != reqwest::StatusCode::PARTIAL_CONTENT && !(pos == 0 && status.is_success()) {
            anyhow::bail!("segment {}: unexpected status {}", seg_index, status);
        }

        let mut stream = resp.bytes_stream();
        let mut dropped = false;
        while let Some(chunk) = stream.next().await {
            match chunk {
                Ok(chunk) => {
                    let buf = chunk.to_vec();
                    let len = buf.len() as u64;
                    let out2 = out.clone();
                    let p = pos;
                    tokio::task::spawn_blocking(move || -> std::io::Result<()> {
                        write_at(&out2, &buf, p)
                    })
                    .await??;
                    pos += len;
                    written += len;
                    let _ = progress_tx.send((seg_index, len));
                    if net.limit_rate > 0 {
                        let expected = std::time::Duration::from_secs_f64(
                            written as f64 / net.limit_rate as f64,
                        );
                        let elapsed = started.elapsed();
                        if expected > elapsed {
                            tokio::time::sleep(expected - elapsed).await;
                        }
                    }
                }
                Err(e) => {
                    if attempt >= MAX_ATTEMPTS {
                        anyhow::bail!("segment {}: {} attempts exhausted: {}", seg_index, MAX_ATTEMPTS, e);
                    }
                    let backoff = std::time::Duration::from_millis(100 * 2u64.pow(attempt.min(5)));
                    tokio::time::sleep(backoff).await;
                    dropped = true;
                    break;
                }
            }
        }
        if dropped {
            continue 'retry;
        }
        // The stream ended without reporting an error. If the body was short
        // (a truncated response, a proxy cutting the connection), the segment
        // is NOT complete: retry from `pos` instead of reporting success and
        // leaving a hole in the output file.
        if pos <= end {
            if attempt >= MAX_ATTEMPTS {
                anyhow::bail!(
                    "segment {}: truncated body, {} bytes missing after {} attempts",
                    seg_index,
                    end - pos + 1,
                    MAX_ATTEMPTS
                );
            }
            tokio::time::sleep(std::time::Duration::from_millis(200)).await;
            continue 'retry;
        }
        break 'retry;
    }
    Ok(())
}

/// Direct multi-connection Range download (the IDM core path).
async fn run_direct(
    args: &Args,
    net: &Net,
    client: Arc<reqwest::Client>,
    url: &str,
    out: PathBuf,
) -> anyhow::Result<()> {
    let mpath = meta_path(&out);

    let probe = probe(&client, url, net).await?;
    println!("[*] url          : {}", url);
    println!("[*] output       : {}", out.display());
    println!("[*] total size   : {} bytes", probe.total);
    println!("[*] accept-ranges: {}", probe.ranges);
    println!("[*] etag         : {:?}", probe.etag);
    println!("[*] last-modified: {:?}", probe.last_modified);

    if probe.total == 0 {
        anyhow::bail!("server did not report a size; cannot segment (not supported in POC)");
    }

    let mut meta = if args.resume && mpath.exists() {
        let raw = tokio::fs::read_to_string(&mpath).await?;
        let m: Meta = serde_json::from_str(&raw)?;
        if m.total != probe.total || m.url != url {
            println!("[!] resume meta mismatch (size/url changed) — starting fresh");
            None
        } else if m.etag != probe.etag && m.etag.is_some() && probe.etag.is_some() {
            println!("[!] ETag changed — starting fresh");
            None
        } else if !args.ignore_mtime
            && m.last_modified != probe.last_modified
            && m.last_modified.is_some()
            && probe.last_modified.is_some()
        {
            // The file changed under us: its old offsets describe other bytes.
            // --ignore-mtime (Options -> Downloads) resumes anyway.
            println!("[!] Last-Modified changed — starting fresh");
            None
        } else if !matches!(std::fs::metadata(&out), Ok(md) if md.len() == m.total) {
            // The sidecar claims progress, but the file it describes is gone or
            // has a different size — its offsets cannot be trusted.
            println!("[!] output file missing or wrong size — starting fresh");
            None
        } else {
            println!("[+] resuming: {} segments in meta", m.segments.len());
            Some(m)
        }
    } else {
        None
    };

    let n = if probe.ranges { args.connections } else { 1 };

    if meta.is_none() {
        let segs = if probe.ranges {
            build_segments(probe.total, n)
        } else {
            vec![SegmentState { start: 0, end: probe.total - 1, done: false, downloaded: 0 }]
        };
        meta = Some(Meta {
            url: url.to_string(),
            etag: probe.etag.clone(),
            last_modified: probe.last_modified.clone(),
            total: probe.total,
            connections: n,
            segments: segs,
        });
    }
    let meta = Arc::new(Mutex::new(meta.unwrap()));

    if let Some(parent) = out.parent() {
        if !parent.as_os_str().is_empty() {
            tokio::fs::create_dir_all(parent).await?;
        }
    }
    {
        let f = TokioOpenOptions::new()
            .create(true)
            .write(true)
            .read(true)
            .open(&out)
            .await?;
        f.set_len(probe.total).await?;
    }
    let out_file = Arc::new(std::fs::OpenOptions::new().read(true).write(true).open(&out)?);

    {
        let m = meta.lock().await;
        tokio::fs::write(&mpath, serde_json::to_string_pretty(&*m)?).await?;
    }

    let (tx, mut rx) = tokio::sync::mpsc::unbounded_channel::<(usize, u64)>();
    let done_counter = Arc::new(tokio::sync::Mutex::new(0u64));

    let sem = Arc::new(Semaphore::new(n));
    let mut handles = Vec::new();

    {
        let m = meta.lock().await;
        for (i, seg) in m.segments.iter().enumerate() {
            if seg.done {
                continue;
            }
            let client = client.clone();
            let url = url.to_string();
            let net = net.clone();
            let start = seg.start;
            let end = seg.end;
            let resume_from = seg.downloaded;
            let out_file = out_file.clone();
            let tx = tx.clone();
            let permit = sem.clone().acquire_owned().await?;
            let h = tokio::spawn(async move {
                let _p = permit;
                download_segment(client, url, net, i, start, end, out_file, resume_from, tx).await
            });
            handles.push((i, h));
        }
    }
    drop(tx);

    let total = probe.total;
    let done_counter2 = done_counter.clone();
    let meta_flush = meta.clone();
    let mpath_flush = mpath.clone();
    let printer = tokio::spawn(async move {
        let mut last = std::time::Instant::now();
        let mut last_flush = std::time::Instant::now();
        while let Some((idx, len)) = rx.recv().await {
            {
                let mut m = meta_flush.lock().await;
                m.segments[idx].downloaded += len;
            }
            let mut c = done_counter2.lock().await;
            *c += len;
            let cur = *c;
            drop(c);
            if last.elapsed().as_millis() >= 500 {
                let pct = (cur as f64 / total as f64) * 100.0;
                eprint!("\r[{:>5.1}%] {} / {} bytes", pct, cur, total);
                last = std::time::Instant::now();
            }
            if last_flush.elapsed().as_millis() >= 1000 {
                let m = meta_flush.lock().await;
                if let Ok(s) = serde_json::to_string_pretty(&*m) {
                    let _ = tokio::fs::write(&mpath_flush, s).await;
                }
                last_flush = std::time::Instant::now();
            }
        }
    });

    for (i, h) in handles {
        match h.await {
            Ok(Ok(())) => {
                let mut m = meta.lock().await;
                m.segments[i].done = true;
                m.segments[i].downloaded = m.segments[i].end - m.segments[i].start + 1;
            }
            Ok(Err(e)) => {
                let m = meta.lock().await;
                let _ = tokio::fs::write(&mpath, serde_json::to_string_pretty(&*m)?).await;
                anyhow::bail!("segment {} failed: {} (state saved to {})", i, e, mpath.display());
            }
            Err(e) => anyhow::bail!("segment {} task join error: {}", i, e),
        }
    }
    let _ = printer.await;
    eprintln!();

    // Verify real coverage, not just the file length: the output was
    // pre-allocated with set_len(), so its size says nothing about how much of
    // it was actually written.
    {
        let m = meta.lock().await;
        let incomplete: Vec<String> = m
            .segments
            .iter()
            .enumerate()
            .filter(|(_, s)| !s.done || s.downloaded < s.end - s.start + 1)
            .map(|(i, s)| format!("#{} {}/{}", i, s.downloaded, s.end - s.start + 1))
            .collect();
        if !incomplete.is_empty() {
            anyhow::bail!(
                "incomplete download: segment(s) {} (state kept in {})",
                incomplete.join(", "),
                mpath.display()
            );
        }
        let covered: u64 = m.segments.iter().map(|s| s.end - s.start + 1).sum();
        if covered != probe.total {
            anyhow::bail!(
                "segment coverage {} does not match total {} (state kept in {})",
                covered,
                probe.total,
                mpath.display()
            );
        }
    }

    let (read_total, crc) = crc32_file(&out)?;
    println!("[*] downloaded   : {} bytes", read_total);
    println!("[*] crc32        : {:08x}", crc);
    if read_total != probe.total {
        anyhow::bail!("size mismatch: expected {}, got {}", probe.total, read_total);
    }

    let _ = tokio::fs::remove_file(&mpath).await;
    append_history(&args.history, url, &out, read_total, crc);
    write_report(args.report.as_deref(), &out, read_total, crc);
    println!("[+] done -> {}", out.display());
    Ok(())
}

/// IDM-style URL schemes (extracted from the real extension's `wa` table).
///
/// Real IDM wraps a download target as `idmdwnlmfv9://<inner-url>` so it can be
/// handed to it from anywhere (shell context menu, another app). It also uses
/// `idmreg:` as a bare "wake up / register" trigger that is not a download.
fn is_idm_wrapped(url: &str) -> bool {
    let l = url.to_ascii_lowercase();
    l.starts_with("idmdwnlmfv") || l.starts_with("idmreg:")
}

/// Unwrap `idmdwnlmfv9://<inner>` down to `<inner>`.
///
/// Returns `None` when the payload is a bare `idmreg:` trigger (no download).
fn unwrap_idm_scheme(url: &str) -> Option<String> {
    let l = url.to_ascii_lowercase();
    if l.starts_with("idmreg:") {
        return None;
    }
    let rest = if let Some(r) = url.strip_prefix("idmdwnlmfv9://") {
        r
    } else if let Some(r) = url.strip_prefix("idmdwnlmfv8://") {
        r
    } else {
        // idmdwnlmfv<other>:// — accept any version suffix.
        match url.split_once("://") {
            Some((scheme, r)) if scheme.to_ascii_lowercase().starts_with("idmdwnlmfv") => r,
            _ => return Some(url.to_string()),
        }
    };
    let rest = rest.trim_start_matches('/');
    if rest.to_ascii_lowercase().starts_with("idmreg:") {
        return None;
    }
    Some(rest.to_string())
}

/// One in-flight segment, shared with the split monitor.
struct Live {
    start: u64,
    end: u64,
    pos: Arc<AtomicU64>,
    split: Arc<AtomicU64>,
}

/// Download one segment, honouring a runtime split request.
///
/// Returns `Some((split, end))` when the monitor asked this segment to split;
/// the returned range is the part that was NOT downloaded and must be handed
/// to another worker. Returns `None` when the segment finished normally.
#[allow(clippy::too_many_arguments)]
async fn download_dyn_segment(
    client: Arc<reqwest::Client>,
    url: String,
    net: Net,
    start: u64,
    end: u64,
    out: Arc<std::fs::File>,
    pos_atomic: Arc<AtomicU64>,
    split_atomic: Arc<AtomicU64>,
    progress_tx: tokio::sync::mpsc::UnboundedSender<u64>,
) -> anyhow::Result<Option<(u64, u64)>> {
    let mut pos = start;
    let mut written: u64 = 0;
    let started = std::time::Instant::now();
    const MAX_ATTEMPTS: u32 = 6;
    let mut attempt: u32 = 0;
    'retry: loop {
        attempt += 1;
        let resp = match net
            .apply(client.get(&url))
            .header("Range", format!("bytes={}-{}", pos, end))
            .send()
            .await
        {
            Ok(r) => r,
            Err(e) => {
                if attempt >= MAX_ATTEMPTS {
                    anyhow::bail!("segment {}-{}: {} attempts exhausted: {}", start, end, MAX_ATTEMPTS, e);
                }
                tokio::time::sleep(std::time::Duration::from_millis(100 * 2u64.pow(attempt.min(5)))).await;
                continue 'retry;
            }
        };
        let status = resp.status();
        if status != reqwest::StatusCode::PARTIAL_CONTENT
            && !(pos == 0 && status.is_success())
        {
            anyhow::bail!("segment {}-{}: unexpected status {}", start, end, status);
        }

        let mut stream = resp.bytes_stream();
        while let Some(chunk) = stream.next().await {
            let chunk = match chunk {
                Ok(c) => c,
                Err(e) => {
                    if attempt >= MAX_ATTEMPTS {
                        anyhow::bail!("segment {}-{}: stream error: {}", start, end, e);
                    }
                    tokio::time::sleep(std::time::Duration::from_millis(200)).await;
                    continue 'retry;
                }
            };
            let sp = split_atomic.load(Ordering::SeqCst);
            let limit = if sp != u64::MAX && sp > pos && sp <= end { sp } else { end + 1 };
            let mut buf = chunk.to_vec();
            let take = std::cmp::min(buf.len() as u64, limit - pos);
            buf.truncate(take as usize);

            let out2 = out.clone();
            let p = pos;
            tokio::task::spawn_blocking(move || write_at(&out2, &buf, p)).await??;
            pos += take;
            written += take;
            pos_atomic.store(pos, Ordering::SeqCst);
            let _ = progress_tx.send(take);

            if net.limit_rate > 0 {
                // Sleep only the time we are *ahead* of schedule; sleeping the
                // full cumulative expectation on every chunk would throttle to
                // a tiny fraction of the requested rate.
                let expected =
                    std::time::Duration::from_secs_f64(written as f64 / net.limit_rate as f64);
                let behind = expected.saturating_sub(started.elapsed());
                if behind > std::time::Duration::from_millis(5) {
                    tokio::time::sleep(behind).await;
                }
            }

            if pos >= limit {
                if limit <= end {
                    return Ok(Some((limit, end)));
                }
                return Ok(None);
            }
        }
        if pos > end {
            return Ok(None);
        }
        if attempt >= MAX_ATTEMPTS {
            anyhow::bail!("segment {}-{}: incomplete after {} attempts", start, end, MAX_ATTEMPTS);
        }
        tokio::time::sleep(std::time::Duration::from_millis(200)).await;
        continue 'retry;
    }
}

/// IDM-style adaptive downloader.
///
/// Starts with `connections` segments. A monitor watches progress and, when one
/// segment lags far behind the fastest one, splits the slow segment so the fast
/// connections are not held back. Split ranges are pushed back on the work
/// queue and picked up by free workers.
async fn run_direct_dynamic(
    args: &Args,
    net: &Net,
    client: Arc<reqwest::Client>,
    url: &str,
    out: PathBuf,
) -> anyhow::Result<()> {
    let probe = probe(&client, url, net).await?;
    println!("[*] url          : {}", url);
    println!("[*] output       : {}", out.display());
    println!("[*] total size   : {} bytes", probe.total);
    println!("[*] accept-ranges: {}", probe.ranges);
    println!("[*] dynamic      : on (min-split {} bytes)", args.min_split);

    if probe.total == 0 {
        anyhow::bail!("server did not report a size; cannot segment");
    }
    let total = probe.total;
    let n = if probe.ranges { args.connections.max(1) } else { 1 };

    if let Some(parent) = out.parent() {
        if !parent.as_os_str().is_empty() {
            tokio::fs::create_dir_all(parent).await?;
        }
    }
    {
        let f = TokioOpenOptions::new()
            .create(true)
            .write(true)
            .read(true)
            .open(&out)
            .await?;
        f.set_len(total).await?;
    }
    let out_file = Arc::new(std::fs::OpenOptions::new().read(true).write(true).open(&out)?);

    let queue: Arc<std::sync::Mutex<VecDeque<(u64, u64)>>> =
        Arc::new(std::sync::Mutex::new(VecDeque::new()));
    {
        let mut q = queue.lock().unwrap();
        for seg in build_segments(total, n) {
            q.push_back((seg.start, seg.end));
        }
    }
    let registry: Arc<std::sync::Mutex<Vec<Live>>> =
        Arc::new(std::sync::Mutex::new(Vec::new()));
    let inflight = Arc::new(AtomicUsize::new(0));
    let splits_left = Arc::new(AtomicUsize::new(16));
    let done = Arc::new(tokio::sync::Mutex::new(0u64));

    let (tx, mut rx) = tokio::sync::mpsc::unbounded_channel::<u64>();

    let printer_done = done.clone();
    let printer = tokio::spawn(async move {
        let mut last = std::time::Instant::now();
        while let Some(len) = rx.recv().await {
            let mut c = printer_done.lock().await;
            *c += len;
            let cur = *c;
            drop(c);
            if last.elapsed().as_millis() >= 500 {
                let pct = (cur as f64 / total as f64) * 100.0;
                eprint!("\r[{:>5.1}%] {} / {} bytes", pct, cur, total);
                last = std::time::Instant::now();
            }
        }
    });

    // Split monitor.
    //
    // We compare *rates* (bytes/second), not absolute progress: a segment that
    // started later must not be mistaken for a slow one. The slowest segment is
    // split when it is clearly slower than the fastest, or whenever there is an
    // idle worker that could take over part of it.
    let mon_reg = registry.clone();
    let mon_done = done.clone();
    let mon_split = splits_left.clone();
    let mon_inflight = inflight.clone();
    let min_split = args.min_split;
    let n_workers = n;
    // Set once the worker pool is joined, so the monitor also stops when the
    // download *fails* (and never reaches `total`) instead of looping forever.
    let stop = Arc::new(AtomicBool::new(false));
    let mon_stop = stop.clone();
    let monitor = tokio::spawn(async move {
        let mut prev: HashMap<(u64, u64), (u64, std::time::Instant)> = HashMap::new();
        loop {
            tokio::time::sleep(std::time::Duration::from_millis(250)).await;
            if mon_stop.load(Ordering::SeqCst) {
                break;
            }
            if *mon_done.lock().await >= total {
                break;
            }
            let live: Vec<(u64, u64, u64, Arc<AtomicU64>)> = {
                let g = mon_reg.lock().unwrap();
                g.iter()
                    .map(|l| (l.start, l.end, l.pos.load(Ordering::SeqCst), l.split.clone()))
                    .collect()
            };
            let now = std::time::Instant::now();
            let mut rates: Vec<((u64, u64), f64, u64, u64, Arc<AtomicU64>)> = Vec::new();
            for (start, end, pos, split) in &live {
                let key = (*start, *end);
                let rate = match prev.get(&key) {
                    Some((pp, tt)) => {
                        let dt = now.duration_since(*tt).as_secs_f64();
                        if dt > 0.0 {
                            (*pos).saturating_sub(*pp) as f64 / dt
                        } else {
                            0.0
                        }
                    }
                    None => 0.0,
                };
                prev.insert(key, (*pos, now));
                let remaining = end.saturating_sub(*pos);
                rates.push((key, rate, *pos, remaining, split.clone()));
            }
            // Drop stale entries for finished segments.
            prev.retain(|k, _| live.iter().any(|l| (l.0, l.1) == *k));

            if rates.is_empty() {
                continue;
            }
            let fastest = rates.iter().map(|r| r.1).fold(0.0f64, f64::max);
            // Victim: slowest rate that is still worth splitting.
            let mut victim: Option<usize> = None;
            let mut victim_rate = f64::MAX;
            for (i, (_k, rate, _pos, remaining, _sp)) in rates.iter().enumerate() {
                if *remaining > min_split && *rate < victim_rate {
                    victim_rate = *rate;
                    victim = Some(i);
                }
            }
            let idle = n_workers.saturating_sub(mon_inflight.load(Ordering::SeqCst));
            let clearly_slower = rates.len() >= 2 && fastest > 0.0 && victim_rate * 2.0 + 1.0 < fastest;
            let should_split = clearly_slower || idle > 0;
            if should_split && mon_split.load(Ordering::SeqCst) > 0 {
                if let Some(i) = victim {
                    let (_key, _rate, pos, remaining, split) = &rates[i];
                    if split.load(Ordering::SeqCst) == u64::MAX {
                        let sp = *pos + remaining / 2;
                        split.store(sp, Ordering::SeqCst);
                        mon_split.fetch_sub(1, Ordering::SeqCst);
                    }
                }
            }
        }
    });

    // Worker pool.
    let mut workers = Vec::new();
    for _ in 0..n {
        let client = client.clone();
        let url = url.to_string();
        let net = net.clone();
        let out_file = out_file.clone();
        let queue = queue.clone();
        let registry = registry.clone();
        let inflight = inflight.clone();
        let tx = tx.clone();
        workers.push(tokio::spawn(async move {
            loop {
                let job = { queue.lock().unwrap().pop_front() };
                match job {
                    Some((start, end)) => {
                        let pos = Arc::new(AtomicU64::new(start));
                        let split = Arc::new(AtomicU64::new(u64::MAX));
                        {
                            let mut g = registry.lock().unwrap();
                            g.push(Live { start, end, pos: pos.clone(), split: split.clone() });
                        }
                        inflight.fetch_add(1, Ordering::SeqCst);
                        let res = download_dyn_segment(
                            client.clone(),
                            url.clone(),
                            net.clone(),
                            start,
                            end,
                            out_file.clone(),
                            pos.clone(),
                            split.clone(),
                            tx.clone(),
                        )
                        .await;
                        // Hand the leftover to the queue BEFORE dropping inflight,
                        // so an idle worker cannot miss it.
                        let leftover = match &res {
                            Ok(Some(r)) => Some(*r),
                            _ => None,
                        };
                        if let Some((ls, le)) = leftover {
                            queue.lock().unwrap().push_back((ls, le));
                        }
                        {
                            let mut g = registry.lock().unwrap();
                            g.retain(|l| !Arc::ptr_eq(&l.pos, &pos));
                        }
                        inflight.fetch_sub(1, Ordering::SeqCst);
                        if let Err(e) = res {
                            return Err(e);
                        }
                    }
                    None => {
                        if inflight.load(Ordering::SeqCst) == 0 {
                            if queue.lock().unwrap().is_empty() {
                                break;
                            }
                            continue;
                        }
                        tokio::time::sleep(std::time::Duration::from_millis(30)).await;
                    }
                }
            }
            Ok::<(), anyhow::Error>(())
        }));
    }
    drop(tx);

    let mut first_err: Option<anyhow::Error> = None;
    for w in workers {
        match w.await {
            Ok(Ok(())) => {}
            Ok(Err(e)) => {
                if first_err.is_none() {
                    first_err = Some(e);
                }
            }
            Err(e) => {
                if first_err.is_none() {
                    first_err = Some(anyhow::anyhow!("worker join error: {}", e));
                }
            }
        }
    }
    stop.store(true, Ordering::SeqCst);
    let _ = monitor.await;
    let _ = printer.await;
    eprintln!();
    if let Some(e) = first_err {
        return Err(e);
    }

    let (read_total, crc) = crc32_file(&out)?;
    println!("[*] downloaded   : {} bytes", read_total);
    println!("[*] crc32        : {:08x}", crc);
    if read_total != total {
        anyhow::bail!("size mismatch: expected {}, got {}", total, read_total);
    }
    append_history(&args.history, url, &out, read_total, crc);
    write_report(args.report.as_deref(), &out, read_total, crc);
    println!("[+] done -> {}", out.display());
    Ok(())
}

/// aria2c, but only if it is already installed. Never installs anything.
///
/// This is what `idm <URL>` uses on its own. Fetching and installing a
/// program because somebody typed a URL would be a far ruder thing than
/// picking a backend, so the installer stays behind an explicit --aria2.
async fn aria2c_if_present(args: &Args) -> Option<PathBuf> {
    let ok = tokio::process::Command::new(&args.aria2_path)
        .hide_console()
        .arg("--version")
        .stdout(std::process::Stdio::null())
        .stderr(std::process::Stdio::null())
        .status()
        .await
        .map(|s| s.success())
        .unwrap_or(false);
    if ok {
        Some(args.aria2_path.clone())
    } else {
        None
    }
}

/// Return the aria2c path to use, installing it first if it is missing.
///
/// When `--aria2` is requested but aria2c is not present, we run the platform
/// installer (`scripts/ensure-aria2.sh` on Linux, `ensure-aria2.ps1` on Windows
/// — or whatever `--ensure-aria2` points at) so the user never has to install it
/// by hand. If no installer is available or it fails, the error says exactly
/// what to do.
async fn ensure_aria2c(args: &Args) -> anyhow::Result<PathBuf> {
    // Already present?
    if tokio::process::Command::new(&args.aria2_path)
        .hide_console()
        .arg("--version")
        .stdout(std::process::Stdio::null())
        .stderr(std::process::Stdio::null())
        .status()
        .await
        .map(|s| s.success())
        .unwrap_or(false)
    {
        return Ok(args.aria2_path.clone());
    }

    // Find an installer.
    let mut candidates: Vec<PathBuf> = Vec::new();
    if !args.ensure_aria2.is_empty() {
        candidates.push(PathBuf::from(&args.ensure_aria2));
    }
    // Platform first: on Windows the PowerShell installer is the one that can
    // actually run, on Unix the shell script.
    if let Ok(exe) = std::env::current_exe() {
        if let Some(dir) = exe.parent() {
            #[cfg(windows)]
            {
                candidates.push(dir.join("ensure-aria2.ps1"));
                candidates.push(dir.join("../scripts/ensure-aria2.ps1"));
            }
            candidates.push(dir.join("ensure-aria2.sh"));
            candidates.push(dir.join("../scripts/ensure-aria2.sh"));
            #[cfg(not(windows))]
            candidates.push(dir.join("ensure-aria2.ps1"));
        }
    }
    #[cfg(windows)]
    candidates.push(PathBuf::from("scripts/ensure-aria2.ps1"));
    candidates.push(PathBuf::from("scripts/ensure-aria2.sh"));

    let installer = candidates.into_iter().find(|c| c.exists());
    let Some(installer) = installer else {
        anyhow::bail!(
            "aria2c not found and no installer (scripts/ensure-aria2.sh) available; \
             install aria2 manually or drop --aria2"
        );
    };

    println!("[*] aria2c     : missing, running {}", installer.display());

    let is_ps1 = installer.extension().map(|e| e == "ps1").unwrap_or(false);
    let status = if is_ps1 {
        tokio::process::Command::new("powershell")
            .hide_console()
            .arg("-NoProfile")
            .arg("-ExecutionPolicy")
            .arg("Bypass")
            .arg("-File")
            .arg(&installer)
            .status()
            .await?
    } else {
        tokio::process::Command::new("bash")
            .hide_console()
            .arg(&installer)
            .status()
            .await?
    };
    if !status.success() {
        anyhow::bail!("aria2 auto-install failed ({} exited {})", installer.display(), status);
    }

    // Re-check. We accept a file that now exists and is executable: an
    // installer may drop the binary somewhere the running PATH does not cover
    // yet, and probing with --version would misfire on wrappers/stubs.
    if Path::new(&args.aria2_path).exists() {
        return Ok(args.aria2_path.clone());
    }
    for cand in ["/usr/bin/aria2c", "/usr/local/bin/aria2c"] {
        if Path::new(cand).exists() {
            return Ok(PathBuf::from(cand));
        }
    }

    anyhow::bail!("aria2c still missing after install")
}

/// Delegate a download to aria2c.
async fn run_aria2(args: &Args, url: &str, out: PathBuf) -> anyhow::Result<()> {
    let dir = out
        .parent()
        .map(|p| p.to_path_buf())
        .unwrap_or_else(|| PathBuf::from("."));
    if !dir.as_os_str().is_empty() {
        tokio::fs::create_dir_all(&dir).await.ok();
    }
    let name = out
        .file_name()
        .map(|n| n.to_string_lossy().to_string())
        .unwrap_or_else(|| "download.bin".to_string());

    println!("[*] url          : {}", url);
    println!("[*] output       : {}", out.display());
    println!("[*] backend      : aria2c ({})", args.aria2_path.display());

    let aria2c = ensure_aria2c(args).await?;
    let mut cmd = tokio::process::Command::new(&aria2c);
    cmd.hide_console();
    strip_auth_env(&mut cmd, args);
    cmd.arg("-x").arg(args.connections.max(1).to_string());
    cmd.arg("-s").arg(args.connections.max(1).to_string());
    cmd.arg("-c");
    cmd.arg("--file-allocation=none");
    cmd.arg("--summary-interval=0");
    cmd.arg("--console-log-level=warn");
    cmd.arg("-d").arg(&dir);
    cmd.arg("-o").arg(&name);
    if args.limit_rate > 0 {
        cmd.arg("--max-download-limit").arg(args.limit_rate.to_string());
    }
    if let Some(c) = &args.cookie {
        cmd.arg("--header").arg(format!("Cookie: {}", c));
    }
    if let Some(r) = &args.referer {
        cmd.arg("--referer").arg(r);
    }
    if let Some(px) = &args.proxy {
        cmd.arg("--all-proxy").arg(px);
    }
    cmd.arg(url);

    let status = cmd.status().await?;
    if !status.success() {
        anyhow::bail!("aria2c exited with {}", status);
    }

    let (size, crc) = crc32_file(&out)?;
    append_history(&args.history, url, &out, size, crc);
    write_report(args.report.as_deref(), &out, size, crc);
    println!("[*] downloaded   : {} bytes", size);
    println!("[*] crc32        : {:08x}", crc);
    println!("[+] done -> {}", out.display());
    Ok(())
}

/// Media/stream download through the yt-dlp backend.
/// What to hand the media backend for speed: the connection count always, and
/// aria2c when `--aria2` was asked for. Resolving aria2c here means the
/// auto-installer still runs, exactly as it does on the direct path.
async fn media_speed(args: &Args) -> anyhow::Result<media::Speed> {
    let aria2c = if args.aria2 {
        // Asked for explicitly: install it if it is missing.
        Some(ensure_aria2c(args).await?)
    } else {
        // Not asked for, but `idm <URL>` should still do the fast thing when
        // the fast thing is sitting right there: yt-dlp finds the video,
        // aria2c moves the bytes. Absent, the download simply happens
        // without it.
        aria2c_if_present(args).await
    };
    Ok(media::Speed {
        connections: args.connections,
        aria2c,
    })
}

async fn run_media(args: &Args, net: &Net, url: &str, out_override: Option<PathBuf>) -> anyhow::Result<()> {
    let cookie = net.cookie.as_deref();
    let referer = net.referer.as_deref();

    // --list-formats: report what the backend offers and exit.
    if args.list_formats {
        let meta = media::probe_json(&args.yt_dlp_path, url, cookie, referer, args.proxy.as_deref(), args.auth_env.as_deref()).await?;
        println!("{}", serde_json::to_string_pretty(&media::summarize(&meta))?);
        return Ok(());
    }

    let out = match out_override {
        Some(o) => o,
        None => {
            // No explicit --output: name the file after the media title (not the
            // URL slug) and honour --category-dir / --output-dir, exactly like
            // the direct path does with filename_from_url.
            let meta = media::probe_json(&args.yt_dlp_path, url, cookie, referer, args.proxy.as_deref(), args.auth_env.as_deref()).await?;
            let name = media::output_name(&meta, args.format.as_deref());
            if let Some(base) = args.category_dir.as_deref() {
                let n = name.file_name().map(|x| x.to_owned()).unwrap_or_default();
                base.join(category_subdir_for_name(&n.to_string_lossy())).join(n)
            } else if let Some(base) = args.output_dir.as_deref() {
                base.join(name)
            } else {
                name
            }
        }
    };

    println!("[*] url          : {}", url);
    println!("[*] backend      : yt-dlp ({})", args.yt_dlp_path.display());
    println!("[*] format       : {}", args.format.as_deref().unwrap_or("best"));
    println!("[*] output       : {}", out.display());

    if let Some(parent) = out.parent() {
        if !parent.as_os_str().is_empty() {
            tokio::fs::create_dir_all(parent).await?;
        }
    }
    let out = media::download(
        &args.yt_dlp_path,
        url,
        &out,
        args.format.as_deref(),
        args.limit_rate,
        args.resume,
        cookie,
        referer,
        args.proxy.as_deref(),
        args.auth_env.as_deref(),
        media_speed(args).await?,
    )
    .await?;

    let (size, crc) = crc32_file(&out)?;
    append_history(&args.history, url, &out, size, crc);
    write_report(args.report.as_deref(), &out, size, crc);
    println!("[*] downloaded   : {} bytes", size);
    println!("[*] crc32        : {:08x}", crc);
    println!("[+] done -> {}", out.display());
    Ok(())
}

/// Write the finished download's real name and size where the caller asked.
///
/// Best-effort in the same sense as the history: a report that cannot be
/// written must not fail a download that succeeded. Written atomically
/// (tmp + rename) and 0600, like every other file this project creates, so a
/// reader never sees a half-written JSON.
fn write_report(path: Option<&Path>, out: &Path, total: u64, crc: u32) {
    let path = match path {
        Some(p) => p,
        None => return,
    };
    let body = serde_json::json!({
        "file": out.to_string_lossy(),
        "total": total,
        "crc32": format!("{:08x}", crc),
    })
    .to_string();
    let tmp = path.with_extension("tmp");
    if let Some(parent) = path.parent() {
        if !parent.as_os_str().is_empty() {
            let _ = std::fs::create_dir_all(parent);
        }
    }
    if std::fs::write(&tmp, body).is_err() {
        return;
    }
    #[cfg(unix)]
    {
        use std::os::unix::fs::PermissionsExt;
        let _ = std::fs::set_permissions(&tmp, std::fs::Permissions::from_mode(0o600));
    }
    if std::fs::rename(&tmp, path).is_err() {
        let _ = std::fs::remove_file(&tmp);
    }
}

/// Append one JSON line describing a completed download.
///
/// Best-effort: a history write must never fail an otherwise good download,
/// so errors are reported but swallowed.
fn append_history(
    history: &Option<PathBuf>,
    url: &str,
    out: &Path,
    size: u64,
    crc: u32,
) {
    let Some(hpath) = history else { return };
    let record = serde_json::json!({
        "at": chrono::Local::now().to_rfc3339(),
        "url": url,
        "path": out.to_string_lossy(),
        "size": size,
        "crc32": format!("{:08x}", crc),
    });
    let line = format!("{}
", record);
    if let Some(parent) = hpath.parent() {
        if !parent.as_os_str().is_empty() {
            let _ = std::fs::create_dir_all(parent);
        }
    }
    match std::fs::OpenOptions::new().create(true).append(true).open(hpath) {
        Ok(mut f) => {
            use std::io::Write;
            if let Err(e) = f.write_all(line.as_bytes()) {
                eprintln!("[!] history write failed: {}", e);
            }
        }
        Err(e) => eprintln!("[!] history open failed: {}", e),
    }
}

/// Resolve how long to wait before starting, from --start-in / --start-at.
///
/// --start-at accepts "HH:MM" (next occurrence, today or tomorrow) or a full
/// "YYYY-MM-DDTHH:MM" timestamp. If both flags are given, the later wait wins.
fn schedule_wait(args: &Args) -> anyhow::Result<std::time::Duration> {
    use chrono::{Local, NaiveDate, NaiveDateTime, NaiveTime, TimeZone};
    let mut wait = std::time::Duration::from_secs(args.start_in);
    if let Some(spec) = &args.start_at {
        let target: NaiveDateTime = if spec.contains('T') {
            NaiveDateTime::parse_from_str(spec, "%Y-%m-%dT%H:%M")
                .map_err(|e| anyhow::anyhow!("bad --start-at {}: {}", spec, e))?
        } else {
            let t = NaiveTime::parse_from_str(spec, "%H:%M")
                .map_err(|e| anyhow::anyhow!("bad --start-at {}: {}", spec, e))?;
            let today = Local::now().date_naive();
            let mut dt = NaiveDateTime::new(today, t);
            if dt <= Local::now().naive_local() {
                let tomorrow = today
                    .succ_opt()
                    .ok_or_else(|| anyhow::anyhow!("date overflow"))?;
                dt = NaiveDateTime::new(tomorrow, t);
            }
            dt
        };
        let local = Local
            .from_local_datetime(&target)
            .single()
            .ok_or_else(|| anyhow::anyhow!("ambiguous local time {}", spec))?;
        let delta = local.with_timezone(&Local).signed_duration_since(Local::now());
        let secs = delta.num_seconds().max(0) as u64;
        wait = wait.max(std::time::Duration::from_secs(secs));
    }
    let _ = NaiveDate::from_ymd_opt(1970, 1, 1);
    Ok(wait)
}

/// Download every URL listed in `--queue FILE` into `--output-dir`.
///
/// Each item runs in its own engine process, so one failure cannot corrupt
/// another download's resume state.
async fn run_queue(args: &Args) -> anyhow::Result<()> {
    let list = args.queue.as_ref().unwrap();
    let out_dir = args.output_dir.clone().unwrap_or_else(|| PathBuf::from("."));
    tokio::fs::create_dir_all(&out_dir).await.ok();
    let text = tokio::fs::read_to_string(list).await.map_err(|e| {
        // Without this the whole message is "Systém nemůže nalézt uvedený
        // soubor. (os error 2)" -- true, and no help at all in working out
        // that --queue was pointed at a file that does not exist.
        anyhow::anyhow!("cannot read the queue file {}: {}", list.display(), e)
    })?;
    let exe = std::env::current_exe()?;
    let urls: Vec<String> = text
        .lines()
        .map(|l| l.trim())
        .filter(|l| !l.is_empty() && !l.starts_with('#'))
        .map(|s| s.to_string())
        .collect();
    if urls.is_empty() {
        println!("[*] queue empty");
        return Ok(());
    }
    let mut ok = 0usize;
    let mut fail = 0usize;
    for (i, url) in urls.iter().enumerate() {
        let out = out_dir.join(out_path_for(url, None));
        let mut cmd = tokio::process::Command::new(&exe);
        cmd.hide_console();
        cmd.arg("-n").arg(args.connections.to_string());
        cmd.arg("-o").arg(&out);
        if let Some(p) = &args.proxy {
            cmd.arg("--proxy").arg(p);
        }
        if let Some(c) = &args.cookie {
            cmd.arg("--cookie").arg(c);
        }
        if let Some(r) = &args.referer {
            cmd.arg("--referer").arg(r);
        }
        if args.limit_rate > 0 {
            cmd.arg("--limit-rate").arg(args.limit_rate.to_string());
        }
        if args.no_media {
            cmd.arg("--no-media");
        }
        if args.force_media || args.yt_dlp {
            cmd.arg("--force-media");
        }
        if let Some(f) = &args.format {
            cmd.arg("--format").arg(f);
        }
        if let Some(cd) = &args.category_dir {
            cmd.arg("--category-dir").arg(cd);
        }
        if let Some(h) = &args.history {
            cmd.arg("--history").arg(h);
        }
        if args.aria2 {
            cmd.arg("--aria2");
            cmd.arg("--aria2-path").arg(&args.aria2_path);
            if !args.ensure_aria2.is_empty() {
                cmd.arg("--ensure-aria2").arg(&args.ensure_aria2);
            }
        }
        if args.dynamic {
            cmd.arg("--dynamic");
            cmd.arg("--min-split").arg(args.min_split.to_string());
        }
        cmd.arg("--yt-dlp-path").arg(&args.yt_dlp_path);
        // `--` so a queue line starting with `-` can never become a flag.
        cmd.arg("--").arg(url);
        eprintln!("[queue {}/{}] {}", i + 1, urls.len(), url);
        match cmd.status().await {
            Ok(s) if s.success() => ok += 1,
            Ok(s) => {
                fail += 1;
                eprintln!("[queue] {} failed: {}", url, s);
            }
            Err(e) => {
                fail += 1;
                eprintln!("[queue] {} spawn error: {}", url, e);
            }
        }
    }
    println!("[*] queue done: {} ok, {} failed", ok, fail);
    if fail > 0 {
        anyhow::bail!("{} queue item(s) failed", fail);
    }
    Ok(())
}

/// The vault commands, before anything else: they need no network, no URL and
/// no output directory, and `idm --secrets-get REF` with no URL must not be
/// taken for a download.
fn run_vault(args: &Args) -> Option<anyhow::Result<()>> {
    let dir = args
        .state_dir
        .clone()
        .unwrap_or_else(|| PathBuf::from(".idm-gui"));
    let vault = secrets::Vault::new(&dir);
    if args.secrets_set {
        return Some((|| {
            use std::io::Read;
            let mut value = String::new();
            std::io::stdin().read_to_string(&mut value)?;
            // A trailing newline from `echo` is not part of the password.
            let reference = vault.set(value.trim_end_matches(['\n', '\r']))?;
            println!("{}", reference);
            Ok(())
        })());
    }
    if let Some(r) = args.secrets_get.as_deref() {
        return Some(vault.get(r).map(|v| println!("{}", v)));
    }
    if let Some(r) = args.secrets_del.as_deref() {
        return Some(vault.del(r));
    }
    if args.secrets_status {
        return Some(if vault.exists() {
            vault.key_source().map(|s| println!("{}", s.describe()))
        } else {
            println!("no stored passwords yet");
            Ok(())
        });
    }
    None
}

async fn run(mut args: Args) -> anyhow::Result<()> {
    if let Some(r) = run_vault(&args) {
        return r;
    }
    if let Some(addr) = args.serve.clone() {
        let out_dir = args
            .output_dir
            .clone()
            .unwrap_or_else(|| PathBuf::from("."));
        let state_dir = args
            .state_dir
            .clone()
            .unwrap_or_else(|| PathBuf::from(".idm-gui"));
        let engine = std::env::current_exe()?;
        return gui::serve(
            addr,
            out_dir,
            state_dir,
            args.max_concurrent,
            engine,
            args.yt_dlp_path.clone(),
            args.api_token.clone(),
        )
        .await;
    }

    // IDM-style scheme unwrapping: `idmdwnlmfv9://<url>` means "download <url>",
    // a bare `idmreg:` trigger means "nothing to download".
    if let Some(u) = &args.url {
        if is_idm_wrapped(u) {
            match unwrap_idm_scheme(u) {
                Some(inner) => {
                    // The wrapped scheme is registered desktop-wide, so any web
                    // page can hand us a payload. Only http(s) targets are
                    // accepted — never file://, never a bare local path.
                    let l = inner.to_ascii_lowercase();
                    if !(l.starts_with("http://") || l.starts_with("https://")) {
                        anyhow::bail!(
                            "refusing wrapped URL with non-http(s) target: {}",
                            inner
                        );
                    }
                    println!("[*] scheme     : unwrapped {}", inner);
                    args.url = Some(inner);
                }
                None => {
                    println!("[+] idmreg trigger received — nothing to download");
                    return Ok(());
                }
            }
        }
    }

    let net = Net {
        ua: args.user_agent.clone(),
        cookie: args.cookie.clone(),
        referer: args.referer.clone(),
        limit_rate: args.limit_rate,
        auth: auth_from(&args),
    };

    // Media path: explicit --force-media/--list-formats, or a URL that looks
    // like a stream / known media site (unless --no-media).
    if args.queue.is_some() {
        return run_queue(&args).await;
    }

    let wait = schedule_wait(&args)?;
    if !wait.is_zero() {
        let until = chrono::Local::now()
            + chrono::Duration::from_std(wait).unwrap_or_default();
        eprintln!(
            "[*] scheduled: waiting {}s (until {})",
            wait.as_secs(),
            until.format("%Y-%m-%d %H:%M:%S")
        );
        tokio::time::sleep(wait).await;
    }

    let url = match &args.url {
        Some(u) if !u.is_empty() => u.clone(),
        _ => {
            eprintln!("[x] error: missing URL (or use --queue FILE)");
            std::process::exit(2);
        }
    };

    // Where the file goes, decided once. A name we invented from the URL never
    // clobbers an existing file (see free_path); --output and --resume do
    // exactly what they say.
    let out = {
        let p = resolve_out_path(
            &url,
            args.output.as_deref(),
            args.category_dir.as_deref(),
            args.output_dir.as_deref(),
        );
        if args.output.is_none() && !args.resume {
            free_path(&p)
        } else {
            p
        }
    };

    let mut builder = reqwest::Client::builder();
    if let Some(p) = &args.proxy {
        builder = builder.proxy(
            reqwest::Proxy::all(p).map_err(|e| anyhow::anyhow!("bad proxy {}: {}", p, e))?,
        );
    }
    let client = Arc::new(
        builder
            .build()
            .map_err(|e| anyhow::anyhow!("client: {}", e))?,
    );

    let mut use_media =
        !args.no_media
            && (args.force_media
                || args.yt_dlp
                || args.list_formats
                || media::is_media_url(&url));

    // A URL whose last path segment has no file extension names a *page*, not
    // a file. If the server answers `text/html` and yt-dlp is available, this
    // is a video/web page -> hand it to the media backend (what IDM does).
    // Without yt-dlp we fall through and save whatever the server returns.
    if !use_media && !args.no_media && media::yt_dlp_available(&args.yt_dlp_path)
        && !media::has_file_extension(&url)
    {
        if let Some(ct) = probe_content_type(&client, &url, &net).await {
            if ct.contains("html") {
                println!("[*] HTML page detected -> media backend (yt-dlp)");
                use_media = true;
            }
        }
    }

    if use_media {
        // Name a media download after its title only when the user gave no
        // destination at all. An explicit --output, --category-dir or
        // --output-dir pins the path (the host's category_dir test relies on
        // the URL-derived name landing in e.g. Video/movie.mp4).
        let pinned = args.output.is_some()
            || args.category_dir.is_some()
            || args.output_dir.is_some();
        // --aria2 does NOT mean "skip yt-dlp" here. It used to: the aria2
        // branch sat in front of this decision, so a video page went to
        // aria2c as a page and what landed on disk was the HTML. The two
        // belong together -- yt-dlp resolves the media URL, aria2c moves the
        // bytes -- which is what yt-dlp's own --downloader is for.
        return run_media(&args, &net, &url, if pinned { Some(out) } else { None }).await;
    }

    // Not media: a plain file with --aria2 goes straight to aria2c, as before.
    if args.aria2 {
        return run_aria2(&args, &url, out).await;
    }

    if args.dynamic {
        return run_direct_dynamic(&args, &net, client, &url, out).await;
    }
    run_direct(&args, &net, client, &url, out).await
}

#[tokio::main]
async fn main() {
    // The verbs come first: `url` is an optional positional, so clap would
    // read `update` as a URL. Anything that is not a verb falls through
    // untouched.
    if let Some(code) = verbs::dispatch().await {
        std::process::exit(code);
    }
    let args = Args::parse();
    let serving = args.serve.is_some();
    if let Err(e) = run(args).await {
        eprintln!("[x] error: {:#}", e);
        std::process::exit(1);
    }
    // One line at the end of a finished command, from the cache somebody else
    // already filled. A download must never pay for a release lookup, and the
    // long-running server must not interrupt itself with news.
    if !serving {
        update_notice();
    }
}

/// Mention a newer release if a recent check found one. Silent otherwise —
/// including when there is no cache at all, which is the normal state on a
/// machine that has never opened the window.
fn update_notice() {
    const WEEK: std::time::Duration = std::time::Duration::from_secs(7 * 24 * 60 * 60);
    if let Some(tag) = update::cached_notice(&verbs::idm_dir(), WEEK) {
        eprintln!("[i] je nová verze {tag} — nainstaluj ji: idm update");
    }
}