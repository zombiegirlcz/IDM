// IDM keeps running in the Windows notification area.
//
// Asked for: "u Windowsu, aby IDM po zavření se neukončilo a schovalo se na
// pozadí a zobrazovalo se dole, jak jsou hodiny, mezi procesy běžícími na
// pozadí s ikonou, a po pravém kliku by se teprve ukázalo menu s Ukončit".
//
// Closing the window used to destroy it and terminate `idm --serve` with it,
// so every running download stopped. On Windows the close button now hides
// the window; the tray icon brings it back (left click) or offers Open/Exit
// (right click). Exit -- in the tray menu or File > Exit -- really quits.
//
// The decisions are pure functions; the ctypes tray itself only exists on
// Windows, so it is exercised by the windows-installer CI job
// (--selftest-tray), not here.
//
// Runs with: node --test gui/test/tray.test.mjs

import test from 'node:test';
import assert from 'node:assert/strict';
import { execFileSync } from 'node:child_process';
import { readFileSync } from 'node:fs';
import { fileURLToPath } from 'node:url';
import { dirname, join } from 'node:path';

const here = dirname(fileURLToPath(import.meta.url));
const guiPy = join(here, '..', 'idm_gui.py');
const SRC = readFileSync(guiPy, 'utf8');

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

test('closing hides to the tray on Windows, and only when the icon is there', () => {
  const r = py(`
s = g.load_settings("/nonexistent-idm-state")
off = json.loads(json.dumps(s)); off["general"]["minimize_to_tray"] = False
print("R:" + json.dumps([
    g.close_action(True, True, s),
    g.close_action(True, False, s),
    g.close_action(False, True, s),
    g.close_action(True, True, off),
]))`);
  assert.deepEqual(r, ['hide', 'quit', 'quit', 'quit'],
    'no icon = no way back, so the window must not vanish');
});

test('hiding to the tray is on by default and switchable in Options', () => {
  const r = py('print("R:" + json.dumps(g.DEFAULT_SETTINGS["general"].get("minimize_to_tray")))');
  assert.equal(r, true);
  assert.match(SRC, /add_check\([^)]*"general\.minimize_to_tray"/s, 'no Options checkbox');
});

test('the tray menu is Open then Exit', () => {
  const r = py('print("R:" + json.dumps(g.TRAY_MENU))');
  assert.deepEqual(r, [['Open IDM', 'show'], ['Exit', 'quit']]);
});

test('left click shows the window, right click opens the menu', () => {
  const r = py(`print("R:" + json.dumps([g.tray_event(m) for m in
      (0x0202, 0x0203, 0x0205, 0x007B, 0x0200, 0x0201)]))`);
  // WM_LBUTTONUP, WM_LBUTTONDBLCLK, WM_RBUTTONUP, WM_CONTEXTMENU,
  // WM_MOUSEMOVE, WM_LBUTTONDOWN
  assert.deepEqual(r, ['show', 'show', 'menu', 'menu', null, null]);
});

test('no tray anywhere but Windows', () => {
  const r = py('print("R:" + json.dumps(g.start_tray(lambda e: None) is None))');
  assert.equal(r, true);
});

test('the window wiring: close asks close_action, Exit really quits, the icon goes away', () => {
  assert.match(SRC, /close_action\(os\.name == "nt"/, 'WM_DELETE_WINDOW must ask close_action');
  assert.match(SRC, /root\.withdraw\(\)/, 'hiding is withdraw, not iconify');
  assert.match(SRC, /tray\.stop\(\)/, 'the icon must be removed on quit');
  assert.match(SRC, /NIM_DELETE/, 'Shell_NotifyIcon NIM_DELETE');
  assert.match(SRC, /TaskbarCreated/, 'the icon comes back after Explorer restarts');
  assert.match(SRC, /"--selftest-tray"/, 'CI needs a way to start and stop the real icon');
  const wf = readFileSync(join(here, '..', '..', '.github', 'workflows', 'test.yml'), 'utf8');
  assert.match(wf, /--selftest-tray/, 'the windows job must run the tray selftest');
});
