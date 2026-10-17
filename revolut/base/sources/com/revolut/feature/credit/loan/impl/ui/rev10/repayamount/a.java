package com.revolut.feature.credit.loan.impl.ui.rev10.repayamount;

import cli.g;
import cli.n;
import cli.y;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccountpicker.LoanRepaymentAccountModelExtension;
import hx7.e;
import ip0.v7;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlin.time.c;
import l35.b;
import m35.f;
import m35.p;
import mra.d;
import oki.h;
import org.jetbrains.annotations.NotNull;
import pkf.x;
import q43.m;
import q5g.f0;
import q75.k;
import q75.o;
import q75.r;
import vkm.j2;
import vkm.q;
import vkm.q0;
import y45.i;
import yji.l;
import zh9.u0;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends h implements k {

    @NotNull
    public static final o Companion = new o();
    public final LoanPartialRepaymentControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f70496p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i f70497q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i1j.a f70498r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p f70499s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f f70500t;
    public final w80.b u;
    public final b55.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final f15.a f70501w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final LoanRepaymentAccountModelExtension f70502x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final y f70503y;
    public final com.revolut.kompot.navigable.vc.modal.a z;

    public a(n mapper, LoanPartialRepaymentControllerContract$InputData inputData, b loanInteractor, i loanProductInteractor, i1j.a loansRepaymentBalancesFilterInteractor, p loanStateExplainerMapper, f loanDialogMapper, w80.b amountFormatter, b55.b loanHelpRequestProvider, f15.a getCreditHelpExtension, LoanRepaymentAccountModelExtension repaymentAccountPickerModelExtension) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(loanInteractor, "loanInteractor");
        Intrinsics.checkNotNullParameter(loanProductInteractor, "loanProductInteractor");
        Intrinsics.checkNotNullParameter(loansRepaymentBalancesFilterInteractor, "loansRepaymentBalancesFilterInteractor");
        Intrinsics.checkNotNullParameter(loanStateExplainerMapper, "loanStateExplainerMapper");
        Intrinsics.checkNotNullParameter(loanDialogMapper, "loanDialogMapper");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(loanHelpRequestProvider, "loanHelpRequestProvider");
        Intrinsics.checkNotNullParameter(getCreditHelpExtension, "getCreditHelpExtension");
        Intrinsics.checkNotNullParameter(repaymentAccountPickerModelExtension, "repaymentAccountPickerModelExtension");
        this.o = inputData;
        this.f70496p = loanInteractor;
        this.f70497q = loanProductInteractor;
        this.f70498r = loansRepaymentBalancesFilterInteractor;
        this.f70499s = loanStateExplainerMapper;
        this.f70500t = loanDialogMapper;
        this.u = amountFormatter;
        this.v = loanHelpRequestProvider;
        this.f70501w = getCreditHelpExtension;
        this.f70502x = repaymentAccountPickerModelExtension;
        this.f70503y = d.b(this, new q75.f(new Data(null, null, true, 3, null), new Data(null, null, false, 7, null), null), mapper, null, false, 12);
        this.z = e.a(this, new f0(this, 3));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.credit.loan.impl.ui.rev10.repayamount.a r5, dj0.d r6, gim.c r7) {
        /*
            r5.getClass()
            boolean r0 = r7 instanceof q75.p
            if (r0 == 0) goto L16
            r0 = r7
            q75.p r0 = (q75.p) r0
            int r1 = r0.f242756w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f242756w = r1
            goto L1b
        L16:
            q75.p r0 = new q75.p
            r0.<init>(r5, r7)
        L1b:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f242756w
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L45
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            yhm.o.b(r7)
            q75.q r7 = new q75.q
            r2 = 0
            r4 = 0
            r7.<init>(r5, r6, r4, r2)
            r0.f242756w = r3
            java.lang.Object r7 = r5.p2(r0, r7)
            if (r7 != r1) goto L45
            return r1
        L45:
            java.lang.String r5 = "withLoading(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.loan.impl.ui.rev10.repayamount.a.I2(com.revolut.feature.credit.loan.impl.ui.rev10.repayamount.a, dj0.d, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        String str = this.o.f70488a;
        i iVar = this.f70497q;
        w4l.h hVar = w4l.h.f294642c;
        Continuation continuation = null;
        int i = 29;
        l.a1(this, nim.a.v(a.a.k(u0.i(rd0.e.b(iVar.a(str, hVar)), rd0.e.b(iVar.b(str, hVar)), this.f70502x.c3(str, null)), new q3d.i(28)), new q3d.i(i)), null, null, new r(this, continuation, 1), 3);
        int i2 = 0;
        q0 q0Var = new q0(v7.w(this.f70503y.B(new q75.n(i2))), new m(this, continuation, 7), 1);
        b.Companion companion = kotlin.time.b.INSTANCE;
        l.a1(this, q.Q(t1.f(q0Var, c.g(700, pkm.e.MILLISECONDS)), new x(continuation, this, i)), null, null, new r(this, continuation, i2), 3);
    }

    public final LoanDetails J2() {
        q75.e eVar = (q75.e) ((q75.f) ((j2) this.f70503y.f22677a).getValue()).f242745a.getContent();
        if (eVar != null) {
            return eVar.f242743b;
        }
        return null;
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.z;
    }

    public final LoanRepaymentAccountModelExtension.RepaymentAccountState K2() {
        return ((q75.e) zi0.c.I(((q75.f) ((j2) this.f70503y.f22677a).getValue()).f242745a)).f242744c;
    }

    @Override // cli.z
    public final g getState() {
        return this.f70503y;
    }
}
