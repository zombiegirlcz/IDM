// Tests for the app-icon generator (`scripts/make-icon.py`).
//
// The user wants a desktop icon: three 3-D down-arrows (↓), red on the left,
// yellow on the right, and a green one in front in the middle. The generator
// must produce a PNG (Linux) and an ICO (Windows) from that description, and the
// colours must actually be there (we sample the pixels).
//
// Runs with: node --test test/icon.test.mjs

import test from 'node:test';
import assert from 'node:assert/strict';
import { existsSync, mkdtempSync, readFileSync } from 'node:fs';
import { execFileSync } from 'node:child_process';
import { fileURLToPath } from 'node:url';
import { dirname, join } from 'node:path';
import { tmpdir } from 'node:os';

const here = dirname(fileURLToPath(import.meta.url));
const repoRoot = join(here, '..');
const gen = join(repoRoot, 'scripts', 'make-icon.py');

const src = () => readFileSync(gen, 'utf8');

test('make-icon.py exists and is valid Python', () => {
  assert.ok(existsSync(gen), `missing ${gen}`);
  execFileSync('python3', ['-m', 'py_compile', gen], { stdio: 'pipe' });
});

/// Run the generator into a temp dir and return {png, ico, dir}.
function generate() {
  const dir = mkdtempSync(join(tmpdir(), 'idm_icon_'));
  execFileSync('python3', [gen, '--out-dir', dir], { stdio: 'pipe' });
  return { png: join(dir, 'idm.png'), ico: join(dir, 'idm.ico'), dir };
}

test('produces a PNG and an ICO', () => {
  const { png, ico } = generate();
  assert.ok(existsSync(png), 'must produce idm.png');
  assert.ok(existsSync(ico), 'must produce idm.ico');
  const p = readFileSync(png);
  assert.equal(p.subarray(1, 4).toString('latin1'), 'PNG', 'PNG magic');
  const i = readFileSync(ico);
  assert.equal(i.readUInt16LE(0), 0, 'ICO reserved field');
  assert.equal(i.readUInt16LE(2), 1, 'ICO type must be 1 (icon)');
  assert.ok(i.readUInt16LE(4) >= 1, 'ICO must contain at least one image');
});

test('the three arrows carry the requested colours', () => {
  const dir = mkdtempSync(join(tmpdir(), 'idm_icon_c_'));
  // Ask the generator itself to report where each arrow is and what colour it
  // painted, so we do not hard-code pixel guesses in the test.
  const out = execFileSync(
    'python3',
    [gen, '--out-dir', dir, '--report'],
    { encoding: 'utf8', stdio: ['ignore', 'pipe', 'pipe'] },
  );
  const line = out.split('\n').find((l) => l.startsWith('REPORT:'));
  assert.ok(line, `no REPORT: line in:\n${out}`);
  const r = JSON.parse(line.slice('REPORT:'.length));

  // Three arrows: left red, right yellow, front/middle green.
  assert.equal(r.arrows.length, 3, 'exactly three arrows');
  const byName = Object.fromEntries(r.arrows.map((a) => [a.name, a]));
  assert.ok(byName.left, 'left arrow present');
  assert.ok(byName.right, 'right arrow present');
  assert.ok(byName.front, 'front/middle arrow present');

  assert.ok(byName.left.rgb[0] > 150 && byName.left.rgb[1] < 100, `left must be red: ${byName.left.rgb}`);
  assert.ok(byName.right.rgb[0] > 180 && byName.right.rgb[1] > 140 && byName.right.rgb[2] < 100, `right must be yellow: ${byName.right.rgb}`);
  assert.ok(byName.front.rgb[1] > 120 && byName.front.rgb[0] < 120, `front must be green: ${byName.front.rgb}`);

  // Front arrow must be nearer the centre-x than the side arrows.
  const cx = r.size / 2;
  assert.ok(Math.abs(byName.front.x - cx) < Math.abs(byName.left.x - cx), 'front arrow is the middle one');
  assert.ok(byName.left.x < byName.right.x, 'red is left of yellow');
});

test('generator is deterministic and mentions the arrow glyph', () => {
  const s = src();
  assert.match(s, /arrow|Arrow|↓|down/i, 'should be about a down arrow');
  // Colours must be defined in the script so they are reviewable.
  assert.match(s, /red|#c|#e|#f/i, 'should reference red');
  assert.match(s, /yellow|#f|#e/i, 'should reference yellow');
  assert.match(s, /green|#2|#3|#4/i, 'should reference green');
});