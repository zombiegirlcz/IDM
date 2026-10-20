// The Windows installation must carry what the Linux one carries.
//
// Reported after 2.1.9: "Linux is perfect, Windows is not in sync -- .old
// folders keep appearing after an update and Chrome will not load the
// extension". Reproduced on a real Windows box: the Windows release zip had
// no extension/ at all (only a stray manifest.json at its root), install.ps1
// never created %IDM_DIR%\extension, and `idm update` then swapped in an
// EMPTY extension\ -- so "Load unpacked" pointed at a folder with no manifest.
//
// The real install/update runs in the `windows-installer` and
// `windows-update` CI jobs; this is what can be checked without Windows.
//
// Runs with: node --test test/windows_parity.test.mjs

import test from 'node:test';
import assert from 'node:assert/strict';
import { readFileSync } from 'node:fs';
import { fileURLToPath } from 'node:url';
import { dirname, join } from 'node:path';

const repoRoot = join(dirname(fileURLToPath(import.meta.url)), '..');
const releaseYml = () => readFileSync(join(repoRoot, '.github', 'workflows', 'release.yml'), 'utf8');
const ps1 = () => readFileSync(join(repoRoot, 'install.ps1'), 'utf8');

/** The `run:` body of one named step, up to the next step. */
function step(yml, name) {
  const at = yml.indexOf(`- name: ${name}`);
  assert.ok(at >= 0, `release.yml has no step "${name}"`);
  const next = yml.indexOf('\n      - name:', at + 1);
  return yml.slice(at, next < 0 ? undefined : next);
}

/** Lines of a step that actually run (comments are not packaging). */
const commands = (body) =>
  body.split('\n').map((l) => l.trim()).filter((l) => l && !l.startsWith('#'));

test('the Windows release archive carries the whole extension, like the Linux one', () => {
  const win = commands(step(releaseYml(), 'Stage artifacts (Windows)'));
  assert.ok(
    win.some((l) => /cp -r extension\/\. dist\/extension\//.test(l)),
    `the Windows zip must contain extension/ (Load unpacked needs background.js, ` +
      `content.js, ...), not just manifest.json:\n${win.join('\n')}`,
  );
});

test('both archives ship the same helper scripts and assets', () => {
  const yml = releaseYml();
  const shipped = (name) =>
    new Set(
      commands(step(yml, name))
        .filter((l) => l.startsWith('cp ') || l.startsWith('mkdir -p dist/'))
        .flatMap((l) => l.match(/(scripts\/[\w.-]+|assets\/[\w.-]+)/g) || []),
    );
  const win = shipped('Stage artifacts (Windows)');
  const lin = shipped('Stage artifacts (Linux)');
  const missing = [...lin].filter((f) => !win.has(f));
  assert.deepEqual(missing, [], 'the Windows archive lacks what Linux ships');
});

test('install.ps1 installs the extension into %IDM_DIR%\\extension', () => {
  const s = ps1();
  // assert.ok, not assert.match: a miss would print the whole script.
  assert.ok(/\$extDir\s*=\s*Join-Path \$Prefix "extension"/.test(s),
    'the extension needs a fixed home in the installation');
  assert.ok(/Join-Path \$stage "extension"/.test(s),
    'and it comes out of the archive');
  // The last screen must say WHICH folder to load, not only "Load unpacked".
  assert.ok(/Load unpacked.*\$extDir/.test(s),
    'the final output must name the folder to load in chrome://extensions');
});

test('install.ps1 clears what an earlier update could not delete', () => {
  const s = ps1();
  // bin.old\idm.exe from 2.1.9 survives until something removes it once no
  // process runs from it -- a reinstall stops those processes first.
  for (const name of ['.old', '.update', '.trash']) {
    assert.ok(s.includes(`"${name}"`) || s.includes(`'${name}'`) || s.includes(`*${name}`),
      `install.ps1 must remove ${name} leftovers`);
  }
});
