package mid;

import com.revolut.feature.rev_points.models.EarningBadge;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f205702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EarningBadge f205703b;

    public g(String type, EarningBadge earningBadge) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f205702a = type;
        this.f205703b = earningBadge;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f205702a, gVar.f205702a) && Intrinsics.f(this.f205703b, gVar.f205703b);
    }

    public final int hashCode() {
        int iHashCode = this.f205702a.hashCode() * 31;
        EarningBadge earningBadge = this.f205703b;
        return iHashCode + (earningBadge == null ? 0 : earningBadge.hashCode());
    }
}
