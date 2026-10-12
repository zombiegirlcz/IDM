# IDM — vlastní download manager (reverse-engineered POC)

Replikace architektury Internet Download Manageru: multi-connection HTTP Range
stahování s resume, native-messaging host pro prohlížeč a MV3 extension.

> **Stav: POC.** Vše níže je ověřené testy (Rust + Node), ale **E2E v reálném
> Chrome ještě není ověřené** — nebylo spuštěno v prohlížeči. Testy ověřují
> protokol, manifesty a cross-language framing, ne běh v Chrome.

## Komponenty

```
content.js ──postMessage──► background.js ──native messaging──► idm-host ──spawn──► idm (engine)
   (MV3)        (opkódy)         (port)         (stdio rámce)      (Rust)         (multi-conn Range)
```

| Cesta | Co to je |
|---|---|
| `engine/` | Rust download engine (`idm`) + native-messaging host (`idm-host`) |
| `extension/` | MV3 extension (manifest, background, content, schema) |
| `PROTOCOL.md` | protokol vytěžený z reverzu IDM |
| `ENGINE_SPEC.md` | spec engine (retry, HLS/DASH roadmapa) |
| `carve/` | soubory vytáhlé z instalátoru IDM |

### Co engine umí

- **Multi-connection Range** stahování + **resume** (offset + ETag/Last-Modified)
- **Retry/backoff** a single-connection fallback (server bez `Accept-Ranges`)
- **Speed limit** (`--limit-rate`), **proxy** (`--proxy http://…` i `socks5://…`)
- **Cookies / Referer** (`--cookie`, `--referer`)
- **Media backend (yt-dlp)** — YouTube/Vimeo/Twitch/… a streamy (`.m3u8`/`.mpd`/`.f4m`):
  `--force-media`, `--format <ID>`, `--list-formats` (JSON se seznamem formátů)
- **Výběr formátů v prohlížeči** — popup (klik na ikonu) načte URL aktivní záložky,
  vypíše formáty a stáhne zvolený
- **Fronta** (`--queue FILE --output-dir DIR`), komentáře `#`, každá URL vlastní proces
- **Scheduler** (`--start-in SEC`, `--start-at HH:MM` / `YYYY-MM-DDTHH:MM`)
- **Auto-kategorizace** (`--category-dir BASE`) — Video/Music/Documents/Compressed/Programs/Other
- **Dynamická segmentace** (`--dynamic --min-split BYTES`) — za běhu štěpí pomalé segmenty podle rychlosti (jako IDM)

## 1) Build

Engine i host se staví z `engine/`:

```bash
cd engine
cargo build --release
# -> target/release/idm       (engine)
# -> target/release/idm-host  (native messaging host)
```

> **DŮLEŽITÉ:** `extension/com.tonec.idm.json` je **šablona** a její `"path"`
> míří na `/root/IDM/engine/target/release/idm-host`. **Release binárku je nutné
> před načtením extension postavit** (`cargo build --release`), jinak ji
> `install-host.sh` nenajde a Chrome hosta nenačte.
>
> `idm-host` navíc **vyžaduje `--allowed-dir`** (fail-closed: bez něj skončí
> s chybou a nic nezapíše). Chrome spouští hosta bez argumentů, takže
> `install-host.sh` vygeneruje wrapper skript, který `--allowed-dir` dodá, a do
> manifestu vloží cestu k tomuto wrapperu (viz krok 2).

## 2) Instalace native hosta

```bash
cd extension
./install-host.sh
```

Skript:

1. vygeneruje wrapper `~/.local/share/idm-native/idm-host-wrapper.sh`, který
   spouští `idm-host --engine <idm> --allowed-dir <downloads>`,
2. vygeneruje **instalovaný** manifest `~/.local/share/idm-native/com.tonec.idm.json`,
   jehož `"path"` míří na wrapper (a `allowed_origins` převezme ze šablony),
3. symlinkne tento instalovaný manifest do `NativeMessagingHosts` adresářů
   přítomných Chromium prohlížečů (`google-chrome`, `chromium`, `microsoft-edge`,
   `Brave-Browser`).

Download adresář lze změnit: `IDM_DOWNLOADS_DIR=/cesta ./install-host.sh`.

Ověření, že symlink vznikl a wrapper má `--allowed-dir`:

```bash
cat ~/.local/share/idm-native/idm-host-wrapper.sh   # obsahuje --allowed-dir
ls -l ~/.config/google-chrome/NativeMessagingHosts/com.tonec.idm.json
# očekáváno: symlink -> ~/.local/share/idm-native/com.tonec.idm.json
```

Odinstalace: `./install-host.sh --uninstall`

## 3) Načtení unpacked extension

1. Otevři `chrome://extensions`
2. Zapni **Developer mode** (vpravo nahoře)
3. **Load unpacked** → vyber `extension/`
4. Zkontroluj, že **ID extension je `gnhajaopemmibmjhkaafdebogmkkcljc`**

ID je deterministické — je odvozené z pole `key` v `extension/manifest.json`
(sha256 veřejného klíče → prvních 16 bajtů → písmena a–p). Stejné ID **musí**
být v manifestu hosta v `allowed_origins`, jinak Chrome hosta odmítne.
(Šablona `extension/com.tonec.idm.json` i vygenerovaný
`~/.local/share/idm-native/com.tonec.idm.json` mají stejné ID.)

Ověření shody ID:

