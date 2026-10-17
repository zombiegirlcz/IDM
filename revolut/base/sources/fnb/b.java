package fnb;

import vc.s;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements ajb.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ee0.a f136592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final an0.c f136593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nj0.a f136594c;
    public final l70.e d;
    public final tib.b e;
    public final pib.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ore.b f136595g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f136596h = e4m.b.b(new a(this, 2));
    public final e4m.e i = e4m.b.b(new a(this, 1));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f136597j = e4m.b.b(new a(this, 0));
    public final e4m.e k = e4m.b.b(new a(this, 5));

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f136598l = e4m.b.b(new a(this, 4));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f136599m = e4m.b.b(new a(this, 6));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f136600n = e4m.b.b(new a(this, 3));

    public b(l70.e eVar, nj0.a aVar, ee0.a aVar2, an0.c cVar, tib.b bVar, pib.b bVar2, ore.b bVar3) {
        this.f136592a = aVar2;
        this.f136593b = cVar;
        this.f136594c = aVar;
        this.d = eVar;
        this.e = bVar;
        this.f = bVar2;
        this.f136595g = bVar3;
    }

    public final gnb.b a() {
        enb.g gVar = (enb.g) this.f136600n.get();
        ijb.a aVarG = ((blb.e) this.e).g();
        s.j(aVarG);
        ugc.a aVarB = ((vjb.b) this.f).b();
        pre.c cVarA = this.f136595g.a();
        s.j(cVarA);
        return new gnb.b(gVar, aVarG, aVarB, cVarA);
    }
}
