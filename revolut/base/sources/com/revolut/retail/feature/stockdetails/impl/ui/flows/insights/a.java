package com.revolut.retail.feature.stockdetails.impl.ui.flows.insights;

import com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.InsightsFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import qm2.c;
import qtk.b;
import zhm.f0;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends h implements b {
    public final InsightsFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f103857p;

    public a(InsightsFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        c cVar = new c(this, 9);
        this.f103857p = d.a(this, InsightsFlowContract$Step.Insights.f103854a, f0.f322471a, cVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f103857p;
    }
}
