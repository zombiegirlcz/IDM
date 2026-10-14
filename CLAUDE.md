# IDM — poznámky pro Claude Code

Replikace architektury Internet Download Manageru: multi-connection HTTP Range
stahování s resume, native-messaging host pro prohlížeč, MV3 extension a
nativní Tk okno.

**Stav.** Verze 0.1.5, instalace přes `install.sh` / `install.ps1` stahuje
hotové binárky z GitHub release.

Co je **ověřené uživatelem**: CLI engine — stáhne video ze stránky (yt-dlp
cesta), resume, `--aria2`, trezor na hesla.

Co **ověřené není**: chování extension v prohlížeči a nativní okno v běžném
provozu. Pokrývají je testy (protokol, opcode, filtry záchytu, stavba okna
pod xvfb), ale ruční průchod reálným Chrome se nedělal — `chrome_e2e.test.mjs`
je v CI `continue-on-error`. Netvrdit o nich, že fungují.

## Kde co je

| Cesta | Co to je |
|---|---|
| `engine/` | Rust: engine `idm` + native-messaging host `idm-host` |
| `engine/src/gui.rs` | HTTP API pro okno (`idm --serve`) + fronta + vestavěné web UI |
| `engine/src/media.rs` | yt-dlp backend (video stránky, formáty) |
| `engine/src/secrets.rs` | šifrovaný trezor na hesla (`secrets.json`) |
| `gui/idm_gui.py` | nativní okno (Tk, stdlib-only — žádná nativní závislost) |
| `extension/` | MV3: `background.js`, `content.js`, `settings.js` (filtry záchytu) |
| `test/`, `gui/test/`, `extension/test/`, `engine/tests/` | čtyři sady testů |
| `docs/superpowers/specs/` | design dokumenty |

## Testy

```bash
npm test               # Node sady: extension + GUI + instalátor. Žádný Rust.
WITH_RUST=1 npm test   # celá matice včetně cargo build --release a cargo test
node --test gui/test/  # jen okno (nejčastější smyčka)
```

**Rust se ověřuje v CI, ne lokálně.** `npm test` proto Rust přeskakuje; kroky
1 a 2 ve `scripts/test.sh` jedou jen při `WITH_RUST=1`, které nastavuje CI.
Bez té proměnné se `extension/test/release_host.test.mjs` přeskočí (nebyla
důvod stavět binárku), s ní je guard tvrdý jako dřív.

Lokální `cargo build --release` je v pořádku, když o něj uživatel výslovně
požádá nebo když je potřeba nainstalovat novou binárku — ne jako způsob
ověřování změn.

Čekání na CI: `gh run list -L 1`, `gh run watch <id> --exit-status`,
`gh run view <id> --log-failed`.

## Jak tady pracovat

- **TDD bez výjimky.** Nejdřív padající test, spustit ho, přesvědčit se, že
  padá ze správného důvodu, až pak implementace. U Rustu to znamená
  commitnout testy, pushnout na větev, nechat CI předvést RED, a číslo toho
  běhu uvést v commit message implementace.
- **Rozhodovací logika do čisté funkce**, ne do obsluhy widgetu. Zavedená
  praxe: `shouldCapture` (extension), `category_for_node`, `media_options`,
  `redact_options`, `completion_action`, `format_labels`, `releaseHostMode`.
  Testuje se ta funkce, GUI jen prokliká.
- Větev + CI + merge `--no-ff` u změn, které se dotýkají Rustu; drobnosti
  v Pythonu/JS jdou přímo na `master`, když je lokální sada zelená.
- Commit message anglicky: krátký imperativní titulek, tělo vysvětlující
  **proč**, a `Co-Authored-By: Claude Opus 5 <noreply@anthropic.com>`.

## Pasti, na které se tady už šlo

- **`execFileSync` v testu blokuje event loop**, takže inline `node:http`
  server neodpoví, dokud jiný testovací soubor běží. Origin musí být
  samostatný proces (`spawn('python3', ['-m','http.server', …])` + čekání na
  TCP) a GUI dostat vlastní `--addr`.
- **`free_port()` port jen najde a pustí.** Paralelní test ho může zabrat a
  odpovědět daty — pro „nikdo neposlouchá" používej port 9 (discard).
- **Malý soubor dojde do `done` dřív**, než na něj test sáhne. Stav je
  `running` (ne `downloading`), a „pomalý" origin musí být dost pomalý:
  4 MB po 16 kB/40 ms je ~10 s, což nestačí.
- **Stub yt-dlp (`engine/tests/media_backend.rs`) loguje argv jen při
  `STUB_LOG`.** Bez něj testy padají na chybějícím logu, ne na chybě v kódu.
- **Dva agenti ve worktree si můžou zavést stejnou věc** (dvakrát
  `_RecordingApi`); git to smerguje bez konfliktu a Python první definici
  zastíní. Po merge vždy projet celou sadu.
- `settings.json`, `queue.json` i `secrets.json` se píšou **atomicky
  (tmp + rename) s 0600**. Zápis na místo nechává čtenáře vidět torzo.

## Hesla

Hesla ze Site Logins **nejsou na disku v plaintextu** — jsou v
`STATE_DIR/secrets.json` (ChaCha20-Poly1305), v `settings.json` a
`queue.json` je jen `password_ref` / `auth_ref`. Klíč jde do OS keyringu
(feature `keyring`, zapnutá v release buildu) nebo do `secrets.key` 0600, a
Options → Site Logins vždy ukazuje, která varianta platí.

Pravidla, která se nesmí porušit:
- do enginu heslo jen **proměnnou prostředí** (`--auth-env`), nikdy argv;
- `GET /api/items` heslo nevrací, čtecí endpoint na trezor **neexistuje**;
- migrace plaintextu běží při **zápisu**, ne při čtení, a když se zápis do
  trezoru nepovede, **plaintext zůstane** (ztratit heslo je horší);
- trezor označený `key:"keyring"` nikdy nesmí spadnout na soubor s klíčem.

Design: `docs/superpowers/specs/2026-10-14-auth-at-rest-design.md`.

## Release

```bash
# verze na jednom čísle: gui/idm_gui.py VERSION, engine/Cargo.toml, Cargo.lock
# (hlídá gui/test/version_sync.test.mjs)
git tag -a v0.1.6 -m "…" && git push origin v0.1.6
```

Tag spustí `release.yml`: staví **s `--features keyring`** (Linux joby k tomu
instalují `libdbus-1-dev`) a nahraje archivy + `.sha256`, které si instalátory
ověřují. `cargo generate-lockfile` stačí na aktualizaci `Cargo.lock` bez
kompilace.

## Co zůstává otevřené

- **Proxy heslo** je chráněné slaběji než heslo k serveru: z `/api/items` a ze
  selftest výpisů se rediguje, ale v `queue.json` a v argumentu `--proxy`
  pořád je. Krok 2 specu to vědomě odložil.
- **Site login pro grabber** a offline konverze odkazů (bod 4 roadmapy)
  zůstaly mimo rozsah.
- `idm --version` neexistuje (clap hlásí `unexpected argument`); okno bere
  verzi z `VERSION` v `idm_gui.py`.
- Na originu leží větev `security-audit-fixes`, kterou tahle session
  nevytvořila ani se jí nedotkla.
