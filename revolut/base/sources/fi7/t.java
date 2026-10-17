package fi7;

import android.os.Parcelable;
import com.revolut.feature.instruments.trend.collections.impl.ui.collection.InstrumentsTrendCollectionControllerContract$RetainedState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class t extends cli.i {
    @Override // cli.i
    public final Parcelable a(Object obj2) {
        j currentState = (j) obj2;
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        return new InstrumentsTrendCollectionControllerContract$RetainedState(currentState.f135325c, currentState.d);
    }

    @Override // cli.i
    public final Object b(Object obj2, Parcelable parcelable) {
        j initialState = (j) obj2;
        InstrumentsTrendCollectionControllerContract$RetainedState retainedState = (InstrumentsTrendCollectionControllerContract$RetainedState) parcelable;
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(retainedState, "retainedState");
        return new j(initialState.f135323a, retainedState.f74910a, retainedState.f74911b);
    }
}
