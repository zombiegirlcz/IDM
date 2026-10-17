package zul;

import android.os.Parcelable;
import com.revolut.trading.orders.ui.screens.investment_plan.projection.InvestmentProjectionsScreenContract$RetainedState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f0 extends p {
    @Override // cli.i
    public final Parcelable a(Object obj2) {
        n currentState = (n) obj2;
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        return new InvestmentProjectionsScreenContract$RetainedState(currentState.f325541b, currentState.f325546l);
    }

    @Override // cli.i
    public final Object b(Object obj2, Parcelable parcelable) {
        n initialState = (n) obj2;
        InvestmentProjectionsScreenContract$RetainedState retainedState = (InvestmentProjectionsScreenContract$RetainedState) parcelable;
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(retainedState, "retainedState");
        return n.a(initialState, null, retainedState.f107035a, null, null, null, null, null, null, null, null, retainedState.f107036b, 2045);
    }
}
