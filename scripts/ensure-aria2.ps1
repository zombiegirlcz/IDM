# ensure-aria2.ps1 — make sure aria2c is available on Windows, installing it via
# winget/choco/scoop when missing. Counterpart to scripts/ensure-aria2.sh.
#
#   powershell -ExecutionPolicy Bypass -File ensure-aria2.ps1
#
# Idempotent. Set $env:IDM_ARIA2_NO_INSTALL=1 to only check (never install).
#Requires -Version 5.1
[CmdletBinding()]
param()

$ErrorActionPreference = "Stop"
function Write-Log { param([string]$m) Write-Host "==> $m" -ForegroundColor Cyan }
function Write-Warn { param([string]$m) Write-Host "[!] $m" -ForegroundColor Yellow }

function Have($name) { return [bool](Get-Command $name -ErrorAction SilentlyContinue) }

if (Have aria2c) {
    Write-Host "aria2c already found: $((Get-Command aria2c).Source)"
    exit 0
}

if ($env:IDM_ARIA2_NO_INSTALL -eq "1") {
    Write-Warn "aria2c is missing and IDM_ARIA2_NO_INSTALL=1 forbids installing it"
    exit 1
}

Write-Log "aria2c not found - installing it"

$installed = $false
if (Have winget) {
    winget install --id aria2.aria2 -e --accept-source-agreements --accept-package-agreements
    if ($LASTEXITCODE -eq 0) { $installed = $true }
} elseif (Have choco) {
    choco install -y aria2
    if ($LASTEXITCODE -eq 0) { $installed = $true }
} elseif (Have scoop) {
    scoop install aria2
    if ($LASTEXITCODE -eq 0) { $installed = $true }
} else {
    Write-Warn "no package manager (winget/choco/scoop) found to install aria2c"
    exit 1
}

# winget installs to a per-user location that may not be on this shell's PATH.
if (-not (Have aria2c)) {
    $cands = @(
        (Join-Path $env:LOCALAPPDATA "Microsoft\WinGet\Packages\aria2.aria2*"),
        (Join-Path $env:USERPROFILE "scoop\shims"),
        "C:\ProgramData\chocolatey\bin"
    )
    foreach ($c in $cands) {
        $found = Get-ChildItem -Path $c -Filter aria2c.exe -Recurse -ErrorAction SilentlyContinue |
            Select-Object -First 1
        if ($found) { Write-Log "aria2c installed at $($found.FullName)"; exit 0 }
    }
}

if (Have aria2c) {
    Write-Log "aria2c installed: $((Get-Command aria2c).Source)"
    exit 0
}

Write-Warn "aria2c still not found after installation"
exit 1
