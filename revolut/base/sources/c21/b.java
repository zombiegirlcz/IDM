package c21;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kg.o;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;
import vc.s;

/* JADX INFO: loaded from: classes.dex */
public final class b implements e {
    public final e4m.e A0;
    public final e4m.e B0;
    public final e4m.e R;
    public final e4m.e S;
    public final e4m.e T;
    public final e4m.e U;
    public final e4m.e V;
    public final e4m.e W;
    public final e4m.e X;
    public final a Y;
    public final e4m.e Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f20559a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final e4m.e f20560a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e21.b f20561b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final a f20562b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nj0.a f20563c;
    public final e4m.e c0;
    public final k d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final e4m.e f20564d0;
    public final ee0.a e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final e4m.e f20565e0;
    public final an0.c f;
    public final e4m.e f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ite.a f20566g;
    public final e4m.e g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e21.c f20567h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final a f20568h0;
    public final Context i;
    public final e4m.e i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ee0.c f20569j;
    public final e4m.e j0;
    public final j k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final e4m.e f20570k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e21.a f20571l;
    public final e4m.e l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d f20572m;
    public final e4m.e m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final l70.e f20573n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final a f20574n0;
    public final n o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final e4m.e f20575o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final usg.b f20576p;
    public final e4m.e p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final th0.a f20577q;
    public final e4m.e q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vl3.n f20578r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final e4m.e f20579r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final a f20581s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final e4m.e f20583t0;
    public final e4m.e u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final e4m.e f20584v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final e4m.e f20586w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final e4m.e f20588x0;
    public final e4m.e y0;
    public final e4m.e z0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f20580s = a10.b.k(this, 3);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f20582t = a10.b.k(this, 2);
    public final e4m.e u = a10.b.k(this, 1);
    public final e4m.e v = a10.b.k(this, 4);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f20585w = e4m.b.b(new a(this, 0));

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e4m.e f20587x = a10.b.k(this, 6);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e4m.e f20589y = e4m.b.b(new a(this, 5));
    public final e4m.e z = a10.b.k(this, 8);
    public final e4m.e A = a10.b.k(this, 9);
    public final e4m.e B = a10.b.k(this, 10);
    public final e4m.e C = a10.b.k(this, 11);
    public final e4m.e D = a10.b.k(this, 12);
    public final e4m.e E = a10.b.k(this, 13);
    public final e4m.e F = a10.b.k(this, 14);
    public final e4m.e G = a10.b.k(this, 15);
    public final e4m.e H = a10.b.k(this, 16);
    public final e4m.e I = a10.b.k(this, 17);
    public final e4m.e J = a10.b.k(this, 18);
    public final e4m.e K = a10.b.k(this, 19);
    public final e4m.e L = a10.b.k(this, 20);
    public final e4m.e M = a10.b.k(this, 21);
    public final e4m.e N = a10.b.k(this, 22);
    public final e4m.e O = a10.b.k(this, 7);
    public final e4m.e P = a10.b.k(this, 23);
    public final e4m.e Q = e4m.g.a(new a(this, 25));

