package ajk;

import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.KompotPricingPlanFeatureConfig;
import igk.q;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l61.a f5592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f5593b;

    public f(gte.a featureToggleInteractor, l61.a userCompanyInteractor) {
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f5592a = userCompanyInteractor;
        this.f5593b = featureToggleInteractor;
    }

    public final FeatureCommand b() {
        return new FeatureCommand(new KompotPricingPlanFeatureConfig.PlanHubV2(null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(pi3.h r19, gim.c r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            boolean r2 = r1 instanceof ajk.e
            if (r2 == 0) goto L17
            r2 = r1
            ajk.e r2 = (ajk.e) r2
            int r3 = r2.f5591x
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f5591x = r3
            goto L1c
        L17:
            ajk.e r2 = new ajk.e
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.v
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.f5591x
            r5 = 1
            if (r4 == 0) goto L35
            if (r4 != r5) goto L2d
            pi3.h r2 = r2.u
            yhm.o.b(r1)
            goto L4e
        L2d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L35:
            yhm.o.b(r1)
            l61.a r1 = r0.f5592a
            ang.b r1 = (ang.b) r1
            efm.d0 r1 = r1.a()
            r4 = r19
            r2.u = r4
            r2.f5591x = r5
            java.lang.Object r1 = nim.a.b(r1, r2)
            if (r1 != r3) goto L4d
            return r3
        L4d:
            r2 = r4
        L4e:
            java.lang.String r3 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
            l71.d r1 = (l71.d) r1
            boolean r1 = l71.f.a(r1)
            if (r1 == 0) goto L5f
            h93.l0 r1 = h93.l0.BRAZIL_LOCAL
        L5d:
            r14 = r1
            goto L62
        L5f:
            h93.l0 r1 = h93.l0.CREDIT
            goto L5d
        L62:
            com.revolut.feature.card_order_new.api.CardOrderFeatureApi$Toggles$DecommissionDesignsForPlanId r1 = com.revolut.feature.card_order_new.api.CardOrderFeatureApi$Toggles.DecommissionDesignsForPlanId.f64946c
            gte.a r3 = r0.f5593b
            jte.d r3 = (jte.d) r3
            boolean r1 = r3.c(r1)
            if (r1 == 0) goto L71
            r1 = 0
        L6f:
            r15 = r1
            goto L76
        L71:
            hha.d r1 = r2.f236404a
            java.lang.String r1 = r1.f152287a
            goto L6f
        L76:
            com.revolut.retail.core.navigation.FeatureCommand r1 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature.card_order_new.api.CardOrderNewFeatureConfig r4 = new com.revolut.feature.card_order_new.api.CardOrderNewFeatureConfig
            com.revolut.feature.card_order_new.api.SelectedTab r5 = com.revolut.feature.card_order_new.api.SelectedTab.CREDIT
            r13 = 0
            r17 = 3066(0xbfa, float:4.296E-42)
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r16 = r2
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r1.<init>(r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ajk.f.c(pi3.h, gim.c):java.lang.Object");
    }

    public final CompositeCommand d() {
        return com.revolut.retail.core.navigation.a.c(new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(u49.a.f277275a, null, null, 6))), new FeatureCommand(new KompotPricingPlanFeatureConfig.PlanHubV2(null)));
    }
}
