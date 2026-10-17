package fdj;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.screen.BaseScreen;
import com.revolut.retail.feature.cryptocommoditydetails.impl.ui.price_targets.details.screens.details.PriceTargetsDetailsScreenContract$InputData;
import fa0.q;
import java.util.Set;
import od0.i;
import yji.n;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BaseScreen f133954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f133955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PriceTargetsDetailsScreenContract$InputData f133956c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f133957g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f133958h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f133959j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f133960l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f133961m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f133962n;
    public final e4m.e o;

    public c(a aVar, b bVar, BaseScreen baseScreen, PriceTargetsDetailsScreenContract$InputData priceTargetsDetailsScreenContract$InputData, i iVar) {
        this.f133954a = baseScreen;
        this.f133955b = iVar;
        this.f133956c = priceTargetsDetailsScreenContract$InputData;
        int i = 9;
        this.d = e4m.b.b(new q(aVar, this, 2, i));
        this.e = e4m.b.b(new q(aVar, this, 4, i));
        this.f = e4m.b.b(new q(aVar, this, 3, i));
        this.f133957g = e4m.b.b(new q(aVar, this, 1, i));
        this.f133958h = e4m.b.b(e4m.c.a(baseScreen));
        int i2 = 9;
        this.i = e4m.b.b(new q(aVar, this, 6, i2));
        this.f133959j = e4m.b.b(new q(aVar, this, 5, i2));
        this.k = e4m.b.b(new q(aVar, this, 0, i2));
        this.f133960l = e4m.b.b(new q(aVar, this, 7, i2));
        this.f133961m = e4m.b.b(new q(aVar, this, 10, i2));
        this.f133962n = e4m.b.b(new q(aVar, this, 9, i2));
        this.o = e4m.b.b(new q(aVar, this, 8, i2));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of((n) this.f.get());
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.k.get(), (yji.d) this.f133960l.get());
    }
}
