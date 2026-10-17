package pfa;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final onh.b f235564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uia.a f235565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f235566c;
    public final m d;

    public l(onh.b postActivationStatusProvider, uia.a proPostActivationCommandFactory, a planSelectionDestinationResolver, m retailCreditOnboardingNavigationProvider) {
        Intrinsics.checkNotNullParameter(postActivationStatusProvider, "postActivationStatusProvider");
        Intrinsics.checkNotNullParameter(proPostActivationCommandFactory, "proPostActivationCommandFactory");
        Intrinsics.checkNotNullParameter(planSelectionDestinationResolver, "planSelectionDestinationResolver");
        Intrinsics.checkNotNullParameter(retailCreditOnboardingNavigationProvider, "retailCreditOnboardingNavigationProvider");
        this.f235564a = postActivationStatusProvider;
        this.f235565b = proPostActivationCommandFactory;
        this.f235566c = planSelectionDestinationResolver;
        this.d = retailCreditOnboardingNavigationProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.kompot.bridge.navigation.BridgeDestination r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof pfa.j
            if (r0 == 0) goto L13
            r0 = r6
            pfa.j r0 = (pfa.j) r0
            int r1 = r0.f235562x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f235562x = r1
            goto L18
        L13:
            pfa.j r0 = new pfa.j
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f235562x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.kompot.bridge.navigation.BridgeDestination r5 = r0.u
            yhm.o.b(r6)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            r0.u = r5
            r0.f235562x = r3
            java.lang.Object r6 = r4.b(r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            aii.u r6 = (aii.u) r6
            if (r6 == 0) goto L49
            hfa.b r5 = new hfa.b
            r5.<init>(r6)
            return r5
        L49:
            hfa.a r6 = new hfa.a
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: pfa.l.a(com.revolut.kompot.bridge.navigation.BridgeDestination, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d7, code lost:
    
        if (r9 == r1) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r9) {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pfa.l.b(gim.c):java.lang.Object");
    }
}
