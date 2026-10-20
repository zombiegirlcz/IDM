// The Windows native-messaging host must be wired the way the Linux one is.
//
// Reported after 2.1.9 on Windows: Chrome would not talk to IDM. A browser
// started before the install does not see the user environment variables the
// installer persists (IDM_ALLOWED_DIR, IDM_SETTINGS), so idm-host.exe failed
// closed ("--allowed-dir ... is required") -- while on Linux a wrapper bakes
// those flags in and the same browser works. Firefox was not registered at
// all, -Uninstall threw the vault away, and the window launcher (`idm --gui`)
// had no way to learn which Python the installer found.
//
// The real install runs in the `windows-installer` job and the real host is
// spoken to through the registered manifest in `windows-host`; this is what
// can be checked without Windows.
//
// Runs with: node --test test/windows_host.test.mjs

import test from 'node:test';
import assert from 'node:assert/strict';
import { readFileSync } from 'node:fs';
import { fileURLToPath } from 'node:url';
import { dirname, join } from 'node:path';

const repoRoot = join(dirname(fileURLToPath(import.meta.url)), '..');
const ps1 = () => readFileSync(join(repoRoot, 'install.ps1'), 'utf8');
const yml = () => readFileSync(join(repoRoot, '.github', 'workflows', 'test.yml'), 'utf8');

/** Source of one PowerShell function, `function Name { ... }`, braces balanced. */
function fn(src, name) {
  const at = src.indexOf(`function ${name}`);
  assert.ok(at >= 0, `install.ps1 has no function ${name}`);
  let depth = 0;
  for (let i = src.indexOf('{', at); i < src.length; i += 1) {
    if (src[i] === '{') depth += 1;
    else if (src[i] === '}' && --depth === 0) return src.slice(at, i + 1);
  }
  assert.fail(`function ${name} never closes`);
}

/** The uninstall branch, up to the download section. */
const uninstallBlock = (s) => s.slice(s.indexOf('if ($Uninstall)'), s.indexOf('# 1) Download'));

test('the host wrapper is a pure function of the install paths', () => {
  const body = fn(ps1(), 'Get-HostWrapperLines');
  // The same flags the Linux wrapper (extension/install-host.sh) passes.
  for (const flag of ['--engine', '--allowed-dir', '--settings']) {
    assert.ok(body.includes(flag), `the wrapper must bake in ${flag}`);
  }
  assert.ok(body.includes('%*'), 'the browser\'s own arguments must pass through');
  // Native messaging is binary on stdout: one echoed command line and Chrome
  // reads it as a frame length.
  assert.ok(/@echo off/.test(body), 'the wrapper must not echo anything');
  assert.ok(!/Set-Content|Out-File|New-Item|Remove-Item/.test(body),
    'deciding the lines and writing the file are separate steps');
});

test('paths in the wrapper survive a non-ASCII user name', () => {
  // cmd.exe reads a batch file in the OEM code page, so C:\Users\Lukáš baked
  // in literally can come out as a different directory. %~dp0 and
  // %USERPROFILE% are expanded by cmd itself, in Unicode.
  const body = fn(ps1(), 'ConvertTo-CmdPath');
  assert.ok(body.includes('%~dp0'), 'paths inside the prefix must be relative to the wrapper');
  assert.ok(body.includes('%USERPROFILE%'), 'paths under the profile must use %USERPROFILE%');
  assert.ok(body.includes("'%%'"), 'a literal % must be doubled, or cmd expands it');
});

test('the wrapper and both manifests live in native\\', () => {
  const s = ps1();
  assert.ok(/\$nativeDir\s*=\s*Join-Path \$Prefix "native"/.test(s), 'native\\ under the prefix, as on Linux');
  assert.ok(/Join-Path \$nativeDir "idm-host\.cmd"/.test(s), 'the wrapper is native\\idm-host.cmd');
  assert.ok(/Join-Path \$nativeDir "\$HostName\.json"/.test(s), 'the Chrome manifest is in native\\');
  assert.ok(/Join-Path \$nativeDir "\$HostName\.firefox\.json"/.test(s), 'the Firefox manifest is in native\\');
  assert.ok(/path\s*=\s*\$wrapper/.test(s), 'the manifests must point at the wrapper, not at idm-host.exe');
  assert.ok(!/path\s*=\s*\$hostInstalled/.test(s), 'nothing may point the browser at bin\\idm-host.exe directly');
});

