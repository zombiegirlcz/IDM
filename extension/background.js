// background.js — MV3 service worker for the IDM-like capture extension.
//
// Responsibilities:
//   * keep a persistent native-messaging port to `com.tonec.idm` (our `idm-host`)
//   * receive capture messages from content.js (opcode arrays from PROTOCOL.md)
//   * forward download requests to the host and surface results
//
// The service worker is ESM (manifest background.type = "module"), so it can
// import the shared schema.

import {
  buildDownload,
  buildListFormats,
  buildPing,
  normalizeFormats,
  CONTENT_TO_BG,
  HOST_ACTIONS,
} from './schema.js';

const NATIVE_HOST = 'com.tonec.idm';
const WATCHDOG_MS = 1500;

/** @type {chrome.runtime.Port | null} */
let nativePort = null;
let nextId = 1;
const pending = new Map(); // id -> {resolve, reject, timer}

function log(...a) {
  console.log('[idm-bg]', ...a);
}

function ensurePort() {
  if (nativePort) return nativePort;

  nativePort = chrome.runtime.connectNative(NATIVE_HOST);
  log('connectNative', NATIVE_HOST);

  // Watchdog: if the host does not answer a request, fail it.
  nativePort.onDisconnect.addListener(() => {
    const err = chrome.runtime.lastError;
    log('native port disconnected', err ? err.message : '');
    nativePort = null;
    for (const [, p] of pending) {
      clearTimeout(p.timer);
      p.reject(new Error('cannot_contact_idm'));
    }
    pending.clear();
  });

  nativePort.onMessage.addListener((msg) => {
    // The host replies with {ok, ...} plus an echoed request id when present.
    const id = msg && msg.id;
    const entry = id !== undefined ? pending.get(id) : undefined;
    if (entry) {
      clearTimeout(entry.timer);
      pending.delete(id);
      entry.resolve(msg);
    } else {
      log('unsolicited host message', msg);
    }
  });

  return nativePort;
}

function sendToHost(request) {
  const port = ensurePort();
  const id = nextId++;
  const framed = { ...request, id };
  return new Promise((resolve, reject) => {
    const timer = setTimeout(() => {
      pending.delete(id);
      reject(new Error('cannot_contact_idm'));
    }, WATCHDOG_MS * 20); // generous for real downloads
    pending.set(id, { resolve, reject, timer });
    try {
      port.postMessage(framed);
    } catch (e) {
      clearTimeout(timer);
      pending.delete(id);
      reject(e);
    }
  });
}

// ---- content.js message handling (opcodes from PROTOCOL.md) ----

const C2B = new Set(CONTENT_TO_BG);

// A UI/content request turned into a host reply, shared by both entry points.
function handleRequest(msg, reply) {
  if (!msg || typeof msg !== 'object') return false;
  if (msg.type === 'ping') {
    sendToHost(buildPing()).then(reply, (e) => reply({ ok: false, error: String(e) }));
    return true;
  }
  if (msg.type === 'list_formats' && msg.url) {
    let req;
    try {
      req = buildListFormats({ url: msg.url, cookie: msg.cookie, referer: msg.referer });
    } catch (e) {
      reply({ ok: false, error: String(e) });
      return false;
    }
    sendToHost(req).then(
      (r) => reply({ ok: true, ...normalizeFormats(r) }),
      (e) => reply({ ok: false, error: String(e) }),
    );
    return true;
  }
  if (msg.type === 'download' && msg.url) {
    let req;
    try {
      req = buildDownload({
        url: msg.url,
        output: msg.output,
        connections: msg.connections,
        format: msg.format,
        forceMedia: msg.forceMedia,
        limitRate: msg.limitRate,
        cookie: msg.cookie,
        referer: msg.referer,
      });
    } catch (e) {
      reply({ ok: false, error: String(e) });
      return false;
    }
    sendToHost(req).then(reply, (e) => reply({ ok: false, error: String(e) }));
    return true;
  }
  return false;
}

// content.js opens a long-lived port via runtime.connect({name:'idm-content'}).
chrome.runtime.onConnect.addListener((port) => {
  if (port.name !== 'idm-content') return;
  log('content port connected', port.sender?.tab?.id);
  port.onMessage.addListener((msg) => {
    if (Array.isArray(msg) && C2B.has(msg[0])) {
      handleCapture(msg, port.sender);
    } else {
      handleRequest(msg, (r) => port.postMessage(r));
    }
  });
  port.onDisconnect.addListener(() => log('content port disconnected'));
});

chrome.runtime.onMessage.addListener((msg, sender, sendResponse) => {
  // content.js posts arrays [op, ...args]
  if (Array.isArray(msg) && C2B.has(msg[0])) {
    handleCapture(msg, sender);
    return false;
  }
  // UI / dev requests (ping, list_formats, download)
  return handleRequest(msg, sendResponse);
});

function handleCapture(arr, sender) {
  const op = arr[0];
  switch (op) {
    // 39: click on an element with the `download` attribute -> capture URL
    case 39: {
      const [, hasDownload, href, name] = arr;
      if (href) captureDownload(href, name, sender);
      break;
    }
    // 41: media element (<video>/<audio>/<object>/<embed>) with a src
    case 41: {
      const [, , localName, src] = arr;
      if (src) captureMedia(src, localName, sender);
      break;
    }
    // 24/25: element with URL / URL + context
    case 24:
    case 25: {
      const url = arr[1] || arr[3];
      if (typeof url === 'string' && /^https?:/i.test(url)) captureDownload(url, undefined, sender);
      break;
    }
    // 34: serialized DOM snippet (debug)
    case 34:
      log('dom snippet', arr[1], arr[2]);
      break;
    default:
      // 22/23/26/28/29/30/31/32/33/35/36/37: activity signals; not downloads.
      break;
  }
}

function captureDownload(url, filename, sender) {
  log('capture download', url, filename || '', sender?.tab?.url || '');
  let req;
  try {
    req = buildDownload({ url, connections: 4 });
  } catch (e) {
    log('rejected capture', String(e));
    return;
  }
  sendToHost(req)
    .then((r) => log('host result', r))
    .catch((e) => log('host error', String(e)));
}

function captureMedia(src, kind, sender) {
  log('capture media', kind, src, sender?.tab?.url || '');
}

// Expose for testing/debug in the SW console.
self.idmHostActions = HOST_ACTIONS;