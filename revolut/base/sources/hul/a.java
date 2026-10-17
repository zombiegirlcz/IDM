package hul;

import android.os.Parcelable;
import com.revolut.data.model.Data;
import com.revolut.feature.trading_orders.common.models.AutoTopUpStatus;
import com.revolut.feature.trading_orders.common.models.FrequencySettings;
import com.revolut.trading.orders.ui.invest.placement.models.FiatExchangeOrderQuoteResult;
import com.revolut.trading.orders.ui.invest.placement.models.OrderQuoteResult;
import com.revolut.trading.orders.ui.invest.placement.screens.review.InvestOrderReviewScreenContract$RetainedState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends o {
    @Override // cli.i
    public final Parcelable a(Object obj2) {
        h currentState = (h) obj2;
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        FrequencySettings frequencySettings = currentState.f155720b;
        AutoTopUpStatus autoTopUpStatus = currentState.f155721c;
        Data data = currentState.d;
        OrderQuoteResult orderQuoteResult = data != null ? (OrderQuoteResult) data.getContent() : null;
        Data data2 = currentState.e;
        dj0.d dVar = data2 != null ? (dj0.d) data2.getContent() : null;
        Data data3 = currentState.f;
        return new InvestOrderReviewScreenContract$RetainedState(frequencySettings, autoTopUpStatus, orderQuoteResult, dVar, data3 != null ? (FiatExchangeOrderQuoteResult) data3.getContent() : null);
    }

    @Override // cli.i
    public final Object b(Object obj2, Parcelable parcelable) {
        h initialState = (h) obj2;
        InvestOrderReviewScreenContract$RetainedState retainedState = (InvestOrderReviewScreenContract$RetainedState) parcelable;
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(retainedState, "retainedState");
        FrequencySettings frequencySettings = retainedState.f106971a;
        AutoTopUpStatus autoTopUpStatus = retainedState.f106972b;
        OrderQuoteResult orderQuoteResult = retainedState.f106973c;
        Data dataP = orderQuoteResult != null ? zi0.c.P(orderQuoteResult, false, null, 3) : null;
        dj0.d dVar = retainedState.d;
        Data dataP2 = dVar != null ? zi0.c.P(dVar, false, null, 3) : null;
        FiatExchangeOrderQuoteResult fiatExchangeOrderQuoteResult = retainedState.e;
        return h.a(initialState, frequencySettings, autoTopUpStatus, dataP, dataP2, fiatExchangeOrderQuoteResult != null ? zi0.c.P(fiatExchangeOrderQuoteResult, false, null, 3) : null, null, null, null, null, null, null, null, null, null, null, null, 524225);
    }
}
