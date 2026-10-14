// Roadmap item 4, piece 4: a grabber project is a thing you can keep. Until
// now the wizard's "Grabber Project Name" was a label on an entry nobody
// read, and the "Grabber projects" node in the category tree was an empty
// heading.
//
// Runs with: node --test gui/test/grabber_projects.test.mjs

import test from 'node:test';
import assert from 'node:assert/strict';
import { mkdtempSync, writeFileSync, readFileSync } from 'node:fs';
import { execFileSync } from 'node:child_process';
import { fileURLToPath } from 'node:url';
import { dirname, join } from 'node:path';
import { tmpdir } from 'node:os';

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

function stateDir() {
  return mkdtempSync(join(tmpdir(), 'idm_gproj_'));
}

test('projects round-trip through settings.json and stay independent', () => {
  const dir = stateDir();
  const r = py(`
# JSON as a string: true/false/null are not Python literals.
docs = json.loads('''{"name": "Docs", "start": "https://a/", "template": "Documents",
                       "depth": 2, "external_depth": 1, "same_site_only": false,
                       "include": "/docs/", "exclude": "draft", "max_pages": 70,
                       "folder": "/tmp/docs"}''')
pics = json.loads('{"name": "Pics", "start": "https://b/", "template": "Images"}')
s = g.load_settings(${JSON.stringify(dir)})
s = g.save_grabber_project(s, docs)
s = g.save_grabber_project(s, pics)
g.save_settings(${JSON.stringify(dir)}, s)

r = g.load_settings(${JSON.stringify(dir)})
after_delete = g.grabber_project_names(g.delete_grabber_project(r, "Pics"))
print("R:" + json.dumps({
  "names": g.grabber_project_names(r),
  "docs": g.grabber_project(r, "Docs"),
  "pics": g.grabber_project(r, "Pics"),
  "missing": g.grabber_project(r, "nope"),
  "after_delete": after_delete,
  "unnamed_ignored": g.grabber_project_names(
      g.save_grabber_project(r, {"name": "  "})),
}))
`);
  assert.deepEqual(r.names, ['Docs', 'Pics']);
  assert.equal(r.docs.start, 'https://a/');
  assert.equal(r.docs.template, 'Documents');
  assert.equal(r.docs.depth, 2);
  assert.equal(r.docs.external_depth, 1);
  assert.equal(r.docs.same_site_only, false);
  assert.equal(r.docs.include, '/docs/');
  assert.equal(r.docs.exclude, 'draft');
  assert.equal(r.docs.max_pages, 70);
  // Saving one project must not bleed into another.
  assert.equal(r.pics.template, 'Images');
  assert.equal(r.pics.include, '');
  assert.equal(r.pics.same_site_only, true, 'defaults fill the gaps');
  assert.equal(r.missing.name, 'nope');
  assert.deepEqual(r.after_delete, ['Docs']);
  assert.deepEqual(r.unnamed_ignored, ['Docs', 'Pics']);
});

test('the dialog saves what is on screen and loads it back', () => {
  const dir = stateDir();
  const out = execFileSync('xvfb-run', ['-a', 'python3', script,
    '--selftest-grabber-project', '--state-dir', dir], { encoding: 'utf8' });
  const line = out.split('\n').find((l) => l.startsWith('GRABPROJ:'));
  assert.ok(line, `no GRABPROJ: line in output:\n${out}`);
  const r = JSON.parse(line.slice('GRABPROJ:'.length));

  // What landed in settings.json.
  assert.equal(r.saved.name, 'Nightly');
  assert.equal(r.saved.start, 'https://example.com/files/');
  assert.equal(r.saved.template, 'Images');
  assert.equal(r.saved.depth, 4);
  assert.equal(r.saved.external_depth, 2);
  assert.equal(r.saved.include, '/files/');
  assert.equal(r.saved.exclude, 'thumb');
  assert.equal(r.saved.max_pages, 7);
  assert.equal(r.saved.same_site_only, false);

  // What a fresh dialog shows when that project is opened.
  assert.equal(r.loaded.name, 'Nightly');
  assert.equal(r.loaded.start, 'https://example.com/files/');
  assert.equal(r.loaded.template, 'Images');
  assert.equal(r.loaded.depth, '4');
  assert.equal(r.loaded.external_depth, '2');
  assert.equal(r.loaded.include, '/files/');
  assert.equal(r.loaded.exclude, 'thumb');
  assert.equal(r.loaded.max_pages, '7');
  assert.equal(r.loaded.same_site_only, false);
  assert.ok(r.loaded.exts.includes('jpg'), 'the template filter comes along');

  // And it is really on disk, not just in the one process.
  const stored = JSON.parse(readFileSync(join(dir, 'settings.json'), 'utf8'));
  assert.ok(stored.grabber_projects.some((p) => p.name === 'Nightly'));
});

test('saved projects hang under the "Grabber projects" tree node', () => {
  const dir = stateDir();
  writeFileSync(join(dir, 'settings.json'), JSON.stringify({
    grabber_projects: [
      { name: 'Nightly', start: 'https://a/' },
      { name: 'Comics', start: 'https://b/' },
    ],
  }));
  const out = execFileSync('xvfb-run', ['-a', 'python3', script,
    '--selftest-grabber-tree', '--state-dir', dir], { encoding: 'utf8' });
  const line = out.split('\n').find((l) => l.startsWith('GRABTREE:'));
  assert.ok(line, `no GRABTREE: line in output:\n${out}`);
  const r = JSON.parse(line.slice('GRABTREE:'.length));
  assert.deepEqual(r.children, ['Comics', 'Nightly']);
  // Opening one (the last child, "Nightly") must bring up its Grabber
  // dialog, filled in from the saved project.
  assert.equal(r.opened_title, 'IDM Grabber');
  assert.equal(r.opened_start, 'https://a/');
});

// Selecting (single click) a saved project in the tree used to filter the
// list by a category named after the project -- a category that does not
// exist, so the list went empty. Only the double click means anything on
// those nodes; a plain selection must leave the view alone.
test('selecting a project node is not a category change', () => {
  const r = py(`
nodes = {"I003": "Nightly", "I004": "Comics"}
print("R:" + json.dumps({
  "category": g.category_for_node("I001", "Compressed", nodes),
  "project": g.category_for_node("I003", "Nightly", nodes),
  "heading": g.category_for_node("I002", "Grabber projects", {}),
  "none": g.category_for_node(None, None, nodes),
}))
`);
  assert.equal(r.category, 'Compressed', 'an ordinary category still selects');
  assert.equal(r.project, null, 'a project node selects no category');
  assert.equal(r.heading, 'Grabber projects');
  assert.equal(r.none, null);
});

test('the tree keeps its category when a project is selected', () => {
  const dir = stateDir();
  writeFileSync(join(dir, 'settings.json'), JSON.stringify({
    grabber_projects: [{ name: 'Nightly', start: 'https://a/' }],
  }));
  const out = execFileSync('xvfb-run', ['-a', 'python3', script,
    '--selftest-grabber-tree', '--state-dir', dir], { encoding: 'utf8' });
  const line = out.split('\n').find((l) => l.startsWith('GRABTREE:'));
  assert.ok(line, `no GRABTREE: line in output:\n${out}`);
  const r = JSON.parse(line.slice('GRABTREE:'.length));
  assert.equal(r.category_after_select, 'All Downloads',
    'selecting a project must not repoint the category filter');
});
