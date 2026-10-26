//! The terminal progress line of `idm`.
//!
//! One line, redrawn in place: `\r`, the frame, then `ESC[K` to wipe whatever
//! a longer previous frame left behind. The frame is kept narrower than the
//! terminal, because a line that wraps turns every later `\r` into a new row
//! -- the "re-rendering pod sebe" the user complained about.
//!
//! Anything else worth saying (yt-dlp's `[youtube] ...` lines, warnings) goes
//! through `Line::message`, which wipes the bar, prints the text on a line of
//! its own and lets the next update draw the bar again below it.
//!
//! When stderr is not a terminal (the queue and the browser host read it
//! through a pipe) nothing is redrawn at all: one plain summary at the end,
//! so the last lines they keep for an error message are the error.

use std::io::Write;
use std::time::{Duration, Instant};

/// How the frame is drawn: in colour or not, and into how many columns.
#[derive(Clone, Copy, Debug)]
pub struct Style {
    pub color: bool,
    pub columns: usize,
}

/// One state of a transfer.
#[derive(Clone, Copy, Debug)]
pub struct Frame {
    pub cur: u64,
    /// None when the server never said how big it is.
    pub total: Option<u64>,
    /// Bytes per second; 0 when not known yet.
    pub rate: f64,
    /// Set on the final frame: the time it took, shown instead of an ETA.
    pub elapsed: Option<f64>,
}

const RESET: &str = "\x1b[0m";
const BOLD: &str = "\x1b[1m";
const GREEN: &str = "\x1b[32m";
const CYAN: &str = "\x1b[36m";
const YELLOW: &str = "\x1b[33m";
const MAGENTA: &str = "\x1b[35m";
const GREY: &str = "\x1b[90m";

/// `12.3 MiB`. Binary units, one decimal from KiB up.
pub fn human_bytes(n: u64) -> String {
    const UNITS: [&str; 5] = ["KiB", "MiB", "GiB", "TiB", "PiB"];
    if n < 1024 {
        return format!("{} B", n);
    }
    let mut v = n as f64 / 1024.0;
    let mut i = 0;
    while v >= 1024.0 && i < UNITS.len() - 1 {
        v /= 1024.0;
        i += 1;
    }
    format!("{:.1} {}", v, UNITS[i])
}

/// `0:05`, `2:03`, `1:02:03`.
pub fn human_duration(secs: f64) -> String {
    let s = if secs.is_finite() && secs > 0.0 { secs.round() as u64 } else { 0 };
    let (h, m, s) = (s / 3600, (s % 3600) / 60, s % 60);
    if h > 0 {
        format!("{}:{:02}:{:02}", h, m, s)
    } else {
        format!("{}:{:02}", m, s)
    }
}

/// Colour only for a terminal, never with a non-empty NO_COLOR
/// (https://no-color.org) or TERM=dumb.
pub fn use_color(is_tty: bool, no_color: Option<&str>, term: Option<&str>) -> bool {
    is_tty && no_color.map_or(true, |v| v.is_empty()) && term != Some("dumb")
}

