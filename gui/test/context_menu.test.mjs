// Tests for the main-window interactions the user found broken on Windows:
//   * right click on a download row must open a context menu (it silently did
//     nothing before, because Windows does not select a Treeview row on
//     right-click -- selection() stayed empty and the handler bailed out)
//   * right click on a category must offer Add/Edit/Delete category
//   * the window must carry a real menu bar (File/Downloads/View/Help) like IDM
//
// We cannot synthesise real mouse events headlessly, so --selftest-dump reports
// whether each menu exists and which bindings the row handler needs. A static
// check pins the identify_row() call that fixes the Windows behaviour.
//
// Runs with: node --test gui/test/context_menu.test.mjs

import test from 'node:test';
import assert from 'node:assert/strict';
import { readFileSync, existsSync } from 'node:fs';
import { spawnSync } from 'node:child_process';
import { fileURLToPath } from 'node:url';
import { dirname, join } from 'node:path';

const here = dirname(fileURLToPath(import.meta.url));
const guiDir = join(here, '..');
const repoRoot = join(guiDir, '..');
const guiPy = join(guiDir, 'idm_gui.py');

function findEngine() {
  const candidates = [
    process.env.IDM_ENGINE_BIN,
    join(repoRoot, 'engine/target/release/idm'),
    join(repoRoot, 'engine/target/debug/idm'),
  ].filter(Boolean);
  for (const c of candidates) if (existsSync(c)) return c;
  throw new Error(`idm engine not found; looked in:\n  ${candidates.join('\n  ')}`);
}

function dumpWindow() {
  const engine = findEngine();
  const res = spawnSync(
    'xvfb-run',
    ['-a', 'python3', guiPy, '--selftest-dump', '--engine', engine],
    { encoding: 'utf8', env: { ...process.env }, maxBuffer: 8 * 1024 * 1024 },
  );
  if (res.status !== 0) {
    throw new Error(`dump failed (${res.status}):\n${res.stdout}\n${res.stderr}`);
  }
  const line = res.stdout.split('\n').find((l) => l.startsWith('DUMP:'));
  assert.ok(line, `no DUMP: line in output:\n${res.stdout}`);
  return JSON.parse(line.slice('DUMP:'.length));
}

test('download list has a right-click context menu', () => {
  const d = dumpWindow();
  assert.equal(d.has_list_context_menu, true, 'list must have a context menu');
  const items = (d.list_menu_items || []).map((s) => s.toLowerCase());
  for (const want of ['resume', 'stop', 'delete', 'properties']) {
    assert.ok(
      items.some((i) => i.includes(want)),
      `context menu must offer "${want}"; got: ${items.join(', ')}`,
    );
  }
});

test('category tree has a right-click context menu', () => {
  const d = dumpWindow();
  assert.equal(d.has_category_context_menu, true, 'category tree needs a context menu');
  const items = (d.category_menu_items || []).map((s) => s.toLowerCase());
  for (const want of ['add', 'edit', 'delete']) {
    assert.ok(
      items.some((i) => i.includes(want)),
      `category menu must offer "${want}"; got: ${items.join(', ')}`,
    );
  }
});

test('window has a menu bar like IDM (File / Downloads / View / Help)', () => {
  const d = dumpWindow();
  assert.equal(d.has_menubar, true, 'there must be a menubar');
  const menus = (d.menus || []).map((s) => s.toLowerCase());
  for (const want of ['file', 'downloads', 'view', 'help']) {
    assert.ok(
      menus.some((m) => m.includes(want)),
      `menubar must contain "${want}"; got: ${menus.join(', ')}`,
    );
  }
});

test('row right-click selects the row under the cursor (Windows fix)', () => {
  // Windows does not select a Treeview row on right-click, so the handler must
  // explicitly resolve the row from the click coordinates with identify_row()
  // before reading the selection.
  const py = readFileSync(guiPy, 'utf8');
  assert.match(py, /identify_row\(/, 'right-click handler must use identify_row()');
  // And it must only treat it as a row when the click actually hit one.
  assert.match(py, /event\.y/, 'handler must use the click y coordinate');
});