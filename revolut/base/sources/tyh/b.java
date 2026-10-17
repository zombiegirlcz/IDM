package tyh;

import kotlin.jvm.internal.Intrinsics;
import vc.s;
import zhm.f0;
import zxb.k0;

/* JADX INFO: loaded from: classes10.dex */
public final class b {
    public final m41.c A;
    public final oda.d B;
    public final wvh.a C;
    public final nl5.e D;
    public final nf0.a E;
    public final co0.a F;
    public final ava.a G;
    public final osb.a H;
    public final n8l.a I;
    public final v7i.a J;
    public final ei5.d K;
    public final xmg.a L;
    public final ore.b M;
    public final b N = this;
    public final e4m.e O = e4m.b.b(new a9i.b(0, 14));
    public final e4m.e P = e4m.b.b(new a9i.b(1, 14));
    public final e4m.e Q = e4m.b.b(new a9i.b(2, 14));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ee0.a f275586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final an0.c f275587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j4i.a f275588c;
    public final v0i.b d;
    public final l70.e e;
    public final nj0.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final mva.b f275589g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final usg.a f275590h;
    public final gsc.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final jk3.c f275591j;
    public final g2j.f k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ite.a f275592l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final k0 f275593m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final z7l.a f275594n;
    public final qud.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final hh5.b f275595p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ce5.b f275596q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final kdd.b f275597r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final cri.b f275598s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final rd5.c f275599t;
    public final qga.b u;
    public final vn.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final syh.b f275600w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final rkd.g f275601x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final qga.a f275602y;
    public final efk.a z;

    public b(l70.e eVar, syh.b bVar, ee0.a aVar, v0i.b bVar2, jk3.c cVar, usg.a aVar2, j4i.a aVar3, ei5.d dVar, ite.a aVar4, qga.a aVar5, rkd.g gVar, qud.c cVar2, mva.b bVar3, m41.c cVar3, oda.d dVar2, wvh.a aVar6, g2j.f fVar, xmg.a aVar7, rd5.c cVar4, ce5.b bVar4, ore.b bVar5, nj0.a aVar8, osb.a aVar9, ava.a aVar10, nf0.a aVar11, co0.a aVar12, qga.b bVar6, efk.a aVar13, an0.c cVar5, u7i.l lVar, v7i.a aVar14, n8l.a aVar15, cri.b bVar7, gsc.c cVar6, vn.a aVar16, nl5.e eVar2, hh5.b bVar8, z7l.a aVar17, k0 k0Var, kdd.b bVar9) {
        this.f275586a = aVar;
        this.f275587b = cVar5;
        this.f275588c = aVar3;
        this.d = bVar2;
        this.e = eVar;
        this.f = aVar8;
        this.f275589g = bVar3;
        this.f275590h = aVar2;
        this.i = cVar6;
        this.f275591j = cVar;
        this.k = fVar;
        this.f275592l = aVar4;
        this.f275593m = k0Var;
        this.f275594n = aVar17;
        this.o = cVar2;
        this.f275595p = bVar8;
        this.f275596q = bVar4;
        this.f275597r = bVar9;
        this.f275598s = bVar7;
        this.f275599t = cVar4;
        this.u = bVar6;
        this.v = aVar16;
        this.f275600w = bVar;
        this.f275601x = gVar;
        this.f275602y = aVar5;
        this.z = aVar13;
        this.A = cVar3;
        this.B = dVar2;
        this.C = aVar6;
        this.D = eVar2;
        this.E = aVar11;
        this.F = aVar12;
        this.G = aVar10;
        this.H = aVar9;
        this.I = aVar15;
        this.J = aVar14;
        this.K = dVar;
        this.L = aVar7;
        this.M = bVar5;
    }

    public final xe0.e a() {
        ee0.a aVar = this.f275586a;
        je0.d mapper = aVar.b();
        s.j(mapper);
        yk0.a databaseSessionProvider = this.f275587b.b();
        s.j(databaseSessionProvider);
        xe0.f storageFactory = aVar.f();
        s.j(storageFactory);
        m.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "crypto_exchange", mapper, 1, f0.f322471a, 32);
    }

    public final k7i.i b() {
        sf0.h hVarB = this.E.b();
        s.j(hVarB);
        gte.a aVarB = this.f275592l.b();
        s.j(aVarB);
        return new k7i.i(hVarB, aVarB);
    }

    public final fzh.a c() {
        w80.b bVarJ = this.e.j();
        s.j(bVarJ);
        return new fzh.a(bVarJ);
    }
}
