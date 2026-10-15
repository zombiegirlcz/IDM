// The toolbar and category icons, with depth.
//
// They were flat: one fill colour per glyph, drawn straight into a 16px box.
// The app icon (scripts/make-icon.py) already shades its arrows, so the window
// was the odd one out.
//
// "3D" is not a feeling here, it is three measurable things: the body is
// lighter at the top than at the bottom, the glyph casts a shadow outside its
// own outline, and the result is therefore made of many shades rather than
// one. Each is asserted on the rendered image.
//
// Runs with: node --test gui/test/icons_3d.test.mjs

import test from 'node:test';
import assert from 'node:assert/strict';
import { execFileSync } from 'node:child_process';
import { fileURLToPath } from 'node:url';
import { dirname, join } from 'node:path';

const here = dirname(fileURLToPath(import.meta.url));
const guiPy = join(here, '..', 'idm_gui.py');

function py(snippet) {
  const code = `
import sys, json
sys.path.insert(0, ${JSON.stringify(dirname(guiPy))})
import idm_gui as g
try:
    from PIL import Image  # noqa: F401
except Exception:
    print("R:" + json.dumps({"skip": "PIL is not installed"}))
    raise SystemExit(0)
${snippet}
`;
  const out = execFileSync('python3', ['-I', '-c', code], { encoding: 'utf8' });
  const line = out.split('\n').find((l) => l.startsWith('R:'));
  assert.ok(line, `no R: line in output:\n${out}`);
  return JSON.parse(line.slice(2));
}

/** The glyphs every toolbar button and category row can ask for. */
const SHAPES = ['plus', 'resume', 'pause', 'stop', 'trash', 'gear', 'clock',
                'folder', 'arrow_down', 'arrow_up', 'square'];

test('an icon is shaded, not a flat fill', () => {
  const r = py(`
out = {}
for shape in ${JSON.stringify(SHAPES)}:
    img = g.icon_image("#1565c0", shape, 16)
    opaque = [px for px in img.getdata() if px[3] > 200]
    out[shape] = len({px[:3] for px in opaque})
print("R:" + json.dumps(out))
`);
  if (r.skip) return;
  for (const [shape, shades] of Object.entries(r)) {
    assert.ok(shades >= 4, `${shape} is drawn in only ${shades} shade(s)`);
  }
});

test('the light falls from above: the top is lighter than the bottom', () => {
  const r = py(`
def mean_luma(img, rows):
    vals = [0.2126*px[0] + 0.7152*px[1] + 0.0722*px[2]
            for y in rows for px in [img.getpixel((x, y)) for x in range(img.width)]
            if px[3] > 200]
    return sum(vals)/len(vals) if vals else 0.0

out = {}
for shape in ${JSON.stringify(SHAPES)}:
    img = g.icon_image("#1565c0", shape, 32)
    top = mean_luma(img, range(0, img.height // 3))
    bottom = mean_luma(img, range(2 * img.height // 3, img.height))
    out[shape] = [round(top, 2), round(bottom, 2)]
print("R:" + json.dumps(out))
`);
  if (r.skip) return;
  for (const [shape, [top, bottom]] of Object.entries(r)) {
    assert.ok(top > 0 && bottom > 0, `${shape} has no body to measure`);
    assert.ok(top > bottom + 2,
      `${shape}: top ${top} is not lighter than bottom ${bottom}`);
  }
});

test('the glyph casts a shadow outside its own outline', () => {
  const r = py(`
out = {}
for shape in ${JSON.stringify(SHAPES)}:
    flat = g.icon_image("#1565c0", shape, 32, depth=False)
    deep = g.icon_image("#1565c0", shape, 32)
    # Pixels the flat glyph does not cover, but the shaded one marks.
    extra = sum(1 for a, b in zip(flat.getdata(), deep.getdata())
                if a[3] < 20 and b[3] > 20)
    out[shape] = extra
print("R:" + json.dumps(out))
`);
  if (r.skip) return;
  for (const [shape, extra] of Object.entries(r)) {
    assert.ok(extra > 0, `${shape} casts no shadow at all`);
  }
});

test('the icon still fits its box and keeps an alpha channel', () => {
  const r = py(`
img = g.icon_image("#c62828", "trash", 16)
print("R:" + json.dumps({"size": list(img.size), "mode": img.mode}))
`);
  if (r.skip) return;
  assert.deepEqual(r.size, [16, 16], 'a 16px icon must be 16px');
  assert.equal(r.mode, 'RGBA', 'the toolbar needs transparency around the glyph');
});
