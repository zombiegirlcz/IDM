# Instalační struktura: jedna složka IDM_DIR

Datum: 2026-10-15. Cyklus **A** z trojice A (instalace) → B (aktualizace) → C (vzhled GUI).

## Proč

Instalace je dnes rozsypaná na tři místa (`~/.local/share/idm` pro program,
`~/.local/share/idm-gui` pro stav, `~/.config/...` pro manifesty prohlížečů),
do shellu se zapisuje `export PATH=...`, a spouštěče jsou tři: binárka `idm`,
binárka `idm-host` a bashem generovaný launcher `idm-gui`. Uživatel chce
jednu složku, jeden nástroj a čistou odinstalaci.

Při průzkumu se našly dvě skutečné chyby v `install.sh`:

1. `.desktop` píše `Icon=download` — jméno ikony z tématu. Vlastní
   `assets/idm.png` se nikam neinstaluje, takže ikona na ploše se nevykreslí.
   Není to prostředím.
2. Fallback větev stahující `ensure-aria2.sh` je mrtvá: komentář
   `# Last resort (e.g. an older archive.githubusercontent.com/...` spolkl
   `curl`, a bash se pak pokouší spustit řádek začínající `-o`.

## Rozsah

V rozsahu: layout `IDM_DIR`, subcommandy `--gui` / `update` / `uninstall` /
`--version` v binárce `idm`, symlink, zápis do rc souborů, ikona, migrace
staré instalace, Windows protějšek.

Mimo rozsah: vlastní logika aktualizace (cyklus B — `idm update` tu dostane
jen kostru, která ohlásí verzi) a vzhled okna (cyklus C).

## Layout

```
$IDM_DIR/                    default $HOME/.idm, override proměnnou IDM_DIR
  bin/        idm  idm-host  ensure-aria2.sh
  gui/        idm_gui.py
  assets/     idm.png  idm.ico
  extension/  install-host.sh  install-shell.sh  com.tonec.idm*.json
  state/      settings.json  queue.json  secrets.json  launcher.log
  VERSION
```

Mimo složku zůstávají jen dvě věci, a obě z nutnosti: **manifesty hostů**
v `~/.config/google-chrome/NativeMessagingHosts/` a `~/.mozilla/...`
(prohlížeč je jinde nehledá; ukazují dovnitř `IDM_DIR`) a **symlink**
`~/.local/bin/idm`.

## Nástroje

`idm-host` **zůstává samostatnou binárkou a nemění se vůbec**. Je to jediný
článek, který ověřuje reálný prohlížeč v `chrome-e2e` a `firefox-e2e`;
sloučení do `idm` by si vynutilo rozpoznávání podle `argv[0]`, protože
manifesty neumějí argumenty. Ten risk za kosmetiku nestojí.

Binárka `idm` dostane slovesa přes **pre-dispatch v `main()`**: ještě před
`Args::parse()` se podívá na `argv[1]`, a jen pro `update`, `uninstall`,
`--gui` a `--version` odbočí jinam. Všechno ostatní propadá do dnešního
parseru beze změny chování — stahování, `--serve`, `--report` i fronta
zůstávají bitově stejné.

| příkaz | co dělá |
|---|---|
| `idm <url> …` | dnešní chování, nedotčené |
| `idm --gui` | spustí `$IDM_DIR/gui/idm_gui.py` pythonem; nahrazuje generovaný launcher |
| `idm update` | kostra: vypíše nainstalovanou verzi (cyklus B) |
| `idm uninstall` | kompletní odstranění |
| `idm --version` | dnes neexistuje (clap hlásí `unexpected argument`) |

Plný `#[command(subcommand)]` jsme zamítli: poziční `url: Option<String>` se
se subcommandy tluče a oprava by změnila parsování pro všechna dnešní volání,
tedy i pro ta, která visí na ověřeném e2e řetězu. Daň pre-dispatche je, že
`--help` ta slovesa nevypíše sám; dopíšou se do `after_help` a hlídá to test.

## Shell

Do `~/.zshrc` a `~/.bashrc` jde jeden blok ohraničený značkami, aby ho šlo
spolehlivě odebrat:

```sh
# >>> IDM >>>
export IDM_DIR="/root/.idm"
case ":$PATH:" in
  *:"$HOME/.local/bin":*) ;;
  *) export PATH="$HOME/.local/bin:$PATH" ;;
esac
# <<< IDM <<<
```

PATH se pojišťuje proto, že `~/.local/bin` na PATH **není** zaručeně:
`~/.profile` ho na Debianu přidá jen tehdy, když složka existuje v okamžiku
přihlášení, a v holém kontejneru často chybí úplně. Blok je idempotentní —
opakovaná instalace ho přepíše, nestohuje.

## Migrace

Běží na začátku instalace a je idempotentní:

1. `~/.local/share/idm-gui` → `$IDM_DIR/state/` — **přesun**, ne kopie, aby
   nezůstaly dvě pravdy o frontě. Když cíl už existuje a zdroj taky,
   přesune se jen to, co v cíli chybí; nic se nepřepisuje.
2. `secrets.key` (0600) se stěhuje se zbytkem stavu. Klíč uložený v keyringu
   se stěhováním nijak nedotkne, takže trezor přežije obě varianty.
3. `rm -rf ~/.local/share/idm` (starý prefix), až když je bod 1 hotový.
4. Staré řádky `export PATH=".../idm/bin:$PATH"` a `# IDM (added by
   install.sh` se z rc souborů odeberou.

## Odinstalace

`idm uninstall` (a `install.sh --uninstall` jako synonymum, aby staré návody
nelhaly) odstraní: `.desktop` z plochy i z `applications`, manifesty hostů
přes `install-shell.sh --uninstall`, symlink `~/.local/bin/idm`, blok `# >>>
IDM >>>` z `.zshrc` / `.bashrc` / `.profile`, a nakonec `$IDM_DIR`.

Na `state/` se ptá: smazat i frontu a hesla, nebo je nechat. Bez terminálu
(`--yes`, nebo stdin není tty) se **stav zachovává** — ztratit uložená hesla
je horší než nechat po sobě složku.

## Windows

`%USERPROFILE%\.idm`, `setx IDM_DIR`, a `%IDM_DIR%\bin` do uživatelského
PATH. Zástupce na ploše je `IDM.lnk` s cílem `%IDM_DIR%\bin\idm.exe --gui`
a ikonou `%IDM_DIR%\assets\idm.ico`. Symlinky se nepoužívají — potřebují
vývojářský režim nebo administrátora.

## Testy

Rozhodovací logika jde do čistých funkcí, jak je tu zvykem; testuje se ta
funkce, skript ji jen zavolá.

| funkce | kde | co rozhoduje |
|---|---|---|
| `resolve_idm_dir` | `install.sh`, `install.ps1`, `main.rs` | proměnná → default → Windows varianta |
| `rc_block` | `install.sh` | co se zapíše do rc a že je to idempotentní |
| `migration_plan` | `install.sh` | co se odkud kam stěhuje a co je už hotové |
| `uninstall_plan` | `install.sh`, `main.rs` | seznam cest a rc značek |

Node sada: `test/install.test.mjs` a `test/install_ps1.test.mjs` se rozšíří
o layout, blok v rc, symlink, absolutní `Icon=` a migraci. Rust strana
(pre-dispatch, `--version`, `--gui`, `uninstall`) jde přes TDD a CI, jak
žádá CLAUDE.md.
