// A failed engine start must be visible without blocking the program.
//
// The first attempt at "say it on screen" was tkinter.messagebox.showerror().
// That is modal: it waits for a click, so a window started with --screenshot
// or from a desktop launcher stops before it draws anything, and CI reported
// "no screenshot was written at all" after 90 seconds. The message belongs in
// the window, not in front of it.
//
// Runs with: node --test gui/test/banner.test.mjs

import test from 'node:test';
import assert from 'node:assert/strict';
import { readFileSync } from 'node:fs';
import { fileURLToPath } from 'node:url';
import { dirname, join } from 'node:path';

const here = dirname(fileURLToPath(import.meta.url));
const src = readFileSync(join(here, '..', 'idm_gui.py'), 'utf8');

test('the startup path raises no modal dialog', () => {
  // Scoped to main(): a messagebox is fine in response to a click, and the
  // program uses several that way. What must never happen is one on the path
  // between "window exists" and "window is drawn".
  const start = src.indexOf('# A window exists, so it is safe to make sure an engine is running.');
  assert.ok(start > 0, 'the engine-start block moved; this test needs updating');
  const end = src.indexOf('apply_items = _w["apply_items"]', start);
  assert.ok(end > start);
  const block = src.slice(start, end);
  assert.ok(!/showerror|showwarning|showinfo|askyesno/.test(block),
    'a modal during startup blocks the window before it is drawn');
});

test('there is a banner to put the message in instead', () => {
  assert.match(src, /def show_banner\(/, 'show_banner() is how the message gets out');
  const start = src.indexOf('if engine_error:');
  const end = src.indexOf('\n\n', start);
  assert.match(src.slice(start, end), /show_banner/,
    'a failed engine start has to reach the banner');
});

test('the banner can be dismissed', () => {
  // A permanent bar across the top of the window is its own annoyance.
  assert.match(src, /banner\.pack_forget\(\)/,
    'the banner needs a way to go away');
});
