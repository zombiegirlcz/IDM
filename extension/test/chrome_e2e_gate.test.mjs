// Who is allowed to skip the real-Chromium E2E.
//
// chrome_e2e.test.mjs was excluded from `npm test` outright and left
// non-blocking in CI, which made the one test that exercises the real
// browser -> content.js -> background.js -> native host chain invisible: it
// could rot for weeks without anyone noticing. But it genuinely cannot run
// everywhere — Chromium dies with SIGTRAP (exit 133) in sandboxes whose
// kernel it does not support, and that is not the extension's fault.
//
// So the decision is a function of the environment, with the same shape as
// releaseHostMode: a run that is SUPPOSED to be able to drive a browser must
// fail when it cannot, and everyone else skips with a reason.
//
// Runs with: node --test extension/test/chrome_e2e_gate.test.mjs

import test from 'node:test';
import assert from 'node:assert/strict';
import { chromeE2eMode } from '../chrome_e2e_gate.mjs';

test('everything present means run it', () => {
  const d = chromeE2eMode({ chromium: '/bin/chromium', xvfb: true, display: null, want: null });
  assert.equal(d.mode, 'run');
});

test('an existing DISPLAY needs no xvfb', () => {
  const d = chromeE2eMode({ chromium: '/bin/chromium', xvfb: false, display: ':0', want: null });
  assert.equal(d.mode, 'run');
});

test('no Chromium is a skip by default', () => {
  const d = chromeE2eMode({ chromium: null, xvfb: true, display: ':0', want: null });
  assert.equal(d.mode, 'skip');
  assert.match(d.reason, /[Cc]hromium/);
});

test('no display at all is a skip by default', () => {
  const d = chromeE2eMode({ chromium: '/bin/chromium', xvfb: false, display: null, want: null });
  assert.equal(d.mode, 'skip');
  assert.match(d.reason, /display|Xvfb/i);
});

test('RUN_CHROME_E2E=1 turns every skip into a failure', () => {
  // CI's chrome-e2e job installs Chromium and Xvfb on purpose. If either is
  // missing there, the job is misconfigured and must say so rather than pass
  // by quietly testing nothing.
  const d = chromeE2eMode({ chromium: null, xvfb: false, display: null, want: '1' });
  assert.equal(d.mode, 'fail');
  assert.match(d.reason, /RUN_CHROME_E2E/);
});

test('RUN_CHROME_E2E=0 skips even where it could run', () => {
  const d = chromeE2eMode({ chromium: '/bin/chromium', xvfb: true, display: ':0', want: '0' });
  assert.equal(d.mode, 'skip');
  assert.match(d.reason, /RUN_CHROME_E2E/);
});

test('the chromium path travels with the decision', () => {
  // The harness needs the resolved binary, not a second lookup that might
  // disagree with the one the gate approved.
  const d = chromeE2eMode({ chromium: '/opt/c/chrome', xvfb: true, display: null, want: null });
  assert.equal(d.chromium, '/opt/c/chrome');
  assert.equal(d.xvfb, true, 'and whether it has to wrap the run in xvfb-run');
});

test('with a display of its own it does not reach for xvfb-run', () => {
  const d = chromeE2eMode({ chromium: '/bin/chromium', xvfb: true, display: ':9', want: null });
  assert.equal(d.xvfb, false);
});

// Having a Chromium binary is not the same as having a Chromium that runs.
// On a kernel it does not support, both the distro build and Playwright's own
// die instantly with SIGTRAP (exit 133) and no diagnostic whatsoever. The gate
// has to tell that apart from a broken checkout, or `npm test` fails on a
// machine where nothing is actually wrong with the extension.

test('a Chromium that cannot start is a skip, not a failure', () => {
  const d = chromeE2eMode({
    chromium: '/bin/chromium', xvfb: true, display: null, want: null, starts: false,
  });
  assert.equal(d.mode, 'skip');
  assert.match(d.reason, /start|SIGTRAP|133/i);
});

test('a Chromium that cannot start still fails the run that promised one', () => {
  const d = chromeE2eMode({
    chromium: '/bin/chromium', xvfb: true, display: null, want: '1', starts: false,
  });
  assert.equal(d.mode, 'fail');
});

test('a Chromium that starts runs', () => {
  const d = chromeE2eMode({
    chromium: '/bin/chromium', xvfb: true, display: null, want: null, starts: true,
  });
  assert.equal(d.mode, 'run');
});

test('an unprobed Chromium is given the benefit of the doubt', () => {
  // `starts: null` means nobody ran the smoke check (it costs a few seconds);
  // the gate must not invent a failure out of a missing probe.
  const d = chromeE2eMode({
    chromium: '/bin/chromium', xvfb: true, display: null, want: null, starts: null,
  });
  assert.equal(d.mode, 'run');
});
