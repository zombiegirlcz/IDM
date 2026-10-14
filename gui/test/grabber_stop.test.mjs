// "Stop Exploring" in the Grabber could not be wired at all: crawl_site() ran
// synchronously on the Tk thread, so the window was frozen for the whole crawl
// and there was no moment at which a click could be delivered. The crawl now
// takes a stop callback, and the dialog runs it off the Tk thread.
//
// The site is served by a separate `python3 -m http.server` process on
// purpose: an inline node:http server cannot answer while execFileSync blocks
// this process's event loop.
//
// Runs with: node --test gui/test/grabber_stop.test.mjs

import test from 'node:test';
import assert from 'node:assert/strict';
import { mkdtempSync, writeFileSync } from 'node:fs';
import { execFileSync, spawn } from 'node:child_process';
import { fileURLToPath } from 'node:url';
import { dirname, join } from 'node:path';
import { tmpdir } from 'node:os';
import { createServer, connect } from 'node:net';

const here = dirname(fileURLToPath(import.meta.url));
const guiDir = join(here, '..');

function freePort() {
  return new Promise((resolve, reject) => {
    const s = createServer();
    s.on('error', reject);
    s.listen(0, '127.0.0.1', () => {
      const { port } = s.address();
      s.close(() => resolve(port));
    });
  });
}

function waitTcp(host, port, timeoutMs = 10000) {
  const deadline = Date.now() + timeoutMs;
  return new Promise((resolve, reject) => {
    const attempt = () => {
      const sock = connect({ host, port });
      sock.once('connect', () => { sock.destroy(); resolve(); });
      sock.once('error', () => {
        sock.destroy();
        if (Date.now() > deadline) reject(new Error(`no TCP listener on ${host}:${port}`));
        else setTimeout(attempt, 150);
      });
    };
    attempt();
  });
}

/** index.html -> four pages, each carrying one .zip. */
function makeSite() {
  const dir = mkdtempSync(join(tmpdir(), 'idm_grab_'));
  const pages = [1, 2, 3, 4];
  writeFileSync(
    join(dir, 'index.html'),
    pages.map((n) => `<a href="/p${n}.html">p${n}</a>`).join(' '),
  );
  for (const n of pages) {
    writeFileSync(join(dir, `p${n}.html`), `<a href="/f${n}.zip">f${n}</a>`);
    writeFileSync(join(dir, `f${n}.zip`), 'ZIP');
  }
  return dir;
}

function py(snippet) {
  const code = `
import sys, json
sys.path.insert(0, ${JSON.stringify(guiDir)})
import idm_gui as g
${snippet}
`;
  const out = execFileSync('python3', ['-I', '-c', code], { encoding: 'utf8' });
  const line = out.split('\n').find((l) => l.startsWith('R:'));
  assert.ok(line, `no R: line in output:\n${out}`);
  return JSON.parse(line.slice(2));
}

test('a stop request ends the crawl early', async () => {
  const dir = makeSite();
  const port = await freePort();
  const srv = spawn('python3', ['-m', 'http.server', String(port)],
    { cwd: dir, stdio: 'ignore' });
  try {
    await waitTcp('127.0.0.1', port);
    const r = py(`
base = "http://127.0.0.1:${port}/"
calls = {"n": 0}

def stop_after_one():
    calls["n"] += 1
    return calls["n"] > 1

stopped = g.crawl_site(base, max_pages=50, file_exts=["zip"],
                       should_stop=stop_after_one)
full = g.crawl_site(base, max_pages=50, file_exts=["zip"])
print("R:" + json.dumps({"stopped": stopped, "full": full}))
`);
    assert.ok(r.full.length >= 4, `full crawl should find the files, got ${r.full}`);
    assert.ok(
      r.stopped.length < r.full.length,
      `stopping must cut the crawl short: stopped=${r.stopped} full=${r.full}`,
    );
  } finally {
    srv.kill();
  }
});

test('no stop callback behaves exactly as before', async () => {
  const dir = makeSite();
  const port = await freePort();
  const srv = spawn('python3', ['-m', 'http.server', String(port)],
    { cwd: dir, stdio: 'ignore' });
  try {
    await waitTcp('127.0.0.1', port);
    const r = py(`
base = "http://127.0.0.1:${port}/"
a = g.crawl_site(base, max_pages=50, file_exts=["zip"])
b = g.crawl_site(base, max_pages=50, file_exts=["zip"], should_stop=None)
print("R:" + json.dumps({"a": a, "b": b}))
`);
    assert.ok(r.a.length >= 4, `the crawl must find the files, got ${r.a}`);
    assert.deepEqual(r.a, r.b);
  } finally {
    srv.kill();
  }
});
