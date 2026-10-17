package com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.flow;

import com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.flow.CreditCardInstalmentAnticipationFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import plb.g;
import ps4.b;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends h implements b {
    public final CreditCardInstalmentAnticipationFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f69456p;

    public a(CreditCardInstalmentAnticipationFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        g gVar = new g(this, 23);
        this.f69456p = d.a(this, CreditCardInstalmentAnticipationFlowContract$Step.SelectQuote.f69455a, f0.f322471a, gVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f69456p;
    }
}
