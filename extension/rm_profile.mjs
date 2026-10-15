// Removing a browser profile directory, without letting the cleanup fail the
// run it was cleaning up after.
//
// A browser does not stop writing when its process exits: helper processes
// flush caches and leveldb logs on their own schedule, so a straight rmSync
// races them and throws ENOTEMPTY mid-walk. `force: true` does not help --
// that covers a missing path, not a busy one. Step 6 of the matrix died
// exactly this way, on the smoke profile of the Chromium GATE: the decision
// had already been made, and the tidying turned it into a failed job.
//
// So: retry while the writer finishes, and if it never does, leave the
// directory in /tmp for the OS to reap rather than raise.

import { rmSync } from 'node:fs';

const ATTEMPTS = 5;
const DELAY_MS = 200;

function nap(ms) {
  // Synchronous, because every caller is in a `finally` of synchronous code.
  Atomics.wait(new Int32Array(new SharedArrayBuffer(4)), 0, 0, ms);
}

/**
 * Remove `dir` and everything under it. Never throws.
 * `rm` and `sleep` are injectable so the retry behaviour can be tested
 * without a real racing writer.
 */
export function removeProfile(dir, { rm = rmSync, sleep = nap } = {}) {
  for (let i = 0; i < ATTEMPTS; i += 1) {
    try {
      rm(dir, { recursive: true, force: true });
      return;
    } catch {
      if (i < ATTEMPTS - 1) sleep(DELAY_MS);
    }
  }
}
