// Tests for `display_plan` — the decision behind running the native window on
// its OWN X display instead of the user's desktop.
//
// The window is Tk, so it needs a DISPLAY. Until now that was entirely the
// caller's problem: without one, build_window() raised and main() printed a
// hint. Headless machines (and the Chromium e2e harness) need the other half:
// IDM starting an Xvfb of its own, pointing the window at it, and optionally
// dumping a screenshot so somebody can see what the invisible display holds.
//
// Everything decidable lives here as a pure function — which display number,
// which argv, which screenshot tool, and which of those cases is an error —
// so the tests never start an X server. main() only executes the plan.
//
// Runs with: node --test gui/test/display_plan.test.mjs

import test from 'node:test';
import assert from 'node:assert/strict';
import { execFileSync } from 'node:child_process';
import { fileURLToPath } from 'node:url';
import { dirname, join } from 'node:path';

const here = dirname(fileURLToPath(import.meta.url));
const guiPy = join(here, '..', 'idm_gui.py');

/** Run a snippet against the GUI module and return its printed JSON. */
function py(snippet) {
  const code = `
import sys, json
sys.path.insert(0, ${JSON.stringify(dirname(guiPy))})
import idm_gui as g
${snippet}
`;
  const out = execFileSync('python3', ['-I', '-c', code], { encoding: 'utf8' });
  const line = out.split('\n').find((l) => l.startsWith('R:'));
  assert.ok(line, `no R: line in output:\n${out}`);
  return JSON.parse(line.slice(2));
}

/** plan(args, env, probe) with every field defaulted, so cases stay readable. */
function plan(args = {}, env = {}, probe = {}) {
  return py(`
args = json.loads(${JSON.stringify(JSON.stringify(args))})
env = json.loads(${JSON.stringify(JSON.stringify(env))})
probe = json.loads(${JSON.stringify(JSON.stringify(probe))})
print("R:" + json.dumps(g.display_plan(args, env, probe)))
`);
}

test('with no flags the window inherits the surrounding DISPLAY', () => {
  const r = plan({}, { DISPLAY: ':0' }, {});
  assert.equal(r.mode, 'inherit');
  assert.equal(r.display, ':0');
  assert.equal(r.xvfb_argv, null, 'inheriting must not start an X server');
});

test('no flags and no DISPLAY is still inherit, so the existing hint survives', () => {
  // build_window() raising with its "spust IDM v grafickem sezeni" message is
  // the established behaviour here; the plan must not pre-empt it with an
  // error of its own, or that hint becomes unreachable.
  const r = plan({}, {}, {});
  assert.equal(r.mode, 'inherit');
  assert.equal(r.display, null);
});

test('--display picks a display without starting one', () => {
  const r = plan({ display: ':7' }, { DISPLAY: ':0' }, { have: ['Xvfb'] });
  assert.equal(r.mode, 'inherit');
  assert.equal(r.display, ':7', 'the flag beats the inherited DISPLAY');
  assert.equal(r.xvfb_argv, null);
});

test('--display accepts a bare number', () => {
  assert.equal(plan({ display: '7' }).display, ':7');
});

test('--own-display starts an Xvfb on the first free number', () => {
  const r = plan({ own_display: true }, {}, { have: ['Xvfb'], busy: [99, 100] });
  assert.equal(r.mode, 'own');
  assert.equal(r.display, ':101', 'must skip the displays already in use');
  assert.deepEqual(r.xvfb_argv, [
    'Xvfb', ':101', '-screen', '0', '1280x800x24', '-nolisten', 'tcp',
  ]);
});

test('--own-display without Xvfb is an error, not a silent fallback', () => {
  // Falling back to the inherited DISPLAY would put the window on the user's
  // desktop when they explicitly asked for a separate one.
  const r = plan({ own_display: true }, { DISPLAY: ':0' }, { have: ['ffmpeg'] });
  assert.equal(r.mode, 'error');
  assert.match(r.reason, /Xvfb/);
});

test('--own-display beats --display', () => {
  const r = plan({ own_display: true, display: ':7' }, {}, { have: ['Xvfb'] });
  assert.equal(r.mode, 'own');
  assert.equal(r.display, ':99');
});

