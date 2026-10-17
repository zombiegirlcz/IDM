package cod;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class c {
    public static List a(yld.d screenType, lzi.i type) {
        Intrinsics.checkNotNullParameter(screenType, "screenType");
        Intrinsics.checkNotNullParameter(type, "type");
        if (screenType == yld.d.CASHFLOW) {
            return f0.f322471a;
        }
        yld.d dVar = yld.d.SPENDING;
        yld.d dVar2 = yld.d.INCOME;
        yld.d dVar3 = yld.d.EARNINGS;
        yld.d dVar4 = yld.d.NET_BALANCE;
        List listK = v.k(dVar, dVar2, dVar3, dVar4, yld.d.SALES);
        boolean z = type == lzi.i.CUSTOM;
        boolean z3 = screenType == dVar || screenType == dVar2;
        yld.c cVar = null;
        yld.c cVar2 = ((!listK.contains(screenType) || z) && !z3) ? null : yld.c.LINE_CHART;
        yld.c cVar3 = ((z || screenType == dVar4) && !z3) ? null : yld.c.BAR_CHART;
        if (screenType != dVar3 && screenType != dVar4) {
            cVar = yld.c.PIE_CHART;
        }
        yld.c[] elements = {cVar2, cVar3, cVar};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }
}
