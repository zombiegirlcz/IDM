package ggc;

import com.revolut.feature.rewards.api.model.rewards.OutletAvailabilityInterval;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OutletAvailabilityInterval f143637a;

    public i(OutletAvailabilityInterval interval) {
        Intrinsics.checkNotNullParameter(interval, "interval");
        this.f143637a = interval;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f143637a, ((i) obj2).f143637a);
    }

    public final int hashCode() {
        return this.f143637a.hashCode();
    }
}
