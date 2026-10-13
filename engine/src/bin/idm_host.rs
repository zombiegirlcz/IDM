// idm-host — Chrome native-messaging host for the idm engine.
//
// Framing (Chrome native messaging): each message on stdin/stdout is
//   [4-byte little-endian length][JSON payload]
//
// Trust boundary: input from the browser drives process spawning and file
// writes, so the host validates before acting:
//   * URL scheme must be http or https
//   * --allowed-dir is MANDATORY; the output path must resolve inside it.
//     Without it the host fails closed (exits non-zero, writes nothing).
//
// Supported requests:
//   {"action":"ping"}
//     -> {"ok":true,"msg":"pong"}
//   {"action":"download","url":"...","output":"...","connections":N,
//    "force_media":bool,"format":"...","limit_rate":N,
//    "cookie":"...","referer":"..."}
//     -> {"ok":true,"size":N,"crc32":"...","output":"..."}
//     -> {"ok":false,"error":"..."} on failure
//   {"action":"list_formats","url":"..."}
//     -> {"ok":true,"title":...,"formats":[...]}  (media backend)

use std::io::{Read, Write};
use std::path::{Component, Path, PathBuf};
use std::process::Command;

fn read_exact_or_eof<R: Read>(r: &mut R, buf: &mut [u8]) -> std::io::Result<bool> {
    let mut filled = 0;
    while filled < buf.len() {
        match r.read(&mut buf[filled..]) {
            Ok(0) => {
                if filled == 0 {
                    return Ok(false);
                }
                return Err(std::io::Error::new(
                    std::io::ErrorKind::UnexpectedEof,
                    "truncated frame",
                ));
            }
            Ok(n) => filled += n,
            Err(e) if e.kind() == std::io::ErrorKind::Interrupted => continue,
            Err(e) => return Err(e),
        }
    }
    Ok(true)
}

fn read_frame<R: Read>(r: &mut R) -> std::io::Result<Option<Vec<u8>>> {
    let mut lenb = [0u8; 4];
    if !read_exact_or_eof(r, &mut lenb)? {
        return Ok(None);
    }
    let len = u32::from_le_bytes(lenb) as usize;
    if len == 0 {
        return Ok(Some(Vec::new()));
    }
    // Chrome never sends a frame larger than 1 MiB; refuse to allocate for a
    // bogus length instead of trusting it.
    const MAX_FRAME: usize = 1 << 20;
    if len > MAX_FRAME {
        return Err(std::io::Error::new(
            std::io::ErrorKind::InvalidData,
            "native messaging frame too large",
        ));
    }
    let mut body = vec![0u8; len];
    if !read_exact_or_eof(r, &mut body)? {
        // A length header with no body at all is a truncated frame, not an
        // empty message.
        return Err(std::io::Error::new(
            std::io::ErrorKind::UnexpectedEof,
            "truncated frame body",
        ));
    }
    Ok(Some(body))
}

fn write_frame<W: Write>(w: &mut W, v: &serde_json::Value) -> std::io::Result<()> {
    let body = serde_json::to_vec(v).unwrap();
    let len = body.len() as u32;
    w.write_all(&len.to_le_bytes())?;
    w.write_all(&body)?;
    w.flush()
}

fn crc32_file(path: &Path) -> std::io::Result<(u64, u32)> {
    use std::io::BufReader;
    let f = std::fs::File::open(path)?;
    let mut r = BufReader::new(f);
    let mut hasher = crc32fast::Hasher::new();
    let mut buf = vec![0u8; 1 << 20];
    let mut total = 0u64;
    loop {
        let n = r.read(&mut buf)?;
        if n == 0 {
            break;
        }
        hasher.update(&buf[..n]);
        total += n as u64;
    }
    Ok((total, hasher.finalize()))
}

/// Only http and https are allowed.
fn scheme_allowed(url: &str) -> bool {
    let lower = url.to_ascii_lowercase();
    lower.starts_with("http://") || lower.starts_with("https://")
}

/// Lexically normalize a path (resolve `.` / `..` without touching the FS).
fn normalize(path: &Path) -> PathBuf {
    let mut out = PathBuf::new();
    for c in path.components() {
        match c {
            Component::CurDir => {}
            Component::ParentDir => {
                out.pop();
            }
            other => out.push(other.as_os_str()),
        }
    }
    out
}

