# install.ps1 — one-line installer for the IDM-like downloader on Windows.
#
#   irm https://raw.githubusercontent.com/zombiegirlcz/IDM/master/install.ps1 | iex
#
# or, if you prefer to see it first:
#
#   irm https://raw.githubusercontent.com/zombiegirlcz/IDM/master/install.ps1 -OutFile install.ps1
#   powershell -ExecutionPolicy Bypass -File install.ps1
#
# What it does (everything user-scoped, no admin required):
#   1. fetches the source (or uses a local checkout via -SourceDir)
#   2. builds the engine + native-messaging host with cargo (unless -SkipBuild)
#   3. installs the binaries under %LOCALAPPDATA%\idm\bin
#   4. registers the browser native-messaging host in HKCU for
#      Chrome / Edge / Brave / Chromium
#   5. persists IDM_ALLOWED_DIR for the user (the host is fail-closed)
#   6. creates a Desktop shortcut and a Start-Menu entry that open the native
#      Tkinter window
#
# Parameters:
#   -Uninstall        remove everything this script installed
#   -SourceDir DIR    use an existing checkout instead of cloning
#   -SkipBuild        do not run cargo (binaries must already be present)
#   -Prefix DIR       install prefix (default %LOCALAPPDATA%\idm)
#   -DownloadsDir DIR download directory (default %USERPROFILE%\Downloads)
#   -Ref REF          git branch/tag (default master)
#   -RepoUrl URL      git URL (default the GitHub repo)
#
#Requires -Version 5.1
[CmdletBinding()]
param(
    [switch]$Uninstall,
    [string]$SourceDir = "",
    [switch]$SkipBuild,
    [string]$Prefix = "",
    [string]$DownloadsDir = "",
    [string]$Ref = "master",
    [string]$RepoUrl = "https://github.com/zombiegirlcz/IDM.git"
)

$ErrorActionPreference = "Stop"

function Write-Log  { param([string]$m) Write-Host "==> $m" -ForegroundColor Cyan }
function Write-Warn { param([string]$m) Write-Host "[!] $m" -ForegroundColor Yellow }
function Die        { param([string]$m) Write-Host "[x] $m" -ForegroundColor Red; exit 1 }

if (-not $Prefix)       { $Prefix = Join-Path $env:LOCALAPPDATA "idm" }
if (-not $DownloadsDir) { $DownloadsDir = Join-Path $env:USERPROFILE "Downloads" }

$HostName = "com.tonec.idm"
$ExtensionId = "gnhajaopemmibmjhkaafdebogmkkcljc"

# Browser registry roots (HKCU => no admin needed). Chrome/Edge/Brave/Chromium
# all read NativeMessagingHosts from here.
$BrowserRegRoots = @(
    "HKCU:\Software\Google\Chrome\NativeMessagingHosts",
    "HKCU:\Software\Microsoft\Edge\NativeMessagingHosts",
    "HKCU:\Software\BraveSoftware\Brave-Browser\NativeMessagingHosts",
    "HKCU:\Software\Chromium\NativeMessagingHosts"
)

function Get-DesktopDir {
    $d = [Environment]::GetFolderPath("Desktop")
    if ([string]::IsNullOrEmpty($d)) { $d = Join-Path $env:USERPROFILE "Desktop" }
    return $d
}

function Get-StartMenuDir {
    return (Join-Path $env:APPDATA "Microsoft\Windows\Start Menu\Programs")
}