/// Width of `s` on screen: characters, not counting ANSI escape sequences.
pub fn visible_width(s: &str) -> usize {
    let mut n = 0;
    let mut chars = s.chars();
    while let Some(c) = chars.next() {
        if c == '\x1b' {
            // CSI: ESC [ params final-byte(@..~)
            for c in chars.by_ref() {
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

fn paint(color: bool, code: &str, text: &str) -> String {
    if color {
        format!("{}{}{}", code, text, RESET)
    } else {
        text.to_string()
    }
}

/// The frame as one line, narrower than `style.columns`.
///
/// `  50.0% ██████████░░░░░░░░░░  512.0 MiB / 1.0 GiB  64.0 MiB/s  ETA 0:08`
///
/// Parts are dropped from the right when the terminal is narrow; the bar
/// takes whatever width is left, between 10 and 40 cells.
pub fn render(f: &Frame, style: &Style) -> String {
    let c = style.color;
    let budget = style.columns.saturating_sub(1);
    let speed = if f.rate >= 1.0 {
        Some(format!("{}/s", human_bytes(f.rate as u64)))
    } else {
        None
    };
    let tail = match (f.elapsed, f.total) {
        (Some(e), _) => Some(format!("in {}", human_duration(e))),
        (None, Some(t)) if f.rate >= 1.0 && t > f.cur => {
            Some(format!("ETA {}", human_duration((t - f.cur) as f64 / f.rate)))
        }
        _ => None,
    };

    let Some(total) = f.total.filter(|&t| t > 0) else {
        // Unknown size: how much and how fast, no bar to invent.
        let mut parts = vec![(format!("↓ {}", human_bytes(f.cur)), BOLD)];
        if let Some(s) = speed {
            parts.push((s, MAGENTA));
        }
        if let Some(t) = tail {
            parts.push((t, YELLOW));
        }
        return join_fitting(c, budget, &parts);
    };

    let frac = (f.cur as f64 / total as f64).clamp(0.0, 1.0);
    let pct = format!("{:>5.1}%", frac * 100.0);
    let mut parts = vec![(format!("{} / {}", human_bytes(f.cur), human_bytes(total)), "")];
    if let Some(s) = speed {
        parts.push((s, MAGENTA));
    }
    if let Some(t) = tail {
        parts.push((t, YELLOW));
    }
    // Drop parts from the right until a 10-cell bar fits beside them.
    loop {
        let used: usize = 1 + pct.chars().count() + 1 + parts_width(&parts);
        if used + 10 <= budget || parts.is_empty() {
            break;
        }
        parts.pop();
    }
    let used: usize = 1 + pct.chars().count() + 1 + parts_width(&parts);
    let bar_w = budget.saturating_sub(used).min(40);
    let full = ((frac * bar_w as f64).round() as usize).min(bar_w);
    let bar = if c {
        format!(
            "{}{}{}{}{}",
            GREEN,
            "━".repeat(full),
            GREY,
            "━".repeat(bar_w - full),
            RESET
        )
    } else {
        format!("{}{}", "█".repeat(full), "░".repeat(bar_w - full))
    };
    let head = format!(" {} {}", paint(c, &format!("{}{}", BOLD, CYAN), &pct), bar);
    let mut out = head;
    for (text, code) in &parts {
        out.push_str("  ");
        out.push_str(&paint(c && !code.is_empty(), code, text));
    }
    out
}

fn parts_width(parts: &[(String, &str)]) -> usize {
    parts.iter().map(|(t, _)| 2 + t.chars().count()).sum()
}

/// The parts, two spaces apart, as many as fit into `budget` columns.
fn join_fitting(c: bool, budget: usize, parts: &[(String, &str)]) -> String {
    let mut s = String::new();
    let mut width = 0;
    for (text, code) in parts {
        let w = 2 + text.chars().count();
        if width + w > budget {
            break;
        }
        width += w;
        s.push_str("  ");
        s.push_str(&paint(c, code, text));
    }
    s
}

/// Speed from the bytes seen over time, smoothed so the number can be read.
struct Meter {
    started: Instant,
    last_at: Instant,
    last_cur: Option<u64>,
    rate: f64,
}

impl Meter {
    fn new() -> Self {
        let now = Instant::now();
        Meter { started: now, last_at: now, last_cur: None, rate: 0.0 }
    }

    fn sample(&mut self, cur: u64) -> f64 {
        let now = Instant::now();
        match self.last_cur {
            None => {
                self.last_cur = Some(cur);
                self.last_at = now;
            }
            Some(prev) => {
                let dt = now.duration_since(self.last_at).as_secs_f64();
                if dt >= 0.25 {
                    let inst = cur.saturating_sub(prev) as f64 / dt;
                    self.rate = if self.rate == 0.0 { inst } else { self.rate * 0.7 + inst * 0.3 };
                    self.last_cur = Some(cur);
                    self.last_at = now;
                }
            }
        }
        self.rate
    }
}

/// The progress line on a writer (stderr in the engine, a Vec in tests).
pub struct Line<W: Write> {
    out: W,
    tty: bool,
    style: Style,
    meter: Meter,
    last: Option<(u64, Option<u64>)>,
    last_draw: Option<Instant>,
    /// A bar is on screen and has to be wiped before anything else is printed.
    shown: bool,
    finished: bool,
}

/// How often the bar is redrawn at most.
const REDRAW: Duration = Duration::from_millis(120);

impl<W: Write> Line<W> {
    pub fn new(out: W, tty: bool, style: Style) -> Self {
        Line {
            out,
            tty,
            style,
            meter: Meter::new(),
            last: None,
            last_draw: None,
            shown: false,
            finished: false,
        }
    }

    /// Record progress; redraws at most every 120 ms.
    pub fn draw(&mut self, cur: u64, total: Option<u64>) {
        let due = self.last_draw.map_or(true, |t| t.elapsed() >= REDRAW);
        self.record(cur, total);
        if due {
            self.paint();
        }
    }

    /// Record progress and redraw now.
    #[allow(dead_code)]
    pub fn draw_now(&mut self, cur: u64, total: Option<u64>) {
        self.record(cur, total);
        self.paint();
    }

    fn record(&mut self, cur: u64, total: Option<u64>) {
        self.meter.sample(cur);
        self.last = Some((cur, total.filter(|&t| t > 0)));
    }

    fn paint(&mut self) {
        let Some((cur, total)) = self.last else { return };
        self.last_draw = Some(Instant::now());
        if !self.tty {
            return;
        }
        let f = Frame { cur, total, rate: self.meter.rate, elapsed: None };
        let _ = write!(self.out, "\r{}\x1b[K", render(&f, &self.style));
        let _ = self.out.flush();
        self.shown = true;
    }

    fn wipe(&mut self) {
        if self.shown {
            let _ = write!(self.out, "\r\x1b[K");
            self.shown = false;
        }
    }

    /// A line of its own above the bar; the next update brings the bar back.
    ///
    /// A child process' line (`[youtube] ...`, `[download] ...`, `ERROR: ...`)
    /// is coloured by its tag on the way through, so the one line that says
    /// why a download failed is not the same grey as the twenty above it.
    /// When colour is off the text is passed through byte for byte, so a pipe
    /// sees exactly what yt-dlp wrote.
    pub fn message(&mut self, text: &str) {
        self.wipe();
        let _ = writeln!(self.out, "{}", crate::style::child_line(self.style.color, text));
        let _ = self.out.flush();
    }

    /// The final frame (time taken instead of an ETA) and a newline. Nothing
    /// when no progress was ever recorded; a second call does nothing.
    pub fn finish(&mut self) {
        if self.finished {
            return;
        }
        self.finished = true;
        let Some((cur, total)) = self.last else { return };
        let elapsed = self.meter.started.elapsed().as_secs_f64();
        let rate = if elapsed > 0.0 { cur as f64 / elapsed } else { 0.0 };
        let f = Frame { cur, total, rate, elapsed: Some(elapsed) };
        if self.tty {
            let _ = writeln!(self.out, "\r{}\x1b[K", render(&f, &self.style));
        } else {
            let plain = Style { color: false, ..self.style };
            let _ = writeln!(self.out, "{}", render(&f, &plain).trim_start());
        }
        let _ = self.out.flush();
        self.shown = false;
    }
}

impl Line<std::io::Stderr> {
    /// The engine's line: stderr, colour and width from the environment.
    pub fn stderr() -> Self {
        use std::io::IsTerminal;
        let err = std::io::stderr();
        let tty = err.is_terminal();
        let color = use_color(
            tty,
            std::env::var("NO_COLOR").ok().as_deref(),
            std::env::var("TERM").ok().as_deref(),
        ) && ansi_ok();
        Line::new(err, tty, Style { color, columns: terminal_columns() })
    }
}

/// Windows consoles only interpret escape sequences once asked to; Windows
/// Terminal (WT_SESSION) and anything that sets TERM already do. Elsewhere a
/// terminal is assumed to speak ANSI.
fn ansi_ok() -> bool {
    !cfg!(windows) || std::env::var_os("WT_SESSION").is_some() || std::env::var_os("TERM").is_some()
}

/// The terminal's width: the tty itself, then COLUMNS, then 80.
fn terminal_columns() -> usize {
    #[cfg(unix)]
    {
        // SAFETY: TIOCGWINSZ only writes into the winsize we hand it.
        let mut ws: libc::winsize = unsafe { std::mem::zeroed() };
        let ok = unsafe { libc::ioctl(libc::STDERR_FILENO, libc::TIOCGWINSZ, &mut ws) } == 0;
        if ok && ws.ws_col > 0 {
            return ws.ws_col as usize;
        }
    }
    std::env::var("COLUMNS")
        .ok()
        .and_then(|v| v.trim().parse::<usize>().ok())
        .filter(|&n| n > 0)
        .unwrap_or(80)
}
