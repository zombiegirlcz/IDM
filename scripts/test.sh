#!/usr/bin/env bash
# scripts/test.sh — single entry point for the whole test matrix.
#
# Rust is OPT-IN: set WITH_RUST=1 to get steps 1 and 2. A plain `npm test`
# therefore needs no toolchain and compiles nothing; CI sets the flag and runs
# the full matrix. WITH_RUST is exported so release_host.test.mjs knows whether
# a missing release binary is a failure (it was supposed to be built) or a skip.
#
# Order matters:
#   1. `cargo build --release` — the deployed host (engine/target/release/idm-host)
#      is what the Chrome native-messaging manifest points at, and the
#      release_host guard fails on a missing OR stale release binary. Building
#      first keeps that guard meaningful instead of a false "STALE".
#   2. `cargo test` — engine + host suites (debug build via CARGO_BIN_EXE_*).
#   3. `node --test` — extension suites, EXCLUDING the two real-browser
#      harnesses (chrome_e2e, firefox_e2e), which get gated steps 6 and 7.
set -euo pipefail

WITH_RUST="${WITH_RUST:-}"
export WITH_RUST

ROOT="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
cd "$ROOT"

echo "== [1/7] cargo build --release =="
if [[ "$WITH_RUST" == "1" ]]; then
  (cd engine && cargo build --release)
else
  echo "  (skipped: set WITH_RUST=1 to build the release host and run the Rust suites)"
fi

echo
echo "== [2/7] cargo test =="
# --no-fail-fast: cargo stops after the first failing test TARGET, so one flaky
# binary hides every suite alphabetically after it. That is how a brand-new
# tests/update.rs went unreported behind a port race in tests/gui.rs -- the
# run was red, but not for the reason being worked on.
if [[ "$WITH_RUST" == "1" ]]; then
  (cd engine && cargo test --no-fail-fast)
else
  echo "  (skipped: WITH_RUST is not 1)"
fi

echo
echo "== [3/7] node --test (extension, excluding the browser E2Es) =="
# Every *.test.mjs except the two real-browser harnesses, which need a working
# browser and therefore get the gated steps 6 and 7.
mapfile -t TEST_FILES < <(
  find extension/test -name '*.test.mjs' \
    ! -name 'chrome_e2e.test.mjs' ! -name 'firefox_e2e.test.mjs' | sort
)
if [[ ${#TEST_FILES[@]} -eq 0 ]]; then
  echo "error: no extension test files found under extension/test" >&2
  exit 1
fi
printf '  - %s\n' "${TEST_FILES[@]}"
node --test "${TEST_FILES[@]}"

echo
echo "== [4/7] node --test (native GUI) =="
# The native window tests: API client against a real idm --serve, plus building
# the Tk window under xvfb-run. Skipped gracefully if python3/xvfb are absent.
if command -v python3 >/dev/null 2>&1; then
  mapfile -t GUI_FILES < <(find gui/test -name '*.test.mjs' | sort)
  if [[ ${#GUI_FILES[@]} -gt 0 ]]; then
    printf '  - %s\n' "${GUI_FILES[@]}"
    node --test "${GUI_FILES[@]}"
  fi
else
  echo "  (skipped: python3 not found)"
fi

echo
echo "== [5/7] node --test (installer) =="
if command -v desktop-file-validate >/dev/null 2>&1; then
  mapfile -t INSTALL_FILES < <(find test -name '*.test.mjs' | sort)
  if [[ ${#INSTALL_FILES[@]} -gt 0 ]]; then
    printf '  - %s\n' "${INSTALL_FILES[@]}"
    node --test "${INSTALL_FILES[@]}"
  fi
else
  echo "  (skipped: desktop-file-validate not found)"
fi

echo
echo "== [6/7] node --test (real Chromium E2E) =="
# The one test that drives a genuine browser. It cannot run everywhere, so the
# decision is chromeE2eMode()'s (extension/chrome_e2e_gate.mjs): by default a
# missing or non-starting Chromium is a skip with a stated reason, and
# RUN_CHROME_E2E=1 — what CI's chrome-e2e job sets — turns that into a failure,
# so a misconfigured job cannot pass by testing nothing.
IFS=$'\t' read -r E2E_MODE E2E_CHROMIUM E2E_XVFB E2E_REASON \
  < <(node extension/chrome_e2e_decide.mjs)
case "$E2E_MODE" in
  run)
    echo "  using $E2E_CHROMIUM$([[ "$E2E_XVFB" == 1 ]] && echo ' (under xvfb-run)')"
    if [[ "$E2E_XVFB" == 1 ]]; then
      CHROMIUM_BIN="$E2E_CHROMIUM" xvfb-run -a \
        node --test extension/test/chrome_e2e.test.mjs
    else
      CHROMIUM_BIN="$E2E_CHROMIUM" node --test extension/test/chrome_e2e.test.mjs
    fi
    ;;
  skip) echo "  (skipped: $E2E_REASON)" ;;
  *)    echo "error: $E2E_REASON" >&2; exit 1 ;;
esac

echo
echo "== [7/7] node --test (real Firefox E2E) =="
# The Firefox twin of step 6, over Marionette instead of Playwright. Firefox is
# headless without any X server, so this one needs no xvfb-run — see
# firefoxE2eMode() for why it is a separate gate rather than the same one.
IFS=$'\t' read -r FF_MODE FF_BIN FF_REASON < <(node extension/firefox_e2e_decide.mjs)
case "$FF_MODE" in
  run)
    echo "  using $FF_BIN"
    FIREFOX_BIN="$FF_BIN" node --test extension/test/firefox_e2e.test.mjs
    ;;
  skip) echo "  (skipped: $FF_REASON)" ;;
  *)    echo "error: $FF_REASON" >&2; exit 1 ;;
esac

echo
echo "== all suites passed =="