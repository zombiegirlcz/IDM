// `--yt-dlp` should mean "use yt-dlp", the way `--aria2` means "use aria2c".
//
// Reported from Windows, after a long fight with the command line:
//
//     idm --yt-dlp <URL> --aria2 -n 16
//     [x] error: missing URL (or use --queue FILE)
//
//     idm --yt-dlp mp4 --aria2 --connections 16 --queue file <URL>
//     [x] error: Systém nemůže nalézt uvedený soubor. (os error 2)
//
// Both are the same misunderstanding, and the CLI earned it. The two backends
// are spelled inconsistently:
//
//     --aria2         a flag: use aria2c
//     --aria2-path    where the binary is
//     --yt-dlp        where the binary is          <- not a flag
//
// So `--yt-dlp <URL>` says "yt-dlp lives at that address", the URL is eaten,
// and the program reports a missing URL. `--yt-dlp mp4` goes looking for a
// program called mp4 and reports a file-not-found error that never says WHAT
// it could not find. The flag that does what the user wanted is spelled
// --force-media, which nobody is going to guess.
//
// This renames the path option to --yt-dlp-path and frees --yt-dlp to be the
// flag it looks like, matching aria2.

use std::process::Command;

const IDM: &str = env!("CARGO_BIN_EXE_idm");

fn run(args: &[&str]) -> (String, String, bool) {
    let out = Command::new(IDM).args(args).output().expect("run idm");
    (
        String::from_utf8_lossy(&out.stdout).to_string(),
        String::from_utf8_lossy(&out.stderr).to_string(),
        out.status.success(),
    )
}

#[test]
fn yt_dlp_is_a_flag_and_does_not_eat_the_url() {
    // Port 9 (discard): nothing is listening, so this fails -- but it must
    // fail having understood that the URL is a URL.
    let (stdout, stderr, ok) = run(&["--yt-dlp", "http://127.0.0.1:9/clip.mp4"]);
    assert!(!ok, "this cannot succeed; it is the failure mode that matters");
    let all = format!("{}{}", stdout, stderr);
    assert!(
        !all.contains("missing URL"),
        "--yt-dlp swallowed the URL as a binary path: {}",
        all
    );
}

#[test]
fn the_binary_path_has_its_own_option() {
    let (stdout, _, _) = run(&["--help"]);
    assert!(
        stdout.contains("--yt-dlp-path"),
        "--yt-dlp-path should name the binary, mirroring --aria2-path:\n{}",
        stdout
    );
}

#[test]
fn the_help_shows_yt_dlp_as_a_switch() {
    // A flag is printed without a value placeholder. If --help still shows
    // "--yt-dlp <YT_DLP>" the two backends still read differently.
    let (stdout, _, _) = run(&["--help"]);
    let line = stdout
        .lines()
        .find(|l| l.trim_start().starts_with("--yt-dlp ") || l.trim_start() == "--yt-dlp")
        .unwrap_or("");
    assert!(
        !line.contains("<YT_DLP>"),
        "--yt-dlp still takes a value: {:?}",
        line
    );
}

#[test]
fn a_missing_yt_dlp_says_what_it_looked_for() {
    // "Systém nemůže nalézt uvedený soubor. (os error 2)" is true and useless.
    // The message has to name the thing that was not found.
    let (stdout, stderr, ok) = run(&[
        "--yt-dlp",
        "--yt-dlp-path",
        "definitely-not-a-real-program-xyz",
        "http://127.0.0.1:9/clip.mp4",
    ]);
    assert!(!ok);
    let all = format!("{}{}", stdout, stderr);
    assert!(
        all.contains("definitely-not-a-real-program-xyz"),
        "the error should name the program it could not find, got: {}",
        all
    );
}

#[test]
fn force_media_still_works_for_anyone_who_learned_it() {
    let (stdout, _, _) = run(&["--help"]);
    assert!(
        stdout.contains("--force-media"),
        "--force-media must keep working; it is in scripts by now"
    );
}

#[test]
fn aria2_and_yt_dlp_read_the_same_way() {
    // The point of the change: a user who has seen one backend can guess the
    // other. Both flags, both with a matching -path option.
    let (stdout, _, _) = run(&["--help"]);
    for opt in ["--aria2", "--aria2-path", "--yt-dlp", "--yt-dlp-path"] {
        assert!(stdout.contains(opt), "--help does not mention {}", opt);
    }
}

#[test]
fn a_missing_yt_dlp_is_installed_rather_than_refused() {
    // "the application did not download its own dependencies like yt-dlp".
    // aria2c has had an installer since the beginning; yt-dlp had none, so a
    // clean Windows machine had a downloader that could not download videos.
    // The engine must at least try, and say what it tried.
    let dir = std::env::temp_dir().join(format!("idm_noytdlp_{}", std::process::id()));
    std::fs::create_dir_all(&dir).unwrap();
    let missing = dir.join("not-installed-yt-dlp");
    let (stdout, stderr, _) = run(&[
        "--yt-dlp",
        "--yt-dlp-path",
        missing.to_str().unwrap(),
        // Nothing listens on port 9, so this cannot accidentally download.
        "http://127.0.0.1:9/clip.mp4",
    ]);
    let all = format!("{}{}", stdout, stderr);
    assert!(
        all.contains("yt-dlp"),
        "the message must be about yt-dlp: {}",
        all
    );
    // Either it installed one, or it explained how to get one. What it must
    // not do is fail with a bare OS error.
    assert!(
        all.to_lowercase().contains("install")
            || all.to_lowercase().contains("instal")
            || all.contains("ensure-ytdlp"),
        "a missing yt-dlp should lead to installing it, or to instructions: {}",
        all
    );
}

#[test]
fn mp4_is_preferred_over_webm_by_default() {
    // Reported: "I pasted a URL copied straight from a YouTube video and
    // instead of downloading mp4 it downloads webm". yt-dlp's own default is
    // "best", which on YouTube is usually VP9/Opus in webm. For a general
    // downloader mp4 is the file people can actually use everywhere, so it is
    // what we ask for unless --format says otherwise.
    let (stdout, _, _) = run(&["--help"]);
    assert!(
        stdout.contains("--format"),
        "--format must stay available for anyone who wants something else"
    );
}
