// The download list's columns.
//
// The user asked for the URL, the category, an ETA and a speed in MB/s. Two of
// those were already there as HEADINGS -- "Speed" and "Time Left" -- and both
// were always blank, because /api/items never sent a rate. Now that it does,
// the cells have to format it, and the two new columns have to exist at all.
//
// Runs with: node --test gui/test/list_columns.test.mjs

import test from 'node:test';
import assert from 'node:assert/strict';
import { execFileSync } from 'node:child_process';
import { fileURLToPath } from 'node:url';
import { dirname, join } from 'node:path';

const here = dirname(fileURLToPath(import.meta.url));
const guiPy = join(here, '..', 'idm_gui.py');

function py(snippet) {
  const code = `
import sys, json
sys.path.insert(0, ${JSON.stringify(dirname(guiPy))})
import idm_gui as g
${snippet}
`;
  const out = execFileSync('python3', ['-I', '-c', code], { encoding: 'utf8' });
  const line = out.split('\n').find((l) => l.startsWith('R:'));
  assert.ok(line, `no R: line in output:\n${out}`);
  return JSON.parse(line.slice(2));
}

test('the list has a URL, a category, an ETA and a speed column', () => {
  const cols = py('print("R:" + json.dumps([c[0] for c in g.COLUMNS]))');
  for (const key of ['name', 'url', 'category', 'size', 'status', 'speed', 'eta']) {
    assert.ok(cols.includes(key), `no ${key} column in ${JSON.stringify(cols)}`);
  }
});

test('the speed heading says MB/s and the time one says ETA', () => {
  const heads = py('print("R:" + json.dumps({c[0]: c[1] for c in g.COLUMNS}))');
  assert.match(heads.speed, /MB\/s/, `speed heading: ${heads.speed}`);
  assert.match(heads.eta, /ETA/i, `eta heading: ${heads.eta}`);
});

test('a speed is formatted as MB/s, with smaller units where they help', () => {
  const r = py(`print("R:" + json.dumps([
      g.fmt_speed(0), g.fmt_speed(900), g.fmt_speed(64*1024),
      g.fmt_speed(3*1024*1024), g.fmt_speed(1536*1024)]))`);
  assert.equal(r[0], '', 'a standing start shows nothing, not "0 MB/s"');
  assert.match(r[1], /B\/s/);
  assert.match(r[2], /KB\/s/);
  assert.match(r[3], /^3(\.0)? MB\/s$/);
  assert.match(r[4], /^1\.5 MB\/s$/);
});

test('an ETA is formatted as time, and an unknown one is blank', () => {
  const r = py(`print("R:" + json.dumps([
      g.fmt_eta(0), g.fmt_eta(45), g.fmt_eta(135), g.fmt_eta(3725)]))`);
  assert.equal(r[0], '', 'no ETA is an empty cell, never "0s"');
  assert.equal(r[1], '45s');
  assert.equal(r[2], '2m 15s');
  assert.equal(r[3], '1h 2m');
});

test('a row carries one value per column, with the url and category filled', () => {
  const r = py(`
settings = {"categories": [{"name": "Video", "extensions": ["mp4"]}]}
it = {"url": "https://example.com/clip.mp4", "downloaded": 500, "total": 1000,
      "status": "running", "speed_bps": 2*1024*1024, "time_left_s": 90,
      "description": "note"}
vals = g.row_values(it, settings)
print("R:" + json.dumps({"n": len(vals), "cols": len(g.COLUMNS),
                         "row": dict(zip([c[0] for c in g.COLUMNS], vals))}))
`);
  assert.equal(r.n, r.cols, 'one value per column');
  assert.equal(r.row.name, 'clip.mp4');
  assert.equal(r.row.url, 'https://example.com/clip.mp4');
  assert.equal(r.row.category, 'Video');
  assert.match(r.row.speed, /2(\.0)? MB\/s/);
  assert.equal(r.row.eta, '1m 30s');
});

test('a finished row shows no speed and no ETA', () => {
  const r = py(`
it = {"url": "https://example.com/a.bin", "downloaded": 10, "total": 10,
      "status": "done", "speed_bps": 0, "time_left_s": 0}
vals = dict(zip([c[0] for c in g.COLUMNS], g.row_values(it, {})))
print("R:" + json.dumps(vals))
`);
  assert.equal(r.speed, '');
  assert.equal(r.eta, '');
});

test('row_values still works without settings, for callers that have none', () => {
  const r = py(`
it = {"url": "https://example.com/a.bin", "downloaded": 1, "total": 2, "status": "running"}
print("R:" + json.dumps(len(g.row_values(it))))
`);
  assert.equal(r, py('print("R:" + json.dumps(len(g.COLUMNS)))'));
});

test('speed and eta sort as numbers, not as text', () => {
  // "1.5 MB/s" vs "900 KB/s" sorts wrongly as text; the keys must read the
  // raw figures the engine now sends.
  const r = py(`
fast = {"speed_bps": 1536*1024, "time_left_s": 10}
slow = {"speed_bps": 900*1024, "time_left_s": 400}
print("R:" + json.dumps({
    "speed": g._SORT_KEYS["speed"](fast) > g._SORT_KEYS["speed"](slow),
    "eta": g._SORT_KEYS["eta"](fast) < g._SORT_KEYS["eta"](slow)}))
`);
  assert.ok(r.speed, 'a faster row must sort above a slower one');
  assert.ok(r.eta, 'a shorter ETA must sort above a longer one');
});
