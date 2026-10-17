package yfd;

import com.revolut.feature.shared_separate_favourites.common.screen.add_asset.SharedFavouritesAddAssetScreenContract$RetainedState;
import com.revolut.kompot.navigable.screen.ScreenStates$RetainedDomain;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends kki.a {
    @Override // kki.a
    public final ScreenStates$RetainedDomain a(jki.i iVar) {
        m currentState = (m) iVar;
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        return new SharedFavouritesAddAssetScreenContract$RetainedState(currentState.f313219b);
    }

    @Override // kki.a
    public final jki.i b(jki.i iVar, ScreenStates$RetainedDomain screenStates$RetainedDomain) {
        m initialState = (m) iVar;
        SharedFavouritesAddAssetScreenContract$RetainedState retainedState = (SharedFavouritesAddAssetScreenContract$RetainedState) screenStates$RetainedDomain;
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(retainedState, "retainedState");
        return m.a(initialState, null, retainedState.f86812a, null, false, null, 61);
    }
}
