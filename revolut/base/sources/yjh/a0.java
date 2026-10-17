package yjh;

import com.revolut.feature.wealth.ui.api.actions.WealthAction;
import com.revolut.feature.wealth.ui.api.navigation.trade.WealthTradeRedesignDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a0 extends hih.d {
    @Override // hih.d
    public final boolean Z2(WealthAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action instanceof WealthAction.Trade;
    }

    @Override // hih.d
    public final Object b3(WealthAction wealthAction, Continuation continuation) {
        sih.c cVar;
        if (!Z2(wealthAction)) {
            return Unit.f186387a;
        }
        hih.a f95897b = wealthAction.getF95897b();
        switch (f95897b == null ? -1 : z.f314506a[f95897b.ordinal()]) {
            case -1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                cVar = null;
                break;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                cVar = sih.c.CFD;
                break;
        }
        A2(new WealthTradeRedesignDestination(cVar));
        return Unit.f186387a;
    }
}
