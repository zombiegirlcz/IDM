# IDM — poznámky pro Claude Code

Replikace architektury Internet Download Manageru: multi-connection HTTP Range
stahování s resume, native-messaging host pro prohlížeč, MV3 extension a
nativní Tk okno.

**Stav.** Verze 0.1.5, instalace přes `install.sh` / `install.ps1` stahuje
hotové binárky z GitHub release. Všechno leží v jedné složce `$IDM_DIR`
(výchozí `~/.idm`, na Windows `%USERPROFILE%\.idm`).

Co je **ověřené uživatelem**: CLI engine — stáhne video ze stránky (yt-dlp
cesta), resume, `--aria2`, trezor na hesla.

Co je **ověřené testem reálného prohlížeče**: celý řetěz záchytu v Chromiu
i ve Firefoxu — důvěryhodný klik na `<a download>` → `content.js` →
`background.js` → `connectNative` → `idm-host` → engine → soubor s přesným
CRC32. Oba jsou **blokující** CI joby (`chrome-e2e`, `firefox-e2e`), ne
`continue-on-error`.

Co **ověřené není**: nativní okno v běžném provozu a UI rozšíření mimo ten
jeden řetěz (popup, Options, context menu) — ty pokrývají jen jsdom testy.
Ruční průchod prohlížečem u sebe se nedělal. Netvrdit o nich, že fungují.

## Kde co je

| Cesta | Co to je |
|---|---|
| `engine/` | Rust: engine `idm` + native-messaging host `idm-host` |
| `engine/src/gui.rs` | HTTP API pro okno (`idm --serve`) + fronta + vestavěné web UI |
| `engine/src/media.rs` | yt-dlp backend (video stránky, formáty) |
| `engine/src/secrets.rs` | šifrovaný trezor na hesla (`secrets.json`) |
| `gui/idm_gui.py` | nativní okno (Tk, stdlib-only — žádná nativní závislost) |
| `engine/src/verbs.rs` | slovesa `--gui` / `update` / `uninstall` / `--version` + `uninstall_plan` |
| `extension/` | MV3: `background.js`, `content.js`, `settings.js` (filtry záchytu) |
| `extension/manifest.json` | **jeden manifest pro oba prohlížeče** — `service_worker` čte Chrome, `scripts` Firefox |
| `extension/com.tonec.idm*.json` | manifesty hosta: Chrome (`allowed_origins`) a Firefox (`allowed_extensions`) |
| `extension/test/marionette.mjs` | klient Marionette (pohání reálný Firefox, žádná závislost) |
| `test/`, `gui/test/`, `extension/test/`, `engine/tests/` | čtyři sady testů |
| `docs/superpowers/specs/` | design dokumenty |

## Testy

```bash
npm test               # Node sady: extension + GUI + instalátor + oba prohlížeče
WITH_RUST=1 npm test   # celá matice včetně cargo build --release a cargo test
node --test gui/test/  # jen okno (nejčastější smyčka)
```

**Sedm kroků, ne pět.** Krok 6 je reálné Chromium (Playwright), krok 7 reálný
Firefox (Marionette). Oba mají gate (`chromeE2eMode`, `firefoxE2eMode`): když
prohlížeč chybí nebo **nenastartuje**, krok se přeskočí s uvedeným důvodem;
`RUN_CHROME_E2E=1` / `RUN_FIREFOX_E2E=1` z toho přeskočení udělají chybu, takže
CI job nemůže projít tím, že netestuje nic.

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
- **Chromium v nepodporovaném kernelu umře SIGTRAPem (exit 133)** okamžitě,
  bez jediné CHECK hlášky — a stejně tak Playwrightův vlastní build. Proto gate
  binárku **smoke-spustí** na `about:blank`; existence souboru nic neznamená.
  (Na kernelu 4.14/aarch64 tady Chromium nejede, Firefox ano.)
- **`IFS=$'\t' read` kolabuje posloupnost tabulátorů**, protože tab je IFS
  whitespace. Prázdné pole tím posune všechna další doleva — `skip` bez binárky
  doručil svůj důvod do kolonky `xvfb`. Proto `formatDecision()` píše `-`,
  nikdy prázdno.
- **`free_port()` platí i pro port serveru, nejen pro origin.** Testy v jednom
  binárce běží paralelně, takže dva dostanou stejné číslo; poražený `idm
  --serve` skončí na „address in use", ale `connect` projde, protože tam
  poslouchá vítěz — a test pak řídí cizí server, dokud ho jeho majitel
  nezabije (`ConnectionReset`). Port je náš, jen dokud žije **náš** potomek:
  `start_server()` v `engine/tests/gui.rs`.
