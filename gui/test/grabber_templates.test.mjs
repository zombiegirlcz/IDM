// Roadmap item 4, piece 1: the Grabber's "Project template" combobox was pure
// decoration -- explore() read the file-type box and never looked at the
// template. Each template now carries its own file-type filter, and picking
// one changes what the crawl collects.
//
// The site is served by a separate `python3 -m http.server` process: an
// inline node:http server cannot answer while execFileSync blocks this
// process's event loop.
//
// Runs with: node --test gui/test/grabber_templates.test.mjs

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

/** One page carrying one file of each kind. */
function makeSite() {
  const dir = mkdtempSync(join(tmpdir(), 'idm_tmpl_'));
  writeFileSync(join(dir, 'index.html'), `
    <a href="/pic.jpg">pic</a>
    <a href="/clip.mp4">clip</a>
    <a href="/song.mp3">song</a>
    <a href="/bundle.zip">bundle</a>
  `);
  for (const f of ['pic.jpg', 'clip.mp4', 'song.mp3', 'bundle.zip']) {
    writeFileSync(join(dir, f), 'DATA');
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

test('every template offered by the combobox has a file-type filter', () => {
  const r = py(`
names = g.grabber_template_names()
exts = {n: g.grabber_template_exts(n) for n in names}
print("R:" + json.dumps({"names": names, "exts": exts}))
`);
  for (const want of ['All files', 'Images', 'Video', 'Audio', 'Archives']) {
    assert.ok(r.names.includes(want), `template missing: ${want} (got ${r.names})`);
    assert.ok(r.exts[want].length > 0, `${want} has no file types`);
  }
  assert.ok(r.exts.Images.includes('jpg'));
  assert.ok(!r.exts.Images.includes('mp4'));
  assert.ok(r.exts.Video.includes('mp4'));
  assert.ok(r.exts.Audio.includes('mp3'));
  assert.ok(r.exts.Archives.includes('zip'));
  // "All files" is the union: it must cover the narrower templates.
  for (const e of ['jpg', 'mp4', 'mp3', 'zip']) {
    assert.ok(r.exts['All files'].includes(e), `All files should cover ${e}`);
  }
});

test('a template overrides the file-type box, "custom" keeps it', () => {
  const r = py(`
print("R:" + json.dumps({
  "images": g.grabber_crawl_exts("Images", "zip rar"),
  "custom": g.grabber_crawl_exts("custom", "zip rar"),
  "unknown": g.grabber_crawl_exts("whatever", "zip rar"),
}))
`);
  assert.ok(r.images.includes('jpg') && !r.images.includes('zip'));
  assert.deepEqual(r.custom, ['zip', 'rar']);
  assert.deepEqual(r.unknown, ['zip', 'rar']);
});

test('the chosen template changes what the dialog actually explores', async () => {
  const dir = makeSite();
  const port = await freePort();
  const srv = spawn('python3', ['-m', 'http.server', String(port)],
    { cwd: dir, stdio: 'ignore' });
  try {
    await waitTcp('127.0.0.1', port);
    const base = `http://127.0.0.1:${port}/`;
    const run = (template) => {
      const out = execFileSync('xvfb-run', ['-a', 'python3', script,
        '--selftest-grabber-explore', '--url', base,
        '--grabber-template', template], { encoding: 'utf8' });
      const line = out.split('\n').find((l) => l.startsWith('GRAB:'));
      assert.ok(line, `no GRAB: line in output:\n${out}`);
      return JSON.parse(line.slice(5));
    };
    const images = run('Images');
    assert.deepEqual(images.map((u) => u.split('/').pop()), ['pic.jpg']);
    const audio = run('Audio');
    assert.deepEqual(audio.map((u) => u.split('/').pop()), ['song.mp3']);
    const all = run('All files');
    assert.deepEqual(all.map((u) => u.split('/').pop()).sort(),
      ['bundle.zip', 'clip.mp4', 'pic.jpg', 'song.mp3']);
  } finally {
    srv.kill();
  }
});
