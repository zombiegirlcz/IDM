package com.revolut.feature.statements.impl.ui.statement_of_fees.flow;

import com.revolut.feature.statements.impl.ui.statement_of_fees.flow.StatementOfFeesFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import nx2.f;
import o0e.b;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends h implements b {
    public final yki.a o;

    public a(StatementOfFeesFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        f fVar = new f(inputData, 10);
        this.o = d.a(this, StatementOfFeesFlowContract$Step.StatementOfFessScreen.f88391a, f0.f322471a, fVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.o;
    }
}
