// Message-schema tests for the MV3 extension.
//
// Runs with: node --test extension/test/message_schema.test.mjs
// Verifies:
//   * manifest.json is a valid MV3 manifest with the required bits
//   * background.js / content.js parse
//   * schema.js opcode tables match PROTOCOL.md
//   * native-messaging frame codec round-trips ([4B LE len][JSON])
//   * request builders reject non-http(s) URLs (defense in depth)
//   * content.js actually references the content->background opcodes

import test from 'node:test';
import assert from 'node:assert/strict';
import { readFileSync, existsSync, statSync, mkdirSync, mkdtempSync } from 'node:fs';
import { createHash } from 'node:crypto';
import { execFileSync } from 'node:child_process';
import { fileURLToPath } from 'node:url';
import { dirname, join } from 'node:path';
import { tmpdir } from 'node:os';

const here = dirname(fileURLToPath(import.meta.url));
const ext = join(here, '..');
const repoRoot = join(ext, '..');
const manifestPath = join(ext, 'manifest.json');
const schemaPath = join(ext, 'schema.js');
const bgPath = join(ext, 'background.js');
const contentPath = join(ext, 'content.js');

function nodeCheck(file, asModule) {
  let target = file;
  if (asModule && file.endsWith('.js')) {
    target = join(tmpdir(), `idmcheck_${process.pid}_${Math.random().toString(16).slice(2)}.mjs`);
    execFileSync('cp', [file, target]);
  }
  execFileSync('node', ['--check', target], { stdio: 'pipe' });
}

test('manifest.json is valid MV3', () => {
  assert.ok(existsSync(manifestPath), 'manifest.json must exist');
  const m = JSON.parse(readFileSync(manifestPath, 'utf8'));
  assert.equal(m.manifest_version, 3, 'must be MV3');
  assert.ok(Array.isArray(m.permissions), 'permissions array');
  assert.ok(m.permissions.includes('nativeMessaging'), 'needs nativeMessaging');
  assert.equal(m.background.service_worker, 'background.js');
  assert.equal(m.background.type, 'module', 'service worker must be a module');
  const cs = m.content_scripts || [];
  assert.ok(cs.some((c) => (c.js || []).includes('content.js')), 'content.js must be injected');
});

test('extension scripts parse', () => {
  assert.ok(existsSync(bgPath), 'background.js must exist');
  assert.ok(existsSync(contentPath), 'content.js must exist');
  nodeCheck(bgPath, true); // ESM
  nodeCheck(contentPath, false); // classic
});

test('schema opcode tables match PROTOCOL.md', async () => {
  assert.ok(existsSync(schemaPath), 'schema.js must exist');
  const mod = await import(schemaPath + `?t=${Date.now()}`);
  const { CONTENT_TO_BG, BG_TO_CONTENT, PAGE_MAGIC } = mod;

  // content.js -> background.js opcodes observed in carve/0090fee2_content.js
  // 42 is our own addition (in-page media download button); the rest are from the reverse-engineered IDM content script.
  const expectedC2B = [22, 23, 24, 25, 26, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 39, 41, 42];
  assert.deepEqual([...CONTENT_TO_BG].sort((a, b) => a - b), expectedC2B);

  // background.js -> content.js opcodes (switch(b.shift()))
  const expectedB2C = [11, 12, 13, 14, 15, 16, 17, 18];
  assert.deepEqual([...BG_TO_CONTENT].sort((a, b) => a - b), expectedB2C);

  // page <-> content main-world magic constants
  assert.deepEqual(
    [PAGE_MAGIC.REQ, PAGE_MAGIC.RESP, PAGE_MAGIC.FWD, PAGE_MAGIC.ACK, PAGE_MAGIC.EVENT].sort(),
    [1229212977, 1229212978, 1229212979, 1229212980, 1229212981],
  );
});

test('native-messaging frame codec round-trips', async () => {
  const { encodeFrame, decodeFrame } = await import(schemaPath + `?t=${Date.now() + 1}`);
  const cases = [
    { action: 'ping' },
    { action: 'download', url: 'https://example.com/a.bin', output: '/tmp/a.bin', connections: 4 },
  ];
  for (const obj of cases) {
    const buf = encodeFrame(obj);
    assert.ok(buf.length >= 4, 'frame must have length prefix');
    const len = buf.readUInt32LE(0);
    assert.equal(len, buf.length - 4, 'length prefix must equal payload size');
    const decoded = decodeFrame(buf);
    assert.deepEqual(decoded, obj);
    assert.equal(decoded.action, obj.action);
  }
  // raw payload must itself be valid JSON
  const buf = encodeFrame({ action: 'ping' });
  JSON.parse(buf.subarray(4).toString('utf8'));
});

