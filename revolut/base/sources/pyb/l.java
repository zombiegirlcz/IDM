package pyb;

import com.revolut.feature.rev_points.models.RevPointsTransaction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import tof.s9;
import zhm.d0;

/* JADX INFO: loaded from: classes6.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f240742a;

    public l(com.revolut.domain.interactors.transactions.a transactionsInteractor) {
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        this.f240742a = transactionsInteractor;
    }

    public final efm.r a(List revPointsTransactions) {
        Intrinsics.checkNotNullParameter(revPointsTransactions, "revPointsTransactions");
        ArrayList arrayList = new ArrayList();
        Iterator it8 = revPointsTransactions.iterator();
        while (it8.hasNext()) {
            String str = ((RevPointsTransaction) it8.next()).e;
            if (str != null) {
                arrayList.add(str);
            }
        }
        efm.r rVarDistinctUntilChanged = com.revolut.domain.interactors.transactions.a.d(this.f240742a, new s9(d0.i1(arrayList)), null, null, null, null, 30).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        return nim.a.w(rVarDistinctUntilChanged, new njf.e(revPointsTransactions, 28));
    }
}
