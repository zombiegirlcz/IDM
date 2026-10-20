# Unit test of the two pure functions install.ps1 builds the native-host
# wrapper (native\idm-host.cmd) with. Running install.ps1 itself installs, so
# the functions are lifted out of its AST and defined here on their own.
#
#   pwsh -File test/install_ps1_wrapper.ps1      (CI: windows-installer job)
$ErrorActionPreference = 'Stop'
$script = Join-Path (Split-Path -Parent $PSScriptRoot) 'install.ps1'
$errors = $null
$ast = [System.Management.Automation.Language.Parser]::ParseFile($script, [ref]$null, [ref]$errors)
if ($errors) { throw "install.ps1 does not parse: $($errors[0].Message)" }
foreach ($name in 'ConvertTo-CmdPath', 'Get-HostWrapperLines') {
    $f = $ast.Find({ param($n)
        $n -is [System.Management.Automation.Language.FunctionDefinitionAst] -and $n.Name -eq $name }, $true)
    if (-not $f) { throw "install.ps1 has no function $name" }
    . ([scriptblock]::Create($f.Extent.Text))
}

$failed = 0
function Check([string]$what, $got, $want) {
    if ($got -ceq $want) { Write-Host "ok   $what" }
    else { Write-Host "FAIL $what`n     got:  $got`n     want: $want"; $script:failed++ }
}

# A Czech user name: cmd.exe reads the .cmd in the OEM code page, so none of
# it may be spelled out literally.
$u = 'C:\Users\Luk' + [char]0x00E1 + [char]0x0161
$lines = @(Get-HostWrapperLines -Prefix "$u\.idm" -DownloadsDir "$u\Downloads" -UserProfile $u)
Check 'first line silences cmd' $lines[0] '@echo off'
Check 'the command' $lines[-1] ('"%~dp0..\bin\idm-host.exe" --engine "%~dp0..\bin\idm.exe"' +
    ' --allowed-dir "%USERPROFILE%\Downloads" --settings "%~dp0..\state\settings.json" %*')
$nonAscii = @($lines | Where-Object { $_ -match '[^\x00-\x7F]' })
Check 'nothing non-ASCII is baked in' $nonAscii.Count 0
$noisy = @($lines | Where-Object { $_ -notmatch '^@' -and $_ -notmatch '^(rem|::)' -and $_ -ne $lines[-1] })
Check 'every other line is silent or a comment' $noisy.Count 0

# A trailing backslash on the prefix is the same prefix.
Check 'trailing backslash' (ConvertTo-CmdPath -Path 'C:\idm\bin\idm.exe' -Prefix 'C:\idm\' -UserProfile 'C:\Users\x') '%~dp0..\bin\idm.exe'
# A sibling that merely starts with the prefix's name is not inside it.
Check 'sibling of the prefix' (ConvertTo-CmdPath -Path 'C:\idmx\dl' -Prefix 'C:\idm' -UserProfile 'C:\Users\x') 'C:\idmx\dl'
Check 'sibling of the profile' (ConvertTo-CmdPath -Path 'C:\Users\xy\dl' -Prefix 'C:\idm' -UserProfile 'C:\Users\x') 'C:\Users\xy\dl'
Check 'case-insensitive, like NTFS' (ConvertTo-CmdPath -Path 'c:\users\X\Downloads' -Prefix 'D:\idm' -UserProfile 'C:\Users\x') '%USERPROFILE%\Downloads'
# cmd expands %NAME%, so a literal % has to be doubled -- inside and outside.
Check 'percent outside' (ConvertTo-CmdPath -Path 'D:\100% done' -Prefix 'C:\idm' -UserProfile 'C:\Users\x') 'D:\100%% done'
Check 'percent inside' (ConvertTo-CmdPath -Path 'C:\Users\x\a%b' -Prefix 'C:\idm' -UserProfile 'C:\Users\x') '%USERPROFILE%\a%%b'
# The prefix wins over the profile it usually sits in.
Check 'prefix before profile' (ConvertTo-CmdPath -Path 'C:\Users\x\.idm\state\settings.json' -Prefix 'C:\Users\x\.idm' -UserProfile 'C:\Users\x') '%~dp0..\state\settings.json'
Check 'no profile known' (ConvertTo-CmdPath -Path 'C:\Users\x\Downloads' -Prefix 'C:\idm' -UserProfile '') 'C:\Users\x\Downloads'

if ($failed) { throw "$failed check(s) failed" }
Write-Host "host wrapper OK"
