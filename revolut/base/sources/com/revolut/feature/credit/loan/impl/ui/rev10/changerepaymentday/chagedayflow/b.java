package com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.chagedayflow;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import d8l.d;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import nuh.j;
import nx2.f;
import nzj.n;
import o65.e;
import oki.h;
import rd0.c;
import yji.l;
import yki.i;
import zhm.h0;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends h implements o65.a {
    public final LoanChangeRepaymentDayFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f70394p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n65.a f70395q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final gte.a f70396r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i f70397s;

    public b(LoanChangeRepaymentDayFlowContract$InputData inputData, e extension, n65.a loanChangeRepaymentDayDialogMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(extension, "extension");
        Intrinsics.checkNotNullParameter(loanChangeRepaymentDayDialogMapper, "loanChangeRepaymentDayDialogMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.o = inputData;
        this.f70394p = extension;
        this.f70395q = loanChangeRepaymentDayDialogMapper;
        this.f70396r = featureToggleInteractor;
        this.f70397s = d.a(this, new f(this, 22));
    }

    public final void I2(Throwable th10) {
        boolean z = th10 instanceof LoanChangeRepaymentDayFlowContract$NotEnoughFundsException;
        Continuation continuation = null;
        n65.a aVar = this.f70395q;
        if (!z) {
            aVar.getClass();
            l.a1(this, X1(new y0("change-repayment-day-not-generic-error", new z(new TextLocalisedClause(R$string.credit_common_error_title, null, null, 14), new TextLocalisedClause(R$string.credit_error_subtitle, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 4)), null, null, new j(this, continuation, 19), 3);
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(c.ERROR, null, null, th10, h0Var);
            return;
        }
        dj0.d requiredBalance = ((LoanChangeRepaymentDayFlowContract$NotEnoughFundsException) th10).f70389a;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(requiredBalance, "requiredBalance");
        l.a1(this, X1(new y0("change-repayment-day-not-enough-funds", new z(new TextLocalisedClause(R$string.credit_loan_change_repayment_day_not_enough_money_title, null, null, 14), new TextLocalisedClause(R$string.credit_loan_change_repayment_day_not_enough_money_description, u.c(sx4.f.b(3, null, null, requiredBalance)), null, 12), new TextLocalisedClause(R$string.credit_loan_change_repayment_day_action_add_money, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 4)), new nt.e(2, this, b.class, "handleError", "handleError(Ljava/lang/Throwable;)Z", 4, 2), null, new o4a.b(this, requiredBalance, continuation, 1), 2);
    }

    @Override // yki.j
    public final void M0() {
        l2(new a(this, null), new n(1, this, b.class, "handleError", "handleError(Ljava/lang/Throwable;)Z", 0, 12));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f70397s;
    }
}
