package com.revolut.feature.kyc.impl.egov_kyc.flow;

import com.revolut.feature.kyc.impl.egov_kyc.flow.EgovKycFlowContract$Step;
import cp5.d;
import fv8.b;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends h implements b {
    public final EgovKycFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ev8.a f77636p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f77637q;

    public a(EgovKycFlowContract$InputData inputData, ev8.a dialogProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(dialogProvider, "dialogProvider");
        this.o = inputData;
        this.f77636p = dialogProvider;
        fv1.a aVar = new fv1.a(this, 3);
        this.f77637q = d.a(this, EgovKycFlowContract$Step.Portal.f77635a, f0.f322471a, aVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f77637q;
    }
}
