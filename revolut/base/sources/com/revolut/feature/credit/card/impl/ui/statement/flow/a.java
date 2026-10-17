package com.revolut.feature.credit.card.impl.ui.statement.flow;

import com.revolut.feature.credit.card.impl.ui.statement.flow.CreditCardStatementFlowContract$Step;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import pu4.d;
import pv4.b;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends h implements b {
    public final CreditCardStatementFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f69707p;

    public a(CreditCardStatementFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        d dVar = new d(this, 4);
        this.f69707p = cp5.d.a(this, CreditCardStatementFlowContract$Step.Hub.f69706a, f0.f322471a, dVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f69707p;
    }
}
