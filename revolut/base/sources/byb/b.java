package byb;

import h93.f0;
import h93.g;
import h93.h0;
import h93.r;
import kotlin.jvm.internal.Intrinsics;
import yik.h;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f19793a;

    public b(h pricingPlanStringMapper) {
        Intrinsics.checkNotNullParameter(pricingPlanStringMapper, "pricingPlanStringMapper");
        this.f19793a = pricingPlanStringMapper;
    }

    public static boolean a(f0 f0Var) {
        if (v.k(r.CREATED, r.PENDING).contains(f0Var.f)) {
            return true;
        }
        if (f0Var.w()) {
            if (!v.k(g.DELIVERED, g.NONE).contains(f0Var.k.f150132a)) {
                return true;
            }
        }
        return h0.e(f0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0167  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.LinkedHashMap b(com.revolut.feature.rev_points.models.RevPointsEarningBreakdown r13, java.util.List r14) {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: byb.b.b(com.revolut.feature.rev_points.models.RevPointsEarningBreakdown, java.util.List):java.util.LinkedHashMap");
    }
}
