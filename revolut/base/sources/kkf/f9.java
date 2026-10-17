package kkf;

import com.revolut.feature.pricing_plans.upgrade_prompt.api.PricingPlanUpgradeEntryPointApi$Toggles;
import com.revolut.feature.pricingplans.api.PricingPlansApi$Toggles;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f9 extends yji.n implements elf.s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f184684l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final klf.m1 f184685m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final mga.g0 f184686n;
    public final prl.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final gte.a f184687p;

    public f9(klf.h0 commonDataSource, klf.m1 juniorDataSource, mga.g0 upgradeEntryPointItemProvider, prl.e upgradeEntryPointItemClickHandler, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(upgradeEntryPointItemProvider, "upgradeEntryPointItemProvider");
        Intrinsics.checkNotNullParameter(upgradeEntryPointItemClickHandler, "upgradeEntryPointItemClickHandler");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f184684l = commonDataSource;
        this.f184685m = juniorDataSource;
        this.f184686n = upgradeEntryPointItemProvider;
        this.o = upgradeEntryPointItemClickHandler;
        this.f184687p = featureToggleInteractor;
    }

    public static final a9 Z2(f9 f9Var, tof.a3 a3Var) {
        f9Var.getClass();
        int i = b9.f184617a[a3Var.e.ordinal()];
        if (i == 1 || i == 2) {
            return a9.Generic;
        }
        if (i == 3) {
            return a9.Loyalty;
        }
        List list = a3Var.P;
        if (list == null || list.isEmpty()) {
            return (!((jte.d) f9Var.f184687p).c(PricingPlansApi$Toggles.MinimumBalance.f81002c) || a3Var.M0 == null) ? a9.None : a9.Generic;
        }
        return a9.Generic;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean b3(kkf.f9 r5, mga.d0 r6, tof.a3 r7, klf.j1 r8, tof.t3 r9) {
        /*
            r5.getClass()
            gte.a r5 = r5.f184687p
            boolean r8 = r8.c()
            r0 = 0
            if (r8 == 0) goto Le
            goto La7
        Le:
            tof.y6 r8 = r7.e
            tof.y6 r1 = tof.y6.ATM
            r2 = 1
            if (r8 != r1) goto L2f
            boolean r8 = k71.k.M0(r7)
            if (r8 != 0) goto L2f
            java.lang.String r8 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r8)
            tof.m r8 = r7.U0
            if (r8 == 0) goto L27
            tof.n r8 = r8.f272922a
            goto L28
        L27:
            r8 = 0
        L28:
            tof.n r1 = tof.n.BLIK
            if (r8 != r1) goto L2d
            goto L2f
        L2d:
            r8 = r2
            goto L30
        L2f:
            r8 = r0
        L30:
            boolean r1 = r6 instanceof mga.y
            if (r1 == 0) goto L6b
            tof.y6 r7 = r7.e
            tof.y6 r8 = tof.y6.CARD_PAYMENT
            if (r7 != r8) goto L3c
            r7 = r2
            goto L3d
        L3c:
            r7 = r0
        L3d:
            r3 = 0
            if (r9 == 0) goto L4a
            java.lang.Double r8 = r9.A
            if (r8 == 0) goto L4a
            double r8 = r8.doubleValue()
            goto L4b
        L4a:
            r8 = r3
        L4b:
            int r8 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r8 <= 0) goto L51
            r8 = r2
            goto L52
        L51:
            r8 = r0
        L52:
            com.revolut.feature.pricing_plans.upgrade_prompt.api.PricingPlanUpgradeEntryPointApi$Toggles$RevampedPremiumContextualBannersPt2 r9 = com.revolut.feature.pricing_plans.upgrade_prompt.api.PricingPlanUpgradeEntryPointApi$Toggles.RevampedPremiumContextualBannersPt2.f80975c
            jte.d r5 = (jte.d) r5
            boolean r5 = r5.c(r9)
            if (r5 == 0) goto La7
            if (r7 == 0) goto La7
            if (r8 == 0) goto La7
            mga.y r6 = (mga.y) r6
            java.util.List r5 = r6.f205223a
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto La7
            goto La6
        L6b:
            boolean r9 = r6 instanceof mga.x
            if (r9 == 0) goto L87
            if (r8 != 0) goto La6
            boolean r6 = k71.k.B(r7)
            if (r6 != 0) goto La6
            com.revolut.feature.pricingplans.api.PricingPlansApi$Toggles$MinimumBalance r6 = com.revolut.feature.pricingplans.api.PricingPlansApi$Toggles.MinimumBalance.f81002c
            jte.d r5 = (jte.d) r5
            boolean r5 = r5.c(r6)
            if (r5 == 0) goto L86
            tof.q1 r5 = r7.M0
            if (r5 == 0) goto L86
            return r2
        L86:
            return r0
        L87:
            boolean r5 = r6 instanceof mga.e
            if (r5 == 0) goto L8c
            return r8
        L8c:
            boolean r5 = r6 instanceof mga.p
            if (r5 == 0) goto L95
            boolean r5 = k71.k.B(r7)
            return r5
        L95:
            boolean r5 = r6 instanceof mga.c
            if (r5 == 0) goto La7
            java.util.List r5 = r7.P
            java.util.Collection r5 = (java.util.Collection) r5
            if (r5 == 0) goto La7
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto La6
            goto La7
        La6:
            return r2
        La7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kkf.f9.b3(kkf.f9, mga.d0, tof.a3, klf.j1, tof.t3):boolean");
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        return this.o.o(obj2, (gim.c) continuation);
    }

    public final cmf.p c3(mga.d0 planUpgradeContext) {
        Intrinsics.checkNotNullParameter(planUpgradeContext, "planUpgradeContext");
        boolean z = planUpgradeContext.equals(mga.e.f205204a) || planUpgradeContext.equals(mga.p.f205213a);
        boolean zC = ((jte.d) this.f184687p).c(PricingPlanUpgradeEntryPointApi$Toggles.RevampedPremiumContextualBanners.f80974c);
        klf.h0 h0Var = this.f184684l;
        if (zC && z) {
            planUpgradeContext = new mga.x(h0Var.f185494j);
        }
        return new cmf.p(vkm.q.Q(vkm.q.q(new hy1.b0(yh5.b.d(h0Var.d(), this.f184685m.a()), this, planUpgradeContext, 14)), new m5(null, this, 8)), new z5(12), zhm.u.c(this), "UpgradeEntryPoint");
    }
}
