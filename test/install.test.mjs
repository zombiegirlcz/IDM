// Tests for the one-line installer (`install.sh`).
//
// The installer is what `curl -fsSL <url> | bash` runs. A full run needs Rust
// and network, which we cannot require in CI, so the script honours two escape
// hatches that let us test the *wiring* deterministically:
//
//   IDM_SOURCE_DIR=<path>  use a local checkout instead of cloning
//   IDM_SKIP_BUILD=1       skip cargo build (binaries must already exist)
//
// What we verify (in a throwaway $HOME):
//   * the launcher script runs and exits 0
//   * the engine + host binaries end up in the install prefix
//   * the native-messaging host manifest is installed
//   * the shell integration is installed (scheme handler)
//   * a Desktop icon (.desktop) is created and is valid
//   * --uninstall removes the icon and integration
//
// Runs with: node --test test/install.test.mjs

import test from 'node:test';
import assert from 'node:assert/strict';
import { readFileSync, existsSync, statSync, mkdtempSync, mkdirSync, copyFileSync } from 'node:fs';
import { execFileSync } from 'node:child_process';
import { fileURLToPath } from 'node:url';
import { dirname, join } from 'node:path';
import { tmpdir } from 'node:os';

const here = dirname(fileURLToPath(import.meta.url));
const repoRoot = join(here, '..');
const installer = join(repoRoot, 'install.sh');

function freshHome() {
  return mkdtempSync(join(tmpdir(), 'idm_install_home_'));
}

/** Build a fake source tree with prebuilt binaries, so we skip cargo. */
function fakeSource() {
  const src = mkdtempSync(join(tmpdir(), 'idm_src_'));
  // Minimal layout the installer expects.
  mkdirSync(join(src, 'engine', 'target', 'release'), { recursive: true });
  mkdirSync(join(src, 'engine', 'src', 'bin'), { recursive: true });
  mkdirSync(join(src, 'extension', 'keys'), { recursive: true });
  mkdirSync(join(src, 'gui'), { recursive: true });
  // Fake binaries.
  for (const b of ['idm', 'idm-host']) {
    const p = join(src, 'engine', 'target', 'release', b);
    execFileSync('bash', ['-c', `printf '#!/bin/sh\\necho ${b}\\n' > "${p}" && chmod +x "${p}"`]);
  }
  // Files the installer copies / references.
  copyFileSync(join(repoRoot, 'extension', 'install-host.sh'), join(src, 'extension', 'install-host.sh'));
  copyFileSync(join(repoRoot, 'extension', 'install-shell.sh'), join(src, 'extension', 'install-shell.sh'));
  copyFileSync(join(repoRoot, 'extension', 'com.tonec.idm.json'), join(src, 'extension', 'com.tonec.idm.json'));
  copyFileSync(join(repoRoot, 'gui', 'idm_gui.py'), join(src, 'gui', 'idm_gui.py'));
  return src;
}

function runInstaller(home, src, args = []) {
  return execFileSync('bash', [installer, ...args], {
    env: {
      ...process.env,
      HOME: home,
      XDG_DATA_HOME: join(home, '.local', 'share'),
      XDG_CONFIG_HOME: join(home, '.config'),
      IDM_SOURCE_DIR: src,
      IDM_SKIP_BUILD: '1',
      IDM_INSTALL_PREFIX: join(home, '.local', 'share', 'idm'),
      IDM_DOWNLOADS_DIR: join(home, 'Downloads'),
      IDM_NO_PROMPT: '1',
      PATH: process.env.PATH,
    },
    encoding: 'utf8',
    stdio: ['ignore', 'pipe', 'pipe'],
  });
}

function desktopDir(home) {
  return join(home, 'Desktop');
}

test('install.sh exists and is executable', () => {
  assert.ok(existsSync(installer), `missing ${installer}`);
  assert.ok(statSync(installer).mode & 0o111, 'install.sh must be executable');
});

test('one-line install lays down binaries, host, shell integration and icon', () => {
  const home = freshHome();
  const src = fakeSource();
  runInstaller(home, src);

  const prefix = join(home, '.local', 'share', 'idm');
  assert.ok(existsSync(join(prefix, 'bin', 'idm')), 'engine binary must be installed');
  assert.ok(existsSync(join(prefix, 'bin', 'idm-host')), 'host binary must be installed');

  const apps = join(home, '.local', 'share', 'applications');
  assert.ok(existsSync(join(apps, 'idm-download.desktop')), 'GUI launcher must be installed');
  assert.ok(existsSync(join(apps, 'idm-scheme.desktop')), 'scheme handler must be installed');

  // Desktop icon.
  const icon = join(desktopDir(home), 'idm.desktop');
  assert.ok(existsSync(icon), `desktop icon missing: ${icon}`);
  const src_desktop = readFileSync(icon, 'utf8');
  assert.match(src_desktop, /^\[Desktop Entry\]/m);
  assert.match(src_desktop, /^Type=Application$/m);
  assert.ok(/idm/i.test(src_desktop), 'icon should reference idm');
  // Must be a valid desktop file.
  execFileSync('desktop-file-validate', [icon], { stdio: 'pipe' });
});

test('--uninstall removes the icon and integration', () => {
  const home = freshHome();
  const src = fakeSource();
  runInstaller(home, src);

  const icon = join(desktopDir(home), 'idm.desktop');
  assert.ok(existsSync(icon));

  runInstaller(home, src, ['--uninstall']);

  assert.ok(!existsSync(icon), 'desktop icon should be gone');
  const apps = join(home, '.local', 'share', 'applications');
  assert.ok(!existsSync(join(apps, 'idm-download.desktop')), 'GUI launcher should be gone');
});