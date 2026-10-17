package wbg;

import com.revolut.feature_travel_hotels_models.booking.request.HotelsPropertyBookingRequestStatus;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h0 extends m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HotelsPropertyBookingRequestStatus f296177a;

    public h0(HotelsPropertyBookingRequestStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f296177a = status;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h0) && Intrinsics.f(this.f296177a, ((h0) obj2).f296177a);
    }

    public final int hashCode() {
        return this.f296177a.hashCode();
    }
}
