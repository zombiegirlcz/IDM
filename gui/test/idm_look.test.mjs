// Tests that the native GUI actually follows the real IDM layout.
//
// The user compared our window to the original IDM and found it lacking, so we
// downloaded IDM's own documentation (docs/idm/GUI_SPEC.md) and now assert the
// window matches it: toolbar buttons, the category tree on the left, the main
// list columns, and the dialogs.
//
// We build the real Tk window under xvfb (via a helper that dumps its widget
// tree as JSON) and check the structure. No guessing from source — the actual
// widgets must be there.
//
// Runs with: node --test gui/test/idm_look.test.mjs

import test from 'node:test';
import assert from 'node:assert/strict';
import { existsSync } from 'node:fs';
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

/** Dump the Tk widget tree as JSON (via --selftest-dump under xvfb). */
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

test('idm_gui.py exists', () => {
  assert.ok(existsSync(guiPy), `missing ${guiPy}`);
});

test('main window has the IDM toolbar buttons above the list', () => {
  const d = dumpWindow();
  const btns = new Set(d.buttons.map((b) => b.toLowerCase()));
  // From IDM docs: Add URL, Resume, Stop, Stop All, Delete, Delete Completed,
  // Options, Scheduler, Start Queue, Stop Queue.
  for (const want of [
    'add url',
    'resume',
    'stop',
    'stop all',
    'delete',
    'options',
    'scheduler',
  ]) {
    assert.ok(
      [...btns].some((b) => b.includes(want)),
      `toolbar must contain a button for "${want}"; got: ${[...btns].join(', ')}`,
    );
  }
  // The toolbar must be a separate frame ABOVE the list (IDM layout).
  assert.ok(d.has_toolbar_frame, 'there must be a dedicated toolbar frame');
  assert.ok(d.toolbar_above_list, 'toolbar must sit above the download list');
});

test('main window has the category tree on the left', () => {
  const d = dumpWindow();
  const cats = d.categories.map((c) => c.toLowerCase());
  assert.ok(d.has_category_tree, 'there must be a category tree/pane');
  for (const want of ['all downloads', 'compressed', 'documents', 'music', 'programs', 'video']) {
    assert.ok(
      cats.some((c) => c.includes(want)),
      `category "${want}" missing; got: ${cats.join(', ')}`,
    );
  }
  // Categories pane is on the LEFT of the list.
  assert.ok(d.tree_left_of_list, 'category tree must be to the left of the list');
});

test('main list has the IDM columns including Q (queue)', () => {
  const d = dumpWindow();
  const cols = d.columns.map((c) => c.toLowerCase());
  for (const want of ['file name', 'size', 'status', 'q']) {
    assert.ok(
      cols.some((c) => c.includes(want)),
      `column "${want}" missing; got: ${cols.join(', ')}`,
    );
  }
  assert.ok(
    cols.some((c) => c.includes('speed') || c.includes('transfer')),
    'there should be a speed/transfer column',
  );
});

test('Add URL dialog follows IDM (URL box, authorization, Start/Download Later)', () => {
  const d = dumpWindow();
  const add = d.dialogs.find((x) => /add url/i.test(x.title));
  assert.ok(add, `no "Add URL" dialog; dialogs: ${d.dialogs.map((x) => x.title).join(', ')}`);
  const labels = add.widgets.map((w) => w.toLowerCase());
  assert.ok(labels.some((l) => l.includes('url')), 'Add URL must have a URL field');
  assert.ok(
    labels.some((l) => l.includes('authoriz')),
    'Add URL must offer "Use authorization" (IDM has it)',
  );
});

test('Options dialog has the IDM tabs', () => {
  const d = dumpWindow();
  const opt = d.dialogs.find((x) => /options/i.test(x.title));
  assert.ok(opt, `no "Options" dialog; got: ${d.dialogs.map((x) => x.title).join(', ')}`);
  const tabs = opt.tabs.map((t) => t.toLowerCase());
  for (const want of ['general', 'file types', 'connection', 'save to', 'downloads', 'proxy']) {
    assert.ok(
      tabs.some((t) => t.includes(want)),
      `Options tab "${want}" missing; got: ${tabs.join(', ')}`,
    );
  }
});

test('Scheduler dialog has Schedule + Files in the queue', () => {
  const d = dumpWindow();
  const sch = d.dialogs.find((x) => /scheduler/i.test(x.title));
  assert.ok(sch, `no "Scheduler" dialog; got: ${d.dialogs.map((x) => x.title).join(', ')}`);
  const tabs = sch.tabs.map((t) => t.toLowerCase());
  assert.ok(tabs.some((t) => t.includes('schedule')), 'Scheduler needs a Schedule tab');
  assert.ok(
    tabs.some((t) => t.includes('files in the queue') || t.includes('queue')),
    'Scheduler needs a Files-in-the-queue tab',
  );
});