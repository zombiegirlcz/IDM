package ba8;

import cu8.r0;
import kotlin.jvm.internal.Intrinsics;
import ybl.k;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f13990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1l.e f13991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r0 f13992c;
    public final hj8.a d;

    public f(k tradingAccountsInteractor, c1l.e tradingOnboardingStartCommandProvider, r0 kycRequiredActionTransformer, hj8.a juniorProfileInteractor) {
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(tradingOnboardingStartCommandProvider, "tradingOnboardingStartCommandProvider");
        Intrinsics.checkNotNullParameter(kycRequiredActionTransformer, "kycRequiredActionTransformer");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        this.f13990a = tradingAccountsInteractor;
        this.f13991b = tradingOnboardingStartCommandProvider;
        this.f13992c = kycRequiredActionTransformer;
        this.d = juniorProfileInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof ba8.c
            if (r0 == 0) goto L13
            r0 = r7
            ba8.c r0 = (ba8.c) r0
            int r1 = r0.f13985w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13985w = r1
            goto L18
        L13:
            ba8.c r0 = new ba8.c
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f13985w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r7)
            goto L4f
        L28:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L30:
            yhm.o.b(r7)
            hj8.a r7 = r6.d
            w4l.h r2 = w4l.h.f294642c
            wkm.l r7 = hj8.a.e(r7, r2)
            b6d.a r2 = new b6d.a
            r5 = 29
            r2.<init>(r5)
            jhi.b r7 = mo3.a.g(r7, r4, r2, r3)
            r0.f13985w = r3
            java.lang.Object r7 = vkm.q.z(r7, r0)
            if (r7 != r1) goto L4f
            return r1
        L4f:
            java.util.List r7 = (java.util.List) r7
            boolean r7 = ue0.e.n(r7)
            if (r7 == 0) goto L5d
            com.revolut.feature.junior.isa.api.navigation.JuniorIsaDestination$JISAChildCreationDestination r7 = new com.revolut.feature.junior.isa.api.navigation.JuniorIsaDestination$JISAChildCreationDestination
            r7.<init>(r4)
            return r7
        L5d:
            com.revolut.feature.junior.isa.impl.navigation.JuniorIsaInternalDestination$ChildPickerDestination r7 = com.revolut.feature.junior.isa.impl.navigation.JuniorIsaInternalDestination.ChildPickerDestination.f76745a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ba8.f.a(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0059, code lost:
    
        if (r6 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ba8.d
            if (r0 == 0) goto L13
            r0 = r6
            ba8.d r0 = (ba8.d) r0
            int r1 = r0.f13986w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13986w = r1
            goto L18
        L13:
            ba8.d r0 = new ba8.d
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f13986w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r6)
            goto L5c
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            yhm.o.b(r6)
            goto L44
        L36:
            yhm.o.b(r6)
            r0.f13986w = r4
            cu8.r0 r6 = r5.f13992c
            java.lang.Object r6 = ks8.m.b(r6, r0)
            if (r6 != r1) goto L44
            goto L5b
        L44:
            ks8.j r6 = (ks8.j) r6
            boolean r2 = r6 instanceof ks8.i
            if (r2 == 0) goto L4f
            ks8.i r6 = (ks8.i) r6
            com.revolut.retail.core.navigation.FeatureCommand r6 = r6.f189312a
            return r6
        L4f:
            boolean r6 = r6 instanceof ks8.j.a
            if (r6 == 0) goto L63
            r0.f13986w = r3
            java.lang.Object r6 = r5.a(r0)
            if (r6 != r1) goto L5c
        L5b:
            return r1
        L5c:
            com.revolut.kompot.common.StackDestination r6 = (com.revolut.kompot.common.StackDestination) r6
            com.revolut.retail.core.navigation.FeatureCommand r6 = zh9.u0.f(r6)
            return r6
        L63:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ba8.f.b(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ba, code lost:
    
        if (r0 == r2) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r14, com.revolut.retail.core.navigation.FeatureCommand r15, com.revolut.retail.core.navigation.NaviCommand r16, gim.c r17) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ba8.f.c(java.lang.String, com.revolut.retail.core.navigation.FeatureCommand, com.revolut.retail.core.navigation.NaviCommand, gim.c):java.lang.Object");
    }
}
