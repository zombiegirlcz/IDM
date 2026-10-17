package mw5;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.screen.confirmation.CryptoCommodityBuyCollectionConfirmationScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;
import ld1.q;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoCommodityBuyCollectionConfirmationScreenContract$InputData f209362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BaseScreen f209363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f209364c;
    public final e4m.e d;
    public final e4m.e e;

    public i(l lVar, j jVar, BaseScreen baseScreen, CryptoCommodityBuyCollectionConfirmationScreenContract$InputData cryptoCommodityBuyCollectionConfirmationScreenContract$InputData) {
        this.f209362a = cryptoCommodityBuyCollectionConfirmationScreenContract$InputData;
        this.f209363b = baseScreen;
        int i = 28;
        this.f209364c = e4m.b.b(new q(lVar, jVar, this, 1, i));
        this.d = e4m.b.b(new q(lVar, jVar, this, 2, i));
        this.e = e4m.b.b(new q(lVar, jVar, this, 0, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of();
    }
}
