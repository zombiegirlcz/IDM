#!/usr/bin/env bash
# install.sh — one-line installer for the IDM-like downloader (Linux).
#
#   curl -fsSL https://raw.githubusercontent.com/zombiegirlcz/IDM/master/install.sh | bash
#
# Like the Windows installer, this does NOT need git, Rust or a compiler: it
# downloads the prebuilt release archive and unpacks it. That mirrors how real
# IDM ships — a ready-made binary, not a build recipe.
#
# User-scoped only (~/.local, ~/.config, ~/Desktop); never root, never system.
#
# Environment overrides:
#   IDM_VERSION         release tag (default: latest)
#   IDM_ARCHIVE_URL     full archive URL (overrides IDM_VERSION)
#   IDM_LOCAL_SOURCE    build from a local checkout instead (needs cargo)
#   IDM_INSTALL_PREFIX  install prefix (default ~/.local/share/idm)
#   IDM_DOWNLOADS_DIR   download directory (default ~/Downloads)
set -euo pipefail

REPO="zombiegirlcz/IDM"
VERSION="${IDM_VERSION:-latest}"
PREFIX="${IDM_INSTALL_PREFIX:-$HOME/.local/share/idm}"
DOWNLOADS_DIR="${IDM_DOWNLOADS_DIR:-$HOME/Downloads}"
DATA_HOME="${XDG_DATA_HOME:-$HOME/.local/share}"
CONFIG_HOME="${XDG_CONFIG_HOME:-$HOME/.config}"

log()  { printf '\033[1;34m==>\033[0m %s\n' "$*"; }
warn() { printf '\033[1;33m[!]\033[0m %s\n' "$*" >&2; }
die()  { printf '\033[1;31m[x]\033[0m %s\n' "$*" >&2; exit 1; }

desktop_dir() {
  local d=""
  if [[ -f "$CONFIG_HOME/user-dirs.dirs" ]]; then
    d="$(bash -c 'source "$1" >/dev/null 2>&1; echo "$XDG_DESKTOP_DIR"' _ "$CONFIG_HOME/user-dirs.dirs" 2>/dev/null || true)"
    d="${d/#\$HOME/$HOME}"
  fi
  [[ -n "$d" && "$d" != "$HOME/" && "$d" != "$HOME" ]] || d="$HOME/Desktop"
  echo "$d"
}

# --- uninstall ---
if [[ "${1:-}" == "--uninstall" ]]; then
  log "odinstalace"
  if [[ -x "$PREFIX/extension/install-shell.sh" ]]; then
    IDM_ENGINE_BIN="$PREFIX/bin/idm" "$PREFIX/extension/install-shell.sh" --uninstall || true
  fi
  rm -f "$(desktop_dir)/idm.desktop"
  rm -f "$DATA_HOME/applications/idm-desktop.desktop" \
        "$DATA_HOME/applications/idm-download.desktop" \
        "$DATA_HOME/applications/idm-scheme.desktop"
  rm -rf "$PREFIX"
  log "hotovo — odstraněno"
  exit 0
fi

ARCH="$(uname -m)"
case "$ARCH" in
  x86_64|amd64) ASSET="idm-linux-x64.tar.gz" ;;
  aarch64|arm64) ASSET="idm-linux-arm64.tar.gz" ;;
  *) die "nepodporovaná architektura: $ARCH" ;;
esac

# --- 1) obtain the binaries ---
TMP="$(mktemp -d)"
trap 'rm -rf "$TMP"' EXIT

ENGINE_BIN_SRC=""
HOST_BIN_SRC=""

if [[ -n "${IDM_LOCAL_SOURCE:-}" ]]; then
  # Power-user path: build from a local checkout (requires cargo).
  SRC="$IDM_LOCAL_SOURCE"
  command -v cargo >/dev/null 2>&1 || die "IDM_LOCAL_SOURCE vyžaduje cargo"
  log "stavím z $SRC (cargo build --release)"
  (cd "$SRC/engine" && cargo build --release)
  ENGINE_BIN_SRC="$SRC/engine/target/release/idm"
  HOST_BIN_SRC="$SRC/engine/target/release/idm-host"
  GUI_PY_SRC="$SRC/gui/idm_gui.py"
  EXT_SRC="$SRC/extension"
  SELF_SRC="$SRC/install.sh"
else
  if [[ -n "${IDM_ARCHIVE_URL:-}" ]]; then
    URL="$IDM_ARCHIVE_URL"
  elif [[ "$VERSION" == "latest" ]]; then
    URL="https://github.com/$REPO/releases/latest/download/$ASSET"
  else
    URL="https://github.com/$REPO/releases/download/$VERSION/$ASSET"
  fi
  log "stahuji $URL"
  if command -v curl >/dev/null 2>&1; then
    curl -fsSL "$URL" -o "$TMP/idm.tar.gz" || die "stažení selhalo"
  elif command -v wget >/dev/null 2>&1; then
    wget -qO "$TMP/idm.tar.gz" "$URL" || die "stažení selhalo"
  else
    die "chybí curl i wget"
  fi
  mkdir -p "$TMP/unpack"
  tar -xzf "$TMP/idm.tar.gz" -C "$TMP/unpack" || die "rozbalení selhalo"
  ENGINE_BIN_SRC="$TMP/unpack/idm"
  HOST_BIN_SRC="$TMP/unpack/idm-host"
  GUI_PY_SRC="$TMP/unpack/idm_gui.py"
  EXT_SRC=""
  SELF_SRC=""
