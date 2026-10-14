# HTTP autentizační údaje v klidu: trezor místo plaintextu

Datum: 2026-10-14

## Problém

Heslo k serveru, které uživatel zadá v Options → Site Logins, dnes leží
v plaintextu ve dvou souborech, projde argumentem procesu a vrací se v odpovědi
`/api/items`. Žádný z těch tří kanálů není omylem — každý vznikl jako nejkratší
cesta k funkčnímu resume — ale dohromady znamenají, že „heslo k mému NASu" je
čitelné pro každý proces běžící pod stejným uživatelem a pro každého, kdo získá
API token.

Skutečný stav, čtený z kódu:

**Zdroj.** `gui/idm_gui.py:418` — `DEFAULT_SETTINGS["site_logins"]` je seznam
záznamů `{"url", "user", "password"}`. Dialog je na `gui/idm_gui.py:2515-2551`
(`login_lb`, `_upsert_site_login`, `_delete_site_login`;
`gui/idm_gui.py:674-700`). `gui/idm_gui.py:610-620` (`save_settings`) ty záznamy
zapíše do `STATE_DIR/settings.json` přes `json.dump` — atomicky, ale **bez
jakéhokoli `chmod`**, tedy s právy podle umask (typicky 0644).

**Transformace.** `site_login_for()` (`gui/idm_gui.py:803-829`) složí
`"user:password"` do jednoho stringu; `download_options()` ho vrátí pod klíčem
`auth` (`gui/idm_gui.py:905`).

**Kanál.** `Api.add()` (`gui/idm_gui.py:243`) vloží `auth` do JSON těla
`POST /api/add` na loopbacku. Server ho přečte na `engine/src/gui.rs:823`
do `AddOptions.auth` (`engine/src/gui.rs:360`) a uloží na
`engine/src/gui.rs:408` do `Item.auth` (`engine/src/gui.rs:114`).

**Disk.** `Item` je `Serialize` (`engine/src/gui.rs:91`), takže `save()`
(`engine/src/gui.rs:306-311`) zapíše `auth` doslovně do
`STATE_DIR/queue.json`. Bez `chmod`. Pro srovnání: `api-token` vedle něj práva
0600 dostane (`engine/src/gui.rs:1044-1046`), `queue.json` ne.

**Spuštění.** `run_item()` předá `--auth <user:password>` dětskému procesu jako
argument (`engine/src/gui.rs:519-520`). Engine ho přijme na
`engine/src/main.rs:94`, uloží do `Net.auth` (`engine/src/main.rs:176`,
plněno na `engine/src/main.rs:1599`) a použije jako `basic_auth`
(`engine/src/main.rs:188-195`).

### Kde to uniká

| # | Místo | Co uteče a komu |
|---|---|---|
| 1 | `gui/idm_gui.py:610-620` | `settings.json` s `site_logins[].password` v plaintextu, práva dle umask (0644) |
| 2 | `engine/src/gui.rs:306-311` + `engine/src/gui.rs:114` | `queue.json` s `auth: "user:password"`, práva dle umask |
| 3 | `engine/src/gui.rs:519-520` | `--auth user:password` v `argv` dětského procesu → čitelné z `/proc/<pid>/cmdline` a `ps` pro každý proces na stroji (na Linuxu bez `hidepid` i pro jiné uživatele) |
| 4 | `engine/src/gui.rs:806-809` (`GET /api/items`) | celý `Item` včetně `auth` se vrací každému, kdo má API token — tedy i vestavěné webové UI, které token má vepsaný ve stránce (`engine/src/gui.rs:791-795`) |
| 5 | `engine/src/gui.rs:823` (`POST /api/add`) | heslo cestuje po loopbacku v nešifrovaném HTTP těle |
| 6 | `gui/idm_gui.py:4218` (`selftest_download_options`) | `print("OPTIONS:" + json.dumps(opts))` vypíše `auth` na stdout |
| 7 | `gui/idm_gui.py:4258` (`selftest_add_body`) | `print("BODY:" + ...)` vypíše celé tělo `/api/add` včetně `auth` na stdout |
| 8 | `gui/idm_gui.py:413-414`, `:889-892`, `:780-801` | `proxy.proxy_pass` je stejný problém o jedno okno dál: `proxy_with_credentials()` ho vloží do proxy URL, ta jde do `settings.json`, do `queue.json` (`Item.proxy`) i do `argv` (`engine/src/gui.rs:516-517`) |

