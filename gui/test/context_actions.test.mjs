// A context menu that opens but does nothing is still broken.
//
// The user reported exactly that on Windows: the right-click menu appeared,
// clicking an entry closed it, and the download list did not change. Two
// separate faults are pinned here:
//
//   1. the menu was never *invoked* -- only created -- so nothing proved the
//      command attached to each entry, and
//   2. the small Treeviews (Grabber, Scheduler) and every other window had no
//      right-click menu at all.
//
// Runs with: node --test gui/test/context_actions.test.mjs

import test from 'node:test';
import assert from 'node:assert/strict';
import { spawnSync } from 'node:child_process';
import { readFileSync } from 'node:fs';
import { fileURLToPath } from 'node:url';
import { dirname, join } from 'node:path';

const here = dirname(fileURLToPath(import.meta.url));
const guiPy = join(here, '..', 'idm_gui.py');

function selftest(flag) {
  const res = spawnSync('xvfb-run', ['-a', 'python3', guiPy, flag], {
    encoding: 'utf8',
    maxBuffer: 8 * 1024 * 1024,
  });
  if (res.status !== 0) {
    throw new Error(`${flag} failed (${res.status}):\n${res.stdout}\n${res.stderr}`);
  }
  return JSON.parse(res.stdout.trim().split('\n').at(-1));
}

test('every entry of the download context menu reaches the API', () => {
  // Each menu entry is invoked for real, against a recording API, and the
  // call it produced is compared with what the entry promises.
  const got = selftest('--selftest-list-menu-actions');
  assert.deepEqual(got.errors, [], `menu entries raised: ${got.errors}`);
  assert.deepEqual(got.resume, [7], 'Resume must call api.resume(7)');
  // Add to Queue pauses the item on purpose (a queued download waits for its
  // queue to be started), so 7 appears more than once.
  assert.ok(got.pause.includes(7), 'Stop must call api.pause(7)');
  assert.deepEqual(got.remove, [7], 'Delete must call api.remove(7)');
  assert.deepEqual(got.queue, [{ id: 7, queue: 'Synchronization queue' }],
                   'Add to Queue must move the item into the selected queue');
});

test('Delete Completed removes only finished downloads', () => {
  const got = selftest('--selftest-delete-completed');
  assert.deepEqual(got.removed.sort(), [1, 3],
                   `only done rows may be removed, got ${got.removed}`);
});

test('the Grabber file list has a right-click menu that acts', () => {
  const got = selftest('--selftest-grabber-menu');
  assert.ok(got.labels.length >= 3, `menu too small: ${got.labels}`);
  assert.equal(got.checked, 1, 'Check must tick the clicked row');
  assert.equal(got.unchecked, 0, 'Uncheck must clear it again');
});

test('the Scheduler queue list has a right-click menu that acts', () => {
  const got = selftest('--selftest-scheduler-menu');
  assert.ok(got.labels.includes('Start Now'), `menu: ${got.labels}`);
  assert.deepEqual(got.resumed, [4], 'Start Now must resume the clicked row');
  assert.deepEqual(got.paused, [4], 'Stop must pause the clicked row');
});

test('text fields everywhere get Cut/Copy/Paste, not just the main window', () => {
  // install_edit_menu is bound per *class*, so a field created later in a
  // dialog inherits it -- but only if a window ever called it. The report was
  // that Paste only worked in the Add URL box.
  const py = readFileSync(guiPy, 'utf8');
  const calls = py.match(/install_edit_menu\(/g) || [];
  assert.ok(calls.length >= 2,
            'install_edit_menu must run for the main window and for dialogs');
});