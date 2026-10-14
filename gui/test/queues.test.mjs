// Queues did not exist as an entity: _queue_all() just resumed or paused
// everything, the queue list in the Scheduler was two hard-coded strings, and
// the engine's Item had no field saying which queue a download belonged to.
// The Schedule tab therefore had nothing to schedule.
//
// The decision here: the schedule lives in the GUI (settings.json) and a tick
// starts/stops queues through the existing API. The engine only has to say
// which queue an item is in. That keeps the time logic testable.
//
// Runs with: node --test gui/test/queues.test.mjs

import test from 'node:test';
import assert from 'node:assert/strict';
import { execFileSync } from 'node:child_process';
import { fileURLToPath } from 'node:url';
import { dirname, join } from 'node:path';

const here = dirname(fileURLToPath(import.meta.url));
const guiDir = join(here, '..');

function py(snippet) {
  const code = `
import sys, json
sys.path.insert(0, ${JSON.stringify(guiDir)})
import idm_gui as g
${snippet}
`;
  const out = execFileSync('python3', ['-I', '-c', code], { encoding: 'utf8' });
  const line = out.split('\n').find((l) => l.startsWith('R:'));
  assert.ok(line, `no R: line:\n${out}`);
  return JSON.parse(line.slice(2));
}

test('a daytime window runs between its start and stop', () => {
  const r = py(`
sched = {"start_at": "09:00:00", "stop_at": "17:00:00"}
print("R:" + json.dumps({
  "before": g.queue_should_run(sched, (8, 59, 0)),
  "start": g.queue_should_run(sched, (9, 0, 0)),
  "midday": g.queue_should_run(sched, (13, 0, 0)),
  "stop": g.queue_should_run(sched, (17, 0, 0)),
  "after": g.queue_should_run(sched, (17, 0, 1)),
}))
`);
  assert.equal(r.before, false);
  assert.equal(r.start, true, 'the window is inclusive at its start');
  assert.equal(r.midday, true);
  assert.equal(r.stop, false, 'at the stop time the queue is already stopped');
  assert.equal(r.after, false);
});

test('a window crossing midnight runs on both sides of it', () => {
  // IDM's own default is overnight: 23:00 to 07:30. Treating this as
  // start <= now < stop would never run.
  const r = py(`
sched = {"start_at": "23:00:00", "stop_at": "07:30:00"}
print("R:" + json.dumps({
  "evening": g.queue_should_run(sched, (23, 30, 0)),
  "midnight": g.queue_should_run(sched, (0, 0, 0)),
  "early": g.queue_should_run(sched, (7, 29, 59)),
  "stop": g.queue_should_run(sched, (7, 30, 0)),
  "noon": g.queue_should_run(sched, (12, 0, 0)),
  "just_before": g.queue_should_run(sched, (22, 59, 59)),
}))
`);
  assert.equal(r.evening, true);
  assert.equal(r.midnight, true, 'the window must survive midnight');
  assert.equal(r.early, true);
  assert.equal(r.stop, false);
  assert.equal(r.noon, false);
  assert.equal(r.just_before, false);
});

test('equal start and stop means the queue never runs on a schedule', () => {
  const r = py(`
sched = {"start_at": "10:00:00", "stop_at": "10:00:00"}
print("R:" + json.dumps([g.queue_should_run(sched, (10, 0, 0)),
                         g.queue_should_run(sched, (3, 0, 0))]))
`);
  assert.deepEqual(r, [false, false]);
});

test('an unparseable schedule never claims it should run', () => {
  const r = py(`
print("R:" + json.dumps([
  g.queue_should_run({"start_at": "nonsense", "stop_at": "07:30:00"}, (1, 0, 0)),
  g.queue_should_run({}, (1, 0, 0)),
]))
`);
  assert.deepEqual(r, [false, false]);
});

