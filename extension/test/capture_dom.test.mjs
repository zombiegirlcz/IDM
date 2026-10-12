// Functional DOM test for the capture chain.
//
// Unlike message_schema.test.mjs (which only greps content.js source), this
// runs content.js inside a REAL DOM (jsdom) with a <video> and an
// <a download>, triggers a real click, and asserts it emits the documented
// opcodes [22] / [41] / [39]. The captured [39] is then fed to background.js,
// which must translate it into a download request against the REAL `idm-host`
// binary (which spawns the real engine against a local Range server).
//
// Runs with: node --test extension/test/capture_dom.test.mjs

import test from 'node:test';
import assert from 'node:assert/strict';
import { readFileSync, existsSync, mkdirSync } from 'node:fs';
import { spawn } from 'node:child_process';
import { createServer } from 'node:http';
import { JSDOM } from 'jsdom';
import { fileURLToPath, pathToFileURL } from 'node:url';
import { dirname, join } from 'node:path';
import { tmpdir } from 'node:os';
import { randomBytes } from 'node:crypto';
import zlib from 'node:zlib';

const here = dirname(fileURLToPath(import.meta.url));
const ext = join(here, '..');
const repoRoot = join(ext, '..');
const CONTENT = readFileSync(join(ext, 'content.js'), 'utf8');

function findHost() {
  const candidates = [
    process.env.IDM_HOST_BIN,
    join(repoRoot, 'engine/target/release/idm-host'),
    join(repoRoot, 'engine/target/debug/idm-host'),
  ].filter(Boolean);
  for (const c of candidates) if (existsSync(c)) return c;
  throw new Error(`idm-host not found; looked in:\n  ${candidates.join('\n  ')}`);
}

function makeData(len) {
  const buf = Buffer.allocUnsafe(len);
  for (let i = 0; i < len; i++) {
    buf[i] = (Math.imul(i >>> 0, 2654435761) >>> 13) & 0xff;
  }
  return buf;
}

function crc32(buf) {
  return (zlib.crc32(buf) >>> 0).toString(16).padStart(8, '0');
}

/** Range-capable HTTP server. */
function startServer(data) {
  return new Promise((resolve) => {
    const server = createServer((req, res) => {
      const total = data.length;
      const range = req.headers.range;
      if (req.method === 'HEAD') {
        res.writeHead(200, { 'Content-Length': total, 'Accept-Ranges': 'bytes', ETag: '"e"' });
        return res.end();
      }
      if (range) {
        const m = /bytes=(\d+)-(\d*)/.exec(range);
        const a = parseInt(m[1], 10);
        const b = m[2] ? parseInt(m[2], 10) : total - 1;
        const slice = data.subarray(a, b + 1);
        res.writeHead(206, {
          'Content-Length': slice.length,
          'Content-Range': `bytes ${a}-${b}/${total}`,
          'Accept-Ranges': 'bytes',
        });
        return res.end(slice);
      }
      res.writeHead(200, { 'Content-Length': total, 'Accept-Ranges': 'bytes', ETag: '"e"' });
      res.end(data);
    });
    server.listen(0, '127.0.0.1', () => {
      resolve({ server, url: `http://127.0.0.1:${server.address().port}` });
    });
  });
}

/**
 * Run content.js in a jsdom window with a mocked `chrome.runtime.connect`.
 * Returns {dom, sent, clickAnchor}.
 */
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
    },
  };
  // Execute the classic content script inside the window context.
  dom.window.eval(CONTENT);

  // If the document was still loading, content.js defers scanMedia to
  // DOMContentLoaded; nudge it.
  if (sent.length === 0) {
    dom.window.document.dispatchEvent(new dom.window.Event('DOMContentLoaded'));
  }

  function clickAnchor(sel) {
    const a = dom.window.document.querySelector(sel);
    // jsdom has no navigation; stop the default action so it stays a pure event.
    a.addEventListener('click', (e) => e.preventDefault(), false);
    a.dispatchEvent(new dom.window.MouseEvent('click', { bubbles: true, cancelable: true }));
  }

  return { dom, sent, clickAnchor };
}

function hasOp(sent, op) {
  return sent.find((m) => Array.isArray(m) && m[0] === op);
}

test('content.js emits [22]/[41] for a real <video>', () => {
  const { sent } = runContent(
    '<!doctype html><html><body><video src="https://example.com/movie.mp4"></video></body></html>',
  );

  const op22 = hasOp(sent, 22);
  assert.ok(op22, `opcode 22 must be emitted, got: ${JSON.stringify(sent.map((m) => m[0]))}`);
  assert.equal(op22[1], 'video', 'opcode 22 kind');
  assert.match(String(op22[2]), /movie\.mp4$/, 'opcode 22 src');

  const op41 = hasOp(sent, 41);
  assert.ok(op41, 'opcode 41 must be emitted');
  assert.equal(op41[2], 'video', 'opcode 41 kind');
  assert.match(String(op41[3]), /movie\.mp4$/, 'opcode 41 src');
});

test('content.js emits [39] on a real click of <a download>', () => {
  const { sent, clickAnchor } = runContent(
    '<!doctype html><html><body><a id="d" download="file.bin" href="https://example.com/file.bin">x</a></body></html>',
  );
  clickAnchor('#d');

  const op39 = hasOp(sent, 39);
  assert.ok(op39, `opcode 39 must be emitted, got: ${JSON.stringify(sent.map((m) => m[0]))}`);
  assert.equal(op39[1], true, 'opcode 39 hasDownload flag');
  assert.equal(op39[2], 'https://example.com/file.bin', 'opcode 39 href');
  assert.equal(op39[3], 'file.bin', 'opcode 39 download name');

  // A click also bumps the activity signal [29].
  assert.ok(hasOp(sent, 29), 'opcode 29 (activity) should accompany the click');
});

