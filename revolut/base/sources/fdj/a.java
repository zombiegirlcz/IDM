package fdj;

import android.content.Context;
import com.revolut.retail.feature.cryptocommoditydetails.impl.data.commodity.network.CommodityPriceTargetsService;
import com.revolut.retail.feature.cryptocommoditydetails.impl.data.network.CryptoDetailsAboutService;
import om4.d0;
import vc.s;

/* JADX INFO: loaded from: classes13.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l70.e f133939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cdj.a f133940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c21.e f133941c;
    public final Context d;
    public final an0.c e;
    public final npk.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final djf.c f133942g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u8h.c f133943h;
    public final a i = this;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f133944j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f133945l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f133946m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f133947n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f133948p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f133949q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f133950r;

    public a(cdj.a aVar, l70.e eVar, c21.e eVar2, an0.c cVar, npk.a aVar2, djf.c cVar2, u8h.c cVar3, Context context) {
        this.f133939a = eVar;
        this.f133940b = aVar;
        this.f133941c = eVar2;
        this.d = context;
        this.e = cVar;
        this.f = aVar2;
        this.f133942g = cVar2;
        this.f133943h = cVar3;
        int i = 23;
        this.f133944j = e4m.b.b(new ede.a(this, 2, i));
        this.k = e4m.b.b(new ede.a(this, 1, i));
        this.f133945l = e4m.b.b(new ede.a(this, 0, i));
        this.f133946m = e4m.b.b(new ede.a(this, 4, i));
        this.f133947n = e4m.b.b(new ede.a(this, 3, i));
        this.o = e4m.b.b(new ede.a(this, 5, i));
        this.f133948p = e4m.b.b(new ede.a(this, 6, i));
        this.f133949q = e4m.b.b(new ede.a(this, 7, i));
        this.f133950r = e4m.b.b(new ede.a(this, 8, i));
    }

    public final a61.a a() {
        CommodityPriceTargetsService commodityPriceTargetsService = (CommodityPriceTargetsService) this.f133945l.get();
        ne0.d dVar = new ne0.d();
        wcj.a aVar = (wcj.a) this.f133947n.get();
        b80.c cVarP = this.f133939a.p();
        s.j(cVarP);
        return new a61.a(new prl.e(commodityPriceTargetsService, dVar, aVar, cVarP), this.f.a());
    }

    public final jpc.e b() {
        l80.e eVarH = this.f133939a.h();
        s.j(eVarH);
        return new jpc.e(eVarH, a(), new rdj.a());
    }

    public final fn2.c c() {
        b80.c cVarP = this.f133939a.p();
        s.j(cVarP);
        return new fn2.c(new prl.e(cVarP, (CryptoDetailsAboutService) this.o.get(), (wcj.b) this.f133948p.get(), new d0(new ne0.d())));
    }
}