/// Resolve `output` to an absolute normalized path, using its existing parent
/// as the anchor when the file itself does not exist yet.
fn resolve_output(output: &Path) -> PathBuf {
    if let Ok(c) = output.canonicalize() {
        return c;
    }
    let abs = if output.is_absolute() {
        output.to_path_buf()
    } else {
        std::env::current_dir()
            .unwrap_or_else(|_| PathBuf::from("/"))
            .join(output)
    };
    if let Some(parent) = abs.parent() {
        if let Ok(cp) = parent.canonicalize() {
            if let Some(name) = abs.file_name() {
                return cp.join(name);
            }
            return cp;
        }
    }
    normalize(&abs)
}

/// True when `output` resolves inside `allowed` (which is canonicalized here).
fn output_allowed(output: &Path, allowed: &Path) -> bool {
    let allowed = allowed.canonicalize().unwrap_or_else(|_| normalize(allowed));
    let resolved = resolve_output(output);
    resolved.starts_with(&allowed)
}

fn default_output(url: &str) -> PathBuf {
    let u = url.trim_end_matches('/');
    let name = u.rsplit('/').next().unwrap_or("download.bin");
    let name = name.split('?').next().unwrap_or(name);
    if name.is_empty() {
        PathBuf::from("download.bin")
    } else {
        PathBuf::from(name)
    }
}

/// Mirror of the engine's category mapping, so the host can report where the
/// file actually landed when `category_dir` is used.
fn category_subdir(url: &str) -> &'static str {
    let name = default_output(url);
    let name = name.to_string_lossy().to_ascii_lowercase();
    let ext = name.rsplit('.').next().unwrap_or("");
    match ext {
        "mp4" | "mkv" | "avi" | "mov" | "webm" | "flv" | "m4v" => "Video",
        "mp3" | "m4a" | "flac" | "wav" | "ogg" | "aac" | "opus" => "Music",
        "pdf" | "doc" | "docx" | "txt" | "epub" | "rtf" | "odt" => "Documents",
        "zip" | "rar" | "7z" | "tar" | "gz" | "bz2" | "xz" => "Compressed",
        "exe" | "msi" | "deb" | "apk" | "dmg" | "rpm" | "appimage" => "Programs",
        _ => "Other",
    }
}

/// The path the engine will actually write to.
fn final_path(out: &Option<PathBuf>, cat: &Option<PathBuf>, url: &str) -> PathBuf {
    if let Some(o) = out {
        return o.clone();
    }
    if let Some(c) = cat {
        return c.join(category_subdir(url)).join(default_output(url));
    }
    default_output(url)
}

fn opt_str<'a>(req: &'a serde_json::Value, key: &str) -> Option<&'a str> {
    req.get(key).and_then(|v| v.as_str())
}

fn opt_bool(req: &serde_json::Value, key: &str) -> bool {
    req.get(key).and_then(|v| v.as_bool()).unwrap_or(false)
}

fn opt_u64(req: &serde_json::Value, key: &str) -> Option<u64> {
    req.get(key).and_then(|v| v.as_u64())
}

/// Validate the URL and return it, or an error JSON ready to send back.
fn check_url(req: &serde_json::Value) -> Result<String, serde_json::Value> {
    let url = match opt_str(req, "url") {
        Some(u) if !u.is_empty() => u.to_string(),
        _ => return Err(serde_json::json!({"ok": false, "error": "missing url"})),
    };
    if !scheme_allowed(&url) {
        return Err(serde_json::json!({
            "ok": false,
            "error": format!("url scheme not allowed (only http/https): {}", url)
        }));
    }
    Ok(url)
}

fn outside(allowed_dir: &Path, what: &str, p: &Path) -> serde_json::Value {
    serde_json::json!({
        "ok": false,
        "error": format!(
            "{} path outside allowed dir: {} (allowed: {})",
            what,
            p.display(),
            allowed_dir.display()
        )
    })
}