    public b(j jVar, m mVar, n nVar, d dVar, e21.a aVar, e21.b bVar, e21.c cVar, e21.f fVar, k kVar, l70.e eVar, ee0.a aVar2, jm0.a aVar3, an0.c cVar2, nj0.a aVar4, vl3.n nVar2, th0.a aVar5, usg.b bVar2, ite.a aVar6, ee0.c cVar3, Context context) {
        this.f20559a = mVar;
        this.f20561b = bVar;
        this.f20563c = aVar4;
        this.d = kVar;
        this.e = aVar2;
        this.f = cVar2;
        this.f20566g = aVar6;
        this.f20567h = cVar;
        this.i = context;
        this.f20569j = cVar3;
        this.k = jVar;
        this.f20571l = aVar;
        this.f20572m = dVar;
        this.f20573n = eVar;
        this.o = nVar;
        this.f20576p = bVar2;
        this.f20577q = aVar5;
        this.f20578r = nVar2;
        e4m.b.b(new a(this, 24));
        this.R = e4m.g.a(new a(this, 27));
        this.S = a10.b.k(this, 26);
        this.T = e4m.g.a(new a(this, 28));
        this.U = a10.b.k(this, 29);
        this.V = a10.b.k(this, 31);
        this.W = e4m.b.b(new a(this, 30));
        this.X = a10.b.k(this, 33);
        this.Y = new a(this, 32);
        this.Z = e4m.b.b(new a(this, 34));
        e4m.b.b(new a(this, 35));
        this.f20560a0 = e4m.b.b(new a(this, 37));
        this.f20562b0 = new a(this, 36);
        this.c0 = a10.b.k(this, 39);
        this.f20564d0 = e4m.b.b(new a(this, 38));
        this.f20565e0 = a10.b.k(this, 41);
        this.f0 = e4m.b.b(new a(this, 40));
        this.g0 = a10.b.k(this, 43);
        this.f20568h0 = new a(this, 42);
        this.i0 = e4m.b.b(new a(this, 44));
        this.j0 = a10.b.k(this, 46);
        this.f20570k0 = e4m.b.b(new a(this, 45));
        this.l0 = a10.b.k(this, 48);
        this.m0 = e4m.b.b(new a(this, 47));
        this.f20574n0 = new a(this, 49);
        this.f20575o0 = a10.b.k(this, 50);
        this.p0 = a10.b.k(this, 52);
        this.q0 = a10.b.k(this, 53);
        this.f20579r0 = a10.b.k(this, 54);
        this.f20581s0 = new a(this, 51);
        this.f20583t0 = e4m.b.b(new a(this, 55));
        this.u0 = e4m.b.b(new a(this, 56));
        this.f20584v0 = a10.b.k(this, 58);
        this.f20586w0 = e4m.b.b(new a(this, 57));
        this.f20588x0 = a10.b.k(this, 60);
        this.y0 = e4m.b.b(new a(this, 59));
        this.z0 = e4m.b.b(new a(this, 61));
        this.A0 = a10.b.k(this, 63);
        this.B0 = e4m.b.b(new a(this, 62));
    }

    public final o71.a a() {
        Object obj2;
        d4m.a repositoryLazy = e4m.b.a(this.Y);
        Intrinsics.checkNotNullParameter(repositoryLazy, "repositoryLazy");
        HashMap map = this.o.f20605a;
        Object obj3 = map.get(r21.h.class);
        WeakReference weakReference = obj3 instanceof WeakReference ? (WeakReference) obj3 : null;
        if (weakReference == null || (obj2 = weakReference.get()) == null) {
            obj2 = repositoryLazy.get();
            map.put(r21.h.class, new WeakReference(obj2));
        }
        o71.a aVar = (o71.a) obj2;
        s.k(aVar);
        return aVar;
    }

    public final de0.a b() {
        de0.a aVarA = ((cl0.a) this.f20569j).a();
        s.j(aVarA);
        return aVarA;
    }

    public final y21.c c() {
        return l.u(this.o, e4m.b.a(this.f20562b0));
    }

    public final b31.a d() {
        Object obj2;
        d4m.a repositoryLazy = e4m.b.a(this.f20568h0);
        Intrinsics.checkNotNullParameter(repositoryLazy, "repositoryLazy");
        HashMap map = this.o.f20605a;
        Object obj3 = map.get(b31.a.class);
        WeakReference weakReference = obj3 instanceof WeakReference ? (WeakReference) obj3 : null;
        if (weakReference == null || (obj2 = weakReference.get()) == null) {
            obj2 = repositoryLazy.get();
            map.put(b31.a.class, new WeakReference(obj2));
        }
        b31.a aVar = (b31.a) obj2;
        s.k(aVar);
        return aVar;
    }

    public final Retrofit e() {
        return (Retrofit) this.P.get();
    }

    public final z71.a f() {
        return (z71.a) this.Z.get();
    }

    public final u71.a g() {
        return (u71.a) this.m0.get();
    }

    public final o h() {
        return (o) this.f20580s.get();
    }

    public final Retrofit i() {
        return (Retrofit) this.f20582t.get();
    }

    public final Retrofit j() {
        return (Retrofit) this.S.get();
    }
}
