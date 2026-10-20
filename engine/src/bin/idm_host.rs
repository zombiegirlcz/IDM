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
//   {"action":"get_settings"}       (needs --settings or IDM_SETTINGS)
//     -> {"ok":true,"title":...,"formats":[...]}  (media backend)

use std::io::{Read, Write};
use std::path::{Component, Path, PathBuf};
use std::process::Command;

#[path = "../cookies.rs"]
mod cookies;

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
    /// settings.json the GUI writes, when the installer told us where it is.
    settings: Option<&'a Path>,
}

/// Copy a list of strings under `key`, dropping entries of any other type.
/// A field that is not a list at all is omitted entirely, so the extension
/// falls back to its own default for it (normalizeCaptureSettings).
fn copy_str_list(
    dst: &mut serde_json::Map<String, serde_json::Value>,
    src: &serde_json::Value,
    key: &str,
) {
    if let Some(arr) = src.get(key).and_then(|v| v.as_array()) {
        let kept: Vec<serde_json::Value> =
            arr.iter().filter(|v| v.is_string()).cloned().collect();
        dst.insert(key.to_string(), serde_json::Value::Array(kept));
    }
}

fn copy_string(
    dst: &mut serde_json::Map<String, serde_json::Value>,
    src: &serde_json::Value,
    key: &str,
) {
    if let Some(v) = src.get(key).and_then(|v| v.as_str()) {
        dst.insert(key.to_string(), serde_json::Value::String(v.to_string()));
    }
}

fn copy_pos_int(
    dst: &mut serde_json::Map<String, serde_json::Value>,
    src: &serde_json::Value,
    key: &str,
) {
    if let Some(n) = src.get(key).and_then(|v| v.as_u64()) {
        if n > 0 {
            dst.insert(key.to_string(), serde_json::Value::from(n));
        }
    }
}

/// The capture-relevant subset of settings.json, built as an explicit
/// WHITELIST. The same file holds auth credentials, the proxy and local paths;
/// a blacklist would leak the next sensitive field someone adds, so nothing is
/// copied here unless it is named below.
fn capture_subset(raw: &serde_json::Value) -> serde_json::Value {
    let empty = serde_json::json!({});
    let ft = raw.get("file_types").unwrap_or(&empty);
    let general = raw.get("general").unwrap_or(&empty);
    let conn = raw.get("connection").unwrap_or(&empty);

    let mut ft_out = serde_json::Map::new();
    copy_str_list(&mut ft_out, ft, "auto");
    copy_str_list(&mut ft_out, ft, "exclude_sites");
    copy_str_list(&mut ft_out, ft, "exclude_addresses");

    let mut g_out = serde_json::Map::new();
    copy_string(&mut g_out, general, "force_keys");
    copy_string(&mut g_out, general, "prevent_keys");

    let mut c_out = serde_json::Map::new();
    copy_pos_int(&mut c_out, conn, "max_connections");

    serde_json::json!({
        "file_types": serde_json::Value::Object(ft_out),
        "general": serde_json::Value::Object(g_out),
        "connection": serde_json::Value::Object(c_out),
    })
}

/// Answer `get_settings`. This never fails: without a path, without a file or
/// with unparsable contents the caller is told to use its own defaults, because
/// a broken settings.json must not silently switch download capture off.
fn get_settings(ctx: &HostCtx) -> serde_json::Value {
    let default = serde_json::json!({"ok": true, "source": "default", "settings": null});
    let path = match ctx.settings {
        Some(p) => p,
        None => return default,
    };
    let bytes = match std::fs::read(path) {
        Ok(b) => b,
        Err(_) => return default,
    };
    let raw: serde_json::Value = match serde_json::from_slice(&bytes) {
        Ok(v) => v,
        Err(_) => return default,
    };
    if !raw.is_object() {
        return default;
    }
    serde_json::json!({"ok": true, "source": "file", "settings": capture_subset(&raw)})
}

/// The last few meaningful lines of a child's stderr, for an error message.
/// Progress bars redraw with `\r`, so those count as line breaks too.
fn stderr_tail(raw: &[u8]) -> String {
    let text = String::from_utf8_lossy(raw);
    let lines: Vec<&str> = text
        .split(|c| c == '\n' || c == '\r')
        .map(str::trim)
        .filter(|l| !l.is_empty())
        .collect();
    let tail = lines[lines.len().saturating_sub(3)..].join(" | ");
    if tail.chars().count() > 800 {
        let cut: String = tail.chars().skip(tail.chars().count() - 800).collect();
        format!("…{}", cut)
    } else {
        tail
    }
}

/// Browser cookies (`chrome.cookies` objects) written out as a Netscape
/// cookie file for yt-dlp. Private (0600) and removed when dropped: these are
/// live session cookies.
struct CookieFile(PathBuf);

