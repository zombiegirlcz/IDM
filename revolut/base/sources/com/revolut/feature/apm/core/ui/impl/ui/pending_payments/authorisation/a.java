package com.revolut.feature.apm.core.ui.impl.ui.pending_payments.authorisation;

import com.revolut.feature.apm.core.ui.api.navigation.pending_payments.ApmPaymentAuthorisationNavigation$InputData;
import com.revolut.feature.apm.core.ui.impl.ui.pending_payments.authorisation.ApmPendingPaymentFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yz4.b;
import z22.c;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends h implements c {
    public final ApmPaymentAuthorisationNavigation$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f62359p;

    public a(ApmPaymentAuthorisationNavigation$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        b bVar = new b(this, 6);
        this.f62359p = d.a(this, ApmPendingPaymentFlowContract$Step.Confirmation.f62357a, f0.f322471a, bVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f62359p;
    }
}
