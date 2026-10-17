package bbg;

import com.revolut.feature_travel_hotels_models.booking.amendment.TravelHotelsBookingAmendmentStatus;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class k implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelHotelsBookingAmendmentStatus f14288a;

    public k(TravelHotelsBookingAmendmentStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f14288a = status;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f14288a, ((k) obj2).f14288a);
    }

    public final int hashCode() {
        return this.f14288a.hashCode();
    }
}
