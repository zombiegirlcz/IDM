package dlc;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f115722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f115723b;

    public b(Map portfolioBalances, List performanceParameters) {
        Intrinsics.checkNotNullParameter(portfolioBalances, "portfolioBalances");
        Intrinsics.checkNotNullParameter(performanceParameters, "performanceParameters");
        this.f115722a = portfolioBalances;
        this.f115723b = performanceParameters;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f115722a, bVar.f115722a) && Intrinsics.f(this.f115723b, bVar.f115723b);
    }

    public final int hashCode() {
        return this.f115723b.hashCode() + (this.f115722a.hashCode() * 31);
    }
}
