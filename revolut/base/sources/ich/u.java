package ich;

import android.os.Parcelable;
import com.revolut.feature.wealth.impl.ui.screens.instruments_collection.InstrumentsCollectionControllerContract$RetainedState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class u extends m {
    @Override // cli.i
    public final Parcelable a(Object obj2) {
        l currentState = (l) obj2;
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        return new InstrumentsCollectionControllerContract$RetainedState(currentState.i, currentState.f160275g);
    }

    @Override // cli.i
    public final Object b(Object obj2, Parcelable parcelable) {
        l initialState = (l) obj2;
        InstrumentsCollectionControllerContract$RetainedState retainedState = (InstrumentsCollectionControllerContract$RetainedState) parcelable;
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(retainedState, "retainedState");
        return l.a(initialState, null, null, null, false, null, null, retainedState.f95605b, null, retainedState.f95604a, 191);
    }
}
