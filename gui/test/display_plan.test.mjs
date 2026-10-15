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

import { execFileSync as run, spawn } from 'node:child_process';
import { createServer } from 'node:http';
import {
  existsSync, readFileSync, writeFileSync, mkdtempSync, rmSync, readdirSync,
} from 'node:fs';
import { tmpdir } from 'node:os';

/** null when the binary is not in PATH. */
function which(bin) {
  try {
    return run('sh', ['-c', `command -v ${bin}`], { encoding: 'utf8' }).trim() || null;
  } catch {
    return null;
  }
}

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

const HAVE_FFMPEG = Boolean(which('ffmpeg'));
const HAVE_XWD = Boolean(which('xwd'));

test('--screenshot writes a real picture of the window', { skip: !HAVE_FFMPEG && !HAVE_XWD
  ? 'neither ffmpeg nor xwd is installed' : false }, () => {
  // Which file lands depends on the tool: ffmpeg gives PNG, xwd gives the X11
  // window dump. Asserting PNG unconditionally would fail on a machine that
  // only has xwd — where the code is behaving exactly as designed.
  const dir = mkdtempSync(join(tmpdir(), 'idm-shot-'));
  try {
    const asked = join(dir, 'window.png');
    const out = guiRun(['--own-display', '--screenshot', asked, '--selftest-display']);
    const r = JSON.parse(out.split('\n').find((l) => l.startsWith('DISPLAY-SELFTEST:')).slice(17));
    const expected = HAVE_FFMPEG ? asked : join(dir, 'window.xwd');
    assert.equal(r.shot, expected, `reported ${r.shot}, files: ${readdirSync(dir)}`);
    assert.ok(existsSync(expected), 'the screenshot file must exist');
    const bytes = readFileSync(expected);
    assert.ok(bytes.length > 0, 'the screenshot must not be empty');
    // PIL reads PNG, not the X11 window dump xwd writes, so the "is there a
    // window in this picture" check only applies to the ffmpeg branch.
    const n = colours(expected);
    assert.ok(n === null || n >= MIN_COLOURS,
      `the screenshot shows an empty display, not the window (${n} colours)`);
    if (HAVE_FFMPEG) {
      assert.deepEqual([...bytes.subarray(0, 8)],
        [0x89, 0x50, 0x4e, 0x47, 0x0d, 0x0a, 0x1a, 0x0a], 'not a PNG');
    }
  } finally {
    rmSync(dir, { recursive: true, force: true });
  }
});

test('the Xvfb it started does not outlive it', () => {
  // An orphaned X server per launch is the same class of leak as the orphaned
  // `idm --serve` that build_window()-first was introduced to prevent.
  //
  // Asserted on the PID, not on /tmp/.X11-unix/X<n>: that socket belongs to
  // whoever owns the display number, and a test running in parallel can own
  // the very number this run just released.
  const out = guiRun(['--own-display', '--selftest-display']);
  const r = JSON.parse(out.split('\n').find((l) => l.startsWith('DISPLAY-SELFTEST:')).slice(17));
  assert.ok(r.xvfb_pid > 0, `no Xvfb pid reported: ${JSON.stringify(r)}`);
  let alive = true;
  try {
    process.kill(r.xvfb_pid, 0);
  } catch {
    alive = false;
  }
  assert.ok(!alive, `Xvfb ${r.xvfb_pid} is still running, it was not reaped`);
});

