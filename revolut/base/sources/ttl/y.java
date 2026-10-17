package ttl;

import android.os.Parcelable;
import com.revolut.trading.orders.ui.invest.placement.expiry.ExpiryDateSelectorScreenContract$RetainedState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class y extends q {
    @Override // cli.i
    public final Parcelable a(Object obj2) {
        g currentState = (g) obj2;
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        return new ExpiryDateSelectorScreenContract$RetainedState(currentState.f274446b, currentState.f274445a);
    }

    @Override // cli.i
    public final Object b(Object obj2, Parcelable parcelable) {
        g initialState = (g) obj2;
        ExpiryDateSelectorScreenContract$RetainedState retainedState = (ExpiryDateSelectorScreenContract$RetainedState) parcelable;
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(retainedState, "retainedState");
        return g.a(initialState, retainedState.f106834a, retainedState.f106835b, null, 4);
    }
}
