package wed;

import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.alerts.SharedAlertsScreenContract$RetainedState;
import com.revolut.kompot.navigable.screen.ScreenStates$RetainedDomain;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends kki.a {
    @Override // kki.a
    public final ScreenStates$RetainedDomain a(jki.i iVar) {
        l currentState = (l) iVar;
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        return new SharedAlertsScreenContract$RetainedState(currentState.f296746h);
    }

    @Override // kki.a
    public final jki.i b(jki.i iVar, ScreenStates$RetainedDomain screenStates$RetainedDomain) {
        l initialState = (l) iVar;
        SharedAlertsScreenContract$RetainedState retainedState = (SharedAlertsScreenContract$RetainedState) screenStates$RetainedDomain;
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(retainedState, "retainedState");
        return l.a(initialState, null, null, null, null, null, null, retainedState.f86722a, null, 383);
    }
}
