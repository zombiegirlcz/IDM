package igf;

import android.os.Parcelable;
import com.revolut.feature.transaction_details_pager.impl.ui.flow.TransactionDetailsPagerFlowContract$DetailsPage;
import com.revolut.feature.transaction_details_pager.impl.ui.flow.TransactionDetailsPagerFlowContract$RetainedState;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends d {
    @Override // cli.i
    public final Parcelable a(Object obj2) {
        Object next;
        c currentState = (c) obj2;
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        Iterator it8 = currentState.f161187b.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((TransactionDetailsPagerFlowContract$DetailsPage) next).f91896a.getF94575b(), currentState.f161186a)) {
                break;
            }
        }
        TransactionDetailsPagerFlowContract$DetailsPage transactionDetailsPagerFlowContract$DetailsPage = (TransactionDetailsPagerFlowContract$DetailsPage) next;
        if (transactionDetailsPagerFlowContract$DetailsPage == null) {
            return null;
        }
        return new TransactionDetailsPagerFlowContract$RetainedState(transactionDetailsPagerFlowContract$DetailsPage);
    }

    @Override // cli.i
    public final Object b(Object obj2, Parcelable parcelable) {
        c initialState = (c) obj2;
        TransactionDetailsPagerFlowContract$RetainedState retainedState = (TransactionDetailsPagerFlowContract$RetainedState) parcelable;
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(retainedState, "retainedState");
        TransactionDetailsPagerFlowContract$DetailsPage transactionDetailsPagerFlowContract$DetailsPage = retainedState.f91900a;
        return c.a(initialState, transactionDetailsPagerFlowContract$DetailsPage.f91896a.getF94575b(), u.c(transactionDetailsPagerFlowContract$DetailsPage), null, null, 12);
    }
}
