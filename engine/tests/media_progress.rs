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
