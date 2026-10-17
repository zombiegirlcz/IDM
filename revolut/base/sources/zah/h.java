package zah;

import android.os.Parcelable;
import com.revolut.feature.wealth.impl.ui.invest.transactions.details.pager.InvestTransactionDetailsPagerFlowContract$RetainedState;
import com.revolut.feature.wealth.impl.ui.invest.transactions.details.pager.InvestTransactionDetailsPagerFlowContract$TransactionDetailsPagerItem;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class h extends c {
    @Override // cli.i
    public final Parcelable a(Object obj2) {
        Object next;
        b currentState = (b) obj2;
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        Iterator it8 = currentState.f320707b.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((InvestTransactionDetailsPagerFlowContract$TransactionDetailsPagerItem) next).f95576a.getId(), currentState.f320706a)) {
                break;
            }
        }
        InvestTransactionDetailsPagerFlowContract$TransactionDetailsPagerItem investTransactionDetailsPagerFlowContract$TransactionDetailsPagerItem = (InvestTransactionDetailsPagerFlowContract$TransactionDetailsPagerItem) next;
        if (investTransactionDetailsPagerFlowContract$TransactionDetailsPagerItem != null) {
            return new InvestTransactionDetailsPagerFlowContract$RetainedState(investTransactionDetailsPagerFlowContract$TransactionDetailsPagerItem);
        }
        return null;
    }

    @Override // cli.i
    public final Object b(Object obj2, Parcelable parcelable) {
        b initialState = (b) obj2;
        InvestTransactionDetailsPagerFlowContract$RetainedState retainedState = (InvestTransactionDetailsPagerFlowContract$RetainedState) parcelable;
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(retainedState, "retainedState");
        InvestTransactionDetailsPagerFlowContract$TransactionDetailsPagerItem investTransactionDetailsPagerFlowContract$TransactionDetailsPagerItem = retainedState.f95575a;
        return b.a(initialState, investTransactionDetailsPagerFlowContract$TransactionDetailsPagerItem.f95576a.getId(), u.c(investTransactionDetailsPagerFlowContract$TransactionDetailsPagerItem), null, null, 12);
    }
}
