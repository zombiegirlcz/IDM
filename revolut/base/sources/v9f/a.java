package v9f;

import android.os.Parcelable;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_asset_selection.screens.instruments_list.InstrumentsListScreenContract$RetainedState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends cli.i {
    @Override // cli.i
    public final Parcelable a(Object obj2) {
        g currentState = (g) obj2;
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        return new InstrumentsListScreenContract$RetainedState(currentState.f287033a);
    }

    @Override // cli.i
    public final Object b(Object obj2, Parcelable parcelable) {
        g initialState = (g) obj2;
        InstrumentsListScreenContract$RetainedState retainedState = (InstrumentsListScreenContract$RetainedState) parcelable;
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(retainedState, "retainedState");
        return g.a(initialState, retainedState.f91569a, null, 2);
    }
}
