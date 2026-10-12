#!/usr/bin/env bash
# install.sh — one-line installer for the IDM-like downloader.
#
#   curl -fsSL https://raw.githubusercontent.com/zombiegirlcz/IDM/master/install.sh | bash
#
# It will:
#   1. fetch the source (or use a local checkout via IDM_SOURCE_DIR)
#   2. build the engine + native-messaging host (unless IDM_SKIP_BUILD=1)
#   3. install binaries under ~/.local/share/idm/bin
#   4. register the browser native-messaging host and the desktop integration
#      (GUI launcher, idmdwnlmfv9/idmreg scheme handler, context menu)
#   5. drop an icon on the Desktop
#
# Everything is user-scoped (~/.local, ~/.config, ~/Desktop) — nothing needs
# root and nothing touches system directories.
#
# Environment overrides:
#   IDM_SOURCE_DIR      use an existing checkout instead of cloning
#   IDM_SKIP_BUILD=1    do not run cargo (binaries must already be built)
#   IDM_INSTALL_PREFIX  where to install (default ~/.local/share/idm)
#   IDM_DOWNLOADS_DIR   download directory (default ~/Downloads)
#   IDM_REPO_URL        git URL to clone (default the GitHub repo)
#   IDM_REF             git ref/branch (default master)
#   IDM_NO_PROMPT=1     never ask anything (for curl | bash)
#
# Usage:
#   ./install.sh              # install
#   ./install.sh --uninstall  # remove everything this script installed
set -euo pipefail

REPO_URL="${IDM_REPO_URL:-https://github.com/zombiegirlcz/IDM.git}"
REF="${IDM_REF:-master}"
PREFIX="${IDM_INSTALL_PREFIX:-$HOME/.local/share/idm}"
DOWNLOADS_DIR="${IDM_DOWNLOADS_DIR:-$HOME/Downloads}"
DATA_HOME="${XDG_DATA_HOME:-$HOME/.local/share}"
CONFIG_HOME="${XDG_CONFIG_HOME:-$HOME/.config}"

log()  { printf '\033[1;34m==>\033[0m %s\n' "$*"; }
warn() { printf '\033[1;33m[!]\033[0m %s\n' "$*" >&2; }
die()  { printf '\033[1;31m[x]\033[0m %s\n' "$*" >&2; exit 1; }

# --- desktop directory (respect xdg-user-dirs, fall back to ~/Desktop) ------
desktop_dir() {
  local d=""
  if [[ -f "$CONFIG_HOME/user-dirs.dirs" ]]; then
    # shellcheck disable=SC1090
    d="$(bash -c 'source "$1" >/dev/null 2>&1; echo "$XDG_DESKTOP_DIR"' _ "$CONFIG_HOME/user-dirs.dirs" 2>/dev/null || true)"
    d="${d/#\$HOME/$HOME}"
  fi
  [[ -n "$d" && "$d" != "$HOME/" && "$d" != "$HOME" ]] || d="$HOME/Desktop"
  echo "$d"
}

# --------------------------------------------------------------------------- #
# Uninstall
# --------------------------------------------------------------------------- #
if [[ "${1:-}" == "--uninstall" ]]; then
  log "odinstalace"
  # Delegate to the shell integration's own uninstaller if present.
  if [[ -x "$PREFIX/extension/install-shell.sh" ]]; then
    IDM_ENGINE_BIN="$PREFIX/bin/idm" \
      "$PREFIX/extension/install-shell.sh" --uninstall || true
  fi
  rm -f "$(desktop_dir)/idm.desktop"
  rm -f "$DATA_HOME/applications/idm-download.desktop" \
        "$DATA_HOME/applications/idm-scheme.desktop"
  rm -rf "$PREFIX"
  log "hotovo — odstraněno"
  exit 0
fi

# --------------------------------------------------------------------------- #
# 1) Get the source
# --------------------------------------------------------------------------- #
SRC="${IDM_SOURCE_DIR:-}"
TMP_CLONE=""
cleanup() { if [[ -n "$TMP_CLONE" && -d "$TMP_CLONE" ]]; then rm -rf "$TMP_CLONE"; fi; return 0; }
trap cleanup EXIT

if [[ -z "$SRC" ]]; then
  command -v git >/dev/null 2>&1 || die "git není nainstalovaný"
  TMP_CLONE="$(mktemp -d)"
  log "stahuji zdroj z $REPO_URL ($REF)"
  git clone --depth 1 --branch "$REF" "$REPO_URL" "$TMP_CLONE" >/dev/null 2>&1 \
    || git clone --depth 1 "$REPO_URL" "$TMP_CLONE" >/dev/null 2>&1 \
    || die "nepodařilo se naklonovat $REPO_URL"
  SRC="$TMP_CLONE"
fi

[[ -d "$SRC/engine" ]] || die "neplatný zdroj: $SRC (chybí engine/)"

# --------------------------------------------------------------------------- #
# 2) Build
# --------------------------------------------------------------------------- #
if [[ "${IDM_SKIP_BUILD:-0}" != "1" ]]; then
  command -v cargo >/dev/null 2>&1 || die "cargo (Rust) není nainstalovaný — viz https://rustup.rs"
  log "stavím engine (cargo build --release)"
  (cd "$SRC/engine" && cargo build --release)
fi

