package kk9;

import com.revolut.feature.pay_later.impl.ui.repayamount.PayLaterRepayAmountScreenContract$RetainedState;
import com.revolut.kompot.navigable.screen.ScreenStates$RetainedDomain;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends kki.a {
    @Override // kki.a
    public final ScreenStates$RetainedDomain a(jki.i iVar) {
        h currentState = (h) iVar;
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        return new PayLaterRepayAmountScreenContract$RetainedState(currentState.f184536b);
    }

    @Override // kki.a
    public final jki.i b(jki.i iVar, ScreenStates$RetainedDomain screenStates$RetainedDomain) {
        h initialState = (h) iVar;
        PayLaterRepayAmountScreenContract$RetainedState retainedState = (PayLaterRepayAmountScreenContract$RetainedState) screenStates$RetainedDomain;
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(retainedState, "retainedState");
        return h.a(initialState, null, retainedState.f78909a, null, 5);
    }
}
