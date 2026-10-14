// install-host.sh has to register the host for BOTH browser families.
//
// Chromium reads $HOME/.config/<browser>/NativeMessagingHosts and keys the
// permission on a chrome-extension:// origin; Firefox reads
// $HOME/.mozilla/native-messaging-hosts and keys it on the add-on id. A
// Firefox user with only the Chromium registration gets "no such native
// application" — the extension loads and then quietly cannot download.
//
// The script is run against a throwaway HOME, so nothing here touches the
// developer's real registration.
//
// Runs with: node --test extension/test/install_host_firefox.test.mjs

import test from 'node:test';
import assert from 'node:assert/strict';
import { mkdtempSync, mkdirSync, rmSync, readFileSync, existsSync, realpathSync } from 'node:fs';
import { spawnSync } from 'node:child_process';
import { fileURLToPath } from 'node:url';
import { dirname, join } from 'node:path';
import { tmpdir } from 'node:os';

const ext = join(dirname(fileURLToPath(import.meta.url)), '..');

/** Run install-host.sh with its own HOME; returns that HOME. */
function install(extraEnv = {}) {
  const home = mkdtempSync(join(tmpdir(), 'idm-ih-'));
  // Both families only get a manifest where the browser's own config dir
  // already exists, so create them to prove the script fills them in.
  mkdirSync(join(home, '.config', 'chromium'), { recursive: true });
  mkdirSync(join(home, '.mozilla'), { recursive: true });
  const r = spawnSync('bash', [join(ext, 'install-host.sh')], {
    env: {
      ...process.env, HOME: home, XDG_DATA_HOME: join(home, '.local/share'),
      IDM_DOWNLOADS_DIR: join(home, 'Downloads'), ...extraEnv,
    },
    encoding: 'utf8',
    timeout: 120000,
  });
  return { home, ...r };
}

test('Firefox gets a manifest keyed on the add-on id', () => {
  const { home, status, stdout, stderr } = install();
  try {
    assert.equal(status, 0, `install-host.sh failed:\n${stdout}\n${stderr}`);
    const target = join(home, '.mozilla', 'native-messaging-hosts', 'com.tonec.idm.json');
    assert.ok(existsSync(target), `missing ${target}\n${stdout}`);
    const m = JSON.parse(readFileSync(realpathSync(target), 'utf8'));
    const gecko = JSON.parse(readFileSync(join(ext, 'manifest.json'), 'utf8'))
      .browser_specific_settings.gecko.id;
    assert.deepEqual(m.allowed_extensions, [gecko]);
    assert.equal(m.allowed_origins, undefined, 'Firefox must not get the Chrome key');
    assert.match(m.path, /idm-host-wrapper\.sh$/, 'and it must point at the wrapper');
  } finally {
    rmSync(home, { recursive: true, force: true });
  }
});

test('Chromium still gets its own, unchanged', () => {
  const { home, status } = install();
  try {
    assert.equal(status, 0);
    const target = join(home, '.config', 'chromium', 'NativeMessagingHosts', 'com.tonec.idm.json');
    const m = JSON.parse(readFileSync(realpathSync(target), 'utf8'));
    assert.match(m.allowed_origins[0], /^chrome-extension:\/\//);
    assert.equal(m.allowed_extensions, undefined, 'Chrome must not get the gecko key');
  } finally {
    rmSync(home, { recursive: true, force: true });
  }
});

test('--uninstall removes both', () => {
  const { home } = install();
  try {
    const r = spawnSync('bash', [join(ext, 'install-host.sh'), '--uninstall'], {
      env: {
        ...process.env, HOME: home, XDG_DATA_HOME: join(home, '.local/share'),
      },
      encoding: 'utf8',
      timeout: 120000,
    });
    assert.equal(r.status, 0, r.stderr);
    for (const p of [
      join(home, '.mozilla', 'native-messaging-hosts', 'com.tonec.idm.json'),
      join(home, '.config', 'chromium', 'NativeMessagingHosts', 'com.tonec.idm.json'),
    ]) {
      assert.ok(!existsSync(p), `left behind: ${p}`);
    }
  } finally {
    rmSync(home, { recursive: true, force: true });
  }
});
