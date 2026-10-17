package knd;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class y0 {
    public static Map a(dj0.d accountBalance, List analyticsPeriods) {
        Intrinsics.checkNotNullParameter(accountBalance, "accountBalance");
        Intrinsics.checkNotNullParameter(analyticsPeriods, "analyticsPeriods");
        if (analyticsPeriods.isEmpty()) {
            return zhm.r0.g();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int iJ = zhm.v.j(analyticsPeriods);
        while (true) {
            if (-1 >= iJ) {
                break;
            }
            ind.e eVar = (ind.e) analyticsPeriods.get(iJ);
            if (eVar instanceof ind.c) {
                ind.c cVar = (ind.c) eVar;
                accountBalance = pyd.c.H(accountBalance, cVar.i);
                linkedHashMap.put(cVar.f162792a, accountBalance);
            } else if (eVar instanceof ind.b) {
                linkedHashMap.put(((ind.b) eVar).f162789a, accountBalance);
            } else if (!(eVar instanceof ind.d)) {
                throw new NoWhenBranchMatchedException();
            }
            iJ--;
        }
        return linkedHashMap;
    }
}
