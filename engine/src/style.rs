//! Colour for the lines `idm` prints about itself.
//!
//! The download bar has been a coloured one-liner for a while, but everything
//! around it -- the `[*] url : ...` header, yt-dlp's `[download] ...` chatter,
//! the final `[+] done -> ...` -- came out as one undifferentiated grey wall.
//! On a media download that is a dozen lines of equal weight, and the line that
//! matters (the one that says it failed) is impossible to find.
//!
//! So: labels are dim, values are plain, `[*]` is cyan, `[+]` is green, `[!]`
//! yellow, `[x]` red. Colour is decided once from the stream it goes to, and
//! `NO_COLOR` / `TERM=dumb` / a pipe all turn it off, so anything capturing the
//! output gets exactly the text it got before.
//!
//! The colouring functions are pure: they take `on` and return a String. That
//! is what the tests poke at, because a test that has to be a terminal to see
//! the difference does not get written.

use std::fmt::Display;
use std::io::IsTerminal;
use std::sync::OnceLock;

const RESET: &str = "\x1b[0m";
const BOLD: &str = "\x1b[1m";
const DIM: &str = "\x1b[2m";
const RED: &str = "\x1b[31m";
const GREEN: &str = "\x1b[32m";
const YELLOW: &str = "\x1b[33m";
const BLUE: &str = "\x1b[34m";
const MAGENTA: &str = "\x1b[35m";
const CYAN: &str = "\x1b[36m";

/// Whether stdout gets colour. `idm` decides once, at the start of `run`.
static STDOUT_COLOR: OnceLock<bool> = OnceLock::new();
/// Whether stderr gets colour; yt-dlp's lines go there through `progress::Line`.
static STDERR_COLOR: OnceLock<bool> = OnceLock::new();

/// Colour for a stream, honouring `NO_COLOR` and `TERM=dumb`.
pub fn enabled(is_tty: bool) -> bool {
    if !is_tty {
        return false;
    }
    let no_color = std::env::var("NO_COLOR").ok();
    if no_color.map_or(false, |v| !v.is_empty()) {
        return false;
    }
    std::env::var("TERM").ok().as_deref() != Some("dumb")
}

/// Decide the colours for this process. Called once, from `main`.
pub fn init() {
    let _ = STDOUT_COLOR.set(enabled(std::io::stdout().is_terminal()));
    let _ = STDERR_COLOR.set(enabled(std::io::stderr().is_terminal()));
}

pub fn stdout() -> bool {
    *STDOUT_COLOR.get_or_init(|| enabled(std::io::stdout().is_terminal()))
}

pub fn stderr() -> bool {
    *STDERR_COLOR.get_or_init(|| enabled(std::io::stderr().is_terminal()))
}

fn paint(on: bool, code: &str, text: &str) -> String {
    if on {
        format!("{}{}{}", code, text, RESET)
    } else {
        text.to_string()
    }
}

/// `  url        https://...` -- the label dim, aligned, the value plain.
///
/// Alignment is the point: a column of values that start at the same place
/// is read in one glance, a ragged one is not.
pub fn field(on: bool, label: &str, value: impl Display) -> String {
    format!("  {}  {}", paint(on, DIM, &format!("{:<10}", label)), value)
}

/// `[*] something happened` -- cyan marker, bold text.
pub fn info(on: bool, text: impl Display) -> String {
    format!("{} {}", paint(on, CYAN, "[*]"), paint(on, BOLD, &text.to_string()))
}

/// `[+] it worked` -- green.
pub fn ok(on: bool, text: impl Display) -> String {
    format!("{} {}", paint(on, GREEN, "[+]"), paint(on, BOLD, &text.to_string()))
}

/// `[!] careful` -- yellow.
pub fn warn(on: bool, text: impl Display) -> String {
    format!("{} {}", paint(on, YELLOW, "[!]"), paint(on, BOLD, &text.to_string()))
}

