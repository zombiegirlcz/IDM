// A download request must not time out while the host is still working.
//
// The host answers a download only when the file is complete. A YouTube video
// takes minutes, and the 30 s watchdog turned every such download into
// "cannot_contact_idm" while it was in fact running. A dead host is reported
// by the port's onDisconnect, so the download needs no timer of its own.
//
// Runs with: node --test extension/test/long_download.test.mjs

import test, { mock } from 'node:test';
import assert from 'node:assert/strict';
import { fileURLToPath, pathToFileURL } from 'node:url';
import { dirname, join } from 'node:path';

const ext = join(dirname(fileURLToPath(import.meta.url)), '..');

test('a download outlives the watchdog that guards quick requests', async () => {
  mock.timers.enable({ apis: ['setTimeout'] });
  const posted = [];
  const runtimeListeners = [];
  globalThis.self = globalThis;
  globalThis.chrome = {
    runtime: {
      lastError: undefined,
      connectNative: () => ({
        postMessage: (m) => posted.push(m), // never answers: still downloading
        onMessage: { addListener: () => {} },
        onDisconnect: { addListener: () => {} },
      }),
      onConnect: { addListener: () => {} },
      onMessage: { addListener: (cb) => runtimeListeners.push(cb) },
      onInstalled: { addListener: () => {} },
    },
    contextMenus: { create: () => {}, removeAll: (cb) => cb && cb(), onClicked: { addListener: () => {} } },
    tabs: { onRemoved: { addListener: () => {} } },
  };
  await import(pathToFileURL(join(ext, 'background.js')).href + `?t=${Math.random()}`);
  const replies = [];
  for (const cb of runtimeListeners) {
    cb({ type: 'download', url: 'https://www.youtube.com/watch?v=abc', forceMedia: true }, {}, (r) => replies.push(r));
  }
  for (let i = 0; i < 5; i++) await Promise.resolve();
  await new Promise((r) => setImmediate(r));
  assert.ok(posted.some((m) => m.action === 'download'), JSON.stringify(posted));
  mock.timers.tick(30 * 60 * 1000); // half an hour of video
  await new Promise((r) => setImmediate(r));
  assert.deepEqual(replies, [], `the download was given up on: ${JSON.stringify(replies)}`);
  mock.timers.reset();
});
