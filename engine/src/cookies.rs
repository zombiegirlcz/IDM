//! Browser cookies (`chrome.cookies` objects) as a Netscape cookie file for
//! yt-dlp's `--cookies`. Shared by idm-host (one request) and the window's
//! queue (one item's lifetime). The file holds live session cookies, so it is
//! always created private (0600) and never by overwriting something else.

use std::path::Path;

/// One Netscape line, or None for a cookie whose fields would break the
/// tab/newline format (a value smuggling a second line in, say).
pub fn netscape_line(c: &serde_json::Value) -> Option<String> {
    let s = |k: &str| c.get(k).and_then(|v| v.as_str()).unwrap_or("");
    let (domain, path, name, value) = (s("domain"), s("path"), s("name"), s("value"));
    let clean = |f: &str| !f.chars().any(|ch| ch == '\t' || ch == '\n' || ch == '\r');
    if domain.is_empty() || name.is_empty() || ![domain, path, name, value].iter().all(|f| clean(f)) {
        return None;
    }
    let flag = |b: bool| if b { "TRUE" } else { "FALSE" };
    let secure = c.get("secure").and_then(|v| v.as_bool()).unwrap_or(false);
    let http_only = c.get("httpOnly").and_then(|v| v.as_bool()).unwrap_or(false);
    // A session cookie has no expiry; 0 would read as long expired, so give
    // it a day -- the file lives for one request or one queue item anyway.
    let expiry = match c.get("expirationDate").and_then(|v| v.as_f64()) {
        Some(e) if e > 0.0 => e as u64,
        _ => std::time::SystemTime::now()
            .duration_since(std::time::UNIX_EPOCH)
            .map(|d| d.as_secs() + 86_400)
            .unwrap_or(u64::MAX / 2),
    };
    Some(format!(
        "{}{}\t{}\t{}\t{}\t{}\t{}\t{}",
        if http_only { "#HttpOnly_" } else { "" },
        domain,
        flag(domain.starts_with('.')),
        if path.is_empty() { "/" } else { path },
        flag(secure),
        expiry,
        name,
        value
    ))
}

/// The whole file, or None when no cookie survived.
pub fn netscape_file(list: &[serde_json::Value]) -> Option<String> {
    let lines: Vec<String> = list.iter().filter_map(netscape_line).collect();
    if lines.is_empty() {
        return None;
    }
    Some(format!("# Netscape HTTP Cookie File\n{}\n", lines.join("\n")))
}

/// Create `path` (which must not exist yet) readable by the owner only.
pub fn write_private(path: &Path, body: &str) -> std::io::Result<()> {
    use std::io::Write;
    let mut opts = std::fs::OpenOptions::new();
    opts.write(true).create_new(true);
    #[cfg(unix)]
    {
        use std::os::unix::fs::OpenOptionsExt;
        opts.mode(0o600);
    }
    opts.open(path)?.write_all(body.as_bytes())
}
