package s2g;

import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class k implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelExperienceDatesSelection f259314a;

    public k(TravelExperienceDatesSelection datesFilter) {
        Intrinsics.checkNotNullParameter(datesFilter, "datesFilter");
        this.f259314a = datesFilter;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f259314a, ((k) obj2).f259314a);
    }

    public final int hashCode() {
        return this.f259314a.hashCode();
    }
}
