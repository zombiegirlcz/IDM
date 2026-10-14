// The Scheduler tab was pure decoration: the start/stop times and the retry
// count were plain widgets with no variable and no persistence, all four
// "when done" checkboxes were created without a `variable`, and "Apply" had no
// command at all. Nothing the user typed survived closing the dialog.
//
// Runs with: node --test gui/test/scheduler.test.mjs

import test from 'node:test';
import assert from 'node:assert/strict';
import { readFileSync, mkdtempSync } from 'node:fs';
import { execFileSync } from 'node:child_process';
import { fileURLToPath } from 'node:url';
import { dirname, join } from 'node:path';
import { tmpdir } from 'node:os';

const here = dirname(fileURLToPath(import.meta.url));
const guiDir = join(here, '..');
const guiPy = join(guiDir, 'idm_gui.py');

function py(snippet) {
  const code = `
import sys, json
sys.path.insert(0, ${JSON.stringify(guiDir)})
import idm_gui as g
${snippet}
`;
  const out = execFileSync('python3', ['-I', '-c', code], { encoding: 'utf8' });
  const line = out.split('\n').find((l) => l.startsWith('R:'));
  assert.ok(line, `no R: line in output:\n${out}`);
  return JSON.parse(line.slice(2));
}

test('a clock time is parsed, and nonsense is rejected', () => {
  const r = py(`
print("R:" + json.dumps({
  "full": g.parse_clock("23:00:00"),
  "short": g.parse_clock("7:30"),
  "hour": g.parse_clock("7"),
  "pad": g.parse_clock("07:05:09"),
  "bad_hour": g.parse_clock("25:00:00"),
  "bad_min": g.parse_clock("10:60"),
  "junk": g.parse_clock("tomorrow"),
  "empty": g.parse_clock(""),
}))
`);
  assert.deepEqual(r.full, [23, 0, 0]);
  assert.deepEqual(r.short, [7, 30, 0]);
  assert.deepEqual(r.hour, [7, 0, 0]);
  assert.deepEqual(r.pad, [7, 5, 9]);
  assert.equal(r.bad_hour, null, 'hour 25 is not a time');
  assert.equal(r.bad_min, null, 'minute 60 is not a time');
  assert.equal(r.junk, null);
  assert.equal(r.empty, null);
});

test('an unknown queue gets the documented defaults, not a crash', () => {
  const r = py(`print("R:" + json.dumps(g.queue_schedule({}, "Main download queue")))`);
  assert.equal(typeof r.start_at, 'string');
  assert.equal(typeof r.retries, 'number');
  assert.equal(r.shutdown_when_done, false);
});

test('a schedule round-trips per queue and queues stay independent', () => {
  const stateDir = mkdtempSync(join(tmpdir(), 'idm_sched_'));
  const out = execFileSync(
    'python3',
    [guiPy, '--selftest-scheduler', '--state-dir', stateDir],
    { encoding: 'utf8' },
  );
  assert.match(out, /SCHEDULER: OK/, `scheduler selftest failed:\n${out}`);

  const saved = JSON.parse(readFileSync(join(stateDir, 'settings.json'), 'utf8'));
  const main = saved.queues.find((q) => q.name === 'Main download queue');
  assert.ok(main, `queue not persisted: ${JSON.stringify(saved.queues)}`);
  assert.equal(main.start_at, '01:15:00');
  assert.equal(main.retries, 4);
  assert.equal(main.shutdown_when_done, true);
  assert.equal(main.open_when_done, '/dl/last.zip');

  // Editing one queue must not touch the other.
  const sync = saved.queues.find((q) => q.name === 'Synchronization queue');
  assert.ok(sync, 'the second queue must still be there');
  assert.equal(sync.retries, 9);
  assert.equal(sync.shutdown_when_done, false);
});

test('an invalid time is refused instead of being stored', () => {
  const r = py(`
s = g.set_queue_schedule({}, "Main download queue", {"start_at": "99:99:99"})
print("R:" + json.dumps(g.queue_schedule(s, "Main download queue")["start_at"]))
`);
  assert.notEqual(r, '99:99:99', 'an unparseable time must not be persisted');
});
