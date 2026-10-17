package com.revolut.feature.spending_analytics.impl.ui.rev10.travel.remove.flow;

import com.revolut.feature.spending_analytics.impl.ui.rev10.travel.remove.flow.TravelRemoveWidgetFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import d8l.d;
import kotlin.jvm.internal.Intrinsics;
import lp2.c;
import ltd.b;
import oki.h;
import yki.i;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends h implements b {
    public final TravelRemoveWidgetFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f88052p;

    public a(TravelRemoveWidgetFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        this.f88052p = d.a(this, new c(this, 5));
    }

    @Override // yki.j
    public final void M0() {
        TravelRemoveWidgetFlowContract$InputData travelRemoveWidgetFlowContract$InputData = this.o;
        h.w2(this.f88052p, new TravelRemoveWidgetFlowContract$Step.ModalRemoveWidget(travelRemoveWidgetFlowContract$InputData.f88049b, travelRemoveWidgetFlowContract$InputData.f88048a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f88052p;
    }
}
