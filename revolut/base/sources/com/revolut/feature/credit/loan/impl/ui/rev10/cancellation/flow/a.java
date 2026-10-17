package com.revolut.feature.credit.loan.impl.ui.rev10.cancellation.flow;

import com.revolut.feature.credit.loan.impl.ui.rev10.cancellation.flow.LoanCancellationFlowContract$Step;
import d8l.d;
import ds4.y;
import dz6.o;
import e54.r;
import e65.c;
import e65.e;
import e65.f;
import e65.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yi5.b;
import yki.i;
import zh9.u0;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends h implements e65.a {
    public final LoanCancellationFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e65.h f70364p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final r35.a f70365q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f70366r;

    public a(LoanCancellationFlowContract$InputData inputData, e65.h actionExtension, r35.a loanCommandsFactory) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(actionExtension, "actionExtension");
        Intrinsics.checkNotNullParameter(loanCommandsFactory, "loanCommandsFactory");
        this.o = inputData;
        this.f70364p = actionExtension;
        this.f70365q = loanCommandsFactory;
        this.f70366r = d.a(this, new r(this, 3));
    }

    public static final void I2(a aVar, c cVar) {
        i iVar = aVar.f70366r;
        if (cVar instanceof g) {
            h.t2(aVar, iVar, new LoanCancellationFlowContract$Step.ConfirmLoanCancellation(((g) cVar).f122899a), false, null, false, 12);
            return;
        }
        if (cVar instanceof f) {
            h.t2(aVar, iVar, new LoanCancellationFlowContract$Step.SelectLoan(((f) cVar).f122898a), false, null, false, 12);
            return;
        }
        if (cVar instanceof e65.d) {
            aVar.l2(new o(aVar, ((e65.d) cVar).f122896a, null, 24), new b(26));
            return;
        }
        if (cVar instanceof e) {
            aVar.C1(u0.b(((g55.a) aVar.f70365q).a(((e) cVar).f122897a)));
            i iVar2 = aVar.f70366r;
            if (iVar2.d() == null) {
                Intrinsics.checkNotNullParameter(iVar2, "<this>");
                iVar2.n();
                return;
            }
            return;
        }
        if (!(cVar instanceof c.a)) {
            if (!(cVar instanceof c.b)) {
                throw new NoWhenBranchMatchedException();
            }
            int i = jli.h.f175850a;
        } else if (iVar.d() == null) {
            Intrinsics.checkNotNullParameter(iVar, "<this>");
            iVar.n();
        }
    }

    @Override // yki.j
    public final void M0() {
        l2(new y(this, null, 24), new b(26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f70366r;
    }
}
