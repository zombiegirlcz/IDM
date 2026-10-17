package x1g;

import com.revolut.feature.travel.experiences.impl.ui.screen.price_breakdown.TravelExperiencesPriceBreakdownScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class k implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelExperiencesPriceBreakdownScreenContract$InputData f302428a;

    public k(TravelExperiencesPriceBreakdownScreenContract$InputData breakdownInput) {
        Intrinsics.checkNotNullParameter(breakdownInput, "breakdownInput");
        this.f302428a = breakdownInput;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f302428a, ((k) obj2).f302428a);
    }

    public final int hashCode() {
        return this.f302428a.hashCode();
    }
}