test('full chain: DOM -> content.js opcode -> background.js -> real idm-host -> CRC', async () => {
  const data = makeData(1_200_000);
  const expectedCrc = crc32(data);
  const { server, url } = await startServer(data);
  const fileUrl = `${url}/file.bin`;

  const dir = join(tmpdir(), `idm_dom_${process.pid}_${randomBytes(4).toString('hex')}`);
  mkdirSync(dir, { recursive: true });

  const posted = [];
  const replies = [];
  const messageListeners = [];
  const onConnectListeners = [];

  const hostBin = findHost();
  const engineBin = hostBin.replace(/idm-host$/, 'idm');
  // cwd = dir AND --allowed-dir=dir: capture (opcode 39) carries no output
  // path, so idm-host falls back to the URL basename, which lands inside `dir`.
  // The host now requires --allowed-dir (fail-closed) and enforces containment.
  const child = spawn(hostBin, ['--engine', engineBin, '--allowed-dir', dir], {
    stdio: ['pipe', 'pipe', 'ignore'],
    cwd: dir,
  });

  let buf = Buffer.alloc(0);
  child.stdout.on('data', (d) => {
    buf = Buffer.concat([buf, d]);
    while (buf.length >= 4) {
      const len = buf.readUInt32LE(0);
      if (buf.length < 4 + len) break;
      const body = buf.subarray(4, 4 + len);
      buf = buf.subarray(4 + len);
      let msg;
      try {
        msg = JSON.parse(body.toString('utf8'));
      } catch {
        continue;
      }
      replies.push(msg);
      for (const cb of messageListeners) cb(msg);
    }
  });

  const nativePort = {
    postMessage(m) {
      posted.push(m);
      const b = Buffer.from(JSON.stringify(m), 'utf8');
      const outBuf = Buffer.allocUnsafe(4 + b.length);
      outBuf.writeUInt32LE(b.length, 0);
      b.copy(outBuf, 4);
      child.stdin.write(outBuf);
    },
    onMessage: { addListener: (cb) => messageListeners.push(cb) },
    onDisconnect: { addListener: () => {} },
  };

  globalThis.self = globalThis;
  globalThis.chrome = {
    runtime: {
      lastError: undefined,
      connectNative: () => nativePort,
      onConnect: { addListener: (cb) => onConnectListeners.push(cb) },
      onMessage: { addListener: () => {} },
    },
  };

  try {
    // 1) Real DOM with a download anchor pointing at our local server.
    const { sent, clickAnchor } = runContent(
      `<!doctype html><html><body>` +
        `<video src="${url}/movie.mp4"></video>` +
        `<a id="d" download="out.bin" href="${fileUrl}">dl</a>` +
        `</body></html>`,
    );
    clickAnchor('#d');

    const captured = hasOp(sent, 39);
    assert.ok(captured, 'content.js must capture the click as opcode 39');
    assert.equal(captured[2], fileUrl, 'captured href is the server URL');

    // 2) Import background.js (ESM) AFTER the chrome mock is installed.
    const bgUrl = pathToFileURL(join(ext, 'background.js')).href + `?t=${Date.now()}`;
    await import(bgUrl);
    assert.ok(onConnectListeners.length >= 1, 'background.js must register onConnect');

    // 3) Deliver the captured opcode exactly as content.js would (via a port).
    let portMsgCb = null;
    const fakePort = {
      name: 'idm-content',
      sender: { tab: { url: 'https://example.com/' } },
      onMessage: { addListener: (cb) => (portMsgCb = cb) },
      onDisconnect: { addListener() {} },
    };
    for (const cb of onConnectListeners) cb(fakePort);
    assert.ok(portMsgCb, 'background must listen on the idm-content port');

    portMsgCb(captured); // [39, true, fileUrl, 'out.bin']

    // 4) Wait for the background -> host round trip.
    const deadline = Date.now() + 30000;
    while (replies.length === 0 && Date.now() < deadline) {
      await new Promise((r) => setTimeout(r, 50));
    }

    // 5) Background must have translated the opcode into a download request.
    const req = posted.find((m) => m && m.action === 'download');
    assert.ok(req, `background must post a download request, got: ${JSON.stringify(posted)}`);
    assert.equal(req.url, fileUrl, 'download request URL');
    assert.equal(req.connections, 4, 'download request connections');

    // ...and the REAL host performed it (echoed id, real CRC).
    const reply = replies.find((m) => m && m.id === req.id);
    assert.ok(reply, `host must reply to id ${req.id}, got: ${JSON.stringify(replies)}`);
    assert.equal(reply.ok, true, `host reply: ${JSON.stringify(reply)}`);
    assert.equal(reply.size, data.length, 'host-reported size');
    assert.equal(reply.crc32, expectedCrc, 'host-reported crc32 must match reference');

    // 6) Bytes on disk must be byte-exact. The host reports the output path
    //    it used; it is relative to the host's cwd (we spawned it in `dir`).
    const outPath = reply.output && reply.output.startsWith('/')
      ? reply.output
      : join(dir, reply.output);
    const onDisk = readFileSync(outPath);
    assert.equal(onDisk.length, data.length, 'file size on disk');
    assert.ok(onDisk.equals(data), 'file bytes must equal served bytes');
  } finally {
    try {
      child.stdin.end();
    } catch {}
    try {
      child.kill('SIGKILL');
    } catch {}
    server.close();
  }
});