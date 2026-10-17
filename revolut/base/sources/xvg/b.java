package xvg;

import com.revolut.feature.wealth.analytics.data.repositories.complex_analytics.model.TotalValueChartFacade;
import com.revolut.feature.wealth.analytics.data.repositories.complex_analytics.model.TotalValueChartPointFacade;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TotalValueChartFacade f309264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TotalValueChartFacade f309265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TotalValueChartPointFacade f309266c;

    public b(TotalValueChartFacade totalValueChartFacade, TotalValueChartFacade totalValueChartFacade2, TotalValueChartPointFacade totalValueChartPointFacade) {
        this.f309264a = totalValueChartFacade;
        this.f309265b = totalValueChartFacade2;
        this.f309266c = totalValueChartPointFacade;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f309264a, bVar.f309264a) && Intrinsics.f(this.f309265b, bVar.f309265b) && Intrinsics.f(this.f309266c, bVar.f309266c);
    }

    public final int hashCode() {
        TotalValueChartFacade totalValueChartFacade = this.f309264a;
        int iHashCode = (totalValueChartFacade == null ? 0 : totalValueChartFacade.hashCode()) * 31;
        TotalValueChartFacade totalValueChartFacade2 = this.f309265b;
        int iHashCode2 = (iHashCode + (totalValueChartFacade2 == null ? 0 : totalValueChartFacade2.hashCode())) * 31;
        TotalValueChartPointFacade totalValueChartPointFacade = this.f309266c;
        return iHashCode2 + (totalValueChartPointFacade != null ? totalValueChartPointFacade.hashCode() : 0);
    }
}
