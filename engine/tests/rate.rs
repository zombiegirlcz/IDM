// Speed and time-left for the queue.
//
// /api/items reported downloaded and total and nothing else, so the window's
// "Speed" and "Time Left" columns were ALWAYS EMPTY, and their sort keys
// (speed_bps, time_left_s) compared zero against zero on every row. A column
// cannot show a number the server never sends.
//
// The queue already polls the .idmmeta sidecar every 300 ms for (total,
// downloaded); speed is the difference between two of those looks. The
// arithmetic is a pure function so it can be tested without waiting for real
// seconds to pass, and smoothed, because a raw difference over a 300 ms window
// jumps around far too much to read.

use std::io::{Read, Write};
use std::net::TcpListener;
use std::path::PathBuf;
use std::process::{Child, Command};
use std::sync::atomic::{AtomicU64, Ordering};
use std::thread;
use std::time::{Duration, Instant};

const IDM: &str = env!("CARGO_BIN_EXE_idm");
const API_TOKEN: &str = "testtoken0123456789";

fn unique_dir(tag: &str) -> PathBuf {
    static C: AtomicU64 = AtomicU64::new(0);
    let n = C.fetch_add(1, Ordering::SeqCst);
    let d = std::env::temp_dir().join(format!("idm_rate_{}_{}_{}", tag, std::process::id(), n));
    std::fs::create_dir_all(&d).unwrap();
    d
}

fn free_port() -> u16 {
    TcpListener::bind("127.0.0.1:0").unwrap().local_addr().unwrap().port()
}

/// A deliberately slow origin: `total` bytes, handed out in `chunk` pieces
/// with `gap` between them, so the download lasts long enough to be measured.
fn slow_origin(total: usize, chunk: usize, gap: Duration) -> String {
    let listener = TcpListener::bind("127.0.0.1:0").unwrap();
    let addr = format!("http://{}", listener.local_addr().unwrap());
    thread::spawn(move || {
        for mut s in listener.incoming().flatten() {
            thread::spawn(move || {
                let mut buf = [0u8; 2048];
                let _ = s.read(&mut buf);
                let head = format!(
                    "HTTP/1.1 200 OK\r\nContent-Length: {total}\r\nAccept-Ranges: bytes\r\nConnection: close\r\n\r\n"
                );
                if s.write_all(head.as_bytes()).is_err() {
                    return;
                }
                let body = vec![b'x'; chunk];
                let mut sent = 0;
                while sent < total {
                    let n = chunk.min(total - sent);
                    if s.write_all(&body[..n]).is_err() {
                        return;
                    }
                    let _ = s.flush();
                    sent += n;
                    thread::sleep(gap);
                }
            });
        }
    });
    addr
}

fn start_server(out: &PathBuf, state: &PathBuf) -> (Child, String) {
    for _ in 0..8 {
        let addr = format!("127.0.0.1:{}", free_port());
        let mut child = Command::new(IDM)
            .arg("--serve")
            .arg(&addr)
            .arg("--output-dir")
            .arg(out)
            .arg("--state-dir")
            .arg(state)
            .arg("--api-token")
            .arg(API_TOKEN)
            .spawn()
            .expect("spawn idm --serve");
        let deadline = Instant::now() + Duration::from_secs(15);
        loop {
            if matches!(child.try_wait(), Ok(Some(_))) {
                break;
            }
            if std::net::TcpStream::connect(&addr).is_ok() {
                // A connect that succeeds does not say whose server answered.
                thread::sleep(Duration::from_millis(250));
                if matches!(child.try_wait(), Ok(Some(_))) {
                    break;
                }
                return (child, addr);
            }
            if Instant::now() > deadline {
                let _ = child.kill();
                panic!("idm --serve never came up on {addr}");
            }
            thread::sleep(Duration::from_millis(100));
        }
    }
    panic!("could not get a port of our own");
}

fn http(addr: &str, method: &str, path: &str, body: Option<&str>) -> String {
    let mut s = std::net::TcpStream::connect(addr).expect("connect to idm --serve");
    s.set_read_timeout(Some(Duration::from_secs(20))).unwrap();
    let body = body.unwrap_or("");
    let req = format!(
        "{method} {path} HTTP/1.1\r\nHost: {addr}\r\nContent-Type: application/json\r\n\
         X-IDM-Token: {API_TOKEN}\r\nContent-Length: {}\r\nConnection: close\r\n\r\n{body}",
        body.len()
    );
    s.write_all(req.as_bytes()).unwrap();
    let mut out = String::new();
    let _ = s.read_to_string(&mut out);
    out.split_once("\r\n\r\n").map(|(_, b)| b.to_string()).unwrap_or(out)
}

