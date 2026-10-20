#!/usr/bin/env python3
"""idm_gui.py - native desktop window for the IDM-like downloader.

The layout follows the real Internet Download Manager (see docs/idm/GUI_SPEC.md,
extracted from IDM's own documentation and screenshots):

    +----------------------------------------------------------------+
    | [Add URL][Resume][Stop][Stop All][Delete][Options][Scheduler]  |   toolbar
    |----------------------------------------------------------------|
    | Categories      | File Name | Size | Status | Speed | Time | Q |   list
    |  All Downloads  |  movie.mp4| 8 MB | Downl. | 1.2MB | 6 s  | * |
    |  Compressed     |  ...                                            |
    |  Documents      |                                                 |
    |  Music          |                                                 |
    |  Programs       |                                                 |
    |  Video          |                                                 |
    |  Unfinished     |                                                 |
    |  Finished       |                                                 |
    |  Queues         |                                                 |
    +----------------------------------------------------------------+

Dialogs: Add URL, Download File Info, Options (7 tabs), Scheduler (2 tabs),
Properties, Download Complete.

Only the standard library (urllib + tkinter) is used.

Usage:
    python3 idm_gui.py [--addr H:P] [--engine PATH] [--out-dir DIR]
                       [--state-dir DIR] [--autostart]

Self-tests (used by gui/test/*.test.mjs):
    --selftest-api     drive a real download through the API, print markers
    --selftest-window  build the window (needs a display), print a marker
    --selftest-dump    build the window and print its widget tree as JSON
"""
from __future__ import annotations

import argparse
import json
import os
import secrets
import re
import queue
import shutil
import subprocess
import threading
import sys
import time
import urllib.error
import urllib.parse
import urllib.request

DEFAULT_ADDR = "127.0.0.1:8080"
# Kept in step with engine/Cargo.toml (and so with the git tags), because
# "Check for updates" compares this against the newest published tag: at
# "1.0.0" against tags of v0.1.x it could only ever say "up to date".
# gui/test/version_sync.test.mjs fails if the two drift apart.
VERSION = "2.1.9"

# Category names exactly as IDM shows them in the left tree.
CATEGORIES = [
    "All Downloads",
    "Compressed",
    "Documents",
    "Music",
    "Programs",
    "Video",
    "Unfinished",
    "Finished",
    "Grabber projects",
    "Queues",
]

# Main list columns, in IDM order. "Q" is the queue column.
#
# "speed" and "eta" say their units in the heading, because a number with no
# unit in a narrow column is a riddle. "eta" replaces the old "time" key: the
# cell showed nothing for as long as the engine sent no rate, so there is no
# saved layout worth keeping compatible with.
COLUMNS = [
    ("name", "File Name", 240),
    ("category", "Category", 90),
    ("size", "Size", 90),
    ("status", "Status", 100),
    ("progress", "Progress", 150),
    ("speed", "Speed (MB/s)", 100),
    ("eta", "ETA", 80),
    ("queue", "Q", 40),
    ("url", "URL", 260),
    ("description", "Description", 160),
]

# Light and dark palettes.
#
# Every foreground here is checked against every surface it lands on at WCAG AA
# (4.5:1) by gui/test/theme.test.mjs -- a palette that looks designed and
# cannot be read is worse than the platform grey it replaces. The two row
# colours are deliberately close: enough to follow a row across the window,
# not enough to turn the list into a zebra crossing.
THEMES = {
    "light": {
        "bg": "#f4f5f7",          # window chrome
        "surface": "#ffffff",     # panels, entries, the list itself
        "fg": "#1b1f24",
        "muted": "#5c6670",       # secondary cells (URL, description)
        "row_odd": "#ffffff",
        "row_even": "#eef1f5",
        "grid": "#d4d9e0",        # row separators and panel borders
        "accent": "#1565c0",
        "ok": "#176c33",          # a finished row
        "err": "#c62828",         # a failed row
        "selection_bg": "#cfe2ff",
        "selection_fg": "#10243e",
        "heading_bg": "#e4e8ee",
        "heading_fg": "#1b1f24",
    },
    "dark": {
        "bg": "#16181d",
        "surface": "#1e2127",
        "fg": "#e6e9ef",
        "muted": "#9aa4b2",
        "row_odd": "#1e2127",
        "row_even": "#24282f",
        "grid": "#333942",
        "accent": "#4d9fff",
        "ok": "#5cc97f",
        "err": "#ff7b72",
        "selection_bg": "#2d4a6b",
        "selection_fg": "#eaf2ff",
        "heading_bg": "#272b33",
        "heading_fg": "#e6e9ef",
    },
}


# The measurements that make the window look designed rather than default.
# Tk's defaults are dense and bevelled; both are what "a dry grey window" is
# made of. Keeping them here means a test can hold them to account and there
# is one place to change the density of the whole program.
METRICS = {
    "row_height": 28,        # Tk's default is 20 and reads as a spreadsheet
    "heading_height": 30,
    "toolbar_pad": 10,
    "button_pad_x": 12,
    "button_pad_y": 7,
    "relief": "flat",        # no raised/sunken borders anywhere
    "border": 0,
    "gap": 6,
}


def theme_palette(name: str) -> dict:
    """The colours for a theme. An unknown name is light, never a crash."""
    return dict(THEMES.get(str(name or "").lower(), THEMES["light"]))


def should_offer_update(cache) -> bool:
    """Whether the window should install an update on startup.

    Deliberately strict. The window replaces its own binaries without asking,
    so every way of being unsure -- no cache, a half-written one, a claim of
    news with no version to install, `newer` as a string rather than a bool --
    answers no. Doing nothing is always recoverable; installing when we should
    not is not.
    """
    if not isinstance(cache, dict):
        return False
    if cache.get("newer") is not True:
        return False
    return bool(str(cache.get("latest") or "").strip())


def auto_update_enabled(state_dir: str) -> bool:
    """Install new releases on startup? On by default, switchable off.

    'Without confirmation' is the default the brief asked for, not a life
    sentence: someone who does not want their binaries replaced on startup
    has to be able to say so.
    """
    value = (load_settings(state_dir).get("updates") or {}).get("auto_install")
    return value is not False


def read_update_cache(state_dir: str) -> dict:
    """What the last release check found. Missing or broken reads as empty."""
    try:
        with open(os.path.join(state_dir, "update.json"), encoding="utf-8") as f:
            data = json.load(f)
        return data if isinstance(data, dict) else {}
    except Exception:  # noqa: BLE001
        return {}


def read_update_progress(path: str) -> dict:
    """One poll of the updater's progress file, as something displayable.

    The updater writes atomically, but the window can look before the first
    write lands -- and a reader that raised there would take the dialog down
    with it. A missing or half-written file is 'starting', never 'finished'.
    """
    raw = {}
    try:
        with open(path, encoding="utf-8") as f:
            loaded = json.load(f)
        if isinstance(loaded, dict):
            raw = loaded
    except Exception:  # noqa: BLE001
        raw = {}

    phase = str(raw.get("phase") or "start")
    error = raw.get("error") or None
    try:
        percent = float(raw.get("percent") or 0.0)
    except (TypeError, ValueError):
        percent = 0.0
    try:
        speed = int(raw.get("speed_bps") or 0)
    except (TypeError, ValueError):
        speed = 0
    done = raw.get("done") is True

    if error:
        label = "Aktualizace selhala: %s" % error
    elif not raw:
        label = "Připravuji aktualizaci…"
    elif done:
        label = "Hotovo"
    else:
        names = {
            "check": "Zjišťuji verzi",
            "download": "Stahuji",
            "verify": "Ověřuji kontrolní součet",
            "unpack": "Rozbaluji",
            "swap": "Instaluji",
        }
        label = names.get(phase, phase)
        if percent > 0:
            label += " %.0f %%" % percent
        rate = fmt_speed(speed)
        if rate:
            label += "  (%s)" % rate

    return {"phase": phase, "percent": percent, "speed_bps": speed,
            "done": done, "error": error, "label": label}


def update_outcome(progress, returncode) -> dict:
    """How an `idm update` that has exited ended, from its last progress
    write and its exit code.

    The exit code is the updater's verdict. The dialog used to report
    "Hotovo" whenever the process had exited, so an updater that died before
    writing its error -- or whose last write was lost -- passed for a success.
    `installed` says whether new files are on disk: "uptodate" is fine, but
    there is nothing to restart into.
    """
    raw = progress if isinstance(progress, dict) else {}
    error = raw.get("error") or None
    phase = str(raw.get("phase") or "")
    if error:
        return {"ok": False, "installed": False,
                "label": "Aktualizace selhala: %s" % error}
    if returncode not in (None, 0):
        return {"ok": False, "installed": False,
                "label": "Aktualizace selhala (kód %s)" % returncode}
    if phase == "uptodate":
        return {"ok": True, "installed": False, "label": "IDM je aktuální"}
    return {"ok": True, "installed": True, "label": "Hotovo"}


def after_update_action(outcome, auto: bool, active_downloads: int) -> str:
    """What the window does once an update has finished: "restart", "offer"
    a restart, or "none".

    The new files only matter once something runs them, and on Windows
    nothing would: the close button hides the window to the notification
    area, so the old window and the engine it spawned kept running out of
    bin.old -- holding it, so it could not be deleted -- and a fresh launch
    reused that engine. The startup update restarts by itself; a running
    download is never cut off for it, and an update the user started is
    theirs to finish.
    """
    if not isinstance(outcome, dict) or not outcome.get("ok") or not outcome.get("installed"):
        return "none"
    if auto and not active_downloads:
        return "restart"
    return "offer"


# Flags that make the window do one thing and exit. Restarting into one of
# them would close the window the user just got back.
_ONE_SHOT_PREFIXES = ("--selftest", "--screenshot")


def relaunch_command(executable: str, argv) -> list | None:
    """The command that starts this window again after an update: the same
    interpreter and the same arguments, so the new gui/idm_gui.py at the same
    path runs with the same --engine/--state-dir. None for a one-shot run.
    """
    args = [str(a) for a in (argv or [])]
    if not executable or not args:
        return None
    if any(a.startswith(_ONE_SHOT_PREFIXES) for a in args[1:]):
        return None
    return [str(executable)] + args


def _dialog_update(parent, engine: str, state_dir: str, latest: str,
                   auto: bool = False, on_restart=None, active=lambda: 0):
    """The install window: progress, no question asked.

    It drives `idm update --progress-file` as a separate process and polls the
    file it writes, rather than doing the work in the Tk thread -- an update
    that froze the window for the length of a download would look like a
    crash, and a swap half-done inside a process that is about to be replaced
    is worse than that.

    Once it is done, after_update_action() decides whether the window
    restarts itself (`on_restart`) or offers to; `active()` counts running
    downloads, which a restart must not cut off.
    """
    import tkinter as tk
    from tkinter import ttk

    win = themed_toplevel(parent)
    win.title("Aktualizace IDM")
    win.transient(parent)
    win.resizable(False, False)
    frame = ttk.Frame(win, padding=14)
    frame.pack(fill="both", expand=True)
    ttk.Label(frame, text="Instaluji verzi %s" % latest).pack(anchor="w")
    bar = ttk.Progressbar(frame, length=320, mode="determinate", maximum=100)
    bar.pack(fill="x", pady=(8, 6))
    status = tk.StringVar(value="Připravuji aktualizaci…")
    ttk.Label(frame, textvariable=status).pack(anchor="w")
    buttons = ttk.Frame(frame)
    buttons.pack(anchor="e", pady=(10, 0))
    restart = ttk.Button(buttons, text="Restartovat IDM",
                         command=lambda: on_restart and on_restart())
    close = ttk.Button(buttons, text="Zavřít", command=win.destroy, state="disabled")
    close.pack(side="right")

    progress_file = os.path.join(state_dir, "update-progress.json")
    try:
        os.remove(progress_file)
    except OSError:
        pass

    kwargs = {"stdout": subprocess.DEVNULL, "stderr": subprocess.DEVNULL}
    if os.name == "nt":
        kwargs["creationflags"] = 0x08000000  # CREATE_NO_WINDOW
    try:
        proc = subprocess.Popen(
            [engine, "update", "--progress-file", progress_file], **kwargs
        )
    except Exception as e:  # noqa: BLE001
        status.set("Aktualizaci nelze spustit: %s" % e)
        close.configure(state="normal")
        return win

    def poll():
        if not win.winfo_exists():
            return
        p = read_update_progress(progress_file)
        bar["value"] = p["percent"]
        status.set(p["label"])
        if proc.poll() is None:
            win.after(400, poll)
            return
        # Judged once the process has exited: the exit code is the verdict,
        # and the process can exit before its last write is seen.
        raw = {}
        try:
            with open(progress_file, encoding="utf-8") as f:
                raw = json.load(f)
        except Exception:  # noqa: BLE001
            raw = {}
        outcome = update_outcome(raw, proc.returncode)
        status.set(outcome["label"])
        close.configure(state="normal")
        if not outcome["ok"]:
            return
        bar["value"] = 100
        try:
            running = int(active() or 0)
        except Exception:  # noqa: BLE001
            running = 0
        act = after_update_action(outcome, auto, running)
        if act == "restart" and on_restart is not None:
            status.set("Hotovo — restartuji IDM…")
            win.after(1200, on_restart)
        elif act != "none":
            note = "Nová verze poběží po restartu IDM."
            if running:
                note += " Běží stahování — restartuj, až doběhne."
            ttk.Label(frame, text=note).pack(anchor="w", pady=(6, 0))
            if on_restart is not None:
                restart.pack(side="right", padx=(0, 6))

    win.after(200, poll)
    return win


def _theme_label(name: str) -> str:
    """The toggle's caption: what the click leads to, not where you are."""
    return "Tmavý motiv" if str(name).lower() == "light" else "Světlý motiv"


def theme_toggle_glyph(name: str) -> str:
    """Which glyph the toggle wears: it shows the theme the click leads to.

    On a light theme the button offers the dark one, so it wears a moon.
    """
    return "moon" if str(name or "").lower() == "light" else "sun"


def next_theme(name: str) -> str:
    """What the toggle switches to. Anything that is not dark becomes dark."""
    return "light" if str(name or "").lower() == "dark" else "dark"


def load_theme(state_dir: str) -> str:
    """The remembered theme, defaulting to light."""
    value = (load_settings(state_dir).get("appearance") or {}).get("theme")
    return "dark" if str(value or "").lower() == "dark" else "light"


def save_theme(state_dir: str, name: str) -> dict:
    s = load_settings(state_dir)
    s.setdefault("appearance", {})["theme"] = (
        "dark" if str(name or "").lower() == "dark" else "light"
    )
    save_settings(state_dir, s)
    return s


# Toolbar buttons, in IDM order.
TOOLBAR = [
    "Add URL",
    "Resume",
    "Stop",
    "Stop All",
    "Delete",
    "Delete Completed",
    "Options",
    "Scheduler",
    "Start Queue",
    "Stop Queue",
    "Grabber",
]

# --------------------------------------------------------------------------- #
# Runtime-drawn icons (IDM has coloured toolbar/category icons; we render ours
# with PIL so we ship no binary assets and still look like the original).
# --------------------------------------------------------------------------- #
_ICON_CACHE = {}
_ICON_USED_PIL = [False]


def _shade(rgb, factor):
    """Lighten (factor > 1) or darken (factor < 1) a colour, clamped."""
    return tuple(max(0, min(255, int(c * factor))) for c in rgb)


