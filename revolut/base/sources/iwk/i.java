package iwk;

import afl.q;
import com.revolut.retail.feature.stockdetails.impl.domain.internal.key_stats.models.StatsSection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StatsSection f169191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f169192b;

    public i(StatsSection section, q etfStats) {
        Intrinsics.checkNotNullParameter(section, "section");
        Intrinsics.checkNotNullParameter(etfStats, "etfStats");
        this.f169191a = section;
        this.f169192b = etfStats;
    }

    @Override // iwk.k
    public final StatsSection D() {
        return this.f169191a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f169191a, iVar.f169191a) && Intrinsics.f(this.f169192b, iVar.f169192b);
    }

    public final int hashCode() {
        return this.f169192b.hashCode() + (this.f169191a.hashCode() * 31);
    }
}