test('items are grouped by the queue they belong to', () => {
  const r = py(`
items = [
  {"id": 1, "queue": "Main download queue", "status": "pending"},
  {"id": 2, "queue": "", "status": "pending"},
  {"id": 3, "queue": "Synchronization queue", "status": "running"},
  {"id": 4, "queue": "Main download queue", "status": "done"},
]
print("R:" + json.dumps({
  "main": [i["id"] for i in g.items_in_queue(items, "Main download queue")],
  "sync": [i["id"] for i in g.items_in_queue(items, "Synchronization queue")],
  "default": [i["id"] for i in g.items_in_queue(items, "")],
}))
`);
  assert.deepEqual(r.main, [1, 4]);
  assert.deepEqual(r.sync, [3]);
  // An item with no queue belongs to the main one, as in IDM.
  assert.deepEqual(r.default, [2]);
});

test('starting a queue resumes only what is not finished or already running', () => {
  const r = py(`
items = [
  {"id": 1, "queue": "Q", "status": "paused"},
  {"id": 2, "queue": "Q", "status": "done"},
  {"id": 3, "queue": "Q", "status": "running"},
  {"id": 4, "queue": "Q", "status": "error"},
  {"id": 5, "queue": "Other", "status": "paused"},
]
print("R:" + json.dumps({
  "resume": g.queue_actions(items, "Q", True),
  "pause": g.queue_actions(items, "Q", False),
}))
`);
  // Resuming must skip done and already-running items, and never touch another queue.
  assert.deepEqual(r.resume, { resume: [1, 4], pause: [] });
  // Stopping only touches what is actually in flight.
  assert.deepEqual(r.pause, { resume: [], pause: [3] });
});

test('the schedule tick acts once per transition, not every tick', () => {
  // Without this the tick would re-resume the whole queue every few seconds,
  // which is the same defect the completion detection had.
  const r = py(`
settings = {"queues": [{"name": "Night", "start_at": "23:00:00", "stop_at": "07:30:00"}]}
state = {}
ticks = [
  g.schedule_transitions(settings, state, (22, 0, 0)),   # outside
  g.schedule_transitions(settings, state, (23, 5, 0)),   # window opens
  g.schedule_transitions(settings, state, (23, 6, 0)),   # still open
  g.schedule_transitions(settings, state, (2, 0, 0)),    # past midnight
  g.schedule_transitions(settings, state, (8, 0, 0)),    # window closes
  g.schedule_transitions(settings, state, (9, 0, 0)),    # still closed
]
print("R:" + json.dumps(ticks))
`);
  assert.deepEqual(r[0], [], 'the first tick outside the window does nothing');
  assert.deepEqual(r[1], [['Night', true]], 'opening the window starts the queue');
  assert.deepEqual(r[2], [], 'an already-running queue is left alone');
  assert.deepEqual(r[3], [], 'crossing midnight is not a transition');
  assert.deepEqual(r[4], [['Night', false]], 'closing the window stops it');
  assert.deepEqual(r[5], []);
});

test('a queue with no usable schedule is never touched by the tick', () => {
  const r = py(`
settings = {"queues": [{"name": "Manual", "start_at": "", "stop_at": ""}]}
state = {}
print("R:" + json.dumps([
  g.schedule_transitions(settings, state, (1, 0, 0)),
  g.schedule_transitions(settings, state, (13, 0, 0)),
]))
`);
  assert.deepEqual(r, [[], []], 'an unscheduled queue stays under manual control');
});

test('the retry budget comes from the queue schedule and reaches the engine', () => {
  const r = py(`
s = g._deep_merge(g.DEFAULT_SETTINGS, {
    "queues": [{"name": g.DEFAULT_QUEUE_NAMES[0], "retries": 3}],
})
none = g._deep_merge(g.DEFAULT_SETTINGS, {
    "queues": [{"name": g.DEFAULT_QUEUE_NAMES[0], "retries": 0}],
})
print("R:" + json.dumps({
  "three": g.download_options(s, "http://h/a.zip")["retries"],
  "zero": g.download_options(none, "http://h/a.zip")["retries"],
  "default": g.download_options({}, "http://h/a.zip")["retries"],
}))
`);
  assert.equal(r.three, 3);
  assert.equal(r.zero, 0, '0 retries means fail on the first error');
  assert.equal(r.default, 10, 'the documented default applies when unset');
});
