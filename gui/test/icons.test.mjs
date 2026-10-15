// Icons must not depend on PIL.
//
// On the reporting machine the toolbar had no icons at all and the window had
// no icon in the title bar or the panel. The cause was not missing artwork:
// PIL was installed, but PIL.ImageTk.PhotoImage raised
//
//     TypeError: bad argument type for built-in operation   (PIL/_imagingtk)
//
// because that Pillow build does not match the Tcl/Tk it was loaded against.
// _icon() caught the exception and returned None, so every icon silently
// disappeared. It is also a contradiction: idm_gui.py is documented as
// stdlib-only with no native dependency, and ImageTk is exactly that.
//
// Tk 8.6 can both read PNG files and take per-pixel data, so the icons are
// drawn with the standard library. These tests run the window with a PIL that
// fails on import of ImageTk -- the state the user is actually in.
//
// Runs with: node --test gui/test/icons.test.mjs

import test from 'node:test';
import assert from 'node:assert/strict';
import { spawnSync } from 'node:child_process';
import { mkdtempSync, mkdirSync, writeFileSync } from 'node:fs';
import { tmpdir } from 'node:os';
import { fileURLToPath } from 'node:url';
import { dirname, join } from 'node:path';

const here = dirname(fileURLToPath(import.meta.url));
const guiPy = join(here, '..', 'idm_gui.py');

/** A PIL whose ImageTk explodes exactly like the broken one does. */
function brokenPilPath() {
  const dir = mkdtempSync(join(tmpdir(), 'idm_brokenpil_'));
  mkdirSync(join(dir, 'PIL'));
  writeFileSync(join(dir, 'PIL', '__init__.py'), '');
  writeFileSync(join(dir, 'PIL', 'Image.py'), 'def new(*a, **k):\n    raise TypeError("bad argument type for built-in operation")\n');
  writeFileSync(join(dir, 'PIL', 'ImageTk.py'),
    'raise TypeError("bad argument type for built-in operation")\n');
  writeFileSync(join(dir, 'PIL', 'ImageDraw.py'),
    'raise TypeError("bad argument type for built-in operation")\n');
  return dir;
}

function selftest(flag, env = {}) {
  const res = spawnSync('xvfb-run', ['-a', 'python3', guiPy, flag], {
    encoding: 'utf8',
    maxBuffer: 4 * 1024 * 1024,
    env: { ...process.env, ...env },
  });
  assert.equal(res.status, 0, `${flag} failed:\n${res.stdout}\n${res.stderr}`);
  const line = res.stdout.split('\n').find((l) => l.startsWith('ICONS:'));
  assert.ok(line, `no ICONS: line:\n${res.stdout}\n${res.stderr}`);
  return JSON.parse(line.slice('ICONS:'.length));
}

test('every toolbar button carries an icon when PIL works', () => {
  const d = selftest('--selftest-icons');
  assert.ok(d.buttons > 0, 'there should be toolbar buttons at all');
  assert.equal(d.with_icons, d.buttons,
    `${d.buttons - d.with_icons} toolbar buttons have no icon`);
});

test('the icons survive a PIL that cannot talk to Tk', () => {
  // THE BUG: this configuration produced a toolbar of bare text.
  const d = selftest('--selftest-icons', { PYTHONPATH: brokenPilPath() });
  assert.equal(d.with_icons, d.buttons,
    'icons must not depend on PIL: a broken ImageTk left the toolbar bare');
  assert.equal(d.pil_used, false, 'the stdlib path should have drawn these');
});

test('the window has an icon of its own', () => {
  // The title bar and the panel showed an empty placeholder square.
  const d = selftest('--selftest-icons');
  assert.ok(d.window_icon, 'the window must set an icon (wm iconphoto)');
  assert.ok(d.window_icon_size >= 32,
    `a window icon of ${d.window_icon_size}px is too small for a panel`);
});

test('the window icon does not need PIL either', () => {
  const d = selftest('--selftest-icons', { PYTHONPATH: brokenPilPath() });
  assert.ok(d.window_icon, 'the window icon must come from Tk, not PIL');
});

test('the category tree is iconned too', () => {
  const d = selftest('--selftest-icons', { PYTHONPATH: brokenPilPath() });
  assert.ok(d.category_icons > 0,
    'categories lost their icons along with everything else');
});
