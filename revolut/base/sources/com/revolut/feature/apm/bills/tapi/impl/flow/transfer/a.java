package com.revolut.feature.apm.bills.tapi.impl.flow.transfer;

import com.revolut.feature.apm.bills.core.api.model.search.tapi.BillSearchTapiResult;
import com.revolut.feature.apm.bills.tapi.impl.flow.transfer.TapiTransferFlowContract$Step;
import hx7.e;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import qki.d;
import sr1.b;
import sr1.c;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends h implements b {
    public final qpk.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f61545p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f61546q;

    public a(c inputData, qpk.b rateDetailsFeatureConfigProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(rateDetailsFeatureConfigProvider, "rateDetailsFeatureConfigProvider");
        this.o = rateDetailsFeatureConfigProvider;
        this.f61545p = e.b(this, new TapiTransferFlowContract$State(inputData.f265104a));
        BillSearchTapiResult billSearchTapiResult = inputData.f265104a;
        this.f61546q = cp5.d.a(this, com.revolut.feature.apm.bills.core.api.model.search.tapi.a.a(billSearchTapiResult) ? TapiTransferFlowContract$Step.Amount.f61538a : new TapiTransferFlowContract$Step.Review(billSearchTapiResult.f61451b, null, null, null), f0.f322471a, new qce.b(inputData, this, 18));
    }

    @Override // qki.e
    public final d getState() {
        return this.f61545p;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f61546q;
    }
}
