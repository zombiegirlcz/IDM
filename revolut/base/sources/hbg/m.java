package hbg;

import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.cancellation_policy.TravelHotelsCancellationPolicyScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class m extends com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelHotelsCancellationPolicyScreenContract$InputData f150709a;

    public m(TravelHotelsCancellationPolicyScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f150709a = inputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f150709a, ((m) obj2).f150709a);
    }

    public final int hashCode() {
        return this.f150709a.f93869a.hashCode();
    }
}
