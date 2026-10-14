// Roadmap item 4, piece 5: the two Checkbuttons on the Grabber's "Save to"
// step were built without a `variable`, so they could be ticked and nothing
// anywhere could tell. They now do what they say: one files each download
// under its category, the other adds the checked files when the dialog is
// closed.
//
// Runs with: node --test gui/test/grabber_checkboxes.test.mjs

import test from 'node:test';
import assert from 'node:assert/strict';
import { mkdtempSync } from 'node:fs';
import { execFileSync } from 'node:child_process';
import { fileURLToPath } from 'node:url';
import { dirname, join } from 'node:path';
import { tmpdir } from 'node:os';

const here = dirname(fileURLToPath(import.meta.url));
const guiDir = join(here, '..');
const script = join(guiDir, 'idm_gui.py');

function run() {
  const dir = mkdtempSync(join(tmpdir(), 'idm_gcheck_'));
  const out = execFileSync('xvfb-run', ['-a', 'python3', script,
    '--selftest-grabber-checks', '--state-dir', dir], { encoding: 'utf8' });
  const line = out.split('\n').find((l) => l.startsWith('GRABCHECK:'));
  assert.ok(line, `no GRABCHECK: line in output:\n${out}`);
  return JSON.parse(line.slice('GRABCHECK:'.length));
}

test('no checkbutton in the Grabber is left without a variable', () => {
  const r = run();
  assert.deepEqual(r.unbound, [],
    `checkbuttons that cannot be read: ${r.unbound}`);
});

test('"folder of its category" files each download under its category', () => {
  const r = run();
  // Off: everything goes to the one save folder.
  assert.deepEqual(r.plain.map((a) => a.out_dir), [r.folder, r.folder]);
  // On: one subfolder per category of the file.
  assert.deepEqual(
    r.by_category.map((a) => a.out_dir).sort(),
    [join(r.folder, 'Compressed'), join(r.folder, 'Music')].sort(),
  );
  // The URLs themselves are untouched either way.
  assert.deepEqual(r.plain.map((a) => a.url).sort(), r.urls.slice().sort());
});

test('"add on close" decides whether closing the dialog adds anything', () => {
  const r = run();
  assert.deepEqual(r.on_close.map((a) => a.url).sort(), r.urls.slice().sort());
  assert.deepEqual(r.no_close, [], 'unticked, closing must add nothing');
});

test('both checkbuttons are part of the saved project', () => {
  const r = run();
  assert.equal(r.saved.by_category, true);
  assert.equal(r.saved.add_on_close, true);
  assert.equal(r.reloaded.by_category, true);
  assert.equal(r.reloaded.add_on_close, true);
});
