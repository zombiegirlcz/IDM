package opf;

import kotlin.jvm.internal.Intrinsics;
import om4.k0;

/* JADX INFO: loaded from: classes9.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wsg.n f227615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f227616b;

    public e(wsg.n walletInteractor, k0 creditCardFeatureInteractor) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(creditCardFeatureInteractor, "creditCardFeatureInteractor");
        this.f227615a = walletInteractor;
        this.f227616b = creditCardFeatureInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(io3.d r6, com.revolut.feature.transfer.core.models.CurrencyFilteringPolicy r7, gim.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof opf.d
            if (r0 == 0) goto L13
            r0 = r8
            opf.d r0 = (opf.d) r0
            int r1 = r0.f227611y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f227611y = r1
            goto L18
        L13:
            opf.d r0 = new opf.d
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f227609w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f227611y
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.revolut.feature.transfer.core.models.CurrencyFilteringPolicy r7 = r0.v
            io3.d r6 = r0.u
            yhm.o.b(r8)
            goto L4f
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            yhm.o.b(r8)
            io3.l r8 = r6.e
            io3.l r2 = io3.l.CREDIT
            if (r8 != r2) goto L5a
            java.lang.String r8 = r6.f163145a
            r0.u = r6
            r0.v = r7
            r0.f227611y = r3
            yw4.f r2 = yw4.f.POCKET_TRANSFER
            om4.k0 r4 = r5.f227616b
            java.lang.Object r8 = r4.d(r8, r2, r0)
            if (r8 != r1) goto L4f
            return r1
        L4f:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L5a
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        L5a:
            boolean r8 = r7 instanceof com.revolut.feature.transfer.core.models.CurrencyFilteringPolicy.Exclude
            if (r8 == 0) goto L6d
            com.revolut.feature.transfer.core.models.CurrencyFilteringPolicy$Exclude r7 = (com.revolut.feature.transfer.core.models.CurrencyFilteringPolicy.Exclude) r7
            java.util.Set r7 = r7.f92234a
            java.lang.String r6 = r6.f163147c
            boolean r6 = r7.contains(r6)
            if (r6 != 0) goto L6b
            goto L84
        L6b:
            r3 = 0
            goto L84
        L6d:
            boolean r8 = r7 instanceof com.revolut.feature.transfer.core.models.CurrencyFilteringPolicy.IncludeOnly
            if (r8 == 0) goto L7c
            com.revolut.feature.transfer.core.models.CurrencyFilteringPolicy$IncludeOnly r7 = (com.revolut.feature.transfer.core.models.CurrencyFilteringPolicy.IncludeOnly) r7
            java.util.Set r7 = r7.f92236a
            java.lang.String r6 = r6.f163147c
            boolean r3 = r7.contains(r6)
            goto L84
        L7c:
            com.revolut.feature.transfer.core.models.CurrencyFilteringPolicy$IncludeAll r6 = com.revolut.feature.transfer.core.models.CurrencyFilteringPolicy.IncludeAll.f92235a
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r7, r6)
            if (r6 == 0) goto L89
        L84:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        L89:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: opf.e.a(io3.d, com.revolut.feature.transfer.core.models.CurrencyFilteringPolicy, gim.c):java.lang.Object");
    }
}
