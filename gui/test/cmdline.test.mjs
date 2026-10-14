// IDM can be driven from a command line (/d URL, /p path, /f name, /a, /s,
// /q, /h, /n). Our main() knew only its own --addr/--engine/--selftest-*
// switches, so none of that worked.
//
// Runs with: node --test gui/test/cmdline.test.mjs

import test from 'node:test';
import assert from 'node:assert/strict';
import { execFileSync } from 'node:child_process';
import { fileURLToPath } from 'node:url';
import { dirname, join } from 'node:path';

const here = dirname(fileURLToPath(import.meta.url));
const guiDir = join(here, '..');

function parse(argv) {
  const code = `
import sys, json
sys.path.insert(0, ${JSON.stringify(guiDir)})
import idm_gui as g
print("R:" + json.dumps(g.parse_idm_argv(json.loads(${JSON.stringify(JSON.stringify(argv))}))))
`;
  const out = execFileSync('python3', ['-I', '-c', code], { encoding: 'utf8' });
  const line = out.split('\n').find((l) => l.startsWith('R:'));
  assert.ok(line, `no R: line:\n${out}`);
  return JSON.parse(line.slice(2));
}

test('a URL with a path and a file name is picked up', () => {
  const r = parse(['/d', 'http://h/a.zip', '/p', '/downloads', '/f', 'renamed.zip']);
  assert.equal(r.url, 'http://h/a.zip');
  assert.equal(r.path, '/downloads');
  assert.equal(r.filename, 'renamed.zip');
  assert.equal(r.recognised, true);
});

test('the switches are flags, in any order, and case-insensitive', () => {
  const r = parse(['/N', '/A', '/Q', '/H', '/S', '/d', 'http://h/a.zip']);
  assert.equal(r.silent, true);
  assert.equal(r.queue_only, true, '/a adds without starting');
  assert.equal(r.exit_when_done, true);
  assert.equal(r.hang_up, true);
  assert.equal(r.start_queue, true);
  assert.equal(r.url, 'http://h/a.zip');
});

test('nothing recognisable means the GUI just opens', () => {
  const r = parse([]);
  assert.equal(r.recognised, false);
  assert.equal(r.url, '');
  const r2 = parse(['--addr', '127.0.0.1:9', '--state-dir', '/tmp/x']);
  assert.equal(r2.recognised, false, 'our own switches are not IDM parameters');
});

test('a switch missing its value does not swallow the next switch', () => {
  // "/p /d URL" must not set path to "/d".
  const r = parse(['/p', '/d', 'http://h/a.zip']);
  assert.equal(r.path, '', 'a missing value leaves the field empty');
  assert.equal(r.url, 'http://h/a.zip', 'the following switch still parses');
});

test('Windows-style /d= and a bare URL are both accepted', () => {
  assert.equal(parse(['/d=http://h/a.zip']).url, 'http://h/a.zip');
  // Dropping a URL on the executable passes it as a bare argument.
  const bare = parse(['http://h/a.zip']);
  assert.equal(bare.url, 'http://h/a.zip');
  assert.equal(bare.recognised, true);
});

test('a bare argument that is not a URL is ignored', () => {
  const r = parse(['some-file.txt']);
  assert.equal(r.url, '');
  assert.equal(r.recognised, false);
});
