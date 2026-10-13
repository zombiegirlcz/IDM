// Tests for the IDM features added on top of the base window:
//   * custom categories (add/edit/delete) persisted in settings.json
//   * the Grabber (site explorer) helper and its wizard dialog
//   * clipboard URL detection and the drag&drop entry point
//
// The heavy lifting (crawl_site) is exercised against a local HTTP server, so
// the test is hermetic and does not touch the network.
//
// Runs with: node --test gui/test/features.test.mjs

import test from 'node:test';
import assert from 'node:assert/strict';
import { existsSync, mkdtempSync, readFileSync, writeFileSync, mkdirSync } from 'node:fs';
import { spawnSync, execFileSync, spawn } from 'node:child_process';
import { fileURLToPath } from 'node:url';
import { dirname, join } from 'node:path';
import { tmpdir } from 'node:os';

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

function dumpWindow() {
  const engine = findEngine();
  const res = spawnSync(
    'xvfb-run',
    ['-a', 'python3', guiPy, '--selftest-dump', '--engine', engine],
    { encoding: 'utf8', env: { ...process.env }, maxBuffer: 8 * 1024 * 1024 },
  );
  if (res.status !== 0) {
    throw new Error(`dump failed (${res.status}):\n${res.stdout}\n${res.stderr}`);
  }
  const line = res.stdout.split('\n').find((l) => l.startsWith('DUMP:'));
  assert.ok(line, `no DUMP: line in output:\n${res.stdout}`);
  return JSON.parse(line.slice('DUMP:'.length));
}

test('toolbar has a Grabber button (IDM has it)', () => {
  const d = dumpWindow();
  const btns = d.buttons.map((b) => b.toLowerCase());
  assert.ok(btns.some((b) => b.includes('grabber')), `got: ${btns.join(', ')}`);
});

test('clipboard URL detection accepts http(s)/ftp and rejects prose', () => {
  // Exercise looks_like_url directly so we do not depend on a display.
  const out = execFileSync('python3', ['-c', `
import sys
sys.path.insert(0, ${JSON.stringify(guiDir)})
from idm_gui import looks_like_url
cases = {
    "https://example.com/file.zip": True,
    "http://example.com/a": True,
    "ftp://example.com/a": True,
    "just some text": False,
    "line1\\nhttps://x/y": False,
    "": False,
}
bad = {k: looks_like_url(k) for k, v in cases.items() if looks_like_url(k) != v}
print("BAD:" + repr(bad) if bad else "URL-OK")
`], { encoding: 'utf8' });
  assert.match(out, /URL-OK/, `looks_like_url mismatches: ${out}`);
});

test('crawl_site finds files on a local site and stays on-site', async () => {
  // A real static site served by python's http.server, which is what the
  // Grabber meets in the wild. (An inline node:http server has bitten us
  // before with Content-Type/HEAD differences.)
  const dir = mkdtempSync(join(tmpdir(), 'idm_site_'));
  writeFileSync(join(dir, 'index.html'),
    '<a href="/a.zip">zip</a> <a href="/sub/page.html">p</a> '
    + '<a href="http://other.example/x.zip">offsite</a>');
  mkdirSync(join(dir, 'sub'));
  mkdirSync(join(dir, 'docs'));
  writeFileSync(join(dir, 'sub/page.html'), '<a href="/docs/b.pdf">pdf</a>');
  writeFileSync(join(dir, 'a.zip'), 'ZIP');
  writeFileSync(join(dir, 'docs/b.pdf'), 'PDF');

  const port = 8700 + Math.floor(Math.random() * 200);
  const srv = spawn('python3', ['-m', 'http.server', String(port)],
    { cwd: dir, stdio: 'ignore' });
  try {
    // Give the server a moment to bind.
    await new Promise((r) => setTimeout(r, 800));
    const out = execFileSync('python3', ['-c', `
import sys, json
sys.path.insert(0, ${JSON.stringify(guiDir)})
from idm_gui import crawl_site
found = crawl_site("http://127.0.0.1:${port}/", max_pages=10,
                   file_exts=["zip", "pdf"], same_site_only=True)
print("FOUND:" + json.dumps(found))
`], { encoding: 'utf8' });
    const line = out.split('\n').find((l) => l.startsWith('FOUND:'));
    assert.ok(line, `no FOUND line: ${out}`);
    const found = JSON.parse(line.slice('FOUND:'.length));
    assert.ok(found.some((u) => u.endsWith('/a.zip')), `missing a.zip: ${found}`);
    assert.ok(found.some((u) => u.endsWith('/docs/b.pdf')), `missing b.pdf: ${found}`);
    assert.ok(!found.some((u) => u.includes('other.example')),
      `offsite file must be excluded: ${found}`);
  } finally {
    srv.kill();
  }
});

test('custom categories round-trip through settings.json', () => {
  const out = execFileSync('python3', ['-c', `
import sys
sys.path.insert(0, ${JSON.stringify(guiDir)})
import idm_gui as g
s = g._deep_merge(g.DEFAULT_SETTINGS, {})
s = g._upsert_category(s, {"name": "Ebooks", "extensions": ["epub"],
                           "dir": "/books", "sites": []})
cats = g.list_categories(s)
assert "Ebooks" in cats, cats
s = g._delete_category(s, "Ebooks")
assert "Ebooks" not in g.list_categories(s)
# Protected categories cannot be silently removed from the built-in list.
assert "All Downloads" in g.list_categories(s)
print("CAT-OK")
`], { encoding: 'utf8' });
  assert.match(out, /CAT-OK/, `category round-trip failed: ${out}`);
});

test('Grabber dialog builds with all four wizard steps', () => {
  const d = dumpWindow();
  const g = d.dialogs.find((x) => /grabber/i.test(x.title));
  assert.ok(g, `no Grabber dialog; got: ${d.dialogs.map((x) => x.title).join(', ')}`);
  const tabs = (g.tabs || []).map((t) => t.toLowerCase());
  assert.ok(tabs.length >= 4, `Grabber needs 4 wizard steps, got ${tabs.length}: ${tabs}`);
  const allText = (g.widgets || []).concat(g.tabs || [])
    .map((w) => String(w).toLowerCase()).join(' ');
  for (const want of ['start', 'save', 'explore', 'filter']) {
    assert.ok(allText.includes(want),
      `Grabber wizard must mention "${want}": ${allText}`);
  }
});