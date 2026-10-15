#!/usr/bin/env bash
# install.sh — one-line installer for the IDM-like downloader (Linux).
#
#   curl -fsSL https://raw.githubusercontent.com/zombiegirlcz/IDM/master/install.sh | bash
#
# Like the Windows installer, this does NOT need git, Rust or a compiler: it
# downloads the prebuilt release archive and unpacks it. That mirrors how real
# IDM ships — a ready-made binary, not a build recipe.
#
# Everything lands in ONE directory, $IDM_DIR (default ~/.idm). Only two
# things live outside it, and both out of necessity: the symlink
# ~/.local/bin/idm, and the native-messaging manifests, which a browser only
# looks for in its own config directory.
#
# User-scoped only; never root, never system.
#
# Environment overrides:
#   IDM_DIR             install directory (default ~/.idm)
#   IDM_VERSION         release tag (default: latest)
#   IDM_ARCHIVE_URL     full archive URL (overrides IDM_VERSION)
#   IDM_LOCAL_SOURCE    build from a local checkout instead (needs cargo)
#   IDM_DOWNLOADS_DIR   download directory (default ~/Downloads)
#   IDM_SKIP_GUI_DEPS=1 do not try to install python3/tkinter
set -euo pipefail

REPO="zombiegirlcz/IDM"
VERSION="${IDM_VERSION:-latest}"
IDM_DIR="${IDM_DIR:-$HOME/.idm}"
DOWNLOADS_DIR="${IDM_DOWNLOADS_DIR:-$HOME/Downloads}"
DATA_HOME="${XDG_DATA_HOME:-$HOME/.local/share}"
CONFIG_HOME="${XDG_CONFIG_HOME:-$HOME/.config}"
LINK_DIR="$HOME/.local/bin"
STATE_DIR="$IDM_DIR/state"
NATIVE_DIR="$IDM_DIR/native"

# Where 0.1.5 and older put things. Kept only so migration knows what to look
# for; nothing is ever written here again.
OLD_PREFIX="$DATA_HOME/idm"
OLD_STATE="$DATA_HOME/idm-gui"
OLD_NATIVE="$DATA_HOME/idm-native"

RC_BEGIN='# >>> IDM >>>'
RC_END='# <<< IDM <<<'

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

# --- shell rc: one marked block, rewritten in place ---------------------------
# The block carries IDM_DIR and a guard that puts ~/.local/bin on PATH only if
# it is missing. That guard is not decoration: ~/.profile adds the directory
# only when it already exists at login time, and in a bare container it is
# often absent entirely — without it the symlink we create is unreachable.

rc_block() {
  cat <<EOF
$RC_BEGIN
export IDM_DIR="$IDM_DIR"
case ":\$PATH:" in
  *:"\$HOME/.local/bin":*) ;;
  *) export PATH="\$HOME/.local/bin:\$PATH" ;;
esac
$RC_END
EOF
}

# Strip our block AND the pre-0.2 lines, which were loose `export PATH=...`
# entries with a comment above them rather than a delimited region.
rc_strip() {
  local rc="$1"
  [[ -f "$rc" ]] || return 0
  local tmp="$rc.idm.tmp"
  awk -v b="$RC_BEGIN" -v e="$RC_END" '
    $0 == b { skip = 1; next }
    $0 == e { skip = 0; next }
    skip { next }
    /^# IDM \(added by install\.sh/ { next }
    /^export PATH="[^"]*\/idm\/bin:\$PATH"$/ { next }
    { print }
  ' "$rc" > "$tmp" && mv "$tmp" "$rc" || rm -f "$tmp"
}

rc_write() {
  local rc="$1"
  touch "$rc" 2>/dev/null || return 0
  rc_strip "$rc"
  rc_block >> "$rc"
}

# --- uninstall ----------------------------------------------------------------
# Default is to KEEP state/: losing saved passwords is worse than leaving a
# directory behind. --purge removes it too.

