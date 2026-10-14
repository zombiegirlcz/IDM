// The buttons the dead-button check found, plus one it could not see.
//
// "Open" in the Download Complete dialog was bound to win.destroy(), so a
// static check saw a live command while the button did not open anything.
// Now that a finished download actually raises that dialog (see
// completion.test.mjs) the button has to work.
//
// Runs with: node --test gui/test/dialog_actions.test.mjs

import test from 'node:test';
import assert from 'node:assert/strict';
import { readFileSync, mkdtempSync, writeFileSync } from 'node:fs';
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

test('opening a file uses the platform opener, and the folder for reveal', () => {
  const r = py(`
print("R:" + json.dumps({
  "file": g.open_argv("/dl/movie.mp4", "xdg-open"),
  "folder": g.reveal_argv("/dl/movie.mp4", "xdg-open"),
}))
`);
  assert.deepEqual(r.file, ['xdg-open', '/dl/movie.mp4']);
  // Revealing must open the containing directory, not the file itself.
  assert.deepEqual(r.folder, ['xdg-open', '/dl']);
});

test('no opener on the system means no command, not a crash', () => {
  const r = py(`print("R:" + json.dumps(g.open_argv("/dl/a.mp4", "")))`);
  assert.deepEqual(r, []);
});

test('the update check compares versions numerically, not as text', () => {
  const r = py(`
print("R:" + json.dumps({
  "newer": g.is_newer_version("0.1.10", "0.1.4"),
  "older": g.is_newer_version("0.1.4", "0.1.10"),
  "same": g.is_newer_version("0.1.4", "0.1.4"),
  "tagged": g.is_newer_version("v1.2.0", "1.1.9"),
  "junk": g.is_newer_version("not-a-version", "0.1.4"),
}))
`);
  // "0.1.10" > "0.1.4" numerically but < as a string -- the bug to avoid.
  assert.equal(r.newer, true);
  assert.equal(r.older, false);
  assert.equal(r.same, false);
  assert.equal(r.tagged, true, 'a leading v must be tolerated');
  assert.equal(r.junk, false, 'garbage must not claim to be an update');
});

test('"Don\'t show this dialog again" turns the setting off for good', () => {
  const stateDir = mkdtempSync(join(tmpdir(), 'idm_dontshow_'));
  writeFileSync(
    join(stateDir, 'settings.json'),
    JSON.stringify({ downloads: { show_complete_dialog: true } }),
    'utf8',
  );
  const out = execFileSync(
    'python3',
    [guiPy, '--selftest-dont-show-again', '--state-dir', stateDir],
    { encoding: 'utf8' },
  );
  assert.match(out, /DONTSHOW: OK/, out);
  const saved = JSON.parse(readFileSync(join(stateDir, 'settings.json'), 'utf8'));
  assert.equal(saved.downloads.show_complete_dialog, false);
});
