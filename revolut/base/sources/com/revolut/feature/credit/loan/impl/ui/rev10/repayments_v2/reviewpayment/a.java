package com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.reviewpayment;

import c55.z;
import cli.g;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccountpicker.LoanRepaymentAccountModelExtension;
import hx7.e;
import i69.p;
import i85.o;
import i85.w;
import kotlin.jvm.internal.Intrinsics;
import l35.b;
import mra.d;
import oki.h;
import y45.i;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends h implements o {
    public final ReviewPaymentControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f70568p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final z f70569q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j60.a f70570r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final LoanRepaymentAccountModelExtension f70571s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i f70572t;
    public final y u;
    public final com.revolut.kompot.navigable.vc.modal.a v;

    public a(n mapper, ReviewPaymentControllerContract$InputData inputData, b loanInteractor, z loanRepaymentBreakdownExplainerFactory, j60.a bottomDialog, LoanRepaymentAccountModelExtension repaymentAccountPickerModelExtension, i loanProductInteractor) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(loanInteractor, "loanInteractor");
        Intrinsics.checkNotNullParameter(loanRepaymentBreakdownExplainerFactory, "loanRepaymentBreakdownExplainerFactory");
        Intrinsics.checkNotNullParameter(bottomDialog, "bottomDialog");
        Intrinsics.checkNotNullParameter(repaymentAccountPickerModelExtension, "repaymentAccountPickerModelExtension");
        Intrinsics.checkNotNullParameter(loanProductInteractor, "loanProductInteractor");
        this.o = inputData;
        this.f70568p = loanInteractor;
        this.f70569q = loanRepaymentBreakdownExplainerFactory;
        this.f70570r = bottomDialog;
        this.f70571s = repaymentAccountPickerModelExtension;
        this.f70572t = loanProductInteractor;
        this.u = d.b(this, new i85.n(new Data(null, null, true, 3, null), inputData.f70566c), mapper, null, false, 12);
        this.v = e.a(this, new p(this, 4));
    }

    @Override // yji.l
    public final void I1() {
        l2(new w(this, null, 0), new yi5.b(26));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.v;
    }

    @Override // cli.z
    public final g getState() {
        return this.u;
    }
}
