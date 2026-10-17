package xsl;

import com.google.common.collect.ImmutableSet;
import com.revolut.trading.orders.ui.flows.trading_asset_details.RecurringBuyAssetDetailsFlowContract$InputData;
import java.util.Set;
import xf6.t1;

/* JADX INFO: loaded from: classes12.dex */
public final class k implements ctl.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecurringBuyAssetDetailsFlowContract$InputData f308668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f308669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f308670c;
    public final e4m.e d;
    public final e4m.e e;

    public k(p pVar, RecurringBuyAssetDetailsFlowContract$InputData recurringBuyAssetDetailsFlowContract$InputData) {
        this.f308668a = recurringBuyAssetDetailsFlowContract$InputData;
        this.f308669b = e4m.b.b(new t1(pVar, this, 1, 27));
        this.f308670c = e4m.b.b(new t1(pVar, this, 0, 27));
        this.d = e4m.b.b(new t1(pVar, this, 2, 27));
        this.e = e4m.b.b(new t1(pVar, this, 3, 27));
    }

    @Override // xki.e
    public final Set f() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(2);
        builderBuilderWithExpectedSize.add(this.f308670c.get());
        builderBuilderWithExpectedSize.addAll((Iterable) this.d.get());
        return builderBuilderWithExpectedSize.build();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
