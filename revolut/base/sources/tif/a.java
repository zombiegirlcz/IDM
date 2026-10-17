package tif;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import tof.q6;
import zhm.d0;

/* JADX INFO: loaded from: classes8.dex */
public final class a {
    public static String a(q6 transactionScope) {
        Intrinsics.checkNotNullParameter(transactionScope, "transactionScope");
        String[] elements = {transactionScope.o1(), transactionScope.getPocketId()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listL) {
            if (((String) obj2).length() > 0) {
                arrayList.add(obj2);
            }
        }
        return d0.k0(arrayList, "_", null, null, 0, null, 62);
    }
}
