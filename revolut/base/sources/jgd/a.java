package jgd;

import com.revolut.feature.shared_separate_favourites.converter.ui.screen.SharedConverterScreenContract$ConverterHistory;
import com.revolut.feature.shared_separate_favourites.converter.ui.screen.SharedConverterScreenContract$RetainedState;
import com.revolut.kompot.navigable.screen.ScreenStates$RetainedDomain;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends kki.a {
    @Override // kki.a
    public final ScreenStates$RetainedDomain a(jki.i iVar) {
        j currentState = (j) iVar;
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        return new SharedConverterScreenContract$RetainedState(currentState.f173970a, currentState.d);
    }

    @Override // kki.a
    public final jki.i b(jki.i iVar, ScreenStates$RetainedDomain screenStates$RetainedDomain) {
        j initialState = (j) iVar;
        SharedConverterScreenContract$RetainedState retainedState = (SharedConverterScreenContract$RetainedState) screenStates$RetainedDomain;
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(retainedState, "retainedState");
        SharedConverterScreenContract$ConverterHistory converterHistory = retainedState.f86859a;
        boolean z = retainedState.f86860b;
        initialState.getClass();
        Intrinsics.checkNotNullParameter(converterHistory, "converterHistory");
        return new j(converterHistory, false, true, z);
    }
}
