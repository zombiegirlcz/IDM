# install.ps1 - one-line installer for the IDM-like downloader on Windows.
#
#   irm https://raw.githubusercontent.com/zombiegirlcz/IDM/master/install.ps1 | iex
#
# Unlike a "build from source" installer, this one does NOT need git, Rust or a
# compiler. It simply downloads the prebuilt release archive (built by GitHub
# Actions) and unpacks it, exactly like real IDM ships as a ready-made .exe.
#
# What it does (user-scoped, no admin):
#   1. download idm-windows-x64.zip from the latest GitHub release
#   2. unpack to %LOCALAPPDATA%\idm
#   3. register the native-messaging host in HKCU (Chrome/Edge/Brave/Chromium)
#   4. persist IDM_ALLOWED_DIR (the host is fail-closed)
#   5. create a Desktop + Start-Menu shortcut that opens the native window
#
# Parameters:
#   -Uninstall        remove everything
#   -Prefix DIR       install prefix (default %LOCALAPPDATA%\idm)
#   -DownloadsDir DIR download directory (default %USERPROFILE%\Downloads)
#   -Version TAG      release tag (default: latest)
#   -ArchiveUrl URL   use a specific archive URL instead of the release
#
#Requires -Version 5.1
[CmdletBinding()]
param(
    [switch]$Uninstall,
    [string]$Prefix = "",
    [string]$DownloadsDir = "",
    [string]$Version = "latest",
    [string]$ArchiveUrl = ""
)

$ErrorActionPreference = "Stop"
$HostName = "com.tonec.idm"
$ExtensionId = "gnhajaopemmibmjhkaafdebogmkkcljc"
$Repo = "zombiegirlcz/IDM"
$Asset = "idm-windows-x64.zip"

function Write-Log  { param([string]$m) Write-Host "==> $m" -ForegroundColor Cyan }
function Write-Warn { param([string]$m) Write-Host "[!] $m" -ForegroundColor Yellow }
function Die        { param([string]$m) Write-Host "[x] $m" -ForegroundColor Red; exit 1 }

if (-not $Prefix)       { $Prefix = Join-Path $env:LOCALAPPDATA "idm" }
if (-not $DownloadsDir) { $DownloadsDir = Join-Path $env:USERPROFILE "Downloads" }

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
function Get-StartMenuDir { return (Join-Path $env:APPDATA "Microsoft\Windows\Start Menu\Programs") }

# --------------------------------------------------------------------------- #
# Uninstall
# --------------------------------------------------------------------------- #
if ($Uninstall) {
    Write-Log "odinstalace"
    foreach ($root in $BrowserRegRoots) {
        $key = Join-Path $root $HostName
        if (Test-Path $key) { Remove-Item -Path $key -Recurse -Force -ErrorAction SilentlyContinue }
    }
    Remove-Item -Force -ErrorAction SilentlyContinue (Join-Path (Get-DesktopDir) "IDM.lnk")
    Remove-Item -Force -ErrorAction SilentlyContinue (Join-Path (Get-StartMenuDir) "IDM.lnk")
    [Environment]::SetEnvironmentVariable("IDM_ALLOWED_DIR", $null, "User")
    if (Test-Path $Prefix) { Remove-Item -Recurse -Force $Prefix -ErrorAction SilentlyContinue }
    Write-Log "hotovo - odstraneno"
    exit 0
}

# --------------------------------------------------------------------------- #
# 1) Download the prebuilt archive (no git, no Rust)
# --------------------------------------------------------------------------- #
if (-not $ArchiveUrl) {
    if ($Version -eq "latest") {
        $ArchiveUrl = "https://github.com/$Repo/releases/latest/download/$Asset"
    } else {
        $ArchiveUrl = "https://github.com/$Repo/releases/download/$Version/$Asset"
    }
}
# Only https from the network; a local file:// path is as trusted as the disk.
if (($ArchiveUrl -notlike "https://*") -and ($ArchiveUrl -notlike "file://*")) {
    Die "archiv se stahuje jen pres https (nebo file://): $ArchiveUrl"
}
Write-Log "stahuji $ArchiveUrl"
$tmp = Join-Path $env:TEMP "idm_dl_tmp"
Remove-Item -Recurse -Force $tmp -ErrorAction SilentlyContinue
New-Item -ItemType Directory -Force -Path $tmp | Out-Null
$zip = Join-Path $tmp "idm.zip"
try {
    Invoke-WebRequest -Uri $ArchiveUrl -OutFile $zip -UseBasicParsing
} catch {
    Die "stazeni selhalo: $_"
}
if (-not (Test-Path $zip)) { Die "archiv se nestahl" }
if ((Get-Item $zip).Length -lt 1000) { Die "archiv je prilis maly" }