```bash
cd extension
python3 - <<'PY'
import json, base64, hashlib
m = json.load(open('manifest.json'))
h = json.load(open('com.tonec.idm.json'))
der = base64.b64decode(m['key'])
eid = ''.join(chr(97 + int(c, 16)) for c in hashlib.sha256(der).hexdigest()[:32])
print('derived :', eid)
print('allowed :', h['allowed_origins'][0])
print('MATCH   :', ('chrome-extension://' + eid + '/') in h['allowed_origins'])
PY
# očekáváno: MATCH : True
```

## 4) Ověření, že host odpovídá (ping)

Otevři service worker extension (v `chrome://extensions` → **Inspect views:
service worker**) a v konzoli:

```js
chrome.runtime.sendMessage({ type: 'ping' }, console.log)
// očekáváno: { ok: true, msg: 'pong', ... }
```

Případně mimo prohlížeč (přímý stdio ping na hosta):

```bash
printf '\x06\x00\x00\x00{"action":"ping"}' | ./engine/target/release/idm-host --engine ./engine/target/release/idm
# odpověď: [4B LE len][JSON] {"ok":true,"msg":"pong"}
```

Zkus stáhnout soubor (spustí engine přes hosta):

```js
chrome.runtime.sendMessage(
  { type: 'download', url: 'https://example.com/soubor.zip', output: '/tmp/soubor.zip' },
  console.log,
)
```

## 5) Testy

Vše jedním příkazem (vyžaduje **Rust toolchain** a **Node 22+**):

```bash
npm test
```

`npm test` spouští `scripts/test.sh`, který postupně: (1) `cargo build --release`
(kvůli nasazené release binárce a guardu na její čerstvost), (2) `cargo test`,
(3) `node --test` na všechny `extension/test/*.test.mjs` **kromě** `chrome_e2e.test.mjs`
(ten potřebuje funkční Chromium + display, spouští se ručně).

**Požadavky:** Rust toolchain (`cargo`) a Node 22 nebo novější (`node --test`,
`zlib.crc32`). CI: `.github/workflows/test.yml` volá `npm test`.

### Rust

```bash
cd engine
cargo test
```

Pokrývá:
- `integration.rs` — multi-connection Range, fallback bez Range, kill+resume, retry při přerušení
- `host_protocol.rs` — rámcování, ping, spawn+CRC
- `host_security.rs` — odmítnutí non-http(s) URL, output mimo `--allowed-dir`, fail-closed bez `--allowed-dir`, `..` traversal, symlink escape
- `host_contract.rs` — host echo `id` (korelace odpovědí)
- `media_backend.rs` — yt-dlp backend se stub binárkou: seznam formátů, download s `-f`, auto-detekce media URL, `--no-media`
- `proxy.rs` — stahování přes **vlastní lokální HTTP forward proxy** (důkaz, že `--proxy` se opravdu použije) + CRC
- `queue.rs` — fronta: 3 URL z jednoho seznamu, CRC všech
- `schedule.rs` — `--start-in` zpozdí první požadavek (měřeno na origin serveru)
- `category.rs` — auto-kategorizace do `Video/`, `Music/`, `Documents/`, `Compressed/`, `Programs/`, `Other/`
- `host_category.rs` — host respektuje `category_dir` a soubor reálně skončí ve správné podsložce

### Extension (Node)

```bash
cd /root/IDM
node --test extension/test/
```

Pokrývá:
- `message_schema.test.mjs` — MV3 manifest, opkódy vs `PROTOCOL.md`, frame codec, scheme reject, onConnect/korelace `id`, host manifest + cesta na disku, pinned ID vs `allowed_origins`, `install-host.sh` (existence, wrapper s `--allowed-dir`, vygenerovaný instalovaný manifest)
- `host_e2e.test.mjs` — **cross-language**: `encodeFrame` ze `schema.js` → skutečný `idm-host` → `decodeFrame` (ping, download+CRC, chybový případ)
- `capture_dom.test.mjs` — **funkční DOM** (jsdom): reálné `<video>`/`<a download>`/klik → opkódy `[22]`/`[41]`/`[39]` → `background.js` → skutečný `idm-host` → soubor s CRC32
- `media_ui.test.mjs` — schéma pro `list_formats`/`normalizeFormats`/media download options (+ `category_dir`), manifest `action.default_popup`, popup skript (čte URL záložky, ptá se na formáty, posílá download)
- `release_host.test.mjs` — regresní guard na **nasazenou release binárku** (`target/release/idm-host`, ne `CARGO_BIN_EXE_*`): existence, **čerstvost** (nesmí být starší než `src/bin/idm_host.rs`) a fail-closed bez `--allowed-dir`

## Bezpečnost

- **Instalátor `idman643build15.exe` se NIKDY nespouští** — je `requireAdministrator`,
  Windows-only; na této mašině hrozí bootloop. Analýza je pouze statická.
- Host je trust boundary: validuje schéma URL (jen http/https) a output cestu
  **před** spuštěním procesu. `--allowed-dir` je **povinný** — bez něj host
  fail-closed skončí s chybou a nezapíše nic; v produkci ho dodává wrapper
  z `install-host.sh`.

## Co ještě NENÍ hotové

- **E2E v reálném Chrome** — neověřeno v prohlížeči (testy ověřují protokol, ne běh)
- **Plné GUI** — jen CLI + popup; chybí seznam stahování s progresem, pozastavit/pokračovat, odebrat
- **Shell integrace** — pravé tlačítko → „Stáhnout s IDM“
- **Dynamická segmentace podle rychlosti** — segmenty jsou statické
- **Windows / Android build** — engine je teď Linux (aarch64/x86_64)
- **Dynamická analýza `idmcchandler2_64.dll`** — blokováno (nutný Windows/Wine; zde jen statická analýza)
- HLS/DASH, proxy, throttle v engine (jen v `ENGINE_SPEC.md`)