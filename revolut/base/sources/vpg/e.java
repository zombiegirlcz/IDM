package vpg;

import com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sri.m;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements gpg.b {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f291207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ppg.b f291208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xoj.a f291209c;
    public final kpg.a d;
    public final y91.b e;

    public e(m navigator, ppg.b vaultsInteractor, xoj.a featuresInteractor, kpg.a productAccountsNavigationProvider, y91.b accountsProductFeatureChecker) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(vaultsInteractor, "vaultsInteractor");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(productAccountsNavigationProvider, "productAccountsNavigationProvider");
        Intrinsics.checkNotNullParameter(accountsProductFeatureChecker, "accountsProductFeatureChecker");
        this.f291207a = navigator;
        this.f291208b = vaultsInteractor;
        this.f291209c = featuresInteractor;
        this.d = productAccountsNavigationProvider;
        this.e = accountsProductFeatureChecker;
    }

    public static FeatureCommand b() {
        return jbb.a.a(ibb.c.f160140a, new TabAccountsLaunchConfig(null, null), null, null, 12);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052 A[RETURN] */
    @Override // jf0.d, q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(jf0.c r3) {
        /*
            r2 = this;
            java.lang.String r0 = "deeplink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 1
            java.lang.String r3 = r3.e(r0)
            int r1 = r3.hashCode()
            switch(r1) {
                case -1652796437: goto L48;
                case -1280787949: goto L3f;
                case -823552895: goto L36;
                case -662064810: goto L2d;
                case 276594318: goto L24;
                case 1437329516: goto L1b;
                case 1832105099: goto L12;
                default: goto L11;
            }
        L11:
            goto L50
        L12:
            java.lang.String r1 = "vaults-documents-reacceptance"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L52
            goto L50
        L1b:
            java.lang.String r1 = "money-boxes"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L52
            goto L50
        L24:
            java.lang.String r1 = "high-apy-offer"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L52
            goto L50
        L2d:
            java.lang.String r1 = "create-personal-vault"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L50
            goto L52
        L36:
            java.lang.String r1 = "vaults"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L52
            goto L50
        L3f:
            java.lang.String r1 = "create-group-vault"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L52
            goto L50
        L48:
            java.lang.String r1 = "money-box-invitations"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L52
        L50:
            r3 = 0
            return r3
        L52:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: vpg.e.a(jf0.c):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(jf0.c r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof vpg.d
            if (r0 == 0) goto L13
            r0 = r7
            vpg.d r0 = (vpg.d) r0
            int r1 = r0.f291206w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f291206w = r1
            goto L18
        L13:
            vpg.d r0 = new vpg.d
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f291206w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r7)
            goto L5d
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L30:
            yhm.o.b(r7)
            r7 = 2
            java.lang.String r6 = r6.e(r7)
            ppg.b r7 = r5.f291208b
            ypg.p r7 = (ypg.p) r7
            efm.r r6 = r7.i(r6)
            vo8.t r7 = new vo8.t
            r2 = 9
            r7.<init>(r2)
            efm.r r6 = m70.a.g(r6, r4, r7, r3)
            efm.d0 r6 = r6.firstOrError()
            java.lang.String r7 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            r0.f291206w = r3
            java.lang.Object r7 = nim.a.b(r6, r0)
            if (r7 != r1) goto L5d
            return r1
        L5d:
            pcd.s r7 = (pcd.s) r7
            q06.h r6 = new q06.h
            com.revolut.kompot.bridge.navigation.BridgeDestination r0 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            kotlin.jvm.internal.Intrinsics.h(r7)
            kpg.a r1 = r5.d
            aqg.b r1 = (aqg.b) r1
            com.revolut.retail.core.navigation.FeatureCommand r7 = r1.a(r7)
            r0.<init>(r7)
            q06.b r7 = new q06.b
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r1 = ibb.c.f160140a
            r7.<init>(r1, r4)
            r6.<init>(r0, r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: vpg.e.c(jf0.c, gim.c):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
    
        if (r1.equals("money-boxes") == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007e, code lost:
    
        if (r1.equals("vaults") == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008a, code lost:
    
        if (kotlin.text.d0.W(r8.e(2)) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a1, code lost:
    
        return new q06.h(new com.revolut.kompot.bridge.navigation.BridgeDestination(b()), new q06.b(ibb.c.f160140a, null));
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a8, code lost:
    
        return c(r8, (gim.c) r9);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r8, kotlin.coroutines.Continuation r9) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vpg.e.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fc  */
    @Override // jf0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final efm.d0 f(jf0.c r9, boolean r10) {
        /*
            Method dump skipped, instruction units count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vpg.e.f(jf0.c, boolean):efm.d0");
    }
}
