package com.revolut.feature.travel.hotels.impl.ui_kompot.flow.amendment;

import com.revolut.feature.travel.hotels.impl.ui_kompot.flow.amendment.TravelHotelsBookingAmendmentFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import sag.b;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends h implements b {
    public final yki.a o;

    public a(TravelHotelsBookingAmendmentFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = d.a(this, new TravelHotelsBookingAmendmentFlowContract$Step.DatesPicker(inputData.f93681a), f0.f322471a, new qce.b(this, inputData, 15));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.o;
    }
}
