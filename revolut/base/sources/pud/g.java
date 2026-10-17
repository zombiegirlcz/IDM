package pud;

import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.rev10_main_screen.api.MainScreenTab;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import efm.d0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import rfm.f0;
import sri.m;
import ufm.i;
import wp5.y;
import wsg.n;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements xtd.a, ai5.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f239869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yud.g f239870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f239871c;
    public final xoj.a d;
    public final ai5.b e;
    public final FeatureCommand f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q06.b f239872g;

    public g(m navigator, yud.g stakingInteractor, n walletInteractor, xoj.a featuresInteractor, ai5.b cryptoNavigationInterceptor) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(stakingInteractor, "stakingInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(cryptoNavigationInterceptor, "cryptoNavigationInterceptor");
        this.f239869a = navigator;
        this.f239870b = stakingInteractor;
        this.f239871c = walletInteractor;
        this.d = featuresInteractor;
        this.e = cryptoNavigationInterceptor;
        this.f = new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(u49.b.f277278a, null, null, 6)));
        this.f239872g = new q06.b(new MainScreenTab("crypto"), null);
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        if (y.D(cVar, "deeplink", 1, "crypto") && Intrinsics.f(cVar.e(2), "staking")) {
            return Intrinsics.f(cVar.e(3), "all-crypto") || Intrinsics.f(cVar.e(4), "stake") || Intrinsics.f(cVar.e(4), "earningDetails");
        }
        return false;
    }

    @Override // ai5.b
    public final d0 b(String deeplinkUri) {
        Intrinsics.checkNotNullParameter(deeplinkUri, "deeplinkUri");
        return this.e.b(deeplinkUri);
    }

    @Override // ai5.b
    public final Object c(NaviCommand naviCommand, Continuation continuation) {
        return this.e.c(naviCommand, continuation);
    }

    @Override // ai5.b
    public final Object d(String str, Continuation continuation) {
        return this.e.d(str, continuation);
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        if (Intrinsics.f(cVar.e(3), "all-crypto")) {
            return i((gim.c) continuation);
        }
        if (Intrinsics.f(cVar.e(4), "stake")) {
            xi0.a aVar = xi0.b.Companion;
            String strE = cVar.e(3);
            aVar.getClass();
            return k(xi0.a.a(strE), (gim.c) continuation);
        }
        if (!Intrinsics.f(cVar.e(4), "earningDetails")) {
            return null;
        }
        xi0.a aVar2 = xi0.b.Companion;
        String strE2 = cVar.e(3);
        aVar2.getClass();
        return j(xi0.a.a(strE2), (gim.c) continuation);
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        d0 d0VarB = b(deeplink.f173629c);
        prl.n nVar = new prl.n(14, new b(deeplink, this, z, 0));
        d0VarB.getClass();
        i iVar = new i(d0VarB, nVar, 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }

    public final f0 g(xi0.b bVar) {
        d0 d0VarFirstOrError = zi0.c.J(rd0.e.c(this.f239870b.b(bVar, w4l.i.f294643c), kotlin.coroutines.g.f186406a)).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return zi0.c.t(d0VarFirstOrError);
    }

    public final ufm.c h(NaviCommand naviCommand) {
        ufm.c cVar = new ufm.c(new pu9.a(this, naviCommand, 1), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        return cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b0, code lost:
    
        if (r10 == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d0, code lost:
    
        if (r10 == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(gim.c r10) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pud.g.i(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x008f, code lost:
    
        if (r8 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(xi0.b r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof pud.e
            if (r0 == 0) goto L13
            r0 = r8
            pud.e r0 = (pud.e) r0
            int r1 = r0.f239867w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f239867w = r1
            goto L18
        L13:
            pud.e r0 = new pud.e
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f239867w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r8)
            goto L92
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            yhm.o.b(r8)
            goto L78
        L36:
            yhm.o.b(r8)
            rfm.f0 r7 = r6.g(r7)
            psl.e r8 = new psl.e
            r2 = 25
            r8.<init>(r2)
            prl.n r2 = new prl.n
            r5 = 12
            r2.<init>(r5, r8)
            rfm.j r8 = new rfm.j
            r5 = 0
            r8.<init>(r7, r2, r5)
            psl.e r7 = new psl.e
            r2 = 26
            r7.<init>(r2)
            prl.n r2 = new prl.n
            r5 = 13
            r2.<init>(r5, r7)
            rfm.m r7 = new rfm.m
            r5 = 1
            r7.<init>(r8, r2, r5)
            rfm.x r8 = new rfm.x
            r8.<init>(r7)
            java.lang.String r7 = "onErrorComplete(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r7)
            r0.f239867w = r4
            java.lang.Object r8 = nim.a.i(r8, r0)
            if (r8 != r1) goto L78
            goto L91
        L78:
            com.revolut.feature.staking.api.model.StakingPocket r8 = (com.revolut.feature.staking.api.model.StakingPocket) r8
            if (r8 != 0) goto L7e
            r7 = 0
            return r7
        L7e:
            com.revolut.retail.feature.crypto.asset_details.api.navigation.CryptoAssetDetailsFeatureConfig$EarnDetailsDestination r7 = new com.revolut.retail.feature.crypto.asset_details.api.navigation.CryptoAssetDetailsFeatureConfig$EarnDetailsDestination
            r7.<init>(r8)
            com.revolut.retail.core.navigation.FeatureCommand r7 = zh9.u0.f(r7)
            r0.f239867w = r3
            ai5.b r8 = r6.e
            java.lang.Object r8 = r8.c(r7, r0)
            if (r8 != r1) goto L92
        L91:
            return r1
        L92:
            com.revolut.retail.core.navigation.NaviCommand r8 = (com.revolut.retail.core.navigation.NaviCommand) r8
            com.revolut.kompot.bridge.navigation.BridgeDestination r7 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            r7.<init>(r8)
            q06.h r8 = new q06.h
            q06.b r0 = r6.f239872g
            r8.<init>(r7, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: pud.g.j(xi0.b, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ac, code lost:
    
        if (r13 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(xi0.b r12, gim.c r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof pud.f
            if (r0 == 0) goto L13
            r0 = r13
            pud.f r0 = (pud.f) r0
            int r1 = r0.f239868w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f239868w = r1
            goto L18
        L13:
            pud.f r0 = new pud.f
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f239868w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r13)
            goto Laf
        L2b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L33:
            yhm.o.b(r13)
            goto L89
        L37:
            yhm.o.b(r13)
            r9 = 0
            r10 = 62
            wsg.n r5 = r11.f239871c
            r7 = 0
            r8 = 0
            r6 = r12
            efm.d0 r12 = osg.b.r(r5, r6, r7, r8, r9, r10)
            rfm.f0 r13 = r11.g(r6)
            efm.d0 r12 = te0.w.H0(r12, r13)
            psl.e r13 = new psl.e
            r2 = 22
            r13.<init>(r2)
            prl.n r2 = new prl.n
            r5 = 10
            r2.<init>(r5, r13)
            rfm.j r13 = new rfm.j
            r5 = 0
            r13.<init>(r12, r2, r5)
            psl.e r12 = new psl.e
            r2 = 23
            r12.<init>(r2)
            prl.n r2 = new prl.n
            r5 = 11
            r2.<init>(r5, r12)
            rfm.m r12 = new rfm.m
            r5 = 1
            r12.<init>(r13, r2, r5)
            rfm.x r13 = new rfm.x
            r13.<init>(r12)
            java.lang.String r12 = "onErrorComplete(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r12)
            r0.f239868w = r4
            java.lang.Object r13 = nim.a.i(r13, r0)
            if (r13 != r1) goto L89
            goto Lae
        L89:
            yhm.r r13 = (yhm.r) r13
            if (r13 != 0) goto L8f
            r12 = 0
            return r12
        L8f:
            java.lang.Object r12 = r13.f314201a
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r2 = r13.f314202b
            com.revolut.feature.staking.api.model.StakingProduct r2 = (com.revolut.feature.staking.api.model.StakingProduct) r2
            java.lang.Object r13 = r13.f314203c
            com.revolut.feature.staking.api.model.StakingPocket r13 = (com.revolut.feature.staking.api.model.StakingPocket) r13
            com.revolut.feature.staking.api.navigation.destination.StakeFeatureDestination r4 = new com.revolut.feature.staking.api.navigation.destination.StakeFeatureDestination
            r4.<init>(r12, r2, r13)
            com.revolut.retail.core.navigation.FeatureCommand r12 = zh9.u0.f(r4)
            r0.f239868w = r3
            ai5.b r13 = r11.e
            java.lang.Object r13 = r13.c(r12, r0)
            if (r13 != r1) goto Laf
        Lae:
            return r1
        Laf:
            com.revolut.retail.core.navigation.NaviCommand r13 = (com.revolut.retail.core.navigation.NaviCommand) r13
            com.revolut.kompot.bridge.navigation.BridgeDestination r12 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            r12.<init>(r13)
            q06.h r13 = new q06.h
            q06.b r0 = r11.f239872g
            r13.<init>(r12, r0)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: pud.g.k(xi0.b, gim.c):java.lang.Object");
    }
}
