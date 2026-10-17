package com.revolut.feature.travel.flights.impl.ui.screen.dates_selection;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.TimeRangeClause;
import com.revolut.core.ui_kit.models.q0;
import com.revolut.feature.travel.flights.api.R$string;
import com.revolut.feature.travel.flights.impl.ui.screen.dates_selection.TravelFlightsDatesSelectionScreenContract$Trip;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oc.c;
import t5g.d;
import t5g.g;
import vim.e;
import vim.i;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements n {
    @Override // cli.n
    public final o c(j jVar) {
        e eVar;
        CompositeClause compositeClause;
        e eVarB;
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        e eVar2 = domainState.f268105a;
        e eVarB2 = i.b(tz4.d.u((LocalDate) eVar2.f289621a), tz4.d.u((LocalDate) eVar2.f289622b));
        TravelFlightsDatesSelectionScreenContract$Trip travelFlightsDatesSelectionScreenContract$Trip = domainState.f268106b;
        if (travelFlightsDatesSelectionScreenContract$Trip != null) {
            if (travelFlightsDatesSelectionScreenContract$Trip instanceof TravelFlightsDatesSelectionScreenContract$Trip.OneWayTrip) {
                LocalDate localDate = ((TravelFlightsDatesSelectionScreenContract$Trip.OneWayTrip) travelFlightsDatesSelectionScreenContract$Trip).f93322a;
                eVarB = i.b(tz4.d.u(localDate), tz4.d.u(localDate));
            } else {
                if (!(travelFlightsDatesSelectionScreenContract$Trip instanceof TravelFlightsDatesSelectionScreenContract$Trip.RoundTrip)) {
                    throw new NoWhenBranchMatchedException();
                }
                TravelFlightsDatesSelectionScreenContract$Trip.RoundTrip roundTrip = (TravelFlightsDatesSelectionScreenContract$Trip.RoundTrip) travelFlightsDatesSelectionScreenContract$Trip;
                eVarB = i.b(tz4.d.u(roundTrip.f93323a), tz4.d.u(roundTrip.f93324b));
            }
            eVar = eVarB;
        } else {
            eVar = null;
        }
        Date dateU = tz4.d.u(domainState.f268107c);
        Date dateU2 = tz4.d.u(domainState.d);
        Date dateU3 = tz4.d.u(domainState.e);
        boolean z = travelFlightsDatesSelectionScreenContract$Trip != null;
        if (travelFlightsDatesSelectionScreenContract$Trip == null) {
            compositeClause = null;
        } else if (travelFlightsDatesSelectionScreenContract$Trip instanceof TravelFlightsDatesSelectionScreenContract$Trip.OneWayTrip) {
            compositeClause = new CompositeClause(v.k(new TextLocalisedClause(R$string.travel_flights_flight_dates_selection_subtitle_prefix_one_way, null, null, 14), new TimeClause(c.F(((TravelFlightsDatesSelectionScreenContract$Trip.OneWayTrip) travelFlightsDatesSelectionScreenContract$Trip).f93322a), new TimeClause.Format.Pretty(q0.ONLY_DATE), null, ZoneId.systemDefault(), 4)), new DotDividerClause((Integer) null), null, null, 12);
        } else {
            if (!(travelFlightsDatesSelectionScreenContract$Trip instanceof TravelFlightsDatesSelectionScreenContract$Trip.RoundTrip)) {
                throw new NoWhenBranchMatchedException();
            }
            TravelFlightsDatesSelectionScreenContract$Trip.RoundTrip roundTrip2 = (TravelFlightsDatesSelectionScreenContract$Trip.RoundTrip) travelFlightsDatesSelectionScreenContract$Trip;
            compositeClause = new CompositeClause(v.k(new TextLocalisedClause(R$string.travel_flights_flight_dates_selection_subtitle_prefix_round_trip, null, null, 14), new TimeRangeClause(c.F(roundTrip2.f93323a), c.F(roundTrip2.f93324b), ZoneId.systemDefault(), null, 8)), new DotDividerClause((Integer) null), null, null, 12);
        }
        return new g(eVarB2, eVar, dateU, dateU2, dateU3, z, compositeClause, travelFlightsDatesSelectionScreenContract$Trip instanceof TravelFlightsDatesSelectionScreenContract$Trip.RoundTrip ? new TextLocalisedClause(R$string.travel_flights_flight_dates_selection_cta_confirm_round_trip, null, null, 14) : new TextLocalisedClause(R$string.travel_flights_flight_dates_selection_cta_confirm_one_way, null, null, 14));
    }
}
