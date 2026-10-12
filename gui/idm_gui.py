#!/usr/bin/env python3
"""idm_gui.py — native desktop window for the IDM-like downloader.

This is the "real window" front-end (Tkinter), not a browser page. It talks to
the engine's queue API (`idm --serve ADDR`), which runs downloads and keeps the
queue; the window is purely the view + controls:

    +--------------------------------------------------------------+
    |  URL: [________________________________]  [ Stáhnout ]        |
    |--------------------------------------------------------------|
    |  #  Soubor            Stav       Velikost        Akce         |
    |  1  movie.mp4   [####----]  running  3.2/8.0 MB  [Pauza][X]   |
    |  2  book.pdf    [########]  done     1.1 MB      [Odebrat]    |
    +--------------------------------------------------------------+

Everything uses only the Python standard library (urllib + tkinter), so there
is nothing to pip-install.

Usage:
    python3 idm_gui.py [--addr 127.0.0.1:8080] [--engine PATH] [--autostart]

    --autostart   start `idm --serve` itself if the address is not answering

Self-tests (used by gui/test/native_gui.test.mjs):
    --selftest-api     drive a real download through the API, print markers
    --selftest-window  build the Tk window (needs a display), print a marker
"""

from __future__ import annotations

import argparse
import json
import os
import subprocess
import sys
import time
import urllib.error
import urllib.request

DEFAULT_ADDR = "127.0.0.1:8080"


# --------------------------------------------------------------------------- #
# API client (no Tk, fully testable)
# --------------------------------------------------------------------------- #
class Api:
    """Thin client for the `idm --serve` queue API."""

    def __init__(self, addr: str, timeout: float = 5.0):
        self.base = "http://" + addr
        self.timeout = timeout

    def _req(self, method: str, path: str, body: dict | None = None) -> dict:
        data = None
        headers = {}
        if body is not None:
            data = json.dumps(body).encode()
            headers["Content-Type"] = "application/json"
        req = urllib.request.Request(self.base + path, data=data, headers=headers, method=method)
        with urllib.request.urlopen(req, timeout=self.timeout) as resp:
            raw = resp.read()
        return json.loads(raw) if raw else {}

    def items(self) -> list[dict]:
        return self._req("GET", "/api/items").get("items", [])

    def add(self, url: str, connections: int = 4) -> int:
        r = self._req("POST", "/api/add", {"url": url, "connections": connections})
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


def fmt_size(n: int | None) -> str:
    if not n:
        return "—"
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


# --------------------------------------------------------------------------- #
# Tk window
# --------------------------------------------------------------------------- #
def build_window(api: Api, on_close=None):
    """Construct the Tk root + widgets and return (root, refresh_fn).

    Kept separate from main() so --selftest-window can build it and tear it down
    without entering the blocking mainloop.
    """
    import tkinter as tk
    from tkinter import ttk

    root = tk.Tk()
    root.title("IDM — správce stahování")
    root.geometry("720x420")
    root.minsize(560, 320)

    top = ttk.Frame(root, padding=(10, 10, 10, 4))
    top.pack(fill="x")
    ttk.Label(top, text="URL:").pack(side="left")
    url_var = tk.StringVar()
    entry = ttk.Entry(top, textvariable=url_var)
    entry.pack(side="left", fill="x", expand=True, padx=(6, 6))

    cols = ("id", "name", "status", "size")
    tree = ttk.Treeview(root, columns=cols, show="headings", height=12)
    tree.heading("id", text="#")
    tree.heading("name", text="Soubor")
    tree.heading("status", text="Stav")
    tree.heading("size", text="Velikost")
    tree.column("id", width=40, anchor="center", stretch=False)
    tree.column("name", width=320)
    tree.column("status", width=110, anchor="center", stretch=False)
    tree.column("size", width=150, anchor="e", stretch=False)
    tree.pack(fill="both", expand=True, padx=10, pady=(4, 4))

    bar = ttk.Progressbar(root, mode="determinate", maximum=100)
    bar.pack(fill="x", padx=10)

    btns = ttk.Frame(root, padding=(10, 6, 10, 10))
    btns.pack(fill="x")
    status_var = tk.StringVar(value="připraveno")

    def selected_id():
        sel = tree.selection()
        if not sel:
            return None
        return int(tree.item(sel[0], "values")[0])

    def do_add():
        u = url_var.get().strip()
        if not u:
            return
        try:
            api.add(u)
            url_var.set("")
            status_var.set("přidáno")
        except Exception as e:  # noqa: BLE001
            status_var.set(f"chyba: {e}")
        refresh()

    def do_pause():
        i = selected_id()
        if i is not None:
            try:
                api.pause(i)
            except Exception as e:  # noqa: BLE001
                status_var.set(f"chyba: {e}")
            refresh()

    def do_resume():
        i = selected_id()
        if i is not None:
            try:
                api.resume(i)
            except Exception as e:  # noqa: BLE001
                status_var.set(f"chyba: {e}")
            refresh()

    def do_remove():
        i = selected_id()
        if i is not None:
            try:
                api.remove(i)
            except Exception as e:  # noqa: BLE001
                status_var.set(f"chyba: {e}")
            refresh()

    ttk.Button(top, text="Stáhnout", command=do_add).pack(side="left")
    ttk.Button(btns, text="Pauza", command=do_pause).pack(side="left")
    ttk.Button(btns, text="Pokračovat", command=do_resume).pack(side="left")
    ttk.Button(btns, text="Odebrat", command=do_remove).pack(side="left")
    ttk.Label(btns, textvariable=status_var).pack(side="right")

    def refresh():
        try:
            items = api.items()
        except Exception:  # noqa: BLE001
            status_var.set("nelze se spojit s idm --serve")
            return
        seen = set()
        for it in items:
            iid = str(it["id"])
            seen.add(iid)
            name = basename(it.get("url", ""))
            dl = it.get("downloaded") or 0
            total = it.get("total") or 0
            size = f"{fmt_size(dl)} / {fmt_size(total)}" if total else fmt_size(dl)
            vals = (it["id"], name, it.get("status", ""), size)
            if tree.exists(iid):
                tree.item(iid, values=vals)
            else:
                tree.insert("", "end", iid=iid, values=vals)
            pct = (dl / total * 100.0) if total else 0.0
            if it.get("status") == "running":
                bar["value"] = pct
        for iid in list(tree.get_children()):
            if iid not in seen:
                tree.delete(iid)

    root.protocol("WM_DELETE_WINDOW", lambda: (on_close and on_close(), root.destroy()) or root.destroy())
    return root, refresh


