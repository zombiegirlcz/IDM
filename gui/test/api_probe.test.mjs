// Api.probe() has to tell "nobody is there" apart from "somebody is there who
// is not ours". alive() cannot: it catches every exception and returns False,
// so a 403 from a stranger holding the port reads as a free port -- which is
// how the GUI ended up spawning an engine that died with "address in use" and
// then talking to the stranger anyway.
//
// The server is a separate process on purpose: an inline node:http server
// cannot answer while execFileSync blocks this file's event loop (a trap this
// project has already paid for).
//
// Runs with: node --test gui/test/api_probe.test.mjs

import test from 'node:test';
import assert from 'node:assert/strict';
import { execFileSync, spawn } from 'node:child_process';
import { connect } from 'node:net';
import { fileURLToPath } from 'node:url';
import { dirname, join } from 'node:path';

const here = dirname(fileURLToPath(import.meta.url));
const guiPy = join(here, '..', 'idm_gui.py');

function probe(addr, token) {
  const out = execFileSync('python3', [
    '-I', '-c',
    `import importlib.util, json\n` +
      `spec = importlib.util.spec_from_file_location("g", ${JSON.stringify(guiPy)})\n` +
      `g = importlib.util.module_from_spec(spec)\n` +
      `spec.loader.exec_module(g)\n` +
      `api = g.Api(${JSON.stringify(addr)}, timeout=3.0, token=${JSON.stringify(token)})\n` +
      `print(json.dumps(api.probe()))`,
  ], { encoding: 'utf8' });
  return JSON.parse(out);
}

// A stand-in engine: 200 for the right token, 403 for anything else -- the
// engine's own behaviour, which is what produced the 403 on the real machine.
const SERVER_PY = `
import sys, json
from http.server import BaseHTTPRequestHandler, HTTPServer
TOKEN = sys.argv[1]
class H(BaseHTTPRequestHandler):
    def do_GET(self):
        body = b'{"items":[]}'
        if self.headers.get('X-IDM-Token') != TOKEN:
            body = b'{"ok":false,"error":"missing or invalid X-IDM-Token"}'
            self.send_response(403)
        else:
            self.send_response(200)
        self.send_header('Content-Type', 'application/json')
        self.send_header('Content-Length', str(len(body)))
        self.end_headers()
        self.wfile.write(body)
    def log_message(self, *a):
        pass
# Port 0: the OS picks one and we announce it. A hard-coded port is the
# mistake this project has already paid for -- a parallel test can own it,
# and then either the bind fails or somebody else answers our questions.
srv = HTTPServer(('127.0.0.1', 0), H)
print(srv.server_address[1], flush=True)
srv.serve_forever()
`;

/** Start the stand-in engine and wait for it to announce its port. */
function startServer(token) {
  const srv = spawn('python3', ['-I', '-c', SERVER_PY, token],
    { stdio: ['ignore', 'pipe', 'ignore'] });
  return new Promise((resolve, reject) => {
    let buf = '';
    const timer = setTimeout(() => {
      srv.kill('SIGKILL');
      reject(new Error('the stand-in server never announced a port'));
    }, 20000);
    srv.stdout.on('data', (chunk) => {
      buf += chunk;
      const m = buf.match(/(\d+)\s/);
      if (m) {
        clearTimeout(timer);
        resolve({ srv, port: Number(m[1]) });
      }
    });
    srv.on('exit', (code) => {
      clearTimeout(timer);
      reject(new Error(`the stand-in server exited with ${code}`));
    });
  });
}

function waitTcp(port, ms = 8000) {
  const deadline = Date.now() + ms;
  return new Promise((resolve, reject) => {
    const tick = () => {
      const s = connect(port, '127.0.0.1');
      s.on('connect', () => { s.destroy(); resolve(); });
      s.on('error', () => {
        s.destroy();
        if (Date.now() > deadline) reject(new Error('server never came up'));
        else setTimeout(tick, 100);
      });
    };
    tick();
  });
}

