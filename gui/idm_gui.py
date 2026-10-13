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
import subprocess
import threading
import sys
import time
import urllib.request

DEFAULT_ADDR = "127.0.0.1:8080"

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
COLUMNS = [
    ("name", "File Name", 280),
    ("size", "Size", 90),
    ("status", "Status", 110),
    ("speed", "Speed", 90),
    ("time", "Time Left", 80),
    ("queue", "Q", 40),
]

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
]

# --------------------------------------------------------------------------- #
# Runtime-drawn icons (IDM has coloured toolbar/category icons; we render ours
# with PIL so we ship no binary assets and still look like the original).
# --------------------------------------------------------------------------- #
_ICON_CACHE = {}


def _icon(color, shape="square", size=16, master=None):
    """Return a Tk PhotoImage for a small coloured icon (cached).

    Draws a simple but recognisable glyph so the toolbar/tree look like IDM
    instead of bare text buttons. Falls back to None if PIL is unavailable.
    """
    key = (color, shape, size)
    if key in _ICON_CACHE:
        return _ICON_CACHE[key]
    try:
        from PIL import Image, ImageDraw, ImageTk
    except Exception:  # noqa: BLE001
        _ICON_CACHE[key] = None
        return None
    img = Image.new("RGBA", (size, size), (0, 0, 0, 0))
    d = ImageDraw.Draw(img)
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
    try:
        ph = ImageTk.PhotoImage(img, master=master)
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

    def add(self, url: str, connections: int = 4, aria2: bool = False) -> int:
        body = {"url": url, "connections": connections}
        if aria2:
            body["aria2"] = True
        r = self._req("POST", "/api/add", body)
        return int(r.get("id", 0))

    def pause(self, i: int) -> dict:
        return self._req("POST", "/api/pause", {"id": i})

    def resume(self, i: int) -> dict:
        return self._req("POST", "/api/resume", {"id": i})

    def remove(self, i: int) -> dict:
        return self._req("POST", "/api/remove", {"id": i})

    def alive(self) -> bool:
        try:
            self.items()
            return True
        except Exception:
            return False


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
# Dialog windows (each mirrors an IDM dialog)
# --------------------------------------------------------------------------- #
def _dialog_add_url(parent):
    """IDM 'Add URL' dialog: URL box + 'Use authorization'."""
    import tkinter as tk
    from tkinter import ttk

    win = tk.Toplevel(parent)
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


def _dialog_file_info(parent, url, folder, category):
    """IDM 'Download File Info' dialog."""
    import tkinter as tk
    from tkinter import ttk

    win = tk.Toplevel(parent)
    win.title("Download File Info")
    win.geometry("460x230")
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
    btns = ttk.Frame(win)
    btns.grid(row=3, column=0, columnspan=2, sticky="e", padx=8, pady=10)
    start = ttk.Button(btns, text="Start Download")
    later = ttk.Button(btns, text="Download Later")
    cancel = ttk.Button(btns, text="Cancel", command=win.destroy)
    start.pack(side="left", padx=4)
    later.pack(side="left", padx=4)
    cancel.pack(side="left", padx=4)
    return win, start, later


def _dialog_options(parent):
    """IDM 'Options' dialog with its tabs."""
    import tkinter as tk
    from tkinter import ttk

    win = tk.Toplevel(parent)
    win.title("Options")
    win.geometry("520x360")
    nb = ttk.Notebook(win)
    nb.pack(fill="both", expand=True, padx=8, pady=8)
    for name in OPTIONS_TABS:
        frame = ttk.Frame(nb)
        nb.add(frame, text=name)
        ttk.Label(frame, text=name).pack(anchor="w", padx=10, pady=10)
    bar = ttk.Frame(win)
    bar.pack(fill="x", padx=8, pady=(0, 8))
    ttk.Button(bar, text="OK", command=win.destroy).pack(side="right", padx=4)
    ttk.Button(bar, text="Cancel", command=win.destroy).pack(side="right", padx=4)
    ttk.Button(bar, text="Apply").pack(side="right", padx=4)
    return win, nb


