// Tests for the Options dialog's ACTIONS -- the layer below "the tabs are not empty".
//
// settings.test.mjs pins down that every tab carries controls. It does not check
// that those controls DO anything, and they largely did not:
//
//   * every button made by add_buttons() was created without a `command`, so
//     "Add Browser...", File Types "Add/Remove", Connection "Add/Remove",
//     Proxy "Get System", Site Logins "New/Remove" and Sounds "Browse.../Play"
//     were decoration;
//   * `site_logins` is a LIST in DEFAULT_SETTINGS, but the dialog bound its
//     fields as dotted keys ("site_logins.url"), so collect() hit
//     list.setdefault(), threw, and the swallow-everything `except` dropped the
//     site logins silently -- they could never be saved;
//   * connection exceptions, per-category directories and sound events were
//     rendered read-only, with no key, so they could not be edited or persisted.
//
// These tests drive the pure settings helpers (no Tk needed) and assert the
// dialog has no command-less buttons left.
//
// Runs with: node --test gui/test/options_actions.test.mjs

import test from 'node:test';
import assert from 'node:assert/strict';
import { readFileSync, existsSync, mkdtempSync } from 'node:fs';
import { spawnSync, execFileSync } from 'node:child_process';
import { fileURLToPath } from 'node:url';
import { dirname, join } from 'node:path';
import { tmpdir } from 'node:os';

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

test('no button in the Options dialog is dead', () => {
  const d = dumpWindow();
  const opt = d.dialogs.find((x) => /options/i.test(x.title));
  assert.ok(opt, 'no Options dialog in the dump');
  assert.ok(
    Array.isArray(opt.dead_buttons),
    'the dump must report which Options buttons have no command',
  );
  assert.deepEqual(
    opt.dead_buttons,
    [],
    `these Options buttons do nothing when clicked: ${opt.dead_buttons.join(', ')}`,
  );
});

test('site logins, exceptions, category dirs and sounds round-trip', () => {
  const stateDir = mkdtempSync(join(tmpdir(), 'idm_opt_actions_'));
  const out = execFileSync(
    'python3',
    [guiPy, '--selftest-options-data', '--state-dir', stateDir],
    { encoding: 'utf8' },
  );
  assert.match(out, /OPTIONS-DATA: OK/, `options data selftest failed:\n${out}`);

  const saved = JSON.parse(readFileSync(join(stateDir, 'settings.json'), 'utf8'));

  // Site logins are a list of records, and a password must survive a restart.
  assert.ok(Array.isArray(saved.site_logins), 'site_logins must stay a list');
  const login = saved.site_logins.find((x) => x.url === 'https://example.com/files');
  assert.ok(login, `site login was not persisted: ${JSON.stringify(saved.site_logins)}`);
  assert.equal(login.user, 'alice');
  assert.equal(login.password, 's3cret');

  // Per-server connection exceptions.
  const exc = saved.connection.exceptions.find((x) => x.server === 'slow.example.com');
  assert.ok(exc, `exception not persisted: ${JSON.stringify(saved.connection.exceptions)}`);
  assert.equal(exc.connections, 2);

  // Per-category download directory.
  assert.equal(saved.save_to.category_dirs.Video, '/data/video');

  // A sound bound to an event.
  assert.equal(saved.sounds.events['Download complete'], '/usr/share/done.wav');
});

test('editing a site login replaces it instead of duplicating', () => {
  const stateDir = mkdtempSync(join(tmpdir(), 'idm_opt_dedup_'));
  const out = execFileSync(
    'python3',
    [guiPy, '--selftest-options-data', '--state-dir', stateDir],
    { encoding: 'utf8' },
  );
  assert.match(out, /OPTIONS-DATA: OK/, out);
  const saved = JSON.parse(readFileSync(join(stateDir, 'settings.json'), 'utf8'));
  const same = saved.site_logins.filter((x) => x.url === 'https://example.com/files');
  assert.equal(same.length, 1, 'one URL must map to exactly one login record');
  // The removed one must be gone.
  assert.ok(
    !saved.site_logins.some((x) => x.url === 'https://gone.example.com/'),
    'a removed site login must not come back',
  );
});
