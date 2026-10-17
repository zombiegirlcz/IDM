package wlm;

import ch.qos.logback.core.CoreConstants;
import java.io.Closeable;
import java.io.EOFException;
import java.io.Flushable;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TimeZone;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;
import kotlin.text.d0;
import le.u1;
import mmm.h0;
import mmm.k0;
import mmm.l0;
import mmm.s;
import no.f2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class o implements Closeable, Flushable {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Regex f298554t = new Regex("[a-z0-9_-]{1,120}");
    public static final String u = "CLEAN";
    public static final String v = "DIRTY";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f298555w = "REMOVE";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f298556x = "READ";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f298557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f298558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f298559c;
    public final h0 d;
    public final h0 e;
    public final h0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f298560g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public k0 f298561h;
    public final LinkedHashMap i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f298562j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f298563l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f298564m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f298565n;
    public boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f298566p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f298567q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final xlm.b f298568r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final l f298569s;

    public o(h0 directory, long j2, s fileSystem, xlm.d taskRunner) {
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(directory, "directory");
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        this.f298557a = directory;
        this.f298558b = new m(fileSystem);
        this.f298559c = j2;
        this.i = new LinkedHashMap(0, 0.75f, true);
        this.f298568r = taskRunner.d();
        this.f298569s = new l(0, v0.a.i(new StringBuilder(), vlm.j.f290513b, " Cache"), this);
        if (j2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.d = directory.e("journal");
        this.e = directory.e("journal.tmp");
        this.f = directory.e("journal.bkp");
    }

    public static void r(String str) {
        if (!f298554t.f(str)) {
            throw new IllegalArgumentException(p.a.l(CoreConstants.DOUBLE_QUOTE_CHAR, "keys must match regex [a-z0-9_-]{1,120}: \"", str).toString());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f298564m && !this.f298565n) {
                Collection collectionValues = this.i.values();
                Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
                for (j jVar : (j[]) collectionValues.toArray(new j[0])) {
                    Intrinsics.h(jVar);
                    h hVar = jVar.f298545g;
                    if (hVar != null) {
                        hVar.c();
                    }
                }
                q();
                k0 k0Var = this.f298561h;
                if (k0Var != null) {
                    vlm.h.f(k0Var);
                }
                this.f298561h = null;
                this.f298565n = true;
                return;
            }
            this.f298565n = true;
        } catch (Throwable th10) {
            throw th10;
        }
    }

    public final synchronized void d() {
        if (this.f298565n) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized void f(h editor, boolean z) {
        Intrinsics.checkNotNullParameter(editor, "editor");
        j jVar = editor.f298538a;
        if (!Intrinsics.f(jVar.f298545g, editor)) {
            throw new IllegalStateException("Check failed.");
        }
        if (z && !jVar.e) {
            for (int i = 0; i < 2; i++) {
                boolean[] zArr = editor.f298539b;
                Intrinsics.h(zArr);
                if (!zArr[i]) {
                    editor.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                }
                if (!this.f298558b.l((h0) jVar.d.get(i))) {
                    editor.a();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < 2; i2++) {
            h0 h0Var = (h0) jVar.d.get(i2);
            if (!z || jVar.f) {
                vlm.h.i(this.f298558b, h0Var);
            } else if (this.f298558b.l(h0Var)) {
                h0 h0Var2 = (h0) jVar.f298544c.get(i2);
                this.f298558b.g(h0Var, h0Var2);
                long j2 = jVar.f298543b[i2];
                Long lB = this.f298558b.n(h0Var2).b();
                long jLongValue = lB != null ? lB.longValue() : 0L;
                jVar.f298543b[i2] = jLongValue;
                this.f298560g = (this.f298560g - j2) + jLongValue;
            }
        }
        jVar.f298545g = null;
        if (jVar.f) {
            p(jVar);
            return;
        }
        this.f298562j++;
        k0 writer = this.f298561h;
        Intrinsics.h(writer);
        if (jVar.e || z) {
            jVar.e = true;
            writer.p0(u);
            writer.writeByte(32);
            writer.p0(jVar.f298542a);
            Intrinsics.checkNotNullParameter(writer, "writer");
            for (long j3 : jVar.f298543b) {
                writer.writeByte(32);
                writer.l3(j3);
            }
            writer.writeByte(10);
            if (z) {
                long j5 = this.f298567q;
                this.f298567q = 1 + j5;
                jVar.i = j5;
            }
        } else {
            this.i.remove(jVar.f298542a);
            writer.p0(f298555w);
            writer.writeByte(32);
            writer.p0(jVar.f298542a);
            writer.writeByte(10);
        }
        writer.flush();
        if (this.f298560g > this.f298559c || j()) {
            this.f298568r.d(this.f298569s, 0L);
        }
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (this.f298564m) {
            d();
            q();
            k0 k0Var = this.f298561h;
            Intrinsics.h(k0Var);
            k0Var.flush();
        }
    }

    public final synchronized h g(long j2, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        i();
        d();
        r(key);
        j jVar = (j) this.i.get(key);
        if (j2 != -1 && (jVar == null || jVar.i != j2)) {
            return null;
        }
        if ((jVar != null ? jVar.f298545g : null) != null) {
            return null;
        }
        if (jVar != null && jVar.f298546h != 0) {
            return null;
        }
        if (!this.o && !this.f298566p) {
            k0 k0Var = this.f298561h;
            Intrinsics.h(k0Var);
            k0Var.p0(v);
            k0Var.writeByte(32);
            k0Var.p0(key);
            k0Var.writeByte(10);
            k0Var.flush();
            if (this.k) {
                return null;
            }
            if (jVar == null) {
                jVar = new j(this, key);
                this.i.put(key, jVar);
            }
            h hVar = new h(this, jVar);
            jVar.f298545g = hVar;
            return hVar;
        }
        this.f298568r.d(this.f298569s, 0L);
        return null;
    }

    public final synchronized k h(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        i();
        d();
        r(key);
        j jVar = (j) this.i.get(key);
        if (jVar == null) {
            return null;
        }
        k kVarA = jVar.a();
        if (kVarA == null) {
            return null;
        }
        this.f298562j++;
        k0 k0Var = this.f298561h;
        Intrinsics.h(k0Var);
        k0Var.p0(f298556x);
        k0Var.writeByte(32);
        k0Var.p0(key);
        k0Var.writeByte(10);
        if (j()) {
            this.f298568r.d(this.f298569s, 0L);
        }
        return kVarA;
    }

    public final synchronized void i() {
        try {
            TimeZone timeZone = vlm.j.f290512a;
            if (this.f298564m) {
                return;
            }
            if (this.f298558b.l(this.f)) {
                if (this.f298558b.l(this.d)) {
                    this.f298558b.k(this.f);
                } else {
                    this.f298558b.g(this.f, this.d);
                }
            }
            this.f298563l = vlm.h.u(this.f298558b, this.f);
            if (this.f298558b.l(this.d)) {
                try {
                    l();
                    k();
                    this.f298564m = true;
                    return;
                } catch (IOException e) {
                    emm.h.Companion.getClass();
                    emm.h.f127697a.j(5, "DiskLruCache " + this.f298557a + " is corrupt: " + e.getMessage() + ", removing", e);
                    try {
                        close();
                        vlm.h.h(this.f298557a, this.f298558b);
                        this.f298565n = false;
                        n();
                        this.f298564m = true;
                    } catch (Throwable th10) {
                        this.f298565n = false;
                        throw th10;
                    }
                }
            }
            n();
            this.f298564m = true;
        } catch (Throwable th11) {
            throw th11;
        }
    }

    public final boolean j() {
        int i = this.f298562j;
        return i >= 2000 && i >= this.i.size();
    }

    public final void k() {
        h0 h0Var = this.e;
        m mVar = this.f298558b;
        vlm.h.i(mVar, h0Var);
        Iterator it8 = this.i.values().iterator();
        while (it8.hasNext()) {
            Object next = it8.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            j jVar = (j) next;
            int i = 0;
            if (jVar.f298545g == null) {
                while (i < 2) {
                    this.f298560g += jVar.f298543b[i];
                    i++;
                }
            } else {
                jVar.f298545g = null;
                while (i < 2) {
                    vlm.h.i(mVar, (h0) jVar.f298544c.get(i));
                    vlm.h.i(mVar, (h0) jVar.d.get(i));
                    i++;
                }
                it8.remove();
            }
        }
    }

    public final void l() throws Throwable {
        m mVar = this.f298558b;
        h0 h0Var = this.d;
        l0 l0VarC = u1.c(mVar.t(h0Var));
        try {
            String strE = l0VarC.e(Long.MAX_VALUE);
            String strE2 = l0VarC.e(Long.MAX_VALUE);
            String strE3 = l0VarC.e(Long.MAX_VALUE);
            String strE4 = l0VarC.e(Long.MAX_VALUE);
            String strE5 = l0VarC.e(Long.MAX_VALUE);
            if (!"libcore.io.DiskLruCache".equals(strE) || !"1".equals(strE2) || !Intrinsics.f(String.valueOf(201105), strE3) || !Intrinsics.f(String.valueOf(2), strE4) || strE5.length() > 0) {
                throw new IOException("unexpected journal header: [" + strE + ", " + strE2 + ", " + strE4 + ", " + strE5 + ']');
            }
            int i = 0;
            while (true) {
                try {
                    m(l0VarC.e(Long.MAX_VALUE));
                    i++;
                } catch (EOFException unused) {
                    this.f298562j = i - this.i.size();
                    if (l0VarC.J()) {
                        k0 k0Var = this.f298561h;
                        if (k0Var != null) {
                            vlm.h.f(k0Var);
                        }
                        this.f298561h = u1.b(new p(mVar.f(h0Var), new f2(this, 22)));
                    } else {
                        n();
                    }
                    Unit unit = Unit.f186387a;
                    try {
                        l0VarC.close();
                        th = null;
                    } catch (Throwable th10) {
                        th = th10;
                    }
                }
            }
        } catch (Throwable th11) {
            th = th11;
            try {
                l0VarC.close();
            } catch (Throwable th12) {
                yhm.f.a(th, th12);
            }
        }
        if (th != null) {
            throw th;
        }
    }

    public final void m(String str) throws IOException {
        String strSubstring;
        int iS = d0.S(str, zsc.p.SPACE_CHAR, 0, 6);
        if (iS == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i = iS + 1;
        int iS2 = d0.S(str, zsc.p.SPACE_CHAR, i, 4);
        LinkedHashMap linkedHashMap = this.i;
        if (iS2 == -1) {
            strSubstring = str.substring(i);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            String str2 = f298555w;
            if (iS == str2.length() && a0.H(str, str2, false)) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iS2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        }
        j jVar = (j) linkedHashMap.get(strSubstring);
        if (jVar == null) {
            jVar = new j(this, strSubstring);
            linkedHashMap.put(strSubstring, jVar);
        }
        if (iS2 != -1) {
            String str3 = u;
            if (iS == str3.length() && a0.H(str, str3, false)) {
                String strSubstring2 = str.substring(iS2 + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                List strings = d0.m0(strSubstring2, new char[]{zsc.p.SPACE_CHAR}, 6);
                jVar.e = true;
                jVar.f298545g = null;
                Intrinsics.checkNotNullParameter(strings, "strings");
                int size = strings.size();
                jVar.f298547j.getClass();
                if (size != 2) {
                    throw new IOException("unexpected journal line: " + strings);
                }
                try {
                    int size2 = strings.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        jVar.f298543b[i2] = Long.parseLong((String) strings.get(i2));
                    }
                    return;
                } catch (NumberFormatException unused) {
                    throw new IOException("unexpected journal line: " + strings);
                }
            }
        }
        if (iS2 == -1) {
            String str4 = v;
            if (iS == str4.length() && a0.H(str, str4, false)) {
                jVar.f298545g = new h(this, jVar);
                return;
            }
        }
        if (iS2 == -1) {
            String str5 = f298556x;
            if (iS == str5.length() && a0.H(str, str5, false)) {
                return;
            }
        }
        throw new IOException("unexpected journal line: ".concat(str));
    }

    public final synchronized void n() {
        Throwable th10;
        try {
            k0 k0Var = this.f298561h;
            if (k0Var != null) {
                k0Var.close();
            }
            k0 writer = u1.b(this.f298558b.r(this.e));
            try {
                writer.p0("libcore.io.DiskLruCache");
                writer.writeByte(10);
                writer.p0("1");
                writer.writeByte(10);
                writer.l3(201105);
                writer.writeByte(10);
                writer.l3(2);
                writer.writeByte(10);
                writer.writeByte(10);
                for (Object obj2 : this.i.values()) {
                    Intrinsics.checkNotNullExpressionValue(obj2, "next(...)");
                    j jVar = (j) obj2;
                    if (jVar.f298545g != null) {
                        writer.p0(v);
                        writer.writeByte(32);
                        writer.p0(jVar.f298542a);
                        writer.writeByte(10);
                    } else {
                        writer.p0(u);
                        writer.writeByte(32);
                        writer.p0(jVar.f298542a);
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        for (long j2 : jVar.f298543b) {
                            writer.writeByte(32);
                            writer.l3(j2);
                        }
                        writer.writeByte(10);
                    }
                }
                Unit unit = Unit.f186387a;
                try {
                    writer.close();
                    th10 = null;
                } catch (Throwable th11) {
                    th10 = th11;
                }
            } catch (Throwable th12) {
                try {
                    writer.close();
                } catch (Throwable th13) {
                    yhm.f.a(th12, th13);
                }
                th10 = th12;
            }
            if (th10 != null) {
                throw th10;
            }
            if (this.f298558b.l(this.d)) {
                this.f298558b.g(this.d, this.f);
                this.f298558b.g(this.e, this.d);
                vlm.h.i(this.f298558b, this.f);
            } else {
                this.f298558b.g(this.e, this.d);
            }
            k0 k0Var2 = this.f298561h;
            if (k0Var2 != null) {
                vlm.h.f(k0Var2);
            }
            this.f298561h = u1.b(new p(this.f298558b.f(this.d), new f2(this, 22)));
            this.k = false;
            this.f298566p = false;
        } catch (Throwable th14) {
            throw th14;
        }
    }

    public final synchronized void o(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        i();
        d();
        r(key);
        j jVar = (j) this.i.get(key);
        if (jVar == null) {
            return;
        }
        p(jVar);
        if (this.f298560g <= this.f298559c) {
            this.o = false;
        }
    }

    public final void p(j entry) {
        k0 k0Var;
        String str = entry.f298542a;
        Intrinsics.checkNotNullParameter(entry, "entry");
        if (!this.f298563l) {
            if (entry.f298546h > 0 && (k0Var = this.f298561h) != null) {
                k0Var.p0(v);
                k0Var.writeByte(32);
                k0Var.p0(str);
                k0Var.writeByte(10);
                k0Var.flush();
            }
            if (entry.f298546h > 0 || entry.f298545g != null) {
                entry.f = true;
                return;
            }
        }
        h hVar = entry.f298545g;
        if (hVar != null) {
            hVar.c();
        }
        for (int i = 0; i < 2; i++) {
            vlm.h.i(this.f298558b, (h0) entry.f298544c.get(i));
            long j2 = this.f298560g;
            long[] jArr = entry.f298543b;
            this.f298560g = j2 - jArr[i];
            jArr[i] = 0;
        }
        this.f298562j++;
        k0 k0Var2 = this.f298561h;
        if (k0Var2 != null) {
            k0Var2.p0(f298555w);
            k0Var2.writeByte(32);
            k0Var2.p0(str);
            k0Var2.writeByte(10);
        }
        this.i.remove(str);
        if (j()) {
            this.f298568r.d(this.f298569s, 0L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        p(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q() {
        /*
            r4 = this;
        L0:
            long r0 = r4.f298560g
            long r2 = r4.f298559c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L2c
            java.util.LinkedHashMap r0 = r4.i
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r0.next()
            java.lang.String r2 = "next(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            wlm.j r1 = (wlm.j) r1
            boolean r2 = r1.f
            if (r2 != 0) goto L12
            r4.p(r1)
            goto L0
        L2b:
            return
        L2c:
            r0 = 0
            r4.o = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wlm.o.q():void");
    }
}
