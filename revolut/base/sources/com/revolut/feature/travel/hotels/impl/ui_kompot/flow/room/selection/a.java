package com.revolut.feature.travel.hotels.impl.ui_kompot.flow.room.selection;

import com.revolut.feature.travel.hotels.impl.ui_kompot.flow.room.selection.TravelHotelsRoomsSelectionFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import vvc.s;
import wag.b;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends h implements b {
    public final yki.a o;

    public a(TravelHotelsRoomsSelectionFlowContract$InputData$Amendment inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = d.a(this, new TravelHotelsRoomsSelectionFlowContract$Step.RoomSelectionAmendment(inputData.f93751a), f0.f322471a, new s(this, 24));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.o;
    }
}
