// A minimal Marionette client — enough to drive a real Firefox from a test.
//
// Why not Playwright: it can only drive its OWN patched Firefox build, and
// that build does not install extensions. Marionette is built into every
// Firefox, speaks a trivial length-prefixed JSON protocol on a TCP port, and
// has both of the two things this suite actually needs: Addon:Install with
// temporary:true (an unsigned extension straight from a directory) and
// WebDriver:ElementClick, which is a genuinely trusted user click rather than
// a synthesised event.
//
// Wire format: "<byteLength>:<json>", where json is
//   [0, id, "Command:Name", params]   out
//   [1, id, error, result]            in

import { spawn } from 'node:child_process';
import { connect } from 'node:net';
import { mkdtempSync, writeFileSync } from 'node:fs';
import { removeProfile } from '../rm_profile.mjs';
import { tmpdir } from 'node:os';
import { join } from 'node:path';

const PORT = 2829; // not the 2828 default, so a stray Firefox cannot be hit

export class Marionette {
  constructor({ binary, port = PORT, env = process.env }) {
    this.binary = binary;
    this.port = port;
    this.env = env;
    this.id = 0;
    this.pending = new Map();
    this.buf = Buffer.alloc(0);
  }

  /** Start Firefox on a throwaway profile and connect to its Marionette. */
  async start({ headless = true, timeout = 60_000 } = {}) {
    this.profile = mkdtempSync(join(tmpdir(), 'idm-ff-'));
    // Marionette only listens when the port is set in prefs or on the command
    // line; prefs are the reliable half across versions.
    writeFileSync(join(this.profile, 'user.js'), [
      `user_pref("marionette.port", ${this.port});`,
      'user_pref("marionette.enabled", true);',
      // No "first run" tab, no update checks, no telemetry pings racing us.
      'user_pref("browser.shell.checkDefaultBrowser", false);',
      'user_pref("browser.startup.homepage_override.mstone", "ignore");',
      'user_pref("datareporting.policy.firstRunURL", "");',
      'user_pref("datareporting.policy.dataSubmissionEnabled", false);',
      'user_pref("app.update.enabled", false);',
      'user_pref("extensions.autoDisableScopes", 0);',
      'user_pref("xpinstall.signatures.required", false);',
    ].join('\n') + '\n');

    const args = ['--marionette', '--profile', this.profile, '--no-remote'];
    if (headless) args.push('--headless');
    this.proc = spawn(this.binary, args, {
      env: { ...this.env, MOZ_DISABLE_CONTENT_SANDBOX: '1' },
      stdio: ['ignore', 'pipe', 'pipe'],
    });
    this.stderr = '';
    this.proc.stderr.on('data', (d) => { this.stderr += d; });
    this.proc.stdout.on('data', () => {});

    await this.#connect(timeout);
    await this.#handshake();
    await this.send('WebDriver:NewSession', { strictFileInteractability: true });
    return this;
  }

  async #connect(timeout) {
    const deadline = Date.now() + timeout;
    for (;;) {
      if (this.proc.exitCode !== null) {
        throw new Error(`firefox exited ${this.proc.exitCode}: ${this.stderr.slice(-400)}`);
      }
      try {
        this.sock = await new Promise((res, rej) => {
          const s = connect({ host: '127.0.0.1', port: this.port });
          s.once('connect', () => res(s));
          s.once('error', rej);
        });
        this.sock.on('data', (d) => this.#onData(d));
        return;
      } catch {
        if (Date.now() > deadline) {
          throw new Error(`marionette did not listen on ${this.port} within ${timeout}ms`);
        }
        await new Promise((r) => setTimeout(r, 100));
      }
    }
  }

  /** The server greets with one packet before any command. */
  #handshake() {
    return new Promise((resolve) => { this.onHello = resolve; });
  }

  #onData(chunk) {
    this.buf = Buffer.concat([this.buf, chunk]);
    for (;;) {
      const colon = this.buf.indexOf(0x3a); // ':'
      if (colon < 0) return;
      const len = parseInt(this.buf.subarray(0, colon).toString('ascii'), 10);
      if (!Number.isFinite(len)) throw new Error('bad marionette framing');
      const end = colon + 1 + len;
      if (this.buf.length < end) return;
      const body = JSON.parse(this.buf.subarray(colon + 1, end).toString('utf8'));
      this.buf = this.buf.subarray(end);
      if (Array.isArray(body) && body[0] === 1) {
        const [, id, err, result] = body;
        const p = this.pending.get(id);
        this.pending.delete(id);
        if (p) err ? p.reject(new Error(JSON.stringify(err))) : p.resolve(result);
      } else if (this.onHello) {
        const hello = this.onHello;
        this.onHello = null;
        hello(body);
      }
    }
  }

  send(name, params = {}) {
    const id = ++this.id;
    const json = JSON.stringify([0, id, name, params]);
    const payload = Buffer.from(json, 'utf8');
    this.sock.write(`${payload.length}:`);
    this.sock.write(payload);
    return new Promise((resolve, reject) => {
      this.pending.set(id, { resolve, reject });
    });
  }

  /** Install an unpacked extension for this session only. Returns its id. */
  async installAddon(dir) {
    const r = await this.send('Addon:Install', { path: dir, temporary: true });
    return r?.value ?? r;
  }

  navigate(url) { return this.send('WebDriver:Navigate', { url }); }

  async findElement(selector) {
    const r = await this.send('WebDriver:FindElement', { using: 'css selector', value: selector });
    const el = r?.value ?? r;
    return el[Object.keys(el)[0]];
  }

  click(uuid) { return this.send('WebDriver:ElementClick', { id: uuid }); }

  async script(src, args = []) {
    const r = await this.send('WebDriver:ExecuteScript', { script: src, args });
    return r?.value ?? r;
  }

  async stop() {
    try { await this.send('Marionette:Quit', {}); } catch { /* going away */ }
    try { this.sock?.destroy(); } catch { /* already gone */ }
    if (this.proc && this.proc.exitCode === null) {
      this.proc.kill('SIGTERM');
      await new Promise((r) => setTimeout(r, 300));
      if (this.proc.exitCode === null) this.proc.kill('SIGKILL');
    }
    if (this.profile) removeProfile(this.profile);
  }
}
