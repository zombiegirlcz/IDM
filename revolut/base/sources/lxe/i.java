package lxe;

import android.os.Parcelable;
import com.revolut.feature.topup_screen.impl.flows.checkout.screen.custom_amount.CheckoutCustomAmountScreenContract$RetainedState;
import com.revolut.feature.topup_screen.impl.flows.checkout.screen.custom_amount.CheckoutCustomAmountScreenContract$ValidationResult;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i extends cli.i {
    @Override // cli.i
    public final Parcelable a(Object obj2) {
        d currentState = (d) obj2;
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        return new CheckoutCustomAmountScreenContract$RetainedState(currentState.f200559a, currentState.f200560b);
    }

    @Override // cli.i
    public final Object b(Object obj2, Parcelable parcelable) {
        d initialState = (d) obj2;
        CheckoutCustomAmountScreenContract$RetainedState retainedState = (CheckoutCustomAmountScreenContract$RetainedState) parcelable;
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(retainedState, "retainedState");
        dj0.d customAmount = retainedState.f90765a;
        CheckoutCustomAmountScreenContract$ValidationResult checkoutCustomAmountScreenContract$ValidationResult = retainedState.f90766b;
        initialState.getClass();
        Intrinsics.checkNotNullParameter(customAmount, "customAmount");
        return new d(customAmount, checkoutCustomAmountScreenContract$ValidationResult);
    }
}
