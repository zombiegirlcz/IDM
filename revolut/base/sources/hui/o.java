package hui;

import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.manage_booking.AsftManageBookingPayload;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class o implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f155686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AsftManageBookingPayload f155687b;

    public o(int i, AsftManageBookingPayload manageBookingPayload) {
        Intrinsics.checkNotNullParameter(manageBookingPayload, "manageBookingPayload");
        this.f155686a = i;
        this.f155687b = manageBookingPayload;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.f155686a == oVar.f155686a && Intrinsics.f(this.f155687b, oVar.f155687b);
    }

    public final int hashCode() {
        return this.f155687b.hashCode() + (Integer.hashCode(this.f155686a) * 31);
    }
}