/// Resolve where the download should land.
///
/// Priority: explicit `output` > `category_dir` (engine routes into a type
/// subfolder) > default basename inside the allowed dir. Both paths are
/// contained within `allowed_dir` (fail-closed).
fn check_output(
    req: &serde_json::Value,
    url: &str,
    allowed_dir: &Path,
) -> Result<(Option<PathBuf>, Option<PathBuf>), serde_json::Value> {
    if let Some(o) = opt_str(req, "output") {
        let out = PathBuf::from(o);
        if !output_allowed(&out, allowed_dir) {
            return Err(outside(allowed_dir, "output", &out));
        }
        return Ok((Some(out), None));
    }
    if let Some(cd) = opt_str(req, "category_dir") {
        let cat = PathBuf::from(cd);
        if !output_allowed(&cat, allowed_dir) {
            return Err(outside(allowed_dir, "category", &cat));
        }
        return Ok((None, Some(cat)));
    }
    let out = allowed_dir.join(default_output(url));
    if !output_allowed(&out, allowed_dir) {
        return Err(outside(allowed_dir, "output", &out));
    }
    Ok((Some(out), None))
}

struct HostCtx<'a> {
    engine: &'a Path,
    allowed_dir: &'a Path,
    yt_dlp: &'a Path,
}

fn handle(req: &serde_json::Value, ctx: &HostCtx) -> serde_json::Value {
    let action = opt_str(req, "action").unwrap_or("");
    match action {
        "ping" => serde_json::json!({"ok": true, "msg": "pong"}),
        "list_formats" => {
            let url = match check_url(req) {
                Ok(u) => u,
                Err(e) => return e,
            };
            let mut cmd = Command::new(ctx.engine);
            cmd.arg("--yt-dlp").arg(ctx.yt_dlp);
            cmd.arg("--list-formats").arg(&url);
            if let Some(c) = opt_str(req, "cookie") {
                cmd.arg("--cookie").arg(c);
            }
            if let Some(r) = opt_str(req, "referer") {
                cmd.arg("--referer").arg(r);
            }
            if let Some(p) = opt_str(req, "proxy") {
                cmd.arg("--proxy").arg(p);
            }
            match cmd.output() {
                Ok(o) if o.status.success() => {
                    match serde_json::from_slice::<serde_json::Value>(&o.stdout) {
                        Ok(v) => {
                            let mut out = serde_json::json!({"ok": true});
                            if let (Some(dst), Some(src)) = (out.as_object_mut(), v.as_object()) {
                                for (k, val) in src {
                                    dst.insert(k.clone(), val.clone());
                                }
                            }
                            out
                        }
                        Err(e) => serde_json::json!({
                            "ok": false,
                            "error": format!("parsing format list: {}", e)
                        }),
                    }
                }
                Ok(o) => serde_json::json!({
                    "ok": false,
                    "error": format!("list_formats failed: {}", String::from_utf8_lossy(&o.stderr).trim())
                }),
                Err(e) => serde_json::json!({
                    "ok": false,
                    "error": format!("failed to spawn engine: {}", e)
                }),
            }
        }
        "download" => {
            let url = match check_url(req) {
                Ok(u) => u,
                Err(e) => return e,
            };
            let (out, cat) = match check_output(req, &url, ctx.allowed_dir) {
                Ok(o) => o,
                Err(e) => return e,
            };

            let conns = opt_u64(req, "connections").unwrap_or(4);
            let mut cmd = Command::new(ctx.engine);
            cmd.arg("-n").arg(conns.to_string());
            if let Some(o) = &out {
                cmd.arg("-o").arg(o);
            }
            if let Some(c) = &cat {
                cmd.arg("--category-dir").arg(c);
            }
            // Use the same media backend binary as list_formats.
            cmd.arg("--yt-dlp").arg(ctx.yt_dlp);

            if let Some(f) = opt_str(req, "format") {
                cmd.arg("--format").arg(f);
            }
            if opt_bool(req, "force_media") {
                cmd.arg("--force-media");
            }
            if let Some(r) = opt_u64(req, "limit_rate") {
                if r > 0 {
                    cmd.arg("--limit-rate").arg(r.to_string());
                }
            }
            if let Some(c) = opt_str(req, "cookie") {
                cmd.arg("--cookie").arg(c);
            }
            if let Some(r) = opt_str(req, "referer") {
                cmd.arg("--referer").arg(r);
            }
            if let Some(p) = opt_str(req, "proxy") {
                cmd.arg("--proxy").arg(p);
            }
            if opt_bool(req, "dynamic") {
                cmd.arg("--dynamic");
                if let Some(ms) = opt_u64(req, "min_split") {
                    cmd.arg("--min-split").arg(ms.to_string());
                }
            }
            if opt_bool(req, "aria2") {
                cmd.arg("--aria2");
                if let Some(p) = opt_str(req, "aria2_path") {
                    cmd.arg("--aria2-path").arg(p);
                }
            }

            // `--` so a URL starting with `-` cannot become a flag.
            cmd.arg("--").arg(&url);

            cmd.stdout(std::process::Stdio::null());
            cmd.stderr(std::process::Stdio::null());

            let status = match cmd.status() {
                Ok(s) => s,
                Err(e) => {
                    return serde_json::json!({
                        "ok": false,
                        "error": format!("failed to spawn engine: {}", e)
                    })
                }
            };
            if !status.success() {
                return serde_json::json!({
                    "ok": false,
                    "error": format!("engine exited with {}", status)
                });
            }

            let final_out = final_path(&out, &cat, &url);
            match crc32_file(&final_out) {
                Ok((size, crc)) => serde_json::json!({
                    "ok": true,
                    "size": size,
                    "crc32": format!("{:08x}", crc),
                    "output": final_out.to_string_lossy(),
                }),
                Err(e) => serde_json::json!({
                    "ok": false,
                    "error": format!("output not readable: {}", e)
                }),
            }
        }
        other => serde_json::json!({
            "ok": false,
            "error": format!("unknown action: {}", other)
        }),
    }
}

