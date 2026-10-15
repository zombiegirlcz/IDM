// Real gridlines in the download list.
//
// The user asked for gridlines twice. ttk's Treeview has no element for cell
// borders -- a row can only be coloured whole -- so the previous answer was
// alternating row shades and an honest note that true rules were not possible
// inside the widget. Half of them are: the VERTICAL rules between columns can
// be thin frames placed over the list, and they are what makes a list read as
// a table. Horizontal rules remain out of reach without replacing Treeview
// with a Canvas-drawn table.
//
// The positions are a pure function of the column widths, tested as such, and
// the separators themselves are checked on a real window built under xvfb --
// placed widgets are exactly the kind of thing that silently ends up at 0,0.
//
// Runs with: node --test gui/test/gridlines.test.mjs

import test from 'node:test';
import assert from 'node:assert/strict';
import { execFileSync, spawnSync } from 'node:child_process';
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

test('a separator sits at every column boundary but the last', () => {
  const r = py('print("R:" + json.dumps(g.column_edges([240, 90, 100])))');
  // Cumulative, and nothing on the right-hand edge of the widget: a rule
  // there would read as a border, not a column divider.
  assert.deepEqual(r, [240, 330]);
});

test('a single column has no boundaries at all', () => {
  assert.deepEqual(py('print("R:" + json.dumps(g.column_edges([120])))'), []);
  assert.deepEqual(py('print("R:" + json.dumps(g.column_edges([])))'), []);
});

test('a collapsed column does not stack two rules in one place', () => {
  // Treeview lets a column be squeezed to zero. Two separators at the same x
  // would draw a double-width line.
  const r = py('print("R:" + json.dumps(g.column_edges([100, 0, 0, 80])))');
  assert.deepEqual(r, [100, 180]);
});

test('the real window places one separator per boundary, over the list', () => {
  const res = spawnSync('xvfb-run', ['-a', 'python3', guiPy, '--selftest-gridlines'],
    { encoding: 'utf8', maxBuffer: 4 * 1024 * 1024 });
  assert.equal(res.status, 0, `selftest failed:\n${res.stdout}\n${res.stderr}`);
  const line = res.stdout.split('\n').find((l) => l.startsWith('GRIDLINES:'));
  assert.ok(line, `no GRIDLINES: line:\n${res.stdout}`);
  const d = JSON.parse(line.slice('GRIDLINES:'.length));

  assert.equal(d.count, d.columns - 1, `expected ${d.columns - 1} rules, got ${d.count}`);
  for (const sep of d.separators) {
    assert.equal(sep.width, 1, `a rule must be one pixel wide, got ${sep.width}`);
    assert.ok(sep.x > 0, `a rule at x=${sep.x} is not between columns`);
    assert.ok(sep.height > 10, `a rule only ${sep.height}px tall is not a rule`);
    assert.equal(sep.bg, d.grid, `a rule must use the palette's grid colour`);
  }
  // Left to right, no duplicates.
  const xs = d.separators.map((s) => s.x);
  assert.deepEqual(xs, [...xs].sort((a, b) => a - b), 'rules must be ordered');
  assert.equal(new Set(xs).size, xs.length, 'two rules share an x position');
});

test('the rules follow the columns when they are resized', () => {
  const res = spawnSync('xvfb-run', ['-a', 'python3', guiPy, '--selftest-gridlines-resize'],
    { encoding: 'utf8', maxBuffer: 4 * 1024 * 1024 });
  assert.equal(res.status, 0, `selftest failed:\n${res.stdout}\n${res.stderr}`);
  const line = res.stdout.split('\n').find((l) => l.startsWith('GRIDLINES-RESIZE:'));
  assert.ok(line, `no GRIDLINES-RESIZE: line:\n${res.stdout}`);
  const d = JSON.parse(line.slice('GRIDLINES-RESIZE:'.length));
  assert.notDeepEqual(d.before, d.after,
    'widening a column must move the rules, not leave them behind');
  assert.equal(d.after[0], d.first_width,
    `the first rule should sit at the new width ${d.first_width}, got ${d.after[0]}`);
});

test('the rules are repainted when the theme changes', () => {
  const res = spawnSync('xvfb-run', ['-a', 'python3', guiPy, '--selftest-gridlines-theme'],
    { encoding: 'utf8', maxBuffer: 4 * 1024 * 1024 });
  assert.equal(res.status, 0, `selftest failed:\n${res.stdout}\n${res.stderr}`);
  const line = res.stdout.split('\n').find((l) => l.startsWith('GRIDLINES-THEME:'));
  assert.ok(line, `no GRIDLINES-THEME: line:\n${res.stdout}`);
  const d = JSON.parse(line.slice('GRIDLINES-THEME:'.length));
  assert.notEqual(d.light, d.dark, 'a dark list cannot keep the light rules');
  assert.equal(d.dark, d.dark_grid, "the rules must match the dark palette's grid");
});
