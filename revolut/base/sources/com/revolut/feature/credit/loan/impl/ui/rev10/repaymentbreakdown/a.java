package com.revolut.feature.credit.loan.impl.ui.rev10.repaymentbreakdown;

import c55.f0;
import c55.z;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccountpicker.LoanRepaymentAccountModelExtension;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ky4.e;
import l35.b;
import mra.d;
import oki.h;
import vkm.q;
import yji.l;
import z6e.g;
import z75.o;
import z75.p;
import z75.w;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends h implements p {
    public final LoanRepaymentBreakdownControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f70526p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final z f70527q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f0 f70528r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j60.a f70529s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final LoanRepaymentAccountModelExtension f70530t;
    public final e u;
    public final y v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f70531w;

    public a(n mapper, LoanRepaymentBreakdownControllerContract$InputData inputData, b loanInteractor, z loanRepaymentBreakdownExplainerFactory, f0 loanRepaymentStatusDialogMapper, j60.a bottomDialog, LoanRepaymentAccountModelExtension repaymentAccountPickerModelExtension) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(loanInteractor, "loanInteractor");
        Intrinsics.checkNotNullParameter(loanRepaymentBreakdownExplainerFactory, "loanRepaymentBreakdownExplainerFactory");
        Intrinsics.checkNotNullParameter(loanRepaymentStatusDialogMapper, "loanRepaymentStatusDialogMapper");
        Intrinsics.checkNotNullParameter(bottomDialog, "bottomDialog");
        Intrinsics.checkNotNullParameter(repaymentAccountPickerModelExtension, "repaymentAccountPickerModelExtension");
        this.o = inputData;
        this.f70526p = loanInteractor;
        this.f70527q = loanRepaymentBreakdownExplainerFactory;
        this.f70528r = loanRepaymentStatusDialogMapper;
        this.f70529s = bottomDialog;
        this.f70530t = repaymentAccountPickerModelExtension;
        this.u = new e(0);
        this.v = d.b(this, new o(inputData.f70522b, inputData.f70523c, inputData.e, new Data(null, null, true, 3, null), inputData.d), mapper, null, false, 12);
        this.f70531w = hx7.e.a(this, new yz4.b(this, 18));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.credit.loan.impl.ui.rev10.repaymentbreakdown.a r25, dj0.d r26, gim.c r27) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.loan.impl.ui.rev10.repaymentbreakdown.a.I2(com.revolut.feature.credit.loan.impl.ui.rev10.repaymentbreakdown.a, dj0.d, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, q.Q(this.u, new g((Continuation) null, this, 5)), null, null, new w(this, null), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f70531w;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.v;
    }
}
