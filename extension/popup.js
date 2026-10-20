// popup.js — the extension "nabídka": pick a format and start a download.
//
// Flow:
//   1. read the active tab URL
//   2. ask the background for available formats (list_formats -> idm-host)
//   3. let the user choose, then send {type:'download', format, forceMedia}
//      so the host runs the engine (yt-dlp backend for media, Range for files).
//
// Classic script (loaded by popup.html), no modules.

(function () {
  'use strict';

  var elUrl = document.getElementById('url');
  var elFormat = document.getElementById('format');
  var elStatus = document.getElementById('status');
  var btnDownload = document.getElementById('download');
  var btnRefresh = document.getElementById('refresh');

  var currentUrl = '';

  function setStatus(text, kind) {
    elStatus.textContent = text || '';
    elStatus.className = kind === 'err' ? 'err' : kind === 'ok' ? 'ok' : 'muted';
  }

  function label(f) {
    var parts = [];
    if (f.format_id) parts.push('[' + f.format_id + ']');
    if (f.resolution) parts.push(f.resolution);
    if (f.ext) parts.push(f.ext);
    if (f.kind) parts.push(f.kind);
    return parts.join(' ') || 'format';
  }

  function renderFormats(formats) {
    elFormat.innerHTML = '';
    var best = document.createElement('option');
    best.value = '';
    best.textContent = 'nejlepší dostupný';
    elFormat.appendChild(best);

    (formats || []).forEach(function (f) {
      var o = document.createElement('option');
      o.value = f.format_id != null ? String(f.format_id) : '';
      o.textContent = label(f);
      elFormat.appendChild(o);
    });
  }

  // Ask the background about the current page: it may be a media page.
  function refresh() {
    setStatus('zjišťuji formáty…');
    chrome.runtime.sendMessage({ type: 'list_formats', url: currentUrl }, function (resp) {
      if (chrome.runtime.lastError) {
        setStatus('chyba: ' + chrome.runtime.lastError.message, 'err');
        return;
      }
      if (!resp || !resp.ok) {
        renderFormats([]);
        setStatus((resp && resp.error) || 'formáty nedostupné', 'err');
        return;
      }
      if (resp.title) {
        elUrl.textContent = resp.title + ' — ' + currentUrl;
      }
      renderFormats(resp.formats);
      setStatus('nalezeno ' + (resp.formats ? resp.formats.length : 0) + ' formátů', 'ok');
    });
  }

  function download() {
    var fmt = elFormat.value;
    setStatus('stahuji…');
    chrome.runtime.sendMessage(
      {
        type: 'download',
        url: currentUrl,
        format: fmt || undefined,
        forceMedia: true,
      },
      function (resp) {
        if (chrome.runtime.lastError) {
          setStatus('chyba: ' + chrome.runtime.lastError.message, 'err');
          return;
        }
        if (resp && resp.ok && resp.queued) {
          // The window is running and took it into its queue.
          setStatus('přidáno do IDM (#' + resp.gui_id + ') — průběh sleduj v okně IDM', 'ok');
        } else if (resp && resp.ok) {
          setStatus('hotovo: ' + (resp.output || '') + ' (' + resp.size + ' B)', 'ok');
        } else {
          setStatus('chyba: ' + ((resp && resp.error) || 'neznámá'), 'err');
        }
      },
    );
  }

  btnRefresh.addEventListener('click', refresh);
  btnDownload.addEventListener('click', download);

  chrome.tabs.query({ active: true, currentWindow: true }, function (tabs) {
    currentUrl = (tabs && tabs[0] && tabs[0].url) || '';
    elUrl.textContent = currentUrl || '(žádná URL)';
    if (currentUrl) refresh();
  });
})();
