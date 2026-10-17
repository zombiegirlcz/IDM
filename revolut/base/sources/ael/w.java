package ael;

import java.util.Comparator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class w {
    public final List a(List instrumentBalances, del.f sortBy) {
        Intrinsics.checkNotNullParameter(instrumentBalances, "instrumentBalances");
        Intrinsics.checkNotNullParameter(sortBy, "sortBy");
        Comparator vVar = new v(sortBy, this);
        int i = u.f3663b[sortBy.f113715b.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            vVar = vVar.reversed();
        }
        Intrinsics.h(vVar);
        return zhm.d0.P0(instrumentBalances, vVar);
    }
}
