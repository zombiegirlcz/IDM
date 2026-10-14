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
  DEFAULT_CAPTURE_SETTINGS,
  normalizeCaptureSettings,
  shouldCapture,
} from './settings.js';
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
// How long a get_settings answer is trusted. Short enough that editing the
// Options dialog takes effect without restarting the browser, long enough that
// a page full of links does not spawn a round trip per link.
const SETTINGS_TTL_MS = 30000;

/** @type {chrome.runtime.Port | null} */
let nativePort = null;
/** Cached get_settings answer: {at: epoch ms, value: normalized settings}. */
let settingsCache = null;
/** In-flight get_settings, so a burst of captures shares one round trip. */
let settingsInflight = null;
/** Modifier keys currently held, per tab: Map<tabId, Set<keyCode>>. */
const heldKeys = new Map();
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
    // The host may come back with a different settings file; do not keep
    // answering from an answer given by a process that no longer exists.
    settingsCache = null;
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

// ---- settings ----

// The extension has no filesystem; settings.json is reachable only through the
// host's `get_settings` action. A failure here is never fatal: capture falls
// back to the defaults in settings.js rather than switching itself off.
async function getCaptureSettings() {
  if (settingsCache && Date.now() - settingsCache.at < SETTINGS_TTL_MS) {
    return settingsCache.value;
  }
  if (!settingsInflight) {
    settingsInflight = sendToHost({ action: 'get_settings' })
      .then((r) => (r && r.ok ? normalizeCaptureSettings(r.settings) : DEFAULT_CAPTURE_SETTINGS))
      .catch((e) => {
        log('get_settings failed, using defaults', String(e));
        return DEFAULT_CAPTURE_SETTINGS;
      })
      .then((value) => {
        settingsCache = { at: Date.now(), value };
        settingsInflight = null;
        return value;
      });
  }
  return settingsInflight;
}

// ---- held modifier keys (opcode 31) ----

const TRACKED_KEYS = new Set([16, 17, 18]); // shift, ctrl, alt

function tabIdOf(sender) {
  const id = sender && sender.tab && sender.tab.id;
  return typeof id === 'number' ? id : -1;
}

function noteKey(sender, keyCode, down) {
  if (!TRACKED_KEYS.has(keyCode)) return;
  const tab = tabIdOf(sender);
  let set = heldKeys.get(tab);
  if (!set) {
    if (!down) return;
    set = new Set();
    heldKeys.set(tab, set);
  }
  if (down) set.add(keyCode);
  else set.delete(keyCode);
}

// A key held when a tab closes would otherwise stay held forever.
if (chrome.tabs && chrome.tabs.onRemoved) {
  chrome.tabs.onRemoved.addListener((tabId) => heldKeys.delete(tabId));
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
  port.onDisconnect.addListener(() => {
    log('content port disconnected');
    // The page is gone, so any key it reported as held will never be reported
    // as released: a Ctrl+click that navigates would otherwise leave the force
    // key stuck down for every later capture in this tab.
    heldKeys.delete(tabIdOf(port.sender));
  });
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
    // 42: user pressed the in-page download button -> download the media
    case 42: {
      const [, kind, src] = arr;
      if (src) captureDownload(src, undefined, sender);
      break;
    }
    // 31: Ctrl/Alt/Shift state, needed for force_keys / prevent_keys
    case 31: {
      const [, keyCode, down] = arr;
      noteKey(sender, keyCode, down);
      break;
    }
    // 34: serialized DOM snippet (debug)
    case 34:
      log('dom snippet', arr[1], arr[2]);
      break;
    default:
      // 22/23/26/28/29/30/32/33/35/36/37: activity signals; not downloads.
      break;
  }
}

async function captureDownload(url, filename, sender) {
  const pageUrl = sender?.tab?.url || '';
  log('capture download', url, filename || '', pageUrl);

  const settings = await getCaptureSettings();
  const held = [...(heldKeys.get(tabIdOf(sender)) || [])];
  const verdict = shouldCapture({ url, pageUrl, settings, heldKeys: held });
  if (!verdict.capture) {
    log('capture skipped', verdict.reason, url);
    return;
  }

  let req;
  try {
    req = buildDownload({ url, connections: settings.connection.max_connections });
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