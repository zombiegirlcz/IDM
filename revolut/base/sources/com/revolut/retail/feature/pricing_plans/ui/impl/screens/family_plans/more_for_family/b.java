package com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.more_for_family;

import g48.r0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends okk.i {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final o38.a f103443l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final r0 f103444m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final okk.b f103445n;

    public b(o38.a jointNavigationProvider, r0 jointAccountsInteractor, okk.b juniorNavigationProvider) {
        Intrinsics.checkNotNullParameter(jointNavigationProvider, "jointNavigationProvider");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(juniorNavigationProvider, "juniorNavigationProvider");
        this.f103443l = jointNavigationProvider;
        this.f103444m = jointAccountsInteractor;
        this.f103445n = juniorNavigationProvider;
    }

    @Override // okk.i
    public final void Z2(MoreForFamilyScreenContract$ClickParcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        T2(new oh4.i(this, parcel, (Continuation) null, 6), new yi5.b(27));
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x007d, code lost:
    
        if (r8 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(gim.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof okk.a
            if (r0 == 0) goto L13
            r0 = r8
            okk.a r0 = (okk.a) r0
            int r1 = r0.f226132w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f226132w = r1
            goto L18
        L13:
            okk.a r0 = new okk.a
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f226132w
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r8)
            goto L80
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L33:
            yhm.o.b(r8)
            goto L5c
        L37:
            yhm.o.b(r8)
            n38.q r8 = n38.q.ACTIVE
            n38.q r2 = n38.q.OFFBOARDING
            n38.q r6 = n38.q.PENDING
            n38.q[] r8 = new n38.q[]{r8, r2, r6}
            java.lang.String r2 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r2)
            java.util.Set r8 = kotlin.collections.d.y0(r8)
            g48.r0 r2 = r7.f103444m
            wkm.l r8 = k38.c.a(r2, r4, r8, r5)
            r0.f226132w = r5
            java.lang.Object r8 = vkm.q.x(r8, r0)
            if (r8 != r1) goto L5c
            goto L7f
        L5c:
            com.revolut.core.model.account.AccountId$Joint r8 = (com.revolut.core.model.account.AccountId.Joint) r8
            if (r8 == 0) goto L6f
            com.revolut.feature.retail.savings.api.creation.navigation.SavingsAccountCreationFlow$Destination r0 = new com.revolut.feature.retail.savings.api.creation.navigation.SavingsAccountCreationFlow$Destination
            com.revolut.feature.vaults.common.SavingAccountType$Joint r1 = new com.revolut.feature.vaults.common.SavingAccountType$Joint
            java.lang.String r8 = r8.f51412a
            r1.<init>(r8)
            r8 = 13
            r0.<init>(r4, r1, r8)
            return r0
        L6f:
            o38.a r8 = r7.f103443l
            l48.e r8 = (l48.e) r8
            ufm.i r8 = r8.b()
            r0.f226132w = r3
            java.lang.Object r8 = nim.a.b(r8, r0)
            if (r8 != r1) goto L80
        L7f:
            return r1
        L80:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r0)
            com.revolut.retail.core.navigation.NaviCommand r8 = (com.revolut.retail.core.navigation.NaviCommand) r8
            com.revolut.kompot.bridge.navigation.BridgeDestination r8 = zh9.u0.b(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.more_for_family.b.b3(gim.c):java.lang.Object");
    }
}
