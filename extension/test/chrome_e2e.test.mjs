// REAL Chromium E2E test for the full capture chain.
//
// Unlike capture_dom.test.mjs (jsdom + mocked chrome.*), this launches the
// actual Chromium binary via Playwright's launchPersistentContext with the
// extension loaded, so the native-messaging host is spawned by the browser
// itself. It verifies:
//   * the extension loads and its ID matches the pinned key / allowed_origins
//   * a real click on <a download> on a live page triggers content.js ->
//     background.js -> connectNative -> idm-host -> engine
//   * the file lands on disk and its CRC32 matches the served bytes
//
// Requires a display for the extension to load reliably; run under Xvfb:
//   xvfb-run -a node --test extension/test/chrome_e2e.test.mjs
//
// Runs with: node --test extension/test/chrome_e2e.test.mjs

import test from 'node:test';
import assert from 'node:assert/strict';
import { readFileSync, existsSync, mkdirSync, rmSync } from 'node:fs';
import { createServer } from 'node:http';
import { chromium } from 'playwright-core';
import { fileURLToPath } from 'node:url';
import { dirname, join } from 'node:path';
import { tmpdir } from 'node:os';
import { randomBytes } from 'node:crypto';
import zlib from 'node:zlib';

const here = dirname(fileURLToPath(import.meta.url));
const ext = join(here, '..');
const repoRoot = join(ext, '..');

const EXPECTED_ID = 'gnhajaopemmibmjhkaafdebogmkkcljc';
const CHROMIUM = process.env.CHROMIUM_BIN || '/bin/chromium';

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

function startServer(data) {
  return new Promise((resolve) => {
    const server = createServer((req, res) => {
      const u = new URL(req.url, 'http://x');
      if (u.pathname === '/') {
        res.writeHead(200, { 'Content-Type': 'text/html' });
        return res.end(
          `<!doctype html><html><body>` +
            `<video src="/movie.mp4"></video>` +
            `<a id="d" download="out.bin" href="/file.bin">dl</a>` +
            `</body></html>`,
        );
      }
      if (u.pathname === '/movie.mp4') {
        res.writeHead(200, { 'Content-Length': 4, 'Content-Type': 'video/mp4' });
        return res.end(Buffer.from([0, 0, 0, 0]));
      }
      if (u.pathname === '/file.bin') {
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
        return res.end(data);
      }
      res.writeHead(404);
      res.end();
    });
    server.listen(0, '127.0.0.1', () => {
      resolve({ server, url: `http://127.0.0.1:${server.address().port}` });
    });
  });
}

test('REAL Chromium: click on <a download> -> idm-host -> file with correct CRC', { timeout: 180000 }, async () => {
  assert.ok(existsSync(CHROMIUM), `chromium not found at ${CHROMIUM}`);
  // The host manifest path must exist (release build) or Chrome won't spawn it.
  const hostManifest = JSON.parse(
    readFileSync(join(ext, 'com.tonec.idm.json'), 'utf8'),
  );
  assert.ok(
    existsSync(hostManifest.path),
    `host binary missing: ${hostManifest.path} (run: cd engine && cargo build --release)`,
  );

  const data = makeData(1_500_000);
  const expectedCrc = crc32(data);
  const { server, url } = await startServer(data);

  // Host cwd = download dir, so its default output (URL basename) lands here.
  const dlDir = join(tmpdir(), `idm_chrome_${process.pid}_${randomBytes(4).toString('hex')}`);
  mkdirSync(dlDir, { recursive: true });
  const outFile = join(dlDir, 'file.bin');

  const userDataDir = join(tmpdir(), `idm_prof_${process.pid}_${randomBytes(4).toString('hex')}`);

  const context = await chromium.launchPersistentContext(userDataDir, {
    executablePath: CHROMIUM,
    headless: false, // real Chromium under Xvfb; extensions need a display
    cwd: dlDir,
    args: [
      '--no-sandbox',
      '--disable-dev-shm-usage',
      '--disable-gpu',
      `--disable-extensions-except=${ext}`,
      `--load-extension=${ext}`,
    ],
  });

  try {
    // 1) The extension must load with the PINNED id (else native messaging fails).
    let sw = context.serviceWorkers()[0];
    if (!sw) sw = await context.waitForEvent('serviceworker', { timeout: 30000 });
    const swUrl = sw.url();
    const gotId = new URL(swUrl).host;
    assert.equal(
      gotId,
      EXPECTED_ID,
      `extension ID mismatch: got ${gotId} from ${swUrl}; allowed_origins in com.tonec.idm.json is ${hostManifest.allowed_origins}`,
    );

    // Collect SW console for diagnostics.
    const swLogs = [];
    sw.on('console', (m) => swLogs.push(`[sw] ${m.type()} ${m.text()}`));

    // 2) Open the live page and click the download link.
    const page = await context.newPage();
    const pageLogs = [];
    page.on('console', (m) => pageLogs.push(`[page] ${m.type()} ${m.text()}`));
    await page.goto(`${url}/`, { waitUntil: 'domcontentloaded' });

    // Give the content script a moment to open its port to the SW.
    await page.waitForTimeout(1500);
    await page.click('#d');

    // 3) Wait until the host actually wrote a byte-exact file.
    let onDisk = null;
    const deadline = Date.now() + 120000;
    while (Date.now() < deadline) {
      if (existsSync(outFile)) {
        try {
          const b = readFileSync(outFile);
          if (b.length === data.length && crc32(b) === expectedCrc) {
            onDisk = b;
            break;
          }
        } catch {
          /* still being written */
        }
      }
      await page.waitForTimeout(500);
    }

    assert.ok(
      onDisk,
      `download never produced a byte-exact ${outFile}\n` +
        `page logs:\n${pageLogs.join('\n')}\nservice worker logs:\n${swLogs.join('\n')}`,
    );
    assert.ok(onDisk.equals(data), 'file bytes must equal served bytes');
    assert.equal(crc32(onDisk), expectedCrc, 'CRC32 on disk');
  } finally {
    await context.close();
    server.close();
    rmSync(userDataDir, { recursive: true, force: true });
  }
});