test('a port nobody is listening on is not listening', () => {
  // Port 9 (discard) rather than a "free" port: a free port can be taken by a
  // parallel test and then answer with real data.
  const p = probe('127.0.0.1:9', 'whatever');
  assert.equal(p.listening, false);
  assert.equal(p.authorized, false);
});

test('our own token gets an authorized answer', async () => {
  const { srv, port } = await startServer('goodtoken');
  try {
    await waitTcp(port);
    const p = probe(`127.0.0.1:${port}`, 'goodtoken');
    assert.deepEqual(p, { listening: true, authorized: true });
  } finally {
    srv.kill('SIGKILL');
  }
});

test('a stranger that refuses the token is listening but not authorized', async () => {
  // THE BUG, reproduced: this is the state the user's machine was in.
  const { srv, port } = await startServer('someoneelsestoken');
  try {
    await waitTcp(port);
    const p = probe(`127.0.0.1:${port}`, 'ourtoken');
    assert.equal(p.listening, true,
      'a 403 proves somebody is there -- that is the whole point');
    assert.equal(p.authorized, false);
  } finally {
    srv.kill('SIGKILL');
  }
});

// --- what probe() does with each kind of failure ----------------------------
//
// probe() decides "is anybody listening" from the exception urlopen raises,
// and getting that wrong is worse than not probing at all: a timeout
// misreported as "somebody is listening" makes the GUI abandon the port and
// never start an engine, which is a window that downloads nothing.
//
// The cases differ by platform -- a connection to a dead port is refused
// quickly on Linux and can time out on Windows -- so each is forced here
// rather than hoping the host produces it.

function probeRaising(exc) {
  const out = execFileSync('python3', ['-I', '-c',
    `import importlib.util, json, urllib.request, urllib.error\n` +
      `spec = importlib.util.spec_from_file_location("g", ${JSON.stringify(guiPy)})\n` +
      `g = importlib.util.module_from_spec(spec)\n` +
      `spec.loader.exec_module(g)\n` +
      `def boom(*a, **k):\n    raise ${exc}\n` +
      `urllib.request.urlopen = boom\n` +
      `api = g.Api("127.0.0.1:1", token="t")\n` +
      `print(json.dumps(api.probe()))`,
  ], { encoding: 'utf8' });
  return JSON.parse(out);
}

test('a connection timeout is nobody listening, not a stranger', () => {
  // THE WINDOWS BUG. socket timeouts surface as TimeoutError, which is an
  // OSError and NOT a URLError, so it fell through to the catch-all and was
  // reported as "listening". The GUI then walked off to another port looking
  // for a server that was never there, and started no engine at all.
  const p = probeRaising('TimeoutError("timed out")');
  assert.equal(p.listening, false,
    'a timeout means nothing answered, so the port is still ours to use');
});

test('a refused connection is nobody listening', () => {
  const p = probeRaising('ConnectionRefusedError(111, "refused")');
  assert.equal(p.listening, false);
});

test('a reset connection is nobody listening', () => {
  // Windows produces this where Linux refuses outright.
  const p = probeRaising('ConnectionResetError(104, "reset")');
  assert.equal(p.listening, false);
});

test('a host that cannot be reached is nobody listening', () => {
  const p = probeRaising('OSError(113, "no route to host")');
  assert.equal(p.listening, false);
});

test('a 403 is still a stranger', () => {
  const p = probeRaising(
    'urllib.error.HTTPError("http://x/", 403, "Forbidden", {}, None)');
  assert.deepEqual(p, { listening: true, authorized: false });
});

test('a 500 is ours, just unhappy', () => {
  // An engine that answers at all is our engine; only an auth refusal says
  // the server belongs to somebody else.
  const p = probeRaising(
    'urllib.error.HTTPError("http://x/", 500, "Server Error", {}, None)');
  assert.deepEqual(p, { listening: true, authorized: true });
});

test('garbage that is not HTTP counts as occupied', () => {
  // Something is on the port and it is not an engine; refusing to fight over
  // it is the safe reading.
  const p = probeRaising('ValueError("not json")');
  assert.deepEqual(p, { listening: true, authorized: false });
});
