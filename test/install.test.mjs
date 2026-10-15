// Tests for the Linux installer (`install.sh`).
//
// Two contracts live here. The old one: installing must not need git, Rust or
// a compiler -- the default path downloads a PREBUILT release archive, and
// building from source is opt-in via IDM_LOCAL_SOURCE.
//
// The new one: everything the installer writes lives under a single
// $IDM_DIR. The shell gets one marked block (IDM_DIR plus a PATH guard),
// `idm` is reachable through a symlink in ~/.local/bin, and the desktop entry
// points at a real icon FILE -- `Icon=download` is a theme name, which is why
// the icon never rendered.
//
// We can't hit GitHub from tests, so we drive the download path with a local
// file:// archive (IDM_ARCHIVE_URL) and the source path with a fake checkout.

import test from 'node:test';
import assert from 'node:assert/strict';
import {
  readFileSync, existsSync, statSync, lstatSync, readlinkSync,
  mkdtempSync, mkdirSync, copyFileSync, writeFileSync,
} from 'node:fs';
import { execFileSync } from 'node:child_process';
import { fileURLToPath } from 'node:url';
import { dirname, join } from 'node:path';
import { tmpdir } from 'node:os';

const here = dirname(fileURLToPath(import.meta.url));
const repoRoot = join(here, '..');
const installer = join(repoRoot, 'install.sh');

const src = () => readFileSync(installer, 'utf8');

function freshHome() {
  return mkdtempSync(join(tmpdir(), 'idm_install_home_'));
}

/** Build a fake prebuilt archive, mirroring what release.yml packs. */
function fakeArchive() {
  const dir = mkdtempSync(join(tmpdir(), 'idm_arch_'));
  for (const b of ['idm', 'idm-host']) {
    writeFileSync(join(dir, b), `#!/bin/sh\necho ${b}\n`, { mode: 0o755 });
  }
  writeFileSync(join(dir, 'idm_gui.py'), '# fake gui\n');
  writeFileSync(join(dir, 'ensure-aria2.sh'), '#!/bin/sh\nexit 0\n', { mode: 0o755 });
  copyFileSync(join(repoRoot, 'install.sh'), join(dir, 'install.sh'));
  // The window needs a real icon file; a theme name does not render.
  mkdirSync(join(dir, 'assets'), { recursive: true });
  for (const a of ['idm.png', 'idm.ico']) {
    copyFileSync(join(repoRoot, 'assets', a), join(dir, 'assets', a));
  }
  // The shell/host integration scripts travel with the release too, so an
  // offline install registers the browser host without reaching for GitHub.
  mkdirSync(join(dir, 'extension'), { recursive: true });
  for (const f of ['install-host.sh', 'install-shell.sh', 'com.tonec.idm.json',
                   'com.tonec.idm.firefox.json']) {
    copyFileSync(join(repoRoot, 'extension', f), join(dir, 'extension', f));
  }
  const tar = join(dir, 'idm-linux-x64.tar.gz');
  execFileSync('tar', [
    '-czf', tar, '-C', dir,
    'idm', 'idm-host', 'idm_gui.py', 'ensure-aria2.sh', 'install.sh',
    'assets', 'extension',
  ]);
  return tar;
}

const idmDir = (home) => join(home, '.idm');

function baseEnv(home) {
  return {
    ...process.env,
    HOME: home,
    XDG_DATA_HOME: join(home, '.local', 'share'),
    XDG_CONFIG_HOME: join(home, '.config'),
    IDM_DIR: idmDir(home),
    IDM_DOWNLOADS_DIR: join(home, 'Downloads'),
    // The tests must not try to apt-get install python3-tk on the host.
    IDM_SKIP_GUI_DEPS: '1',
    PATH: process.env.PATH,
  };
}

function run(home, env = {}, args = []) {
  return execFileSync('bash', [installer, ...args], {
    env: { ...baseEnv(home), ...env },
    encoding: 'utf8',
    stdio: ['ignore', 'pipe', 'pipe'],
  });
}

function install(home, env = {}) {
  return run(home, { IDM_ARCHIVE_URL: `file://${fakeArchive()}`, ...env });
}

