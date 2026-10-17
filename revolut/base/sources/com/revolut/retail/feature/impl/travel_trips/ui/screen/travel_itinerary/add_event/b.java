package com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event;

import av8.n;
import avj.g;
import cli.y;
import com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event.TravelItineraryAddEventContract$Mode;
import hx7.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends h implements g {
    public final TravelItineraryAddEventContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yuj.a f101634p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final abk.c f101635q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f101636r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f101637s;

    public b(TravelItineraryAddEventContract$InputData inputData, yuj.a interactor, abk.c errorDialogMapper, c stateMapper) {
        avj.a aVar;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(errorDialogMapper, "errorDialogMapper");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f101634p = interactor;
        this.f101635q = errorDialogMapper;
        this.f101636r = e.a(this, new n(this, 1));
        TravelItineraryAddEventContract$Mode travelItineraryAddEventContract$Mode = inputData.e;
        if (travelItineraryAddEventContract$Mode instanceof TravelItineraryAddEventContract$Mode.Edit) {
            TravelItineraryAddEventContract$Mode.Edit edit = (TravelItineraryAddEventContract$Mode.Edit) travelItineraryAddEventContract$Mode;
            aVar = new avj.a(edit.f101629b, edit.f101630c, edit.d, edit.e);
        } else if (travelItineraryAddEventContract$Mode instanceof TravelItineraryAddEventContract$Mode.AddProposal) {
            TravelItineraryAddEventContract$Mode.AddProposal addProposal = (TravelItineraryAddEventContract$Mode.AddProposal) travelItineraryAddEventContract$Mode;
            aVar = new avj.a(addProposal.f101626b, addProposal.f101627c, addProposal.d, addProposal.e);
        } else {
            if (!Intrinsics.f(travelItineraryAddEventContract$Mode, TravelItineraryAddEventContract$Mode.Add.f101624a)) {
                throw new NoWhenBranchMatchedException();
            }
            aVar = new avj.a(0);
        }
        this.f101637s = d.b(this, aVar, stateMapper, null, false, 12);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f101636r;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f101637s;
    }
}
