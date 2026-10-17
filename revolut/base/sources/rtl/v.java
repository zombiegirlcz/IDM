package rtl;

import android.os.Parcelable;
import com.revolut.trading.orders.ui.invest.placement.account.selector.screen.InvestAccountSelectorScreenContract$RetainedState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class v extends o {
    @Override // cli.i
    public final Parcelable a(Object obj2) {
        k currentState = (k) obj2;
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        return new InvestAccountSelectorScreenContract$RetainedState(currentState.f257325a);
    }

    @Override // cli.i
    public final Object b(Object obj2, Parcelable parcelable) {
        k initialState = (k) obj2;
        InvestAccountSelectorScreenContract$RetainedState retainedState = (InvestAccountSelectorScreenContract$RetainedState) parcelable;
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(retainedState, "retainedState");
        return k.a(initialState, retainedState.f106833a, null, null, null, null, null, null, 126);
    }
}
