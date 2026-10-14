// What the committed manifests have to look like for BOTH browser families.
//
// Firefox refuses an MV3 extension whose background is a service worker
// ("background.service_worker is currently disabled. Add background.scripts."),
// and it keys native messaging on the add-on's gecko id rather than on a
// chrome-extension:// origin. Chrome does the opposite on both counts. Rather
// than build two extensions, one manifest carries both halves: each browser
// reads the key it understands and ignores the other.
//
// These are assertions about files that ship, so they cannot drift silently.
//
// Runs with: node --test extension/test/firefox_manifest.test.mjs

import test from 'node:test';
import assert from 'node:assert/strict';
import { readFileSync } from 'node:fs';
import { fileURLToPath } from 'node:url';
import { dirname, join } from 'node:path';

const ext = join(dirname(fileURLToPath(import.meta.url)), '..');
const read = (p) => JSON.parse(readFileSync(join(ext, p), 'utf8'));

const manifest = read('manifest.json');
const CHROME_ID = 'gnhajaopemmibmjhkaafdebogmkkcljc';

test('the background works in both browsers', () => {
  const bg = manifest.background;
  assert.equal(bg.service_worker, 'background.js', 'Chrome MV3 needs the worker');
  assert.deepEqual(bg.scripts, ['background.js'], 'Firefox MV3 needs scripts');
  assert.equal(bg.type, 'module', 'background.js uses ESM imports in both');
});

test('the add-on has a stable gecko id', () => {
  // Native messaging in Firefox is granted per add-on id, so a generated one
  // would mean the host manifest could never name it.
  const gecko = manifest.browser_specific_settings?.gecko;
  assert.ok(gecko, 'browser_specific_settings.gecko is required');
  assert.match(gecko.id, /^[^\s@]+@[^\s@]+$/, `not an add-on id: ${gecko.id}`);
  assert.ok(gecko.strict_min_version, 'MV3 needs a floor, Firefox 115+ territory');
});

test('the pinned Chrome key survives', () => {
  // The Chrome extension id is pinned by `key` and hard-coded in the Chrome
  // host manifest; losing it silently breaks native messaging there.
  assert.ok(manifest.key, 'manifest.key must stay');
});

test('each host manifest names its own browser', () => {
  const chrome = read('com.tonec.idm.json');
  assert.deepEqual(chrome.allowed_origins, [`chrome-extension://${CHROME_ID}/`]);
  assert.equal(chrome.allowed_extensions, undefined, 'Chrome does not read that key');

  const firefox = read('com.tonec.idm.firefox.json');
  assert.deepEqual(
    firefox.allowed_extensions,
    [manifest.browser_specific_settings.gecko.id],
    'the Firefox host must allow exactly the add-on id the manifest declares',
  );
  assert.equal(firefox.allowed_origins, undefined, 'Firefox does not read that key');
  assert.equal(firefox.name, chrome.name, 'same host name in both');
  assert.equal(firefox.type, 'stdio');
});
