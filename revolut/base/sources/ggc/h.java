package ggc;

import com.revolut.feature.rewards.api.model.rewards.OutletAvailabilityInterval;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OutletAvailabilityInterval f143630a;

    public h(OutletAvailabilityInterval nextAvailableInterval) {
        Intrinsics.checkNotNullParameter(nextAvailableInterval, "nextAvailableInterval");
        this.f143630a = nextAvailableInterval;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f143630a, ((h) obj2).f143630a);
    }

    public final int hashCode() {
        return this.f143630a.hashCode();
    }
}
