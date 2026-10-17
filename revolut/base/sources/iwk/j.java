package iwk;

import afl.a0;
import com.revolut.retail.feature.stockdetails.impl.domain.internal.key_stats.models.StatsSection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StatsSection f169193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f169194b;

    public j(StatsSection section, a0 instrumentStats) {
        Intrinsics.checkNotNullParameter(section, "section");
        Intrinsics.checkNotNullParameter(instrumentStats, "instrumentStats");
        this.f169193a = section;
        this.f169194b = instrumentStats;
    }

    @Override // iwk.k
    public final StatsSection D() {
        return this.f169193a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f169193a, jVar.f169193a) && Intrinsics.f(this.f169194b, jVar.f169194b);
    }

    public final int hashCode() {
        return this.f169194b.hashCode() + (this.f169193a.hashCode() * 31);
    }
}
