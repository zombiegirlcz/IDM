package com.revolut.feature.travel.flights.impl.ui.screen.fare_selection;

import a5g.l;
import a6g.g;
import a6g.i;
import cli.n;
import cli.y;
import com.revolut.feature.travel.flights.models.domain.itinerary.TravelFlightsFare;
import hx7.e;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import zhm.d0;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends h implements i {
    public final y o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f93342p;

    public a(n stateMapper, TravelFlightsFareSelectionScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        List list = inputData.f93339a;
        TravelFlightsFare travelFlightsFare = (TravelFlightsFare) d0.d0(list);
        this.o = d.b(this, new g(list, travelFlightsFare != null ? travelFlightsFare.f93516a : null), stateMapper, null, false, 12);
        this.f93342p = e.a(this, new l(6));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f93342p;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
