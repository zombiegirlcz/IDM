package pwg;

import com.revolut.feature.wealth.analytics.insights.model.PortfolioInsightsUsageRequirements;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PortfolioInsightsUsageRequirements f240447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f240448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f240449c;

    public a(PortfolioInsightsUsageRequirements usageRequirements, r rVar, ArrayList indicators) {
        Intrinsics.checkNotNullParameter(usageRequirements, "usageRequirements");
        Intrinsics.checkNotNullParameter(indicators, "indicators");
        this.f240447a = usageRequirements;
        this.f240448b = rVar;
        this.f240449c = indicators;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f240447a.equals(aVar.f240447a) && Intrinsics.f(this.f240448b, aVar.f240448b) && this.f240449c.equals(aVar.f240449c);
    }

    public final int hashCode() {
        int iHashCode = this.f240447a.hashCode() * 31;
        r rVar = this.f240448b;
        return this.f240449c.hashCode() + ((iHashCode + (rVar == null ? 0 : rVar.hashCode())) * 31);
    }
}
