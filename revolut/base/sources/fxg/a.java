package fxg;

import com.revolut.feature.wealth.analytics.insights.model.PortfolioInsightsUsageRequirements;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PortfolioInsightsUsageRequirements f138819a;

    public a(PortfolioInsightsUsageRequirements usageRequirements) {
        Intrinsics.checkNotNullParameter(usageRequirements, "usageRequirements");
        this.f138819a = usageRequirements;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f138819a, ((a) obj2).f138819a);
    }

    public final int hashCode() {
        return this.f138819a.hashCode();
    }
}
