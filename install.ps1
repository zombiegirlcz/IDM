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

# Fetch a URL to a file. Invoke-WebRequest does not support the file scheme, so
# a local archive (offline install, installer tests) is copied instead.
function Fetch-File {
    param([string]$Uri, [string]$OutFile)
    if ($Uri -like "file://*") {
        Copy-Item ([System.Uri]$Uri).LocalPath $OutFile -Force
    } else {
        Invoke-WebRequest -Uri $Uri -OutFile $OutFile -UseBasicParsing
    }
}

if (-not $Prefix) {
    # Running from inside an installation (the copy this script keeps in the
    # prefix) means that installation is the one to act on -- otherwise
    # "$Prefix\install.ps1 -Uninstall" would silently target the default
    # location when the user installed somewhere else.
    if ($PSScriptRoot -and (Test-Path (Join-Path $PSScriptRoot "idm-host.exe"))) {
        $Prefix = $PSScriptRoot
    } else {
        $Prefix = Join-Path $env:LOCALAPPDATA "idm"
    }
}
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

# Add a directory to the user PATH, once. Matching the exact entry (not a
# substring) keeps repeated installs from stacking duplicates.
function Add-UserPath {
    param([string]$Dir)
    if ([string]::IsNullOrEmpty($Dir)) { return }
    $cur = [Environment]::GetEnvironmentVariable("Path", "User")
    if ($null -eq $cur) { $cur = "" }
    $parts = @($cur.Split(';') | Where-Object { $_ -ne "" })
    if ($parts -notcontains $Dir) {
        $new = (($parts + $Dir) -join ';')
        [Environment]::SetEnvironmentVariable("Path", $new, "User")
        Write-Log "PATH: pridan $Dir"
    }
}

function Remove-UserPath {
    param([string]$Dir)
    $cur = [Environment]::GetEnvironmentVariable("Path", "User")
    if ([string]::IsNullOrEmpty($cur)) { return }
    $parts = @($cur.Split(';') | Where-Object { $_ -ne "" -and $_ -ne $Dir })
    [Environment]::SetEnvironmentVariable("Path", ($parts -join ';'), "User")
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
    Remove-Item -Force -ErrorAction SilentlyContinue (Join-Path (Get-DesktopDir) "IDM.lnk")
    Remove-Item -Force -ErrorAction SilentlyContinue (Join-Path (Get-StartMenuDir) "IDM.lnk")
    [Environment]::SetEnvironmentVariable("IDM_ALLOWED_DIR", $null, "User")
    [Environment]::SetEnvironmentVariable("IDM_SETTINGS", $null, "User")
    Remove-UserPath -Dir $Prefix
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
    Fetch-File -Uri $ArchiveUrl -OutFile $zip
} catch {
    Die "stazeni selhalo: $_"
}
if (-not (Test-Path $zip)) { Die "archiv se nestahl" }
if ((Get-Item $zip).Length -lt 1000) { Die "archiv je prilis maly" }

