#!/usr/bin/env bash
# ensure-ytdlp.sh — make sure yt-dlp is available, installing it when missing.
# Counterpart to scripts/ensure-aria2.sh, and the reason video downloads work
# on a machine where the user never installed anything by hand.
#
#   ensure-ytdlp.sh [target-dir]
#
# Idempotent. Set IDM_YTDLP_NO_INSTALL=1 to only check, never install.
# Prints the path to yt-dlp on success.
set -euo pipefail

TARGET_DIR="${1:-${IDM_DIR:-$HOME/.idm}/bin}"

log()  { printf '\033[1;34m==>\033[0m %s\n' "$*" >&2; }
warn() { printf '\033[1;33m[!]\033[0m %s\n' "$*" >&2; }

# Already on PATH, or already installed next to us?
if command -v yt-dlp >/dev/null 2>&1; then
  command -v yt-dlp
  exit 0
fi
if [[ -x "$TARGET_DIR/yt-dlp" ]]; then
  printf '%s\n' "$TARGET_DIR/yt-dlp"
  exit 0
fi

if [[ "${IDM_YTDLP_NO_INSTALL:-}" == "1" ]]; then
  warn "yt-dlp is missing and IDM_YTDLP_NO_INSTALL=1 forbids installing it"
  exit 1
fi

log "yt-dlp not found - installing it"

case "$(uname -m)" in
  x86_64|amd64) ASSET="yt-dlp_linux" ;;
  aarch64|arm64) ASSET="yt-dlp_linux_aarch64" ;;
  *) ASSET="yt-dlp" ;;  # the python zipapp runs anywhere python does
esac
if [[ "$(uname -s)" == "Darwin" ]]; then
  ASSET="yt-dlp_macos"
fi

URL="https://github.com/yt-dlp/yt-dlp/releases/latest/download/$ASSET"
mkdir -p "$TARGET_DIR"
TMP="$TARGET_DIR/.yt-dlp.download"

# A single self-contained binary, so no package manager is involved and the
# version does not depend on what the distribution happens to ship.
if command -v curl >/dev/null 2>&1; then
  curl -fsSL "$URL" -o "$TMP"
elif command -v wget >/dev/null 2>&1; then
  wget -qO "$TMP" "$URL"
else
  warn "neither curl nor wget is available to download yt-dlp"
  exit 1
fi

chmod +x "$TMP"
# Written aside and renamed, so a half-downloaded file is never executable
# under the real name.
mv -f "$TMP" "$TARGET_DIR/yt-dlp"

if "$TARGET_DIR/yt-dlp" --version >/dev/null 2>&1; then
  log "yt-dlp installed: $TARGET_DIR/yt-dlp"
  printf '%s\n' "$TARGET_DIR/yt-dlp"
  exit 0
fi

# The standalone binary needs a C runtime some minimal images lack; the
# python zipapp is the fallback that runs anywhere python does.
if command -v python3 >/dev/null 2>&1; then
  warn "the standalone build did not run here, trying pip"
  if python3 -m pip install --user --quiet --upgrade "yt-dlp[default]" >/dev/null 2>&1; then
    if command -v yt-dlp >/dev/null 2>&1; then
      command -v yt-dlp
      exit 0
    fi
  fi
fi

warn "yt-dlp still not working after installation"
exit 1
