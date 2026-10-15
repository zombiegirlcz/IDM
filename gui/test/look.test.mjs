// The look of the window, in the few things about it that can be measured.
//
// "the overall appearance has not changed, you only added gridlines and a dark
// mode" -- fair. A palette and a theme toggle are not a design. What a test
// can hold to account is contrast (whether text is actually readable on both
// themes), the density of the list, and whether the chrome is flat rather than
// the bevelled grey Tk gives away for free.
//
// Runs with: node --test gui/test/look.test.mjs

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
  assert.ok(line, `no R: line in:\n${out}`);
  return JSON.parse(line.slice(2));
}

/** WCAG relative luminance contrast ratio, computed here so the test is not
 *  grading the implementation with the implementation's own arithmetic. */
function contrast(hex1, hex2) {
  const lum = (hex) => {
    const [r, g, b] = [1, 3, 5].map((i) => parseInt(hex.slice(i, i + 2), 16) / 255);
    const f = (c) => (c <= 0.03928 ? c / 12.92 : ((c + 0.055) / 1.055) ** 2.4);
    return 0.2126 * f(r) + 0.7152 * f(g) + 0.0722 * f(b);
  };
  const [a, b] = [lum(hex1), lum(hex2)].sort((x, y) => y - x);
  return (a + 0.05) / (b + 0.05);
}

for (const theme of ['light', 'dark']) {
  test(`${theme}: body text is readable on both the chrome and the surface`, () => {
    const p = py(`print("R:" + json.dumps(g.theme_palette("${theme}")))`);
    for (const bg of ['bg', 'surface', 'row_odd', 'row_even']) {
      const c = contrast(p.fg, p[bg]);
      assert.ok(c >= 4.5,
        `${theme}: fg on ${bg} is ${c.toFixed(2)}:1, below the 4.5 needed to read`);
    }
  });

  test(`${theme}: secondary text is still legible, not decoration`, () => {
    const p = py(`print("R:" + json.dumps(g.theme_palette("${theme}")))`);
    const c = contrast(p.muted, p.surface);
    assert.ok(c >= 3.0, `${theme}: muted on surface is only ${c.toFixed(2)}:1`);
  });

  test(`${theme}: a selected row can be read`, () => {
    const p = py(`print("R:" + json.dumps(g.theme_palette("${theme}")))`);
    const c = contrast(p.selection_fg, p.selection_bg);
    assert.ok(c >= 4.5, `${theme}: selection is ${c.toFixed(2)}:1`);
  });

  test(`${theme}: the accent stands out from the surface it sits on`, () => {
    const p = py(`print("R:" + json.dumps(g.theme_palette("${theme}")))`);
    const c = contrast(p.accent, p.surface);
    assert.ok(c >= 3.0,
      `${theme}: the accent is ${c.toFixed(2)}:1 against the surface -- invisible`);
  });

  test(`${theme}: the zebra is visible but not stripey`, () => {
    const p = py(`print("R:" + json.dumps(g.theme_palette("${theme}")))`);
    const c = contrast(p.row_odd, p.row_even);
    assert.ok(c > 1.02, `${theme}: the two row shades are the same colour`);
    assert.ok(c < 1.35, `${theme}: ${c.toFixed(2)}:1 between rows is a barcode`);
  });
}

test('the list has room to breathe', () => {
  const m = py('print("R:" + json.dumps(g.METRICS))');
  assert.ok(m.row_height >= 26,
    `${m.row_height}px rows are the Tk default density, not a designed one`);
  assert.ok(m.heading_height >= m.row_height,
    'the header should be at least as tall as a row');
  assert.ok(m.toolbar_pad >= 6, 'the toolbar needs padding around it');
});

test('the chrome is flat, not bevelled', () => {
  const m = py('print("R:" + json.dumps(g.METRICS))');
  assert.equal(m.relief, 'flat',
    'raised/sunken borders are what makes a Tk window look like 1995');
});