Co **neuniká**, a je dobré to zaznamenat, aby se to omylem nerozbilo:
native-messaging rámce. `idm_host` posílá prohlížeči jen explicitní whitelist
pěti polí (`engine/src/bin/idm_host.rs:311-337`, `capture_subset`), takže
`auth` ani `proxy` se do rozšíření nikdy nedostanou; `engine/tests/host_settings.rs:107`
to drží testem. Rozšíření samo o `auth` nikdy neslyší — `grep -n auth extension/*.js`
nevrací nic. `aria2` backend (`engine/src/main.rs:1266-1310`) `--auth` dnes
nepřeposílá vůbec, takže ani tam heslo neopouští proces.

## Cíl

1. Heslo nikdy neleží na disku v plaintextu — ani v `settings.json`, ani
   v `queue.json`.
2. Heslo se nikdy neobjeví v `argv`, v `/api/*` odpovědi ani na stdout.
3. Existující instalace s plaintextem dál funguje a sama se jednorázově
   zmigruje.
4. Nulová nová závislost na straně Python GUI (dnes čisté stdlib + Tk).

Mimo rozsah: cookies (`Item.cookie`) a `api-token`. Cookies jsou credentials
také, ale přicházejí z prohlížeče a mají jinou životnost; řeší se zvlášť.

## Uvažované možnosti

### A — Levné zmírnění: práva 0600 + redakce z API + argv pryč

Žádná kryptografie. `settings.json` a `queue.json` dostanou 0600 při každém
zápisu, `auth` se vyřízne z `/api/items`, `--auth` se dětskému procesu předá
proměnnou prostředí místo argumentu, selftest výpisy se redigují.

*Pro:* malý diff, žádná nová závislost, žádný platformní rozpad, zavřené body
3, 4, 6, 7 tabulky výše. *Proti:* plaintext na disku zůstává (body 1 a 2) —
chrání jen proti jiným uživatelům stroje a proti nedbalému `tar` zálohy, ne
proti cizímu procesu běžícímu pod stejným účtem, což je právě ten případ, který
na desktopu bolí (malware se spouští jako uživatel).

### B — Každý credential přímo v OS keyringu

`site_logins[i].password` se neukládá nikam do JSON; žije v libsecret /
Windows Credential Manager / macOS Keychain, v JSON zůstane jen
`{"url","user"}` a heslo se dotahuje při každém použití.

*Pro:* nejlepší model — heslo je za uživatelskou session a za OS ACL. *Proti:*
rozpadá se na platformy a na prostředí. Rust crate `keyring` táhne na Linuxu
D-Bus a běžící Secret Service; headless stroj, server bez session, WSL nebo
`idm` spuštěné ze systemd unitu keyring nemají a **celé Site Logins by tam
přestalo fungovat**, nejen zpevnilo. Druhý problém je granularita: N hesel =
N položek v keyringu, které je potřeba udržovat v synchronizaci s JSON
seznamem (přidání, přejmenování URL, smazání záznamu, smazání celého profilu) —
to je stavový stroj, který se rozchází.

### C — Šifrovaný trezor, klíč v keyringu (s fallbackem)

Jeden soubor `STATE_DIR/secrets.json`, AEAD-šifrovaný jedním 32bajtovým
klíčem. Klíč je v OS keyringu; když keyring není k dispozici, leží
v `STATE_DIR/secrets.key` s právy 0600. V `settings.json` a `queue.json`
zůstává jen reference `secret:<id>`. Plus **celé A** jako základ.

*Pro:* jedna položka v keyringu místo N, takže žádný synchronizační stavový
stroj; degradace je plynulá (bez keyringu jsme na úrovni A s oddělenou,
přísněji chráněnou cestou, ne rozbití funkce); kryptografie je na jednom místě
v jednom jazyce. *Proti:* víc kódu než A; fallback je upřímně jen „obfuskace
s 0600", což se musí uživateli říct, ne zamlčet.

## Rozhodnutí

