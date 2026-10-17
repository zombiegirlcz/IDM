package com.revolut.feature.freelancer.impl.ui.invoice.create.flow;

import com.revolut.feature.freelancer.impl.ui.invoice.create.flow.InvoiceCreateFlowContract$Step;
import cp5.d;
import ghl.c;
import gx6.b;
import kotlin.jvm.internal.Intrinsics;
import kx6.e;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements b {
    public final InvoiceCreateFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f73825p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f73826q;

    public a(InvoiceCreateFlowContract$InputData inputData, e invoiceCreateCommandFactory) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(invoiceCreateCommandFactory, "invoiceCreateCommandFactory");
        this.o = inputData;
        this.f73825p = invoiceCreateCommandFactory;
        c cVar = new c(this, 23);
        this.f73826q = d.a(this, InvoiceCreateFlowContract$Step.InvoiceCreation.f73820a, f0.f322471a, cVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f73826q;
    }
}
