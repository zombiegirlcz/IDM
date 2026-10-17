package ywk;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.retail.feature.trading_hours.api.TradingHoursDestination;
import com.revolut.retail.feature.trading_hours.impl.ui.market_hours.MarketHoursController;
import gxk.f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import uwk.c;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements ohi.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof uwk.b) {
            return ((c) descriptor).a(new MarketHoursController(new f(((uwk.b) descriptor).b())));
        }
        if (descriptor instanceof uwk.a) {
            return ((c) descriptor).a(new MarketHoursController(gxk.e.f147764a));
        }
        super.c(descriptor);
        return null;
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        TradingHoursDestination tradingHoursDestination = destination instanceof TradingHoursDestination ? (TradingHoursDestination) destination : null;
        if (tradingHoursDestination == null) {
            return null;
        }
        if (tradingHoursDestination instanceof TradingHoursDestination.MarketHours) {
            return new MarketHoursController(new f(((TradingHoursDestination.MarketHours) tradingHoursDestination).getF104066a()));
        }
        if (tradingHoursDestination instanceof TradingHoursDestination.CommodityMarketHours) {
            return new MarketHoursController(gxk.e.f147764a);
        }
        throw new NoWhenBranchMatchedException();
    }
}
