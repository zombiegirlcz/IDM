package e8;

import android.os.SystemClock;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import androidx.core.util.Pools$Pool;
import au0.x5;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class m implements f, Runnable, Comparable, z8.b {
    public c8.a A;
    public com.bumptech.glide.load.data.e B;
    public volatile g C;
    public volatile boolean D;
    public volatile boolean E;
    public boolean F;
    public final r d;
    public final Pools$Pool e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.bumptech.glide.f f123489h;
    public c8.g i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public com.bumptech.glide.h f123490j;
    public x k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f123491l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f123492m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p f123493n;
    public c8.k o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public v f123494p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f123495q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public l f123496r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public k f123497s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f123498t;
    public boolean u;
    public Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Thread f123499w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public c8.g f123500x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public c8.g f123501y;
    public Object z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f123485a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f123486b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z8.e f123487c = new z8.e();
    public final gpk.c f = new gpk.c();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j f123488g = new j();

    public m(r rVar, gpk.c cVar) {
        this.d = rVar;
        this.e = cVar;
    }

    @Override // e8.f
    public final void a(c8.g gVar, Object obj2, com.bumptech.glide.load.data.e eVar, c8.a aVar, c8.g gVar2) {
        this.f123500x = gVar;
        this.z = obj2;
        this.B = eVar;
        this.A = aVar;
        this.f123501y = gVar2;
        this.F = gVar != this.f123485a.a().get(0);
        if (Thread.currentThread() != this.f123499w) {
            l(k.DECODE_DATA);
        } else {
            f();
        }
    }

    @Override // z8.b
    public final z8.e b() {
        return this.f123487c;
    }

    @Override // e8.f
    public final void c(c8.g gVar, Exception exc2, com.bumptech.glide.load.data.e eVar, c8.a aVar) {
        eVar.cleanup();
        GlideException glideException = new GlideException("Fetching data failed", Collections.singletonList(exc2));
        Class clsA = eVar.a();
        glideException.f26123b = gVar;
        glideException.f26124c = aVar;
        glideException.d = clsA;
        this.f123486b.add(glideException);
        if (Thread.currentThread() != this.f123499w) {
            l(k.SWITCH_TO_SOURCE_SERVICE);
        } else {
            m();
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj2) {
        m mVar = (m) obj2;
        int iOrdinal = this.f123490j.ordinal() - mVar.f123490j.ordinal();
        return iOrdinal == 0 ? this.f123495q - mVar.f123495q : iOrdinal;
    }

    public final e0 d(com.bumptech.glide.load.data.e eVar, Object obj2, c8.a aVar) {
        if (obj2 == null) {
            return null;
        }
        try {
            int i = y8.h.f311602b;
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            e0 e0VarE = e(obj2, aVar);
            if (Log.isLoggable("DecodeJob", 2)) {
                i(jElapsedRealtimeNanos, "Decoded result " + e0VarE, null);
            }
            return e0VarE;
        } finally {
            eVar.cleanup();
        }
    }

    public final e0 e(Object obj2, c8.a aVar) {
        Class<?> cls = obj2.getClass();
        h hVar = this.f123485a;
        c0 c0VarC = hVar.c(cls);
        c8.k kVar = this.o;
        boolean z = aVar == c8.a.RESOURCE_DISK_CACHE || hVar.f123472r;
        c8.j jVar = l8.p.i;
        Boolean bool = (Boolean) kVar.a(jVar);
        if (bool == null || (bool.booleanValue() && !z)) {
            kVar = new c8.k();
            y8.c cVar = this.o.f22068a;
            y8.c cVar2 = kVar.f22068a;
            cVar2.putAll((SimpleArrayMap) cVar);
            cVar2.put(jVar, Boolean.valueOf(z));
        }
        c8.k kVar2 = kVar;
        com.bumptech.glide.load.data.g gVarG = this.f123489h.a().g(obj2);
        try {
            int i = this.f123491l;
            int i2 = this.f123492m;
            r10.w wVar = new r10.w(this, aVar);
            Pools$Pool pools$Pool = c0VarC.f123436a;
            Object objAcquire = pools$Pool.acquire();
            y8.f.c(objAcquire, "Argument must not be null");
            List list = (List) objAcquire;
            try {
                e0 e0VarA = c0VarC.a(gVarG, kVar2, i, i2, wVar, list);
                pools$Pool.release(list);
                return e0VarA;
            } catch (Throwable th10) {
                pools$Pool.release(list);
                throw th10;
            }
        } finally {
            gVarG.cleanup();
        }
    }

    public final void f() {
        e0 e0VarD;
        boolean zA;
        if (Log.isLoggable("DecodeJob", 2)) {
            i(this.f123498t, "Retrieved data", "data: " + this.z + ", cache key: " + this.f123500x + ", fetcher: " + this.B);
        }
        d0 d0Var = null;
        try {
            e0VarD = d(this.B, this.z, this.A);
        } catch (GlideException e) {
            c8.g gVar = this.f123501y;
            c8.a aVar = this.A;
            e.f26123b = gVar;
            e.f26124c = aVar;
            e.d = null;
            this.f123486b.add(e);
            e0VarD = null;
        }
        if (e0VarD == null) {
            m();
            return;
        }
        c8.a aVar2 = this.A;
        boolean z = this.F;
        if (e0VarD instanceof b0) {
            ((b0) e0VarD).initialize();
        }
        if (((d0) this.f.f145465c) != null) {
            d0Var = (d0) d0.e.acquire();
            d0Var.d = false;
            d0Var.f123446c = true;
            d0Var.f123445b = e0VarD;
            e0VarD = d0Var;
        }
        o();
        v vVar = this.f123494p;
        synchronized (vVar) {
            vVar.o = e0VarD;
            vVar.f123531p = aVar2;
            vVar.f123536w = z;
        }
        synchronized (vVar) {
            try {
                vVar.f123523b.a();
                if (vVar.v) {
                    vVar.o.recycle();
                    vVar.g();
                } else {
                    if (vVar.f123522a.f123520a.isEmpty()) {
                        throw new IllegalStateException("Received a resource without any callbacks to notify");
                    }
                    if (vVar.f123532q) {
                        throw new IllegalStateException("Already have resource");
                    }
                    ch.b bVar = vVar.e;
                    e0 e0Var = vVar.o;
                    boolean z3 = vVar.f123528l;
                    x xVar = vVar.k;
                    y yVar = vVar.f123524c;
                    bVar.getClass();
                    vVar.f123535t = new z(e0Var, z3, true, xVar, yVar);
                    vVar.f123532q = true;
                    u uVar = vVar.f123522a;
                    uVar.getClass();
                    ArrayList<t> arrayList = new ArrayList(uVar.f123520a);
                    vVar.e(arrayList.size() + 1);
                    ((s) vVar.f).d(vVar, vVar.k, vVar.f123535t);
                    for (t tVar : arrayList) {
                        tVar.f123519b.execute(new x5(5, (Object) vVar, false, (Object) tVar.f123518a));
                    }
                    vVar.d();
                }
            } finally {
            }
        }
        this.f123496r = l.ENCODE;
        try {
            gpk.c cVar = this.f;
            if (((d0) cVar.f145465c) != null) {
                r rVar = this.d;
                c8.k kVar = this.o;
                cVar.getClass();
                try {
                    rVar.a().d((c8.g) cVar.f145463a, new mp.p((c8.n) cVar.f145464b, 14, (d0) cVar.f145465c, kVar));
                    ((d0) cVar.f145465c).c();
                } catch (Throwable th10) {
                    ((d0) cVar.f145465c).c();
                    throw th10;
                }
            }
            j jVar = this.f123488g;
            synchronized (jVar) {
                jVar.f123479b = true;
                zA = jVar.a();
            }
            if (zA) {
                k();
            }
        } finally {
            if (d0Var != null) {
                d0Var.c();
            }
        }
    }

    public final g g() {
        int i = i.f123474b[this.f123496r.ordinal()];
        h hVar = this.f123485a;
        if (i == 1) {
            return new f0(hVar, this);
        }
        if (i == 2) {
            return new d(hVar, this);
        }
        if (i == 3) {
            return new j0(hVar, this);
        }
        if (i == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.f123496r);
    }

    public final l h(l lVar) {
        int i = i.f123474b[lVar.ordinal()];
        if (i == 1) {
            return this.f123493n.a() ? l.DATA_CACHE : h(l.DATA_CACHE);
        }
        if (i == 2) {
            return this.u ? l.FINISHED : l.SOURCE;
        }
        if (i == 3 || i == 4) {
            return l.FINISHED;
        }
        if (i == 5) {
            return this.f123493n.b() ? l.RESOURCE_CACHE : h(l.RESOURCE_CACHE);
        }
        throw new IllegalArgumentException("Unrecognized stage: " + lVar);
    }

    public final void i(long j2, String str, String str2) {
        StringBuilder sbL = v0.a.l(str, " in ");
        sbL.append(y8.h.a(j2));
        sbL.append(", load key: ");
        sbL.append(this.k);
        sbL.append(str2 != null ? ", ".concat(str2) : "");
        sbL.append(", thread: ");
        sbL.append(Thread.currentThread().getName());
        sbL.toString();
    }

    public final void j() {
        boolean zA;
        o();
        GlideException glideException = new GlideException("Failed to load resource", new ArrayList(this.f123486b));
        v vVar = this.f123494p;
        synchronized (vVar) {
            vVar.f123533r = glideException;
        }
        synchronized (vVar) {
            try {
                vVar.f123523b.a();
                if (vVar.v) {
                    vVar.g();
                } else {
                    if (vVar.f123522a.f123520a.isEmpty()) {
                        throw new IllegalStateException("Received an exception without any callbacks to notify");
                    }
                    if (vVar.f123534s) {
                        throw new IllegalStateException("Already failed once");
                    }
                    vVar.f123534s = true;
                    x xVar = vVar.k;
                    u uVar = vVar.f123522a;
                    uVar.getClass();
                    ArrayList<t> arrayList = new ArrayList(uVar.f123520a);
                    vVar.e(arrayList.size() + 1);
                    ((s) vVar.f).d(vVar, xVar, null);
                    for (t tVar : arrayList) {
                        tVar.f123519b.execute(new ch.p(3, vVar, false, tVar.f123518a));
                    }
                    vVar.d();
                }
            } finally {
            }
        }
        j jVar = this.f123488g;
        synchronized (jVar) {
            jVar.f123480c = true;
            zA = jVar.a();
        }
        if (zA) {
            k();
        }
    }

    public final void k() {
        j jVar = this.f123488g;
        synchronized (jVar) {
            jVar.f123479b = false;
            jVar.f123478a = false;
            jVar.f123480c = false;
        }
        gpk.c cVar = this.f;
        cVar.f145463a = null;
        cVar.f145464b = null;
        cVar.f145465c = null;
        h hVar = this.f123485a;
        hVar.f123463c = null;
        hVar.d = null;
        hVar.f123469n = null;
        hVar.f123464g = null;
        hVar.k = null;
        hVar.i = null;
        hVar.o = null;
        hVar.f123466j = null;
        hVar.f123470p = null;
        hVar.f123461a.clear();
        hVar.f123467l = false;
        hVar.f123462b.clear();
        hVar.f123468m = false;
        this.D = false;
        this.f123489h = null;
        this.i = null;
        this.o = null;
        this.f123490j = null;
        this.k = null;
        this.f123494p = null;
        this.f123496r = null;
        this.C = null;
        this.f123499w = null;
        this.f123500x = null;
        this.z = null;
        this.A = null;
        this.B = null;
        this.f123498t = 0L;
        this.E = false;
        this.v = null;
        this.f123486b.clear();
        this.e.release(this);
    }

    public final void l(k kVar) {
        this.f123497s = kVar;
        v vVar = this.f123494p;
        (vVar.f123529m ? vVar.i : vVar.f123526h).execute(this);
    }

    public final void m() {
        this.f123499w = Thread.currentThread();
        int i = y8.h.f311602b;
        this.f123498t = SystemClock.elapsedRealtimeNanos();
        boolean zB = false;
        while (!this.E && this.C != null && !(zB = this.C.b())) {
            this.f123496r = h(this.f123496r);
            this.C = g();
            if (this.f123496r == l.SOURCE) {
                l(k.SWITCH_TO_SOURCE_SERVICE);
                return;
            }
        }
        if ((this.f123496r == l.FINISHED || this.E) && !zB) {
            j();
        }
    }

    public final void n() {
        int i = i.f123473a[this.f123497s.ordinal()];
        if (i == 1) {
            this.f123496r = h(l.INITIALIZE);
            this.C = g();
            m();
        } else if (i == 2) {
            m();
        } else if (i == 3) {
            f();
        } else {
            throw new IllegalStateException("Unrecognized run reason: " + this.f123497s);
        }
    }

    public final void o() {
        this.f123487c.a();
        if (this.D) {
            throw new IllegalStateException("Already notified", this.f123486b.isEmpty() ? null : (Throwable) p.a.i(1, this.f123486b));
        }
        this.D = true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.bumptech.glide.load.data.e eVar = this.B;
        try {
            try {
                try {
                    if (this.E) {
                        j();
                        if (eVar != null) {
                            eVar.cleanup();
                            return;
                        }
                        return;
                    }
                    n();
                    if (eVar != null) {
                        eVar.cleanup();
                    }
                } catch (Throwable th10) {
                    if (Log.isLoggable("DecodeJob", 3)) {
                        String str = "DecodeJob threw unexpectedly, isCancelled: " + this.E + ", stage: " + this.f123496r;
                    }
                    if (this.f123496r != l.ENCODE) {
                        this.f123486b.add(th10);
                        j();
                    }
                    if (!this.E) {
                        throw th10;
                    }
                    throw th10;
                }
            } catch (c e) {
                throw e;
            }
        } catch (Throwable th11) {
            if (eVar != null) {
                eVar.cleanup();
            }
            throw th11;
        }
    }
}
