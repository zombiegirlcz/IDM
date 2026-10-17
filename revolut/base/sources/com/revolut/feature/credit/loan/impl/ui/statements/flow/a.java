package com.revolut.feature.credit.loan.impl.ui.statements.flow;

import com.revolut.feature.credit.loan.impl.ui.statements.flow.LoanStatementsFlowContract$Step;
import d8l.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import wr1.s;
import x85.b;
import x85.c;
import y45.k;
import yki.i;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends h implements b {
    public final LoanStatementsFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k f70618p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i f70619q;

    public a(LoanStatementsFlowContract$InputData inputData, k loanStatementDocumentInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(loanStatementDocumentInteractor, "loanStatementDocumentInteractor");
        this.o = inputData;
        this.f70618p = loanStatementDocumentInteractor;
        this.f70619q = d.a(this, new x2g.b(this, 10));
    }

    @Override // yki.j
    public final void M0() {
        int i = c.f303295a[this.o.f70616b.ordinal()];
        if (i == 1) {
            n2(new s(this, null, 25), new whi.b(6));
            return;
        }
        i iVar = this.f70619q;
        if (i != 2) {
            h.D2(iVar);
        } else {
            h.t2(this, iVar, LoanStatementsFlowContract$Step.List.f70617a, false, null, false, 12);
        }
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f70619q;
    }
}
