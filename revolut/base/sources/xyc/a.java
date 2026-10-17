package xyc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a {
    public static e a(List transactions) {
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        ArrayList arrayList = new ArrayList();
        Iterator it8 = transactions.iterator();
        while (it8.hasNext()) {
            hyc.c cVar = (hyc.c) ((Pair) it8.next()).f186386b;
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }
        return (arrayList.isEmpty() || arrayList.size() < transactions.size() || arrayList.contains(hyc.c.UPDATE_REQUESTED) || arrayList.contains(hyc.c.UPDATE_REQUIRED) || arrayList.contains(hyc.c.REJECTED)) ? e.USER_ACTION_REQUIRED : (arrayList.contains(hyc.c.UNDER_REVIEW) || arrayList.contains(hyc.c.UPLOADED)) ? e.UNDER_REVIEW : e.VERIFICATION_COMPLETED;
    }
}
