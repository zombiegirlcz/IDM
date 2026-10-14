//! The secret vault: passwords encrypted at rest.
//!
//! Step 2 of docs/superpowers/specs/2026-10-14-auth-at-rest-design.md. Step 1
//! took the passwords out of argv and out of /api/items and put 0600 on the
//! files; they were still plaintext on disk. Here they move into
//! `STATE_DIR/secrets.json`:
//!
//! ```json
//! {"v":1,"alg":"chacha20poly1305","key":"keyring","nonce":"<b64>","ct":"<b64>"}
//! ```
//!
//! `ct` decrypts to a JSON object of `{"<id>": "<password>"}`, where `id` is 16
//! random hex characters with no relation to the URL -- the URL is itself
//! sensitive and naming entries after it would leak it. The whole vault is
//! re-encrypted under a fresh nonce on every write: this is a few dozen
//! passwords, not a database, and an incremental format would buy nothing.
//!
//! The key is 32 bytes from the OS CSPRNG. It belongs in the OS keyring; where
//! there is none (a container, a headless box, IDM_NO_KEYRING=1) it goes to
//! `STATE_DIR/secrets.key` at 0600 and the vault records `"key":"file"` so the
//! GUI can say so instead of claiming protection it does not have.

use std::collections::BTreeMap;
use std::path::{Path, PathBuf};

use anyhow::{anyhow, Context, Result};
use chacha20poly1305::aead::{Aead, KeyInit, OsRng};
use chacha20poly1305::{ChaCha20Poly1305, Key, Nonce};
use rand_core::RngCore;

/// Where the key for a given vault is kept. Decided once, at creation, and
/// then obeyed: reading a `Keyring` vault never falls back to the file, or
/// anyone able to delete a keyring entry could downgrade the vault to a key
/// they planted.
#[derive(Clone, Copy, PartialEq, Eq, Debug)]
pub enum KeySource {
    Keyring,
    File,
}

impl KeySource {
    fn as_str(self) -> &'static str {
        match self {
            KeySource::Keyring => "keyring",
            KeySource::File => "file",
        }
    }

    fn parse(s: &str) -> Result<KeySource> {
        match s {
            "keyring" => Ok(KeySource::Keyring),
            "file" => Ok(KeySource::File),
            other => Err(anyhow!("unknown key source {:?} in secrets.json", other)),
        }
    }

    /// What to tell the user in Options -> Site Logins. Saying "encrypted"
    /// without saying where the key is would be a half-truth.
    pub fn describe(self) -> &'static str {
        match self {
            KeySource::Keyring => "encrypted, key in system keyring",
            KeySource::File => "encrypted, key in a local file (no system keyring available)",
        }
    }
}

const KEYRING_SERVICE: &str = "idm";
const KEYRING_ACCOUNT: &str = "secrets-key";

pub struct Vault {
    path: PathBuf,
    key_path: PathBuf,
}

#[derive(serde::Serialize, serde::Deserialize)]
struct OnDisk {
    v: u32,
    alg: String,
    key: String,
    nonce: String,
    ct: String,
}

impl Vault {
    pub fn new(state_dir: &Path) -> Vault {
        Vault {
            path: state_dir.join("secrets.json"),
            key_path: state_dir.join("secrets.key"),
        }
    }

    pub fn exists(&self) -> bool {
        self.path.exists()
    }

    /// Store `plaintext` and return the reference to put in the JSON file,
    /// `secret:<16 hex>`.
    pub fn set(&self, plaintext: &str) -> Result<String> {
        let (mut items, source) = self.open_or_create()?;
        let id = random_hex16();
        items.insert(id.clone(), plaintext.to_string());
        self.write(&items, source)?;
        Ok(format!("secret:{}", id))
    }

    /// Resolve a reference. A reference that is not in the vault, or a vault
    /// that will not open, is an error -- never an empty password, which would
    /// turn into a 401 halfway through a resume and look like a network fault.
    pub fn get(&self, reference: &str) -> Result<String> {
        let id = id_of(reference)?;
        let (items, _) = self.open()?;
        items
            .get(id)
            .cloned()
            .ok_or_else(|| anyhow!("no such secret: {}", reference))
    }

    pub fn del(&self, reference: &str) -> Result<()> {
        let id = id_of(reference)?;
        let (mut items, source) = self.open()?;
        items.remove(id);
        self.write(&items, source)
    }

