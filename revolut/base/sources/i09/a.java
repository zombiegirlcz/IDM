package i09;

import com.revolut.feature.learn.shared.impl.ui.course.overview.CourseOverviewScreenContract$RetainedState;
import com.revolut.kompot.navigable.screen.ScreenStates$RetainedDomain;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends kki.a {
    @Override // kki.a
    public final ScreenStates$RetainedDomain a(jki.i iVar) {
        g currentState = (g) iVar;
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        return new CourseOverviewScreenContract$RetainedState(currentState.f157323a);
    }

    @Override // kki.a
    public final jki.i b(jki.i iVar, ScreenStates$RetainedDomain screenStates$RetainedDomain) {
        g initialState = (g) iVar;
        CourseOverviewScreenContract$RetainedState retainedState = (CourseOverviewScreenContract$RetainedState) screenStates$RetainedDomain;
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(retainedState, "retainedState");
        return g.a(initialState, retainedState.f77993a, null, 2);
    }
}
