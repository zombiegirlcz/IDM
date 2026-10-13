// Regression tests for download integrity and for where a file is allowed to
// land. Each one pins a bug that made the engine report success (or write
// outside the intended directory) when it should not have.

use std::io::{Read, Write};
use std::net::{TcpListener, TcpStream};
use std::path::PathBuf;
use std::process::Command;
use std::sync::atomic::{AtomicU64, Ordering};
use std::sync::Arc;
use std::thread;

const BIN: &str = env!("CARGO_BIN_EXE_idm");

fn unique_dir(tag: &str) -> PathBuf {
    static C: AtomicU64 = AtomicU64::new(0);
    let n = C.fetch_add(1, Ordering::SeqCst);
    let d = std::env::temp_dir().join(format!("idm_int_{}_{}_{}", tag, std::process::id(), n));
    std::fs::create_dir_all(&d).unwrap();
    d
}

fn make_data(len: usize) -> Arc<Vec<u8>> {
    Arc::new(
        (0..len)
            .map(|i| ((i as u64).wrapping_mul(2654435761) >> 13) as u8)
            .collect(),
    )
}

/// A server that answers Range requests, optionally sending fewer body bytes
/// than it promised and then closing the connection cleanly (a truncated
/// response, not a transport error).
fn start_server(data: Arc<Vec<u8>>, truncate_to: Option<usize>) -> String {
    start_server_opts(data, truncate_to, true)
}

/// `declare_length = false` omits Content-Length, so the end of the body is
/// signalled by the connection closing — a short body then looks like a clean
/// end of stream rather than a decode error.
fn start_server_opts(data: Arc<Vec<u8>>, truncate_to: Option<usize>, declare_length: bool) -> String {
    let listener = TcpListener::bind("127.0.0.1:0").unwrap();
    let addr = format!("http://{}", listener.local_addr().unwrap());
    thread::spawn(move || {
        for s in listener.incoming().flatten() {
            let data = data.clone();
            thread::spawn(move || {
                let _ = serve_one(s, data, truncate_to, declare_length);
            });
        }
    });
    addr
}

fn serve_one(
    mut s: TcpStream,
    data: Arc<Vec<u8>>,
    truncate_to: Option<usize>,
    declare_length: bool,
) -> std::io::Result<()> {
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
    let head = String::from_utf8_lossy(&buf).to_string();
    let total = data.len();

    if head.starts_with("HEAD") {
        let resp = format!(
            "HTTP/1.1 200 OK\r\nContent-Length: {}\r\nAccept-Ranges: bytes\r\nETag: \"e\"\r\nConnection: close\r\n\r\n",
            total
        );
        s.write_all(resp.as_bytes())?;
        return Ok(());
    }

    // Parse `Range: bytes=start-end`.
    let (start, end) = head
        .lines()
        .find_map(|l| {
            let l = l.to_ascii_lowercase();
            let v = l.strip_prefix("range:")?.trim().strip_prefix("bytes=")?.to_string();
            let (a, b) = v.split_once('-')?;
            Some((a.parse::<usize>().ok()?, b.parse::<usize>().ok()?))
        })
        .unwrap_or((0, total - 1));

    let slice = &data[start..=end.min(total - 1)];
    let resp = if declare_length {
        format!(
            "HTTP/1.1 206 Partial Content\r\nContent-Length: {}\r\nContent-Range: bytes {}-{}/{}\r\nConnection: close\r\n\r\n",
            slice.len(),
            start,
            end,
            total
        )
    } else {
        format!(
            "HTTP/1.1 206 Partial Content\r\nContent-Range: bytes {}-{}/{}\r\nConnection: close\r\n\r\n",
            start, end, total
        )
    };
    s.write_all(resp.as_bytes())?;
    // Send everything, or only the first `truncate_to` bytes and then hang up.
    let send = match truncate_to {
        Some(k) => &slice[..k.min(slice.len())],
        None => slice,
    };
    s.write_all(send)?;
    s.flush()?;
    Ok(())
}

/// A short body must never count as a finished segment: the output would have
/// a hole in it while the engine reported success (the file is pre-allocated,
/// so its *size* is right either way).
#[test]
fn truncated_response_fails_instead_of_corrupting_the_file() {
    let data = make_data(400_000);
    let addr = start_server(data.clone(), Some(1024));
    let dir = unique_dir("trunc");
    let out = dir.join("f.bin");

    let st = Command::new(BIN)
        .arg("-n")
        .arg("2")
        .arg("-o")
        .arg(&out)
        .arg(format!("{}/f.bin", addr))
        .status()
        .unwrap();

    assert!(
        !st.success(),
        "a truncated body must fail the download, not be reported as done"
    );
    // The resume sidecar must survive so the next run can continue.
    let meta = dir.join("f.bin.idmmeta");
    assert!(meta.exists(), "resume state must be kept after a failure");
}