impl Drop for CookieFile {
    fn drop(&mut self) {
        let _ = std::fs::remove_file(&self.0);
    }
}

/// Write the request's `cookies` (if any) and point the engine at them.
fn attach_cookies(cmd: &mut Command, req: &serde_json::Value) -> Option<CookieFile> {
    let body = cookies::netscape_file(req.get("cookies")?.as_array()?)?;
    static N: std::sync::atomic::AtomicU64 = std::sync::atomic::AtomicU64::new(0);
    let n = N.fetch_add(1, std::sync::atomic::Ordering::SeqCst);
    let path = std::env::temp_dir().join(format!("idm-cookies-{}-{}.txt", std::process::id(), n));
    cookies::write_private(&path, &body).ok()?;
    let guard = CookieFile(path);
    cmd.env("IDM_COOKIES_FILE", &guard.0);
    Some(guard)
}

/// Where the window's server listens and its API secret, when it is running.
/// Both files sit in the state dir, which is the directory of settings.json.
fn gui_endpoint(ctx: &HostCtx) -> Option<(String, String)> {
    let state = ctx
        .settings
        .and_then(|p| p.parent().map(Path::to_path_buf))
        .or_else(|| std::env::var_os("IDM_STATE_DIR").map(PathBuf::from))?;
    let addr = std::fs::read_to_string(state.join("api-addr")).ok()?.trim().to_string();
    let token = std::fs::read_to_string(state.join("api-token")).ok()?.trim().to_string();
    if addr.is_empty() || token.is_empty() {
        return None;
    }
    Some((addr, token))
}

/// One JSON POST to the window's API; the parsed reply when it is a 200.
fn post_json(addr: &str, token: &str, path: &str, body: &serde_json::Value) -> Option<serde_json::Value> {
    use std::net::{TcpStream, ToSocketAddrs};
    use std::time::Duration;
    let sock = addr.to_socket_addrs().ok()?.next()?;
    let mut s = TcpStream::connect_timeout(&sock, Duration::from_secs(2)).ok()?;
    s.set_read_timeout(Some(Duration::from_secs(10))).ok()?;
    s.set_write_timeout(Some(Duration::from_secs(10))).ok()?;
    let body = body.to_string();
    let req = format!(
        "POST {} HTTP/1.1\r\nHost: {}\r\nContent-Type: application/json\r\nX-IDM-Token: {}\r\nContent-Length: {}\r\nConnection: close\r\n\r\n{}",
        path, addr, token, body.len(), body
    );
    s.write_all(req.as_bytes()).ok()?;
    let mut resp = Vec::new();
    s.read_to_end(&mut resp).ok()?;
    let text = String::from_utf8_lossy(&resp);
    let (head, payload) = text.split_once("\r\n\r\n")?;
    if head.split_whitespace().nth(1) != Some("200") {
        return None;
    }
    serde_json::from_str(payload).ok()
}

/// Put the download into the window's queue, where the user sees its
/// progress, instead of running it inside this process. None = no window
/// (or it refused): the caller downloads by itself, as it always did.
fn hand_to_gui(req: &serde_json::Value, url: &str, out: &Path, ctx: &HostCtx) -> Option<serde_json::Value> {
    let (addr, token) = gui_endpoint(ctx)?;
    let mut body = serde_json::json!({
        "url": url,
        "out_dir": out.parent()?.to_string_lossy(),
        "filename": out.file_name()?.to_string_lossy(),
        "force_media": opt_bool(req, "force_media"),
    });
    let obj = body.as_object_mut()?;
    if let Some(n) = opt_u64(req, "connections") {
        obj.insert("connections".into(), n.into());
    }
    if let Some(r) = opt_u64(req, "limit_rate") {
        obj.insert("limit_rate".into(), r.into());
    }
    for key in ["format", "cookie", "referer", "proxy"] {
        if let Some(v) = opt_str(req, key) {
            obj.insert(key.into(), v.into());
        }
    }
    if opt_bool(req, "aria2") {
        obj.insert("aria2".into(), true.into());
    }
    if let Some(c) = req.get("cookies").filter(|c| c.is_array()) {
        obj.insert("cookies".into(), c.clone());
    }
    let reply = post_json(&addr, &token, "/api/add", &body)?;
    if reply.get("ok").and_then(|v| v.as_bool()) != Some(true) {
        return None;
    }
    Some(serde_json::json!({
        "ok": true,
        "queued": true,
        "gui_id": reply.get("id").cloned().unwrap_or(serde_json::Value::Null),
        "output": out.to_string_lossy(),
    }))
}

