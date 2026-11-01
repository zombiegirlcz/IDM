// Formats must say whether they carry sound.
//
// The engine classifies every yt-dlp stream (video+audio / video / audio) in
// media::kind_of, but the dialog dropped "video+audio" as redundant, so a
// 1080p row and a 1080p row *with sound* read exactly the same. Picking the
// silent one produced a video nobody could hear -- which is the report this
// test pins down.
//
// Runs with: node --test gui/test/stream_kind.test.mjs

import test from 'node:test';
import assert from 'node:assert/strict';
import { execFileSync } from 'node:child_process';
import { readFileSync } from 'node:fs';
import { fileURLToPath } from 'node:url';
import { dirname, join } from 'node:path';

const here = dirname(fileURLToPath(import.meta.url));
const guiPy = join(here, '..', 'idm_gui.py');

function labels() {
  const out = execFileSync('python3', [guiPy, '--selftest-format-labels'], {
    encoding: 'utf8',
  });
  const line = out.split('\n').find((l) => l.startsWith('LABELS:'));
  assert.ok(line, `no LABELS: line:\n${out}`);
  return JSON.parse(line.slice('LABELS:'.length));
}

test('a stream with both tracks says so', () => {
  const row = labels().find((x) => x.format === '22');
  assert.ok(row, `no row for format 22: ${JSON.stringify(labels())}`);
  assert.match(row.label, /video\s*\+\s*audio/i);
});

test('a video stream is offered with sound, not as a silent trap', () => {
  // YouTube has no 1080p stream that carries audio: video and sound arrive
  // separately and yt-dlp joins them. Offering the video stream alone is what
  // produced silent films, so the row is the *pair* and says so.
  const row = labels().find((x) => x.format === '137+bestaudio');
  assert.ok(row, `no 137+bestaudio row: ${JSON.stringify(labels())}`);
  assert.match(row.label, /video \+ audio/i);
});

test('an audio-only stream says it once, not twice', () => {
  const row = labels().find((x) => x.format === '140');
  assert.ok(row, 'no row for format 140');
  assert.match(row.label, /audio only/i);
  const hits = row.label.toLowerCase().match(/audio only/g) || [];
  assert.equal(hits.length, 1, `"audio only" repeated: ${row.label}`);
});

test('every row names what it carries', () => {
  for (const row of labels().slice(1)) {
    assert.match(
      row.label,
      /video|audio/i,
      `row ${row.format} does not say whether it has sound: ${row.label}`,
    );
  }
});

test('a row that must be merged says so', () => {
  // The download is not "1920x1080" -- it is 1920x1080 plus an audio track
  // joined by ffmpeg. Saying "merged" is the difference between a promise and
  // a surprise.
  const rows = labels().filter((r) => /\+/.test(r.format));
  assert.ok(rows.length >= 1, 'no merged row at all');
  for (const r of rows) {
    assert.match(r.label, /merged/i, `row ${r.format} hides the merge: ${r.label}`);
  }
});

test('the extension popup uses the same wording', () => {
  // The popup builds its own label() in JS; the two must not drift apart, or
  // the same format reads differently in the browser and in the window.
  const js = readFileSync(join(here, '..', '..', 'extension', 'popup.js'), 'utf8');
  for (const want of ['video + audio', 'video only', 'audio only']) {
    assert.ok(
      js.includes(want),
      `extension/popup.js does not label streams with "${want}"`,
    );
  }
});