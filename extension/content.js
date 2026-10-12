// content.js — classic (non-module) content script for the IDM-like capture
// extension. Mirrors the capture behaviour of the original IDM content script
// (carve/0090fee2_content.js) but with our own, smaller opcode surface.
//
// It posts arrays `[op, ...args]` to background.js via chrome.runtime.connect.
// Opcodes are those documented in ../PROTOCOL.md.

(function () {
  if (window.__idm_init__) return;
  if (!/^https?:$/.test(location.protocol)) return;
  window.__idm_init__ = true;

  var EXT = typeof browser !== 'undefined' ? browser : chrome;
  var port = null;
  var queued = [];

  function connect() {
    try {
      port = EXT.runtime.connect({ name: 'idm-content' });
      port.onDisconnect.addListener(function () {
        port = null;
        window.__idm_init__ = false;
      });
      for (var i = 0; i < queued.length; i++) port.postMessage(queued[i]);
      queued = [];
    } catch (e) {
      port = null;
    }
  }

  function post(msg) {
    if (!port) connect();
    if (port) {
      try {
        port.postMessage(msg);
        return;
      } catch (e) {
        port = null;
      }
    }
    queued.push(msg);
  }

  // --- opcode 29: activity/click ---
  function onActivity() {
    post([29]);
  }

  // --- opcode 30: window resize ---
  function onResize() {
    post([30, window.innerWidth, window.innerHeight]);
  }

  // --- opcode 33: focus ---
  function onFocus() {
    post([33]);
  }

  // --- opcode 31: keys (only Ctrl/Alt/Shift/Insert/Delete, as in the original) ---
  var INTERESTING_KEYS = { 16: true, 17: true, 18: true, 45: true, 46: true };
  function onKey(e) {
    if (INTERESTING_KEYS[e.keyCode]) {
      post([31, e.keyCode, e.type === 'keydown']);
    }
  }

  // --- opcode 32: mouse button down/up ---
  function onMouseDown(e) {
    post([32, e.button, true]);
  }
  function onMouseUp(e) {
    post([32, e.button, false]);
  }

  // --- opcode 39: click on a link with `download` / a direct file href ---
  function isDownloadLink(el) {
    if (!el || el.localName !== 'a') return false;
    if (el.hasAttribute('download')) return true;
    return /\.(zip|rar|7z|tar|gz|exe|msi|pdf|mp4|mp3|m3u8|flv|iso|dmg)(\?|#|$)/i.test(el.href || '');
  }

  function onLinkClick(e) {
    var el = e.target;
    while (el && el.localName !== 'a') el = el.parentElement;
    if (!isDownloadLink(el)) return;
    post([39, el.hasAttribute('download'), el.href, el.getAttribute('download') || '']);
  }

  // --- opcode 41: media elements ---
  function mediaKind(el) {
    var n = el.localName;
    if (n === 'video' || n === 'audio' || n === 'object' || n === 'embed') return n;
    return null;
  }

  // opcode 22: media/object detect (element + geometry)
  function rectOf(el) {
    try {
      var r = el.getBoundingClientRect();
      return [Math.round(r.left), Math.round(r.top), Math.round(r.width), Math.round(r.height)];
    } catch (e) {
      return [0, 0, 0, 0];
    }
  }

  // opcode 34: element serialization helper (short, safe outerHTML snippet)
  function serialize(el) {
    if (!el) return '';
    var html = el.outerHTML || '';
    return html.slice(0, html.indexOf('>') + 1);
  }

  function onMediaFound(el) {
    var kind = mediaKind(el);
    if (!kind) return;
    var src = el.currentSrc || el.src || el.data || '';
    // 22: notify background of the media element + its geometry
    post([22, kind, src, rectOf(el)[0], rectOf(el)[1]]);
    // 41: full media element descriptor
    post([41, el, kind, src, 0, 0, 0]);
    // 34: serialized DOM snippet for debugging
    post([34, serialize(el)]);
  }

  function scanMedia() {
    var nodes = document.querySelectorAll('video, audio, object, embed');
    for (var i = 0; i < nodes.length; i++) onMediaFound(nodes[i]);
  }

  // ---- wire up listeners ----
  connect();

  document.addEventListener('click', function (e) {
    onActivity();
    onLinkClick(e);
  }, true);
  document.addEventListener('mousedown', onMouseDown, true);
  document.addEventListener('mouseup', onMouseUp, true);
  document.addEventListener('keydown', onKey, true);
  document.addEventListener('keyup', onKey, true);
  window.addEventListener('resize', onResize);
  window.addEventListener('focus', onFocus);

  if (document.readyState === 'loading') {
    document.addEventListener('DOMContentLoaded', scanMedia);
  } else {
    scanMedia();
  }

  // Expose for tests/debug.
  window.__idm_serialize__ = serialize;
})();