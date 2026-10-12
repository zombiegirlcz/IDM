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
use std::path::{Path, PathBuf};
use std::sync::Arc;
use tokio::fs::OpenOptions as TokioOpenOptions;
use tokio::sync::{Mutex, Semaphore};

mod media;

#[derive(Parser, Debug)]
#[command(name = "idm", about = "Multi-connection downloader with resume (IDM-like POC)")]
struct Args {
    /// URL to download
    url: Option<String>,

    /// Output path (default: last path segment of URL, or media title)
    #[arg(short, long)]
    output: Option<PathBuf>,

    /// Number of parallel connections
    #[arg(short = 'n', long, default_value_t = 4)]
    connections: usize,

    /// Resume from a previous partial download
    #[arg(long, default_value_t = false)]
    resume: bool,

    /// User-Agent header
    #[arg(long, default_value = "Mozilla/5.0 (compatible; idm-engine/0.1)")]
    user_agent: String,

    /// Path to the yt-dlp binary used for media/stream downloads
    #[arg(long, default_value = "yt-dlp")]
    yt_dlp: PathBuf,

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
        rb
    }
}

fn out_path_for(url: &str, output: Option<&Path>) -> PathBuf {
    if let Some(o) = output {
        return o.to_path_buf();
    }
    let u = url.trim_end_matches('/');
    let name = u.rsplit('/').next().unwrap_or("download.bin");
    let name = name.split('?').next().unwrap_or(name);
    if name.is_empty() {
        PathBuf::from("download.bin")
    } else {
        PathBuf::from(name)
    }
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

/// Resolve the on-disk path for a URL, honouring --output and --category-dir.
fn resolve_out_path(url: &str, output: Option<&Path>, category_dir: Option<&Path>) -> PathBuf {
    if let Some(o) = output {
        return o.to_path_buf();
    }
    if let Some(base) = category_dir {
        let p = out_path_for(url, None);
        let name = p.file_name().map(|n| n.to_owned()).unwrap_or_default();
        return base.join(category_subdir(url)).join(name);
    }
    out_path_for(url, None)
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
    use std::os::unix::fs::FileExt;

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
                        out2.write_all_at(&buf, p)
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

    let (read_total, crc) = crc32_file(&out)?;
    println!("[*] downloaded   : {} bytes", read_total);
    println!("[*] crc32        : {:08x}", crc);
    if read_total != probe.total {
        anyhow::bail!("size mismatch: expected {}, got {}", probe.total, read_total);
    }

    let _ = tokio::fs::remove_file(&mpath).await;
    append_history(&args.history, url, &out, read_total, crc);
    println!("[+] done -> {}", out.display());
    Ok(())
}

/// Media/stream download through the yt-dlp backend.
async fn run_media(args: &Args, net: &Net, url: &str, out_override: Option<PathBuf>) -> anyhow::Result<()> {
    let cookie = net.cookie.as_deref();
    let referer = net.referer.as_deref();

    // --list-formats: report what the backend offers and exit.
    if args.list_formats {
        let meta = media::probe_json(&args.yt_dlp, url, cookie, referer, args.proxy.as_deref()).await?;
        println!("{}", serde_json::to_string_pretty(&media::summarize(&meta))?);
        return Ok(());
    }

    let out = match out_override {
        Some(o) => o,
        None => {
            let meta = media::probe_json(&args.yt_dlp, url, cookie, referer, args.proxy.as_deref()).await?;
            media::output_name(&meta, args.format.as_deref())
        }
    };

    println!("[*] url          : {}", url);
    println!("[*] backend      : yt-dlp ({})", args.yt_dlp.display());
    println!("[*] format       : {}", args.format.as_deref().unwrap_or("best"));
    println!("[*] output       : {}", out.display());

    if let Some(parent) = out.parent() {
        if !parent.as_os_str().is_empty() {
            tokio::fs::create_dir_all(parent).await?;
        }
    }
    media::download(
        &args.yt_dlp,
        url,
        &out,
        args.format.as_deref(),
        args.limit_rate,
        args.resume,
        cookie,
        referer,
        args.proxy.as_deref(),
    )
    .await?;

    let (size, crc) = crc32_file(&out)?;
    append_history(&args.history, url, &out, size, crc);
    println!("[*] downloaded   : {} bytes", size);
    println!("[*] crc32        : {:08x}", crc);
    println!("[+] done -> {}", out.display());
    Ok(())
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
    let text = tokio::fs::read_to_string(list).await?;
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
        if args.force_media {
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
        cmd.arg("--yt-dlp").arg(&args.yt_dlp);
        cmd.arg(url);
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

async fn run(args: Args) -> anyhow::Result<()> {
    let net = Net {
        ua: args.user_agent.clone(),
        cookie: args.cookie.clone(),
        referer: args.referer.clone(),
        limit_rate: args.limit_rate,
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

    let use_media =
        !args.no_media && (args.force_media || args.list_formats || media::is_media_url(&url));
    if use_media {
        let out = resolve_out_path(&url, args.output.as_deref(), args.category_dir.as_deref());
        return run_media(&args, &net, &url, Some(out)).await;
    }

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
    let out = resolve_out_path(&url, args.output.as_deref(), args.category_dir.as_deref());
    run_direct(&args, &net, client, &url, out).await
}

#[tokio::main]
async fn main() {
    let args = Args::parse();
    if let Err(e) = run(args).await {
        eprintln!("[x] error: {:#}", e);
        std::process::exit(1);
    }
}