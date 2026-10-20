// How the main window shows a download's progress.
//
// The user: "v samotném okně IDM GUI udělat ještě víc přehledně ten progress".
// The list said "running" and a byte count, and the only bar was one strip at
// the bottom that followed whichever running row was drawn last. So:
//   * a Progress column with a bar drawn in text, one per row;
//   * the Status cell says how far along it is (IDM shows "62.4 %"), and
//     words a person uses instead of the queue's internal states;
//   * rows are coloured by state, so an error is visible without reading;
//   * the bottom bar is the total over everything running, with a summary
//     (how many, how far, how fast, how long) next to it;
//   * the File Name is the file being written, not the last URL segment --
//     every YouTube video used to be called "watch".
//
// Runs with: node --test gui/test/progress_view.test.mjs

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

function row(it) {
  return py(`
it = json.loads(${JSON.stringify(JSON.stringify(it))})
print("R:" + json.dumps(dict(zip([c[0] for c in g.COLUMNS], g.row_values(it, {})))))
`);
}

test('the list has a Progress column right after Status', () => {
  const cols = py('print("R:" + json.dumps([c[0] for c in g.COLUMNS]))');
  assert.ok(cols.includes('progress'), `no progress column: ${JSON.stringify(cols)}`);
  assert.equal(cols.indexOf('progress'), cols.indexOf('status') + 1);
});

test('the progress bar is drawn in text and fills with the fraction', () => {
  const r = py(`print("R:" + json.dumps([g.progress_bar_text(0, 10),
      g.progress_bar_text(0.5, 10), g.progress_bar_text(1, 10),
      g.progress_bar_text(1.7, 10), g.progress_bar_text(-1, 10)]))`);
  for (const bar of r) assert.equal([...bar].length, 10, `fixed width: "${bar}"`);
  assert.equal(r[0], '░'.repeat(10));
  assert.equal(r[1], '█'.repeat(5) + '░'.repeat(5));
  assert.equal(r[2], '█'.repeat(10));
  assert.equal(r[3], r[2], 'over 100 % is clamped');
  assert.equal(r[4], r[0], 'below 0 is clamped');
});

test('a running row shows a bar and a percentage, Status says how far', () => {
  const r = row({ url: 'https://e.com/a.bin', downloaded: 624, total: 1000, status: 'running' });
  assert.match(r.progress, /^█{6}░{4}\s+62 %$/, `progress cell: "${r.progress}"`);
  assert.equal(r.status, '62.4 %');
});

test('a running row of unknown size says how much, without a made-up bar', () => {
  const r = row({ url: 'https://e.com/live', downloaded: 3 * 1024 * 1024, total: 0, status: 'running' });
  assert.doesNotMatch(r.progress, /█/);
  assert.match(r.progress, /3\.0 MB/);
  assert.equal(r.status, 'Downloading');
});

test('Status uses words a person uses', () => {
  const s = (status) => row({ url: 'https://e.com/a', downloaded: 10, total: 100, status }).status;
  assert.equal(s('pending'), 'Queued');
  assert.equal(s('paused'), 'Paused');
  assert.equal(s('done'), 'Complete');
  assert.equal(s('error'), 'Error');
});

test('a finished row has a full bar', () => {
  const r = row({ url: 'https://e.com/a', downloaded: 10, total: 10, status: 'done' });
  assert.match(r.progress, /^█{10}\s+100 %$/);
});

test('the file name is the file being written, not the URL tail', () => {
  const r = row({ url: 'https://www.youtube.com/watch?v=abc', output: '/home/u/Downloads/Song title.webm',
    downloaded: 0, total: 0, status: 'pending' });
  assert.equal(r.name, 'Song title.webm');
  const w = row({ url: 'https://e.com/file.zip', downloaded: 0, total: 0, status: 'pending' });
  assert.equal(w.name, 'file.zip', 'no output yet: the URL is all there is');
  const win = row({ url: 'https://e.com/x', output: 'C:\\Users\\u\\Downloads\\x.iso',
    downloaded: 0, total: 0, status: 'pending' });
  assert.equal(win.name, 'x.iso', 'a Windows path splits on backslashes too');
});

test('every state gets its own row tag, and unknown states none', () => {
  const r = py(`print("R:" + json.dumps([g.status_tag(s) for s in
      ["running", "pending", "paused", "done", "error", "weird"]]))`);
  assert.deepEqual(r, ['st_running', 'st_pending', 'st_paused', 'st_done', 'st_error', '']);
});

test('the summary totals everything running, not the last row drawn', () => {
  const r = py(`print("R:" + json.dumps(g.queue_summary([
      {"status": "running", "downloaded": 100, "total": 400, "speed_bps": 1048576, "time_left_s": 30},
      {"status": "running", "downloaded": 300, "total": 400, "speed_bps": 2097152, "time_left_s": 90},
      {"status": "done", "downloaded": 999, "total": 999},
      {"status": "pending", "downloaded": 0, "total": 0}])))`);
  assert.equal(r.percent, 50);
  assert.match(r.text, /2 downloading/);
  assert.match(r.text, /50 %/);
  assert.match(r.text, /3(\.0)? MB\/s/);
  assert.match(r.text, /1m 30s left/, 'the queue is done when the slowest one is');
  assert.match(r.text, /1 queued/);
});

test('nothing running: an empty bar and no summary', () => {
  const r = py(`print("R:" + json.dumps(g.queue_summary([
      {"status": "done", "downloaded": 9, "total": 9}])))`);
  assert.deepEqual(r, { percent: 0, text: '' });
});

test('state colours are readable on both row shades in both themes', () => {
  function lum(hex) {
    const v = hex.replace('#', '');
    const ch = [0, 2, 4].map((i) => parseInt(v.slice(i, i + 2), 16) / 255)
      .map((c) => (c <= 0.03928 ? c / 12.92 : ((c + 0.055) / 1.055) ** 2.4));
    return 0.2126 * ch[0] + 0.7152 * ch[1] + 0.0722 * ch[2];
  }
  const contrast = (a, b) => {
    const [x, y] = [lum(a), lum(b)].sort((p, q) => q - p);
    return (x + 0.05) / (y + 0.05);
  };
  for (const name of ['light', 'dark']) {
    const p = py(`print("R:" + json.dumps(g.theme_palette(${JSON.stringify(name)})))`);
    for (const key of ['ok', 'err']) {
      assert.match(p[key] || '', /^#[0-9a-fA-F]{6}$/, `${name}.${key}`);
      for (const bg of ['row_odd', 'row_even']) {
        const c = contrast(p[key], p[bg]);
        assert.ok(c >= 4.5, `${name}: ${key} on ${bg} is ${c.toFixed(2)}:1`);
      }
    }
  }
});

test('the window wires the summary and the state tags', () => {
  const src = execFileSync('cat', [guiPy], { encoding: 'utf8' });
  assert.match(src, /queue_summary\(view\["items"\]\)/, 'apply_items must feed the summary from all items');
  assert.match(src, /status_tag\(st\)/, 'rows must be tagged by state');
  assert.doesNotMatch(src, /if st == "running":\s*\n\s*progress\["value"\]/,
    'the bottom bar must not follow the last running row');
});
