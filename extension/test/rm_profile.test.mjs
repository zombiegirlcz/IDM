// A browser profile directory is not finished being written when the browser
// exits: helper processes flush caches on their own schedule, so a plain
// rmSync races them and throws ENOTEMPTY. That is what crashed step 6 of the
// matrix -- not the test it was gating, but the CLEANUP after the smoke run,
// which turned a decision ("this Chromium works") into a failed job.
//
// Tidying up must never be able to fail the thing it tidies up after.

import test from 'node:test';
import assert from 'node:assert/strict';
import { mkdtempSync, existsSync, writeFileSync, mkdirSync } from 'node:fs';
import { join } from 'node:path';
import { tmpdir } from 'node:os';
import { removeProfile } from '../rm_profile.mjs';

function enotempty() {
  const e = new Error("ENOTEMPTY: directory not empty, rmdir '/x'");
  e.code = 'ENOTEMPTY';
  return e;
}

test('retries a directory that is still being written', () => {
  let calls = 0;
  const rm = () => {
    calls += 1;
    if (calls < 3) throw enotempty();
  };
  removeProfile('/x', { rm, sleep: () => {} });
  assert.equal(calls, 3, 'must keep trying while the writer finishes');
});

test('gives up quietly rather than failing the caller', () => {
  let calls = 0;
  const rm = () => { calls += 1; throw enotempty(); };
  assert.doesNotThrow(() => removeProfile('/x', { rm, sleep: () => {} }));
  assert.ok(calls > 1, 'it must have tried more than once');
  assert.ok(calls <= 10, `bounded retries, got ${calls}`);
});

test('really removes a real directory', () => {
  const dir = mkdtempSync(join(tmpdir(), 'idm-rmprofile-'));
  mkdirSync(join(dir, 'Default'), { recursive: true });
  writeFileSync(join(dir, 'Default', 'Cookies'), 'x');
  removeProfile(dir);
  assert.ok(!existsSync(dir), 'the directory must be gone');
});

test('a missing directory is not an error', () => {
  assert.doesNotThrow(() => removeProfile(join(tmpdir(), 'idm-rmprofile-absent')));
});