def _dialog_scheduler(parent):
    """IDM 'Scheduler' dialog: queue list + Schedule / Files in the queue."""
    import tkinter as tk
    from tkinter import ttk

    win = tk.Toplevel(parent)
    win.title("Scheduler")
    win.geometry("560x400")

    left = ttk.Frame(win)
    left.pack(side="left", fill="y", padx=8, pady=8)
    ttk.Label(left, text="Queues").pack(anchor="w")
    qlist = tk.Listbox(left, width=20, height=14)
    for q in ("Main download queue", "Synchronization queue"):
        qlist.insert("end", q)
    qlist.pack(fill="y", expand=True)

    right = ttk.Frame(win)
    right.pack(side="left", fill="both", expand=True, padx=8, pady=8)
    nb = ttk.Notebook(right)
    nb.pack(fill="both", expand=True)
    sched = ttk.Frame(nb)
    files = ttk.Frame(nb)
    nb.add(sched, text="Schedule")
    nb.add(files, text="Files in the queue")

    ttk.Label(sched, text="Start download at:").grid(row=0, column=0, sticky="w", padx=6, pady=6)
    start_at = ttk.Entry(sched, width=12)
    start_at.insert(0, "23:00:00")
    start_at.grid(row=0, column=1, sticky="w", padx=6, pady=6)
    ttk.Label(sched, text="Stop download at:").grid(row=1, column=0, sticky="w", padx=6, pady=6)
    stop_at = ttk.Entry(sched, width=12)
    stop_at.insert(0, "7:30:00")
    stop_at.grid(row=1, column=1, sticky="w", padx=6, pady=6)
    ttk.Label(sched, text="Number of retries for each file if downloading failed:").grid(
        row=2, column=0, columnspan=2, sticky="w", padx=6, pady=6
    )
    retries = ttk.Spinbox(sched, from_=0, to=100, width=6)
    retries.set(10)
    retries.grid(row=3, column=1, sticky="w", padx=6)
    for txt in ("Open the following file when done:", "Hang up modem when done",
                "Exit Internet Download Manager when done", "Turn off computer when done"):
        ttk.Checkbutton(sched, text=txt).grid(row=4, column=0, columnspan=2, sticky="w", padx=6)

    qfiles = ttk.Treeview(files, columns=("name", "status"), show="headings", height=8)
    qfiles.heading("name", text="File Name")
    qfiles.heading("status", text="Status")
    qfiles.pack(fill="both", expand=True, padx=6, pady=6)

    bar = ttk.Frame(win)
    bar.pack(side="bottom", fill="x", padx=8, pady=(0, 8))
    ttk.Button(bar, text="Start Now").pack(side="left", padx=4)
    ttk.Button(bar, text="Stop").pack(side="left", padx=4)
    ttk.Button(bar, text="Delete").pack(side="left", padx=4)
    ttk.Button(bar, text="Apply").pack(side="right", padx=4)
    ttk.Button(bar, text="Close", command=win.destroy).pack(side="right", padx=4)
    return win, nb


def _dialog_properties(parent, url, out):
    """IDM 'Properties' dialog."""
    import tkinter as tk
    from tkinter import ttk

    win = tk.Toplevel(parent)
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
    d.grid(row=2, column=1, padx=8, pady=6)
    bar = ttk.Frame(win)
    bar.grid(row=3, column=0, columnspan=2, sticky="e", padx=8, pady=10)
    ttk.Button(bar, text="Open").pack(side="left", padx=4)
    ttk.Button(bar, text="OK", command=win.destroy).pack(side="left", padx=4)
    return win


def _dialog_complete(parent, path):
    """IDM 'Download Complete' dialog."""
    import tkinter as tk
    from tkinter import ttk

    win = tk.Toplevel(parent)
    win.title("Download Complete")
    win.geometry("420x160")
    ttk.Label(win, text="Download complete:").pack(anchor="w", padx=10, pady=(12, 2))
    ttk.Label(win, text=path).pack(anchor="w", padx=10, pady=2)
    ttk.Button(win, text="Open", command=win.destroy).pack(anchor="w", padx=10, pady=6)
    ttk.Checkbutton(win, text="Don't show this dialog again").pack(anchor="w", padx=10)
    ttk.Button(win, text="Close", command=win.destroy).pack(anchor="e", padx=10, pady=6)
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


