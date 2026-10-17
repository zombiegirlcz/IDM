package g4g;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.TimeRangeClause;
import com.revolut.core.ui_kit.models.q0;
import com.revolut.feature.travel.flights.api.R$string;
import java.time.LocalDate;
import java.time.ZoneId;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import l7g.s;

/* JADX INFO: loaded from: classes9.dex */
public abstract class c {
    public static final TextLocalisedClause a(s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        int i = b.f140522a[sVar.ordinal()];
        if (i == 1) {
            return new TextLocalisedClause(R$string.travel_flights_itinerary_details_header_round_trip, null, null, 14);
        }
        if (i == 2) {
            return new TextLocalisedClause(R$string.travel_flights_itinerary_details_header_one_way, null, null, 14);
        }
        if (i == 3) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Clause b(LocalDate departureDate, LocalDate localDate) {
        Intrinsics.checkNotNullParameter(departureDate, "departureDate");
        return localDate != null ? new TimeRangeClause(oc.c.F(departureDate), oc.c.F(localDate), ZoneId.systemDefault(), null, 8) : new TimeClause(oc.c.F(departureDate), new TimeClause.Format.Pretty(q0.ONLY_DATE), null, ZoneId.systemDefault(), 4);
    }
}
