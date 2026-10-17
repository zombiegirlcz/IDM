package com.revolut.feature.freelancer.impl.ui.subaccount.create.flow;

import com.revolut.feature.freelancer.impl.ui.subaccount.create.flow.FreelancerCreateTaxPocketFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import qm2.c;
import r27.b;
import zhm.f0;
import zjh.i;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements b {
    public final i o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final wj0.a f74223p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ppg.b f74224q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final FreelancerCreateTaxPocketFlowContract$InputData f74225r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final yki.a f74226s;

    public a(i taxPocketsInteractor, wj0.a idempotencyKeyHolder, ppg.b vaultsInteractor, FreelancerCreateTaxPocketFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(taxPocketsInteractor, "taxPocketsInteractor");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(vaultsInteractor, "vaultsInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = taxPocketsInteractor;
        this.f74223p = idempotencyKeyHolder;
        this.f74224q = vaultsInteractor;
        this.f74225r = inputData;
        c cVar = new c(this, 22);
        this.f74226s = d.a(this, FreelancerCreateTaxPocketFlowContract$Step.TaxReservation.f74222a, f0.f322471a, cVar);
    }

    @Override // yji.l
    public final void I1() {
        this.f74223p.a("IDEMPOTENCY_TAG_CREATE_TAX_POCKET");
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f74226s;
    }
}
