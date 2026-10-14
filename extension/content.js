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
      while (queued.length) {
        var m = queued.shift();
        try {
          port.postMessage(m);
        } catch (e) {
          // Drop a message that cannot be delivered rather than stalling the
          // whole queue behind it.
        }
      }
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
        // A message the structured clone algorithm rejects would fail forever;
        // only a transport failure is worth re-queueing.
        if (/clone|serial/i.test(String(e && e.message))) return;
        port = null;
      }
    }
    // Bounded: a page we can never reach must not grow this without limit.
    if (queued.length < 200) queued.push(msg);
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

  // --- links inside the current selection ---
  //
  // The context menu's "Download all links with IDM" needs these: Chrome gives
  // the background only `selectionText`, never the DOM behind it. Read-only —
  // it collects hrefs and starts nothing by itself.
  function linksInSelection() {
    var out = [];
    var sel = window.getSelection ? window.getSelection() : null;
    if (!sel || sel.rangeCount === 0) return out;
    var anchors = document.querySelectorAll('a[href]');
    for (var i = 0; i < anchors.length; i++) {
      var a = anchors[i];
      for (var r = 0; r < sel.rangeCount; r++) {
        if (sel.getRangeAt(r).intersectsNode(a)) {
          if (out.indexOf(a.href) === -1) out.push(a.href);
          break;
        }
      }
    }
    return out;
  }

  // Losing focus (Alt+Tab, a new tab from a Ctrl+click) means the keyup for a
  // held modifier is delivered somewhere else and never reaches us, so release
  // them all here. The background uses this state for force_keys/prevent_keys.
  function onBlur() {
    for (var code in INTERESTING_KEYS) {
      post([31, Number(code), false]);
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
    // Only a real user gesture may trigger a download: a page can dispatch a
    // synthetic click on a crafted <a download> and would otherwise get the
    // native host to fetch an arbitrary URL without the user doing anything.
    if (!e.isTrusted) return;
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
    // 41: full media element descriptor. The element slot carries a serialized
    // snippet, never the live node — a DOM node cannot be structured-cloned and
    // the throw would take the whole port down.
    post([41, serialize(el), kind, src, 0, 0, 0]);
    // 34: serialized DOM snippet for debugging
    post([34, serialize(el)]);
  }

  function scanMedia() {
    var nodes = document.querySelectorAll('video, audio, object, embed');
    for (var i = 0; i < nodes.length; i++) onMediaFound(nodes[i]);
    injectPanels();
  }

  // --- opcode 42: user pressed the in-page download button for a media element ---
  function onPanelDownload(kind, src) {
    if (!src) return;
    post([42, kind, src]);
  }

  // --- small floating "Download" panel over each media element (videos only) ---
  var PANEL_ATTR = 'data-idm-panel';
  function makePanel(el, kind, src) {
    var box = document.createElement('div');
    box.setAttribute(PANEL_ATTR, '1');
    box.style.cssText = [
      'position:absolute',
      'z-index:2147483647',
      'background:rgba(17,17,17,.85)',
      'color:#fff',
      'font:12px system-ui,sans-serif',
      'padding:4px 6px',
      'border-radius:6px',
      'box-shadow:0 1px 6px rgba(0,0,0,.4)',
      'pointer-events:auto',
    ].join(';');

    var btn = document.createElement('button');
    btn.textContent = 'Download';
    btn.style.cssText = [
      'background:#2d6cdf',
      'color:#fff',
      'border:0',
      'border-radius:4px',
      'padding:3px 8px',
      'cursor:pointer',
      'font:12px system-ui,sans-serif',
    ].join(';');
    btn.addEventListener('click', function (e) {
      if (!e.isTrusted) return;
      e.preventDefault();
      e.stopPropagation();
      onPanelDownload(kind, el.currentSrc || el.src || el.data || src);
    });

    box.appendChild(btn);
    return box;
  }

  function positionPanel(box, el) {
    var r = rectOf(el);
    box.style.left = (r[0] + window.scrollX + 8) + 'px';
    box.style.top = (r[1] + window.scrollY + 8) + 'px';
  }

  // One scroll/resize handler for all panels, instead of a pair per media
  // element that nothing ever removes. Panels whose element left the document
  // are dropped here, which is also what cleans up their DOM nodes.
  var panels = [];
  function repositionPanels() {
    for (var i = panels.length - 1; i >= 0; i--) {
      var p = panels[i];
      if (!p.el.isConnected) {
        p.box.remove();
        p.el.removeAttribute('data-idm-panel-for');
        panels.splice(i, 1);
        continue;
      }
      positionPanel(p.box, p.el);
    }
  }
  window.addEventListener('scroll', repositionPanels, { passive: true });
  window.addEventListener('resize', repositionPanels);

  function injectPanel(el) {
    var kind = mediaKind(el);
    if (!kind) return;
    if (el.getAttribute('data-idm-panel-for')) return;
    el.setAttribute('data-idm-panel-for', '1');
    var src = el.currentSrc || el.src || el.data || '';
    if (!src) return;
    var box = makePanel(el, kind, src);
    document.body.appendChild(box);
    positionPanel(box, el);
    panels.push({ box: box, el: el });
  }

  function injectPanels() {
    var nodes = document.querySelectorAll('video');
    for (var i = 0; i < nodes.length; i++) injectPanel(nodes[i]);
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
  window.addEventListener('blur', onBlur);

  // The background asks for the selection when the user picks the context menu
  // item. This is the only request content.js answers; everything else it does
  // is one-way (opcodes posted on the port).
  if (chrome.runtime && chrome.runtime.onMessage) {
    chrome.runtime.onMessage.addListener(function (msg, sender, reply) {
      if (msg && msg.type === 'links_in_selection') {
        reply({ ok: true, links: linksInSelection() });
        return true;
      }
      return false;
    });
  }

  if (document.readyState === 'loading') {
    document.addEventListener('DOMContentLoaded', scanMedia);
  } else {
    scanMedia();
  }

  // Expose for tests/debug. Pure predicates only — never anything that could
  // make the page itself start a download.
  window.__idm_links_in_selection__ = linksInSelection;
  window.__idm_serialize__ = serialize;
  window.__idm_is_download_link__ = isDownloadLink;
})();