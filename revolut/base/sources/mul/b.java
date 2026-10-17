package mul;

import android.os.Parcelable;
import com.revolut.trading.orders.ui.invest.placement.security_asset_balance_breakdown.SecurityAssetBalanceBreakdownScreenContract$RetainedState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends i {
    @Override // cli.i
    public final Parcelable a(Object obj2) {
        h currentState = (h) obj2;
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        return new SecurityAssetBalanceBreakdownScreenContract$RetainedState(currentState.f209057c);
    }

    @Override // cli.i
    public final Object b(Object obj2, Parcelable parcelable) {
        h initialState = (h) obj2;
        SecurityAssetBalanceBreakdownScreenContract$RetainedState retainedState = (SecurityAssetBalanceBreakdownScreenContract$RetainedState) parcelable;
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(retainedState, "retainedState");
        return h.a(initialState, null, retainedState.f106995a, 3);
    }
}
