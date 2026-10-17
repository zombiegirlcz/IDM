package xug;

import android.os.Parcelable;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.review_closure_conditions.ReviewClosureConditionsBottomSheetContract$PersistentState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class r extends cli.i {
    @Override // cli.i
    public final Parcelable a(Object obj2) {
        g currentState = (g) obj2;
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        return new ReviewClosureConditionsBottomSheetContract$PersistentState(currentState.f309064b);
    }

    @Override // cli.i
    public final Object b(Object obj2, Parcelable parcelable) {
        g initialState = (g) obj2;
        ReviewClosureConditionsBottomSheetContract$PersistentState retainedState = (ReviewClosureConditionsBottomSheetContract$PersistentState) parcelable;
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(retainedState, "retainedState");
        return g.a(initialState, retainedState.f94959a);
    }
}
