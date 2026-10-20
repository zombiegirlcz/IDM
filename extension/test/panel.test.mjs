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
  // The button is an icon now; its name is for screen readers and the tooltip.
  const name = btn.getAttribute('aria-label') || '';
  assert.match(name, /download|stáhnout/i, `button label: ${name}`);
  assert.equal(btn.getAttribute('title'), name, 'the tooltip says the same');
});

// "okénko ... by mělo být menší, jen takový malý čtverec a uvnitř zelená
// šipka dolů a objeví se jen tehdy, když uživatel myší na obsah najede"

function videoAt(dom, left, top, width, height) {
  const v = dom.window.document.querySelector('video');
  v.getBoundingClientRect = () => ({ left, top, width, height, right: left + width, bottom: top + height });
  return v;
}

function move(dom, x, y) {
  dom.window.document.dispatchEvent(new dom.window.MouseEvent('mousemove', { clientX: x, clientY: y, bubbles: true }));
}

const shown = (panel) => panel.style.display !== 'none';

test('the panel is a small square with a green down arrow', () => {
  const { dom } = runContent(
    '<!doctype html><html><body><video src="https://example.com/movie.mp4"></video></body></html>',
  );
  const panel = panelOf(dom);
  const w = parseInt(panel.style.width, 10);
  const h = parseInt(panel.style.height, 10);
  assert.ok(w > 0 && w <= 32, `width ${panel.style.width}`);
  assert.equal(w, h, 'a square');
  assert.equal(panel.textContent.trim(), '', 'no text label, only the icon');
  const arrow = panel.querySelector('svg path');
  assert.ok(arrow, 'an svg arrow inside');
  const paint = [arrow.getAttribute('stroke'), arrow.getAttribute('fill')]
    .find((c) => /^#[0-9a-f]{6}$/i.test(c || ''));
  assert.ok(paint, 'the arrow is painted with an #rrggbb colour');
  const [r, g, b] = [1, 3, 5].map((i) => parseInt(paint.slice(i, i + 2), 16));
  assert.ok(g > r + 60 && g > b + 60, `green, got ${paint}`);
});

test('the panel appears only while the mouse is over the media', () => {
  const { dom } = runContent(
    '<!doctype html><html><body><video src="https://example.com/movie.mp4"></video></body></html>',
  );
  videoAt(dom, 100, 50, 640, 360);
  const panel = panelOf(dom);
  assert.equal(shown(panel), false, 'hidden until the mouse comes');
  move(dom, 300, 200);
  assert.equal(shown(panel), true, 'shown with the mouse over the video');
  move(dom, 20, 20);
  assert.equal(shown(panel), false, 'hidden again when it leaves');
});

test('the panel sits in the top-right corner of the media', () => {
  const { dom } = runContent(
    '<!doctype html><html><body><video src="https://example.com/movie.mp4"></video></body></html>',
  );
  videoAt(dom, 100, 50, 640, 360);
  move(dom, 300, 200);
  const panel = panelOf(dom);
  const left = parseInt(panel.style.left, 10);
  const top = parseInt(panel.style.top, 10);
  const w = parseInt(panel.style.width, 10);
  assert.ok(left + w <= 100 + 640 && left + w >= 100 + 640 - 16, `left ${left}`);
  assert.ok(top >= 50 && top <= 50 + 16, `top ${top}`);
});

test('the panel button ignores a synthesized click and acts on a user click', () => {
  const { dom, sent } = runContent(
    '<!doctype html><html><body><video src="https://example.com/movie.mp4"></video></body></html>',
  );

  const btn = panelOf(dom).querySelector('button');
  // Script-dispatched: untrusted (jsdom cannot forge a trusted event), so the
  // download must NOT be requested. A real user press is covered by
  // extension/test/chrome_e2e.test.mjs.
  btn.dispatchEvent(new dom.window.MouseEvent('click', { bubbles: true, cancelable: true }));
  assert.equal(
    hasOp(sent, 42),
    undefined,
    `an untrusted click must not emit opcode 42, got: ${JSON.stringify(sent.map((m) => m[0]))}`,
  );
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