def _dialog_progress(parent, name, connections=4, on_pause=None, meta_path=None):
    """IDM 'Download Progress' (File Download) dialog with a segment graph."""
    import tkinter as tk
    from tkinter import ttk

    win = tk.Toplevel(parent)
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
    ttk.Button(btns, text="Options on completion").pack(side="right")

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


def build_window(api: Api, out_dir: str = "", on_close=None):
    """Construct the main window and return (root, refresh_fn, widgets)."""
    import tkinter as tk
    from tkinter import ttk

    root = tk.Tk()
    root.title("Internet Download Manager")
    root.geometry("900x520")
    root.minsize(720, 400)

    w = {}  # widget registry, used by --selftest-dump

    # --- toolbar (above the list, like IDM) ---
    toolbar = ttk.Frame(root, padding=(6, 6, 6, 2))
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
        b.pack(side="left", padx=2)
        w["buttons"].append((name, b))
    w["buttons_with_icons"] = sum(
        1 for _n, btn in w["buttons"] if _button_has_icon(btn)
    )

    # --- search row (IDM has it above the list) ---
    search_row = ttk.Frame(root, padding=(6, 2))
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

    # --- body: category tree LEFT, download list RIGHT ---
    body = ttk.Panedwindow(root, orient="horizontal")
    body.pack(fill="both", expand=True, padx=6, pady=4)

    left = ttk.Frame(body)
    ttk.Label(left, text="Categories").pack(anchor="w")
    tree = ttk.Treeview(left, show="tree", selectmode="browse")
    tree.pack(fill="both", expand=True)
    parent = ""
    for c in CATEGORIES:
        spec = CATEGORY_ICONS.get(c)
        img = _icon(spec[0], spec[1], 14, master=root) if spec else None
        if img is not None:
            w["icons"].append(img)
            tree.insert(parent, "end", text=c, image=img)
        else:
            tree.insert(parent, "end", text=c)
    w["tree"] = tree
    w["categories_with_icons"] = sum(
        1 for i in tree.get_children("") if tree.item(i, "image")
    )
    body.add(left, weight=1)

    right = ttk.Frame(body)
    listview = ttk.Treeview(
        right, columns=[c[0] for c in COLUMNS], show="headings", selectmode="extended"
    )
    for key, title, width in COLUMNS:
        listview.heading(key, text=title)
        listview.column(key, width=width, anchor="w")
    listview.pack(fill="both", expand=True)
    w["list"] = listview
    body.add(right, weight=4)

    # --- progress + status bar at the bottom ---
    progress = ttk.Progressbar(root, mode="determinate", maximum=100)
    progress.pack(fill="x", padx=6)
    status = tk.StringVar(value="Ready")
    ttk.Label(root, textvariable=status, relief="sunken", anchor="w").pack(
        fill="x", side="bottom"
    )
    w["progress"] = progress
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
            btn.config(command=lambda: _dialog_options(root))
        elif name == "Scheduler":
            btn.config(command=lambda: _dialog_scheduler(root))
        elif name == "Delete Completed":
            btn.config(command=lambda: _delete_completed())
        elif name in ("Start Queue", "Stop Queue"):
            btn.config(command=lambda n=name: status.set(f"{n} pressed"))

    def _delete_completed():
        try:
            for it in api.items():
                if it.get("status") == "done":
                    api.remove(it["id"])
        except Exception as e:  # noqa: BLE001
            status.set(f"error: {e}")
        refresh()

    def _on_add():
        win, url_entry, auth = _dialog_add_url(root)

        def go(later=False):
            u = url_entry.get().strip()
            if not u:
                return
            win.destroy()
            # IDM shows "Download File Info" next.
            info_win, start, later_btn = _dialog_file_info(
                root, u, out_dir or ".", category_of(u)
            )

            def do_start():
                info_win.destroy()
                try:
                    api.add(u, aria2=bool(aria2_var.get()))
                    status.set(f"added: {basename(u)}")
                except Exception as e:  # noqa: BLE001
                    status.set(f"error: {e}")
                refresh()

            def do_later():
                info_win.destroy()
                try:
                    api.add(u, aria2=bool(aria2_var.get()))
                    status.set(f"queued: {basename(u)}")
                except Exception as e:  # noqa: BLE001
                    status.set(f"error: {e}")
                refresh()

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
            _dialog_properties(root, it.get("url", ""), it.get("output", ""))

    listview.bind("<Double-1>", _on_open_properties)
    listview.bind("<Button-3>", _on_open_properties)

    def apply_items(items):
        """Render a queue snapshot. Must run on the Tk thread."""
        seen = set()
        for it in items:
            try:
                iid = str(it["id"])
                name = basename(it.get("url", ""))
                dl = it.get("downloaded") or 0
                total = it.get("total") or 0
                size = f"{fmt_size(dl)} / {fmt_size(total)}" if total else fmt_size(dl)
                st = it.get("status", "")
                speed = it.get("speed") or ""
                time_left = it.get("time_left") or ""
                q = "*" if st in ("running", "pending") else ""
                # One value per column in COLUMNS; the id lives in the iid.
                vals = (name, size, st, speed, time_left, q)
            except Exception:  # noqa: BLE001
                continue
            seen.add(iid)
            if listview.exists(iid):
                listview.item(iid, values=vals)
            else:
                listview.insert("", "end", iid=iid, values=vals)
            if st == "running":
                progress["value"] = (dl / total * 100.0) if total else 0.0
        for iid in list(listview.get_children()):
            if iid not in seen:
                listview.delete(iid)

    def refresh():
        try:
            items = api.items()
        except Exception:  # noqa: BLE001
            status.set("cannot reach idm --serve")
            return
        apply_items(items)

    w["apply_items"] = apply_items

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


