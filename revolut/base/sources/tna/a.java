package tna;

import com.revolut.core.ui_kit.recycler.ScrollOffsetData;
import com.revolut.feature.profile.impl.ui.profile.screens.appearance.AppearanceThemeScreenContract$RetainedState;
import com.revolut.kompot.navigable.screen.ScreenStates$RetainedDomain;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends kki.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ScrollOffsetData f272337a;

    @Override // kki.a
    public final ScreenStates$RetainedDomain a(jki.i iVar) {
        k currentState = (k) iVar;
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        return new AppearanceThemeScreenContract$RetainedState(this.f272337a);
    }

    @Override // kki.a
    public final jki.i b(jki.i iVar, ScreenStates$RetainedDomain screenStates$RetainedDomain) {
        k initialState = (k) iVar;
        AppearanceThemeScreenContract$RetainedState retainedState = (AppearanceThemeScreenContract$RetainedState) screenStates$RetainedDomain;
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(retainedState, "retainedState");
        return k.a(initialState, null, null, retainedState.f81440a, 7);
    }
}