test('the manifest the old layout left at the prefix root goes away', () => {
  assert.ok(/Remove-Item[^\n]*\(Join-Path \$Prefix "\$HostName\.json"\)/.test(ps1()),
    'a stale $Prefix\\com.tonec.idm.json still points the browser at bin\\');
});

test('manifests are written without a byte-order mark', () => {
  // Windows PowerShell's "UTF8" writes a BOM; a JSON parser is entitled to
  // refuse it, and the browser then reports the host as not found.
  const s = ps1();
  assert.ok(/function Write-JsonFile/.test(s), 'one helper writes every manifest');
  assert.ok(/UTF8Encoding[^\n]*\$false/.test(fn(s, 'Write-JsonFile')), 'UTF-8 without BOM');
  assert.ok(!/ConvertTo-Json[^\n]*Set-Content -Encoding UTF8/.test(s), 'the BOM-writing path must be gone');
});

test('Firefox is registered with the add-on id from its own template', () => {
  const s = ps1();
  assert.ok(s.includes('HKCU:\\Software\\Mozilla\\NativeMessagingHosts'), 'Firefox reads HKCU\\Software\\Mozilla');
  assert.ok(s.includes('com.tonec.idm.firefox.json') || /\$HostName\.firefox\.json/.test(s),
    'the gecko id comes from extension\\com.tonec.idm.firefox.json');
  assert.ok(/allowed_extensions/.test(s), 'Firefox allows by add-on id, not by origin');
  assert.ok(/\$FirefoxRegRoot/.test(uninstallBlock(s)), '-Uninstall must remove the Mozilla key too');
});

test('-Uninstall keeps state\\ unless -Purge', () => {
  const s = ps1();
  // `idm uninstall` calls exactly `install.ps1 -Uninstall [-Purge]`.
  assert.ok(/\[switch\]\$Purge/.test(s), 'a -Purge switch, like install.sh --purge');
  const block = uninstallBlock(s);
  assert.ok(/if \(\$Purge\)/.test(block), '-Purge decides whether state\\ goes');
  assert.ok(/-ne "state"/.test(block), 'without it everything but state\\ is removed');
});

test('IDM_PYTHON is persisted for `idm --gui` and removed on uninstall', () => {
  const s = ps1();
  assert.ok(/SetEnvironmentVariable\("IDM_PYTHON", \$python/.test(s), 'persist the interpreter Ensure-Python found');
  assert.ok(/SetEnvironmentVariable\("IDM_PYTHON", \$null/.test(uninstallBlock(s)), 'and clear it on -Uninstall');
});

test('the pre-0.2 installation is stopped before it is migrated', () => {
  const s = ps1();
  const stop = s.indexOf('Stop-IdmProcesses -Root $oldPrefix');
  assert.ok(stop >= 0, 'a running %LOCALAPPDATA%\\idm keeps its files and its directory');
  assert.ok(stop < s.indexOf('Remove-Item -Recurse -Force $oldPrefix'), 'stop it before deleting it');
});

test('Stop-IdmProcesses never kills its own caller', () => {
  // `idm uninstall` runs install.ps1 from bin\idm.exe; killing that process
  // takes its exit code and its output with it.
  assert.ok(/ParentProcessId/.test(fn(ps1(), 'Stop-IdmProcesses')), 'must walk up from $PID');
});

test('CI speaks to the real host through the registered manifest', () => {
  const y = yml();
  const at = y.indexOf('\n  windows-host:');
  assert.ok(at >= 0, 'test.yml needs a windows-host job');
  const rest = y.slice(at + 1);
  const next = rest.slice(1).search(/\n  [\w-]+:\n/);
  const job = next < 0 ? rest : rest.slice(0, next + 1);
  assert.ok(/cargo build --release --bin idm-host --bin idm/.test(job), 'with the real binaries');
  assert.ok(/NativeMessagingHosts/.test(job), 'found the way Chrome finds it');
  assert.ok(/IDM_ALLOWED_DIR/.test(job), 'with the variables cleared, as for a browser started earlier');
});
