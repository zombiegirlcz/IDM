package com.revolut.feature.statements.impl.ui.consolidated.flow;

import com.revolut.feature.statements.api.StatementsMode;
import com.revolut.feature.statements.impl.ui.consolidated.flow.ConsolidatedStatementFlowContract$Step;
import com.revolut.kompot.navigable.flow.FlowStep;
import cp5.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import or4.i;
import org.jetbrains.annotations.NotNull;
import ozd.b;
import ozd.c;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends h implements b {

    @NotNull
    public static final c Companion = new c();
    public final ConsolidatedStatementFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f88312p;

    public a(ConsolidatedStatementFlowContract$InputData inputData) {
        FlowStep flowStep;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        StatementsMode statementsMode = inputData.f88309a;
        if (Intrinsics.f(statementsMode, StatementsMode.BankIDAnnualStatements.f88212a)) {
            flowStep = ConsolidatedStatementFlowContract$Step.BankIDAnnualStatementsScreen.f88310a;
        } else {
            if (!(statementsMode instanceof StatementsMode.Consolidated) && !(statementsMode instanceof StatementsMode.TaxCertificate) && !(statementsMode instanceof StatementsMode.TaxFiling)) {
                throw new NoWhenBranchMatchedException();
            }
            flowStep = ConsolidatedStatementFlowContract$Step.ConsolidatedStatementScreen.f88311a;
        }
        this.f88312p = d.a(this, flowStep, f0.f322471a, new i(this, 17));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f88312p;
    }
}