# Integrity: every release publishes <asset>.sha256 next to the archive.
$sumFile = Join-Path $tmp "idm.zip.sha256"
$haveSum = $false
try {
    Fetch-File -Uri "$ArchiveUrl.sha256" -OutFile $sumFile
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

# The last line of the output points at "$Prefix\install.ps1 -Uninstall", so
# that file has to be there -- including after `irm ... | iex`, where
# $PSCommandPath is empty and we take the copy from the archive (or re-fetch it).
$selfInstalled = Join-Path $Prefix "install.ps1"
if (-not (Test-Path $selfInstalled)) {
    if ($PSCommandPath -and (Test-Path $PSCommandPath)) {
        Copy-Item $PSCommandPath $selfInstalled -Force
    } else {
        try {
            Fetch-File -Uri "https://raw.githubusercontent.com/$Repo/master/install.ps1" `
                -OutFile $selfInstalled
        } catch {
            Write-Warn "nepodarilo se ulozit install.ps1 pro odinstalaci"
        }
    }
}

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
    # A winget / python.org per-user install is not always on PATH yet.
    $globs = @(
        (Join-Path $env:LOCALAPPDATA "Programs\Python\Python3*\pythonw.exe"),
        (Join-Path $env:LOCALAPPDATA "Programs\Python\Python3*\python.exe"),
        (Join-Path $env:ProgramFiles "Python3*\pythonw.exe"),
        "C:\Python3*\pythonw.exe"
    )
    foreach ($g in $globs) {
        $f = Get-ChildItem -Path $g -ErrorAction SilentlyContinue | Select-Object -First 1
        if ($f) { return $f.FullName }
    }
    return $null
}

function Test-PythonTk {
    param([string]$Py)
    if ([string]::IsNullOrEmpty($Py)) { return $false }
    try {
        & $Py -c "import tkinter" 2>$null | Out-Null
        return ($LASTEXITCODE -eq 0)
    } catch { return $false }
}

# Install Python (the python.org build, which bundles tkinter) when it is
# missing, so a click on the desktop icon really opens a window. The icon runs
# a Python/Tk window; without it the shortcut silently does nothing.
# Set IDM_NO_PYTHON_INSTALL=1 to only report instead of installing.
function Ensure-Python {
    $py = Find-Python
    if (Test-PythonTk $py) { return $py }
    if ($env:IDM_NO_PYTHON_INSTALL -eq "1") {
        Write-Warn "Python/tkinter chybi a IDM_NO_PYTHON_INSTALL=1 zakazuje instalaci"
        return $py
    }
    Write-Log "Python s tkinter chybi - instaluji pres winget"
    if (Get-Command winget -ErrorAction SilentlyContinue) {
        try {
            winget install --id Python.Python.3.12 -e --scope user `
                --accept-source-agreements --accept-package-agreements | Out-Null
        } catch {
            Write-Warn "winget instalace Pythonu selhala: $_"
        }
    } else {
        Write-Warn "winget neni k dispozici - nainstaluj Python z python.org"
    }
    # Refresh PATH so the freshly installed interpreter is found.
    $env:Path = [Environment]::GetEnvironmentVariable("Path","Machine") + ";" + [Environment]::GetEnvironmentVariable("Path","User")
    return (Find-Python)
}

$python = Ensure-Python
$guiPy  = Join-Path $Prefix "idm_gui.py"
$stateDir = Join-Path $Prefix "state"
New-Item -ItemType Directory -Force -Path $stateDir | Out-Null

# The browser extension cannot read settings.json itself; it asks the native
# host (get_settings). On Linux a wrapper passes --settings, but Windows
# browsers spawn the host with no arguments, so persist the path the same way
# IDM_ALLOWED_DIR is persisted. Without it the File Types and force/prevent key
# settings have no effect on what the extension captures.
$settingsFile = Join-Path $stateDir "settings.json"
[Environment]::SetEnvironmentVariable("IDM_SETTINGS", $settingsFile, "User")
$env:IDM_SETTINGS = $settingsFile
Write-Log "nastaveno IDM_SETTINGS = $settingsFile"

# The shortcut targets pythonw.exe (the GUI-subsystem Python) directly, so
# double-clicking it opens ONLY the IDM window -- no cmd.exe console and no
# terminal. The engine backend is spawned by the GUI with CREATE_NO_WINDOW
# (see spawn_server in idm_gui.py), so it stays headless too.
#
# A .cmd launcher is still written for people who want to run it from a shell,
# but the shortcuts never point at it.
$guiArgs = "`"$guiPy`" --engine `"$engineInstalled`" --out-dir `"$DownloadsDir`" --state-dir `"$stateDir`" --autostart"
$launcher = Join-Path $Prefix "idm-gui.cmd"
if ($python -and (Test-Path $guiPy)) {
    $lines = @("@echo off", "`"$python`" $guiArgs")
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
    if ($python -and (Test-Path $guiPy)) {
        # Direct GUI launch: no cmd.exe, no console window.
        $lnk.TargetPath = $python
        $lnk.Arguments = $guiArgs
    } else {
        $lnk.TargetPath = $launcher
    }
    $lnk.WorkingDirectory = $Prefix
    $lnk.Description = "IDM - spravce stahovani"
    $lnk.IconLocation = "$env:SystemRoot\System32\shell32.dll,167"
    $lnk.Save()
}
$desktopLnk = Join-Path (Get-DesktopDir) "IDM.lnk"
New-IdmShortcut -Path $desktopLnk
Write-Log "ikona na plose: $desktopLnk"
New-IdmShortcut -Path (Join-Path (Get-StartMenuDir) "IDM.lnk")

# Put the install dir on the user PATH so `idm` runs from any shell/CMD.
Add-UserPath -Dir $Prefix

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
