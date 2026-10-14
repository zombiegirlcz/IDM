// Roadmap item 4, piece 3: include/exclude filters for the crawl. The file
// type was the only thing that could narrow a crawl, so "everything under
// /docs/ but not the drafts" was not expressible.
//
// The site is served by a separate `python3 -m http.server` process: an
// inline node:http server cannot answer while execFileSync blocks this
// process's event loop.
//
// Runs with: node --test gui/test/grabber_filters.test.mjs

import test from 'node:test';
import assert from 'node:assert/strict';
import { mkdirSync, mkdtempSync, writeFileSync } from 'node:fs';
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

/** /docs/{guide,draft}.zip and /bin/tool.zip, all linked from the index. */
function makeSite() {
  const dir = mkdtempSync(join(tmpdir(), 'idm_filt_'));
  mkdirSync(join(dir, 'docs'));
  mkdirSync(join(dir, 'bin'));
  writeFileSync(join(dir, 'index.html'), `
    <a href="/docs/guide.zip">guide</a>
    <a href="/docs/draft.zip">draft</a>
    <a href="/bin/tool.zip">tool</a>
  `);
  writeFileSync(join(dir, 'docs', 'guide.zip'), 'Z');
  writeFileSync(join(dir, 'docs', 'draft.zip'), 'Z');
  writeFileSync(join(dir, 'bin', 'tool.zip'), 'Z');
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

test('a URL is kept unless a filter says otherwise', () => {
  const r = py(`
u = "http://host/docs/guide.zip"
print("R:" + json.dumps({
  "no_filters": g.grabber_allows(u, [], []),
  "include_hit": g.grabber_allows(u, ["/docs/"], []),
  "include_miss": g.grabber_allows(u, ["/bin/"], []),
  "include_glob": g.grabber_allows(u, ["*guide*"], []),
  "exclude_hit": g.grabber_allows(u, [], ["draft"]),
  "exclude_wins": g.grabber_allows(u, ["/docs/"], ["guide"]),
  "case_blind": g.grabber_allows(u, ["/DOCS/"], []),
  "parsed": g.grabber_filter_patterns(" /docs/  *.zip\\n/bin/ "),
}))
`);
  assert.equal(r.no_filters, true);
  assert.equal(r.include_hit, true);
  assert.equal(r.include_miss, false);
  assert.equal(r.include_glob, true);
  assert.equal(r.exclude_hit, true);
  assert.equal(r.exclude_wins, false, 'exclude must beat include');
  assert.equal(r.case_blind, true);
  assert.deepEqual(r.parsed, ['/docs/', '*.zip', '/bin/']);
});

test('the crawl only returns files the filters allow', async () => {
  const dir = makeSite();
  const port = await freePort();
  const srv = spawn('python3', ['-m', 'http.server', String(port)],
    { cwd: dir, stdio: 'ignore' });
  try {
    await waitTcp('127.0.0.1', port);
    const r = py(`
base = "http://127.0.0.1:${port}/"
print("R:" + json.dumps({
  "all": g.crawl_site(base, file_exts=["zip"]),
  "docs": g.crawl_site(base, file_exts=["zip"], include=["/docs/"]),
  "no_draft": g.crawl_site(base, file_exts=["zip"], exclude=["draft"]),
  "docs_no_draft": g.crawl_site(base, file_exts=["zip"], include=["/docs/"],
                                exclude=["*draft*"]),
}))
`);
    assert.deepEqual(names(r.all), ['draft.zip', 'guide.zip', 'tool.zip']);
    assert.deepEqual(names(r.docs), ['draft.zip', 'guide.zip']);
    assert.deepEqual(names(r.no_draft), ['guide.zip', 'tool.zip']);
    assert.deepEqual(names(r.docs_no_draft), ['guide.zip']);
  } finally {
    srv.kill();
  }
});

test('the dialog filter boxes are what the crawl obeys', async () => {
  const dir = makeSite();
  const port = await freePort();
  const srv = spawn('python3', ['-m', 'http.server', String(port)],
    { cwd: dir, stdio: 'ignore' });
  try {
    await waitTcp('127.0.0.1', port);
    const base = `http://127.0.0.1:${port}/`;
    const run = (args) => {
      const out = execFileSync('xvfb-run', ['-a', 'python3', script,
        '--selftest-grabber-explore', '--url', base,
        '--grabber-template', 'Archives', ...args], { encoding: 'utf8' });
      const line = out.split('\n').find((l) => l.startsWith('GRAB:'));
      assert.ok(line, `no GRAB: line in output:\n${out}`);
      return JSON.parse(line.slice(5));
    };
    assert.deepEqual(names(run([])), ['draft.zip', 'guide.zip', 'tool.zip']);
    assert.deepEqual(
      names(run(['--grabber-include', '/docs/', '--grabber-exclude', 'draft'])),
      ['guide.zip'],
    );
  } finally {
    srv.kill();
  }
});
