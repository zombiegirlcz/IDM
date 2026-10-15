// The install dialog the window raises when a newer release exists.
//
// The brief was explicit: on startup the window installs a new version
// WITHOUT asking, showing progress while it does. That is a strong default,
// so the decision of whether to raise it at all is a pure function with its
// own tests -- a window that updates itself when it should not is the worst
// outcome here, worse than one that never updates.
//
// The progress itself is read from the file `idm update --progress-file`
// writes, so the updater and the window stay separate processes.
//
// Runs with: node --test gui/test/update_dialog.test.mjs

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

test('a newer version means install, and the same version means nothing', () => {
  const r = py(`print("R:" + json.dumps([
      g.should_offer_update({"newer": True,  "latest": "v0.2.0"}),
      g.should_offer_update({"newer": False, "latest": "v0.1.5"})]))`);
  assert.equal(r[0], true);
  assert.equal(r[1], false);
});

test('nonsense never triggers an install', () => {
  // No cache, a half-written cache, a cache claiming news with no version --
  // none of those may make the window replace the binaries under itself.
  const r = py(`print("R:" + json.dumps([
      g.should_offer_update(None),
      g.should_offer_update({}),
      g.should_offer_update("newer"),
      g.should_offer_update({"newer": True}),
      g.should_offer_update({"newer": True, "latest": ""}),
      g.should_offer_update({"newer": "yes", "latest": "v9"})]))`);
  for (const [i, v] of r.entries()) {
    assert.equal(v, false, `case ${i} must not trigger an install`);
  }
});

test('the user can switch the automatic install off', () => {
  // "Without confirmation" is the default, not a sentence. Someone who does
  // not want their binaries replaced on startup must have a way to say so.
  const r = py(`
import tempfile
d = tempfile.mkdtemp()
before = g.auto_update_enabled(d)
s = g.load_settings(d)
s.setdefault("appearance", {})
s.setdefault("updates", {})["auto_install"] = False
g.save_settings(d, s)
print("R:" + json.dumps({"default": before, "after": g.auto_update_enabled(d)}))
`);
  assert.equal(r.default, true, 'the brief asks for automatic by default');
  assert.equal(r.after, false, 'and it must be possible to turn off');
});

test('progress is read from the file the updater writes', () => {
  const r = py(`
import tempfile, os, json as j
d = tempfile.mkdtemp()
p = os.path.join(d, "progress.json")
open(p, "w").write(j.dumps({"phase": "download", "percent": 42.5,
                            "speed_bps": 3*1024*1024, "done": False,
                            "error": None}))
print("R:" + j.dumps(g.read_update_progress(p)))
`);
  assert.equal(r.percent, 42.5);
  assert.equal(r.done, false);
  assert.match(r.label, /42/, `the label should show the figure: ${r.label}`);
  assert.match(r.label, /MB\/s/, `and the speed: ${r.label}`);
});

test('a progress file that is missing or half-written reads as "starting"', () => {
  // The updater writes atomically, but the window can look before the first
  // write lands. That must not raise and must not look finished.
  const r = py(`
import tempfile, os
d = tempfile.mkdtemp()
missing = g.read_update_progress(os.path.join(d, "nope.json"))
half = os.path.join(d, "half.json")
open(half, "w").write('{"phase": "down')
print("R:" + json.dumps({"missing": missing, "half": g.read_update_progress(half)}))
`);
  for (const k of ['missing', 'half']) {
    assert.equal(r[k].done, false, `${k} must not read as finished`);
    assert.equal(r[k].percent, 0);
    assert.ok(r[k].label, `${k} should still have something to show`);
  }
});

test('a failed update is reported, not swallowed', () => {
  const r = py(`
import tempfile, os, json as j
d = tempfile.mkdtemp()
p = os.path.join(d, "progress.json")
open(p, "w").write(j.dumps({"phase": "error", "percent": 0, "speed_bps": 0,
                            "done": True, "error": "kontrolni soucet nesouhlasi"}))
print("R:" + j.dumps(g.read_update_progress(p)))
`);
  assert.equal(r.done, true);
  assert.ok(r.error, 'the error must survive to the dialog');
  assert.match(r.label, /soucet/, `and reach the label: ${r.label}`);
});
