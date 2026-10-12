# Analýza skutečného IDM (Windows 11, v6.43.15.1 → rozšíření 6.43.1)

Získáno z živé instalace `C:\Program Files (x86)\Internet Download Manager` na
Windows boxu (`10.39.237.209`) a z rozbalených CRX/XPI. **Dřívější závěr, že je
`background.js` scramblovaný, byl CHYBNÝ** — je pouze minifikovaný a čitelný.

## Artefakty

| Soubor | Velikost | Význam |
|---|---|---|
| `idmcchandler2_64.dll` | 461 848 B | PE32+ x64, NPAPI/plugin handler |
| `IDMMsgHost.exe` | 39 168 B | native-messaging host (`com.tonec.idm`) |
| `IDMMsgHost.json` | 351 B | manifest hosta (Chrome/Edge) |
| `IDMMsgHostMoz.json` | 282 B | manifest hosta (Firefox) |
| `IDMGCExt.crx` | 107 834 B | Chrome rozšíření (v6.43.1) |
| `IDMEdgeExt.crx` | 103 640 B | Edge rozšíření |
| `idmmzcc*.xpi` | 430/30/110 KB | Firefox rozšíření |

## Dvě transportní cesty (POZOR — ne jedna)

`background.js` staví spojení v `n.Ba` (řádek ~s 1500ms watchdogem):

1. **PRIMÁRNÍ: WebSocket** na `ws://127.0.0.1:1001/?cid=<id>&rnd=<rnd>`
   (záložní `ws://0.1.0.1:1001/`), subprotocol
   `plugin.v3.internetdownloadmanager.com`.
2. **FALLBACK: native messaging** — `browser.runtime.connectNative("com.tonec.idm")`,
   watchdog 1500 ms. Používá se, když WebSocket na :1001 neběží (IDM.exe neběží
   nebo je port obsazen).

**Důsledek pro nás:** náš host `com.tonec.idm` je správně jen jako fallback
větev. Reálná IDM primárně komunikuje po WebSocketu na portu 1001 s prohlížečem.

## Formát rámce — TEXT, ne binární opkódy

Builder `qb(...)` (background.js) skládá:

```
MSG#<id>#<type>#<A>#<j>:<g0>:<g1>:...<k1>=<v1>,<k2>=<v2>;
```

- `MSG#` — pevná značka začátku
- `<id>` — sekvenční číslo zprávy (korelace)
- `<type>` — číselný typ zprávy
- `<A>` — číselný podtyp/příznak
- `<j>` — číselný identifikátor (port/frame)
- `:` odděluje pole seznamu `<g>` (čísla)
- `,` odděluje páry `klíč=hodnota`
- `;` ukončuje rámec

Parser (`qb.prototype.B`) čte přesně tenhle tvar:
- stav 0: `split("#", 6)`, musí být 5 polí a `e[0]=="MSG"`
- stav 1: `split(":")` → číselné pole `g` (float pokud obsahuje `.`)
- stav 2: `split("=", 3)` → klíč/hodnota (klíč `e`, hodnota `f`); pokud oddělovač `:`, jde o binární/string blok délky `i`
- stav 3–5: přečtení bloku, oddělovače `,` / `;`, rekurzivní další rámec

**Toto NENÍ binární rámcování** (4B LE délka + JSON), jak tvrdí starý
`PROTOCOL.md`. Starý model popisoval jen fallback native-messaging vrstvu
(Chrome přidává 4B LE délku ke zprávám), ale vnitřní payload je textový `MSG#…`.

## Handshake (n.Na)

Při otevření posílá rozšíření type=2, A=5:

```
a = [113, 93, Xa?1028:1031, 0, 16845059, cid, 15, manifest_version]
k = { 112: Ca, 113: Ba, 125: JSON.stringify(nc), 116: <jazyk> }
S(this, 2, 5, Xa?0:1024, a, k)
```

- `113:93` — magic / verze protokolu
- `1031`/`1028` — Chrome vs. Firefox varianta
- `16845059` — konstanta (0x1010103?)
- `116` — jazyk prohlížeče (`cs-CZ`…)

## Exporty `idmcchandler2_64.dll`

```
IDMMzCC_DownloadAllWithIDM
IDMMzCC_DownloadLast10FLVwithIDM
IDMMzCC_DownloadLastFLVwithIDM
IDMMzCC_DownloadLinkWithIDM
IDMMzCC_GetListenerState
IDMMzCC_Observe
IDMMzCC_ShouldLoad
IDMMzCC_ShouldLoad_old1
```

Importy: `WININET.dll` (HTTP), `VERSION`, `ADVAPI32` (registry), `USER32`,
`GDI32`, `SHELL32`, `ole32`, `OLEAUT32`, `MSVCR90.dll` (VS2008 runtime).

## Schémata URL / proxy (konstanty v JS)

```
wa = {http:1, https:9, ftp:2, ftps:10, idmreg:12, idmdwnlmfv9:33}   // schéma -> kód
za = {direct:2, auto_detect:3, system:4, pac_script:5, fixed_servers:7} // proxy režim
va = {16:1, 17:2, 18:4, 45:8, 46:16}                                // příznaky
```

## ID rozšíření (reálná)

ROT13 literál `atcnzcnccazrctvybwsbunquuzouynrx` → **`ngpampappnmepgilojfohadhhmbhlaek`**
(Chrome) a **`llbjbkhnmlidjebalopleeepgdfgcpec`** (druhá varianta). Naše testovací
`gnhajaopemmibmjhkaafdebogmkkcljc` je vlastní pinned ID, s reálným IDM se neshoduje.

## Šifra `ua()`

`ua(s)` = **ROT13** (viz `ua("lbhghor")` → `youtube`). Používá se pro obfuskování
konfiguračních řetězců, ne pro přenos dat.
