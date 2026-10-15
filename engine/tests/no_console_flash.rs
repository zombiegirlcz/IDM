// On Windows every child the engine starts flashes a console window.
//
// Reported from Windows: "it downloads nothing and the terminal keeps
// flickering". The flickering is this: idm.exe is a console-subsystem binary,
// so each child spawned without CREATE_NO_WINDOW pops up a black console for
// as long as it lives. The queue spawns one idm.exe per download, yt-dlp and
// aria2c are spawned too, and a failing download is retried ten times -- so a
// download that cannot work is a strobe light.
//
// There is no CREATE_NO_WINDOW anywhere in engine/src today.
//
// This is a structural test: the behaviour cannot be observed from a Linux
// run, and the Windows CI job builds the installer rather than running cargo
// test. Checking the shape of the source is what keeps it from coming back --
// the same reasoning as the install.sh line-shape test in test/install.test.mjs.

use std::fs;
use std::path::Path;

fn sources() -> Vec<(String, String)> {
    let dir = Path::new(env!("CARGO_MANIFEST_DIR")).join("src");
    let mut out = Vec::new();
    for entry in fs::read_dir(&dir).expect("engine/src must be readable") {
        let path = entry.expect("readable entry").path();
        if path.extension().and_then(|e| e.to_str()) != Some("rs") {
            continue;
        }
        out.push((
            path.file_name().unwrap().to_string_lossy().to_string(),
            fs::read_to_string(&path).expect("source must be utf-8"),
        ));
    }
    out
}

#[test]
fn there_is_a_helper_that_hides_the_console() {
    let found = sources()
        .iter()
        .any(|(_, text)| text.contains("fn hide_console"));
    assert!(
        found,
        "no hide_console helper: every spawn site would have to repeat the \
         windows-only creation_flags dance, and one of them would forget"
    );
}

#[test]
fn the_helper_uses_the_documented_flag() {
    let has_flag = sources()
        .iter()
        .any(|(_, text)| text.contains("0x0800_0000") || text.contains("0x08000000"));
    assert!(
        has_flag,
        "CREATE_NO_WINDOW (0x08000000) appears nowhere in engine/src"
    );
}

#[test]
fn every_spawn_site_hides_its_console() {
    let mut offenders = Vec::new();
    for (name, text) in sources() {
        if name == "console.rs" {
            continue; // the helper itself
        }
        let lines: Vec<&str> = text.lines().collect();
        for (i, line) in lines.iter().enumerate() {
            if !line.contains("Command::new") {
                continue;
            }
            // The helper must appear within the statement that builds this
            // command; the builders in this codebase are a few lines long.
            let window = lines[i..usize::min(i + 14, lines.len())].join("\n");
            if !window.contains("hide_console") {
                offenders.push(format!("{}:{}: {}", name, i + 1, line.trim()));
            }
        }
    }
    assert!(
        offenders.is_empty(),
        "these spawn a child without hiding its console on Windows:\n  {}",
        offenders.join("\n  ")
    );
}
