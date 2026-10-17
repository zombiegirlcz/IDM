package xkf;

import klf.z2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class v0 extends yji.n implements elf.s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f306779l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final z2 f306780m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final klf.m1 f306781n;
    public final c9e.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final r0 f306782p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final s0 f306783q;

    public v0(klf.h0 commonDataSource, z2 subscriptionDataSource, klf.m1 juniorDataSource, c9e.c subscriptionNavigationProvider, r0 availabilityChecker, s0 mapper) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(subscriptionDataSource, "subscriptionDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(subscriptionNavigationProvider, "subscriptionNavigationProvider");
        Intrinsics.checkNotNullParameter(availabilityChecker, "availabilityChecker");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f306779l = commonDataSource;
        this.f306780m = subscriptionDataSource;
        this.f306781n = juniorDataSource;
        this.o = subscriptionNavigationProvider;
        this.f306782p = availabilityChecker;
        this.f306783q = mapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // elf.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.Object r6, java.lang.String r7, kotlin.coroutines.Continuation r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof xkf.t0
            if (r0 == 0) goto L13
            r0 = r8
            xkf.t0 r0 = (xkf.t0) r0
            int r1 = r0.f306772x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f306772x = r1
            goto L1a
        L13:
            xkf.t0 r0 = new xkf.t0
            gim.c r8 = (gim.c) r8
            r0.<init>(r5, r8)
        L1a:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f306772x
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            xkf.v0 r6 = r0.u
            yhm.o.b(r8)
            goto L5a
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            yhm.o.b(r8)
            java.lang.String r8 = "ID_GO_TO_RECURRING"
            boolean r8 = kotlin.jvm.internal.Intrinsics.f(r7, r8)
            r2 = 0
            c9e.c r4 = r5.o
            if (r8 == 0) goto L69
            java.lang.String r7 = "null cannot be cast to non-null type com.revolut.feature.recurring_payments.api.data.models.RecurringPayment"
            kotlin.jvm.internal.Intrinsics.i(r6, r7)
            qua.p r6 = (qua.p) r6
            rae.c r4 = (rae.c) r4
            efm.d0 r6 = r4.c(r6, r2)
            r0.u = r5
            r0.f306772x = r3
            java.lang.Object r8 = nim.a.b(r6, r0)
            if (r8 != r1) goto L59
            return r1
        L59:
            r6 = r5
        L5a:
            java.lang.String r7 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r7)
            com.revolut.retail.core.navigation.NaviCommand r8 = (com.revolut.retail.core.navigation.NaviCommand) r8
            com.revolut.kompot.bridge.navigation.BridgeDestination r7 = zh9.u0.b(r8)
            r6.A2(r7)
            goto L82
        L69:
            java.lang.String r6 = "ID_GO_TO_SCHEDULED_PAYMENTS"
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r7, r6)
            if (r6 == 0) goto L81
            com.revolut.core.model.account.AccountId$Personal r6 = com.revolut.core.model.account.AccountId.Personal.f51414a
            rae.c r4 = (rae.c) r4
            com.revolut.retail.core.navigation.FeatureCommand r6 = r4.h(r6)
            com.revolut.kompot.bridge.navigation.BridgeDestination r6 = zh9.u0.b(r6)
            r5.A2(r6)
            goto L82
        L81:
            r3 = r2
        L82:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: xkf.v0.c(java.lang.Object, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
