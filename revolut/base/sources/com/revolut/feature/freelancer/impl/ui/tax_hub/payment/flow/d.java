package com.revolut.feature.freelancer.impl.ui.tax_hub.payment.flow;

import com.revolut.feature.freelancer.impl.ui.tax_hub.payment.flow.TaxHubPaymentFlowContract$Step;
import ds6.j;
import gr6.m;
import kgm.i;
import kotlin.jvm.internal.Intrinsics;
import mz3.r;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends h implements n37.b {
    public final i o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final m f74327p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TaxHubPaymentFlowContract$InputData f74328q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f74329r;

    public d(i pocketInfoProvider, m freelancerPocketsInteractor, TaxHubPaymentFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(pocketInfoProvider, "pocketInfoProvider");
        Intrinsics.checkNotNullParameter(freelancerPocketsInteractor, "freelancerPocketsInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = pocketInfoProvider;
        this.f74327p = freelancerPocketsInteractor;
        this.f74328q = inputData;
        j jVar = inputData.f74313c;
        this.f74329r = cp5.d.a(this, jVar != null ? new TaxHubPaymentFlowContract$Step.Assessment(jVar) : TaxHubPaymentFlowContract$Step.TaxTypePicker.f74322a, f0.f322471a, new r(this, 10));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f74329r;
    }
}
