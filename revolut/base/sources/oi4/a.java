package oi4;

import com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.request_consent.RequestConsentScreenContract$RetainedState;
import com.revolut.kompot.navigable.screen.ScreenStates$RetainedDomain;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends kki.a {
    @Override // kki.a
    public final ScreenStates$RetainedDomain a(jki.i iVar) {
        e currentState = (e) iVar;
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        return new RequestConsentScreenContract$RetainedState(currentState.f225436b);
    }

    @Override // kki.a
    public final jki.i b(jki.i iVar, ScreenStates$RetainedDomain screenStates$RetainedDomain) {
        e initialState = (e) iVar;
        RequestConsentScreenContract$RetainedState retainedState = (RequestConsentScreenContract$RetainedState) screenStates$RetainedDomain;
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(retainedState, "retainedState");
        return e.a(initialState, null, retainedState.f68458a, 1);
    }
}
