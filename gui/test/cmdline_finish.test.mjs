// IDM's /q and /h: what happens once the command-line download is finished.
//
// Both used to be parsed and then reported on stderr as unimplemented. /q must
// close the window when the queue drains; /h runs the "hang up" command from
// the settings, which is the only sensible modern reading of dropping a dial-up
// link -- and with nothing configured it has to say so rather than pretend.
//
// Runs with: node --test gui/test/cmdline_finish.test.mjs

import test from 'node:test';
import assert from 'node:assert/strict';
import { execFileSync } from 'node:child_process';
import { fileURLToPath } from 'node:url';
import { dirname, join } from 'node:path';

const here = dirname(fileURLToPath(import.meta.url));
const guiPy = join(here, '..', 'idm_gui.py');

function call(snippet) {
  const out = execFileSync(
    'python3',
    [
      '-I',
      '-c',
      `import importlib.util, json\n` +
        `spec = importlib.util.spec_from_file_location("g", ${JSON.stringify(guiPy)})\n` +
        `g = importlib.util.module_from_spec(spec)\n` +
        `spec.loader.exec_module(g)\n` +
        snippet,
    ],
    { encoding: 'utf8' },
  );
  return JSON.parse(out.trim().split('\n').pop());
}

const ITEMS = JSON.stringify([
  { id: 1, status: 'done' },
  { id: 2, status: 'error' },
]);
const BUSY = JSON.stringify([
  { id: 1, status: 'done' },
  { id: 2, status: 'running' },
]);

test('the queue counts as drained only when nothing is live', () => {
  const r = call(
    `print(json.dumps({"drained": g.queue_drained(json.loads(${JSON.stringify(ITEMS)})),` +
      ` "busy": g.queue_drained(json.loads(${JSON.stringify(BUSY)})),` +
      ` "empty": g.queue_drained([])}))`,
  );
  // A failed download is finished too: /q must not hang forever on an error.
  assert.equal(r.drained, true);
  assert.equal(r.busy, false);
  assert.equal(r.empty, true);
});

test('/q asks for a quit once the queue drains, and not before', () => {
  const r = call(
    `cmd = {"exit_when_done": True, "hang_up": False}\n` +
      `s = g.DEFAULT_SETTINGS\n` +
      `print(json.dumps({\n` +
      `  "after": g.completion_action(cmd, json.loads(${JSON.stringify(ITEMS)}), s),\n` +
      `  "during": g.completion_action(cmd, json.loads(${JSON.stringify(BUSY)}), s),\n` +
      `}))`,
  );
  assert.equal(r.after.quit, true);
  assert.equal(r.during.quit, false);
  assert.equal(r.after.run, '');
});

test('/h runs the configured hang-up command, and reports when there is none', () => {
  const r = call(
    `import copy\n` +
      `cmd = {"exit_when_done": False, "hang_up": True}\n` +
      `configured = copy.deepcopy(g.DEFAULT_SETTINGS)\n` +
      `configured["downloads"]["hangup_command"] = "nmcli radio wifi off"\n` +
      `print(json.dumps({\n` +
      `  "configured": g.completion_action(cmd, json.loads(${JSON.stringify(ITEMS)}), configured),\n` +
      `  "unset": g.completion_action(cmd, json.loads(${JSON.stringify(ITEMS)}), g.DEFAULT_SETTINGS),\n` +
      `}))`,
  );
  assert.equal(r.configured.run, 'nmcli radio wifi off');
  // Hanging up does not imply quitting.
  assert.equal(r.configured.quit, false);
  assert.equal(r.unset.run, '');
  assert.match(r.unset.note || '', /hang|command/i, 'an unset command must explain itself');
});

test('neither flag means nothing happens', () => {
  const r = call(
    `cmd = {"exit_when_done": False, "hang_up": False}\n` +
      `print(json.dumps(g.completion_action(cmd, json.loads(${JSON.stringify(ITEMS)}), g.DEFAULT_SETTINGS)))`,
  );
  assert.equal(r.quit, false);
  assert.equal(r.run, '');
});

test('the settings carry a hangup_command key', () => {
  const r = call(
    `print(json.dumps({"has": "hangup_command" in g.DEFAULT_SETTINGS["downloads"]}))`,
  );
  assert.equal(r.has, true, 'DEFAULT_SETTINGS.downloads must define hangup_command');
});

// --- the window actually acts on them ------------------------------------- //

test('/q closes the window once the download it started has finished', async () => {
  const { spawn, execFileSync: exec } = await import('node:child_process');
  const { createServer } = await import('node:http');
  const { mkdtempSync, existsSync } = await import('node:fs');
  const { tmpdir } = await import('node:os');

  const engine = [
    process.env.IDM_ENGINE_BIN,
    join(here, '..', '..', 'engine/target/release/idm'),
    join(here, '..', '..', 'engine/target/debug/idm'),
  ].filter(Boolean).find((p) => existsSync(p));
  assert.ok(engine, 'engine binary not found');

  const data = Buffer.alloc(40_000, 7);
  const origin = createServer((req, res) => {
    res.writeHead(200, { 'Content-Length': data.length, 'Accept-Ranges': 'bytes' });
    res.end(data);
  });
  await new Promise((r) => origin.listen(0, '127.0.0.1', r));
  const url = `http://127.0.0.1:${origin.address().port}/f.bin`;

  const outDir = mkdtempSync(join(tmpdir(), 'idm_q_out_'));
  const stateDir = mkdtempSync(join(tmpdir(), 'idm_q_state_'));

  // --autostart brings its own engine up, so this is the real command line a
  // file association would produce: /d URL /q.
  const child = spawn(
    'xvfb-run',
    ['-a', 'python3', guiPy, '--engine', engine, '--out-dir', outDir,
     '--state-dir', stateDir, '--autostart', '/d', url, '/q'],
    { stdio: ['ignore', 'pipe', 'pipe'] },
  );
  let err = '';
  child.stdout.on('data', () => {});
  child.stderr.on('data', (d) => (err += d));

  const code = await new Promise((resolve, reject) => {
    const timer = setTimeout(() => {
      child.kill('SIGKILL');
      reject(new Error(`/q did not close the window within 60 s:\n${err}`));
    }, 60000);
    child.on('exit', (c) => {
      clearTimeout(timer);
      resolve(c);
    });
  });
  origin.close();

  assert.equal(code, 0, `the GUI must exit cleanly, got ${code}:\n${err}`);
  assert.doesNotMatch(err, /not implemented/i, '/q must no longer report itself unimplemented');
});
