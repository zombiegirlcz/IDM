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
// Requires a display for the extension to load reliably. `npm test` runs it as
// gated step 6 (see chromeE2eMode), which supplies xvfb-run when needed.
//
// Runs with: node --test extension/test/chrome_e2e.test.mjs

import test from 'node:test';
import assert from 'node:assert/strict';
import { readFileSync, writeFileSync, existsSync, mkdirSync, rmSync } from 'node:fs';
import { chromium } from 'playwright-core';
import { fileURLToPath } from 'node:url';
import { dirname, join } from 'node:path';
import { tmpdir } from 'node:os';
import { randomBytes } from 'node:crypto';
import {
  makeData, crc32, startServer, writeWrapper, nativeHostDirs,
} from './e2e_fixtures.mjs';

const here = dirname(fileURLToPath(import.meta.url));
const ext = join(here, '..');
const repoRoot = join(ext, '..');

const EXPECTED_ID = 'gnhajaopemmibmjhkaafdebogmkkcljc';
const CHROMIUM = process.env.CHROMIUM_BIN || '/bin/chromium';

test('REAL Chromium: click on <a download> -> idm-host -> file with correct CRC', { timeout: 180000 }, async () => {
  assert.ok(existsSync(CHROMIUM), `chromium not found at ${CHROMIUM}`);
  // Chrome only spawns the host it finds a manifest for. The committed
  // manifest carries the absolute path of whichever checkout installed it
  // last, so we install our own copy into the throwaway profile below,
  // pointing at the host THIS checkout built.
  const hostManifest = JSON.parse(
    readFileSync(join(ext, 'com.tonec.idm.json'), 'utf8'),
  );
  const hostBin = process.env.IDM_HOST_BIN
    || join(repoRoot, 'engine/target/release/idm-host');
  const engineBin = process.env.IDM_ENGINE_BIN
    || join(repoRoot, 'engine/target/release/idm');
  for (const bin of [hostBin, engineBin]) {
    assert.ok(
      existsSync(bin),
      `binary missing: ${bin} (run: cd engine && cargo build --release)`,
    );
  }

  const data = makeData(1_500_000);
  const expectedCrc = crc32(data);
  const { server, url } = await startServer(data);

  // Host cwd = download dir, so its default output (URL basename) lands here.
  const dlDir = join(tmpdir(), `idm_chrome_${process.pid}_${randomBytes(4).toString('hex')}`);
  mkdirSync(dlDir, { recursive: true });
  const outFile = join(dlDir, 'file.bin');

  const userDataDir = join(tmpdir(), `idm_prof_${process.pid}_${randomBytes(4).toString('hex')}`);
  // Chromium looks for native-messaging manifests under
  // $HOME/.config/<browser>/NativeMessagingHosts (NOT under --user-data-dir).
  // We therefore give the browser its own HOME inside the temp dir and install
  // the manifest there: self-contained, and the user's real registration is
  // left alone.
  const fakeHome = join(userDataDir, 'home');
  const fakeConfig = join(fakeHome, '.config');
  const nmDirs = nativeHostDirs('chromium', { home: fakeHome, userDataDir });
  const wrapper = writeWrapper({ home: fakeHome, hostBin, engineBin, allowedDir: dlDir });
  for (const nmDir of nmDirs) {
    mkdirSync(nmDir, { recursive: true });
    writeFileSync(
      join(nmDir, 'com.tonec.idm.json'),
      JSON.stringify({ ...hostManifest, path: wrapper }, null, 2),
    );
  }

  const context = await chromium.launchPersistentContext(userDataDir, {
    executablePath: CHROMIUM,
    headless: false, // real Chromium under Xvfb; extensions need a display
    cwd: dlDir,
    // HOME *and* XDG_CONFIG_HOME: an inherited XDG_CONFIG_HOME would otherwise
    // win over HOME when Chromium resolves its config directory.
    env: { ...process.env, HOME: fakeHome, XDG_CONFIG_HOME: fakeConfig },
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
      `download never produced a byte-exact ${outFile}\n`
      + `host: ${hostBin}, engine: ${engineBin}, wrapper: ${wrapper}\n`
      + `manifest dirs: ${nmDirs.join(', ')}\n` +
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
