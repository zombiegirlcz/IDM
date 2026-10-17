package ahf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wsg.n f5074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c9e.c f5075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z8e.a f5076c;

    public c0(wsg.n walletInteractor, c9e.c subscriptionNavigationProvider, z8e.a subscriptionsAppNavigationProvider) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(subscriptionNavigationProvider, "subscriptionNavigationProvider");
        Intrinsics.checkNotNullParameter(subscriptionsAppNavigationProvider, "subscriptionsAppNavigationProvider");
        this.f5074a = walletInteractor;
        this.f5075b = subscriptionNavigationProvider;
        this.f5076c = subscriptionsAppNavigationProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(qua.p r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ahf.a0
            if (r0 == 0) goto L13
            r0 = r6
            ahf.a0 r0 = (ahf.a0) r0
            int r1 = r0.f5069w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5069w = r1
            goto L18
        L13:
            ahf.a0 r0 = new ahf.a0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f5069w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L43
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            c9e.c r6 = r4.f5075b
            rae.c r6 = (rae.c) r6
            efm.d0 r5 = r6.c(r5, r3)
            r0.f5069w = r3
            java.lang.Object r6 = nim.a.b(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            java.lang.String r5 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r5)
            com.revolut.retail.core.navigation.NaviCommand r6 = (com.revolut.retail.core.navigation.NaviCommand) r6
            com.revolut.kompot.bridge.navigation.BridgeDestination r5 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            r5.<init>(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ahf.c0.a(qua.p, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.core.model.account.AccountId r24, gim.c r25) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ahf.c0.b(com.revolut.core.model.account.AccountId, gim.c):java.lang.Object");
    }
}