# Integrity: every release publishes <asset>.sha256 next to the archive.
$sumFile = Join-Path $tmp "idm.zip.sha256"
$haveSum = $false
try {
    Invoke-WebRequest -Uri "$ArchiveUrl.sha256" -OutFile $sumFile -UseBasicParsing
    $haveSum = Test-Path $sumFile
} catch {
    $haveSum = $false
}
if ($haveSum) {
    $want = ((Get-Content $sumFile -First 1) -split '\s+')[0]
    $got  = (Get-FileHash -Path $zip -Algorithm SHA256).Hash
    if ($want -and $got -ne $want) {
        Die "kontrolni soucet nesouhlasi (cekano $want, ziskano $got)"
    }
    Write-Log "kontrolni soucet overen"
} else {
    Write-Warn "k archivu neni $ArchiveUrl.sha256 - pokracuji bez overeni souctu"
}

# --------------------------------------------------------------------------- #
# 2) Unpack
# --------------------------------------------------------------------------- #
Write-Log "rozbalavam do $Prefix"
if (Test-Path $Prefix) { Remove-Item -Recurse -Force $Prefix -ErrorAction SilentlyContinue }
New-Item -ItemType Directory -Force -Path $Prefix | Out-Null
Expand-Archive -Path $zip -DestinationPath $Prefix -Force
Remove-Item -Recurse -Force $tmp -ErrorAction SilentlyContinue

$engineInstalled = Join-Path $Prefix "idm.exe"
$hostInstalled   = Join-Path $Prefix "idm-host.exe"
$ensurePs1       = Join-Path $Prefix "ensure-aria2.ps1"
if (-not (Test-Path $engineInstalled)) { Die "chybi idm.exe v archivu" }
if (-not (Test-Path $hostInstalled))   { Die "chybi idm-host.exe v archivu" }
New-Item -ItemType Directory -Force -Path $DownloadsDir | Out-Null

# --------------------------------------------------------------------------- #
# 3) Native-messaging host manifest + registry
# --------------------------------------------------------------------------- #
$manifestPath = Join-Path $Prefix "$HostName.json"
$manifest = [ordered]@{
    name            = $HostName
    description     = "IDM-like native messaging host"
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
        Write-Warn "nepodarilo se zapsat $root"
    }
}

# The host is fail-closed: it needs an allowed directory. Windows browsers
# spawn it with no arguments, so we persist it for the user.
[Environment]::SetEnvironmentVariable("IDM_ALLOWED_DIR", $DownloadsDir, "User")
$env:IDM_ALLOWED_DIR = $DownloadsDir
Write-Log "nastaveno IDM_ALLOWED_DIR = $DownloadsDir"

# --------------------------------------------------------------------------- #
# 4) Launcher + Desktop / Start-Menu shortcuts (native window)
# --------------------------------------------------------------------------- #
function Find-Python {
    foreach ($name in @("pythonw.exe", "python.exe")) {
        $c = Get-Command $name -ErrorAction SilentlyContinue
        if ($c) { return $c.Source }
    }
    return $null
}
$python = Find-Python
$guiPy  = Join-Path $Prefix "idm_gui.py"
$stateDir = Join-Path $Prefix "state"
New-Item -ItemType Directory -Force -Path $stateDir | Out-Null

# A small .cmd launcher keeps the shortcut target simple and avoids quoting hell.
$launcher = Join-Path $Prefix "idm-gui.cmd"
if ($python -and (Test-Path $guiPy)) {
    $lines = @(
        "@echo off",
        "`"$python`" `"$guiPy`" --engine `"$engineInstalled`" --out-dir `"$DownloadsDir`" --state-dir `"$stateDir`" --autostart"
    )
} else {
    $lines = @("@echo off", "`"$engineInstalled`" --serve 127.0.0.1:8080 --output-dir `"$DownloadsDir`" --state-dir `"$stateDir`"")
}
Set-Content -Encoding ASCII -Path $launcher -Value $lines
if (-not $python) {
    Write-Warn "Python nenalezen - nativni okno nepujde spustit (winget install Python.Python.3.12)"
}

function New-IdmShortcut {
    param([string]$Path)
    $ws = New-Object -ComObject WScript.Shell
    $lnk = $ws.CreateShortcut($Path)
    $lnk.TargetPath = $launcher
    $lnk.WorkingDirectory = $Prefix
    $lnk.Description = "IDM - spravce stahovani"
    $lnk.IconLocation = "$env:SystemRoot\System32\shell32.dll,167"
    $lnk.Save()
}
$desktopLnk = Join-Path (Get-DesktopDir) "IDM.lnk"
New-IdmShortcut -Path $desktopLnk
Write-Log "ikona na plose: $desktopLnk"
New-IdmShortcut -Path (Join-Path (Get-StartMenuDir) "IDM.lnk")

Write-Host ""
Write-Log "hotovo!"
Write-Host "  Engine     : $engineInstalled"
Write-Host "  Okno       : dvojklik na ikonu 'IDM' na plose (nebo v menu Start)"
Write-Host "  Stazeni    : $DownloadsDir"
Write-Host "  Rozsireni  : chrome://extensions -> Load unpacked"
if (Test-Path $ensurePs1) {
    Write-Host "  aria2      : prepinac 'Via aria2' v okne; aria2c se doinstaluje sam"
}
Write-Host ""
Write-Host "  Odinstalace: irm <tento-skript> | iex; potom:"
Write-Host "               (dostupne take: $Prefix\install.ps1 -Uninstall)"
Write-Host ""
