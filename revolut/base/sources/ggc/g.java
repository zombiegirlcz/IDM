package ggc;

import com.revolut.feature.rewards.api.model.rewards.OutletAvailabilityInterval;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f143625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OutletAvailabilityInterval f143626b;

    public g(String nextAvailableDayCode, OutletAvailabilityInterval firstAvailableIntervalOnAnotherDay) {
        Intrinsics.checkNotNullParameter(nextAvailableDayCode, "nextAvailableDayCode");
        Intrinsics.checkNotNullParameter(firstAvailableIntervalOnAnotherDay, "firstAvailableIntervalOnAnotherDay");
        this.f143625a = nextAvailableDayCode;
        this.f143626b = firstAvailableIntervalOnAnotherDay;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f143625a, gVar.f143625a) && Intrinsics.f(this.f143626b, gVar.f143626b);
    }

    public final int hashCode() {
        return this.f143626b.hashCode() + (this.f143625a.hashCode() * 31);
    }
}