test('--screenshot prefers ffmpeg and writes the requested PNG', () => {
  const r = plan(
    { own_display: true, screenshot: '/tmp/shot.png' },
    {},
    { have: ['Xvfb', 'ffmpeg', 'xwd'] },
  );
  assert.equal(r.shot.path, '/tmp/shot.png');
  assert.deepEqual(r.shot.argv, [
    'ffmpeg', '-hide_banner', '-loglevel', 'error', '-y',
    '-f', 'x11grab', '-i', ':99', '-frames:v', '1', '/tmp/shot.png',
  ]);
});

test('without ffmpeg it falls back to xwd and says so in the path', () => {
  // xwd cannot write PNG. Renaming the output keeps the file honest instead
  // of handing back a .png that no viewer will open.
  const r = plan(
    { own_display: true, screenshot: '/tmp/shot.png' },
    {},
    { have: ['Xvfb', 'xwd'] },
  );
  assert.equal(r.shot.path, '/tmp/shot.xwd');
  assert.deepEqual(r.shot.argv, [
    'xwd', '-display', ':99', '-root', '-out', '/tmp/shot.xwd',
  ]);
});

test('--screenshot with no capture tool is an error', () => {
  const r = plan({ own_display: true, screenshot: '/tmp/shot.png' }, {}, { have: ['Xvfb'] });
  assert.equal(r.mode, 'error');
  assert.match(r.reason, /ffmpeg|xwd/);
});

test('--screenshot captures the display the window actually uses', () => {
  const r = plan(
    { display: ':7', screenshot: '/tmp/shot.png' },
    { DISPLAY: ':0' },
    { have: ['ffmpeg'] },
  );
  assert.equal(r.mode, 'inherit');
  assert.ok(r.shot.argv.includes(':7'), `wrong display in ${r.shot.argv.join(' ')}`);
  assert.ok(!r.shot.argv.includes(':0'));
});

test('no --screenshot means no capture step at all', () => {
  assert.equal(plan({ own_display: true }, {}, { have: ['Xvfb', 'ffmpeg'] }).shot, null);
});

// --- executing the plan ------------------------------------------------------
// The tests above never touch X. These two do: `--selftest-display` runs the
// plan for real — start the server, build the window on it, photograph it,
// tear everything down — which is the whole point of the feature.

import { execFileSync as run } from 'node:child_process';
import { existsSync, readFileSync, mkdtempSync, rmSync, readdirSync } from 'node:fs';
import { tmpdir } from 'node:os';

/** The GUI with DISPLAY scrubbed, so nothing can quietly use the desktop. */
function guiRun(argv) {
  const env = { ...process.env };
  delete env.DISPLAY;
  delete env.XAUTHORITY;
  return run('python3', [guiPy, ...argv], { encoding: 'utf8', env, timeout: 60_000 });
}

test('--own-display builds the window with no DISPLAY in the environment', () => {
  const out = guiRun(['--own-display', '--selftest-display']);
  const r = JSON.parse(out.split('\n').find((l) => l.startsWith('DISPLAY-SELFTEST:')).slice(17));
  assert.equal(r.mode, 'own');
  assert.match(r.display, /^:\d+$/);
  assert.equal(r.window, 'ok', 'the Tk window must have been built on that display');
});

test('--screenshot writes a real PNG of the window', () => {
  const dir = mkdtempSync(join(tmpdir(), 'idm-shot-'));
  try {
    const shot = join(dir, 'window.png');
    const out = guiRun(['--own-display', '--screenshot', shot, '--selftest-display']);
    const r = JSON.parse(out.split('\n').find((l) => l.startsWith('DISPLAY-SELFTEST:')).slice(17));
    assert.equal(r.shot, shot, `reported ${r.shot}, files: ${readdirSync(dir)}`);
    assert.ok(existsSync(shot), 'the screenshot file must exist');
    const head = readFileSync(shot).subarray(0, 8);
    assert.deepEqual([...head], [0x89, 0x50, 0x4e, 0x47, 0x0d, 0x0a, 0x1a, 0x0a], 'not a PNG');
  } finally {
    rmSync(dir, { recursive: true, force: true });
  }
});

test('the Xvfb it started does not outlive it', () => {
  // An orphaned X server per launch is the same class of leak as the orphaned
  // `idm --serve` that build_window()-first was introduced to prevent.
  const out = guiRun(['--own-display', '--selftest-display']);
  const r = JSON.parse(out.split('\n').find((l) => l.startsWith('DISPLAY-SELFTEST:')).slice(17));
  const sock = `/tmp/.X11-unix/X${r.display.slice(1)}`;
  assert.ok(!existsSync(sock), `${sock} is still around, Xvfb was not reaped`);
});
