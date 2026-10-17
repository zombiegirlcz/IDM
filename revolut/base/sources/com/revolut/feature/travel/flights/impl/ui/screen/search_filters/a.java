package com.revolut.feature.travel.flights.impl.ui.screen.search_filters;

import cli.g;
import cli.y;
import oki.h;
import y6g.m;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends h implements m {
    public final com.revolut.kompot.navigable.vc.modal.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f93403p;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(cli.n r14, com.revolut.feature.travel.flights.impl.ui.screen.search_filters.TravelFlightsSearchFiltersScreenContract$InputData r15) {
        /*
            r13 = this;
            java.lang.String r2 = "stateMapper"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r2)
            java.lang.String r2 = "inputData"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r2)
            r13.<init>()
            xwd.a r2 = new xwd.a
            r4 = 25
            r2.<init>(r13, r4)
            com.revolut.kompot.navigable.vc.modal.a r2 = hx7.e.a(r13, r2)
            r13.o = r2
            com.revolut.feature.travel.flights.models.domain.search.FlightSearchRequestFilters r2 = r15.f93399b
            com.revolut.feature.travel.flights.models.domain.search.FlightSearchFilterOptions r4 = r15.f93398a
            r5 = 0
            if (r2 == 0) goto L55
            dj0.d r6 = r2.f93584b
            if (r6 == 0) goto L55
            xi0.b r7 = r6.f115083b
            com.revolut.feature.travel.flights.models.domain.search.FlightSearchFilterPriceRange r8 = r4.f93573b
            dj0.d r8 = r8.f93576b
            xi0.b r8 = r8.f115083b
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r7, r8)
            if (r7 == 0) goto L50
            com.revolut.feature.travel.flights.models.domain.search.FlightSearchFilterPriceRange r7 = r4.f93573b
            dj0.d r8 = r7.f93575a
            dj0.d r7 = r7.f93576b
            java.lang.String r9 = "min"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r9)
            java.lang.String r9 = "max"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r9)
            boolean r8 = r6.e(r8)
            if (r8 == 0) goto L50
            boolean r7 = r6.h(r7)
            if (r7 == 0) goto L50
            goto L51
        L50:
            r6 = r5
        L51:
            if (r6 == 0) goto L55
        L53:
            r10 = r6
            goto L5a
        L55:
            com.revolut.feature.travel.flights.models.domain.search.FlightSearchFilterPriceRange r6 = r4.f93573b
            dj0.d r6 = r6.f93576b
            goto L53
        L5a:
            if (r2 == 0) goto L78
            java.lang.Integer r6 = r2.f93585c
            if (r6 == 0) goto L78
            int r7 = r6.intValue()
            com.revolut.feature.travel.flights.models.domain.search.FlightSearchFilterDurationRange r8 = r4.f93574c
            int r9 = r8.f93570a
            int r8 = r8.f93571b
            if (r7 > r8) goto L6f
            if (r9 > r7) goto L6f
            goto L70
        L6f:
            r6 = r5
        L70:
            if (r6 == 0) goto L78
            int r6 = r6.intValue()
        L76:
            r11 = r6
            goto L7d
        L78:
            com.revolut.feature.travel.flights.models.domain.search.FlightSearchFilterDurationRange r6 = r4.f93574c
            int r6 = r6.f93571b
            goto L76
        L7d:
            if (r2 == 0) goto L95
            r7g.i r6 = r2.f93583a
            if (r6 == 0) goto L95
            r7g.i r7 = r7g.i.UNKNOWN
            if (r6 == r7) goto L90
            java.util.ArrayList r4 = r4.f93572a
            boolean r4 = r4.contains(r6)
            if (r4 == 0) goto L90
            goto L91
        L90:
            r6 = r5
        L91:
            if (r6 == 0) goto L95
        L93:
            r9 = r6
            goto L98
        L95:
            r7g.i r6 = r7g.i.ANY
            goto L93
        L98:
            y6g.k r7 = new y6g.k
            com.revolut.feature.travel.flights.models.domain.search.FlightSearchFilterOptions r8 = r15.f93398a
            if (r2 == 0) goto La0
            java.util.List r5 = r2.d
        La0:
            r12 = r5
            r7.<init>(r8, r9, r10, r11, r12)
            r1 = r7
            r4 = 0
            r5 = 12
            r3 = 0
            r0 = r13
            r2 = r14
            cli.y r1 = mra.d.b(r0, r1, r2, r3, r4, r5)
            r13.f93403p = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.travel.flights.impl.ui.screen.search_filters.a.<init>(cli.n, com.revolut.feature.travel.flights.impl.ui.screen.search_filters.TravelFlightsSearchFiltersScreenContract$InputData):void");
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.o;
    }

    @Override // cli.z
    public final g getState() {
        return this.f93403p;
    }
}
