//! `--auth-env`: the password must reach the engine without ever sitting in
//! argv.
//!
//! Step 1 of docs/superpowers/specs/2026-10-14-auth-at-rest-design.md. The GUI
//! used to spawn the engine with `--auth user:password`, and process arguments
//! are readable by every process of the same user through `ps` and
//! /proc/<pid>/cmdline. An environment variable is readable only by the owner,
//! so the GUI now passes the value that way and names it with `--auth-env`.

use std::io::{Read, Write};
use std::net::{TcpListener, TcpStream};
use std::path::PathBuf;
use std::process::Command;
use std::sync::atomic::{AtomicU64, Ordering};
use std::thread;

const IDM: &str = env!("CARGO_BIN_EXE_idm");
const BODY: &[u8] = b"behind-a-password";
const CREDS: &str = "alice:s3cret";

fn unique_dir(tag: &str) -> PathBuf {
    static C: AtomicU64 = AtomicU64::new(0);
    let n = C.fetch_add(1, Ordering::SeqCst);
    let d = std::env::temp_dir().join(format!("idm_authenv_{}_{}_{}", tag, std::process::id(), n));
    std::fs::create_dir_all(&d).unwrap();
    d
}

/// An origin that serves the body only to the right Basic credentials, and
/// answers 401 otherwise. `Authorization` is the only thing it looks at.
fn start_origin() -> String {
    let listener = TcpListener::bind("127.0.0.1:0").unwrap();
    let addr = format!("http://{}", listener.local_addr().unwrap());
    thread::spawn(move || {
        for stream in listener.incoming().flatten() {
            thread::spawn(move || {
                let _ = handle(stream);
            });
        }
    });
    addr
}

fn handle(mut s: TcpStream) -> std::io::Result<()> {
    // Read the whole request head first: a single read can land mid-header,
    // which would look like missing credentials.
    let mut buf = Vec::new();
    let mut tmp = [0u8; 1024];
    loop {
        let n = s.read(&mut tmp)?;
        if n == 0 {
            return Ok(());
        }
        buf.extend_from_slice(&tmp[..n]);
        if buf.windows(4).any(|w| w == b"\r\n\r\n") {
            break;
        }
    }
    let req = String::from_utf8_lossy(&buf).to_string();
    let want = format!("Basic {}", base64_std(CREDS.as_bytes()));
    let authorized = req
        .lines()
        .any(|l| l.to_ascii_lowercase().starts_with("authorization:") && l.contains(&want));
    if !authorized {
        let head = "HTTP/1.1 401 Unauthorized\r\n\
                    WWW-Authenticate: Basic realm=\"idm\"\r\n\
                    Content-Length: 0\r\nConnection: close\r\n\r\n";
        s.write_all(head.as_bytes())?;
        return Ok(());
    }

    let total = BODY.len() as u64;
    let mut lines = req.lines();
    let method = lines
        .next()
        .unwrap_or("")
        .split_whitespace()
        .next()
        .unwrap_or("GET")
        .to_string();
    let mut range: Option<(u64, u64)> = None;
    for l in lines {
        let ll = l.to_ascii_lowercase();
        if let Some(v) = ll.strip_prefix("range:") {
            if let Some(r) = v.trim().strip_prefix("bytes=") {
                let mut it = r.split(',').next().unwrap_or("").split('-');
                let a = it.next().unwrap_or("").trim().parse::<u64>().ok();
                let b = it.next().unwrap_or("").trim().parse::<u64>().ok();
                if let Some(a) = a {
                    range = Some((a, b.unwrap_or(total - 1)));
                }
            }
        }
    }

    if method == "HEAD" {
        let h = format!(
            "HTTP/1.1 200 OK\r\nContent-Length: {}\r\nAccept-Ranges: bytes\r\nETag: \"e\"\r\nConnection: close\r\n\r\n",
            total
        );
        s.write_all(h.as_bytes())?;
        return Ok(());
    }

    let (head, body) = if let Some((a, b)) = range {
        let b = b.min(total.saturating_sub(1));
        let slice = BODY[a as usize..=b as usize].to_vec();
        (
            format!(
                "HTTP/1.1 206 Partial Content\r\nContent-Length: {}\r\nContent-Range: bytes {}-{}/{}\r\nAccept-Ranges: bytes\r\nConnection: close\r\n\r\n",
                slice.len(), a, b, total
            ),
            slice,
        )
    } else {
        (
            format!(
                "HTTP/1.1 200 OK\r\nContent-Length: {}\r\nAccept-Ranges: bytes\r\nETag: \"e\"\r\nConnection: close\r\n\r\n",
                total
            ),
            BODY.to_vec(),
        )
    };
    s.write_all(head.as_bytes())?;
    s.write_all(&body)?;
    Ok(())
}

