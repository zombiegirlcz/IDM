package p5i;

import ael.d0;
import ang.f;
import iri.j;
import vc.s;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements hri.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l70.e f233139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cri.b f233140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ore.b f233141c;
    public final j4i.a d;
    public final lpf.a e;
    public final xmg.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final zdl.c f233142g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final z7l.a f233143h;
    public final q8b.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ite.a f233144j;
    public final qga.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final qga.b f233145l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final vn.a f233146m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b f233147n = this;
    public final e4m.e o = e4m.b.b(new a9i.b(this, 0, 8));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f233148p = e4m.b.b(new a9i.b(this, 1, 8));

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f233149q = e4m.b.b(new a9i.b(this, 2, 8));

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f233150r = e4m.b.b(new a9i.b(this, 3, 8));

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f233151s = e4m.b.b(new a9i.b(this, 4, 8));

    public b(hri.b bVar, l70.e eVar, q8b.a aVar, j4i.a aVar2, qga.b bVar2, qga.a aVar3, ite.a aVar4, ore.b bVar3, lpf.a aVar5, zdl.c cVar, xmg.a aVar6, cri.b bVar4, npk.b bVar5, vn.a aVar7, z7l.a aVar8) {
        this.f233139a = eVar;
        this.f233140b = bVar4;
        this.f233141c = bVar3;
        this.d = aVar2;
        this.e = aVar5;
        this.f = aVar6;
        this.f233142g = cVar;
        this.f233143h = aVar8;
        this.i = aVar;
        this.f233144j = aVar4;
        this.k = aVar3;
        this.f233145l = bVar2;
        this.f233146m = aVar7;
    }

    public final o5i.c a() {
        kgm.c cVarD = this.d.d();
        t1j.b bVarE = this.e.e();
        f fVarE = this.f.e();
        zdl.c cVar = this.f233142g;
        d0 d0VarK = cVar.k();
        s.j(d0VarK);
        ybl.b bVarB = cVar.b();
        s.j(bVarB);
        return new o5i.c(cVarD, bVarE, fVarE, d0VarK, bVarB, this.f233143h.a());
    }

    @Override // hri.a
    public final j e() {
        return (j) this.f233148p.get();
    }

    @Override // hri.a
    public final ifm.b f() {
        return (ifm.b) this.o.get();
    }
}
