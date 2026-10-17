package z7;

import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import zsc.p;

/* JADX INFO: loaded from: classes16.dex */
public final class c implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f319836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f319837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f319838c;
    public final File d;
    public final long f;
    public BufferedWriter i;
    public int k;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f319840h = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f319841j = new LinkedHashMap(0, 0.75f, true);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f319842l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ThreadPoolExecutor f319843m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a());

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final sd.d f319844n = new sd.d(this, 3);
    public final int e = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f319839g = 1;

    public c(File file, long j2) {
        this.f319836a = file;
        this.f319837b = new File(file, "journal");
        this.f319838c = new File(file, "journal.tmp");
        this.d = new File(file, "journal.bkp");
        this.f = j2;
    }

    public static void d(c cVar, jji.e eVar, boolean z) {
        synchronized (cVar) {
            b bVar = (b) eVar.f174963b;
            if (bVar.f != eVar) {
                throw new IllegalStateException();
            }
            if (z && !bVar.e) {
                for (int i = 0; i < cVar.f319839g; i++) {
                    if (!((boolean[]) eVar.f174964c)[i]) {
                        eVar.a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    }
                    if (!bVar.d[i].exists()) {
                        eVar.a();
                        return;
                    }
                }
            }
            for (int i2 = 0; i2 < cVar.f319839g; i2++) {
                File file = bVar.d[i2];
                if (!z) {
                    g(file);
                } else if (file.exists()) {
                    File file2 = bVar.f319834c[i2];
                    file.renameTo(file2);
                    long j2 = bVar.f319833b[i2];
                    long length = file2.length();
                    bVar.f319833b[i2] = length;
                    cVar.f319840h = (cVar.f319840h - j2) + length;
                }
            }
            cVar.k++;
            bVar.f = null;
            if (bVar.e || z) {
                bVar.e = true;
                cVar.i.append((CharSequence) "CLEAN");
                cVar.i.append(p.SPACE_CHAR);
                cVar.i.append((CharSequence) bVar.f319832a);
                cVar.i.append((CharSequence) bVar.a());
                cVar.i.append('\n');
                if (z) {
                    cVar.f319842l++;
                }
            } else {
                cVar.f319841j.remove(bVar.f319832a);
                cVar.i.append((CharSequence) "REMOVE");
                cVar.i.append(p.SPACE_CHAR);
                cVar.i.append((CharSequence) bVar.f319832a);
                cVar.i.append('\n');
            }
            i(cVar.i);
            if (cVar.f319840h > cVar.f || cVar.k()) {
                cVar.f319843m.submit(cVar.f319844n);
            }
        }
    }

    public static void f(BufferedWriter bufferedWriter) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void g(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static void i(BufferedWriter bufferedWriter) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static c l(File file, long j2) throws IOException {
        if (j2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                q(file2, file3, false);
            }
        }
        c cVar = new c(file, j2);
        if (cVar.f319837b.exists()) {
            try {
                cVar.n();
                cVar.m();
                return cVar;
            } catch (IOException e) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                cVar.close();
                f.a(cVar.f319836a);
            }
        }
        file.mkdirs();
        c cVar2 = new c(file, j2);
        cVar2.p();
        return cVar2;
    }

    public static void q(File file, File file2, boolean z) throws IOException {
        if (z) {
            g(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.i == null) {
                return;
            }
            Iterator it8 = new ArrayList(this.f319841j.values()).iterator();
            while (it8.hasNext()) {
                jji.e eVar = ((b) it8.next()).f;
                if (eVar != null) {
                    eVar.a();
                }
            }
            r();
            f(this.i);
            this.i = null;
        } catch (Throwable th10) {
            throw th10;
        }
    }

    public final jji.e h(String str) {
        synchronized (this) {
            try {
                if (this.i == null) {
                    throw new IllegalStateException("cache is closed");
                }
                b bVar = (b) this.f319841j.get(str);
                if (bVar == null) {
                    bVar = new b(this, str);
                    this.f319841j.put(str, bVar);
                } else if (bVar.f != null) {
                    return null;
                }
                jji.e eVar = new jji.e(this, bVar);
                bVar.f = eVar;
                this.i.append((CharSequence) "DIRTY");
                this.i.append(p.SPACE_CHAR);
                this.i.append((CharSequence) str);
                this.i.append('\n');
                i(this.i);
                return eVar;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final synchronized tul.b j(String str) {
        if (this.i == null) {
            throw new IllegalStateException("cache is closed");
        }
        b bVar = (b) this.f319841j.get(str);
        if (bVar == null) {
            return null;
        }
        if (!bVar.e) {
            return null;
        }
        for (File file : bVar.f319834c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.k++;
        this.i.append((CharSequence) "READ");
        this.i.append(p.SPACE_CHAR);
        this.i.append((CharSequence) str);
        this.i.append('\n');
        if (k()) {
            this.f319843m.submit(this.f319844n);
        }
        return new tul.b(bVar.f319834c, 27);
    }

    public final boolean k() {
        int i = this.k;
        return i >= 2000 && i >= this.f319841j.size();
    }

    public final void m() throws IOException {
        g(this.f319838c);
        Iterator it8 = this.f319841j.values().iterator();
        while (it8.hasNext()) {
            b bVar = (b) it8.next();
            jji.e eVar = bVar.f;
            int i = this.f319839g;
            int i2 = 0;
            if (eVar == null) {
                while (i2 < i) {
                    this.f319840h += bVar.f319833b[i2];
                    i2++;
                }
            } else {
                bVar.f = null;
                while (i2 < i) {
                    g(bVar.f319834c[i2]);
                    g(bVar.d[i2]);
                    i2++;
                }
                it8.remove();
            }
        }
    }

    public final void n() {
        File file = this.f319837b;
        e eVar = new e(new FileInputStream(file), f.f319849a);
        try {
            String strD = eVar.d();
            String strD2 = eVar.d();
            String strD3 = eVar.d();
            String strD4 = eVar.d();
            String strD5 = eVar.d();
            if (!"libcore.io.DiskLruCache".equals(strD) || !"1".equals(strD2) || !Integer.toString(this.e).equals(strD3) || !Integer.toString(this.f319839g).equals(strD4) || !"".equals(strD5)) {
                throw new IOException("unexpected journal header: [" + strD + ", " + strD2 + ", " + strD4 + ", " + strD5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    o(eVar.d());
                    i++;
                } catch (EOFException unused) {
                    this.k = i - this.f319841j.size();
                    if (eVar.e == -1) {
                        p();
                    } else {
                        this.i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), f.f319849a));
                    }
                    try {
                        eVar.close();
                        return;
                    } catch (RuntimeException e) {
                        throw e;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th10) {
            try {
                eVar.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused3) {
            }
            throw th10;
        }
    }

    public final void o(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i);
        LinkedHashMap linkedHashMap = this.f319841j;
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIndexOf2);
        }
        b bVar = (b) linkedHashMap.get(strSubstring);
        if (bVar == null) {
            bVar = new b(this, strSubstring);
            linkedHashMap.put(strSubstring, bVar);
        }
        if (iIndexOf2 == -1 || iIndexOf != 5 || !str.startsWith("CLEAN")) {
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
                bVar.f = new jji.e(this, bVar);
                return;
            } else {
                if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
        bVar.e = true;
        bVar.f = null;
        if (strArrSplit.length != bVar.f319835g.f319839g) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
        }
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            try {
                bVar.f319833b[i2] = Long.parseLong(strArrSplit[i2]);
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
            }
        }
    }

    public final synchronized void p() {
        try {
            BufferedWriter bufferedWriter = this.i;
            if (bufferedWriter != null) {
                f(bufferedWriter);
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f319838c), f.f319849a));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write("\n");
                bufferedWriter2.write("1");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.e));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f319839g));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (b bVar : this.f319841j.values()) {
                    if (bVar.f != null) {
                        bufferedWriter2.write("DIRTY " + bVar.f319832a + '\n');
                    } else {
                        bufferedWriter2.write("CLEAN " + bVar.f319832a + bVar.a() + '\n');
                    }
                }
                f(bufferedWriter2);
                if (this.f319837b.exists()) {
                    q(this.f319837b, this.d, true);
                }
                q(this.f319838c, this.f319837b, false);
                this.d.delete();
                this.i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f319837b, true), f.f319849a));
            } catch (Throwable th10) {
                f(bufferedWriter2);
                throw th10;
            }
        } catch (Throwable th11) {
            throw th11;
        }
    }

    public final void r() {
        while (this.f319840h > this.f) {
            String str = (String) ((Map.Entry) this.f319841j.entrySet().iterator().next()).getKey();
            synchronized (this) {
                try {
                    if (this.i == null) {
                        throw new IllegalStateException("cache is closed");
                    }
                    b bVar = (b) this.f319841j.get(str);
                    if (bVar != null && bVar.f == null) {
                        for (int i = 0; i < this.f319839g; i++) {
                            File file = bVar.f319834c[i];
                            if (file.exists() && !file.delete()) {
                                throw new IOException("failed to delete " + file);
                            }
                            long j2 = this.f319840h;
                            long[] jArr = bVar.f319833b;
                            this.f319840h = j2 - jArr[i];
                            jArr[i] = 0;
                        }
                        this.k++;
                        this.i.append((CharSequence) "REMOVE");
                        this.i.append(p.SPACE_CHAR);
                        this.i.append((CharSequence) str);
                        this.i.append('\n');
                        this.f319841j.remove(str);
                        if (k()) {
                            this.f319843m.submit(this.f319844n);
                        }
                    }
                } finally {
                }
            }
        }
    }
}