test('request builders match host protocol and reject bad schemes', async () => {
  const { buildPing, buildDownload, HOST_ACTIONS } = await import(schemaPath + `?t=${Date.now() + 2}`);
  assert.equal(HOST_ACTIONS.PING, 'ping');
  assert.equal(HOST_ACTIONS.DOWNLOAD, 'download');

  assert.deepEqual(buildPing(), { action: 'ping' });

  const d = buildDownload({ url: 'https://example.com/a.bin', output: '/tmp/a.bin', connections: 3 });
  assert.equal(d.action, 'download');
  assert.equal(d.url, 'https://example.com/a.bin');
  assert.equal(d.output, '/tmp/a.bin');
  assert.equal(d.connections, 3);

  // scheme allow-list (defense in depth, host also enforces)
  for (const bad of ['ftp://x/y', 'file:///etc/passwd', 'javascript:alert(1)', 'data:text/plain,hi']) {
    assert.throws(() => buildDownload({ url: bad }), /scheme|http/i, `must reject ${bad}`);
  }
});

test('background.js binds the content port and correlates replies by id', () => {
  const src = readFileSync(bgPath, 'utf8');
  // content.js does runtime.connect({name:'idm-content'}) -> SW needs onConnect
  assert.ok(/chrome\.runtime\.onConnect\.addListener/.test(src), 'background must register onConnect');
  assert.ok(/idm-content/.test(src), 'background must handle the idm-content port');
  // host replies are matched via the echoed request id
  assert.ok(/msg\s*&&\s*msg\.id|msg\.id/.test(src), 'background must read msg.id for correlation');
  assert.ok(/pending\.(get|set)/.test(src), 'background must keep a pending map');
  // request is stamped with an id before posting to the host
  assert.ok(/id\s*[:=]\s*nextId|nextId\+\+/.test(src), 'background must assign a request id');
  // watchdog maps host absence to the documented error
  assert.ok(/cannot_contact_idm/.test(src), 'background must surface cannot_contact_idm');
});

test('native messaging host manifest is valid', () => {
  const p = join(ext, 'com.tonec.idm.json');
  assert.ok(existsSync(p), 'com.tonec.idm.json must exist');
  const m = JSON.parse(readFileSync(p, 'utf8'));
  assert.equal(m.name, 'com.tonec.idm', 'must match NATIVE_HOST in background.js');
  assert.equal(m.type, 'stdio', 'Chrome native messaging host type');
  assert.ok(typeof m.path === 'string' && m.path.endsWith('idm-host'), 'path must point at idm-host');
  assert.ok(Array.isArray(m.allowed_origins) && m.allowed_origins.length >= 1, 'needs allowed_origins');
  // background.js connects to exactly this host name
  const bg = readFileSync(bgPath, 'utf8');
  assert.ok(bg.includes(`'${m.name}'`) || bg.includes(`"${m.name}"`), 'background must connect to this host name');
});

test('the host binary the manifest names is built and executable', () => {
  const m = JSON.parse(readFileSync(join(ext, 'com.tonec.idm.json'), 'utf8'));
  // The committed manifest carries the absolute path of whichever checkout it
  // was last installed from (install-host.sh / install.sh rewrite it), so only
  // its file name is portable. What must hold everywhere is that THIS checkout
  // has that binary built — otherwise the browser would have nothing to talk to.
  const name = m.path.split('/').pop();
  assert.equal(name, 'idm-host', `manifest must point at idm-host, not ${m.path}`);
  const built = join(repoRoot, 'engine/target/release', name);
  assert.ok(existsSync(built), `host binary must be built: ${built}`);
  const st = statSync(built);
  assert.ok((st.mode & 0o111) !== 0, `host binary must be executable: ${built}`);
});

test('extension ID is pinned and matches allowed_origins', () => {
  const m = JSON.parse(readFileSync(manifestPath, 'utf8'));
  assert.ok(typeof m.key === 'string' && m.key.length > 100, 'manifest.json must pin a `key`');

  // Derive the extension ID from the pinned public key exactly like Chrome:
  // sha256(DER pubkey), first 16 bytes, hex digits a-p -> a-p letters.
  const der = Buffer.from(m.key, 'base64');
  const hex = createHash('sha256').update(der).digest('hex').slice(0, 32);
  const derived = [...hex].map((c) => String.fromCharCode(97 + parseInt(c, 16))).join('');

  const h = JSON.parse(readFileSync(join(ext, 'com.tonec.idm.json'), 'utf8'));
  const expected = `chrome-extension://${derived}/`;
  assert.ok(
    h.allowed_origins.includes(expected),
    `allowed_origins must contain derived ID ${expected}, got ${JSON.stringify(h.allowed_origins)}`,
  );
});

test('install-host.sh exists, is executable and installs the manifest', () => {
  const p = join(ext, 'install-host.sh');
  assert.ok(existsSync(p), 'install-host.sh must exist');
  const st = statSync(p);
  assert.ok((st.mode & 0o111) !== 0, 'install-host.sh must be executable');
  const src = readFileSync(p, 'utf8');
  assert.ok(/NativeMessagingHosts/.test(src), 'must target the NativeMessagingHosts dir');
  assert.ok(/com\.tonec\.idm/.test(src), 'must install the com.tonec.idm host manifest');
  assert.ok(/ln -s|symlink/.test(src), 'must symlink the manifest');
});

