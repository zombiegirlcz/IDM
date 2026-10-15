// The real-machine half of chromeE2eMode: probe, decide, print for the shell.
//
// Output is one TAB-separated line — mode, chromium, xvfb, reason — so
// scripts/test.sh can read it without parsing JSON in bash.

import { existsSync, mkdtempSync } from 'node:fs';
import { removeProfile } from './rm_profile.mjs';
import { tmpdir } from 'node:os';
import { join } from 'node:path';
import { execFileSync } from 'node:child_process';
import { chromeE2eMode, formatDecision } from './chrome_e2e_gate.mjs';

function which(bin) {
  try {
    return execFileSync('sh', ['-c', `command -v ${bin}`], { encoding: 'utf8' }).trim() || null;
  } catch {
    return null;
  }
}

async function findChromium() {
  if (process.env.CHROMIUM_BIN) return process.env.CHROMIUM_BIN;
  // Playwright's own build first: CI installs it precisely because distro
  // Chromium is often a snap shim that cannot see native-messaging hosts.
  try {
    const { chromium } = await import('playwright-core');
    const p = chromium.executablePath();
    if (existsSync(p)) return p;
  } catch { /* playwright-core absent or no browser downloaded */ }
  for (const b of ['chromium', 'chromium-browser', 'google-chrome']) {
    const p = which(b);
    if (p) return p;
  }
  return null;
}

/** Does this Chromium survive a trivial headless run? null = not probed. */
function startsHere(bin) {
  if (!bin || !existsSync(bin)) return null;
  const dir = mkdtempSync(join(tmpdir(), 'idm-smoke-'));
  try {
    execFileSync(bin, [
      '--no-sandbox', '--disable-gpu', '--disable-dev-shm-usage',
      '--headless=new', `--user-data-dir=${dir}`, '--dump-dom', 'about:blank',
    ], { stdio: 'ignore', timeout: 60_000 });
    return true;
  } catch {
    // Any non-zero exit on about:blank means this binary cannot work here;
    // exit 133 (SIGTRAP) is the shape seen on unsupported kernels.
    return false;
  } finally {
    // The smoke profile is still being flushed by Chromium's helpers;
    // a plain rmSync races them, and a failed cleanup must not turn a
    // successful probe into a crashed gate.
    removeProfile(dir);
  }
}

const chromium = await findChromium();
const d = chromeE2eMode({
  chromium,
  starts: startsHere(chromium),
  xvfb: Boolean(which('xvfb-run')),
  display: process.env.DISPLAY || null,
  want: process.env.RUN_CHROME_E2E ?? null,
});
process.stdout.write(formatDecision(d) + '\n');
