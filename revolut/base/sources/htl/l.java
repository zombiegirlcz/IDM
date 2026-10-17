package htl;

import com.revolut.feature.trading_orders.api.ui.details.InvestOrderDetailsContract$Destination;
import com.revolut.feature.trading_orders.api.ui.details.InvestOrderDetailsContract$InputData;
import com.revolut.retail.trading.core.domain.orders.InvestOrderExtended;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class l {
    public static InvestOrderDetailsContract$Destination a(InvestOrderExtended investOrder) {
        Intrinsics.checkNotNullParameter(investOrder, "investOrder");
        return new InvestOrderDetailsContract$Destination(new InvestOrderDetailsContract$InputData(investOrder.getOrder().getF104589b()));
    }
}
