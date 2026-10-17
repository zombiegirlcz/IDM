package com.revolut.feature.credit.card.impl.ui.details.flow;

import com.revolut.feature.credit.card.impl.ui.details.flow.CreditCardDetailsFlowContract$Step;
import cp5.d;
import dr4.b;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends h implements b {
    public final CreditCardDetailsFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f69261p;

    public a(CreditCardDetailsFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        dgj.h hVar = new dgj.h(this, 27);
        this.f69261p = d.a(this, CreditCardDetailsFlowContract$Step.Details.f69256a, f0.f322471a, hVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f69261p;
    }
}
