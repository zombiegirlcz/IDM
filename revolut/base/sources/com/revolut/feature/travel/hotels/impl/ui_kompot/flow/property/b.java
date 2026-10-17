package com.revolut.feature.travel.hotels.impl.ui_kompot.flow.property;

import com.revolut.feature.travel.hotels.impl.ui_kompot.flow.property.TravelHotelsPropertyFlowContract$Step;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import v48.d;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends h implements vag.b {
    public final TravelHotelsPropertyFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f93750p;

    public b(TravelHotelsPropertyFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        d dVar = new d(this, 10);
        this.f93750p = cp5.d.a(this, TravelHotelsPropertyFlowContract$Step.Details.f93746a, f0.f322471a, dVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f93750p;
    }
}
