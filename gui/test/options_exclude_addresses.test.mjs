// file_types.exclude_addresses must be reachable from the Options dialog.
//
// The key has been in DEFAULT_SETTINGS from the start, but the File Types tab
// only ever offered the `exclude_sites` list, so the only way to set it was
// editing settings.json by hand. Now that the browser extension actually reads
// it (via the host's get_settings), the dialog has to be able to set it.
//
// Runs with: node --test gui/test/options_exclude_addresses.test.mjs

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

test('the File Types tab binds a control to file_types.exclude_addresses', () => {
  const d = dumpWindow();
  const opt = d.dialogs.find((x) => /options/i.test(x.title));
  assert.ok(opt, 'no Options dialog in the dump');
  const ft = (opt.controls || {})['File Types'];
  assert.ok(ft, `no File Types tab in the dump: ${Object.keys(opt.controls || {})}`);
  // The dump reports labels, so check the list is there by its label...
  assert.ok(
    (ft.lists || []).some((l) => /address/i.test(l)),
    `File Types must carry an address list, got: ${JSON.stringify(ft.lists)}`,
  );
  // ...and that it is bound to the settings key, which only the source shows.
  const py = readFileSync(guiPy, 'utf8');
  assert.ok(
    py.includes('"file_types.exclude_addresses"'),
    'the list must be bound to file_types.exclude_addresses',
  );
  // A list without a way to fill it is decoration.
  assert.ok(
    (ft.buttons || []).some((b) => /address/i.test(b)),
    `File Types needs add/remove buttons for addresses, got: ${JSON.stringify(ft.buttons)}`,
  );
});

test('an excluded address round-trips through settings.json', () => {
  const stateDir = mkdtempSync(join(tmpdir(), 'idm_opt_addr_'));
  const out = execFileSync(
    'python3',
    [guiPy, '--selftest-options-data', '--state-dir', stateDir],
    { encoding: 'utf8' },
  );
  assert.match(out, /OPTIONS-DATA: OK/, `options data selftest failed:\n${out}`);
  const saved = JSON.parse(readFileSync(join(stateDir, 'settings.json'), 'utf8'));
  assert.ok(
    Array.isArray(saved.file_types.exclude_addresses),
    'exclude_addresses must stay a list',
  );
  assert.ok(
    saved.file_types.exclude_addresses.includes('*/ads/*'),
    `the address was not persisted: ${JSON.stringify(saved.file_types)}`,
  );
});
