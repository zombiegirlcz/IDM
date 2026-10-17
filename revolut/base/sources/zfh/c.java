package zfh;

import com.revolut.feature.trading_orders.api.ui.list.InvestOrdersListFeatureContract$Disclaimers;
import com.revolut.feature.trading_orders.api.ui.list.InvestOrdersListFeatureContract$InputData;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements fsl.c {
    @Override // fsl.c
    public final Object a(Continuation continuation) {
        return new InvestOrdersListFeatureContract$InputData.PendingOrders.DisplayOptions(new InvestOrdersListFeatureContract$Disclaimers.Custom(true, false, false));
    }
}
