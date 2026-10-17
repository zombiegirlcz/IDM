package qrb;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f248686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y49.h f248687b;

    public f(Set stockHoldings, y49.h unrealisedPositionsPerformance) {
        Intrinsics.checkNotNullParameter(stockHoldings, "stockHoldings");
        Intrinsics.checkNotNullParameter(unrealisedPositionsPerformance, "unrealisedPositionsPerformance");
        this.f248686a = stockHoldings;
        this.f248687b = unrealisedPositionsPerformance;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f248686a, fVar.f248686a) && Intrinsics.f(this.f248687b, fVar.f248687b);
    }

    public final int hashCode() {
        return this.f248687b.hashCode() + (this.f248686a.hashCode() * 31);
    }
}
