package vsl;

import android.os.Parcelable;
import com.revolut.trading.orders.ui.details_pager.InvestOrderDetailsPagerFlowContract$DetailsPagerItem;
import com.revolut.trading.orders.ui.details_pager.InvestOrderDetailsPagerFlowContract$RetainedState;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes12.dex */
public final class h extends d {
    @Override // cli.i
    public final Parcelable a(Object obj2) {
        Object next;
        c currentState = (c) obj2;
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        Iterator it8 = currentState.f291848b.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((InvestOrderDetailsPagerFlowContract$DetailsPagerItem) next).f106817a.getF104548b(), currentState.f291847a)) {
                break;
            }
        }
        InvestOrderDetailsPagerFlowContract$DetailsPagerItem investOrderDetailsPagerFlowContract$DetailsPagerItem = (InvestOrderDetailsPagerFlowContract$DetailsPagerItem) next;
        if (investOrderDetailsPagerFlowContract$DetailsPagerItem != null) {
            return new InvestOrderDetailsPagerFlowContract$RetainedState(investOrderDetailsPagerFlowContract$DetailsPagerItem);
        }
        return null;
    }

    @Override // cli.i
    public final Object b(Object obj2, Parcelable parcelable) {
        c initialState = (c) obj2;
        InvestOrderDetailsPagerFlowContract$RetainedState retainedState = (InvestOrderDetailsPagerFlowContract$RetainedState) parcelable;
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(retainedState, "retainedState");
        InvestOrderDetailsPagerFlowContract$DetailsPagerItem investOrderDetailsPagerFlowContract$DetailsPagerItem = retainedState.f106818a;
        return c.a(initialState, investOrderDetailsPagerFlowContract$DetailsPagerItem.f106817a.getF104548b(), u.c(investOrderDetailsPagerFlowContract$DetailsPagerItem), null, 4);
    }
}
