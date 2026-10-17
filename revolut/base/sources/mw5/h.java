package mw5;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.screen.amount.CryptoCommodityBuyCollectionAmountScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;
import ld1.q;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoCommodityBuyCollectionAmountScreenContract$InputData f209355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f209356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f209357c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f209358g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f209359h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f209360j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f209361l;

    public h(l lVar, j jVar, BaseScreen baseScreen, CryptoCommodityBuyCollectionAmountScreenContract$InputData cryptoCommodityBuyCollectionAmountScreenContract$InputData) {
        this.f209356b = lVar;
        this.f209355a = cryptoCommodityBuyCollectionAmountScreenContract$InputData;
        this.f209357c = e4m.b.b(e4m.c.a(baseScreen));
        int i = 27;
        this.d = e4m.b.b(new q(lVar, jVar, this, 1, i));
        this.e = e4m.b.b(new q(lVar, jVar, this, 0, i));
        this.f = e4m.b.b(new q(lVar, jVar, this, 3, i));
        this.f209358g = e4m.b.b(new q(lVar, jVar, this, 2, i));
        this.f209359h = e4m.b.b(new q(lVar, jVar, this, 6, i));
        this.i = e4m.b.b(new q(lVar, jVar, this, 5, i));
        this.f209360j = e4m.b.b(new q(lVar, jVar, this, 4, i));
        this.k = e4m.b.b(new q(lVar, jVar, this, 8, i));
        this.f209361l = e4m.b.b(new q(lVar, jVar, this, 7, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f209360j.get());
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get(), (yji.d) this.f209358g.get());
    }
}