fn handle(req: &serde_json::Value, ctx: &HostCtx) -> serde_json::Value {
    let action = opt_str(req, "action").unwrap_or("");
    match action {
        "ping" => serde_json::json!({"ok": true, "msg": "pong"}),
        "get_settings" => get_settings(ctx),
        "list_formats" => {
            let url = match check_url(req) {
                Ok(u) => u,
                Err(e) => return e,
            };
            let mut cmd = Command::new(ctx.engine);
            cmd.arg("--yt-dlp-path").arg(ctx.yt_dlp);
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
            let _cookies = attach_cookies(&mut cmd, req);
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
            // The window is running: let its queue do it, so the download
            // shows up there with its progress (the path is the one already
            // checked against the allowed dir).
            if let Some(queued) = hand_to_gui(req, &url, &final_path(&out, &cat, &url), ctx) {
                return queued;
            }

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
            cmd.arg("--yt-dlp-path").arg(ctx.yt_dlp);

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
            // stderr is where the engine says WHY it failed (yt-dlp's own
            // message included); without it the browser only sees "exit 1".
            cmd.stderr(std::process::Stdio::piped());

            let _cookies = attach_cookies(&mut cmd, req);
            let run = match cmd.output() {
                Ok(o) => o,
                Err(e) => {
                    return serde_json::json!({
                        "ok": false,
                        "error": format!("failed to spawn engine: {}", e)
                    })
                }
            };
            if !run.status.success() {
                let why = stderr_tail(&run.stderr);
                let error = if why.is_empty() {
                    format!("engine exited with {}", run.status)
                } else {
                    format!("engine exited with {}: {}", run.status, why)
                };
                return serde_json::json!({ "ok": false, "error": error });
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
    let mut settings: Option<PathBuf> = None;
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
            // Both spellings: the native-messaging manifest on a machine
            // may still be the one an older install wrote.
            "--yt-dlp" | "--yt-dlp-path" => {
                if let Some(p) = args.next() {
                    yt_dlp = Some(PathBuf::from(p));
                }
            }
            // Optional: the GUI's settings.json, so `get_settings` has
            // something to read. Absent, capture falls back to the
            // extension's own defaults.
            "--settings" => {
                if let Some(p) = args.next() {
                    settings = Some(PathBuf::from(p));
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
    let yt_dlp = yt_dlp.unwrap_or_else(|| {
        // Chrome spawns the native host with a minimal PATH that often lacks
        // /usr/local/bin, where yt-dlp is typically installed. Fall back to
        // common absolute locations before relying on PATH lookup.
        for cand in ["/usr/local/bin/yt-dlp", "/usr/bin/yt-dlp", "/opt/yt-dlp/yt-dlp"] {
            let p = PathBuf::from(cand);
            if p.is_file() { return p; }
        }
        PathBuf::from("yt-dlp")
    });

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

    // Windows browsers spawn the host with no arguments and there is no wrapper
    // to add --settings, so fall back to the variable the installer persists —
    // the same shape as --allowed-dir / IDM_ALLOWED_DIR above. Unlike that one
    // this is not fail-closed: with neither, get_settings simply reports
    // "default" and the extension uses its own defaults.
    let settings = settings.or_else(|| match std::env::var_os("IDM_SETTINGS") {
        Some(v) if !v.is_empty() => Some(PathBuf::from(v)),
        _ => None,
    });

    let ctx = HostCtx {
        engine: &engine,
        allowed_dir: &allowed_dir,
        yt_dlp: &yt_dlp,
        settings: settings.as_deref(),
    };

    let stdin = std::io::stdin();
    let mut lock_in = stdin.lock();
    // One thread per request: a download is answered only when the file is
    // complete, which for a video is minutes, and the popup must still get
    // its formats and pings meanwhile. Replies carry the request id, so their
    // order does not matter; the mutex keeps two frames from interleaving.
    // The scope joins every thread before returning, so the browser closing
    // the port does not kill a download already under way.
    let out = std::sync::Mutex::new(std::io::stdout());
    std::thread::scope(|scope| loop {
        let frame = match read_frame(&mut lock_in) {
            Ok(Some(f)) => f,
            Ok(None) => break,
            Err(_) => break,
        };
        let req: serde_json::Value = match serde_json::from_slice(&frame) {
            Ok(v) => v,
            Err(e) => {
                let mut w = out.lock().unwrap_or_else(|p| p.into_inner());
                let _ = write_frame(
                    &mut *w,
                    &serde_json::json!({"ok": false, "error": format!("bad json: {}", e)}),
                );
                continue;
            }
        };
        let (ctx, out) = (&ctx, &out);
        scope.spawn(move || {
            // Contract: echo the request `id` so the extension can correlate
            // the reply (background.js keeps a pending map keyed by id).
            let req_id = req.get("id").cloned();
            let mut resp = handle(&req, ctx);
            if let Some(id) = req_id {
                if let Some(obj) = resp.as_object_mut() {
                    obj.insert("id".to_string(), id);
                }
            }
            let mut w = out.lock().unwrap_or_else(|p| p.into_inner());
            let _ = write_frame(&mut *w, &resp);
        });
    });
}