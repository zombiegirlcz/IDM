package com.revolut.feature.freelancer.impl.ui.invoice.details.flow;

import com.revolut.feature.freelancer.impl.ui.invoice.details.flow.InvoiceDetailsFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import mnl.g;
import mx6.b;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements b {
    public final InvoiceDetailsFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f73863p;

    public a(InvoiceDetailsFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        this.f73863p = d.a(this, new InvoiceDetailsFlowContract$Step.InvoiceDetails(inputData.f73859a), f0.f322471a, new g(this, 26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f73863p;
    }
}
