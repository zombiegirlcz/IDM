// settings.js — capture-decision logic for the MV3 extension.
//
// The extension cannot read settings.json: it has no filesystem. The native
// host does, and answers `get_settings` with the capture-relevant subset
// (see docs/superpowers/specs/2026-10-14-extension-settings-channel-design.md).
// This module is what the extension then does with that answer, kept free of
// `chrome.*` so it can be tested straight from Node like schema.js.

// Mirrors the capture-relevant part of DEFAULT_SETTINGS in gui/idm_gui.py.
// Used when the host has no settings file to offer, so a missing or broken
// settings.json never silently switches capture off.
export const DEFAULT_CAPTURE_SETTINGS = Object.freeze({
  file_types: Object.freeze({
    auto: Object.freeze([
      '3gp', '7z', 'aac', 'ace', 'aif', 'arj', 'asf', 'avi', 'bin',
      'bz2', 'deb', 'dmg', 'doc', 'docx', 'epub', 'exe', 'flac', 'flv',
      'gz', 'iso', 'm4a', 'm4v', 'mkv', 'mov', 'mp3', 'mp4', 'mpeg',
      'msi', 'ogg', 'pdf', 'ppt', 'pptx', 'rar', 'rpm', 'tar', 'tgz',
      'txt', 'wav', 'webm', 'wma', 'wmv', 'xls', 'xlsx', 'zip',
    ]),
    exclude_sites: Object.freeze([]),
    exclude_addresses: Object.freeze([]),
  }),
  general: Object.freeze({ force_keys: 'Ctrl', prevent_keys: 'Alt' }),
  connection: Object.freeze({ max_connections: 8 }),
});

// keydown/keyup arrive from content.js as opcode 31 with a raw keyCode.
const KEY_CODES = { ctrl: 17, alt: 18, shift: 16 };

function strList(v, fallback) {
  if (!Array.isArray(v)) return fallback.slice();
  return v.filter((x) => typeof x === 'string');
}

function str(v, fallback) {
  return typeof v === 'string' ? v : fallback;
}

function posInt(v, fallback) {
  return Number.isInteger(v) && v > 0 ? v : fallback;
}

/**
 * Fill in anything the host did not send, and drop anything of the wrong type.
 * A single bad field must not take the rest of the settings down with it.
 */
export function normalizeCaptureSettings(raw) {
  const d = DEFAULT_CAPTURE_SETTINGS;
  const s = raw && typeof raw === 'object' ? raw : {};
  const ft = s.file_types && typeof s.file_types === 'object' ? s.file_types : {};
  const g = s.general && typeof s.general === 'object' ? s.general : {};
  const c = s.connection && typeof s.connection === 'object' ? s.connection : {};
  return {
    file_types: {
      auto: strList(ft.auto, d.file_types.auto),
      exclude_sites: strList(ft.exclude_sites, d.file_types.exclude_sites),
      exclude_addresses: strList(ft.exclude_addresses, d.file_types.exclude_addresses),
    },
    general: {
      force_keys: str(g.force_keys, d.general.force_keys),
      prevent_keys: str(g.prevent_keys, d.general.prevent_keys),
    },
    connection: {
      max_connections: posInt(c.max_connections, d.connection.max_connections),
    },
  };
}

/**
 * "Ctrl", "Alt", "Ctrl+Shift" -> the key codes that must be held. The Options
 * dialog stores these as free text, so unknown names are ignored and an empty
 * spec means "no such rule" rather than "always".
 */
export function parseKeySpec(spec) {
  if (typeof spec !== 'string') return [];
  const out = [];
  for (const part of spec.split('+')) {
    const code = KEY_CODES[part.trim().toLowerCase()];
    if (code !== undefined && !out.includes(code)) out.push(code);
  }
  return out;
}

function keyRuleFires(spec, heldKeys) {
  const want = parseKeySpec(spec);
  if (want.length === 0) return false;
  return want.every((code) => heldKeys.includes(code));
}

// A glob with `*` as the only metacharacter; everything else is literal.
function globMatches(pattern, value) {
  const escaped = pattern
    .toLowerCase()
    .replace(/[.*+?^${}()|[\]\\]/g, (ch) => (ch === '*' ? '\u0000' : `\\${ch}`))
    .split('\u0000')
    .join('.*');
  return new RegExp(`^${escaped}$`).test(value.toLowerCase());
}

function hostOf(url) {
  try {
    return new URL(url).hostname;
  } catch {
    return null;
  }
}

// The extension comes from the path only: ?token=… and #frag are not a suffix,
// and a query parameter that happens to end in .zip is not one either.
function extensionOf(url) {
  let path;
  try {
    path = new URL(url).pathname;
  } catch {
    return null;
  }
  const name = path.slice(path.lastIndexOf('/') + 1);
  const dot = name.lastIndexOf('.');
  if (dot <= 0 || dot === name.length - 1) return null;
  return name.slice(dot + 1).toLowerCase();
}

/**
 * Decide whether an automatically captured URL should be downloaded.
 *
 * @param {object} o
 * @param {string} o.url      the URL that would be downloaded
 * @param {string} [o.pageUrl] the page it was captured on (for exclude_sites)
 * @param {object|null} [o.settings] a get_settings payload, or null for defaults
 * @param {number[]} [o.heldKeys] key codes currently held in that tab
 * @returns {{capture: boolean, reason: string}}
 */
export function shouldCapture({ url, pageUrl, settings, heldKeys = [] }) {
  const s = normalizeCaptureSettings(settings);
  const held = Array.isArray(heldKeys) ? heldKeys : [];

  // Prevent before force: if both are bound to the same key, the safer rule wins.
  if (keyRuleFires(s.general.prevent_keys, held)) {
    return { capture: false, reason: 'prevent_key' };
  }
  if (keyRuleFires(s.general.force_keys, held)) {
    return { capture: true, reason: 'force_key' };
  }

  if (typeof url !== 'string' || !url) return { capture: false, reason: 'bad_url' };

  for (const pattern of s.file_types.exclude_addresses) {
    if (globMatches(pattern, url)) return { capture: false, reason: 'excluded_address' };
  }

  const host = hostOf(pageUrl) || hostOf(url);
  if (host === null) return { capture: false, reason: 'bad_url' };
  for (const pattern of s.file_types.exclude_sites) {
    if (globMatches(pattern, host)) return { capture: false, reason: 'excluded_site' };
  }

  const ext = extensionOf(url);
  const auto = s.file_types.auto.map((e) => e.replace(/^\./, '').toLowerCase());
  if (ext !== null && auto.includes(ext)) return { capture: true, reason: 'auto_type' };
  return { capture: false, reason: 'not_auto_type' };
}
