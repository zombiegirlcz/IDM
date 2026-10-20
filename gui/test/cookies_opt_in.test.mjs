// Browser cookies for yt-dlp are opt-in, never auto-detected.
//
// 2.1.0 made the window pass `--cookies-from-browser chrome` whenever a Chrome
// binary was on PATH. Chrome's stored YouTube cookies are frequently rotated,
// and yt-dlp then sends invalid account cookies that YouTube answers with a
// bot check -- while the same request without them works.
//
// Runs with: node --test gui/test/cookies_opt_in.test.mjs

import test from 'node:test';
import assert from 'node:assert/strict';
import { mkdtempSync, writeFileSync, chmodSync, mkdirSync } from 'node:fs';
import { execFileSync } from 'node:child_process';
import { fileURLToPath } from 'node:url';
import { dirname, join } from 'node:path';
import { tmpdir } from 'node:os';

const here = dirname(fileURLToPath(import.meta.url));
const guiPy = join(here, '..', 'idm_gui.py');

function optionsFor(settings) {
  const stateDir = mkdtempSync(join(tmpdir(), 'idm_cookies_'));
  const bin = join(stateDir, 'bin');
  mkdirSync(bin);
  // A Chrome that "is installed" -- the old code keyed off exactly this.
  writeFileSync(join(bin, 'google-chrome'), '#!/bin/sh\n');
  chmodSync(join(bin, 'google-chrome'), 0o755);
  writeFileSync(join(stateDir, 'settings.json'), JSON.stringify(settings), 'utf8');
  const out = execFileSync(
    'python3',
    [guiPy, '--selftest-download-options', '--state-dir', stateDir, '--url', 'https://www.youtube.com/watch?v=abc'],
    { encoding: 'utf8', env: { ...process.env, PATH: `${bin}:${process.env.PATH}` } },
  );
  const line = out.split('\n').find((l) => l.startsWith('OPTIONS:'));
  assert.ok(line, `no OPTIONS: line in output:\n${out}`);
  return JSON.parse(line.slice('OPTIONS:'.length));
}

test('an installed Chrome does not switch cookie reading on by itself', () => {
  assert.equal(optionsFor({}).cookies_from_browser, '');
});

test('a browser named in the Options is used', () => {
  const o = optionsFor({ downloads: { cookies_from_browser: 'firefox' } });
  assert.equal(o.cookies_from_browser, 'firefox');
});
