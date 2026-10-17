package com.revolut.feature.statements.impl.ui.savings.flow;

import com.revolut.feature.statements.impl.ui.savings.flow.SavingsStatementsFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import lp2.c;
import m0e.b;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends h implements b {
    public final SavingsStatementsFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f88387p;

    public a(SavingsStatementsFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        this.f88387p = d.a(this, inputData.f88383a.isEmpty() ? SavingsStatementsFlowContract$Step.AccountSelection.f88385a : new SavingsStatementsFlowContract$Step.StatementGeneration(inputData.f88383a), f0.f322471a, new c(this, 19));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f88387p;
    }
}