# --------------------------------------------------------------------------- #
# Uninstall
# --------------------------------------------------------------------------- #
if ($Uninstall) {
    Write-Log "odinstalace"
    foreach ($root in $BrowserRegRoots) {
        $key = Join-Path $root $HostName
        if (Test-Path $key) { Remove-Item -Path $key -Recurse -Force -ErrorAction SilentlyContinue }
    }
    $desktop = Get-DesktopDir
    Remove-Item -Force -ErrorAction SilentlyContinue (Join-Path $desktop "IDM.lnk")
    Remove-Item -Force -ErrorAction SilentlyContinue (Join-Path (Get-StartMenuDir) "IDM.lnk")
    [Environment]::SetEnvironmentVariable("IDM_ALLOWED_DIR", $null, "User")
    if (Test-Path $Prefix) { Remove-Item -Recurse -Force $Prefix -ErrorAction SilentlyContinue }
    Write-Log "hotovo — odstraněno"
    exit 0
}
# --------------------------------------------------------------------------- #
# 1) Source
# --------------------------------------------------------------------------- #
$src = $SourceDir
$tmpClone = $null
if (-not $src) {
    $git = Get-Command git -ErrorAction SilentlyContinue
    if (-not $git) { Die "git neni nainstalovany" }
    $tmpClone = Join-Path $env:TEMP "idm_clone_src"
    Write-Log "stahuji zdroj z $RepoUrl"
    & git clone --depth 1 --branch $Ref $RepoUrl $tmpClone
    if ($LASTEXITCODE -ne 0) {
        & git clone --depth 1 $RepoUrl $tmpClone
    }
    if ($LASTEXITCODE -ne 0) { Die "clone selhal" }
    $src = $tmpClone
}
$eng = Join-Path $src "engine"
if (-not (Test-Path $eng)) { Die "chybi engine" }
# --------------------------------------------------------------------------- #
# 2) Build
# --------------------------------------------------------------------------- #
if (-not $SkipBuild) {
    $cargo = Get-Command cargo -ErrorAction SilentlyContinue
    if (-not $cargo) {
        $cand = Join-Path $env:USERPROFILE ".cargo\bin\cargo.exe"
        if (Test-Path $cand) {
            $env:PATH = (Join-Path $env:USERPROFILE ".cargo\bin") + ";" + $env:PATH
            $cargo = Get-Command cargo -ErrorAction SilentlyContinue
        }
    }
    if (-not $cargo) { Die "cargo (Rust) neni nainstalovany. winget install Rustlang.Rustup" }
    Write-Log "stavim engine (cargo build --release)"
    Push-Location (Join-Path $src "engine")
    try {
        & cargo build --release
        if ($LASTEXITCODE -ne 0) { Die "cargo build selhal" }
    } finally { Pop-Location }
}
$engineSrc = Join-Path $src "engine\target\release\idm.exe"
$hostSrc   = Join-Path $src "engine\target\release\idm-host.exe"
if (-not (Test-Path $engineSrc)) { Die "chybi $engineSrc" }
if (-not (Test-Path $hostSrc))   { Die "chybi $hostSrc" }

# --------------------------------------------------------------------------- #
# 3) Install into $Prefix
# --------------------------------------------------------------------------- #
Write-Log "instaluji do $Prefix"
$binDir  = Join-Path $Prefix "bin"
$extDir  = Join-Path $Prefix "extension"
$guiDir  = Join-Path $Prefix "gui"
foreach ($d in @($binDir, $extDir, $guiDir, $DownloadsDir)) {
    New-Item -ItemType Directory -Force -Path $d | Out-Null
}
Copy-Item -Force $engineSrc (Join-Path $binDir "idm.exe")
Copy-Item -Force $hostSrc   (Join-Path $binDir "idm-host.exe")
if (Test-Path (Join-Path $src "gui\idm_gui.py")) {
    Copy-Item -Force (Join-Path $src "gui\idm_gui.py") (Join-Path $guiDir "idm_gui.py")
}
$selfSrc = Join-Path $src "install.ps1"
if (Test-Path $selfSrc) { Copy-Item -Force $selfSrc (Join-Path $Prefix "install.ps1") }
$engineInstalled = Join-Path $binDir "idm.exe"
$hostInstalled   = Join-Path $binDir "idm-host.exe"

