# ensure-ffmpeg.ps1 — make sure ffmpeg is available on Windows, installing it
# via winget/choco/scoop when missing. Counterpart to ensure-ffmpeg.sh.
#
#   powershell -ExecutionPolicy Bypass -File ensure-ffmpeg.ps1
#
# Merging a high resolution video with its audio track needs ffmpeg; without
# it yt-dlp leaves the two halves on disk and the window reports a failure.
#
# Idempotent. Set $env:IDM_FFMPEG_NO_INSTALL=1 to only check (never install).
#Requires -Version 5.1
[CmdletBinding()]
param([string]$TargetDir = "")

$ErrorActionPreference = "Stop"
function Write-Log { param([string]$m) Write-Host "==> $m" -ForegroundColor Cyan }
function Write-Warn { param([string]$m) Write-Host "[!] $m" -ForegroundColor Yellow }

function Have($name) { return [bool](Get-Command $name -ErrorAction SilentlyContinue) }

if (-not $TargetDir) {
    $root = if ($env:IDM_DIR) { $env:IDM_DIR } else { Join-Path $env:USERPROFILE ".idm" }
    $TargetDir = Join-Path $root "bin"
}

if (Have ffmpeg) {
    Write-Host "ffmpeg already found: $((Get-Command ffmpeg).Source)"
    exit 0
}
$local = Join-Path $TargetDir "ffmpeg.exe"
if (Test-Path $local) {
    Write-Host $local
    exit 0
}

if ($env:IDM_FFMPEG_NO_INSTALL -eq "1") {
    Write-Warn "ffmpeg is missing and IDM_FFMPEG_NO_INSTALL=1 forbids installing it"
    exit 1
}

Write-Log "ffmpeg not found - installing it"

$installed = $false
if (Have winget) {
    winget install --id Gyan.FFmpeg -e --accept-source-agreements --accept-package-agreements
    if ($LASTEXITCODE -eq 0) { $installed = $true }
} elseif (Have choco) {
    choco install -y ffmpeg
    if ($LASTEXITCODE -eq 0) { $installed = $true }
} elseif (Have scoop) {
    scoop install ffmpeg
    if ($LASTEXITCODE -eq 0) { $installed = $true }
}

# winget/choco install outside this shell's PATH; look where they put it.
if (-not (Have ffmpeg)) {
    $cands = @(
        (Join-Path $env:LOCALAPPDATA "Microsoft\WinGet\Packages\Gyan.FFmpeg*"),
        (Join-Path $env:USERPROFILE "scoop\shims"),
        "C:\ProgramData\chocolatey\bin",
        "C:\ffmpeg\bin"
    )
    foreach ($c in $cands) {
        $found = Get-ChildItem -Path $c -Filter ffmpeg.exe -Recurse -ErrorAction SilentlyContinue |
            Select-Object -First 1
        if ($found) {
            Write-Log "ffmpeg installed at $($found.FullName)"
            # yt-dlp looks for ffmpeg next to itself and on PATH; a copy in
            # bin\ means the engine finds it without touching the user's PATH.
            try {
                New-Item -ItemType Directory -Force -Path $TargetDir | Out-Null
                Copy-Item $found.FullName (Join-Path $TargetDir "ffmpeg.exe") -Force
                $probe = Join-Path $found.DirectoryName "ffprobe.exe"
                if (Test-Path $probe) {
                    Copy-Item $probe (Join-Path $TargetDir "ffprobe.exe") -Force
                }
            } catch { }
            exit 0
        }
    }
}

if (Have ffmpeg) {
    Write-Log "ffmpeg installed: $((Get-Command ffmpeg).Source)"
    exit 0
}

Write-Warn "ffmpeg still not found; video with sound cannot be merged"
exit 1
