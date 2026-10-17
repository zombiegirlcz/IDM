package hbg;

import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.price_breakdown.TravelHotelsPriceBreakdownScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class p extends com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelHotelsPriceBreakdownScreenContract$InputData f150713a;

    public p(TravelHotelsPriceBreakdownScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f150713a = inputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f150713a, ((p) obj2).f150713a);
    }

    public final int hashCode() {
        return this.f150713a.hashCode();
    }
}
