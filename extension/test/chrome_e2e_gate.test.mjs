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

// --- the Firefox twin --------------------------------------------------------
// Firefox needs a different gate, not a copy of this one: it is headless
// without any X server at all, so a missing DISPLAY is irrelevant there.

test('Firefox runs headless with no display whatsoever', async () => {
  const { firefoxE2eMode } = await import('../chrome_e2e_gate.mjs');
  const d = firefoxE2eMode({ firefox: '/bin/firefox', display: null, want: null });
  assert.equal(d.mode, 'run');
  assert.equal(d.xvfb, false, 'wrapping Firefox in xvfb-run would be pointless');
});

test('no Firefox is a skip, or a failure when promised', async () => {
  const { firefoxE2eMode } = await import('../chrome_e2e_gate.mjs');
  assert.equal(firefoxE2eMode({ firefox: null, want: null }).mode, 'skip');
  const forced = firefoxE2eMode({ firefox: null, want: '1' });
  assert.equal(forced.mode, 'fail');
  assert.match(forced.reason, /RUN_FIREFOX_E2E/);
});

test('RUN_FIREFOX_E2E=0 turns it off', async () => {
  const { firefoxE2eMode } = await import('../chrome_e2e_gate.mjs');
  const d = firefoxE2eMode({ firefox: '/bin/firefox', want: '0' });
  assert.equal(d.mode, 'skip');
});

test('a Firefox that cannot start is a skip like Chromium is', async () => {
  const { firefoxE2eMode } = await import('../chrome_e2e_gate.mjs');
  const d = firefoxE2eMode({ firefox: '/bin/firefox', want: null, starts: false });
  assert.equal(d.mode, 'skip');
  assert.match(d.reason, /start/i);
});

// --- handing a decision to the shell ----------------------------------------
// The runner scripts print one TAB-separated line and the shell reads it with
// `IFS=$'\t' read`. Tab counts as IFS whitespace there, so a RUN of empty
// fields collapses into one and every later field shifts left: a skip with no
// xvfb flag silently moved its reason into the xvfb slot, which both lost the
// reason and left a non-empty "xvfb". No field may therefore be empty.

test('no field of a printed decision is empty', async () => {
  const { formatDecision } = await import('../chrome_e2e_gate.mjs');
  const line = formatDecision({ mode: 'skip', chromium: null, xvfb: false, reason: 'nope' });
  const fields = line.split('\t');
  assert.equal(fields.length, 4);
  assert.ok(fields.every((f) => f.length > 0), `empty field in ${JSON.stringify(line)}`);
  assert.equal(fields[0], 'skip');
  assert.equal(fields[3], 'nope');
});

test('a reason survives a decision with no binary', async () => {
  const { formatDecision } = await import('../chrome_e2e_gate.mjs');
  // What bash actually does with the line, modelled: collapse runs of tabs.
  const line = formatDecision({ mode: 'skip', chromium: null, xvfb: false, reason: 'why' });
  const [mode, , , reason] = line.replace(/\t+/g, '\t').split('\t');
  assert.equal(mode, 'skip');
  assert.equal(reason, 'why', 'the reason must not shift out of its slot');
});

test('the xvfb flag is a 1 or a 0, never a blank', async () => {
  const { formatDecision } = await import('../chrome_e2e_gate.mjs');
  assert.equal(formatDecision({ mode: 'run', chromium: '/c', xvfb: true, reason: '' })
    .split('\t')[2], '1');
  assert.equal(formatDecision({ mode: 'run', chromium: '/c', xvfb: false, reason: '' })
    .split('\t')[2], '0');
});

test('a Firefox decision prints three filled fields', async () => {
  const { formatDecision } = await import('../chrome_e2e_gate.mjs');
  const line = formatDecision({ mode: 'skip', firefox: null, reason: 'none here' }, 'firefox');
  const fields = line.split('\t');
  assert.equal(fields.length, 3);
  assert.ok(fields.every((f) => f.length > 0), `empty field in ${JSON.stringify(line)}`);
  assert.equal(fields[2], 'none here');
});
