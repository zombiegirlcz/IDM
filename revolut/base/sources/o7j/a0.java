package o7j;

import android.os.Parcelable;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.target_price.CommodityTargetPriceScreenContract$RetainedState;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.target_price.CommodityTargetPriceScreenContract$TargetPriceInputValue;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a0 extends q {
    @Override // cli.i
    public final Parcelable a(Object obj2) {
        j currentState = (j) obj2;
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        return new CommodityTargetPriceScreenContract$RetainedState(currentState.f222863a);
    }

    @Override // cli.i
    public final Object b(Object obj2, Parcelable parcelable) {
        j initialState = (j) obj2;
        CommodityTargetPriceScreenContract$RetainedState retainedState = (CommodityTargetPriceScreenContract$RetainedState) parcelable;
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(retainedState, "retainedState");
        CommodityTargetPriceScreenContract$TargetPriceInputValue commodityTargetPriceScreenContract$TargetPriceInputValue = retainedState.f99920a;
        return j.a(initialState, new CommodityTargetPriceScreenContract$TargetPriceInputValue(commodityTargetPriceScreenContract$TargetPriceInputValue.f99921a, commodityTargetPriceScreenContract$TargetPriceInputValue.f99922b, true), null, null, 126);
    }
}
