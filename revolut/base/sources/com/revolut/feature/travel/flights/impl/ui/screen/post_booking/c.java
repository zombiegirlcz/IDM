package com.revolut.feature.travel.flights.impl.ui.screen.post_booking;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.q;
import com.revolut.core.ui_kit.views.t;
import com.revolut.feature.travel.flights.api.R$string;
import com.revolut.feature.travel.flights.impl.ui.screen.post_booking.TravelFlightsPostBookingScreenContract$Tab;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import t6g.d;
import t6g.h;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements n {
    @Override // cli.n
    public final o c(j jVar) {
        int i;
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = domainState.f268347a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (true) {
            boolean zHasNext = it8.hasNext();
            TravelFlightsPostBookingScreenContract$Tab.Overview overview = TravelFlightsPostBookingScreenContract$Tab.Overview.f93392a;
            if (!zHasNext) {
                String f70838b = domainState.f268348b;
                if (f70838b == null) {
                    f70838b = overview.getF70838b();
                }
                return new h(f70838b, arrayList, domainState.f268347a.size() > 1);
            }
            TravelFlightsPostBookingScreenContract$Tab travelFlightsPostBookingScreenContract$Tab = (TravelFlightsPostBookingScreenContract$Tab) it8.next();
            String f70838b2 = travelFlightsPostBookingScreenContract$Tab.getF70838b();
            if (travelFlightsPostBookingScreenContract$Tab.equals(overview)) {
                i = R$string.travel_flights_booking_details_tab_overview;
            } else if (travelFlightsPostBookingScreenContract$Tab.equals(TravelFlightsPostBookingScreenContract$Tab.CheckIn.f93390a)) {
                i = R$string.travel_flights_booking_details_tab_check_in;
            } else {
                if (!travelFlightsPostBookingScreenContract$Tab.equals(TravelFlightsPostBookingScreenContract$Tab.Manage.f93391a)) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$string.travel_flights_booking_details_tab_manage;
            }
            arrayList.add(new q(f70838b2, new t(new TextLocalisedClause(i, null, null, 14)), 50));
        }
    }
}
