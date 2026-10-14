// The "Download with IDM" context menu.
//
// Two properties matter. First, an explicit click is a COMMAND, not a capture:
// the file-type and exclusion filters that govern automatic capture must not
// make a menu item quietly do nothing. Second, "Download all links with IDM"
// has to ask the page for the links in the selection, because Chrome hands the
// background only `selectionText`.
//
// Runs with: node --test extension/test/context_menu.test.mjs

import test from 'node:test';
import assert from 'node:assert/strict';
import { fileURLToPath, pathToFileURL } from 'node:url';
import { dirname, join } from 'node:path';

const ext = join(dirname(fileURLToPath(import.meta.url)), '..');

// Filters that would block everything, to prove the menu ignores them.
const STRICT_SETTINGS = {
  file_types: {
    auto: ['nothing'],
    exclude_sites: ['*'],
    exclude_addresses: ['*'],
  },
  general: { force_keys: 'Ctrl', prevent_keys: 'Alt' },
  connection: { max_connections: 5 },
};

async function loadBackground({ settings = STRICT_SETTINGS, links = [] } = {}) {
  const posted = [];
  const created = [];
  const sentToTab = [];
  const listeners = [];
  const installedListeners = [];
  const menuClickListeners = [];

  const nativePort = {
    postMessage(m) {
      posted.push(m);
      const reply =
        m.action === 'get_settings'
          ? { ok: true, source: 'file', settings, id: m.id }
          : { ok: true, id: m.id };
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
      onConnect: { addListener: () => {} },
      onMessage: { addListener: () => {} },
      onInstalled: { addListener: (cb) => installedListeners.push(cb) },
    },
    contextMenus: {
      create: (spec) => created.push(spec),
      removeAll: (cb) => (cb ? cb() : undefined),
      onClicked: { addListener: (cb) => menuClickListeners.push(cb) },
    },
    tabs: {
      onRemoved: { addListener: () => {} },
      // The content script answers with the hrefs inside the selection.
      sendMessage: (tabId, msg) => {
        sentToTab.push({ tabId, msg });
        return Promise.resolve({ ok: true, links });
      },
    },
  };

  await import(pathToFileURL(join(ext, 'background.js')).href + `?t=${Math.random()}`);

  return {
    created,
    sentToTab,
    installedListeners,
    menuClickListeners,
    install: () => {
      assert.ok(installedListeners.length >= 1, 'background must listen on runtime.onInstalled');
      for (const cb of installedListeners) cb({ reason: 'install' });
    },
    async click(info, tab) {
      assert.ok(menuClickListeners.length >= 1, 'background must listen on contextMenus.onClicked');
      for (const cb of menuClickListeners) cb(info, tab);
      for (let i = 0; i < 30; i++) await new Promise((r) => setTimeout(r, 5));
    },
    downloads: () => posted.filter((m) => m.action === 'download'),
  };
}

test('both menu items are registered, on a link and on a selection', async () => {
  const bg = await loadBackground();
  bg.install();

  const link = bg.created.find((m) => (m.contexts || []).includes('link'));
  assert.ok(link, `no link menu item, got: ${JSON.stringify(bg.created)}`);
  assert.match(link.title, /download with idm/i);

  const sel = bg.created.find((m) => (m.contexts || []).includes('selection'));
  assert.ok(sel, `no selection menu item, got: ${JSON.stringify(bg.created)}`);
  assert.match(sel.title, /links/i);

  assert.notEqual(link.id, sel.id, 'the two items need distinct ids');
});

test('a link click downloads even when every filter would reject it', async () => {
  const bg = await loadBackground();
  bg.install();
  await bg.click(
    { menuItemId: 'idm-link', linkUrl: 'https://blocked.example.com/readme.txt' },
    { id: 3, url: 'https://blocked.example.com/page' },
  );

  const reqs = bg.downloads();
  assert.equal(reqs.length, 1, `an explicit click must download, got ${JSON.stringify(reqs)}`);
  assert.equal(reqs[0].url, 'https://blocked.example.com/readme.txt');
  assert.equal(reqs[0].connections, 5, 'connections still come from the settings');
});

test('a selection click asks the page and downloads every link it reports', async () => {
  const bg = await loadBackground({
    links: [
      'https://ex.com/a.zip',
      'https://ex.com/b.txt',
      'https://ex.com/c.bin',
    ],
  });
  bg.install();
  await bg.click(
    { menuItemId: 'idm-selection', selectionText: 'three links' },
    { id: 7, url: 'https://ex.com/list' },
  );

  assert.equal(bg.sentToTab.length, 1, 'the background must ask the page for the links');
  assert.equal(bg.sentToTab[0].tabId, 7);

  const urls = bg.downloads().map((m) => m.url);
  assert.deepEqual(urls.sort(), [
    'https://ex.com/a.zip',
    'https://ex.com/b.txt',
    'https://ex.com/c.bin',
  ]);
});

test('duplicate and non-http links in a selection are dropped', async () => {
  const bg = await loadBackground({
    links: [
      'https://ex.com/a.zip',
      'https://ex.com/a.zip',
      'javascript:alert(1)',
      'mailto:a@b.c',
      'ftp://ex.com/x.zip',
    ],
  });
  bg.install();
  await bg.click({ menuItemId: 'idm-selection' }, { id: 7, url: 'https://ex.com/list' });

  assert.deepEqual(bg.downloads().map((m) => m.url), ['https://ex.com/a.zip']);
});

test('a huge selection is capped instead of flooding the host', async () => {
  const links = Array.from({ length: 250 }, (_, i) => `https://ex.com/f${i}.zip`);
  const bg = await loadBackground({ links });
  bg.install();
  await bg.click({ menuItemId: 'idm-selection' }, { id: 7, url: 'https://ex.com/list' });

  assert.equal(bg.downloads().length, 100, 'at most 100 links per selection');
});

test('a selection with no links downloads nothing', async () => {
  const bg = await loadBackground({ links: [] });
  bg.install();
  await bg.click({ menuItemId: 'idm-selection' }, { id: 7, url: 'https://ex.com/list' });
  assert.deepEqual(bg.downloads(), []);
});
