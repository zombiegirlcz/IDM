// Roadmap item 4, piece 2: link depth, counted separately for the site the
// crawl started on and for the sites it wanders off to. Before this the crawl
// only had a page budget, so "one level deep" was impossible to ask for and
// leaving the start site was all-or-nothing.
//
// Two separate `python3 -m http.server` processes stand in for two sites (a
// different port is a different netloc). An inline node:http server cannot
// answer while execFileSync blocks this process's event loop.
//
// Runs with: node --test gui/test/grabber_depth.test.mjs

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
const script = join(guiDir, 'idm_gui.py');

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

/** site A: index -> a1 -> a2, one zip per page, plus a link to site B. */
function makeA(portB) {
  const dir = mkdtempSync(join(tmpdir(), 'idm_depth_a_'));
  writeFileSync(join(dir, 'index.html'),
    `<a href="/a0.zip">a0</a> <a href="/a1.html">a1</a>
     <a href="http://127.0.0.1:${portB}/index.html">other site</a>`);
  writeFileSync(join(dir, 'a1.html'), '<a href="/a1.zip">a1z</a> <a href="/a2.html">a2</a>');
  writeFileSync(join(dir, 'a2.html'), '<a href="/a2.zip">a2z</a>');
  for (const f of ['a0.zip', 'a1.zip', 'a2.zip']) writeFileSync(join(dir, f), 'Z');
  return dir;
}

/** site B: index -> b1, one zip per page. */
function makeB() {
  const dir = mkdtempSync(join(tmpdir(), 'idm_depth_b_'));
  writeFileSync(join(dir, 'index.html'), '<a href="/b0.zip">b0</a> <a href="/b1.html">b1</a>');
  writeFileSync(join(dir, 'b1.html'), '<a href="/b1.zip">b1z</a>');
  for (const f of ['b0.zip', 'b1.zip']) writeFileSync(join(dir, f), 'Z');
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

const names = (urls) => urls.map((u) => u.split('/').pop()).sort();

async function withSites(fn) {
  const portA = await freePort();
  const portB = await freePort();
  const dirB = makeB();
  const dirA = makeA(portB);
  const srvA = spawn('python3', ['-m', 'http.server', String(portA)],
    { cwd: dirA, stdio: 'ignore' });
  const srvB = spawn('python3', ['-m', 'http.server', String(portB)],
    { cwd: dirB, stdio: 'ignore' });
  try {
    await waitTcp('127.0.0.1', portA);
    await waitTcp('127.0.0.1', portB);
    await fn(`http://127.0.0.1:${portA}/`, `http://127.0.0.1:${portB}/`);
  } finally {
    srvA.kill();
    srvB.kill();
  }
}

test('depth on the own site limits how far the crawl follows links', async () => {
  await withSites(async (baseA) => {
    const r = py(`
base = ${JSON.stringify(baseA)}
print("R:" + json.dumps({
  "d0": g.crawl_site(base, file_exts=["zip"], max_depth=0),
  "d1": g.crawl_site(base, file_exts=["zip"], max_depth=1),
  "d2": g.crawl_site(base, file_exts=["zip"], max_depth=2),
  "open": g.crawl_site(base, file_exts=["zip"]),
}))
`);
    assert.deepEqual(names(r.d0), ['a0.zip']);
    assert.deepEqual(names(r.d1), ['a0.zip', 'a1.zip']);
    assert.deepEqual(names(r.d2), ['a0.zip', 'a1.zip', 'a2.zip']);
    // No depth given keeps the old behaviour: follow as far as the page budget.
    assert.deepEqual(names(r.open), ['a0.zip', 'a1.zip', 'a2.zip']);
  });
});

test('external depth is counted on its own', async () => {
  await withSites(async (baseA) => {
    const r = py(`
base = ${JSON.stringify(baseA)}
print("R:" + json.dumps({
  "none": g.crawl_site(base, file_exts=["zip"], same_site_only=False,
                       external_depth=0),
  "one": g.crawl_site(base, file_exts=["zip"], same_site_only=False,
                      external_depth=1),
  "two": g.crawl_site(base, file_exts=["zip"], same_site_only=False,
                      external_depth=2),
  "own_only": g.crawl_site(base, file_exts=["zip"], same_site_only=True,
                           external_depth=5),
}))
`);
    // external_depth=0: the other site's pages are never opened.
    assert.deepEqual(names(r.none), ['a0.zip', 'a1.zip', 'a2.zip']);
    // one hop off-site: its index is read, its deeper page is not.
    assert.deepEqual(names(r.one), ['a0.zip', 'a1.zip', 'a2.zip', 'b0.zip']);
    assert.deepEqual(names(r.two), ['a0.zip', 'a1.zip', 'a2.zip', 'b0.zip', 'b1.zip']);
    // "current site only" still wins over any external depth.
    assert.deepEqual(names(r.own_only), ['a0.zip', 'a1.zip', 'a2.zip']);
  });
});

test('the dialog depth boxes are what the crawl obeys', async () => {
  await withSites(async (baseA) => {
    const run = (args) => {
      const out = execFileSync('xvfb-run', ['-a', 'python3', script,
        '--selftest-grabber-explore', '--url', baseA,
        '--grabber-template', 'Archives', ...args], { encoding: 'utf8' });
      const line = out.split('\n').find((l) => l.startsWith('GRAB:'));
      assert.ok(line, `no GRAB: line in output:\n${out}`);
      return JSON.parse(line.slice(5));
    };
    assert.deepEqual(names(run(['--grabber-depth', '0'])), ['a0.zip']);
    assert.deepEqual(
      names(run(['--grabber-depth', '1', '--grabber-external-depth', '1',
        '--grabber-all-sites'])),
      ['a0.zip', 'a1.zip', 'b0.zip'],
    );
  });
});
