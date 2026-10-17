package m3g;

import com.revolut.data.model.Data;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceFiltersSelection;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class n implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f202542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TravelExperienceDatesSelection f202543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f202544c;
    public final Map d;
    public final lk0.g e;
    public final s f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TravelExperienceFiltersSelection f202545g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Data f202546h;
    public final Data i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f202547j;

    public n(m destinationSource, TravelExperienceDatesSelection datesSelection, xi0.b bVar, Map experienceSummaryPagesMap, lk0.g gVar, s widgetState, TravelExperienceFiltersSelection selectedFilters, Data loyaltyInformation, Data topCategories, boolean z) {
        Intrinsics.checkNotNullParameter(destinationSource, "destinationSource");
        Intrinsics.checkNotNullParameter(datesSelection, "datesSelection");
        Intrinsics.checkNotNullParameter(experienceSummaryPagesMap, "experienceSummaryPagesMap");
        Intrinsics.checkNotNullParameter(widgetState, "widgetState");
        Intrinsics.checkNotNullParameter(selectedFilters, "selectedFilters");
        Intrinsics.checkNotNullParameter(loyaltyInformation, "loyaltyInformation");
        Intrinsics.checkNotNullParameter(topCategories, "topCategories");
        this.f202542a = destinationSource;
        this.f202543b = datesSelection;
        this.f202544c = bVar;
        this.d = experienceSummaryPagesMap;
        this.e = gVar;
        this.f = widgetState;
        this.f202545g = selectedFilters;
        this.f202546h = loyaltyInformation;
        this.i = topCategories;
        this.f202547j = z;
    }

    public static n a(n nVar, m mVar, TravelExperienceDatesSelection travelExperienceDatesSelection, xi0.b bVar, Map map, lk0.g gVar, s sVar, TravelExperienceFiltersSelection travelExperienceFiltersSelection, Data data, Data data2, boolean z, int i) {
        if ((i & 1) != 0) {
            mVar = nVar.f202542a;
        }
        m destinationSource = mVar;
        if ((i & 2) != 0) {
            travelExperienceDatesSelection = nVar.f202543b;
        }
        TravelExperienceDatesSelection datesSelection = travelExperienceDatesSelection;
        if ((i & 4) != 0) {
            bVar = nVar.f202544c;
        }
        xi0.b bVar2 = bVar;
        if ((i & 8) != 0) {
            map = nVar.d;
        }
        Map experienceSummaryPagesMap = map;
        lk0.g gVar2 = (i & 16) != 0 ? nVar.e : gVar;
        s widgetState = (i & 32) != 0 ? nVar.f : sVar;
        TravelExperienceFiltersSelection selectedFilters = (i & 64) != 0 ? nVar.f202545g : travelExperienceFiltersSelection;
        Data loyaltyInformation = (i & 128) != 0 ? nVar.f202546h : data;
        Data topCategories = (i & 256) != 0 ? nVar.i : data2;
        boolean z3 = (i & 512) != 0 ? nVar.f202547j : z;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(destinationSource, "destinationSource");
        Intrinsics.checkNotNullParameter(datesSelection, "datesSelection");
        Intrinsics.checkNotNullParameter(experienceSummaryPagesMap, "experienceSummaryPagesMap");
        Intrinsics.checkNotNullParameter(widgetState, "widgetState");
        Intrinsics.checkNotNullParameter(selectedFilters, "selectedFilters");
        Intrinsics.checkNotNullParameter(loyaltyInformation, "loyaltyInformation");
        Intrinsics.checkNotNullParameter(topCategories, "topCategories");
        return new n(destinationSource, datesSelection, bVar2, experienceSummaryPagesMap, gVar2, widgetState, selectedFilters, loyaltyInformation, topCategories, z3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f202542a, nVar.f202542a) && Intrinsics.f(this.f202543b, nVar.f202543b) && Intrinsics.f(this.f202544c, nVar.f202544c) && Intrinsics.f(this.d, nVar.d) && Intrinsics.f(this.e, nVar.e) && this.f == nVar.f && Intrinsics.f(this.f202545g, nVar.f202545g) && Intrinsics.f(this.f202546h, nVar.f202546h) && Intrinsics.f(this.i, nVar.i) && this.f202547j == nVar.f202547j;
    }

    public final int hashCode() {
        int iHashCode = (this.f202543b.hashCode() + (this.f202542a.hashCode() * 31)) * 31;
        xi0.b bVar = this.f202544c;
        int iE = p.a.e((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.d);
        lk0.g gVar = this.e;
        return Boolean.hashCode(this.f202547j) + kii.e.c(this.i, kii.e.c(this.f202546h, (this.f202545g.hashCode() + ((this.f.hashCode() + ((iE + (gVar != null ? gVar.f196174a.hashCode() : 0)) * 31)) * 31)) * 31, 31), 31);
    }
}
