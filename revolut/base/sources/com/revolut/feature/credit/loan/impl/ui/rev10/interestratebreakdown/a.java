package com.revolut.feature.credit.loan.impl.ui.rev10.interestratebreakdown;

import b75.g;
import cli.n;
import cli.y;
import com.revolut.feature.credit.loan.api.mapper.LoanInterestRateTypeInfo;
import com.revolut.feature.credit.loan.api.models.rev10.Loan;
import com.revolut.feature.credit.loan.impl.ui.rev10.interestratebreakdown.LoanInterestRateBreakdownControllerContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import hx7.e;
import kotlin.jvm.internal.Intrinsics;
import m35.f;
import mra.d;
import oki.h;
import yx4.b;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends h implements b75.h {
    public final f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f70443p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f70444q;

    public a(f loanDialogMapper, n stateMapper, LoanInterestRateBreakdownControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(loanDialogMapper, "loanDialogMapper");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = loanDialogMapper;
        Loan loan = inputData.f70441a.f70144a;
        this.f70443p = d.b(this, new g(loan.f70112h, loan.f70119r, loan.v), stateMapper, null, false, 12);
        this.f70444q = e.a(this, new av8.n(this, 26));
    }

    public final void I2(b item) {
        Intrinsics.checkNotNullParameter(item, "item");
        Object obj2 = item.f317545b;
        if (Intrinsics.f(item.f317544a, "GOT_IT_BUTTON")) {
            B2();
        } else if (!(obj2 instanceof LoanInterestRateTypeInfo)) {
            int i = jli.h.f175850a;
        } else {
            h.v2(this.f70444q, new LoanInterestRateBreakdownControllerContract$ModalStep.InterestRateTypeExplainer((LoanInterestRateTypeInfo) obj2), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f70444q;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f70443p;
    }
}
