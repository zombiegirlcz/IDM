package com.revolut.feature.credit.loan.impl.ui.rev10.paymentmanagement.confirm;

import ac4.g;
import c45.d;
import cli.y;
import com.revolut.data.model.Data;
import g75.e;
import g75.f;
import g75.l;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import y45.i;
import yi5.b;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends h implements f {
    public final CreateMandateConfirmationControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b45.h f70464p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i f70465q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final m35.f f70466r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d f70467s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f70468t;
    public final com.revolut.kompot.navigable.vc.modal.a u;

    public a(CreateMandateConfirmationControllerContract$InputData inputData, b45.h loanAutopayInteractor, i loanProductInteractor, m35.f loanDialogMapper, d loanAutopayErrorHandler, g stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(loanAutopayInteractor, "loanAutopayInteractor");
        Intrinsics.checkNotNullParameter(loanProductInteractor, "loanProductInteractor");
        Intrinsics.checkNotNullParameter(loanDialogMapper, "loanDialogMapper");
        Intrinsics.checkNotNullParameter(loanAutopayErrorHandler, "loanAutopayErrorHandler");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f70464p = loanAutopayInteractor;
        this.f70465q = loanProductInteractor;
        this.f70466r = loanDialogMapper;
        this.f70467s = loanAutopayErrorHandler;
        this.f70468t = mra.d.b(this, new e(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.u = hx7.e.a(this, new g75.i(this, 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0073, code lost:
    
        if (nim.a.a(r13, r1) == r2) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.credit.loan.impl.ui.rev10.paymentmanagement.confirm.a r12, gim.c r13) throws java.lang.Throwable {
        /*
            com.revolut.feature.credit.loan.impl.ui.rev10.paymentmanagement.confirm.CreateMandateConfirmationControllerContract$InputData r0 = r12.o
            boolean r1 = r13 instanceof g75.j
            if (r1 == 0) goto L15
            r1 = r13
            g75.j r1 = (g75.j) r1
            int r2 = r1.f141120w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f141120w = r2
            goto L1a
        L15:
            g75.j r1 = new g75.j
            r1.<init>(r12, r13)
        L1a:
            java.lang.Object r13 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f141120w
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L38
            if (r3 == r5) goto L34
            if (r3 != r4) goto L2c
            yhm.o.b(r13)
            goto L76
        L2c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L34:
            yhm.o.b(r13)
            goto L61
        L38:
            yhm.o.b(r13)
            b45.h r13 = r12.f70464p
            java.lang.String r8 = r0.f70461a
            x35.e r9 = r0.f70462b
            r1.f141120w = r5
            zjh.j r7 = r13.f12178a
            e38.c r6 = new e38.c
            r11 = 2
            r10 = 0
            r6.<init>(r7, r8, r9, r10, r11)
            skm.p0 r13 = skm.p0.f264001a
            elm.f r13 = elm.f.f127540b
            java.lang.Object r13 = skm.e0.J(r13, r6, r1)
            if (r13 != r2) goto L57
            goto L59
        L57:
            kotlin.Unit r13 = kotlin.Unit.f186387a
        L59:
            if (r13 != r2) goto L5c
            goto L5e
        L5c:
            kotlin.Unit r13 = kotlin.Unit.f186387a
        L5e:
            if (r13 != r2) goto L61
            goto L75
        L61:
            y45.i r13 = r12.f70465q
            java.lang.String r0 = r0.f70461a
            efm.b r13 = r13.g(r0)
            pfm.a r13 = ue0.e.v(r13)
            r1.f141120w = r4
            java.lang.Object r13 = nim.a.a(r13, r1)
            if (r13 != r2) goto L76
        L75:
            return r2
        L76:
            g75.g r13 = g75.g.f141114a
            r12.C2(r13)
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.loan.impl.ui.rev10.paymentmanagement.confirm.a.I2(com.revolut.feature.credit.loan.impl.ui.rev10.paymentmanagement.confirm.a, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        l2(new l(this, null, 0), new b(26));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.u;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f70468t;
    }
}
