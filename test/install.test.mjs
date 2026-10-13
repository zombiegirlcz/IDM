// Tests for the Linux installer (`install.sh`).
//
// The user's complaint was that installing required Rust/git — real IDM doesn't.
// So the default path must download a PREBUILT release archive and unpack it;
// the build-from-source path is opt-in via IDM_LOCAL_SOURCE.
//
// We can't hit GitHub from tests, so we drive the download path with a local
// file:// archive (IDM_ARCHIVE_URL) and the source path with a fake checkout.

import test from 'node:test';
import assert from 'node:assert/strict';
import { readFileSync, existsSync, statSync, mkdtempSync, mkdirSync, copyFileSync, writeFileSync } from 'node:fs';
import { execFileSync } from 'node:child_process';
import { fileURLToPath } from 'node:url';
import { dirname, join } from 'node:path';
import { tmpdir } from 'node:os';

const here = dirname(fileURLToPath(import.meta.url));
const repoRoot = join(here, '..');
const installer = join(repoRoot, 'install.sh');

const src = () => readFileSync(installer, 'utf8');

function freshHome() {
  return mkdtempSync(join(tmpdir(), 'idm_install_home_'));
}

/** Build a fake prebuilt archive (idm + idm-host + idm_gui.py). */
function fakeArchive() {
  const dir = mkdtempSync(join(tmpdir(), 'idm_arch_'));
  for (const b of ['idm', 'idm-host']) {
    writeFileSync(join(dir, b), `#!/bin/sh\necho ${b}\n`, { mode: 0o755 });
  }
  writeFileSync(join(dir, 'idm_gui.py'), '# fake gui\n');
  // The real release archive also ships the aria2 helper and the installer
  // itself (the latter is what `--uninstall` is documented to run).
  writeFileSync(join(dir, 'ensure-aria2.sh'), '#!/bin/sh\nexit 0\n', { mode: 0o755 });
  copyFileSync(join(repoRoot, 'install.sh'), join(dir, 'install.sh'));
  const tar = join(dir, 'idm-linux-x64.tar.gz');
  execFileSync('tar', [
    '-czf', tar, '-C', dir,
    'idm', 'idm-host', 'idm_gui.py', 'ensure-aria2.sh', 'install.sh',
  ]);
  return tar;
}

function baseEnv(home) {
  return {
    ...process.env,
    HOME: home,
    XDG_DATA_HOME: join(home, '.local', 'share'),
    XDG_CONFIG_HOME: join(home, '.config'),
    IDM_INSTALL_PREFIX: join(home, '.local', 'share', 'idm'),
    IDM_DOWNLOADS_DIR: join(home, 'Downloads'),
    PATH: process.env.PATH,
  };
}

function run(home, env, args = []) {
  return execFileSync('bash', [installer, ...args], {
    env: { ...baseEnv(home), ...env },
    encoding: 'utf8',
    stdio: ['ignore', 'pipe', 'pipe'],
  });
}

test('install.sh exists and is executable', () => {
  assert.ok(existsSync(installer), `missing ${installer}`);
  assert.ok(statSync(installer).mode & 0o111, 'install.sh must be executable');
});

test('does NOT require git or Rust on the default path', () => {
  const s = src();
  // git clone must not be used at all; cargo only on the opt-in local path.
  assert.ok(!/git clone/.test(s), 'must not clone the source');
  assert.match(s, /IDM_LOCAL_SOURCE/, 'build-from-source must be opt-in');
  assert.match(s, /releases\/latest\/download/, 'must download the release asset');
  assert.match(s, /releases\/download\/\$VERSION/, 'must support a pinned version');
  assert.match(s, /tar -xzf/, 'must unpack the archive');
});

test('download path installs binaries, launcher, desktop icon', () => {
  const home = freshHome();
  const arch = fakeArchive();
  run(home, { IDM_ARCHIVE_URL: `file://${arch}` });

  const prefix = join(home, '.local', 'share', 'idm');
  assert.ok(existsSync(join(prefix, 'bin', 'idm')), 'engine must be installed');
  assert.ok(existsSync(join(prefix, 'bin', 'idm-host')), 'host must be installed');
  assert.ok(existsSync(join(prefix, 'bin', 'idm-gui')), 'gui launcher must exist');
  assert.ok(existsSync(join(prefix, 'gui', 'idm_gui.py')), 'gui script must be installed');

  // The aria2 auto-installer must travel with the binaries, otherwise
  // `--aria2` cannot install aria2c on a clean machine.
  assert.ok(
    existsSync(join(prefix, 'bin', 'ensure-aria2.sh')),
    'ensure-aria2.sh must be installed on the release path',
  );
  // The documented uninstall command is `bash $PREFIX/install.sh --uninstall`.
  assert.ok(existsSync(join(prefix, 'install.sh')), 'install.sh must be kept in the prefix');

  const icon = join(home, 'Desktop', 'idm.desktop');
  assert.ok(existsSync(icon), `desktop icon missing: ${icon}`);
  execFileSync('desktop-file-validate', [icon], { stdio: 'pipe' });
});

test('uninstall works through the copy kept in the prefix (curl | bash case)', () => {
  const home = freshHome();
  const arch = fakeArchive();
  // stdin-piped install: BASH_SOURCE is not a readable file, exactly like
  // `curl -fsSL ... | bash`.
  execFileSync('bash', ['-s'], {
    env: { ...baseEnv(home), IDM_ARCHIVE_URL: `file://${arch}` },
    input: readFileSync(installer),
    stdio: ['pipe', 'pipe', 'pipe'],
  });

  const prefix = join(home, '.local', 'share', 'idm');
  const kept = join(prefix, 'install.sh');
  assert.ok(existsSync(kept), 'install.sh must be available for --uninstall');

  execFileSync('bash', [kept, '--uninstall'], {
    env: { ...baseEnv(home), IDM_ARCHIVE_URL: `file://${arch}` },
    stdio: ['ignore', 'pipe', 'pipe'],
  });
  assert.ok(!existsSync(prefix), 'prefix should be gone after --uninstall');
});

test('refuses a plain-http archive URL', () => {
  const home = freshHome();
  assert.throws(
    () => run(home, { IDM_ARCHIVE_URL: 'http://example.invalid/idm-linux-x64.tar.gz' }),
    /https/,
    'an http:// archive must be refused',
  );
});

test('--uninstall removes the icon and prefix', () => {
  const home = freshHome();
  const arch = fakeArchive();
  run(home, { IDM_ARCHIVE_URL: `file://${arch}` });

  const prefix = join(home, '.local', 'share', 'idm');
  const icon = join(home, 'Desktop', 'idm.desktop');
  assert.ok(existsSync(icon));

  run(home, { IDM_ARCHIVE_URL: `file://${arch}` }, ['--uninstall']);
  assert.ok(!existsSync(icon), 'desktop icon should be gone');
  assert.ok(!existsSync(prefix), 'prefix should be gone');
});
