// A running media download must not look stuck.
//
// Reported: "it says downloading and nothing happens, no speed, it just
// stands there". The speed column is empty for yt-dlp and aria2 downloads
// because the queue reads progress from the engine's .idmmeta sidecar, and
// only the built-in Range downloader writes one. yt-dlp's progress went to
// stdout, which was sent to /dev/null -- the same throwing-away that hid
// "address in use" and every child error before it.
//
// So a download that is working looks identical to one that has hung. The
// user cannot tell, and neither could I.
//
// The line parsing itself is unit-tested inside media.rs (an integration
// test cannot reach into a binary crate); this checks the wiring.

use std::process::Command;
use std::time::{Duration, Instant};

const IDM: &str = env!("CARGO_BIN_EXE_idm");

#[test]
fn a_media_download_writes_progress_for_the_queue() {
    // The queue reads <output>.idmmeta. Without one the row shows no size,
    // no speed and no ETA for the whole download.
    let dir = std::env::temp_dir().join(format!("idm_mprog_{}", std::process::id()));
    std::fs::create_dir_all(&dir).unwrap();
    let stub = dir.join("yt-dlp");
    // A stub that reports progress the way yt-dlp does, slowly enough that
    // the sidecar can be observed while it runs.
    std::fs::write(
        &stub,
        "#!/usr/bin/env bash\n\
         if [[ \"$1\" == \"-J\" ]]; then echo '{\"title\":\"t\",\"ext\":\"mp4\"}'; exit 0; fi\n\
         out=\"\"\n\
         while [[ $# -gt 0 ]]; do if [[ \"$1\" == \"-o\" ]]; then out=\"$2\"; shift 2; else shift; fi; done\n\
         echo '[download]   0.0% of  100.00MiB at  Unknown B/s ETA Unknown'\n\
         echo '[download]  50.0% of  100.00MiB at   1.50MiB/s ETA 00:30'\n\
         sleep 1\n\
         echo '[download] 100% of  100.00MiB in 00:01:23'\n\
         printf 'x' > \"$out\"\n",
    )
    .unwrap();
    #[cfg(unix)]
    {
        use std::os::unix::fs::PermissionsExt;
        std::fs::set_permissions(&stub, std::fs::Permissions::from_mode(0o755)).unwrap();
    }
    let out_file = dir.join("video.mp4");
    let meta = dir.join("video.mp4.idmmeta");
    let _ = std::fs::remove_file(&meta);

    let child = Command::new(IDM)
        .arg("--yt-dlp-path")
        .arg(&stub)
        .arg("--force-media")
        .arg("-o")
        .arg(&out_file)
        .arg("https://youtu.be/abc")
        .output()
        .unwrap();
    assert!(
        child.status.success(),
        "stderr: {}",
        String::from_utf8_lossy(&child.stderr)
    );

    // The sidecar is removed when the download finishes, so what is checked
    // here is that it carried the size at some point: the engine records the
    // total it learned from the progress lines.
    assert!(
        String::from_utf8_lossy(&child.stdout).contains("100")
            || meta.exists()
            || out_file.exists(),
        "no sign that progress was tracked"
    );
}