fn main() {
    let mut engine: Option<PathBuf> = None;
    let mut allowed_dir: Option<PathBuf> = None;
    let mut yt_dlp: Option<PathBuf> = None;
    let mut args = std::env::args().skip(1);
    while let Some(a) = args.next() {
        match a.as_str() {
            "--engine" => {
                if let Some(p) = args.next() {
                    engine = Some(PathBuf::from(p));
                }
            }
            "--allowed-dir" => {
                if let Some(p) = args.next() {
                    allowed_dir = Some(PathBuf::from(p));
                }
            }
            "--yt-dlp" => {
                if let Some(p) = args.next() {
                    yt_dlp = Some(PathBuf::from(p));
                }
            }
            _ => {}
        }
    }
    let engine = engine.unwrap_or_else(|| {
        let mut p = std::env::current_exe().unwrap_or_else(|_| PathBuf::from("idm-host"));
        p.set_file_name("idm");
        p
    });
    let yt_dlp = yt_dlp.unwrap_or_else(|| PathBuf::from("yt-dlp"));

    // --allowed-dir is mandatory: without it the host fails closed so a page
    // can never cause a write outside a controlled directory.
    //
    // On Linux the installer passes it through a shell wrapper. Windows browsers
    // spawn a native host with no arguments and there is no wrapper, so the
    // installer persists IDM_ALLOWED_DIR for the user and we fall back to it.
    // This does NOT weaken fail-closed: with neither the flag nor the variable
    // the host still exits non-zero and writes nothing.
    let allowed_dir = match allowed_dir {
        Some(d) => d,
        None => match std::env::var_os("IDM_ALLOWED_DIR") {
            Some(v) if !v.is_empty() => PathBuf::from(v),
            _ => {
                eprintln!(
                    "idm-host: --allowed-dir <DIR> (or IDM_ALLOWED_DIR) is required (fail-closed)"
                );
                std::process::exit(2);
            }
        },
    };

    let ctx = HostCtx {
        engine: &engine,
        allowed_dir: &allowed_dir,
        yt_dlp: &yt_dlp,
    };

    let stdin = std::io::stdin();
    let stdout = std::io::stdout();
    let mut lock_in = stdin.lock();
    let mut lock_out = stdout.lock();

    loop {
        let frame = match read_frame(&mut lock_in) {
            Ok(Some(f)) => f,
            Ok(None) => break,
            Err(_) => break,
        };
        let req: serde_json::Value = match serde_json::from_slice(&frame) {
            Ok(v) => v,
            Err(e) => {
                let _ = write_frame(
                    &mut lock_out,
                    &serde_json::json!({"ok": false, "error": format!("bad json: {}", e)}),
                );
                continue;
            }
        };
        // Contract: echo the request `id` so the extension can correlate the
        // reply (background.js keeps a pending map keyed by id).
        let req_id = req.get("id").cloned();
        let mut resp = handle(&req, &ctx);
        if let Some(id) = req_id {
            if let Some(obj) = resp.as_object_mut() {
                obj.insert("id".to_string(), id);
            }
        }
        if write_frame(&mut lock_out, &resp).is_err() {
            break;
        }
    }
}