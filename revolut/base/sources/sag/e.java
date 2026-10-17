package sag;

import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.price_breakdown.TravelHotelsPriceBreakdownScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelHotelsPriceBreakdownScreenContract$InputData f261400a;

    public e(TravelHotelsPriceBreakdownScreenContract$InputData priceBreakdownInput) {
        Intrinsics.checkNotNullParameter(priceBreakdownInput, "priceBreakdownInput");
        this.f261400a = priceBreakdownInput;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f261400a, ((e) obj2).f261400a);
    }

    public final int hashCode() {
        return this.f261400a.hashCode();
    }
}
