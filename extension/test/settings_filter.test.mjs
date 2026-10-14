// Pure capture-decision logic (no chrome.*, no host): extension/settings.js.
//
// The extension learns about settings.json through the native host's
// `get_settings` action; this file covers what it then DOES with the answer —
// the six outcomes of shouldCapture(), the glob patterns behind
// exclude_sites/exclude_addresses, the free-text force/prevent key parser, and
// the defaults used when the host has nothing to offer.
//
// Runs with: node --test extension/test/settings_filter.test.mjs

import test from 'node:test';
import assert from 'node:assert/strict';
import {
  DEFAULT_CAPTURE_SETTINGS,
  normalizeCaptureSettings,
  parseKeySpec,
  shouldCapture,
} from '../settings.js';

// A settings object with just the fields a case cares about.
function cfg(over = {}) {
  return normalizeCaptureSettings({
    file_types: { auto: ['zip', 'mp4'], exclude_sites: [], exclude_addresses: [] },
    general: { force_keys: 'Ctrl', prevent_keys: 'Alt' },
    connection: { max_connections: 8 },
    ...over,
  });
}

const CTRL = 17;
const ALT = 18;
const SHIFT = 16;

// --- the six outcomes, in precedence order -------------------------------- //

test('an extension on the auto list is captured', () => {
  const r = shouldCapture({ url: 'https://ex.com/a/file.zip', settings: cfg() });
  assert.deepEqual(r, { capture: true, reason: 'auto_type' });
});

test('an extension not on the auto list is not captured', () => {
  const r = shouldCapture({ url: 'https://ex.com/a/file.txt', settings: cfg() });
  assert.deepEqual(r, { capture: false, reason: 'not_auto_type' });
});

test('a URL with no extension is not captured', () => {
  const r = shouldCapture({ url: 'https://ex.com/download', settings: cfg() });
  assert.equal(r.capture, false);
  assert.equal(r.reason, 'not_auto_type');
});

test('the excluded site of the PAGE blocks an otherwise auto type', () => {
  const settings = cfg({
    file_types: { auto: ['zip'], exclude_sites: ['*.example.com'], exclude_addresses: [] },
  });
  const r = shouldCapture({
    url: 'https://cdn.other.net/f.zip',
    pageUrl: 'https://www.example.com/page',
    settings,
  });
  assert.deepEqual(r, { capture: false, reason: 'excluded_site' });
});

test('an excluded address beats an excluded site, and both beat the auto list', () => {
  const settings = cfg({
    file_types: { auto: ['zip'], exclude_sites: ['*.example.com'], exclude_addresses: ['*/ads/*'] },
  });
  const r = shouldCapture({
    url: 'https://example.com/ads/f.zip',
    pageUrl: 'https://example.com/p',
    settings,
  });
  assert.deepEqual(r, { capture: false, reason: 'excluded_address' });
});

test('the force key captures a file type that is not on the auto list', () => {
  const r = shouldCapture({
    url: 'https://ex.com/f.txt',
    settings: cfg(),
    heldKeys: [CTRL],
  });
  assert.deepEqual(r, { capture: true, reason: 'force_key' });
});

test('the force key overrides an excluded site', () => {
  const settings = cfg({
    file_types: { auto: [], exclude_sites: ['example.com'], exclude_addresses: [] },
  });
  const r = shouldCapture({
    url: 'https://example.com/f.txt',
    pageUrl: 'https://example.com/p',
    settings,
    heldKeys: [CTRL],
  });
  assert.equal(r.capture, true);
  assert.equal(r.reason, 'force_key');
});

test('the prevent key blocks a file type that IS on the auto list', () => {
  const r = shouldCapture({
    url: 'https://ex.com/f.zip',
    settings: cfg(),
    heldKeys: [ALT],
  });
  assert.deepEqual(r, { capture: false, reason: 'prevent_key' });
});

test('prevent wins when both keys are configured to the same key', () => {
  const settings = cfg({ general: { force_keys: 'Ctrl', prevent_keys: 'Ctrl' } });
  const r = shouldCapture({ url: 'https://ex.com/f.zip', settings, heldKeys: [CTRL] });
  assert.deepEqual(r, { capture: false, reason: 'prevent_key' });
});

// --- site / address patterns ---------------------------------------------- //

test('an exclude_sites entry without a wildcard matches only that exact host', () => {
  const settings = cfg({
    file_types: { auto: ['zip'], exclude_sites: ['example.com'], exclude_addresses: [] },
  });
  const blocked = shouldCapture({ url: 'https://example.com/f.zip', settings });
  const allowed = shouldCapture({ url: 'https://cdn.example.com/f.zip', settings });
  assert.equal(blocked.capture, false);
  assert.equal(allowed.capture, true);
});

test('site and extension matching ignore case', () => {
  const settings = cfg({
    file_types: { auto: ['ZIP'], exclude_sites: ['EXAMPLE.com'], exclude_addresses: [] },
  });
  assert.equal(shouldCapture({ url: 'https://Example.COM/f.Zip', settings }).capture, false);
  assert.equal(shouldCapture({ url: 'https://other.net/f.ZIP', settings }).capture, true);
});

