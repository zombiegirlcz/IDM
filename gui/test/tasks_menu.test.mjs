// Roadmap item 5: the Tasks menu, the floating drop target and batch-adding
// URLs out of the clipboard.
//
// IDM has a Tasks menu next to File/Downloads/View/Help and a small
// always-on-top window you can drop a link onto. Our menubar had neither, and
// the drop handler that existed (`_drop_text`) only ever fired when the
// optional tkinterdnd2 module happened to be installed -- on a plain Python
// the feature silently did not exist. So the drop window must also offer a
// click-to-paste path, and tkinterdnd2 must stay optional.
//
// Runs with: node --test gui/test/tasks_menu.test.mjs

import test from 'node:test';
import assert from 'node:assert/strict';
import { readFileSync, existsSync } from 'node:fs';
import { spawnSync } from 'node:child_process';
import { fileURLToPath } from 'node:url';
import { dirname, join } from 'node:path';

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

function py(code) {
  const res = spawnSync('python3', ['-I', '-c', code], {
    encoding: 'utf8',
    cwd: guiDir,
    maxBuffer: 8 * 1024 * 1024,
  });
  if (res.status !== 0) {
    throw new Error(`python failed (${res.status}):\n${res.stdout}\n${res.stderr}`);
  }
  return res.stdout.trim();
}

function selftest(mode, extra = []) {
  const res = spawnSync(
    'xvfb-run',
    ['-a', 'python3', guiPy, mode, '--engine', findEngine(), ...extra],
    { encoding: 'utf8', maxBuffer: 8 * 1024 * 1024 },
  );
  if (res.status !== 0) {
    throw new Error(`${mode} failed (${res.status}):\n${res.stdout}\n${res.stderr}`);
  }
  return res.stdout;
}

function marker(out, prefix) {
  const line = out.split('\n').find((l) => l.startsWith(prefix));
  assert.ok(line, `no ${prefix} line in output:\n${out}`);
  return JSON.parse(line.slice(prefix.length));
}

let cachedDump = null;
function dumpWindow() {
  if (!cachedDump) cachedDump = marker(selftest('--selftest-dump'), 'DUMP:');
  return cachedDump;
}

// --- pure function: pulling URLs out of a clipboard blob -------------------

// The blob is handed over as a JSON string and json.loads()ed on the Python
// side -- JSON cannot be pasted into Python source as a literal.
function extract(text) {
  const literal = JSON.stringify(JSON.stringify(text));
  const code = [
    'import json, sys',
    'sys.path.insert(0, ".")',
    'import idm_gui',
    `print(json.dumps(idm_gui.extract_urls(json.loads(${literal}))))`,
  ].join('\n');
  return JSON.parse(py(code));
}

test('extract_urls finds every URL in one clipboard blob', () => {
  assert.deepEqual(
    extract('https://a.example/one.bin\nhttp://b.example/two.zip\nftp://c.example/three'),
    ['https://a.example/one.bin', 'http://b.example/two.zip', 'ftp://c.example/three'],
  );
});

test('extract_urls drops duplicates, keeping the first order', () => {
  assert.deepEqual(
    extract('https://a.example/x https://b.example/y https://a.example/x'),
    ['https://a.example/x', 'https://b.example/y'],
  );
});

test('extract_urls strips surrounding text and punctuation', () => {
  assert.deepEqual(
    extract('Grab (https://a.example/f.iso), then <http://b.example/g.tar>. Done!'),
    ['https://a.example/f.iso', 'http://b.example/g.tar'],
  );
});

test('extract_urls rejects non-http schemes and schemes without a host', () => {
  assert.deepEqual(
    extract(
      'mailto:a@b.example magnet:?xt=urn:btih:deadbeef file:///etc/passwd ' +
        'javascript:alert(1) http:// https://ok.example/f',
    ),
    ['https://ok.example/f'],
  );
});

test('extract_urls on text with no URL at all returns nothing', () => {
  assert.deepEqual(extract('just some words, 3 of them'), []);
  assert.deepEqual(extract(''), []);
});

// --- the Tasks menu --------------------------------------------------------

test('menubar carries a Tasks menu', () => {
  const menus = (dumpWindow().menus || []).map((s) => s.toLowerCase());
  assert.ok(menus.some((m) => m.includes('tasks')), `got: ${menus.join(', ')}`);
});

test('Tasks menu offers clipboard batch, the drop target and the queue actions', () => {
  const items = (dumpWindow().tasks_menu_items || []).map((s) => s.toLowerCase());
  assert.ok(items.length > 0, 'Tasks menu must have entries');
  for (const want of ['clipboard', 'drop', 'start queue', 'stop queue', 'scheduler']) {
    assert.ok(
      items.some((i) => i.includes(want)),
      `Tasks menu must offer "${want}"; got: ${items.join(', ')}`,
    );
  }
});

// --- the floating drop target ---------------------------------------------

test('the drop target is a small always-on-top window with live buttons', () => {
  const d = dumpWindow();
  const win = (d.dialogs || []).find((x) => /drop/i.test(x.title || ''));
  assert.ok(
    win,
    `no drop-target window in the dump: ${(d.dialogs || []).map((x) => x.title).join(' | ')}`,
  );
  assert.equal(win.topmost, true, 'drop target must stay on top');
  assert.deepEqual(win.dead_buttons, [], 'drop target buttons must all be bound');
  const widgets = (win.widgets || []).join(' ').toLowerCase();
  assert.ok(widgets.includes('paste'), `drop target needs a paste button; got: ${widgets}`);
});

test('the main window can show and hide the drop target', () => {
  const got = marker(selftest('--selftest-drop-toggle'), 'DROP-TOGGLE:');
  assert.equal(got.after_first_show, true, 'first Tasks->drop target must open it');
  assert.equal(got.after_second_show, false, 'the same entry must hide it again');
});

test('clicking Paste on the drop target enqueues the clipboard URL', () => {
  const got = marker(selftest('--selftest-drop-paste'), 'DROP-PASTE:');
  assert.deepEqual(got.added, ['https://example.com/dropped.bin']);
});

test('dropped text still goes through when tkinterdnd2 is present', () => {
  const got = marker(selftest('--selftest-drop-paste'), 'DROP-PASTE:');
  assert.deepEqual(got.dropped, ['https://example.com/dnd.bin']);
});

test('tkinterdnd2 stays optional', () => {
  const src = readFileSync(guiPy, 'utf8');
  for (const m of src.matchAll(/^(\s*)from tkinterdnd2 import/gm)) {
    assert.ok(m[1].length > 0, 'tkinterdnd2 must only be imported inside a try block');
  }
  for (const f of ['requirements.txt', 'gui/requirements.txt', 'pyproject.toml']) {
    const p = join(repoRoot, f);
    if (existsSync(p)) {
      assert.ok(
        !readFileSync(p, 'utf8').includes('tkinterdnd2'),
        `${f} must not depend on tkinterdnd2`,
      );
    }
  }
});

// --- batch add from the clipboard -----------------------------------------

test('Tasks -> batch from clipboard enqueues every URL it finds', () => {
  const got = marker(selftest('--selftest-batch-clipboard'), 'BATCH-CLIP:');
  assert.deepEqual(got.added, [
    'https://example.com/a.bin',
    'https://example.com/b.bin',
    'ftp://example.com/c.bin',
  ]);
  assert.match(got.status, /3/, `status line should report the count; got: ${got.status}`);
});
