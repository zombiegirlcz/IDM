package com.revolut.feature.credit.card.impl.ui.statement_financing.flow;

import com.revolut.feature.credit.card.impl.ui.statement_financing.flow.CreditCardStatementFinancingFlowContract$Step;
import hfb.d;
import hw4.b;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends h implements b {
    public final CreditCardStatementFinancingFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f69767p;

    public a(CreditCardStatementFinancingFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        d dVar = new d(this, 29);
        this.f69767p = cp5.d.a(this, CreditCardStatementFinancingFlowContract$Step.Setup.f69766a, f0.f322471a, dVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f69767p;
    }
}
