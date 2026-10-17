package kfg;

import com.revolut.feature.travel.miles.api.model.TravelMilesMoneyRangeFilter;
import com.revolut.feature.travel.miles.api.model.TravelMilesNumberRangeFilter;
import com.revolut.feature.travel.miles.api.model.TravelMilesSearchAirlineIcon;
import com.revolut.feature.travel.miles.api.model.TravelMilesSearchAppliedFilters;
import com.revolut.feature.travel.miles.api.model.TravelMilesSearchLocation;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import xfg.d0;
import xfg.r;
import xfg.s;

/* JADX INFO: loaded from: classes9.dex */
public abstract class d {
    public static final TravelMilesSearchAirlineIcon a(String str, String str2) {
        if (str != null) {
            return new TravelMilesSearchAirlineIcon.Local(str);
        }
        if (str2 != null) {
            return new TravelMilesSearchAirlineIcon.Remote(str2);
        }
        return null;
    }

    public static final d0.a b(TravelMilesSearchAppliedFilters travelMilesSearchAppliedFilters) {
        s sVar;
        Intrinsics.checkNotNullParameter(travelMilesSearchAppliedFilters, "<this>");
        Set set = travelMilesSearchAppliedFilters.f94125a;
        Set set2 = travelMilesSearchAppliedFilters.f94126b;
        TravelMilesNumberRangeFilter travelMilesNumberRangeFilter = travelMilesSearchAppliedFilters.f94127c;
        r rVar = null;
        if (travelMilesNumberRangeFilter != null) {
            Intrinsics.checkNotNullParameter(travelMilesNumberRangeFilter, "<this>");
            sVar = new s(travelMilesNumberRangeFilter.f94101a, travelMilesNumberRangeFilter.f94102b);
        } else {
            sVar = null;
        }
        TravelMilesMoneyRangeFilter travelMilesMoneyRangeFilter = travelMilesSearchAppliedFilters.d;
        if (travelMilesMoneyRangeFilter != null) {
            Intrinsics.checkNotNullParameter(travelMilesMoneyRangeFilter, "<this>");
            rVar = new r(mo3.a.p(travelMilesMoneyRangeFilter.f94099a), mo3.a.p(travelMilesMoneyRangeFilter.f94100b));
        }
        return new d0.a(set, set2, sVar, rVar, travelMilesSearchAppliedFilters.e, travelMilesSearchAppliedFilters.f);
    }

    public static final d0.b c(TravelMilesSearchLocation travelMilesSearchLocation) {
        Intrinsics.checkNotNullParameter(travelMilesSearchLocation, "<this>");
        if (travelMilesSearchLocation instanceof TravelMilesSearchLocation.City) {
            TravelMilesSearchLocation.City city = (TravelMilesSearchLocation.City) travelMilesSearchLocation;
            return new d0.b.C1696b(city.f94143a, city.f94144b);
        }
        if (travelMilesSearchLocation instanceof TravelMilesSearchLocation.Airport) {
            return new d0.b.a(((TravelMilesSearchLocation.Airport) travelMilesSearchLocation).f94142b);
        }
        throw new NoWhenBranchMatchedException();
    }
}
