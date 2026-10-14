# Kanál na nastavení pro rozšíření + filtrování automatického záchytu

Datum: 2026-10-14

## Problém

`extension/background.js` dnes záchyt neposuzuje: `captureDownload()` (~ř. 186)
pošle hostu každou zachycenou URL a má `connections: 4` nadrátováno. Nastavení,
která o záchytu mají rozhodovat — `file_types.auto`, `file_types.exclude_sites`,
`file_types.exclude_addresses`, `general.force_keys`, `general.prevent_keys` —
leží v `settings.json`, ke kterému rozšíření nemá žádnou cestu. Options dialog
tedy v téhle části slibuje chování, které nikde neexistuje.

Druhá polovina bodu 1 z roadmapy (položka kontextového menu „Download with IDM")
stojí na stejném kanálu a řeší se zvlášť, v navazujícím cyklu.

## Cíl

1. Rozšíření zná capture-relevantní podmnožinu nastavení.
2. Automatický záchyt ji respektuje, včetně force/prevent kláves.
3. `exclude_addresses` je nastavitelné z Options dialogu, ne jen ručním editem JSON.

Mimo rozsah: kontextové menu, `connection.exceptions` (per-server limity),
`download_limits`, cokoliv kolem grabberu.

## Architektura

Tři komponenty, tři odpovědnosti:

- **`idm-host`** — jediný, kdo čte `settings.json` z disku. Nová volitelná volba
  `--settings <PATH>`, nová akce `get_settings`.
- **`extension/settings.js`** (nový) — čistá logika: výchozí hodnoty a rozhodovací
  funkce. Žádné `chrome.*`, takže se testuje přímo z Node jako `schema.js`.
- **`background.js`** — instalatérství: cache odpovědi, stav modifikátorů,
  volání rozhodovací funkce před odesláním.

Rozhodování zůstává v prohlížeči, ne v hostu: jen prohlížeč zná URL stránky a
držené klávesy. Host by na to potřeboval kontext, který by mu musel poslat
prohlížeč — tedy stejná data, jen o dvě hranice dál.

## Kontrakt `get_settings`

Požadavek `{"action":"get_settings"}`. Odpověď při načteném souboru:

```json
{"ok":true,"source":"file","settings":{
  "file_types":{"auto":["zip","mp4"],"exclude_sites":[],"exclude_addresses":[]},
  "general":{"force_keys":"Ctrl","prevent_keys":"Alt"},
  "connection":{"max_connections":8}}}
```

Host nevrací, co přečetl, ale **explicitní whitelist těchto pěti polí**. `auth`
(plaintextové heslo), `proxy` i cesty ze `save_to` se do prohlížeče nedostanou.
Whitelist, nikoli blacklist — aby budoucí citlivé pole v `DEFAULT_SETTINGS`
neuteklo samo tím, že na něj nikdo nemyslel.

Chybí-li `--settings`, soubor neexistuje nebo je nečitelný/rozbitý:
`{"ok":true,"source":"default","settings":null}`. Rozšíření pak použije vlastní
výchozí hodnoty. Není to fail-closed záměrně: rozbitý JSON nesmí potichu vypnout
celý záchyt. Chyba se neeskaluje, `ok` zůstává `true`.

Typová tolerance: pole, které v souboru má špatný typ (např. `auto` je string),
se zahodí a nahradí výchozí hodnotou; zbytek odpovědi se tím neruší.

## Doručení cesty

Wrapper v `extension/install-host.sh:73` dostane
`--settings "$DATA_HOME/idm-gui/settings.json"` — tutéž cestu, kterou
`install.sh:312` předává GUI jako `--state-dir`. Dnes je ta konstanta zapsaná
na dvou místech; sjednotí se do jedné proměnné, aby se nerozešly.

## Rozhodovací funkce

```
shouldCapture({url, pageUrl, settings, heldKeys}) -> {capture, reason}
```

Pořadí, první shoda vyhrává:

1. drží se `prevent_keys` → `{false, "prevent_key"}`
2. drží se `force_keys` → `{true, "force_key"}` — obchází všechny filtry níž
3. `url` pasuje na `exclude_addresses` → `{false, "excluded_address"}`
4. host z `pageUrl` (při jeho absenci z `url`) pasuje na `exclude_sites`
   → `{false, "excluded_site"}`
5. přípona z `url` je v `file_types.auto` → `{true, "auto_type"}`
6. jinak → `{false, "not_auto_type"}`

Vzory: glob s `*`, case-insensitive, převedený na regex s escapováním všeho
kromě `*`. `exclude_sites` se porovnává proti hostu (`*.example.com` chytne i
`cdn.example.com`), `exclude_addresses` proti celé URL.

Přípona se bere z cesty URL bez query a fragmentu; URL bez přípony pravidlem 5
neprojde.

Klávesy: `force_keys` / `prevent_keys` jsou v GUI volná textová pole, takže
parser přijímá `"Ctrl"`, `"Alt"`, `"Shift"`, jejich kombinace oddělené `+`, a
neznámé názvy ignoruje. Prázdná hodnota znamená „pravidlo neexistuje", nikoli
„platí vždy". Pravidlo platí, jsou-li drženy všechny klávesy ze specifikace.
`prevent` má přednost před `force`, kdyby obě byly nastavené na totéž.

## Zapojení v background.js

- **Držené klávesy:** opcode 31 nese `[31, keyCode, down]`. Background drží
  `Map<tabId, Set<keyCode>>`, maže záznam při `tabs.onRemoved` a při odpojení
  content portu. Mapování 16 → shift, 17 → ctrl, 18 → alt.
- **Cache:** `getCaptureSettings()` volá `get_settings` líně, výsledek drží
  s TTL 30 s a zneplatní ho při `onDisconnect` hosta. Žádný `chrome.storage` —
  po restartu service workeru se prostě zeptá znovu.
- **Záchyt:** `captureDownload()` nejdřív `await getCaptureSettings()`, pak
  `shouldCapture`. Při `capture:false` jen zaloguje důvod a skončí. `connections`
  se bere z `connection.max_connections` místo konstanty 4.

## GUI

Do záložky File Types v `_dialog_options` přidat seznam pro
`file_types.exclude_addresses` („Don't start downloading automatically from the
following addresses:") s tlačítky Add/Remove, podle vzoru existujícího
`sites_lb`. Pole v `DEFAULT_SETTINGS` existuje už dnes, chybí mu jen ovládání.

## Testy

TDD, v tomhle pořadí:

1. `extension/test/settings_filter.test.mjs` — čistá logika: všech šest důvodů,
   glob vzory, parser kláves, typová tolerance výchozích hodnot. Padá hned,
   `settings.js` neexistuje.
2. Rust test pro `get_settings` v `engine/tests/` — whitelist (`auth` vložené do
   souboru se v odpovědi neobjeví), chybějící soubor → `source:"default"`,
   rozbitý JSON → totéž. Ověřuje se **výhradně v CI**.
3. `extension/test/host_e2e.test.mjs` — rozšířit o `get_settings` proti reálné
   binárce přes `encodeFrame`/`decodeFrame`.
4. `extension/test/capture_dom.test.mjs` — rozšířit: se `settings`, které
   vylučují site, host nedostane nic; s drženým Ctrl (force) dostane.
5. GUI seznam pokrývá existující dump test Options dialogu plus
   `dead_buttons.test.mjs` (nová tlačítka musí mít `command`).

## Rizika

- Rust změny nejdou ověřit lokálně (kompilace v prootu není možná), takže zpětná
  vazba k bodům 2 a 3 přijde až z CI. Diff se před pushem čte očima.
- `chrome_e2e.test.mjs` potřebuje Chromium a Xvfb; nový kanál se v něm neověřuje,
  stačí jednotkové a host-e2e pokrytí.
