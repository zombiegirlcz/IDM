// The one decision in the shared E2E scaffolding: where each browser family
// looks for a native-messaging manifest. Getting it wrong does not fail
// loudly — the browser simply reports that the host does not exist — so it is
// pinned here instead of being discovered by a 3-minute browser test.

import test from 'node:test';
import assert from 'node:assert/strict';
import { nativeHostDirs } from './e2e_fixtures.mjs';

test('Firefox reads one directory, under HOME rather than XDG config', () => {
  const dirs = nativeHostDirs('firefox', { home: '/h', userDataDir: '/u' });
  assert.deepEqual(dirs, ['/h/.mozilla/native-messaging-hosts']);
});

test('Chromium flavours each get their XDG directory', () => {
  const dirs = nativeHostDirs('chromium', { home: '/h', userDataDir: '/u' });
  assert.ok(dirs.includes('/h/.config/chromium/NativeMessagingHosts'));
  assert.ok(dirs.includes('/h/.config/google-chrome/NativeMessagingHosts'));
  assert.ok(dirs.includes('/u/NativeMessagingHosts'), 'and the profile fallback');
});

test('no user data dir means no profile fallback', () => {
  const dirs = nativeHostDirs('chromium', { home: '/h' });
  assert.ok(!dirs.some((d) => d.includes('undefined')));
});
