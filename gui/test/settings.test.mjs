// Tests for the Options dialog and its persisted settings.
//
// The user's #1 complaint was: "nastaveni je uplne prazdne" -- every Options tab
// showed only its own name. These tests pin down that the dialog now matches
// the real IDM (docs/idm/options.txt): each of the 9 tabs carries real controls,
// and the values survive a restart via STATE_DIR/settings.json.
//
// We drive the real Tk window under xvfb via --selftest-dump (which builds every
// dialog) and via a new --selftest-settings mode that exercises the JSON layer.
//
// Runs with: node --test gui/test/settings.test.mjs

import test from 'node:test';
import assert from 'node:assert/strict';
import { readFileSync, existsSync, mkdtempSync, writeFileSync } from 'node:fs';
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
  const engine = findEngine();
  const res = spawnSync(
    'xvfb-run',
    ['-a', 'python3', guiPy, '--selftest-dump', '--engine', engine],
    { encoding: 'utf8', env: { ...process.env }, maxBuffer: 8 * 1024 * 1024 },
  );
  if (res.status !== 0) {
    throw new Error(`dump failed (${res.status}):\n${res.stdout}\n${res.stderr}`);
  }
  const line = res.stdout.split('\n').find((l) => l.startsWith('DUMP:'));
  assert.ok(line, `no DUMP: line in output:\n${res.stdout}`);
  return JSON.parse(line.slice('DUMP:'.length));
}

test('Options dialog has all 9 IDM tabs', () => {
  const d = dumpWindow();
  const opt = d.dialogs.find((x) => /options/i.test(x.title));
  assert.ok(opt, `no "Options" dialog; got: ${d.dialogs.map((x) => x.title).join(', ')}`);
  const tabs = opt.tabs.map((t) => t.toLowerCase());
  for (const want of [
    'general',
    'file types',
    'connection',
    'save to',
    'downloads',
    'proxy',
    'site logins',
    'dial-up',
    'sounds',
  ]) {
    assert.ok(
      tabs.some((t) => t.includes(want)),
      `Options tab "${want}" missing; got: ${tabs.join(', ')}`,
    );
  }
});

test('every Options tab has real controls, not just its own name', () => {
  const d = dumpWindow();
  const opt = d.dialogs.find((x) => /options/i.test(x.title));
  const controls = opt.controls || {};
  for (const name of [
    'General',
    'File Types',
    'Connection',
    'Save To',
    'Downloads',
    'Proxy / Socks',
    'Site Logins',
    'Dial-Up / VPN',
    'Sounds',
  ]) {
    const c = controls[name];
    assert.ok(c, `tab "${name}" is missing from the dump`);
    const widgetCount = (c.checkboxes?.length || 0) + (c.entries?.length || 0) +
      (c.buttons?.length || 0) + (c.lists?.length || 0) + (c.labels?.length || 0);
    assert.ok(
      widgetCount >= 3,
      `tab "${name}" must carry real controls, got ${widgetCount}: ${JSON.stringify(c)}`,
    );
    // A tab that only repeats its own name is exactly the bug we are fixing.
    assert.ok(
      !(c.labels?.length === 1 && c.labels[0] === name && widgetCount === 1),
      `tab "${name}" still contains only its own name`,
    );
  }
});

test('settings persist to STATE_DIR/settings.json and reload', () => {
  const stateDir = mkdtempSync(join(tmpdir(), 'idm_settings_'));
  const out = execFileSync('python3', [
    guiPy,
    '--selftest-settings',
    '--state-dir',
    stateDir,
  ], { encoding: 'utf8' });
  assert.match(out, /SETTINGS: OK/, `settings selftest failed:\n${out}`);
  const path = join(stateDir, 'settings.json');
  assert.ok(existsSync(path), `settings.json was not written to ${path}`);
  const saved = JSON.parse(readFileSync(path, 'utf8'));
  // The round-tripped value the selftest changed must be there.
  assert.equal(saved.connection.max_connections, 3, 'changed value must persist');
  assert.equal(saved.downloads.show_complete_dialog, false, 'changed flag must persist');
});

test('a broken settings.json does not crash: defaults are used', () => {
  const stateDir = mkdtempSync(join(tmpdir(), 'idm_settings_bad_'));
  writeFileSync(join(stateDir, 'settings.json'), '{ this is not json', 'utf8');
  const out = execFileSync('python3', [
    guiPy,
    '--selftest-settings',
    '--state-dir',
    stateDir,
  ], { encoding: 'utf8' });
  assert.match(out, /SETTINGS: OK/, `must recover from corrupt settings:\n${out}`);
});

test('settings expose the values the engine can honour', () => {
  const py = readFileSync(guiPy, 'utf8');
  // These are the settings that map to real engine flags -- they must exist so
  // the dialog controls something rather than being decoration.
  for (const key of [
    'max_connections',
    'user_agent',
    'format',
    'virus_checker',
    'proxy',
    'no_proxy',
    'auto',
  ]) {
    assert.ok(py.includes(key), `settings must include "${key}"`);
  }
});