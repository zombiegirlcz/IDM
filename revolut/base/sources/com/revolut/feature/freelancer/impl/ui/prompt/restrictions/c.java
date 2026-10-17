package com.revolut.feature.freelancer.impl.ui.prompt.restrictions;

import kotlin.jvm.internal.Intrinsics;
import oki.h;
import r10.d;
import yki.i;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends h implements i17.b {
    public final ct6.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AccountRestrictionsPromptFlowContract$InputData f74108p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d f74109q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f74110r;

    public c(ct6.b accountRestrictionPromptFactory, AccountRestrictionsPromptFlowContract$InputData inputData, d legalEntityProviderFactory) {
        Intrinsics.checkNotNullParameter(accountRestrictionPromptFactory, "accountRestrictionPromptFactory");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(legalEntityProviderFactory, "legalEntityProviderFactory");
        this.o = accountRestrictionPromptFactory;
        this.f74108p = inputData;
        this.f74109q = legalEntityProviderFactory;
        this.f74110r = d8l.d.a(this, new hw9.b(this, 19));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.freelancer.impl.ui.prompt.restrictions.c r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof i17.c
            if (r0 == 0) goto L13
            r0 = r7
            i17.c r0 = (i17.c) r0
            int r1 = r0.f157587w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f157587w = r1
            goto L18
        L13:
            i17.c r0 = new i17.c
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f157587w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L3d
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            r10.d r6 = r6.f74109q
            r0.f157587w = r3
            java.lang.Object r7 = r6.V(r0)
            if (r7 != r1) goto L3d
            return r1
        L3d:
            wc6.a r7 = (wc6.a) r7
            md6.a r0 = new md6.a
            md6.e r1 = md6.e.PRO
            md6.f r4 = md6.f.AGGREGATED
            r5 = 54
            r2 = 0
            r3 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            com.revolut.core.ui_kit.models.Clause r6 = r7.b(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.freelancer.impl.ui.prompt.restrictions.c.I2(com.revolut.feature.freelancer.impl.ui.prompt.restrictions.c, gim.c):java.lang.Object");
    }

    @Override // yki.j
    public final void M0() {
        l2(new b(this, null), new yi5.b(26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f74110r;
    }
}
