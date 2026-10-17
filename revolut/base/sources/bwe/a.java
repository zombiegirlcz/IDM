package bwe;

import com.revolut.feature.topup_screen.api.feature_config.TopUpCheckoutFeatureConfig;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements uri.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f19322a;

    public a(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f19322a = featureToggleInteractor;
    }

    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof TopUpCheckoutFeatureConfig;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    @Override // uri.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(sri.m r11, android.content.Context r12, com.revolut.retail.core.navigation.feature.FeatureConfig r13) {
        /*
            r10 = this;
            com.revolut.feature.topup_screen.api.feature_config.TopUpCheckoutFeatureConfig r13 = (com.revolut.feature.topup_screen.api.feature_config.TopUpCheckoutFeatureConfig) r13
            java.lang.String r0 = "navigator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r12 = "config"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r12)
            com.revolut.feature.checkout.models.CheckoutOrder r12 = r13.f90514a
            pi3.d r0 = r12.d
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L21
            boolean r0 = r0.c()
            if (r0 != r2) goto L21
            r0 = r2
            goto L22
        L21:
            r0 = r1
        L22:
            com.revolut.core.model.account.AccountId r3 = r13.d
            pi3.d r4 = r12.d
            if (r4 == 0) goto L3b
            boolean r4 = r4.d()
            if (r4 != r2) goto L3b
            com.revolut.feature.card_design.api.CardDesignApi$Toggles$JointAccountsPlanCards r4 = com.revolut.feature.card_design.api.CardDesignApi$Toggles$JointAccountsPlanCards.f64537c
            gte.a r5 = r10.f19322a
            jte.d r5 = (jte.d) r5
            boolean r4 = r5.c(r4)
            if (r4 == 0) goto L3b
            goto L3c
        L3b:
            r2 = r1
        L3c:
            if (r0 == 0) goto L42
            com.revolut.feature.topup_screen.common.TopUpTarget$Pro r0 = com.revolut.feature.topup_screen.common.TopUpTarget.Pro.f90574a
        L40:
            r7 = r0
            goto L54
        L42:
            boolean r0 = r3 instanceof com.revolut.core.model.account.AccountId.Joint
            com.revolut.feature.topup_screen.common.TopUpTarget$Main r4 = com.revolut.feature.topup_screen.common.TopUpTarget.Main.f90573a
            if (r0 == 0) goto L4a
            if (r2 == 0) goto L4c
        L4a:
            r7 = r4
            goto L54
        L4c:
            com.revolut.feature.topup_screen.common.TopUpTarget$Joint r0 = new com.revolut.feature.topup_screen.common.TopUpTarget$Joint
            com.revolut.core.model.account.AccountId$Joint r3 = (com.revolut.core.model.account.AccountId.Joint) r3
            r0.<init>(r3)
            goto L40
        L54:
            com.revolut.navigation.destination.CheckoutDestination r4 = new com.revolut.navigation.destination.CheckoutDestination
            com.revolut.feature.checkout.models.CheckoutParams r5 = r13.f90515b
            com.revolut.feature.checkout.models.Checkout$Order r6 = new com.revolut.feature.checkout.models.Checkout$Order
            r6.<init>(r12)
            com.revolut.retail.core.navigation.NaviCommand r8 = r13.f90516c
            com.revolut.analytics.tracking.v3.AnalyticsProduct r9 = r13.e
            r4.<init>(r5, r6, r7, r8, r9)
            yhi.b r12 = yhi.b.SOLID
            r13 = 0
            r0 = 12
            com.revolut.retail.core.navigation.FeatureCommand r12 = vhi.c.c(r4, r12, r13, r1, r0)
            r11.c(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bwe.a.c(sri.m, android.content.Context, com.revolut.retail.core.navigation.feature.FeatureConfig):void");
    }
}
