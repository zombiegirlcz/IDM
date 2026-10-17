package e8;

import android.os.SystemClock;
import android.util.Log;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class s implements w, y {
    public static final boolean i = Log.isLoggable("Engine", 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cpi.g f123513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dfm.c f123514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g8.e f123515c;
    public final oe.c d;
    public final i0 e;
    public final r f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q f123516g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.google.firebase.messaging.t f123517h;

    public s(g8.e eVar, ecm.q qVar, h8.e eVar2, h8.e eVar3, h8.e eVar4, h8.e eVar5) {
        this.f123515c = eVar;
        r rVar = new r(qVar);
        this.f = rVar;
        com.google.firebase.messaging.t tVar = new com.google.firebase.messaging.t(6);
        this.f123517h = tVar;
        synchronized (this) {
            synchronized (tVar) {
                tVar.e = this;
            }
        }
        this.f123514b = new dfm.c(4);
        this.f123513a = new cpi.g(7);
        oe.c cVar = new oe.c();
        cVar.f224500g = z8.d.a(150, new ecm.q(cVar, 5));
        cVar.f224497a = eVar2;
        cVar.f224498b = eVar3;
        cVar.f224499c = eVar4;
        cVar.d = eVar5;
        cVar.e = this;
        cVar.f = this;
        this.d = cVar;
        this.f123516g = new q(rVar);
        this.e = new i0();
        eVar.d = this;
    }

    public static void c(String str, long j2, x xVar) {
        StringBuilder sbL = v0.a.l(str, " in ");
        sbL.append(y8.h.a(j2));
        sbL.append("ms, key: ");
        sbL.append(xVar);
        sbL.toString();
    }

    public static void f(e0 e0Var) {
        if (!(e0Var instanceof z)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((z) e0Var).c();
    }

    public final jpf.a a(com.bumptech.glide.f fVar, Object obj2, c8.g gVar, int i2, int i3, Class cls, Class cls2, com.bumptech.glide.h hVar, p pVar, y8.c cVar, boolean z, boolean z3, c8.k kVar, boolean z4, boolean z6, boolean z11, u8.j jVar, Executor executor) {
        long jElapsedRealtimeNanos;
        if (i) {
            int i5 = y8.h.f311602b;
            jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        } else {
            jElapsedRealtimeNanos = 0;
        }
        this.f123514b.getClass();
        x xVar = new x(obj2, gVar, i2, i3, cVar, cls, cls2, kVar);
        synchronized (this) {
            try {
                z zVarB = b(xVar, z4, jElapsedRealtimeNanos);
                if (zVarB == null) {
                    return g(fVar, obj2, gVar, i2, i3, cls, cls2, hVar, pVar, cVar, z, z3, kVar, z4, z6, z11, jVar, executor, xVar, jElapsedRealtimeNanos);
                }
                jVar.h(zVarB, c8.a.MEMORY_CACHE, false);
                return null;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    public final z b(x xVar, boolean z, long j2) throws Throwable {
        Throwable th10;
        z zVar;
        Object obj2;
        s sVar;
        x xVar2;
        z zVar2;
        if (z) {
            com.google.firebase.messaging.t tVar = this.f123517h;
            synchronized (tVar) {
                try {
                    b bVar = (b) ((HashMap) tVar.f49544c).get(xVar);
                    if (bVar == null) {
                        zVar = null;
                    } else {
                        zVar = (z) bVar.get();
                        if (zVar == null) {
                            try {
                                tVar.b(bVar);
                            } catch (Throwable th11) {
                                th10 = th11;
                                while (true) {
                                    try {
                                        throw th10;
                                    } catch (Throwable th12) {
                                        th10 = th12;
                                    }
                                    th10 = th12;
                                }
                            }
                        }
                    }
                    if (zVar != null) {
                        zVar.b();
                    }
                    if (zVar != null) {
                        if (i) {
                            c("Loaded resource from active resources", j2, xVar);
                        }
                        return zVar;
                    }
                    g8.e eVar = this.f123515c;
                    synchronized (eVar) {
                        try {
                            y8.i iVar = (y8.i) ((LinkedHashMap) eVar.f49608c).remove(xVar);
                            if (iVar == null) {
                                obj2 = null;
                            } else {
                                eVar.f49607b -= (long) iVar.f311604b;
                                obj2 = iVar.f311603a;
                            }
                        } catch (Throwable th13) {
                            th = th13;
                            while (true) {
                                try {
                                    throw th;
                                } catch (Throwable th14) {
                                    th = th14;
                                }
                            }
                        }
                    }
                    e0 e0Var = (e0) obj2;
                    if (e0Var == null) {
                        sVar = this;
                        xVar2 = xVar;
                        zVar2 = null;
                    } else if (e0Var instanceof z) {
                        zVar2 = (z) e0Var;
                        sVar = this;
                        xVar2 = xVar;
                    } else {
                        sVar = this;
                        xVar2 = xVar;
                        zVar2 = new z(e0Var, true, true, xVar2, sVar);
                    }
                    if (zVar2 != null) {
                        zVar2.b();
                        sVar.f123517h.a(xVar2, zVar2);
                    }
                    if (zVar2 != null) {
                        if (i) {
                            c("Loaded resource from cache", j2, xVar2);
                        }
                        return zVar2;
                    }
                } catch (Throwable th15) {
                    th10 = th15;
                }
            }
        }
        return null;
    }

    public final synchronized void d(v vVar, c8.g gVar, z zVar) {
        if (zVar != null) {
            try {
                if (zVar.f123543a) {
                    this.f123517h.a(gVar, zVar);
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
        cpi.g gVar2 = this.f123513a;
        gVar2.getClass();
        HashMap map = (HashMap) (vVar.f123530n ? gVar2.f107955c : gVar2.f107954b);
        if (vVar.equals(map.get(gVar))) {
            map.remove(gVar);
        }
    }

    public final void e(c8.g gVar, z zVar) {
        com.google.firebase.messaging.t tVar = this.f123517h;
        synchronized (tVar) {
            b bVar = (b) ((HashMap) tVar.f49544c).remove(gVar);
            if (bVar != null) {
                bVar.a();
            }
        }
        if (zVar.f123543a) {
        } else {
            this.e.a(zVar, false);
        }
    }

    public final jpf.a g(com.bumptech.glide.f fVar, Object obj2, c8.g gVar, int i2, int i3, Class cls, Class cls2, com.bumptech.glide.h hVar, p pVar, Map map, boolean z, boolean z3, c8.k kVar, boolean z4, boolean z6, boolean z11, u8.j jVar, Executor executor, x xVar, long j2) {
        cpi.g gVar2 = this.f123513a;
        v vVar = (v) ((HashMap) (z11 ? gVar2.f107955c : gVar2.f107954b)).get(xVar);
        if (vVar != null) {
            vVar.a(jVar, executor);
            if (i) {
                c("Added to existing load", j2, xVar);
            }
            return new jpf.a(this, jVar, vVar);
        }
        v vVar2 = (v) ((gpk.c) this.d.f224500g).acquire();
        synchronized (vVar2) {
            vVar2.k = xVar;
            vVar2.f123528l = z4;
            vVar2.f123529m = z6;
            vVar2.f123530n = z11;
        }
        q qVar = this.f123516g;
        m mVar = (m) ((gpk.c) qVar.d).acquire();
        int i5 = qVar.f123509b;
        qVar.f123509b = i5 + 1;
        h hVar2 = mVar.f123485a;
        r rVar = mVar.d;
        hVar2.f123463c = fVar;
        hVar2.d = obj2;
        hVar2.f123469n = gVar;
        hVar2.e = i2;
        hVar2.f = i3;
        hVar2.f123470p = pVar;
        hVar2.f123464g = cls;
        hVar2.f123465h = rVar;
        hVar2.k = cls2;
        hVar2.o = hVar;
        hVar2.i = kVar;
        hVar2.f123466j = map;
        hVar2.f123471q = z;
        hVar2.f123472r = z3;
        mVar.f123489h = fVar;
        mVar.i = gVar;
        mVar.f123490j = hVar;
        mVar.k = xVar;
        mVar.f123491l = i2;
        mVar.f123492m = i3;
        mVar.f123493n = pVar;
        mVar.u = z11;
        mVar.o = kVar;
        mVar.f123494p = vVar2;
        mVar.f123495q = i5;
        mVar.f123497s = k.INITIALIZE;
        mVar.v = obj2;
        cpi.g gVar3 = this.f123513a;
        gVar3.getClass();
        ((HashMap) (vVar2.f123530n ? gVar3.f107955c : gVar3.f107954b)).put(xVar, vVar2);
        vVar2.a(jVar, executor);
        synchronized (vVar2) {
            vVar2.u = mVar;
            l lVarH = mVar.h(l.INITIALIZE);
            ((lVarH == l.RESOURCE_CACHE || lVarH == l.DATA_CACHE) ? vVar2.f123525g : vVar2.f123529m ? vVar2.i : vVar2.f123526h).execute(mVar);
        }
        if (i) {
            c("Started new load", j2, xVar);
        }
        return new jpf.a(this, jVar, vVar2);
    }
}
