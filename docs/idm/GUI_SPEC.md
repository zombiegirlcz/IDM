# IDM GUI spec (z oficialni dokumentace + screenshotu)

## Hlavni okno
- **Toolbar s tlacitky NAD seznamem**: Add URL, Resume, Stop, Stop All, Delete,
  Delete Completed, Options, Scheduler, Start Queue, Stop Queue, Tell A Friend.
  Tlacitka maji active/disabled stav podle vyberu.
- **Vlevo strom kategorii**: All Downloads, Compressed, Documents, Music,
  Programs, Video, Unfinished, Finished, Grabber projects, Queues.
- **Hlavni seznam sloupce**: File Name, File Size, Status, Time Left, Speed,
  Description, a sloupec **Q** (fronta). Radi se kliknutim na hlavicku.
- Kategorie: jmeno + cilova slozka + seznam pripon (DOC PDF XLS TXT -> Documents).
- Pravy klik na polozku = kontextove menu (Properties, Add to Queue...).
- Stavy: queued, downloading, paused, complete, error; "Q" ukazuje frontu.

## Add URL dialog
- Textove pole URL (+ vyber z existujicich).
- Checkbox "Use authorization" (login info).
- Po OK -> **Download File Info** dialog.

## Download File Info dialog
- Popis souboru, cesta kam ulozit, navrzena kategorie.
- Tlacitka: **Start Download**, **Download Later**, Cancel.

## Download Progress (File Download) dialog
- Stav, file size, downloaded (%), transfer rate, time left, resume capability.
- **Graf/segmenty**: "Start positions and download progress by connections"
  (N., Downloaded, Info) pro kazde spojeni.
- Tlacitka: Pause, Cancel. Speed Limiter + Options on completion.

## Options dialog (taby)
- General, File Types, Connection, Save To, Downloads, Proxy/Socks,
  Site Logins, Dial-Up/VPN, Sounds.

## Scheduler dialog
- Seznam front vlevo; taby **Schedule** a **Files in the queue**.
- Start Now / Stop; "Start download at HH:MM", "Stop download at HH:MM",
  "Number of retries", akce po dokonceni (open file, shut down...).
- Download Limits (kvoty).

## Queues
- 2 hlavni fronty: download queue + synchronization queue + dodat. fronty.
- Sloupec Q v hlavnim seznamu ukazuje frontu. Start/Stop Queue v toolbaru.

## Properties dialog
- Info o stahovani, zmena umisteni/URL/popisu, tlacitko Open.

## Download Complete dialog
- Zpusoby jak otevrit soubor, "Don't show again", drag&drop ikona.

## Spousteni stahovani
1. zachyceni kliku v prohlizeci (dle typu souboru / Ctrl / Alt)
2. monitoring schranky (URL)
3. pravy klik -> "Download with IDM"
4. Add URL rucne
5. drag&drop odkazu do okna / drop target
6. prikazova radka: idman /d URL [/p path] [/f name] [/q] [/h] [/n] [/a]
   /s = spusti frontu; /n = tichy mod; /a = jen do fronty
