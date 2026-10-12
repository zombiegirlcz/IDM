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

## Dispatch tabulka (dokončeno)

### Příchozí zprávy (host/WS → rozšíření) — `n.$a`

```
case  3  … handshake/init odpověď (verze protokolu g<97 → re-handshake)
case  4  … konfigurace (flags e[3]: 0x8000000=kontrola, 0x80000000=ia)
case  5  … zc(this, e[0], d, e[1])
case  6  … zc (jiná větev, přes f.g[0])
case  8  … stav stahování (a=4294967295 → ukončit A)
case 11  … 4294967295 → Db(...,!0,!0)
case 12  … hlavní download event (m=4 → Ac, jinak mc)
case 13  … požadavek/odpověď (g<=3 → kc/O; g==5 → port.postMessage([19,...]))
case 18  … definice domény/akce (I tabulka, e.ac=ua("lbhghor")=youtube)
case 20  … proxy konfigurace (k[122]=proxy string, k[121]=J)
case 21–46 … handlery cc/ec/hc/fc/Hb/za/Zb/Ya/Cb/Fb/Db/wb/Bb/Eb/Yb/Kb/ub/yb
```

### Odchozí zprávy (rozšíření → host/WS) — `S(this,type,A,…)`

```
type  0 A  1  … ?
type  1 A  2  … odpověď (g?2:4), [a.l]
type  2 A  5  … HANDSHAKE: a=[113,93,1028|1031,0,16845059,cid,15,mv], k={112,113,125,116}
type  5 A  1  … [32,[a]]
type  8 A  1  … [32,[a]] / [1152,[g]]
type 10 A  1  … progress/keepalive
type 14 A  1  … [0, g, a]
type 16 A  1  … [32|16, a] / [48,[id,0],{115:c}]
type 19 A  2  … [b,c,tabId,a.j] + d
type 21 A  1  … [0, a, d]
type 23 A  2  … [b,tabId,a.j,a.X,a.da], {132,133,134}
type 100 A 1  … [a.l], a
```

### Opkódy do stránky/content scriptu (`postMessage([N,…])`)

```
14, 15, 16, 17, 18, 19
```
(odpovídá starému PROTOCOL.md sekci background→content 11–18; reálné je 14–19)

### `I[]` tabulka (case 18) — definice akcí podle domény

```
I[1] type=2 A=<znaky> B=<znaky>   // youtube (e.ac=ua("lbhghor"))
I[2..6] type=2|null
```
Klíč `102` = domény, `110<g<150` = další vlastnosti; hodnoty se překládají
do `RegExp` a skládají do `Ua` = `^https?://(?:dom1|dom2|…)` (allow-list domén,
na které se aplikuje zvláštní zacházení — YouTube apod.).

## Shrnutí rozdílu proti našemu PROTOCOL.md

| Věc | Starý PROTOCOL.md | Skutečnost |
|---|---|---|
| Transport | jen native messaging | **WS :1001 primárně**, NM fallback |
| Rámec | 4B LE len + JSON | **text `MSG#id#type#A#j:g…,k=v;`** |
| Opkódy bg→content | 11–18 | **14–19** |
| Šifra | (neznámá) | **ROT13 `ua()`** |
| ID rozšíření | naše testovací | `ngpampappnmepgilojfohadhhmbhlaek` |
| Handshake | neúplný | type=2,A=5, a=[113,93,1028/1031,…], k={112,113,125,116} |