/// `--resume` reads byte offsets out of the sidecar. If the file those offsets
/// describe is gone, trusting them yields a file full of zeroes.
#[test]
fn resume_with_a_missing_output_file_starts_fresh() {
    let data = make_data(300_000);
    let addr = start_server(data.clone(), None);
    let dir = unique_dir("resume");
    let out = dir.join("g.bin");
    let url = format!("{}/g.bin", addr);

    // A sidecar claiming the whole file is already done, with no file on disk.
    let meta = serde_json::json!({
        "url": url,
        "etag": "\"e\"",
        "last_modified": null,
        "total": data.len(),
        "connections": 1,
        "segments": [{
            "start": 0,
            "end": data.len() - 1,
            "done": true,
            "downloaded": data.len(),
        }],
    });
    std::fs::write(dir.join("g.bin.idmmeta"), meta.to_string()).unwrap();

    let st = Command::new(BIN)
        .arg("--resume")
        .arg("-n")
        .arg("2")
        .arg("-o")
        .arg(&out)
        .arg(&url)
        .status()
        .unwrap();
    assert!(st.success(), "the download should start over and succeed");

    let got = std::fs::read(&out).unwrap();
    assert_eq!(got.len(), data.len(), "size");
    assert_eq!(got, *data, "the file must be the real content, not zeroes");
}

/// A single URL must land in `--output-dir`, not in the process CWD. The
/// desktop scheme handler relies on this: its CWD is $HOME or /.
#[test]
fn single_url_lands_in_output_dir() {
    let data = make_data(50_000);
    let addr = start_server(data.clone(), None);
    let dir = unique_dir("outdir");
    let downloads = dir.join("Downloads");
    let cwd = dir.join("cwd");
    std::fs::create_dir_all(&downloads).unwrap();
    std::fs::create_dir_all(&cwd).unwrap();

    let st = Command::new(BIN)
        .current_dir(&cwd)
        .arg("--output-dir")
        .arg(&downloads)
        .arg(format!("{}/wanted.bin", addr))
        .status()
        .unwrap();
    assert!(st.success());

    assert!(
        downloads.join("wanted.bin").exists(),
        "the file must land in --output-dir"
    );
    assert!(
        !cwd.join("wanted.bin").exists(),
        "nothing may be written into the CWD"
    );
}

/// The `idmdwnlmfv9:` handler is registered desktop-wide, so any web page can
/// hand us a payload. Only http(s) targets may be accepted.
#[test]
fn wrapped_scheme_refuses_non_http_targets() {
    let dir = unique_dir("scheme");
    for target in ["file:///etc/hostname", "idmdwnlmfv9:///etc/hostname"] {
        let out = Command::new(BIN)
            .current_dir(&dir)
            .arg("--output-dir")
            .arg(&dir)
            .arg("--")
            .arg(format!("idmdwnlmfv9://{}", target))
            .output()
            .unwrap();
        assert!(
            !out.status.success(),
            "wrapped target {} must be refused, stdout: {}",
            target,
            String::from_utf8_lossy(&out.stdout)
        );
    }
    assert!(
        !dir.join("hostname").exists(),
        "nothing may be written for a refused target"
    );
}

/// Same hole, but without a declared Content-Length: the short body ends the
/// stream cleanly, so nothing below us reports an error. Only the engine's own
/// "did I actually receive my whole range?" check can catch this.
#[test]
fn silently_short_body_without_content_length_fails() {
    let data = make_data(400_000);
    let addr = start_server_opts(data.clone(), Some(4096), false);
    let dir = unique_dir("trunc_nolen");
    let out = dir.join("h.bin");

    let got = Command::new(BIN)
        .arg("-n")
        .arg("1")
        .arg("-o")
        .arg(&out)
        .arg(format!("{}/h.bin", addr))
        .output()
        .unwrap();

    assert!(
        !got.status.success(),
        "a short body must fail: stdout {}",
        String::from_utf8_lossy(&got.stdout)
    );
    let err = String::from_utf8_lossy(&got.stderr);
    assert!(
        err.contains("truncated body"),
        "the failure must name the truncation, got: {}",
        err
    );
}
