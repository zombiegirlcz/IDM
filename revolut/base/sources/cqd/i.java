package cqd;

import aqd.p;
import aqd.r;
import aqd.s;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final onh.b f108083a;

    public i(onh.b destinationsChartMapper) {
        Intrinsics.checkNotNullParameter(destinationsChartMapper, "destinationsChartMapper");
        this.f108083a = destinationsChartMapper;
    }

    public static boolean a(s sVar) {
        if (sVar instanceof p) {
            return true;
        }
        if (!(sVar instanceof r)) {
            throw new NoWhenBranchMatchedException();
        }
        int i = h.f108082a[((r) sVar).f.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return false;
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return true;
    }
}