test('losing the race for a display number costs a retry, not the launch', () => {
  // Two launches scanning /tmp/.X11-unix at the same moment pick the same
  // number, and the loser's Xvfb refuses to start — the display version of
  // the free_port() trap this repo already documents. The scan cannot see
  // that coming, so the recovery has to be in the starting, not the planning.
  //
  // Reproduced deterministically: an Xvfb that refuses :99 and is the real
  // one for anything else.
  const dir = mkdtempSync(join(tmpdir(), 'idm-xvfb-'));
  try {
    const fake = join(dir, 'Xvfb');
    const realXvfb = run('sh', ['-c', 'command -v Xvfb'], { encoding: 'utf8' }).trim();
    // Refuses whichever number it is asked for FIRST, then behaves. Keying on
    // a fixed :99 would make the test depend on 99 happening to be free.
    writeFileSync(fake,
      '#!/usr/bin/env bash\n'
      + `if [ ! -e "${join(dir, 'lost')}" ]; then\n`
      + `  touch "${join(dir, 'lost')}"\n`
      + `  echo "$1" > "${join(dir, 'refused')}"\n`
      + '  echo "Server is already active for display ${1#:}" >&2\n'
      + '  exit 1\n'
      + 'fi\n'
      + `exec ${realXvfb} "$@"\n`,
      { mode: 0o755 });
    const env = { ...process.env, PATH: `${dir}:${process.env.PATH}` };
    delete env.DISPLAY;
    delete env.XAUTHORITY;
    const out = run('python3', [guiPy, '--own-display', '--selftest-display'],
      { encoding: 'utf8', env, timeout: 90_000 });
    const r = JSON.parse(out.split('\n').find((l) => l.startsWith('DISPLAY-SELFTEST:')).slice(17));
    assert.equal(r.window, 'ok', `the window must still come up: ${out}`);
    const refused = readFileSync(join(dir, 'refused'), 'utf8').trim();
    assert.notEqual(r.display, refused, 'it must have moved on from the number that refused');
  } finally {
    rmSync(dir, { recursive: true, force: true });
  }
});



/**
 * Distinct colours in an image, or null when PIL is unavailable.
 *
 * A capture of a bare Xvfb is two colours — the black root window and the X
 * cursor — so "is there actually a window in this picture" is answerable
 * without comparing against a reference image.
 */
function colours(file) {
  try {
    const out = run('python3', ['-I', '-c',
      'import sys\nfrom PIL import Image\n'
      + 'im = Image.open(sys.argv[1]).convert("RGB")\n'
      + 'print(len(im.getcolors(maxcolors=500000) or []))', file], { encoding: 'utf8' });
    return parseInt(out.trim(), 10);
  } catch {
    return null;
  }
}
const MIN_COLOURS = 8;

test('the interactive run photographs the window, not an empty display',
  { skip: !HAVE_FFMPEG ? 'no ffmpeg to capture PNG with' : false }, async () => {
    // The screenshot in the interactive path used to be taken the instant
    // build_window() returned — before Tk had mapped or drawn anything — so
    // it reliably produced a black rectangle with a cursor in it. The
    // --selftest-display path never showed this because it calls update()
    // itself. Point this test at the real path.
    const dir = mkdtempSync(join(tmpdir(), 'idm-shot-live-'));
    const shot = join(dir, 'live.png');
    const env = { ...process.env };
    delete env.DISPLAY;
    delete env.XAUTHORITY;
    // Port 9 (discard) is the repo's "nobody is listening" port; the window
    // comes up regardless, which is all this is about.
    const proc = spawn('python3', [guiPy, '--own-display', '--screenshot', shot,
      '--addr', '127.0.0.1:9'], { env, stdio: ['ignore', 'pipe', 'pipe'] });
    try {
      const deadline = Date.now() + 90_000;
      while (Date.now() < deadline) {
        if (existsSync(shot) && readFileSync(shot).length > 0) break;
        if (proc.exitCode !== null) break;
        await new Promise((r) => setTimeout(r, 300));
      }
      assert.ok(existsSync(shot), 'no screenshot was written at all');
      const n = colours(shot);
      if (n === null) return; // PIL missing: the file exists, that is all we can say
      assert.ok(n >= MIN_COLOURS,
        `only ${n} colours: the capture happened before the window was drawn`);
    } finally {
      proc.kill('SIGTERM');
      await new Promise((r) => setTimeout(r, 500));
      if (proc.exitCode === null) proc.kill('SIGKILL');
      rmSync(dir, { recursive: true, force: true });
    }
  });


