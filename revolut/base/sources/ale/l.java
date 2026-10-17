package ale;

import com.revolut.feature.trading.transfer.investments.api.navigation.NewTransferDestination;
import com.revolut.feature.wealth.ui.api.actions.WealthAction;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class l extends hih.d {
    @Override // hih.d
    public final boolean Z2(WealthAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action instanceof WealthAction.TransferInvestments;
    }

    @Override // hih.d
    public final Object b3(WealthAction wealthAction, Continuation continuation) {
        if (!Z2(wealthAction)) {
            return Unit.f186387a;
        }
        A2(new NewTransferDestination(0));
        return Unit.f186387a;
    }
}
