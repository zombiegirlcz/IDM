package cvk;

import com.revolut.feature.trading_orders.api.ui.list.InvestOrdersListFeatureContract$Disclaimers;
import com.revolut.feature.trading_orders.api.ui.list.InvestOrdersListFeatureContract$InputData;
import fsl.c;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements c {
    @Override // fsl.c
    public final Object a(Continuation continuation) {
        return new InvestOrdersListFeatureContract$InputData.PendingOrders.DisplayOptions(new InvestOrdersListFeatureContract$Disclaimers.Custom(false, true, false));
    }
}
