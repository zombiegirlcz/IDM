package uhi;

import iri.j;
import ljl.q1;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements hri.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l70.e f280229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pqi.a f280230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e81.a f280231c;
    public final ite.a d;
    public final shi.a e;
    public final osb.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final cri.b f280232g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final asi.b f280233h;
    public final q1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a f280234j = this;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f280235l;

    public a(hri.b bVar, shi.a aVar, l70.e eVar, e81.a aVar2, ite.a aVar3, osb.a aVar4, cri.b bVar2, pqi.a aVar5, asi.b bVar3, q1 q1Var) {
        this.f280229a = eVar;
        this.f280230b = aVar5;
        this.f280231c = aVar2;
        this.d = aVar3;
        this.e = aVar;
        this.f = aVar4;
        this.f280232g = bVar2;
        this.f280233h = bVar3;
        this.i = q1Var;
        int i = 9;
        this.k = e4m.b.b(new a2d.b(this, 0, i));
        this.f280235l = e4m.b.b(new a2d.b(this, 1, i));
    }

    @Override // hri.a
    public final j e() {
        return (j) this.f280235l.get();
    }

    @Override // hri.a
    public final ifm.b f() {
        return (ifm.b) this.k.get();
    }
}