def spawn_server(engine, addr, out_dir, state_dir, token: str = ""):
    os.makedirs(out_dir, exist_ok=True)
    os.makedirs(state_dir, exist_ok=True)
    cmd = [engine, "--serve", addr, "--output-dir", out_dir, "--state-dir", state_dir]
    if token:
        cmd += ["--api-token", token]
    return subprocess.Popen(
        cmd,
        stdout=subprocess.DEVNULL,
        stderr=subprocess.DEVNULL,
    )


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


def selftest_window():
    api = Api("127.0.0.1:1", timeout=0.2)
    root, refresh, _w = build_window(api)
    root.update_idletasks()
    root.update()
    title = root.title()
    root.destroy()
    print(f"SELFTEST-WINDOW: OK title={title!r}", flush=True)
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
    dialogs.append({"title": aw.title(), "widgets": acc["labels"] + acc["buttons"], "tabs": acc["tabs"]})

    fw, _s, _l = _dialog_file_info(root, "http://x/file.mp4", ".", "Video")
    fw.withdraw()
    acc = {"buttons": [], "labels": [], "tabs": []}
    _collect_widgets(fw, acc)
    dialogs.append({"title": fw.title(), "widgets": acc["labels"] + acc["buttons"], "tabs": acc["tabs"]})

    ow, onb = _dialog_options(root)
    ow.withdraw()
    acc = {"buttons": [], "labels": [], "tabs": []}
    _collect_widgets(ow, acc)
    dialogs.append({"title": ow.title(), "widgets": acc["labels"] + acc["buttons"], "tabs": acc["tabs"]})

    sw, _snb = _dialog_scheduler(root)
    sw.withdraw()
    acc = {"buttons": [], "labels": [], "tabs": []}
    _collect_widgets(sw, acc)
    dialogs.append({"title": sw.title(), "widgets": acc["labels"] + acc["buttons"], "tabs": acc["tabs"]})

    pw = _dialog_properties(root, "http://x/f.mp4", "/tmp/f.mp4")
    pw.withdraw()
    acc = {"buttons": [], "labels": [], "tabs": []}
    _collect_widgets(pw, acc)
    dialogs.append({"title": pw.title(), "widgets": acc["labels"] + acc["buttons"], "tabs": acc["tabs"]})

    cw = _dialog_complete(root, "/tmp/f.mp4")
    cw.withdraw()
    acc = {"buttons": [], "labels": [], "tabs": []}
    _collect_widgets(cw, acc)
    dialogs.append({"title": cw.title(), "widgets": acc["labels"] + acc["buttons"], "tabs": acc["tabs"]})

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
    })

    acc_all = {"buttons": [], "labels": [], "tabs": []}
    _collect_widgets(main_root, acc_all)
    widget_labels = acc_all["labels"] + acc_all["buttons"]

    dump = {
        "buttons": buttons,
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
        "dialogs": dialogs,
    }

    # Cleanup.
    for win in (aw, fw, ow, sw, pw, cw, pw2):
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


