package iwk;

import com.revolut.retail.feature.stockdetails.impl.domain.internal.key_stats.models.StatsSection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class h implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StatsSection f169189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final afl.f f169190b;

    public h(StatsSection section, afl.f bondStats) {
        Intrinsics.checkNotNullParameter(section, "section");
        Intrinsics.checkNotNullParameter(bondStats, "bondStats");
        this.f169189a = section;
        this.f169190b = bondStats;
    }

    @Override // iwk.k
    public final StatsSection D() {
        return this.f169189a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f169189a, hVar.f169189a) && Intrinsics.f(this.f169190b, hVar.f169190b);
    }

    public final int hashCode() {
        return this.f169190b.hashCode() + (this.f169189a.hashCode() * 31);
    }
}
