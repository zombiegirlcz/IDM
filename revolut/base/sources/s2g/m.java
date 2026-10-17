package s2g;

import com.revolut.feature.travel.experiences.impl.ui.screen.price_breakdown.TravelExperiencesPriceBreakdownScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class m implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelExperiencesPriceBreakdownScreenContract$InputData f259318a;

    public m(TravelExperiencesPriceBreakdownScreenContract$InputData breakdownInput) {
        Intrinsics.checkNotNullParameter(breakdownInput, "breakdownInput");
        this.f259318a = breakdownInput;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f259318a, ((m) obj2).f259318a);
    }

    public final int hashCode() {
        return this.f259318a.hashCode();
    }
}