**Doporučuje se C, implementované ve dvou krocích: nejdřív celé A jako
nepodmíněné zpevnění, pak trezor.** A je samostatně hodnotné — zavírá čtyři
z osmi unikajících míst včetně `argv`, které je nejhorší, protože ho čte
kdokoli — a dá se dodat v jednom cyklu bez nové závislosti. Trezor pak řeší
zbylý plaintext na disku. B se zamítá: na Linuxu by z povinného keyringu udělal
nový důvod, proč Site Logins někde nefunguje, a to je horší než plaintext,
o kterém uživatel ví.

## Návrh: krok 1 (zpevnění)

1. **Práva.** `save_settings()` (`gui/idm_gui.py:610`) zapíše `.tmp`
   přes `os.open(..., O_CREAT|O_WRONLY|O_TRUNC, 0o600)` ještě před
   `os.replace`, takže finální soubor je 0600 bez okna, kdy je čitelný.
   `save()` (`engine/src/gui.rs:306`) udělá totéž pro `queue.json` přes
   `PermissionsExt`, podle vzoru z `engine/src/gui.rs:1044`. Na Windows se
   `chmod` vynechává; tam soubory dědí ACL z `%LOCALAPPDATA%`, což je
   per-user adresář.
2. **Argv.** `run_item()` místo `--auth <hodnota>` nastaví dětskému procesu
   `cmd.env("IDM_AUTH", &auth)` a předá `--auth-env IDM_AUTH`. Engine
   (`engine/src/main.rs`) dostane novou volbu `--auth-env <NAME>`; když je
   zadaná, hodnotu přečte z té proměnné a **okamžitě ji z vlastního prostředí
   odstraní**, aby ji nedědili potomci `yt-dlp` ani `aria2c`. `--auth`
   zůstává přijímané pro ruční použití z shellu a kvůli
   `engine/tests/media_backend.rs:79`; jsou-li zadané oba, `--auth-env`
   vyhrává. Prostředí procesu je na Linuxu čitelné jen vlastníkem, na rozdíl od
   `/proc/<pid>/cmdline`.
3. **API.** `GET /api/items` přestane vracet `auth`. Nejde to atributem
   `#[serde(skip_serializing)]` na `Item.auth` — to by vyprázdnilo i
   `queue.json`. Místo toho dostane `Item` metodu `redacted()`, která vrátí
   klon s prázdným `auth` a s `proxy` bez user-info části authority, a
   `/api/items` (`engine/src/gui.rs:806`) serializuje ten klon. `POST /api/add`
   `auth` dál přijímá — GUI ho musí umět nastavit — ve své odpovědi ho
   nevrací už dnes.
4. **Stdout.** `selftest_download_options` (`gui/idm_gui.py:4213`) a
   `selftest_add_body` (`gui/idm_gui.py:4250`) před `json.dumps` nahradí
   hodnotu klíče `auth` a user-info v `proxy` konstantou `"<redacted>"`,
   pokud jsou neprázdné; prázdné nechají prázdné, aby se dalo testovat „žádný
   login na tenhle host". Testy, které dnes ověřují konkrétní heslo
   (`gui/test/settings_applied2.test.mjs:88-89`), se přepíší tak, že volají
   `site_login_for` / `download_options` přímo a na redigovaný výpis se
   nespoléhají.

## Návrh: krok 2 (trezor)

### Kdo vlastní kryptografii

Trezor obsluhuje **výhradně Rust**. Důvod: Python GUI je dnes stdlib-only a
stdlib nemá AEAD; `cryptography` by byla první nativní závislost GUI a tím
i první důvod, proč se GUI nerozběhne. Rust už linkuje TLS stack, takže
`chacha20poly1305` je tam přírůstek bez nového systémového požadavku.

Dvě vstupní cesty do téhož trezoru:

- **Engine/server** ho čte přímo (potřebuje ho při resume bez běžícího GUI).
- **Python GUI** s ním mluví přes nové podkomandy `idm secrets set|get|del`,
  které čtou hodnotu ze stdin a píšou na stdout. Nikdy ne přes `argv`.

### Formát `STATE_DIR/secrets.json`

```json
{"v":1,"alg":"chacha20poly1305","key":"keyring","nonce":"<base64 12B>","ct":"<base64>"}
```

