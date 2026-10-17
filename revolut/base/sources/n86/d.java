package n86;

import vc.s;

/* JADX INFO: loaded from: classes13.dex */
public final class d extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l70.e f213231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c21.e f213232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ee0.a f213233c;
    public final an0.c d;
    public final asi.b e;
    public final fma.h f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ti3.a f213234g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f213235h = this;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f213236j;
    public final e4m.e k;

    public d(c21.e eVar, l70.e eVar2, asi.b bVar, fma.h hVar, ee0.a aVar, an0.c cVar, ti3.a aVar2) {
        this.f213231a = eVar2;
        this.f213232b = eVar;
        this.f213233c = aVar;
        this.d = cVar;
        this.e = bVar;
        this.f = hVar;
        this.f213234g = aVar2;
        int i = 6;
        this.i = e4m.b.b(new mva.a(this, 1, i));
        this.f213236j = e4m.b.b(new mva.a(this, 2, i));
        this.k = e4m.b.b(new mva.a(this, 0, i));
    }

    @Override // n86.h
    public final a a() {
        return new a(this.f213235h);
    }

    @Override // n86.h
    public final kdh.b b() {
        return new kdh.b(this.f213235h, 10);
    }

    @Override // n86.h
    public final e c() {
        return new e(this.f213235h);
    }

    public final kdh.b d() {
        k86.a aVar = (k86.a) this.k.get();
        mli.e eVarB = ((j51.a) this.e).b();
        s.j(eVarB);
        return new kdh.b(aVar, eVarB);
    }
}
