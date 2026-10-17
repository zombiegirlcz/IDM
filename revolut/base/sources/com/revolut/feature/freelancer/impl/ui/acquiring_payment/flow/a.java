package com.revolut.feature.freelancer.impl.ui.acquiring_payment.flow;

import cp5.d;
import eul.f;
import ev6.b;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements b {
    public final yki.a o;

    public a(FreelancerAcquiringPaymentFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = d.a(this, inputData.f73727a, f0.f322471a, new f(this, 1));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.o;
    }
}
