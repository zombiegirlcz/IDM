// Tests for the in-page download panel shown over videos.
//
// The user wants: "in the browser, only for videos, a small window with a
// download button." So content.js must inject a small floating panel over each
// <video>, and clicking its button must request a download of that video.
//
// We run content.js in a real DOM (jsdom) like capture_dom.test.mjs, then:
//   * assert a panel element appears over a <video>
//   * assert it has a visible download button
//   * click the button and assert content.js emits opcode 42 (media download
//     requested by the user) carrying the video's src
//   * assert NO panel is injected on a page without media
//
// Runs with: node --test extension/test/panel.test.mjs

import test from 'node:test';
import assert from 'node:assert/strict';
import { readFileSync } from 'node:fs';
import { fileURLToPath } from 'node:url';
import { dirname, join } from 'node:path';
import { JSDOM } from 'jsdom';

const here = dirname(fileURLToPath(import.meta.url));
const ext = join(here, '..');
const CONTENT = readFileSync(join(ext, 'content.js'), 'utf8');

function runContent(html, url = 'https://example.com/') {
  const dom = new JSDOM(html, {
    url,
    runScripts: 'outside-only',
    pretendToBeVisual: true,
  });
  const sent = [];
  const port = {
    postMessage: (m) => sent.push(m),
    onDisconnect: { addListener() {} },
  };
  dom.window.chrome = {
    runtime: {
      connect: () => port,
      lastError: undefined,
      sendMessage: (m, cb) => {
        sent.push(m);
        if (cb) cb({ ok: true });
      },
    },
  };
  dom.window.eval(CONTENT);
  if (sent.length === 0) {
    dom.window.document.dispatchEvent(new dom.window.Event('DOMContentLoaded'));
  }
  return { dom, sent };
}

function hasOp(sent, op) {
  return sent.find((m) => Array.isArray(m) && m[0] === op);
}

function panelOf(dom) {
  return dom.window.document.querySelector('[data-idm-panel]');
}

test('content.js injects a download panel over a <video>', () => {
  const { dom } = runContent(
    '<!doctype html><html><body><video src="https://example.com/movie.mp4"></video></body></html>',
  );

  const panel = panelOf(dom);
  assert.ok(panel, 'a panel must be injected over the video');

  const btn = panel.querySelector('button');
  assert.ok(btn, 'the panel must contain a button');
  assert.match(btn.textContent, /download|stáhnout/i, `button label: ${btn.textContent}`);
});

test('clicking the panel button requests a download of the video', () => {
  const { dom, sent } = runContent(
    '<!doctype html><html><body><video src="https://example.com/movie.mp4"></video></body></html>',
  );

  const btn = panelOf(dom).querySelector('button');
  btn.dispatchEvent(new dom.window.MouseEvent('click', { bubbles: true, cancelable: true }));

  const op = hasOp(sent, 42);
  assert.ok(
    op,
    `clicking must emit opcode 42 (media download), got: ${JSON.stringify(sent.map((m) => m[0]))}`,
  );
  assert.match(String(op[2]), /movie\.mp4$/, 'opcode 42 must carry the video src');
});

test('a page without media gets no panel', () => {
  const { dom } = runContent('<!doctype html><html><body><p>hello</p></body></html>');
  assert.equal(panelOf(dom), null, 'no panel should appear without videos');
});

test('background.js turns opcode 42 into a download request', () => {
  // Static check: background.js must handle the new opcode so the button works
  // end-to-end (the full chain is exercised in capture_dom.test.mjs).
  const bg = readFileSync(join(ext, 'background.js'), 'utf8');
  assert.match(bg, /case 42:/, 'background.js must handle opcode 42');
  const schema = readFileSync(join(ext, 'schema.js'), 'utf8');
  assert.match(schema, /\b42\b/, 'schema.js must list opcode 42 in CONTENT_TO_BG');
});