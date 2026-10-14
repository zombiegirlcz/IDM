// REAL Firefox E2E for the full capture chain.
//
// The Firefox twin of chrome_e2e.test.mjs. It cannot use Playwright: that
// drives only its own patched Firefox build, which does not install
// extensions. Marionette is built into every Firefox, installs an unpacked
// add-on with Addon:Install (temporary:true), and its WebDriver:ElementClick
// is a genuinely trusted user click — which is the whole point, since the
// capture path reacts to real clicks.
//
// It verifies that in Firefox:
//   * the extension loads at all (MV3 there needs background.scripts)
//   * the add-on id matches the one allowed_extensions names, or native
//     messaging is refused
//   * a real click on <a download> runs content.js -> background.js ->
//     connectNative -> idm-host -> engine
//   * the file lands on disk with a byte-exact CRC32
//
// Runs with: node --test extension/test/firefox_e2e.test.mjs

import test from 'node:test';
import assert from 'node:assert/strict';
import { readFileSync, existsSync, mkdirSync, rmSync, statSync } from 'node:fs';
import { fileURLToPath } from 'node:url';
import { dirname, join } from 'node:path';
import { tmpdir } from 'node:os';
import { randomBytes } from 'node:crypto';
import { Marionette } from './marionette.mjs';
import {
  makeData, crc32, startServer, writeWrapper, registerHost,
} from './e2e_fixtures.mjs';

const here = dirname(fileURLToPath(import.meta.url));
const ext = join(here, '..');
const repoRoot = join(ext, '..');

const FIREFOX = process.env.FIREFOX_BIN || '/bin/firefox';
const EXPECTED_ID = JSON.parse(readFileSync(join(ext, 'manifest.json'), 'utf8'))
  .browser_specific_settings.gecko.id;

test('REAL Firefox: click on <a download> -> idm-host -> file with correct CRC',
  { timeout: 900000 }, async () => {
    assert.ok(existsSync(FIREFOX), `firefox not found at ${FIREFOX}`);
    const hostBin = process.env.IDM_HOST_BIN
      || join(repoRoot, 'engine/target/release/idm-host');
    const engineBin = process.env.IDM_ENGINE_BIN
      || join(repoRoot, 'engine/target/release/idm');
    for (const bin of [hostBin, engineBin]) {
      assert.ok(existsSync(bin),
        `binary missing: ${bin} (run: cd engine && cargo build --release)`);
    }

    const data = makeData(1_500_000);
    const expectedCrc = crc32(data);
    const { server, url } = await startServer(data);

    const tag = `${process.pid}_${randomBytes(4).toString('hex')}`;
    const dlDir = join(tmpdir(), `idm_ff_dl_${tag}`);
    const home = join(tmpdir(), `idm_ff_home_${tag}`);
    mkdirSync(dlDir, { recursive: true });
    mkdirSync(home, { recursive: true });
    const outFile = join(dlDir, 'file.bin');

    const wrapper = writeWrapper({ home, hostBin, engineBin, allowedDir: dlDir });
    registerHost({
      family: 'firefox',
      template: JSON.parse(readFileSync(join(ext, 'com.tonec.idm.firefox.json'), 'utf8')),
      wrapper,
      home,
    });

    // Its own HOME: Firefox reads native-messaging manifests from there, so
    // this leaves the developer's real registration untouched.
    const m = new Marionette({
      binary: FIREFOX,
      env: { ...process.env, HOME: home, MOZ_DISABLE_AUTO_SAFE_MODE: '1' },
    });

    try {
      await m.start({ headless: true });

      // 1) The add-on must load, with the id allowed_extensions names.
      const gotId = await m.installAddon(ext);
      assert.equal(gotId, EXPECTED_ID,
        `add-on id mismatch: ${gotId}; the Firefox host manifest allows ${EXPECTED_ID}`);

      // 2) Open the live page and click the download link for real.
      await m.navigate(`${url}/`);
      // The content script opens its port to the background on load; clicking
      // before that is a race, so wait for the element AND a beat after it.
      const el = await m.findElement('#d');
      await new Promise((r) => setTimeout(r, 1500));
      await m.click(el);

      // 3) Wait until the host actually wrote a byte-exact file. The engine
      // preallocates, so the file reaches its final SIZE long before its final
      // CONTENT — only the CRC says the download finished.
      let onDisk = null;
      const deadline = Date.now() + 600_000;
      while (Date.now() < deadline) {
        if (existsSync(outFile)) {
          try {
            const b = readFileSync(outFile);
            if (b.length === data.length && crc32(b) === expectedCrc) {
              onDisk = b;
              break;
            }
          } catch { /* still being written */ }
        }
        await new Promise((r) => setTimeout(r, 500));
      }
      assert.ok(onDisk,
        `download never produced a byte-exact ${outFile}\n`
        + `size now: ${existsSync(outFile) ? statSync(outFile).size : 'missing'}`
        + `/${data.length}, host: ${hostBin}, wrapper: ${wrapper}`);
      assert.ok(onDisk.equals(data), 'file bytes must equal served bytes');
    } finally {
      await m.stop();
      server.close();
      rmSync(dlDir, { recursive: true, force: true });
      rmSync(home, { recursive: true, force: true });
    }
  });