test('install.sh exists and is executable', () => {
  assert.ok(existsSync(installer), `missing ${installer}`);
  assert.ok(statSync(installer).mode & 0o111, 'install.sh must be executable');
});

test('is syntactically valid bash', () => {
  // A comment once swallowed a `curl` continuation, leaving a line that began
  // with `-o "$PREFIX/bin/$f"` for bash to execute. `bash -n` would not catch
  // that, so check for the shape directly as well.
  execFileSync('bash', ['-n', installer], { stdio: 'pipe' });
  const lines = src().split('\n');
  for (const [i, line] of lines.entries()) {
    if (!/^\s*-[a-zA-Z]\s/.test(line)) continue;
    const prev = lines[i - 1] ?? '';
    assert.ok(
      prev.endsWith('\\') && !/^\s*#/.test(prev),
      `line ${i + 1} starts with a bare flag but line ${i} does not continue `
      + `onto it -- a continuation was swallowed: ${prev}`,
    );
  }
});

test('does NOT require git or Rust on the default path', () => {
  const s = src();
  assert.ok(!/git clone/.test(s), 'must not clone the source');
  assert.match(s, /IDM_LOCAL_SOURCE/, 'build-from-source must be opt-in');
  assert.match(s, /releases\/latest\/download/, 'must download the release asset');
  assert.match(s, /releases\/download\/\$VERSION/, 'must support a pinned version');
  assert.match(s, /tar -xzf/, 'must unpack the archive');
});

test('everything lands in one IDM_DIR', () => {
  const home = freshHome();
  install(home);
  const d = idmDir(home);

  for (const p of [
    'bin/idm', 'bin/idm-host', 'bin/ensure-aria2.sh',
    'gui/idm_gui.py', 'assets/idm.png', 'VERSION',
  ]) {
    assert.ok(existsSync(join(d, p)), `missing ${p} under IDM_DIR`);
  }
  // The generated bash launcher is gone: the desktop entry runs `idm --gui`.
  assert.ok(!existsSync(join(d, 'bin', 'idm-gui')), 'the idm-gui launcher must be gone');
  // Nothing outside IDM_DIR except the symlink and the browser manifests.
  assert.ok(
    !existsSync(join(home, '.local', 'share', 'idm')),
    'the old prefix must not be created',
  );
});

test('defaults IDM_DIR to $HOME/.idm when unset', () => {
  const home = freshHome();
  const env = { ...baseEnv(home), IDM_ARCHIVE_URL: `file://${fakeArchive()}` };
  delete env.IDM_DIR;
  execFileSync('bash', [installer], { env, encoding: 'utf8', stdio: ['ignore', 'pipe', 'pipe'] });
  assert.ok(existsSync(join(home, '.idm', 'bin', 'idm')), 'default must be $HOME/.idm');
});

test('symlinks idm into ~/.local/bin', () => {
  const home = freshHome();
  install(home);
  const link = join(home, '.local', 'bin', 'idm');
  assert.ok(lstatSync(link).isSymbolicLink(), `${link} must be a symlink`);
  assert.equal(readlinkSync(link), join(idmDir(home), 'bin', 'idm'));
  // idm-host is NOT linked: the browser calls it by the absolute path in the
  // native-messaging manifest, and nobody types it.
  assert.ok(!existsSync(join(home, '.local', 'bin', 'idm-host')), 'idm-host must not be linked');
});

