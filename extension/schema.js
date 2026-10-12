// schema.js — shared protocol constants and helpers for the MV3 extension.
//
// Derived from the IDM reverse-engineering (see ../PROTOCOL.md):
//   * opcodes content.js -> background.js (posted as [op, ...args])
//   * opcodes background.js -> content.js (switch(b.shift()))
//   * page <-> content main-world magic constants (window.postMessage)
//   * native-messaging frame codec ([4B LE length][JSON]) for `idm-host`
//
// This module is ESM so it can be imported by the MV3 service worker
// (background.js, type: module) and by Node tests.

// --- content.js -> background.js opcodes (observed in the original) ---
export const CONTENT_TO_BG = Object.freeze([
  22, // media/object detect (element + geometry)
  23, // media state change (element id, playing)
  24, // element with URL (link/media)
  25, // URL + context
  26, // mouse move + devicePixelRatio
  28, // init/idle signal
  29, // click / activity
  30, // window resize (innerWidth, innerHeight)
  31, // key (Ctrl/Alt/Shift/Insert/Delete)
  32, // mouse button down/up
  33, // focus / activity
  34, // DOM element serialization (id, outerHTML snippet)
  35, // element context
  36, // forward from host (media event)
  37, // media sub-event (video/audio)
  39, // click on a download link (download, href, name)
  41, // <video>/<audio>/<object>/<embed>
]);

// --- background.js -> content.js opcodes ---
export const BG_TO_CONTENT = Object.freeze([
  11, // config/command A -> this.$a
  12, // scan links by regex -> this.bb
  13, // one-off assignment (e.g. session id) -> this.Ta
  14, // config B -> this.fb
  15, // set element context -> this.gb
  16, // element update -> this.hb
  17, // timeout/activity -> this.ab
  18, // completion / cleanup -> this.eb
]);

// --- page (MAIN world) <-> content script magic constants ---
export const PAGE_MAGIC = Object.freeze({
  REQ: 1229212977, // page -> content: config
  RESP: 1229212978, // content -> page: ack/config echo
  FWD: 1229212979, // page -> content: forward as [36, a1, a2]
  ACK: 1229212980, // content -> page: ack
  EVENT: 1229212981, // page -> content: video event (Xa)
});

// --- host protocol actions (must match src/bin/idm_host.rs) ---
export const HOST_ACTIONS = Object.freeze({
  PING: 'ping',
  DOWNLOAD: 'download',
  LIST_FORMATS: 'list_formats',
});

const ALLOWED_SCHEMES = ['http:', 'https:'];

/**
 * Enforce the http/https allow-list. Defense in depth: `idm-host` also checks,
 * but we never want to hand a bad URL to the native host in the first place.
 * @param {string} url
 * @returns {string} the same url
 */
export function assertHttpUrl(url) {
  if (typeof url !== 'string' || url.length === 0) {
    throw new TypeError('url must be a non-empty string');
  }
  let parsed;
  try {
    parsed = new URL(url);
  } catch {
    throw new TypeError(`invalid url: ${url}`);
  }
  if (!ALLOWED_SCHEMES.includes(parsed.protocol)) {
    throw new TypeError(`url scheme not allowed (only http/https): ${url}`);
  }
  return url;
}

/** Build the `ping` request for the native host. */
export function buildPing() {
  return { action: HOST_ACTIONS.PING };
}

/**
 * Build a `download` request for the native host.
 *
 * Media options (all optional) are only added when provided, so a plain file
 * download stays a plain Range request:
 *   format      — yt-dlp format selector ("140", "137+140", ...)
 *   forceMedia  — always use the yt-dlp backend, even for non-media URLs
 *   limitRate   — speed limit in bytes/second
 *   cookie      — raw Cookie header value
 *   referer     — Referer header value
 *
 * @param {{url: string, output?: string, connections?: number,
 *          format?: string, forceMedia?: boolean, limitRate?: number,
 *          cookie?: string, referer?: string}} opts
 */
export function buildDownload({ url, output, connections, format, forceMedia, limitRate, cookie, referer, proxy, categoryDir } = {}) {
  assertHttpUrl(url);
  const req = { action: HOST_ACTIONS.DOWNLOAD, url };
  if (output !== undefined) req.output = output;
  if (connections !== undefined) {
    const n = Number(connections);
    if (!Number.isInteger(n) || n < 1 || n > 64) {
      throw new RangeError(`connections out of range: ${connections}`);
    }
    req.connections = n;
  }
  if (format !== undefined) {
    if (typeof format !== 'string' || format.length === 0) {
      throw new TypeError('format must be a non-empty string');
    }
    req.format = format;
  }
  if (forceMedia !== undefined) req.force_media = Boolean(forceMedia);
  if (limitRate !== undefined) {
    const n = Number(limitRate);
    if (!Number.isFinite(n) || n < 0) {
      throw new RangeError(`limitRate out of range: ${limitRate}`);
    }
    req.limit_rate = Math.floor(n);
  }
  if (cookie !== undefined) req.cookie = String(cookie);
  if (referer !== undefined) req.referer = String(referer);
  if (proxy !== undefined) req.proxy = String(proxy);
  if (categoryDir !== undefined) req.category_dir = String(categoryDir);
  return req;
}

/**
 * Build a `list_formats` request (media backend) for the native host.
 * @param {{url: string, cookie?: string, referer?: string}} opts
 */
export function buildListFormats({ url, cookie, referer, proxy } = {}) {
  assertHttpUrl(url);
  const req = { action: HOST_ACTIONS.LIST_FORMATS, url };
  if (cookie !== undefined) req.cookie = String(cookie);
  if (referer !== undefined) req.referer = String(referer);
  if (proxy !== undefined) req.proxy = String(proxy);
  return req;
}

/**
 * Normalize a `list_formats` host reply into a stable shape for the UI.
 * @param {unknown} reply
 * @returns {{title: string|null, id: string|null, formats: Array<object>}}
 */
export function normalizeFormats(reply) {
  const r = reply && typeof reply === 'object' ? reply : {};
  const formats = Array.isArray(r.formats) ? r.formats : [];
  return {
    title: typeof r.title === 'string' ? r.title : null,
    id: typeof r.id === 'string' ? r.id : null,
    formats,
  };
}

/**
 * Encode a value as a Chrome native-messaging frame:
 *   [4-byte little-endian length][JSON payload]
 * @param {unknown} value
 * @returns {Buffer}
 */
export function encodeFrame(value) {
  const body = Buffer.from(JSON.stringify(value), 'utf8');
  const out = Buffer.allocUnsafe(4 + body.length);
  out.writeUInt32LE(body.length, 0);
  body.copy(out, 4);
  return out;
}

/**
 * Decode a single frame from a Buffer and return the decoded value.
 * @param {Buffer} buf
 */
export function decodeFrame(buf) {
  if (!Buffer.isBuffer(buf) || buf.length < 4) {
    throw new RangeError('frame too short');
  }
  const len = buf.readUInt32LE(0);
  if (buf.length < 4 + len) {
    throw new RangeError('truncated frame body');
  }
  const body = buf.subarray(4, 4 + len).toString('utf8');
  return JSON.parse(body);
}

/**
 * Decode a frame and also return the unconsumed remainder, for streaming use.
 * @param {Buffer} buf
 * @returns {{value: unknown, rest: Buffer}}
 */
export function decodeFrameWithRest(buf) {
  const value = decodeFrame(buf);
  const len = buf.readUInt32LE(0);
  return { value, rest: buf.subarray(4 + len) };
}
