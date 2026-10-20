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

// NOTE: real execution (install + -Uninstall against a locally built archive)
// happens in the `windows-installer` CI job, which also parses the script with
// PowerShell. What follows is what can be checked without Windows.

test('keeps a copy of itself in the prefix for -Uninstall', () => {
  const s = src();
  assert.match(
    s,
    /PSScriptRoot/,
    'the copy in the prefix must act on that installation, not the default path',
  );
  // The final output tells the user to run "$Prefix\install.ps1 -Uninstall",
  // so the file has to get there even for `irm ... | iex`.
  assert.match(s, /\$selfInstalled/, 'must install a copy of itself');
  assert.match(s, /PSCommandPath/, 'must use its own path when it has one');
});

test('verifies the archive checksum and refuses plain http', () => {
  const s = src();
  assert.match(s, /Get-FileHash/, 'must hash the downloaded archive');
  assert.match(s, /\.sha256/, 'must fetch the published checksum');
  assert.match(s, /https:\/\/\*/, 'must require https for the archive URL');
});

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

test('shortcut launches the GUI directly, without a cmd.exe console', () => {
  const s = src();
  // The whole point: double-clicking the icon must not flash/open a console.
  // So when Python is available the shortcut targets pythonw.exe itself (the
  // GUI-subsystem interpreter) with the script as an argument -- NOT the
  // idm-gui.cmd launcher, which would spawn a cmd.exe window.
  assert.match(s, /\$lnk\.TargetPath = \$python/, 'shortcut must target the Python interpreter');
  assert.match(s, /\$lnk\.Arguments = \$guiArgs/, 'shortcut must pass the GUI args directly');
  // Python is resolved by Find-Python, which must try pythonw.exe (the
  // GUI-subsystem interpreter, no console) before python.exe.
  assert.match(s, /function Find-Python/, 'must resolve the Python interpreter');
  assert.match(
    s,
    /@\("pythonw\.exe", "python\.exe"\)/,
    'must prefer pythonw.exe (no console) over python.exe',
  );
});

test('installs Python with tkinter when missing, so the icon works', () => {
  const s = src();
  // The icon runs a Python/Tk window. If Python or its tkinter module is
  // missing the icon silently does nothing, so the installer must provide them.
  assert.match(s, /function Test-PythonTk/, 'must check that tkinter is importable');
  assert.match(s, /function Ensure-Python/, 'must ensure Python exists');
  assert.match(s, /winget install --id Python\.Python/, 'must install Python via winget');
  assert.match(s, /\$python = Ensure-Python/, 'must use the ensured interpreter');
  assert.match(s, /IDM_NO_PYTHON_INSTALL/, 'must offer an escape hatch');
});

test('persists IDM_ALLOWED_DIR for the fail-closed host', () => {
  assert.match(src(), /SetEnvironmentVariable\(\s*"IDM_ALLOWED_DIR"/, 'must persist IDM_ALLOWED_DIR');
});

test('persists IDM_SETTINGS so the extension can see the Options dialog', () => {
  const s = src();
  // native\idm-host.cmd passes --settings; the variable is the host's fallback
  // for a manifest an older install wrote, which still points straight at
  // bin\idm-host.exe. (test/windows_host.test.mjs covers the wrapper.)
  assert.match(
    s,
    /SetEnvironmentVariable\(\s*"IDM_SETTINGS"/,
    'must persist IDM_SETTINGS',
  );
  // It has to be the settings.json inside the same state dir the GUI gets.
  assert.match(s, /settings\.json/, 'must point at settings.json');
});

test('--Uninstall removes registry keys, shortcuts and the env var', () => {
  const s = src();
  assert.match(s, /if \(\$Uninstall\)/, 'must have an uninstall branch');
  const block = s.slice(s.indexOf('if ($Uninstall)'), s.indexOf('# 1) Download'));
  assert.match(block, /Remove-Item -Path \$key|Remove-Item .*BrowserRegRoots/s, 'must remove registry keys');
  assert.match(block, /IDM\.lnk/, 'must remove the shortcuts');
  assert.match(block, /SetEnvironmentVariable\("IDM_ALLOWED_DIR", \$null/s, 'must clear the env var');
  assert.match(block, /SetEnvironmentVariable\("IDM_SETTINGS", \$null/s, 'must clear IDM_SETTINGS too');
  assert.match(block, /Remove-Item -Recurse -Force \$Prefix/s, 'must remove the install prefix');
});

// --- the one-directory layout (cycle A) --------------------------------------

test('defaults to %USERPROFILE%\\.idm and honours $env:IDM_DIR', () => {
  const s = src();
  assert.match(s, /\$env:IDM_DIR/, 'IDM_DIR must override the default prefix');
  assert.match(
    s,
    /Join-Path \$env:USERPROFILE "\.idm"/,
    'the default must be %USERPROFILE%\\.idm, matching the Linux side',
  );
  assert.ok(
    !/\$Prefix = Join-Path \$env:LOCALAPPDATA "idm"/.test(s),
    'the old %LOCALAPPDATA%\\idm default must be gone (it may still be migrated from)',
  );
});

test('persists IDM_DIR and puts only its bin directory on PATH', () => {
  const s = src();
  assert.match(
    s,
    /SetEnvironmentVariable\(\s*"IDM_DIR",\s*\$Prefix/,
    'IDM_DIR must be persisted for the user, like the export on Linux',
  );
  assert.match(s, /Add-UserPath -Dir \$binDir/, 'only $Prefix\\bin belongs on PATH');
  assert.ok(
    !/Add-UserPath -Dir \$Prefix\b/.test(s),
    'the prefix root itself must not go on PATH any more',
  );
});

test('arranges the archive into bin/ gui/ assets/, like the Linux layout', () => {
  const s = src();
  for (const sub of ['bin', 'gui', 'assets']) {
    assert.match(
      s,
      new RegExp(`Join-Path \\$Prefix "${sub}"`),
      `the ${sub}/ subdirectory must exist under the prefix`,
    );
  }
  assert.match(s, /Join-Path \$binDir "idm\.exe"/, 'idm.exe belongs in bin/');
  assert.match(s, /Join-Path \$binDir "idm-host\.exe"/, 'idm-host.exe belongs in bin/');
});

test('the shortcut carries our own icon', () => {
  const s = src();
  assert.match(
    s,
    /\$idmIco = Join-Path \$assetsDir "idm\.ico"/,
    'the .lnk must use assets\\idm.ico, not a shell32.dll index',
  );
  assert.match(s, /\$lnk\.IconLocation = \$idmIco/, 'and actually assign it');
  assert.ok(
    !/shell32\.dll,167/.test(s),
    'the borrowed shell32 icon must be gone',
  );
});

test('-Uninstall clears IDM_DIR and the bin PATH entry', () => {
  const s = src();
  const block = s.slice(s.indexOf('if ($Uninstall)'), s.indexOf('# 1) Download'));
  assert.match(block, /SetEnvironmentVariable\("IDM_DIR", \$null/, 'must clear IDM_DIR');
  assert.match(block, /Remove-UserPath -Dir \(Join-Path \$Prefix "bin"\)/, 'must drop the bin PATH entry');
});
