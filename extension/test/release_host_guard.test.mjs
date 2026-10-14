// The deployed-binary guard has to behave differently depending on who is
// asking. CI (WITH_RUST=1) builds the release binary first, so a missing one is
// a real failure. A plain local `npm test` compiles no Rust at all, so there
// the binary is simply absent and the guard has nothing to say.

import test from 'node:test';
import assert from 'node:assert/strict';
import { releaseHostMode } from '../release_host_guard.mjs';

test('an existing binary is always checked', () => {
  assert.equal(releaseHostMode({ exists: true, withRust: false }).mode, 'run');
  assert.equal(releaseHostMode({ exists: true, withRust: true }).mode, 'run');
});

test('a missing binary fails the Rust-enabled run', () => {
  const d = releaseHostMode({ exists: false, withRust: true });
  assert.equal(d.mode, 'fail');
  assert.match(d.reason, /cargo build --release/);
});

test('a missing binary only skips the run that built no Rust', () => {
  const d = releaseHostMode({ exists: false, withRust: false });
  assert.equal(d.mode, 'skip');
  assert.match(d.reason, /WITH_RUST/);
});
