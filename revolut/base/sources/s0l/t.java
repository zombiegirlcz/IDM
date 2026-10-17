package s0l;

import com.revolut.kompot.navigable.screen.ScreenStates$RetainedDomain;
import com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_request.consent_request.ConsentRequestScreenContract$RetainedState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class t extends kki.a {
    @Override // kki.a
    public final ScreenStates$RetainedDomain a(jki.i iVar) {
        e currentState = (e) iVar;
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        return new ConsentRequestScreenContract$RetainedState(currentState.f258977b);
    }

    @Override // kki.a
    public final jki.i b(jki.i iVar, ScreenStates$RetainedDomain screenStates$RetainedDomain) {
        e initialState = (e) iVar;
        ConsentRequestScreenContract$RetainedState retainedState = (ConsentRequestScreenContract$RetainedState) screenStates$RetainedDomain;
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(retainedState, "retainedState");
        return e.a(initialState, retainedState.f104273a, false, 4);
    }
}