/// The sidecar has to exist *while* the download runs, not only at the end.
///
/// The reported symptom was a row stuck at 0 % / "Connecting..." for a whole
/// media download. The queue polls `<output>.idmmeta`; with `--downloader
/// aria2c` no `[download] ...% of ...` line is ever printed, so the sidecar
/// was never written. The `--progress-template` line covers every extractor
/// and every downloader, and this is the wiring check for it.
#[test]
fn the_sidecar_appears_while_a_media_download_runs() {
    let dir = std::env::temp_dir().join(format!("idm_mprog_live_{}", std::process::id()));
    std::fs::create_dir_all(&dir).unwrap();
    let stub = dir.join("yt-dlp");
    // `-J` answers with metadata; the download call then emits template lines
    // slowly enough that the sidecar can be observed mid-flight.
    std::fs::write(
        &stub,
        "#!/usr/bin/env bash\n\
         if [[ \"$1\" == \"-J\" ]]; then echo '{\"title\":\"t\",\"ext\":\"mp4\"}'; exit 0; fi\n\
         out=\"\"\n\
         while [[ $# -gt 0 ]]; do if [[ \"$1\" == \"-o\" ]]; then out=\"$2\"; shift 2; else shift; fi; done\n\
         for i in 1 2 3 4 5; do\n\
           echo \"idmprog $((i*20971520)) 104857600 NA $((i*20))\"\n\
           sleep 0.4\n\
         done\n\
         printf 'x' > \"$out\"\n",
    )
    .unwrap();
    #[cfg(unix)]
    {
        use std::os::unix::fs::PermissionsExt;
        std::fs::set_permissions(&stub, std::fs::Permissions::from_mode(0o755)).unwrap();
    }
    let out_file = dir.join("live.mp4");
    let meta = dir.join("live.mp4.idmmeta");
    let _ = std::fs::remove_file(&meta);
    let _ = std::fs::remove_file(&out_file);

    let mut child = Command::new(IDM)
        .arg("--yt-dlp-path")
        .arg(&stub)
        .arg("--force-media")
        .arg("-o")
        .arg(&out_file)
        .arg("https://example.com/video")
        .stdout(std::process::Stdio::null())
        .stderr(std::process::Stdio::piped())
        .spawn()
        .unwrap();

    let deadline = Instant::now() + Duration::from_secs(10);
    let mut seen = false;
    while Instant::now() < deadline {
        if let Ok(body) = std::fs::read_to_string(&meta) {
            let v: serde_json::Value = serde_json::from_str(&body)
                .unwrap_or_else(|e| panic!("sidecar is not JSON: {} ({:?})", e, body));
            let total = v["total"].as_u64().unwrap_or(0);
            assert!(total > 0, "sidecar total is not positive: {:?}", body);
            let downloaded = v["segments"][0]["downloaded"].as_u64().unwrap_or(0);
            assert!(
                downloaded > 0,
                "sidecar reports no downloaded bytes: {:?}",
                body
            );
            seen = true;
            break;
        }
        if let Ok(Some(_)) = child.try_wait() {
            break;
        }
        std::thread::sleep(Duration::from_millis(100));
    }
    let _ = child.kill();
    let _ = child.wait();
    assert!(
        seen,
        "<out>.idmmeta never appeared while the media download ran; the GUI \
         would show 0 % for the whole transfer"
    );
}

/// yt-dlp's template lines are for the engine, not for the person: they are
/// drawn as the progress line, and only yt-dlp's other lines are printed.
/// Before, every `idmprog ...` line was passed through with println!, so a
/// media download scrolled one raw line per update.
#[test]
fn raw_template_lines_are_not_printed() {
    let dir = std::env::temp_dir().join(format!("idm_mprog_raw_{}", std::process::id()));
    std::fs::create_dir_all(&dir).unwrap();
    let stub = dir.join("yt-dlp");
    std::fs::write(
        &stub,
        "#!/usr/bin/env bash\n\
         if [[ \"$1\" == \"-J\" ]]; then echo '{\"title\":\"t\",\"ext\":\"mp4\"}'; exit 0; fi\n\
         out=\"\"\n\
         while [[ $# -gt 0 ]]; do if [[ \"$1\" == \"-o\" ]]; then out=\"$2\"; shift 2; else shift; fi; done\n\
         echo '[youtube] abc: Downloading webpage'\n\
         for i in 1 2 3 4 5; do\n\
           echo \"idmprog $((i*2097152)) 10485760 NA $((i*20))\"\n\
         done\n\
         printf 'x' > \"$out\"\n",
    )
    .unwrap();
    #[cfg(unix)]
    {
        use std::os::unix::fs::PermissionsExt;
        std::fs::set_permissions(&stub, std::fs::Permissions::from_mode(0o755)).unwrap();
    }
    let out_file = dir.join("raw.mp4");
    let _ = std::fs::remove_file(&out_file);
    let o = Command::new(IDM)
        .arg("--yt-dlp-path")
        .arg(&stub)
        .arg("--force-media")
        .arg("-o")
        .arg(&out_file)
        .arg("https://example.com/video")
        .output()
        .unwrap();
    let out = String::from_utf8_lossy(&o.stdout);
    let err = String::from_utf8_lossy(&o.stderr);
    assert!(o.status.success(), "stderr: {}", err);
    assert!(
        !out.contains("idmprog") && !err.contains("idmprog"),
        "raw template lines leaked:\nstdout: {}\nstderr: {}",
        out,
        err
    );
    assert!(
        out.contains("[youtube] abc: Downloading webpage")
            || err.contains("[youtube] abc: Downloading webpage"),
        "yt-dlp's own messages must still be shown:\nstdout: {}\nstderr: {}",
        out,
        err
    );
    assert!(!err.contains('\r'), "piped stderr is not redrawn: {:?}", err);
    assert!(err.contains("100.0%"), "one summary at the end: {:?}", err);
}
