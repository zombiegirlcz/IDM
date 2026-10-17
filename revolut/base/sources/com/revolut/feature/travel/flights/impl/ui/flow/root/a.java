package com.revolut.feature.travel.flights.impl.ui.flow.root;

import com.revolut.feature.travel.flights.impl.ui.flow.root.TravelFlightsFlowContract$InputData;
import com.revolut.feature.travel.flights.impl.ui.flow.root.TravelFlightsFlowContract$Step;
import com.revolut.feature.travel.flights.models.domain.extra_products.TravelFlightsExtraProduct;
import com.revolut.feature.travel.flights.models.domain.extra_products.TravelFlightsExtraProductOption;
import com.revolut.feature.travel.flights.models.domain.itinerary.TravelFlightsFare;
import com.revolut.kompot.navigable.flow.FlowStep;
import cp5.d;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mz3.r;
import n4g.b;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends h implements b {
    public String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f93236p;

    public a(TravelFlightsFlowContract$InputData inputData) {
        FlowStep postBooking;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        if (Intrinsics.f(inputData, TravelFlightsFlowContract$InputData.Home.f93215a)) {
            postBooking = new TravelFlightsFlowContract$Step.Home(0);
        } else {
            if (!(inputData instanceof TravelFlightsFlowContract$InputData.BookingDetails)) {
                throw new NoWhenBranchMatchedException();
            }
            TravelFlightsFlowContract$InputData.BookingDetails bookingDetails = (TravelFlightsFlowContract$InputData.BookingDetails) inputData;
            postBooking = new TravelFlightsFlowContract$Step.PostBooking(bookingDetails.f93213a, bookingDetails.f93214b);
        }
        this.f93236p = d.a(this, postBooking, f0.f322471a, new r(this, 16));
    }

    public static boolean I2(TravelFlightsFare travelFlightsFare) {
        ArrayList<TravelFlightsExtraProduct> arrayList = travelFlightsFare.e;
        if (arrayList.isEmpty()) {
            return false;
        }
        for (TravelFlightsExtraProduct travelFlightsExtraProduct : arrayList) {
            if (travelFlightsExtraProduct.f93503a == o7g.b.BAGGAGE) {
                ArrayList arrayList2 = travelFlightsExtraProduct.e;
                if (arrayList2.isEmpty()) {
                    continue;
                } else {
                    Iterator it8 = arrayList2.iterator();
                    while (it8.hasNext()) {
                        if (((TravelFlightsExtraProductOption) it8.next()).f93510b) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f93236p;
    }
}
