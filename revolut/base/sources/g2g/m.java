package g2g;

import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceFiltersSelection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class m implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelExperienceFiltersSelection f140058a;

    public m(TravelExperienceFiltersSelection selectedFilters) {
        Intrinsics.checkNotNullParameter(selectedFilters, "selectedFilters");
        this.f140058a = selectedFilters;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f140058a, ((m) obj2).f140058a);
    }

    public final int hashCode() {
        return this.f140058a.hashCode();
    }
}
