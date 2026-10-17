package koc;

import com.revolut.feature.wealth.analytics.domain.models.complex_analytics.TotalValueChart;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TotalValueChart f186294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final del.b f186295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f186296c;

    public c(TotalValueChart totalValueChart, del.b portfolioBalance, List performanceParameters) {
        Intrinsics.checkNotNullParameter(totalValueChart, "totalValueChart");
        Intrinsics.checkNotNullParameter(portfolioBalance, "portfolioBalance");
        Intrinsics.checkNotNullParameter(performanceParameters, "performanceParameters");
        this.f186294a = totalValueChart;
        this.f186295b = portfolioBalance;
        this.f186296c = performanceParameters;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f186294a, cVar.f186294a) && Intrinsics.f(this.f186295b, cVar.f186295b) && Intrinsics.f(this.f186296c, cVar.f186296c);
    }

    public final int hashCode() {
        return this.f186296c.hashCode() + ((this.f186295b.hashCode() + (this.f186294a.hashCode() * 31)) * 31);
    }
}
