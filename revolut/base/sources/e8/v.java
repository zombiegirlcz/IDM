package e8;

import androidx.core.util.Pools$Pool;
import au0.x5;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class v implements z8.b {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final ch.b f123521x = new ch.b(4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y f123524c;
    public final Pools$Pool d;
    public final w f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h8.e f123525g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h8.e f123526h;
    public final h8.e i;
    public x k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f123528l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f123529m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f123530n;
    public e0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public c8.a f123531p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f123532q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public GlideException f123533r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f123534s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public z f123535t;
    public m u;
    public volatile boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f123536w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f123522a = new u(new ArrayList(2));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z8.e f123523b = new z8.e();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicInteger f123527j = new AtomicInteger();
    public final ch.b e = f123521x;

    public v(h8.e eVar, h8.e eVar2, h8.e eVar3, h8.e eVar4, s sVar, s sVar2, gpk.c cVar) {
        this.f123525g = eVar;
        this.f123526h = eVar2;
        this.i = eVar4;
        this.f = sVar;
        this.f123524c = sVar2;
        this.d = cVar;
    }

    public final synchronized void a(u8.j jVar, Executor executor) {
        try {
            this.f123523b.a();
            this.f123522a.f123520a.add(new t(jVar, executor));
            if (this.f123532q) {
                e(1);
                executor.execute(new x5(5, (Object) this, false, (Object) jVar));
            } else if (this.f123534s) {
                e(1);
                executor.execute(new ch.p(3, this, false, jVar));
            } else {
                y8.f.a("Cannot add callbacks to a cancelled EngineJob", !this.v);
            }
        } catch (Throwable th10) {
            throw th10;
        }
    }

    @Override // z8.b
    public final z8.e b() {
        return this.f123523b;
    }

    public final void c() {
        if (f()) {
            return;
        }
        this.v = true;
        m mVar = this.u;
        mVar.E = true;
        g gVar = mVar.C;
        if (gVar != null) {
            gVar.cancel();
        }
        w wVar = this.f;
        x xVar = this.k;
        s sVar = (s) wVar;
        synchronized (sVar) {
            cpi.g gVar2 = sVar.f123513a;
            gVar2.getClass();
            HashMap map = (HashMap) (this.f123530n ? gVar2.f107955c : gVar2.f107954b);
            if (equals(map.get(xVar))) {
                map.remove(xVar);
            }
        }
    }

    public final void d() {
        z zVar;
        synchronized (this) {
            try {
                this.f123523b.a();
                y8.f.a("Not yet complete!", f());
                int iDecrementAndGet = this.f123527j.decrementAndGet();
                y8.f.a("Can't decrement below 0", iDecrementAndGet >= 0);
                if (iDecrementAndGet == 0) {
                    zVar = this.f123535t;
                    g();
                } else {
                    zVar = null;
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
        if (zVar != null) {
            zVar.c();
        }
    }

    public final synchronized void e(int i) {
        z zVar;
        y8.f.a("Not yet complete!", f());
        if (this.f123527j.getAndAdd(i) == 0 && (zVar = this.f123535t) != null) {
            zVar.b();
        }
    }

    public final boolean f() {
        return this.f123534s || this.f123532q || this.v;
    }

    public final synchronized void g() {
        boolean zA;
        if (this.k == null) {
            throw new IllegalArgumentException();
        }
        this.f123522a.f123520a.clear();
        this.k = null;
        this.f123535t = null;
        this.o = null;
        this.f123534s = false;
        this.v = false;
        this.f123532q = false;
        this.f123536w = false;
        m mVar = this.u;
        j jVar = mVar.f123488g;
        synchronized (jVar) {
            jVar.f123478a = true;
            zA = jVar.a();
        }
        if (zA) {
            mVar.k();
        }
        this.u = null;
        this.f123533r = null;
        this.f123531p = null;
        this.d.release(this);
    }

    public final synchronized void h(u8.j jVar) {
        try {
            this.f123523b.a();
            this.f123522a.f123520a.remove(new t(jVar, y8.f.f311600b));
            if (this.f123522a.f123520a.isEmpty()) {
                c();
                if (this.f123532q || this.f123534s) {
                    if (this.f123527j.get() == 0) {
                        g();
                    }
                }
            }
        } catch (Throwable th10) {
            throw th10;
        }
    }
}