    pub fn key_source(&self) -> Result<KeySource> {
        Ok(self.open()?.1)
    }

    // ---- internals ----

    fn open(&self) -> Result<(BTreeMap<String, String>, KeySource)> {
        let raw = std::fs::read_to_string(&self.path)
            .with_context(|| format!("cannot read {}", self.path.display()))?;
        let disk: OnDisk = serde_json::from_str(&raw).context("secrets.json is not valid JSON")?;
        if disk.v != 1 {
            return Err(anyhow!("secrets.json version {} is not supported", disk.v));
        }
        if disk.alg != "chacha20poly1305" {
            return Err(anyhow!("unknown vault algorithm {:?}", disk.alg));
        }
        let source = KeySource::parse(&disk.key)?;
        let key = self.load_key(source)?;
        let nonce_raw = b64_decode(&disk.nonce)?;
        if nonce_raw.len() != 12 {
            return Err(anyhow!("nonce must be 12 bytes, found {}", nonce_raw.len()));
        }
        let ct = b64_decode(&disk.ct)?;
        let cipher = ChaCha20Poly1305::new(Key::from_slice(&key));
        let plain = cipher
            .decrypt(Nonce::from_slice(&nonce_raw), ct.as_ref())
            .map_err(|_| anyhow!("cannot unlock stored password (wrong key or damaged vault)"))?;
        let items: BTreeMap<String, String> =
            serde_json::from_slice(&plain).context("vault contents are not valid JSON")?;
        Ok((items, source))
    }

    fn open_or_create(&self) -> Result<(BTreeMap<String, String>, KeySource)> {
        if self.exists() {
            return self.open();
        }
        Ok((BTreeMap::new(), self.create_key()?))
    }

    fn write(&self, items: &BTreeMap<String, String>, source: KeySource) -> Result<()> {
        let key = self.load_key(source)?;
        let mut nonce = [0u8; 12];
        OsRng.fill_bytes(&mut nonce);
        let cipher = ChaCha20Poly1305::new(Key::from_slice(&key));
        let plain = serde_json::to_vec(items)?;
        let ct = cipher
            .encrypt(Nonce::from_slice(&nonce), plain.as_ref())
            .map_err(|_| anyhow!("cannot encrypt the vault"))?;
        let disk = OnDisk {
            v: 1,
            alg: "chacha20poly1305".to_string(),
            key: source.as_str().to_string(),
            nonce: b64_encode(&nonce),
            ct: b64_encode(&ct),
        };
        write_private(&self.path, serde_json::to_string(&disk)?.as_bytes())
    }

    /// A brand-new key, in the keyring if there is one, in a 0600 file if not.
    fn create_key(&self) -> Result<KeySource> {
        let mut key = [0u8; 32];
        OsRng.fill_bytes(&mut key);
        if keyring_enabled() && keyring_set(&b64_encode(&key)).is_ok() {
            return Ok(KeySource::Keyring);
        }
        write_private(&self.key_path, b64_encode(&key).as_bytes())?;
        Ok(KeySource::File)
    }

    fn load_key(&self, source: KeySource) -> Result<Vec<u8>> {
        let encoded = match source {
            KeySource::Keyring => keyring_get()
                .context("the vault key is in the system keyring, which cannot be read")?,
            KeySource::File => std::fs::read_to_string(&self.key_path)
                .with_context(|| format!("cannot read {}", self.key_path.display()))?,
        };
        let key = b64_decode(encoded.trim())?;
        if key.len() != 32 {
            return Err(anyhow!("the vault key must be 32 bytes, found {}", key.len()));
        }
        Ok(key)
    }
}

/// `secret:<16 hex>` -> the id. Anything else is rejected rather than guessed
/// at, so a stray plaintext password can never be mistaken for a reference.
pub fn id_of(reference: &str) -> Result<&str> {
    let id = reference
        .strip_prefix("secret:")
        .ok_or_else(|| anyhow!("not a secret reference: {:?}", reference))?;
    if id.len() != 16 || !id.bytes().all(|b| b.is_ascii_hexdigit()) {
        return Err(anyhow!("malformed secret reference: {:?}", reference));
    }
    Ok(id)
}

pub fn is_reference(s: &str) -> bool {
    id_of(s).is_ok()
}

fn random_hex16() -> String {
    let mut raw = [0u8; 8];
    OsRng.fill_bytes(&mut raw);
    raw.iter().map(|b| format!("{:02x}", b)).collect()
}

