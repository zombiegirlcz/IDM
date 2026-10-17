package com.revolut.feature.freelancer.impl.ui.sales.details.kompot.flow;

import com.revolut.feature.freelancer.impl.ui.sales.details.kompot.flow.FreelancerSaleDetailsFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import mz3.r;
import n17.b;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements b {
    public final FreelancerSaleDetailsFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f74117p;

    public a(FreelancerSaleDetailsFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        r rVar = new r(this, 6);
        this.f74117p = d.a(this, FreelancerSaleDetailsFlowContract$Step.SaleDetails.f74116a, f0.f322471a, rVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f74117p;
    }
}
