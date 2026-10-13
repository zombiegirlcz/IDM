// Tests for the live per-connection segment graph in the Download Progress
// dialog.
//
// IDM fills one bar per connection in real time. Our engine writes a `.idmmeta`
// sidecar every second with per-segment `downloaded` counters, so the GUI can
// read it and fill the bars live. This test drives that path without a network:
// it writes a meta file, asks the dialog to update from it, and checks the bar
// geometry actually moved.
//
// Runs with: node --test gui/test/live_graph.test.mjs

import test from 'node:test';
import assert from 'node:assert/strict';
import { writeFileSync, mkdtempSync, existsSync } from 'node:fs';
import { spawnSync } from 'node:child_process';
import { fileURLToPath } from 'node:url';
import { dirname, join } from 'node:path';
import { tmpdir } from 'node:os';

const here = dirname(fileURLToPath(import.meta.url));
const guiDir = join(here, '..');
const repoRoot = join(guiDir, '..');
const guiPy = join(guiDir, 'idm_gui.py');

function findEngine() {
  const c = [process.env.IDM_ENGINE_BIN, join(repoRoot, 'engine/target/debug/idm')];
  for (const x of c) if (x && existsSync(x)) return x;
  throw new Error('idm engine not found');
}

/// Ask the GUI to render a progress dialog from a real .idmmeta and report the
/// bar fill fractions after one update.
function renderFromMeta(metaJson) {
  const dir = mkdtempSync(join(tmpdir(), 'idm_live_'));
  const out = join(dir, 'movie.mp4');
  const meta = out + '.idmmeta';
  writeFileSync(meta, JSON.stringify(metaJson));

  const res = spawnSync(
    'xvfb-run',
    ['-a', 'python3', guiPy, '--selftest-live-graph', '--engine', findEngine(), '--meta', meta],
    { encoding: 'utf8', env: { ...process.env }, maxBuffer: 8 * 1024 * 1024 },
  );
  if (res.status !== 0) {
    throw new Error(`live-graph selftest failed (${res.status}):\n${res.stdout}\n${res.stderr}`);
  }
  const line = res.stdout.split('\n').find((l) => l.startsWith('LIVE:'));
  assert.ok(line, `no LIVE: output:\n${res.stdout}`);
  return JSON.parse(line.slice('LIVE:'.length));
}

test('progress graph fills each bar from the per-segment meta', () => {
  const d = renderFromMeta({
    url: 'http://x/movie.mp4',
    total: 1000,
    connections: 4,
    segments: [
      { start: 0, end: 249, done: true, downloaded: 250 },
      { start: 250, end: 499, done: false, downloaded: 125 },
      { start: 500, end: 749, done: false, downloaded: 0 },
      { start: 750, end: 999, done: false, downloaded: 250 },
    ],
  });

  assert.equal(d.bars.length, 4, 'one bar per connection');
  // Fractions: 250/250=1.0, 125/250=0.5, 0/250=0.0, 250/250=1.0
  assert.ok(Math.abs(d.bars[0] - 1.0) < 0.05, `bar 0 = ${d.bars[0]}`);
  assert.ok(Math.abs(d.bars[1] - 0.5) < 0.05, `bar 1 = ${d.bars[1]}`);
  assert.ok(Math.abs(d.bars[2] - 0.0) < 0.05, `bar 2 = ${d.bars[2]}`);
  assert.ok(Math.abs(d.bars[3] - 1.0) < 0.05, `bar 3 = ${d.bars[3]}`);
  assert.ok(Math.abs(d.overall - 0.625) < 0.05, `overall = ${d.overall}`);
});

test('a missing meta file leaves the bars empty (no crash)', () => {
  const d = renderFromMeta({ total: 0, segments: [] });
  assert.equal(d.bars.length, 0, 'no segments -> no bars');
});
