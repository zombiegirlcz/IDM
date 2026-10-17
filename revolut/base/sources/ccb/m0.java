package ccb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ppg.b f23006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wsg.n f23007b;

    public m0(ppg.b vaultsInteractor, wsg.n walletInteractor) {
        Intrinsics.checkNotNullParameter(vaultsInteractor, "vaultsInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.f23006a = vaultsInteractor;
        this.f23007b = walletInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable a(ccb.g0 r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof ccb.k0
            if (r0 == 0) goto L13
            r0 = r8
            ccb.k0 r0 = (ccb.k0) r0
            int r1 = r0.f23001x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23001x = r1
            goto L18
        L13:
            ccb.k0 r0 = new ccb.k0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f23001x
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            ccb.g0 r7 = r0.u
            yhm.o.b(r8)     // Catch: java.lang.Throwable -> L2a
            goto L4c
        L2a:
            r7 = move-exception
            goto L70
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            yhm.o.b(r8)
            wsg.n r8 = r6.f23007b     // Catch: java.lang.Throwable -> L2a
            java.lang.String r2 = r7.f22987a     // Catch: java.lang.Throwable -> L2a
            com.revolut.core.model.account.AccountId r5 = r7.f22988b     // Catch: java.lang.Throwable -> L2a
            efm.d0 r8 = r8.z(r5, r2)     // Catch: java.lang.Throwable -> L2a
            r0.u = r7     // Catch: java.lang.Throwable -> L2a
            r0.f23001x = r3     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r8 = nim.a.b(r8, r0)     // Catch: java.lang.Throwable -> L2a
            if (r8 != r1) goto L4c
            return r1
        L4c:
            io3.d r8 = (io3.d) r8     // Catch: java.lang.Throwable -> L2a
            com.revolut.core.model.account.AccountId r8 = r7.f22988b
            boolean r0 = r8 instanceof com.revolut.core.model.account.AccountId.Joint
            if (r0 == 0) goto L57
            com.revolut.feature.tab.accounts.models.ProductId r8 = com.revolut.feature.tab.accounts.models.ProductId.JOINT
            goto L5d
        L57:
            boolean r8 = r8 instanceof com.revolut.core.model.account.AccountId.Personal
            if (r8 == 0) goto L6a
            com.revolut.feature.tab.accounts.models.ProductId r8 = com.revolut.feature.tab.accounts.models.ProductId.CURRENCY
        L5d:
            com.revolut.feature.tab.accounts.models.ProductAccountId r0 = new com.revolut.feature.tab.accounts.models.ProductAccountId
            java.lang.String r7 = r7.f22987a
            r0.<init>(r7, r4)
            kotlin.Pair r7 = new kotlin.Pair
            r7.<init>(r8, r0)
            return r7
        L6a:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L70:
            zhm.h0 r8 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            rd0.d.a(r0, r4, r4, r7, r8)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ccb.m0.a(ccb.g0, gim.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable b(ccb.h0 r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ccb.j0
            if (r0 == 0) goto L13
            r0 = r6
            ccb.j0 r0 = (ccb.j0) r0
            int r1 = r0.f22999w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22999w = r1
            goto L18
        L13:
            ccb.j0 r0 = new ccb.j0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f22999w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L4b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            java.lang.String r5 = r5.f22989a
            w4l.h r6 = w4l.h.f294642c
            ppg.b r2 = r4.f23006a
            ypg.p r2 = (ypg.p) r2
            efm.r r5 = r2.j(r5, r6)
            vkm.d r5 = rd0.e.b(r5)
            r0.f22999w = r3
            java.lang.Object r6 = vkm.q.x(r5, r0)
            if (r6 != r1) goto L4b
            return r1
        L4b:
            com.revolut.data.model.Data r6 = (com.revolut.data.model.Data) r6
            java.lang.Object r5 = r6.getContent()
            pcd.s r5 = (pcd.s) r5
            r6 = 0
            if (r5 == 0) goto L88
            pcd.b r0 = r5.f234889n
            int[] r1 = ccb.i0.f22998a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r3) goto L77
            r1 = 2
            if (r0 == r1) goto L77
            r1 = 3
            if (r0 == r1) goto L75
            r1 = 4
            if (r0 == r1) goto L75
            r1 = 5
            if (r0 != r1) goto L6f
            goto L75
        L6f:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L75:
            r0 = r6
            goto L79
        L77:
            com.revolut.feature.tab.accounts.models.ProductId r0 = com.revolut.feature.tab.accounts.models.ProductId.SAVINGS
        L79:
            if (r0 == 0) goto L88
            com.revolut.feature.tab.accounts.models.ProductAccountId r1 = new com.revolut.feature.tab.accounts.models.ProductAccountId
            java.lang.String r5 = r5.f234881a
            r1.<init>(r5, r6)
            kotlin.Pair r5 = new kotlin.Pair
            r5.<init>(r0, r1)
            return r5
        L88:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ccb.m0.b(ccb.h0, gim.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(ccb.f0 r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof ccb.l0
            if (r0 == 0) goto L13
            r0 = r7
            ccb.l0 r0 = (ccb.l0) r0
            int r1 = r0.f23003w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23003w = r1
            goto L18
        L13:
            ccb.l0 r0 = new ccb.l0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f23003w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r7)
            goto L54
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L30:
            yhm.o.b(r7)
            r0.f23003w = r3
            boolean r7 = r6 instanceof ccb.g0
            if (r7 == 0) goto L41
            ccb.g0 r6 = (ccb.g0) r6
            java.io.Serializable r6 = r5.a(r6, r0)
        L3f:
            r7 = r6
            goto L51
        L41:
            boolean r7 = r6 instanceof ccb.h0
            if (r7 == 0) goto L4c
            ccb.h0 r6 = (ccb.h0) r6
            java.io.Serializable r6 = r5.b(r6, r0)
            goto L3f
        L4c:
            boolean r6 = r6 instanceof ccb.f0.a
            if (r6 == 0) goto L74
            r7 = r4
        L51:
            if (r7 != r1) goto L54
            return r1
        L54:
            kotlin.Pair r7 = (kotlin.Pair) r7
            if (r7 == 0) goto L73
            java.lang.Object r6 = r7.f186385a
            com.revolut.feature.tab.accounts.models.ProductId r6 = (com.revolut.feature.tab.accounts.models.ProductId) r6
            java.lang.Object r7 = r7.f186386b
            com.revolut.feature.tab.accounts.models.ProductAccountId r7 = (com.revolut.feature.tab.accounts.models.ProductAccountId) r7
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r0 = ibb.c.f160140a
            com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig r1 = new com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig
            com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value$Main r2 = new com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value$Main
            r2.<init>(r7, r6)
            r1.<init>(r2, r4)
            r6 = 12
            com.revolut.retail.core.navigation.FeatureCommand r6 = jbb.a.a(r0, r1, r4, r4, r6)
            return r6
        L73:
            return r4
        L74:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ccb.m0.c(ccb.f0, gim.c):java.lang.Object");
    }
}