- **To samé platí o číslu X displeje.** `probe_displays()` vidí jen sockety,
  které existují ve chvíli, kdy se dívá. Zotavení je v `open_display()`:
  odmítnuté číslo jde do busy a plán se posune dál.
- **Fronta se o skutečném jménu souboru dozví z `--report`**, ne ze stdout
  (ten je zahozený). yt-dlp si vybírá kontejner sám, takže `-o clip.mp4` často
  vyrobí `clip.webm`; report smí položku přejmenovat **jen v rámci jejího
  adresáře** (`accept_reported_file`).
- **Engine soubor preallokuje**, takže cílové velikosti dosáhne dávno před
  dopsáním obsahu. E2E musí čekat na **CRC**, ne na velikost.
- **Import testovacího modulu ten test spustí** (`node:test` se rozjede sám),
  takže `node -e "import(...)"` jako kontrola syntaxe nastartuje prohlížeč.
  Na syntaxi je `node --check`.
- **Firefox MV3 nebere `background.service_worker`** („currently disabled. Add
  background.scripts") a native messaging povoluje podle **gecko id**, ne podle
  `chrome-extension://` originu.
- **`Icon=` v `.desktop` musí být absolutní cesta k souboru.** Dřív tam bylo
  `Icon=download`, což je jméno ikony z tématu, a `assets/idm.png` se vůbec
  neinstalovalo — proto se ikona na ploše nevykreslila. Na Windows totéž:
  `shell32.dll,167` je index do cizí knihovny.
- **Komentář spolkne pokračovací `\`.** V `install.sh` tak zmizel celý `curl`
  a zbyl řádek začínající `-o "$PREFIX/bin/$f"`, který bash zkusil spustit.
  `bash -n` to přijme; hlídá to test na tvar řádků v `test/install.test.mjs`.
- `settings.json`, `queue.json` i `secrets.json` se píšou **atomicky
  (tmp + rename) s 0600**. Zápis na místo nechává čtenáře vidět torzo.

## Instalační layout

```
$IDM_DIR/   bin/ (idm, idm-host, ensure-aria2.sh)  gui/  assets/
            extension/  native/  state/  VERSION  install.sh
```

Mimo složku patří jen symlink `~/.local/bin/idm` a manifesty hostů
v konfiguračních adresářích prohlížečů — jinde je prohlížeč nehledá. Do rc
souborů jde **jeden ohraničený blok** (`# >>> IDM >>>`): `export IDM_DIR`
a pojistka, která přidá `~/.local/bin` na PATH, jen když tam není.

- **`idm-host` zůstává samostatnou binárkou.** Je to jediný článek, který
  ověřuje reálný prohlížeč, a native-messaging manifesty neumějí argumenty —
  sloučení do `idm` by znamenalo rozhodování podle `argv[0]`.
- **Slovesa se dispatchují před `Args::parse()`** (`verbs::dispatch`). `url`
  je nepovinný poziční argument, takže clap by `update` snědl jako URL.
  První argument, který není přesně jedno z těch slov, propadne do dnešního
  parseru beze změny. Daň: `--help` je musí vypsat ručně (`AFTER_HELP`).
- **`install-host.sh` a `install-shell.sh` berou `IDM_STATE_DIR`
  a `IDM_NATIVE_DIR`.** Bez toho si sáhnou na staré XDG cesty a rozmažou
  instalaci zpátky do tří adresářů — a to **během téže instalace**, která
  právě stav přestěhovala.
- **Zástupce na Windows míří na `pythonw.exe`, ne na `idm.exe --gui`.**
  `idm.exe` je konzolová binárka, takže by `.lnk` blikal konzolí.

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
- **Firefox add-on není podepsaný.** E2E ho instaluje jako `temporary`, což
  vydrží do zavření prohlížeče. Trvalá instalace chce podpis z AMO (nebo
  Developer/ESR edici s `xpinstall.signatures.required=false`); `install.sh`
  zaregistruje jen hosta, samotné rozšíření si uživatel musí nahrát sám.
- **`--screenshot` je jednorázový snímek, ne stream.** Živé sledování okna by
  chtělo x11vnc, které vědomě není součástí. Snímek se bere až po prvním
  načtení fronty, aby okno nebylo prázdné.
- **Jméno řádku u médií je `-o` + přípona od yt-dlp**, ne titulek videa.
  Dvě různá YouTube videa tak můžou vyjít jako `watch.webm` a `watch.f616.mp4`.
  `media::output_name()` umí titulek, ale fronta ho nepoužívá.
- `idm --version` neexistuje (clap hlásí `unexpected argument`); okno bere
  verzi z `VERSION` v `idm_gui.py`.
- Na originu leží větev `security-audit-fixes`, kterou tahle session
  nevytvořila ani se jí nedotkla.
