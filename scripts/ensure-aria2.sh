#!/usr/bin/env bash
# ensure-aria2.sh — make sure `aria2c` is available, installing it if needed.
#
# Called by the installer / the GUI's aria2 switch. Idempotent: if aria2c is
# already on PATH it just reports it and exits 0. When missing it installs via
# the platform's package manager (and on Windows via winget), falling back to a
# static build only if the package manager is unavailable.
#
# Escape hatch: IDM_ARIA2_NO_INSTALL=1 forbids installing (the script then only
# reports whether aria2c is present and exits non-zero if it is not).
#
# Usage:
#   ./ensure-aria2.sh              # ensure (install if needed)
#   IDM_ARIA2_NO_INSTALL=1 ./ensure-aria2.sh   # only check
set -euo pipefail

PKG_NAME="aria2"
WIN_PKG_ID="aria2.aria2"

log()  { printf '\033[1;34m==>\033[0m %s\n' "$*"; }
warn() { printf '\033[1;33m[!]\033[0m %s\n' "$*" >&2; }

have() { command -v "$1" >/dev/null 2>&1; }

# --- already installed? -----------------------------------------------------
if have aria2c; then
  echo "aria2c already found: $(command -v aria2c)"
  exit 0
fi

if [[ "${IDM_ARIA2_NO_INSTALL:-0}" == "1" ]]; then
  warn "aria2c is missing and IDM_ARIA2_NO_INSTALL=1 forbids installing it"
  exit 1
fi

log "aria2c not found — installing it"

# --- Linux / macOS ----------------------------------------------------------
install_linux() {
  if have apt-get; then
    sudo apt-get update -qq && sudo apt-get install -y "$PKG_NAME" || apt-get install -y "$PKG_NAME"
  elif have dnf; then
    sudo dnf install -y "$PKG_NAME" || dnf install -y "$PKG_NAME"
  elif have yum; then
    sudo yum install -y "$PKG_NAME" || yum install -y "$PKG_NAME"
  elif have pacman; then
    sudo pacman -Sy --noconfirm "$PKG_NAME" || pacman -Sy --noconfirm "$PKG_NAME"
  elif have zypper; then
    sudo zypper install -y "$PKG_NAME" || zypper install -y "$PKG_NAME"
  elif have apk; then
    sudo apk add "$PKG_NAME" || apk add "$PKG_NAME"
  elif have brew; then
    brew install "$PKG_NAME"
  else
    return 1
  fi
}

# --- Windows (Git Bash / MSYS / Cygwin) -------------------------------------
install_windows() {
  if have winget; then
    winget install --id "$WIN_PKG_ID" -e --accept-source-agreements --accept-package-agreements || return 1
  elif have choco; then
    choco install -y aria2 || return 1
  elif have scoop; then
    scoop install aria2 || return 1
  else
    return 1
  fi
}

OS="$(uname -s 2>/dev/null || echo unknown)"
case "$OS" in
  MINGW*|MSYS*|CYGWIN*) install_windows || { warn "could not auto-install aria2c on Windows"; exit 1; } ;;
  *) install_linux || { warn "no supported package manager found to install aria2c"; exit 1; } ;;
esac

# Re-check after installation attempt.
if have aria2c; then
  log "aria2c installed: $(command -v aria2c)"
  exit 0
fi

# The package manager may have installed it outside the current PATH.
for cand in /usr/bin/aria2c /usr/local/bin/aria2c "$HOME/.local/bin/aria2c"; do
  if [[ -x "$cand" ]]; then
    log "aria2c installed at $cand"
    exit 0
  fi
done

warn "aria2c still not found after installation"
exit 1
