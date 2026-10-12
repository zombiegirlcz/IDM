// Static validation of the Windows installer (`install.ps1`).
//
// There is no PowerShell in this Linux environment, so we cannot *run* the
// script here. Instead we validate everything about it that is checkable
// statically and that would break a real `irm | iex` run:
//
//   * the file exists and declares the required parameters
//   * braces balance (a truncation / edit error would unbalance them)
//   * each of the five documented stages is present
//   * the browser registry roots cover Chrome/Edge/Brave/Chromium
//   * the native-messaging manifest carries the pinned extension id
//   * shortcuts are created on the Desktop and in the Start Menu
//   * IDM_ALLOWED_DIR is persisted (the host is fail-closed)
//   * --Uninstall removes the registry keys, the shortcuts and the env var
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

function src() {
  return readFileSync(ps1, 'utf8');
}

test('install.ps1 exists and has balanced braces', () => {
  assert.ok(existsSync(ps1), `missing ${ps1}`);
  const s = src();
  let depth = 0;
  for (const ch of s) {
    if (ch === '{') depth += 1;
    else if (ch === '}') depth -= 1;
    assert.ok(depth >= 0, 'brace depth went negative — unbalanced script');
  }
  assert.equal(depth, 0, 'braces must balance');
});

test('declares the documented parameters', () => {
  const s = src();
  assert.match(s, /\[CmdletBinding\(\)\]/, 'must be an advanced function');
  assert.match(s, /param\s*\(/, 'must have a param block');
  for (const p of ['\\$Uninstall', '\\$SourceDir', '\\$SkipBuild', '\\$Prefix', '\\$DownloadsDir']) {
    assert.match(s, new RegExp(p), `parameter ${p} must be declared`);
  }
});

test('contains all five install stages', () => {
  const s = src();
  for (const marker of [
    '# 1) Source',
    '# 2) Build',
    '# 3) Install into',
    '# 4) Native-messaging host manifest',
    '# 5) Desktop + Start-Menu shortcuts',
  ]) {
    assert.ok(s.includes(marker), `missing stage: ${marker}`);
  }
  assert.match(s, /cargo build --release/, 'must build with cargo');
});

test('registers the native host for all Chromium-family browsers', () => {
  const s = src();
  for (const vendor of [
    'Google',
    'Microsoft',
    'BraveSoftware',
    'Chromium',
  ]) {
    assert.ok(s.includes(vendor), `missing registry root for: ${vendor}`);
  }
  assert.ok(s.includes('NativeMessagingHosts'), 'must register NativeMessagingHosts keys');
  assert.match(s, /HKCU:/, 'must use HKCU (no admin required)');
  assert.match(s, /com\.tonec\.idm/, 'must register the com.tonec.idm host');
  assert.match(
    s,
    /gnhajaopemmibmjhkaafdebogmkkcljc/,
    'must pin our extension id in allowed_origins',
  );
});

test('creates Desktop and Start-Menu shortcuts', () => {
  const s = src();
  assert.match(s, /WScript\.Shell/, 'must create .lnk shortcuts');
  assert.match(s, /Get-DesktopDir/, 'must resolve the Desktop folder');
  assert.match(s, /Get-StartMenuDir/, 'must resolve the Start-Menu folder');
  assert.match(s, /IDM\.lnk/, 'shortcut must be named IDM.lnk');
});

test('persists IDM_ALLOWED_DIR for the fail-closed host', () => {
  const s = src();
  assert.match(
    s,
    /SetEnvironmentVariable\(\s*"IDM_ALLOWED_DIR"/,
    'must persist IDM_ALLOWED_DIR so the argument-less host can run',
  );
});

test('--Uninstall removes registry keys, shortcuts and the env var', () => {
  const s = src();
  // The uninstall branch must touch all three.
  assert.match(s, /if \(\$Uninstall\)/, 'must have an uninstall branch');
  const uninstallBlock = s.slice(s.indexOf('if ($Uninstall)'), s.indexOf('# 1) Source'));
  assert.match(uninstallBlock, /Remove-Item .*BrowserRegRoots|Remove-Item -Path \$key/s, 'must remove registry keys');
  assert.match(uninstallBlock, /IDM\.lnk/, 'must remove the shortcuts');
  assert.match(uninstallBlock, /SetEnvironmentVariable\("IDM_ALLOWED_DIR", \$null/s, 'must clear the env var');
  assert.match(uninstallBlock, /Remove-Item -Recurse -Force \$Prefix/s, 'must remove the install prefix');
});