// YouTube hands out video and audio as separate streams. yt-dlp merges them
// with ffmpeg -- but only when asked for a pair.
//
// The window listed every stream as it came: a 1080p video with no sound, an
// audio-only row, and (on older videos) one combined 360p. Choosing "1080p"
// therefore gave a silent film, and there was no way to ask for the obvious
// thing -- "this resolution, with sound". That is what this file pins down:
// for every video-only stream there is a row that says "with audio", and it
// carries the <id>+bestaudio pair yt-dlp needs to merge.
//
// Runs with: node --test gui/test/merged_formats.test.mjs

import test from 'node:test';
import assert from 'node:assert/strict';
import { execFileSync } from 'node:child_process';
import { readFileSync } from 'node:fs';
import { fileURLToPath } from 'node:url';
import { dirname, join } from 'node:path';

const here = dirname(fileURLToPath(import.meta.url));
const repoRoot = join(here, '..', '..');
const guiPy = join(here, '..', 'idm_gui.py');

function labels() {
  const out = execFileSync('python3', [guiPy, '--selftest-format-labels'], {
    encoding: 'utf8',
  });
  const line = out.split('\n').find((l) => l.startsWith('LABELS:'));
  assert.ok(line, `no LABELS: line:\n${out}`);
  return JSON.parse(line.slice('LABELS:'.length));
}

test('a video-only stream is listed as a pair, never on its own', () => {
  // The fixture's 137 is video without sound. Listing it bare is what let a
  // user pick a silent film; the window offers `137+bestaudio` instead, and
  // there is no bare 137 row left to pick by accident.
  const rows = labels();
  const bare = rows.filter((r) => r.format === '137');
  assert.deepEqual(bare, [], `a bare video-only row must not be offered: ${JSON.stringify(rows)}`);
  const pair = rows.filter((r) => r.format === '137+bestaudio');
  assert.equal(pair.length, 1, `expected one 137+bestaudio row: ${JSON.stringify(rows)}`);
});

test('the "with audio" row asks yt-dlp to merge', () => {
  const rows = labels();
  const merged = rows.find((r) => r.format === '137+bestaudio');
  assert.ok(merged, `no 137+bestaudio row: ${JSON.stringify(rows)}`);
  assert.match(merged.label, /1920x1080/);
  assert.match(merged.label, /with audio|audio/i);
});

test('a stream that already has both tracks is not doubled', () => {
  const rows = labels();
  const combined = rows.filter((r) => r.format === '22+bestaudio');
  assert.deepEqual(combined, [], 'format 22 already carries sound');
  const row = rows.find((r) => r.format === '22');
  assert.match(row.label, /video \+ audio/);
});

test('audio-only rows get no synthetic twin', () => {
  const rows = labels();
  assert.deepEqual(
    rows.filter((r) => r.format === '140+bestaudio'),
    [],
    'audio only needs no merge',
  );
});

test('yt-dlp is only asked to merge when it must', () => {
  // The engine passes --merge-output-format only when the selector is a pair;
  // a single stream needs no ffmpeg at all.
  const rs = readFileSync(join(repoRoot, 'engine', 'src', 'media.rs'), 'utf8');
  assert.match(rs, /fn needs_merge/, 'media.rs must decide whether a merge is needed');
  assert.match(rs, /bestaudio/, 'a video-only pick must be widened to a pair');
});

test('the installers ship an ffmpeg helper', () => {
  // Merging needs ffmpeg, and nothing installed it: a clean machine got a
  // downloader that could fetch 1080p and audio and then fail to join them.
  const sh = readFileSync(join(repoRoot, 'install.sh'), 'utf8');
  assert.match(sh, /ensure-ffmpeg\.sh/, 'install.sh must ship ensure-ffmpeg.sh');
  const ps1 = readFileSync(join(repoRoot, 'install.ps1'), 'utf8');
  assert.match(ps1, /ensure-ffmpeg\.ps1/, 'install.ps1 must ship ensure-ffmpeg.ps1');
});
