// Tests for what happens when a download FINISHES.
//
// The whole "on completion" branch was dead: refresh() only re-rendered the
// queue snapshot, so nothing ever noticed a download reaching "done".
// _dialog_complete() was reachable only from --selftest-dump and play_sound()
// only from the Play button in Options, which meant three persisted settings
// (downloads.show_complete_dialog, sounds.*, downloads.virus_checker +
// virus_params) could never have any effect.
//
// Runs with: node --test gui/test/completion.test.mjs

import test from 'node:test';
import assert from 'node:assert/strict';
import { execFileSync } from 'node:child_process';
import { fileURLToPath } from 'node:url';
import { dirname, join } from 'node:path';

const here = dirname(fileURLToPath(import.meta.url));
const guiPy = join(here, '..', 'idm_gui.py');

/** Run a snippet against the GUI module and return its printed JSON. */
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

test('a download reaching done is reported exactly once', () => {
  const r = py(`
seen = {}
first = g.just_completed(seen, [{"id": 1, "status": "running"}])
second = g.just_completed(seen, [{"id": 1, "status": "done"}])
third = g.just_completed(seen, [{"id": 1, "status": "done"}])
print("R:" + json.dumps([first, second, third]))
`);
  assert.deepEqual(r[0], [], 'a running download has not completed');
  assert.deepEqual(r[1], [1], 'the transition to done must be reported');
  assert.deepEqual(r[2], [], 'it must not be reported again on the next refresh');
});

test('items already done when the window opens do not fire', () => {
  // Otherwise every restart would pop a dialog per finished download.
  const r = py(`
seen = {}
first = g.just_completed(seen, [{"id": 7, "status": "done"}])
print("R:" + json.dumps(first))
`);
  assert.deepEqual(r, [], 'a download that was already done must stay quiet');
});

test('a failed download is not treated as completed', () => {
  const r = py(`
seen = {}
g.just_completed(seen, [{"id": 2, "status": "running"}])
print("R:" + json.dumps(g.just_completed(seen, [{"id": 2, "status": "error"}])))
`);
  assert.deepEqual(r, []);
});

test('the completion plan follows the persisted settings', () => {
  const r = py(`
s = g._deep_merge(g.DEFAULT_SETTINGS, {
    "downloads": {"show_complete_dialog": True,
                  "virus_checker": "/usr/bin/clamscan",
                  "virus_params": "--no-summary [File]"},
    "sounds": {"enabled": True, "events": {"Download complete": "/s/done.wav"}},
})
print("R:" + json.dumps(g.completion_plan(s, "/dl/movie.mp4")))
`);
  assert.equal(r.show_dialog, true);
  assert.equal(r.sound, '/s/done.wav');
  // [File] is IDM's placeholder for the downloaded file.
  assert.deepEqual(r.virus_argv, ['/usr/bin/clamscan', '--no-summary', '/dl/movie.mp4']);
});

test('switches that are off produce no action', () => {
  const r = py(`
s = g._deep_merge(g.DEFAULT_SETTINGS, {
    "downloads": {"show_complete_dialog": False, "virus_checker": ""},
    "sounds": {"enabled": False, "events": {"Download complete": "/s/done.wav"}},
})
print("R:" + json.dumps(g.completion_plan(s, "/dl/movie.mp4")))
`);
  assert.equal(r.show_dialog, false);
  assert.equal(r.sound, '', 'sounds.enabled off means no sound');
  assert.deepEqual(r.virus_argv, []);
});

test('a virus checker without the [File] placeholder still gets the path', () => {
  const r = py(`
s = g._deep_merge(g.DEFAULT_SETTINGS, {
    "downloads": {"virus_checker": "/usr/bin/scan", "virus_params": "-q"},
})
print("R:" + json.dumps(g.completion_plan(s, "/dl/a b.zip")["virus_argv"]))
`);
  assert.deepEqual(r, ['/usr/bin/scan', '-q', '/dl/a b.zip']);
});
