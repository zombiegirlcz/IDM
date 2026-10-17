package nyb;

import com.revolut.feature.rev_points.models.RevPointsTransaction;
import com.revolut.feature.rev_points.params.RevPointsTransactionPageParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import m1c.r1;

/* JADX INFO: loaded from: classes6.dex */
public final class q0 implements eub.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ihm.b f220832a;

    public q0(List transactionsList) {
        Intrinsics.checkNotNullParameter(transactionsList, "transactionsList");
        List list = transactionsList;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(new r1((RevPointsTransaction) it8.next(), null));
        }
        ihm.b bVarE = ihm.b.e(new lk0.g(zhm.u.c(new lk0.e(arrayList, new RevPointsTransactionPageParams(0, null, null, null, null, null, null, null, null, 511), false, null, null, 24))));
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.f220832a = bVarE;
    }

    @Override // eub.l
    public final efm.b a(ihm.f events) {
        Intrinsics.checkNotNullParameter(events, "events");
        pfm.m mVar = pfm.m.f235744a;
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        return mVar;
    }

    @Override // eub.l
    public final ihm.b b() {
        return this.f220832a;
    }
}
