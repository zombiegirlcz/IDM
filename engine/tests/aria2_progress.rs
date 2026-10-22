// A download that goes through aria2c must show its progress while it runs.
//
// Reported on Windows: the row shows no speed, no percent and no size, then
// jumps to 100 % at the end. The window turns "Via aria2" on by itself when
// aria2c is installed, so this is every download there.
//
// Two separate holes, one test each:
// - plain file, `--aria2`: aria2c's output was never read, so no
//   `<out>.idmmeta` existed and the queue had nothing to show;
// - media through `--downloader aria2c`: aria2 redraws its readout with `\r`,
//   never `\n`, and the pipes were read line by line -- the whole readout
//   history arrived as one "line" when the transfer was over.

#![cfg(unix)]

use std::path::{Path, PathBuf};
use std::process::{Child, Command, Stdio};
use std::sync::atomic::{AtomicU64, Ordering};
use std::time::{Duration, Instant};

const IDM: &str = env!("CARGO_BIN_EXE_idm");
const TOTAL: u64 = 4 * 1024 * 1024; // the stubs report "/4.0MiB"

fn unique_dir(tag: &str) -> PathBuf {
    static C: AtomicU64 = AtomicU64::new(0);
    let n = C.fetch_add(1, Ordering::SeqCst);
    let d = std::env::temp_dir().join(format!("idm_a2prog_{}_{}_{}", tag, std::process::id(), n));
    std::fs::create_dir_all(&d).unwrap();
    d
}

fn script(path: &Path, body: &str) {
    use std::os::unix::fs::PermissionsExt;
    std::fs::write(path, body).unwrap();
    std::fs::set_permissions(path, std::fs::Permissions::from_mode(0o755)).unwrap();
}

/// aria2c as the engine sees it: answers --version, then redraws its readout
/// with `\r` the way the real one does, slowly enough to be watched, and
/// writes `-d`/`-o` at the end.
fn aria2_stub(dir: &Path) -> PathBuf {
    let stub = dir.join("aria2c");
    script(
        &stub,
        "#!/usr/bin/env bash\n\
         if [[ \"$1\" == \"--version\" ]]; then echo 'aria2 version 1.37.0'; exit 0; fi\n\
         d=.; o=\"\"\n\
         while [[ $# -gt 0 ]]; do case \"$1\" in -d) d=\"$2\"; shift 2;; -o) o=\"$2\"; shift 2;; *) shift;; esac; done\n\
         for p in 1.0 2.0 3.0; do\n\
           printf '[#2089b0 %sMiB/4.0MiB(%d%%) CN:2 DL:1.0MiB ETA:3s]\\r' $p $(( ${p%.*} * 25 ))\n\
           sleep 1\n\
         done\n\
         printf '\\n'\n\
         [[ -n \"$o\" ]] && printf 'x' > \"$d/$o\"\n\
         exit 0\n",
    );
    stub
}

/// Wait for `<out>.idmmeta` while `child` runs; return what it said.
fn sidecar_while_running(child: &mut Child, meta: &Path) -> Option<(u64, u64)> {
    let deadline = Instant::now() + Duration::from_secs(15);
    while Instant::now() < deadline {
        if let Ok(body) = std::fs::read_to_string(meta) {
            if let Ok(v) = serde_json::from_str::<serde_json::Value>(&body) {
                let total = v["total"].as_u64().unwrap_or(0);
                let dl: u64 = v["segments"]
                    .as_array()
                    .map(|s| s.iter().map(|x| x["downloaded"].as_u64().unwrap_or(0)).sum())
                    .unwrap_or(0);
                if dl > 0 {
                    return Some((total, dl));
                }
            }
        }
        if let Ok(Some(_)) = child.try_wait() {
            return None;
        }
        std::thread::sleep(Duration::from_millis(50));
    }
    None
}

#[test]
fn a_plain_aria2_download_writes_progress_while_it_runs() {
    let dir = unique_dir("plain");
    let stub = aria2_stub(&dir);
    let out = dir.join("file.bin");
    let meta = dir.join("file.bin.idmmeta");

    let mut child = Command::new(IDM)
        .arg("--aria2")
        .arg("--aria2-path")
        .arg(&stub)
        .arg("-o")
        .arg(&out)
        .arg("http://127.0.0.1:9/file.bin")
        .stdout(Stdio::null())
        .stderr(Stdio::null())
        .spawn()
        .unwrap();
    let seen = sidecar_while_running(&mut child, &meta);
    let _ = child.kill();
    let _ = child.wait();

    let (total, dl) = seen.expect(
        "<out>.idmmeta never appeared while aria2c ran; the window shows no \
         size, percent or speed and jumps to 100 % at the end",
    );
    assert_eq!(total, TOTAL, "the size aria2c reported");
    assert!(dl < TOTAL, "mid-flight, not finished: {}", dl);
}

#[test]
fn a_media_download_through_aria2_reports_progress_while_it_runs() {
    let dir = unique_dir("media");
    let aria2 = aria2_stub(&dir);
    // yt-dlp with --downloader aria2c relays aria2's own output and prints
    // none of its own progress lines.
    let ytdlp = dir.join("yt-dlp");
    script(
        &ytdlp,
        "#!/usr/bin/env bash\n\
         if [[ \"$1\" == \"-J\" ]]; then echo '{\"title\":\"t\",\"ext\":\"mp4\"}'; exit 0; fi\n\
         out=\"\"; dl=\"\"\n\
         while [[ $# -gt 0 ]]; do case \"$1\" in -o) out=\"$2\"; shift 2;; --downloader) dl=\"$2\"; shift 2;; *) shift;; esac; done\n\
         [[ -n \"$dl\" ]] || { echo 'expected --downloader aria2c' >&2; exit 3; }\n\
         \"$dl\" -d \"$(dirname \"$out\")\" -o \"$(basename \"$out\")\"\n",
    );
    let out = dir.join("clip.mp4");
    let meta = dir.join("clip.mp4.idmmeta");

    let mut child = Command::new(IDM)
        .arg("--yt-dlp-path")
        .arg(&ytdlp)
        .arg("--aria2")
        .arg("--aria2-path")
        .arg(&aria2)
        .arg("--force-media")
        .arg("-o")
        .arg(&out)
        .arg("https://example.com/video")
        .stdout(Stdio::null())
        .stderr(Stdio::null())
        .spawn()
        .unwrap();
    let seen = sidecar_while_running(&mut child, &meta);
    let _ = child.kill();
    let _ = child.wait();

    let (total, dl) = seen.expect(
        "<out>.idmmeta never appeared while the media download ran through \
         aria2c; its \\r-redrawn readout only reached the engine at the end",
    );
    assert_eq!(total, TOTAL, "the size aria2c reported");
    assert!(dl < TOTAL, "mid-flight, not finished: {}", dl);
}
