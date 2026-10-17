package com.revolut.feature.credit.card.impl.ui.instalment.post_purchase.details.flow;

import com.revolut.feature.credit.card.impl.ui.instalment.post_purchase.details.flow.CreditCardPostPurchaseDetailsFlowContract$Step;
import cp5.d;
import is4.b;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends h implements b {
    public final CreditCardPostPurchaseDetailsFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final gte.a f69417p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f69418q;

    public a(CreditCardPostPurchaseDetailsFlowContract$InputData inputData, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.o = inputData;
        this.f69417p = featureToggleInteractor;
        in1.a aVar = new in1.a(this, 11);
        this.f69418q = d.a(this, CreditCardPostPurchaseDetailsFlowContract$Step.Details.f69414a, f0.f322471a, aVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f69418q;
    }
}
