// The theme has to reach the dialogs, not just the main window.
//
// Reported: "the dark theme is unfinished on the other windows". It is: half
// the program is built from classic tk widgets, which ignore ttk styles
// entirely -- 46 tk.Button against 46 ttk.Button, 54 tk.Label, 34 tk.Frame.
// apply_theme() configures ttk styles, so those widgets keep whatever grey
// the platform gives them and a dark window sprouts light grey buttons.
//
// The colours per widget class are a pure function so they can be checked
// without a display; theme_widget_tree() then applies them to a built dialog.
//
// Runs with: node --test gui/test/theme_dialogs.test.mjs

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

const DARK = 'g.theme_palette("dark")';
const LIGHT = 'g.theme_palette("light")';

test('a classic button is painted, not left to the platform', () => {
  const o = py(`print("R:" + json.dumps(g.tk_widget_palette("Button", ${DARK})))`);
  assert.ok(o.background, 'a tk.Button must be given a background');
  assert.ok(o.foreground, 'and a foreground');
  const p = py(`print("R:" + json.dumps(${DARK}))`);
  assert.notEqual(o.background.toLowerCase(), '#d9d9d9',
    'the Tk default grey is exactly the bug');
  assert.ok([p.surface, p.bg, p.heading_bg].includes(o.background),
    `a button should use a palette colour, got ${o.background}`);
});

test('the dark and light themes give different answers', () => {
  const d = py(`print("R:" + json.dumps(g.tk_widget_palette("Label", ${DARK})))`);
  const l = py(`print("R:" + json.dumps(g.tk_widget_palette("Label", ${LIGHT})))`);
  assert.notDeepEqual(d, l, 'a theme that paints both themes the same is not a theme');
});

test('text surfaces use the surface colour, not the window colour', () => {
  // Entry/Text/Listbox are content, and content sits on "surface" -- the same
  // split the Treeview already uses.
  const p = py(`print("R:" + json.dumps(${DARK}))`);
  for (const cls of ['Entry', 'Text', 'Listbox']) {
    const o = py(`print("R:" + json.dumps(g.tk_widget_palette("${cls}", ${DARK})))`);
    assert.equal(o.background, p.surface, `${cls} should sit on the surface colour`);
  }
});

test('the insertion cursor is visible on a dark background', () => {
  // A black caret on a near-black entry is invisible; this is the detail that
  // makes a dark theme feel broken even when the colours are right.
  const o = py(`print("R:" + json.dumps(g.tk_widget_palette("Entry", ${DARK})))`);
  const p = py(`print("R:" + json.dumps(${DARK}))`);
  assert.equal(o.insertbackground, p.fg, 'the caret must use the foreground colour');
});

test('an unknown widget class is handled, not crashed on', () => {
  const o = py(`print("R:" + json.dumps(g.tk_widget_palette("Spinbox2000", ${DARK})))`);
  assert.ok(o.background, 'an unknown class still gets sensible colours');
});

test('every classic widget class the program uses is covered', () => {
  // If a class is missing from the table it silently keeps platform grey,
  // which is how this bug stayed invisible.
  const used = ['Button', 'Label', 'Frame', 'Entry', 'Text', 'Listbox',
    'Canvas', 'Toplevel', 'Checkbutton', 'Radiobutton', 'Menu', 'Scrollbar'];
  for (const cls of used) {
    const o = py(`print("R:" + json.dumps(g.tk_widget_palette("${cls}", ${DARK})))`);
    assert.ok(o.background, `${cls} has no background in the table`);
  }
});

test('classic widgets are flattened like the ttk ones', () => {
  // The dialog came out dark but every button still wore a light bevel,
  // because relief/borderwidth/highlightthickness are per-widget on classic
  // Tk and have nothing to do with the colour scheme.
  for (const cls of ['Button', 'Checkbutton', 'Label', 'Frame']) {
    const o = py(`print("R:" + json.dumps(g.tk_widget_palette("${cls}", ${DARK})))`);
    assert.equal(o.relief, 'flat', `${cls} keeps a bevel`);
    assert.equal(o.highlightthickness, 0,
      `${cls} keeps a focus ring drawn in the platform colour`);
  }
  // Entry is the deliberate exception -- see the next test.
  const e = py(`print("R:" + json.dumps(g.tk_widget_palette("Entry", ${DARK})))`);
  assert.equal(e.relief, 'flat', 'an entry should be flat too');
});

test('the flattening does not swallow the entry border', () => {
  // An entry with no edge at all on a dark surface is invisible; it keeps a
  // border, it just uses the palette's grid colour for it.
  const o = py(`print("R:" + json.dumps(g.tk_widget_palette("Entry", ${DARK})))`);
  const p = py(`print("R:" + json.dumps(${DARK}))`);
  assert.equal(o.highlightbackground, p.grid,
    'an entry needs an edge, drawn in the palette');
});
