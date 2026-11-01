#!/usr/bin/env bash
# ensure-ffmpeg.sh — make sure ffmpeg is available, installing it if needed.
#
# Counterpart to ensure-aria2.sh and ensure-ytdlp.sh, and the reason a high
# resolution video downloads with sound. YouTube serves video and audio as
# separate streams; yt-dlp fetches both and joins them with ffmpeg. Without
# it the merge fails and the user is left with the two halves -- or, worse,
# with only the video track if only one was requested.
#
#   ensure-ffmpeg.sh [target-dir]
#
# Idempotent. Set IDM_FFMPEG_NO_INSTALL=1 to only check, never install.
# Prints the path to ffmpeg on success.
set -euo pipefail

TARGET_DIR="${1:-${IDM_DIR:-$HOME/.idm}/bin}"

log()  { printf '\033[1;34m==>\033[0m %s\n' "$*" >&2; }
warn() { printf '\033[1;33m[!]\033[0m %s\n' "$*" >&2; }

have() { command -v "$1" >/dev/null 2>&1; }

if have ffmpeg; then
  command -v ffmpeg
  exit 0
fi
if [[ -x "$TARGET_DIR/ffmpeg" ]]; then
  printf '%s\n' "$TARGET_DIR/ffmpeg"
  exit 0
fi

if [[ "${IDM_FFMPEG_NO_INSTALL:-0}" == "1" ]]; then
  warn "ffmpeg is missing and IDM_FFMPEG_NO_INSTALL=1 forbids installing it"
  exit 1
fi

log "ffmpeg not found - installing it"

PKG="ffmpeg"
install_pm() {
  if have apt-get; then
    sudo apt-get update -qq && sudo apt-get install -y "$PKG" || apt-get install -y "$PKG"
  elif have dnf; then
    sudo dnf install -y "$PKG" || dnf install -y "$PKG"
  elif have yum; then
    sudo yum install -y "$PKG" || yum install -y "$PKG"
  elif have pacman; then
    sudo pacman -Sy --noconfirm "$PKG" || pacman -Sy --noconfirm "$PKG"
  elif have zypper; then
    sudo zypper install -y "$PKG" || zypper install -y "$PKG"
  elif have apk; then
    sudo apk add "$PKG" || apk add "$PKG"
  elif have brew; then
    brew install "$PKG"
  else
    return 1
  fi
}

if [[ "$(uname -s 2>/dev/null || echo unknown)" == "Darwin" ]]; then
  install_pm || true
else
  install_pm || true
fi

if have ffmpeg; then
  log "ffmpeg installed: $(command -v ffmpeg)"
  command -v ffmpeg
  exit 0
fi

# A static build, so a machine without a package manager still gets one.
# Only used as a last resort: it is a big download and the package manager
# keeps it updated.
case "$(uname -m)" in
  x86_64|amd64) ASSET="ffmpeg-master-latest-linux64-gpl.tar.xz" ;;
  aarch64|arm64) ASSET="ffmpeg-master-latest-linuxarm64-gpl.tar.xz" ;;
  *) ASSET="" ;;
esac
if [[ -n "$ASSET" && "$(uname -s)" == "Linux" ]] && command -v curl >/dev/null 2>&1; then
  warn "no package manager could install ffmpeg, trying a static build"
  mkdir -p "$TARGET_DIR"
  TMP="$TARGET_DIR/.ffmpeg.tar.xz"
  if curl -fsSL "https://github.com/BtbN/FFmpeg-Builds/releases/download/latest/$ASSET" -o "$TMP"; then
    tar -xJf "$TMP" -C "$TARGET_DIR" --strip-components=2 --wildcards '*/bin/ffmpeg' '*/bin/ffprobe' 2>/dev/null || true
    rm -f "$TMP"
    chmod +x "$TARGET_DIR/ffmpeg" 2>/dev/null || true
    chmod +x "$TARGET_DIR/ffprobe" 2>/dev/null || true
  fi
fi

if [[ -x "$TARGET_DIR/ffmpeg" ]]; then
  log "ffmpeg installed at $TARGET_DIR/ffmpeg"
  printf '%s\n' "$TARGET_DIR/ffmpeg"
  exit 0
fi

for cand in /usr/bin/ffmpeg /usr/local/bin/ffmpeg /opt/homebrew/bin/ffmpeg "$HOME/.local/bin/ffmpeg"; do
  if [[ -x "$cand" ]]; then
    log "ffmpeg found at $cand"
    printf '%s\n' "$cand"
    exit 0
  fi
done

warn "ffmpeg still not found; video with sound cannot be merged"
exit 1
