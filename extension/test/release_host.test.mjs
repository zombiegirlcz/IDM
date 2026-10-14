// Regression guard for the DEPLOYED host binary.
//
// The Chrome native-messaging manifest points at the release build
// (engine/target/release/idm-host), but `cargo test` only ever builds and
// exercises the debug binary via CARGO_BIN_EXE_idm-host. That let a STALE
// release binary silently pass: it still answered pings and accepted a
// download without --allowed-dir even though the source already required it.
//
// This test therefore runs the REAL release binary (not CARGO_BIN_EXE_*) and
// asserts:
//   * it exists — a failure when WITH_RUST=1 built it, a skip when this run
//     compiled no Rust at all (see extension/release_host_guard.mjs),
//   * it is not older than its source (staleness guard),
//   * it fails closed without --allowed-dir,
//   * it works when --allowed-dir is supplied.
//
// Runs with: node --test extension/test/release_host.test.mjs
//
// WITH_RUST: `npm test` only builds the release binary when WITH_RUST=1, so
// without the flag these checks skip instead of failing on an absent binary.
//
// CI CAVEAT (mtime guard): the staleness check below compares mtimes, so a
// fresh checkout layered over a CACHED `engine/target/` can report a FALSE
// "STALE" — git sets the source file's mtime to checkout time, which is newer
// than a cached binary even though that binary was built from identical
// sources. Always run `cargo build --release` before this test in CI (or drop
// the cached target), otherwise the guard can fail for the wrong reason.

import test from 'node:test';
import assert from 'node:assert/strict';
import { existsSync, statSync, mkdtempSync } from 'node:fs';
import { spawnSync } from 'node:child_process';
import { fileURLToPath } from 'node:url';
import { dirname, join } from 'node:path';
import { tmpdir } from 'node:os';
import { releaseHostMode } from '../release_host_guard.mjs';

const here = dirname(fileURLToPath(import.meta.url));
const ext = join(here, '..');
const repoRoot = join(ext, '..');
const RELEASE_HOST = join(repoRoot, 'engine/target/release/idm-host');
const RELEASE_ENGINE = join(repoRoot, 'engine/target/release/idm');
const HOST_SRC = join(repoRoot, 'engine/src/bin/idm_host.rs');

const BUILD_HINT = 'build it first: (cd ' + join(repoRoot, 'engine') + ' && cargo build --release)';

// A run that compiled no Rust has no binary to judge; one that did must find it.
const DECISION = releaseHostMode({
  exists: existsSync(RELEASE_HOST),
  withRust: process.env.WITH_RUST === '1',
});
const SKIP = DECISION.mode === 'skip' ? DECISION.reason : false;

// Fail with a clear instruction when the release binary is absent, so a fresh
// checkout / CI does not silently pass or crash on a bare ENOENT.
function requireReleaseHost() {
  assert.ok(existsSync(RELEASE_HOST), 'release host binary missing: ' + RELEASE_HOST + '\n' + BUILD_HINT);
}

function frame(obj) {
  const body = Buffer.from(JSON.stringify(obj), 'utf8');
  const out = Buffer.allocUnsafe(4 + body.length);
  out.writeUInt32LE(body.length, 0);
  body.copy(out, 4);
  return out;
}

function runHost(args, input) {
  return spawnSync(RELEASE_HOST, args, { input, timeout: 30000 });
}

function tmp(tag) {
  return mkdtempSync(join(tmpdir(), 'idm_rel_' + tag + '_'));
}

test('release host binary exists', { skip: SKIP }, () => {
  requireReleaseHost();
});

test('release host binary is not stale', { skip: SKIP }, () => {
  requireReleaseHost();
  const bin = statSync(RELEASE_HOST).mtimeMs;
  const src = statSync(HOST_SRC).mtimeMs;
  assert.ok(
    bin >= src - 1000,
    'release binary is STALE: ' +
      RELEASE_HOST +
      ' (built ' +
      new Date(bin).toISOString() +
      ') is older than its source ' +
      HOST_SRC +
      ' (' +
      new Date(src).toISOString() +
      '). ' +
      BUILD_HINT,
  );
});

test('release host fails closed without --allowed-dir', { skip: SKIP }, () => {
  requireReleaseHost();
  const dir = tmp('noallow');
  const out = join(dir, 'must_not_exist.bin');
  const r = runHost(
    ['--engine', RELEASE_ENGINE],
    frame({ action: 'download', url: 'http://127.0.0.1:9/x', output: out, connections: 2 }),
  );
  assert.notEqual(
    r.status,
    0,
    'release host must fail closed (non-zero) without --allowed-dir, got ' + r.status,
  );
  assert.match(String(r.stderr || ''), /allowed-dir/, 'stderr must mention --allowed-dir, got: ' + r.stderr);
  assert.ok(!existsSync(out), 'nothing may be written without --allowed-dir');
});

test('release host answers ping when --allowed-dir is supplied', { skip: SKIP }, () => {
  requireReleaseHost();
  const dir = tmp('ok');
  const r = runHost(['--engine', RELEASE_ENGINE, '--allowed-dir', dir], frame({ action: 'ping' }));
  assert.equal(r.status, 0, 'stderr: ' + r.stderr);
  assert.ok(r.stdout && r.stdout.length >= 4, 'expected a framed reply');
  const len = r.stdout.readUInt32LE(0);
  const resp = JSON.parse(r.stdout.subarray(4, 4 + len).toString('utf8'));
  assert.equal(resp.ok, true);
  assert.equal(resp.msg, 'pong');
});