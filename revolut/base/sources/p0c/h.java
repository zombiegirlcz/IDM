package p0c;

import android.os.Parcelable;
import com.revolut.feature.rev_points.impl.ui.transactions.flow.TransactionDetailsPagerFlowContract$DetailsPage;
import com.revolut.feature.rev_points.impl.ui.transactions.flow.TransactionDetailsPagerFlowContract$RetainedState;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends e {
    @Override // cli.i
    public final Parcelable a(Object obj2) {
        Object next;
        c currentState = (c) obj2;
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        Iterator it8 = currentState.f231498b.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((TransactionDetailsPagerFlowContract$DetailsPage.Details) ((TransactionDetailsPagerFlowContract$DetailsPage) next)).f83861a.f84054a, currentState.f231497a)) {
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
        TransactionDetailsPagerFlowContract$DetailsPage transactionDetailsPagerFlowContract$DetailsPage = retainedState.f83865a;
        return c.a(initialState, ((TransactionDetailsPagerFlowContract$DetailsPage.Details) transactionDetailsPagerFlowContract$DetailsPage).f83861a.f84054a, u.c(transactionDetailsPagerFlowContract$DetailsPage), null, 4);
    }
}
