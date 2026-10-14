// Step 2, GUI side: settings.json stops holding passwords. A Site Logins
// entry keeps `user` and a `password_ref` pointing into the engine's vault,
// and download_options() sends the reference on instead of the password.
//
// Reading has to accept both shapes -- a settings.json written by the older
// build still has plaintext `password` -- and a `password_ref` wins when both
// are present.
//
// Runs with: node --test gui/test/password_ref.test.mjs

import test from 'node:test';
import assert from 'node:assert/strict';
import { execFileSync } from 'node:child_process';
import { fileURLToPath } from 'node:url';
import { dirname, join } from 'node:path';

const here = dirname(fileURLToPath(import.meta.url));
const guiDir = join(here, '..');

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

const REF = 'secret:0123456789abcdef';

test('a login is a user plus either a reference or a plaintext password', () => {
  const r = py(`
new = json.loads('{"site_logins": [{"url": "https://f.example.com/", "user": "alice", "password_ref": "${REF}"}]}')
old = json.loads('{"site_logins": [{"url": "https://f.example.com/", "user": "alice", "password": "s3cret"}]}')
both = json.loads('{"site_logins": [{"url": "https://f.example.com/", "user": "alice", "password": "stale", "password_ref": "${REF}"}]}')
url = "https://f.example.com/private/a.zip"
print("R:" + json.dumps({
  "new": g.site_login_for(new, url),
  "old": g.site_login_for(old, url),
  "both": g.site_login_for(both, url),
  "other_host": g.site_login_for(new, "https://other.example.com/a.zip"),
}))
`);
  // (user, password_ref, plaintext_password)
  assert.deepEqual(r.new, ['alice', REF, '']);
  assert.deepEqual(r.old, ['alice', '', 's3cret'], 'an old settings.json still works');
  assert.deepEqual(r.both, ['alice', REF, ''], 'the reference wins, the stale plaintext is ignored');
  assert.deepEqual(r.other_host, ['', '', ''], 'must not leak to another host');
});

test('the engine options carry the reference, not the password', () => {
  const r = py(`
new = json.loads('{"site_logins": [{"url": "https://f.example.com/", "user": "alice", "password_ref": "${REF}"}]}')
old = json.loads('{"site_logins": [{"url": "https://f.example.com/", "user": "alice", "password": "s3cret"}]}')
url = "https://f.example.com/private/a.zip"
print("R:" + json.dumps({
  "new": g.download_options(g._deep_merge(g.DEFAULT_SETTINGS, new), url),
  "old": g.download_options(g._deep_merge(g.DEFAULT_SETTINGS, old), url),
}))
`);
  assert.equal(r.new.auth_user, 'alice');
  assert.equal(r.new.auth_password_ref, REF);
  assert.equal(r.new.auth, '', 'no plaintext field when there is a reference');
  // The legacy shape keeps working until the next save migrates it.
  assert.equal(r.old.auth, 'alice:s3cret');
  assert.equal(r.old.auth_user, 'alice');
  assert.equal(r.old.auth_password_ref, '');
});

test('Api.add sends the reference fields', () => {
  const out = execFileSync('python3', ['-I', join(guiDir, 'idm_gui.py'),
    '--selftest-add-ref'], { encoding: 'utf8' });
  const line = out.split('\n').find((l) => l.startsWith('ADDREF:'));
  assert.ok(line, `no ADDREF: line in output:\n${out}`);
  const body = JSON.parse(line.slice('ADDREF:'.length));
  assert.equal(body.auth_user, 'alice');
  assert.equal(body.auth_password_ref, REF);
  assert.ok(!('auth' in body), `no plaintext auth key: ${JSON.stringify(body)}`);
});

test('a password is stored through the engine and only its reference is kept', () => {
  const out = execFileSync('python3', ['-I', join(guiDir, 'idm_gui.py'),
    '--selftest-store-password'], { encoding: 'utf8' });
  const line = out.split('\n').find((l) => l.startsWith('STORED:'));
  assert.ok(line, `no STORED: line in output:\n${out}`);
  const r = JSON.parse(line.slice('STORED:'.length));
  // What the GUI sent to /api/secrets, and what it wrote to settings.json.
  assert.equal(r.sent.value, 'tr0ub4dor');
  assert.equal(r.record.password_ref, REF);
  assert.ok(!('password' in r.record),
    `the plaintext key must be removed, not emptied: ${JSON.stringify(r.record)}`);
  assert.equal(r.record.user, 'alice');
});

// An existing settings.json full of plaintext has to migrate. On a save, not
// on a read: reading stays reading, exactly as on the engine side.
test('saving Options migrates the plaintext logins it finds', () => {
  const out = execFileSync('python3', ['-I', join(guiDir, 'idm_gui.py'),
    '--selftest-migrate-logins'], { encoding: 'utf8' });
  const line = out.split('\n').find((l) => l.startsWith('MIGRATED:'));
  assert.ok(line, `no MIGRATED: line in output:\n${out}`);
  const r = JSON.parse(line.slice('MIGRATED:'.length));

  // Both plaintext records went to the vault; the one already migrated was
  // left alone, and no password was sent for it a second time.
  assert.deepEqual(r.sent, ['s3cret', 'hunter2'], `sent: ${JSON.stringify(r.sent)}`);
  for (const rec of r.after) {
    assert.ok(!('password' in rec),
      `plaintext left behind: ${JSON.stringify(rec)}`);
    assert.ok(rec.password_ref, `no reference: ${JSON.stringify(rec)}`);
  }
  assert.equal(r.after.length, 3);
  // A record with no password at all is not a password to migrate.
  assert.deepEqual(r.untouched, { url: 'https://nopass/', user: 'anon', password: '' },
    'an empty password means "none set" and must be left as it is');
  // A refusal from the engine keeps the plaintext rather than losing it.
  assert.equal(r.on_refusal.password, 's3cret');
  assert.ok(!('password_ref' in r.on_refusal));
});