test('install-host.sh wires --allowed-dir through a wrapper script', () => {
  const src = readFileSync(join(ext, 'install-host.sh'), 'utf8');
  assert.ok(/--allowed-dir/.test(src), 'install script must pass --allowed-dir');
  assert.ok(/wrapper/i.test(src), 'install script must generate a wrapper');
});

test('install-host.sh generates a wrapper + installed manifest pointing at it', () => {
  const home = mkdtempSync(join(tmpdir(), 'idm_home_'));
  mkdirSync(join(home, '.config', 'google-chrome'), { recursive: true });
  const downloads = join(home, 'Downloads');
  const stateDir = join(home, '.local', 'share', 'idm-native');
  execFileSync('bash', [join(ext, 'install-host.sh')], {
    env: {
      ...process.env,
      HOME: home,
      XDG_DATA_HOME: join(home, '.local', 'share'),
      IDM_DOWNLOADS_DIR: downloads,
    },
    stdio: 'pipe',
  });

  const wrapper = join(stateDir, 'idm-host-wrapper.sh');
  assert.ok(existsSync(wrapper), `wrapper must be generated at ${wrapper}`);
  const wsrc = readFileSync(wrapper, 'utf8');
  assert.ok(wsrc.includes('--allowed-dir'), 'wrapper must pass --allowed-dir');
  assert.ok(wsrc.includes(downloads), 'wrapper must point at the downloads dir');
  assert.ok((statSync(wrapper).mode & 0o111) !== 0, 'wrapper must be executable');

  const installed = JSON.parse(readFileSync(join(stateDir, 'com.tonec.idm.json'), 'utf8'));
  assert.equal(installed.name, 'com.tonec.idm');
  assert.equal(installed.path, wrapper, 'installed manifest must point at the wrapper');
  assert.equal(installed.type, 'stdio');

  const link = join(home, '.config', 'google-chrome', 'NativeMessagingHosts', 'com.tonec.idm.json');
  assert.ok(existsSync(link), 'manifest must be linked into the browser dir');
});

test('the manifest asks for the contextMenus permission', () => {
  const m = JSON.parse(readFileSync(join(ext, 'manifest.json'), 'utf8'));
  assert.ok(
    (m.permissions || []).includes('contextMenus'),
    `"Download with IDM" needs the contextMenus permission, got: ${JSON.stringify(m.permissions)}`,
  );
});

test('the wrapper points the host at the GUI settings file', () => {
  const home = mkdtempSync(join(tmpdir(), 'idm_home_settings_'));
  const downloads = join(home, 'Downloads');
  const stateDir = join(home, '.local', 'share', 'idm-native');
  execFileSync('bash', [join(ext, 'install-host.sh')], {
    env: {
      ...process.env,
      HOME: home,
      XDG_DATA_HOME: join(home, '.local', 'share'),
      IDM_DOWNLOADS_DIR: downloads,
    },
    stdio: 'pipe',
  });

  // Without --settings the host answers get_settings with source "default",
  // so the Options dialog would have no effect on capture at all.
  const wsrc = readFileSync(join(stateDir, 'idm-host-wrapper.sh'), 'utf8');
  assert.ok(wsrc.includes('--settings'), 'wrapper must pass --settings');

  // It has to be the SAME file the GUI writes: install.sh starts the GUI with
  // --state-dir <dir>, and the GUI keeps settings.json inside it.
  const guiStateDir = join(home, '.local', 'share', 'idm-gui');
  assert.ok(
    wsrc.includes(join(guiStateDir, 'settings.json')),
    `wrapper must point at the GUI's settings.json, got: ${wsrc}`,
  );

  // The two halves must still agree about WHERE that file is. Since the
  // one-directory layout there is a single answer, $IDM_DIR/state, and both
  // sides have to be told it: install.sh hands IDM_STATE_DIR to the host
  // installer, and `idm --gui` starts the window with the same directory.
  const installSh = readFileSync(join(repoRoot, 'install.sh'), 'utf8');
  assert.match(installSh, /^STATE_DIR="\$IDM_DIR\/state"$/m,
    'install.sh must derive the state dir from IDM_DIR');
  assert.match(installSh, /IDM_STATE_DIR="\$STATE_DIR"/,
    'install.sh must pass that state dir to the host installer');
  const verbs = readFileSync(join(repoRoot, 'engine', 'src', 'verbs.rs'), 'utf8');
  assert.match(verbs, /\.arg\("--state-dir"\)\s*\n\s*\.arg\(dir\.join\("state"\)\)/,
    '`idm --gui` must start the window with $IDM_DIR/state');
});

test('content.js references the content->background opcodes', () => {
  const src = readFileSync(contentPath, 'utf8');
  // Each opcode should appear as a first element of a posted array.
  for (const op of [22, 29, 30, 31, 32, 33, 34, 39, 41]) {
    // opcode must be the first element of a posted array: [op, ...] or [op]
    const re = new RegExp(`\\[\\s*${op}\\s*[,\\]]`);
    assert.ok(re.test(src), `content.js must post opcode ${op}`);
  }
  assert.ok(/runtime\.connect/.test(src), 'content.js must open a port with runtime.connect');
});
