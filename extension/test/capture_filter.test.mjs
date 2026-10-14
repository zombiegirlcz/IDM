// background.js honouring the settings it gets from the host.
//
// capture_dom.test.mjs covers the happy path end to end against the real
// binary; this file covers the DECISIONS around it with a stub native port, so
// each case is one message in and one assertion out:
//   * an excluded site stops a capture that would otherwise be sent
//   * a held force key (opcode 31) sends one that would otherwise be dropped
//   * `connections` comes from connection.max_connections, not a constant
//   * get_settings is asked once and cached across captures
//
// Runs with: node --test extension/test/capture_filter.test.mjs

import test from 'node:test';
import assert from 'node:assert/strict';
import { fileURLToPath, pathToFileURL } from 'node:url';
import { dirname, join } from 'node:path';

const ext = join(dirname(fileURLToPath(import.meta.url)), '..');

const SETTINGS = {
  file_types: {
    auto: ['bin'],
    exclude_sites: ['*.blocked.com'],
    exclude_addresses: ['*/ads/*'],
  },
  general: { force_keys: 'Ctrl', prevent_keys: 'Alt' },
  connection: { max_connections: 6 },
};

/**
 * Load a fresh background.js over a stub native host.
 * The stub answers get_settings from `settings` and acknowledges downloads.
 */
async function loadBackground(settings = SETTINGS) {
  const posted = [];
  const listeners = [];
  const onConnectListeners = [];
  const tabRemovedListeners = [];

  const nativePort = {
    postMessage(m) {
      posted.push(m);
      const reply =
        m.action === 'get_settings'
          ? { ok: true, source: 'file', settings, id: m.id }
          : { ok: true, id: m.id };
      // Replies arrive asynchronously, as they do from a real host.
      setTimeout(() => {
        for (const cb of listeners) cb(reply);
      }, 0);
    },
    onMessage: { addListener: (cb) => listeners.push(cb) },
    onDisconnect: { addListener: () => {} },
  };

  globalThis.self = globalThis;
  globalThis.chrome = {
    runtime: {
      lastError: undefined,
      connectNative: () => nativePort,
      onConnect: { addListener: (cb) => onConnectListeners.push(cb) },
      onMessage: { addListener: () => {} },
    },
    tabs: { onRemoved: { addListener: (cb) => tabRemovedListeners.push(cb) } },
  };

  const url = pathToFileURL(join(ext, 'background.js')).href + `?t=${Math.random()}`;
  await import(url);

  let onMsg = null;
  const port = {
    name: 'idm-content',
    sender: { tab: { id: 11, url: 'https://example.com/page' } },
    onMessage: { addListener: (cb) => (onMsg = cb) },
    onDisconnect: { addListener: () => {} },
    postMessage: () => {},
  };
  for (const cb of onConnectListeners) cb(port);
  assert.ok(onMsg, 'background must listen on the idm-content port');

  return {
    posted,
    tabRemovedListeners,
    /** Deliver a content.js opcode and let the settings round trip settle. */
    async send(msg, sender) {
      if (sender) port.sender = sender;
      onMsg(msg);
      for (let i = 0; i < 20; i++) await new Promise((r) => setTimeout(r, 5));
    },
    downloads: () => posted.filter((m) => m.action === 'download'),
    settingsCalls: () => posted.filter((m) => m.action === 'get_settings'),
  };
}

const CAPTURE_BIN = [39, true, 'https://cdn.example.com/file.bin', 'file.bin'];
const CAPTURE_TXT = [39, true, 'https://cdn.example.com/notes.txt', 'notes.txt'];

test('a capture of a listed file type is forwarded with the configured connections', async () => {
  const bg = await loadBackground();
  await bg.send(CAPTURE_BIN);

  const reqs = bg.downloads();
  assert.equal(reqs.length, 1, `expected one download, got ${JSON.stringify(bg.posted)}`);
  assert.equal(reqs[0].url, CAPTURE_BIN[2]);
  assert.equal(reqs[0].connections, 6, 'connections must come from max_connections');
});

test('a file type that is not on the auto list is dropped', async () => {
  const bg = await loadBackground();
  await bg.send(CAPTURE_TXT);
  assert.deepEqual(bg.downloads(), []);
});

test('a capture from an excluded site is dropped', async () => {
  const bg = await loadBackground();
  await bg.send(CAPTURE_BIN, { tab: { id: 11, url: 'https://www.blocked.com/page' } });
  assert.deepEqual(bg.downloads(), []);
});

test('a capture of an excluded address is dropped', async () => {
  const bg = await loadBackground();
  await bg.send([39, true, 'https://cdn.example.com/ads/banner.bin', 'banner.bin']);
  assert.deepEqual(bg.downloads(), []);
});

test('holding the force key sends a type that is not on the auto list', async () => {
  const bg = await loadBackground();
  await bg.send([31, 17, true]); // Ctrl down
  await bg.send(CAPTURE_TXT);
  assert.equal(bg.downloads().length, 1, 'the force key must override the file type filter');
});

test('releasing the force key restores the filter', async () => {
  const bg = await loadBackground();
  await bg.send([31, 17, true]);
  await bg.send([31, 17, false]);
  await bg.send(CAPTURE_TXT);
  assert.deepEqual(bg.downloads(), []);
});

test('holding the prevent key drops a type that IS on the auto list', async () => {
  const bg = await loadBackground();
  await bg.send([31, 18, true]); // Alt down
  await bg.send(CAPTURE_BIN);
  assert.deepEqual(bg.downloads(), []);
});

test('keys held in another tab do not affect this one', async () => {
  const bg = await loadBackground();
  await bg.send([31, 18, true], { tab: { id: 99, url: 'https://example.com/other' } }); // Alt in tab 99
  await bg.send(CAPTURE_BIN, { tab: { id: 11, url: 'https://example.com/page' } });
  assert.equal(bg.downloads().length, 1, 'tab 11 never held Alt');
});

test('closing a tab forgets the keys it held', async () => {
  const bg = await loadBackground();
  await bg.send([31, 18, true]);
  assert.ok(bg.tabRemovedListeners.length >= 1, 'background must listen on tabs.onRemoved');
  for (const cb of bg.tabRemovedListeners) cb(11, {});
  await bg.send(CAPTURE_BIN);
  assert.equal(bg.downloads().length, 1, 'the stale Alt must not survive the tab');
});

test('the settings are fetched once and reused across captures', async () => {
  const bg = await loadBackground();
  await bg.send(CAPTURE_BIN);
  await bg.send(CAPTURE_BIN);
  assert.equal(bg.downloads().length, 2);
  assert.equal(bg.settingsCalls().length, 1, 'get_settings must be cached');
});

test('when the host has no settings file the built-in defaults apply', async () => {
  const bg = await loadBackground(null); // source "default"
  await bg.send([39, true, 'https://cdn.example.com/movie.mp4', 'movie.mp4']);
  await bg.send([39, true, 'https://cdn.example.com/page.html', 'page.html']);
  const reqs = bg.downloads();
  assert.equal(reqs.length, 1, 'mp4 is a default auto type, html is not');
  assert.match(reqs[0].url, /movie\.mp4$/);
  assert.equal(reqs[0].connections, 8, 'the default max_connections');
});
