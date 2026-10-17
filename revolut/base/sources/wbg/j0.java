package wbg;

import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.price_breakdown.TravelHotelsPriceBreakdownScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class j0 extends m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelHotelsPriceBreakdownScreenContract$InputData f296182a;

    public j0(TravelHotelsPriceBreakdownScreenContract$InputData inputPriceBreakdown) {
        Intrinsics.checkNotNullParameter(inputPriceBreakdown, "inputPriceBreakdown");
        this.f296182a = inputPriceBreakdown;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j0) && Intrinsics.f(this.f296182a, ((j0) obj2).f296182a);
    }

    public final int hashCode() {
        return this.f296182a.hashCode();
    }
}