test('a pattern metacharacter is matched literally, not as a regex', () => {
  const settings = cfg({
    file_types: { auto: ['zip'], exclude_sites: [], exclude_addresses: ['*/a.b/*'] },
  });
  assert.equal(shouldCapture({ url: 'https://ex.com/a.b/f.zip', settings }).capture, false);
  assert.equal(shouldCapture({ url: 'https://ex.com/axb/f.zip', settings }).capture, true);
});

test('the query string is not part of the extension', () => {
  const settings = cfg({ file_types: { auto: ['zip'], exclude_sites: [], exclude_addresses: [] } });
  assert.equal(shouldCapture({ url: 'https://ex.com/f.zip?token=1#x', settings }).capture, true);
  assert.equal(shouldCapture({ url: 'https://ex.com/f?name=a.zip', settings }).capture, false);
});

test('the site falls back to the download URL when there is no page URL', () => {
  const settings = cfg({
    file_types: { auto: ['zip'], exclude_sites: ['example.com'], exclude_addresses: [] },
  });
  assert.equal(shouldCapture({ url: 'https://example.com/f.zip', settings }).capture, false);
});

// --- key spec parser ------------------------------------------------------ //

test('parseKeySpec maps the three modifier names to key codes', () => {
  assert.deepEqual(parseKeySpec('Ctrl'), [CTRL]);
  assert.deepEqual(parseKeySpec('alt'), [ALT]);
  assert.deepEqual(parseKeySpec('SHIFT'), [SHIFT]);
});

test('parseKeySpec drops names it does not know', () => {
  assert.deepEqual(parseKeySpec('Ctrl+Meta'), [CTRL]);
  assert.deepEqual(parseKeySpec('Insert'), []);
});

test('parseKeySpec treats empty and missing specs as no rule', () => {
  assert.deepEqual(parseKeySpec(''), []);
  assert.deepEqual(parseKeySpec('  '), []);
  assert.deepEqual(parseKeySpec(undefined), []);
});

test('an empty key spec never fires, even with keys held', () => {
  const settings = cfg({ general: { force_keys: '', prevent_keys: '' } });
  const r = shouldCapture({ url: 'https://ex.com/f.zip', settings, heldKeys: [CTRL, ALT] });
  assert.deepEqual(r, { capture: true, reason: 'auto_type' });
});

test('a combination rule needs every key held', () => {
  const settings = cfg({ general: { force_keys: 'Ctrl+Shift', prevent_keys: 'Alt' } });
  const partial = shouldCapture({ url: 'https://ex.com/f.txt', settings, heldKeys: [CTRL] });
  const full = shouldCapture({ url: 'https://ex.com/f.txt', settings, heldKeys: [CTRL, SHIFT] });
  assert.equal(partial.capture, false);
  assert.equal(full.capture, true);
});

// --- defaults and normalization ------------------------------------------- //

test('a null settings object falls back to the built-in defaults', () => {
  const r = shouldCapture({ url: 'https://ex.com/f.zip', settings: null });
  assert.equal(r.capture, true);
  assert.ok(DEFAULT_CAPTURE_SETTINGS.file_types.auto.includes('zip'));
});

test('the defaults exclude nothing', () => {
  assert.deepEqual(DEFAULT_CAPTURE_SETTINGS.file_types.exclude_sites, []);
  assert.deepEqual(DEFAULT_CAPTURE_SETTINGS.file_types.exclude_addresses, []);
});

test('a field of the wrong type is replaced by its default, keeping the rest', () => {
  const s = normalizeCaptureSettings({
    file_types: { auto: 'zip', exclude_sites: ['a.com'], exclude_addresses: null },
    general: { force_keys: 42, prevent_keys: 'Alt' },
    connection: { max_connections: 'eight' },
  });
  assert.deepEqual(s.file_types.auto, DEFAULT_CAPTURE_SETTINGS.file_types.auto);
  assert.deepEqual(s.file_types.exclude_sites, ['a.com']);
  assert.deepEqual(s.file_types.exclude_addresses, []);
  assert.equal(s.general.force_keys, DEFAULT_CAPTURE_SETTINGS.general.force_keys);
  assert.equal(s.general.prevent_keys, 'Alt');
  assert.equal(s.connection.max_connections, DEFAULT_CAPTURE_SETTINGS.connection.max_connections);
});

test('normalization drops non-string entries from the lists', () => {
  const s = normalizeCaptureSettings({
    file_types: { auto: ['zip', 7, null, 'mp4'], exclude_sites: [1, 'a.com'] },
  });
  assert.deepEqual(s.file_types.auto, ['zip', 'mp4']);
  assert.deepEqual(s.file_types.exclude_sites, ['a.com']);
});

test('a leading dot on an auto entry is tolerated', () => {
  const settings = cfg({ file_types: { auto: ['.zip'] } });
  assert.equal(shouldCapture({ url: 'https://ex.com/f.zip', settings }).capture, true);
});

test('a malformed URL is not captured rather than throwing', () => {
  const r = shouldCapture({ url: 'not a url', settings: cfg() });
  assert.equal(r.capture, false);
});