# --------------------------------------------------------------------------- #
# 4) Native-messaging host manifest + registry
# --------------------------------------------------------------------------- #
$manifestPath = Join-Path $Prefix "$HostName.json"
$manifest = [ordered]@{
    name            = $HostName
    description     = "IDM-like native messaging host (spawns the idm engine)"
    path            = $hostInstalled
    type            = "stdio"
    allowed_origins = @("chrome-extension://$ExtensionId/")
}
$manifest | ConvertTo-Json -Depth 5 | Set-Content -Encoding UTF8 $manifestPath
Write-Log "registruji native-messaging hosta (HKCU)"
foreach ($root in $BrowserRegRoots) {
    try {
        $key = Join-Path $root $HostName
        New-Item -Path $key -Force | Out-Null
        Set-ItemProperty -Path $key -Name "(Default)" -Value $manifestPath
    } catch {
        Write-Warn "nepodarilo se zapsat $root : $_"
    }
}
[Environment]::SetEnvironmentVariable("IDM_ALLOWED_DIR", $DownloadsDir, "User")
$env:IDM_ALLOWED_DIR = $DownloadsDir
Write-Log "nastaveno IDM_ALLOWED_DIR = $DownloadsDir"

# --------------------------------------------------------------------------- #
# 5) Desktop + Start-Menu shortcuts (native window)
# --------------------------------------------------------------------------- #
function Find-Python {
    foreach ($name in @("pythonw.exe", "python.exe")) {
        $c = Get-Command $name -ErrorAction SilentlyContinue
        if ($c) { return $c.Source }
    }
    return $null
}
$python = Find-Python
$guiPy  = Join-Path $guiDir "idm_gui.py"
if (-not $python) {
    Write-Warn "Python nenalezen - nativni okno nepujde spustit (winget install Python.Python.3.12)"
}
$shortcutTarget = $engineInstalled
$shortcutArgs   = ""
if ($python -and (Test-Path $guiPy)) {
    $shortcutTarget = $python
    $stateDir = Join-Path $Prefix "state"
    $shortcutArgs = "`"$guiPy`" --engine `"$engineInstalled`" --out-dir `"$DownloadsDir`" --state-dir `"$stateDir`" --autostart"
}
function New-IdmShortcut {
    param([string]$Path)
    $ws = New-Object -ComObject WScript.Shell
    $lnk = $ws.CreateShortcut($Path)
    $lnk.TargetPath = $shortcutTarget
    $lnk.Arguments = $shortcutArgs
    $lnk.WorkingDirectory = $Prefix
    $lnk.Description = "IDM - spravce stahovani"
    $lnk.IconLocation = "$env:SystemRoot\System32\shell32.dll,167"
    $lnk.Save()
}
$desktopLnk = Join-Path (Get-DesktopDir) "IDM.lnk"
New-IdmShortcut -Path $desktopLnk
Write-Log "ikona na plose: $desktopLnk"
$startLnk = Join-Path (Get-StartMenuDir) "IDM.lnk"
New-IdmShortcut -Path $startLnk
if ($tmpClone -and (Test-Path $tmpClone)) { Remove-Item -Recurse -Force $tmpClone -ErrorAction SilentlyContinue }
Write-Host ""
Write-Log "hotovo!"
Write-Host "  Engine     : $engineInstalled"
Write-Host "  Okno       : dvojklik na ikonu 'IDM' na plose (nebo v menu Start)"
Write-Host "  Stazeni    : $DownloadsDir"
Write-Host "  Rozsireni  : chrome://extensions -> Developer mode -> Load unpacked -> extension"
Write-Host ""
Write-Host "  Odinstalace: powershell -ExecutionPolicy Bypass -File `"$Prefix\install.ps1`" -Uninstall"
Write-Host ""
Write-Warn "Pokud build selhal na 'link.exe not found', nainstaluj MinGW:"
Write-Warn "  winget install BrechtSanders.WinLibs.POSIX.UCRT"
