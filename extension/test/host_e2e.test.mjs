// Cross-language end-to-end contract test.
//
// Purpose: the two halves were previously tested only in isolation —
//   * schema.js frame codec  (Node)
//   * idm-host               (Rust tests driving stdin/stdout directly)
// so nothing guaranteed they agree on wire format. This test drives the REAL
// `idm-host` binary using schema.js `encodeFrame`/`decodeFrame`, so an
// endianity or JSON-framing mismatch fails loudly.
//
// Runs with: node --test extension/test/host_e2e.test.mjs
//
// The host binary is located via $IDM_HOST_BIN, else the release/debug builds.

import test from 'node:test';
import assert from 'node:assert/strict';
import { readFileSync, existsSync, mkdirSync, mkdtempSync } from 'node:fs';
import { spawn } from 'node:child_process';
import { createServer } from 'node:http';
import { fileURLToPath } from 'node:url';
import { dirname, join } from 'node:path';
import { tmpdir } from 'node:os';
import { randomBytes } from 'node:crypto';
import zlib from 'node:zlib';
import { encodeFrame, decodeFrame, buildPing, buildDownload } from '../schema.js';

const here = dirname(fileURLToPath(import.meta.url));
const ext = join(here, '..');
const repoRoot = join(ext, '..');

function findHost() {
  const candidates = [
    process.env.IDM_HOST_BIN,
    join(repoRoot, 'engine/target/release/idm-host'),
    join(repoRoot, 'engine/target/debug/idm-host'),
  ].filter(Boolean);
  for (const c of candidates) {
    if (existsSync(c)) return c;
  }
  throw new Error(
    `idm-host binary not found; looked in:\n  ${candidates.join('\n  ')}\n` +
      'build it with: (cd engine && cargo build --release)',
  );
}

const HOST = findHost();
const ENGINE = HOST.replace(/idm-host$/, 'idm');

function makeData(len) {
  // Deterministic non-trivial bytes; same generator as the Rust tests.
  const buf = Buffer.allocUnsafe(len);
  for (let i = 0; i < len; i++) {
    buf[i] = (Math.imul(i >>> 0, 2654435761) >>> 13) & 0xff;
  }
  return buf;
}

/** Minimal Range-capable HTTP server. */
function startServer(data) {
  return new Promise((resolve) => {
    const server = createServer((req, res) => {
      const total = data.length;
      const range = req.headers.range;
      if (req.method === 'HEAD') {
        res.writeHead(200, {
          'Content-Length': total,
          'Accept-Ranges': 'bytes',
          ETag: '"e"',
        });
        return res.end();
      }
      if (range) {
        const m = /bytes=(\d+)-(\d*)/.exec(range);
        const a = parseInt(m[1], 10);
        const b = m[2] ? parseInt(m[2], 10) : total - 1;
        const slice = data.subarray(a, b + 1);
        res.writeHead(206, {
          'Content-Length': slice.length,
          'Content-Range': `bytes ${a}-${b}/${total}`,
          'Accept-Ranges': 'bytes',
        });
        return res.end(slice);
      }
      res.writeHead(200, { 'Content-Length': total, 'Accept-Ranges': 'bytes', ETag: '"e"' });
      res.end(data);
    });
    server.listen(0, '127.0.0.1', () => {
      const { port } = server.address();
      resolve({ server, url: `http://127.0.0.1:${port}` });
    });
  });
}

/**
 * Spawn idm-host, send one JSON value using schema.js encodeFrame, read the
 * reply using the SAME framing but decoded with schema.js decodeFrame.
 * Returns {value, rawLenBytes, rawBody} so the test can assert LE framing.
 */
function roundtrip(message, allowedDir) {
  return new Promise((resolve, reject) => {
    const child = spawn(HOST, ['--engine', ENGINE, '--allowed-dir', allowedDir], {
      stdio: ['pipe', 'pipe', 'ignore'],
    });
    const chunks = [];
    let got = Buffer.alloc(0);

    const timer = setTimeout(() => {
      child.kill('SIGKILL');
      reject(new Error('timeout waiting for host reply'));
    }, 30000);

    child.on('error', reject);
    child.stdout.on('data', (d) => {
      got = Buffer.concat([got, d]);
      if (got.length >= 4) {
        const len = got.readUInt32LE(0);
        if (got.length >= 4 + len) {
          const rawLen = got.subarray(0, 4);
          const body = got.subarray(4, 4 + len);
          clearTimeout(timer);
          let value;
          try {
            // Decode with schema.js — this is the cross-language assertion.
            value = decodeFrame(got.subarray(0, 4 + len));
          } catch (e) {
            child.kill('SIGKILL');
            return reject(e);
          }
          child.kill('SIGKILL');
          resolve({ value, rawLen, rawBody: body });
        }
      }
    });

    // Send using schema.js encodeFrame — the other cross-language assertion.
    child.stdin.write(encodeFrame(message));
    child.stdin.end();
    chunks.push(child);
  });
}

// --- reference CRC32 (Node zlib.crc32 is available on Node >= 20) ---
function crc32(buf) {
  if (typeof zlib.crc32 === 'function') {
    return (zlib.crc32(buf) >>> 0).toString(16).padStart(8, '0');
  }
  throw new Error('zlib.crc32 unavailable');
}

test('ping: schema.js frame -> idm-host -> schema.js decode', async () => {
  const req = { ...buildPing(), id: 1 };
  const pingDir = mkdtempSync(join(tmpdir(), 'idm_e2e_ping_'));
  const { value, rawLen, rawBody } = await roundtrip(req, pingDir);

  assert.equal(value.ok, true, `response: ${JSON.stringify(value)}`);
  assert.equal(value.msg, 'pong');
  assert.equal(value.id, 1, 'host must echo request id');

  // Wire-format proof: the length prefix is little-endian and equals body size.
  assert.equal(rawLen.readUInt32LE(0), rawBody.length, 'LE length prefix mismatch');
  assert.deepEqual(JSON.parse(rawBody.toString('utf8')), value);
});

test('download: schema.js request -> host spawns engine -> schema.js decode + CRC', async () => {
  const data = makeData(1_500_000);
  const { server, url } = await startServer(data);
  const dir = join(tmpdir(), `idm_e2e_${process.pid}_${randomBytes(4).toString('hex')}`);
  mkdirSync(dir, { recursive: true });
  const out = join(dir, 'out.bin');

  try {
    const req = {
      ...buildDownload({ url: `${url}/file.bin`, output: out, connections: 4 }),
      id: 7,
    };
    const { value } = await roundtrip(req, dir);

    assert.equal(value.ok, true, `download response: ${JSON.stringify(value)}`);
    assert.equal(value.id, 7, 'host must echo request id');
    assert.equal(value.size, data.length, 'reported size');

    // Independent CRC of what landed on disk.
    const onDisk = readFileSync(out);
    assert.equal(onDisk.length, data.length, 'file size on disk');
    assert.ok(onDisk.equals(data), 'file bytes must equal served bytes');

    const expected = crc32(data);
    assert.equal(value.crc32, expected, 'host-reported crc32 must match reference');
  } finally {
    server.close();
  }
});

test('error: schema.js request for bad scheme -> schema.js decode of host error', async () => {
  const req = { action: 'download', url: 'ftp://example.com/x', id: 99 };
  const errDir = mkdtempSync(join(tmpdir(), 'idm_e2e_err_'));
  const { value } = await roundtrip(req, errDir);
  assert.equal(value.ok, false);
  assert.equal(value.id, 99, 'error reply must echo id');
  assert.match(value.error, /scheme|http/i, `error text: ${value.error}`);
});
