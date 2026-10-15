// Light and dark theme for the native window.
//
// The window was bare ttk: whatever grey the platform's default theme
// produces, no palette of its own, no dark mode. Everything decidable lives
// in pure functions -- which palette, which colours, which theme comes next --
// so the tests never need an X display; building the window only applies them.
//
// The contrast assertions are the point of having a palette at all. A theme
// that looks designed but cannot be read is worse than the grey it replaced.
//
// Runs with: node --test gui/test/theme.test.mjs

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
${snippet}
`;
  const out = execFileSync('python3', ['-I', '-c', code], { encoding: 'utf8' });
  const line = out.split('\n').find((l) => l.startsWith('R:'));
  assert.ok(line, `no R: line in output:\n${out}`);
  return JSON.parse(line.slice(2));
}

/** sRGB relative luminance, per WCAG 2.1. */
function luminance(hex) {
  const v = hex.replace('#', '');
  const ch = [0, 2, 4].map((i) => parseInt(v.slice(i, i + 2), 16) / 255);
  const lin = ch.map((c) => (c <= 0.03928 ? c / 12.92 : ((c + 0.055) / 1.055) ** 2.4));
  return 0.2126 * lin[0] + 0.7152 * lin[1] + 0.0722 * lin[2];
}

function contrast(a, b) {
  const [x, y] = [luminance(a), luminance(b)].sort((p, q) => q - p);
  return (x + 0.05) / (y + 0.05);
}

const REQUIRED = [
  'bg', 'fg', 'surface', 'row_odd', 'row_even', 'grid',
  'accent', 'selection_bg', 'selection_fg', 'heading_bg', 'heading_fg', 'muted',
];

test('both themes define every colour the window needs', () => {
  for (const name of ['light', 'dark']) {
    const p = py(`print("R:" + json.dumps(g.theme_palette(${JSON.stringify(name)})))`);
    for (const key of REQUIRED) {
      assert.ok(key in p, `${name} palette is missing ${key}`);
      assert.match(p[key], /^#[0-9a-fA-F]{6}$/, `${name}.${key} must be #rrggbb, got ${p[key]}`);
    }
  }
});

test('dark is actually dark and light is actually light', () => {
  const dark = py('print("R:" + json.dumps(g.theme_palette("dark")))');
  const light = py('print("R:" + json.dumps(g.theme_palette("light")))');
  assert.ok(luminance(dark.bg) < 0.1, `dark background is not dark: ${dark.bg}`);
  assert.ok(luminance(light.bg) > 0.7, `light background is not light: ${light.bg}`);
});

test('text is readable on every surface it lands on', () => {
  // WCAG AA for body text is 4.5:1. This is the assertion that stops a
  // palette from being pretty and unusable.
  for (const name of ['light', 'dark']) {
    const p = py(`print("R:" + json.dumps(g.theme_palette(${JSON.stringify(name)})))`);
    for (const [fg, bg, label] of [
      [p.fg, p.bg, 'fg on bg'],
      [p.fg, p.surface, 'fg on surface'],
      [p.fg, p.row_odd, 'fg on an odd row'],
      [p.fg, p.row_even, 'fg on an even row'],
      [p.selection_fg, p.selection_bg, 'selected text'],
      [p.heading_fg, p.heading_bg, 'column heading'],
    ]) {
      const c = contrast(fg, bg);
      assert.ok(c >= 4.5, `${name}: ${label} is only ${c.toFixed(2)}:1 (${fg} on ${bg})`);
    }
    // Muted text (the secondary cells) may be lighter, but not invisible.
    const m = contrast(p.muted, p.bg);
    assert.ok(m >= 3.0, `${name}: muted text is only ${m.toFixed(2)}:1`);
  }
});

test('the two row colours differ, or there are no stripes', () => {
  for (const name of ['light', 'dark']) {
    const p = py(`print("R:" + json.dumps(g.theme_palette(${JSON.stringify(name)})))`);
    assert.notEqual(p.row_odd, p.row_even, `${name}: striping needs two colours`);
    // Visible, but not a zebra crossing.
    const c = contrast(p.row_odd, p.row_even);
    assert.ok(c > 1.03 && c < 1.6, `${name}: stripe contrast ${c.toFixed(3)} is out of range`);
  }
});

test('an unknown theme name falls back to light rather than crashing', () => {
  const p = py('print("R:" + json.dumps(g.theme_palette("hot-pink")))');
  const light = py('print("R:" + json.dumps(g.theme_palette("light")))');
  assert.deepEqual(p, light);
});

test('the toggle goes light -> dark -> light', () => {
  const r = py(`print("R:" + json.dumps([
      g.next_theme("light"), g.next_theme("dark"), g.next_theme("nonsense")]))`);
  assert.deepEqual(r, ['dark', 'light', 'dark']);
});

test('the chosen theme is remembered in settings', () => {
  const r = py(`
import tempfile
d = tempfile.mkdtemp()
g.save_theme(d, "dark")
first = g.load_theme(d)
g.save_theme(d, "light")
print("R:" + json.dumps({"first": first, "second": g.load_theme(d)}))
`);
  assert.equal(r.first, 'dark');
  assert.equal(r.second, 'light');
});

test('a state dir with no setting yet means light', () => {
  const r = py(`
import tempfile
print("R:" + json.dumps(g.load_theme(tempfile.mkdtemp())))
`);
  assert.equal(r, 'light');
});