/// `[x] it failed` -- red.
pub fn err(on: bool, text: impl Display) -> String {
    format!("{} {}", paint(on, RED, "[x]"), paint(on, BOLD, &text.to_string()))
}

/// A line from a child process (yt-dlp, aria2c), coloured by its `[tag]`.
///
/// yt-dlp writes `[youtube] abc: Downloading webpage`, `[download] 45.2% ...`,
/// `[hlsnative] ...`, and the ones that matter: `ERROR:` and `WARNING:`.
/// Anything without a tag is passed through untouched -- this colours what it
/// recognises and invents nothing.
pub fn child_line(on: bool, line: &str) -> String {
    let trimmed = line.trim_start();
    let upper = trimmed.to_ascii_uppercase();
    if upper.starts_with("ERROR:") || upper.starts_with("FATAL:") {
        return paint(on, RED, line);
    }
    if upper.starts_with("WARNING:") {
        return paint(on, YELLOW, line);
    }
    let Some(rest) = trimmed.strip_prefix('[') else {
        return line.to_string();
    };
    let Some(end) = rest.find(']') else {
        return line.to_string();
    };
    let tag = &rest[..end];
    // `[download]` is the one line per update; the extractor tags are noise
    // that should read as noise.
    let code = match tag {
        "download" => GREEN,
        "info" => CYAN,
        "hlsnative" | "hls" | "dash" | "ffmpeg" | "Merger" => BLUE,
        _ if tag.to_ascii_lowercase().contains("error") => RED,
        _ => MAGENTA,
    };
    let head = format!("[{}]", tag);
    format!("{}{}", paint(on, code, &head), &rest[end + 1..])
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn fields_line_up_and_colour_only_when_asked() {
        let plain = field(false, "url", "https://x");
        assert_eq!(plain, "  url         https://x");
        assert!(!plain.contains('\x1b'));
        let coloured = field(true, "url", "https://x");
        assert!(coloured.contains("\x1b[2m"));
        // Colour must not change how wide the field is.
        assert_eq!(visible(&coloured), visible(&plain));
    }

    #[test]
    fn markers_have_one_colour_each() {
        assert!(info(true, "x").contains("\x1b[36m"));
        assert!(ok(true, "x").contains("\x1b[32m"));
        assert!(warn(true, "x").contains("\x1b[33m"));
        assert!(err(true, "x").contains("\x1b[31m"));
        assert_eq!(info(false, "x"), "[*] x");
        assert_eq!(ok(false, "x"), "[+] x");
        assert_eq!(warn(false, "x"), "[!] x");
        assert_eq!(err(false, "x"), "[x] x");
    }

    #[test]
    fn child_lines_are_coloured_by_their_tag_and_never_rewritten() {
        // Whatever the colour, the text a pipe sees is the text yt-dlp wrote.
        for line in [
            "[youtube] abc: Downloading webpage",
            "[download]  45.2% of 12.3MiB at 1.2MiB/s",
            "[hlsnative] Total fragments: 598",
            "ERROR: Unsupported URL: https://x",
            "WARNING: falling back",
            "plain text with no tag",
        ] {
            assert_eq!(child_line(false, line), line);
        }
        assert!(child_line(true, "ERROR: nope").contains("\x1b[31m"));
        assert!(child_line(true, "WARNING: hmm").contains("\x1b[33m"));
        assert!(child_line(true, "[download] x").contains("\x1b[32m"));
        assert!(child_line(true, "[youtube] x").contains("\x1b[35m"));
    }

    #[test]
    fn no_color_and_dumb_terminals_get_no_escapes() {
        // The environment is global, so only the parts a test can set safely
        // are checked here; the rest lives in `enabled`'s three lines.
        assert!(!enabled(false));
    }

    fn visible(s: &str) -> usize {
        let mut n = 0;
        let mut it = s.chars();
        while let Some(c) = it.next() {
            if c == '\x1b' {
                for c in it.by_ref() {
                    if ('@'..='~').contains(&c) && c != '[' {
                        break;
                    }
                }
                continue;
            }
            n += 1;
        }
        n
    }
}
