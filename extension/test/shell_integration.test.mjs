// Shell-integration tests: `install-shell.sh` must register our IDM-like
// downloader with the Linux desktop the same way real IDM hooks Explorer.
//
// What we verify (all on a throwaway $HOME, so nothing touches the real user):
//   * a GUI launcher desktop entry is installed (and is valid)
//   * a scheme-handler desktop entry for `x-scheme-handler/idmdwnlmfv9`
//     (and `idmreg`) is installed and is valid per desktop-file-validate
//   * the scheme handler is actually *registered* (mimeapps.list points at it)
//   * a wrapper passes the incoming URL (%u) through to the engine
//   * file-manager context-menu actions exist and wrap the selection as
//     `idmdwnlmfv9://file://...`
//   * --uninstall removes everything again
//
// Runs with: node --test extension/test/shell_integration.test.mjs

import test from 'node:test';
import assert from 'node:assert/strict';
import { readFileSync, existsSync, statSync, mkdtempSync } from 'node:fs';
import { execFileSync } from 'node:child_process';
import { fileURLToPath } from 'node:url';
import { dirname, join } from 'node:path';
import { tmpdir } from 'node:os';

const here = dirname(fileURLToPath(import.meta.url));
const ext = join(here, '..');
const script = join(ext, 'install-shell.sh');

function freshHome() {
  return mkdtempSync(join(tmpdir(), 'idm_shell_home_'));
}

function run(home, args = []) {
  return execFileSync('bash', [script, ...args], {
    env: {
      ...process.env,
      HOME: home,
      XDG_DATA_HOME: join(home, '.local', 'share'),
      XDG_CONFIG_HOME: join(home, '.config'),
      IDM_DOWNLOADS_DIR: join(home, 'Downloads'),
      PATH: process.env.PATH,
    },
    encoding: 'utf8',
    stdio: ['ignore', 'pipe', 'pipe'],
  });
}

function appsDir(home) {
  return join(home, '.local', 'share', 'applications');
}

function nativeDir(home) {
  return join(home, '.local', 'share', 'idm-native');
}

function isExec(p) {
  return Boolean(statSync(p).mode & 0o111);
}

test('install-shell.sh exists and is executable', () => {
  assert.ok(existsSync(script), `missing ${script}`);
  assert.ok(isExec(script), 'install-shell.sh must be executable');
});

test('installs a valid GUI launcher', () => {
  const home = freshHome();
  run(home);

  const gui = join(appsDir(home), 'idm-download.desktop');
  assert.ok(existsSync(gui), `GUI launcher missing: ${gui}`);
  const src = readFileSync(gui, 'utf8');
  assert.ok(/^\[Desktop Entry\]/m.test(src), 'must have [Desktop Entry]');
  assert.ok(/^Type=Application$/m.test(src), 'Type=Application');
  assert.ok(/^Name=.+$/m.test(src), 'must have a Name');
  assert.doesNotMatch(src, /NoDisplay=true/, 'GUI launcher should be visible');

  // The Exec points at the GUI wrapper; the --serve args live there so the
  // .desktop Exec stays a single token without reserved characters.
  const guiWrapper = join(nativeDir(home), 'idm-gui-wrapper.sh');
  assert.ok(existsSync(guiWrapper), `GUI wrapper missing: ${guiWrapper}`);
  assert.ok(isExec(guiWrapper), 'GUI wrapper must be executable');
  const gw = readFileSync(guiWrapper, 'utf8');
  assert.ok(gw.includes('--serve'), 'GUI wrapper should start the --serve UI');
  assert.ok(gw.includes('127.0.0.1'), 'GUI wrapper should bind the serve address');
  assert.ok(gw.includes('--output-dir'), 'GUI wrapper should set the output dir');
  assert.ok(src.includes('idm-gui-wrapper.sh'), 'Exec must point at the GUI wrapper');

  execFileSync('desktop-file-validate', [gui], { stdio: 'pipe' });
});

test('installs and registers the idmdwnlmfv9 scheme handler', () => {
  const home = freshHome();
  run(home);

  const scheme = join(appsDir(home), 'idm-scheme.desktop');
  assert.ok(existsSync(scheme), `scheme handler missing: ${scheme}`);
  const src = readFileSync(scheme, 'utf8');
  assert.ok(
    /MimeType=.*x-scheme-handler\/idmdwnlmfv9/.test(src),
    'must declare x-scheme-handler/idmdwnlmfv9',
  );
  assert.ok(
    /MimeType=.*x-scheme-handler\/idmreg/.test(src),
    'must declare x-scheme-handler/idmreg',
  );
  assert.ok(/%u/.test(src), 'scheme handler must receive the URL (%u)');
  assert.ok(/NoDisplay=true/.test(src), 'scheme handler should be hidden');

  execFileSync('desktop-file-validate', [scheme], { stdio: 'pipe' });

  // The registration must actually be recorded for xdg.
  const candidates = [
    join(home, '.config', 'mimeapps.list'),
    join(home, '.local', 'share', 'applications', 'mimeapps.list'),
  ];
  const found = candidates.find(
    (p) => existsSync(p) && /idmdwnlmfv9/.test(readFileSync(p, 'utf8')),
  );
  assert.ok(found, `no mimeapps.list registering the scheme (looked in: ${candidates.join(', ')})`);
});

test('scheme wrapper passes the URL through to the engine', () => {
  const home = freshHome();
  run(home);

  const wrapper = join(nativeDir(home), 'idm-shell-wrapper.sh');
  assert.ok(existsSync(wrapper), `wrapper missing: ${wrapper}`);
  const w = readFileSync(wrapper, 'utf8');
  assert.ok(/\bexec\b/.test(w), 'wrapper should exec the engine');
  assert.ok(/"\$@"/.test(w), 'wrapper must forward its arguments (%u)');
  assert.ok(isExec(wrapper), 'wrapper must be executable');
});

test('installs file-manager context-menu actions that wrap the selection', () => {
  const home = freshHome();
  run(home);

  // Nautilus script.
  const nautilus = join(home, '.local', 'share', 'nautilus', 'scripts', 'Stahnout s IDM');
  assert.ok(existsSync(nautilus), `nautilus script missing: ${nautilus}`);
  const n = readFileSync(nautilus, 'utf8');
  assert.ok(/idmdwnlmfv9:\/\//.test(n), 'context action must wrap as idmdwnlmfv9://');
  assert.ok(isExec(nautilus), 'nautilus script must be executable');

  // Thunar custom action.
  const thunar = join(home, '.config', 'Thunar', 'uca.xml');
  assert.ok(existsSync(thunar), `thunar custom action missing: ${thunar}`);
  assert.ok(/idmdwnlmfv9:\/\//.test(readFileSync(thunar, 'utf8')));
});

test('--uninstall removes the integration', () => {
  const home = freshHome();
  run(home);
  assert.ok(existsSync(join(appsDir(home), 'idm-download.desktop')));
  assert.ok(existsSync(join(appsDir(home), 'idm-scheme.desktop')));

  run(home, ['--uninstall']);

  assert.ok(!existsSync(join(appsDir(home), 'idm-download.desktop')), 'GUI launcher should be gone');
  assert.ok(!existsSync(join(appsDir(home), 'idm-scheme.desktop')), 'scheme handler should be gone');
});