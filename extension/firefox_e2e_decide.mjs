// The real-machine half of firefoxE2eMode: probe, decide, print for the shell.
// Output is one TAB-separated line — mode, firefox, reason.

import { execFileSync } from 'node:child_process';
import { existsSync } from 'node:fs';
import { firefoxE2eMode, formatDecision } from './chrome_e2e_gate.mjs';

function which(bin) {
  try {
    return execFileSync('sh', ['-c', `command -v ${bin}`], { encoding: 'utf8' }).trim() || null;
  } catch {
    return null;
  }
}

function findFirefox() {
  if (process.env.FIREFOX_BIN) return process.env.FIREFOX_BIN;
  for (const b of ['firefox', 'firefox-esr']) {
    const p = which(b);
    if (p) return p;
  }
  return null;
}

/** Cheap liveness check: a binary that cannot even print its version is no use. */
function startsHere(bin) {
  if (!bin || !existsSync(bin)) return null;
  try {
    execFileSync(bin, ['--version'], { stdio: 'ignore', timeout: 60_000 });
    return true;
  } catch {
    return false;
  }
}

const firefox = findFirefox();
const d = firefoxE2eMode({ firefox, starts: startsHere(firefox), want: process.env.RUN_FIREFOX_E2E ?? null });
process.stdout.write(formatDecision(d, 'firefox') + '\n');
