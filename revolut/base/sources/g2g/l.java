package g2g;

import com.revolut.data.model.Data;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceFiltersSelection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class l implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f140056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TravelExperienceFiltersSelection f140057b;

    public l(Data availableFilters, TravelExperienceFiltersSelection selectedFilters) {
        Intrinsics.checkNotNullParameter(availableFilters, "availableFilters");
        Intrinsics.checkNotNullParameter(selectedFilters, "selectedFilters");
        this.f140056a = availableFilters;
        this.f140057b = selectedFilters;
    }

    public static l a(l lVar, Data availableFilters, TravelExperienceFiltersSelection selectedFilters, int i) {
        if ((i & 1) != 0) {
            availableFilters = lVar.f140056a;
        }
        if ((i & 2) != 0) {
            selectedFilters = lVar.f140057b;
        }
        lVar.getClass();
        Intrinsics.checkNotNullParameter(availableFilters, "availableFilters");
        Intrinsics.checkNotNullParameter(selectedFilters, "selectedFilters");
        return new l(availableFilters, selectedFilters);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f140056a, lVar.f140056a) && Intrinsics.f(this.f140057b, lVar.f140057b);
    }

    public final int hashCode() {
        return this.f140057b.hashCode() + (this.f140056a.hashCode() * 31);
    }
}
