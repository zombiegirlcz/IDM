package uhl;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import od0.i;

/* JADX INFO: loaded from: classes12.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f280273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f280274b;

    public d(i startPoint, Set portfolioIdsToMarkAsRefetched) {
        Intrinsics.checkNotNullParameter(startPoint, "startPoint");
        Intrinsics.checkNotNullParameter(portfolioIdsToMarkAsRefetched, "portfolioIdsToMarkAsRefetched");
        this.f280273a = startPoint;
        this.f280274b = portfolioIdsToMarkAsRefetched;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f280273a, dVar.f280273a) && Intrinsics.f(this.f280274b, dVar.f280274b);
    }

    public final int hashCode() {
        return this.f280274b.hashCode() + (this.f280273a.hashCode() * 31);
    }
}
