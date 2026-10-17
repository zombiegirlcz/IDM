package com.revolut.feature.card.verification.impl.flow.card_verification;

import com.revolut.feature.card.verification.impl.flow.card_verification.CardVerificationFlowContract$Step;
import hfb.d;
import hv2.b;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends h implements b {
    public final CardVerificationFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f64412p;

    public a(CardVerificationFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        d dVar = new d(this, 27);
        this.f64412p = cp5.d.a(this, CardVerificationFlowContract$Step.TransactionCode.f64411a, f0.f322471a, dVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f64412p;
    }
}
