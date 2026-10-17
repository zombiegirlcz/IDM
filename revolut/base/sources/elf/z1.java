package elf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class z1 extends yji.n implements s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ppg.b f127443l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final kpg.a f127444m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final clc.b f127445n;

    public z1(ppg.b vaultsInteractor, kpg.a vaultProductAccountsNavigationProvider, clc.b roboOnboardingEntryCommandFactory) {
        Intrinsics.checkNotNullParameter(vaultsInteractor, "vaultsInteractor");
        Intrinsics.checkNotNullParameter(vaultProductAccountsNavigationProvider, "vaultProductAccountsNavigationProvider");
        Intrinsics.checkNotNullParameter(roboOnboardingEntryCommandFactory, "roboOnboardingEntryCommandFactory");
        this.f127443l = vaultsInteractor;
        this.f127444m = vaultProductAccountsNavigationProvider;
        this.f127445n = roboOnboardingEntryCommandFactory;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(java.lang.Object r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof elf.x1
            if (r0 == 0) goto L13
            r0 = r6
            elf.x1 r0 = (elf.x1) r0
            int r1 = r0.f127438x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f127438x = r1
            goto L18
        L13:
            elf.x1 r0 = new elf.x1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f127438x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            elf.z1 r5 = r0.u
            yhm.o.b(r6)
            goto L4b
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            java.lang.String r6 = "null cannot be cast to non-null type kotlin.String"
            kotlin.jvm.internal.Intrinsics.i(r5, r6)
            java.lang.String r5 = (java.lang.String) r5
            r0.u = r4
            r0.f127438x = r3
            clc.b r6 = r4.f127445n
            com.revolut.feature.robo.impl.navigation.c r6 = (com.revolut.feature.robo.impl.navigation.c) r6
            java.lang.Object r6 = r6.d(r5, r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            r5 = r4
        L4b:
            aii.u r6 = (aii.u) r6
            r5.A2(r6)
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: elf.z1.Z2(java.lang.Object, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(java.lang.Object r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof elf.y1
            if (r0 == 0) goto L13
            r0 = r6
            elf.y1 r0 = (elf.y1) r0
            int r1 = r0.f127440w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f127440w = r1
            goto L18
        L13:
            elf.y1 r0 = new elf.y1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f127440w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L58
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            java.lang.String r6 = "null cannot be cast to non-null type kotlin.String"
            kotlin.jvm.internal.Intrinsics.i(r5, r6)
            java.lang.String r5 = (java.lang.String) r5
            w4l.h r6 = w4l.h.f294642c
            ppg.b r2 = r4.f127443l
            ypg.p r2 = (ypg.p) r2
            efm.r r5 = r2.j(r5, r6)
            ej9.t r6 = new ej9.t
            r2 = 24
            r6.<init>(r2)
            r2 = 0
            efm.r r5 = m70.a.g(r5, r2, r6, r3)
            r0.f127440w = r3
            java.lang.Object r6 = nim.a.c(r5, r0)
            if (r6 != r1) goto L58
            return r1
        L58:
            pcd.s r6 = (pcd.s) r6
            kotlin.jvm.internal.Intrinsics.h(r6)
            kpg.a r5 = r4.f127444m
            aqg.b r5 = (aqg.b) r5
            com.revolut.retail.core.navigation.FeatureCommand r5 = r5.a(r6)
            com.revolut.kompot.bridge.navigation.BridgeDestination r5 = zh9.u0.b(r5)
            r4.A2(r5)
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: elf.z1.b3(java.lang.Object, gim.c):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
    @Override // elf.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.Object r9, java.lang.String r10, kotlin.coroutines.Continuation r11) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: elf.z1.c(java.lang.Object, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
