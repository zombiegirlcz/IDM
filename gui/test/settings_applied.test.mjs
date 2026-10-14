// Tests that the persisted Options values are actually USED, not just stored.
//
// settings.test.mjs proves the values survive a restart and options_actions.test.mjs
// proves the controls work. Both were still true while only three settings
// (connection.max_connections, general.monitor_clipboard and the custom
// categories) had any effect on a download -- the download directory, the
// per-category directory, the per-server connection exception, the user agent,
// the temp dir and the proxy were saved and then ignored.
//
// Runs with: node --test gui/test/settings_applied.test.mjs

import test from 'node:test';
import assert from 'node:assert/strict';
import { mkdtempSync, writeFileSync } from 'node:fs';
import { execFileSync } from 'node:child_process';
import { fileURLToPath } from 'node:url';
import { dirname, join } from 'node:path';
import { tmpdir } from 'node:os';

const here = dirname(fileURLToPath(import.meta.url));
const guiPy = join(here, '..', 'idm_gui.py');

/** Write a settings.json and ask the GUI what it would use for `url`. */
function optionsFor(settings, url) {
  const stateDir = mkdtempSync(join(tmpdir(), 'idm_applied_'));
  writeFileSync(join(stateDir, 'settings.json'), JSON.stringify(settings), 'utf8');
  const out = execFileSync(
    'python3',
    [guiPy, '--selftest-download-options', '--state-dir', stateDir, '--url', url],
    { encoding: 'utf8' },
  );
  const line = out.split('\n').find((l) => l.startsWith('OPTIONS:'));
  assert.ok(line, `no OPTIONS: line in output:\n${out}`);
  return JSON.parse(line.slice('OPTIONS:'.length));
}

test('a video lands in the category directory, everything else in the default one', () => {
  const settings = {
    save_to: { default_dir: '/downloads', category_dirs: { Video: '/media/films' } },
  };
  assert.equal(optionsFor(settings, 'http://h/clip.mp4').out_dir, '/media/films');
  assert.equal(optionsFor(settings, 'http://h/book.pdf').out_dir, '/downloads');
});

test('max connections come from settings, and a per-server exception wins', () => {
  const settings = {
    connection: {
      max_connections: 16,
      exceptions: [{ server: 'slow.example.com', connections: 2 }],
    },
  };
  assert.equal(optionsFor(settings, 'http://fast.example.com/a.zip').connections, 16);
  assert.equal(optionsFor(settings, 'http://slow.example.com/a.zip').connections, 2);
  // The exception must match the host, not a substring of the URL.
  assert.equal(optionsFor(settings, 'http://notslow.example.com/a.zip').connections, 16);
});

test('user agent, temp dir and proxy are passed through', () => {
  const o = optionsFor(
    {
      downloads: { user_agent: 'IDM/6.43' },
      save_to: { temp_dir: '/var/tmp/idm' },
      proxy: { use_system: false, http: 'http://proxy:8080', socks: '' },
    },
    'http://h/a.zip',
  );
  assert.equal(o.user_agent, 'IDM/6.43');
  assert.equal(o.temp_dir, '/var/tmp/idm');
  assert.equal(o.proxy, 'http://proxy:8080');
});

test('a SOCKS proxy is preferred over HTTP when both are set', () => {
  const o = optionsFor(
    { proxy: { use_system: false, http: 'http://proxy:8080', socks: 'socks5://s:1080' } },
    'http://h/a.zip',
  );
  assert.equal(o.proxy, 'socks5://s:1080');
});

test('"use proxy from the browser" means we send no proxy of our own', () => {
  const o = optionsFor(
    { proxy: { use_system: true, http: 'http://proxy:8080' } },
    'http://h/a.zip',
  );
  assert.equal(o.proxy, '');
});

test('the options actually reach /api/add as a request body', () => {
  const stateDir = mkdtempSync(join(tmpdir(), 'idm_addbody_'));
  writeFileSync(
    join(stateDir, 'settings.json'),
    JSON.stringify({
      connection: { max_connections: 7, exceptions: [] },
      downloads: { user_agent: 'IDM/6.43' },
      save_to: { default_dir: '/downloads', category_dirs: {}, temp_dir: '/var/tmp/idm' },
      proxy: { use_system: false, http: 'http://proxy:8080' },
    }),
    'utf8',
  );
  const out = execFileSync(
    'python3',
    [guiPy, '--selftest-add-body', '--state-dir', stateDir, '--url', 'http://h/a.zip'],
    { encoding: 'utf8' },
  );
  const line = out.split('\n').find((l) => l.startsWith('BODY:'));
  assert.ok(line, `no BODY: line in output:\n${out}`);
  const body = JSON.parse(line.slice('BODY:'.length));
  assert.equal(body.url, 'http://h/a.zip');
  assert.equal(body.connections, 7);
  assert.equal(body.user_agent, 'IDM/6.43');
  assert.equal(body.out_dir, '/downloads');
  assert.equal(body.temp_dir, '/var/tmp/idm');
  assert.equal(body.proxy, 'http://proxy:8080');
});
