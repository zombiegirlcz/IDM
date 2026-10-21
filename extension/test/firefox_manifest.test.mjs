// What the shipped extension manifests have to look like for BOTH browsers.
//
// Firefox refuses an MV3 extension whose background is a service worker
// ("background.service_worker is currently disabled. Add background.scripts."),
// and it keys native messaging on the add-on's gecko id rather than on a
// chrome-extension:// origin. Chrome does the opposite on both counts: it
// warns about `background.scripts` in an MV3 manifest and ignores `key`-less
// gecko settings.
//
// One manifest carrying both halves used to be the answer, and it is exactly
// what produced the warning reported from Windows ("background manifest
// version of 2 or lower") while Firefox refused to start the background at
// all. There are two committed manifests now:
//
//   manifest.json          Chrome / Edge -- service_worker, key, min version
//   manifest.firefox.json  Firefox       -- background.scripts, gecko id
//
// Only the fields each browser actually reads are present, so neither has to
// be tolerant of the other's half. These are assertions about files that
// ship, so they cannot drift silently.
//
// Runs with: node --test extension/test/firefox_manifest.test.mjs

import test from 'node:test';
import assert from 'node:assert/strict';
import { readFileSync } from 'node:fs';
import { fileURLToPath } from 'node:url';
import { dirname, join } from 'node:path';

const ext = join(dirname(fileURLToPath(import.meta.url)), '..');
const read = (p) => JSON.parse(readFileSync(join(ext, p), 'utf8'));

const chrome = read('manifest.json');
const firefox = read('manifest.firefox.json');
const CHROME_ID = 'gnhajaopemmibmjhkaafdebogmkkcljc';

test('the Chrome manifest is plain MV3: worker, no scripts', () => {
  assert.equal(chrome.manifest_version, 3);
  assert.equal(chrome.background.service_worker, 'background.js',
    'Chrome MV3 needs the worker');
  assert.equal(chrome.background.type, 'module',
    'background.js uses ESM imports');
  // Chrome warns "background manifest version of 2 or lower requires a
  // format" when an MV3 manifest also carries `scripts`, so it must not.
  assert.equal(chrome.background.scripts, undefined,
    'Chrome must not see background.scripts');
});

test('the Firefox manifest runs the background as scripts, not a worker', () => {
  assert.equal(firefox.manifest_version, 3);
  assert.deepEqual(firefox.background.scripts, ['background.js'],
    'Firefox MV3 needs scripts');
  assert.equal(firefox.background.service_worker, undefined,
    'Firefox refuses a service worker');
  assert.equal(firefox.background.type, 'module',
    'background.js uses ESM imports');
  // Chrome-only keys have no business in the Firefox file.
  assert.equal(firefox.key, undefined);
  assert.equal(firefox.minimum_chrome_version, undefined);
});

test('both manifests describe the same extension', () => {
  for (const key of ['name', 'version', 'description']) {
    assert.equal(firefox[key], chrome[key], `${key} must agree`);
  }
  assert.deepEqual(firefox.permissions, chrome.permissions);
  assert.deepEqual(firefox.host_permissions, chrome.host_permissions);
  assert.deepEqual(firefox.content_scripts, chrome.content_scripts);
});

test('the add-on has a stable gecko id', () => {
  // Native messaging in Firefox is granted per add-on id, so a generated one
  // would mean the host manifest could never name it.
  const gecko = firefox.browser_specific_settings?.gecko;
  assert.ok(gecko, 'browser_specific_settings.gecko is required');
  assert.match(gecko.id, /^[^\s@]+@[^\s@]+$/, `not an add-on id: ${gecko.id}`);
  assert.ok(gecko.strict_min_version, 'MV3 needs a floor, Firefox 115+ territory');
});

test('the pinned Chrome key survives', () => {
  // The Chrome extension id is pinned by `key` and hard-coded in the Chrome
  // host manifest; losing it silently breaks native messaging there.
  assert.ok(chrome.key, 'manifest.key must stay');
});

test('each host manifest names its own browser', () => {
  const c = read('com.tonec.idm.json');
  assert.deepEqual(c.allowed_origins, [`chrome-extension://${CHROME_ID}/`]);
  assert.equal(c.allowed_extensions, undefined, 'Chrome does not read that key');

  const f = read('com.tonec.idm.firefox.json');
  assert.deepEqual(
    f.allowed_extensions,
    [firefox.browser_specific_settings.gecko.id],
    'the Firefox host must allow exactly the add-on id the manifest declares',
  );
  assert.equal(f.allowed_origins, undefined, 'Firefox does not read that key');
  assert.equal(f.name, c.name, 'same host name in both');
  assert.equal(f.type, 'stdio');
});