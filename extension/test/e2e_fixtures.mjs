// Shared scaffolding for the real-browser E2E tests.
//
// The Chromium and Firefox harnesses differ only in how the browser is driven
// and where it looks for a native-messaging manifest; the origin they load,
// the bytes they download and the registration dance are identical, so they
// live here rather than in two copies that can drift apart.

import { createServer } from 'node:http';
import { mkdirSync, writeFileSync } from 'node:fs';
import { join } from 'node:path';
import zlib from 'node:zlib';

/** Deterministic pseudo-random bytes: same file every run, no fixtures on disk. */
export function makeData(len) {
  const buf = Buffer.allocUnsafe(len);
  for (let i = 0; i < len; i++) {
    buf[i] = (Math.imul(i >>> 0, 2654435761) >>> 13) & 0xff;
  }
  return buf;
}

export function crc32(buf) {
  return (zlib.crc32(buf) >>> 0).toString(16).padStart(8, '0');
}

/** A page with a <a download> and a <video>, serving Range requests. */
export function startServer(data) {
  return new Promise((resolve) => {
    const server = createServer((req, res) => {
      const u = new URL(req.url, 'http://x');
      if (u.pathname === '/') {
        res.writeHead(200, { 'Content-Type': 'text/html' });
        return res.end(
          '<!doctype html><html><body>'
            + '<video src="/movie.mp4"></video>'
            + '<a id="d" download="out.bin" href="/file.bin">dl</a>'
            + '</body></html>',
        );
      }
      if (u.pathname === '/movie.mp4') {
        res.writeHead(200, { 'Content-Length': 4, 'Content-Type': 'video/mp4' });
        return res.end(Buffer.from([0, 0, 0, 0]));
      }
      if (u.pathname === '/file.bin') {
        const total = data.length;
        const range = req.headers.range;
        if (req.method === 'HEAD') {
          res.writeHead(200, { 'Content-Length': total, 'Accept-Ranges': 'bytes', ETag: '"e"' });
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
        return res.end(data);
      }
      res.writeHead(404);
      res.end();
    });
    server.listen(0, '127.0.0.1', () => {
      resolve({ server, url: `http://127.0.0.1:${server.address().port}` });
    });
  });
}

/** Where a browser family looks for native-messaging manifests under a HOME. */
export function nativeHostDirs(family, { home, userDataDir }) {
  const config = join(home, '.config');
  if (family === 'firefox') {
    // Firefox reads one place, and from HOME directly rather than XDG config.
    return [join(home, '.mozilla', 'native-messaging-hosts')];
  }
  return [
    ...['chromium', 'google-chrome', 'chrome'].map((b) =>
      join(config, b, 'NativeMessagingHosts')),
    // Some builds resolve the manifest dir from the user data dir instead.
    ...(userDataDir ? [join(userDataDir, 'NativeMessagingHosts')] : []),
  ];
}

/**
 * idm-host is fail-closed: with no --allowed-dir it exits at once. The real
 * installer therefore registers a wrapper that supplies one, and the manifest
 * must point at the same shape of wrapper here or the browser just reports
 * "Native host has exited".
 */
export function writeWrapper({ home, hostBin, engineBin, allowedDir }) {
  const wrapper = join(home, 'idm-host-wrapper.sh');
  mkdirSync(home, { recursive: true });
  writeFileSync(
    wrapper,
    `#!/usr/bin/env bash\nexec "${hostBin}" --engine "${engineBin}" `
      + `--allowed-dir "${allowedDir}" "$@"\n`,
    { mode: 0o755 },
  );
  return wrapper;
}

/** Install the host manifest for `family` into every directory it may read. */
export function registerHost({ family, template, wrapper, home, userDataDir }) {
  const dirs = nativeHostDirs(family, { home, userDataDir });
  for (const dir of dirs) {
    mkdirSync(dir, { recursive: true });
    writeFileSync(
      join(dir, `${template.name}.json`),
      JSON.stringify({ ...template, path: wrapper }, null, 2),
    );
  }
  return dirs;
}
