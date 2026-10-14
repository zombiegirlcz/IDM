// Roadmap item 3 left a hole: the engine honours cookie / referer /
// force_media and Api.add passes them on, but nothing in the window ever set
// them -- they only arrived if someone hand-edited download_options(). They
// belong next to the Format combobox in Download File Info, which is where a
// media URL is already being decided on.
//
// Runs with: node --test gui/test/media_options.test.mjs

import test from 'node:test';
import assert from 'node:assert/strict';
import { execFileSync } from 'node:child_process';
import { fileURLToPath } from 'node:url';
import { dirname, join } from 'node:path';

const here = dirname(fileURLToPath(import.meta.url));
const guiDir = join(here, '..');
const script = join(guiDir, 'idm_gui.py');

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

test('only what was filled in becomes an option', () => {
  const r = py(`
print("R:" + json.dumps({
  "empty": g.media_options("", "", False),
  "cookie": g.media_options(" SID=1 ", "", False),
  "referer": g.media_options("", "https://example.com/watch", False),
  "forced": g.media_options("", "", True),
  "all": g.media_options("SID=1", "https://e/", True),
}))
`);
  assert.deepEqual(r.empty, {}, 'an untouched dialog adds nothing');
  assert.deepEqual(r.cookie, { cookie: 'SID=1' }, 'and it is trimmed');
  assert.deepEqual(r.referer, { referer: 'https://example.com/watch' });
  assert.deepEqual(r.forced, { force_media: true });
  assert.deepEqual(r.all, {
    cookie: 'SID=1', referer: 'https://e/', force_media: true,
  });
});

test('Download File Info offers the three media controls', () => {
  const out = execFileSync('xvfb-run', ['-a', 'python3', script,
    '--selftest-file-info'], { encoding: 'utf8' });
  const line = out.split('\n').find((l) => l.startsWith('FILE-INFO:'));
  assert.ok(line, `no FILE-INFO: line in output:\n${out}`);
  const r = JSON.parse(line.slice('FILE-INFO:'.length));
  assert.ok(r.labels.includes('Cookie:'), `labels: ${r.labels}`);
  assert.ok(r.labels.includes('Referer:'), `labels: ${r.labels}`);
  assert.ok(r.checkboxes.some((c) => /media/i.test(c)),
    `checkboxes: ${r.checkboxes}`);
  // Typed into and ticked, they come back out as engine options.
  assert.deepEqual(r.media_options, {
    cookie: 'SID=1',
    referer: 'https://example.com/watch',
    force_media: true,
  });
});
