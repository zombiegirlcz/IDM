package o7j;

import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.target_price.CommodityTargetPriceScreen;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements zp0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CommodityTargetPriceScreen f222859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CenteredAmountDelegate.Model f222860b;

    public e(CommodityTargetPriceScreen commodityTargetPriceScreen, CenteredAmountDelegate.Model model) {
        this.f222859a = commodityTargetPriceScreen;
        this.f222860b = model;
    }

    @Override // zp0.c
    public final void k(String extractedValue, String formattedValue, boolean z) {
        Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
        Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
        r rVarD = this.f222859a.d();
        nqi.a inputData = new nqi.a(formattedValue, z, this.f222860b);
        com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.target_price.b bVar = (com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.target_price.b) rVarD;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        bVar.H2(bVar.getState(), new b4b.x(4, bVar.f99925q.d(formattedValue)));
    }
}
