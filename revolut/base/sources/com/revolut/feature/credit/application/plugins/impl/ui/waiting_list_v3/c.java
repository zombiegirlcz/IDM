package com.revolut.feature.credit.application.plugins.impl.ui.waiting_list_v3;

import d8l.d;
import hw3.n;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yki.i;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends h implements oj4.a {
    public final WaitingListV3FlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n f68527p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y80.a f68528q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f68529r;

    public c(WaitingListV3FlowContract$InputData inputData, n creditWaitingListInteractor, y80.a permissionProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditWaitingListInteractor, "creditWaitingListInteractor");
        Intrinsics.checkNotNullParameter(permissionProvider, "permissionProvider");
        this.o = inputData;
        this.f68527p = creditWaitingListInteractor;
        this.f68528q = permissionProvider;
        this.f68529r = d.a(this, new oa4.c(this, 20));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.credit.application.plugins.impl.ui.waiting_list_v3.c r8, gim.c r9) {
        /*
            boolean r0 = r9 instanceof oj4.e
            if (r0 == 0) goto L14
            r0 = r9
            oj4.e r0 = (oj4.e) r0
            int r1 = r0.f225729w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f225729w = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            oj4.e r0 = new oj4.e
            r0.<init>(r8, r9)
            goto L12
        L1a:
            java.lang.Object r9 = r6.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.f225729w
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            yhm.o.b(r9)
            r1 = r8
            goto L56
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            yhm.o.b(r9)
            ku1.v r4 = new ku1.v
            r9 = 12
            r4.<init>(r9)
            o9a.v r3 = new o9a.v
            r9 = 3
            r3.<init>(r9)
            mtd.e r5 = new mtd.e
            r9 = 0
            r1 = 24
            r5.<init>(r8, r9, r1)
            r6.f225729w = r2
            r2 = 0
            r7 = 1
            r1 = r8
            java.lang.Object r9 = n14.k.Q(r1, r2, r3, r4, r5, r6, r7)
            if (r9 != r0) goto L56
            return r0
        L56:
            nii.e r9 = (nii.e) r9
            boolean r8 = r9 instanceof nii.d
            if (r8 == 0) goto L69
            yki.i r2 = r1.f68529r
            r6 = 0
            r7 = 12
            com.revolut.feature.credit.application.plugins.impl.ui.waiting_list_v3.WaitingListV3FlowContract$Step$Dashboard r3 = com.revolut.feature.credit.application.plugins.impl.ui.waiting_list_v3.WaitingListV3FlowContract$Step.Dashboard.f68524a
            r4 = 0
            r5 = 0
            oki.h.t2(r1, r2, r3, r4, r5, r6, r7)
            goto L6d
        L69:
            boolean r8 = r9 instanceof nii.c
            if (r8 == 0) goto L70
        L6d:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L70:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.waiting_list_v3.c.I2(com.revolut.feature.credit.application.plugins.impl.ui.waiting_list_v3.c, gim.c):java.lang.Object");
    }

    @Override // yki.j
    public final void M0() {
        l2(new oj4.c(this, null, 1), new oj4.b(this, 0));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f68529r;
    }
}
