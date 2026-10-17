package com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.flow;

import c45.d;
import c84.t;
import com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.flow.SepaDirectDebitFlowContract$Step;
import e84.e;
import kotlin.jvm.internal.Intrinsics;
import yki.b;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends t implements vh4.a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final SepaDirectDebitFlowContract$InputData f68351p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ey3.a f68352q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final uh4.a f68353r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d f68354s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final yki.a f68355t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(SepaDirectDebitFlowContract$InputData inputData, ey3.a interactor, uh4.a dialogMapper, d loanAutopayErrorHandler, e pluginControllerResolver) {
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(dialogMapper, "dialogMapper");
        Intrinsics.checkNotNullParameter(loanAutopayErrorHandler, "loanAutopayErrorHandler");
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        this.f68351p = inputData;
        this.f68352q = interactor;
        this.f68353r = dialogMapper;
        this.f68354s = loanAutopayErrorHandler;
        this.f68355t = cp5.d.a(this, vh4.d.f289311a[inputData.f68348a.d.ordinal()] == 1 ? SepaDirectDebitFlowContract$Step.RepaymentMethod.f68349a : SepaDirectDebitFlowContract$Step.SetUp.f68350a, f0.f322471a, new cnc.t(this, 6));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        if (r13.invoke(r10, r6) == r0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object P2(com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.flow.a r10, dz3.a r11, c64.d r12, vge.r r13, gim.c r14) {
        /*
            r10.getClass()
            boolean r0 = r14 instanceof vh4.e
            if (r0 == 0) goto L17
            r0 = r14
            vh4.e r0 = (vh4.e) r0
            int r1 = r0.f289313x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r0.f289313x = r1
        L15:
            r6 = r0
            goto L1d
        L17:
            vh4.e r0 = new vh4.e
            r0.<init>(r10, r14)
            goto L15
        L1d:
            java.lang.Object r14 = r6.v
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.f289313x
            r8 = 2
            r2 = 1
            r9 = 0
            if (r1 == 0) goto L3e
            if (r1 == r2) goto L38
            if (r1 != r8) goto L30
            yhm.o.b(r14)
            goto L73
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L38:
            vge.r r13 = r6.u
            yhm.o.b(r14)
            goto L5e
        L3e:
            yhm.o.b(r14)
            a3b.i r4 = new a3b.i
            r14 = 21
            r4.<init>(r10, r11, r14)
            uk9.h r5 = new uk9.h
            r11 = 15
            r5.<init>(r12, r9, r11)
            r6.u = r13
            r6.f289313x = r2
            r2 = 0
            r3 = 0
            r7 = 3
            r1 = r10
            java.lang.Object r14 = n14.k.V(r1, r2, r3, r4, r5, r6, r7)
            if (r14 != r0) goto L5e
            goto L72
        L5e:
            nii.h r14 = (nii.h) r14
            boolean r10 = r14 instanceof nii.g
            if (r10 == 0) goto L76
            nii.g r14 = (nii.g) r14
            java.lang.Object r10 = r14.f216152a
            r6.u = r9
            r6.f289313x = r8
            java.lang.Object r10 = r13.invoke(r10, r6)
            if (r10 != r0) goto L73
        L72:
            return r0
        L73:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        L76:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.flow.a.P2(com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.flow.a, dz3.a, c64.d, vge.r, gim.c):java.lang.Object");
    }

    @Override // yki.g
    public final b s() {
        return this.f68355t;
    }
}
