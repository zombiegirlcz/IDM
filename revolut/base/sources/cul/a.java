package cul;

import android.os.Parcelable;
import com.revolut.data.model.Data;
import com.revolut.feature.trading_orders.common.models.AutoTopUpStatus;
import com.revolut.trading.orders.ui.invest.placement.models.InvestInputValue;
import com.revolut.trading.orders.ui.invest.placement.screens.edit.InvestOrderEditScreenContract$RetainedState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends z {
    @Override // cli.i
    public final Parcelable a(Object obj2) {
        v currentState = (v) obj2;
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        k4l.r0 r0Var = currentState.f109176b;
        String str = currentState.f109177c;
        aul.b bVar = currentState.d;
        InvestInputValue investInputValue = currentState.e;
        Data data = currentState.f109180j;
        return new InvestOrderEditScreenContract$RetainedState(r0Var, str, bVar, investInputValue, data != null ? (xi0.b) data.getContent() : null, currentState.f109179h, currentState.f109181l, currentState.f109185q, currentState.f109188t, currentState.f109189w, currentState.f109191y, (AutoTopUpStatus) currentState.z.getContent(), currentState.F, currentState.G, currentState.E);
    }

    @Override // cli.i
    public final Object b(Object obj2, Parcelable parcelable) {
        v initialState = (v) obj2;
        InvestOrderEditScreenContract$RetainedState retainedState = (InvestOrderEditScreenContract$RetainedState) parcelable;
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(retainedState, "retainedState");
        k4l.r0 r0Var = retainedState.f106907a;
        String str = retainedState.f106908b;
        aul.b bVar = retainedState.f106909c;
        InvestInputValue investInputValue = retainedState.d;
        InvestInputValue investInputValue2 = new InvestInputValue(investInputValue.f106844a, investInputValue.f106845b, 4);
        xi0.b bVar2 = retainedState.e;
        return v.a(initialState, r0Var, str, bVar, investInputValue2, null, null, retainedState.f, null, bVar2 != null ? zi0.c.P(bVar2, false, null, 3) : null, null, retainedState.f106910g, null, null, null, null, retainedState.f106911h, null, null, retainedState.i, null, null, retainedState.f106912j, null, retainedState.k, zi0.c.P(retainedState.f106913l, false, null, 3), null, null, null, null, retainedState.o, retainedState.f106914m, retainedState.f106915n, null, null, null, null, null, null, null, null, null, null, null, null, 1018623329, 8190);
    }
}
