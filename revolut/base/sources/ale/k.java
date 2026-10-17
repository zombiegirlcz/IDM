package ale;

import com.revolut.feature.trading_add_ons.navigation.TradingAddOnsDestination$AddOnsMainDestination;
import com.revolut.feature.wealth.ui.api.actions.WealthAction;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class k extends hih.d {
    @Override // hih.d
    public final boolean Z2(WealthAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action instanceof WealthAction.TradingAddOns;
    }

    @Override // hih.d
    public final Object b3(WealthAction wealthAction, Continuation continuation) {
        A2(new TradingAddOnsDestination$AddOnsMainDestination(0));
        return Unit.f186387a;
    }
}
