// Properties must be editable, not just readable.
//
// "Open" worked, but OK only closed the window: the URL, Save To and
// Description fields went nowhere. These tests cover the three pieces of the
// path -- the dialog collecting its fields, Api.update putting them on the
// wire, and the Description column existing to show the result.
//
// Runs with: node --test gui/test/properties_edit.test.mjs

import test from 'node:test';
import assert from 'node:assert/strict';
import { readFileSync, existsSync, mkdtempSync } from 'node:fs';
import { spawnSync, execFileSync } from 'node:child_process';
import { fileURLToPath } from 'node:url';
import { dirname, join } from 'node:path';
import { tmpdir } from 'node:os';

const here = dirname(fileURLToPath(import.meta.url));
const guiDir = join(here, '..');
const repoRoot = join(guiDir, '..');
const guiPy = join(guiDir, 'idm_gui.py');

function findEngine() {
  const candidates = [
    process.env.IDM_ENGINE_BIN,
    join(repoRoot, 'engine/target/release/idm'),
    join(repoRoot, 'engine/target/debug/idm'),
  ].filter(Boolean);
  for (const c of candidates) if (existsSync(c)) return c;
  throw new Error(`idm engine not found; looked in:\n  ${candidates.join('\n  ')}`);
}

test('the main list has a Description column', () => {
  const py = readFileSync(guiPy, 'utf8');
  const cols = py.slice(py.indexOf('COLUMNS = ['), py.indexOf(']', py.indexOf('COLUMNS = [')));
  assert.match(cols, /"description"/, `COLUMNS must carry description, got: ${cols}`);
});

test('Api.update sends only the edited fields to /api/update', () => {
  const out = execFileSync('python3', [guiPy, '--selftest-properties-body'], {
    encoding: 'utf8',
  });
  const line = out.split('\n').find((l) => l.startsWith('PROPS:'));
  assert.ok(line, `no PROPS: line in output:\n${out}`);
  const got = JSON.parse(line.slice('PROPS:'.length));

  assert.equal(got.path, '/api/update', 'the dialog must PATCH the item, not re-add it');
  assert.deepEqual(got.full, {
    id: 4,
    url: 'https://example.com/new.bin',
    output: '/tmp/renamed.bin',
    description: 'a note',
  });
  // A field the user did not touch must not be sent, or it would overwrite the
  // stored value with an empty string.
  assert.deepEqual(got.partial, { id: 4, description: 'only this' });
});

test('the Properties dialog hands its fields to the caller on OK', () => {
  const res = spawnSync(
    'xvfb-run',
    ['-a', 'python3', guiPy, '--selftest-properties-ok'],
    { encoding: 'utf8', maxBuffer: 8 * 1024 * 1024 },
  );
  if (res.status !== 0) {
    throw new Error(`selftest failed (${res.status}):\n${res.stdout}\n${res.stderr}`);
  }
  const line = res.stdout.split('\n').find((l) => l.startsWith('PROPS-OK:'));
  assert.ok(line, `no PROPS-OK: line:\n${res.stdout}`);
  const got = JSON.parse(line.slice('PROPS-OK:'.length));
  assert.deepEqual(got, {
    url: 'https://example.com/edited.bin',
    output: '/tmp/edited.bin',
    description: 'edited note',
  });
});

test('the item list shows a stored description', () => {
  // The engine reports `description` on each item; the row must render it.
  const out = execFileSync(
    'python3',
    [guiPy, '--selftest-row', '--engine', findEngine()],
    { encoding: 'utf8' },
  );
  const line = out.split('\n').find((l) => l.startsWith('ROW:'));
  assert.ok(line, `no ROW: line in output:\n${out}`);
  const row = JSON.parse(line.slice('ROW:'.length));
  assert.ok(
    row.includes('a stored note'),
    `the rendered row must contain the description, got: ${JSON.stringify(row)}`,
  );
});
