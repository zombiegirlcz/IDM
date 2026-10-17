package g8;

import android.util.Log;
import c8.k;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import mp.p;

/* JADX INFO: loaded from: classes16.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r10.f f141223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f141224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f141225c;
    public final r10.d d;
    public z7.c e;

    public c(File file) {
        r10.d dVar = new r10.d();
        dVar.f250818a = new HashMap();
        dVar.f250819b = new f4h.a();
        this.d = dVar;
        this.f141224b = file;
        this.f141225c = 262144000L;
        this.f141223a = new r10.f();
    }

    public static c a(File file) {
        return new c(file);
    }

    public final synchronized z7.c b() {
        try {
            if (this.e == null) {
                this.e = z7.c.l(this.f141224b, this.f141225c);
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return this.e;
    }

    @Override // g8.a
    public final File c(c8.g gVar) {
        String strV = this.f141223a.V(gVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            String str = "Get: Obtained: " + strV + " for for Key: " + gVar;
        }
        try {
            tul.b bVarJ = b().j(strV);
            if (bVarJ != null) {
                return ((File[]) bVarJ.f274637b)[0];
            }
            return null;
        } catch (IOException e) {
            return Log.isLoggable("DiskLruCacheWrapper", 5) ? null : null;
        }
    }

    @Override // g8.a
    public final synchronized void clear() {
        try {
            try {
                z7.c cVarB = b();
                cVarB.close();
                z7.f.a(cVarB.f319836a);
            } catch (IOException e) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                }
                synchronized (this) {
                    this.e = null;
                }
            }
            synchronized (this) {
                this.e = null;
            }
        } catch (Throwable th10) {
            synchronized (this) {
                this.e = null;
                throw th10;
            }
        }
    }

    @Override // g8.a
    public final void d(c8.g gVar, p pVar) {
        b bVar;
        boolean z;
        String strV = this.f141223a.V(gVar);
        r10.d dVar = this.d;
        synchronized (dVar) {
            bVar = (b) ((HashMap) dVar.f250818a).get(strV);
            if (bVar == null) {
                f4h.a aVar = (f4h.a) dVar.f250819b;
                synchronized (((ArrayDeque) aVar.f132229b)) {
                    bVar = (b) ((ArrayDeque) aVar.f132229b).poll();
                }
                if (bVar == null) {
                    bVar = new b();
                }
                ((HashMap) dVar.f250818a).put(strV, bVar);
            }
            bVar.f141222b++;
        }
        bVar.f141221a.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                String str = "Put: Obtained: " + strV + " for for Key: " + gVar;
            }
            try {
                z7.c cVarB = b();
                if (cVarB.j(strV) == null) {
                    jji.e eVarH = cVarB.h(strV);
                    if (eVarH == null) {
                        throw new IllegalStateException("Had two simultaneous puts for: ".concat(strV));
                    }
                    try {
                        if (((c8.d) pVar.f207709b).h(pVar.f207710c, eVarH.e(), (k) pVar.d)) {
                            z7.c.d((z7.c) eVarH.d, eVarH, true);
                            eVarH.f174962a = true;
                        }
                        if (!z) {
                            try {
                                eVarH.a();
                            } catch (IOException unused) {
                            }
                        }
                    } finally {
                        if (!eVarH.f174962a) {
                            try {
                                eVarH.a();
                            } catch (IOException unused2) {
                            }
                        }
                    }
                }
            } catch (IOException e) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                }
            }
        } finally {
            this.d.s0(strV);
        }
    }
}
