package bt6;

import android.content.Context;
import au6.c3;
import au6.d3;
import au6.m3;
import au6.r3;
import au6.w2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public final e4m.e A;
    public final e4m.e B;
    public final e4m.e C;
    public final e4m.e D;
    public final e4m.e E;
    public final e4m.e F;
    public final e4m.e G;
    public final e4m.e H;
    public final e4m.e I;
    public final e4m.e J;
    public final e4m.e K;
    public final e4m.e L;
    public final e4m.e M;
    public final e4m.e N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ws6.a f18294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f18295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c21.e f18296c;
    public final ee0.a d;
    public final an0.c e;
    public final ava.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final fpg.c f18297g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Context f18298h;
    public final l70.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final nj0.a f18299j;
    public final nf0.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final co0.a f18300l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final xmg.a f18301m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final vs6.a f18302n;
    public final t2j.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final vxd.b f18303p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final npk.a f18304q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final jhf.a f18305r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final usg.a f18306s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b f18307t = this;
    public final e4m.e u;
    public final e4m.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f18308w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e4m.e f18309x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e4m.e f18310y;
    public final e4m.e z;

    public b(i0 i0Var, t2j.a aVar, l70.e eVar, ee0.a aVar2, nf0.a aVar3, nj0.a aVar4, c21.e eVar2, vs6.a aVar5, ws6.a aVar6, npk.a aVar7, ava.a aVar8, an0.c cVar, vxd.b bVar, co0.a aVar9, jhf.a aVar10, xmg.a aVar11, fpg.c cVar2, usg.a aVar12, Context context) {
        this.f18294a = aVar6;
        this.f18295b = i0Var;
        this.f18296c = eVar2;
        this.d = aVar2;
        this.e = cVar;
        this.f = aVar8;
        this.f18297g = cVar2;
        this.f18298h = context;
        this.i = eVar;
        this.f18299j = aVar4;
        this.k = aVar3;
        this.f18300l = aVar9;
        this.f18301m = aVar11;
        this.f18302n = aVar5;
        this.o = aVar;
        this.f18303p = bVar;
        this.f18304q = aVar7;
        this.f18305r = aVar10;
        this.f18306s = aVar12;
        int i = 15;
        this.u = e4m.b.b(new aq1.e(this, 3, i));
        this.v = e4m.b.b(new aq1.e(this, 2, i));
        this.f18308w = e4m.b.b(new aq1.e(this, 1, i));
        this.f18309x = e4m.b.b(new aq1.e(this, 4, i));
        this.f18310y = e4m.b.b(new aq1.e(this, 0, i));
        this.z = e4m.b.b(new aq1.e(this, 6, i));
        this.A = e4m.b.b(new aq1.e(this, 8, i));
        this.B = e4m.b.b(new aq1.e(this, 7, i));
        this.C = e4m.b.b(new aq1.e(this, 9, i));
        this.D = e4m.b.b(new aq1.e(this, 5, i));
        this.E = e4m.b.b(new aq1.e(this, 11, i));
        this.F = e4m.b.b(new aq1.e(this, 12, i));
        this.G = e4m.b.b(new aq1.e(this, 10, i));
        this.H = e4m.b.b(new aq1.e(this, 14, i));
        this.I = e4m.b.b(new aq1.e(this, 13, i));
        this.J = e4m.b.b(new aq1.e(this, 16, i));
        this.K = e4m.b.b(new aq1.e(this, 17, i));
        this.L = e4m.b.b(new aq1.e(this, 15, i));
        this.M = e4m.b.b(new aq1.e(this, 19, i));
        this.N = e4m.b.b(new aq1.e(this, 18, i));
    }

    public final a61.a a() {
        return new a61.a((d3) this.I.get(), d());
    }

    public final zjh.f b() {
        return new zjh.f((w2) this.N.get());
    }

    public final r10.d c() {
        c3 repository = (c3) this.G.get();
        zjh.i taxPocketsInteractor = e();
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(taxPocketsInteractor, "taxPocketsInteractor");
        r10.d dVar = new r10.d();
        dVar.f250818a = repository;
        dVar.f250819b = taxPocketsInteractor;
        return dVar;
    }

    public final r10.f d() {
        return new r10.f((r3) this.L.get(), c());
    }

    public final zjh.i e() {
        return new zjh.i((m3) this.f18310y.get());
    }

    public final r10.d f() {
        return c();
    }

    public final a61.a g() {
        return a();
    }

    public final zjh.i h() {
        return e();
    }

    public final r10.f i() {
        return d();
    }

    public final ft6.w j() {
        x47.a aVar = new x47.a();
        i37.b bVar = new i37.b();
        l80.e eVarH = this.i.h();
        vc.s.j(eVarH);
        return new ft6.w(aVar, bVar, eVarH);
    }

    public final xe0.e k() {
        ee0.a aVar = this.d;
        je0.d mapper = aVar.b();
        vc.s.j(mapper);
        yk0.a databaseSessionProvider = this.e.b();
        vc.s.j(databaseSessionProvider);
        xe0.f storageFactory = aVar.f();
        vc.s.j(storageFactory);
        k0.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "freelancer_tax_pockets", mapper, 1, zhm.f0.f322471a, 32);
    }
}
