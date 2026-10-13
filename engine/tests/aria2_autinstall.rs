// Engine-side aria2 auto-install.
//
// `--aria2` should not fail just because aria2c is missing: the engine must try
// to install it (via scripts/ensure-aria2.sh on Linux, ensure-aria2.ps1 on
// Windows) and then use it. We prove this offline with a stub "ensure" script
// that drops an aria2c stub on PATH, so the engine's install→retry path is real.

use std::fs;
use std::io::{Read, Write};
use std::net::{TcpListener, TcpStream};
use std::os::unix::fs::PermissionsExt;
use std::path::PathBuf;
use std::process::Command;
use std::sync::atomic::{AtomicU64, Ordering};
use std::sync::Arc;
use std::thread;

const IDM: &str = env!("CARGO_BIN_EXE_idm");

fn unique_dir(tag: &str) -> PathBuf {
    static C: AtomicU64 = AtomicU64::new(0);
    let n = C.fetch_add(1, Ordering::SeqCst);
    let d = std::env::temp_dir().join(format!("idm_ariai_{}_{}_{}", tag, std::process::id(), n));
    fs::create_dir_all(&d).unwrap();
    d
}

fn make_data(len: usize) -> Arc<Vec<u8>> {
    let v: Vec<u8> = (0..len)
        .map(|i| ((i as u64).wrapping_mul(2654435761) >> 13) as u8)
        .collect();
    Arc::new(v)
}

fn crc32(data: &[u8]) -> u32 {
    let mut h = crc32fast::Hasher::new();
    h.update(data);
    h.finalize()
}

fn start_origin(data: Arc<Vec<u8>>) -> String {
    let listener = TcpListener::bind("127.0.0.1:0").unwrap();
    let addr = format!("http://{}", listener.local_addr().unwrap());
    thread::spawn(move || {
        for stream in listener.incoming() {
            let data = data.clone();
            if let Ok(s) = stream {
                thread::spawn(move || {
                    let _ = handle(s, data);
                });
            }
        }
    });
    addr
}

fn handle(mut s: TcpStream, data: Arc<Vec<u8>>) -> std::io::Result<()> {
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
    let mut lines = req.lines();
    let method = lines.next().unwrap_or("").split_whitespace().next().unwrap_or("GET");
    let mut range: Option<(u64, u64)> = None;
    for l in lines {
        let ll = l.to_ascii_lowercase();
        if let Some(v) = ll.strip_prefix("range:") {
            if let Some(r) = v.trim().strip_prefix("bytes=") {
                let mut it = r.split(',').next().unwrap_or("").split('-');
                let a = it.next().unwrap_or("").trim().parse::<u64>().ok();
                let b = it.next().unwrap_or("").trim().parse::<u64>().ok();
                if let Some(a) = a {
                    range = Some((a, b.unwrap_or(data.len() as u64 - 1)));
                }
            }
        }
    }
    let total = data.len() as u64;
    if method == "HEAD" {
        let h = format!(
            "HTTP/1.1 200 OK\r\nContent-Length: {}\r\nAccept-Ranges: bytes\r\nETag: \"e\"\r\nConnection: close\r\n\r\n",
            total
        );
        s.write_all(h.as_bytes())?;
        return Ok(());
    }
    if let Some((a, b)) = range {
        let b = b.min(total.saturating_sub(1));
        let slice = data[a as usize..=b as usize].to_vec();
        let h = format!(
            "HTTP/1.1 206 Partial Content\r\nContent-Length: {}\r\nContent-Range: bytes {}-{}/{}\r\nAccept-Ranges: bytes\r\nConnection: close\r\n\r\n",
            slice.len(), a, b, total
        );
        s.write_all(h.as_bytes())?;
        s.write_all(&slice)?;
    } else {
        let h = format!(
            "HTTP/1.1 200 OK\r\nContent-Length: {}\r\nAccept-Ranges: bytes\r\nETag: \"e\"\r\nConnection: close\r\n\r\n",
            total
        );
        s.write_all(h.as_bytes())?;
        s.write_all(&data)?;
    }
    Ok(())
}

#[test]
fn aria2_is_auto_installed_when_missing() {
    let dir = unique_dir("auto");
    // A directory that is NOT on PATH and contains no aria2c: this is the
    // "clean machine" situation.
    let clean_bin = dir.join("clean-bin");
    fs::create_dir_all(&clean_bin).unwrap();

    // Stub "ensure" script: when run, it drops an aria2c stub into clean_bin.
    // That models scripts/ensure-aria2.sh installing the package.
    let ensure = dir.join("ensure-aria2.sh");
    let aria2_stub = clean_bin.join("aria2c");
    let script = format!(
        r#"#!/usr/bin/env bash
cat > "{stub}" <<'A2'
#!/usr/bin/env bash
d=""; o=""
while [ $# -gt 0 ]; do
  case "$1" in
    -d) d="$2"; shift 2;;
    -o) o="$2"; shift 2;;
    *) shift;;
  esac
done
[ -n "$d" ] && mkdir -p "$d"
printf 'AUTO-INSTALLED-ARIA2' > "$d/$o"
A2
chmod +x "{stub}"
echo "aria2c installed: {stub}"
"#,
        stub = aria2_stub.display()
    );
    fs::write(&ensure, script).unwrap();
    let mut perm = fs::metadata(&ensure).unwrap().permissions();
    perm.set_mode(0o755);
    fs::set_permissions(&ensure, perm).unwrap();

    let data = make_data(500_000);
    let origin = start_origin(data.clone());
    let out = dir.join("out.bin");

    // --aria2-path points at a file that does not exist yet, so the engine's
    // "already present?" check fails and it must run the ensure script. We keep
    // the normal PATH so the freshly created stub's shebang can find bash.
    let status = Command::new(IDM)
        .arg("--aria2")
        .arg("--aria2-path")
        .arg(&aria2_stub)
        .arg("--ensure-aria2")
        .arg(&ensure)
        .arg("-o")
        .arg(&out)
        .arg(format!("{}/f.bin", origin))
        .status()
        .unwrap();
    assert!(status.success(), "engine exited with {}", status);

    let got = fs::read(&out).unwrap();
    assert_eq!(
        String::from_utf8_lossy(&got),
        "AUTO-INSTALLED-ARIA2",
        "the auto-installed aria2c stub must have produced the file"
    );
    assert!(aria2_stub.exists(), "ensure script must have created aria2c");
    let _ = crc32(&data);
}
