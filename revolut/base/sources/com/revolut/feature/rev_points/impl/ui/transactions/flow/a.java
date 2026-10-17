package com.revolut.feature.rev_points.impl.ui.transactions.flow;

import com.revolut.feature.rev_points.impl.ui.transactions.flow.TransactionDetailsPagerFlowContract$DetailsPage;
import com.revolut.feature.rev_points.models.RevPointsTransaction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class a {
    private a() {
    }

    public static ArrayList a(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(new TransactionDetailsPagerFlowContract$DetailsPage.Details((RevPointsTransaction) it8.next()));
        }
        return arrayList;
    }
}
