// save_to.temp_dir promised something the engine cannot do.
//
// The direct engine set_len()s the final file and writes the segments into it
// in place; there is no part file and no temp file anywhere, and the only
// sidecar (.idmmeta) sits next to the output. So "Temporary directory" could
// not affect a single byte, while the dialog -- and the docstring, which
// claimed the .idmpart chunks lived there -- said otherwise.
//
// Rather than leave a setting that lies, the control is gone. This test keeps
// it gone, and keeps the request body free of a key the engine ignores.
//
// Runs with: node --test gui/test/temp_dir_removed.test.mjs

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
  throw new Error('idm engine not found');
}

test('the engine really has no notion of a temp dir', () => {
  // The premise of the whole change: if this ever becomes false, the setting
  // deserves to come back rather than stay deleted.
  for (const f of ['engine/src/main.rs', 'engine/src/gui.rs', 'engine/src/media.rs']) {
    const src = readFileSync(join(repoRoot, f), 'utf8');
    assert.doesNotMatch(src, /temp_dir/, `${f} mentions temp_dir`);
  }
});

test('the Options dialog no longer offers a temporary directory', () => {
  const res = spawnSync(
    'xvfb-run',
    ['-a', 'python3', guiPy, '--selftest-dump', '--engine', findEngine()],
    { encoding: 'utf8', maxBuffer: 8 * 1024 * 1024 },
  );
  if (res.status !== 0) {
    throw new Error(`dump failed (${res.status}):\n${res.stdout}\n${res.stderr}`);
  }
  const dump = JSON.parse(
    res.stdout.split('\n').find((l) => l.startsWith('DUMP:')).slice('DUMP:'.length),
  );
  const opt = dump.dialogs.find((x) => /options/i.test(x.title));
  const saveTo = (opt.controls || {})['Save To'];
  assert.ok(saveTo, 'the Save To tab must still exist');
  assert.ok(
    !JSON.stringify(saveTo).match(/tempor/i),
    `Save To must not offer a temporary directory any more: ${JSON.stringify(saveTo)}`,
  );
});

test('no temp_dir is sent to /api/add', () => {
  const stateDir = mkdtempSync(join(tmpdir(), 'idm_tmpdir_'));
  const out = execFileSync(
    'python3',
    [guiPy, '--selftest-add-body', '--state-dir', stateDir,
     '--url', 'https://example.com/f.zip'],
    { encoding: 'utf8' },
  );
  const line = out.split('\n').find((l) => l.startsWith('BODY:'));
  assert.ok(line, `no BODY: line:\n${out}`);
  const body = JSON.parse(line.slice('BODY:'.length));
  assert.ok(!('temp_dir' in body), `temp_dir must not be sent: ${line}`);
});

test('download_options does not resolve a temp_dir', () => {
  const stateDir = mkdtempSync(join(tmpdir(), 'idm_tmpdir2_'));
  const out = execFileSync(
    'python3',
    [guiPy, '--selftest-download-options', '--state-dir', stateDir,
     '--url', 'https://example.com/f.zip'],
    { encoding: 'utf8' },
  );
  const line = out.split('\n').find((l) => l.startsWith('OPTIONS:'));
  assert.ok(line, `no OPTIONS: line:\n${out}`);
  assert.ok(!('temp_dir' in JSON.parse(line.slice('OPTIONS:'.length))), line);
});
