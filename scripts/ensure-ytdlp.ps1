# ensure-ytdlp.ps1 — make sure yt-dlp is available on Windows, installing it
# when missing. Counterpart to scripts/ensure-ytdlp.sh and ensure-aria2.ps1.
#
#   powershell -ExecutionPolicy Bypass -File ensure-ytdlp.ps1 [target-dir]
#
# Idempotent. Set $env:IDM_YTDLP_NO_INSTALL=1 to only check (never install).
# Prints the path to yt-dlp on success.
#Requires -Version 5.1
[CmdletBinding()]
param([string]$TargetDir = "")

$ErrorActionPreference = "Stop"
function Write-Log  { param([string]$m) Write-Host "==> $m" -ForegroundColor Cyan }
function Write-Warn { param([string]$m) Write-Host "[!] $m" -ForegroundColor Yellow }
function Have($name) { return [bool](Get-Command $name -ErrorAction SilentlyContinue) }

if (-not $TargetDir) {
    $base = if ($env:IDM_DIR) { $env:IDM_DIR } else { Join-Path $env:USERPROFILE ".idm" }
    $TargetDir = Join-Path $base "bin"
}

if (Have yt-dlp) {
    (Get-Command yt-dlp).Source
    exit 0
}
$local = Join-Path $TargetDir "yt-dlp.exe"
if (Test-Path $local) { $local; exit 0 }

if ($env:IDM_YTDLP_NO_INSTALL -eq "1") {
    Write-Warn "yt-dlp is missing and IDM_YTDLP_NO_INSTALL=1 forbids installing it"
    exit 1
}

Write-Log "yt-dlp not found - installing it"

# A single self-contained exe straight from the project's releases: no package
# manager has to be present, and the version does not depend on what winget
# happens to carry.
$url = "https://github.com/yt-dlp/yt-dlp/releases/latest/download/yt-dlp.exe"
New-Item -ItemType Directory -Force -Path $TargetDir | Out-Null
$tmp = Join-Path $TargetDir ".yt-dlp.download"
try {
    # TLS 1.2 explicitly: Windows PowerShell 5.1 still defaults lower on some
    # builds, and the download then fails with a protocol error.
    [Net.ServicePointManager]::SecurityProtocol = [Net.SecurityProtocolType]::Tls12
    Invoke-WebRequest -Uri $url -OutFile $tmp -UseBasicParsing
    # Renamed into place so a half-downloaded file never sits under the real
    # name waiting to be run.
    Move-Item -Force $tmp $local
} catch {
    Write-Warn "downloading yt-dlp failed: $($_.Exception.Message)"
    if (Have winget) {
        winget install --id yt-dlp.yt-dlp -e --accept-source-agreements --accept-package-agreements
    } elseif (Have choco) {
        choco install -y yt-dlp
    } elseif (Have scoop) {
        scoop install yt-dlp
    }
}

if (Test-Path $local) {
    & $local --version > $null 2>&1
    if ($LASTEXITCODE -eq 0) {
        Write-Log "yt-dlp installed: $local"
        $local
        exit 0
    }
}
if (Have yt-dlp) {
    Write-Log "yt-dlp installed: $((Get-Command yt-dlp).Source)"
    (Get-Command yt-dlp).Source
    exit 0
}

Write-Warn "yt-dlp still not found after installation"
exit 1
