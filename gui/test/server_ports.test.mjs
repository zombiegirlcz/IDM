// Moving off an address that somebody else holds, and being able to say why
// the engine would not start.
//
// Runs with: node --test gui/test/server_ports.test.mjs

import test from 'node:test';
import assert from 'node:assert/strict';
import { execFileSync } from 'node:child_process';
import { mkdtempSync, writeFileSync, mkdirSync } from 'node:fs';
import { tmpdir } from 'node:os';
import { fileURLToPath } from 'node:url';
import { dirname, join } from 'node:path';

const here = dirname(fileURLToPath(import.meta.url));
const guiPy = join(here, '..', 'idm_gui.py');

function py(snippet) {
  return execFileSync('python3', [
    '-I', '-c',
    `import importlib.util, json\n` +
      `spec = importlib.util.spec_from_file_location("g", ${JSON.stringify(guiPy)})\n` +
      `g = importlib.util.module_from_spec(spec)\n` +
      `spec.loader.exec_module(g)\n` + snippet,
  ], { encoding: 'utf8' });
}

test('the plan starts with the address it was given', () => {
  const out = JSON.parse(py(`print(json.dumps(list(g.server_addr_plan("127.0.0.1:8080"))))`));
  assert.equal(out[0], '127.0.0.1:8080',
    'the configured address must be tried first, every time');
});

test('the plan offers further ports, and stops', () => {
  const out = JSON.parse(py(`print(json.dumps(list(g.server_addr_plan("127.0.0.1:8080"))))`));
  assert.ok(out.length > 1, 'there has to be somewhere to go when the port is taken');
  assert.ok(out.length <= 8, 'it must terminate, not scan the port range');
  assert.equal(new Set(out).size, out.length, 'no address twice');
  for (const a of out) {
    assert.match(a, /^127\.0\.0\.1:\d+$/, `${a} must keep the host and be a port`);
  }
  // The host is preserved: binding somewhere else would expose the queue API.
  assert.ok(out.every((a) => a.startsWith('127.0.0.1:')),
    'the loopback host must never be rewritten');
});

test('an address without a port is handled rather than crashing', () => {
  const out = JSON.parse(py(`print(json.dumps(list(g.server_addr_plan("127.0.0.1"))))`));
  assert.ok(out.length >= 1);
  assert.equal(out[0], '127.0.0.1');
});

test('the engine log tail reports what the engine complained about', () => {
  const dir = mkdtempSync(join(tmpdir(), 'idm_logtail_'));
  writeFileSync(join(dir, 'engine.log'),
    'some earlier noise\nError: Address already in use (os error 98)\n');
  const out = py(`print(g.engine_log_tail(${JSON.stringify(dir)}))`).trim();
  assert.match(out, /Address already in use/,
    'the reason the engine died is the one thing worth showing');
});

test('a missing log is empty, not an exception', () => {
  const dir = mkdtempSync(join(tmpdir(), 'idm_nolog_'));
  const out = py(`print(json.dumps(g.engine_log_tail(${JSON.stringify(dir)})))`);
  assert.equal(JSON.parse(out), '');
});

test('the tail stays short enough for a dialog', () => {
  const dir = mkdtempSync(join(tmpdir(), 'idm_biglog_'));
  writeFileSync(join(dir, 'engine.log'), 'x'.repeat(50000) + '\nlast line here\n');
  const out = py(`print(json.dumps(g.engine_log_tail(${JSON.stringify(dir)})))`);
  const tail = JSON.parse(out);
  assert.ok(tail.length <= 500, `a message box is not a log viewer, got ${tail.length}`);
  assert.match(tail, /last line here/, 'the newest line is the interesting one');
});
