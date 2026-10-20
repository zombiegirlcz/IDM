// When the window is running, the host hands a download to its queue and
// answers at once with {queued:true, gui_id}. The popup has to say where the
// download went -- "hotovo: (undefined B)" told the user nothing and made it
// look as if nothing had happened.
//
// Runs with: node --test extension/test/popup_queued.test.mjs

import test from 'node:test';
import assert from 'node:assert/strict';
import { readFileSync } from 'node:fs';
import { fileURLToPath } from 'node:url';
import { dirname, join } from 'node:path';
import { JSDOM } from 'jsdom';

const ext = join(dirname(fileURLToPath(import.meta.url)), '..');
const HTML = readFileSync(join(ext, 'popup.html'), 'utf8').replace(/<script[^>]*><\/script>/g, '');
const POPUP = readFileSync(join(ext, 'popup.js'), 'utf8');

function runPopup(downloadReply) {
  const dom = new JSDOM(HTML, { url: 'chrome-extension://x/popup.html', runScripts: 'outside-only' });
  dom.window.chrome = {
    runtime: {
      lastError: undefined,
      sendMessage: (m, cb) => {
        if (m.type === 'list_formats') cb({ ok: true, formats: [{ format_id: '18', ext: 'mp4' }] });
        else if (m.type === 'download') cb(downloadReply);
      },
    },
    tabs: { query: (_q, cb) => cb([{ url: 'https://www.youtube.com/watch?v=abc' }]) },
  };
  dom.window.eval(POPUP);
  dom.window.document.getElementById('download').click();
  return dom.window.document.getElementById('status').textContent;
}

test('a download handed to the window says so', () => {
  const text = runPopup({ ok: true, queued: true, gui_id: 7, output: '/home/u/Downloads/watch' });
  assert.match(text, /okn/i, text);
  assert.doesNotMatch(text, /undefined/, text);
});

test('a download the host finished itself still reports the file', () => {
  const text = runPopup({ ok: true, output: '/d/x.bin', size: 5 });
  assert.match(text, /hotovo: \/d\/x\.bin \(5 B\)/, text);
});
