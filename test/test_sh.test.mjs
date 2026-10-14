// scripts/test.sh must not compile Rust unless asked to.
//
// The Rust steps (cargo build --release, cargo test) are opt-in via WITH_RUST=1
// so that a plain `npm test` needs no toolchain; CI sets the flag and gets the
// full matrix. Both cargo and node are stubbed here, so the script runs in
// milliseconds and cannot recurse into the real suites.

import test from 'node:test';
import assert from 'node:assert/strict';
import { mkdtempSync, writeFileSync, chmodSync, existsSync, readFileSync } from 'node:fs';
import { spawnSync } from 'node:child_process';
import { fileURLToPath } from 'node:url';
import { dirname, join } from 'node:path';
import { tmpdir } from 'node:os';

const repoRoot = join(dirname(fileURLToPath(import.meta.url)), '..');

// A PATH shim whose `cargo` only appends its arguments to a log, and whose
// `node` does nothing at all: we are testing the script's decision, not the
// suites it would otherwise run.
function runScript(env) {
  const dir = mkdtempSync(join(tmpdir(), 'idm_testsh_'));
  const log = join(dir, 'cargo.log');
  writeFileSync(join(dir, 'cargo'), `#!/usr/bin/env bash\necho "$@" >> ${log}\n`);
  // `node` does nothing — except when asked to decide about a real-browser
  // E2E, where the script needs an actual decision line to read. Stubbing both
  // as skips keeps this test about the Rust opt-in instead of about browsers.
  writeFileSync(
    join(dir, 'node'),
    '#!/usr/bin/env bash\n'
      + 'case "$*" in\n'
      + '  *chrome_e2e_decide*) printf "skip\\t\\t\\tstubbed\\n";;\n'
      + '  *firefox_e2e_decide*) printf "skip\\t\\tstubbed\\n";;\n'
      + 'esac\n'
      + 'exit 0\n',
  );
  chmodSync(join(dir, 'cargo'), 0o755);
  chmodSync(join(dir, 'node'), 0o755);
  const r = spawnSync('bash', [join(repoRoot, 'scripts/test.sh')], {
    env: { ...process.env, PATH: dir + ':' + process.env.PATH, ...env },
    encoding: 'utf8',
    timeout: 120000,
  });
  return { ...r, cargo: existsSync(log) ? readFileSync(log, 'utf8') : '' };
}

test('a plain run compiles no Rust', () => {
  const r = runScript({ WITH_RUST: '' });
  assert.equal(r.status, 0, 'stdout: ' + r.stdout + '\nstderr: ' + r.stderr);
  assert.equal(r.cargo, '', 'cargo must not be invoked without WITH_RUST, got: ' + r.cargo);
  assert.match(r.stdout, /WITH_RUST/, 'the script must say how to get the Rust steps');
});

test('WITH_RUST=1 runs the release build and the cargo suites', () => {
  const r = runScript({ WITH_RUST: '1' });
  assert.equal(r.status, 0, 'stdout: ' + r.stdout + '\nstderr: ' + r.stderr);
  assert.match(r.cargo, /build --release/, 'cargo log: ' + r.cargo);
  assert.match(r.cargo, /^test$/m, 'cargo log: ' + r.cargo);
});

test('a decider that says nothing fails the run', () => {
  // The Chromium E2E step reads its decision from a node script. If that
  // script breaks, the step must stop the suite rather than silently skip the
  // one test that drives a real browser.
  const dir = mkdtempSync(join(tmpdir(), 'idm_testsh_'));
  writeFileSync(join(dir, 'cargo'), '#!/usr/bin/env bash\nexit 0\n');
  writeFileSync(join(dir, 'node'), '#!/usr/bin/env bash\nexit 0\n');
  chmodSync(join(dir, 'cargo'), 0o755);
  chmodSync(join(dir, 'node'), 0o755);
  const r = spawnSync('bash', [join(repoRoot, 'scripts/test.sh')], {
    env: { ...process.env, PATH: dir + ':' + process.env.PATH, WITH_RUST: '' },
    encoding: 'utf8',
    timeout: 120000,
  });
  assert.notEqual(r.status, 0, 'an empty decision must not pass: ' + r.stdout);
});

test('both real-browser E2Es are gated steps, not exclusions', () => {
  const sh = readFileSync(join(repoRoot, 'scripts/test.sh'), 'utf8');
  for (const b of ['chrome', 'firefox']) {
    assert.match(sh, new RegExp(`${b}_e2e_decide\\.mjs`), `${b} must ask its gate`);
    assert.match(sh, new RegExp(`${b}_e2e\\.test\\.mjs`), `${b} must run its harness`);
  }
});
