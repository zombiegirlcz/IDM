package rgk;

import com.revolut.retail.feature.pricing_plans.ui.impl.analytics.PricingPlanAnalyticsSource;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f254221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PricingPlanAnalyticsSource f254222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f254223c;
    public final a d;

    public p(boolean z, PricingPlanAnalyticsSource source, b planChangeSuccessBehavior, a planChangeCloseMode) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(planChangeSuccessBehavior, "planChangeSuccessBehavior");
        Intrinsics.checkNotNullParameter(planChangeCloseMode, "planChangeCloseMode");
        this.f254221a = z;
        this.f254222b = source;
        this.f254223c = planChangeSuccessBehavior;
        this.d = planChangeCloseMode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return this.f254221a == pVar.f254221a && Intrinsics.f(this.f254222b, pVar.f254222b) && this.f254223c == pVar.f254223c && this.d == pVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f254223c.hashCode() + ((this.f254222b.hashCode() + (Boolean.hashCode(this.f254221a) * 31)) * 31)) * 31);
    }
}
