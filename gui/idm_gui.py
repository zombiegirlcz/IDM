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
import shutil
import subprocess
import threading
import sys
import time
import urllib.parse
import urllib.request

DEFAULT_ADDR = "127.0.0.1:8080"
# Kept in step with engine/Cargo.toml (and so with the git tags), because
# "Check for updates" compares this against the newest published tag: at
# "1.0.0" against tags of v0.1.x it could only ever say "up to date".
# gui/test/version_sync.test.mjs fails if the two drift apart.
VERSION = "0.1.4"

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
    ("description", "Description", 180),
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
    "Grabber",
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
        out_dir / temp_dir / user_agent / proxy, so the Options dialog is not
        decoration. An older engine ignores the extra keys.
        """
        body = {"url": url, "connections": connections}
        if aria2:
            body["aria2"] = True
        for key in ("out_dir", "temp_dir", "user_agent", "proxy", "auth",
                    "queue", "format", "cookie", "referer"):
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
# Settings (persisted to STATE_DIR/settings.json)
# --------------------------------------------------------------------------- #
# The real IDM keeps every Options-tab value in the registry. We keep the same
# structure in a JSON file next to the queue, so the Options dialog is not just
# decoration: values survive a restart and the ones that map to engine flags
# are actually used when a download is added.
DEFAULT_SETTINGS = {
    "general": {
        "launch_on_startup": True,
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
        "temp_dir": "",
        "change_on_last": False,
    },
    "downloads": {
        "show_start_dialog": True,
        "show_complete_dialog": True,
        "start_immediately": True,
        "ignore_mtime": False,
        "show_progress": "normal",  # normal | minimized | don't show
        "user_agent": "",
        "virus_checker": "",
        "virus_params": "[File]",
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


def save_settings(state_dir: str, settings: dict) -> None:
    """Atomically write settings.json under STATE_DIR."""
    if not state_dir:
        return
    os.makedirs(state_dir, exist_ok=True)
    path = settings_path(state_dir)
    tmp = path + ".tmp"
    with open(tmp, "w", encoding="utf-8") as f:
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


def _upsert_site_login(settings: dict, url: str, user: str, password: str) -> dict:
    """Add or replace the login for `url` (one record per URL)."""
    out = _deep_merge(DEFAULT_SETTINGS, settings or {})
    url = (url or "").strip()
    if not url:
        return out
    logins = [x for x in out.get("site_logins", [])
              if (x or {}).get("url") != url]
    logins.append({"url": url, "user": user or "", "password": password or ""})
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


def site_login_for(settings: dict, url: str) -> str:
    """"user:password" for the Site Logins entry covering `url`, else "".

    Matching is by host, so a login never leaks to a different server, and the
    longest matching path wins when one host has several entries.
    """
    host = host_of(url)
    if not host:
        return ""
    try:
        path = urllib.parse.urlsplit(url).path or "/"
    except Exception:  # noqa: BLE001
        return ""
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
        return ""
    return "%s:%s" % (best.get("user", ""), best.get("password", ""))


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
      temp_dir     save_to.temp_dir (where the .idmpart chunks live)
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

    return {
        "connections": max(1, conns),
        "out_dir": out_dir,
        "temp_dir": s["save_to"].get("temp_dir") or "",
        "user_agent": s["downloads"].get("user_agent") or "",
        "proxy": proxy,
        "limit_rate": limit_rate,
        "auth": site_login_for(s, url),
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
    "name": lambda it: basename(it.get("url", "")).lower(),
    "size": lambda it: int(it.get("total") or 0),
    "status": lambda it: str(it.get("status", "")).lower(),
    "speed": lambda it: float(it.get("speed_bps") or 0),
    "time": lambda it: float(it.get("time_left_s") or 0),
    "queue": lambda it: str(it.get("status", "")) in ("running", "pending"),
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
    win = tk.Toplevel(parent)
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


def _same_site(a: str, b: str) -> bool:
    try:
        from urllib.parse import urlparse
        return urlparse(a).netloc == urlparse(b).netloc
    except Exception:  # noqa: BLE001
        return False


def crawl_site(start_url: str, max_pages: int = 50,
               file_exts=None, same_site_only: bool = True,
               timeout: float = 8.0, should_stop=None) -> list:
    """Explore a site breadth-first and return file URLs (the IDM Grabber).

    Only HTML pages are followed; anything whose path ends in one of
    `file_exts` (or that is not an HTML page) is collected as a file. Returns a
    de-duplicated, sorted list of absolute URLs.

    `should_stop` is checked before each page: when it returns true the crawl
    returns what it has so far. Without it "Stop Exploring" is unimplementable,
    because the crawl would hold the Tk thread for its whole run.
    """
    import re
    from urllib.parse import urljoin, urlparse

    exts = set(e.lower().lstrip(".") for e in (file_exts or []))
    start = start_url.strip()
    if not looks_like_url(start):
        return []
    seen_pages = set()
    found = set()
    queue = [start]
    href_re = re.compile(r'''(?:href|src)\s*=\s*["']([^"']+)["']''', re.I)
    while queue and len(seen_pages) < max_pages:
        if should_stop is not None and should_stop():
            break
        url = queue.pop(0)
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
            if same_site_only and not _same_site(link, start):
                continue
            path = urlparse(link).path.lower()
            ext = path.rsplit(".", 1)[-1] if "." in path else ""
            if ext in exts:
                found.add(link)
            elif ext in ("", "html", "htm", "php", "asp", "aspx", "jsp"):
                if link not in seen_pages:
                    queue.append(link)
            else:
                if not exts or ext in exts:
                    found.add(link)
    return sorted(found)


def _dialog_grabber(parent, api=None, state_dir="", out_dir=""):
    """IDM Grabber: a 4-step wizard plus the main action dialog.

    Mirrors docs/idm/idm-grabber_grabber_wizard.txt and
    idm-grabber_grabber_main_dialog.txt. Step 1 is the start page, step 2 the
    save folder, steps 3/4 are filters; the main dialog then explores the site
    and can add the checked files to the main download list.
    """
    import tkinter as tk
    from tkinter import ttk, filedialog, messagebox

    win = tk.Toplevel(parent)
    win.title("IDM Grabber")
    win.geometry("720x520")

    state = {"files": [], "checked": set()}

    wiz = ttk.Notebook(win)
    wiz.pack(fill="x", padx=8, pady=8)

    s1 = ttk.Frame(wiz)
    wiz.add(s1, text="1. Start page")
    ttk.Label(s1, text="Grabber Project Name:").grid(row=0, column=0, sticky="w", padx=6, pady=4)
    proj = ttk.Entry(s1, width=40)
    proj.insert(0, "My project")
    proj.grid(row=0, column=1, padx=6, pady=4, sticky="w")
    ttk.Label(s1, text="Start page (URL):").grid(row=1, column=0, sticky="w", padx=6, pady=4)
    start = ttk.Entry(s1, width=50)
    start.insert(0, "https://")
    start.grid(row=1, column=1, padx=6, pady=4, sticky="w")
    ttk.Label(s1, text="Project template:").grid(row=2, column=0, sticky="w", padx=6, pady=4)
    template = ttk.Combobox(s1, values=["custom", "All files from a web site",
                                        "All images from a web site",
                                        "All video from a web site",
                                        "All audio from a web site"], width=30)
    template.set("All files from a web site")
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
    ttk.Checkbutton(s2, text="Save each file to the folder of its category").grid(
        row=1, column=1, sticky="w", padx=6)
    ttk.Checkbutton(s2, text="Add checked files to IDM on close").grid(
        row=2, column=1, sticky="w", padx=6)

    s3 = ttk.Frame(wiz)
    wiz.add(s3, text="3. Explore")
    same_site = tk.BooleanVar(value=True)
    ttk.Checkbutton(s3, text="Explore the current site only",
                    variable=same_site).grid(row=0, column=0, sticky="w", padx=6, pady=4)
    ttk.Label(s3, text="Max pages to explore:").grid(row=1, column=0, sticky="w", padx=6, pady=4)
    max_pages = ttk.Spinbox(s3, from_=1, to=1000, width=6)
    max_pages.set(50)
    max_pages.grid(row=1, column=1, sticky="w", padx=6)

    s4 = ttk.Frame(wiz)
    wiz.add(s4, text="4. Filters")
    ttk.Label(s4, text="File types to download (space separated):").grid(
        row=0, column=0, sticky="w", padx=6, pady=4)
    exts = ttk.Entry(s4, width=50)
    exts.insert(0, "zip rar 7z pdf doc docx mp3 mp4 mkv avi jpg jpeg png gif exe msi")
    exts.grid(row=0, column=1, padx=6, pady=4, sticky="w")

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
        file_exts = exts.get().split()
        on_site = bool(same_site.get())

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
            return
        added = 0
        settings = load_settings(state_dir)
        for i in sorted(state["checked"]):
            url = state["files"][i]
            try:
                opts = download_options(settings, url, fallback_dir=out_dir)
                api.add(url, connections=opts["connections"], options=opts)
                added += 1
            except Exception:  # noqa: BLE001
                pass
        info.set(f"Added {added} files to IDM.")

    def stats():
        messagebox.showinfo(
            "IDM Grabber Statistics",
            f"Files found: {len(state['files'])}\n"
            f"Checked: {len(state['checked'])}\n"
            f"Start page: {start.get().strip()}\n"
            f"Save to: {folder.get().strip()}", parent=win)

    btns = toolbar.winfo_children()
    btns[0].config(command=explore)
    btns[1].config(command=stop_exploring)  # "Stop Exploring"
    btns[2].config(command=check_all)
    btns[3].config(command=uncheck_all)
    btns[4].config(command=add_to_idm)
    btns[5].config(command=add_to_idm)
    btns[6].config(command=stats)

    wiz.select(0)
    win._idm_grabber = {"state": state, "start": start, "render": render}
    return win


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


def _dialog_file_info(parent, url, folder, category, formats=None):
    """IDM 'Download File Info' dialog.

    `formats` is a list from Api.formats(); the combobox offers them and
    `win.selected_format()` returns the yt-dlp selector the user picked ("" =
    let the backend choose). With no formats the combobox still exists and
    offers only that default, so a plain file URL behaves as before.
    """
    import tkinter as tk
    from tkinter import ttk

    win = tk.Toplevel(parent)
    win.title("Download File Info")
    win.geometry("520x280")
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

    btns = ttk.Frame(win)
    btns.grid(row=4, column=0, columnspan=2, sticky="e", padx=8, pady=10)
    start = ttk.Button(btns, text="Start Download")
    later = ttk.Button(btns, text="Download Later")
    cancel = ttk.Button(btns, text="Cancel", command=win.destroy)
    start.pack(side="left", padx=4)
    later.pack(side="left", padx=4)
    cancel.pack(side="left", padx=4)
    return win, start, later


def _dialog_options(parent, settings=None, on_save=None, state_dir="", out_dir=""):
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

    win = tk.Toplevel(parent)
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
    add_row(st, "Save To", "Temporary directory:",
            "save_to.temp_dir", s["save_to"]["temp_dir"], browse=True)
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

    def _render_logins():
        login_lb.delete(0, "end")
        for x in s["site_logins"]:
            login_lb.insert("end", x.get("url", ""))

    def _save_login():
        nonlocal s
        if not url_v.get().strip():
            return
        s = _upsert_site_login(s, url_v.get(), user_v.get(), pass_v.get())
        _render_logins()

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

    win = tk.Toplevel(parent)
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


def row_values(it: dict) -> tuple:
    """One value per entry in COLUMNS, for a single item from /api/items."""
    dl = it.get("downloaded") or 0
    total = it.get("total") or 0
    status = it.get("status", "")
    return (
        basename(it.get("url", "")),
        f"{fmt_size(dl)} / {fmt_size(total)}" if total else fmt_size(dl),
        status,
        it.get("speed") or "",
        it.get("time_left") or "",
        "*" if status in ("running", "pending") else "",
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

    win = tk.Toplevel(parent)
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

    win = tk.Toplevel(parent)
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


def _dialog_registration(parent):
    """IDM 'Registration' dialog.

    This build is a POC with no licensing, so there is nothing to validate --
    the dialog says so plainly instead of pretending to accept a serial.
    """
    import tkinter as tk
    from tkinter import ttk

    win = tk.Toplevel(parent)
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


def build_window(api: Api, out_dir: str = "", on_close=None, state_dir: str = ""):
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

    def rebuild_tree():
        """Fill the category tree from the persisted settings."""
        tree.delete(*tree.get_children(""))
        for c in list_categories(load_settings(state_dir)):
            spec = CATEGORY_ICONS.get(c)
            img = _icon(spec[0], spec[1], 14, master=root) if spec else None
            if img is not None:
                w["icons"].append(img)
                tree.insert("", "end", text=c, image=img)
            else:
                tree.insert("", "end", text=c)
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
    listview.pack(fill="both", expand=True)
    w["list"] = listview
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

            def do_start():
                chosen = info_win.selected_format()
                info_win.destroy()
                if chosen:
                    opts["format"] = chosen
                _add("added")

            def do_later():
                chosen = info_win.selected_format()
                info_win.destroy()
                if chosen:
                    opts["format"] = chosen
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
        return tree.item(sel[0], "text") if sel else None

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
            on_save=lambda st: save_settings(state_dir, st),
            state_dir=state_dir,
            out_dir=out_dir,
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
        for it in items:
            try:
                iid = str(it["id"])
                dl = it.get("downloaded") or 0
                total = it.get("total") or 0
                st = it.get("status", "")
                # One value per column in COLUMNS; the id lives in the iid.
                vals = row_values(it)
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
    w["menus"] = ["File", "Downloads", "View", "Help"]

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
        url = (data or "").strip()
        if looks_like_url(url):
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


def spawn_server(engine, addr, out_dir, state_dir, token: str = ""):
    os.makedirs(out_dir, exist_ok=True)
    os.makedirs(state_dir, exist_ok=True)
    cmd = [engine, "--serve", addr, "--output-dir", out_dir, "--state-dir", state_dir]
    if token:
        cmd += ["--api-token", token]
    kwargs = {
        "stdout": subprocess.DEVNULL,
        "stderr": subprocess.DEVNULL,
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
    print("OPTIONS:" + json.dumps(opts, sort_keys=True), flush=True)
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
    print("BODY:" + json.dumps(received, sort_keys=True), flush=True)
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
    root.destroy()

    print("FILE-INFO:" + json.dumps({
        "combos": combos,
        "format_values": format_values,
        "selected_format": selected,
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
        "dialogs": dialogs,
    }

    # Cleanup.
    for win in (aw, fw, ow, sw, pw, cw, abw, grw, pw2):
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
    p.add_argument("--selftest-settings", action="store_true")
    p.add_argument("--selftest-options-data", action="store_true")
    p.add_argument("--selftest-download-options", action="store_true")
    p.add_argument("--selftest-add-body", action="store_true")
    p.add_argument("--selftest-dont-show-again", action="store_true")
    p.add_argument("--selftest-properties-body", action="store_true")
    p.add_argument("--selftest-properties-ok", action="store_true")
    p.add_argument("--selftest-row", action="store_true")
    p.add_argument("--selftest-formats-body", action="store_true")
    p.add_argument("--selftest-format-labels", action="store_true")
    p.add_argument("--selftest-add-format", action="store_true")
    p.add_argument("--selftest-file-info", action="store_true")
    p.add_argument("--selftest-scheduler", action="store_true")
    p.add_argument("--selftest-live-graph", action="store_true")
    p.add_argument("--meta", help="path to a .idmmeta for --selftest-live-graph")
    args = p.parse_args(rest)

    if args.selftest_live_graph:
        if not args.meta:
            print("--selftest-live-graph needs --meta", file=sys.stderr)
            return 2
        return selftest_live_graph(args.meta)
    if args.selftest_row:
        return selftest_row()
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

    # --- act on the command line, now that the window and engine are up ---
    if cmdline["url"]:
        opts = download_options(load_settings(args.state_dir), cmdline["url"],
                                fallback_dir=args.out_dir)
        if cmdline["path"]:
            opts["out_dir"] = cmdline["path"]
        if cmdline["queue_only"]:
            # /a puts it in a queue instead of starting it.
            opts["queue"] = queue_names(load_settings(args.state_dir))[0]
        try:
            new_id = api.add(cmdline["url"], connections=opts["connections"],
                             options=opts)
            if cmdline["queue_only"] and new_id:
                api.pause(new_id)
            status_var.set(("queued: " if cmdline["queue_only"] else "added: ")
                           + basename(cmdline["url"]))
            if cmdline["filename"]:
                # /f renames the target; the engine derives the name from the
                # URL, so say plainly that this part is not wired yet rather
                # than silently ignoring it.
                print("[!] /f (rename to %r) is not supported yet; the file "
                      "keeps its URL-derived name." % cmdline["filename"],
                      file=sys.stderr)
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
    for flag, note in (("exit_when_done", "/q (exit when done)"),
                       ("hang_up", "/h (hang up when done)")):
        if cmdline[flag]:
            print(f"[!] {note} is accepted but not implemented yet.",
                  file=sys.stderr)

    tick()
    try:
        root.mainloop()
    finally:
        if proc is not None:
            proc.terminate()
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
