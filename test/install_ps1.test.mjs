// Static validation of the Windows installer (`install.ps1`).
//
// There is no PowerShell here, so we cannot *run* the script. We validate what
// is checkable statically and what matters for the user's #1 complaint:
// the installer must NOT require git, Rust or a compiler — it must just
// download a prebuilt archive, like real IDM ships as a ready-made .exe.
//
// Runs with: node --test test/install_ps1.test.mjs

import test from 'node:test';
import assert from 'node:assert/strict';
import { readFileSync, existsSync } from 'node:fs';
import { fileURLToPath } from 'node:url';
import { dirname, join } from 'node:path';

const here = dirname(fileURLToPath(import.meta.url));
const repoRoot = join(here, '..');
const ps1 = join(repoRoot, 'install.ps1');
const src = () => readFileSync(ps1, 'utf8');

test('install.ps1 exists and has balanced braces', () => {
  assert.ok(existsSync(ps1), `missing ${ps1}`);
  let depth = 0;
  for (const ch of src()) {
    if (ch === '{') depth += 1;
    else if (ch === '}') depth -= 1;
    assert.ok(depth >= 0, 'brace depth went negative');
  }
  assert.equal(depth, 0, 'braces must balance');
});

test('does NOT require git, Rust or a compiler (prebuilt binaries only)', () => {
  const s = src();
  assert.ok(!/git clone/.test(s), 'must not clone the source');
  assert.ok(!/cargo build/.test(s), 'must not run cargo');
  assert.ok(!/cargo\b/.test(s), 'must not reference cargo at all');
  assert.ok(!/Get-Command git\b/.test(s), 'must not require git');
  assert.match(s, /releases\/latest\/download/, 'must download the latest release asset');
  assert.match(s, /releases\/download\/\$Version/, 'must support a pinned version');
  assert.match(s, /Expand-Archive/, 'must unpack the prebuilt archive');
  assert.match(s, /idm-windows-x64\.zip/, 'must fetch the Windows x64 asset');
});

test('declares the documented parameters', () => {
  const s = src();
  assert.match(s, /\[CmdletBinding\(\)\]/, 'must be an advanced function');
  assert.match(s, /param\s*\(/, 'must have a param block');
  for (const p of ['\\$Uninstall', '\\$Prefix', '\\$DownloadsDir', '\\$Version']) {
    assert.match(s, new RegExp(p), `parameter ${p} must be declared`);
  }
});

test('registers the native host for all Chromium-family browsers', () => {
  const s = src();
  for (const vendor of ['Google', 'Microsoft', 'BraveSoftware', 'Chromium']) {
    assert.ok(s.includes(vendor), `missing registry root for: ${vendor}`);
  }
  assert.ok(s.includes('NativeMessagingHosts'), 'must register NativeMessagingHosts keys');
  assert.match(s, /HKCU:/, 'must use HKCU (no admin required)');
  assert.match(s, /com\.tonec\.idm/, 'must register the com.tonec.idm host');
  assert.match(s, /gnhajaopemmibmjhkaafdebogmkkcljc/, 'must pin our extension id');
});

test('creates Desktop and Start-Menu shortcuts', () => {
  const s = src();
  assert.match(s, /WScript\.Shell/, 'must create .lnk shortcuts');
  assert.match(s, /Get-DesktopDir/, 'must resolve the Desktop folder');
  assert.match(s, /Get-StartMenuDir/, 'must resolve the Start-Menu folder');
  assert.match(s, /IDM\.lnk/, 'shortcut must be named IDM.lnk');
});

test('persists IDM_ALLOWED_DIR for the fail-closed host', () => {
  assert.match(src(), /SetEnvironmentVariable\(\s*"IDM_ALLOWED_DIR"/, 'must persist IDM_ALLOWED_DIR');
});

test('--Uninstall removes registry keys, shortcuts and the env var', () => {
  const s = src();
  assert.match(s, /if \(\$Uninstall\)/, 'must have an uninstall branch');
  const block = s.slice(s.indexOf('if ($Uninstall)'), s.indexOf('# 1) Download'));
  assert.match(block, /Remove-Item -Path \$key|Remove-Item .*BrowserRegRoots/s, 'must remove registry keys');
  assert.match(block, /IDM\.lnk/, 'must remove the shortcuts');
  assert.match(block, /SetEnvironmentVariable\("IDM_ALLOWED_DIR", \$null/s, 'must clear the env var');
  assert.match(block, /Remove-Item -Recurse -Force \$Prefix/s, 'must remove the install prefix');
});
