package oul;

import android.os.Parcelable;
import com.revolut.trading.orders.ui.invest.placement.models.TargetPriceInputValue;
import com.revolut.trading.orders.ui.invest.placement.target_price.TargetPriceScreenContract$RetainedState;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f0 extends l {
    @Override // cli.i
    public final Parcelable a(Object obj2) {
        k currentState = (k) obj2;
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        return new TargetPriceScreenContract$RetainedState(currentState.f229907c);
    }

    @Override // cli.i
    public final Object b(Object obj2, Parcelable parcelable) {
        k initialState = (k) obj2;
        TargetPriceScreenContract$RetainedState retainedState = (TargetPriceScreenContract$RetainedState) parcelable;
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(retainedState, "retainedState");
        TargetPriceInputValue targetPriceInputValue = retainedState.f107002a;
        return k.a(initialState, new TargetPriceInputValue(targetPriceInputValue.f106872a, targetPriceInputValue.f106873b, true, 4), null, null, null, null, Constants.TAG_FB_CHARGING_STATUS);
    }
}
