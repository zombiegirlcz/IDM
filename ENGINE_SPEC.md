# IDM-like engine — spec (fáze B)

Cíl: cross-platform download engine (PC + Android), jeden kód. Referenční chování převzato
z reverzu IDM (viz `PROTOCOL.md`) — multi-connection, resume, robustnost.

## 1. Jádro: segmentované stahování

1. **Probe** — `HEAD` (fallback `GET` s `Range: bytes=0-0`):
   - `Accept-Ranges: bytes` → server podporuje range
   - `Content-Length` → celková velikost
   - `ETag`, `Last-Modified` → validátory pro resume
2. **Rozdělení** — N pevných segmentů (default 4–8, konfigurovatelné):
   `[i*chunk, min((i+1)*chunk-1, total-1)]`, kde `chunk = ceil(total/N)`
3. **Paralelní stažení** — každý segment vlastní `GET` s `Range: bytes=start-end`,
   stream zápis přímo na offset v cílovém souboru (`pwrite`/`FileExt::write_all_at`).
4. **Fallback** — server bez range → single-connection stream.

## 2. Resume

Meta soubor `<output>.idmmeta` (JSON):
```json
{
  "url": "...", "etag": "\"...\"", "last_modified": "...",
  "total": 12345678, "connections": 4,
  "segments": [{"start":0,"end":3086419,"done":true}, ...]
}
```
Při `--resume`:
- ověřit `etag`/`last_modified` proti aktuálnímu serveru — pokud se liší, zahodit a stáhnout znovu
- přeskočit `done: true` segmenty, dokončit zbytek
- po dokončení smazat meta soubor

## 3. Robustnost (roadmapa nad rámec prototypu)

- retry s exponenciálním backoffem (3×)
- dynamické přerozdělení podle rychlosti segmentů
- korektní `User-Agent` (některé servery blokují defaultní)
- cookie jar / proxy (`socks5` — IDM podporuje)
- throttle (max. rychlost), limity souběžnosti
- HLS/DASH: parsovat `m3u8`/`mpd`, stáhnout segmenty a slepit (ffmpeg fallback)

## 4. Ověření

- po stažení: `CRC32` + velikost proti `Content-Length`
- volitelně `MD5`/`SHA256` z hlavičky `Content-MD5` / `Digest`

## 5. Architektura (finální produkt)

```
┌─────────────────────────────────────────────┐
│  idm-core (Rust lib)                        │  ← engine: range, resume, HLS, throttle
│  tokio + reqwest, no UI                      │
└──────────────┬───────────────┬───────────────┘
               │ JNI            │ FFI/stdin
        ┌──────┴──────┐   ┌─────┴──────────┐
        │ Android app │   │ PC: CLI + Tauri│
        │ Compose     │   │ tray + dialog  │
        └─────────────┘   └────────────────┘
               ▲                 ▲
               └───────┬─────────┘
                  browser extension (TS/MV3)
                  content.js + native messaging host
```

## 6. Prototyp (tento repozitář)

`engine/` — Rust CLI:
```
idm <URL> [-o out] [-n connections] [--resume] [--user-agent UA]
```
Důkaz konceptu: paralelní Range, zápis na offset, meta/resume, CRC32 ověření.