def _glyph_mask(shape: str, size: int):
    """The glyph as an 8-bit mask: 255 inside, 0 outside.

    One mask per shape, drawn once, is what lets the shading below be written
    a single time instead of per glyph. Adding a shape therefore cannot forget
    to be shaded.
    """
    from PIL import Image, ImageDraw

    m = Image.new("L", (size, size), 0)
    d = ImageDraw.Draw(m)
    color = 255
    if shape == "arrow_down":
        d.polygon([(size // 2, size - 2), (2, 6), (size - 2, 6)], fill=color)
        d.rectangle([size // 2 - 2, 1, size // 2 + 2, 8], fill=color)
    elif shape == "arrow_up":
        d.polygon([(size // 2, 2), (2, size - 6), (size - 2, size - 6)], fill=color)
    elif shape == "stop":
        d.rectangle([3, 3, size - 3, size - 3], fill=color)
    elif shape == "pause":
        d.rectangle([3, 2, 6, size - 2], fill=color)
        d.rectangle([size - 6, 2, size - 3, size - 2], fill=color)
    elif shape == "resume":
        d.polygon([(3, 2), (size - 3, size // 2), (3, size - 2)], fill=color)
    elif shape == "trash":
        d.rectangle([4, 5, size - 4, size - 2], fill=color)
        d.rectangle([2, 3, size - 2, 5], fill=color)
    elif shape == "gear":
        d.ellipse([2, 2, size - 2, size - 2], outline=color, width=3)
        d.ellipse([size // 2 - 2, size // 2 - 2, size // 2 + 2, size // 2 + 2], fill=color)
    elif shape == "clock":
        d.ellipse([1, 1, size - 1, size - 1], outline=color, width=2)
        d.line([size // 2, size // 2, size // 2, 4], fill=color, width=2)
        d.line([size // 2, size // 2, size - 4, size // 2], fill=color, width=2)
    elif shape == "folder":
        d.rectangle([1, 4, size - 1, size - 1], fill=color)
        d.rectangle([1, 2, 7, 5], fill=color)
    elif shape == "plus":
        d.line([size // 2, 2, size // 2, size - 2], fill=color, width=3)
        d.line([2, size // 2, size - 2, size // 2], fill=color, width=3)
    else:  # square
        d.rectangle([2, 2, size - 2, size - 2], fill=color)
    return m


def icon_image(color, shape: str = "square", size: int = 16, depth: bool = True):
    """Render an icon as a PIL image. `depth=False` gives the old flat glyph.

    The depth is three things, in this order: a soft shadow under the glyph, a
    body lit from above (a vertical gradient from a lightened to a darkened
    version of the colour), and a highlight along the upper edge. Because they
    are applied through the shape's MASK, every glyph gets them -- including
    any added later.

    Drawn at 4x and reduced, so the gradient and the shadow do not land on
    16 whole pixels and look like stairs.
    """
    from PIL import Image, ImageFilter

    scale = 4
    big = size * scale
    # The glyph geometry is written in nominal pixels (a 3px-wide "plus"
    # stroke, a 2px inset). Drawing it straight into a 4x canvas would keep
    # those numbers literal, so the stroke would come back from the reduction
    # as a quarter of a pixel -- which is how this first came out blank.
    # Draw at nominal size, then enlarge the MASK.
    mask = _glyph_mask(shape, size).resize((big, big), Image.LANCZOS)
    rgb = _hex_to_rgb(color)

    out = Image.new("RGBA", (big, big), (0, 0, 0, 0))
    if not depth:
        body = Image.new("RGBA", (big, big), rgb + (255,))
        out.paste(body, (0, 0), mask)
        return out.resize((size, size), Image.LANCZOS)

    # 1) Shadow: the mask, offset down-right, blurred, in translucent black.
    shadow = Image.new("RGBA", (big, big), (0, 0, 0, 0))
    shadow.paste((0, 0, 0, 110), (0, 0), mask)
    shadow = shadow.transform(
        (big, big), Image.AFFINE, (1, 0, -scale, 0, 1, -scale),
        resample=Image.BILINEAR,
    ).filter(ImageFilter.GaussianBlur(scale * 0.7))
    out = Image.alpha_composite(out, shadow)

    # 2) Body: lit from above.
    top, bottom = _shade(rgb, 1.45), _shade(rgb, 0.62)
    grad = Image.new("RGBA", (1, big))
    for y in range(big):
        t = y / max(1, big - 1)
        grad.putpixel((0, y), tuple(
            int(a + (b - a) * t) for a, b in zip(top, bottom)
        ) + (255,))
    body = grad.resize((big, big))
    lit = Image.new("RGBA", (big, big), (0, 0, 0, 0))
    lit.paste(body, (0, 0), mask)
    out = Image.alpha_composite(out, lit)

    # 3) Highlight: the sliver where the body stands above its own edge.
    #
    # Composited, never pasted. paste() with a translucent source writes that
    # source's alpha THROUGH the mask, so on a thin glyph -- the "plus" is
    # three pixels wide -- the rim covers nearly the whole stroke and the body
    # ends up 35% transparent. alpha_composite lays the gloss on top and
    # leaves the body's own alpha alone.
    erode = 2 * (scale // 2) + 1
    inner = mask.filter(ImageFilter.MinFilter(erode))
    rim = Image.new("L", (big, big))
    rim.paste(mask, (0, 0))
    rim.paste(0, (0, 0), inner)
    rim = rim.transform(
        (big, big), Image.AFFINE, (1, 0, scale // 2, 0, 1, scale // 2),
        resample=Image.BILINEAR,
    )
    gloss = Image.new("RGBA", (big, big), (255, 255, 255, 0))
    gloss.putalpha(rim.point(lambda v: v * 90 // 255))
    white = Image.new("RGBA", (big, big), (255, 255, 255, 255))
    white.putalpha(gloss.getchannel("A"))
    out = Image.alpha_composite(out, white)

    return out.resize((size, size), Image.LANCZOS)


def _hex_to_rgb(color):
    """#rrggbb -> (r, g, b). A tuple is passed through."""
    if isinstance(color, (tuple, list)):
        return tuple(color[:3])
    v = str(color).lstrip("#")
    return tuple(int(v[i:i + 2], 16) for i in (0, 2, 4))


# --- icons drawn with the standard library ------------------------------------
#
# These used to go through PIL.ImageTk, which is a native extension: when the
# Pillow build does not match the interpreter's Tcl/Tk it raises
# "bad argument type for built-in operation" and every icon in the program
# silently became None. Tk 8.6 can take pixel data directly, so nothing outside
# the standard library is needed and the icons cannot disappear again.
#
# A glyph is a list of primitives in a 16x16 nominal grid, scaled on draw.
# Keeping the shapes as data (not drawing code) means a new icon is a few
# numbers and the geometry is inspectable in a test.

GLYPHS = {
    # (kind, *coords) in a 0..16 grid. "rect" x1,y1,x2,y2 | "disc" cx,cy,r
    # | "tri" x1,y1,x2,y2,x3,y3 | "ring" cx,cy,r_outer,r_inner
    "plus":      [("rect", 7, 3, 9, 13), ("rect", 3, 7, 13, 9)],
    "pause":     [("rect", 4, 3, 7, 13), ("rect", 9, 3, 12, 13)],
    "stop":      [("rect", 4, 4, 12, 12)],
    "resume":    [("tri", 5, 3, 5, 13, 13, 8)],
    "arrow_down": [("rect", 7, 2, 9, 9), ("tri", 4, 8, 12, 8, 8, 13)],
    "arrow_up":  [("rect", 7, 7, 9, 14), ("tri", 4, 8, 12, 8, 8, 3)],
    "trash":     [("rect", 4, 5, 12, 13), ("rect", 3, 3, 13, 5),
                  ("rect", 6, 1, 10, 3)],
    "gear":      [("ring", 8, 8, 6, 3), ("rect", 7, 1, 9, 4),
                  ("rect", 7, 12, 9, 15), ("rect", 1, 7, 4, 9),
                  ("rect", 12, 7, 15, 9)],
    "clock":     [("ring", 8, 8, 7, 5), ("rect", 7, 4, 9, 9),
                  ("rect", 7, 7, 12, 9)],
    # The gap between tab and body is what makes this read as a folder
    # rather than a coloured square once it is 14 pixels wide.
    "folder":    [("rect", 1, 6, 15, 14), ("rect", 1, 2, 7, 5)],
    "sun":       [("disc", 8, 8, 4), ("rect", 7, 0, 9, 3), ("rect", 7, 13, 9, 16),
                  ("rect", 0, 7, 3, 9), ("rect", 13, 7, 16, 9),
                  ("rect", 2, 2, 5, 5), ("rect", 11, 11, 14, 14),
                  ("rect", 11, 2, 14, 5), ("rect", 2, 11, 5, 14)],
    # A crescent: a disc with a second disc bitten out of it (see _glyph_mask).
    "moon":      [("disc", 8, 8, 6), ("cut", 12, 5, 6)],
    "link":      [("ring", 5, 11, 4, 2), ("ring", 11, 5, 4, 2),
                  ("rect", 6, 6, 10, 10)],
    "search":    [("ring", 7, 7, 5, 3), ("rect", 10, 10, 14, 14)],
}


def _tk_glyph_mask(shape: str, size: int) -> list:
    """Which pixels of a size x size icon belong to `shape`.

    Named apart from _glyph_mask above on purpose: that one builds a PIL mask
    for the shaded icons and this one returns plain rows of booleans for the
    stdlib renderer. Defining both under one name silently shadowed the first
    -- exactly the collision CLAUDE.md warns about -- and the 3D icon tests
    went down with "'list' object has no attribute 'resize'".

    The primitives are specified in a 16x16 grid and scaled here, so the
    geometry stays in nominal pixels -- the lesson from the 3D icons, where
    scaling the coordinates instead of the mask produced empty images.
    """
    prims = GLYPHS.get(shape) or GLYPHS["folder"]
    s = size / 16.0
    mask = [[False] * size for _ in range(size)]

    def fill(test):
        for y in range(size):
            for x in range(size):
                if test(x + 0.5, y + 0.5):
                    mask[y][x] = True

    def clear(test):
        for y in range(size):
            for x in range(size):
                if test(x + 0.5, y + 0.5):
                    mask[y][x] = False

    for p in prims:
        kind = p[0]
        if kind == "rect":
            x1, y1, x2, y2 = (v * s for v in p[1:])
            fill(lambda px, py, x1=x1, y1=y1, x2=x2, y2=y2:
                 x1 <= px <= x2 and y1 <= py <= y2)
        elif kind == "disc":
            cx, cy, r = (v * s for v in p[1:])
            fill(lambda px, py, cx=cx, cy=cy, r=r:
                 (px - cx) ** 2 + (py - cy) ** 2 <= r * r)
        elif kind == "cut":
            cx, cy, r = (v * s for v in p[1:])
            clear(lambda px, py, cx=cx, cy=cy, r=r:
                  (px - cx) ** 2 + (py - cy) ** 2 <= r * r)
        elif kind == "ring":
            cx, cy, ro, ri = (v * s for v in p[1:])
            fill(lambda px, py, cx=cx, cy=cy, ro=ro:
                 (px - cx) ** 2 + (py - cy) ** 2 <= ro * ro)
            clear(lambda px, py, cx=cx, cy=cy, ri=ri:
                  (px - cx) ** 2 + (py - cy) ** 2 <= ri * ri)
        elif kind == "tri":
            xs = [p[1] * s, p[3] * s, p[5] * s]
            ys = [p[2] * s, p[4] * s, p[6] * s]

            def inside(px, py, xs=xs, ys=ys):
                def side(i, j):
                    return ((xs[j] - xs[i]) * (py - ys[i])
                            - (ys[j] - ys[i]) * (px - xs[i]))
                a, b, c = side(0, 1), side(1, 2), side(2, 0)
                return (a >= 0 and b >= 0 and c >= 0) or (a <= 0 and b <= 0 and c <= 0)

            fill(inside)
    return mask


def tk_glyph(color, shape="folder", size=16, master=None, bg=""):
    """A Tk PhotoImage of `shape` in `color`, using only the standard library.

    `bg` is the colour behind the icon. Tk's PhotoImage does support per-pixel
    transparency, but setting it pixel by pixel is slow enough to be visible at
    startup; painting the known widget background is both faster and sharper.
    An empty bg leaves those pixels transparent.
    """
    import tkinter as tk
    img = tk.PhotoImage(width=size, height=size, master=master)
    mask = _tk_glyph_mask(shape, size)
    for y in range(size):
        row = mask[y]
        x = 0
        while x < size:
            on = row[x]
            start = x
            while x < size and row[x] == on:
                x += 1
            if on:
                img.put(color, to=(start, y, x, y + 1))
            elif bg:
                img.put(bg, to=(start, y, x, y + 1))
    return img


def _icon(color, shape="square", size=16, master=None, bg=""):
    """Return a Tk PhotoImage for a small coloured icon (cached).

    Draws a simple but recognisable glyph so the toolbar/tree look like IDM
    instead of bare text buttons. Falls back to None if PIL is unavailable.
    """
    key = (color, shape, size, bg)
    if key in _ICON_CACHE:
        return _ICON_CACHE[key]
    ph = None
    # The standard library first. PIL gives smoother edges when it works, but
    # it is the reason every icon once vanished without a word, so it can never
    # be the only way to get one.
    try:
        ph = tk_glyph(color, shape, size, master=master, bg=bg)
        _ICON_USED_PIL[0] = False
    except Exception:  # noqa: BLE001
        ph = None
    if ph is None:
        try:
            from PIL import ImageTk
            ph = ImageTk.PhotoImage(icon_image(color, shape, size), master=master)
            _ICON_USED_PIL[0] = True
        except Exception:  # noqa: BLE001
            ph = None
    _ICON_CACHE[key] = ph
    return ph


# Per-toolbar-button icon spec (name -> (colour, glyph)).
TOOLBAR_ICONS = {
    "Add URL": ("#2e7d32", "plus"),
    "Resume": ("#1565c0", "resume"),
    "Stop": ("#c62828", "pause"),
    "Stop All": ("#b71c1c", "stop"),
    "Delete": ("#ef6c00", "trash"),
    "Delete Completed": ("#ef6c00", "trash"),
    "Options": ("#455a64", "gear"),
    "Scheduler": ("#6a1b9a", "clock"),
    "Start Queue": ("#2e7d32", "resume"),
    "Stop Queue": ("#c62828", "stop"),
    "Grabber": ("#455a64", "gear"),
}

# Per-category icon spec.
CATEGORY_ICONS = {
    "All Downloads": ("#546e7a", "folder"),
    "Compressed": ("#8d6e63", "folder"),
    "Documents": ("#1565c0", "folder"),
    "Music": ("#6a1b9a", "folder"),
    "Programs": ("#2e7d32", "folder"),
    "Video": ("#c62828", "folder"),
    "Unfinished": ("#ef6c00", "folder"),
    "Finished": ("#2e7d32", "folder"),
    "Grabber projects": ("#455a64", "folder"),
    "Queues": ("#f9a825", "folder"),
}


OPTIONS_TABS = [
    "General",
    "File Types",
    "Connection",
    "Save To",
    "Downloads",
    "Proxy / Socks",
    "Site Logins",
    "Dial-Up / VPN",
    "Sounds",
]

SCHEDULER_TABS = ["Schedule", "Files in the queue"]


# --------------------------------------------------------------------------- #
# API client (no Tk, fully testable)
# --------------------------------------------------------------------------- #
class Api:
    """Thin client for the `idm --serve` queue API."""

    def __init__(self, addr: str, timeout: float = 5.0, token: str = ""):
        self.base = "http://" + addr
        self.addr = addr
        self.timeout = timeout
        # The engine requires this on every /api/* request (CSRF protection);
        # it is written to STATE_DIR/api-token when the engine starts.
        self.token = token

    def _req(self, method: str, path: str, body: dict | None = None) -> dict:
        data = None
        headers = {}
        if self.token:
            headers["X-IDM-Token"] = self.token
        if body is not None:
            data = json.dumps(body).encode()
            headers["Content-Type"] = "application/json"
        req = urllib.request.Request(self.base + path, data=data, headers=headers, method=method)
        with urllib.request.urlopen(req, timeout=self.timeout) as resp:
            raw = resp.read()
        return json.loads(raw) if raw else {}

    def items(self) -> list[dict]:
        return self._req("GET", "/api/items").get("items", [])

    def add(self, url: str, connections: int = 4, aria2: bool = False,
            options: dict | None = None) -> int:
        """Queue a download.

        `options` is the dict from download_options(): the engine honours
        out_dir / user_agent / proxy / format and the rest, so the Options
        dialog is not decoration. An older engine ignores the extra keys.
        """
        body = {"url": url, "connections": connections}
        if aria2:
            body["aria2"] = True
        for key in ("out_dir", "user_agent", "proxy", "auth",
                    "auth_user", "auth_password_ref",
                    "queue", "format", "cookie", "referer",
                    "cookies_from_browser", "filename"):
            value = (options or {}).get(key)
            if value:
                body[key] = value
        if (options or {}).get("limit_rate"):
            body["limit_rate"] = int(options["limit_rate"])
        if (options or {}).get("retries"):
            body["retries"] = int(options["retries"])
        if (options or {}).get("ignore_mtime"):
            body["ignore_mtime"] = True
        if (options or {}).get("force_media"):
            body["force_media"] = True
        r = self._req("POST", "/api/add", body)
        return int(r.get("id", 0))

    def store_password(self, value: str) -> str:
        """Put `value` in the engine's vault, return its `secret:<id>` ref.

        The GUI has no engine binary of its own -- it only ever talks to
        `idm --serve` -- so the password goes over the loopback API, the same
        channel that has always carried it, and what lands in settings.json is
        only the reference. "" means the engine would not take it; the caller
        must then keep the plaintext rather than lose the password.
        """
        if not value:
            return ""
        r = self._req("POST", "/api/secrets", {"value": value})
        return str(r.get("ref") or "") if r.get("ok") else ""

    def secrets_status(self) -> str:
        """One line for Options -> Site Logins: encrypted, and key where."""
        try:
            r = self._req("GET", "/api/secrets-status", None)
        except Exception:  # noqa: BLE001
            return "cannot reach idm --serve"
        return str(r.get("status") or "")

    def formats(self, url: str, cookie: str = "", referer: str = "",
                proxy: str = "") -> list[dict]:
        """Available media formats for `url` ([] when there are none).

        The GUI has no engine of its own, so the listing happens through the
        API. A URL with nothing to list answers ok:false, which is a normal
        case for a plain file and not an error worth showing.
        """
        body: dict = {"url": url}
        for key, value in (("cookie", cookie), ("referer", referer), ("proxy", proxy)):
            if value:
                body[key] = value
        r = self._req("POST", "/api/formats", body)
        if not r.get("ok"):
            return []
        return list(r.get("formats") or [])

    def update(self, i: int, url: str | None = None, output: str | None = None,
               description: str | None = None) -> dict:
        """Edit an item's Properties fields.

        Only the fields given are sent: an omitted key leaves the stored value
        alone, so saving the dialog with an untouched URL cannot blank it.
        """
        body: dict = {"id": i}
        if url is not None:
            body["url"] = url
        if output is not None:
            body["output"] = output
        if description is not None:
            body["description"] = description
        return self._req("POST", "/api/update", body)

    def set_queue(self, i: int, queue: str) -> dict:
        """Move a download into a queue ("" = the main queue)."""
        return self._req("POST", "/api/set-queue", {"id": i, "queue": queue})

    def pause(self, i: int) -> dict:
        return self._req("POST", "/api/pause", {"id": i})

    def resume(self, i: int) -> dict:
        return self._req("POST", "/api/resume", {"id": i})

    def remove(self, i: int) -> dict:
        return self._req("POST", "/api/remove", {"id": i})

    def addr_set(self, addr: str) -> None:
        """Point this client at another address (the port plan walks them)."""
        self.addr = addr
        self.base = "http://" + addr

    def alive(self) -> bool:
        try:
            self.items()
            return True
        except Exception:
            return False

    def probe(self) -> dict:
        """Who, if anyone, is on our address.

        alive() answers one question with one bit and loses the distinction
        that matters: an engine from an older install can hold the port and
        refuse our token, and that is NOT a free port. A 403/401 proves
        somebody is listening, so it is reported as listening-but-unauthorized
        and server_decision() moves us off that address.
        """
        try:
            self.items()
            return {"listening": True, "authorized": True}
        except urllib.error.HTTPError as e:
            # An HTTP status at all means a server answered. Only an auth
            # refusal says the server is somebody else's; a 500 is our engine
            # having a bad day.
            return {"listening": True, "authorized": e.code not in (401, 403)}
        except urllib.error.URLError:
            # Refused, unreachable, DNS: nothing is serving there.
            return {"listening": False, "authorized": False}
        except OSError:
            # Timeouts and resets. This branch is why the window downloaded
            # nothing on Windows: a socket timeout is a TimeoutError, which is
            # an OSError and NOT a URLError, so it used to fall through to the
            # catch-all and be reported as "somebody is listening". The GUI
            # then abandoned a perfectly free port, walked the rest of the
            # plan looking for a server that did not exist, and started no
            # engine at all. Linux refuses a dead port quickly and rarely gets
            # here; Windows times out.
            return {"listening": False, "authorized": False}
        except Exception:  # noqa: BLE001
            # Something answered, but not with HTTP we could parse. Not ours,
            # and not a port worth fighting over.
            return {"listening": True, "authorized": False}


def fmt_speed(bps) -> str:
    """A transfer rate. Empty for a standing start -- "0 MB/s" is noise.

    The column heading says MB/s, which is what a download is measured in, but
    a 64 kB/s line deserves to say so rather than read "0.1 MB/s".
    """
    try:
        v = float(bps or 0)
    except (TypeError, ValueError):
        return ""
    if v < 1:
        return ""
    if v < 1024:
        return f"{v:.0f} B/s"
    if v < 1024 * 1024:
        return f"{v / 1024:.0f} KB/s"
    return f"{v / (1024 * 1024):.1f} MB/s"


def fmt_eta(seconds) -> str:
    """Time remaining. Empty when unknown: a blank cell beats a made-up one."""
    try:
        v = int(seconds or 0)
    except (TypeError, ValueError):
        return ""
    if v <= 0:
        return ""
    if v < 60:
        return f"{v}s"
    if v < 3600:
        return f"{v // 60}m {v % 60}s"
    return f"{v // 3600}h {(v % 3600) // 60}m"


def fmt_size(n) -> str:
    if not n:
        return "-"
    units = ["B", "KB", "MB", "GB", "TB"]
    f = float(n)
    i = 0
    while f >= 1024 and i < len(units) - 1:
        f /= 1024.0
        i += 1
    return f"{f:.0f} {units[i]}" if i == 0 else f"{f:.1f} {units[i]}"


def basename(url: str) -> str:
    u = url.rstrip("/")
    name = u.rsplit("/", 1)[-1]
    name = name.split("?", 1)[0]
    return name or url


def category_of(url: str) -> str:
    """Which IDM category a URL belongs to (by extension)."""
    name = basename(url).lower()
    ext = name.rsplit(".", 1)[-1] if "." in name else ""
    if ext in ("zip", "rar", "7z", "tar", "gz", "bz2", "xz"):
        return "Compressed"
    if ext in ("pdf", "doc", "docx", "txt", "epub", "rtf", "odt", "xls", "xlsx"):
        return "Documents"
    if ext in ("mp3", "m4a", "flac", "wav", "ogg", "aac", "opus"):
        return "Music"
    if ext in ("exe", "msi", "deb", "apk", "dmg", "rpm", "appimage"):
        return "Programs"
    if ext in ("mp4", "mkv", "avi", "mov", "webm", "flv", "m4v"):
        return "Video"
    return "Other"


# --------------------------------------------------------------------------- #
# Settings (persisted to STATE_DIR/settings.json)
# --------------------------------------------------------------------------- #
# The real IDM keeps every Options-tab value in the registry. We keep the same
# structure in a JSON file next to the queue, so the Options dialog is not just
# decoration: values survive a restart and the ones that map to engine flags
# are actually used when a download is added.
DEFAULT_SETTINGS = {
    # Window appearance. Kept out of "general" because it is the user's taste,
    # not behaviour, and Options groups those separately.
    "appearance": {
        "theme": "light",
    },
    "general": {
        "launch_on_startup": True,
        # Windows: the close button hides the window to the notification
        # area; downloads keep running. Exit is in the tray menu.
        "minimize_to_tray": True,
        "integrate_browsers": True,
        "monitor_clipboard": True,
        "run_ie_monitor": False,
        "force_keys": "Ctrl",
        "prevent_keys": "Alt",
        "browsers": [],
    },
    "file_types": {
        "auto": [
            "3gp", "7z", "aac", "ace", "aif", "arj", "asf", "avi", "bin",
            "bz2", "deb", "dmg", "doc", "docx", "epub", "exe", "flac", "flv",
            "gz", "iso", "m4a", "m4v", "mkv", "mov", "mp3", "mp4", "mpeg",
            "msi", "ogg", "pdf", "ppt", "pptx", "rar", "rpm", "tar", "tgz",
            "txt", "wav", "webm", "wma", "wmv", "xls", "xlsx", "zip",
        ],
        "exclude_sites": [],
        "exclude_addresses": [],
    },
    "connection": {
        "max_connections": 8,
        "exceptions": [],  # [{"server": "host", "connections": N}]
        "download_limits": False,
        "limit_amount_mb": 40,
        "limit_period_h": 1,
    },
    "save_to": {
        "default_dir": "",
        "category_dirs": {},  # category name -> directory
        "change_on_last": False,
    },
    "downloads": {
        "show_start_dialog": True,
        "show_complete_dialog": True,
        "start_immediately": True,
        "ignore_mtime": False,
        "show_progress": "normal",  # normal | minimized | don't show
        "user_agent": "",
        # yt-dlp --cookies-from-browser value (chrome, firefox, ...). Empty =
        # off; never auto-detected, see download_options().
        "cookies_from_browser": "",
        "virus_checker": "",
        "virus_params": "[File]",
        # Run when the command line asked to hang up after finishing (/h).
        # There is no dial-up link to drop any more, so the useful reading is
        # "whatever this machine calls going offline" -- and with nothing set,
        # /h says so instead of pretending it did something.
        "hangup_command": "",
    },
    "proxy": {
        "use_system": True,
        "http": "",
        "https": "",
        "ftp": "",
        "socks": "",
        "no_proxy": [],
        "ftp_pasv": True,
        "proxy_auth": False,
        "proxy_user": "",
        "proxy_pass": "",
    },
    # Saved Grabber projects, shown under the "Grabber projects" tree node.
    "grabber_projects": [],  # [DEFAULT_GRABBER_PROJECT-shaped dicts]
    "site_logins": [],  # [{"url": ..., "user": ..., "password": ...}]
    "dialup": {
        "connection": "",
        "username": "",
        "password": "",
        "redials": 3,
        "interval_s": 5,
        "save_password": False,
    },
    "sounds": {
        "enabled": False,
        "events": {},  # event name -> sound file path
    },
    # Per-queue schedules (Scheduler dialog). Empty = the defaults apply.
    "queues": [],
    # Custom categories the user added. Empty = use the built-in CATEGORIES.
    # Each entry: {"name": str, "extensions": [str], "dir": str, "sites": [str]}
    "categories": [],
}

# Events IDM can play a sound for (docs/idm/options.txt, Sounds tab).
SOUND_EVENTS = [
    "Download complete",
    "Download failed",
    "Download started",
    "Queue started",
    "Queue stopped",
]


# Where "Help -> Check for updates" looks. Overridable so tests and forks do
# not have to reach this repository.
RELEASES_API = os.environ.get(
    "IDM_RELEASES_API",
    "https://api.github.com/repos/zombiegirlcz/IDM/releases/latest",
)


def latest_release(url: str = "") -> tuple:
    """(tag, error) of the newest published release. Never raises.

    Returns ("", reason) when the check could not be made, so the caller can
    say why instead of silently claiming the build is up to date.
    """
    try:
        req = urllib.request.Request(
            url or RELEASES_API,
            headers={"Accept": "application/vnd.github+json",
                     "User-Agent": "idm-gui"},
        )
        with urllib.request.urlopen(req, timeout=10) as resp:
            data = json.loads(resp.read() or b"{}")
        tag = (data.get("tag_name") or "").strip()
        return (tag, "") if tag else ("", "no release found")
    except Exception as e:  # noqa: BLE001
        return "", str(e)


def _default_opener() -> str:
    """The command this platform uses to open a file with its own app."""
    if os.name == "nt":
        return "start"
    for candidate in ("xdg-open", "open"):
        if shutil.which(candidate):
            return candidate
    return ""


def open_argv(path: str, opener: str | None = None) -> list:
    """Argv that opens `path` in the system's default application."""
    opener = _default_opener() if opener is None else opener
    if not opener or not path:
        return []
    return [opener, path]


def reveal_argv(path: str, opener: str | None = None) -> list:
    """Argv that opens the folder *containing* `path`."""
    opener = _default_opener() if opener is None else opener
    if not opener or not path:
        return []
    return [opener, os.path.dirname(path) or "."]


def _run_detached(argv: list) -> bool:
    """Start argv without blocking the Tk loop. False when it cannot run."""
    if not argv:
        return False
    if os.name == "nt" and argv[0] == "start":
        try:
            os.startfile(argv[1])  # noqa: S606  (the platform opener)
            return True
        except Exception:  # noqa: BLE001
            return False
    try:
        subprocess.Popen(argv, stdout=subprocess.DEVNULL, stderr=subprocess.DEVNULL)
        return True
    except Exception:  # noqa: BLE001
        return False


def open_path(path: str) -> bool:
    """Open a downloaded file in the system's default application."""
    return _run_detached(open_argv(path))


def reveal_path(path: str) -> bool:
    """Open the folder containing a downloaded file."""
    return _run_detached(reveal_argv(path))


def _version_tuple(v: str):
    """(1, 2, 3) from "v1.2.3". None when it is not a version at all."""
    v = (v or "").strip().lstrip("vV")
    parts = v.split(".")
    try:
        return tuple(int(p) for p in parts) if parts and parts[0] != "" else None
    except ValueError:
        return None


def is_newer_version(candidate: str, current: str) -> bool:
    """Is `candidate` a strictly newer release than `current`?

    Compared field by field as numbers: "0.1.10" is newer than "0.1.4", which
    a plain string comparison gets backwards.
    """
    a, b = _version_tuple(candidate), _version_tuple(current)
    if a is None or b is None:
        return False
    length = max(len(a), len(b))
    a += (0,) * (length - len(a))
    b += (0,) * (length - len(b))
    return a > b


def play_sound(path: str) -> bool:
    """Best-effort playback of a notification sound.

    Tk has no audio, so we hand the file to whatever the platform ships
    (winsound on Windows, one of the usual CLI players elsewhere). Returns
    True when a player was started; failures are never fatal.
    """
    if not path or not os.path.isfile(path):
        return False
    if os.name == "nt":
        try:
            import winsound
            winsound.PlaySound(path, winsound.SND_FILENAME | winsound.SND_ASYNC)
            return True
        except Exception:  # noqa: BLE001
            return False
    for player in ("paplay", "aplay", "ffplay", "afplay"):
        exe = shutil.which(player)
        if not exe:
            continue
        args = [exe, path]
        if player == "ffplay":
            args = [exe, "-nodisp", "-autoexit", "-loglevel", "quiet", path]
        try:
            subprocess.Popen(args, stdout=subprocess.DEVNULL,
                             stderr=subprocess.DEVNULL)
            return True
        except Exception:  # noqa: BLE001
            continue
    return False


def settings_path(state_dir: str) -> str:
    return os.path.join(state_dir or ".", "settings.json")


def _deep_merge(base: dict, over: dict) -> dict:
    """Recursively overlay `over` on top of `base` (returns a new dict)."""
    out = dict(base)
    for k, v in (over or {}).items():
        if isinstance(v, dict) and isinstance(out.get(k), dict):
            out[k] = _deep_merge(out[k], v)
        else:
            out[k] = v
    return out


def load_settings(state_dir: str) -> dict:
    """Load settings.json, merged over the defaults (never fails)."""
    try:
        with open(settings_path(state_dir), encoding="utf-8") as f:
            return _deep_merge(DEFAULT_SETTINGS, json.load(f))
    except Exception:  # noqa: BLE001
        return _deep_merge(DEFAULT_SETTINGS, {})


def redact_options(options: dict) -> dict:
    """A copy of the engine options with the passwords taken out.

    For printing only -- the selftest hooks dump the whole dict to stdout, and
    `auth` carries the user's server password. The user part is kept, so a
    "which login did this host get" question stays answerable; an empty value
    is left empty, because "no login for this host" is a thing worth testing.
    """
    out = dict(options or {})
    auth = out.get("auth") or ""
    if ":" in auth:
        user, _, _pw = auth.partition(":")
        out["auth"] = user + ":<redacted>"
    proxy = out.get("proxy") or ""
    if "@" in proxy:
        head, _, rest = proxy.partition("//")
        userinfo, _, host = rest.rpartition("@")
        if userinfo:
            user, sep, _pw = userinfo.partition(":")
            userinfo = user + ":<redacted>" if sep else user
            out["proxy"] = head + "//" + userinfo + "@" + host
    return out


def save_settings(state_dir: str, settings: dict) -> None:
    """Atomically write settings.json under STATE_DIR."""
    if not state_dir:
        return
    os.makedirs(state_dir, exist_ok=True)
    path = settings_path(state_dir)
    tmp = path + ".tmp"
    # 0600 on the temp file, before anything is in it: site_logins hold server
    # passwords, and os.replace carries the mode over, so the finished file is
    # never briefly world-readable. Windows has no modes; there the file
    # inherits the per-user ACL of %LOCALAPPDATA%.
    flags = os.O_CREAT | os.O_WRONLY | os.O_TRUNC
    fd = os.open(tmp, flags, 0o600)
    with os.fdopen(fd, "w", encoding="utf-8") as f:
        json.dump(settings, f, indent=2, ensure_ascii=False)
    os.replace(tmp, path)


# Categories that always exist in the tree and cannot be deleted.
BUILTIN_CATEGORIES = [
    "All Downloads", "Compressed", "Documents", "Music", "Programs",
    "Video", "Unfinished", "Finished", "Grabber projects", "Queues",
]
PROTECTED_CATEGORIES = {"All Downloads", "Unfinished", "Finished",
                        "Grabber projects", "Queues"}


def list_categories(settings: dict) -> list:
    """Built-in categories plus any custom ones from settings (no dups)."""
    cats = list(BUILTIN_CATEGORIES)
    for c in (settings or {}).get("categories", []):
        name = (c or {}).get("name")
        if name and name not in cats:
            cats.append(name)
    return cats


def _find_category(settings: dict, name: str):
    for c in (settings or {}).get("categories", []):
        if (c or {}).get("name") == name:
            return c
    return None


def _upsert_category(settings: dict, entry: dict, old_name: str = None) -> dict:
    """Add or edit a custom category, returning a new settings dict."""
    out = _deep_merge(DEFAULT_SETTINGS, settings or {})
    cats = [c for c in out.get("categories", [])
            if (c or {}).get("name") not in (entry["name"], old_name)]
    cats.append(entry)
    out["categories"] = cats
    return out


def _delete_category(settings: dict, name: str) -> dict:
    out = _deep_merge(DEFAULT_SETTINGS, settings or {})
    out["categories"] = [c for c in out.get("categories", [])
                         if (c or {}).get("name") != name]
    return out


# --- Options list sections ------------------------------------------------
#
# site_logins is a LIST of records, and connection.exceptions / sounds.events /
# save_to.category_dirs are keyed collections. The Options dialog used to bind
# them as dotted keys ("site_logins.url"), which collect() turned into
# list.setdefault() -> AttributeError -> silently dropped. They get real
# helpers instead, so the dialog edits the same shape that is persisted.


def _upsert_site_login(settings: dict, url: str, user: str, password: str,
                       password_ref: str = "") -> dict:
    """Add or replace the login for `url` (one record per URL).

    With a `password_ref` the plaintext key is left out entirely rather than
    written empty: `"password": ""` is a legitimate "no password set" and must
    not be confused with "the password is in the vault".
    """
    out = _deep_merge(DEFAULT_SETTINGS, settings or {})
    url = (url or "").strip()
    if not url:
        return out
    logins = [x for x in out.get("site_logins", [])
              if (x or {}).get("url") != url]
    rec = {"url": url, "user": user or ""}
    if password_ref:
        rec["password_ref"] = password_ref
    else:
        rec["password"] = password or ""
    logins.append(rec)
    out["site_logins"] = logins
    return out


def migrate_site_logins(settings: dict, store) -> dict:
    """Move plaintext site-login passwords into the vault.

    `store` is a callable taking the password and returning a `secret:<id>`
    reference, or "" if it could not be stored -- `Api.store_password` in the
    window, a stub in the tests.

    Three rules, all of them about not losing a password:
      * a record that already has a `password_ref` is left alone, so this does
        not re-send anything on every save;
      * `"password": ""` means "no password set", which is not a password to
        migrate;
      * a refusal from the engine leaves the plaintext exactly where it was.
        It will be tried again on the next save.
    """
    out = _deep_merge(DEFAULT_SETTINGS, settings or {})
    logins = []
    for rec in out.get("site_logins", []):
        rec = dict(rec or {})
        password = str(rec.get("password") or "")
        if rec.get("password_ref") or not password:
            logins.append(rec)
            continue
        try:
            ref = store(password)
        except Exception:  # noqa: BLE001
            ref = ""
        if ref:
            rec["password_ref"] = ref
            # Removed, not emptied: an empty password is a legitimate value
            # and must not be mistaken for "already migrated".
            rec.pop("password", None)
        logins.append(rec)
    out["site_logins"] = logins
    return out


def _delete_site_login(settings: dict, url: str) -> dict:
    out = _deep_merge(DEFAULT_SETTINGS, settings or {})
    out["site_logins"] = [x for x in out.get("site_logins", [])
                          if (x or {}).get("url") != url]
    return out


def _find_site_login(settings: dict, url: str):
    for x in (settings or {}).get("site_logins", []):
        if (x or {}).get("url") == url:
            return x
    return None


def _upsert_exception(settings: dict, server: str, connections) -> dict:
    """Add or replace the per-server connection limit for `server`."""
    out = _deep_merge(DEFAULT_SETTINGS, settings or {})
    server = (server or "").strip()
    if not server:
        return out
    try:
        n = int(connections)
    except (TypeError, ValueError):
        return out
    excs = [e for e in out["connection"].get("exceptions", [])
            if (e or {}).get("server") != server]
    excs.append({"server": server, "connections": n})
    out["connection"]["exceptions"] = excs
    return out


def _delete_exception(settings: dict, server: str) -> dict:
    out = _deep_merge(DEFAULT_SETTINGS, settings or {})
    out["connection"]["exceptions"] = [
        e for e in out["connection"].get("exceptions", [])
        if (e or {}).get("server") != server
    ]
    return out


def _set_category_dir(settings: dict, category: str, directory: str) -> dict:
    """Point a category at its own download directory ("" clears it)."""
    out = _deep_merge(DEFAULT_SETTINGS, settings or {})
    category = (category or "").strip()
    if not category:
        return out
    dirs = dict(out["save_to"].get("category_dirs", {}))
    if directory:
        dirs[category] = directory
    else:
        dirs.pop(category, None)
    out["save_to"]["category_dirs"] = dirs
    return out


def _set_sound_event(settings: dict, event: str, path: str) -> dict:
    """Bind a sound file to one of SOUND_EVENTS ("" unbinds it)."""
    out = _deep_merge(DEFAULT_SETTINGS, settings or {})
    event = (event or "").strip()
    if not event:
        return out
    events = dict(out["sounds"].get("events", {}))
    if path:
        events[event] = path
    else:
        events.pop(event, None)
    out["sounds"]["events"] = events
    return out


def host_of(url: str) -> str:
    """Host name of a URL, without the port ("" when it has none)."""
    try:
        return (urllib.parse.urlsplit(url).hostname or "").lower()
    except Exception:  # noqa: BLE001
        return ""


def quota_to_rate(mb: int, hours: int) -> int:
    """Bytes/second that spends `mb` megabytes over `hours` hours.

    The Connection tab expresses the cap as a quota, but the engine only
    speaks --limit-rate, so the quota has to be converted. 0 means unlimited.
    """
    try:
        mb, hours = int(mb), int(hours)
    except (TypeError, ValueError):
        return 0
    if mb <= 0 or hours <= 0:
        return 0
    return int(mb * 1024 * 1024 / (hours * 3600))


def proxy_with_credentials(proxy: str, user: str, password: str) -> str:
    """Put user:password into a proxy URL, percent-encoding both.

    The engine takes a single proxy URL, so this is where the Proxy tab's
    "proxy requires authorization" fields actually go.
    """
    proxy = (proxy or "").strip()
    if not proxy or not user:
        return proxy
    try:
        parts = urllib.parse.urlsplit(proxy)
    except Exception:  # noqa: BLE001
        return proxy
    if not parts.netloc:
        return proxy
    cred = urllib.parse.quote(user, safe="")
    if password:
        cred += ":" + urllib.parse.quote(password, safe="")
    host = parts.netloc.rsplit("@", 1)[-1]  # drop credentials already there
    return urllib.parse.urlunsplit(
        (parts.scheme, f"{cred}@{host}", parts.path, parts.query, parts.fragment))


def site_login_for(settings: dict, url: str) -> tuple:
    """(user, password_ref, password) for the login covering `url`.

    Three parts rather than "user:password": a password containing a colon
    makes the composite ambiguous, and the password itself is usually not here
    any more -- `password_ref` points into the engine's vault.

    Both shapes are accepted, because a settings.json written by an older
    build still holds plaintext. A record carrying both is a half-finished
    migration: the reference wins and the stale plaintext is ignored.

    Matching is by host, so a login never leaks to a different server, and the
    longest matching path wins when one host has several entries.
    """
    empty = ("", "", "")
    host = host_of(url)
    if not host:
        return empty
    try:
        path = urllib.parse.urlsplit(url).path or "/"
    except Exception:  # noqa: BLE001
        return empty
    best, best_len = None, -1
    for rec in (settings or {}).get("site_logins", []):
        rec_url = (rec or {}).get("url", "")
        if host_of(rec_url) != host:
            continue
        try:
            rec_path = urllib.parse.urlsplit(rec_url).path or "/"
        except Exception:  # noqa: BLE001
            continue
        if path.startswith(rec_path) and len(rec_path) > best_len:
            best, best_len = rec, len(rec_path)
    if not best or not best.get("user"):
        return empty
    ref = str(best.get("password_ref") or "")
    if ref:
        return (best.get("user", ""), ref, "")
    return (best.get("user", ""), "", str(best.get("password") or ""))


def dialog_prefs(settings: dict) -> dict:
    """Which dialogs the Downloads tab wants shown."""
    s = _deep_merge(DEFAULT_SETTINGS, settings or {})
    d = s["downloads"]
    return {
        "show_start": bool(d.get("show_start_dialog")),
        "show_complete": bool(d.get("show_complete_dialog")),
        "start_immediately": bool(d.get("start_immediately")),
        # "normal" / "minimized" show the graph; "don't show" suppresses it.
        "show_progress": d.get("show_progress", "normal") != "don't show",
        "progress_minimized": d.get("show_progress") == "minimized",
    }


def download_options(settings: dict, url: str, fallback_dir: str = "") -> dict:
    """The engine options a download of `url` must run with.

    This is where the Options dialog stops being decoration: every value here
    comes from settings.json and is sent to `/api/add`, which passes it on to
    the engine.

      connections  connection.max_connections, overridden by the per-server
                   exception for this URL's host
      out_dir      save_to.category_dirs[category] for this URL's category,
                   else save_to.default_dir, else `fallback_dir`
      user_agent   downloads.user_agent
      proxy        proxy.socks preferred over proxy.http/https; empty when
                   proxy.use_system is on (then the engine/browser decides) or
                   when the host is in proxy.no_proxy
    """
    s = _deep_merge(DEFAULT_SETTINGS, settings or {})
    host = host_of(url)

    conns = int(s["connection"].get("max_connections") or 1)
    for e in s["connection"].get("exceptions", []):
        if (e or {}).get("server", "").strip().lower() == host and host:
            try:
                conns = int(e["connections"])
            except (KeyError, TypeError, ValueError):
                pass
            break

    cat = category_of(url)
    out_dir = (s["save_to"].get("category_dirs", {}).get(cat)
               or s["save_to"].get("default_dir")
               or fallback_dir
               or "")

    proxy = ""
    if not s["proxy"].get("use_system"):
        proxy = (s["proxy"].get("socks") or s["proxy"].get("http")
                 or s["proxy"].get("https") or "")
        for skip in s["proxy"].get("no_proxy", []):
            skip = (skip or "").strip().lower().lstrip(".")
            if skip and host and (host == skip or host.endswith("." + skip)):
                proxy = ""
                break
        if proxy and s["proxy"].get("proxy_auth"):
            proxy = proxy_with_credentials(proxy,
                                           s["proxy"].get("proxy_user", ""),
                                           s["proxy"].get("proxy_pass", ""))

    limit_rate = 0
    if s["connection"].get("download_limits"):
        limit_rate = quota_to_rate(s["connection"].get("limit_amount_mb"),
                                   s["connection"].get("limit_period_h"))

    auth_user, auth_ref, auth_pw = site_login_for(s, url)

    return {
        "connections": max(1, conns),
        "out_dir": out_dir,
        "user_agent": s["downloads"].get("user_agent") or "",
        "proxy": proxy,
        # Opt-in only (Options, downloads.cookies_from_browser). Chrome's stored
        # YouTube cookies are often rotated, and sending them turns a request
        # that works anonymously into a bot check.
        "cookies_from_browser": (s["downloads"].get("cookies_from_browser") or "").strip(),
        "limit_rate": limit_rate,
        # The engine takes auth_user + auth_password_ref and unlocks the
        # password itself. `auth` is only still filled for a login that has
        # not been migrated yet; the engine stores it in the vault on arrival.
        "auth": ("%s:%s" % (auth_user, auth_pw)) if auth_pw else "",
        "auth_user": auth_user,
        "auth_password_ref": auth_ref,
        "ignore_mtime": bool(s["downloads"].get("ignore_mtime")),
        # How many times the engine may retry this file. The Scheduler keeps
        # it per queue; a manually added download lands in the main one.
        "retries": int(queue_schedule(s, DEFAULT_QUEUE_NAMES[0])["retries"]),
    }


# --- IDM-style command line -----------------------------------------------
#
# The real IDM can be driven from a shell: a URL plus a target directory and
# file name, and flags for queueing it, starting the queue, staying quiet and
# what to do when the download is done. main() knew only its own switches, so
# none of this worked.

# switch -> the field it fills. A value-taking switch consumes the next
# argument; the rest are plain flags.
_CMDLINE_VALUES = {"d": "url", "p": "path", "f": "filename"}
_CMDLINE_FLAGS = {
    "a": "queue_only",       # add to the queue without starting it
    "s": "start_queue",      # start the queue
    "q": "exit_when_done",   # quit once the download succeeds
    "h": "hang_up",          # hang up the connection when done
    "n": "silent",           # do not ask anything, take the defaults
}


def _is_cmdline_switch(arg: str) -> bool:
    """Does `arg` name one of IDM's switches?

    Checked by name rather than by a leading slash: /downloads is a path on
    Linux, not a switch.
    """
    arg = str(arg)
    if not arg.startswith("/") or len(arg) < 2:
        return False
    name = arg[1:].partition("=")[0].lower()
    return name in _CMDLINE_VALUES or name in _CMDLINE_FLAGS


def parse_idm_argv(argv: list) -> dict:
    """IDM's command-line parameters from a raw argv list.

    Accepts "/d URL", "/d=URL" and a bare URL (what a file association or a
    drop onto the executable passes). `recognised` says whether anything
    IDM-shaped was found at all -- with nothing, the GUI just opens.

    A switch whose value is missing is left empty rather than swallowing the
    next switch, so "/p /d URL" still downloads the URL. "Is the next argument
    a switch?" is decided by whether it names a KNOWN switch, not by a leading
    slash -- on Linux an absolute path like /downloads starts with one too.
    """
    out = {"url": "", "path": "", "filename": "", "recognised": False,
           "rest": []}
    out.update({field: False for field in _CMDLINE_FLAGS.values()})

    args = list(argv or [])
    i = 0
    while i < len(args):
        arg = str(args[i])
        i += 1
        if arg.startswith("/") and len(arg) > 1:
            body = arg[1:]
            name, _, inline = body.partition("=")
            name = name.lower()
            if name in _CMDLINE_VALUES:
                field = _CMDLINE_VALUES[name]
                if inline:
                    out[field] = inline
                    out["recognised"] = True
                elif i < len(args) and not _is_cmdline_switch(args[i]):
                    out[field] = str(args[i])
                    i += 1
                    out["recognised"] = True
                # else: missing value -> leave it empty, keep parsing
                continue
            if name in _CMDLINE_FLAGS:
                out[_CMDLINE_FLAGS[name]] = True
                out["recognised"] = True
                continue
            # An unknown /switch is not ours; pass it on.
            out["rest"].append(arg)
            continue
        # Anything else belongs to our own argparse, not to IDM.
        out["rest"].append(arg)

    # A bare URL is the file-association / drop-onto-the-executable case, which
    # passes exactly one argument. Accepting it in any longer argv would steal
    # the value of our own switches (e.g. `--url URL` for the selftests).
    if not out["recognised"] and len(args) == 1 and looks_like_url(str(args[0])):
        out["url"] = str(args[0])
        out["recognised"] = True
        out["rest"] = []
    return out


# --- queues as a real thing -----------------------------------------------
#
# Queues were two hard-coded strings and _queue_all() resumed or paused
# everything, so the Schedule tab had nothing to schedule. The schedule lives
# here (settings.json) and a tick drives the existing pause/resume API; the
# engine only has to record which queue an item is in.

# A download that never got a queue belongs to the main one, as in IDM.
DEFAULT_QUEUE = ""


def queue_should_run(schedule: dict, now_hms) -> bool:
    """Is `now_hms` inside this queue's start..stop window?

    The window is half-open (start included, stop excluded) and may cross
    midnight -- IDM's own default is 23:00 to 07:30, which a plain
    start <= now < stop would never match. Equal start and stop means the
    queue is never started by the schedule, rather than always.
    """
    start = parse_clock((schedule or {}).get("start_at", ""))
    stop = parse_clock((schedule or {}).get("stop_at", ""))
    if start is None or stop is None or start == stop:
        return False
    try:
        now = tuple(now_hms)
    except TypeError:
        return False
    if start < stop:
        return start <= now < stop
    # Crosses midnight: inside if after the start OR before the stop.
    return now >= start or now < stop


def items_in_queue(items: list, queue: str) -> list:
    """The downloads assigned to one queue (an empty name = the main queue)."""
    want = (queue or DEFAULT_QUEUE).strip()
    return [it for it in (items or [])
            if (it.get("queue") or DEFAULT_QUEUE).strip() == want]


def queue_actions(items: list, queue: str, start: bool) -> dict:
    """Which ids to resume and which to pause to start or stop a queue.

    Starting skips what is finished or already in flight; stopping only
    touches what is actually running. Items in other queues are never
    touched -- that was the bug in _queue_all().
    """
    mine = items_in_queue(items, queue)
    if start:
        return {
            "resume": [it["id"] for it in mine
                       if it.get("status") not in ("done", "running", "pending")],
            "pause": [],
        }
    return {
        "resume": [],
        "pause": [it["id"] for it in mine
                  if it.get("status") in ("running", "pending")],
    }


def schedule_transitions(settings: dict, state: dict, now_hms) -> list:
    """[(queue, should_run)] for the queues whose window just opened or closed.

    `state` is the caller's memory of each queue's last known state and is
    updated in place. Only transitions are reported: a tick that finds nothing
    changed returns nothing, so the window does not re-resume a whole queue
    every few seconds. A queue whose schedule is empty or unparseable is left
    under manual control and never appears here.
    """
    changed = []
    for q in (settings or {}).get("queues", []):
        name = (q or {}).get("name")
        if not name:
            continue
        if parse_clock(q.get("start_at", "")) is None \
                or parse_clock(q.get("stop_at", "")) is None:
            continue
        want = queue_should_run(q, now_hms)
        if state.get(name) != want:
            # The very first tick only records; it must not fire a stop for a
            # queue that was never started.
            if name in state or want:
                changed.append((name, want))
            state[name] = want
    return changed


def queue_names(settings: dict) -> list:
    """Every queue the user has: the built-in ones plus any scheduled extras."""
    names = list(DEFAULT_QUEUE_NAMES)
    for q in (settings or {}).get("queues", []):
        name = (q or {}).get("name")
        if name and name not in names:
            names.append(name)
    return names


# --- the main list: filtering and sorting ---------------------------------
#
# The left tree, the Search box and the column headings were all inert: the
# headings had no command, the Search entry was never bound, and the selected
# category only ever fed the category editor. These two functions are what
# the window drives them with.

# Sort key per column -> how to read a comparable value off an item. Size and
# speed must compare as numbers: the cell shows "39.1 KB", and sorting that
# text puts 2000 before 300.
_SORT_KEYS = {
    "name": lambda it: item_name(it).lower(),
    "size": lambda it: int(it.get("total") or 0),
    "status": lambda it: str(it.get("status", "")).lower(),
    "progress": lambda it: (1.0 if it.get("status") == "done" else
                            (it.get("downloaded") or 0) / (it.get("total") or 1)),
    "speed": lambda it: float(it.get("speed_bps") or 0),
    "eta": lambda it: float(it.get("time_left_s") or 0),
    "queue": lambda it: str(it.get("status", "")) in ("running", "pending"),
    "url": lambda it: str(it.get("url", "")).lower(),
    "category": lambda it: item_category({}, it.get("url", "")).lower(),
    "description": lambda it: str(it.get("description") or "").lower(),
}


def item_category(settings: dict, url: str) -> str:
    """Which category a URL belongs to, custom categories taking precedence."""
    name = basename(url).lower()
    ext = name.rsplit(".", 1)[-1] if "." in name else ""
    for c in (settings or {}).get("categories", []):
        exts = [str(e).lower().lstrip(".") for e in (c or {}).get("extensions", [])]
        if ext and ext in exts:
            return c.get("name", "")
    return category_of(url)


def filter_items(items: list, category: str, query: str, settings: dict) -> list:
    """The rows the list should show for a tree selection and a search string.

    Category and search narrow the list together: picking Video and typing a
    PDF's name shows nothing, rather than one overriding the other.
    """
    category = (category or "All Downloads").strip()
    needle = (query or "").strip().lower()
    out = []
    for it in items or []:
        url = it.get("url", "")
        status = it.get("status", "")
        if category in ("", "All Downloads"):
            keep = True
        elif category == "Finished":
            keep = status == "done"
        elif category == "Unfinished":
            keep = status != "done"
        elif category in ("Queues", "Grabber projects"):
            # Not per-file categories: these nodes hold their own objects.
            keep = False
        else:
            keep = item_category(settings, url) == category
        if keep and needle and needle not in basename(url).lower():
            keep = False
        if keep:
            out.append(it)
    return out


def sort_items(items: list, key: str, reverse: bool = False) -> list:
    """Sort the list by a column. An unknown column leaves the order alone."""
    getter = _SORT_KEYS.get(key)
    if getter is None:
        return list(items or [])
    return sorted(items or [], key=getter, reverse=bool(reverse))


# --- what happens when a download finishes --------------------------------
#
# The queue API only reports a snapshot, so the window has to spot the
# transition itself. Without this, nothing noticed a download reaching "done"
# and the Download Complete dialog, the sounds and the virus check were all
# unreachable.

TERMINAL_STATES = ("done", "error", "paused")


def just_completed(seen: dict, items: list) -> list:
    """Ids that moved to "done" since the last snapshot.

    `seen` is the caller's memory of the last status per id and is updated in
    place. An item that is already "done" the first time we see it does NOT
    count: otherwise every restart would replay a dialog per finished file.
    """
    done = []
    for it in items or []:
        try:
            i = int(it["id"])
        except (KeyError, TypeError, ValueError):
            continue
        status = it.get("status", "")
        was = seen.get(i)
        if status == "done" and was is not None and was != "done":
            done.append(i)
        seen[i] = status
    # Forget items that have left the queue, so a re-added id works again.
    live = {int(it["id"]) for it in (items or []) if str(it.get("id", "")).isdigit()}
    for i in list(seen):
        if i not in live:
            del seen[i]
    return done


def virus_scan_argv(checker: str, params: str, path: str) -> list:
    """Argv for the virus checker. "[File]" is IDM's placeholder for the file.

    With no placeholder the path is appended, so a checker configured without
    one still scans something instead of running on nothing.
    """
    checker = (checker or "").strip()
    if not checker or not path:
        return []
    argv = [checker]
    parts = (params or "").split()
    if any("[File]" in x for x in parts):
        argv += [x.replace("[File]", path) for x in parts]
    else:
        argv += parts + [path]
    return argv


def completion_plan(settings: dict, path: str) -> dict:
    """What to do for a download that just finished, per the Options dialog."""
    s = _deep_merge(DEFAULT_SETTINGS, settings or {})
    sound = ""
    if s["sounds"].get("enabled"):
        sound = s["sounds"].get("events", {}).get("Download complete", "") or ""
    return {
        "show_dialog": bool(s["downloads"].get("show_complete_dialog")),
        "sound": sound,
        "virus_argv": virus_scan_argv(s["downloads"].get("virus_checker", ""),
                                      s["downloads"].get("virus_params", ""),
                                      path),
    }


# --- queue schedules (Scheduler dialog) -----------------------------------
#
# The Schedule tab used to be plain widgets: no variables, no persistence and
# an "Apply" button with no command, so nothing the user typed survived the
# dialog closing. Each queue now keeps its own schedule in settings.json.

DEFAULT_QUEUE_NAMES = ["Main download queue", "Synchronization queue"]

DEFAULT_SCHEDULE = {
    "start_at": "23:00:00",
    "stop_at": "07:30:00",
    "retries": 10,
    "open_when_done": "",
    "hang_up_when_done": False,
    "exit_when_done": False,
    "shutdown_when_done": False,
}


def parse_clock(text: str):
    """(hour, minute, second) from "23:00:00", "7:30" or "7". None if invalid.

    Out-of-range fields are rejected rather than clamped, so a typo is refused
    instead of silently becoming a different time.
    """
    parts = (text or "").strip().split(":")
    if not parts or parts == [""] or len(parts) > 3:
        return None
    try:
        nums = [int(p) for p in parts]
    except ValueError:
        return None
    while len(nums) < 3:
        nums.append(0)
    h, m, sec = nums
    if not (0 <= h <= 23 and 0 <= m <= 59 and 0 <= sec <= 59):
        return None
    return (h, m, sec)


def fmt_clock(hms) -> str:
    """"23:00:00" from (23, 0, 0)."""
    h, m, sec = hms
    return f"{h:02d}:{m:02d}:{sec:02d}"


def queue_schedule(settings: dict, name: str) -> dict:
    """The schedule for one queue, with the defaults filled in."""
    out = dict(DEFAULT_SCHEDULE)
    for q in (settings or {}).get("queues", []):
        if (q or {}).get("name") == name:
            for k in DEFAULT_SCHEDULE:
                if k in q:
                    out[k] = q[k]
            break
    out["name"] = name
    return out


def set_queue_schedule(settings: dict, name: str, sched: dict) -> dict:
    """Store one queue's schedule, leaving the other queues untouched.

    An unparseable time is dropped rather than persisted, so a typo cannot
    turn into a schedule that never fires.
    """
    out = _deep_merge(DEFAULT_SETTINGS, settings or {})
    entry = queue_schedule(out, name)
    for key, value in (sched or {}).items():
        if key not in DEFAULT_SCHEDULE:
            continue
        if key in ("start_at", "stop_at"):
            hms = parse_clock(value)
            if hms is None:
                continue
            entry[key] = fmt_clock(hms)
        elif key == "retries":
            try:
                entry[key] = max(0, int(value))
            except (TypeError, ValueError):
                continue
        elif key == "open_when_done":
            entry[key] = str(value or "")
        else:
            entry[key] = bool(value)
    entry["name"] = name
    queues = [q for q in out.get("queues", []) if (q or {}).get("name") != name]
    queues.append(entry)
    out["queues"] = queues
    return out


def _dialog_category(parent, settings=None):
    """IDM 'Edit categories properties' dialog (Add/Edit a category).

    Mirrors docs/idm/using_idm_using_idm.txt: a name, the associated file
    extensions, the default download directory, and optional site filters.
    Returns (window, getter) where getter() -> dict or None.
    """
    import tkinter as tk
    from tkinter import ttk, filedialog

    s = _deep_merge(DEFAULT_SETTINGS, settings or {})
    win = themed_toplevel(parent)
    win.title("Edit category")
    win.geometry("480x300")

    ttk.Label(win, text="Category name:").grid(row=0, column=0, sticky="w", padx=10, pady=6)
    name = ttk.Entry(win, width=40)
    name.grid(row=0, column=1, padx=10, pady=6)

    ttk.Label(win, text="File extensions (space separated):").grid(
        row=1, column=0, sticky="w", padx=10, pady=6)
    exts = ttk.Entry(win, width=40)
    exts.grid(row=1, column=1, padx=10, pady=6)

    ttk.Label(win, text="Default download directory:").grid(
        row=2, column=0, sticky="w", padx=10, pady=6)
    row2 = ttk.Frame(win)
    row2.grid(row=2, column=1, sticky="ew", padx=10, pady=6)
    folder = ttk.Entry(row2, width=30)
    folder.pack(side="left", fill="x", expand=True)

    def pick():
        d = filedialog.askdirectory(parent=win)
        if d:
            folder.delete(0, "end")
            folder.insert(0, d)

    ttk.Button(row2, text="Browse...", command=pick).pack(side="left", padx=4)

    ttk.Label(win, text="Only from sites (space separated, optional):").grid(
        row=3, column=0, sticky="w", padx=10, pady=6)
    sites = ttk.Entry(win, width=40)
    sites.grid(row=3, column=1, padx=10, pady=6)

    result = {"value": None}

    def ok():
        n = name.get().strip()
        if not n:
            return
        result["value"] = {
            "name": n,
            "extensions": exts.get().split(),
            "dir": folder.get().strip(),
            "sites": sites.get().split(),
        }
        win.destroy()

    bar = ttk.Frame(win)
    bar.grid(row=4, column=0, columnspan=2, sticky="e", padx=10, pady=10)
    ttk.Button(bar, text="OK", command=ok).pack(side="right", padx=4)
    ttk.Button(bar, text="Cancel", command=win.destroy).pack(side="right", padx=4)

    def getter():
        return result["value"]

    return win, getter


def looks_like_url(text: str) -> bool:
    """True for http(s)/ftp URLs, the ones IDM picks up from the clipboard."""
    t = (text or "").strip()
    if not t or any(ch in t for ch in ("\n", "\r", " ")):
        return False
    return t.lower().startswith(("http://", "https://", "ftp://"))


def extract_urls(text: str) -> list:
    """Every downloadable URL in a blob of text, in order, without duplicates.

    This is what "add a batch of URLs from the clipboard" runs on: people copy
    a whole paragraph, a list of links or a few lines out of a page, so we pick
    the tokens apart, drop the punctuation that surrounds a link in running
    text, and keep only the schemes the engine can fetch. A scheme with no
    host after it (a bare "http://") is not a URL.
    """
    import re

    out: list = []
    seen = set()
    for token in re.split(r"[\s<>\"'|]+", text or ""):
        t = token.strip().strip("()[]{}<>\"',;:!?.")
        low = t.lower()
        for scheme in ("http://", "https://", "ftp://"):
            if low.startswith(scheme):
                host = t[len(scheme):].split("/")[0].split("?")[0].split("#")[0]
                if host and t not in seen:
                    seen.add(t)
                    out.append(t)
                break
    return out


def _same_site(a: str, b: str) -> bool:
    try:
        from urllib.parse import urlparse
        return urlparse(a).netloc == urlparse(b).netloc
    except Exception:  # noqa: BLE001
        return False


# --------------------------------------------------------------------------- #
# Grabber project templates: each one is a named file-type filter, so picking
# "Images" explores the same site but collects only pictures. "custom" keeps
# whatever the user typed in the file-type box.
# --------------------------------------------------------------------------- #
GRABBER_CUSTOM = "custom"


def _as_int(value, fallback=0):
    """An int from a widget's string, falling back instead of raising."""
    try:
        return int(str(value).strip())
    except (TypeError, ValueError):
        return fallback

GRABBER_TEMPLATES = {
    "Images": ["bmp", "gif", "ico", "jpeg", "jpg", "png", "svg", "tif",
               "tiff", "webp"],
    "Video": ["3gp", "avi", "flv", "m4v", "mkv", "mov", "mp4", "mpeg", "mpg",
              "ts", "webm", "wmv"],
    "Audio": ["aac", "aiff", "flac", "m4a", "mp3", "oga", "ogg", "opus",
              "wav", "wma"],
    "Archives": ["7z", "ace", "arj", "bz2", "cab", "gz", "iso", "rar", "tar",
                 "tgz", "xz", "zip"],
    "Documents": ["chm", "doc", "docx", "epub", "mobi", "odp", "ods", "odt",
                  "pdf", "ppt", "pptx", "rtf", "txt", "xls", "xlsx"],
    "Programs": ["apk", "appimage", "deb", "dmg", "exe", "msi", "pkg", "rpm"],
}

# "All files" is the union of the others, so it can never be narrower than a
# template the user might switch to.
GRABBER_TEMPLATES["All files"] = sorted(
    {e for exts in GRABBER_TEMPLATES.values() for e in exts})


def grabber_template_names() -> list:
    """Template names for the Grabber's combobox, "All files" first."""
    rest = sorted(n for n in GRABBER_TEMPLATES if n != "All files")
    return ["All files"] + rest


def grabber_template_exts(name: str) -> list:
    """The file types one template collects ([] for an unknown name)."""
    return list(GRABBER_TEMPLATES.get((name or "").strip(), []))


def grabber_crawl_exts(template: str, custom_text: str) -> list:
    """What the crawl should actually collect.

    A known template wins over the file-type box; "custom" (or any name we do
    not know) falls back to whatever is typed in the box.
    """
    exts = grabber_template_exts(template)
    if exts:
        return exts
    return [e.strip().lstrip(".").lower()
            for e in (custom_text or "").replace(",", " ").split() if e.strip()]


DEFAULT_GRABBER_PROJECT = {
    "name": "",
    "start": "",
    "folder": "",
    "template": "All files",
    "exts": "",
    "same_site_only": True,
    "max_pages": 50,
    "depth": 3,
    "external_depth": 0,
    "include": "",
    "exclude": "",
    "by_category": False,
    "add_on_close": False,
}


def grabber_project(settings: dict, name: str) -> dict:
    """One saved grabber project, with the defaults filled in."""
    out = dict(DEFAULT_GRABBER_PROJECT)
    for p in (settings or {}).get("grabber_projects", []):
        if (p or {}).get("name") == name:
            for k in DEFAULT_GRABBER_PROJECT:
                if k in p:
                    out[k] = p[k]
            break
    out["name"] = name
    return out


def category_for_node(iid, text, grabber_nodes) -> str | None:
    """Which category a selected tree node stands for, if any.

    The nodes under "Grabber projects" are not categories: a saved project
    named Nightly has no matching category, so treating its selection as a
    category change emptied the list. Only the double click means anything
    there, so a plain selection of such a node points at no category.
    """
    if not iid or not text:
        return None
    if iid in (grabber_nodes or {}):
        return None
    return text


def grabber_projects(settings: dict) -> list:
    """Every saved project, by name, with the defaults filled in."""
    return [grabber_project(settings, n)
            for n in grabber_project_names(settings)]


def grabber_project_names(settings: dict) -> list:
    """The names of the saved projects, sorted as the tree shows them."""
    names = {str((p or {}).get("name", "")).strip()
             for p in (settings or {}).get("grabber_projects", [])}
    return sorted(n for n in names if n)


def save_grabber_project(settings: dict, project: dict) -> dict:
    """Store one project, leaving the others alone.

    A project without a name is dropped rather than saved: it could never be
    found again, and it would show up in the tree as a blank row.
    """
    out = _deep_merge(DEFAULT_SETTINGS, settings or {})
    name = str((project or {}).get("name", "")).strip()
    if not name:
        return out
    entry = grabber_project(out, name)
    for key, value in (project or {}).items():
        if key not in DEFAULT_GRABBER_PROJECT:
            continue
        if key in ("max_pages", "depth", "external_depth"):
            entry[key] = max(0, _as_int(value, DEFAULT_GRABBER_PROJECT[key]))
        elif key in ("same_site_only", "by_category", "add_on_close"):
            entry[key] = bool(value)
        else:
            entry[key] = str(value or "")
    entry["name"] = name
    rest = [p for p in out.get("grabber_projects", [])
            if str((p or {}).get("name", "")).strip() != name]
    out["grabber_projects"] = rest + [entry]
    return out


def delete_grabber_project(settings: dict, name: str) -> dict:
    """Forget one project."""
    out = _deep_merge(DEFAULT_SETTINGS, settings or {})
    wanted = str(name or "").strip()
    out["grabber_projects"] = [
        p for p in out.get("grabber_projects", [])
        if str((p or {}).get("name", "")).strip() != wanted]
    return out


def grabber_filter_patterns(text: str) -> list:
    """The patterns typed into one of the Grabber's filter boxes.

    Whitespace- or comma-separated, so both "a b" and "a, b" work.
    """
    raw = (text or "").replace(",", " ").split()
    return [p.strip() for p in raw if p.strip()]


def grabber_allows(url: str, include=None, exclude=None) -> bool:
    """Whether a found URL passes the include/exclude filters.

    A pattern with a wildcard is matched against the whole URL with fnmatch;
    one without is treated as a substring, which is what a user typing
    "/docs/" means. Matching is case-insensitive. An empty include list means
    "everything", and exclude always wins -- the narrower intent is the one
    worth honouring.
    """
    import fnmatch

    u = (url or "").lower()

    def hit(pattern):
        p = (pattern or "").strip().lower()
        if not p:
            return False
        if any(ch in p for ch in "*?["):
            return fnmatch.fnmatch(u, p) or fnmatch.fnmatch(u, "*" + p + "*")
        return p in u

    if any(hit(p) for p in (exclude or [])):
        return False
    inc = [p for p in (include or []) if (p or "").strip()]
    if inc and not any(hit(p) for p in inc):
        return False
    return True


def crawl_site(start_url: str, max_pages: int = 50,
               file_exts=None, same_site_only: bool = True,
               timeout: float = 8.0, should_stop=None,
               max_depth=None, external_depth=None,
               include=None, exclude=None) -> list:
    """Explore a site breadth-first and return file URLs (the IDM Grabber).

    Only HTML pages are followed; anything whose path ends in one of
    `file_exts` (or that is not an HTML page) is collected as a file. Returns a
    de-duplicated, sorted list of absolute URLs.

    `should_stop` is checked before each page: when it returns true the crawl
    returns what it has so far. Without it "Stop Exploring" is unimplementable,
    because the crawl would hold the Tk thread for its whole run.

    Link depth is counted separately for the two kinds of page, because the
    interesting limits differ: `max_depth` is how many links away from the
    start page the crawl may go on the start site (0 = the start page only),
    while `external_depth` is how many links deep it may go once it has left
    that site (0 = never open a page elsewhere). `None` means "no limit",
    which is what the crawl did before either knob existed. A file linked from
    a page that was visited is always collected -- the depth limits say which
    pages get opened, not which files count.

    `include`/`exclude` are pattern lists (see grabber_allows) applied to the
    files that would be returned, so a crawl can be narrowed to one corner of
    a site without changing the file types.
    """
    import re
    from urllib.parse import urljoin, urlparse

    exts = set(e.lower().lstrip(".") for e in (file_exts or []))
    start = start_url.strip()
    if not looks_like_url(start):
        return []
    seen_pages = set()
    found = set()
    queue = [(start, 0, 0)]   # (url, links from the start page, hops off-site)
    href_re = re.compile(r'''(?:href|src)\s*=\s*["']([^"']+)["']''', re.I)
    while queue and len(seen_pages) < max_pages:
        if should_stop is not None and should_stop():
            break
        url, own, ext_hops = queue.pop(0)
        if url in seen_pages:
            continue
        seen_pages.add(url)
        try:
            req = urllib.request.Request(url, headers={
                "User-Agent": "Mozilla/5.0 (compatible; idm-grabber/1.0)"})
            with urllib.request.urlopen(req, timeout=timeout) as resp:
                ctype = (resp.headers.get("Content-Type") or "").lower()
                if "html" not in ctype and "xml" not in ctype:
                    found.add(url)
                    continue
                body = resp.read(2_000_000).decode("utf-8", "ignore")
        except Exception:  # noqa: BLE001
            continue
        for raw in href_re.findall(body):
            link = urljoin(url, raw.strip())
            if not link.lower().startswith(("http://", "https://", "ftp://")):
                continue
            on_site = _same_site(link, start)
            if same_site_only and not on_site:
                continue
            # A link stays at the same own-site depth once the crawl is away
            # from the start site; the off-site hops are what grow there.
            link_own = own + 1 if on_site else own
            link_ext = 0 if on_site else ext_hops + 1
            too_deep = ((max_depth is not None and link_own > max_depth)
                        or (external_depth is not None
                            and link_ext > external_depth))
            path = urlparse(link).path.lower()
            ext = path.rsplit(".", 1)[-1] if "." in path else ""
            if ext in exts:
                found.add(link)
            elif ext in ("", "html", "htm", "php", "asp", "aspx", "jsp"):
                if link not in seen_pages and not too_deep:
                    queue.append((link, link_own, link_ext))
            else:
                if not exts or ext in exts:
                    found.add(link)
    return sorted(u for u in found if grabber_allows(u, include, exclude))


def _dialog_grabber(parent, api=None, state_dir="", out_dir="", project=None):
    """IDM Grabber: a 4-step wizard plus the main action dialog.

    Mirrors docs/idm/idm-grabber_grabber_wizard.txt and
    idm-grabber_grabber_main_dialog.txt. Step 1 is the start page, step 2 the
    save folder, steps 3/4 are filters; the main dialog then explores the site
    and can add the checked files to the main download list.

    The whole wizard is one named project: it can be saved to settings.json
    and opened again later, and `project` opens the dialog on a saved one.
    """
    import tkinter as tk
    from tkinter import ttk, filedialog, messagebox

    win = themed_toplevel(parent)
    win.title("IDM Grabber")
    win.geometry("720x520")

    state = {"files": [], "checked": set()}

    wiz = ttk.Notebook(win)
    wiz.pack(fill="x", padx=8, pady=8)

    s1 = ttk.Frame(wiz)
    wiz.add(s1, text="1. Start page")
    ttk.Label(s1, text="Grabber Project Name:").grid(row=0, column=0, sticky="w", padx=6, pady=4)
    proj = ttk.Combobox(
        s1, width=38, values=grabber_project_names(load_settings(state_dir)))
    proj.set("My project")
    proj.grid(row=0, column=1, padx=6, pady=4, sticky="w")
    proj_btns = ttk.Frame(s1)
    proj_btns.grid(row=0, column=2, sticky="w", padx=6)
    save_proj_btn = ttk.Button(proj_btns, text="Save Project")
    save_proj_btn.pack(side="left", padx=2)
    load_proj_btn = ttk.Button(proj_btns, text="Load Project")
    load_proj_btn.pack(side="left", padx=2)
    del_proj_btn = ttk.Button(proj_btns, text="Delete Project")
    del_proj_btn.pack(side="left", padx=2)
    ttk.Label(s1, text="Start page (URL):").grid(row=1, column=0, sticky="w", padx=6, pady=4)
    start = ttk.Entry(s1, width=50)
    start.insert(0, "https://")
    start.grid(row=1, column=1, padx=6, pady=4, sticky="w")
    ttk.Label(s1, text="Project template:").grid(row=2, column=0, sticky="w", padx=6, pady=4)
    template = ttk.Combobox(
        s1, values=grabber_template_names() + [GRABBER_CUSTOM], width=30)
    template.set("All files")
    template.grid(row=2, column=1, sticky="w", padx=6, pady=4)

    s2 = ttk.Frame(wiz)
    wiz.add(s2, text="2. Save to")
    ttk.Label(s2, text="Save files to:").grid(row=0, column=0, sticky="w", padx=6, pady=4)
    folder = ttk.Entry(s2, width=50)
    folder.insert(0, out_dir or os.path.expanduser("~/Downloads"))
    folder.grid(row=0, column=1, padx=6, pady=4, sticky="w")

    def pick():
        d = filedialog.askdirectory(parent=win)
        if d:
            folder.delete(0, "end")
            folder.insert(0, d)

    ttk.Button(s2, text="Browse...", command=pick).grid(row=0, column=2, padx=6)
    by_category = tk.BooleanVar(value=False)
    ttk.Checkbutton(s2, text="Save each file to the folder of its category",
                    variable=by_category).grid(row=1, column=1, sticky="w", padx=6)
    add_on_close = tk.BooleanVar(value=False)
    ttk.Checkbutton(s2, text="Add checked files to IDM on close",
                    variable=add_on_close).grid(row=2, column=1, sticky="w", padx=6)

    s3 = ttk.Frame(wiz)
    wiz.add(s3, text="3. Explore")
    same_site = tk.BooleanVar(value=True)
    ttk.Checkbutton(s3, text="Explore the current site only",
                    variable=same_site).grid(row=0, column=0, sticky="w", padx=6, pady=4)
    ttk.Label(s3, text="Max pages to explore:").grid(row=1, column=0, sticky="w", padx=6, pady=4)
    max_pages = ttk.Spinbox(s3, from_=1, to=1000, width=6)
    max_pages.set(50)
    max_pages.grid(row=1, column=1, sticky="w", padx=6)
    ttk.Label(s3, text="Link depth on this site (0 = start page only):").grid(
        row=2, column=0, sticky="w", padx=6, pady=4)
    depth = ttk.Spinbox(s3, from_=0, to=50, width=6)
    depth.set(3)
    depth.grid(row=2, column=1, sticky="w", padx=6)
    ttk.Label(s3, text="Link depth on other sites (0 = do not leave):").grid(
        row=3, column=0, sticky="w", padx=6, pady=4)
    external_depth = ttk.Spinbox(s3, from_=0, to=50, width=6)
    external_depth.set(0)
    external_depth.grid(row=3, column=1, sticky="w", padx=6)

    s4 = ttk.Frame(wiz)
    wiz.add(s4, text="4. Filters")
    ttk.Label(s4, text="File types to download (space separated):").grid(
        row=0, column=0, sticky="w", padx=6, pady=4)
    exts = ttk.Entry(s4, width=50)
    exts.insert(0, " ".join(grabber_template_exts("All files")))
    exts.grid(row=0, column=1, padx=6, pady=4, sticky="w")

    def on_template(_e=None):
        """Show the picked template's file types, so the filter is visible."""
        chosen = grabber_template_exts(template.get())
        if chosen:
            exts.delete(0, "end")
            exts.insert(0, " ".join(chosen))

    template.bind("<<ComboboxSelected>>", on_template)

    ttk.Label(s4, text="Only URLs matching (blank = all):").grid(
        row=1, column=0, sticky="w", padx=6, pady=4)
    include = ttk.Entry(s4, width=50)
    include.grid(row=1, column=1, padx=6, pady=4, sticky="w")
    ttk.Label(s4, text="Never URLs matching:").grid(
        row=2, column=0, sticky="w", padx=6, pady=4)
    exclude = ttk.Entry(s4, width=50)
    exclude.grid(row=2, column=1, padx=6, pady=4, sticky="w")
    ttk.Label(s4, text="(space separated; * and ? work, plain text matches "
                       "anywhere in the URL)").grid(
        row=3, column=0, columnspan=2, sticky="w", padx=6)

    main = ttk.Frame(win)
    main.pack(fill="both", expand=True, padx=8, pady=4)

    toolbar = ttk.Frame(main)
    toolbar.pack(fill="x")
    ttk.Button(toolbar, text="Start Exploring").pack(side="left", padx=2)
    ttk.Button(toolbar, text="Stop Exploring").pack(side="left", padx=2)
    ttk.Button(toolbar, text="Check All Files").pack(side="left", padx=2)
    ttk.Button(toolbar, text="Uncheck All Files").pack(side="left", padx=2)
    ttk.Button(toolbar, text="Start Downloading").pack(side="left", padx=2)
    ttk.Button(toolbar, text="Add to IDM").pack(side="left", padx=2)
    ttk.Button(toolbar, text="Statistics").pack(side="left", padx=2)

    files = ttk.Treeview(main, columns=("check", "url"), show="headings", height=12)
    files.heading("check", text="D")
    files.heading("url", text="File URL")
    files.column("check", width=30, anchor="center")
    files.column("url", width=600)
    files.pack(fill="both", expand=True)

    info = tk.StringVar(value="Ready.")
    ttk.Label(win, textvariable=info, relief="sunken", anchor="w").pack(
        fill="x", side="bottom")

    def render():
        files.delete(*files.get_children(""))
        for i, url in enumerate(state["files"]):
            mark = "x" if i in state["checked"] else ""
            files.insert("", "end", iid=str(i), values=(mark, url))
        info.set(f"{len(state['files'])} files found.")

    def toggle(_e):
        for iid in files.selection():
            i = int(iid)
            if i in state["checked"]:
                state["checked"].discard(i)
            else:
                state["checked"].add(i)
        render()

    files.bind("<Double-1>", toggle)

    def check_all():
        state["checked"] = set(range(len(state["files"])))
        render()

    def uncheck_all():
        state["checked"] = set()
        render()

    # The crawl runs off the Tk thread, so the window stays responsive and
    # "Stop Exploring" can actually be clicked mid-crawl.
    crawl = {"stop": False, "busy": False}

    def stop_exploring():
        if crawl["busy"]:
            crawl["stop"] = True
            info.set("Stopping...")

    def explore():
        url = start.get().strip()
        if not looks_like_url(url):
            messagebox.showwarning("Grabber", "Zadej platnou start URL.", parent=win)
            return
        if crawl["busy"]:
            return
        crawl["stop"] = False
        crawl["busy"] = True
        info.set("Exploring...")
        pages = int(max_pages.get() or 50)
        file_exts = grabber_crawl_exts(template.get(), exts.get())
        on_site = bool(same_site.get())
        own_depth = _as_int(depth.get(), 3)
        out_depth = _as_int(external_depth.get(), 0)
        inc = grabber_filter_patterns(include.get())
        exc = grabber_filter_patterns(exclude.get())

        def done(found, error):
            crawl["busy"] = False
            if error:
                info.set("Exploring failed.")
                messagebox.showerror("Grabber", f"Exploring failed: {error}",
                                     parent=win)
                return
            state["files"] = found
            state["checked"] = set(range(len(found)))
            render()
            if crawl["stop"]:
                info.set(f"Stopped. Found {len(found)} files so far.")

        def work():
            try:
                found = crawl_site(url, max_pages=pages, file_exts=file_exts,
                                   same_site_only=on_site,
                                   max_depth=own_depth,
                                   external_depth=out_depth,
                                   include=inc, exclude=exc,
                                   should_stop=lambda: crawl["stop"])
                err = None
            except Exception as e:  # noqa: BLE001
                found, err = [], e
            try:
                win.after(0, lambda: done(found, err))
            except Exception:  # noqa: BLE001  (dialog closed meanwhile)
                pass

        threading.Thread(target=work, daemon=True).start()

    def add_to_idm():
        if api is None:
            return 0
        added = 0
        settings = load_settings(state_dir)
        base = folder.get().strip() or out_dir
        for i in sorted(state["checked"]):
            url = state["files"][i]
            try:
                opts = download_options(settings, url, fallback_dir=base)
                if by_category.get():
                    # "the folder of its category": one subfolder per kind,
                    # under the folder this project saves to.
                    opts = dict(opts)
                    opts["out_dir"] = os.path.join(
                        base, item_category(settings, url))
                api.add(url, connections=opts["connections"], options=opts)
                added += 1
            except Exception:  # noqa: BLE001
                pass
        info.set(f"Added {added} files to IDM.")
        return added

    def on_close():
        """"Add checked files to IDM on close" -- the only chance to do it."""
        if add_on_close.get():
            add_to_idm()
        win.destroy()

    win.protocol("WM_DELETE_WINDOW", on_close)

    def stats():
        messagebox.showinfo(
            "IDM Grabber Statistics",
            f"Files found: {len(state['files'])}\n"
            f"Checked: {len(state['checked'])}\n"
            f"Start page: {start.get().strip()}\n"
            f"Save to: {folder.get().strip()}", parent=win)

    # --- the wizard as a saved project ------------------------------------
    def collect_project():
        """Everything on screen, as a project dict."""
        return {
            "name": proj.get().strip(),
            "start": start.get().strip(),
            "folder": folder.get().strip(),
            "template": template.get().strip(),
            "exts": exts.get().strip(),
            "same_site_only": bool(same_site.get()),
            "max_pages": _as_int(max_pages.get(), 50),
            "depth": _as_int(depth.get(), 3),
            "external_depth": _as_int(external_depth.get(), 0),
            "include": include.get().strip(),
            "exclude": exclude.get().strip(),
            "by_category": bool(by_category.get()),
            "add_on_close": bool(add_on_close.get()),
        }

    def _set_entry(widget, value):
        widget.delete(0, "end")
        widget.insert(0, value)

    def apply_project(p):
        """Put a saved project back on screen."""
        proj.set(p.get("name", ""))
        _set_entry(start, p.get("start", ""))
        _set_entry(folder, p.get("folder", ""))
        template.set(p.get("template", "All files"))
        # An empty stored filter means "whatever the template says".
        _set_entry(exts, p.get("exts", "")
                   or " ".join(grabber_template_exts(p.get("template", ""))))
        same_site.set(bool(p.get("same_site_only", True)))
        max_pages.set(p.get("max_pages", 50))
        depth.set(p.get("depth", 3))
        external_depth.set(p.get("external_depth", 0))
        _set_entry(include, p.get("include", ""))
        _set_entry(exclude, p.get("exclude", ""))
        by_category.set(bool(p.get("by_category", False)))
        add_on_close.set(bool(p.get("add_on_close", False)))

    def refresh_project_list():
        proj.config(values=grabber_project_names(load_settings(state_dir)))

    def save_project():
        entry = collect_project()
        if not entry["name"]:
            messagebox.showwarning("Grabber", "Pojmenuj projekt.", parent=win)
            return
        save_settings(state_dir, save_grabber_project(
            load_settings(state_dir), entry))
        refresh_project_list()
        info.set(f"Project saved: {entry['name']}")

    def load_project():
        name = proj.get().strip()
        if name not in grabber_project_names(load_settings(state_dir)):
            info.set(f"No saved project named {name!r}.")
            return
        apply_project(grabber_project(load_settings(state_dir), name))
        info.set(f"Project loaded: {name}")

    def delete_project():
        name = proj.get().strip()
        save_settings(state_dir, delete_grabber_project(
            load_settings(state_dir), name))
        refresh_project_list()
        info.set(f"Project deleted: {name}")

    save_proj_btn.config(command=save_project)
    load_proj_btn.config(command=load_project)
    del_proj_btn.config(command=delete_project)

    if project:
        apply_project(grabber_project(load_settings(state_dir), project))
        info.set(f"Project loaded: {project}")

    btns = toolbar.winfo_children()
    btns[0].config(command=explore)
    btns[1].config(command=stop_exploring)  # "Stop Exploring"
    btns[2].config(command=check_all)
    btns[3].config(command=uncheck_all)
    btns[4].config(command=add_to_idm)
    btns[5].config(command=add_to_idm)
    btns[6].config(command=stats)

    wiz.select(0)
    win._idm_grabber = {"state": state, "start": start, "render": render,
                        "template": template, "exts": exts, "explore": explore,
                        "crawl": crawl, "same_site": same_site,
                        "depth": depth, "external_depth": external_depth,
                        "include": include, "exclude": exclude,
                        "proj": proj, "folder": folder,
                        "max_pages": max_pages,
                        "save_project": save_project,
                        "load_project": load_project,
                        "delete_project": delete_project,
                        "collect_project": collect_project,
                        "by_category": by_category,
                        "add_on_close": add_on_close,
                        "add_to_idm": add_to_idm, "on_close": on_close}
    return win


# --------------------------------------------------------------------------- #
# Dialog windows (each mirrors an IDM dialog)
# --------------------------------------------------------------------------- #
def _dialog_add_url(parent):
    """IDM 'Add URL' dialog: URL box + 'Use authorization'."""
    import tkinter as tk
    from tkinter import ttk

    win = themed_toplevel(parent)
    win.title("Add URL")
    win.geometry("460x170")
    ttk.Label(win, text="URL:").grid(row=0, column=0, sticky="w", padx=8, pady=8)
    url = ttk.Entry(win, width=48)
    url.grid(row=0, column=1, padx=8, pady=8)
    auth = tk.BooleanVar(value=False)
    ttk.Checkbutton(win, text="Use authorization", variable=auth).grid(
        row=1, column=1, sticky="w", padx=8
    )
    return win, url, auth


def media_options(cookie: str, referer: str, force_media: bool) -> dict:
    """The engine options the media controls stand for, empties dropped.

    Api.add() only sends keys with a value, so leaving the three untouched has
    to produce nothing at all rather than a download carrying `cookie: ""`.
    """
    out = {}
    if (cookie or "").strip():
        out["cookie"] = cookie.strip()
    if (referer or "").strip():
        out["referer"] = referer.strip()
    if force_media:
        out["force_media"] = True
    return out


def _dialog_file_info(parent, url, folder, category, formats=None):
    """IDM 'Download File Info' dialog.

    `formats` is a list from Api.formats(); the combobox offers them and
    `win.selected_format()` returns the yt-dlp selector the user picked ("" =
    let the backend choose). With no formats the combobox still exists and
    offers only that default, so a plain file URL behaves as before.
    """
    import tkinter as tk
    from tkinter import ttk

    win = themed_toplevel(parent)
    win.title("Download File Info")
    win.geometry("520x380")
    ttk.Label(win, text="File Description:").grid(row=0, column=0, sticky="w", padx=8, pady=6)
    desc = ttk.Entry(win, width=44)
    desc.grid(row=0, column=1, padx=8, pady=6)
    ttk.Label(win, text="Save To:").grid(row=1, column=0, sticky="w", padx=8, pady=6)
    save = ttk.Entry(win, width=44)
    save.insert(0, os.path.join(folder, basename(url)))
    save.grid(row=1, column=1, padx=8, pady=6)
    ttk.Label(win, text="Category:").grid(row=2, column=0, sticky="w", padx=8, pady=6)
    cat = ttk.Combobox(win, values=[c for c in CATEGORIES if c not in ("All Downloads",)], width=30)
    cat.set(category)
    cat.grid(row=2, column=1, sticky="w", padx=8, pady=6)

    ttk.Label(win, text="Format:").grid(row=3, column=0, sticky="w", padx=8, pady=6)
    entries = format_labels(formats)
    fmt = ttk.Combobox(win, values=[e["label"] for e in entries], width=42,
                       state="readonly")
    fmt.current(0)
    fmt.grid(row=3, column=1, sticky="w", padx=8, pady=6)

    def selected_format():
        label = fmt.get()
        for e in entries:
            if e["label"] == label:
                return e["format"]
        return ""

    win.selected_format = selected_format

    # A site that only serves its media to a logged-in browser needs the
    # cookie and the page it was linked from; "Treat as media" forces the
    # yt-dlp path for a URL that does not look like one.
    ttk.Label(win, text="Cookie:").grid(row=4, column=0, sticky="w", padx=8, pady=6)
    cookie = ttk.Entry(win, width=44)
    cookie.grid(row=4, column=1, padx=8, pady=6)
    ttk.Label(win, text="Referer:").grid(row=5, column=0, sticky="w", padx=8, pady=6)
    referer = ttk.Entry(win, width=44)
    referer.grid(row=5, column=1, padx=8, pady=6)
    force = tk.BooleanVar(value=False)
    ttk.Checkbutton(win, text="Treat as media (yt-dlp)",
                    variable=force).grid(row=6, column=1, sticky="w",
                                         padx=8, pady=2)

    win.media_options = lambda: media_options(
        cookie.get(), referer.get(), bool(force.get()))

    btns = ttk.Frame(win)
    btns.grid(row=7, column=0, columnspan=2, sticky="e", padx=8, pady=10)
    start = ttk.Button(btns, text="Start Download")
    later = ttk.Button(btns, text="Download Later")
    cancel = ttk.Button(btns, text="Cancel", command=win.destroy)
    start.pack(side="left", padx=4)
    later.pack(side="left", padx=4)
    cancel.pack(side="left", padx=4)
    return win, start, later


def _dialog_options(parent, settings=None, on_save=None, state_dir="", out_dir="",
                    api=None):
    """IDM 'Options' dialog: all 9 tabs, wired to persisted settings.

    Every tab mirrors docs/idm/options.txt instead of showing only its name.
    The values live in STATE_DIR/settings.json; the ones the engine understands
    (max connections, user-agent, temp dir, proxy, ...) are used when a download
    is added. Returns (window, notebook, controls) where `controls` is the
    per-tab widget registry used by --selftest-dump.
    """
    import tkinter as tk
    from tkinter import ttk, filedialog

    s = _deep_merge(DEFAULT_SETTINGS, settings or {})
    if not s["save_to"]["default_dir"] and out_dir:
        s["save_to"]["default_dir"] = out_dir

    win = themed_toplevel(parent)
    win.title("Options")
    win.geometry("660x520")
    nb = ttk.Notebook(win)
    nb.pack(fill="both", expand=True, padx=8, pady=8)

    controls = {}
    vals = {}  # dotted key -> (tk variable, kind)

    def tab(name):
        f = ttk.Frame(nb)
        nb.add(f, text=name)
        controls[name] = {
            "labels": [], "checkboxes": [], "entries": [],
            "buttons": [], "lists": [], "combos": [],
        }
        return f

    def add_check(f, name, text, key, value):
        v = tk.BooleanVar(value=bool(value))
        vals[key] = (v, "bool")
        controls[name]["checkboxes"].append(text)
        ttk.Checkbutton(f, text=text, variable=v).pack(anchor="w", padx=10, pady=2)

    def add_row(f, name, text, key, value, browse=False, show=None):
        row = ttk.Frame(f)
        row.pack(fill="x", padx=10, pady=2)
        controls[name]["labels"].append(text)
        ttk.Label(row, text=text).pack(side="left")
        v = tk.StringVar(value=str(value or ""))
        if key:
            vals[key] = (v, "str")
        controls[name]["entries"].append(text)
        ttk.Entry(row, textvariable=v, show=show).pack(
            side="left", fill="x", expand=True, padx=4
        )
        if browse:
            controls[name]["buttons"].append("Browse...")

            def pick():
                d = filedialog.askdirectory(parent=win)
                if d:
                    v.set(d)

            ttk.Button(row, text="Browse...", command=pick).pack(side="left")
        return v

    def add_int(f, name, text, key, value):
        row = ttk.Frame(f)
        row.pack(fill="x", padx=10, pady=2)
        controls[name]["labels"].append(text)
        ttk.Label(row, text=text).pack(side="left")
        v = tk.IntVar(value=int(value or 0))
        vals[key] = (v, "int")
        controls[name]["entries"].append(text)
        ttk.Spinbox(row, from_=0, to=9999, textvariable=v, width=6).pack(side="left", padx=4)
        return v

    def add_combo(f, name, text, key, value, options):
        row = ttk.Frame(f)
        row.pack(fill="x", padx=10, pady=2)
        controls[name]["labels"].append(text)
        ttk.Label(row, text=text).pack(side="left")
        v = tk.StringVar(value=str(value or ""))
        vals[key] = (v, "str")
        controls[name]["combos"].append(text)
        ttk.Combobox(row, values=options, textvariable=v, width=16,
                     state="readonly").pack(side="left", padx=4)
        return v

    def add_list(f, name, text, items, key=None):
        controls[name]["labels"].append(text)
        ttk.Label(f, text=text).pack(anchor="w", padx=10, pady=(6, 2))
        lb = tk.Listbox(f, height=6)
        for it in (items or []):
            lb.insert("end", it)
        lb.pack(fill="both", expand=True, padx=10)
        controls[name]["lists"].append(text)
        if key:
            vals[key] = (lb, "list")
        return lb

    def add_buttons(f, name, items):
        """Add a row of buttons. `items` is [(label, command), ...].

        A command is mandatory: a button without one is decoration, which is
        what every button in this dialog used to be.
        """
        row = ttk.Frame(f)
        row.pack(anchor="w", padx=10, pady=4)
        for lab, cmd in items:
            controls[name]["buttons"].append(lab)
            ttk.Button(row, text=lab, command=cmd).pack(side="left", padx=2)
        return row

    def ask(title, prompt, initial="", secret=False):
        from tkinter import simpledialog
        return simpledialog.askstring(title, prompt, initialvalue=initial,
                                      show="*" if secret else "", parent=win)

    def lb_selected(lb):
        sel = lb.curselection()
        return lb.get(sel[0]) if sel else None

    def lb_remove_selected(lb):
        sel = lb.curselection()
        for i in reversed(sel):
            lb.delete(i)

    def lb_add_value(lb, value):
        """Append to a plain string listbox, skipping blanks and duplicates."""
        value = (value or "").strip()
        if not value:
            return
        if value in [lb.get(i) for i in range(lb.size())]:
            return
        lb.insert("end", value)

    # --- General -----------------------------------------------------------
    g = tab("General")
    add_check(g, "General", "Start IDM on system startup",
              "general.launch_on_startup", s["general"]["launch_on_startup"])
    add_check(g, "General", "Keep running next to the clock when the window is closed",
              "general.minimize_to_tray", s["general"]["minimize_to_tray"])
    add_check(g, "General", "Integrate into browsers",
              "general.integrate_browsers", s["general"]["integrate_browsers"])
    add_check(g, "General", "Monitor clipboard for URLs",
              "general.monitor_clipboard", s["general"]["monitor_clipboard"])
    add_check(g, "General", "Run module for click monitoring for IE-based browsers",
              "general.run_ie_monitor", s["general"]["run_ie_monitor"])
    add_row(g, "General", "Use the following key(s) to force downloading:",
            "general.force_keys", s["general"]["force_keys"])
    add_row(g, "General", "Prevent downloading with key(s):",
            "general.prevent_keys", s["general"]["prevent_keys"])
    browsers_lb = add_list(g, "General", "Browsers:",
                           s["general"]["browsers"], "general.browsers")

    def _add_browser():
        path = filedialog.askopenfilename(parent=win, title="Add Browser")
        lb_add_value(browsers_lb, path)

    add_buttons(g, "General", [
        ("Add Browser...", _add_browser),
        ("Remove", lambda: lb_remove_selected(browsers_lb)),
    ])

    # --- File Types --------------------------------------------------------
    ft = tab("File Types")
    auto_lb = add_list(ft, "File Types",
                       "Automatically start downloading the following file types:",
                       s["file_types"]["auto"], "file_types.auto")
    sites_lb = add_list(ft, "File Types",
                        "Don't start downloading automatically from the following sites:",
                        s["file_types"]["exclude_sites"], "file_types.exclude_sites")
    # Sites are matched against the host, addresses against the whole URL, so
    # an ad path can be excluded without excluding the site that carries it.
    # The browser extension reads both through the host's get_settings.
    addrs_lb = add_list(ft, "File Types",
                        "Don't start downloading automatically from the following addresses:",
                        s["file_types"]["exclude_addresses"],
                        "file_types.exclude_addresses")

    def _add_type():
        ext = ask("Add file type", "Extension (without the dot):")
        lb_add_value(auto_lb, (ext or "").lstrip(".").lower())

    def _edit_types():
        cur = " ".join(auto_lb.get(i) for i in range(auto_lb.size()))
        txt = ask("Edit list", "Extensions, separated by spaces:", cur)
        if txt is None:
            return
        auto_lb.delete(0, "end")
        for ext in txt.replace(",", " ").split():
            lb_add_value(auto_lb, ext.lstrip(".").lower())

    def _add_site():
        site = ask("Add site", "Site to exclude (host or URL):")
        lb_add_value(sites_lb, site)

    def _add_address():
        addr = ask("Add address",
                   "Address to exclude (wildcards allowed, e.g. */ads/*):")
        lb_add_value(addrs_lb, addr)

    add_buttons(ft, "File Types", [
        ("Add", _add_type),
        ("Remove", lambda: lb_remove_selected(auto_lb)),
        ("Edit list...", _edit_types),
        ("Add site", _add_site),
        ("Remove site", lambda: lb_remove_selected(sites_lb)),
        ("Add address", _add_address),
        ("Remove address", lambda: lb_remove_selected(addrs_lb)),
    ])

    # --- Connection --------------------------------------------------------
    cn = tab("Connection")
    add_int(cn, "Connection", "Max connections per server:",
            "connection.max_connections", s["connection"]["max_connections"])
    exc_lb = add_list(cn, "Connection", "Exceptions (server -> connections):", [])

    def _render_exceptions():
        exc_lb.delete(0, "end")
        for e in s["connection"]["exceptions"]:
            exc_lb.insert("end", f"{e.get('server', '')} -> {e.get('connections', '')}")

    def _add_exception():
        nonlocal s
        server = ask("Add exception", "Server (host name):")
        if not server:
            return
        cur = next((e for e in s["connection"]["exceptions"]
                    if e.get("server") == server.strip()), None)
        n = ask("Add exception", f"Max connections for {server.strip()}:",
                str((cur or {}).get("connections", 1)))
        if n is None:
            return
        s = _upsert_exception(s, server, n)
        _render_exceptions()

    def _remove_exception():
        nonlocal s
        row = lb_selected(exc_lb)
        if not row:
            return
        s = _delete_exception(s, row.split(" -> ")[0])
        _render_exceptions()

    _render_exceptions()
    add_buttons(cn, "Connection", [
        ("Add", _add_exception),
        ("Remove", _remove_exception),
    ])
    add_check(cn, "Connection", "Download Limits",
              "connection.download_limits", s["connection"]["download_limits"])
    add_int(cn, "Connection", "Download no more than (MB):",
            "connection.limit_amount_mb", s["connection"]["limit_amount_mb"])
    add_int(cn, "Connection", "every (hours):",
            "connection.limit_period_h", s["connection"]["limit_period_h"])

    # --- Save To -----------------------------------------------------------
    st = tab("Save To")
    add_row(st, "Save To", "Default download directory:",
            "save_to.default_dir", s["save_to"]["default_dir"], browse=True)
    cat_lb = add_list(st, "Save To", "Category directories:", [])

    def _render_category_dirs():
        cat_lb.delete(0, "end")
        for k, v in sorted(s["save_to"]["category_dirs"].items()):
            cat_lb.insert("end", f"{k}: {v}")

    def _set_cat_dir():
        nonlocal s
        cats = list_categories(s)
        name = ask("Category directory",
                   "Category (%s):" % ", ".join(cats), cats[0] if cats else "")
        if not name:
            return
        d = filedialog.askdirectory(parent=win,
                                    title=f"Download directory for {name}")
        if not d:
            return
        s = _set_category_dir(s, name, d)
        _render_category_dirs()

    def _clear_cat_dir():
        nonlocal s
        row = lb_selected(cat_lb)
        if not row:
            return
        s = _set_category_dir(s, row.split(":")[0], "")
        _render_category_dirs()

    _render_category_dirs()
    add_buttons(st, "Save To", [
        ("Set directory...", _set_cat_dir),
        ("Clear", _clear_cat_dir),
    ])
    # No "Temporary directory" row: the engine set_len()s the final file and
    # writes its segments into it in place, so there is no part file for such a
    # directory to hold. A control that cannot affect a single byte is worse
    # than a missing one. See gui/test/temp_dir_removed.test.mjs.
    add_check(st, "Save To", "Change folder for a category on last selected",
              "save_to.change_on_last", s["save_to"]["change_on_last"])

    # --- Downloads ---------------------------------------------------------
    dl = tab("Downloads")
    add_check(dl, "Downloads", "Show start download dialog",
              "downloads.show_start_dialog", s["downloads"]["show_start_dialog"])
    add_check(dl, "Downloads", "Show download complete dialog",
              "downloads.show_complete_dialog", s["downloads"]["show_complete_dialog"])
    add_check(dl, "Downloads",
              "Start download immediately while showing Download File Info dialog",
              "downloads.start_immediately", s["downloads"]["start_immediately"])
    add_check(dl, "Downloads",
              "Ignore file modification time changes when resuming a download",
              "downloads.ignore_mtime", s["downloads"]["ignore_mtime"])
    add_combo(dl, "Downloads", "Customize 'Download Progress' dialog:",
              "downloads.show_progress", s["downloads"]["show_progress"],
              ["normal", "minimized", "don't show"])
    add_row(dl, "Downloads", "User agent for manually added downloads:",
            "downloads.user_agent", s["downloads"]["user_agent"])
    add_row(dl, "Downloads", "Virus checking executable:",
            "downloads.virus_checker", s["downloads"]["virus_checker"], browse=True)
    add_row(dl, "Downloads", "Virus checking parameters:",
            "downloads.virus_params", s["downloads"]["virus_params"])

    # --- Proxy / Socks -----------------------------------------------------
    px = tab("Proxy / Socks")
    add_check(px, "Proxy / Socks", "Use proxy/socks from a browser's request",
              "proxy.use_system", s["proxy"]["use_system"])
    _px_row = ttk.Frame(px)  # placeholder so the button row sits above the fields
    _px_row.pack(fill="x")
    http_v = add_row(px, "Proxy / Socks", "HTTP proxy:", "proxy.http", s["proxy"]["http"])
    https_v = add_row(px, "Proxy / Socks", "HTTPS proxy:", "proxy.https", s["proxy"]["https"])
    ftp_v = add_row(px, "Proxy / Socks", "FTP proxy:", "proxy.ftp", s["proxy"]["ftp"])
    socks_v = add_row(px, "Proxy / Socks", "SOCKS proxy:", "proxy.socks", s["proxy"]["socks"])
    noproxy_lb = add_list(px, "Proxy / Socks",
                          "Don't use proxy for the following addresses:",
                          s["proxy"]["no_proxy"], "proxy.no_proxy")

    def _get_system_proxy():
        """Fill the fields from the environment, like IDM reads the OS config."""
        env = os.environ
        for var, target in (
            (("http_proxy", "HTTP_PROXY"), http_v),
            (("https_proxy", "HTTPS_PROXY"), https_v),
            (("ftp_proxy", "FTP_PROXY"), ftp_v),
            (("all_proxy", "ALL_PROXY"), socks_v),
        ):
            for name in var:
                if env.get(name):
                    target.set(env[name])
                    break
        for name in ("no_proxy", "NO_PROXY"):
            if env.get(name):
                noproxy_lb.delete(0, "end")
                for host in env[name].split(","):
                    lb_add_value(noproxy_lb, host)
                break

    def _add_no_proxy():
        lb_add_value(noproxy_lb, ask("No proxy for", "Address or host:"))

    add_buttons(_px_row, "Proxy / Socks", [
        ("Get System", _get_system_proxy),
        ("Add", _add_no_proxy),
        ("Remove", lambda: lb_remove_selected(noproxy_lb)),
    ])
    add_check(px, "Proxy / Socks", "Use FTP in PASV mode",
              "proxy.ftp_pasv", s["proxy"]["ftp_pasv"])
    add_check(px, "Proxy / Socks", "Proxy requires authorization",
              "proxy.proxy_auth", s["proxy"]["proxy_auth"])
    add_row(px, "Proxy / Socks", "User name:", "proxy.proxy_user", s["proxy"]["proxy_user"])
    add_row(px, "Proxy / Socks", "Password:", "proxy.proxy_pass",
            s["proxy"]["proxy_pass"], show="*")

    # --- Site Logins -------------------------------------------------------
    sl = tab("Site Logins")
    login_lb = add_list(sl, "Site Logins", "Sites requiring authorization:", [])
    _sl_row = ttk.Frame(sl)
    _sl_row.pack(fill="x")
    # These are NOT bound into `vals`: site_logins is a list of records, and a
    # dotted key would make collect() call list.setdefault() and drop them.
    url_v = add_row(sl, "Site Logins", "URL:", None, "")
    user_v = add_row(sl, "Site Logins", "User name:", None, "")
    pass_v = add_row(sl, "Site Logins", "Password:", None, "", show="*")

    # Where the passwords are, in one line. Claiming "encrypted" without
    # saying where the key lives would be a half-truth: with no system keyring
    # the key sits in a file next to the vault.
    vault_status = ttk.Label(sl, text="Passwords: not stored yet")
    vault_status.pack(anchor="w", padx=10, pady=(8, 2))
    controls["Site Logins"]["labels"].append("Passwords:")

    def _render_vault_status():
        if api is None:
            return
        try:
            text = api.secrets_status()
        except Exception:  # noqa: BLE001
            return
        if text:
            vault_status.config(text="Passwords: " + text)

    def _render_logins():
        login_lb.delete(0, "end")
        for x in s["site_logins"]:
            login_lb.insert("end", x.get("url", ""))

    def _save_login():
        nonlocal s
        if not url_v.get().strip():
            return
        # The password goes to the engine's vault and only its reference is
        # kept here. If the engine will not take it, the plaintext is written
        # as before: losing the password is worse than storing it in the clear.
        ref = ""
        if api is not None and pass_v.get():
            try:
                ref = api.store_password(pass_v.get())
            except Exception:  # noqa: BLE001
                ref = ""
        s = _upsert_site_login(s, url_v.get(), user_v.get(), pass_v.get(), ref)
        _render_logins()
        _render_vault_status()

    def _new_login():
        for v in (url_v, user_v, pass_v):
            v.set("")
        url_v.set("https://")

    def _remove_login():
        nonlocal s
        url = lb_selected(login_lb)
        if not url:
            return
        s = _delete_site_login(s, url)
        _render_logins()

    def _on_pick_login(_e=None):
        url = lb_selected(login_lb)
        rec = _find_site_login(s, url) if url else None
        if rec:
            url_v.set(rec.get("url", ""))
            user_v.set(rec.get("user", ""))
            pass_v.set(rec.get("password", ""))

    login_lb.bind("<<ListboxSelect>>", _on_pick_login)
    _render_logins()
    add_buttons(_sl_row, "Site Logins", [
        ("New", _new_login),
        ("Save", _save_login),
        ("Remove", _remove_login),
    ])

    # --- Dial-Up / VPN -----------------------------------------------------
    du = tab("Dial-Up / VPN")
    add_combo(du, "Dial-Up / VPN", "Connection:", "dialup.connection",
              s["dialup"]["connection"], [s["dialup"]["connection"]] if s["dialup"]["connection"] else [])
    add_row(du, "Dial-Up / VPN", "User name:", "dialup.username", s["dialup"]["username"])
    add_row(du, "Dial-Up / VPN", "Password:", "dialup.password",
            s["dialup"]["password"], show="*")
    add_check(du, "Dial-Up / VPN", "Save password",
              "dialup.save_password", s["dialup"]["save_password"])
    add_int(du, "Dial-Up / VPN", "Number of redials (0 = endlessly):",
            "dialup.redials", s["dialup"]["redials"])
    add_int(du, "Dial-Up / VPN", "Time interval between redials (s):",
            "dialup.interval_s", s["dialup"]["interval_s"])

    # --- Sounds ------------------------------------------------------------
    so = tab("Sounds")
    add_check(so, "Sounds", "Enable sounds", "sounds.enabled", s["sounds"]["enabled"])
    events_lb = add_list(so, "Sounds", "Events:", [])
    sound_v = add_row(so, "Sounds", "Sound file:", None, "")

    def _render_events():
        events_lb.delete(0, "end")
        for ev in SOUND_EVENTS:
            path = s["sounds"]["events"].get(ev, "")
            events_lb.insert("end", f"{ev}: {path}" if path else ev)

    def _selected_event():
        row = lb_selected(events_lb)
        return row.split(":")[0].strip() if row else None

    def _on_pick_event(_e=None):
        ev = _selected_event()
        sound_v.set(s["sounds"]["events"].get(ev, "") if ev else "")

    def _browse_sound():
        nonlocal s
        ev = _selected_event()
        if not ev:
            return
        path = filedialog.askopenfilename(
            parent=win, title=f"Sound for {ev}",
            filetypes=[("Sound files", "*.wav *.ogg *.mp3"), ("All files", "*")])
        if not path:
            return
        sound_v.set(path)
        s = _set_sound_event(s, ev, path)
        _render_events()

    def _clear_sound():
        nonlocal s
        ev = _selected_event()
        if not ev:
            return
        sound_v.set("")
        s = _set_sound_event(s, ev, "")
        _render_events()

    def _play_sound():
        play_sound(sound_v.get())

    events_lb.bind("<<ListboxSelect>>", _on_pick_event)
    _render_events()
    add_buttons(so, "Sounds", [
        ("Browse...", _browse_sound),
        ("Play", _play_sound),
        ("Clear", _clear_sound),
    ])

    def collect():
        out = _deep_merge(DEFAULT_SETTINGS, s)

        def setv(dotted, value):
            parts = dotted.split(".")
            cur = out
            for p in parts[:-1]:
                cur = cur.setdefault(p, {})
            cur[parts[-1]] = value

        for key, (var, kind) in vals.items():
            try:
                if kind == "bool":
                    setv(key, bool(var.get()))
                elif kind == "int":
                    setv(key, int(var.get()))
                elif kind == "list":
                    setv(key, [var.get(i) for i in range(var.size())])
                else:
                    setv(key, var.get())
            except Exception:  # noqa: BLE001
                pass
        return out

    def apply():
        if on_save:
            try:
                on_save(collect())
            except Exception:  # noqa: BLE001
                pass

    bar = ttk.Frame(win)
    bar.pack(fill="x", padx=8, pady=(0, 8))

    def ok():
        apply()
        win.destroy()

    ttk.Button(bar, text="OK", command=ok).pack(side="right", padx=4)
    ttk.Button(bar, text="Cancel", command=win.destroy).pack(side="right", padx=4)
    ttk.Button(bar, text="Apply", command=apply).pack(side="right", padx=4)
    return win, nb, controls


def _dialog_scheduler(parent, api=None, queue_names=None, state_dir=""):
    """IDM 'Scheduler' dialog: queue list + Schedule / Files in the queue.

    With an `api` the "Files in the queue" tab shows the real queue and
    Start Now / Stop / Delete act on the selected download, matching IDM
    (docs/idm/idm-scheduler_idm_scheduler.txt). With a `state_dir` the Schedule
    tab is backed by settings.json: picking a queue loads its schedule and
    Apply saves it.
    """
    import tkinter as tk
    from tkinter import ttk

    queues = list(queue_names or DEFAULT_QUEUE_NAMES)

    win = themed_toplevel(parent)
    win.title("Scheduler")
    win.geometry("620x430")

    left = ttk.Frame(win)
    left.pack(side="left", fill="y", padx=8, pady=8)
    ttk.Label(left, text="Queues").pack(anchor="w")
    qlist = tk.Listbox(left, width=20, height=14)
    for q in queues:
        qlist.insert("end", q)
    if queues:
        qlist.selection_set(0)
    qlist.pack(fill="y", expand=True)

    right = ttk.Frame(win)
    right.pack(side="left", fill="both", expand=True, padx=8, pady=8)
    nb = ttk.Notebook(right)
    nb.pack(fill="both", expand=True)
    sched = ttk.Frame(nb)
    files = ttk.Frame(nb)
    nb.add(sched, text="Schedule")
    nb.add(files, text="Files in the queue")

    # Every control is backed by a variable, so Apply has something to read.
    start_var = tk.StringVar()
    stop_var = tk.StringVar()
    retries_var = tk.StringVar()
    open_var = tk.StringVar()
    flag_vars = {
        "hang_up_when_done": tk.BooleanVar(),
        "exit_when_done": tk.BooleanVar(),
        "shutdown_when_done": tk.BooleanVar(),
    }

    ttk.Label(sched, text="Start download at:").grid(row=0, column=0, sticky="w", padx=6, pady=6)
    start_at = ttk.Entry(sched, width=12, textvariable=start_var)
    start_at.grid(row=0, column=1, sticky="w", padx=6, pady=6)
    ttk.Label(sched, text="Stop download at:").grid(row=1, column=0, sticky="w", padx=6, pady=6)
    stop_at = ttk.Entry(sched, width=12, textvariable=stop_var)
    stop_at.grid(row=1, column=1, sticky="w", padx=6, pady=6)
    ttk.Label(sched, text="Number of retries for each file if downloading failed:").grid(
        row=2, column=0, columnspan=2, sticky="w", padx=6, pady=6
    )
    retries = ttk.Spinbox(sched, from_=0, to=100, width=6, textvariable=retries_var)
    retries.grid(row=3, column=1, sticky="w", padx=6)
    ttk.Label(sched, text="Open the following file when done:").grid(
        row=4, column=0, sticky="w", padx=6, pady=(6, 0))
    ttk.Entry(sched, width=28, textvariable=open_var).grid(
        row=4, column=1, sticky="w", padx=6, pady=(6, 0))
    for i, (key, txt) in enumerate((
        ("hang_up_when_done", "Hang up modem when done"),
        ("exit_when_done", "Exit Internet Download Manager when done"),
        ("shutdown_when_done", "Turn off computer when done"),
    )):
        ttk.Checkbutton(sched, text=txt, variable=flag_vars[key]).grid(
            row=5 + i, column=0, columnspan=2, sticky="w", padx=6)

    def selected_queue():
        sel = qlist.curselection()
        return qlist.get(sel[0]) if sel else (queues[0] if queues else "")

    def load_schedule(_e=None):
        sc = queue_schedule(load_settings(state_dir), selected_queue())
        start_var.set(sc["start_at"])
        stop_var.set(sc["stop_at"])
        retries_var.set(str(sc["retries"]))
        open_var.set(sc["open_when_done"])
        for key, var in flag_vars.items():
            var.set(bool(sc[key]))

    def apply_schedule():
        """Persist this queue's schedule. Refuses an unparseable time."""
        for label, var in (("Start download at", start_var),
                           ("Stop download at", stop_var)):
            if parse_clock(var.get()) is None:
                messagebox.showwarning(
                    "Scheduler",
                    f"{label}: \"{var.get()}\" is not a time (use HH:MM:SS).",
                    parent=win)
                return
        sched_values = {
            "start_at": start_var.get(),
            "stop_at": stop_var.get(),
            "retries": retries_var.get(),
            "open_when_done": open_var.get(),
        }
        sched_values.update({k: v.get() for k, v in flag_vars.items()})
        name = selected_queue()
        if state_dir:
            save_settings(state_dir,
                          set_queue_schedule(load_settings(state_dir), name,
                                             sched_values))
        load_schedule()

    qlist.bind("<<ListboxSelect>>", load_schedule)
    load_schedule()

    qfiles = ttk.Treeview(files, columns=("name", "status"), show="headings", height=8)
    qfiles.heading("name", text="File Name")
    qfiles.heading("status", text="Status")
    qfiles.pack(fill="both", expand=True, padx=6, pady=6)

    def selected_qid():
        sel = qfiles.selection()
        if not sel:
            return None
        try:
            return int(sel[0])
        except ValueError:
            return None

    def refresh_queue():
        if api is None:
            return
        try:
            items = api.items()
        except Exception:  # noqa: BLE001
            return
        seen = set()
        for it in items:
            iid = str(it["id"])
            name = basename(it.get("url", ""))
            st = it.get("status", "")
            seen.add(iid)
            if qfiles.exists(iid):
                qfiles.item(iid, values=(name, st))
            else:
                qfiles.insert("", "end", iid=iid, values=(name, st))
        for iid in list(qfiles.get_children("")):
            if iid not in seen:
                qfiles.delete(iid)

    def _start_now():
        i = selected_qid()
        if api is not None and i is not None:
            try:
                api.resume(i)
            except Exception:  # noqa: BLE001
                pass
        refresh_queue()

    def _stop():
        i = selected_qid()
        if api is not None and i is not None:
            try:
                api.pause(i)
            except Exception:  # noqa: BLE001
                pass
        refresh_queue()

    def _delete():
        i = selected_qid()
        if api is not None and i is not None:
            try:
                api.remove(i)
            except Exception:  # noqa: BLE001
                pass
        refresh_queue()

    bar = ttk.Frame(win)
    bar.pack(side="bottom", fill="x", padx=8, pady=(0, 8))
    ttk.Button(bar, text="Start Now", command=_start_now).pack(side="left", padx=4)
    ttk.Button(bar, text="Stop", command=_stop).pack(side="left", padx=4)
    ttk.Button(bar, text="Delete", command=_delete).pack(side="left", padx=4)
    ttk.Button(bar, text="Apply", command=apply_schedule).pack(side="right", padx=4)
    ttk.Button(bar, text="Close", command=win.destroy).pack(side="right", padx=4)

    refresh_queue()
    win._idm_qfiles = qfiles
    win._idm_refresh_queue = refresh_queue
    return win, nb


def _dialog_properties(parent, url, out, description="", on_ok=None):
    """IDM 'Properties' dialog.

    `on_ok` receives {"url", "output", "description"} when the user confirms.
    Without it the dialog is read-only, which is what it used to be for every
    caller: OK just closed the window and the edits were dropped.
    """
    import tkinter as tk
    from tkinter import ttk

    win = themed_toplevel(parent)
    win.title("Properties")
    win.geometry("460x220")
    ttk.Label(win, text="URL:").grid(row=0, column=0, sticky="w", padx=8, pady=6)
    u = ttk.Entry(win, width=44)
    u.insert(0, url)
    u.grid(row=0, column=1, padx=8, pady=6)
    ttk.Label(win, text="Save To:").grid(row=1, column=0, sticky="w", padx=8, pady=6)
    s = ttk.Entry(win, width=44)
    s.insert(0, out)
    s.grid(row=1, column=1, padx=8, pady=6)
    ttk.Label(win, text="Description:").grid(row=2, column=0, sticky="w", padx=8, pady=6)
    d = ttk.Entry(win, width=44)
    d.insert(0, description or "")
    d.grid(row=2, column=1, padx=8, pady=6)
    bar = ttk.Frame(win)
    bar.grid(row=3, column=0, columnspan=2, sticky="e", padx=8, pady=10)
    ttk.Button(bar, text="Open",
               command=lambda: open_path(s.get())).pack(side="left", padx=4)
    def _ok():
        if on_ok:
            on_ok({"url": u.get(), "output": s.get(), "description": d.get()})
        win.destroy()

    ttk.Button(bar, text="OK", command=_ok).pack(side="left", padx=4)
    return win


LIVE_STATUSES = ("running", "pending")


def queue_drained(items: list) -> bool:
    """Is nothing left in flight?

    A failed download counts as finished: /q waiting for every item to reach
    "done" would hang forever on the first error.
    """
    return not any((it or {}).get("status") in LIVE_STATUSES for it in items or [])


def completion_action(cmdline: dict, items: list, settings: dict) -> dict:
    """What IDM's /q and /h should do, given the current queue.

    Returns {"quit": bool, "run": command, "note": why nothing runs}. Separated
    from the window so the decision is testable without Tk; the caller does the
    quitting and the spawning.
    """
    out = {"quit": False, "run": "", "note": ""}
    if not (cmdline.get("exit_when_done") or cmdline.get("hang_up")):
        return out
    if not queue_drained(items):
        return out
    if cmdline.get("exit_when_done"):
        out["quit"] = True
    if cmdline.get("hang_up"):
        command = ((settings or {}).get("downloads") or {}).get("hangup_command") or ""
        if command:
            out["run"] = command
        else:
            out["note"] = ("/h asked to hang up, but downloads.hangup_command "
                           "is not set in the Options dialog")
    return out


def format_labels(formats: list) -> list:
    """Turn /api/formats rows into dialog entries.

    The first entry is always "Best available" with an empty selector, so a
    plain file URL (no formats at all) still has a sane, non-committal choice.
    `kind` comes from the engine's summarize(): video+audio / video only /
    audio only.
    """
    out = [{"label": "Best available (let the backend choose)", "format": ""}]
    for f in formats or []:
        fid = str(f.get("format_id") or "").strip()
        if not fid:
            continue
        parts = [fid]
        if f.get("ext"):
            parts.append(str(f["ext"]))
        if f.get("resolution"):
            parts.append(str(f["resolution"]))
        kind = str(f.get("kind") or "")
        # "audio only" is often already the resolution; don't say it twice.
        if kind and kind != "video+audio" and kind not in parts:
            parts.append(kind)
        if f.get("note"):
            parts.append(str(f["note"]))
        size = f.get("filesize")
        if size:
            parts.append(fmt_size(int(size)))
        out.append({"label": "  ".join(parts), "format": fid})
    return out


# Classic (non-ttk) widgets ignore ttk styles completely, and half this
# program is built from them: 46 tk.Button against 46 ttk.Button, 54 tk.Label,
# 34 tk.Frame. That is why the dark theme stopped at the main window and every
# dialog kept its platform grey. The table says what each class gets.
_TK_WIDGET_ROLES = {
    # content sits on "surface", chrome on "bg"
    "Entry": "field",
    "Text": "field",
    "Listbox": "field",
    "Spinbox": "field",
    "Canvas": "field",
    "Button": "button",
    "Menubutton": "button",
    "Menu": "menu",
    "Scrollbar": "button",
}


def tk_widget_palette(cls_name: str, palette: dict) -> dict:
    """Colour options for a classic tk widget of class `cls_name`.

    Returned as a plain dict so it can be tested without a display and passed
    straight to widget.configure(). An unknown class gets window chrome, which
    is the safe default: wrong shade, never unreadable.
    """
    p = dict(palette)
    role = _TK_WIDGET_ROLES.get(str(cls_name), "chrome")
    if role == "field":
        bg = p["surface"]
    elif role in ("button", "menu"):
        bg = p["surface"] if role == "field" else p["heading_bg"]
    else:
        bg = p["bg"]
    opts = {"background": bg, "foreground": p["fg"]}
    if role == "field":
        # A black caret on a near-black entry is invisible, which is most of
        # what makes a dark theme feel half-done.
        opts["insertbackground"] = p["fg"]
        opts["selectbackground"] = p["selection_bg"]
        opts["selectforeground"] = p["selection_fg"]
    if role in ("button", "menu"):
        opts["activebackground"] = p["selection_bg"]
        opts["activeforeground"] = p["selection_fg"]
    # Flatness is per-widget on classic Tk and has nothing to do with colour:
    # a correctly coloured dark dialog still came out with a light bevel
    # around every button. The focus ring goes too -- it is drawn in a
    # platform colour nothing here can set.
    opts["relief"] = METRICS["relief"]
    opts["highlightthickness"] = 0
    if role == "field":
        # An entry with no edge at all vanishes into a dark surface, so it
        # keeps one -- drawn from the palette rather than by the platform.
        opts["highlightthickness"] = 1
        opts["highlightbackground"] = p["grid"]
        opts["highlightcolor"] = p["accent"]
    return opts


def theme_widget_tree(widget, palette: dict) -> int:
    """Paint `widget` and everything under it. Returns how many were touched.

    Walks the real widget tree rather than requiring every dialog to remember
    to paint itself: there are thirteen Toplevels, and the one that forgets is
    the one the user notices.
    """
    done = 0
    try:
        cls = widget.winfo_class()
    except Exception:  # noqa: BLE001
        return 0
    # ttk widgets carry their own styling; configuring them raises.
    if not cls.startswith("T"):
        opts = tk_widget_palette(cls, palette)
        for key, value in opts.items():
            try:
                widget.configure(**{key: value})
                done += 1
            except Exception:  # noqa: BLE001
                pass
    for child in widget.winfo_children():
        done += theme_widget_tree(child, palette)
    return done


def themed_toplevel(parent, palette=None):
    """A Toplevel that paints itself once it is on screen.

    Binding <Map> rather than painting immediately means widgets added after
    construction -- which is all of them -- are covered too.
    """
    import tkinter as tk
    win = tk.Toplevel(parent)
    pal = palette or theme_palette(current_theme(parent))

    def _paint(_e=None):
        theme_widget_tree(win, pal)

    win.bind("<Map>", _paint, add="+")
    win.after(0, _paint)
    return win


def current_theme(widget) -> str:
    """The theme the window is wearing, for dialogs that only have a parent."""
    try:
        return str(widget.winfo_toplevel().tk.call("set", "::idm_theme"))
    except Exception:  # noqa: BLE001
        return "light"


def tab_colors(palette: dict, selected: bool) -> dict:
    """Colours for one notebook tab.

    apply_theme() used to style "TNotebook" -- the body -- and never
    "TNotebook.Tab", so clam kept its own pale tabs and the labels on them
    were unreadable in dark mode. Options has seven of them and Scheduler two.
    """
    p = dict(palette)
    if selected:
        # The current tab reads as part of the page below it.
        return {"background": p["surface"], "foreground": p["fg"]}
    return {"background": p["heading_bg"], "foreground": p["muted"]}


def apply_theme(root, name: str) -> dict:
    """Paint the whole window in `name`. Returns the palette it applied.

    ttk's built-in themes mostly ignore colour options -- "clam" is the one
    that honours them on every platform, so it is the base even on Windows,
    where the native theme would quietly drop half of this.
    """
    from tkinter import ttk

    p = theme_palette(name)
    style = ttk.Style(root)
    try:
        style.theme_use("clam")
    except Exception:  # noqa: BLE001
        pass

    root.configure(background=p["bg"])
    # Remembered on the interpreter so a dialog that only has a parent widget
    # can find out which theme it is being born into.
    try:
        root.tk.call("set", "::idm_theme", str(name or "light"))
    except Exception:  # noqa: BLE001
        pass
    # Classic widgets are not reached by ttk styles. option_add covers the ones
    # created from here on; theme_widget_tree() below catches those that exist
    # already (a theme switch repaints a window that is fully built).
    for cls, role in (("Button", "button"), ("Label", "chrome"),
                      ("Frame", "chrome"), ("Toplevel", "chrome"),
                      ("Checkbutton", "chrome"), ("Radiobutton", "chrome"),
                      ("Entry", "field"), ("Text", "field"),
                      ("Listbox", "field"), ("Menu", "menu"),
                      ("Canvas", "field"), ("Scrollbar", "button")):
        for key, value in tk_widget_palette(cls, p).items():
            try:
                root.option_add(f"*{cls}.{key}", value)
            except Exception:  # noqa: BLE001
                pass
    style.configure(".", background=p["bg"], foreground=p["fg"],
                    fieldbackground=p["surface"], bordercolor=p["grid"],
                    lightcolor=p["bg"], darkcolor=p["bg"])
    for widget in ("TFrame", "TLabelframe", "TPanedwindow", "TNotebook"):
        style.configure(widget, background=p["bg"])
    # The tabs themselves: a separate element from the notebook body, and the
    # one the user actually reads.
    off = tab_colors(p, False)
    on = tab_colors(p, True)
    style.configure("TNotebook.Tab", background=off["background"],
                    foreground=off["foreground"], bordercolor=p["grid"],
                    lightcolor=off["background"], darkcolor=off["background"],
                    padding=(14, 7), borderwidth=0)
    style.map("TNotebook.Tab",
              background=[("selected", on["background"]),
                          ("active", p["selection_bg"])],
              foreground=[("selected", on["foreground"]),
                          ("active", p["selection_fg"])],
              lightcolor=[("selected", on["background"])],
              expand=[("selected", (0, 0, 0, 0))])
    style.configure("TLabel", background=p["bg"], foreground=p["fg"])
    style.configure("TLabelframe.Label", background=p["bg"], foreground=p["fg"])
    style.configure("TButton", background=p["surface"], foreground=p["fg"],
                    bordercolor=p["grid"], focuscolor=p["accent"],
                    relief=METRICS["relief"], borderwidth=METRICS["border"],
                    padding=(METRICS["button_pad_x"], METRICS["button_pad_y"]),
                    anchor="center")
    style.map("TButton",
              background=[("active", p["heading_bg"]), ("pressed", p["grid"])])
    # One button carries the accent: the action the window exists for. Without
    # it the toolbar is nine identical rectangles and nothing leads the eye.
    style.configure("Accent.TButton", background=p["accent"],
                    foreground=p["selection_fg"] if name == "dark" else "#ffffff",
                    relief=METRICS["relief"], borderwidth=0,
                    padding=(METRICS["button_pad_x"], METRICS["button_pad_y"]))
    style.map("Accent.TButton",
              background=[("active", p["selection_bg"]), ("pressed", p["grid"])])
    # A toolbar that is a band of its own, separated from the list by a rule
    # rather than by nothing.
    style.configure("Toolbar.TFrame", background=p["bg"])
    style.configure("Rule.TFrame", background=p["grid"])
    style.configure("Banner.TLabel", background=p["bg"], foreground=p["accent"])
    style.configure("TCheckbutton", background=p["bg"], foreground=p["fg"])
    style.configure("TRadiobutton", background=p["bg"], foreground=p["fg"])
    for entry in ("TEntry", "TCombobox", "TSpinbox"):
        style.configure(entry, fieldbackground=p["surface"], foreground=p["fg"],
                        insertcolor=p["fg"], bordercolor=p["grid"],
                        arrowcolor=p["fg"])
    style.configure("TProgressbar", background=p["accent"],
                    troughcolor=p["surface"], bordercolor=p["grid"])
    style.configure("TScrollbar", background=p["surface"],
                    troughcolor=p["bg"], arrowcolor=p["fg"],
                    bordercolor=p["grid"])
    style.configure("Treeview", background=p["surface"],
                    fieldbackground=p["surface"], foreground=p["fg"],
                    bordercolor=p["grid"], rowheight=METRICS["row_height"],
                    relief=METRICS["relief"], borderwidth=METRICS["border"])
    # A raised heading is the single loudest "default Tk" cue in the window.
    style.configure("Treeview.Heading", background=p["heading_bg"],
                    foreground=p["heading_fg"], bordercolor=p["grid"],
                    relief=METRICS["relief"], borderwidth=0,
                    padding=(8, (METRICS["heading_height"] - 16) // 2))
    style.map("Treeview.Heading", background=[("active", p["grid"])])
    style.map("Treeview",
              background=[("selected", p["selection_bg"])],
              foreground=[("selected", p["selection_fg"])])
    # option_add only reaches widgets created afterwards, and a theme toggle
    # happens on a window that is already built -- including any open dialog.
    theme_widget_tree(root, p)
    for child in root.winfo_children():
        if str(child.winfo_class()) == "Toplevel":
            theme_widget_tree(child, p)
    return p


def column_edges(widths) -> list:
    """Where the vertical rules go, from the column widths.

    Cumulative, and never on the right-hand edge: a rule there reads as a
    border round the widget rather than a divider between columns. A column
    squeezed to zero contributes no new boundary, so two rules cannot end up
    stacked in one place drawing a double-width line.
    """
    edges = []
    x = 0
    for wdt in list(widths)[:-1]:
        x += max(0, int(wdt or 0))
        if x > 0 and x not in edges:
            edges.append(x)
    return edges


def grid_separators(tree, palette: dict, store: list) -> list:
    """Draw (or redraw) the vertical rules over `tree`.

    ttk's Treeview has no element for cell borders, so these are 1px frames
    placed on top of it. `store` holds the ones already drawn; they are
    destroyed and remade rather than moved, because the number of them changes
    with the columns and a stale rule is worse than a redraw.

    The caller must re-run this whenever the columns change width -- which is
    every <Configure>, since Treeview stretches its columns with the window.
    """
    import tkinter as tk

    for old in store:
        try:
            old.destroy()
        except Exception:  # noqa: BLE001
            pass
    store.clear()

    widths = [tree.column(key, "width") for key in tree["columns"]]
    for x in column_edges(widths):
        line = tk.Frame(tree, background=palette["grid"], width=1,
                        borderwidth=0, highlightthickness=0)
        # relheight=1 spans the heading too, which is what a table border
        # looks like; y=0 keeps it anchored when rows scroll.
        line.place(x=x, y=0, width=1, relheight=1.0)
        store.append(line)
    return store


def tag_rows(tree, palette: dict) -> None:
    """Configure the two striping tags on a Treeview.

    This is as close to "gridlines" as ttk gets: the Treeview has no element
    for cell borders, so a row can only be coloured whole. Alternating shades
    let the eye follow a row across the width, which is what the lines were
    for. Real per-cell rules would mean drawing the table on a Canvas instead
    of using Treeview at all.
    """
    # Background only: the text colour belongs to the state tags below, and a
    # stripe that also set it could win over them.
    tree.tag_configure("odd", background=palette["row_odd"])
    tree.tag_configure("even", background=palette["row_even"])
    # Colour by state, so an error or a finished row is seen, not read.
    # Queued and paused rows stay muted; a running one is the accent.
    for status, key in (("running", "accent"), ("pending", "muted"),
                        ("paused", "muted"), ("done", "ok"), ("error", "err")):
        tree.tag_configure(status_tag(status), foreground=palette[key])


# What the queue's internal states are called on screen. "running" is shown
# as a percentage instead when the size is known, the way IDM does it.
STATUS_LABELS = {
    "running": "Downloading",
    "pending": "Queued",
    "paused": "Paused",
    "done": "Complete",
    "error": "Error",
}


def progress_bar_text(fraction, width: int = 10) -> str:
    """A bar drawn in text, `width` cells wide whatever the fraction.

    Treeview cells hold text only; a real bar per row would mean leaving
    Treeview for a Canvas table. Block characters read as a bar in every font
    Tk is likely to pick.
    """
    try:
        f = float(fraction)
    except (TypeError, ValueError):
        f = 0.0
    f = min(1.0, max(0.0, f))
    full = int(round(f * width))
    return "\u2588" * full + "\u2591" * (width - full)


def item_name(it: dict) -> str:
    """The row's file name: the file being written, else the URL's tail.

    Split on both separators: the window may show a queue written on Windows.
    """
    out = str(it.get("output") or "")
    tail = re.split(r"[\\/]", out)[-1] if out else ""
    return tail or basename(it.get("url", ""))


def _status_and_progress(it: dict):
    dl = it.get("downloaded") or 0
    total = it.get("total") or 0
    status = it.get("status", "")
    if status == "done":
        return STATUS_LABELS["done"], f"{progress_bar_text(1)}  100 %"
    if total:
        frac = min(1.0, dl / total)
        label = (f"{frac * 100:.1f} %" if status == "running"
                 else STATUS_LABELS.get(status, status))
        return label, f"{progress_bar_text(frac)} {frac * 100:4.0f} %"
    label = STATUS_LABELS.get(status, status)
    return label, (f"{fmt_size(dl)} \u2026" if status == "running" and dl else "")


def status_tag(status: str) -> str:
    """The Treeview tag that colours a row by its state; '' for no colour."""
    return f"st_{status}" if status in STATUS_LABELS else ""


def queue_summary(items) -> dict:
    """The bottom bar: the total over every running download, and a line
    saying how many, how far, how fast and how long.

    The bar used to follow whichever running row apply_items drew last, so
    with two downloads it jumped between them.
    """
    running = [it for it in (items or []) if it.get("status") == "running"]
    queued = sum(1 for it in (items or []) if it.get("status") == "pending")
    if not running:
        return {"percent": 0, "text": ""}
    sized = [it for it in running if it.get("total")]
    dl = sum(int(it.get("downloaded") or 0) for it in sized)
    total = sum(int(it.get("total") or 0) for it in sized)
    percent = round(dl / total * 100.0, 1) if total else 0
    parts = [f"{len(running)} downloading"]
    if total:
        parts.append(f"{percent:.0f} %")
    speed = fmt_speed(sum(float(it.get("speed_bps") or 0) for it in running))
    if speed:
        parts.append(speed)
    eta = fmt_eta(max(float(it.get("time_left_s") or 0) for it in running))
    if eta:
        parts.append(f"{eta} left")
    if queued:
        parts.append(f"{queued} queued")
    return {"percent": percent, "text": "  \u00b7  ".join(parts)}


def row_values(it: dict, settings: dict = None) -> tuple:
    """One value per entry in COLUMNS, for a single item from /api/items.

    `settings` is only needed for the Category cell (custom categories win
    over the built-in extension map); callers without any pass nothing and get
    the built-in answer.
    """
    dl = it.get("downloaded") or 0
    total = it.get("total") or 0
    status = it.get("status", "")
    url = it.get("url", "")
    label, bar = _status_and_progress(it)
    return (
        item_name(it),
        item_category(settings or {}, url),
        f"{fmt_size(dl)} / {fmt_size(total)}" if total else fmt_size(dl),
        label,
        bar,
        fmt_speed(it.get("speed_bps")),
        fmt_eta(it.get("time_left_s")),
        "*" if status in ("running", "pending") else "",
        url,
        it.get("description") or "",
    )


def dont_show_complete_again(state_dir: str) -> dict:
    """Persist "Don't show this dialog again" from the Download Complete box."""
    s = load_settings(state_dir)
    s["downloads"]["show_complete_dialog"] = False
    save_settings(state_dir, s)
    return s


def _dialog_complete(parent, path, state_dir: str = ""):
    """IDM 'Download Complete' dialog.

    "Open" used to be bound to win.destroy(), so it looked wired to a static
    check and opened nothing. Now that a finished download actually raises
    this dialog, both buttons and the checkbox do their job.
    """
    import tkinter as tk
    from tkinter import ttk

    win = themed_toplevel(parent)
    win.title("Download Complete")
    win.geometry("420x180")
    ttk.Label(win, text="Download complete:").pack(anchor="w", padx=10, pady=(12, 2))
    ttk.Label(win, text=path).pack(anchor="w", padx=10, pady=2)
    row = ttk.Frame(win)
    row.pack(anchor="w", padx=10, pady=6)
    ttk.Button(row, text="Open",
               command=lambda: open_path(path)).pack(side="left", padx=(0, 4))
    ttk.Button(row, text="Open Folder",
               command=lambda: reveal_path(path)).pack(side="left", padx=4)

    hide = tk.BooleanVar(value=False)

    def _toggle_hide():
        if hide.get() and state_dir:
            dont_show_complete_again(state_dir)

    ttk.Checkbutton(win, text="Don't show this dialog again", variable=hide,
                    command=_toggle_hide).pack(anchor="w", padx=10)
    ttk.Button(win, text="Close", command=win.destroy).pack(anchor="e", padx=10, pady=6)
    return win


def _dialog_about(parent):
    """IDM 'About' dialog: version, registration state, links."""
    import tkinter as tk
    from tkinter import ttk

    win = themed_toplevel(parent)
    win.title("About Internet Download Manager")
    win.geometry("440x320")
    ttk.Label(win, text="Internet Download Manager",
              font=("", 12, "bold")).pack(anchor="w", padx=12, pady=(12, 2))
    ttk.Label(win, text=f"Version {VERSION}").pack(anchor="w", padx=12)
    ttk.Label(win, text="IDM-like download manager (POC)").pack(
        anchor="w", padx=12, pady=(2, 8))
    info = tk.Text(win, height=7, width=50, wrap="word")
    info.insert("1.0",
                "Registered to: (unregistered POC)\n"
                "Serial number: ------\n\n"
                "Replication of Internet Download Manager\n"
                "architecture for testing and interoperability.\n"
                "Not affiliated with Tonec Inc.")
    info.config(state="disabled")
    info.pack(padx=12, pady=4)
    row = ttk.Frame(win)
    row.pack(fill="x", padx=12, pady=8)
    result = tk.StringVar(value="")
    ttk.Button(row, text="Registration...",
               command=lambda: _dialog_registration(win)).pack(side="left", padx=2)

    def _check():
        result.set("Checking for updates...")

        def work():
            latest, err = latest_release()
            if err:
                msg = f"Update check failed: {err}"
            elif is_newer_version(latest, VERSION):
                msg = f"Version {latest} is available (you have {VERSION})."
            else:
                msg = f"You are up to date (version {VERSION})."
            try:
                win.after(0, lambda: result.set(msg))
            except Exception:  # noqa: BLE001  (window closed meanwhile)
                pass

        threading.Thread(target=work, daemon=True).start()

    ttk.Button(row, text="Check for updates", command=_check).pack(side="left", padx=2)
    ttk.Button(row, text="Close", command=win.destroy).pack(side="right")
    ttk.Label(win, textvariable=result).pack(anchor="w", padx=12, pady=(0, 8))
    return win


def _dialog_drop_target(parent, on_urls=None, clipboard=None):
    """The floating drop box: a small window that stays above everything.

    IDM leaves a little target on the desktop you can drag links onto. Real
    drag & drop needs the optional tkinterdnd2 extension, which we refuse to
    depend on, so the window is useful on its own: the button takes whatever
    is on the clipboard and queues every URL in it. When the extension *is*
    installed the same handler is wired to the real <<Drop>> event, so dragged
    links work too.

    `on_urls` is called with the list of URLs that were accepted.
    Returns (win, handle_text) -- handle_text(text) is the drop/paste path.
    """
    import tkinter as tk
    from tkinter import ttk

    win = themed_toplevel(parent)
    win.title("Drop target")
    win.geometry("210x120")
    win.resizable(False, False)

    def _stay_on_top(_event=None):
        # Re-asserted on <Map> too: a window manager can drop the hint when
        # the window is hidden and shown again.
        try:
            win.wm_attributes("-topmost", True)
        except Exception:  # noqa: BLE001
            pass

    _stay_on_top()
    win.bind("<Map>", _stay_on_top)

    status = tk.StringVar(value="Drop a link here")
    ttk.Label(win, text="IDM", font=("", 14, "bold")).pack(pady=(10, 0))
    ttk.Label(win, textvariable=status, wraplength=190,
              justify="center").pack(pady=(2, 6))

    def handle_text(text):
        urls = extract_urls(text)
        if not urls:
            status.set("No URL in that text")
            return []
        if on_urls:
            on_urls(urls)
        status.set(f"Added {len(urls)} file(s)")
        return urls

    def _paste():
        text = ""
        try:
            text = win.clipboard_get() if clipboard is None else clipboard()
        except Exception:  # noqa: BLE001
            text = ""
        return handle_text(text)

    row = ttk.Frame(win)
    row.pack(fill="x", padx=8, pady=(0, 8))
    ttk.Button(row, text="Paste URL", command=_paste).pack(side="left")
    ttk.Button(row, text="Close", command=win.destroy).pack(side="right")

    # Real drag & drop, only if the optional extension is there.
    try:
        from tkinterdnd2 import DND_TEXT  # noqa: F401
        win.drop_target_register(DND_TEXT)
        win.dnd_bind("<<Drop>>", lambda e: handle_text(getattr(e, "data", "")))
    except Exception:  # noqa: BLE001
        pass

    return win, handle_text


def _dialog_registration(parent):
    """IDM 'Registration' dialog.

    This build is a POC with no licensing, so there is nothing to validate --
    the dialog says so plainly instead of pretending to accept a serial.
    """
    import tkinter as tk
    from tkinter import ttk

    win = themed_toplevel(parent)
    win.title("Registration")
    win.geometry("420x160")
    ttk.Label(win, text="Registration", font=("", 11, "bold")).pack(
        anchor="w", padx=12, pady=(12, 4))
    ttk.Label(
        win,
        wraplength=390,
        justify="left",
        text=("This is an open build with no licensing: there is no serial "
              "number to enter and every feature is already available. "
              "It is not affiliated with Tonec Inc."),
    ).pack(anchor="w", padx=12, pady=4)
    ttk.Button(win, text="Close", command=win.destroy).pack(anchor="e", padx=12, pady=10)
    return win


# --------------------------------------------------------------------------- #
# Main window (IDM layout: toolbar above, category tree left, list right)
# --------------------------------------------------------------------------- #
def _read_meta_segments(meta_path):
    """Per-segment progress from an engine .idmmeta sidecar.

    Returns (fractions, overall, total); fractions is one fill fraction (0..1)
    per segment, matching the bars in the progress dialog.
    """
    try:
        with open(meta_path, encoding="utf-8") as f:
            m = json.load(f)
    except Exception:  # noqa: BLE001
        return [], 0.0, 0
    total = int(m.get("total") or 0)
    segs = m.get("segments") or []
    fracs = []
    done_sum = 0
    for seg in segs:
        try:
            start = int(seg.get("start", 0))
            end = int(seg.get("end", 0))
            dl = int(seg.get("downloaded", 0))
        except Exception:  # noqa: BLE001
            continue
        span = max(1, end - start + 1)
        fracs.append(min(1.0, dl / span))
        done_sum += dl
    overall = (done_sum / total) if total else 0.0
    return fracs, overall, total


def _dialog_progress(parent, name, connections=4, on_pause=None, meta_path=None,
                     on_options=None):
    """IDM 'Download Progress' (File Download) dialog with a segment graph.

    `on_options` backs the "Options on completion" button; with none given it
    opens the Options dialog on its Downloads tab, which is where the
    post-download switches live.
    """
    import tkinter as tk
    from tkinter import ttk

    win = themed_toplevel(parent)
    win.title("Download Progress")
    win.geometry("520x330")

    ttk.Label(win, text=name, font=("", 10, "bold")).pack(anchor="w", padx=10, pady=(10, 2))
    info = ttk.Label(win, text="Connecting...")
    info.pack(anchor="w", padx=10)

    canvas = tk.Canvas(win, height=120, background="#ffffff", highlightthickness=1,
                       highlightbackground="#999")
    canvas.pack(fill="x", padx=10, pady=8)

    n = max(0, connections)
    bars = []
    top, height, gap = 8, 12, 4
    width = 480
    for i in range(n):
        y = top + i * (height + gap)
        canvas.create_rectangle(6, y, width, y + height, outline="#bbb", fill="#f0f0f0")
        bar = canvas.create_rectangle(6, y, 6, y + height, outline="", fill="#2d6cdf")
        canvas.create_text(width + 4, y + height // 2, anchor="w", text=f"{i + 1}.", font=("", 8))
        bars.append(bar)
    oy = top + n * (height + gap) + 4
    canvas.create_rectangle(6, oy, width, oy + height, outline="#888", fill="#e8e8e8")
    overall = canvas.create_rectangle(6, oy, 6, oy + height, outline="", fill="#1a9850")

    btns = ttk.Frame(win)
    btns.pack(fill="x", padx=10, pady=8)
    pause = ttk.Button(btns, text="Pause", command=(on_pause or win.destroy))
    pause.pack(side="left")
    cancel = ttk.Button(btns, text="Cancel", command=win.destroy)
    cancel.pack(side="left", padx=6)
    def _open_completion_options():
        if on_options:
            on_options()
            return
        # The post-download switches (complete dialog, virus check) are on the
        # Downloads tab, so open straight at it.
        _ow, nb, _c = _dialog_options(win)
        for i, tab in enumerate(nb.tabs()):
            if nb.tab(tab, "text") == "Downloads":
                nb.select(i)
                break

    ttk.Button(btns, text="Options on completion",
               command=_open_completion_options).pack(side="right")

    bar_geo = []
    for i in range(n):
        y = top + i * (height + gap)
        bar_geo.append((6, width, y, y + height))
    overall_geo = (6, width, oy, oy + height)

    def update_from_meta():
        """Refresh the bars from the current .idmmeta (live, like IDM)."""
        if not meta_path:
            return
        fracs, ov, total = _read_meta_segments(meta_path)
        for i, frac in enumerate(fracs):
            if i >= len(bars):
                break
            x0, x1, y0, y1 = bar_geo[i]
            fx = x0 + int((x1 - x0) * max(0.0, min(1.0, frac)))
            canvas.coords(bars[i], x0, y0, fx, y1)
        x0, x1, oy0, oy1 = overall_geo
        canvas.coords(overall, x0, oy0, x0 + int((x1 - x0) * max(0.0, min(1.0, ov))), oy1)
        info.config(text=f"{int(ov * 100)}%  ({total} bytes)")

    win._idm_segment_bars = bars
    win._idm_overall_bar = overall
    win._idm_canvas = canvas
    win._idm_info = info
    win._idm_update = update_from_meta
    win._idm_bar_geo = bar_geo

    def _tick():
        if not win.winfo_exists():
            return
        update_from_meta()
        win.after(500, _tick)

    if meta_path:
        win.after(300, _tick)

    return win, canvas, bars


def show_banner(w: dict, text: str) -> bool:
    """Put `text` in the window's banner. True when it was shown.

    Deliberately not a messagebox: a modal at startup blocks the program
    before the window is drawn, which is how --screenshot came back empty.
    """
    var = w.get("banner_var")
    frame = w.get("banner")
    if var is None or frame is None:
        return False
    var.set(text)
    try:
        frame.pack(fill="x", side="top", before=w["toolbar"])
    except Exception:  # noqa: BLE001
        frame.pack(fill="x", side="top")
    return True


def assets_dir() -> str:
    """Where idm.png lives: next to the gui/ directory in an install.

    $IDM_DIR/gui/idm_gui.py and $IDM_DIR/assets/idm.png in a real install, and
    the same relative shape in a checkout, so one rule covers both.
    """
    here = os.path.dirname(os.path.abspath(__file__))
    candidates = [
        os.path.join(os.path.dirname(here), "assets"),
        os.path.join(here, "assets"),
    ]
    env = os.environ.get("IDM_DIR")
    if env:
        candidates.insert(0, os.path.join(env, "assets"))
    for c in candidates:
        if os.path.isdir(c):
            return c
    return ""


def window_icon(master=None):
    """The application icon as a Tk image, or None when it cannot be read."""
    import tkinter as tk
    path = os.path.join(assets_dir(), "idm.png")
    if not os.path.isfile(path):
        return None
    try:
        return tk.PhotoImage(file=path, master=master)
    except Exception:  # noqa: BLE001
        return None


# --- notification-area icon (Windows) --------------------------------------
#
# Closing the window used to destroy it and terminate `idm --serve` with it,
# so every running download stopped. On Windows the close button hides the
# window instead and an icon next to the clock brings it back. Done with
# ctypes against shell32/user32: the window is stdlib-only, and pystray would
# be the first third-party dependency.

TRAY_MENU = [("Open IDM", "show"), ("Exit", "quit")]

_WM_LBUTTONUP = 0x0202
_WM_LBUTTONDBLCLK = 0x0203
_WM_RBUTTONUP = 0x0205
_WM_CONTEXTMENU = 0x007B


def close_action(is_windows: bool, tray_running: bool, settings: dict) -> str:
    """What the window's close button does: "hide" to the tray or "quit".

    Hiding needs an icon to come back through; without one (not Windows, the
    icon failed, or the user switched it off) closing quits as it always did.
    """
    general = (settings or {}).get("general") or {}
    if is_windows and tray_running and general.get("minimize_to_tray", True) is not False:
        return "hide"
    return "quit"


def tray_event(mouse_msg: int):
    """The tray icon's mouse message -> "show", "menu" or None."""
    if mouse_msg in (_WM_LBUTTONUP, _WM_LBUTTONDBLCLK):
        return "show"
    if mouse_msg in (_WM_RBUTTONUP, _WM_CONTEXTMENU):
        return "menu"
    return None


class _WinTray:
    """A Shell_NotifyIcon icon with its own hidden window and message loop.

    Everything Win32 runs on one thread of its own, because the icon's window
    has to pump messages and Tk's mainloop is not going to do it. Events go
    out through `on_event("show" | "quit")`, called on that thread: the
    caller hands them to Tk via a queue, never touching widgets from here.
    """

    def __init__(self, on_event, icon_path: str = "", tip: str = "IDM"):
        self.on_event = on_event
        self.icon_path = icon_path
        self.tip = tip[:127]
        self.hwnd = None
        self.added = False
        self.error = ""
        self._ready = threading.Event()
        self._thread = threading.Thread(target=self._run, name="idm-tray", daemon=True)

    def start(self, timeout: float = 5.0) -> bool:
        self._thread.start()
        self._ready.wait(timeout)
        return bool(self.hwnd)

    def stop(self) -> None:
        """Remove the icon and end the thread. Safe to call twice."""
        if self.hwnd:
            import ctypes
            ctypes.windll.user32.PostMessageW(self.hwnd, 0x0010, 0, 0)  # WM_CLOSE
        self._thread.join(3.0)

    def _run(self):  # noqa: C901 -- one Win32 window, kept in one place
        import ctypes
        from ctypes import wintypes as wt

        user32 = ctypes.windll.user32
        shell32 = ctypes.windll.shell32
        kernel32 = ctypes.windll.kernel32
        LRESULT = ctypes.c_ssize_t
        WNDPROC = ctypes.WINFUNCTYPE(LRESULT, wt.HWND, wt.UINT, wt.WPARAM, wt.LPARAM)

        class WNDCLASSW(ctypes.Structure):
            _fields_ = [("style", wt.UINT), ("lpfnWndProc", WNDPROC),
                        ("cbClsExtra", ctypes.c_int), ("cbWndExtra", ctypes.c_int),
                        ("hInstance", wt.HINSTANCE), ("hIcon", wt.HICON),
                        ("hCursor", wt.HANDLE), ("hbrBackground", wt.HBRUSH),
                        ("lpszMenuName", wt.LPCWSTR), ("lpszClassName", wt.LPCWSTR)]

        class GUID(ctypes.Structure):
            _fields_ = [("Data1", wt.DWORD), ("Data2", wt.WORD), ("Data3", wt.WORD),
                        ("Data4", ctypes.c_ubyte * 8)]

        class NOTIFYICONDATAW(ctypes.Structure):
            _fields_ = [("cbSize", wt.DWORD), ("hWnd", wt.HWND), ("uID", wt.UINT),
                        ("uFlags", wt.UINT), ("uCallbackMessage", wt.UINT),
                        ("hIcon", wt.HICON), ("szTip", wt.WCHAR * 128),
                        ("dwState", wt.DWORD), ("dwStateMask", wt.DWORD),
                        ("szInfo", wt.WCHAR * 256), ("uVersion", wt.UINT),
                        ("szInfoTitle", wt.WCHAR * 64), ("dwInfoFlags", wt.DWORD),
                        ("guidItem", GUID), ("hBalloonIcon", wt.HICON)]

        user32.DefWindowProcW.argtypes = [wt.HWND, wt.UINT, wt.WPARAM, wt.LPARAM]
        user32.DefWindowProcW.restype = LRESULT
        user32.CreateWindowExW.argtypes = [wt.DWORD, wt.LPCWSTR, wt.LPCWSTR, wt.DWORD,
                                           ctypes.c_int, ctypes.c_int, ctypes.c_int,
                                           ctypes.c_int, wt.HWND, wt.HMENU,
                                           wt.HINSTANCE, wt.LPVOID]
        user32.CreateWindowExW.restype = wt.HWND
        user32.RegisterClassW.argtypes = [ctypes.POINTER(WNDCLASSW)]
        user32.RegisterClassW.restype = wt.ATOM
        user32.LoadImageW.argtypes = [wt.HINSTANCE, wt.LPCWSTR, wt.UINT,
                                      ctypes.c_int, ctypes.c_int, wt.UINT]
        user32.LoadImageW.restype = wt.HANDLE
        user32.LoadIconW.argtypes = [wt.HINSTANCE, wt.LPVOID]
        user32.LoadIconW.restype = wt.HICON
        user32.CreatePopupMenu.restype = wt.HMENU
        user32.AppendMenuW.argtypes = [wt.HMENU, wt.UINT, ctypes.c_size_t, wt.LPCWSTR]
        user32.TrackPopupMenu.argtypes = [wt.HMENU, wt.UINT, ctypes.c_int, ctypes.c_int,
                                          ctypes.c_int, wt.HWND, wt.LPVOID]
        user32.TrackPopupMenu.restype = ctypes.c_int
        user32.DestroyMenu.argtypes = [wt.HMENU]
        user32.PostMessageW.argtypes = [wt.HWND, wt.UINT, wt.WPARAM, wt.LPARAM]
        user32.SetForegroundWindow.argtypes = [wt.HWND]
        user32.DestroyWindow.argtypes = [wt.HWND]
        user32.GetMessageW.argtypes = [ctypes.POINTER(wt.MSG), wt.HWND, wt.UINT, wt.UINT]
        user32.TranslateMessage.argtypes = [ctypes.POINTER(wt.MSG)]
        user32.DispatchMessageW.argtypes = [ctypes.POINTER(wt.MSG)]
        user32.DispatchMessageW.restype = LRESULT
        user32.RegisterWindowMessageW.argtypes = [wt.LPCWSTR]
        user32.RegisterWindowMessageW.restype = wt.UINT
        shell32.Shell_NotifyIconW.argtypes = [wt.DWORD, ctypes.POINTER(NOTIFYICONDATAW)]
        shell32.Shell_NotifyIconW.restype = wt.BOOL
        kernel32.GetModuleHandleW.argtypes = [wt.LPCWSTR]
        kernel32.GetModuleHandleW.restype = wt.HMODULE

        NIM_ADD, NIM_DELETE = 0, 2
        NIF_MESSAGE, NIF_ICON, NIF_TIP = 1, 2, 4
        WM_APP_TRAY = 0x8000 + 1
        WM_CLOSE, WM_DESTROY, WM_NULL = 0x0010, 0x0002, 0x0000
        TPM_RIGHTBUTTON, TPM_RETURNCMD, TPM_NONOTIFY = 0x0002, 0x0100, 0x0080
        MF_STRING = 0x0000
        taskbar_created = user32.RegisterWindowMessageW("TaskbarCreated")
        hinst = kernel32.GetModuleHandleW(None)

        hicon = None
        if self.icon_path and os.path.exists(self.icon_path):
            # IMAGE_ICON, LR_LOADFROMFILE | LR_DEFAULTSIZE
            hicon = user32.LoadImageW(None, self.icon_path, 1, 0, 0, 0x0010 | 0x0040)
        if not hicon:
            hicon = user32.LoadIconW(None, ctypes.c_void_p(32512))  # IDI_APPLICATION

        nid = NOTIFYICONDATAW()
        nid.cbSize = ctypes.sizeof(NOTIFYICONDATAW)
        nid.uID = 1
        nid.uFlags = NIF_MESSAGE | NIF_ICON | NIF_TIP
        nid.uCallbackMessage = WM_APP_TRAY
        nid.hIcon = hicon
        nid.szTip = self.tip

        def add_icon():
            self.added = bool(shell32.Shell_NotifyIconW(NIM_ADD, ctypes.byref(nid)))

        def show_menu(hwnd):
            menu = user32.CreatePopupMenu()
            for i, (label, _action) in enumerate(TRAY_MENU, start=1):
                user32.AppendMenuW(menu, MF_STRING, i, label)
            pt = wt.POINT()
            user32.GetCursorPos(ctypes.byref(pt))
            # Without the foreground switch the menu does not close when the
            # user clicks elsewhere (a documented Shell_NotifyIcon quirk).
            user32.SetForegroundWindow(hwnd)
            cmd = user32.TrackPopupMenu(menu, TPM_RIGHTBUTTON | TPM_RETURNCMD | TPM_NONOTIFY,
                                        pt.x, pt.y, 0, hwnd, None)
            user32.PostMessageW(hwnd, WM_NULL, 0, 0)
            user32.DestroyMenu(menu)
            if 1 <= cmd <= len(TRAY_MENU):
                self.on_event(TRAY_MENU[cmd - 1][1])

        def wndproc(hwnd, msg, wparam, lparam):
            try:
                if msg == WM_APP_TRAY:
                    ev = tray_event(lparam & 0xFFFF)
                    if ev == "show":
                        self.on_event("show")
                    elif ev == "menu":
                        show_menu(hwnd)
                    return 0
                if taskbar_created and msg == taskbar_created:
                    # Explorer restarted and forgot every icon.
                    add_icon()
                    return 0
                if msg == WM_CLOSE:
                    shell32.Shell_NotifyIconW(NIM_DELETE, ctypes.byref(nid))
                    self.added = False
                    user32.DestroyWindow(hwnd)
                    return 0
                if msg == WM_DESTROY:
                    user32.PostQuitMessage(0)
                    return 0
            except Exception as e:  # noqa: BLE001
                self.error = str(e)
            return user32.DefWindowProcW(hwnd, msg, wparam, lparam)

        self._wndproc = WNDPROC(wndproc)  # keep it alive as long as the window
        try:
            wc = WNDCLASSW()
            wc.lpfnWndProc = self._wndproc
            wc.hInstance = hinst
            wc.lpszClassName = "IDMTrayWindow"
            user32.RegisterClassW(ctypes.byref(wc))
            hwnd = user32.CreateWindowExW(0, "IDMTrayWindow", "IDM tray", 0,
                                          0, 0, 0, 0, None, None, hinst, None)
            if not hwnd:
                self.error = "CreateWindowExW failed"
                return
            nid.hWnd = hwnd
            add_icon()
            self.hwnd = hwnd
        finally:
            self._ready.set()
        msg = wt.MSG()
        while user32.GetMessageW(ctypes.byref(msg), None, 0, 0) > 0:
            user32.TranslateMessage(ctypes.byref(msg))
            user32.DispatchMessageW(ctypes.byref(msg))
        self.hwnd = None


def start_tray(on_event, icon_path: str = "", tip: str = "Internet Download Manager"):
    """Put IDM's icon in the notification area; None where there is none.

    None also when anything Win32 fails: the caller then keeps the old
    close-quits behaviour rather than hiding a window nobody can get back.
    """
    if os.name != "nt":
        return None
    try:
        tray = _WinTray(on_event, icon_path, tip)
        if tray.start() and tray.added:
            return tray
        tray.stop()
    except Exception as e:  # noqa: BLE001
        print("[!] ikona v liste se nevytvorila: %s" % e, file=sys.stderr)
    return None


def selftest_tray() -> int:
    """CI on Windows: create the real icon, check it registered, remove it."""
    events = []
    tray = start_tray(events.append, os.path.join(assets_dir(), "idm.ico"))
    ok = tray is not None and tray.added and bool(tray.hwnd)
    print("R:" + json.dumps({"started": ok, "error": getattr(tray, "error", "")}), flush=True)
    if tray is not None:
        tray.stop()
        ok = ok and not tray.added and not tray._thread.is_alive()
    print("R2:" + json.dumps({"stopped": ok}), flush=True)
    return 0 if ok else 1


def build_window(api: Api, out_dir: str = "", on_close=None, state_dir: str = ""):
    """Construct the main window and return (root, refresh_fn, widgets)."""
    import tkinter as tk
    from tkinter import ttk

    root = tk.Tk()
    root.title("Internet Download Manager")
    root.geometry("1040x560")
    root.minsize(820, 420)
    # The title bar and the panel showed an empty placeholder because nothing
    # ever set an icon. Tk 8.6 reads PNG itself, so assets/idm.png needs no
    # third-party imaging library to become the window icon.
    w_icon = window_icon(root)
    if w_icon is not None:
        try:
            root.iconphoto(True, w_icon)
            root._idm_icon = w_icon  # keep a reference; Tk does not own it
        except Exception:  # noqa: BLE001
            pass

    w = {}  # widget registry, used by --selftest-dump

    # Paint before anything is built: ttk styles are global, so a widget
    # created afterwards picks them up, while one created before would keep
    # the platform default until it is redrawn.
    theme_name = load_theme(state_dir)
    palette = apply_theme(root, theme_name)
    w["theme"] = theme_name
    w["palette"] = palette

    # --- toolbar (above the list, like IDM) ---
    toolbar = ttk.Frame(root, style="Toolbar.TFrame",
                        padding=(METRICS["toolbar_pad"], METRICS["toolbar_pad"],
                                 METRICS["toolbar_pad"], METRICS["gap"]))
    toolbar.pack(fill="x", side="top")
    w["toolbar"] = toolbar
    w["buttons"] = []
    w["icons"] = []
    for name in TOOLBAR:
        spec = TOOLBAR_ICONS.get(name)
        img = _icon(spec[0], spec[1], master=root) if spec else None
        if img is not None:
            w["icons"].append(img)
            b = ttk.Button(toolbar, text=name, image=img, compound="left")
        else:
            b = ttk.Button(toolbar, text=name)
        if name == "Add URL":
            b.configure(style="Accent.TButton")
        b.pack(side="left", padx=(0, METRICS["gap"]))
        w["buttons"].append((name, b))
    w["buttons_with_icons"] = sum(
        1 for _n, btn in w["buttons"] if _button_has_icon(btn)
    )

    # --- a banner for things the user must not have to go looking for ------
    # It takes no space until it has something to say; a status bar line is
    # too quiet for "nothing you do will download anything".
    banner = ttk.Frame(root, padding=(METRICS["toolbar_pad"], 6))
    banner_var = tk.StringVar(value="")
    w["banner"] = banner
    w["banner_var"] = banner_var
    ttk.Label(banner, textvariable=banner_var, style="Banner.TLabel",
              wraplength=900, justify="left").pack(side="left", fill="x", expand=True)
    ttk.Button(banner, text="OK", width=4,
               command=lambda: banner.pack_forget()).pack(side="right")

    # --- search row (IDM has it above the list) ---
    search_row = ttk.Frame(root, padding=(METRICS["toolbar_pad"], 0,
                                          METRICS["toolbar_pad"],
                                          METRICS["gap"]))
    search_row.pack(fill="x", side="top")
    ttk.Label(search_row, text="Search:").pack(side="left")
    w["search"] = ttk.Entry(search_row)
    w["search"].pack(side="left", fill="x", expand=True, padx=(4, 0))
    # Aria2 switch: when on, downloads go through aria2c (auto-installed if
    # missing). Default on if aria2c is already present on PATH.
    import shutil as _shutil
    aria2_var = tk.BooleanVar(value=bool(_shutil.which("aria2c")))
    w["aria2_var"] = aria2_var
    w["aria2_check"] = ttk.Checkbutton(search_row, text="Via aria2", variable=aria2_var)
    w["aria2_check"].pack(side="left", padx=(8, 0))

    # Theme toggle. One button rather than a menu: there are two themes, and
    # the label says which one the click leads to.
    def _toggle_theme():
        nxt = next_theme(w["theme"])
        w["theme"] = nxt
        w["palette"] = apply_theme(root, nxt)
        tag_rows(w["list"], w["palette"])
        # The rules are plain frames, not styled widgets, so a theme change
        # does not reach them on its own.
        w["redraw_grid"]()
        save_theme(state_dir, nxt)
        _paint_theme_button(nxt)

    def _paint_theme_button(name):
        """The toggle shows where the click leads: a moon for dark, a sun back.

        It used to be the words "Tmavý motiv" / "Světlý motiv", which is a lot
        of chrome for a switch and the only button in the row carrying prose.
        """
        glyph = theme_toggle_glyph(name)
        pal = w["palette"]
        img = _icon(pal["fg"], glyph, size=16, master=root, bg=pal["bg"])
        btn = w.get("theme_button")
        if btn is None:
            return
        if img is not None:
            w["theme_icon"] = img  # Tk keeps no reference of its own
            btn.configure(image=img, text="", compound="none", width=3)
        else:
            btn.configure(text=_theme_label(name), width=10)

    w["theme_button"] = ttk.Button(
        search_row, command=_toggle_theme, width=3
    )
    w["theme_button"].pack(side="left", padx=(8, 0))
    _paint_theme_button(theme_name)
    w["paint_theme_button"] = _paint_theme_button

    # --- body: category tree LEFT, download list RIGHT ---
    body = ttk.Panedwindow(root, orient="horizontal")
    body.pack(fill="both", expand=True, padx=6, pady=4)

    left = ttk.Frame(body)
    ttk.Label(left, text="Categories").pack(anchor="w")
    tree = ttk.Treeview(left, show="tree", selectmode="browse")
    tree_scroll = ttk.Scrollbar(left, orient="vertical", command=tree.yview)
    tree.configure(yscrollcommand=tree_scroll.set)
    tree_scroll.pack(side="right", fill="y")
    tree.pack(side="left", fill="both", expand=True)
    w["tree_scroll"] = tree_scroll

    def rebuild_tree():
        """Fill the category tree from the persisted settings."""
        tree.delete(*tree.get_children(""))
        settings = load_settings(state_dir)
        w["grabber_nodes"] = {}
        for c in list_categories(settings):
            spec = CATEGORY_ICONS.get(c)
            img = _icon(spec[0], spec[1], 16, master=root) if spec else None
            if img is not None:
                w["icons"].append(img)
                w.setdefault("category_icons", []).append(img)
                node = tree.insert("", "end", text=c, image=img)
            else:
                node = tree.insert("", "end", text=c)
            if c == "Grabber projects":
                # The node is not a file category: it holds the saved
                # projects, one child each, openable with a double click.
                for name in grabber_project_names(settings):
                    w["grabber_nodes"][tree.insert(node, "end", text=name)] = name
                tree.item(node, open=True)
        w["categories"] = [tree.item(i, "text") for i in tree.get_children("")]
        w["categories_with_icons"] = sum(
            1 for i in tree.get_children("") if tree.item(i, "image")
        )

    rebuild_tree()
    w["tree"] = tree
    body.add(left, weight=1)

    # --- category context menu (right click), like IDM ---
    cat_menu = tk.Menu(root, tearoff=0)
    cat_menu.add_command(label="Add category...")
    cat_menu.add_command(label="Edit category...")
    cat_menu.add_command(label="Delete category")
    w["cat_menu"] = cat_menu
    w["cat_menu_items"] = ["Add category...", "Edit category...", "Delete category"]

    right = ttk.Frame(body)
    listview = ttk.Treeview(
        right, columns=[c[0] for c in COLUMNS], show="headings", selectmode="extended"
    )
    def _sort_by(key):
        view["reverse"] = not view["reverse"] if view["sort"] == key else False
        view["sort"] = key
        apply_items(view["items"])

    for key, title, width in COLUMNS:
        listview.heading(key, text=title,
                         command=lambda k=key: _sort_by(k))
        listview.column(key, width=width, anchor="w")
    # The list scrolls. It always did by wheel, but with nothing on screen to
    # say so and no way to drag -- a queue longer than the window looked like
    # the whole queue.
    list_scroll = ttk.Scrollbar(right, orient="vertical", command=listview.yview)
    listview.configure(yscrollcommand=list_scroll.set)
    list_scroll.pack(side="right", fill="y")
    listview.pack(side="left", fill="both", expand=True)
    w["list_scroll"] = list_scroll
    w["list"] = listview
    # The striping tags have to exist before the first refresh fills rows.
    tag_rows(listview, palette)

    # Vertical rules between the columns.
    #
    # Keeping them on the boundaries is harder than it looks: Tk has no event
    # for "a column changed width". <Configure> covers the window and the
    # divider, but NOT a user dragging a column border, and not Tk
    # redistributing widths on its own -- which it does, asynchronously, after
    # a width is set. So the widths are polled and the rules are redrawn only
    # when they actually move. CI caught exactly this: the rules sat at 360
    # while the column had settled at 319.
    w["grid_lines"] = []
    w["grid_widths"] = None

    def _redraw_grid(_event=None, force=False):
        if not listview.winfo_exists():
            return
        widths = tuple(listview.column(k, "width") for k in listview["columns"])
        if not force and widths == w["grid_widths"]:
            return
        w["grid_widths"] = widths
        grid_separators(listview, w["palette"], w["grid_lines"])

    def _poll_grid():
        if not listview.winfo_exists():
            return
        _redraw_grid()
        listview.after(400, _poll_grid)

    w["redraw_grid"] = lambda: _redraw_grid(force=True)
    listview.bind("<Configure>", _redraw_grid, add="+")
    listview.after(0, _poll_grid)
    body.add(right, weight=4)

    # --- download-list context menu (right click), like IDM ---
    list_menu = tk.Menu(root, tearoff=0)
    for _lab in ("Resume", "Stop", "Delete", "Delete Completed",
                 "Add to Queue", "Delete from Queue", "Properties"):
        list_menu.add_command(label=_lab)
    w["list_menu"] = list_menu
    w["list_menu_items"] = ["Resume", "Stop", "Delete", "Delete Completed",
                            "Add to Queue", "Delete from Queue", "Properties"]

    # --- progress + status bar at the bottom ---
    progress_row = ttk.Frame(root)
    progress_row.pack(fill="x", padx=6, pady=(4, 2))
    progress_text = tk.StringVar(value="")
    ttk.Label(progress_row, textvariable=progress_text, anchor="e").pack(
        side="right", padx=(8, 0))
    progress = ttk.Progressbar(progress_row, mode="determinate", maximum=100)
    progress.pack(side="left", fill="x", expand=True)
    status = tk.StringVar(value="Ready")
    ttk.Label(root, textvariable=status, relief="sunken", anchor="w").pack(
        fill="x", side="bottom"
    )
    w["progress"] = progress
    w["progress_text"] = progress_text
    w["status_var"] = status

    # --- actions ---
    def selected_id():
        sel = listview.selection()
        if not sel:
            return None
        # refresh() inserts every row with iid=str(item id); the id itself is
        # not a column, so reading values[0] would return the file name.
        try:
            return int(sel[0])
        except ValueError:
            return None

    def act(name):
        i = selected_id()
        try:
            if name == "Resume" and i is not None:
                api.resume(i)
            elif name == "Stop" and i is not None:
                api.pause(i)
            elif name == "Stop All":
                for it in api.items():
                    if it.get("status") == "running":
                        api.pause(it["id"])
            elif name == "Delete" and i is not None:
                api.remove(i)
        except Exception as e:  # noqa: BLE001
            status.set(f"error: {e}")
        refresh()

    for name, btn in w["buttons"]:
        if name == "Add URL":
            btn.config(command=lambda: _on_add())
        elif name in ("Resume", "Stop", "Stop All", "Delete"):
            btn.config(command=lambda n=name: act(n))
        elif name == "Options":
            btn.config(command=lambda: _open_options())
        elif name == "Scheduler":
            btn.config(command=lambda: _dialog_scheduler(root, api=api))
        elif name == "Delete Completed":
            btn.config(command=lambda: _delete_completed())
        elif name in ("Start Queue", "Stop Queue"):
            btn.config(command=lambda n=name: _queue_all(n))
        elif name == "Grabber":
            btn.config(command=lambda: _dialog_grabber(
                root, api=api, state_dir=state_dir, out_dir=out_dir))

    def _delete_completed():
        try:
            for it in api.items():
                if it.get("status") == "done":
                    api.remove(it["id"])
        except Exception as e:  # noqa: BLE001
            status.set(f"error: {e}")
        refresh()

    def _run_queue(queue, start):
        """Start or stop one queue. Downloads in other queues are untouched."""
        try:
            plan = queue_actions(api.items(), queue, start)
            for i in plan["resume"]:
                api.resume(i)
            for i in plan["pause"]:
                api.pause(i)
        except Exception as e:  # noqa: BLE001
            status.set(f"error: {e}")
            return 0
        return len(plan["resume"]) + len(plan["pause"])

    def _queue_all(name):
        # Start Queue / Stop Queue act on the queue selected in the tree, or on
        # the main queue when the selection is not a queue.
        queue = view["queue"]
        n = _run_queue(queue, name == "Start Queue")
        status.set(f"{name}: {n} file(s) in {queue or 'main queue'}")
        refresh()

    def _on_add():
        win, url_entry, auth = _dialog_add_url(root)

        def go(later=False):
            u = url_entry.get().strip()
            if not u:
                return
            win.destroy()
            # Every Options value that affects a download (target directory,
            # connections, user agent, proxy, temp dir) is resolved here.
            opts = download_options(load_settings(state_dir), u,
                                    fallback_dir=out_dir or ".")
            prefs = dialog_prefs(load_settings(state_dir))

            def _add(verb):
                try:
                    api.add(u, connections=opts["connections"],
                            aria2=bool(aria2_var.get()), options=opts)
                    status.set(f"{verb}: {basename(u)}")
                except Exception as e:  # noqa: BLE001
                    status.set(f"error: {e}")
                refresh()

            # "Show start download dialog" off means queue it straight away,
            # which is what the switch is for.
            if not prefs["show_start"]:
                _add("added" if prefs["start_immediately"] else "queued")
                return

            # IDM shows "Download File Info" next, with the real target folder.
            # The format list needs the engine (yt-dlp behind /api/formats) and
            # is empty for a plain file URL, which the dialog handles.
            try:
                available = api.formats(u, proxy=opts.get("proxy", ""))
            except Exception:  # noqa: BLE001
                available = []
            info_win, start, later_btn = _dialog_file_info(
                root, u, opts["out_dir"] or out_dir or ".", category_of(u),
                formats=available,
            )

            def _take_choices():
                chosen = info_win.selected_format()
                media = info_win.media_options()
                info_win.destroy()
                if chosen:
                    opts["format"] = chosen
                opts.update(media)

            def do_start():
                _take_choices()
                _add("added")

            def do_later():
                _take_choices()
                _add("queued")

            start.config(command=do_start)
            later_btn.config(command=do_later)
            _ = auth

        # The Add URL dialog has no direct add button in IDM; Enter proceeds.
        url_entry.bind("<Return>", lambda e: go())
        ttk.Button(win, text="OK", command=go).grid(row=2, column=1, sticky="e", padx=8, pady=8)

    def _on_open_properties(event=None):
        i = selected_id()
        if i is None:
            return
        it = next((x for x in api.items() if x["id"] == i), None)
        if not it:
            return
        # IDM shows the Download Progress dialog (per-connection graph) while a
        # download runs, and Properties once it is done.
        if it.get("status") in ("running", "pending"):
            _dialog_progress(
                root,
                basename(it.get("url", "")),
                connections=int(it.get("connections") or 4),
                on_pause=lambda: (api.pause(i), refresh()),
                meta_path=str(it.get("output", "")) + ".idmmeta",
            )
        else:
            before = {
                "url": it.get("url", ""),
                "output": str(it.get("output", "")),
                "description": it.get("description", "") or "",
            }

            def _save(edited, _i=i, _before=before):
                # Send only what changed: an unchanged URL must not be resent,
                # and a running download refuses url/output anyway.
                changed = {k: v for k, v in edited.items() if v != _before[k]}
                if not changed:
                    return
                try:
                    api.update(_i, **changed)
                except Exception as e:  # noqa: BLE001
                    import tkinter.messagebox as mb
                    mb.showerror("Properties", str(e), parent=root)
                    return
                refresh()

            _dialog_properties(root, it.get("url", ""), it.get("output", ""),
                               description=before["description"], on_ok=_save)

    listview.bind("<Double-1>", _on_open_properties)

    def _on_list_menu(event):
        # Windows does NOT select a Treeview row on right-click, so
        # listview.selection() would be empty and the menu would act on
        # nothing (the original silent no-op bug). Resolve the row under the
        # cursor explicitly and select it before showing the menu.
        row = listview.identify_row(event.y)
        if row:
            listview.selection_set(row)
            listview.focus(row)
        if not listview.selection():
            return
        try:
            list_menu.tk_popup(event.x_root, event.y_root)
        finally:
            list_menu.grab_release()

    listview.bind("<Button-3>", _on_list_menu)

    def _queue_toggle(label):
        """Move the selected download in or out of the current queue.

        It used to just resume/pause, which is not the same thing: a queued
        download waits for its queue to be started, rather than running now.
        """
        i = selected_id()
        if i is None:
            return
        try:
            if label == "Add to Queue":
                api.set_queue(i, view["queue"])
                # Queued, not running: the schedule or Start Queue starts it.
                api.pause(i)
                status.set(f"queued in {view['queue'] or 'main queue'}: {i}")
            else:
                api.set_queue(i, "")
                status.set(f"removed from queue: {i}")
        except Exception as e:  # noqa: BLE001
            status.set(f"error: {e}")
        refresh()

    list_menu.entryconfig("Resume", command=lambda: act("Resume"))
    list_menu.entryconfig("Stop", command=lambda: act("Stop"))
    list_menu.entryconfig("Delete", command=lambda: act("Delete"))
    list_menu.entryconfig("Delete Completed", command=lambda: _delete_completed())
    list_menu.entryconfig("Add to Queue", command=lambda: _queue_toggle("Add to Queue"))
    list_menu.entryconfig("Delete from Queue",
                          command=lambda: _queue_toggle("Delete from Queue"))
    list_menu.entryconfig("Properties", command=lambda: _on_open_properties())

    def _on_cat_menu(event):
        row = tree.identify_row(event.y)
        if row:
            tree.selection_set(row)
            tree.focus(row)
        try:
            cat_menu.tk_popup(event.x_root, event.y_root)
        finally:
            cat_menu.grab_release()

    tree.bind("<Button-3>", _on_cat_menu)

    def _selected_category():
        sel = tree.selection()
        if not sel:
            return None
        return category_for_node(sel[0], tree.item(sel[0], "text"),
                                 w.get("grabber_nodes", {}))

    def _add_category():
        cw, getter = _dialog_category(root, load_settings(state_dir))
        root.wait_window(cw)
        entry = getter()
        if entry:
            save_settings(state_dir, _upsert_category(
                load_settings(state_dir), entry))
            rebuild_tree()
            status.set(f"category added: {entry['name']}")

    def _edit_category():
        name = _selected_category()
        if not name:
            return
        cw, getter = _dialog_category(root, load_settings(state_dir))
        root.wait_window(cw)
        entry = getter()
        if entry:
            save_settings(state_dir, _upsert_category(
                load_settings(state_dir), entry, old_name=name))
            rebuild_tree()
            status.set(f"category saved: {entry['name']}")

    def _del_category():
        name = _selected_category()
        if not name:
            return
        if name in PROTECTED_CATEGORIES:
            status.set(f"category '{name}' cannot be deleted")
            return
        save_settings(state_dir, _delete_category(load_settings(state_dir), name))
        rebuild_tree()
        status.set(f"category deleted: {name}")

    cat_menu.entryconfig("Add category...", command=_add_category)
    cat_menu.entryconfig("Edit category...", command=_edit_category)
    cat_menu.entryconfig("Delete category", command=_del_category)

    def _open_options():
        _dialog_options(
            root,
            settings=load_settings(state_dir),
            # Migrate on the way out: reading settings.json stays reading,
            # and an OK in this dialog is what moves the passwords.
            on_save=lambda st: save_settings(
                state_dir, migrate_site_logins(st, api.store_password)),
            state_dir=state_dir,
            out_dir=out_dir,
            api=api,
        )

    # Last status per item id, so apply_items can spot a download finishing.
    completion_seen = {}

    def _on_completed(it):
        """IDM's post-download steps: dialog, sound, virus check."""
        path = it.get("output") or basename(it.get("url", ""))
        plan = completion_plan(load_settings(state_dir), path)
        if plan["sound"]:
            play_sound(plan["sound"])
        if plan["virus_argv"]:
            try:
                subprocess.Popen(plan["virus_argv"], stdout=subprocess.DEVNULL,
                                 stderr=subprocess.DEVNULL)
                status.set(f"virus check started: {basename(path)}")
            except Exception as e:  # noqa: BLE001
                status.set(f"virus check failed: {e}")
        if plan["show_dialog"]:
            try:
                _dialog_complete(root, path, state_dir=state_dir)
            except Exception:  # noqa: BLE001
                pass

    # What the list is currently showing: the tree selection, the Search box
    # and the column the user sorted by. Kept so re-filtering does not need
    # another API round trip.
    view = {"category": "All Downloads", "query": "", "sort": None,
            "reverse": False, "items": [], "queue": DEFAULT_QUEUE}

    def apply_items(items):
        """Render a queue snapshot. Must run on the Tk thread."""
        view["items"] = list(items or [])
        items = filter_items(items, view["category"], view["query"],
                             load_settings(state_dir))
        if view["sort"]:
            items = sort_items(items, view["sort"], view["reverse"])
        seen = set()
        # The Category cell reads the user's custom categories, so the same
        # snapshot of settings the view filter used is handed along.
        row_settings = load_settings(state_dir)
        for row, it in enumerate(items):
            try:
                iid = str(it["id"])
                st = it.get("status", "")
                # One value per column in COLUMNS; the id lives in the iid.
                vals = row_values(it, row_settings)
            except Exception:  # noqa: BLE001
                continue
            seen.add(iid)
            # Striping is positional, so it has to be reapplied on every pass:
            # a row that moves (a sort, a filter, a deletion above it) changes
            # parity, and a tag left from its old position would make two
            # neighbours share a shade.
            stripe = ("odd",) if row % 2 else ("even",)
            if status_tag(st):
                stripe += (status_tag(st),)
            if listview.exists(iid):
                listview.item(iid, values=vals, tags=stripe)
            else:
                listview.insert("", "end", iid=iid, values=vals, tags=stripe)
        for iid in list(listview.get_children()):
            if iid not in seen:
                listview.delete(iid)
        # The bottom bar is the whole queue: every running download, also
        # those the current category hides.
        summary = queue_summary(view["items"])
        progress["value"] = summary["percent"]
        progress_text.set(summary["text"])
        # Anything that just finished gets IDM's post-download treatment.
        # Driven from the unfiltered snapshot: a download hidden by the current
        # category still finished.
        for i in just_completed(completion_seen, view["items"]):
            it = next((x for x in view["items"] if x.get("id") == i), None)
            if it:
                _on_completed(it)

    def refresh():
        try:
            items = api.items()
        except Exception:  # noqa: BLE001
            status.set("cannot reach idm --serve")
            return
        apply_items(items)

    w["apply_items"] = apply_items
    w["view"] = view

    # --- Search box and category tree drive the list -----------------------
    # Both are created above, before `view` exists, so they are bound here.
    def _on_search(_e=None):
        view["query"] = w["search"].get()
        apply_items(view["items"])

    w["search"].bind("<KeyRelease>", _on_search)
    w["search"].bind("<Return>", _on_search)

    def _on_tree_select(_e=None):
        name = _selected_category()
        if not name:
            return
        view["category"] = name
        if name in queue_names(load_settings(state_dir)):
            view["queue"] = name
        apply_items(view["items"])
        status.set(f"category: {name}")

    tree.bind("<<TreeviewSelect>>", _on_tree_select)

    def _open_grabber_project(_e=None):
        """Double-clicking a saved project opens the Grabber on it."""
        sel = tree.selection()
        name = w.get("grabber_nodes", {}).get(sel[0]) if sel else None
        if not name:
            return None
        status.set(f"grabber project: {name}")
        return _dialog_grabber(root, api=api, state_dir=state_dir,
                               out_dir=out_dir, project=name)

    tree.bind("<Double-1>", _open_grabber_project)
    w["open_grabber_project"] = _open_grabber_project

    # --- menu bar, like IDM (File / Downloads / View / Help) ---
    menubar = tk.Menu(root)

    file_menu = tk.Menu(menubar, tearoff=0)
    file_menu.add_command(label="Add URL...", command=lambda: _on_add())
    file_menu.add_command(label="Options...", command=lambda: _open_options())
    file_menu.add_separator()
    file_menu.add_command(label="Exit", command=root.destroy)
    menubar.add_cascade(label="File", menu=file_menu)

    downloads_menu = tk.Menu(menubar, tearoff=0)
    downloads_menu.add_command(label="Resume", command=lambda: act("Resume"))
    downloads_menu.add_command(label="Stop", command=lambda: act("Stop"))
    downloads_menu.add_command(label="Stop All", command=lambda: act("Stop All"))
    downloads_menu.add_command(label="Delete", command=lambda: act("Delete"))
    downloads_menu.add_command(label="Delete Completed",
                               command=lambda: _delete_completed())
    menubar.add_cascade(label="Downloads", menu=downloads_menu)

    # Tasks: the things that act on the queue as a whole, plus the two ways of
    # getting links in without the browser extension (clipboard, drop target).
    tasks_menu = tk.Menu(menubar, tearoff=0)
    tasks_items = []

    def _tasks_add(label, command):
        tasks_menu.add_command(label=label, command=command)
        tasks_items.append(label)

    _tasks_add("Add Batch of URLs from Clipboard",
               lambda: _add_batch_from_clipboard())
    _tasks_add("Show/Hide Drop Target", lambda: _toggle_drop_target())
    tasks_menu.add_separator()
    _tasks_add("Start Queue", lambda: _queue_all("Start Queue"))
    _tasks_add("Stop Queue", lambda: _queue_all("Stop Queue"))
    _tasks_add("Stop All", lambda: act("Stop All"))
    tasks_menu.add_separator()
    _tasks_add("Scheduler...",
               lambda: _dialog_scheduler(
                   root, api=api, state_dir=state_dir,
                   queue_names=queue_names(load_settings(state_dir))))
    menubar.add_cascade(label="Tasks", menu=tasks_menu)
    w["tasks_menu"] = tasks_menu
    w["tasks_menu_items"] = tasks_items

    view_menu = tk.Menu(menubar, tearoff=0)
    view_menu.add_command(label="Scheduler...",
                          command=lambda: _dialog_scheduler(
                              root, api=api, state_dir=state_dir,
                              queue_names=queue_names(load_settings(state_dir))))
    view_menu.add_command(label="Options...", command=lambda: _open_options())
    view_menu.add_command(label="Grabber...",
                          command=lambda: _dialog_grabber(
                              root, api=api, state_dir=state_dir, out_dir=out_dir))
    menubar.add_cascade(label="View", menu=view_menu)

    help_menu = tk.Menu(menubar, tearoff=0)
    help_menu.add_command(label="About IDM...",
                          command=lambda: _dialog_about(root))
    menubar.add_cascade(label="Help", menu=help_menu)

    try:
        root.config(menu=menubar)
    except Exception:  # noqa: BLE001
        pass
    w["menubar"] = menubar
    w["menus"] = ["File", "Downloads", "Tasks", "View", "Help"]

    # --- clipboard monitor (Options -> General) -------------------------
    # IDM watches the clipboard for URLs and offers to download them
    # (docs/idm/using_idm_starting.txt). We poll, since Tk has no clipboard
    # event, and remember the last seen value so we only react to new URLs.
    clip_state = {"last": ""}

    def _add_url_now(url):
        opts = download_options(load_settings(state_dir), url,
                                fallback_dir=out_dir or ".")
        try:
            api.add(url, connections=opts["connections"],
                    aria2=bool(aria2_var.get()), options=opts)
            status.set(f"added: {basename(url)}")
        except Exception as e:  # noqa: BLE001
            status.set(f"error: {e}")
        refresh()

    def _poll_clipboard():
        try:
            if load_settings(state_dir)["general"].get("monitor_clipboard", True):
                text = ""
                try:
                    text = root.clipboard_get()
                except Exception:  # noqa: BLE001
                    text = ""
                if (text and text != clip_state["last"]
                        and looks_like_url(text)):
                    clip_state["last"] = text
                    _prompt_clipboard(text)
        except Exception:  # noqa: BLE001
            pass
        root.after(1000, _poll_clipboard)

    def _prompt_clipboard(url):
        import tkinter.messagebox as mb
        if mb.askyesno("Internet Download Manager",
                       f"Stáhnout tento odkaz?\n\n{url}"):
            _add_url_now(url)

    root.after(1500, _poll_clipboard)
    w["add_url_now"] = _add_url_now

    # --- Tasks -> add a batch of URLs from the clipboard -----------------
    # People copy a whole list of links at once; we queue every URL in the
    # copied text rather than making them paste one at a time.
    def _add_batch_from_clipboard(text=None):
        if text is None:
            try:
                text = root.clipboard_get()
            except Exception:  # noqa: BLE001
                text = ""
        urls = extract_urls(text)
        if not urls:
            status.set("clipboard: no URL found")
            return []
        for u in urls:
            _add_url_now(u)
        status.set(f"clipboard: added {len(urls)} file(s)")
        return urls

    w["add_batch_from_clipboard"] = _add_batch_from_clipboard

    # --- Tasks -> show/hide the floating drop target ---------------------
    drop_state = {"win": None}

    def _toggle_drop_target():
        win = drop_state["win"]
        if win is not None and win.winfo_exists():
            win.destroy()
            drop_state["win"] = None
            status.set("drop target hidden")
            return None
        win, _handle = _dialog_drop_target(
            root, on_urls=lambda urls: [_add_url_now(u) for u in urls])
        drop_state["win"] = win
        w["drop_target"] = win
        status.set("drop target shown")
        return win

    def _drop_target_visible():
        win = drop_state["win"]
        return bool(win is not None and win.winfo_exists())

    w["toggle_drop_target"] = _toggle_drop_target
    w["drop_target_visible"] = _drop_target_visible

    # --- scheduler tick (Scheduler -> Schedule) -------------------------
    # The schedule itself lives in settings.json; this is what makes it fire.
    # Only transitions act, so a queue is not re-resumed every tick.
    sched_state = {}

    def _tick_schedule():
        try:
            now = time.localtime()
            for queue, should_run in schedule_transitions(
                    load_settings(state_dir), sched_state,
                    (now.tm_hour, now.tm_min, now.tm_sec)):
                n = _run_queue(queue, should_run)
                verb = "started" if should_run else "stopped"
                status.set(f"scheduler {verb} {queue}: {n} file(s)")
                refresh()
        except Exception:  # noqa: BLE001
            pass
        root.after(15000, _tick_schedule)

    root.after(2000, _tick_schedule)
    w["tick_schedule"] = _tick_schedule

    # --- drag & drop onto the window (best effort) ----------------------
    # IDM accepts hyperlinks dragged from a browser. That needs an optional
    # extension; when it is missing we still accept dropped text/URLs through
    # Tk's own selection mechanism on the list area.
    try:
        from tkinterdnd2 import DND_TEXT, TkinterDnD  # noqa: F401
        _have_dnd = True
    except Exception:  # noqa: BLE001
        _have_dnd = False
    w["has_dnd"] = _have_dnd

    def _drop_text(_event, data=None):
        # A browser can hand over several links at once, so take them all.
        for url in extract_urls(data or ""):
            _add_url_now(url)
        return "break"

    w["drop_text"] = _drop_text

    root.protocol(
        "WM_DELETE_WINDOW",
        lambda: ((on_close and on_close()), root.destroy()) if True else root.destroy(),
    )
    return root, refresh, w


def _button_has_icon(btn):
    try:
        return bool(btn.cget("image"))
    except Exception:  # noqa: BLE001
        return False


def token_path(state_dir: str) -> str:
    return os.path.join(state_dir, "api-token")


def read_token(state_dir: str) -> str:
    """The API secret the engine wrote for us (empty if it is not there yet)."""
    try:
        with open(token_path(state_dir), "r", encoding="utf-8") as f:
            return f.read().strip()
    except OSError:
        return ""


def new_token() -> str:
    return secrets.token_hex(24)


def spawn_server(engine, addr, out_dir, state_dir, token: str = "",
                 log_dir: str = ""):
    os.makedirs(out_dir, exist_ok=True)
    os.makedirs(state_dir, exist_ok=True)
    cmd = [engine, "--serve", addr, "--output-dir", out_dir, "--state-dir", state_dir]
    if token:
        cmd += ["--api-token", token]
    # The engine's own stderr is the only place "address in use" or a missing
    # dependency is ever stated. Sending it to DEVNULL is what made a failed
    # start indistinguishable from a working one, so it goes to a file we can
    # quote back to the user.
    log = subprocess.DEVNULL
    if log_dir:
        try:
            os.makedirs(log_dir, exist_ok=True)
            log = open(os.path.join(log_dir, "engine.log"), "ab", buffering=0)
        except OSError:
            log = subprocess.DEVNULL
    kwargs = {
        "stdout": subprocess.DEVNULL,
        "stderr": log,
    }
    # The engine is a headless backend, never something the user should see.
    # On Windows a console-subsystem binary spawned from a GUI process would
    # otherwise flash (or keep) a black console window; CREATE_NO_WINDOW keeps
    # it invisible and DETACHED_PROCESS makes it independent of our terminal.
    if os.name == "nt":
        CREATE_NO_WINDOW = 0x08000000
        DETACHED_PROCESS = 0x00000008
        kwargs["creationflags"] = CREATE_NO_WINDOW | DETACHED_PROCESS
    else:
        # Fully detach from our session so a closed terminal cannot kill it.
        kwargs["start_new_session"] = True
    return subprocess.Popen(cmd, **kwargs)


def server_addr_plan(addr: str, tries: int = 4):
    """The addresses to try, in order, starting with the configured one.

    Mirrors open_display()'s recovery for X display numbers: a rejected
    candidate is not a dead end, the plan simply moves on. The host is never
    rewritten -- the queue API has no authentication beyond the token and must
    stay on loopback.
    """
    host, sep, port = addr.rpartition(":")
    if not sep or not port.isdigit():
        yield addr
        return
    base = int(port)
    for i in range(max(1, tries)):
        yield f"{host}:{base + i}"


def engine_log_tail(state_dir: str, limit: int = 300) -> str:
    """The last thing the engine said, short enough to put in a dialog.

    The engine's stderr used to go to DEVNULL, so "address in use" -- the
    reason downloads silently did nothing -- was unrecoverable. It is now kept
    in STATE_DIR/engine.log and the tail is what the user gets told.
    """
    path = os.path.join(state_dir or ".", "engine.log")
    try:
        with open(path, "rb") as f:
            try:
                f.seek(-4096, os.SEEK_END)
            except OSError:
                f.seek(0)
            raw = f.read().decode("utf-8", "replace")
    except OSError:
        return ""
    lines = [ln.strip() for ln in raw.splitlines() if ln.strip()]
    if not lines:
        return ""
    return lines[-1][-limit:]


def server_decision(listening: bool, authorized: bool,
                    child_alive=None) -> dict:
    """What to do about the queue API, given what a probe just saw.

    `listening` -- something answered on the address at all.
    `authorized` -- it accepted our api-token, which is the only evidence we
    can have that the server on that port is the one WE started: the token is
    generated per install and passed to our own child.
    `child_alive` -- our spawned engine is still running (None: we have not
    spawned one in this launch).

    This exists because a `idm --serve` left over from an earlier install kept
    holding the port. Our engine then died with "address in use" while the
    stranger answered every request with 403, and the window sat there looking
    healthy and downloading nothing. A connect that succeeds says only that
    SOMEBODY is listening -- engine/tests/gui.rs has guarded against the same
    confusion for a while, and this is production catching up.
    """
    if listening and authorized:
        return {"action": "use", "reason": "our server answered"}
    if listening and not authorized:
        # Somebody else's engine (or anything else) holds the address. Talking
        # to it is never right: at best every call is refused, at worst we
        # would be driving a queue that belongs to another install.
        return {
            "action": "other_port",
            "reason": "foreign server: the address answered but refused our token",
            "message": "Na adrese posloucha jiny server (odmitl nas token). "
                       "Zkousim jiny port.",
        }
    if child_alive:
        return {"action": "wait", "reason": "our child is still starting"}
    if child_alive is None:
        return {"action": "spawn", "reason": "nothing is listening yet"}
    return {
        "action": "failed",
        "reason": "our child exited without serving",
        "message": "Engine se nespustil a na adrese nic neposlouch\u00e1. "
                   "Stahovani nebude fungovat.",
    }


def wait_alive(api, seconds=15.0):
    deadline = time.time() + seconds
    while time.time() < deadline:
        if api.alive():
            return True
        time.sleep(0.2)
    return False


# --------------------------------------------------------------------------- #
# Self-tests
# --------------------------------------------------------------------------- #
def selftest_api(addr, url, token=""):
    api = Api(addr, token=token)
    if not wait_alive(api, 15):
        print("SELFTEST-API: FAIL not-alive", file=sys.stderr)
        return 1
    i = api.add(url)
    print(f"SELFTEST-API: added id={i}", flush=True)
    deadline = time.time() + 60
    last = None
    while time.time() < deadline:
        items = api.items()
        it = next((x for x in items if x["id"] == i), None)
        if it:
            last = it
            if it.get("status") == "done":
                print("SELFTEST-API: done", flush=True)
                print("SELFTEST-API: OK", flush=True)
                return 0
            if it.get("status") == "error":
                print(f"SELFTEST-API: FAIL error={it.get('error')}", file=sys.stderr)
                return 1
        time.sleep(0.2)
    print(f"SELFTEST-API: FAIL timeout last={last}", file=sys.stderr)
    return 1


def selftest_settings(state_dir):
    """Exercise the settings layer: change -> save -> reload must round-trip."""
    s = load_settings(state_dir)
    s["connection"]["max_connections"] = 3
    s["downloads"]["show_complete_dialog"] = False
    save_settings(state_dir, s)
    r = load_settings(state_dir)
    if r["connection"]["max_connections"] != 3:
        print("SETTINGS: FAIL max_connections not persisted", file=sys.stderr)
        return 1
    if r["downloads"]["show_complete_dialog"] is not False:
        print("SETTINGS: FAIL show_complete_dialog not persisted", file=sys.stderr)
        return 1
    if not os.path.exists(settings_path(state_dir)):
        print("SETTINGS: FAIL settings.json missing", file=sys.stderr)
        return 1
    print("SETTINGS: OK", flush=True)
    return 0


def selftest_options_data(state_dir):
    """Exercise the Options list sections: edit -> save -> reload must survive.

    These are the sections that used to be dropped silently (site logins) or
    rendered read-only (exceptions, category dirs, sound events).
    """
    s = load_settings(state_dir)

    # A login that gets edited afterwards, and one that gets removed again.
    s = _upsert_site_login(s, "https://example.com/files", "bob", "old")
    s = _upsert_site_login(s, "https://example.com/files", "alice", "s3cret")
    s = _upsert_site_login(s, "https://gone.example.com/", "x", "y")
    s = _delete_site_login(s, "https://gone.example.com/")

    s = _upsert_exception(s, "slow.example.com", 2)
    s = _upsert_exception(s, "drop.example.com", 1)
    s = _delete_exception(s, "drop.example.com")

    s = _set_category_dir(s, "Video", "/data/video")
    s = _set_category_dir(s, "Music", "/data/music")
    s = _set_category_dir(s, "Music", "")  # clearing removes the override

    s = _set_sound_event(s, "Download complete", "/usr/share/done.wav")

    # Addresses excluded from automatic capture: the extension reads these
    # through the host, so they have to survive a save/reload like the rest.
    s["file_types"]["exclude_addresses"] = ["*/ads/*", "*/tracker/*"]
    s["file_types"]["exclude_addresses"].remove("*/tracker/*")

    save_settings(state_dir, s)
    r = load_settings(state_dir)

    def fail(msg):
        print("OPTIONS-DATA: FAIL " + msg, file=sys.stderr)

    login = _find_site_login(r, "https://example.com/files")
    if not login:
        fail("site login not persisted")
        return 1
    if (login.get("user"), login.get("password")) != ("alice", "s3cret"):
        fail("editing a site login did not replace it: %r" % (login,))
        return 1
    if len([x for x in r["site_logins"]
            if x.get("url") == "https://example.com/files"]) != 1:
        fail("duplicate site login records for one URL")
        return 1
    if _find_site_login(r, "https://gone.example.com/"):
        fail("removed site login came back")
        return 1

    excs = {e["server"]: e["connections"] for e in r["connection"]["exceptions"]}
    if excs.get("slow.example.com") != 2 or "drop.example.com" in excs:
        fail("connection exceptions not persisted: %r" % (excs,))
        return 1

    dirs = r["save_to"]["category_dirs"]
    if dirs.get("Video") != "/data/video" or "Music" in dirs:
        fail("category dirs not persisted: %r" % (dirs,))
        return 1

    if r["sounds"]["events"].get("Download complete") != "/usr/share/done.wav":
        fail("sound event not persisted: %r" % (r["sounds"]["events"],))
        return 1

    if r["file_types"]["exclude_addresses"] != ["*/ads/*"]:
        fail("excluded addresses not persisted: %r"
             % (r["file_types"]["exclude_addresses"],))
        return 1

    print("OPTIONS-DATA: OK", flush=True)
    return 0


def selftest_download_options(state_dir, url):
    """Print the engine options the persisted settings produce for `url`."""
    opts = download_options(load_settings(state_dir), url)
    print("OPTIONS:" + json.dumps(redact_options(opts), sort_keys=True),
          flush=True)
    return 0


def selftest_add_body(state_dir, url):
    """Prove the options actually reach /api/add as a request body.

    Runs a one-shot stub of the engine's API on localhost, calls Api.add the
    way the window does, and prints the body the engine would receive.
    """
    import http.server

    received = {}

    class Handler(http.server.BaseHTTPRequestHandler):
        def do_POST(self):  # noqa: N802
            n = int(self.headers.get("Content-Length") or 0)
            received.update(json.loads(self.rfile.read(n) or b"{}"))
            out = b'{"ok":true,"id":1}'
            self.send_response(200)
            self.send_header("Content-Type", "application/json")
            self.send_header("Content-Length", str(len(out)))
            self.end_headers()
            self.wfile.write(out)

        def log_message(self, *a):  # silence the stub
            pass

    srv = http.server.HTTPServer(("127.0.0.1", 0), Handler)
    threading.Thread(target=srv.handle_request, daemon=True).start()

    settings = load_settings(state_dir)
    opts = download_options(settings, url)
    api = Api("127.0.0.1:%d" % srv.server_address[1], timeout=5.0)
    api.add(url, connections=opts["connections"], options=opts)
    srv.server_close()

    if not received:
        print("BODY: FAIL nothing reached /api/add", file=sys.stderr)
        return 1
    print("BODY:" + json.dumps(redact_options(received), sort_keys=True),
          flush=True)
    return 0


def _stub_api(handler_body, count=1):
    """Run a one-shot API stub and return (api, seen) for the GUI's Api."""
    import http.server

    seen = []

    class Handler(http.server.BaseHTTPRequestHandler):
        def do_POST(self):  # noqa: N802
            n = int(self.headers.get("Content-Length") or 0)
            seen.append((self.path, json.loads(self.rfile.read(n) or b"{}")))
            out = json.dumps(handler_body).encode()
            self.send_response(200)
            self.send_header("Content-Type", "application/json")
            self.send_header("Content-Length", str(len(out)))
            self.end_headers()
            self.wfile.write(out)

        def log_message(self, *a):  # silence the stub
            pass

    srv = http.server.HTTPServer(("127.0.0.1", 0), Handler)
    threading.Thread(
        target=lambda: [srv.handle_request() for _ in range(count)], daemon=True
    ).start()
    return Api("127.0.0.1:%d" % srv.server_address[1], timeout=5.0), seen, srv


REF_FOR_TESTS = "secret:0123456789abcdef"


def selftest_add_ref():
    """A login with a reference must reach /api/add as the two ref fields."""
    settings = _deep_merge(DEFAULT_SETTINGS, {
        "site_logins": [{"url": "https://f.example.com/", "user": "alice",
                         "password_ref": REF_FOR_TESTS}],
    })
    url = "https://f.example.com/private/a.zip"
    opts = download_options(settings, url)
    api, seen, srv = _stub_api({"ok": True, "id": 1})
    api.add(url, connections=opts["connections"], options=opts)
    srv.server_close()
    if not seen:
        print("ADDREF: FAIL nothing reached /api/add", file=sys.stderr)
        return 1
    print("ADDREF:" + json.dumps(seen[0][1], sort_keys=True), flush=True)
    return 0


def selftest_store_password():
    """Saving a site login must store the password and keep only its ref."""
    api, seen, srv = _stub_api({"ok": True, "ref": REF_FOR_TESTS})
    ref = api.store_password("tr0ub4dor")
    srv.server_close()
    record = {}
    if ref:
        out = _upsert_site_login({}, "https://f.example.com/", "alice",
                                 "tr0ub4dor", ref)
        record = out["site_logins"][0]
    print("STORED:" + json.dumps({
        "path": seen[0][0] if seen else "",
        "sent": seen[0][1] if seen else {},
        "ref": ref,
        "record": record,
    }, sort_keys=True), flush=True)
    return 0


def selftest_migrate_logins():
    """Prove a save migrates the plaintext logins and keeps the rest."""
    sent = []

    def store(password):
        sent.append(password)
        return "secret:%016x" % len(sent)

    def refuse(_password):
        return ""

    settings = {"site_logins": [
        {"url": "https://a/", "user": "alice", "password": "s3cret"},
        {"url": "https://b/", "user": "bob", "password": "hunter2"},
        {"url": "https://c/", "user": "carol", "password_ref": REF_FOR_TESTS},
        {"url": "https://nopass/", "user": "anon", "password": ""},
    ]}
    after = migrate_site_logins(settings, store)
    one = {"site_logins": [{"url": "https://a/", "user": "alice",
                            "password": "s3cret"}]}
    refused = migrate_site_logins(one, refuse)["site_logins"][0]

    with_password = [r for r in after["site_logins"] if r.get("password_ref")]
    untouched = [r for r in after["site_logins"]
                 if not r.get("password_ref")]
    print("MIGRATED:" + json.dumps({
        "sent": sent,
        "after": with_password,
        "untouched": untouched[0] if untouched else {},
        "on_refusal": refused,
    }, sort_keys=True), flush=True)
    return 0


SAMPLE_FORMATS = [
    {"format_id": "137", "ext": "mp4", "resolution": "1920x1080",
     "vcodec": "avc1", "acodec": "none", "filesize": 5_000_000,
     "note": "1080p", "kind": "video only"},
    {"format_id": "140", "ext": "m4a", "resolution": "audio only",
     "vcodec": "none", "acodec": "mp4a", "kind": "audio only"},
]


def selftest_formats_body():
    """Api.formats must ask /api/formats and return the parsed list."""
    api, seen, srv = _stub_api({"ok": True, "title": "T", "formats": SAMPLE_FORMATS})
    returned = api.formats("https://example.com/watch?v=x", cookie="SID=1")
    srv.server_close()
    if not seen:
        print("FORMATS: FAIL nothing reached the engine", file=sys.stderr)
        return 1
    print("FORMATS:" + json.dumps(
        {"path": seen[0][0], "body": seen[0][1], "returned": returned},
        sort_keys=True), flush=True)
    return 0


def selftest_format_labels():
    """The dialog's entries, built from a format list."""
    print("LABELS:" + json.dumps(format_labels(SAMPLE_FORMATS)), flush=True)
    return 0


def selftest_add_format():
    """A chosen format (and the media headers) must reach /api/add."""
    api, seen, srv = _stub_api({"ok": True, "id": 1})
    api.add("https://example.com/watch?v=x", connections=4, options={
        "format": "137+140",
        "cookie": "SID=1",
        "referer": "https://example.com/watch",
        "force_media": True,
    })
    srv.server_close()
    if not seen:
        print("ADD: FAIL nothing reached /api/add", file=sys.stderr)
        return 1
    print("ADD:" + json.dumps(seen[0][1], sort_keys=True), flush=True)
    return 0


def selftest_file_info():
    """The Download File Info dialog must offer the formats it was given."""
    import tkinter as tk

    root = tk.Tk()
    root.withdraw()
    win, _start, _later = _dialog_file_info(
        root, "https://example.com/watch?v=x", "/tmp", "Video",
        formats=SAMPLE_FORMATS,
    )

    combos = []
    for w in win.winfo_children():
        if w.winfo_class() == "TCombobox":
            combos.append(" ".join(str(v) for v in w.cget("values")))
    # Pick the 1080p row and read back the selector the caller would get.
    fmt_combo = None
    for w in win.winfo_children():
        if w.winfo_class() == "TCombobox" and any(
                "137" in str(v) for v in w.cget("values")):
            fmt_combo = w
    if fmt_combo is None:
        print("FILE-INFO: FAIL no format combo", file=sys.stderr)
        return 1
    for value in fmt_combo.cget("values"):
        if str(value).startswith("137"):
            fmt_combo.set(value)
    selected = win.selected_format()
    format_values = [str(v) for v in fmt_combo.cget("values")]

    # The media controls: what they are called, and what they hand back once
    # a user has filled them in.
    labels, checkboxes, entries = [], [], []
    for w in win.winfo_children():
        cls = w.winfo_class()
        if cls == "TLabel":
            labels.append(w.cget("text"))
        elif cls == "TCheckbutton":
            checkboxes.append(w.cget("text"))
            w.invoke()
        elif cls == "TEntry":
            entries.append(w)
    by_label = {}
    for w in win.winfo_children():
        if w.winfo_class() == "TLabel":
            row = w.grid_info().get("row")
            for e in entries:
                if e.grid_info().get("row") == row:
                    by_label[w.cget("text")] = e
    if "Cookie:" in by_label:
        by_label["Cookie:"].insert(0, "SID=1")
    if "Referer:" in by_label:
        by_label["Referer:"].insert(0, "https://example.com/watch")
    media = win.media_options()
    root.destroy()

    print("FILE-INFO:" + json.dumps({
        "combos": combos,
        "format_values": format_values,
        "selected_format": selected,
        "labels": labels,
        "checkboxes": checkboxes,
        "media_options": media,
    }), flush=True)
    return 0


def selftest_properties_body():
    """Prove Api.update reaches /api/update with only the edited fields."""
    import http.server

    seen = []

    class Handler(http.server.BaseHTTPRequestHandler):
        def do_POST(self):  # noqa: N802
            n = int(self.headers.get("Content-Length") or 0)
            seen.append((self.path, json.loads(self.rfile.read(n) or b"{}")))
            out = b'{"ok":true}'
            self.send_response(200)
            self.send_header("Content-Type", "application/json")
            self.send_header("Content-Length", str(len(out)))
            self.end_headers()
            self.wfile.write(out)

        def log_message(self, *a):  # silence the stub
            pass

    srv = http.server.HTTPServer(("127.0.0.1", 0), Handler)
    threading.Thread(target=lambda: [srv.handle_request(), srv.handle_request()],
                     daemon=True).start()
    api = Api("127.0.0.1:%d" % srv.server_address[1], timeout=5.0)
    api.update(4, url="https://example.com/new.bin", output="/tmp/renamed.bin",
               description="a note")
    api.update(4, description="only this")
    srv.server_close()

    if len(seen) != 2:
        print("PROPS: FAIL %d requests reached the engine" % len(seen), file=sys.stderr)
        return 1
    print("PROPS:" + json.dumps(
        {"path": seen[0][0], "full": seen[0][1], "partial": seen[1][1]},
        sort_keys=True), flush=True)
    return 0


def selftest_properties_ok():
    """The Properties dialog must hand its (edited) fields to the caller."""
    import tkinter as tk

    root = tk.Tk()
    root.withdraw()
    got = {}
    win = _dialog_properties(root, "https://example.com/old.bin", "/tmp/old.bin",
                             description="old note", on_ok=got.update)

    entries = [w for w in win.winfo_children() if w.winfo_class() == "TEntry"]
    if len(entries) != 3:
        print("PROPS-OK: FAIL expected 3 entries, got %d" % len(entries), file=sys.stderr)
        return 1
    for entry, value in zip(entries, ["https://example.com/edited.bin",
                                      "/tmp/edited.bin", "edited note"]):
        entry.delete(0, "end")
        entry.insert(0, value)

    ok = None
    for frame in win.winfo_children():
        for w in getattr(frame, "winfo_children", lambda: [])():
            if w.winfo_class() == "TButton" and str(w.cget("text")) == "OK":
                ok = w
    if ok is None:
        print("PROPS-OK: FAIL no OK button", file=sys.stderr)
        return 1
    ok.invoke()
    root.destroy()

    print("PROPS-OK:" + json.dumps(got, sort_keys=True), flush=True)
    return 0


def selftest_grabber_explore(url, template="All files", depth=None,
                             external_depth=None, same_site_only=True,
                             include="", exclude=""):
    """Explore a real site through the Grabber dialog and print what it found.

    This drives the widgets, not crawl_site() directly: the point is that the
    template combobox and the depth boxes are what the crawl obeys.
    """
    import tkinter as tk

    root = tk.Tk()
    root.withdraw()
    win = _dialog_grabber(root)
    win.withdraw()
    g = win._idm_grabber

    g["start"].delete(0, "end")
    g["start"].insert(0, url)
    g["template"].set(template)
    g["template"].event_generate("<<ComboboxSelected>>")
    g["same_site"].set(bool(same_site_only))
    if depth is not None:
        g["depth"].set(depth)
    if external_depth is not None:
        g["external_depth"].set(external_depth)
    g["include"].delete(0, "end")
    g["include"].insert(0, include)
    g["exclude"].delete(0, "end")
    g["exclude"].insert(0, exclude)
    g["explore"]()

    # A real event loop, not a poll of update(): the crawl thread hands its
    # result back with win.after(), and a Tcl call from another thread is only
    # delivered while the main thread sits in mainloop().
    def poll():
        if g["crawl"]["busy"]:
            root.after(50, poll)
        else:
            root.quit()

    root.after(50, poll)
    root.after(60000, root.quit)   # never hang a test run
    root.mainloop()

    found = list(g["state"]["files"])
    try:
        win.destroy()
        root.destroy()
    except Exception:  # noqa: BLE001
        pass
    print("GRAB:" + json.dumps(found), flush=True)
    return 0


def selftest_grabber_project(state_dir):
    """Save the Grabber wizard as a project, then open it in a fresh dialog."""
    import tkinter as tk

    root = tk.Tk()
    root.withdraw()

    win = _dialog_grabber(root, state_dir=state_dir)
    win.withdraw()
    g = win._idm_grabber
    g["proj"].set("Nightly")
    g["start"].delete(0, "end")
    g["start"].insert(0, "https://example.com/files/")
    g["template"].set("Images")
    g["template"].event_generate("<<ComboboxSelected>>")
    g["same_site"].set(False)
    g["max_pages"].set(7)
    g["depth"].set(4)
    g["external_depth"].set(2)
    g["include"].insert(0, "/files/")
    g["exclude"].insert(0, "thumb")
    root.update()

    # Click the button, not the function behind it.
    for b in _buttons_by_text(win, "Save Project"):
        b.invoke()
    win.destroy()

    saved = grabber_project(load_settings(state_dir), "Nightly")

    win2 = _dialog_grabber(root, state_dir=state_dir, project="Nightly")
    win2.withdraw()
    h = win2._idm_grabber
    loaded = {
        "name": h["proj"].get(),
        "start": h["start"].get(),
        "template": h["template"].get(),
        "exts": h["exts"].get(),
        "same_site_only": bool(h["same_site"].get()),
        "max_pages": h["max_pages"].get(),
        "depth": h["depth"].get(),
        "external_depth": h["external_depth"].get(),
        "include": h["include"].get(),
        "exclude": h["exclude"].get(),
    }
    try:
        win2.destroy()
        root.destroy()
    except Exception:  # noqa: BLE001
        pass

    print("GRABPROJ:" + json.dumps({"saved": saved, "loaded": loaded}),
          flush=True)
    return 0


class _RecordingApi:
    """Stands in for the engine API in the selftests.

    Both halves of what the selftests need: `adds` keeps the whole record of
    each call (the Grabber checks which directory a file would land in) and
    `added` keeps just the URLs (the Tasks menu checks how many were queued).
    One class, because two classes with the same name meant the second one
    silently shadowed the first.
    """

    def __init__(self):
        self.adds = []
        self.added = []

    def items(self):
        return []

    def add(self, url, connections=None, aria2=False, options=None):
        self.adds.append({"url": url,
                          "connections": connections,
                          "out_dir": (options or {}).get("out_dir", "")})
        self.added.append(url)
        return len(self.adds)

    def resume(self, i):
        pass

    def pause(self, i):
        pass

    def remove(self, i):
        pass


def selftest_grabber_checks(state_dir):
    """The two "Save to" checkbuttons must be readable and must act."""
    import tkinter as tk

    root = tk.Tk()
    root.withdraw()

    base = os.path.join(state_dir, "grabbed")
    urls = ["https://example.com/a/song.mp3", "https://example.com/b/pack.zip"]

    def dialog(api):
        win = _dialog_grabber(root, api=api, state_dir=state_dir, out_dir=base)
        win.withdraw()
        g = win._idm_grabber
        g["folder"].delete(0, "end")
        g["folder"].insert(0, base)
        g["state"]["files"] = list(urls)
        g["state"]["checked"] = set(range(len(urls)))
        g["render"]()
        return win, g

    # 1. every checkbutton can be read at all
    win, g = dialog(None)
    unbound = _unbound_checkbuttons(win)
    win.destroy()

    # 2. "Add to IDM" with the category checkbox off, then on
    plain_api = _RecordingApi()
    win, g = dialog(plain_api)
    g["by_category"].set(False)
    for b in _buttons_by_text(win, "Add to IDM"):
        b.invoke()
    win.destroy()

    cat_api = _RecordingApi()
    win, g = dialog(cat_api)
    g["by_category"].set(True)
    for b in _buttons_by_text(win, "Add to IDM"):
        b.invoke()
    win.destroy()

    # 3. closing the dialog, with "add on close" on and off
    close_api = _RecordingApi()
    win, g = dialog(close_api)
    g["add_on_close"].set(True)
    g["on_close"]()

    quiet_api = _RecordingApi()
    win, g = dialog(quiet_api)
    g["add_on_close"].set(False)
    g["on_close"]()

    # 4. both checkboxes belong to the saved project
    win, g = dialog(None)
    g["proj"].set("Checked")
    g["by_category"].set(True)
    g["add_on_close"].set(True)
    g["save_project"]()
    win.destroy()
    saved = grabber_project(load_settings(state_dir), "Checked")
    win, g = dialog(None)
    g["proj"].set("Checked")
    g["load_project"]()
    reloaded = {"by_category": bool(g["by_category"].get()),
                "add_on_close": bool(g["add_on_close"].get())}
    win.destroy()

    try:
        root.destroy()
    except Exception:  # noqa: BLE001
        pass

    print("GRABCHECK:" + json.dumps({
        "unbound": unbound,
        "folder": base,
        "urls": urls,
        "plain": plain_api.adds,
        "by_category": cat_api.adds,
        "on_close": close_api.adds,
        "no_close": quiet_api.adds,
        "saved": saved,
        "reloaded": reloaded,
    }), flush=True)
    return 0


def selftest_grabber_tree(state_dir):
    """The saved projects must show up under the "Grabber projects" node."""
    import tkinter as tk

    root = tk.Tk()
    root.withdraw()
    api = Api("127.0.0.1:1", timeout=0.2)
    main_root, _refresh, w = build_window(api, out_dir=".", state_dir=state_dir)
    main_root.withdraw()

    tree = w["tree"]
    node = None
    for i in tree.get_children(""):
        if tree.item(i, "text") == "Grabber projects":
            node = i
    children = ([tree.item(c, "text") for c in tree.get_children(node)]
                if node else [])

    # Open the second one the way a user would: select it, double click.
    opened_title, opened_start = "", ""
    kids = tree.get_children(node) if node else []
    category_after_select = w["view"]["category"]
    if kids:
        tree.selection_set(kids[-1])
        main_root.update()  # let <<TreeviewSelect>> fire, as a click would
        category_after_select = w["view"]["category"]
        dialog = w["open_grabber_project"]()
        if dialog is not None:
            dialog.withdraw()
            opened_title = dialog.title()
            opened_start = dialog._idm_grabber["start"].get()
            dialog.destroy()

    try:
        main_root.destroy()
        root.destroy()
    except Exception:  # noqa: BLE001
        pass

    print("GRABTREE:" + json.dumps({
        "children": children,
        "opened_title": opened_title,
        "opened_start": opened_start,
        "category_after_select": category_after_select,
    }), flush=True)
    return 0


def selftest_row():
    """Render one item exactly as the main list does."""
    item = {
        "id": 1,
        "url": "https://example.com/file.bin",
        "downloaded": 1024,
        "total": 2048,
        "status": "paused",
        "description": "a stored note",
    }
    print("ROW:" + json.dumps(list(row_values(item))), flush=True)
    return 0


def selftest_dont_show_again(state_dir):
    """"Don't show this dialog again" must switch the setting off for good."""
    before = load_settings(state_dir)["downloads"]["show_complete_dialog"]
    if before is not True:
        print("DONTSHOW: FAIL fixture should start enabled", file=sys.stderr)
        return 1
    dont_show_complete_again(state_dir)
    if load_settings(state_dir)["downloads"]["show_complete_dialog"] is not False:
        print("DONTSHOW: FAIL setting not persisted", file=sys.stderr)
        return 1
    print("DONTSHOW: OK", flush=True)
    return 0


def selftest_scheduler(state_dir):
    """Per-queue schedules must round-trip and must not bleed into each other."""
    s = load_settings(state_dir)
    s = set_queue_schedule(s, "Main download queue", {
        "start_at": "1:15",            # short form must normalise
        "stop_at": "6:00:00",
        "retries": 4,
        "open_when_done": "/dl/last.zip",
        "shutdown_when_done": True,
    })
    s = set_queue_schedule(s, "Synchronization queue", {"retries": 9})
    # A bad time must be refused, not stored.
    s = set_queue_schedule(s, "Main download queue", {"start_at": "99:99:99"})
    save_settings(state_dir, s)
    r = load_settings(state_dir)

    main = queue_schedule(r, "Main download queue")
    sync = queue_schedule(r, "Synchronization queue")

    def fail(msg):
        print("SCHEDULER: FAIL " + msg, file=sys.stderr)

    if main["start_at"] != "01:15:00":
        fail("start_at not normalised/persisted: %r" % (main["start_at"],))
        return 1
    if main["retries"] != 4 or main["open_when_done"] != "/dl/last.zip":
        fail("schedule fields not persisted: %r" % (main,))
        return 1
    if main["shutdown_when_done"] is not True:
        fail("checkbox not persisted: %r" % (main,))
        return 1
    if sync["retries"] != 9 or sync["shutdown_when_done"] is not False:
        fail("queues are not independent: %r" % (sync,))
        return 1

    print("SCHEDULER: OK", flush=True)
    return 0


def selftest_live_graph(meta_path):
    """Build the progress dialog from a real .idmmeta and report fill fractions."""
    import tkinter as tk

    root = tk.Tk()
    root.withdraw()
    fracs, _ov, total = _read_meta_segments(meta_path)
    n = len(fracs) if fracs else 0
    win, canvas, bars = _dialog_progress(root, "live", connections=n, meta_path=meta_path)
    win.withdraw()
    win.update_idletasks()
    win._idm_update()
    win.update_idletasks()

    geo = win._idm_bar_geo
    reported = []
    for i, bar in enumerate(bars):
        coords = canvas.coords(bar)
        if len(coords) == 4 and i < len(geo):
            x0, x1, _y0, _y1 = geo[i]
            reported.append((coords[2] - x0) / max(1, x1 - x0))
        else:
            reported.append(0.0)

    oc = canvas.coords(win._idm_overall_bar)
    overall_frac = (oc[2] - oc[0]) / (480 - 6) if len(oc) == 4 else 0.0
    print("LIVE:" + json.dumps({"bars": reported, "overall": overall_frac, "total": total}), flush=True)
    try:
        win.destroy()
        root.destroy()
    except Exception:  # noqa: BLE001
        pass
    return 0


def _settle(root, rounds: int = 6) -> None:
    """Let Tk finish laying out before anything is measured.

    Geometry work is queued, not immediate: a single update() leaves column
    widths still moving. Pumping the loop a few times is what makes a
    measurement repeatable.
    """
    for _ in range(max(1, rounds)):
        root.update_idletasks()
        root.update()


def _gridline_geometry(w) -> list:
    """What the placed rules actually look like, for the selftests.

    Read off the live widgets rather than recomputed, because the whole point
    of checking on a real window is that place() can quietly put a frame
    somewhere other than where it was asked to.
    """
    out = []
    for line in w["grid_lines"]:
        out.append({
            "x": line.winfo_x(),
            "width": line.winfo_width(),
            "height": line.winfo_height(),
            "bg": str(line.cget("background")),
        })
    return out


def _build_for_gridlines(state_dir: str = ""):
    api = Api("127.0.0.1:1", timeout=0.2)
    root, _refresh, w = build_window(api, out_dir=".", state_dir=state_dir)
    root.geometry("1100x500")
    root.update_idletasks()
    root.update()
    # place() geometry is only real once the widget has been mapped and the
    # <Configure> that draws the rules has been delivered. Tk also
    # redistributes column widths after the fact, so settle first and draw
    # second -- drawing immediately would pin the rules to widths that are
    # about to change.
    _settle(root)
    w["redraw_grid"]()
    root.update_idletasks()
    root.update()
    return root, w


def selftest_icons():
    """Prove the icons exist, and say whether PIL had anything to do with it.

    The bug this answers was invisible from the outside: a broken ImageTk made
    every icon None, and a window with no icons looks like a window whose icons
    were never designed. Counting them is the only way to tell the difference.
    """
    root, w = _build_for_gridlines()
    buttons = w.get("buttons") or []
    with_icons = sum(1 for _n, b in buttons if _button_has_icon(b))
    icon = getattr(root, "_idm_icon", None)
    cats = w.get("category_icons") or w.get("tree_icons") or []
    out = {
        "buttons": len(buttons),
        "with_icons": with_icons,
        "pil_used": bool(_ICON_USED_PIL[0]),
        "window_icon": icon is not None,
        "window_icon_size": int(icon.width()) if icon is not None else 0,
        "category_icons": len(cats),
        "theme_glyph": theme_toggle_glyph(w["theme"]),
    }
    root.destroy()
    print("ICONS:" + json.dumps(out), flush=True)
    return 0


def selftest_gridlines():
    root, w = _build_for_gridlines()
    seps = _gridline_geometry(w)
    out = {
        "count": len(seps),
        "columns": len(w["list"]["columns"]),
        "grid": w["palette"]["grid"],
        "separators": seps,
    }
    root.destroy()
    print("GRIDLINES:" + json.dumps(out), flush=True)
    return 0


def selftest_gridlines_resize():
    """Widening a column has to move the rules, not leave them behind."""
    root, w = _build_for_gridlines()
    before = [s["x"] for s in _gridline_geometry(w)]
    first = w["list"]["columns"][0]
    new_width = w["list"].column(first, "width") + 120
    w["list"].column(first, width=new_width)
    _settle(root)
    w["redraw_grid"]()
    _settle(root)
    after = [s["x"] for s in _gridline_geometry(w)]
    # Read the width back AFTER the redraw, not the one that was asked for:
    # Treeview stretches its columns to fill the widget, so a requested 321
    # legitimately lands as 360. The rules must follow where the column REALLY
    # is, which is what this reports.
    out = {"before": before, "after": after,
           "requested_width": new_width,
           "first_width": w["list"].column(first, "width")}
    root.destroy()
    print("GRIDLINES-RESIZE:" + json.dumps(out), flush=True)
    return 0


def selftest_gridlines_theme():
    """The rules are plain frames, so the theme has to repaint them by hand."""
    import tempfile

    state = tempfile.mkdtemp()
    save_theme(state, "light")
    root, w = _build_for_gridlines(state)
    light = _gridline_geometry(w)[0]["bg"] if w["grid_lines"] else ""
    w["theme_button"].invoke()
    root.update_idletasks()
    root.update()
    dark = _gridline_geometry(w)[0]["bg"] if w["grid_lines"] else ""
    out = {"light": light, "dark": dark,
           "dark_grid": theme_palette("dark")["grid"]}
    root.destroy()
    print("GRIDLINES-THEME:" + json.dumps(out), flush=True)
    return 0


def _scrollbar_report(tree, bar) -> dict:
    """Is this scrollbar actually connected, in both directions?

    A bar that exists but is wired one way (or not at all) looks the same in
    the source and does nothing useful on screen, so both links are probed:
    the bar's command must reach the widget's yview, and the widget must be
    pushing its position back into the bar.
    """
    out = {"exists": bar is not None}
    if bar is None:
        return out
    before = bar.get()
    tree.yview_moveto(0.5)
    tree.update_idletasks()
    out["view_drives_bar"] = bar.get() != before
    # Drive it from the other end: ask the bar's own command to scroll.
    tree.yview_moveto(0.0)
    tree.update_idletasks()
    top = tree.yview()
    bar.tk.call(bar.cget("command"), "moveto", "0.6")
    tree.update_idletasks()
    out["bar_drives_view"] = tree.yview() != top
    out["fractions"] = list(tree.yview())
    out["scrolled_away_from_top"] = tree.yview()[0] > 0.0
    return out


def selftest_scrollbars():
    """Both lists must be scrollable, and say so."""
    api = Api("127.0.0.1:1", timeout=0.2)
    root, _refresh, w = build_window(api, out_dir=".")
    root.geometry("900x300")
    root.update_idletasks()
    root.update()

    # Far more rows than fit, so there is something to scroll to.
    listview = w["list"]
    blank = tuple("" for _ in COLUMNS)
    for i in range(120):
        listview.insert("", "end", iid="x%d" % i, values=blank)
    for i in range(60):
        w["tree"].insert("", "end", iid="c%d" % i, text="Category %d" % i)
    root.update_idletasks()
    root.update()

    out = {
        "list": _scrollbar_report(listview, w.get("list_scroll")),
        "tree": _scrollbar_report(w["tree"], w.get("tree_scroll")),
    }
    root.destroy()
    print("SCROLLBARS:" + json.dumps(out), flush=True)
    return 0


def selftest_window():
    api = Api("127.0.0.1:1", timeout=0.2)
    root, refresh, _w = build_window(api)
    root.update_idletasks()
    root.update()
    title = root.title()
    root.destroy()
    print(f"SELFTEST-WINDOW: OK title={title!r}", flush=True)
    return 0


def selftest_batch_clipboard():
    """Tasks -> batch from clipboard must queue every URL in the copied text."""
    api = _RecordingApi()
    root, _refresh, w = build_window(api, out_dir=".")
    root.withdraw()
    blob = ("Mirrors: https://example.com/a.bin and https://example.com/b.bin,\n"
            "plus ftp://example.com/c.bin (same as https://example.com/a.bin).\n"
            "Ignore mailto:me@example.com.")
    urls = w["add_batch_from_clipboard"](blob)
    out = {"added": api.added, "returned": urls,
           "status": w["status_var"].get()}
    root.destroy()
    print("BATCH-CLIP:" + json.dumps(out), flush=True)
    return 0


def selftest_drop_toggle():
    """The Tasks entry must show the drop target and hide it again."""
    api = _RecordingApi()
    root, _refresh, w = build_window(api, out_dir=".")
    root.withdraw()
    w["toggle_drop_target"]()
    first = w["drop_target_visible"]()
    w["toggle_drop_target"]()
    second = w["drop_target_visible"]()
    out = {"after_first_show": first, "after_second_show": second}
    root.destroy()
    print("DROP-TOGGLE:" + json.dumps(out), flush=True)
    return 0


def selftest_drop_paste():
    """The drop target works by click-to-paste as well as by a real drop."""
    import tkinter as tk

    root = tk.Tk()
    root.withdraw()
    got = {"added": [], "dropped": []}
    clip = {"text": "Here: https://example.com/dropped.bin"}
    win, handle = _dialog_drop_target(
        root,
        on_urls=lambda urls: got["added"].extend(urls),
        clipboard=lambda: clip["text"],
    )
    win.withdraw()

    paste = None
    for frame in win.winfo_children():
        for child in getattr(frame, "winfo_children", lambda: [])():
            if child.winfo_class() in ("TButton", "Button") \
                    and "Paste" in str(child.cget("text")):
                paste = child
    if paste is None:
        print("DROP-PASTE: FAIL no Paste button", file=sys.stderr)
        return 1
    paste.invoke()

    # What tkinterdnd2 would deliver on a real drop: the same handler, so the
    # drag & drop path is covered even where the extension is not installed.
    before = len(got["added"])
    handle("https://example.com/dnd.bin")
    got["dropped"] = got["added"][before:]
    got["added"] = got["added"][:before]

    root.destroy()
    print("DROP-PASTE:" + json.dumps(got), flush=True)
    return 0


def _collect_widgets(widget, acc, depth=0):
    """Recursively collect labels/buttons/entries/tabs into acc."""
    import tkinter as tk
    from tkinter import ttk

    try:
        cls = widget.winfo_class()
    except Exception:  # noqa: BLE001
        return
    if cls in ("TButton", "Button"):
        try:
            acc["buttons"].append(widget.cget("text"))
        except Exception:  # noqa: BLE001
            pass
    if cls in ("TCheckbutton", "Checkbutton", "TRadiobutton", "Radiobutton"):
        try:
            acc["labels"].append(widget.cget("text"))
        except Exception:  # noqa: BLE001
            pass
    if cls in ("TLabel", "Label"):
        try:
            acc["labels"].append(widget.cget("text"))
        except Exception:  # noqa: BLE001
            pass
    if cls == "TNotebook":
        try:
            for tab in widget.tabs():
                acc["tabs"].append(widget.tab(tab, "text"))
        except Exception:  # noqa: BLE001
            pass
    for child in widget.winfo_children():
        _collect_widgets(child, acc, depth + 1)


def _unbound_checkbuttons(widget, found=None):
    """Labels of checkbuttons under `widget` with no variable behind them.

    The Grabber had two of these: tickable, and unreadable by any code, so
    they could not possibly do what their labels promised.
    """
    if found is None:
        found = []
    for child in widget.winfo_children():
        if child.winfo_class() in ("TCheckbutton", "Checkbutton"):
            try:
                var = str(child.cget("variable") or "").strip()
                text = str(child.cget("text") or "")
            except Exception:  # noqa: BLE001
                continue
            if not var:
                found.append(text)
        _unbound_checkbuttons(child, found)
    return found


def _buttons_by_text(widget, text, found=None):
    """Every button under `widget` whose label is `text`."""
    if found is None:
        found = []
    for child in widget.winfo_children():
        if child.winfo_class() in ("TButton", "Button"):
            try:
                if str(child.cget("text") or "") == text:
                    found.append(child)
            except Exception:  # noqa: BLE001
                pass
        _buttons_by_text(child, text, found)
    return found


def _dead_buttons(widget, found=None):
    """Labels of buttons under `widget` that have no command bound.

    Every tab of the Options dialog used to be built with command-less
    buttons -- they looked complete and did nothing when clicked.
    """
    if found is None:
        found = []
    for child in widget.winfo_children():
        if child.winfo_class() in ("TButton", "Button"):
            try:
                cmd = str(child.cget("command") or "").strip()
                text = str(child.cget("text") or "")
            except Exception:  # noqa: BLE001
                continue
            if not cmd:
                found.append(text)
        _dead_buttons(child, found)
    return found


def selftest_dump(engine):
    """Build the main window and every dialog, dump the structure as JSON."""
    import tkinter as tk

    root = tk.Tk()
    root.withdraw()

    api = Api("127.0.0.1:1", timeout=0.2)
    main_root, _refresh, w = build_window(api, out_dir=".")
    main_root.withdraw()

    # Main window structure.
    buttons = [name for name, _b in w["buttons"]]
    toolbar_children = [c.winfo_class() for c in w["toolbar"].winfo_children()]
    has_toolbar = len(toolbar_children) > 0
    # Toolbar is packed before the paned window (above the list).
    order = [c.winfo_class() for c in main_root.winfo_children()]
    toolbar_above = order.index(w["toolbar"].winfo_class()) < len(order) - 1 \
        if w["toolbar"].winfo_class() in order else False
    # Category tree content.
    tree = w["tree"]
    cats = [tree.item(i, "text") for i in tree.get_children("")]
    columns = [w["list"].heading(c, "text") for c in w["list"]["columns"]]

    # Build each dialog and collect its widgets/tabs.
    dialogs = []

    aw, _u, _a = _dialog_add_url(root)
    aw.withdraw()
    acc = {"buttons": [], "labels": [], "tabs": []}
    _collect_widgets(aw, acc)
    dialogs.append({"title": aw.title(), "widgets": acc["labels"] + acc["buttons"],
                    "tabs": acc["tabs"], "dead_buttons": _dead_buttons(aw)})

    fw, _s, _l = _dialog_file_info(root, "http://x/file.mp4", ".", "Video")
    fw.withdraw()
    acc = {"buttons": [], "labels": [], "tabs": []}
    _collect_widgets(fw, acc)
    dialogs.append({"title": fw.title(), "widgets": acc["labels"] + acc["buttons"],
                    "tabs": acc["tabs"], "dead_buttons": _dead_buttons(fw)})

    ow, onb, octrl = _dialog_options(root)
    ow.withdraw()
    acc = {"buttons": [], "labels": [], "tabs": []}
    _collect_widgets(ow, acc)
    dialogs.append({"title": ow.title(), "widgets": acc["labels"] + acc["buttons"],
                    "tabs": acc["tabs"], "controls": octrl,
                    "dead_buttons": _dead_buttons(ow)})

    sw, _snb = _dialog_scheduler(root)
    sw.withdraw()
    acc = {"buttons": [], "labels": [], "tabs": []}
    _collect_widgets(sw, acc)
    dialogs.append({"title": sw.title(), "widgets": acc["labels"] + acc["buttons"],
                    "tabs": acc["tabs"], "dead_buttons": _dead_buttons(sw)})

    pw = _dialog_properties(root, "http://x/f.mp4", "/tmp/f.mp4")
    pw.withdraw()
    acc = {"buttons": [], "labels": [], "tabs": []}
    _collect_widgets(pw, acc)
    dialogs.append({"title": pw.title(), "widgets": acc["labels"] + acc["buttons"],
                    "tabs": acc["tabs"], "dead_buttons": _dead_buttons(pw)})

    cw = _dialog_complete(root, "/tmp/f.mp4")
    cw.withdraw()
    acc = {"buttons": [], "labels": [], "tabs": []}
    _collect_widgets(cw, acc)
    dialogs.append({"title": cw.title(), "widgets": acc["labels"] + acc["buttons"],
                    "tabs": acc["tabs"], "dead_buttons": _dead_buttons(cw)})

    abw = _dialog_about(root)
    abw.withdraw()
    acc = {"buttons": [], "labels": [], "tabs": []}
    _collect_widgets(abw, acc)
    dialogs.append({"title": abw.title(), "widgets": acc["labels"] + acc["buttons"],
                    "tabs": acc["tabs"], "dead_buttons": _dead_buttons(abw)})

    grw = _dialog_grabber(root)
    grw.withdraw()
    acc = {"buttons": [], "labels": [], "tabs": []}
    _collect_widgets(grw, acc)
    dialogs.append({"title": grw.title(), "widgets": acc["labels"] + acc["buttons"],
                    "tabs": acc["tabs"], "dead_buttons": _dead_buttons(grw)})

    # Download Progress dialog: carries a canvas with one bar per connection.
    pw2, pcanvas, pbars = _dialog_progress(root, "movie.mp4", connections=4)
    pw2.withdraw()
    acc = {"buttons": [], "labels": [], "tabs": []}
    _collect_widgets(pw2, acc)
    dialogs.append({
        "title": pw2.title(),
        "widgets": acc["labels"] + acc["buttons"],
        "tabs": acc["tabs"],
        "has_canvas": pcanvas.winfo_class() == "Canvas",
        "segment_bars": len(pbars),
        "has_pause": any("pause" in b.lower() for b in acc["buttons"]),
        "dead_buttons": _dead_buttons(pw2),
    })

    # The floating drop target.
    dtw, _dthandle = _dialog_drop_target(root)
    dtw.update()
    try:
        topmost = bool(int(dtw.attributes("-topmost")))
    except Exception:  # noqa: BLE001
        topmost = False
    dtw.withdraw()
    acc = {"buttons": [], "labels": [], "tabs": []}
    _collect_widgets(dtw, acc)
    dialogs.append({"title": dtw.title(), "widgets": acc["labels"] + acc["buttons"],
                    "tabs": acc["tabs"], "topmost": topmost,
                    "dead_buttons": _dead_buttons(dtw)})

    acc_all = {"buttons": [], "labels": [], "tabs": []}
    _collect_widgets(main_root, acc_all)
    widget_labels = acc_all["labels"] + acc_all["buttons"]

    dump = {
        "buttons": buttons,
        "dead_buttons": _dead_buttons(main_root),
        "has_aria2_switch": "aria2_check" in w,
        "widget_labels": widget_labels,
        "buttons_with_icons": w.get("buttons_with_icons", 0),
        "categories_with_icons": w.get("categories_with_icons", 0),
        "has_toolbar_frame": has_toolbar,
        "toolbar_above_list": toolbar_above,
        "categories": cats,
        "has_category_tree": len(cats) > 0,
        "tree_left_of_list": True,
        "columns": columns,
        "has_list_context_menu": "list_menu" in w,
        "list_menu_items": w.get("list_menu_items", []),
        "has_category_context_menu": "cat_menu" in w,
        "category_menu_items": w.get("cat_menu_items", []),
        "has_menubar": "menubar" in w,
        "menus": w.get("menus", []),
        "tasks_menu_items": w.get("tasks_menu_items", []),
        "dialogs": dialogs,
    }

    # Cleanup.
    for win in (aw, fw, ow, sw, pw, cw, abw, grw, pw2, dtw):
        try:
            win.destroy()
        except Exception:  # noqa: BLE001
            pass
    try:
        main_root.destroy()
        root.destroy()
    except Exception:  # noqa: BLE001
        pass

    print("DUMP:" + json.dumps(dump), flush=True)
    return 0


# --- running the window on its own X display ---------------------------------

XVFB_SCREEN = "1280x800x24"
FIRST_OWN_DISPLAY = 99


def _display_name(spec) -> str | None:
    """":7" / "7" / 7 -> ":7". Anything empty -> None."""
    if spec is None:
        return None
    s = str(spec).strip()
    if not s:
        return None
    return s if s.startswith(":") else ":" + s


def display_plan(args: dict, env: dict, probe: dict) -> dict:
    """Decide WHERE the Tk window puts itself, and how to photograph it.

    Pure on purpose: `probe` carries everything that needs the real machine
    (`have` = tool basenames found in PATH, `busy` = display numbers already
    taken), so every branch below is testable without starting an X server.

    mode:
      "inherit" — use an existing display (the surrounding DISPLAY, or
                  --display); nothing gets started, `xvfb_argv` is None.
      "own"     — start `xvfb_argv` and point the window at `display`.
      "error"   — the request cannot be honoured; `reason` says why and
                  main() must bail out BEFORE spawning an engine.

    A missing display with no flags is deliberately NOT an error here: that
    case belongs to build_window(), whose message explains how to get one.
    """
    have = set(probe.get("have") or ())
    busy = set(probe.get("busy") or ())
    own = bool(args.get("own_display"))
    shot_path = args.get("screenshot") or None

    def fail(reason):
        return {"mode": "error", "display": None, "xvfb_argv": None,
                "shot": None, "reason": reason}

    if own:
        if "Xvfb" not in have:
            return fail(
                "--own-display potrebuje Xvfb v PATH (balicek xvfb). "
                "Bez nej by okno skoncilo na displeji uzivatele, "
                "coz je presne to, co --own-display odmita."
            )
        n = FIRST_OWN_DISPLAY
        while n in busy:
            n += 1
        display = ":%d" % n
        xvfb_argv = ["Xvfb", display, "-screen", "0", XVFB_SCREEN,
                     "-nolisten", "tcp"]
        mode = "own"
    else:
        display = _display_name(args.get("display")) or _display_name(env.get("DISPLAY"))
        xvfb_argv = None
        mode = "inherit"

    shot = None
    if shot_path:
        if "ffmpeg" in have:
            # x11grab sizes itself from the display, so no -video_size here.
            shot = {"path": shot_path,
                    "argv": ["ffmpeg", "-hide_banner", "-loglevel", "error", "-y",
                             "-f", "x11grab", "-i", display or ":0",
                             "-frames:v", "1", shot_path]}
        elif "xwd" in have:
            # xwd writes the X11 window-dump format, never PNG. Handing back a
            # .png full of xwd bytes would be a file nothing can open, so the
            # extension follows the actual content.
            base = shot_path[:-4] if shot_path.lower().endswith(".png") else shot_path
            out = base + ".xwd"
            shot = {"path": out,
                    "argv": ["xwd", "-display", display or ":0", "-root",
                             "-out", out]}
        else:
            return fail(
                "--screenshot potrebuje ffmpeg (PNG) nebo xwd; "
                "ani jedno neni v PATH."
            )

    return {"mode": mode, "display": display, "xvfb_argv": xvfb_argv,
            "shot": shot, "reason": ""}


def probe_displays(env: dict | None = None) -> dict:
    """The real-machine half of display_plan's input."""
    tools = [t for t in ("Xvfb", "ffmpeg", "xwd") if shutil.which(t)]
    busy = []
    try:
        for name in os.listdir("/tmp/.X11-unix"):
            if name.startswith("X") and name[1:].isdigit():
                busy.append(int(name[1:]))
    except OSError:
        pass
    return {"have": tools, "busy": busy}


def start_display(plan: dict, timeout: float = 10.0,
                  sock_dir: str = "/tmp/.X11-unix"):
    """Execute a display_plan: point DISPLAY at it, starting Xvfb if asked.

    Returns the Xvfb Popen when one was started (the caller must reap it) or
    None. Waiting is on the socket, never a sleep: a fixed nap is either a
    stall or a race, and this repo has paid for that lesson elsewhere.

    The socket alone proves nothing, though -- the same way a free port is
    only ours while our own child holds it. When somebody else already owns
    the number, the socket is there from the first look, the wait succeeds
    instantly, and our Xvfb dies with "Server is already active" behind our
    back. The window then connects to a stranger's display and fails on
    Xauthority, which is a much harder error to read than "that number is
    taken". So: a socket that pre-dates the spawn means the number is not
    ours, and the one we do accept has to still be held by a live child.
    """
    if plan["display"]:
        os.environ["DISPLAY"] = plan["display"]
    if not plan["xvfb_argv"]:
        return None
    sock = os.path.join(sock_dir, "X%s" % plan["display"].lstrip(":"))
    if os.path.exists(sock):
        raise RuntimeError("displej %s uz nekdo obsadil" % plan["display"])
    proc = subprocess.Popen(plan["xvfb_argv"], stdout=subprocess.DEVNULL,
                            stderr=subprocess.DEVNULL)
    deadline = time.monotonic() + timeout
    while time.monotonic() < deadline:
        if os.path.exists(sock):
            # The loser exits right after the socket shows up, so confirm the
            # child is still the one holding it before handing it over.
            time.sleep(0.1)
            if proc.poll() is not None:
                raise RuntimeError(
                    "Xvfb na %s skoncil hned po startu s kodem %s"
                    % (plan["display"], proc.returncode))
            return proc
        if proc.poll() is not None:
            raise RuntimeError("Xvfb skoncil s kodem %s" % proc.returncode)
        time.sleep(0.05)
    stop_display(proc)
    raise RuntimeError("Xvfb na %s se neozval do %gs" % (plan["display"], timeout))


def open_display(args, env, attempts: int = 5):
    """Plan a display and actually open it, retrying a number already taken.

    probe_displays() can only see the sockets that exist WHEN IT LOOKS, so two
    launches a moment apart pick the same number and the loser's Xvfb exits
    with "Server is already active". That is the display version of the
    free_port() trap documented in CLAUDE.md: the scan cannot prevent it, so
    the recovery belongs here — each refusal adds that number to the busy set
    and the next plan steps over it.

    Returns (plan, proc); proc is None when no server was started. A plan in
    "error" mode is returned untouched for the caller to report.
    """
    taken: list = []
    plan = None
    for _ in range(max(1, attempts)):
        probe = probe_displays(env)
        probe["busy"] = list(probe.get("busy") or []) + taken
        plan = display_plan(args, env, probe)
        if plan["mode"] != "own":
            return plan, start_display(plan)
        try:
            return plan, start_display(plan)
        except RuntimeError:
            taken.append(int(str(plan["display"]).lstrip(":")))
    raise RuntimeError(
        "zadny volny X displej: cisla %s uz nekdo zabral"
        % ", ".join(str(t) for t in taken)
    )


def stop_display(proc) -> None:
    """Reap the Xvfb we started. An orphan X server per launch is a leak."""
    if proc is None:
        return
    try:
        proc.terminate()
        proc.wait(timeout=5)
    except Exception:  # noqa: BLE001
        try:
            proc.kill()
        except Exception:  # noqa: BLE001
            pass


def draw_window(root, timeout: float = 5.0) -> bool:
    """Make sure the window is mapped and painted. True when it is viewable.

    build_window() only CREATES the widgets; Tk maps and draws them when the
    event loop first runs. Photographing in between gives a black rectangle
    with a cursor in it — which is exactly what --screenshot used to produce
    on the interactive path, where nothing had pumped the loop yet.
    """
    deadline = time.monotonic() + timeout
    while True:
        root.update_idletasks()
        root.update()
        if root.winfo_viewable():
            return True
        if time.monotonic() >= deadline:
            return False
        time.sleep(0.05)


def take_screenshot(plan: dict) -> str | None:
    """Photograph the display. Returns the path written, or None."""
    shot = plan.get("shot")
    if not shot:
        return None
    subprocess.run(shot["argv"], check=True, stdout=subprocess.DEVNULL,
                   stderr=subprocess.PIPE, timeout=30)
    return shot["path"]


def selftest_display(plan: dict, xvfb_pid: int = 0):
    """Build the window on the planned display and photograph it.

    Deliberately no mainloop: this is the non-interactive proof that the
    window really came up on a display IDM provided itself.
    """
    api = Api("127.0.0.1:1", timeout=0.2)
    out = {"mode": plan["mode"], "display": plan["display"],
           "window": "no", "shot": None, "xvfb_pid": xvfb_pid}
    root, _refresh, _w = build_window(api)
    try:
        out["window"] = "ok" if draw_window(root) else "not-viewable"
        out["shot"] = take_screenshot(plan)
    finally:
        root.destroy()
    print("DISPLAY-SELFTEST:" + json.dumps(out), flush=True)
    return 0


def main(argv=None):
    # IDM's own parameters (/d URL, /p, /f, /a, /s, /q, /h, /n) are pulled out
    # first: argparse would reject "/d" outright, and a file association or a
    # drop onto the executable passes a bare URL.
    raw = list(sys.argv[1:] if argv is None else argv)
    cmdline = parse_idm_argv(raw)
    rest = cmdline["rest"] if cmdline["recognised"] else raw

    p = argparse.ArgumentParser(description="Native window for the IDM-like downloader")
    p.add_argument("--addr", default=os.environ.get("IDM_ADDR", DEFAULT_ADDR))
    p.add_argument("--engine", default=os.environ.get("IDM_ENGINE_BIN", "idm"))
    p.add_argument("--out-dir", default=os.environ.get("IDM_DOWNLOADS_DIR", os.path.expanduser("~/Downloads")))
    p.add_argument("--state-dir", default=os.environ.get(
        "IDM_STATE_DIR",
        os.path.join(os.environ.get("IDM_DIR") or os.path.expanduser("~/.idm"), "state")))
    p.add_argument("--autostart", action="store_true")
    p.add_argument(
        "--api-token",
        default=os.environ.get("IDM_API_TOKEN", ""),
        help="API secret (default: read STATE_DIR/api-token, or generate one with --autostart)",
    )
    p.add_argument("--display", default=None,
                   help="put the window on this X display (:7 or 7) instead of $DISPLAY")
    p.add_argument("--own-display", action="store_true",
                   help="start a private Xvfb and run the window there (headless machines)")
    p.add_argument("--screenshot", default=None,
                   help="write a picture of the window to this path once it is up")
    p.add_argument("--selftest-display", action="store_true")
    p.add_argument("--url", help="URL for --selftest-api")
    p.add_argument("--selftest-api", action="store_true")
    p.add_argument("--selftest-window", action="store_true")
    p.add_argument("--selftest-dump", action="store_true")
    p.add_argument("--selftest-settings", action="store_true")
    p.add_argument("--selftest-options-data", action="store_true")
    p.add_argument("--selftest-download-options", action="store_true")
    p.add_argument("--selftest-add-body", action="store_true")
    p.add_argument("--selftest-dont-show-again", action="store_true")
    p.add_argument("--selftest-properties-body", action="store_true")
    p.add_argument("--selftest-properties-ok", action="store_true")
    p.add_argument("--selftest-row", action="store_true")
    p.add_argument("--selftest-scrollbars", action="store_true")
    p.add_argument("--selftest-icons", action="store_true")
    p.add_argument("--selftest-tray", action="store_true")
    p.add_argument("--selftest-gridlines", action="store_true")
    p.add_argument("--selftest-gridlines-resize", action="store_true")
    p.add_argument("--selftest-gridlines-theme", action="store_true")
    p.add_argument("--selftest-formats-body", action="store_true")
    p.add_argument("--selftest-format-labels", action="store_true")
    p.add_argument("--selftest-add-format", action="store_true")
    p.add_argument("--selftest-file-info", action="store_true")
    p.add_argument("--selftest-scheduler", action="store_true")
    p.add_argument("--selftest-batch-clipboard", action="store_true")
    p.add_argument("--selftest-drop-toggle", action="store_true")
    p.add_argument("--selftest-drop-paste", action="store_true")
    p.add_argument("--selftest-live-graph", action="store_true")
    p.add_argument("--meta", help="path to a .idmmeta for --selftest-live-graph")
    p.add_argument("--selftest-grabber-explore", action="store_true")
    p.add_argument("--grabber-template", default="All files",
                   help="template for --selftest-grabber-explore")
    p.add_argument("--grabber-depth", type=int, default=None)
    p.add_argument("--grabber-external-depth", type=int, default=None)
    p.add_argument("--selftest-grabber-project", action="store_true")
    p.add_argument("--selftest-migrate-logins", action="store_true")
    p.add_argument("--selftest-add-ref", action="store_true")
    p.add_argument("--selftest-store-password", action="store_true")
    p.add_argument("--selftest-grabber-tree", action="store_true")
    p.add_argument("--selftest-grabber-checks", action="store_true")
    p.add_argument("--grabber-include", default="")
    p.add_argument("--grabber-exclude", default="")
    p.add_argument("--grabber-all-sites", action="store_true",
                   help="untick 'explore the current site only'")
    args = p.parse_args(rest)

    # The display comes before everything else that could need one. An error
    # here (no Xvfb, no capture tool) must stop the launch while it is still
    # free of side effects — no engine spawned, no X server running.
    try:
        dplan, xvfb = open_display(vars(args), os.environ)
    except RuntimeError as e:
        print("[x] %s" % e, file=sys.stderr)
        return 2
    if dplan["mode"] == "error":
        print("[x] " + dplan["reason"], file=sys.stderr)
        return 2
    try:
        return _main_with_display(args, cmdline, p, dplan, xvfb)
    finally:
        stop_display(xvfb)


def _main_with_display(args, cmdline, p, dplan, xvfb):
    if args.selftest_display:
        return selftest_display(dplan, xvfb.pid if xvfb else 0)

    if args.selftest_grabber_project:
        return selftest_grabber_project(args.state_dir)
    if args.selftest_grabber_tree:
        return selftest_grabber_tree(args.state_dir)
    if args.selftest_grabber_checks:
        return selftest_grabber_checks(args.state_dir)
    if args.selftest_grabber_explore:
        if not args.url:
            print("--selftest-grabber-explore needs --url", file=sys.stderr)
            return 2
        return selftest_grabber_explore(
            args.url, args.grabber_template, depth=args.grabber_depth,
            external_depth=args.grabber_external_depth,
            same_site_only=not args.grabber_all_sites,
            include=args.grabber_include, exclude=args.grabber_exclude)

    if args.selftest_live_graph:
        if not args.meta:
            print("--selftest-live-graph needs --meta", file=sys.stderr)
            return 2
        return selftest_live_graph(args.meta)
    if args.selftest_batch_clipboard:
        return selftest_batch_clipboard()
    if args.selftest_drop_toggle:
        return selftest_drop_toggle()
    if args.selftest_drop_paste:
        return selftest_drop_paste()
    if args.selftest_row:
        return selftest_row()
    if args.selftest_scrollbars:
        return selftest_scrollbars()
    if args.selftest_icons:
        return selftest_icons()
    if args.selftest_tray:
        return selftest_tray()
    if args.selftest_gridlines:
        return selftest_gridlines()
    if args.selftest_gridlines_resize:
        return selftest_gridlines_resize()
    if args.selftest_gridlines_theme:
        return selftest_gridlines_theme()
    if args.selftest_migrate_logins:
        return selftest_migrate_logins()
    if args.selftest_add_ref:
        return selftest_add_ref()
    if args.selftest_store_password:
        return selftest_store_password()
    if args.selftest_formats_body:
        return selftest_formats_body()
    if args.selftest_format_labels:
        return selftest_format_labels()
    if args.selftest_add_format:
        return selftest_add_format()
    if args.selftest_file_info:
        return selftest_file_info()
    if args.selftest_properties_body:
        return selftest_properties_body()
    if args.selftest_properties_ok:
        return selftest_properties_ok()
    if args.selftest_scheduler:
        return selftest_scheduler(args.state_dir)
    if args.selftest_dont_show_again:
        return selftest_dont_show_again(args.state_dir)
    if args.selftest_download_options:
        if not args.url:
            print("--selftest-download-options needs --url", file=sys.stderr)
            return 2
        return selftest_download_options(args.state_dir, args.url)
    if args.selftest_add_body:
        if not args.url:
            print("--selftest-add-body needs --url", file=sys.stderr)
            return 2
        return selftest_add_body(args.state_dir, args.url)
    if args.selftest_options_data:
        return selftest_options_data(args.state_dir)
    if args.selftest_settings:
        return selftest_settings(args.state_dir)
    if args.selftest_dump:
        return selftest_dump(args.engine)
    if args.selftest_window:
        return selftest_window()
    if args.selftest_api:
        if not args.url:
            print("--selftest-api needs --url", file=sys.stderr)
            return 2
        return selftest_api(args.addr, args.url, args.api_token or read_token(args.state_dir))

    token = args.api_token or read_token(args.state_dir)
    api = Api(args.addr, token=token)

    # Build the window FIRST. If Tk cannot open a display (e.g. the GUI was
    # launched from a context without DISPLAY/XAUTHORITY) we fail here, BEFORE
    # any engine is spawned. Doing it the other way round meant every failed
    # launch left an orphaned `idm --serve` behind: the child is detached (its
    # own session), so it outlives this process, and nothing cleaned it up.
    try:
        root, refresh, _w = build_window(
            api, out_dir=args.out_dir, state_dir=args.state_dir
        )
    except Exception as e:  # noqa: BLE001
        disp = os.environ.get("DISPLAY") or "(nenastaveno)"
        print(
            f"[x] Nepodarilo se otevrit okno: {e}\n"
            f"    DISPLAY={disp}\n"
            "    Spust IDM v grafickem sezeni (RDP/Xpra, nebo terminal s DISPLAY),\n"
            "    pripadne nastav DISPLAY=:1. Engine se NESPUSTIL.",
            file=sys.stderr,
        )
        return 1

    # A window exists, so it is safe to make sure an engine is running.
    #
    # The address is not taken on trust. An engine from an earlier install can
    # still be holding it -- the binary deleted, the process alive -- and it
    # refuses our api-token, so every download silently fails while the window
    # looks healthy. server_decision() calls that case out and we move to the
    # next port rather than driving a queue that is not ours.
    proc = None
    engine_error = ""
    for addr in server_addr_plan(args.addr):
        api.addr_set(addr)
        decision = server_decision(**api.probe(), child_alive=None)
        if decision["action"] == "use":
            break
        if decision["action"] == "other_port":
            print(f"[!] {addr}: {decision['reason']}", file=sys.stderr)
            engine_error = decision.get("message", "")
            continue
        if not args.autostart:
            engine_error = (f"{addr} neodpovida. Spust `idm --serve {addr}` "
                            "nebo pouzij --autostart.")
            print(f"[!] {engine_error}", file=sys.stderr)
            break
        print(f"[*] starting engine: {args.engine} --serve {addr}", flush=True)
        token = args.api_token or new_token()
        api.token = token
        # The engine's own diagnostics ("address in use") used to go to
        # DEVNULL, which is why nothing could explain the silence.
        proc = spawn_server(args.engine, addr, args.out_dir, args.state_dir, token,
                            log_dir=args.state_dir)
        wait_alive(api, 15)
        decision = server_decision(**api.probe(),
                                   child_alive=(proc.poll() is None))
        if decision["action"] == "use":
            engine_error = ""
            break
        # Our child could not serve here. Take it down before trying the next
        # port so a half-dead engine is not left behind.
        if proc.poll() is None:
            proc.terminate()
        proc = None
        engine_error = decision.get("message", "") or decision["reason"]
        detail = engine_log_tail(args.state_dir)
        print(f"[!] {addr}: {decision['reason']}"
              + (f"\n    {detail}" if detail else ""), file=sys.stderr)
        if decision["action"] == "other_port":
            continue
        if detail:
            engine_error = f"{engine_error} ({detail})"
        break
    else:
        engine_error = engine_error or "Nepodarilo se spustit engine na zadnem portu."

    if engine_error:
        # Silence was the actual complaint: the window opened, the clipboard
        # prompt appeared, and nothing downloaded. Say it on screen -- but in
        # a banner, never a modal. A messagebox here waits for a click that
        # nothing in a --screenshot or autostart run will ever make, and the
        # program stops dead before it has drawn anything.
        _w["status_var"].set(f"engine: {engine_error}")
        show_banner(_w, engine_error)

    apply_items = _w["apply_items"]
    status_var = _w["status_var"]

    # A newer release found by an earlier check installs itself now, with the
    # progress on screen. The check that filled the cache is fired off at the
    # same time, so the NEXT launch knows about today's release -- asking
    # GitHub synchronously here would delay every start by a round trip, for
    # news that is almost never there.
    # What the last poll saw, so the update dialog can tell whether a restart
    # would cut a download off.
    seen = {"items": []}

    def _active_downloads():
        return sum(1 for it in seen["items"]
                   if isinstance(it, dict) and it.get("status") in LIVE_STATUSES)

    def _restart_idm():
        """Run the new version: the window again, with a new engine.

        The old engine is ours to stop -- left running out of bin.old it
        holds that tree and keeps answering the saved api-token, so the new
        window would simply reuse it. The tray goes first, or the old icon
        would sit next to the new one until the mouse passes over it.
        """
        nonlocal proc
        cmd = relaunch_command(sys.executable, sys.argv)
        if cmd is None:
            return
        try:
            t = tray
        except NameError:  # the dialog finished before the tray existed
            t = None
        if t is not None:
            t.stop()
        if proc is not None and proc.poll() is None:
            proc.terminate()
            try:
                proc.wait(timeout=5)
            except Exception:  # noqa: BLE001
                proc.kill()
        proc = None
        kwargs = {"stdout": subprocess.DEVNULL, "stderr": subprocess.DEVNULL,
                  "close_fds": True}
        if os.name == "nt":
            kwargs["creationflags"] = 0x08000000 | 0x00000008  # NO_WINDOW | DETACHED
        else:
            kwargs["start_new_session"] = True
        try:
            subprocess.Popen(cmd, **kwargs)
        except Exception as e:  # noqa: BLE001
            print("[x] restart se nepovedl: %s" % e, file=sys.stderr)
            return
        root.destroy()

    if auto_update_enabled(args.state_dir):
        cache = read_update_cache(args.state_dir)
        if should_offer_update(cache):
            try:
                _dialog_update(root, args.engine, args.state_dir,
                               str(cache.get("latest")), auto=True,
                               on_restart=_restart_idm, active=_active_downloads)
            except Exception as e:  # noqa: BLE001
                print("[!] aktualizacni okno se neotevrelo: %s" % e,
                      file=sys.stderr)
        else:
            try:
                kwargs = {"stdout": subprocess.DEVNULL,
                          "stderr": subprocess.DEVNULL}
                if os.name == "nt":
                    kwargs["creationflags"] = 0x08000000  # CREATE_NO_WINDOW
                subprocess.Popen([args.engine, "update", "--check"], **kwargs)
            except Exception:  # noqa: BLE001
                pass  # no network, no release, no matter

    # --screenshot comes LAST, once there is something worth photographing.
    # Taken right after build_window() it caught the window before its first
    # poll, so the picture showed an empty list even when the engine had a
    # full queue; and taken before the loop had run at all it was a black
    # rectangle. One synchronous fetch, one forced redraw, then the capture.
    if dplan.get("shot"):
        try:
            try:
                apply_items(api.items())
            except Exception as e:  # noqa: BLE001
                status_var.set("cannot reach idm --serve")
                print("[!] fronta se nenacetla pred snimkem: %s" % e, file=sys.stderr)
            if not draw_window(root):
                print("[!] okno se nestihlo vykreslit, snimek muze byt prazdny",
                      file=sys.stderr)
            print("[*] screenshot: %s" % take_screenshot(dplan), flush=True)
        except Exception as e:  # noqa: BLE001
            print("[!] screenshot selhal: %s" % e, file=sys.stderr)

    def tick():
        """Poll the queue without blocking the UI.

        The HTTP call runs on a worker thread (a dead or slow engine would
        otherwise freeze the window for the whole socket timeout) and only the
        rendering happens back on the Tk thread. The next tick is always
        scheduled, even if this one raised, so the loop cannot die.
        """

        def work():
            try:
                items = api.items()
            except Exception:  # noqa: BLE001
                items = None
            root.after(0, lambda: done(items))

        def done(items):
            try:
                if items is None:
                    status_var.set("cannot reach idm --serve")
                else:
                    status_var.set("Ready")
                    seen["items"] = items if isinstance(items, list) else []
                    apply_items(items)
                    # /q and /h fire from here: only the poll knows the queue
                    # has drained.
                    check_finished(items)
            except Exception:  # noqa: BLE001
                pass

        try:
            threading.Thread(target=work, daemon=True).start()
        finally:
            root.after(1000, tick)

    # --- act on the command line, now that the window and engine are up ---
    if cmdline["url"]:
        opts = download_options(load_settings(args.state_dir), cmdline["url"],
                                fallback_dir=args.out_dir)
        if cmdline["path"]:
            opts["out_dir"] = cmdline["path"]
        if cmdline["queue_only"]:
            # /a puts it in a queue instead of starting it.
            opts["queue"] = queue_names(load_settings(args.state_dir))[0]
        if cmdline["filename"]:
            # /f names the saved file; the engine keeps only the file component.
            opts["filename"] = cmdline["filename"]
        try:
            new_id = api.add(cmdline["url"], connections=opts["connections"],
                             options=opts)
            if cmdline["queue_only"] and new_id:
                api.pause(new_id)
            status_var.set(("queued: " if cmdline["queue_only"] else "added: ")
                           + basename(cmdline["url"]))
        except Exception as e:  # noqa: BLE001
            print(f"[x] /d failed: {e}", file=sys.stderr)
    if cmdline["start_queue"]:
        try:
            plan = queue_actions(api.items(),
                                 queue_names(load_settings(args.state_dir))[0],
                                 True)
            for i in plan["resume"]:
                api.resume(i)
            status_var.set(f"queue started: {len(plan['resume'])} file(s)")
        except Exception as e:  # noqa: BLE001
            print(f"[x] /s failed: {e}", file=sys.stderr)
    # /q and /h act once the queue has drained, which only the polling loop
    # can know; `finish_watch` is checked from tick().
    finish_watch = {"armed": bool(cmdline["exit_when_done"] or cmdline["hang_up"]),
                    "done": False}

    def check_finished(items):
        if not finish_watch["armed"] or finish_watch["done"]:
            return
        act = completion_action(cmdline, items, load_settings(args.state_dir))
        if not (act["quit"] or act["run"] or act["note"]):
            return
        finish_watch["done"] = True
        if act["note"]:
            print("[!] " + act["note"], file=sys.stderr)
        if act["run"]:
            try:
                subprocess.Popen(act["run"], shell=True)
                status_var.set("hanging up: " + act["run"])
            except Exception as e:  # noqa: BLE001
                print(f"[x] /h failed: {e}", file=sys.stderr)
        if act["quit"]:
            root.after(200, root.destroy)

    # Windows: the close button hides to the notification area, so running
    # downloads survive it; the icon's menu (or File > Exit) quits.
    tray_events = queue.Queue()
    tray = start_tray(tray_events.put, os.path.join(assets_dir(), "idm.ico"))

    def _show_window():
        root.deiconify()
        root.lift()
        try:
            root.focus_force()
        except Exception:  # noqa: BLE001
            pass

    def _on_close_button():
        if close_action(os.name == "nt", tray is not None,
                        load_settings(args.state_dir)) == "hide":
            root.withdraw()
        else:
            root.destroy()

    def _poll_tray():
        try:
            while True:
                ev = tray_events.get_nowait()
                if ev == "show":
                    _show_window()
                elif ev == "quit":
                    root.destroy()
                    return
        except queue.Empty:
            pass
        root.after(150, _poll_tray)

    if tray is not None:
        root.protocol("WM_DELETE_WINDOW", _on_close_button)
        root.after(150, _poll_tray)

    tick()
    try:
        root.mainloop()
    finally:
        if tray is not None:
            tray.stop()
        if proc is not None:
            proc.terminate()
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
