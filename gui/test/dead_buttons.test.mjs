// No dialog may ship a button that does nothing when clicked.
//
// options_actions.test.mjs introduced the dead-button check but pointed it only
// at the Options dialog, so the same defect survived everywhere else:
// Scheduler "Apply", Properties "Open", Grabber "Stop Exploring", the Progress
// dialog's "Options on completion" and About's "Registration..." /
// "Check for updates" were all decoration.
//
// Exempt by design: the Add URL and Download File Info dialogs return their
// buttons to the caller, which binds them with .config(command=...) -- a
// static check cannot see that, and giving them a placeholder command here
// would hide a real bug rather than find one.
//
// Runs with: node --test gui/test/dead_buttons.test.mjs

import test from 'node:test';
import assert from 'node:assert/strict';
import { existsSync } from 'node:fs';
import { spawnSync } from 'node:child_process';
import { fileURLToPath } from 'node:url';
import { dirname, join } from 'node:path';

const here = dirname(fileURLToPath(import.meta.url));
const guiDir = join(here, '..');
const repoRoot = join(guiDir, '..');
const guiPy = join(guiDir, 'idm_gui.py');

function findEngine() {
  const candidates = [
    process.env.IDM_ENGINE_BIN,
    join(repoRoot, 'engine/target/release/idm'),
    join(repoRoot, 'engine/target/debug/idm'),
  ].filter(Boolean);
  for (const c of candidates) if (existsSync(c)) return c;
  throw new Error(`idm engine not found; looked in:\n  ${candidates.join('\n  ')}`);
}

function dumpWindow() {
  const res = spawnSync(
    'xvfb-run',
    ['-a', 'python3', guiPy, '--selftest-dump', '--engine', findEngine()],
    { encoding: 'utf8', maxBuffer: 8 * 1024 * 1024 },
  );
  if (res.status !== 0) {
    throw new Error(`dump failed (${res.status}):\n${res.stdout}\n${res.stderr}`);
  }
  const line = res.stdout.split('\n').find((l) => l.startsWith('DUMP:'));
  assert.ok(line, `no DUMP: line in output:\n${res.stdout}`);
  return JSON.parse(line.slice('DUMP:'.length));
}

// Buttons in these dialogs are wired by whoever opens them.
const CALLER_WIRED = [/add url/i, /download file info/i, /file info/i];

test('every dialog reports its dead buttons', () => {
  const d = dumpWindow();
  for (const dlg of d.dialogs) {
    assert.ok(
      Array.isArray(dlg.dead_buttons),
      `dialog "${dlg.title}" does not report dead_buttons, so nothing guards it`,
    );
  }
});

test('no dialog has a button that does nothing', () => {
  const d = dumpWindow();
  const offenders = d.dialogs
    .filter((dlg) => !CALLER_WIRED.some((re) => re.test(dlg.title || '')))
    .filter((dlg) => (dlg.dead_buttons || []).length > 0)
    .map((dlg) => `${dlg.title}: ${dlg.dead_buttons.join(', ')}`);
  assert.deepEqual(offenders, [], `dead buttons found:\n  ${offenders.join('\n  ')}`);
});

test('the main window has no dead buttons either', () => {
  const d = dumpWindow();
  assert.ok(Array.isArray(d.dead_buttons), 'the main window must report dead_buttons');
  assert.deepEqual(d.dead_buttons, [], `main window dead buttons: ${d.dead_buttons}`);
});
