package i0g;

import com.revolut.feature.travel.experiences.api.models.search.LocationId;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes9.dex */
public final class e {
    private e() {
    }

    public static String a(a parameters) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        String strB = LocationId.DestinationId.b(parameters.f157396a);
        xi0.b bVar = parameters.f157397b;
        Pair pairB = b(parameters.f157398c);
        return "CACHE_KEY_DESTINATION_DISCOVERY_" + strB + bVar + ("(" + ((DateTime) pairB.f186385a) + ";" + ((DateTime) pairB.f186386b) + ")");
    }

    public static Pair b(TravelExperienceDatesSelection travelExperienceDatesSelection) {
        if (travelExperienceDatesSelection instanceof TravelExperienceDatesSelection.SingleDateSelection) {
            return new Pair(((TravelExperienceDatesSelection.SingleDateSelection) travelExperienceDatesSelection).f92909a, null);
        }
        if (travelExperienceDatesSelection instanceof TravelExperienceDatesSelection.RangeDateSelection) {
            TravelExperienceDatesSelection.RangeDateSelection rangeDateSelection = (TravelExperienceDatesSelection.RangeDateSelection) travelExperienceDatesSelection;
            return new Pair(rangeDateSelection.f92907a, rangeDateSelection.f92908b);
        }
        if (travelExperienceDatesSelection instanceof TravelExperienceDatesSelection.NoDatesSelection) {
            return new Pair(null, null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
