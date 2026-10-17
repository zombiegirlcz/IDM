package aoa;

import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.n0;
import jgk.u;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f7943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yik.h f7944b;

    public f(u planSubscriptionStateProvider, yik.h pricingPlanStringMapper) {
        Intrinsics.checkNotNullParameter(planSubscriptionStateProvider, "planSubscriptionStateProvider");
        Intrinsics.checkNotNullParameter(pricingPlanStringMapper, "pricingPlanStringMapper");
        this.f7943a = planSubscriptionStateProvider;
        this.f7944b = pricingPlanStringMapper;
    }

    public static TimeClause a(long j2) {
        return new TimeClause(j2, new TimeClause.Format.DateMedium(n0.HIDE_CURRENT_YEAR), null, null, 12);
    }
}
