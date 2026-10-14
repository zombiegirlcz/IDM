// Choosing a video format from the GUI.
//
// The engine has had --format / --list-formats all along and the browser
// extension used them, but the GUI never did: /api/add was called without
// `format`, so a YouTube-style URL always fetched whatever the backend
// considered best. These tests cover the three pieces -- Api.formats asking
// the engine, the Download File Info dialog offering the list, and the choice
// reaching /api/add.
//
// Runs with: node --test gui/test/format_choice.test.mjs

import test from 'node:test';
import assert from 'node:assert/strict';
import { execFileSync, spawnSync } from 'node:child_process';
import { fileURLToPath } from 'node:url';
import { dirname, join } from 'node:path';

const here = dirname(fileURLToPath(import.meta.url));
const guiDir = join(here, '..');
const guiPy = join(guiDir, 'idm_gui.py');

test('Api.formats asks /api/formats for a URL', () => {
  const out = execFileSync('python3', [guiPy, '--selftest-formats-body'], {
    encoding: 'utf8',
  });
  const line = out.split('\n').find((l) => l.startsWith('FORMATS:'));
  assert.ok(line, `no FORMATS: line in output:\n${out}`);
  const got = JSON.parse(line.slice('FORMATS:'.length));
  assert.equal(got.path, '/api/formats');
  assert.equal(got.body.url, 'https://example.com/watch?v=x');
  assert.equal(got.body.cookie, 'SID=1');
  // The parsed list is handed back to the caller, not the raw envelope.
  assert.deepEqual(got.returned.map((f) => f.format_id), ['137', '140']);
});

test('a format list becomes human-readable labels', () => {
  const out = execFileSync('python3', [guiPy, '--selftest-format-labels'], {
    encoding: 'utf8',
  });
  const line = out.split('\n').find((l) => l.startsWith('LABELS:'));
  assert.ok(line, `no LABELS: line:\n${out}`);
  const labels = JSON.parse(line.slice('LABELS:'.length));

  // The first entry must be the "let the backend decide" default, so the
  // dialog never forces a choice on a plain file URL.
  assert.match(labels[0].label, /best|auto/i);
  assert.equal(labels[0].format, '');

  const row = labels.find((l) => l.format === '137');
  assert.ok(row, `no row for format 137: ${JSON.stringify(labels)}`);
  assert.match(row.label, /1920x1080/, 'the resolution must be visible');
  assert.match(row.label, /mp4/, 'the container must be visible');
  assert.match(row.label, /video only/i, 'a video-only stream must say so');

  const audio = labels.find((l) => l.format === '140');
  assert.match(audio.label, /audio only/i);
});

test('the chosen format reaches /api/add', () => {
  const out = execFileSync('python3', [guiPy, '--selftest-add-format'], {
    encoding: 'utf8',
  });
  const line = out.split('\n').find((l) => l.startsWith('ADD:'));
  assert.ok(line, `no ADD: line:\n${out}`);
  const body = JSON.parse(line.slice('ADD:'.length));
  assert.equal(body.format, '137+140', `format missing from /api/add body: ${line}`);
  assert.equal(body.cookie, 'SID=1');
  assert.equal(body.referer, 'https://example.com/watch');
  assert.equal(body.force_media, true);
});

test('the Download File Info dialog carries a format combobox', () => {
  const res = spawnSync('xvfb-run', ['-a', 'python3', guiPy, '--selftest-file-info'], {
    encoding: 'utf8',
    maxBuffer: 8 * 1024 * 1024,
  });
  if (res.status !== 0) {
    throw new Error(`selftest failed (${res.status}):\n${res.stdout}\n${res.stderr}`);
  }
  const line = res.stdout.split('\n').find((l) => l.startsWith('FILE-INFO:'));
  assert.ok(line, `no FILE-INFO: line:\n${res.stdout}`);
  const got = JSON.parse(line.slice('FILE-INFO:'.length));

  // The format combo is the one offering the "best available" default.
  assert.ok(
    got.format_values.length >= 3,
    `the format combo must offer the default plus each format: ${JSON.stringify(got)}`,
  );
  assert.match(got.format_values[0], /best|auto/i);
  assert.ok(
    got.format_values.some((v) => v.startsWith('137')),
    `no 1080p row: ${JSON.stringify(got.format_values)}`,
  );
  // Picking a row must hand the caller the selector, not the label.
  assert.equal(got.selected_format, '137');
});
