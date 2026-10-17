package ok1;

import com.revolut.feature.alipay.impl.data.network.AlipayPlusQrCodeService;
import oai.s;

/* JADX INFO: loaded from: classes20.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ite.a f225859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uw1.b f225860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l70.e f225861c;
    public final nj0.a d;
    public final rg0.e e;
    public final cri.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jm0.a f225862g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f225863h = this;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f225864j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f225865l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f225866m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f225867n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f225868p;

    public d(a aVar, b bVar, uw1.b bVar2, l70.e eVar, rg0.e eVar2, nj0.a aVar2, ite.a aVar3, jm0.a aVar4, cri.a aVar5) {
        this.f225859a = aVar3;
        this.f225860b = bVar2;
        this.f225861c = eVar;
        this.d = aVar2;
        this.e = eVar2;
        this.f = aVar5;
        this.f225862g = aVar4;
        int i = 8;
        this.i = e4m.b.b(new s(this, 0, i));
        this.f225864j = e4m.b.b(new s(this, 3, i));
        this.k = e4m.b.b(new s(this, 4, i));
        this.f225865l = e4m.b.b(new s(this, 2, i));
        this.f225866m = e4m.b.b(new s(this, 1, i));
        this.f225867n = e4m.b.b(new s(this, 6, i));
        this.o = e4m.b.b(new s(this, 7, i));
        this.f225868p = e4m.b.b(new s(this, 5, i));
    }

    public final k18.c a() {
        AlipayPlusQrCodeService alipayPlusQrCodeService = (AlipayPlusQrCodeService) this.f225867n.get();
        dm0.d dVarD = this.f225862g.d();
        vc.s.j(dVarD);
        l70.e eVar = this.f225861c;
        g90.a aVarW = eVar.w();
        vc.s.j(aVarW);
        fkg.a aVar = new fkg.a(aVarW);
        l80.e eVarH = eVar.h();
        vc.s.j(eVarH);
        return new k18.c(alipayPlusQrCodeService, dVarD, aVar, eVarH);
    }
}
