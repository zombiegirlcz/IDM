// Notebook tabs have to be readable in dark mode.
//
// Reported from Windows: "in dark mode the tabs are not readable". They are
// not: apply_theme() configures "TNotebook" -- the body of the widget -- but
// never "TNotebook.Tab", which is the tab itself. clam keeps its own light
// tab colours, so dark-mode dialogs (Options has seven tabs, Scheduler two)
// ended up with pale text on pale tabs, or dark text on them, depending on
// which half of the styling won.
//
// Runs with: node --test gui/test/tabs.test.mjs

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
  for (const state of ['normal', 'selected']) {
    test(`${theme}: a ${state} tab's label can be read`, () => {
      const t = py(`print("R:" + json.dumps(g.tab_colors(g.theme_palette("${theme}"), ${state === 'selected' ? 'True' : 'False'})))`);
      const c = contrast(t.foreground, t.background);
      assert.ok(c >= 4.5,
        `${theme}/${state}: ${t.foreground} on ${t.background} is ${c.toFixed(2)}:1`);
    });
  }

  test(`${theme}: the selected tab is distinguishable from the others`, () => {
    const sel = py(`print("R:" + json.dumps(g.tab_colors(g.theme_palette("${theme}"), True)))`);
    const off = py(`print("R:" + json.dumps(g.tab_colors(g.theme_palette("${theme}"), False)))`);
    assert.notEqual(sel.background.toLowerCase(), off.background.toLowerCase(),
      'if every tab looks the same, the notebook tells you nothing');
  });

  test(`${theme}: tabs belong to the palette, not to clam`, () => {
    const p = py(`print("R:" + json.dumps(g.theme_palette("${theme}")))`);
    const off = py(`print("R:" + json.dumps(g.tab_colors(g.theme_palette("${theme}"), False)))`);
    const known = Object.values(p).map((v) => String(v).toLowerCase());
    assert.ok(known.includes(off.background.toLowerCase()),
      `${off.background} is not a palette colour -- that is how clam's grey got in`);
  });
}
