package l97;

import android.os.Parcelable;
import com.revolut.feature.globalsearch.impl.ui.screen.GlobalSearchScreenContract$RetainedState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class o extends cli.i {
    @Override // cli.i
    public final Parcelable a(Object obj2) {
        i currentState = (i) obj2;
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        return new GlobalSearchScreenContract$RetainedState(currentState.f193059a);
    }

    @Override // cli.i
    public final Object b(Object obj2, Parcelable parcelable) {
        i initialState = (i) obj2;
        GlobalSearchScreenContract$RetainedState retainedState = (GlobalSearchScreenContract$RetainedState) parcelable;
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(retainedState, "retainedState");
        return i.n(initialState, retainedState.f74633a, null, null, null, null, null, 62);
    }
}
