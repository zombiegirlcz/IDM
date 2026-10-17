package mw5;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.flow.CryptoCommodityBuyCollectionFlowContract$InputData;
import com.revolut.kompot.navigable.flow.BaseFlow;
import java.util.Set;
import ms1.s;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements qji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoCommodityBuyCollectionFlowContract$InputData f209365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f209366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f209367c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f209368g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f209369h;
    public final e4m.e i;

    public j(l lVar, BaseFlow baseFlow, CryptoCommodityBuyCollectionFlowContract$InputData cryptoCommodityBuyCollectionFlowContract$InputData) {
        this.f209366b = lVar;
        this.f209365a = cryptoCommodityBuyCollectionFlowContract$InputData;
        this.d = e4m.b.b(e4m.c.a(baseFlow));
        int i = 4;
        this.e = e4m.b.b(new s(lVar, this, 2, i));
        this.f = e4m.b.b(new s(lVar, this, 1, i));
        this.f209368g = e4m.b.b(new s(lVar, this, 0, i));
        this.f209369h = e4m.b.b(new s(lVar, this, 4, i));
        this.i = e4m.b.b(new s(lVar, this, 3, i));
    }

    @Override // dki.t
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // dki.q
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f209368g.get());
    }
}