test('writes one marked block into the shell rc, and only IDM_DIR plus a PATH guard', () => {
  const home = freshHome();
  writeFileSync(join(home, '.zshrc'), '# mine\n');
  writeFileSync(join(home, '.bashrc'), '# mine\n');
  install(home);

  for (const rc of ['.zshrc', '.bashrc']) {
    const text = readFileSync(join(home, rc), 'utf8');
    assert.match(text, /# >>> IDM >>>/, `${rc} must carry the start marker`);
    assert.match(text, /# <<< IDM <<</, `${rc} must carry the end marker`);
    assert.match(
      text,
      new RegExp(`export IDM_DIR="${idmDir(home)}"`),
      `${rc} must export IDM_DIR`,
    );
    assert.match(text, /\$HOME\/\.local\/bin/, `${rc} must guard ~/.local/bin onto PATH`);
    assert.ok(
      !new RegExp(`export PATH="${idmDir(home)}/bin:`).test(text),
      `${rc} must not export IDM_DIR/bin onto PATH -- that is what the symlink is for`,
    );
    assert.ok(text.includes('# mine'), `${rc} must keep what was already there`);
  }
});

test('the rc block is idempotent', () => {
  const home = freshHome();
  writeFileSync(join(home, '.bashrc'), '# mine\n');
  install(home);
  install(home);
  const text = readFileSync(join(home, '.bashrc'), 'utf8');
  assert.equal(text.match(/# >>> IDM >>>/g).length, 1, 'blocks must not stack');
});

test('the desktop entry points at a real icon file and runs `idm --gui`', () => {
  const home = freshHome();
  install(home);
  const icon = join(home, 'Desktop', 'idm.desktop');
  assert.ok(existsSync(icon), `desktop icon missing: ${icon}`);
  const text = readFileSync(icon, 'utf8');

  const iconPath = join(idmDir(home), 'assets', 'idm.png');
  assert.match(
    text,
    new RegExp(`^Icon=${iconPath}$`, 'm'),
    'Icon= must be an absolute path; a theme name like `download` does not render',
  );
  assert.ok(existsSync(iconPath), 'the icon the entry names must exist');
  assert.match(text, /^Exec=.*\/idm --gui$/m, 'Exec must run the binary, not a generated launcher');
  execFileSync('desktop-file-validate', [icon], { stdio: 'pipe' });
});

test('migrates the old split install into IDM_DIR/state', () => {
  const home = freshHome();
  // What 0.1.5 left behind: program in one place, state in another.
  const oldState = join(home, '.local', 'share', 'idm-gui');
  const oldPrefix = join(home, '.local', 'share', 'idm', 'bin');
  mkdirSync(oldState, { recursive: true });
  mkdirSync(oldPrefix, { recursive: true });
  writeFileSync(join(oldState, 'queue.json'), '[{"id":"old"}]');
  writeFileSync(join(oldState, 'secrets.json'), '{"v":1}');
  writeFileSync(join(oldState, 'secrets.key'), 'k', { mode: 0o600 });
  writeFileSync(join(oldPrefix, 'idm'), '#!/bin/sh\n', { mode: 0o755 });
  writeFileSync(join(home, '.bashrc'), `# IDM (added by install.sh)\nexport PATH="${join(home, '.local', 'share', 'idm', 'bin')}:$PATH"\n# mine\n`);

  install(home);

  const state = join(idmDir(home), 'state');
  assert.equal(readFileSync(join(state, 'queue.json'), 'utf8'), '[{"id":"old"}]');
  assert.ok(existsSync(join(state, 'secrets.json')), 'the vault must come along');
  assert.equal(
    lstatSync(join(state, 'secrets.key')).mode & 0o777, 0o600,
    'the key file must keep its 0600 mode',
  );
  assert.ok(!existsSync(oldState), 'the old state dir must be moved, not copied');
  assert.ok(!existsSync(join(home, '.local', 'share', 'idm')), 'the old prefix must be removed');

  const rc = readFileSync(join(home, '.bashrc'), 'utf8');
  assert.ok(!rc.includes('added by install.sh'), 'the old rc line must be cleaned up');
  assert.ok(rc.includes('# mine'), 'cleanup must not eat unrelated lines');
});

test('migration is idempotent and never overwrites newer state', () => {
  const home = freshHome();
  const oldState = join(home, '.local', 'share', 'idm-gui');
  mkdirSync(oldState, { recursive: true });
  writeFileSync(join(oldState, 'queue.json'), 'OLD');
  install(home);
  const state = join(idmDir(home), 'state');
  writeFileSync(join(state, 'queue.json'), 'NEW');
  // A second old dir appearing (e.g. an old build ran again) must not win.
  mkdirSync(oldState, { recursive: true });
  writeFileSync(join(oldState, 'queue.json'), 'OLD');
  install(home);
  assert.equal(readFileSync(join(state, 'queue.json'), 'utf8'), 'NEW');
});

test('ensures the GUI runtime (python3 + tkinter) on the default path', () => {
  const s = src();
  assert.match(s, /install_gui_deps/, 'must have a GUI dependency step');
  assert.match(s, /python3-tk/, 'must install tkinter on apt systems');
  assert.match(s, /python3-tkinter/, 'must cover dnf/yum naming');
  assert.match(s, /IDM_SKIP_GUI_DEPS/, 'must offer an escape hatch');
});

test('refuses a plain-http archive URL', () => {
  const home = freshHome();
  assert.throws(
    () => run(home, { IDM_ARCHIVE_URL: 'http://example.invalid/idm-linux-x64.tar.gz' }),
    /https/,
    'an http:// archive must be refused',
  );
});

test('--uninstall removes the directory, the symlink and the rc block', () => {
  const home = freshHome();
  writeFileSync(join(home, '.bashrc'), '# mine\n');
  install(home);
  assert.ok(existsSync(join(home, 'Desktop', 'idm.desktop')));

  run(home, {}, ['--uninstall', '--yes', '--purge']);

  assert.ok(!existsSync(idmDir(home)), 'IDM_DIR should be gone');
  assert.ok(!existsSync(join(home, 'Desktop', 'idm.desktop')), 'desktop icon should be gone');
  assert.ok(!existsSync(join(home, '.local', 'bin', 'idm')), 'the symlink should be gone');
  const rc = readFileSync(join(home, '.bashrc'), 'utf8');
  assert.ok(!rc.includes('>>> IDM >>>'), 'the rc block should be gone');
  assert.ok(rc.includes('# mine'), 'unrelated rc lines must survive');
});

test('--uninstall without --purge keeps the state', () => {
  // Losing saved passwords is worse than leaving a directory behind.
  const home = freshHome();
  install(home);
  const state = join(idmDir(home), 'state');
  mkdirSync(state, { recursive: true });
  writeFileSync(join(state, 'secrets.json'), '{"v":1}');

  run(home, {}, ['--uninstall', '--yes']);

  assert.ok(existsSync(join(state, 'secrets.json')), 'state must survive');
  assert.ok(!existsSync(join(idmDir(home), 'bin')), 'the program must be gone');
});

test('uninstall works through the copy kept in IDM_DIR (curl | bash case)', () => {
  const home = freshHome();
  // stdin-piped install: BASH_SOURCE is not a readable file.
  execFileSync('bash', ['-s'], {
    env: { ...baseEnv(home), IDM_ARCHIVE_URL: `file://${fakeArchive()}` },
    input: readFileSync(installer),
    stdio: ['pipe', 'pipe', 'pipe'],
  });
  const kept = join(idmDir(home), 'install.sh');
  assert.ok(existsSync(kept), 'install.sh must be available for --uninstall');
  execFileSync('bash', [kept, '--uninstall', '--yes', '--purge'], {
    env: baseEnv(home),
    stdio: ['ignore', 'pipe', 'pipe'],
  });
  assert.ok(!existsSync(idmDir(home)), 'IDM_DIR should be gone after --uninstall');
});

test('the browser/shell integration keeps its files inside IDM_DIR', () => {
  // install-host.sh and install-shell.sh used to hardcode ~/.local/share/idm-gui
  // and ~/.local/share/idm-native. They must follow IDM_DIR, or the migration
  // we just did is undone by the very next step of the same install.
  const home = freshHome();
  install(home);
  const d = idmDir(home);

  assert.ok(existsSync(join(d, 'extension', 'install-host.sh')),
    'the release must ship the integration scripts');
  assert.ok(existsSync(join(d, 'native', 'idm-host-wrapper.sh')),
    'the host wrapper belongs under IDM_DIR/native');
  assert.ok(!existsSync(join(home, '.local', 'share', 'idm-native')),
    'nothing may be left in the old idm-native directory');
  assert.ok(!existsSync(join(home, '.local', 'share', 'idm-gui')),
    'nothing may be left in the old idm-gui directory');

  // The host reads settings.json from the window's state dir; if the two drift
  // apart the extension silently falls back to defaults.
  const wrapper = readFileSync(join(d, 'native', 'idm-host-wrapper.sh'), 'utf8');
  assert.ok(wrapper.includes(join(d, 'state')),
    `the host wrapper must point at IDM_DIR/state, got: ${wrapper}`);
});

test('the local-source path installs the same layout as a release', () => {
  // This is the ONLY way to install work that is not in a release yet, and
  // until now nothing exercised it -- it was asserted as a string match in the
  // script and never run. A stub `cargo` stands in for the toolchain, so the
  // test checks the installer's wiring, not the compiler.
  const home = freshHome();
  const src = mkdtempSync(join(tmpdir(), 'idm_src_'));
  const bin = mkdtempSync(join(tmpdir(), 'idm_stubbin_'));

  // A checkout, as far as install.sh is concerned.
  mkdirSync(join(src, 'engine', 'target', 'release'), { recursive: true });
  mkdirSync(join(src, 'gui'), { recursive: true });
  mkdirSync(join(src, 'assets'), { recursive: true });
  mkdirSync(join(src, 'extension'), { recursive: true });
  mkdirSync(join(src, 'scripts'), { recursive: true });
  writeFileSync(join(src, 'gui', 'idm_gui.py'), '# gui from source\n');
  for (const a of ['idm.png', 'idm.ico']) {
    copyFileSync(join(repoRoot, 'assets', a), join(src, 'assets', a));
  }
  for (const f of ['install-host.sh', 'install-shell.sh', 'com.tonec.idm.json',
                   'com.tonec.idm.firefox.json']) {
    copyFileSync(join(repoRoot, 'extension', f), join(src, 'extension', f));
  }
  writeFileSync(join(src, 'scripts', 'ensure-aria2.sh'), '#!/bin/sh\nexit 0\n', { mode: 0o755 });
  copyFileSync(installer, join(src, 'install.sh'));

  // The stub cargo "builds" by dropping the two binaries where the real one
  // would. Anything else it is asked to do succeeds silently.
  writeFileSync(join(bin, 'cargo'),
    '#!/usr/bin/env bash\n'
    + `out="${join(src, 'engine', 'target', 'release')}"\n`
    + 'mkdir -p "$out"\n'
    + 'printf "#!/bin/sh\\necho idm\\n" > "$out/idm"\n'
    + 'printf "#!/bin/sh\\necho idm-host\\n" > "$out/idm-host"\n'
    + 'chmod +x "$out/idm" "$out/idm-host"\n'
    + 'exit 0\n',
    { mode: 0o755 });

  const env = baseEnv(home);
  execFileSync('bash', [installer], {
    env: { ...env, IDM_LOCAL_SOURCE: src, PATH: `${bin}:${env.PATH}` },
    encoding: 'utf8',
    stdio: ['ignore', 'pipe', 'pipe'],
  });

  const d = idmDir(home);
  for (const p of ['bin/idm', 'bin/idm-host', 'gui/idm_gui.py', 'assets/idm.png',
                   'extension/install-host.sh', 'VERSION']) {
    assert.ok(existsSync(join(d, p)), `missing ${p} after a local-source install`);
  }
  // The GUI must come from the checkout, not from a downloaded archive.
  assert.match(readFileSync(join(d, 'gui', 'idm_gui.py'), 'utf8'), /from source/);
  // VERSION has to say where this came from: a build from a working tree is
  // not a release, and `idm update` must not think it is behind.
  assert.match(readFileSync(join(d, 'VERSION'), 'utf8'), /^local:/,
    'a source build must not record itself as a release tag');
  assert.ok(lstatSync(join(home, '.local', 'bin', 'idm')).isSymbolicLink());
});

test('the local-source path says so when cargo is missing', () => {
  const home = freshHome();
  const src = mkdtempSync(join(tmpdir(), 'idm_src_nocargo_'));
  const emptyBin = mkdtempSync(join(tmpdir(), 'idm_nobin_'));
  // A PATH with the basics but no cargo.
  assert.throws(
    () => execFileSync('bash', [installer], {
      env: { ...baseEnv(home), IDM_LOCAL_SOURCE: src, PATH: `${emptyBin}:/usr/bin:/bin` },
      encoding: 'utf8',
      stdio: ['ignore', 'pipe', 'pipe'],
    }),
    /cargo/,
    'a missing toolchain must be named, not guessed at',
  );
});
