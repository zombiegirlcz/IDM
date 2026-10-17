package wfh;

import android.os.Parcelable;
import com.revolut.feature.wealth.private_equity.impl.ui.fund_details.FundDetailsScreenContract$RetainedState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class v extends m {
    @Override // cli.i
    public final Parcelable a(Object obj2) {
        l currentState = (l) obj2;
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        return new FundDetailsScreenContract$RetainedState(currentState.f, currentState.f297123g, currentState.f297124h);
    }

    @Override // cli.i
    public final Object b(Object obj2, Parcelable parcelable) {
        l initialState = (l) obj2;
        FundDetailsScreenContract$RetainedState retainedState = (FundDetailsScreenContract$RetainedState) parcelable;
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(retainedState, "retainedState");
        return l.e(initialState, null, null, null, null, retainedState.f95774a, retainedState.f95775b, retainedState.f95776c, null, null, null, null, null, null, null, null, null, null, null, null, null, 2096927);
    }
}
