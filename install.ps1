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
#   2. unpack to %USERPROFILE%\.idm (bin\ gui\ assets\ extension\)
#   3. write native\idm-host.cmd (the host with its flags baked in) and
#      register it in HKCU for Chrome/Edge/Brave/Chromium and Firefox
#   4. persist IDM_ALLOWED_DIR / IDM_SETTINGS (fallback for older manifests)
#   5. create a Desktop + Start-Menu shortcut that opens the native window
#
# Parameters:
#   -Uninstall        remove everything except state\ (queue, settings, vault)
#   -Purge            with -Uninstall: remove state\ too
#   -Prefix DIR       install directory (default %USERPROFILE%\.idm, or $env:IDM_DIR)
#   -DownloadsDir DIR download directory (default %USERPROFILE%\Downloads)
#   -Version TAG      release tag (default: latest)
#   -ArchiveUrl URL   use a specific archive URL instead of the release
#
#Requires -Version 5.1
[CmdletBinding()]
param(
    [switch]$Uninstall,
    [switch]$Purge,
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
    if ($PSScriptRoot -and (Test-Path (Join-Path $PSScriptRoot "bin\idm-host.exe"))) {
        $Prefix = $PSScriptRoot
    } elseif ($env:IDM_DIR) {
        $Prefix = $env:IDM_DIR
    } else {
        # Same place and same name as the Linux side, so one documented
        # variable describes both: IDM_DIR.
        $Prefix = Join-Path $env:USERPROFILE ".idm"
    }
}
if (-not $DownloadsDir) { $DownloadsDir = Join-Path $env:USERPROFILE "Downloads" }
# Both end up in the registry and in native\idm-host.cmd, which the browser
# runs from its own working directory: a relative -Prefix would point it at
# nothing.
$Prefix       = $ExecutionContext.SessionState.Path.GetUnresolvedProviderPathFromPSPath($Prefix)
$DownloadsDir = $ExecutionContext.SessionState.Path.GetUnresolvedProviderPathFromPSPath($DownloadsDir)

$BrowserRegRoots = @(
    "HKCU:\Software\Google\Chrome\NativeMessagingHosts",
    "HKCU:\Software\Microsoft\Edge\NativeMessagingHosts",
    "HKCU:\Software\BraveSoftware\Brave-Browser\NativeMessagingHosts",
    "HKCU:\Software\Chromium\NativeMessagingHosts"
)
# Firefox reads its own key and allows hosts by add-on id, not by origin.
$FirefoxRegRoot = "HKCU:\Software\Mozilla\NativeMessagingHosts"

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

