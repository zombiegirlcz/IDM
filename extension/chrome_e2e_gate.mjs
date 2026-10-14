// Whether this machine can be asked to drive a real Chromium.
//
// chrome_e2e.test.mjs is the only test that exercises the genuine chain
// (trusted click -> content.js -> background.js -> connectNative -> idm-host
// -> engine), so skipping it silently is expensive: nothing else would notice
// the chain breaking. But it needs a Chromium that actually starts and a
// display to start it on, and neither is guaranteed — some sandboxes kill
// Chromium with SIGTRAP no matter which build you hand them.
//
// Hence the same split as releaseHostMode: by default a missing prerequisite
// is a skip WITH A REASON, and RUN_CHROME_E2E=1 (what CI's chrome-e2e job
// sets) promises the prerequisites are there, so then their absence is a
// failure instead of a quiet pass.

/** The shared skip-or-fail shape; `flag` names the variable that promised. */
function decider({ want, flag, bin, key }) {
  const forced = want === '1';
  return (reason) => ({
    mode: forced ? 'fail' : 'skip',
    reason: forced ? `${reason} (${flag}=1 promised it would be)` : reason,
    [key]: bin,
    xvfb: false,
  });
}

export function chromeE2eMode({ chromium, xvfb, display, want, starts = null }) {
  const decide = decider({ want, flag: 'RUN_CHROME_E2E', bin: chromium, key: 'chromium' });

  if (want === '0') {
    return { mode: 'skip', reason: 'RUN_CHROME_E2E=0 turned it off', chromium, xvfb: false };
  }
  if (!chromium) {
    return decide('no Chromium binary found (set CHROMIUM_BIN, or install one)');
  }
  if (!display && !xvfb) {
    return decide('no DISPLAY and no xvfb-run to make one');
  }
  // `starts === null` means the smoke check was not run; only an explicit
  // false is evidence of a Chromium that dies on this kernel.
  if (starts === false) {
    return decide(`${chromium} does not start here (dies instantly, e.g. SIGTRAP/exit 133)`);
  }
  // A display that already exists is used as it is; xvfb-run is only the
  // fallback that creates one, so asking for both would nest two servers.
  return { mode: 'run', reason: '', chromium, xvfb: !display };
}


/**
 * Firefox's gate is deliberately NOT chromeE2eMode with another binary.
 * Firefox is genuinely headless — it needs no X server, so xvfb-run and
 * DISPLAY play no part — and the harness drives it over Marionette rather
 * than Playwright, so the only prerequisite is a Firefox that runs.
 */
export function firefoxE2eMode({ firefox, want, starts = null }) {
  const decide = decider({ want, flag: 'RUN_FIREFOX_E2E', bin: firefox, key: 'firefox' });

  if (want === '0') {
    return { mode: 'skip', reason: 'RUN_FIREFOX_E2E=0 turned it off', firefox, xvfb: false };
  }
  if (!firefox) {
    return decide('no Firefox binary found (set FIREFOX_BIN, or install one)');
  }
  if (starts === false) {
    return decide(`${firefox} does not start here`);
  }
  return { mode: 'run', reason: '', firefox, xvfb: false };
}

/**
 * One line for the shell: TAB-separated, and never an empty field.
 *
 * `IFS=$'\t' read` treats tab as IFS whitespace, so consecutive tabs collapse
 * into a single delimiter and every field after the gap shifts left. A skip
 * with no binary therefore used to deliver its reason into the xvfb slot:
 * the reason vanished from the output and the flag looked set. "-" stands in
 * for anything absent, which keeps the field count stable.
 */
export function formatDecision(d, family = 'chrome') {
  const dash = (v) => (v === null || v === undefined || v === '' ? '-' : String(v));
  if (family === 'firefox') {
    return [d.mode, dash(d.firefox), dash(d.reason)].join('\t');
  }
  return [d.mode, dash(d.chromium), d.xvfb ? '1' : '0', dash(d.reason)].join('\t');
}
