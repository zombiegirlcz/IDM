#!/usr/bin/env python3
"""make-icon.py - three 3-D down arrows: red left, yellow right, green front."""
from __future__ import annotations
import argparse, json, os

RED = (214, 40, 40)
YELLOW = (250, 200, 20)
GREEN = (40, 170, 60)


def _shade(rgb, factor):
    return tuple(max(0, min(255, int(c * factor))) for c in rgb)


def _draw_arrow(draw, cx, cy, w, h, rgb):
    shaft_w = max(2, w // 3)
    head_h = h // 2
    shaft_h = h - head_h
    y0 = cy - h // 2
    shaft = [(cx - shaft_w // 2, y0), (cx + shaft_w // 2, y0),
             (cx + shaft_w // 2, y0 + shaft_h), (cx - shaft_w // 2, y0 + shaft_h)]
    head = [(cx - w // 2, y0 + shaft_h), (cx + w // 2, y0 + shaft_h), (cx, y0 + h)]
    draw.polygon(head, fill=rgb)
    draw.polygon(shaft, fill=_shade(rgb, 0.85))
    draw.line(shaft + [shaft[0]], fill=_shade(rgb, 1.35), width=max(1, w // 12))
    draw.line(head + [head[0]], fill=_shade(rgb, 1.25), width=max(1, w // 14))


def make_icon(out_dir, size=256):
    from PIL import Image, ImageDraw
    img = Image.new("RGBA", (size, size), (0, 0, 0, 0))
    draw = ImageDraw.Draw(img)
    pad = size // 16
    draw.rounded_rectangle([pad, pad, size - pad, size - pad], radius=size // 8, fill=(28, 32, 44, 255))
    bw, bh = int(size * 0.30), int(size * 0.56)
    lcx, rcx = int(size * 0.33), int(size * 0.67)
    bcy = int(size * 0.50)
    _draw_arrow(draw, lcx, bcy, bw, bh, RED)
    _draw_arrow(draw, rcx, bcy, bw, bh, YELLOW)
    fw, fh = int(size * 0.38), int(size * 0.66)
    fcx, fcy = int(size * 0.50), int(size * 0.54)
    _draw_arrow(draw, fcx, fcy, fw, fh, GREEN)
    os.makedirs(out_dir, exist_ok=True)
    png = os.path.join(out_dir, "idm.png")
    ico = os.path.join(out_dir, "idm.ico")
    img.save(png)
    img.save(ico, sizes=[(16, 16), (32, 32), (48, 48), (64, 64), (128, 128), (256, 256)])
    return png, ico, {"size": size, "arrows": [
        {"name": "left", "x": lcx, "rgb": list(RED)},
        {"name": "right", "x": rcx, "rgb": list(YELLOW)},
        {"name": "front", "x": fcx, "rgb": list(GREEN)}]}


def main(argv=None):
    p = argparse.ArgumentParser(description="Generate the IDM app icon")
    p.add_argument("--out-dir", default=os.path.join(os.path.dirname(__file__), "..", "assets"))
    p.add_argument("--size", type=int, default=256)
    p.add_argument("--report", action="store_true")
    a = p.parse_args(argv)
    png, ico, rep = make_icon(a.out_dir, a.size)
    print(f"wrote {png}")
    print(f"wrote {ico}")
    if a.report:
        print("REPORT:" + json.dumps(rep), flush=True)
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
