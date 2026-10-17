package q8j;

import kotlin.jvm.internal.Intrinsics;
import mw5.l;
import nyj.h;
import prk.u;
import vc.s;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements t7j.a {
    public final npk.a A;
    public final djf.c B;
    public final l70.e C;
    public final r9j.a D;
    public final rd5.c E;
    public final u8b.a F;
    public final ku5.g G;
    public final l0k.c H;
    public final h I;
    public final m41.c J;
    public final k3d.b K;
    public final k2d.e L;
    public final c M = this;
    public final u N;
    public final e4m.e O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final an0.c f243088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ee0.a f243089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h8j.a f243090c;
    public final fdj.a d;
    public final l e;
    public final rc5.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k2d.d f243091g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final et5.a f243092h;
    public final j5d.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ite.a f243093j;
    public final cf0.f k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final pqi.a f243094l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final h9h.a f243095m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final usg.a f243096n;
    public final vv5.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final qud.c f243097p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final jhf.a f243098q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final v0i.b f243099r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final jk3.c f243100s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ei5.d f243101t;
    public final hh5.b u;
    public final n8j.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final fq6.a f243102w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final k3d.a f243103x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final m51.a f243104y;
    public final xmg.a z;

    public c(k2d.d dVar, r9j.a aVar, n8j.b bVar, h8j.a aVar2, jk3.c cVar, l70.e eVar, ee0.a aVar3, cf0.f fVar, j5d.b bVar2, rc5.b bVar3, fdj.a aVar4, vv5.e eVar2, l lVar, et5.a aVar5, ku5.g gVar, ei5.d dVar2, m41.c cVar2, v0i.b bVar4, ite.a aVar6, fq6.a aVar7, h9h.a aVar8, npk.a aVar9, m51.a aVar10, an0.c cVar3, k2d.e eVar3, k3d.b bVar5, qud.c cVar4, jhf.a aVar11, djf.c cVar5, usg.a aVar12, k3d.a aVar13, rd5.c cVar6, h hVar, l0k.c cVar7, hh5.b bVar6, pqi.a aVar14, xmg.a aVar15, u8b.a aVar16) {
        this.f243088a = cVar3;
        this.f243089b = aVar3;
        this.f243090c = aVar2;
        this.d = aVar4;
        this.e = lVar;
        this.f = bVar3;
        this.f243091g = dVar;
        this.f243092h = aVar5;
        this.i = bVar2;
        this.f243093j = aVar6;
        this.k = fVar;
        this.f243094l = aVar14;
        this.f243095m = aVar8;
        this.f243096n = aVar12;
        this.o = eVar2;
        this.f243097p = cVar4;
        this.f243098q = aVar11;
        this.f243099r = bVar4;
        this.f243100s = cVar;
        this.f243101t = dVar2;
        this.u = bVar6;
        this.v = bVar;
        this.f243102w = aVar7;
        this.f243103x = aVar13;
        this.f243104y = aVar10;
        this.z = aVar15;
        this.A = aVar9;
        this.B = cVar5;
        this.C = eVar;
        this.D = aVar;
        this.E = cVar6;
        this.F = aVar16;
        this.G = gVar;
        this.H = cVar7;
        this.I = hVar;
        this.J = cVar2;
        this.K = bVar5;
        this.L = eVar3;
        int i = 7;
        this.N = new u(this, 0, i);
        this.O = e4m.b.b(new u(this, 1, i));
    }

    public final xe0.e a() {
        yk0.a databaseSessionProvider = this.f243088a.b();
        s.j(databaseSessionProvider);
        ee0.a aVar = this.f243089b;
        je0.d mapper = aVar.b();
        s.j(mapper);
        xe0.f storageFactory = aVar.f();
        s.j(storageFactory);
        b.Companion.getClass();
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "crypto_commodity_storage", mapper, 0, null, 56);
    }
}