ENGINE_BIN_SRC="$SRC/engine/target/release/idm"
HOST_BIN_SRC="$SRC/engine/target/release/idm-host"
[[ -x "$ENGINE_BIN_SRC" ]] || die "chybí $ENGINE_BIN_SRC (spusť bez IDM_SKIP_BUILD)"
[[ -x "$HOST_BIN_SRC" ]]   || die "chybí $HOST_BIN_SRC"

# --------------------------------------------------------------------------- #
# 3) Install into PREFIX (mirrors the repo layout so the sub-installers work)
# --------------------------------------------------------------------------- #
log "instaluji do $PREFIX"
mkdir -p "$PREFIX/bin" \
         "$PREFIX/engine/target/release" \
         "$PREFIX/extension" \
         "$PREFIX/gui" \
         "$DOWNLOADS_DIR"

install -m 0755 "$ENGINE_BIN_SRC" "$PREFIX/bin/idm"
install -m 0755 "$HOST_BIN_SRC"   "$PREFIX/bin/idm-host"
# Mirror so install-host.sh (which derives paths from the repo layout) works.
install -m 0755 "$ENGINE_BIN_SRC" "$PREFIX/engine/target/release/idm"
install -m 0755 "$HOST_BIN_SRC"   "$PREFIX/engine/target/release/idm-host"

cp -f "$SRC/extension/install-host.sh"  "$PREFIX/extension/" 2>/dev/null || true
cp -f "$SRC/extension/install-shell.sh" "$PREFIX/extension/" 2>/dev/null || true
[[ -f "$SRC/extension/com.tonec.idm.json" ]] && cp -f "$SRC/extension/com.tonec.idm.json" "$PREFIX/extension/"
[[ -f "$SRC/gui/idm_gui.py" ]] && install -m 0755 "$SRC/gui/idm_gui.py" "$PREFIX/gui/idm_gui.py"
chmod +x "$PREFIX/extension/"*.sh 2>/dev/null || true

# Host manifest template must point at the installed host.
if [[ -f "$PREFIX/extension/com.tonec.idm.json" ]]; then
  python3 - "$PREFIX/extension/com.tonec.idm.json" "$PREFIX/engine/target/release/idm-host" <<'PY'
import json, sys
p, host = sys.argv[1], sys.argv[2]
m = json.load(open(p))
m["path"] = host
json.dump(m, open(p, "w"), indent=2)
open(p, "a").write("\n")
PY
fi

# --------------------------------------------------------------------------- #
# 4) Register with browsers + desktop
# --------------------------------------------------------------------------- #
if [[ -x "$PREFIX/extension/install-host.sh" ]]; then
  log "registruji native-messaging hosta"
  IDM_DOWNLOADS_DIR="$DOWNLOADS_DIR" \
    "$PREFIX/extension/install-host.sh" >/dev/null 2>&1 || warn "install-host.sh selhal"
fi

if [[ -x "$PREFIX/extension/install-shell.sh" ]]; then
  log "registruji desktop integraci (launcher, schémata, kontextové menu)"
  IDM_ENGINE_BIN="$PREFIX/bin/idm" \
  IDM_DOWNLOADS_DIR="$DOWNLOADS_DIR" \
  IDM_STATE_DIR="$DATA_HOME/idm-gui" \
    "$PREFIX/extension/install-shell.sh" >/dev/null 2>&1 || warn "install-shell.sh selhal"
fi

# --------------------------------------------------------------------------- #
# 5) Desktop icon
# --------------------------------------------------------------------------- #
DESKTOP="$(desktop_dir)"
mkdir -p "$DESKTOP"
ICON="$DESKTOP/idm.desktop"
GUI_PY="$PREFIX/gui/idm_gui.py"
ENGINE="$PREFIX/bin/idm"

# A launcher wrapper: keeps the .desktop Exec a single token so it always
# validates (apostrophes/`$` in Exec are reserved characters).
LAUNCHER="$PREFIX/bin/idm-gui"
cat > "$LAUNCHER" <<EOF
#!/usr/bin/env bash
# Generated by install.sh — opens the native IDM window.
exec "\${IDM_PYTHON:-python3}" "$GUI_PY" \
    --engine "$ENGINE" \
    --out-dir "$DOWNLOADS_DIR" \
    --state-dir "$DATA_HOME/idm-gui" \
    --autostart
EOF
chmod +x "$LAUNCHER"

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

# Also make sure the applications menu entry exists.
APPS="$DATA_HOME/applications"
mkdir -p "$APPS"
cp -f "$ICON" "$APPS/idm-download.desktop"
command -v update-desktop-database >/dev/null 2>&1 && \
  update-desktop-database "$APPS" >/dev/null 2>&1 || true

# Mark the desktop icon as trusted/executable where the file manager supports it.
if command -v gio >/dev/null 2>&1; then
  gio set "$ICON" metadata::trusted true 2>/dev/null || true
fi

echo
log "hotovo!"
echo "  Engine    : $PREFIX/bin/idm"
echo "  GUI       : spusť z menu nebo dvojklikem na ikonu \"IDM — správce stahování\""
echo "  Stažení   : $DOWNLOADS_DIR"
echo "  Rozšíření : načti 'extension/' v chrome://extensions (Load unpacked)"
echo
echo "  Odinstalace: $0 --uninstall"