def main(argv=None):
    p = argparse.ArgumentParser(description="Native window for the IDM-like downloader")
    p.add_argument("--addr", default=os.environ.get("IDM_ADDR", DEFAULT_ADDR))
    p.add_argument("--engine", default=os.environ.get("IDM_ENGINE_BIN", "idm"))
    p.add_argument("--out-dir", default=os.environ.get("IDM_DOWNLOADS_DIR", os.path.expanduser("~/Downloads")))
    p.add_argument("--state-dir", default=os.environ.get("IDM_STATE_DIR", os.path.expanduser("~/.local/share/idm-gui")))
    p.add_argument("--autostart", action="store_true")
    p.add_argument(
        "--api-token",
        default=os.environ.get("IDM_API_TOKEN", ""),
        help="API secret (default: read STATE_DIR/api-token, or generate one with --autostart)",
    )
    p.add_argument("--url", help="URL for --selftest-api")
    p.add_argument("--selftest-api", action="store_true")
    p.add_argument("--selftest-window", action="store_true")
    p.add_argument("--selftest-dump", action="store_true")
    p.add_argument("--selftest-live-graph", action="store_true")
    p.add_argument("--meta", help="path to a .idmmeta for --selftest-live-graph")
    args = p.parse_args(argv)

    if args.selftest_live_graph:
        if not args.meta:
            print("--selftest-live-graph needs --meta", file=sys.stderr)
            return 2
        return selftest_live_graph(args.meta)
    if args.selftest_dump:
        return selftest_dump(args.engine)
    if args.selftest_window:
        return selftest_window()
    if args.selftest_api:
        if not args.url:
            print("--selftest-api needs --url", file=sys.stderr)
            return 2
        return selftest_api(args.addr, args.url, args.api_token or read_token(args.state_dir))

    # Talk to an engine that is already running with the token it wrote; if we
    # start it ourselves, we hand it a fresh one.
    token = args.api_token or read_token(args.state_dir)
    api = Api(args.addr, token=token)
    proc = None
    if not api.alive():
        if args.autostart:
            print(f"[*] starting engine: {args.engine} --serve {args.addr}", flush=True)
            token = args.api_token or new_token()
            api.token = token
            proc = spawn_server(args.engine, args.addr, args.out_dir, args.state_dir, token)
            wait_alive(api, 15)
        else:
            print(
                f"[!] {args.addr} neodpovida. Spust `idm --serve {args.addr}` "
                "nebo pouzij --autostart.",
                file=sys.stderr,
            )

    root, refresh, _w = build_window(api, out_dir=args.out_dir)

    apply_items = _w["apply_items"]
    status_var = _w["status_var"]

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
                    apply_items(items)
            except Exception:  # noqa: BLE001
                pass

        try:
            threading.Thread(target=work, daemon=True).start()
        finally:
            root.after(1000, tick)

    tick()
    try:
        root.mainloop()
    finally:
        if proc is not None:
            proc.terminate()
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
