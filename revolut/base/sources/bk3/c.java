package bk3;

import bjg.d;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId;
import com.revolut.retail.core.navigation.FeatureCommand;
import efm.d0;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import sri.m;
import ue0.e;
import ufm.i;
import ufm.p;
import wp5.y;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements vj3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tj3.a f16244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sj3.a f16245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f16246c;
    public final q06.b d;

    public c(tj3.a commodityFeatureEnabledInteractor, sj3.a commoditiesOnboardingStartCommandProvider, m navigator) {
        Intrinsics.checkNotNullParameter(commodityFeatureEnabledInteractor, "commodityFeatureEnabledInteractor");
        Intrinsics.checkNotNullParameter(commoditiesOnboardingStartCommandProvider, "commoditiesOnboardingStartCommandProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f16244a = commodityFeatureEnabledInteractor;
        this.f16245b = commoditiesOnboardingStartCommandProvider;
        this.f16246c = navigator;
        this.d = new q06.b(ibb.c.f160141b, null);
    }

    public static FeatureCommand b() {
        return new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(new MainContainerNavigationId.NewMainScreenContainerTabId(ibb.c.f160141b.f83420a, null), null, null, 6)));
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "feature") && Intrinsics.f(cVar.e(2), "commodities");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ab, code lost:
    
        if (r9 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof bk3.b
            if (r0 == 0) goto L13
            r0 = r9
            bk3.b r0 = (bk3.b) r0
            int r1 = r0.f16243x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16243x = r1
            goto L1a
        L13:
            bk3.b r0 = new bk3.b
            gim.c r9 = (gim.c) r9
            r0.<init>(r7, r9)
        L1a:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f16243x
            r3 = 2
            r4 = 1
            q06.b r5 = r7.d
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            yhm.o.b(r9)
            goto Lae
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            jf0.c r8 = r0.u
            yhm.o.b(r9)
            goto L53
        L3d:
            yhm.o.b(r9)
            tj3.a r9 = r7.f16244a
            zj3.a r9 = (zj3.a) r9
            efm.d0 r9 = r9.a()
            r0.u = r8
            r0.f16243x = r4
            java.lang.Object r9 = nim.a.b(r9, r0)
            if (r9 != r1) goto L53
            goto Lad
        L53:
            uj3.a r9 = (uj3.a) r9
            kotlin.jvm.internal.Intrinsics.h(r9)
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r2)
            uj3.a r2 = uj3.a.FEATURE_UNAVAILABLE
            r4 = 0
            if (r9 == r2) goto Lc0
            r2 = 3
            java.lang.String r8 = r8.e(r2)
            java.lang.String r2 = "onboarding"
            boolean r8 = kotlin.jvm.internal.Intrinsics.f(r8, r2)
            com.revolut.retail.core.navigation.DummyCommand r2 = com.revolut.retail.core.navigation.DummyCommand.f98635a
            if (r8 == 0) goto L7c
            q06.h r8 = new q06.h
            com.revolut.feature.commodities.onboarding.api.navigation.CommoditiesOnboardingDestination$Risks r9 = new com.revolut.feature.commodities.onboarding.api.navigation.CommoditiesOnboardingDestination$Risks
            r9.<init>(r2)
            r8.<init>(r9, r5)
            return r8
        L7c:
            boolean r8 = uj3.b.q(r9)
            if (r8 == 0) goto L88
            q06.i r8 = new q06.i
            r8.<init>(r5)
            return r8
        L88:
            dfa.a r8 = dfa.a.POCKET_SWITCHER
            sj3.a r8 = r7.f16245b
            wj3.a r8 = (wj3.a) r8
            r8.getClass()
            java.lang.String r9 = "targetCommandIfOnboardingComplete"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r9)
            wgb.v r9 = new wgb.v
            r6 = 8
            r9.<init>(r8, r2, r4, r6)
            kotlin.coroutines.g r8 = kotlin.coroutines.g.f186406a
            ufm.b r8 = te0.w.o0(r8, r9)
            r0.u = r4
            r0.f16243x = r3
            java.lang.Object r9 = nim.a.b(r8, r0)
            if (r9 != r1) goto Lae
        Lad:
            return r1
        Lae:
            java.lang.String r8 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r8)
            com.revolut.retail.core.navigation.NaviCommand r9 = (com.revolut.retail.core.navigation.NaviCommand) r9
            com.revolut.kompot.bridge.navigation.BridgeDestination r8 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            r8.<init>(r9)
            q06.h r9 = new q06.h
            r9.<init>(r8, r5)
            return r9
        Lc0:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: bk3.c.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        d0 d0VarA = ((zj3.a) this.f16244a).a();
        d dVar = new d(7, new a(this, deeplink, z, 0));
        d0VarA.getClass();
        p pVarT = new i(d0VarA, dVar, 0).t(2L, TimeUnit.SECONDS);
        Intrinsics.checkNotNullExpressionValue(pVarT, "timeout(...)");
        return e.F(pVarT, Boolean.FALSE);
    }
}
