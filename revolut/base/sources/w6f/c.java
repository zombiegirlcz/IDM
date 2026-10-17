package w6f;

import cli.j;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.models.ManagedPortfolioUnrealisedReturnBreakdown;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ManagedPortfolioUnrealisedReturnBreakdown f295434a;

    public c(ManagedPortfolioUnrealisedReturnBreakdown breakdown) {
        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
        this.f295434a = breakdown;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f295434a, ((c) obj2).f295434a);
    }

    public final int hashCode() {
        return this.f295434a.hashCode();
    }
}
