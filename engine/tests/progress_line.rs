// The terminal progress line of `idm`.
//
// Asked for: "CLI nějaký pěkně barevně formátovaný výstup progressu, žádný
// re-rendering pod sebe". Before, the Range downloader printed
// `\r[ 45.2%] 123 / 456 bytes` and the yt-dlp path passed every yt-dlp line
// through with println!, so a media download scrolled one line per update --
// and the raw `idmprog ...` template lines with it.
//
// The module is pure enough to include directly (the engine is a binary
// crate, so an integration test cannot `use` it).

#[path = "../src/progress.rs"]
#[allow(dead_code)]
mod progress;

#[path = "../src/style.rs"]
#[allow(dead_code)]
mod style;

use progress::{human_bytes, human_duration, render, use_color, visible_width, Frame, Line, Style};

fn style(color: bool, columns: usize) -> Style {
    Style { color, columns }
}

fn frame(cur: u64, total: Option<u64>, rate: f64) -> Frame {
    Frame { cur, total, rate, elapsed: None }
}

#[test]
fn sizes_and_durations_read_like_a_person_wrote_them() {
    assert_eq!(human_bytes(0), "0 B");
    assert_eq!(human_bytes(1023), "1023 B");
    assert_eq!(human_bytes(1024), "1.0 KiB");
    assert_eq!(human_bytes(12_897_485), "12.3 MiB");
    assert_eq!(human_bytes(3 * 1024 * 1024 * 1024), "3.0 GiB");
    assert_eq!(human_duration(5.0), "0:05");
    assert_eq!(human_duration(123.0), "2:03");
    assert_eq!(human_duration(3723.0), "1:02:03");
}

#[test]
fn a_frame_is_one_line_that_never_wraps() {
    // A line wider than the terminal wraps, and the next \r only returns to
    // the start of the *second* row: that is the "re-rendering pod sebe".
    let huge = frame(999 * 1024 * 1024 * 1024, Some(1000 * 1024 * 1024 * 1024), 999.0 * 1024.0 * 1024.0);
    for columns in [40usize, 60, 80, 120, 200] {
        for color in [false, true] {
            let s = render(&huge, &style(color, columns));
            assert!(!s.contains('\n') && !s.contains('\r'), "{s:?}");
            assert!(
                visible_width(&s) < columns,
                "{} columns, color={}: {} wide: {:?}",
                columns,
                color,
                visible_width(&s),
                s
            );
        }
    }
}

#[test]
fn colour_only_when_asked() {
    let f = frame(512, Some(1024), 100.0);
    assert!(render(&f, &style(true, 80)).contains("\x1b["), "colour frame has no ANSI");
    assert!(!render(&f, &style(false, 80)).contains('\x1b'), "plain frame has ANSI");
}

#[test]
fn the_frame_says_how_far_how_much_how_fast_and_how_long() {
    let f = frame(512 * 1024 * 1024, Some(1024 * 1024 * 1024), 64.0 * 1024.0 * 1024.0);
    let s = render(&f, &style(false, 100));
    assert!(s.contains("50.0%"), "{s}");
    assert!(s.contains("512.0 MiB"), "{s}");
    assert!(s.contains("1.0 GiB"), "{s}");
    assert!(s.contains("64.0 MiB/s"), "{s}");
    assert!(s.contains("0:08"), "eta: {s}");
    // Half the bar is filled.
    let full = s.chars().filter(|&c| c == '█').count();
    let empty = s.chars().filter(|&c| c == '░').count();
    assert!(full > 0 && empty > 0, "{s}");
    assert!((full as i64 - empty as i64).abs() <= 1, "{full} vs {empty}: {s}");
}

#[test]
fn an_unknown_size_gets_no_made_up_bar() {
    let s = render(&frame(3 * 1024 * 1024, None, 1024.0 * 1024.0), &style(false, 80));
    assert!(s.contains("3.0 MiB"), "{s}");
    assert!(!s.contains('%') && !s.contains('█'), "{s}");
}

