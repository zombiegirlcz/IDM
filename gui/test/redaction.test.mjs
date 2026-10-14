// Step 1 of docs/superpowers/specs/2026-10-14-auth-at-rest-design.md:
// server passwords must stop being readable by anything other than their
// owner. Two of the four leaks are on this side of the wire -- the selftest
// hooks print the whole options dict (and the whole /api/add body) to stdout,
// password included, and settings.json is written with whatever umask says.
//
// Runs with: node --test gui/test/redaction.test.mjs

import test from 'node:test';
import assert from 'node:assert/strict';
import { mkdtempSync, writeFileSync, statSync } from 'node:fs';
import { execFileSync } from 'node:child_process';
import { fileURLToPath } from 'node:url';
import { dirname, join } from 'node:path';
import { tmpdir } from 'node:os';

const here = dirname(fileURLToPath(import.meta.url));
const guiDir = join(here, '..');
const script = join(guiDir, 'idm_gui.py');

const SECRET = 'tr0ub4dor';
const SETTINGS = {
  site_logins: [{ url: 'https://files.example.com/', user: 'alice', password: SECRET }],
  proxy: { http_proxy: 'proxy.example', http_port: 8080,
           proxy_user: 'bob', proxy_pass: 'hunter2' },
};

function stateDir() {
  const dir = mkdtempSync(join(tmpdir(), 'idm_redact_'));
  writeFileSync(join(dir, 'settings.json'), JSON.stringify(SETTINGS));
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

test('redaction keeps the user and drops the password', () => {
  const r = py(`
print("R:" + json.dumps({
  "auth": g.redact_options({"auth": "alice:${SECRET}"}),
  "user_only": g.redact_options({"auth": "alice"}),
  "empty": g.redact_options({"auth": "", "proxy": ""}),
  "proxy": g.redact_options({"proxy": "http://bob:hunter2@proxy.example:8080"}),
  "plain_proxy": g.redact_options({"proxy": "http://proxy.example:8080"}),
  "untouched": g.redact_options({"out_dir": "/tmp", "connections": 8}),
}))
`);
  assert.equal(r.auth.auth, 'alice:<redacted>', 'the user stays, for diagnosis');
  assert.equal(r.user_only.auth, 'alice');
  // An empty value means "no login for this host", which has to stay testable.
  assert.equal(r.empty.auth, '');
  assert.equal(r.empty.proxy, '');
  assert.equal(r.proxy.proxy, 'http://bob:<redacted>@proxy.example:8080');
  assert.equal(r.plain_proxy.proxy, 'http://proxy.example:8080', 'nothing to hide');
  assert.deepEqual(r.untouched, { out_dir: '/tmp', connections: 8 });
});

test('no selftest prints a password to stdout', () => {
  const dir = stateDir();
  const url = 'https://files.example.com/private/a.zip';
  for (const flag of ['--selftest-download-options', '--selftest-add-body']) {
    const out = execFileSync('python3', ['-I', script, flag,
      '--state-dir', dir, '--url', url], { encoding: 'utf8' });
    assert.ok(!out.includes(SECRET), `${flag} printed the password:\n${out}`);
    assert.ok(!out.includes('hunter2'), `${flag} printed the proxy password:\n${out}`);
    assert.ok(out.includes('alice'), `${flag} must still show the user:\n${out}`);
    assert.ok(out.includes('<redacted>'), `${flag} output: ${out}`);
  }
});

test('settings.json is readable by its owner only', () => {
  const dir = mkdtempSync(join(tmpdir(), 'idm_perm_'));
  // umask here happens to be 077, which would make this pass for the wrong
  // reason: the point is that save_settings sets the mode itself.
  py(`
import os
os.umask(0)
g.save_settings(${JSON.stringify(dir)}, {"site_logins": [{"url": "https://x/", "user": "a", "password": "p"}]})
print("R:" + json.dumps(True))
`);
  if (process.platform === 'win32') return;  // ACLs, not modes
  const mode = statSync(join(dir, 'settings.json')).mode & 0o777;
  assert.equal(mode.toString(8), '600', 'a file holding passwords must be 0600');
});