# Stop whatever runs out of this installation: idm.exe (the window's server),
# idm-host.exe (the browser keeps it alive) and the window itself (pythonw
# running gui\idm_gui.py). Windows will not delete or overwrite an exe that is
# in use, so without this a reinstall left the old binaries -- and, because
# the copy then failed, the old GUI too: "it still installs 2.0.7".
function Stop-IdmProcesses {
    param([string]$Root)
    if (-not (Test-Path $Root)) { return }
    $root = [System.IO.Path]::GetFullPath($Root).TrimEnd('\') + '\'
    $all = @(Get-CimInstance Win32_Process -ErrorAction SilentlyContinue)
    # Never our own caller: `idm uninstall` runs this script from bin\idm.exe,
    # and killing that process takes its exit code and its output with it.
    # Walk up from $PID and leave the whole chain alone.
    $parentOf = @{}
    foreach ($p in $all) { $parentOf[[int]$p.ProcessId] = [int]$p.ParentProcessId }
    $mine = @{}
    $id = $PID
    while ($id -gt 0 -and -not $mine.ContainsKey($id)) {
        $mine[$id] = $true
        $id = if ($parentOf.ContainsKey($id)) { $parentOf[$id] } else { 0 }
    }
    # cmd.exe counts too: the browser runs native\idm-host.cmd through it, and
    # its working directory inside native\ keeps that directory from going.
    $procs = @($all | Where-Object {
        -not $mine.ContainsKey([int]$_.ProcessId) -and (
            ($_.ExecutablePath -and $_.ExecutablePath.StartsWith($root, [StringComparison]::OrdinalIgnoreCase)) -or
            ($_.Name -match '^(pythonw?|cmd)(\.exe)?$' -and $_.CommandLine -and
             $_.CommandLine.IndexOf($root, [StringComparison]::OrdinalIgnoreCase) -ge 0))
    })
    foreach ($p in $procs) {
        Write-Log "zastavuji $($p.Name) (PID $($p.ProcessId))"
        Stop-Process -Id $p.ProcessId -Force -ErrorAction SilentlyContinue
    }
    foreach ($p in $procs) { Wait-Process -Id $p.ProcessId -Timeout 15 -ErrorAction SilentlyContinue }
}

function Remove-UserPath {
    param([string]$Dir)
    $cur = [Environment]::GetEnvironmentVariable("Path", "User")
    if ([string]::IsNullOrEmpty($cur)) { return }
    $parts = @($cur.Split(';') | Where-Object { $_ -ne "" -and $_ -ne $Dir })
    [Environment]::SetEnvironmentVariable("Path", ($parts -join ';'), "User")
}

# Pure: how a path is spelled inside native\idm-host.cmd. cmd.exe reads a batch
# file in the OEM code page, so C:\Users\Lukas-with-a-hacek written out
# literally can name a different directory. %~dp0 (the wrapper's own folder,
# native\) and %USERPROFILE% are expanded by cmd itself, in Unicode, which
# covers the default install and the default downloads folder. A literal % is
# doubled, or cmd would expand it.
function ConvertTo-CmdPath {
    param([string]$Path, [string]$Prefix, [string]$UserProfile)
    $full = $Path.TrimEnd('\')
    # Ordered: the prefix usually sits inside the profile, and wins.
    $bases = [ordered]@{ '%~dp0..' = $Prefix; '%USERPROFILE%' = $UserProfile }
    foreach ($spelling in $bases.Keys) {
        $dir = $bases[$spelling]
        if ([string]::IsNullOrEmpty($dir)) { continue }
        $dir = $dir.TrimEnd('\')
        if ($full.Equals($dir, [StringComparison]::OrdinalIgnoreCase)) { return $spelling }
        if ($full.StartsWith($dir + '\', [StringComparison]::OrdinalIgnoreCase)) {
            return $spelling + $full.Substring($dir.Length).Replace('%', '%%')
        }
    }
    return $full.Replace('%', '%%')
}

# Pure: the lines of native\idm-host.cmd, the Windows twin of the Linux
# idm-host-wrapper.sh. The host is fail-closed without --allowed-dir, and a
# browser started before the install never sees the user variables this script
# persists -- so the flags travel in the file the manifest points at. Nothing
# may reach stdout but the host's own frames, hence @echo off.
function Get-HostWrapperLines {
    param([string]$Prefix, [string]$DownloadsDir, [string]$UserProfile)
    $root = $Prefix.TrimEnd('\')
    $q = { param([string]$p) '"' + (ConvertTo-CmdPath -Path $p -Prefix $Prefix -UserProfile $UserProfile) + '"' }
    $hostExe  = & $q "$root\bin\idm-host.exe"
    $engine   = & $q "$root\bin\idm.exe"
    $dl       = & $q $DownloadsDir
    $settings = & $q "$root\state\settings.json"
    return @(
        "@echo off",
        "rem Generated by install.ps1 - do not edit; reinstall to change it.",
        "$hostExe --engine $engine --allowed-dir $dl --settings $settings %*"
    )
}

# Manifests are written as UTF-8 WITHOUT a byte-order mark. Windows
# PowerShell's -Encoding UTF8 writes one, a browser's JSON parser is entitled
# to refuse it, and the host then simply looks "not found".
function Write-JsonFile {
    param([string]$Path, $Object)
    $json = ($Object | ConvertTo-Json -Depth 5) + "`r`n"
    [System.IO.File]::WriteAllText($Path, $json, (New-Object System.Text.UTF8Encoding $false))
}

# --------------------------------------------------------------------------- #
# Uninstall
# --------------------------------------------------------------------------- #
if ($Uninstall) {
    Write-Log "odinstalace"
    foreach ($root in @($BrowserRegRoots) + $FirefoxRegRoot) {
        $key = Join-Path $root $HostName
        if (Test-Path $key) { Remove-Item -Path $key -Recurse -Force -ErrorAction SilentlyContinue }
    }
    Remove-Item -Force -ErrorAction SilentlyContinue (Join-Path (Get-DesktopDir) "IDM.lnk")
    Remove-Item -Force -ErrorAction SilentlyContinue (Join-Path (Get-StartMenuDir) "IDM.lnk")
    [Environment]::SetEnvironmentVariable("IDM_ALLOWED_DIR", $null, "User")
    [Environment]::SetEnvironmentVariable("IDM_SETTINGS", $null, "User")
    [Environment]::SetEnvironmentVariable("IDM_DIR", $null, "User")
    [Environment]::SetEnvironmentVariable("IDM_PYTHON", $null, "User")
    Remove-UserPath -Dir (Join-Path $Prefix "bin")
    Remove-UserPath -Dir $Prefix
    Stop-IdmProcesses -Root $Prefix
    $keepState = Join-Path $Prefix "state"
    if (Test-Path $Prefix) {
        if ($Purge) {
            Remove-Item -Recurse -Force $Prefix -ErrorAction SilentlyContinue
        } else {
            # Default is to KEEP state\, like install.sh: losing the queue and
            # the saved passwords is worse than leaving a directory behind.
            Get-ChildItem -Force $Prefix | Where-Object { $_.Name -ne "state" } | ForEach-Object {
                Remove-Item -Recurse -Force $_.FullName -ErrorAction SilentlyContinue
            }
            if (-not (Get-ChildItem -Force $Prefix)) { Remove-Item -Force $Prefix -ErrorAction SilentlyContinue }
        }
    }
    # What would not go is still running (or open) somewhere; say so instead
    # of reporting a clean uninstall over it.
    if (Test-Path $Prefix) {
        $left = @(Get-ChildItem -Force $Prefix | Where-Object { $Purge -or $_.Name -ne "state" } | ForEach-Object Name)
        if ($left) { Write-Warn "nepodarilo se odstranit: $($left -join ', ') v $Prefix (bezi jeste IDM?)" }
    }
    if ((-not $Purge) -and (Test-Path $keepState)) {
        Write-Log "hotovo - stav zustal v $keepState (smazat: -Uninstall -Purge)"
    } else {
        Write-Log "hotovo - odstraneno"
    }
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
# The archive is flat; the installation is not. Unpack to a staging directory
# and arrange the files into the same bin/ gui/ assets/ layout the Linux
# installer builds, so one IDM_DIR means the same thing on both systems.
$stage = Join-Path $tmp "unpack"
New-Item -ItemType Directory -Force -Path $stage | Out-Null
Expand-Archive -Path $zip -DestinationPath $stage -Force

$binDir    = Join-Path $Prefix "bin"
$guiDir    = Join-Path $Prefix "gui"
$assetsDir = Join-Path $Prefix "assets"
$extDir    = Join-Path $Prefix "extension"
$stateDir  = Join-Path $Prefix "state"
# state/ holds the queue and the vault; a reinstall must not throw them away.
Stop-IdmProcesses -Root $Prefix
# What an earlier `idm update` could not delete while IDM was running
# (bin.old\idm.exe up to 2.1.9), plus an interrupted update's staging. The
# processes are stopped now, so they can go.
if (Test-Path $Prefix) {
    Get-ChildItem -Force -Path $Prefix -ErrorAction SilentlyContinue | Where-Object {
        $_.Name -like "*.old" -or $_.Name -in @(".update", ".trash")
    } | ForEach-Object { Remove-Item -Recurse -Force $_.FullName -ErrorAction SilentlyContinue }
}
foreach ($d in @($binDir, $guiDir, $assetsDir)) {
    if (Test-Path $d) { Remove-Item -Recurse -Force $d -ErrorAction SilentlyContinue }
    # A directory that will not go away still holds the old version; carrying
    # on would report success over it.
    if (Test-Path $d) { Die "nelze odstranit $d (bezi jeste IDM? zavri okno IDM i prohlizec a spust instalaci znovu)" }
}
foreach ($d in @($binDir, $guiDir, $assetsDir, $stateDir)) {
    New-Item -ItemType Directory -Force -Path $d | Out-Null
}

# Pre-0.2 installs were flat under %LOCALAPPDATA%\idm; move what matters.
$oldPrefix = Join-Path $env:LOCALAPPDATA "idm"
if ((Test-Path $oldPrefix) -and ($oldPrefix -ne $Prefix)) {
    # Its window or the browser's host may still run from there, and Windows
    # deletes neither a running exe nor its directory.
    Stop-IdmProcesses -Root $oldPrefix
    $oldState = Join-Path $oldPrefix "state"
    if (Test-Path $oldState) {
        Write-Log "stehuji stav z $oldState"
        Get-ChildItem -Force $oldState | ForEach-Object {
            $dest = Join-Path $stateDir $_.Name
            if (-not (Test-Path $dest)) { Move-Item $_.FullName $dest -Force }
        }
    }
    Remove-Item -Recurse -Force $oldPrefix -ErrorAction SilentlyContinue
}

foreach ($f in @("idm.exe", "idm-host.exe", "ensure-aria2.ps1", "ensure-aria2.sh", "ensure-ytdlp.ps1", "ensure-ytdlp.sh")) {
    $srcFile = Join-Path $stage $f
    if (Test-Path $srcFile) { Move-Item $srcFile (Join-Path $binDir $f) -Force }
}
$guiSrc = Join-Path $stage "idm_gui.py"
if (Test-Path $guiSrc) { Move-Item $guiSrc (Join-Path $guiDir "idm_gui.py") -Force }
foreach ($a in @("idm.ico", "idm.png")) {
    $srcFile = Join-Path (Join-Path $stage "assets") $a
    if (Test-Path $srcFile) {
        Move-Item $srcFile (Join-Path $assetsDir $a) -Force
    } else {
        try {
            Fetch-File -Uri "https://raw.githubusercontent.com/$Repo/master/assets/$a" `
                -OutFile (Join-Path $assetsDir $a)
        } catch { Write-Warn "nestahl $a" }
    }
}
# The browser extension, for chrome://extensions -> "Load unpacked". It lives
# at a fixed path so `idm update` can refresh it in place; the browser only
# has to reload it. Only replaced when the archive carries one.
$extSrc = Join-Path $stage "extension"
if (Test-Path (Join-Path $extSrc "manifest.json")) {
    if (Test-Path $extDir) { Remove-Item -Recurse -Force $extDir -ErrorAction SilentlyContinue }
    if (Test-Path $extDir) { Die "nelze nahradit $extDir (je otevrene v jinem programu?)" }
    Move-Item $extSrc $extDir -Force
} elseif (-not (Test-Path (Join-Path $extDir "manifest.json"))) {
    Write-Warn "archiv neobsahuje rozsireni (extension\) - prohlizec nebude mit co nacist"
}
$stageSelf = Join-Path $stage "install.ps1"
if (Test-Path $stageSelf) { Move-Item $stageSelf (Join-Path $Prefix "install.ps1") -Force }
# Only a concrete tag is a version (same rule as install.sh): for "latest"
# record the number the GUI we just installed carries.
$installedVersion = $Version
if ($installedVersion -eq "latest") {
    $guiFile = Join-Path $guiDir "idm_gui.py"
    $m = if (Test-Path $guiFile) { Select-String -Path $guiFile -Pattern '^VERSION\s*=\s*"([^"]+)"' | Select-Object -First 1 }
    $installedVersion = if ($m) { $m.Matches[0].Groups[1].Value } else { "" }
}
Set-Content -Encoding ASCII -Path (Join-Path $Prefix "VERSION") -Value $installedVersion
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

$engineInstalled = Join-Path $binDir "idm.exe"
$hostInstalled   = Join-Path $binDir "idm-host.exe"
$ensurePs1       = Join-Path $binDir "ensure-aria2.ps1"
if (-not (Test-Path $engineInstalled)) { Die "chybi idm.exe v archivu" }
if (-not (Test-Path $hostInstalled))   { Die "chybi idm-host.exe v archivu" }
New-Item -ItemType Directory -Force -Path $DownloadsDir | Out-Null

# --------------------------------------------------------------------------- #
# 3) Native-messaging host manifest + registry
# --------------------------------------------------------------------------- #
# Same layout as Linux: the wrapper and both manifests in native\. The browser
# runs the host with its working directory there, not in bin\ -- a process
# whose cwd is inside bin\ keeps `idm update` from renaming bin\.
$nativeDir = Join-Path $Prefix "native"
New-Item -ItemType Directory -Force -Path $nativeDir | Out-Null
$wrapper = Join-Path $nativeDir "idm-host.cmd"
# OEM, the code page cmd.exe reads batch files in. Get-HostWrapperLines keeps
# the usual non-ASCII (the user name) out of the file; this covers the rest
# as far as cmd can.
Set-Content -Encoding Oem -Path $wrapper -Value (Get-HostWrapperLines -Prefix $Prefix `
    -DownloadsDir $DownloadsDir -UserProfile $env:USERPROFILE)

$manifestPath = Join-Path $nativeDir "$HostName.json"
Write-JsonFile -Path $manifestPath -Object ([ordered]@{
    name            = $HostName
    description     = "IDM-like native messaging host"
    path            = $wrapper
    type            = "stdio"
    allowed_origins = @("chrome-extension://$ExtensionId/")
})
# The add-on id comes from the extension's own Firefox template, like on
# Linux, so it cannot drift from manifest.json's gecko id. The fallback is
# for an archive without extension\.
$geckoIds = @("idm@tonec.local")
$ffTemplate = Join-Path $extDir "$HostName.firefox.json"
if (Test-Path $ffTemplate) {
    $t = Get-Content -Raw $ffTemplate | ConvertFrom-Json
    if ($t.allowed_extensions) { $geckoIds = @($t.allowed_extensions) }
}
$ffManifestPath = Join-Path $nativeDir "$HostName.firefox.json"
Write-JsonFile -Path $ffManifestPath -Object ([ordered]@{
    name               = $HostName
    description        = "IDM-like native messaging host"
    path               = $wrapper
    type               = "stdio"
    allowed_extensions = $geckoIds
})
# Up to 2.1.9 the Chrome manifest sat at the prefix root and pointed straight
# at bin\idm-host.exe.
Remove-Item -Force -ErrorAction SilentlyContinue (Join-Path $Prefix "$HostName.json")

Write-Log "registruji native-messaging hosta (HKCU)"
$regTargets = @($BrowserRegRoots | ForEach-Object { @{ Root = $_; Manifest = $manifestPath } }) +
              @{ Root = $FirefoxRegRoot; Manifest = $ffManifestPath }
foreach ($t in $regTargets) {
    try {
        $key = Join-Path $t.Root $HostName
        New-Item -Path $key -Force | Out-Null
        Set-ItemProperty -Path $key -Name "(Default)" -Value $t.Manifest
    } catch {
        Write-Warn "nepodarilo se zapsat $($t.Root)"
    }
}

# The wrapper carries --allowed-dir; the variable is the host's fallback for
# a manifest an older install wrote that still points at bin\idm-host.exe.
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
$guiPy  = Join-Path $guiDir "idm_gui.py"

# `idm --gui` starts the window with IDM_PYTHON; the shortcut has the
# interpreter baked in, a shell does not.
if ($python) {
    [Environment]::SetEnvironmentVariable("IDM_PYTHON", $python, "User")
    $env:IDM_PYTHON = $python
}

# The browser extension cannot read settings.json itself; it asks the native
# host (get_settings). The wrapper passes --settings; the variable is the
# fallback for an older manifest, the same way as IDM_ALLOWED_DIR. Without
# either the File Types and force/prevent key settings have no effect on what
# the extension captures.
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
$launcher = Join-Path $binDir "idm-gui.cmd"
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
    # Our own icon. The borrowed shell32 index rendered as whatever the theme
    # had at slot 167, which is how the shortcut ended up looking generic.
    $idmIco = Join-Path $assetsDir "idm.ico"
    if (Test-Path $idmIco) { $lnk.IconLocation = $idmIco }
    $lnk.Save()
}
$desktopLnk = Join-Path (Get-DesktopDir) "IDM.lnk"
New-IdmShortcut -Path $desktopLnk
Write-Log "ikona na plose: $desktopLnk"
New-IdmShortcut -Path (Join-Path (Get-StartMenuDir) "IDM.lnk")

# One variable describes the installation, exactly like the Linux export, and
# only bin/ goes on PATH -- the rest of the directory is not executables.
[Environment]::SetEnvironmentVariable("IDM_DIR", $Prefix, "User")
$env:IDM_DIR = $Prefix
Write-Log "nastaveno IDM_DIR = $Prefix"
Add-UserPath -Dir $binDir

Write-Host ""
Write-Log "hotovo!"
Write-Host "  Engine     : $engineInstalled"
Write-Host "  Okno       : dvojklik na ikonu 'IDM' na plose (nebo v menu Start)"
# yt-dlp is not optional the way aria2 is: without it no video page can be
# downloaded at all, and nothing used to install it. A clean machine ended up
# with a downloader that could not download videos.
$ensureYtdlp = Join-Path $binDir "ensure-ytdlp.ps1"
if (Test-Path $ensureYtdlp) {
    Write-Log "kontroluji yt-dlp (potreba pro videa)"
    try {
        & powershell -ExecutionPolicy Bypass -File $ensureYtdlp $binDir | Out-Null
    } catch {
        Write-Warn "yt-dlp se nepodarilo pripravit (engine ho zkusi doinstalovat pri prvnim videu)"
    }
}

Write-Host "  Stazeni    : $DownloadsDir"
Write-Host "  Rozsireni  : chrome://extensions -> Developer mode -> Load unpacked -> $extDir"
Write-Host "  Firefox    : about:debugging -> Load Temporary Add-on -> $extDir\manifest.firefox.json"
if (Test-Path $ensurePs1) {
    Write-Host "  aria2      : prepinac 'Via aria2' v okne; aria2c se doinstaluje sam"
}
Write-Host ""
Write-Host "  Odinstalace: irm <tento-skript> | iex; potom:"
Write-Host "               (dostupne take: $Prefix\install.ps1 -Uninstall; stav smaze -Purge)"
Write-Host ""
