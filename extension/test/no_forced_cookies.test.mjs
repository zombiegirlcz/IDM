// The extension must not ask for browser cookies on its own.
//
// 2.1.x hard-coded `cookies_from_browser: "chrome"` into every download and
// format listing. yt-dlp then sent whatever (often rotated, stale) YouTube
// account cookies Chrome held, which turns an anonymous request that works
// into one that is refused. Cookies are opt-in: only a caller that names a
// browser explicitly gets the flag.
//
// Runs with: node --test extension/test/no_forced_cookies.test.mjs

import test from 'node:test';
import assert from 'node:assert/strict';
import { fileURLToPath, pathToFileURL } from 'node:url';
import { dirname, join } from 'node:path';

const ext = join(dirname(fileURLToPath(import.meta.url)), '..');

async function loadBackground() {
  const posted = [];
  const listeners = [];
  const runtimeListeners = [];
  const settings = {
    file_types: { auto: [], exclude_sites: [], exclude_addresses: [] },
    general: { force_keys: 'Ctrl', prevent_keys: 'Alt' },
    connection: { max_connections: 5 },
  };
  const nativePort = {
    postMessage(m) {
      posted.push(m);
      const reply = m.action === 'get_settings'
        ? { ok: true, source: 'file', settings, id: m.id }
        : { ok: true, id: m.id, formats: [] };
      setTimeout(() => { for (const cb of listeners) cb(reply); }, 0);
    },
    onMessage: { addListener: (cb) => listeners.push(cb) },
    onDisconnect: { addListener: () => {} },
  };
  globalThis.self = globalThis;
  globalThis.chrome = {
    runtime: {
      lastError: undefined,
      connectNative: () => nativePort,
      onConnect: { addListener: () => {} },
      onMessage: { addListener: (cb) => runtimeListeners.push(cb) },
      onInstalled: { addListener: () => {} },
    },
    contextMenus: {
      create: () => {},
      removeAll: (cb) => (cb ? cb() : undefined),
      onClicked: { addListener: () => {} },
    },
    tabs: { onRemoved: { addListener: () => {} }, sendMessage: () => Promise.resolve({ ok: true, links: [] }) },
  };
  await import(pathToFileURL(join(ext, 'background.js')).href + `?t=${Math.random()}`);
  const ask = (msg) => new Promise((resolve) => {
    for (const cb of runtimeListeners) cb(msg, {}, resolve);
    setTimeout(resolve, 100);
  });
  return { posted, ask };
}

test('a download from the popup carries no cookies_from_browser by default', async () => {
  const bg = await loadBackground();
  await bg.ask({ type: 'download', url: 'https://www.youtube.com/watch?v=abc', forceMedia: true });
  const req = bg.posted.find((m) => m.action === 'download');
  assert.ok(req, `no download reached the host: ${JSON.stringify(bg.posted)}`);
  assert.equal('cookies_from_browser' in req, false, JSON.stringify(req));
});

test('a format listing carries no cookies_from_browser by default', async () => {
  const bg = await loadBackground();
  await bg.ask({ type: 'list_formats', url: 'https://www.youtube.com/watch?v=abc' });
  const req = bg.posted.find((m) => m.action === 'list_formats');
  assert.ok(req, `no list_formats reached the host: ${JSON.stringify(bg.posted)}`);
  assert.equal('cookies_from_browser' in req, false, JSON.stringify(req));
});

test('a caller that names a browser still gets it passed through', async () => {
  const bg = await loadBackground();
  await bg.ask({ type: 'download', url: 'https://www.youtube.com/watch?v=abc', cookiesFromBrowser: 'firefox' });
  const req = bg.posted.find((m) => m.action === 'download');
  assert.equal(req.cookies_from_browser, 'firefox');
});
