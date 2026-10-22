// Right-click in a text field.
//
// Reported: right-click does nothing in Add URL, so a URL cannot be pasted
// in by hand with the mouse. Tk gives Entry/Text no context menu on Windows
// or Linux; the window has to provide Cut / Copy / Paste / Select All itself.
//
// Runs with: node --test gui/test/edit_menu.test.mjs

import test from 'node:test';
import assert from 'node:assert/strict';
import { execFileSync, spawnSync } from 'node:child_process';
import { fileURLToPath } from 'node:url';
import { dirname, join } from 'node:path';

const here = dirname(fileURLToPath(import.meta.url));
const guiPy = join(here, '..', 'idm_gui.py');

function marker(out, prefix) {
  const line = out.split('\n').find((l) => l.startsWith(prefix));
  assert.ok(line, `no ${prefix} line in output:\n${out}`);
  return JSON.parse(line.slice(prefix.length));
}

const enabled = (items) => items.filter((i) => i.enabled).map((i) => i.label);

test('edit_menu_items: what can be done depends on the field', () => {
  const out = execFileSync('python3', [guiPy, '--selftest-edit-menu-items'], { encoding: 'utf8' });
  const got = marker(out, 'EDIT-MENU-ITEMS:');
  assert.deepEqual(got.editable.map((i) => i.label), ['Cut', 'Copy', 'Paste', 'Select All']);
  assert.deepEqual(enabled(got.editable), ['Cut', 'Copy', 'Paste', 'Select All']);
  // Nothing selected: nothing to cut or copy, but pasting is the whole point.
  assert.deepEqual(enabled(got.empty_field), ['Paste', 'Select All']);
  // A read-only field (the copied URL in the clipboard prompt) can be copied
  // from but never changed.
  assert.deepEqual(enabled(got.readonly), ['Copy', 'Select All']);
  assert.deepEqual(enabled(got.empty_clipboard), ['Select All']);
});

test('right-click in Add URL pastes the clipboard into the URL field', () => {
  const res = spawnSync('xvfb-run', ['-a', 'python3', guiPy, '--selftest-edit-menu'], {
    encoding: 'utf8',
    maxBuffer: 8 * 1024 * 1024,
  });
  if (res.status !== 0) {
    throw new Error(`selftest failed (${res.status}):\n${res.stdout}\n${res.stderr}`);
  }
  const got = marker(res.stdout, 'EDIT-MENU:');
  for (const cls of ['TEntry', 'Entry', 'TCombobox', 'Text']) {
    assert.ok(got.bound.includes(cls), `no right-click menu on ${cls}: ${got.bound}`);
  }
  assert.deepEqual(got.labels, ['Cut', 'Copy', 'Paste', 'Select All']);
  assert.equal(got.after_paste, 'https://example.com/pasted.bin');
});
