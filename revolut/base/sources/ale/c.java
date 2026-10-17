package ale;

import com.revolut.feature.trading.api.navigation.HoldingsInformationDestination;
import com.revolut.feature.wealth.ui.api.actions.WealthAction;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends hih.d {
    @Override // hih.d
    public final boolean Z2(WealthAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action instanceof WealthAction.HoldingsInformation;
    }

    @Override // hih.d
    public final Object b3(WealthAction wealthAction, Continuation continuation) {
        A2(HoldingsInformationDestination.f91209a);
        return Unit.f186387a;
    }
}
