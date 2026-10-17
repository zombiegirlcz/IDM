package c4f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f21222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nj0.a f21223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xmg.a f21224c;
    public final bpj.a d;
    public final ite.a e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f21225g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f21226h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f21227j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f21228l;

    public k(b bVar, nj0.a aVar, xmg.a aVar2, bpj.a aVar3, ite.a aVar4) {
        this.f21222a = bVar;
        this.f21223b = aVar;
        this.f21224c = aVar2;
        this.d = aVar3;
        this.e = aVar4;
        int i = 24;
        this.f = e4m.b.b(new aq1.e(this, 0, i));
        this.f21225g = e4m.b.b(new aq1.e(this, 1, i));
        this.f21226h = e4m.b.b(new aq1.e(this, 2, i));
        this.i = e4m.b.b(new aq1.e(this, 3, i));
        this.f21227j = e4m.b.b(new aq1.e(this, 4, i));
        this.k = e4m.b.b(new aq1.e(this, 5, i));
        this.f21228l = e4m.b.b(new aq1.e(this, 6, i));
    }

    public final twg.c a() {
        k3f.a reportsDao = (k3f.a) this.f.get();
        k3f.b usReportsDao = (k3f.b) this.f21225g.get();
        j3f.c portfolioDeprecatedDao = (j3f.c) this.f21226h.get();
        j3f.a holdingsDeprecatedDao = (j3f.a) this.i.get();
        Intrinsics.checkNotNullParameter(reportsDao, "reportsDao");
        Intrinsics.checkNotNullParameter(usReportsDao, "usReportsDao");
        Intrinsics.checkNotNullParameter(portfolioDeprecatedDao, "portfolioDeprecatedDao");
        Intrinsics.checkNotNullParameter(holdingsDeprecatedDao, "holdingsDeprecatedDao");
        twg.c cVar = new twg.c();
        cVar.f275017a = reportsDao;
        cVar.f275018b = usReportsDao;
        cVar.f275019c = portfolioDeprecatedDao;
        cVar.d = holdingsDeprecatedDao;
        return cVar;
    }

    public final d4f.s b() {
        xoj.a aVarA = this.d.a();
        vc.s.j(aVarA);
        return new d4f.s(aVarA, 0);
    }
}
