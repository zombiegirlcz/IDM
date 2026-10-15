// What the GUI must do when the queue API does not answer the way it should.
//
// The bug this pins down: a `idm --serve` from an EARLIER install was still
// holding 127.0.0.1:8080 (its binary already deleted). The GUI spawned its own
// engine, that engine died instantly with "address in use" into DEVNULL, and
// every request then went to the stranger, which answered 403 because it was
// started with a different api-token. The window looked fine and downloaded
// nothing -- neither from the clipboard prompt nor from a typed URL.
//
// Two things were missing. The GUI never checked whether the server that
// answered was ITS OWN child (the trap the Rust tests already guard against in
// start_server()), and it threw away the result of wait_alive(), so a failed
// autostart was indistinguishable from a good one.
//
// The decision is a pure function so it can be tested without Tk, which is the
// house rule for this project.
//
// Runs with: node --test gui/test/server_decision.test.mjs

import test from 'node:test';
import assert from 'node:assert/strict';
import { execFileSync } from 'node:child_process';
import { fileURLToPath } from 'node:url';
import { dirname, join } from 'node:path';

const here = dirname(fileURLToPath(import.meta.url));
const guiPy = join(here, '..', 'idm_gui.py');

function decide(kwargs) {
  const args = Object.entries(kwargs)
    .map(([k, v]) => `${k}=${typeof v === 'boolean' ? (v ? 'True' : 'False') : v === null ? 'None' : JSON.stringify(v)}`)
    .join(', ');
  const out = execFileSync('python3', [
    '-I', '-c',
    `import importlib.util, json\n` +
      `spec = importlib.util.spec_from_file_location("g", ${JSON.stringify(guiPy)})\n` +
      `g = importlib.util.module_from_spec(spec)\n` +
      `spec.loader.exec_module(g)\n` +
      `print(json.dumps(g.server_decision(${args})))`,
  ], { encoding: 'utf8' });
  return JSON.parse(out);
}

test('nothing is listening and we have not spawned yet: start the engine', () => {
  const d = decide({ listening: false, authorized: false, child_alive: null });
  assert.equal(d.action, 'spawn');
});

test('our own server answers: use it', () => {
  const d = decide({ listening: true, authorized: true, child_alive: true });
  assert.equal(d.action, 'use');
});

test('a server answers but rejects our token: it is not ours', () => {
  // THE BUG. A stranger on the port must never be treated as a working
  // backend; the GUI has to move to another port instead of talking to it.
  const d = decide({ listening: true, authorized: false, child_alive: null });
  assert.equal(d.action, 'other_port',
    'a server that refuses our token is somebody else\'s and must not be used');
  assert.match(d.reason, /token|foreign|jiný|cizí/i,
    'the reason has to say why the port was abandoned');
});

test('a stranger holds the port and our child died on it', () => {
  // This is exactly what was on the user's machine: the stranger answers, our
  // own engine exited with "address in use".
  const d = decide({ listening: true, authorized: false, child_alive: false });
  assert.equal(d.action, 'other_port');
});

test('our child died and nothing is listening: report it, do not pretend', () => {
  // The engine failed for its own reason (missing binary, bad arguments). The
  // window must say so rather than open and stay silent.
  const d = decide({ listening: false, authorized: false, child_alive: false });
  assert.equal(d.action, 'failed');
  assert.ok(d.message, 'a failure needs a message for the user');
});

test('our child is alive but the port is not up yet: keep waiting', () => {
  const d = decide({ listening: false, authorized: false, child_alive: true });
  assert.equal(d.action, 'wait');
});

test('an unauthorized answer never counts as a usable server', () => {
  // Whatever the state of our child, `authorized: false` must never produce
  // "use" -- that single mistake is what made the window silent.
  for (const child of [null, true, false]) {
    const d = decide({ listening: true, authorized: false, child_alive: child });
    assert.notEqual(d.action, 'use', `child_alive=${child} must not yield "use"`);
  }
});