test('the screenshot waits for the queue, not just for the window',
  { skip: !HAVE_FFMPEG ? 'no ffmpeg to capture PNG with' : false }, async () => {
    // Photographing the moment the widgets exist catches the window BEFORE its
    // first poll, so --screenshot produced a picture of an empty list even
    // when the engine had a full queue. The fix is an ordering one, so that is
    // what this pins: by the time the file exists, the queue has been asked
    // for at least once.
    let asked = 0;
    const stub = createServer((req, res) => {
      if (req.url.startsWith('/api/items')) {
        asked += 1;
        // Hold the first answer long enough that a screenshot taken before it
        // cannot be mistaken for one taken after.
        const delay = asked === 1 ? 1500 : 0;
        return setTimeout(() => {
          res.writeHead(200, { 'Content-Type': 'application/json' });
          res.end(JSON.stringify({ items: [
            { id: 1, url: 'http://example.com/a.bin', output: '/tmp/a.bin',
              status: 'done', total: 1024, downloaded: 1024 },
          ] }));
        }, delay);
      }
      res.writeHead(404);
      res.end();
    });
    await new Promise((r) => stub.listen(0, '127.0.0.1', r));
    const addr = `127.0.0.1:${stub.address().port}`;

    const dir = mkdtempSync(join(tmpdir(), 'idm-shot-queue-'));
    const shot = join(dir, 'queue.png');
    const env = { ...process.env };
    delete env.DISPLAY;
    delete env.XAUTHORITY;
    const proc = spawn('python3', [guiPy, '--own-display', '--screenshot', shot,
      '--addr', addr, '--state-dir', dir], { env, stdio: ['ignore', 'pipe', 'pipe'] });
    try {
      let askedWhenShotAppeared = null;
      const deadline = Date.now() + 90_000;
      while (Date.now() < deadline) {
        if (existsSync(shot) && readFileSync(shot).length > 0) {
          askedWhenShotAppeared = asked;
          break;
        }
        if (proc.exitCode !== null) break;
        await new Promise((r) => setTimeout(r, 50));
      }
      assert.ok(existsSync(shot), 'no screenshot was written at all');
      assert.ok(askedWhenShotAppeared >= 1,
        'the screenshot was taken before the queue was ever fetched');
    } finally {
      proc.kill('SIGTERM');
      await new Promise((r) => setTimeout(r, 500));
      if (proc.exitCode === null) proc.kill('SIGKILL');
      stub.close();
      rmSync(dir, { recursive: true, force: true });
    }
  });

test('an X socket that was already there is not proof our Xvfb started', () => {
  // The port trap, one more face. start_display() waited for the SOCKET to
  // appear -- but when another launch already owns that number, the socket is
  // there from the first look, so the wait succeeds instantly while our own
  // Xvfb dies with "Server is already active". The window then connects to
  // somebody else's display and fails on Xauthority, which is far harder to
  // read than "that number is taken".
  //
  // The number is ours only while OUR child holds it.
  const r = py(`
import json, os, tempfile
d = tempfile.mkdtemp()
os.mkdir(os.path.join(d, ".X11-unix"))
# Somebody else's server is already on :77.
open(os.path.join(d, ".X11-unix", "X77"), "w").close()
plan = {"mode": "own", "display": ":77",
        "xvfb_argv": ["/bin/true"], "screenshot": None, "reason": ""}
try:
    g.start_display(plan, timeout=2.0, sock_dir=os.path.join(d, ".X11-unix"))
    out = {"raised": False}
except RuntimeError as e:
    out = {"raised": True, "message": str(e)}
print("R:" + json.dumps(out))
`);
  assert.ok(r.raised, 'a pre-existing socket must be refused, not taken for success');
});

test('start_display still accepts a display its own Xvfb opened', () => {
  const r = py(`
import json, os, tempfile
d = tempfile.mkdtemp()
sock = os.path.join(d, ".X11-unix")
os.mkdir(sock)
# A stand-in "Xvfb" that creates the socket and stays alive.
script = os.path.join(d, "fake")
open(script, "w").write(
    "#!/usr/bin/env bash\\ntouch '%s/X78'\\nsleep 30\\n" % sock)
os.chmod(script, 0o755)
plan = {"mode": "own", "display": ":78",
        "xvfb_argv": [script], "screenshot": None, "reason": ""}
proc = g.start_display(plan, timeout=10.0, sock_dir=sock)
out = {"started": proc is not None, "alive": proc.poll() is None}
g.stop_display(proc)
print("R:" + json.dumps(out))
`);
  assert.ok(r.started, 'our own Xvfb must still be accepted');
  assert.ok(r.alive, 'and it must be the live process we return');
});
