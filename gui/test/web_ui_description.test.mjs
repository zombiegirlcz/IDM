// The engine's own web UI (what `idm --serve` serves at GET /) has to show the
// `description` field, the same free-form note the native Tk GUI keeps in its
// Description column -- and let you edit it. The field already exists on
// Item and POST /api/update already stores it; only the served page ignored
// it, so the note was invisible (and unreachable) to anyone using the web UI.
//
// The page is an embedded string literal in engine/src/gui.rs, so this test
// lifts INDEX_HTML out of the source and runs its real JS in jsdom against a
// stub of our own /api endpoints. No cargo, no toolchain.
//
// Runs with: node --test gui/test/web_ui_description.test.mjs

import test from 'node:test';
import assert from 'node:assert/strict';
import { readFileSync } from 'node:fs';
import { fileURLToPath } from 'node:url';
import { dirname, join } from 'node:path';
import { JSDOM } from 'jsdom';

const here = dirname(fileURLToPath(import.meta.url));
const guiRs = join(here, '..', '..', 'engine', 'src', 'gui.rs');
const MARK = 'const INDEX_HTML: &str = r#"';

/** The INDEX_HTML raw string literal, as served (token already substituted). */
function indexHtml() {
  const src = readFileSync(guiRs, 'utf8');
  const start = src.indexOf(MARK);
  assert.notEqual(start, -1, 'INDEX_HTML not found in engine/src/gui.rs');
  const end = src.indexOf('"#;', start);
  assert.notEqual(end, -1, 'INDEX_HTML literal is not terminated');
  return src.slice(start + MARK.length, end).replace('__IDM_TOKEN__', 'test-token');
}

/**
 * Loads the page, runs its script with fetch stubbed, and returns the window
 * plus the list of POSTs the page made.
 */
async function load(items) {
  const html = indexHtml();
  const dom = new JSDOM(html, { runScripts: 'outside-only', url: 'http://127.0.0.1:1/' });
  const w = dom.window;
  const posts = [];
  w.fetch = async (path, o) => {
    if (o && o.method === 'POST') {
      posts.push({ path, headers: o.headers, body: JSON.parse(o.body) });
      return { json: async () => ({ ok: true }) };
    }
    if (path === '/api/items') return { json: async () => ({ items }) };
    return { json: async () => ({}) };
  };
  w.setInterval = () => 0; // no polling timer in a test
  const script = html.slice(html.lastIndexOf('<script>') + 8, html.lastIndexOf('</script>'));
  w.eval(script);
  // refresh() is async; let its microtasks settle.
  await new Promise(r => setTimeout(r, 50));
  return { w, posts };
}

const ITEM = {
  id: 7,
  url: 'https://example.test/big.bin',
  status: 'paused',
  downloaded: 1024,
  total: 4096,
  error: '',
  description: 'a note from the Properties dialog',
};

test('the queue table has a Description column', async () => {
  const { w } = await load([ITEM]);
  const heads = [...w.document.querySelectorAll('thead th')].map(th => th.textContent.trim());
  assert.ok(
    heads.some(h => /^(Description|Popis)$/i.test(h)),
    `no description column header, got: ${JSON.stringify(heads)}`,
  );
});

test('a row shows the item description, editably', async () => {
  const { w } = await load([ITEM]);
  const row = w.document.querySelector('#rows tr');
  assert.ok(row, 'no row rendered');
  const field = row.querySelector('[data-a="desc"]');
  assert.ok(field, 'row has no description editor (data-a="desc")');
  assert.equal(field.value, ITEM.description);
});

test('editing the description POSTs it to /api/update', async () => {
  const { w, posts } = await load([ITEM]);
  const field = w.document.querySelector('#rows [data-a="desc"]');
  field.value = 'edited in the web UI';
  field.dispatchEvent(new w.Event('change', { bubbles: true }));
  await new Promise(r => setTimeout(r, 50));
  const upd = posts.filter(p => p.path === '/api/update');
  assert.equal(upd.length, 1, `expected one /api/update POST, got ${JSON.stringify(posts)}`);
  assert.deepEqual(upd[0].body, { id: 7, description: 'edited in the web UI' });
  // The CSRF guard in authorized() is tied to POST + the token header.
  assert.equal(upd[0].headers['X-IDM-Token'], 'test-token');
});

test('a description with HTML in it is not injected into the page', async () => {
  const { w } = await load([{ ...ITEM, description: '<img src=x onerror=1>' }]);
  const field = w.document.querySelector('#rows [data-a="desc"]');
  assert.equal(field.value, '<img src=x onerror=1>');
  assert.equal(w.document.querySelector('#rows img'), null, 'description was interpolated as HTML');
});

test('the polling refresh does not clobber a description being typed', async () => {
  const { w } = await load([ITEM]);
  const field = w.document.querySelector('#rows [data-a="desc"]');
  field.focus();
  field.value = 'half-typed';
  w.eval('refresh()');
  await new Promise(r => setTimeout(r, 50));
  const after = w.document.querySelector('#rows [data-a="desc"]');
  assert.equal(after.value, 'half-typed', 'refresh wiped an in-progress edit');
});
