#!/usr/bin/env bash
# scripts/test.sh — single entry point for the whole test matrix.
#
# Order matters:
#   1. `cargo build --release` — the deployed host (engine/target/release/idm-host)
#      is what the Chrome native-messaging manifest points at, and the
#      release_host guard fails on a missing OR stale release binary. Building
#      first keeps that guard meaningful instead of a false "STALE".
#   2. `cargo test` — engine + host suites (debug build via CARGO_BIN_EXE_*).
#   3. `node --test` — extension suites, EXCLUDING chrome_e2e.test.mjs, which
#      drives a real Chromium and is blocked in headless sandboxes (Chromium
#      dies with SIGTRAP/exit 133). Run it manually where Chromium works:
#        xvfb-run -a node --test extension/test/chrome_e2e.test.mjs
set -euo pipefail

ROOT="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
cd "$ROOT"

echo "== [1/5] cargo build --release =="
(cd engine && cargo build --release)

echo
echo "== [2/5] cargo test =="
(cd engine && cargo test)

echo
echo "== [3/5] node --test (extension, excluding chrome_e2e) =="
# Every *.test.mjs except the real-Chromium harness, which needs a working
# Chromium + display and is therefore run manually / in a dedicated job.
mapfile -t TEST_FILES < <(
  find extension/test -name '*.test.mjs' ! -name 'chrome_e2e.test.mjs' | sort
)
if [[ ${#TEST_FILES[@]} -eq 0 ]]; then
  echo "error: no extension test files found under extension/test" >&2
  exit 1
fi
printf '  - %s\n' "${TEST_FILES[@]}"
node --test "${TEST_FILES[@]}"

echo
echo "== [4/5] node --test (native GUI) =="
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
echo "== [5/5] node --test (installer) =="
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
echo "== all suites passed =="