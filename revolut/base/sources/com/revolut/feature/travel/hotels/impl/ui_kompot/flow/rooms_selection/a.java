package com.revolut.feature.travel.hotels.impl.ui_kompot.flow.rooms_selection;

import com.revolut.feature.travel.hotels.impl.ui_kompot.flow.rooms_selection.TravelHotelsRoomsSelectionFlowContract$Step;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.rooms_selection.TravelHotelsRoomsSelectionScreenContract$InputData;
import cp5.d;
import i9g.b0;
import i9g.c;
import i9g.h0;
import i9g.l;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import x2g.b;
import xag.e;
import xag.f;
import xag.g;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends h implements e {
    public final TravelHotelsRoomsSelectionScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l f93756p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b0 f93757q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final h0 f93758r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c f93759s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final g f93760t;
    public final yki.a u;

    public a(TravelHotelsRoomsSelectionScreenContract$InputData inputData, l draftInteractor, b0 travelHotelsPropertyInteractor, h0 travelSearchParamsInteractor, c filtersInteractor, g roomsSelectionSharedState) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(draftInteractor, "draftInteractor");
        Intrinsics.checkNotNullParameter(travelHotelsPropertyInteractor, "travelHotelsPropertyInteractor");
        Intrinsics.checkNotNullParameter(travelSearchParamsInteractor, "travelSearchParamsInteractor");
        Intrinsics.checkNotNullParameter(filtersInteractor, "filtersInteractor");
        Intrinsics.checkNotNullParameter(roomsSelectionSharedState, "roomsSelectionSharedState");
        this.o = inputData;
        this.f93756p = draftInteractor;
        this.f93757q = travelHotelsPropertyInteractor;
        this.f93758r = travelSearchParamsInteractor;
        this.f93759s = filtersInteractor;
        this.f93760t = roomsSelectionSharedState;
        b bVar = new b(this, 13);
        this.u = d.a(this, TravelHotelsRoomsSelectionFlowContract$Step.RoomsSelection.f93755a, f0.f322471a, bVar);
    }

    @Override // yji.l
    public final void I1() {
        sfm.b bVar = new sfm.b(this.f93756p.d(this.o.f94015a.f93663a), new x9h.d(13, new f(this, 0)), 1);
        Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
        yji.l.a1(this, rd0.e.b(bVar), null, null, new x64.b(this, null, 10), 3);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.u;
    }
}
