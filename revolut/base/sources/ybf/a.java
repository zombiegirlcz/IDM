package ybf;

import aii.u;
import com.revolut.feature.trading_add_ons.TradingAddOnsApi$Toggles;
import com.revolut.feature.trading_add_ons.impl.ui.add_ons.flow.TradingAddOnsFlow;
import com.revolut.feature.trading_add_ons.impl.ui.add_ons.flow.TradingAddOnsFlowContract$InputData;
import com.revolut.feature.trading_add_ons.navigation.TradingAddOnsDestination$AddOnsMainDestination;
import dki.g;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements ohi.a, nte.a {
    @Override // nte.a
    public final List e() {
        return TradingAddOnsApi$Toggles.a();
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof TradingAddOnsDestination$AddOnsMainDestination) {
            return new TradingAddOnsFlow(new TradingAddOnsFlowContract$InputData(((TradingAddOnsDestination$AddOnsMainDestination) destination).f91685a));
        }
        return null;
    }
}