fn base64_std(raw: &[u8]) -> String {
    const T: &[u8; 64] = b"ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
    let mut out = String::new();
    for c in raw.chunks(3) {
        let b = [c[0], *c.get(1).unwrap_or(&0), *c.get(2).unwrap_or(&0)];
        let v = ((b[0] as u32) << 16) | ((b[1] as u32) << 8) | b[2] as u32;
        out.push(T[(v >> 18) as usize & 63] as char);
        out.push(T[(v >> 12) as usize & 63] as char);
        out.push(if c.len() > 1 { T[(v >> 6) as usize & 63] as char } else { '=' });
        out.push(if c.len() > 2 { T[v as usize & 63] as char } else { '=' });
    }
    out
}

fn download(dir: &PathBuf, origin: &str, args: &[&str], env: &[(&str, &str)]) -> (bool, PathBuf) {
    let out_file = dir.join("file.bin");
    let mut cmd = Command::new(IDM);
    cmd.args(args).arg("-o").arg(&out_file).arg(format!("{}/file.bin", origin));
    for (k, v) in env {
        cmd.env(k, v);
    }
    let out = cmd.output().unwrap();
    (out.status.success(), out_file)
}

#[test]
fn auth_env_names_the_variable_holding_the_credentials() {
    let origin = start_origin();
    let dir = unique_dir("env");
    let (ok, file) = download(&dir, &origin, &["--auth-env", "IDM_AUTH"], &[("IDM_AUTH", CREDS)]);
    assert!(ok, "download with --auth-env failed");
    assert_eq!(std::fs::read(&file).unwrap(), BODY);
}

#[test]
fn plain_auth_still_works_from_a_shell() {
    let origin = start_origin();
    let dir = unique_dir("plain");
    let (ok, file) = download(&dir, &origin, &["--auth", CREDS], &[]);
    assert!(ok, "download with --auth failed");
    assert_eq!(std::fs::read(&file).unwrap(), BODY);
}

#[test]
fn auth_env_wins_over_auth() {
    let origin = start_origin();
    let dir = unique_dir("both");
    let (ok, file) = download(
        &dir,
        &origin,
        &["--auth", "wrong:wrong", "--auth-env", "IDM_AUTH"],
        &[("IDM_AUTH", CREDS)],
    );
    assert!(ok, "--auth-env must take precedence over --auth");
    assert_eq!(std::fs::read(&file).unwrap(), BODY);
}

#[test]
fn an_empty_or_missing_variable_is_no_credentials() {
    let origin = start_origin();
    let dir = unique_dir("missing");
    // Nothing in the environment: the download must fail against the 401
    // rather than, say, sending the literal variable name as a password.
    let (ok, _) = download(&dir, &origin, &["--auth-env", "IDM_AUTH_NOT_SET"], &[]);
    assert!(!ok, "a missing variable must not pass for credentials");
}

/// The engine drops the variable from its own environment once it has read
/// it, so neither yt-dlp nor aria2c inherits the password.
#[test]
fn the_variable_is_not_inherited_by_the_media_backend() {
    let dir = unique_dir("inherit");
    let log = dir.join("env.log");
    let stub = dir.join("stub.sh");
    std::fs::write(
        &stub,
        format!(
            "#!/usr/bin/env bash\nenv > {}\nfor a in \"$@\"; do :; done\n\
             out=\"\"; while [ $# -gt 0 ]; do if [ \"$1\" = \"-o\" ]; then out=\"$2\"; fi; shift; done\n\
             printf '%s' media > \"$out\"\n",
            log.display()
        ),
    )
    .unwrap();
    #[cfg(unix)]
    {
        use std::os::unix::fs::PermissionsExt;
        std::fs::set_permissions(&stub, std::fs::Permissions::from_mode(0o755)).unwrap();
    }
    let out_file = dir.join("media.mp4");
    let out = Command::new(IDM)
        .env("IDM_AUTH", CREDS)
        .arg("--yt-dlp")
        .arg(&stub)
        .arg("--force-media")
        .arg("--auth-env")
        .arg("IDM_AUTH")
        .arg("-o")
        .arg(&out_file)
        .arg("https://youtu.be/abc")
        .output()
        .unwrap();
    assert!(out.status.success(), "stderr: {}", String::from_utf8_lossy(&out.stderr));
    let env = std::fs::read_to_string(&log).expect("the stub must have logged its environment");
    assert!(!env.contains("s3cret"), "the child inherited the password:\n{}", env);
}
