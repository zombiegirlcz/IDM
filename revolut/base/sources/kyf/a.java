package kyf;

import com.revolut.feature.travel.experiences.api.models.config.TravelExperiencesSelectedLocation;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelExperiencesSelectedLocation f190890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TravelExperienceDatesSelection f190891b;

    public a(TravelExperiencesSelectedLocation travelExperiencesSelectedLocation, TravelExperienceDatesSelection selectedDates) {
        Intrinsics.checkNotNullParameter(selectedDates, "selectedDates");
        this.f190890a = travelExperiencesSelectedLocation;
        this.f190891b = selectedDates;
    }

    public static a a(a aVar, TravelExperiencesSelectedLocation travelExperiencesSelectedLocation, TravelExperienceDatesSelection selectedDates, int i) {
        if ((i & 1) != 0) {
            travelExperiencesSelectedLocation = aVar.f190890a;
        }
        if ((i & 2) != 0) {
            selectedDates = aVar.f190891b;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(selectedDates, "selectedDates");
        return new a(travelExperiencesSelectedLocation, selectedDates);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f190890a, aVar.f190890a) && Intrinsics.f(this.f190891b, aVar.f190891b);
    }

    public final int hashCode() {
        TravelExperiencesSelectedLocation travelExperiencesSelectedLocation = this.f190890a;
        return this.f190891b.hashCode() + ((travelExperiencesSelectedLocation == null ? 0 : travelExperiencesSelectedLocation.hashCode()) * 31);
    }

    public a() {
        this(null, TravelExperienceDatesSelection.NoDatesSelection.f92906a);
    }
}
