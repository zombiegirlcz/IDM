package mid;

import com.revolut.feature.shops.api.model.ShopsOutletAvailabilityInterval;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ShopsOutletAvailabilityInterval f205690a;

    public d(ShopsOutletAvailabilityInterval nextAvailableInterval) {
        Intrinsics.checkNotNullParameter(nextAvailableInterval, "nextAvailableInterval");
        this.f205690a = nextAvailableInterval;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f205690a, ((d) obj2).f205690a);
    }

    public final int hashCode() {
        return this.f205690a.hashCode();
    }
}
