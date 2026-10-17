package com.revolut.feature.credit.card.impl.ui.repay.pse.flow;

import com.revolut.feature.credit.card.impl.ui.repay.pse.flow.CreditCardPseRepayFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import lp2.c;
import lu4.b;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends h implements b {
    public final CreditCardPseRepayFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f69600p;

    public a(CreditCardPseRepayFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        c cVar = new c(this, 6);
        this.f69600p = d.a(this, CreditCardPseRepayFlowContract$Step.SelectAmount.f69599a, f0.f322471a, cVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f69600p;
    }
}
