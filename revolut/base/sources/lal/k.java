package lal;

import vc.s;

/* JADX INFO: loaded from: classes13.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nj0.a f193454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lfe.b f193455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fbl.a f193456c;
    public final l70.e d;
    public final k e = this;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f193457g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f193458h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f193459j;
    public final e4m.e k;

    public k(l70.e eVar, ee0.a aVar, nj0.a aVar2, fbl.a aVar3, lfe.b bVar) {
        this.f193454a = aVar2;
        this.f193455b = bVar;
        this.f193456c = aVar3;
        this.d = eVar;
        int i = 0;
        this.f = e4m.b.b(new j(this, 3, i));
        this.f193457g = e4m.b.b(new j(this, 2, i));
        this.f193458h = e4m.b.b(new j(this, 4, i));
        this.i = e4m.b.b(new j(this, 1, i));
        this.f193459j = e4m.b.b(new j(this, 0, i));
        this.k = e4m.b.b(new j(this, 5, i));
    }

    public final k7i.i a() {
        hal.a aVar = (hal.a) this.i.get();
        mal.a aVar2 = new mal.a();
        gte.a aVarB = this.f193455b.d.b();
        s.j(aVarB);
        return new k7i.i(aVar, aVar2, new p96.a(aVarB));
    }
}
