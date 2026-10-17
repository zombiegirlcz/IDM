package com.revolut.feature.freelancer.impl.ui.subaccount.update.flow;

import com.revolut.feature.freelancer.impl.ui.subaccount.update.flow.FreelancerUpdateTaxPocketFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import wtj.c;
import x27.b;
import zhm.f0;
import zjh.i;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements b {
    public final i o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f74234p;

    public a(i taxPocketsInteractor) {
        Intrinsics.checkNotNullParameter(taxPocketsInteractor, "taxPocketsInteractor");
        this.o = taxPocketsInteractor;
        c cVar = new c(this, 29);
        this.f74234p = d.a(this, FreelancerUpdateTaxPocketFlowContract$Step.TaxReservation.f74233a, f0.f322471a, cVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f74234p;
    }
}
