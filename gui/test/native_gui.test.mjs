// Tests for the native desktop GUI (`gui/idm_gui.py`).
//
// The GUI is a Tkinter window talking to the `idm --serve` HTTP API. Testing a
// real window is flaky, so the script has two self-test modes:
//
//   --selftest-api     : exercises the API client against a real `idm --serve`
//                        (add a download, watch it finish, verify the file),
//                        printing machine-readable markers. No display needed.
//   --selftest-window  : actually builds the Tk window (needs a display, run
//                        under xvfb-run) and exits 0 if it constructs cleanly.
//
// We run both here so "the GUI works" means something concrete.
//
// Runs with: node --test gui/test/native_gui.test.mjs

import test from 'node:test';
import assert from 'node:assert/strict';
import { readFileSync, existsSync, mkdtempSync } from 'node:fs';
import { execFileSync, spawn } from 'node:child_process';
import { createServer, request } from 'node:http';
import { fileURLToPath } from 'node:url';
import { dirname, join } from 'node:path';
import { tmpdir } from 'node:os';
import { randomBytes } from 'node:crypto';
import zlib from 'node:zlib';

const here = dirname(fileURLToPath(import.meta.url));
const guiDir = join(here, '..');
const repoRoot = join(guiDir, '..');
const guiPy = join(guiDir, 'idm_gui.py');

function findEngine() {
  const candidates = [
    process.env.IDM_ENGINE_BIN,
    join(repoRoot, 'engine/target/release/idm'),
    join(repoRoot, 'engine/target/debug/idm'),
  ].filter(Boolean);
  for (const c of candidates) if (existsSync(c)) return c;
  throw new Error(`idm engine not found; looked in:\n  ${candidates.join('\n  ')}`);
}

function makeData(len) {
  const buf = Buffer.allocUnsafe(len);
  for (let i = 0; i < len; i++) buf[i] = (Math.imul(i >>> 0, 2654435761) >>> 13) & 0xff;
  return buf;
}

function crc32(buf) {
  return (zlib.crc32(buf) >>> 0).toString(16).padStart(8, '0');
}

/** Range-capable origin, like the other suites. */
function startOrigin(data) {
  const server = createServer((req, res) => {
    const total = data.length;
    const range = req.headers.range;
    if (req.method === 'HEAD') {
      res.writeHead(200, {
        'Content-Length': total,
        'Accept-Ranges': 'bytes',
        ETag: '"e"',
      });
      res.end();
      return;
    }
    if (range) {
      const m = /bytes=(\d+)-(\d*)/.exec(range);
      const a = parseInt(m[1], 10);
      const b = m[2] ? parseInt(m[2], 10) : total - 1;
      const slice = data.subarray(a, b + 1);
      res.writeHead(206, {
        'Content-Length': slice.length,
        'Content-Range': `bytes ${a}-${b}/${total}`,
        'Accept-Ranges': 'bytes',
      });
      res.end(slice);
      return;
    }
    res.writeHead(200, { 'Content-Length': total, 'Accept-Ranges': 'bytes', ETag: '"e"' });
    res.end(data);
  });
  return new Promise((resolve) => {
    server.listen(0, '127.0.0.1', () => {
      const { port } = server.address();
      resolve({ server, url: `http://127.0.0.1:${port}` });
    });
  });
}

function freePort() {
  return new Promise((resolve) => {
    const s = createServer();
    s.listen(0, '127.0.0.1', () => {
      const { port } = s.address();
      s.close(() => resolve(port));
    });
  });
}

test('idm_gui.py exists and is valid Python', () => {
  assert.ok(existsSync(guiPy), `missing ${guiPy}`);
  // py_compile via python3 -m py_compile
  execFileSync('python3', ['-m', 'py_compile', guiPy], { stdio: 'pipe' });
});

