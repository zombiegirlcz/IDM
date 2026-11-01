// "Download again, with a different format."
//
// Picking the wrong stream used to be final: Delete and start over, pasting
// the URL by hand. The entry that fixes it must
//   * copy the URL and the target folder of the row it was used on,
//   * ask for the formats of that URL, and
//   * queue a *new* download -- the old row and its file are left alone.
//
// Runs with: node --test gui/test/redownload.test.mjs

import test from 'node:test';
import assert from 'node:assert/strict';
import { spawnSync } from 'node:child_process';
import { fileURLToPath } from 'node:url';
import { dirname, join } from 'node:path';

const here = dirname(fileURLToPath(import.meta.url));
const guiPy = join(here, '..', 'idm_gui.py');

function selftest(flag) {
  const res = spawnSync('xvfb-run', ['-a', 'python3', guiPy, flag], {
    encoding: 'utf8',
    maxBuffer: 8 * 1024 * 1024,
  });
  if (res.status !== 0) {
    throw new Error(`${flag} failed (${res.status}):\n${res.stdout}\n${res.stderr}`);
  }
  return JSON.parse(res.stdout.trim().split('\n').at(-1));
}

test('re-downloading keeps the URL and the folder of the old row', () => {
  const got = selftest('--selftest-redownload');
  assert.equal(got.url, 'https://example.com/watch?v=x');
  assert.equal(got.out_dir, '/tmp/videa');
});

test('the new download carries the format that was picked', () => {
  const got = selftest('--selftest-redownload');
  // Format 22 carries both tracks, so the selector is used as picked.
  assert.equal(got.options.format, '22');
  assert.equal(got.options.cookie, 'SID=1', 'a logged-in item must keep its cookie');
});

test('the original row is not removed or touched', () => {
  const got = selftest('--selftest-redownload');
  assert.deepEqual(got.removed, [], 're-downloading must not delete the old row');
  assert.deepEqual(got.paused, [], 'it must not pause anything');
  assert.equal(got.adds, 1, 'exactly one new download is queued');
});

test('picking a silent video stream still yields sound', () => {
  // The engine lists video and audio separately. Picking only the video is
  // what produced a film nobody could hear, so the selector is widened.
  const got = selftest('--selftest-redownload-silent');
  assert.equal(got.format, '137+bestaudio');
});

test('the offer lists formats of the old URL', () => {
  const got = selftest('--selftest-redownload');
  assert.deepEqual(got.asked_for, ['https://example.com/watch?v=x'],
                   'the dialog must ask the engine for that URL');
});