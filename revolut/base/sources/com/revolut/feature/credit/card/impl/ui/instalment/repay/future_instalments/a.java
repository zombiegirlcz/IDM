package com.revolut.feature.credit.card.impl.ui.instalment.repay.future_instalments;

import anc.b;
import at4.c;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.future_instalments.CreditCardRepayFutureInstalmentsFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends h implements c {
    public final CreditCardRepayFutureInstalmentsFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f69510p;

    public a(CreditCardRepayFutureInstalmentsFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        b bVar = new b(this, 13);
        this.f69510p = d.a(this, CreditCardRepayFutureInstalmentsFlowContract$Step.ChooseFutureInstalments.f69506a, f0.f322471a, bVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f69510p;
    }
}