test('spawned engine stays headless on Windows (no console window)', () => {
  // The engine is an internal backend. If it is spawned without
  // CREATE_NO_WINDOW, Windows shows a console window next to the GUI. We can
  // not run Windows here, so assert on the source that the flags are set.
  const py = readFileSync(guiPy, 'utf8');
  const fn = py.slice(py.indexOf('def spawn_server'), py.indexOf('def wait_alive'));
  assert.match(fn, /os\.name == "nt"/, 'must special-case Windows');
  assert.match(fn, /CREATE_NO_WINDOW/, 'must use CREATE_NO_WINDOW on Windows');
  assert.match(fn, /DETACHED_PROCESS/, 'must detach from the parent process');
  assert.match(fn, /creationflags/, 'must pass creationflags to Popen');
  assert.match(fn, /start_new_session/, 'must detach on POSIX too');
});

test('API client drives a real download through idm --serve', async () => {
  const engine = findEngine();
  const data = makeData(800_000);
  const { server, url } = await startOrigin(data);
  const outDir = mkdtempSync(join(tmpdir(), 'idm_gui_out_'));
  const stateDir = mkdtempSync(join(tmpdir(), 'idm_gui_state_'));
  const port = await freePort();
  const addr = `127.0.0.1:${port}`;

  const srv = spawn(engine, [
    '--serve',
    addr,
    '--output-dir',
    outDir,
    '--state-dir',
    stateDir,
  ]);
  srv.stdout.on('data', () => {});
  srv.stderr.on('data', () => {});

  try {
    // Wait for readiness.
    const deadline = Date.now() + 15000;
    // eslint-disable-next-line no-constant-condition
    while (true) {
      try {
        await new Promise((res, rej) => {
          const req = request(
            { host: '127.0.0.1', port, path: '/api/items', method: 'GET' },
            (r) => {
              r.resume();
              res();
            },
          );
          req.on('error', rej);
          req.end();
        });
        break;
      } catch {
        if (Date.now() > deadline) throw new Error('idm --serve never came up');
        await new Promise((r) => setTimeout(r, 150));
      }
    }

    // IMPORTANT: run the selftest asynchronously. execFileSync would block this
    // process's event loop, and the origin server lives in this very process —
    // a blocked loop means the engine can never download anything.
    const stdout = await new Promise((resolve, reject) => {
      const py = spawn('python3', [
        guiPy,
        '--selftest-api',
        '--addr',
        addr,
        // The engine writes its API token into STATE_DIR/api-token; the client
        // reads it from there, so the state dir has to be passed along.
        '--state-dir',
        stateDir,
        '--url',
        `${url}/file.bin`,
      ], { env: { ...process.env, IDM_ENGINE_BIN: engine } });
      let out = '';
      let err = '';
      py.stdout.on('data', (d) => (out += d.toString()));
      py.stderr.on('data', (d) => (err += d.toString()));
      py.on('error', reject);
      py.on('close', (code) =>
        code === 0 ? resolve(out) : reject(new Error(`selftest-api exit ${code}\n${out}\n${err}`)),
      );
    });

    assert.match(stdout, /SELFTEST-API: added id=\d+/, `add marker missing:\n${stdout}`);
    assert.match(stdout, /SELFTEST-API: done\b/, `done marker missing:\n${stdout}`);
    assert.match(stdout, /SELFTEST-API: OK\b/, `ok marker missing:\n${stdout}`);

    const file = join(outDir, 'file.bin');
    assert.ok(existsSync(file), `downloaded file missing: ${file}`);
    const got = readFileSync(file);
    assert.equal(got.length, data.length, 'size mismatch');
    assert.equal(crc32(got), crc32(data), 'crc mismatch via native GUI client');
  } finally {
    srv.kill();
    server.close();
  }
});

test('Tk window builds under a real display (xvfb-run)', () => {
  // This actually constructs the Tk root + widgets; exits 0 if it succeeds.
  const out = execFileSync('xvfb-run', ['-a', 'python3', guiPy, '--selftest-window'], {
    encoding: 'utf8',
    env: { ...process.env },
  });
  assert.match(out, /SELFTEST-WINDOW: OK/, `window selftest failed:\n${out}`);
});