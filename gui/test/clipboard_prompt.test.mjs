// The prompt IDM shows when a copied URL lands on the clipboard.
//
// It used to be a bare yes/no messagebox: the only choice was "download now
// with whatever the backend picks". It now offers Download, Add to queue and
// Choose format, with the format defaulting to the best one.
//
// Runs with: node --test gui/test/clipboard_prompt.test.mjs

import test from 'node:test';
import assert from 'node:assert/strict';
import { execFileSync, spawnSync } from 'node:child_process';
import { fileURLToPath } from 'node:url';
import { dirname, join } from 'node:path';

const here = dirname(fileURLToPath(import.meta.url));
const guiPy = join(here, '..', 'idm_gui.py');

function marker(out, prefix) {
  const line = out.split('\n').find((l) => l.startsWith(prefix));
  assert.ok(line, `no ${prefix} line in output:\n${out}`);
  return JSON.parse(line.slice(prefix.length));
}

function underX(flag) {
  const res = spawnSync('xvfb-run', ['-a', 'python3', guiPy, flag], {
    encoding: 'utf8',
    maxBuffer: 8 * 1024 * 1024,
  });
  if (res.status !== 0) {
    throw new Error(`selftest failed (${res.status}):\n${res.stdout}\n${res.stderr}`);
  }
  return res.stdout;
}

test('add_plan: start runs now, queue parks it in the main queue paused', () => {
  const out = execFileSync('python3', [guiPy, '--selftest-add-plan'], { encoding: 'utf8' });
  const got = marker(out, 'ADD-PLAN:');
  assert.deepEqual(got.start, { queue: '', pause: false });
  assert.equal(got.queue.pause, true, 'a queued download must not start by itself');
  assert.ok(got.queue.queue, 'a queued download must name a queue');
  assert.equal(got.queue.queue, got.first_queue);
});

test('the clipboard prompt offers download, queue and format, best by default', () => {
  const got = marker(underX('--selftest-clipboard-prompt'), 'CLIP-PROMPT:');
  for (const label of ['Stáhnout', 'Přidat do fronty', 'Vybrat formát', 'Zrušit']) {
    assert.ok(got.buttons.includes(label), `no "${label}" button: ${got.buttons}`);
  }
  assert.ok(got.url_shown, 'the prompt must show the copied URL');
  assert.match(got.default_label, /best/i);
  assert.equal(got.default_format, '', 'the default must leave the choice to the backend');
  // Formats are listed only when asked for: yt-dlp takes seconds.
  assert.deepEqual(got.loader_calls_before, []);
  assert.deepEqual(got.loader_calls_after, ['https://example.com/watch?v=x']);
  assert.ok(got.values_after.some((v) => /1920x1080/.test(v)),
    `the listed formats must appear: ${got.values_after}`);
  assert.equal(got.default_after, '', 'listing formats must not change the choice');
  assert.equal(got.picked_format, '137');
});

test('the prompt buttons reach the API: download now / add to queue with a format', () => {
  const got = marker(underX('--selftest-clipboard-actions'), 'CLIP-ACTIONS:');
  assert.equal(got.start.url, 'https://example.com/a.bin');
  assert.equal(got.start.format, '');
  assert.equal(got.start.queue, '');
  assert.equal(got.start.paused, false);

  assert.equal(got.queued.url, 'https://example.com/watch?v=x');
  assert.equal(got.queued.format, '137');
  assert.ok(got.queued.queue, 'add to queue must name a queue');
  assert.equal(got.queued.paused, true, 'add to queue must not start the download');

  assert.equal(got.cancelled_adds, 0, 'cancel must add nothing');
});
