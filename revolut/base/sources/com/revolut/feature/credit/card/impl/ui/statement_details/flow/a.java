package com.revolut.feature.credit.card.impl.ui.statement_details.flow;

import com.revolut.feature.credit.card.impl.ui.statement_details.flow.CreditCardStatementDetailsFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import zhm.f0;
import zv4.b;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends h implements b {
    public final CreditCardStatementDetailsFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f69730p;

    public a(CreditCardStatementDetailsFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        zo2.h hVar = new zo2.h(this, 19);
        this.f69730p = d.a(this, CreditCardStatementDetailsFlowContract$Step.Statement.f69729a, f0.f322471a, hVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f69730p;
    }
}
