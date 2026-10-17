package com.revolut.feature.freelancer.impl.ui.sales.refund.flow;

import com.revolut.feature.freelancer.impl.ui.sales.refund.flow.FreelancerRefundFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import mz3.r;
import n27.b;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements b {
    public final FreelancerRefundFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f74206p;

    public a(FreelancerRefundFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        r rVar = new r(this, 9);
        this.f74206p = d.a(this, FreelancerRefundFlowContract$Step.Refund.f74205a, f0.f322471a, rVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f74206p;
    }
}
