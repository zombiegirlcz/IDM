package npk;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.screen.BaseScreen;
import com.revolut.retail.feature.ratedetails.impl.ui.RateDetailsScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RateDetailsScreenContract$InputData f218257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BaseScreen f218258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f218259c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f218260g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f218261h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f218262j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f218263l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f218264m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f218265n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f218266p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f218267q;

    public d(c cVar, BaseScreen baseScreen, RateDetailsScreenContract$InputData rateDetailsScreenContract$InputData) {
        this.f218259c = cVar;
        this.f218257a = rateDetailsScreenContract$InputData;
        this.f218258b = baseScreen;
        this.d = e4m.b.b(e4m.c.a(baseScreen));
        int i = 15;
        this.e = e4m.b.b(new nk7.k(cVar, this, 2, i));
        this.f = e4m.b.b(new nk7.k(cVar, this, 1, i));
        this.f218260g = e4m.b.b(new nk7.k(cVar, this, 0, i));
        this.f218261h = e4m.b.b(new nk7.k(cVar, this, 3, i));
        this.i = e4m.b.b(new nk7.k(cVar, this, 4, i));
        this.f218262j = e4m.b.b(new nk7.k(cVar, this, 5, i));
        this.k = e4m.b.b(new nk7.k(cVar, this, 7, i));
        this.f218263l = e4m.b.b(new nk7.k(cVar, this, 8, i));
        this.f218264m = e4m.b.b(new nk7.k(cVar, this, 6, i));
        this.f218265n = e4m.b.b(new nk7.k(cVar, this, 11, i));
        this.o = e4m.b.b(new nk7.k(cVar, this, 10, i));
        this.f218266p = e4m.b.b(new nk7.k(cVar, this, 12, i));
        this.f218267q = e4m.b.b(new nk7.k(cVar, this, 9, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f218261h.get(), (yji.n) this.i.get(), (yji.n) this.f218262j.get(), (yji.n) this.f218264m.get());
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f218260g.get());
    }
}
