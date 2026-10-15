// Scrollbars for the download list and the category tree.
//
// There were none -- the only "Scrollbar" in the file was a style rule added
// with the themes. A ttk Treeview does respond to the mouse wheel, so the rows
// below the fold were reachable; there was simply nothing on screen saying
// they existed, and no way to drag to them. Real IDM has one.
//
// Checked on a live window, because a scrollbar that exists but is not wired
// to the widget looks identical in the source and does nothing on screen.
//
// Runs with: node --test gui/test/scrollbars.test.mjs

import test from 'node:test';
import assert from 'node:assert/strict';
import { spawnSync } from 'node:child_process';
import { fileURLToPath } from 'node:url';
import { dirname, join } from 'node:path';

const here = dirname(fileURLToPath(import.meta.url));
const guiPy = join(here, '..', 'idm_gui.py');

function dump() {
  const res = spawnSync('xvfb-run', ['-a', 'python3', guiPy, '--selftest-scrollbars'],
    { encoding: 'utf8', maxBuffer: 4 * 1024 * 1024 });
  assert.equal(res.status, 0, `selftest failed:\n${res.stdout}\n${res.stderr}`);
  const line = res.stdout.split('\n').find((l) => l.startsWith('SCROLLBARS:'));
  assert.ok(line, `no SCROLLBARS: line:\n${res.stdout}`);
  return JSON.parse(line.slice('SCROLLBARS:'.length));
}

test('the download list has a vertical scrollbar, wired both ways', () => {
  const d = dump();
  assert.ok(d.list.exists, 'the list has no scrollbar');
  // Both directions matter: the bar has to move the list, and the list has to
  // move the bar. Wiring only one of them is the classic half-done version.
  assert.ok(d.list.bar_drives_view, "dragging the bar must scroll the list");
  assert.ok(d.list.view_drives_bar, "scrolling the list must move the bar");
});

test('the category tree has one too', () => {
  const d = dump();
  assert.ok(d.tree.exists, 'the category tree has no scrollbar');
  assert.ok(d.tree.bar_drives_view, "dragging the bar must scroll the tree");
  assert.ok(d.tree.view_drives_bar, "scrolling the tree must move the bar");
});

test('a list taller than the window really does scroll', () => {
  // The point of the bar: with more rows than fit, the view must be able to
  // leave the top. A Treeview whose height is fixed to its content cannot.
  const d = dump();
  assert.ok(d.list.scrolled_away_from_top,
    `the view stayed at the top after scrolling: ${JSON.stringify(d.list.fractions)}`);
});
