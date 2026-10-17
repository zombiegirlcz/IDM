package yeg;

import aii.r;
import com.revolut.feature_travel_hotels_models.search.TravelHotelsSortingOption;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelHotelsSortingOption f312927a;

    public c(TravelHotelsSortingOption selectedSortingOption) {
        Intrinsics.checkNotNullParameter(selectedSortingOption, "selectedSortingOption");
        this.f312927a = selectedSortingOption;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f312927a, ((c) obj2).f312927a);
    }

    public final int hashCode() {
        return this.f312927a.hashCode();
    }
}
