package eaf;

import android.os.Parcelable;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.broker_selection.BrokerSelectionScreenContract$RetainedState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class t extends cli.i {
    @Override // cli.i
    public final Parcelable a(Object obj2) {
        f currentState = (f) obj2;
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        return new BrokerSelectionScreenContract$RetainedState(currentState.f124230a);
    }

    @Override // cli.i
    public final Object b(Object obj2, Parcelable parcelable) {
        f initialState = (f) obj2;
        BrokerSelectionScreenContract$RetainedState retainedState = (BrokerSelectionScreenContract$RetainedState) parcelable;
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(retainedState, "retainedState");
        return f.a(initialState, retainedState.f91598a, null, 14);
    }
}