`ct` je šifrovaný JSON objekt `{"<id>": "<plaintext>"}`. `id` je náhodných
16 hex znaků, bez vazby na URL — URL je sama citlivá a v názvu by unikala.
`key` je `"keyring"` nebo `"file"` a říká, odkud se klíč bere. Soubor se
zapisuje atomicky (`.tmp` + rename) s právy 0600.

Celý trezor se při každém zápisu přešifruje novým nonce. Je to desítky hesel,
ne databáze; inkrementální formát by za tu komplexitu nic nekoupil.

### Klíč

32 bajtů z OS CSPRNG. Primárně v keyringu přes crate `keyring`, služba `idm`,
účet `secrets-key`, hodnota base64. Crate je za cargo feature `keyring`, která
je **zapnutá v default features**; `--no-default-features` dává build bez
D-Bus, což je to, co CI a kontejnery chtějí.

Když keyring není dostupný (vypnutá feature, chybějící Secret Service, chyba
při čtení i zápisu), klíč se uloží do `STATE_DIR/secrets.key`, 0600, a
`"key":"file"` to zaznamená. Uživateli se to **řekne**: Options → Site Logins
zobrazí jednořádkový stav „Passwords: encrypted, key in system keyring" nebo
„Passwords: encrypted, key in a local file (no system keyring available)".
Tvrdit v druhém případě plnou ochranu by byla lež.

Pořadí při čtení je určeno polem `key`, nikoli zkoušením: `"keyring"` se čte
z keyringu a při neúspěchu je to chyba, ne tichý přechod na soubor. Jinak by
útočník, který smaže položku v keyringu, degradoval čtení na podstrčený
soubor.

### Reference v JSON

- `settings.json`: `site_logins[i]` má místo `"password": "s3cret"` klíč
  `"password_ref": "secret:ab12cd34ef567890"`. Totéž `proxy.proxy_pass` →
  `proxy.proxy_pass_ref`.
- `queue.json`: `Item` dostane dvě nová pole — `auth_user: String`
  (plaintext; uživatelské jméno citlivé není a je stejně vidět v záznamu
  site loginu) a `auth_ref: String` ve tvaru `secret:<16 hex>`. Staré pole
  `auth` zůstává jen pro čtení starých souborů (viz migrace).

Složený tvar `"user:" + <ref>` se **nepoužívá**: u hesla s dvojtečkou by byl
nejednoznačný. `download_options()` proto vrací `auth_user` a
`auth_password_ref` jako dvě pole a `POST /api/add` je tak i přijímá.

### Rozšifrování v momentě použití

`run_item()` resolvuje `auth_ref` přes trezor, složí `user:password` v paměti
a předá ho dítěti proměnnou prostředí z kroku 1. Hodnota se drží
v `secrecy::SecretString`, aby se nezkopírovala do logu omylem a zeroizovala se
při dropu. Když se trezor otevřít nepodaří, download končí stavem `"error"`
se zprávou „cannot unlock stored password"; **nezkouší se bez autentizace**,
protože server by vrátil 401 uprostřed rozběhnutého resume a chyba by vypadala
jako síťová.

## Zpětná kompatibilita a migrace

Nejde o volitelný doplněk: čtečky musí přijímat oba formáty, a to v tomto
pořadí.

**Čtení `settings.json`** (`load_settings`): záznam, který má `password_ref`,
se použije přes trezor. Záznam, který má `password` (starý plaintext), se
použije přímo. Má-li oba, `password_ref` vyhrává a `password` se ignoruje.

**Čtení `queue.json`** (`load_items`, `engine/src/gui.rs:280-305`):
`auth_ref` neprázdné → trezor. Jinak `auth` neprázdné → plaintext, rozdělený
na první dvojtečce jako dnes (`engine/src/main.rs:188-195`).

**Migrace** proběhne jednorázově, při prvním zápisu po upgradu, odděleně pro
každý soubor:

1. Před čímkoli se vytvoří záloha `settings.json.pre-secrets` resp.
   `queue.json.pre-secrets` s právy 0600. Je to jediná cesta zpět, kdyby
   uživatel potřeboval starší build; po úspěšné migraci se nemaže.
