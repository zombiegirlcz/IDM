// What the window does once `idm update` has finished.
//
// Reported from Windows: after an update the install was "not in sync". The
// dialog only said "Nová verze se projeví po restartu okna", but on Windows
// the close button hides the window to the notification area -- so nothing
// ever restarted. The old window and the engine it spawned kept running out
// of bin.old (holding it, so it could not be deleted), and a fresh launch
// reused that old engine because it still accepted the saved api-token.
//
// So a finished update restarts IDM for real, and a failed one is never shown
// as a success. Both decisions are pure functions; the dialog only wires them.
//
// Runs with: node --test gui/test/update_restart.test.mjs

import test from 'node:test';
import assert from 'node:assert/strict';
import { execFileSync } from 'node:child_process';
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

const outcome = (progress, rc) =>
  py(`print("R:" + json.dumps(g.update_outcome(json.loads(${JSON.stringify(JSON.stringify(progress))}), ${rc})))`);

test('a finished swap is an installed update', () => {
  const r = outcome({ phase: 'done', done: true, percent: 100 }, 0);
  assert.equal(r.ok, true);
  assert.equal(r.installed, true, 'phase "done" means new files are on disk');
});

test('"up to date" is fine but installed nothing, so nothing restarts', () => {
  const r = outcome({ phase: 'uptodate', done: true }, 0);
  assert.equal(r.ok, true);
  assert.equal(r.installed, false);
});

test('a non-zero exit is a failure even when the file never said so', () => {
  // The updater can die (or lose its last write) before reporting the error;
  // the dialog used to fall back to "Hotovo" whenever the process had exited.
  for (const progress of [{}, { phase: 'swap', done: false }]) {
    const r = outcome(progress, 1);
    assert.equal(r.ok, false, JSON.stringify(progress));
    assert.equal(r.installed, false);
    assert.match(r.label, /selhal/, r.label);
  }
});

test('an error in the progress file wins over exit code 0', () => {
  const r = outcome({ phase: 'error', done: true, error: 'kontrolní součet nesouhlasí' }, 0);
  assert.equal(r.ok, false);
  assert.match(r.label, /součet/, r.label);
});

test('a clean exit without a final write still counts as done', () => {
  // The old behaviour for this case, kept: exit 0 is the updater's verdict.
  const r = outcome({ phase: 'swap', done: false }, 0);
  assert.equal(r.ok, true);
  assert.equal(r.installed, true);
});

const action = (o, auto, active) =>
  py(`print("R:" + json.dumps(g.after_update_action(json.loads(${JSON.stringify(JSON.stringify(o))}), ${auto ? 'True' : 'False'}, ${active})))`);

test('the startup update restarts by itself when nothing is downloading', () => {
  assert.equal(action({ ok: true, installed: true }, true, 0), 'restart');
});

test('a running download is never cut off: the restart is offered instead', () => {
  assert.equal(action({ ok: true, installed: true }, true, 2), 'offer');
});

test('an update started by hand offers the restart rather than taking it', () => {
  assert.equal(action({ ok: true, installed: true }, false, 0), 'offer');
});

test('nothing to restart into after a failure or "up to date"', () => {
  assert.equal(action({ ok: false, installed: false }, true, 0), 'none');
  assert.equal(action({ ok: true, installed: false }, true, 0), 'none');
  assert.equal(action(null, true, 0), 'none');
});

test('the restart runs the same window again with the same interpreter', () => {
  const r = py(`print("R:" + json.dumps(g.relaunch_command(
      "C:/Python312/pythonw.exe",
      ["C:/u/.idm/gui/idm_gui.py", "--engine", "C:/u/.idm/bin/idm.exe", "--autostart"])))`);
  assert.deepEqual(r, [
    'C:/Python312/pythonw.exe',
    'C:/u/.idm/gui/idm_gui.py', '--engine', 'C:/u/.idm/bin/idm.exe', '--autostart',
  ]);
});

test('a restart never re-runs a one-shot flag', () => {
  // --screenshot / --selftest-* exit on their own; restarting into one would
  // close the window the user just got back.
  const r = py(`print("R:" + json.dumps(g.relaunch_command(
      "/usr/bin/python3",
      ["/x/idm_gui.py", "--screenshot", "/tmp/s.png", "--autostart"])))`);
  assert.equal(r, null);
});
