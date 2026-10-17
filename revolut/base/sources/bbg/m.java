package bbg;

import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.price_breakdown.TravelHotelsPriceBreakdownScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class m implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelHotelsPriceBreakdownScreenContract$InputData f14291a;

    public m(TravelHotelsPriceBreakdownScreenContract$InputData priceBreakdownInput) {
        Intrinsics.checkNotNullParameter(priceBreakdownInput, "priceBreakdownInput");
        this.f14291a = priceBreakdownInput;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f14291a, ((m) obj2).f14291a);
    }

    public final int hashCode() {
        return this.f14291a.hashCode();
    }
}