#[test]
fn colour_follows_the_terminal_and_no_color() {
    assert!(use_color(true, None, Some("xterm-256color")));
    assert!(!use_color(false, None, Some("xterm")), "not a terminal");
    assert!(!use_color(true, Some("1"), Some("xterm")), "NO_COLOR");
    assert!(!use_color(true, None, Some("dumb")), "TERM=dumb");
    assert!(use_color(true, Some(""), Some("xterm")), "an empty NO_COLOR does not count");
}

#[test]
fn in_a_terminal_updates_overwrite_one_line() {
    let mut out = Vec::new();
    {
        let mut line = Line::new(&mut out, true, style(true, 80));
        for i in 1..=5u64 {
            line.draw_now(i * 100, Some(500));
        }
        line.finish();
    }
    let s = String::from_utf8(out).unwrap();
    assert_eq!(s.matches('\n').count(), 1, "one line in the end: {s:?}");
    assert!(s.ends_with('\n'), "{s:?}");
    assert!(s.matches('\r').count() >= 5, "each update returns to the line start: {s:?}");
    assert!(s.contains("\x1b[K"), "each update clears the rest of the line: {s:?}");
}

#[test]
fn a_message_goes_above_the_bar_not_through_it() {
    let mut out = Vec::new();
    {
        let mut line = Line::new(&mut out, true, style(false, 80));
        line.draw_now(100, Some(500));
        line.message("[youtube] abc: Downloading webpage");
        line.draw_now(200, Some(500));
        line.finish();
    }
    let s = String::from_utf8(out).unwrap();
    // The bar is wiped before the message, the message gets its own line,
    // and the bar comes back below it.
    let at = s.find("[youtube]").unwrap();
    assert!(s[..at].ends_with("\r\x1b[K"), "{s:?}");
    assert!(s[at..].starts_with("[youtube] abc: Downloading webpage\n"), "{s:?}");
    assert_eq!(s.matches('\n').count(), 2, "{s:?}");
}

#[test]
fn piped_output_gets_one_plain_summary_and_no_redraws() {
    // The queue and the browser host read engine stderr through a pipe; a
    // redraw per update would bury the error in the last lines they keep.
    let mut out = Vec::new();
    {
        let mut line = Line::new(&mut out, false, style(false, 80));
        for i in 1..=5u64 {
            line.draw_now(i * 100, Some(500));
        }
        line.message("note");
        line.finish();
    }
    let s = String::from_utf8(out).unwrap();
    assert!(!s.contains('\r') && !s.contains('\x1b'), "{s:?}");
    assert_eq!(s.lines().count(), 2, "the message and one summary: {s:?}");
    assert!(s.lines().last().unwrap().contains("100.0%"), "{s:?}");
}

#[test]
fn finishing_twice_or_without_progress_prints_nothing_extra() {
    let mut out = Vec::new();
    {
        let mut line = Line::new(&mut out, true, style(false, 80));
        line.finish();
        line.finish();
    }
    assert!(out.is_empty(), "{:?}", String::from_utf8_lossy(&out));
}

#[test]
fn a_child_line_is_coloured_by_its_tag_above_the_bar() {
    // The complaint that started this: yt-dlp's twenty grey lines and the one
    // that says ERROR: all looked the same. The tag decides the colour, and
    // the text itself is never rewritten.
    let mut out = Vec::new();
    {
        let mut line = Line::new(&mut out, true, style(true, 80));
        line.message("[youtube] abc: Downloading webpage");
        line.message("ERROR: nope");
        line.message("plain text");
    }
    let s = String::from_utf8(out).unwrap();
    assert!(s.contains("\x1b[35m[youtube]\x1b[0m"), "{s:?}");
    assert!(s.contains("\x1b[31mERROR: nope\x1b[0m"), "{s:?}");
    assert!(s.contains("plain text\n"), "{s:?}");
    assert!(!s.contains("\x1b[35mplain"), "{s:?}");
}

#[test]
fn a_piped_child_line_is_byte_for_byte_what_the_child_wrote() {
    let mut out = Vec::new();
    {
        let mut line = Line::new(&mut out, false, style(false, 80));
        line.message("[download]  45.2% of 12.3MiB");
        line.message("ERROR: nope");
    }
    let s = String::from_utf8(out).unwrap();
    assert_eq!(s, "[download]  45.2% of 12.3MiB\nERROR: nope\n");
}
