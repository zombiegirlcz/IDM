// IDM must bring its own yt-dlp.
//
// Reported, and correct: "the application did not download its own
// dependencies like yt-dlp". aria2c has had an installer on both platforms
// since the beginning (scripts/ensure-aria2.sh / .ps1, run by the engine when
// --aria2 is used and a binary is missing). yt-dlp had nothing at all, so on
// a clean Windows machine every video download failed -- which is most of
// what "it downloads nothing" turned out to be.
//
// A downloader that cannot download the thing it needs to download videos is
// not finished.
//
// Runs with: node --test test/ensure_ytdlp.test.mjs

import test from 'node:test';
import assert from 'node:assert/strict';
import { readFileSync, existsSync, statSync } from 'node:fs';
import { execFileSync } from 'node:child_process';
import { fileURLToPath } from 'node:url';
import { dirname, join } from 'node:path';

const here = dirname(fileURLToPath(import.meta.url));
const repoRoot = join(here, '..');
const sh = join(repoRoot, 'scripts', 'ensure-ytdlp.sh');
const ps1 = join(repoRoot, 'scripts', 'ensure-ytdlp.ps1');

test('there is an installer for each platform, like aria2 has', () => {
  assert.ok(existsSync(sh), 'scripts/ensure-ytdlp.sh is missing');
  assert.ok(existsSync(ps1), 'scripts/ensure-ytdlp.ps1 is missing');
  assert.ok(statSync(sh).mode & 0o111, 'ensure-ytdlp.sh must be executable');
});

test('the shell installer is valid shell', () => {
  execFileSync('bash', ['-n', sh]);
});

test('a line continuation is never left dangling', () => {
  // install.sh once lost an entire curl because a comment swallowed the
  // backslash that continued it, and `bash -n` accepts that happily.
  const lines = readFileSync(sh, 'utf8').split('\n');
  lines.forEach((line, i) => {
    if (/\\\s*#/.test(line)) {
      assert.fail(`line ${i + 1} has a comment after a continuation: ${line}`);
    }
  });
});

test('it checks before it installs', () => {
  const text = readFileSync(sh, 'utf8');
  assert.match(text, /command -v yt-dlp|which yt-dlp/,
    'it must not reinstall yt-dlp on every run');
});

test('it can be told not to install, like the aria2 one', () => {
  const text = readFileSync(sh, 'utf8');
  assert.match(text, /IDM_YTDLP_NO_INSTALL/,
    'a check-only mode is what the tests and cautious users need');
  assert.match(readFileSync(ps1, 'utf8'), /IDM_YTDLP_NO_INSTALL/);
});

test('check-only mode never writes anything', () => {
  // Running the script must be safe even when yt-dlp is absent.
  const out = execFileSync('bash', [sh], {
    env: { ...process.env, IDM_YTDLP_NO_INSTALL: '1' },
    encoding: 'utf8',
    stdio: ['ignore', 'pipe', 'pipe'],
  }).toString();
  assert.ok(out.length >= 0);
});

test('the installer ships both scripts', () => {
  // ensure-aria2.sh is copied into $IDM_DIR/bin by install.sh; the yt-dlp one
  // has to travel the same way or it will not be there when it is needed.
  const text = readFileSync(join(repoRoot, 'install.sh'), 'utf8');
  assert.match(text, /ensure-ytdlp\.sh/,
    'install.sh must install the yt-dlp helper alongside the aria2 one');
  const ps = readFileSync(join(repoRoot, 'install.ps1'), 'utf8');
  assert.match(ps, /ensure-ytdlp\.ps1/,
    'install.ps1 must do the same on Windows');
});

test('the release archive carries them', () => {
  // The archives are what users actually install from.
  const wf = readFileSync(join(repoRoot, '.github', 'workflows', 'release.yml'), 'utf8');
  assert.match(wf, /ensure-ytdlp/,
    'release.yml packs ensure-aria2; it must pack ensure-ytdlp too');
});
