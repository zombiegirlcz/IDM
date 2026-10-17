package com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccountpicker;

import c55.f0;
import cam.f;
import com.revolut.feature.credit.loan.api.models.LoanRepaymentAccountData;
import com.revolut.feature.topup_screen.api.config.TopUpConfig;
import com.revolut.feature.topup_screen.api.destination.InitTopUpDestination;
import h6i.o;
import j1j.d;
import kotlin.jvm.internal.Intrinsics;
import pyd.c;
import qij.s;
import t5e.m;
import vkm.j2;
import vkm.q;
import wkm.l;
import y45.i;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends LoanRepaymentAccountModelExtension {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final l35.b f70507l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final i f70508m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final o f70509n;
    public final f0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final vki.a f70510p;

    public b(l35.b loanInteractor, i loanProductInteractor, o moveMoneyAccountProvider, f0 loanRepaymentStatusDialogMapper) {
        Intrinsics.checkNotNullParameter(loanInteractor, "loanInteractor");
        Intrinsics.checkNotNullParameter(loanProductInteractor, "loanProductInteractor");
        Intrinsics.checkNotNullParameter(moveMoneyAccountProvider, "moveMoneyAccountProvider");
        Intrinsics.checkNotNullParameter(loanRepaymentStatusDialogMapper, "loanRepaymentStatusDialogMapper");
        this.f70507l = loanInteractor;
        this.f70508m = loanProductInteractor;
        this.f70509n = moveMoneyAccountProvider;
        this.o = loanRepaymentStatusDialogMapper;
        od0.i.Companion.getClass();
        this.f70510p = c.a(this, new t75.a(od0.i.f224256b));
    }

    /* JADX WARN: Code restructure failed: missing block: B:259:0x050e, code lost:
    
        if (vkm.q.y(r0, r3, r8) == r9) goto L260;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    @Override // com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccountpicker.LoanRepaymentAccountModelExtension
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(com.revolut.feature.credit.loan.api.models.rev10.LoanDetails r34, q35.g0 r35, com.revolut.feature.credit.loan.api.models.LoanRepaymentTerms r36, dj0.d r37, java.lang.String r38, gim.c r39) {
        /*
            Method dump skipped, instruction units count: 1316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccountpicker.b.Z2(com.revolut.feature.credit.loan.api.models.rev10.LoanDetails, q35.g0, com.revolut.feature.credit.loan.api.models.LoanRepaymentTerms, dj0.d, java.lang.String, gim.c):java.lang.Object");
    }

    @Override // com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccountpicker.LoanRepaymentAccountModelExtension
    public final void b3() {
        A2(new InitTopUpDestination(TopUpConfig.Companion.c(TopUpConfig.INSTANCE, null, null, null, null, 31)));
    }

    @Override // com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccountpicker.LoanRepaymentAccountModelExtension
    public final l c3(String loanId, LoanRepaymentAccountData loanRepaymentAccountData) {
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        m mVar = new m(loanRepaymentAccountData, 9);
        vki.a aVar = this.f70510p;
        X2(aVar, mVar);
        return q.Q(q.q(new s((j2) aVar.f22677a, 23)), new sdi.a(null, this, loanId, 3));
    }

    @Override // com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccountpicker.LoanRepaymentAccountModelExtension
    public final void d3(d selectedBalance) {
        Intrinsics.checkNotNullParameter(selectedBalance, "selectedBalance");
        X2(this.f70510p, new m(selectedBalance, 10));
    }

    @Override // vki.b
    public final f getState() {
        return this.f70510p;
    }
}
