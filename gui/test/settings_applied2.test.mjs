// Second pass over "saved but never read" settings.
//
// settings_applied.test.mjs covered connections / out_dir / user_agent / proxy.
// These are the remaining ones that map onto engine flags the engine already
// has, plus the three dialog switches that are pure GUI behaviour.
//
// Runs with: node --test gui/test/settings_applied2.test.mjs

import test from 'node:test';
import assert from 'node:assert/strict';
import { execFileSync } from 'node:child_process';
import { fileURLToPath } from 'node:url';
import { dirname, join } from 'node:path';

const here = dirname(fileURLToPath(import.meta.url));
const guiDir = join(here, '..');

function opts(settings, url = 'http://h/a.zip') {
  const code = `
import sys, json
sys.path.insert(0, ${JSON.stringify(guiDir)})
import idm_gui as g
# The settings arrive as a JSON *string*: pasting JSON straight into Python
# source breaks on true/false/null, which are not Python literals.
s = g._deep_merge(g.DEFAULT_SETTINGS, json.loads(${JSON.stringify(JSON.stringify(settings))}))
print("R:" + json.dumps(g.download_options(s, ${JSON.stringify(url)})))
`;
  const out = execFileSync('python3', ['-I', '-c', code], { encoding: 'utf8' });
  const line = out.split('\n').find((l) => l.startsWith('R:'));
  assert.ok(line, `no R: line:\n${out}`);
  return JSON.parse(line.slice(2));
}

test('a download quota becomes a byte-per-second rate limit', () => {
  // 40 MB every hour -> 40*1024*1024/3600 B/s. The engine speaks --limit-rate,
  // so the quota has to be converted rather than ignored.
  const o = opts({
    connection: { download_limits: true, limit_amount_mb: 40, limit_period_h: 1 },
  });
  assert.equal(o.limit_rate, Math.floor((40 * 1024 * 1024) / 3600));
});

test('the quota is ignored while the limit switch is off', () => {
  const o = opts({
    connection: { download_limits: false, limit_amount_mb: 40, limit_period_h: 1 },
  });
  assert.equal(o.limit_rate, 0, '0 means unlimited to the engine');
});

test('a nonsensical quota does not produce a zero-or-negative rate', () => {
  const o = opts({
    connection: { download_limits: true, limit_amount_mb: 10, limit_period_h: 0 },
  });
  assert.equal(o.limit_rate, 0, 'a zero period must not divide by zero');
});

test('proxy credentials are carried in the proxy URL', () => {
  const o = opts({
    proxy: {
      use_system: false,
      http: 'http://proxy.example:8080',
      proxy_auth: true,
      proxy_user: 'bob',
      proxy_pass: 'p@ss word',
    },
  });
  // The password has characters that must be percent-encoded to keep the URL valid.
  assert.equal(o.proxy, 'http://bob:p%40ss%20word@proxy.example:8080');
});

test('credentials are left out when proxy authorization is off', () => {
  const o = opts({
    proxy: {
      use_system: false,
      http: 'http://proxy.example:8080',
      proxy_auth: false,
      proxy_user: 'bob',
      proxy_pass: 'secret',
    },
  });
  assert.equal(o.proxy, 'http://proxy.example:8080');
});

test('a site login supplies credentials for a matching host only', () => {
  const settings = {
    site_logins: [{ url: 'https://files.example.com/private', user: 'alice', password: 's3cret' }],
  };
  assert.equal(opts(settings, 'https://files.example.com/private/a.zip').auth, 'alice:s3cret');
  assert.equal(opts(settings, 'https://other.example.com/a.zip').auth, '', 'must not leak to another host');
});

test('ignore_mtime reaches the options', () => {
  assert.equal(opts({ downloads: { ignore_mtime: true } }).ignore_mtime, true);
  assert.equal(opts({ downloads: { ignore_mtime: false } }).ignore_mtime, false);
});

test('the Downloads tab switches describe which dialogs to show', () => {
  const code = `
import sys, json
sys.path.insert(0, ${JSON.stringify(guiDir)})
import idm_gui as g
quiet = g._deep_merge(g.DEFAULT_SETTINGS, {"downloads": {
    "show_start_dialog": False, "show_progress": "don't show"}})
loud = g._deep_merge(g.DEFAULT_SETTINGS, {"downloads": {
    "show_start_dialog": True, "show_progress": "normal"}})
print("R:" + json.dumps({"quiet": g.dialog_prefs(quiet), "loud": g.dialog_prefs(loud)}))
`;
  const out = execFileSync('python3', ['-I', '-c', code], { encoding: 'utf8' });
  const r = JSON.parse(out.split('\n').find((l) => l.startsWith('R:')).slice(2));
  assert.equal(r.quiet.show_start, false);
  assert.equal(r.quiet.show_progress, false);
  assert.equal(r.loud.show_start, true);
  assert.equal(r.loud.show_progress, true);
});
