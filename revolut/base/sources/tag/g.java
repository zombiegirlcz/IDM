package tag;

import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.price_breakdown.TravelHotelsPriceBreakdownScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelHotelsPriceBreakdownScreenContract$InputData f269331a;

    public g(TravelHotelsPriceBreakdownScreenContract$InputData inputPriceBreakdown) {
        Intrinsics.checkNotNullParameter(inputPriceBreakdown, "inputPriceBreakdown");
        this.f269331a = inputPriceBreakdown;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f269331a, ((g) obj2).f269331a);
    }

    public final int hashCode() {
        return this.f269331a.hashCode();
    }
}
