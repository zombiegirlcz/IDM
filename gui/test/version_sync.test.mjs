// The version the GUI reports must be the version that is actually shipped.
//
// VERSION was "1.0.0" while every published tag is v0.1.x, so "Check for
// updates" compared 1.0.0 against v0.1.4 and always claimed the build was up
// to date -- the check could never fire. The GUI and the engine crate now carry
// the same number, and this test fails if they drift apart again.
//
// Runs with: node --test gui/test/version_sync.test.mjs

import test from 'node:test';
import assert from 'node:assert/strict';
import { readFileSync } from 'node:fs';
import { execFileSync } from 'node:child_process';
import { fileURLToPath } from 'node:url';
import { dirname, join } from 'node:path';

const here = dirname(fileURLToPath(import.meta.url));
const repoRoot = join(here, '..', '..');

function guiVersion() {
  const py = readFileSync(join(repoRoot, 'gui', 'idm_gui.py'), 'utf8');
  const m = /^VERSION = "([^"]+)"/m.exec(py);
  assert.ok(m, 'idm_gui.py must define VERSION');
  return m[1];
}

function crateVersion() {
  const toml = readFileSync(join(repoRoot, 'engine', 'Cargo.toml'), 'utf8');
  const m = /^version = "([^"]+)"/m.exec(toml);
  assert.ok(m, 'engine/Cargo.toml must define a version');
  return m[1];
}

test('the GUI and the engine report the same version', () => {
  assert.equal(
    guiVersion(),
    crateVersion(),
    'gui/idm_gui.py VERSION and engine/Cargo.toml version must match',
  );
});

test('Cargo.lock agrees with Cargo.toml', () => {
  const lock = readFileSync(join(repoRoot, 'engine', 'Cargo.lock'), 'utf8');
  const m = /name = "idm-engine"\nversion = "([^"]+)"/.exec(lock);
  assert.ok(m, 'Cargo.lock must carry the idm-engine package');
  assert.equal(m[1], crateVersion(), 'Cargo.lock is stale against Cargo.toml');
});

test('a published release is recognised as newer than this build', () => {
  // The tags are v-prefixed, so the comparison has to cope with that -- and it
  // must answer "newer" for the next release, not shrug.
  // The "newer" tag is derived from VERSION rather than written down: a
  // literal like v0.1.99 stops being higher the moment the major version
  // moves, and the test would then fail on the release instead of on a bug.
  const out = JSON.parse(
    execPy(`
import json
parts = VERSION.split(".")
higher = ".".join(parts[:-1] + [str(int(parts[-1]) + 1)])
print(json.dumps({
  "next": is_newer_version("v" + higher, VERSION),
  "same": is_newer_version("v" + VERSION, VERSION),
  "older": is_newer_version("v0.0.1", VERSION),
}))
`),
  );
  assert.equal(out.next, true, 'a higher published tag must count as newer');
  assert.equal(out.same, false, 'the same version is not newer');
  assert.equal(out.older, false, 'an older tag is not newer');
});

function execPy(snippet) {
  const guiPy = join(repoRoot, 'gui', 'idm_gui.py');
  return execFileSync(
    'python3',
    [
      '-I',
      '-c',
      `import importlib.util,sys\n` +
        `spec = importlib.util.spec_from_file_location("g", ${JSON.stringify(guiPy)})\n` +
        `g = importlib.util.module_from_spec(spec)\n` +
        `spec.loader.exec_module(g)\n` +
        `is_newer_version = g.is_newer_version\nVERSION = g.VERSION\n` +
        snippet,
    ],
    { encoding: 'utf8' },
  );
}
