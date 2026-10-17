package tag;

import com.revolut.feature.travel.hotels.impl.declaration.kompot.TravelHotelsBookingDetailsParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelHotelsBookingDetailsParams f269328a;

    public d(TravelHotelsBookingDetailsParams paramsBookingDetails) {
        Intrinsics.checkNotNullParameter(paramsBookingDetails, "paramsBookingDetails");
        this.f269328a = paramsBookingDetails;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f269328a, ((d) obj2).f269328a);
    }

    public final int hashCode() {
        return this.f269328a.hashCode();
    }
}
