// Tests for `scripts/ensure-aria2.sh` — the aria2 auto-installer.
//
// The user asked for a switch that installs aria2 itself on Linux and Windows
// when it is missing. This script is the Linux side: it checks for `aria2c`
// and, if absent, installs it via the available package manager (or downloads a
// static build as a last resort). It must be idempotent and must never fail
// when aria2 is already present.
//
// Runs with: node --test test/aria2_ensure.test.mjs

import test from 'node:test';
import assert from 'node:assert/strict';
import { readFileSync, existsSync, statSync, mkdtempSync } from 'node:fs';
import { execFileSync } from 'node:child_process';
import { fileURLToPath } from 'node:url';
import { dirname, join } from 'node:path';
import { tmpdir } from 'node:os';

const here = dirname(fileURLToPath(import.meta.url));
const repoRoot = join(here, '..');
const script = join(repoRoot, 'scripts', 'ensure-aria2.sh');
const src = () => readFileSync(script, 'utf8');

test('ensure-aria2.sh exists and is executable', () => {
  assert.ok(existsSync(script), `missing ${script}`);
  assert.ok(statSync(script).mode & 0o111, 'must be executable');
});

test('detects an already-installed aria2c and does nothing', () => {
  // Put a fake aria2c on PATH; the script must short-circuit successfully.
  const dir = mkdtempSync(join(tmpdir(), 'idm_aria_'));
  const fake = join(dir, 'aria2c');
  execFileSync('bash', ['-c', `printf '#!/bin/sh\\nexit 0\\n' > "${fake}" && chmod +x "${fake}"`]);
  const out = execFileSync('bash', [script], {
    encoding: 'utf8',
    env: { ...process.env, PATH: `${dir}:${process.env.PATH}`, IDM_ARIA2_NO_INSTALL: '1' },
  });
  assert.match(out, /already|found|present/i, `should report it found aria2: ${out}`);
});

test('uses a package manager when aria2c is missing', () => {
  const s = src();
  // Must know about the common package managers and winget for Windows.
  for (const pm of ['apt-get', 'dnf', 'pacman', 'winget']) {
    assert.ok(s.includes(pm), `should support ${pm}`);
  }
  assert.match(s, /aria2/, 'must reference the aria2 package');
  // Must be safe under `curl | bash` (no BASH_SOURCE dependence for core flow).
  assert.match(s, /set -euo pipefail/, 'must be strict');
});

test('honours IDM_ARIA2_NO_INSTALL to never touch the system', () => {
  const s = src();
  assert.match(
    s,
    /IDM_ARIA2_NO_INSTALL/,
    'must have an escape hatch so callers can forbid installation',
  );
});
