package zag;

import com.revolut.feature_travel_hotels_models.booking.amendment.TravelHotelsBookingAmendmentStatus;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelHotelsBookingAmendmentStatus f320690a;

    public e(TravelHotelsBookingAmendmentStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f320690a = status;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f320690a, ((e) obj2).f320690a);
    }

    public final int hashCode() {
        return this.f320690a.hashCode();
    }
}
