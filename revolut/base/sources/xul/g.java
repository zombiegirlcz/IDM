package xul;

import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChargeBreakdown f309117a;

    public g(ChargeBreakdown potentialFees) {
        Intrinsics.checkNotNullParameter(potentialFees, "potentialFees");
        this.f309117a = potentialFees;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f309117a, ((g) obj2).f309117a);
    }

    public final int hashCode() {
        return this.f309117a.hashCode();
    }
}
