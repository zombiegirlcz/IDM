package com.revolut.feature.credit.card.impl.ui.statement.transactions.flow;

import com.revolut.feature.credit.card.impl.ui.statement.transactions.flow.CreditCardTransactionsFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import vv4.b;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends h implements b {
    public final CreditCardTransactionsFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f69720p;

    public a(CreditCardTransactionsFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        vh9.b bVar = new vh9.b(this, 29);
        this.f69720p = d.a(this, CreditCardTransactionsFlowContract$Step.Transactions.f69719a, f0.f322471a, bVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f69720p;
    }
}
