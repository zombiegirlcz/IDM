package com.revolut.feature.card_management.impl.cardagreements.flow;

import com.revolut.feature.card_management.impl.cardagreements.flow.CardIssuanceAgreementFlowContract$Step;
import eul.f;
import ez2.b;
import ez2.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends h implements b {
    public final CardIssuanceAgreementFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f64812p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f64813q;

    public a(CardIssuanceAgreementFlowContract$InputData inputData, d agreementState) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(agreementState, "agreementState");
        this.o = inputData;
        this.f64812p = agreementState;
        f fVar = new f(this, 9);
        this.f64813q = cp5.d.a(this, CardIssuanceAgreementFlowContract$Step.Overview.f64811a, f0.f322471a, fVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f64813q;
    }
}
