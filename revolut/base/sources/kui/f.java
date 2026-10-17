package kui;

import aii.r;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.manage_booking.AsftManageBookingPayload;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AsftManageBookingPayload f189822a;

    public f(AsftManageBookingPayload payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.f189822a = payload;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f189822a, ((f) obj2).f189822a);
    }

    public final int hashCode() {
        return this.f189822a.hashCode();
    }
}
