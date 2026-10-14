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

export function chromeE2eMode({ chromium, xvfb, display, want, starts = null }) {
  const forced = want === '1';
  const decide = (reason) => ({
    mode: forced ? 'fail' : 'skip',
    reason: forced ? reason + ' (RUN_CHROME_E2E=1 promised it would be)' : reason,
    chromium,
    xvfb: false,
  });

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
