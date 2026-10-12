// Tests for the media UI layer: schema builders for format listing, the
// manifest wiring for the popup ("nabídka"), and that the popup script parses
// and actually talks to the background about formats + downloads.
//
// Runs with: node --test extension/test/media_ui.test.mjs

import test from 'node:test';
import assert from 'node:assert/strict';
import { readFileSync, existsSync, statSync } from 'node:fs';
import { execFileSync } from 'node:child_process';
import { fileURLToPath } from 'node:url';
import { dirname, join } from 'node:path';
import { tmpdir } from 'node:os';

const here = dirname(fileURLToPath(import.meta.url));
const ext = join(here, '..');
const schemaPath = join(ext, 'schema.js');
const manifestPath = join(ext, 'manifest.json');
const popupJs = join(ext, 'popup.js');
const popupHtml = join(ext, 'popup.html');

async function schema() {
  return import(schemaPath + `?t=${Date.now()}`);
}

function nodeCheck(file, asModule) {
  let target = file;
  if (asModule && file.endsWith('.js')) {
    target = join(tmpdir(), `idmcheck_${process.pid}_${Math.random().toString(16).slice(2)}.mjs`);
    execFileSync('cp', [file, target]);
  }
  execFileSync('node', ['--check', target], { stdio: 'pipe' });
}

// ---- schema: format listing + media download options ----

test('buildListFormats produces the host list_formats request', async () => {
  const { buildListFormats, HOST_ACTIONS } = await schema();
  assert.equal(HOST_ACTIONS.LIST_FORMATS, 'list_formats');

  const r = buildListFormats({ url: 'https://youtu.be/abc' });
  assert.deepEqual(r, { action: 'list_formats', url: 'https://youtu.be/abc' });

  const r2 = buildListFormats({ url: 'https://x/y', cookie: 'a=b', referer: 'https://r/' });
  assert.equal(r2.action, 'list_formats');
  assert.equal(r2.cookie, 'a=b');
  assert.equal(r2.referer, 'https://r/');

  for (const bad of ['ftp://x/y', 'file:///etc/passwd', 'javascript:alert(1)']) {
    assert.throws(() => buildListFormats({ url: bad }), /scheme|http/i, `must reject ${bad}`);
  }
  assert.throws(() => buildListFormats({}), /url/i);
});

test('normalizeFormats returns a stable shape and tolerates junk', async () => {
  const { normalizeFormats } = await schema();

  const good = normalizeFormats({
    ok: true,
    id: 'abc',
    title: 'My Video',
    formats: [{ format_id: '22', ext: 'mp4' }, { format_id: '140', ext: 'm4a' }],
  });
  assert.equal(good.title, 'My Video');
  assert.equal(good.id, 'abc');
  assert.equal(good.formats.length, 2);
  assert.equal(good.formats[1].format_id, '140');

  const junk = normalizeFormats(null);
  assert.equal(junk.title, null);
  assert.equal(junk.id, null);
  assert.deepEqual(junk.formats, []);

  const partial = normalizeFormats({ formats: 'nope' });
  assert.deepEqual(partial.formats, []);
});

test('buildDownload carries media options and keeps plain downloads plain', async () => {
  const { buildDownload } = await schema();

  const plain = buildDownload({ url: 'https://example.com/a.zip', connections: 4 });
  assert.deepEqual(plain, { action: 'download', url: 'https://example.com/a.zip', connections: 4 });
  assert.ok(!('format' in plain), 'plain download must not carry media fields');
  assert.ok(!('force_media' in plain));

  const media = buildDownload({
    url: 'https://youtu.be/abc',
    format: '140',
    forceMedia: true,
    limitRate: 2000,
    cookie: 'a=b',
    referer: 'https://r/',
  });
  assert.equal(media.action, 'download');
  assert.equal(media.format, '140');
  assert.equal(media.force_media, true);
  assert.equal(media.limit_rate, 2000);
  assert.equal(media.cookie, 'a=b');
  assert.equal(media.referer, 'https://r/');

  assert.throws(() => buildDownload({ url: 'https://x/y', format: '' }), /format/i);
  assert.throws(() => buildDownload({ url: 'https://x/y', limitRate: -5 }), /limitRate/i);

  const cat = buildDownload({ url: 'https://example.com/movie.mp4', categoryDir: '/root/Downloads' });
  assert.equal(cat.category_dir, '/root/Downloads');
  assert.ok(!('category_dir' in plain), 'plain download must not carry category_dir');

  const dyn = buildDownload({ url: 'https://example.com/big.bin', dynamic: true, minSplit: 500000 });
  assert.equal(dyn.dynamic, true);
  assert.equal(dyn.min_split, 500000);
  assert.ok(!('dynamic' in plain), 'plain download must not carry dynamic');
  assert.throws(() => buildDownload({ url: 'https://x/y', minSplit: -1 }), /minSplit/i);
});

// ---- manifest: the popup is wired as the "nabídka" ----

test('manifest exposes the popup as the extension action', () => {
  const m = JSON.parse(readFileSync(manifestPath, 'utf8'));
  assert.ok(m.action, 'manifest must declare an action');
  assert.equal(m.action.default_popup, 'popup.html');
  assert.ok(m.action.default_title, 'action should have a title');
  assert.ok(existsSync(popupHtml), 'popup.html must exist');
  const st = statSync(popupHtml);
  assert.ok(st.size > 0, 'popup.html must not be empty');
});

test('popup scripts parse and reference the media flow', () => {
  assert.ok(existsSync(popupJs), 'popup.js must exist');
  nodeCheck(popupJs, false);
  const src = readFileSync(popupJs, 'utf8');
  assert.ok(/chrome\.tabs/.test(src), 'popup should read the active tab URL');
  assert.ok(/list_formats/.test(src), 'popup must ask for formats');
  assert.ok(/format/.test(src), 'popup must send the chosen format');
  assert.ok(/download/.test(src), 'popup must be able to trigger a download');

  const html = readFileSync(popupHtml, 'utf8');
  assert.ok(/popup\.js/.test(html), 'popup.html must load popup.js');
  assert.ok(/<select|list/i.test(html), 'popup.html should offer a format selection');
});
