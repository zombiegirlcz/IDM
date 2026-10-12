# IDM protokol — poznatky z reverzu

Zdroj: `idman643build15.exe` v6.43.15.1 (Tonec Inc.), PE32 x86 + overlay kontejner.
Čistý zdroj protokolu: `carve/0090fee2_content.js` (19 921 B, CRC32 OK, `node --check` PASS).
Soubory: `carve/` (fáze A), `carve2/`, `carve3/` (pokusy o rekonstrukci — neúspěšné).

---

## 1. Architektura

```
content.js (scrape DOM)  --browser.runtime.connect + postMessage-->  background.js
                                                                        |
                                                       runtime.connectNative("com.tonec.idm")
                                                                        |
                                                                        v
                                                native messaging host = idmcchandler2_64.dll
                                                                        |
                                                       (named pipe / stdio)
                                                                        v
                                                        idman.exe / idmBroker.exe
```

- **Native host: `com.tonec.idm`** — persistentní port (`connectNative`, ne `sendNativeMessage`).
- Watchdog 1500 ms, handlery `onMessage` (`this.wb`) / `onDisconnect`.
- Chybová zpráva: `"cannot_contact_idm"`.

### Dvě izolované vrstvy content.js

1. **Content ↔ background** — `browser.runtime.connect()` → port `this.a`, zprávy = pole `[op, ...]`.
2. **Content ↔ page (MAIN world)** — `window.postMessage` s magickými konstantami.

---

## 2. Dispatch tabulka — content.js → background (`this.a.postMessage([op,...])`)

| op | args | význam |
|----|------|--------|
| 22 | `b, a, c, d` | detekce média/objektu (element + geometrie) |
| 23 | `null, b.g, !0 / !a, c` | změna stavu média (id elementu, přehrávání) |
| 24 | `a, a && a.src, c, d` | element s URL (link/media) |
| 25 | `a, c, b.url` | URL + kontext |
| 26 | `b.clientX, b.clientY, this.R()` | pohyb myši + devicePixelRatio |
| 28 | — | (init/idle signál) |
| 29 | — | klik / aktivita (`this.zb()`) |
| 30 | `b.innerWidth, b.innerHeight` | resize okna (`this.yb`) |
| 31 | `b.keyCode, isKeydown` | klávesa (jen E={16,17,18,45,46}: Ctrl/Alt/Shift/Insert/Delete) |
| 32 | `b.button, true/false` | stisk/puštění tlačítka myši |
| 33 | — | fokus/aktivita (`this.rb()`) |
| 34 | `id, outerHTML-snippet` | serializace DOM elementu (zkrácený HTML) |
| 35 | `b, e, l` | kontext elementu |
| 36 | `a[1], a[2]` | přeposlání z hosta (media event) |
| 37 | `1,1,e` / `1,2,k` | media sub-event (video/audio) |
| 39 | `hasAttribute("download"), href, download` | **klik na odkaz ke stažení** |
| 41 | `e, localName, src\|\|data, a, c, d` | `<video>/<audio>/<object>/<embed>` (`F=video,audio,object,embed`) |
| 42 | `kind, src` | **vlastní rozšíření**: uživatel stiskl tlačítko Download v panelu nad videem |

## 3. Dispatch tabulka — background → content (`this.xb` → `switch(b.shift())`)

| op | handler | význam |
|----|---------|--------|
| 11 | `this.$a` | konfigurace/příkaz A |
| 12 | `this.bb` | scan odkazů (dle regexu) |
| 13 | `this.Ta = b.shift()` | jednorázové přiřazení hodnoty (např. session id) |
| 14 | `this.fb` | konfigurace B |
| 15 | `this.gb` | nastavení kontextu elementu |
| 16 | `this.hb` | aktualizace elementu |
| 17 | `this.ab` | timeout/aktivita (`this.ga=setTimeout(this.Z,3000)`) |
| 18 | `this.eb` | dokončení / cleanup |

