package baf;

import android.os.Parcelable;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.account_information.AccountInformationScreenContract$RetainedState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends cli.i {
    @Override // cli.i
    public final Parcelable a(Object obj2) {
        i currentState = (i) obj2;
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        return new AccountInformationScreenContract$RetainedState(currentState.f14052a, currentState.f14053b, currentState.f14054c, currentState.d, currentState.f);
    }

    @Override // cli.i
    public final Object b(Object obj2, Parcelable parcelable) {
        i initialState = (i) obj2;
        AccountInformationScreenContract$RetainedState retainedState = (AccountInformationScreenContract$RetainedState) parcelable;
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(retainedState, "retainedState");
        return i.a(initialState, retainedState.f91593a, retainedState.f91594b, retainedState.f91595c, retainedState.d, retainedState.e, 208);
    }
}
