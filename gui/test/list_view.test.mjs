// The main window ignored its own chrome: clicking a column heading did
// nothing (listview.heading(...) was created without a command), the Search
// box was packed and never bound to anything, and picking a category or queue
// in the left tree did not filter the list -- _selected_category() was only
// used for editing categories.
//
// Runs with: node --test gui/test/list_view.test.mjs

import test from 'node:test';
import assert from 'node:assert/strict';
import { execFileSync } from 'node:child_process';
import { fileURLToPath } from 'node:url';
import { dirname, join } from 'node:path';

const here = dirname(fileURLToPath(import.meta.url));
const guiDir = join(here, '..');

const ITEMS = [
  { id: 1, url: 'http://h/clip.mp4', status: 'done', total: 2000, downloaded: 2000 },
  { id: 2, url: 'http://h/book.pdf', status: 'running', total: 300, downloaded: 150 },
  { id: 3, url: 'http://h/album.mp3', status: 'error', total: 40000, downloaded: 10 },
  { id: 4, url: 'http://h/setup.exe', status: 'paused', total: 900, downloaded: 100 },
];

function py(snippet, items = ITEMS) {
  const code = `
import sys, json
sys.path.insert(0, ${JSON.stringify(guiDir)})
import idm_gui as g
items = json.loads(${JSON.stringify(JSON.stringify(items))})
${snippet}
`;
  const out = execFileSync('python3', ['-I', '-c', code], { encoding: 'utf8' });
  const line = out.split('\n').find((l) => l.startsWith('R:'));
  assert.ok(line, `no R: line:\n${out}`);
  return JSON.parse(line.slice(2));
}

const ids = (list) => list.map((x) => x.id);

test('All Downloads shows everything; a type category narrows it', () => {
  const r = py(`
print("R:" + json.dumps({
  "all": g.filter_items(items, "All Downloads", "", {}),
  "video": g.filter_items(items, "Video", "", {}),
  "music": g.filter_items(items, "Music", "", {}),
  "programs": g.filter_items(items, "Programs", "", {}),
}))
`);
  assert.deepEqual(ids(r.all), [1, 2, 3, 4]);
  assert.deepEqual(ids(r.video), [1]);
  assert.deepEqual(ids(r.music), [3]);
  assert.deepEqual(ids(r.programs), [4]);
});

test('Finished and Unfinished split on the download status', () => {
  const r = py(`
print("R:" + json.dumps({
  "fin": g.filter_items(items, "Finished", "", {}),
  "unfin": g.filter_items(items, "Unfinished", "", {}),
}))
`);
  assert.deepEqual(ids(r.fin), [1], 'only the completed download is Finished');
  assert.deepEqual(ids(r.unfin), [2, 3, 4]);
});

test('a custom category matches by its own extensions', () => {
  const r = py(`
settings = {"categories": [{"name": "Books", "extensions": ["pdf", "epub"], "dir": ""}]}
print("R:" + json.dumps(g.filter_items(items, "Books", "", settings)))
`);
  assert.deepEqual(ids(r), [2]);
});

test('the search box matches the file name, case-insensitively', () => {
  const r = py(`
print("R:" + json.dumps({
  "hit": g.filter_items(items, "All Downloads", "BOOK", {}),
  "partial": g.filter_items(items, "All Downloads", "mp", {}),
  "miss": g.filter_items(items, "All Downloads", "nothing", {}),
}))
`);
  assert.deepEqual(ids(r.hit), [2]);
  assert.deepEqual(ids(r.partial), [1, 3], 'clip.mp4 and album.mp3');
  assert.deepEqual(ids(r.miss), []);
});

test('search and category combine instead of overriding each other', () => {
  const r = py(`print("R:" + json.dumps(g.filter_items(items, "Video", "book", {})))`);
  assert.deepEqual(ids(r), [], 'a pdf must not show up under Video');
});

test('sorting by size is numeric, not alphabetical', () => {
  // The displayed size is a string like "39.1 KB"; sorting that text puts
  // 2000 before 300. The sort must use the byte counts.
  const r = py(`
print("R:" + json.dumps({
  "asc": g.sort_items(items, "size", False),
  "desc": g.sort_items(items, "size", True),
}))
`);
  assert.deepEqual(ids(r.asc), [2, 4, 1, 3], '300 < 900 < 2000 < 40000');
  assert.deepEqual(ids(r.desc), [3, 1, 4, 2]);
});

test('sorting by name is case-insensitive and reversible', () => {
  const r = py(`
print("R:" + json.dumps({
  "asc": g.sort_items(items, "name", False),
  "desc": g.sort_items(items, "name", True),
}))
`);
  assert.deepEqual(ids(r.asc), [3, 2, 1, 4], 'album, book, clip, setup');
  assert.deepEqual(ids(r.desc), [4, 1, 2, 3]);
});

test('an unknown sort key leaves the order alone', () => {
  const r = py(`print("R:" + json.dumps(g.sort_items(items, "nonsense", False)))`);
  assert.deepEqual(ids(r), [1, 2, 3, 4]);
});