## 4. Konfigurační zprávy `this.Y` (`f.Bb(b,a)` → `switch(this.Y=b)`)

Režim sběru, který si background vyžádá:

| Y | režim |
|---|-------|
| 1 | média/streamy — regexy: cíl (`ta`), odkaz (`L`), přípony (`l`, split `/[|:]/`), 4× extra regex (`ua`,`va`,`wa`,`xa`) |
| 2 | obecný dokument — target (`c`), atributy (`A`), selektory `:root:empty` fallback |
| 3 | selektivní (jen regex `sa`) |
| 4 | odkazy — `c`, `ra`, `A`, `Oa` (atributy) |
| 5 | fallback (`this.G(arguments)` guard) |

Incoming `f.U(b)` → `switch(this.Y){case 1:ob; 2:kb; 4:lb; 3:nb; 5:mb}` — spouští sběr dle režimu.

## 5. Content ↔ page bridge (MAIN world)

Izolovaný content script ↔ injectovaný skript přes `window.postMessage`:

| směr | konstanta | payload |
|------|-----------|---------|
| page → content | `1229212977` | `[cfg..., X, o, Ua, c, A]` |
| content → page | `1229212978` | `[X, o, Ua, c, A]` (odpověď) |
| page → content | `1229212979` | → forward jako `[36, a1, a2]` |
| content → page | `1229212980` | `[a, e]` |
| page → content | `1229212981` | `this.Xa(a[1], a[2])` (video event) |

Guard: `b.origin==O` (stejný origin).

## 6. Rozpoznávané typy/přípony

- Streamy: `M3U8`, `MPD` (DASH), `F4M` (HDS), `FLV`, `MP3`, `MP4`, `WEBM`, `WAV`, `AVI`
- Archivy: `ZIP`, `RAR`, `TAR`, `SRT`
- Protokoly: `GET`, `POST`, `xmlhttprequest`, `socks5` (proxy)
- Rámce: `main_frame`, `sub_frame`, `media`, `image`, `object`, `xmlhttprequest`, `iframe`, `popup`
- Okna: `normal`, `minimized`, `maximized`, `fullscreen`, `complete`, `idle`
- Strategie: `blocking` (webRequest), `JSON`, `string`, `direct`, `basic`

---

## 7. Ověření výstupů (fáze A)

| soubor | velikost | CRC32 | node --check |
|--------|----------|-------|--------------|
| `0090fee2_content.js` | 19 921 B | ✅ | ✅ PASS |
| `00878d04_welcome.html` | 8 842 B | ✅ | — |
| `008f8d62/0090fa79/00aa9780_captured.html` | 2 677/2 524/2 700 B | ✅ | — |
| `008f30d7_background.js` | 58 247 B | ❌ scramble | ❌ |
| `00909edb_background.js` | 57 654 B | ❌ scramble | ❌ |
| `00aa9c2b_content.js` | 27 859 B | ❌ scramble | ❌ |
| `images/logo128.png` ×3 | — | ❌ | — |
| `components2/idmcchandler2_64.dll` | 461 848 B (oček.) | ❌ | — |

**Zjištění:** `background.js` ocas je *scramblovaný* (`wnloads`=`downloads`, `tooltip_tle:d`=`tooltip_title:`), ne jen useknutý → oprava dopočtem konce nemožná. DLL stream `e4 bd 79 7c …`, entropie 7.9979, žádný další MZ/PE v souboru → proprietární transformace/preset-dictionary.

## 8. TODO / další fáze

- [ ] **Fáze B**: vlastní Rust engine — multi-connection HTTP Range + resume/ETag (spec: `ENGINE_SPEC.md`)
- [ ] CLI prototyp (důkaz konceptu), ověřit CRC32 staženého souboru
- [ ] Dynamická analýza DLL (Windows/Wine + devtools SW, Procmon, Wireshark)
- [ ] Rozhodnout finální stack (Rust engine + Tauri PC + Compose Android + TS/MV3 extension)