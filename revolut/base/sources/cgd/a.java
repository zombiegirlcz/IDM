package cgd;

import com.revolut.feature.shared_separate_favourites.common.screen.counterpart_chooser.SharedFavouritesCounterpartChooserScreenContract$RetainedState;
import com.revolut.kompot.navigable.screen.ScreenStates$RetainedDomain;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends kki.a {
    @Override // kki.a
    public final ScreenStates$RetainedDomain a(jki.i iVar) {
        k currentState = (k) iVar;
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        return new SharedFavouritesCounterpartChooserScreenContract$RetainedState(currentState.f23940b);
    }

    @Override // kki.a
    public final jki.i b(jki.i iVar, ScreenStates$RetainedDomain screenStates$RetainedDomain) {
        k initialState = (k) iVar;
        SharedFavouritesCounterpartChooserScreenContract$RetainedState retainedState = (SharedFavouritesCounterpartChooserScreenContract$RetainedState) screenStates$RetainedDomain;
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(retainedState, "retainedState");
        return k.a(initialState, null, retainedState.f86839a, null, false, 13);
    }
}
