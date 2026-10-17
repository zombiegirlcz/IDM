package com.revolut.feature.unified_transactions.models;

import com.revolut.feature.unified_transactions.models.UnifiedTransaction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public abstract class a {
    public static final ArrayList a(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof UnifiedTransaction.Standard) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(((UnifiedTransaction.Standard) it8.next()).f94574a);
        }
        return arrayList2;
    }
}
