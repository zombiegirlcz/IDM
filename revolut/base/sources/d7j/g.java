package d7j;

import android.os.Parcelable;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.CommodityOrderEditScreenContract$RetainedState;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.ExchangeOrderDraft;
import d7j.d0;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends x {
    @Override // cli.i
    public final Parcelable a(Object obj2) {
        w currentState = (w) obj2;
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        return new CommodityOrderEditScreenContract$RetainedState(currentState.f112067a, currentState.f112069c, currentState.f112070g.a());
    }

    @Override // cli.i
    public final Object b(Object obj2, Parcelable parcelable) {
        w initialState = (w) obj2;
        CommodityOrderEditScreenContract$RetainedState retainedState = (CommodityOrderEditScreenContract$RetainedState) parcelable;
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(retainedState, "retainedState");
        Set set = retainedState.f99848a;
        Set set2 = retainedState.f99849b;
        ExchangeOrderDraft exchangeOrderDraft = retainedState.f99850c;
        return w.a(initialState, set, null, set2, null, null, null, exchangeOrderDraft != null ? new e0(exchangeOrderDraft) : d0.a.f111986a, null, null, 954);
    }
}