#[test]
fn a_running_item_reports_a_speed_and_a_time_left() {
    let out = unique_dir("out");
    let state = unique_dir("state");
    // 2 MB at 32 kB / 50 ms is about 3 s -- long enough to be sampled more
    // than once, short enough not to pad the suite.
    let origin = slow_origin(2 * 1024 * 1024, 32 * 1024, Duration::from_millis(50));
    let (mut child, addr) = start_server(&out, &state);

    let add = http(
        &addr,
        "POST",
        "/api/add",
        Some(&format!("{{\"url\":\"{origin}/big.bin\"}}")),
    );
    let v: serde_json::Value = serde_json::from_str(&add).expect(&add);
    let id = v["id"].as_u64().expect(&add);

    // Wait until the engine has actually moved some bytes, then read the rate.
    let deadline = Instant::now() + Duration::from_secs(20);
    let mut seen = serde_json::Value::Null;
    loop {
        let items = http(&addr, "GET", "/api/items", None);
        let parsed: serde_json::Value = serde_json::from_str(&items).expect(&items);
        let it = parsed["items"]
            .as_array()
            .and_then(|a| a.iter().find(|i| i["id"].as_u64() == Some(id)))
            .cloned()
            .unwrap_or(serde_json::Value::Null);
        let bps = it["speed_bps"].as_u64().unwrap_or(0);
        if bps > 0 {
            seen = it;
            break;
        }
        if Instant::now() > deadline {
            let _ = child.kill();
            panic!("no speed was ever reported; last item: {it}");
        }
        thread::sleep(Duration::from_millis(200));
    }

    let bps = seen["speed_bps"].as_u64().unwrap();
    assert!(
        (100_000..20_000_000).contains(&bps),
        "a 32kB/50ms origin is ~640 kB/s; got {bps} B/s in {seen}",
    );
    let left = seen["time_left_s"].as_u64().expect(&format!("no time_left_s in {seen}"));
    assert!(left > 0 && left < 600, "time left must be plausible, got {left}s");

    let _ = child.kill();
}

#[test]
fn a_finished_item_reports_no_speed() {
    // A row sitting at 100% must not keep claiming it is moving bytes.
    let out = unique_dir("out");
    let state = unique_dir("state");
    let origin = slow_origin(4096, 4096, Duration::from_millis(0));
    let (mut child, addr) = start_server(&out, &state);
    let add = http(
        &addr,
        "POST",
        "/api/add",
        Some(&format!("{{\"url\":\"{origin}/small.bin\"}}")),
    );
    let v: serde_json::Value = serde_json::from_str(&add).expect(&add);
    let id = v["id"].as_u64().expect(&add);

    let deadline = Instant::now() + Duration::from_secs(30);
    loop {
        let items = http(&addr, "GET", "/api/items", None);
        let parsed: serde_json::Value = serde_json::from_str(&items).expect(&items);
        let it = parsed["items"]
            .as_array()
            .and_then(|a| a.iter().find(|i| i["id"].as_u64() == Some(id)))
            .cloned()
            .unwrap_or(serde_json::Value::Null);
        if it["status"].as_str() == Some("done") {
            assert_eq!(
                it["speed_bps"].as_u64(),
                Some(0),
                "a finished item must report no speed: {it}",
            );
            assert_eq!(
                it["time_left_s"].as_u64(),
                Some(0),
                "nor any time left: {it}",
            );
            break;
        }
        if Instant::now() > deadline {
            let _ = child.kill();
            panic!("the download never finished; last item: {it}");
        }
        thread::sleep(Duration::from_millis(200));
    }
    let _ = child.kill();
}

#[test]
fn the_queue_file_does_not_carry_a_speed() {
    // speed is a live reading, not state. Persisting it would make a restart
    // show a rate nothing is producing.
    let out = unique_dir("out");
    let state = unique_dir("state");
    let origin = slow_origin(4096, 4096, Duration::from_millis(0));
    let (mut child, addr) = start_server(&out, &state);
    let add = http(
        &addr,
        "POST",
        "/api/add",
        Some(&format!("{{\"url\":\"{origin}/small.bin\"}}")),
    );
    assert!(add.contains("\"ok\":true"), "{add}");
    thread::sleep(Duration::from_millis(1500));
    let queue = std::fs::read_to_string(state.join("queue.json")).unwrap_or_default();
    assert!(
        !queue.contains("speed_bps") && !queue.contains("time_left_s"),
        "queue.json must stay free of live readings: {queue}",
    );
    let _ = child.kill();
}
