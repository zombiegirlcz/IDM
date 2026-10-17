package a1g;

import com.revolut.feature.travel.experiences.api.models.search.recent.TravelRecentSearchLocation;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes9.dex */
public abstract class g {
    public static final TravelExperienceDatesSelection a(TravelRecentSearchLocation travelRecentSearchLocation) {
        Intrinsics.checkNotNullParameter(travelRecentSearchLocation, "<this>");
        Long l2 = travelRecentSearchLocation.d;
        Long l3 = travelRecentSearchLocation.d;
        Long l4 = travelRecentSearchLocation.e;
        return (l2 == null || l4 == null || !Intrinsics.f(l2, l4)) ? (l3 == null || l4 == null) ? TravelExperienceDatesSelection.NoDatesSelection.f92906a : new TravelExperienceDatesSelection.RangeDateSelection(new DateTime(l3), new DateTime(l4)) : new TravelExperienceDatesSelection.SingleDateSelection(new DateTime(l3));
    }
}
