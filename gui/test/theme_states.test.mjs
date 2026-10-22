// Hover, press and selection colours in the dark theme.
//
// Reported in dark mode: hovering a checkbox turns the whole of it white, and
// clicking a download turns the row -- progress bar included -- white too.
//
// - ttk's clam theme has its own light colours for the "active" (hover),
//   "pressed" and "readonly" states; apply_theme() set the normal colours and
//   left those maps alone, so the platform's near-white showed on hover.
// - a selected row was repainted with selection_fg (near white) in every
//   cell: the status colours went, and the progress bar, which is text, went
//   white with them.
//
// state_maps() is a pure function, so all of this is checked without a display.
//
// Runs with: node --test gui/test/theme_states.test.mjs

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

function lum(hex) {
  const h = hex.replace('#', '');
  const [r, g, b] = [0, 2, 4].map((i) => parseInt(h.slice(i, i + 2), 16) / 255)
    .map((c) => (c <= 0.03928 ? c / 12.92 : ((c + 0.055) / 1.055) ** 2.4));
  return 0.2126 * r + 0.7152 * g + 0.0722 * b;
}
function contrast(a, b) {
  const [hi, lo] = [lum(a), lum(b)].sort((x, y) => y - x);
  return (hi + 0.05) / (lo + 0.05);
}

const palette = (name) => py(`print("R:" + json.dumps(g.theme_palette("${name}")))`);
const maps = (name) => py(`print("R:" + json.dumps(g.state_maps(g.theme_palette("${name}"))))`);

const SURFACE_OPTIONS = ['background', 'fieldbackground', 'indicatorbackground',
  'selectbackground', 'troughcolor'];

test('no hover, press or read-only state turns anything light in dark mode', () => {
  const m = maps('dark');
  for (const style of ['TCheckbutton', 'TRadiobutton', 'TButton', 'TCombobox',
    'TEntry', 'TSpinbox', 'TScrollbar', 'Treeview']) {
    assert.ok(m[style], `no state map for ${style}`);
  }
  for (const [style, opts] of Object.entries(m)) {
    for (const opt of SURFACE_OPTIONS) {
      for (const [state, colour] of opts[opt] || []) {
        assert.ok(lum(colour) < 0.15,
          `${style} ${opt} in state "${state}" is ${colour}: light in a dark window`);
      }
    }
  }
});

test('a hovered checkbox keeps readable text and a dark box', () => {
  for (const name of ['dark', 'light']) {
    const p = palette(name);
    const m = maps(name);
    for (const style of ['TCheckbutton', 'TRadiobutton']) {
      const hover = (m[style].background || []).find(([s]) => s === 'active');
      assert.ok(hover, `${name}: ${style} has no hover colour of its own`);
      assert.ok(contrast(p.fg, hover[1]) >= 4.5, `${name}: ${style} text on hover`);
      assert.ok(m[style].indicatorbackground, `${name}: ${style} box keeps clam's white`);
    }
  }
});

test('a selected row keeps its status colours, progress bar included', () => {
  for (const name of ['dark', 'light']) {
    const p = palette(name);
    const tv = maps(name).Treeview;
    const sel = (tv.background || []).find(([s]) => s === 'selected');
    assert.equal(sel && sel[1], p.row_selected, `${name}: selected row background`);
    assert.ok(!(tv.foreground || []).some(([s]) => s === 'selected'),
      `${name}: selection must not repaint the text (it turned the bar white)`);
    for (const key of ['fg', 'accent', 'ok', 'err', 'muted']) {
      const c = contrast(p[key], p.row_selected);
      assert.ok(c >= 4.5, `${name}: ${key} on a selected row is ${c.toFixed(2)}:1`);
    }
    for (const row of ['row_odd', 'row_even']) {
      assert.ok(contrast(p.row_selected, p[row]) >= 1.08,
        `${name}: a selected row must stand out from ${row}`);
    }
  }
});

test('a classic checkbutton does not flash white on hover either', () => {
  const p = palette('dark');
  const o = py(`print("R:" + json.dumps(g.tk_widget_palette("Checkbutton", g.theme_palette("dark"))))`);
  assert.equal(o.activebackground, p.bg);
  assert.equal(o.activeforeground, p.fg);
  assert.equal(o.selectcolor, p.surface, 'the box itself');
});
