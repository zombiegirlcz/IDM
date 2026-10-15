// themed_toplevel() must build a window, not call itself.
//
// A global search-and-replace that pointed every dialog at themed_toplevel()
// also rewrote the tk.Toplevel() call INSIDE themed_toplevel, so opening any
// dialog recursed until Python gave up:
//
//     File ".../idm_gui.py", in themed_toplevel
//       win = themed_toplevel(parent)
//     [Previous line repeated 992 more times]
//     RecursionError: maximum recursion depth exceeded
//
// The context-menu tests caught it in CI. This one states the requirement
// directly, so the next person to touch that function finds out in a second.
//
// Runs with: node --test gui/test/toplevel.test.mjs

import test from 'node:test';
import assert from 'node:assert/strict';
import { spawnSync } from 'node:child_process';
import { fileURLToPath } from 'node:url';
import { dirname, join } from 'node:path';

const here = dirname(fileURLToPath(import.meta.url));
const guiPy = join(here, '..', 'idm_gui.py');

function tk(snippet) {
  const code = `
import sys, json
sys.path.insert(0, ${JSON.stringify(dirname(guiPy))})
import tkinter as tk
import idm_gui as g
root = tk.Tk()
root.withdraw()
${snippet}
root.destroy()
`;
  const res = spawnSync('xvfb-run', ['-a', 'python3', '-I', '-c', code],
    { encoding: 'utf8', maxBuffer: 2 * 1024 * 1024 });
  assert.equal(res.status, 0, `failed:\n${res.stdout}\n${res.stderr}`);
  const line = res.stdout.split('\n').find((l) => l.startsWith('R:'));
  assert.ok(line, `no R: line:\n${res.stdout}\n${res.stderr}`);
  return JSON.parse(line.slice(2));
}

test('themed_toplevel returns a real Toplevel', () => {
  const r = tk(`
win = g.themed_toplevel(root)
print("R:" + json.dumps({"cls": win.winfo_class(), "exists": bool(win.winfo_exists())}))
`);
  assert.equal(r.cls, 'Toplevel', 'it must build a Toplevel, not something else');
  assert.ok(r.exists);
});

test('opening several dialogs does not recurse', () => {
  // One call was enough to blow the stack; this also proves they are distinct
  // windows rather than one returned repeatedly.
  const r = tk(`
wins = [g.themed_toplevel(root) for _ in range(5)]
print("R:" + json.dumps({"n": len({str(w) for w in wins})}))
`);
  assert.equal(r.n, 5, 'five calls must give five separate windows');
});

test('theme_widget_tree paints the classic widgets it walks', () => {
  // Deliberately built on the root rather than inside a Toplevel: a Label
  // packed into a fresh Toplevel trips an xcb assertion in some containers,
  // and that has nothing to do with what this is checking.
  const r = tk(`
pal = g.theme_palette("dark")
frame = tk.Frame(root)
lbl = tk.Label(frame, text="x")
entry = tk.Entry(frame)
n = g.theme_widget_tree(frame, pal)
print("R:" + json.dumps({
    "touched": n,
    "label_bg": str(lbl.cget("background")),
    "entry_bg": str(entry.cget("background")),
    "caret": str(entry.cget("insertbackground")),
    "bg": pal["bg"],
    "surface": pal["surface"],
    "fg": pal["fg"],
}))
`);
  assert.ok(r.touched > 0, 'it walked nothing');
  assert.equal(r.label_bg.toLowerCase(), r.bg.toLowerCase(),
    'a classic Label must be painted, not left platform grey');
  assert.equal(r.entry_bg.toLowerCase(), r.surface.toLowerCase(),
    'an Entry is content and belongs on the surface colour');
  assert.equal(r.caret.toLowerCase(), r.fg.toLowerCase(),
    'the caret must be visible on a dark entry');
});