fi

[[ -f "$ENGINE_BIN_SRC" ]] || die "chybí idm binárka"
[[ -f "$HOST_BIN_SRC" ]]   || die "chybí idm-host binárka"

# --- 2) install into PREFIX ---
log "instaluji do $PREFIX"
mkdir -p "$PREFIX/bin" "$PREFIX/gui" "$PREFIX/extension" "$DOWNLOADS_DIR"
install -m 0755 "$ENGINE_BIN_SRC" "$PREFIX/bin/idm"
install -m 0755 "$HOST_BIN_SRC"   "$PREFIX/bin/idm-host"
if [[ -f "${BASH_SOURCE[0]:-}" ]]; then
  install -m 0755 "${BASH_SOURCE[0]}" "$PREFIX/install.sh" 2>/dev/null || true
fi
if [[ -n "${GUI_PY_SRC:-}" && -f "$GUI_PY_SRC" ]]; then
  install -m 0755 "$GUI_PY_SRC" "$PREFIX/gui/idm_gui.py"
fi
# Local-source installs bring the integration scripts along; release installs
# fetch the installers from the repo (they are tiny text files).
if [[ -n "${EXT_SRC:-}" && -d "$EXT_SRC" ]]; then
  cp -f "$EXT_SRC/install-host.sh"  "$PREFIX/extension/" 2>/dev/null || true
  cp -f "$EXT_SRC/install-shell.sh" "$PREFIX/extension/" 2>/dev/null || true
  cp -f "$EXT_SRC/com.tonec.idm.json" "$PREFIX/extension/" 2>/dev/null || true
  chmod +x "$PREFIX/extension/"*.sh 2>/dev/null || true
else
  RAW="https://raw.githubusercontent.com/$REPO/master"
  for f in install-host.sh install-shell.sh com.tonec.idm.json; do
    curl -fsSL "$RAW/extension/$f" -o "$PREFIX/extension/$f" 2>/dev/null || warn "nestáhl $f"
  done
  chmod +x "$PREFIX/extension/"*.sh 2>/dev/null || true
fi

# Host manifest template must point at the installed host.
MANIFEST="$PREFIX/extension/com.tonec.idm.json"
if [[ -f "$MANIFEST" ]]; then
  python3 - "$MANIFEST" "$PREFIX/bin/idm-host" <<'PY'
import json, sys
p, host = sys.argv[1], sys.argv[2]
try:
    m = json.load(open(p))
except Exception:
    m = {"name": "com.tonec.idm", "type": "stdio", "allowed_origins": []}
m["path"] = host
json.dump(m, open(p, "w"), indent=2)
open(p, "a").write("\n")
PY
fi

# --- 3) register with browsers + desktop ---
if [[ -x "$PREFIX/extension/install-host.sh" ]]; then
  log "registruji native-messaging hosta"
  IDM_DOWNLOADS_DIR="$DOWNLOADS_DIR" "$PREFIX/extension/install-host.sh" >/dev/null 2>&1 || warn "install-host.sh selhal"
fi
if [[ -x "$PREFIX/extension/install-shell.sh" ]]; then
  log "registruji desktop integraci"
  IDM_ENGINE_BIN="$PREFIX/bin/idm" \
  IDM_DOWNLOADS_DIR="$DOWNLOADS_DIR" \
  IDM_STATE_DIR="$DATA_HOME/idm-gui" \
    "$PREFIX/extension/install-shell.sh" >/dev/null 2>&1 || warn "install-shell.sh selhal"
fi

# --- 4) launcher + Desktop icon ---
LAUNCHER="$PREFIX/bin/idm-gui"
cat > "$LAUNCHER" <<EOF
#!/usr/bin/env bash
# Generated by install.sh — opens the native IDM window.
exec "\${IDM_PYTHON:-python3}" "$PREFIX/gui/idm_gui.py" \\
    --engine "$PREFIX/bin/idm" \\
    --out-dir "$DOWNLOADS_DIR" \\
    --state-dir "$DATA_HOME/idm-gui" \\
    --autostart
EOF
chmod +x "$LAUNCHER"

DESKTOP="$(desktop_dir)"
mkdir -p "$DESKTOP"
ICON="$DESKTOP/idm.desktop"
cat > "$ICON" <<EOF
[Desktop Entry]
Type=Application
Version=1.0
Name=IDM — správce stahování
Comment=Stahovat soubory a videa (multi-connection, resume, yt-dlp)
Exec=$LAUNCHER
Icon=download
Terminal=false
Categories=Network;FileTransfer;
Keywords=download;idm;stahovani;
StartupNotify=true
EOF
chmod +x "$ICON"
log "ikona na ploše: $ICON"

APPS="$DATA_HOME/applications"
mkdir -p "$APPS"
cp -f "$ICON" "$APPS/idm-desktop.desktop"
command -v update-desktop-database >/dev/null 2>&1 && update-desktop-database "$APPS" >/dev/null 2>&1 || true
command -v gio >/dev/null 2>&1 && gio set "$ICON" metadata::trusted true 2>/dev/null || true

echo
log "hotovo!"
echo "  Engine    : $PREFIX/bin/idm"
echo "  Okno      : ikona 'IDM' na ploše nebo v menu"
echo "  Stažení   : $DOWNLOADS_DIR"
echo "  Odinstalace: bash $PREFIX/install.sh --uninstall"