do_uninstall() {
  # --yes is accepted and ignored: this entry point never prompts, so that
  # `bash install.sh --uninstall` keeps working the way it is documented.
  # `idm uninstall` is the one that asks.
  local purge=0 a
  for a in "$@"; do
    case "$a" in
      --purge) purge=1 ;;
    esac
  done
  log "odinstalace ($IDM_DIR)"

  # Both scripts must be told where their files went, or they clean up the
  # pre-0.2 XDG locations and leave ours in place.
  export IDM_STATE_DIR="$STATE_DIR" IDM_NATIVE_DIR="$NATIVE_DIR"
  if [[ -x "$IDM_DIR/extension/install-shell.sh" ]]; then
    IDM_ENGINE_BIN="$IDM_DIR/bin/idm" "$IDM_DIR/extension/install-shell.sh" --uninstall || true
  fi
  if [[ -x "$IDM_DIR/extension/install-host.sh" ]]; then
    "$IDM_DIR/extension/install-host.sh" --uninstall >/dev/null 2>&1 || true
  fi

  rm -f "$(desktop_dir)/idm.desktop"
  rm -f "$DATA_HOME/applications/idm-desktop.desktop" \
        "$DATA_HOME/applications/idm-download.desktop" \
        "$DATA_HOME/applications/idm-scheme.desktop"
  [[ -L "$LINK_DIR/idm" ]] && rm -f "$LINK_DIR/idm"

  for rc in "$HOME/.zshrc" "$HOME/.bashrc" "$HOME/.profile"; do
    rc_strip "$rc"
  done

  if [[ "$purge" -eq 1 ]]; then
    rm -rf "$IDM_DIR"
    log "hotovo — odstraněno včetně stavu"
    return 0
  fi

  # Keep state/, drop everything else. An empty IDM_DIR goes too.
  local entry
  if [[ -d "$IDM_DIR" ]]; then
    for entry in "$IDM_DIR"/* "$IDM_DIR"/.[!.]*; do
      [[ -e "$entry" ]] || continue
      [[ "$(basename "$entry")" == "state" ]] && continue
      rm -rf "$entry"
    done
    rmdir "$IDM_DIR" 2>/dev/null || true
  fi
  if [[ -d "$STATE_DIR" ]]; then
    log "hotovo — stav zůstal v $STATE_DIR (smazat: --purge)"
  else
    log "hotovo — odstraněno"
  fi
}

if [[ "${1:-}" == "--uninstall" ]]; then
  shift
  do_uninstall "$@"
  exit 0
fi

ARCH="$(uname -m)"
case "$ARCH" in
  x86_64|amd64) ASSET="idm-linux-x64.tar.gz" ;;
  aarch64|arm64) ASSET="idm-linux-arm64.tar.gz" ;;
  *) die "nepodporovaná architektura: $ARCH" ;;
esac

# --- 0) migrate a pre-0.2 split install --------------------------------------
# Move, don't copy: two sources of truth about the queue is worse than either
# one. An entry that already exists in the new state wins — the new install is
# by definition the newer one.
migrate_old_install() {
  if [[ -d "$OLD_STATE" ]]; then
    log "stěhuji stav z $OLD_STATE"
    mkdir -p "$STATE_DIR"
    local entry name
    for entry in "$OLD_STATE"/* "$OLD_STATE"/.[!.]*; do
      [[ -e "$entry" ]] || continue
      name="$(basename "$entry")"
      if [[ -e "$STATE_DIR/$name" ]]; then
        rm -rf "$entry"          # the new state is newer; drop the stale copy
      else
        mv "$entry" "$STATE_DIR/$name"
      fi
    done
    rmdir "$OLD_STATE" 2>/dev/null || rm -rf "$OLD_STATE"
  fi
  if [[ -d "$OLD_PREFIX" ]]; then
    log "odstraňuji starý prefix $OLD_PREFIX"
    rm -rf "$OLD_PREFIX"
  fi
  # The native wrappers are regenerated below from the new paths, so the old
  # copies are not worth moving — only worth not leaving behind.
  rm -rf "$OLD_NATIVE"
}

# Make sure the GUI runtime exists: python3 plus its tkinter module. A missing
# module makes the desktop icon do *nothing* (the .desktop sets Terminal=false,
# so the traceback is invisible) — exactly the "clicked the icon, no window"
# symptom. We install the packages ourselves so a single click really is enough.
install_gui_deps() {
  if [[ "${IDM_SKIP_GUI_DEPS:-0}" == "1" ]]; then
    warn "IDM_SKIP_GUI_DEPS=1 — přeskakuji instalaci python3/tkinter"
    return 0
  fi
  local need=()
  command -v python3 >/dev/null 2>&1 || need+=(python3)
  if ! python3 -c 'import tkinter' >/dev/null 2>&1; then
    if command -v apt-get >/dev/null 2>&1; then need+=(python3-tk)
    elif command -v dnf >/dev/null 2>&1 || command -v yum >/dev/null 2>&1; then need+=(python3-tkinter)
    elif command -v pacman >/dev/null 2>&1; then need+=(tk)
    elif command -v zypper >/dev/null 2>&1; then need+=(python3-tk)
    elif command -v apk >/dev/null 2>&1; then need+=(py3-tkinter)
    fi
  fi
  if [[ ${#need[@]} -eq 0 ]]; then
    log "GUI runtime OK (python3 + tkinter)"
    return 0
  fi
  log "doinstalovávám GUI závislosti: ${need[*]}"
  if command -v apt-get >/dev/null 2>&1; then
    { sudo apt-get update -qq && sudo apt-get install -y --no-install-recommends "${need[@]}"; } 2>/dev/null \
      || { apt-get update -qq && apt-get install -y --no-install-recommends "${need[@]}"; } 2>/dev/null || true
  elif command -v dnf >/dev/null 2>&1; then
    sudo dnf install -y "${need[@]}" 2>/dev/null || dnf install -y "${need[@]}" 2>/dev/null || true
  elif command -v yum >/dev/null 2>&1; then
    sudo yum install -y "${need[@]}" 2>/dev/null || yum install -y "${need[@]}" 2>/dev/null || true
  elif command -v pacman >/dev/null 2>&1; then
    sudo pacman -Sy --noconfirm "${need[@]}" 2>/dev/null || pacman -Sy --noconfirm "${need[@]}" 2>/dev/null || true
  elif command -v zypper >/dev/null 2>&1; then
    sudo zypper install -y "${need[@]}" 2>/dev/null || zypper install -y "${need[@]}" 2>/dev/null || true
  elif command -v apk >/dev/null 2>&1; then
    sudo apk add "${need[@]}" 2>/dev/null || apk add "${need[@]}" 2>/dev/null || true
  fi
  if python3 -c 'import tkinter' >/dev/null 2>&1; then
    log "GUI závislosti připraveny"
  else
    warn "tkinter se nepodařilo doinstalovat — ikona vypíše chybu do $STATE_DIR/launcher.log"
  fi
}

# --- 1) obtain the binaries ---------------------------------------------------
TMP="$(mktemp -d)"
trap 'rm -rf "$TMP"' EXIT

ENGINE_BIN_SRC=""
HOST_BIN_SRC=""
ASSETS_SRC=""
# Only a concrete tag is a version. "latest" is the channel we fetched from,
# and writing it into $IDM_DIR/VERSION left `idm update` with nothing to
# compare against -- no release could ever look newer than the word "latest".
# The real number is asked of the binary we just installed.
if [[ "$VERSION" == "latest" ]]; then
  INSTALLED_VERSION=""
else
  INSTALLED_VERSION="$VERSION"
fi

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
  ASSETS_SRC="$SRC/assets"
  INSTALLED_VERSION="local:$SRC"
else
  if [[ -n "${IDM_ARCHIVE_URL:-}" ]]; then
    URL="$IDM_ARCHIVE_URL"
  elif [[ "$VERSION" == "latest" ]]; then
    URL="https://github.com/$REPO/releases/latest/download/$ASSET"
  else
    URL="https://github.com/$REPO/releases/download/$VERSION/$ASSET"
  fi
  # Only https from the network. A local file:// path (used by the installer
  # tests and offline installs) is already as trusted as the filesystem.
  case "$URL" in
    https://*|file://*) ;;
    *) die "archiv se stahuje jen přes https (nebo file://): $URL" ;;
  esac
  log "stahuji $URL"
  fetch() { # fetch URL DEST
    if command -v curl >/dev/null 2>&1; then
      curl -fsSL "$1" -o "$2"
    elif command -v wget >/dev/null 2>&1; then
      wget -qO "$2" "$1"
    else
      die "chybí curl i wget"
    fi
  }
  fetch "$URL" "$TMP/idm.tar.gz" || die "stažení selhalo"

  # Integrity: every release publishes <asset>.sha256 next to the archive.
  if fetch "$URL.sha256" "$TMP/idm.tar.gz.sha256" 2>/dev/null; then
    WANT="$(tr -d '\r' < "$TMP/idm.tar.gz.sha256" | awk 'NF{print $1; exit}')"
    if command -v sha256sum >/dev/null 2>&1; then
      GOT="$(sha256sum "$TMP/idm.tar.gz" | awk '{print $1}')"
    elif command -v shasum >/dev/null 2>&1; then
      GOT="$(shasum -a 256 "$TMP/idm.tar.gz" | awk '{print $1}')"
    else
      GOT=""
      warn "chybí sha256sum/shasum — kontrolní součet nelze ověřit"
    fi
    if [[ -n "$GOT" ]]; then
      [[ "$GOT" == "$WANT" ]] || die "kontrolní součet nesouhlasí (čekáno $WANT, získáno $GOT)"
      log "kontrolní součet ověřen"
    fi
  else
    warn "k archivu není $URL.sha256 — pokračuji bez ověření součtu"
  fi
  mkdir -p "$TMP/unpack"
  tar -xzf "$TMP/idm.tar.gz" -C "$TMP/unpack" || die "rozbalení selhalo"
  ENGINE_BIN_SRC="$TMP/unpack/idm"
  HOST_BIN_SRC="$TMP/unpack/idm-host"
  GUI_PY_SRC="$TMP/unpack/idm_gui.py"
  ASSETS_SRC="$TMP/unpack/assets"
  # Releases from 0.2 on ship the integration scripts in the archive, so an
  # offline install can register the browser host without reaching for GitHub.
  EXT_SRC="$TMP/unpack/extension"
fi

[[ -f "$ENGINE_BIN_SRC" ]] || die "chybí idm binárka"
[[ -f "$HOST_BIN_SRC" ]]   || die "chybí idm-host binárka"

# --- 2) install into IDM_DIR --------------------------------------------------
migrate_old_install

log "instaluji do $IDM_DIR"
mkdir -p "$IDM_DIR/bin" "$IDM_DIR/gui" "$IDM_DIR/assets" "$IDM_DIR/extension" \
         "$NATIVE_DIR" "$STATE_DIR" "$DOWNLOADS_DIR"
chmod 0700 "$STATE_DIR" 2>/dev/null || true
install -m 0755 "$ENGINE_BIN_SRC" "$IDM_DIR/bin/idm"
# idm-host stays its own binary on purpose: the native-messaging manifests
# point straight at it and cannot pass arguments, and it is the only link a
# real browser verifies in CI.
install -m 0755 "$HOST_BIN_SRC"   "$IDM_DIR/bin/idm-host"
if [[ -z "$INSTALLED_VERSION" ]]; then
  # `idm --version` prints something like "idm 2.0.0"; take the number.
  INSTALLED_VERSION="$("$IDM_DIR/bin/idm" --version 2>/dev/null \
    | grep -oE '[0-9]+\.[0-9]+\.[0-9]+' | head -n1)"
fi
if [[ -z "$INSTALLED_VERSION" ]]; then
  # Ask the release API as a last resort, then give up honestly: "unknown"
  # at least does not pretend to be a version that can be compared.
  INSTALLED_VERSION="$(curl -fsSL \
    "https://api.github.com/repos/$REPO/releases/latest" 2>/dev/null \
    | grep -oE '"tag_name"[[:space:]]*:[[:space:]]*"[^"]+"' \
    | head -n1 | grep -oE '[0-9]+\.[0-9]+\.[0-9]+')"
fi
printf '%s\n' "${INSTALLED_VERSION:-unknown}" > "$IDM_DIR/VERSION"

# `--uninstall` is documented as `bash $IDM_DIR/install.sh --uninstall`, so this
# file has to be there — including after `curl ... | bash`, where BASH_SOURCE
# is not a readable file and we take the copy from the archive instead.
if [[ -f "${BASH_SOURCE[0]:-}" ]]; then
  install -m 0755 "${BASH_SOURCE[0]}" "$IDM_DIR/install.sh" 2>/dev/null || true
elif [[ -f "$TMP/unpack/install.sh" ]]; then
  install -m 0755 "$TMP/unpack/install.sh" "$IDM_DIR/install.sh" 2>/dev/null || true
elif [[ -n "${SRC:-}" && -f "$SRC/install.sh" ]]; then
  install -m 0755 "$SRC/install.sh" "$IDM_DIR/install.sh" 2>/dev/null || true
else
  curl -fsSL "https://raw.githubusercontent.com/$REPO/master/install.sh" \
    -o "$IDM_DIR/install.sh" 2>/dev/null && chmod +x "$IDM_DIR/install.sh" || \
    warn "nepodařilo se uložit install.sh pro odinstalaci"
fi

if [[ -n "${GUI_PY_SRC:-}" && -f "$GUI_PY_SRC" ]]; then
  install -m 0755 "$GUI_PY_SRC" "$IDM_DIR/gui/idm_gui.py"
fi

# The icon files. Without these the desktop entry has nothing to point at, and
# `Icon=` falls back to a theme name that most themes do not carry — which is
# exactly why the shortcut used to render blank.
for a in idm.png idm.ico; do
  if [[ -n "$ASSETS_SRC" && -f "$ASSETS_SRC/$a" ]]; then
    install -m 0644 "$ASSETS_SRC/$a" "$IDM_DIR/assets/$a"
  else
    curl -fsSL "https://raw.githubusercontent.com/$REPO/master/assets/$a" \
      -o "$IDM_DIR/assets/$a" 2>/dev/null || warn "nestáhl $a"
  fi
done

# The aria2 auto-installer travels with the binaries so `--aria2` can install
# aria2c on demand without the user doing anything.
for f in ensure-aria2.sh ensure-aria2.ps1; do
  if [[ -n "${SRC:-}" && -f "$SRC/scripts/$f" ]]; then
    install -m 0755 "$SRC/scripts/$f" "$IDM_DIR/bin/$f" 2>/dev/null || true
  elif [[ -f "$TMP/unpack/$f" ]]; then
    install -m 0755 "$TMP/unpack/$f" "$IDM_DIR/bin/$f" 2>/dev/null || true
  else
    # Last resort (e.g. an older archive that did not ship them yet).
    curl -fsSL "https://raw.githubusercontent.com/$REPO/master/scripts/$f" \
      -o "$IDM_DIR/bin/$f" 2>/dev/null && chmod +x "$IDM_DIR/bin/$f" || \
      warn "nestáhl $f (--aria2 si ho zkusí doinstalovat sám)"
  fi
done

if [[ -n "${EXT_SRC:-}" && -d "$EXT_SRC" ]]; then
  cp -f "$EXT_SRC/install-host.sh"  "$IDM_DIR/extension/" 2>/dev/null || true
  cp -f "$EXT_SRC/install-shell.sh" "$IDM_DIR/extension/" 2>/dev/null || true
  cp -f "$EXT_SRC/com.tonec.idm.json" "$IDM_DIR/extension/" 2>/dev/null || true
  cp -f "$EXT_SRC/com.tonec.idm.firefox.json" "$IDM_DIR/extension/" 2>/dev/null || true
  chmod +x "$IDM_DIR/extension/"*.sh 2>/dev/null || true
else
  RAW="https://raw.githubusercontent.com/$REPO/master"
  for f in install-host.sh install-shell.sh com.tonec.idm.json com.tonec.idm.firefox.json; do
    curl -fsSL "$RAW/extension/$f" -o "$IDM_DIR/extension/$f" 2>/dev/null || warn "nestáhl $f"
  done
  chmod +x "$IDM_DIR/extension/"*.sh 2>/dev/null || true
fi

# Host manifest template must point at the installed host.
MANIFEST="$IDM_DIR/extension/com.tonec.idm.json"
if [[ -f "$MANIFEST" ]] && command -v python3 >/dev/null 2>&1; then
  python3 -I - "$MANIFEST" "$IDM_DIR/bin/idm-host" <<'PY'
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

# --- 3) register with browsers + desktop --------------------------------------
if [[ -x "$IDM_DIR/extension/install-host.sh" ]]; then
  log "registruji native-messaging hosta"
  IDM_DOWNLOADS_DIR="$DOWNLOADS_DIR" \
  IDM_STATE_DIR="$STATE_DIR" \
  IDM_NATIVE_DIR="$NATIVE_DIR" \
    "$IDM_DIR/extension/install-host.sh" >/dev/null 2>&1 || warn "install-host.sh selhal"
fi
if [[ -x "$IDM_DIR/extension/install-shell.sh" ]]; then
  log "registruji desktop integraci"
  IDM_ENGINE_BIN="$IDM_DIR/bin/idm" \
  IDM_DOWNLOADS_DIR="$DOWNLOADS_DIR" \
  IDM_STATE_DIR="$STATE_DIR" \
  IDM_NATIVE_DIR="$NATIVE_DIR" \
    "$IDM_DIR/extension/install-shell.sh" >/dev/null 2>&1 || warn "install-shell.sh selhal"
fi

# --- 4) GUI runtime -----------------------------------------------------------
# The icon has to "just work": install python3/tkinter first, so the shortcut
# we hand the user cannot silently do nothing. There is no generated launcher
# any more — `idm --gui` is the launcher.
install_gui_deps

# --- 5) symlink + shell rc ----------------------------------------------------
mkdir -p "$LINK_DIR"
ln -sfn "$IDM_DIR/bin/idm" "$LINK_DIR/idm"
log "symlink: $LINK_DIR/idm -> $IDM_DIR/bin/idm"

RC_WRITTEN=0
for rc in "$HOME/.zshrc" "$HOME/.bashrc"; do
  if [[ -f "$rc" ]]; then
    rc_write "$rc"
    RC_WRITTEN=1
  fi
done
[[ "$RC_WRITTEN" -eq 1 ]] || rc_write "$HOME/.bashrc"
log "shell: IDM_DIR + PATH zapsáno do ~/.zshrc / ~/.bashrc"

# --- 6) desktop entry ---------------------------------------------------------
DESKTOP="$(desktop_dir)"
mkdir -p "$DESKTOP"
ICON="$DESKTOP/idm.desktop"
cat > "$ICON" <<EOF
[Desktop Entry]
Type=Application
Version=1.0
Name=IDM — správce stahování
Comment=Stahovat soubory a videa (multi-connection, resume, yt-dlp)
Exec=$IDM_DIR/bin/idm --gui
Icon=$IDM_DIR/assets/idm.png
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

# Offer to install aria2 up front (non-fatal if it fails).
if [[ -x "$IDM_DIR/bin/ensure-aria2.sh" ]]; then
  log "kontroluji aria2 (volitelný zrychlený backend)"
  bash "$IDM_DIR/bin/ensure-aria2.sh" >/dev/null 2>&1 || warn "aria2 se nepodařilo připravit (--aria2 ho zkusí doinstalovat za běhu)"
fi

echo
log "hotovo!"
echo "  Složka     : $IDM_DIR"
echo "  Nástroj    : idm  (symlink v $LINK_DIR)"
echo "  Okno       : idm --gui, nebo ikona 'IDM' na ploše"
echo "  Stažení    : $DOWNLOADS_DIR"
echo "  Stav       : $STATE_DIR"
echo "  Odinstalace: idm uninstall"