2. Každé plaintextové heslo se vloží do trezoru, do záznamu se zapíše
   `*_ref` a plaintextový klíč se **odstraní**, nikoli vyprázdní — prázdný
   `"password": ""` je legitimní „heslo není nastaveno" a nesmí se plést
   s „heslo bylo zmigrováno".
3. Když zápis do trezoru z jakéhokoli důvodu selže, **plaintext se nemaže
   a soubor se neukládá v novém formátu**. Migrace se pokusí znovu při dalším
   zápisu. Ztratit heslo je pro uživatele horší než ho mít ještě den
   v plaintextu.
4. Migrace nikdy nepíše do `settings.json` sama od sebe při pouhém čtení.
   Spouští ji až akce, která ten soubor ukládá — OK v Options dialogu nebo
   uložení nového site loginu. Čtení zůstává čtením.

Starší engine, který narazí na `auth_ref` a nerozumí mu, vidí prázdný `auth`
a download selže na 401. To je přijatelné: downgrade engine pod novějším GUI
není podporovaná kombinace a záloha `.pre-secrets` existuje.

## Testy

TDD, v tomhle pořadí. Rust části se ověřují **výhradně v CI**.

1. `gui/test/redaction.test.mjs` — selftest výpisy neobsahují heslo:
   `OPTIONS:` a `BODY:` s nastaveným site loginem mají `auth_user` a
   `"<redacted>"`, nikde ne skutečné heslo. Padá hned.
2. Python selftest na práva: po `save_settings` je `stat().st_mode & 0o777`
   rovno `0o600` (na Windows se asserce přeskočí).
3. `engine/tests/gui.rs` — rozšířit: `/api/items` po `POST /api/add`
   s `auth` nevrací `auth` ani heslo nikde v těle; `queue.json` má 0600;
   `api_add_stores_rate_auth_and_mtime_options` (`engine/tests/gui.rs:545`)
   se přepíše tak, že uloženou hodnotu ověřuje proti `queue.json` místo proti
   `/api/items`.
4. `engine/tests/secrets.rs` (nový) — round-trip set/get/del; poškozený `ct`
   dává chybu, nikoli prázdnou hodnotu; `key:"keyring"` se bez keyringu
   nedegraduje na soubor; dva zápisy za sebou mají různý nonce.
5. `engine/tests/secrets_migration.rs` (nový) — `queue.json` se starým
   plaintextovým `auth` se načte a běží; po zápisu má `auth_ref`, nemá
   plaintext, a `.pre-secrets` záloha existuje; při vynuceném selhání trezoru
   zůstane plaintext na místě.
6. `engine/tests/host_settings.rs` — doplnit případ, že ani `password_ref`,
   ani obsah `secrets.json` se do `capture_subset` nedostanou. Whitelist to
   zaručuje už dnes, test to zafixuje pro budoucí pole.
7. `engine/tests/media_backend.rs:79` — ověřit, že `--auth-env` funguje
   stejně jako `--auth` a že proměnná v prostředí potomka yt-dlp není.

## Rizika

- Rust se lokálně nekompiluje, takže zpětná vazba ke bodům 3-7 přijde z CI.
  Diff se před pushem čte očima.
- `keyring` crate na Linuxu vyžaduje `libdbus` v build prostředí. Proto je za
  default feature, kterou lze vypnout: CI matrix musí mít jeden job
  s `--no-default-features`, jinak se fallback cesta nikdy neodzkouší.
- Krok 1 mění tvar `/api/items`. Vestavěné webové UI
  (`engine/src/gui.rs:40-87`) `auth` nezobrazuje, takže se ho to netýká, ale
  každý externí konzument by se rozbil. Žádný takový v repu není.
- `proxy_pass` schovaný v proxy URL se v kroku 1 jen rediguje na výstupech;
  z `queue.json` a z `argv` zmizí teprve v kroku 2, kdy `Item.proxy` dostane
  stejné rozdělení na `proxy` + `proxy_password_ref`. Do té doby je proxy heslo
  chráněné slaběji než heslo k serveru. Je to vědomé: proxy s heslem je
  v praxi vzácnější a dělat obě změny najednou by zdvojnásobilo diff.