/// Atomic, 0600 from the first byte: the temp file is created with the mode it
/// needs, so the finished file is never briefly world-readable.
fn write_private(path: &Path, bytes: &[u8]) -> Result<()> {
    if let Some(dir) = path.parent() {
        std::fs::create_dir_all(dir).ok();
    }
    let tmp = path.with_extension("tmp");
    {
        let mut opts = std::fs::OpenOptions::new();
        opts.write(true).create(true).truncate(true);
        #[cfg(unix)]
        {
            use std::os::unix::fs::OpenOptionsExt;
            opts.mode(0o600);
        }
        let mut f = opts.open(&tmp).with_context(|| format!("cannot write {}", tmp.display()))?;
        use std::io::Write;
        f.write_all(bytes)?;
        f.sync_all().ok();
    }
    std::fs::rename(&tmp, path)?;
    #[cfg(unix)]
    {
        use std::os::unix::fs::PermissionsExt;
        let _ = std::fs::set_permissions(path, std::fs::Permissions::from_mode(0o600));
    }
    Ok(())
}

/// IDM_NO_KEYRING=1 forces the file fallback. Containers, CI and headless
/// boxes have no Secret Service, and the tests need a predictable answer.
fn keyring_enabled() -> bool {
    !matches!(std::env::var("IDM_NO_KEYRING").as_deref(), Ok("1"))
}

#[cfg(feature = "keyring")]
fn keyring_set(value: &str) -> Result<()> {
    let entry = keyring::Entry::new(KEYRING_SERVICE, KEYRING_ACCOUNT)?;
    entry.set_password(value)?;
    Ok(())
}

#[cfg(feature = "keyring")]
fn keyring_get() -> Result<String> {
    let entry = keyring::Entry::new(KEYRING_SERVICE, KEYRING_ACCOUNT)?;
    Ok(entry.get_password()?)
}

#[cfg(not(feature = "keyring"))]
fn keyring_set(_value: &str) -> Result<()> {
    Err(anyhow!("this build has no keyring support"))
}

#[cfg(not(feature = "keyring"))]
fn keyring_get() -> Result<String> {
    let _ = (KEYRING_SERVICE, KEYRING_ACCOUNT);
    Err(anyhow!("this build has no keyring support"))
}

// ---- base64, standard alphabet with padding ----

fn b64_encode(raw: &[u8]) -> String {
    const T: &[u8; 64] = b"ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
    let mut out = String::new();
    for c in raw.chunks(3) {
        let b = [c[0], *c.get(1).unwrap_or(&0), *c.get(2).unwrap_or(&0)];
        let v = ((b[0] as u32) << 16) | ((b[1] as u32) << 8) | b[2] as u32;
        out.push(T[(v >> 18) as usize & 63] as char);
        out.push(T[(v >> 12) as usize & 63] as char);
        out.push(if c.len() > 1 { T[(v >> 6) as usize & 63] as char } else { '=' });
        out.push(if c.len() > 2 { T[v as usize & 63] as char } else { '=' });
    }
    out
}

fn b64_decode(s: &str) -> Result<Vec<u8>> {
    fn val(c: u8) -> Result<u32> {
        Ok(match c {
            b'A'..=b'Z' => (c - b'A') as u32,
            b'a'..=b'z' => (c - b'a') as u32 + 26,
            b'0'..=b'9' => (c - b'0') as u32 + 52,
            b'+' => 62,
            b'/' => 63,
            _ => return Err(anyhow!("invalid base64 character {:?}", c as char)),
        })
    }
    let raw: Vec<u8> = s.bytes().filter(|b| !b.is_ascii_whitespace()).collect();
    if raw.len() % 4 != 0 {
        return Err(anyhow!("base64 length must be a multiple of 4"));
    }
    let mut out = Vec::new();
    for c in raw.chunks(4) {
        let pad = c.iter().filter(|&&b| b == b'=').count();
        let v = (val(c[0])? << 18)
            | (val(c[1])? << 12)
            | (if pad > 1 { 0 } else { val(c[2])? << 6 })
            | (if pad > 0 { 0 } else { val(c[3])? });
        out.push((v >> 16) as u8);
        if pad < 2 {
            out.push((v >> 8) as u8);
        }
        if pad < 1 {
            out.push(v as u8);
        }
    }
    Ok(out)
}
