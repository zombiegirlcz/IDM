package com.revolut.feature.freelancer.impl.ui.acquiring_order.flow;

import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import nk4.o;
import nu6.b;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements b {
    public final yki.a o;

    public a(FreelancerAcquiringOrderFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = d.a(this, inputData.f73689a, f0.f322471a, new o(this, 20));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.o;
    }
}