def spawn_server(engine: str, addr: str, out_dir: str, state_dir: str) -> subprocess.Popen:
    os.makedirs(out_dir, exist_ok=True)
    os.makedirs(state_dir, exist_ok=True)
    return subprocess.Popen(
        [engine, "--serve", addr, "--output-dir", out_dir, "--state-dir", state_dir],
        stdout=subprocess.DEVNULL,
        stderr=subprocess.DEVNULL,
    )


def wait_alive(api: Api, seconds: float = 15.0) -> bool:
    deadline = time.time() + seconds
    while time.time() < deadline:
        if api.alive():
            return True
        time.sleep(0.2)
    return False


# --------------------------------------------------------------------------- #
# Self-tests
# --------------------------------------------------------------------------- #
def selftest_api(addr: str, url: str) -> int:
    api = Api(addr)
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


def selftest_window() -> int:
    api = Api("127.0.0.1:1", timeout=0.2)  # not alive; only building widgets
    root, refresh = build_window(api)
    root.update_idletasks()
    root.update()
    title = root.title()
    assert title, "window must have a title"
    root.destroy()
    print(f"SELFTEST-WINDOW: OK title={title!r}", flush=True)
    return 0


def main(argv: list[str] | None = None) -> int:
    p = argparse.ArgumentParser(description="Native window for the IDM-like downloader")
    p.add_argument("--addr", default=os.environ.get("IDM_ADDR", DEFAULT_ADDR))
    p.add_argument("--engine", default=os.environ.get("IDM_ENGINE_BIN", "idm"))
    p.add_argument("--out-dir", default=os.environ.get("IDM_DOWNLOADS_DIR", os.path.expanduser("~/Downloads")))
    p.add_argument("--state-dir", default=os.environ.get("IDM_STATE_DIR", os.path.expanduser("~/.local/share/idm-gui")))
    p.add_argument("--autostart", action="store_true", help="start idm --serve if not answering")
    p.add_argument("--url", help="URL for --selftest-api")
    p.add_argument("--selftest-api", action="store_true")
    p.add_argument("--selftest-window", action="store_true")
    args = p.parse_args(argv)

    if args.selftest_window:
        return selftest_window()
    if args.selftest_api:
        if not args.url:
            print("--selftest-api needs --url", file=sys.stderr)
            return 2
        return selftest_api(args.addr, args.url)

    api = Api(args.addr)
    proc = None
    if not api.alive():
        if args.autostart:
            print(f"[*] starting engine: {args.engine} --serve {args.addr}", flush=True)
            proc = spawn_server(args.engine, args.addr, args.out_dir, args.state_dir)
            wait_alive(api, 15)
        else:
            print(
                f"[!] {args.addr} neodpovídá. Spusť `idm --serve {args.addr}` "
                "nebo použij --autostart.",
                file=sys.stderr,
            )

    root, refresh = build_window(api)

    def tick():
        refresh()
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