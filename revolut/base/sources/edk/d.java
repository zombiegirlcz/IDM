package edk;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.y0;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements xii.b {

    @NotNull
    private static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f125034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f125035b;

    public d(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f125034a = featureToggleInteractor;
        this.f125035b = y0.b("monthly-draws");
    }

    @Override // xii.b
    public final Set a() {
        return this.f125035b;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    @Override // xii.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.kompot.common.ParcelableDestination e(lg0.e r4) {
        /*
            r3 = this;
            java.lang.String r0 = "deeplink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            gte.a r0 = r3.f125034a
            com.revolut.retail.feature.plan_rewards.api.PlanRewardsApi$Toggles$MonthlyDraws r1 = com.revolut.retail.feature.plan_rewards.api.PlanRewardsApi$Toggles$MonthlyDraws.f102521c
            boolean r0 = r0.a(r1)
            if (r0 == 0) goto L11
            r4 = 0
            return r4
        L11:
            com.revolut.retail.feature.plan_rewards.api.navigation.MonthlyDrawsDestination r0 = new com.revolut.retail.feature.plan_rewards.api.navigation.MonthlyDrawsDestination
            java.util.LinkedHashMap r4 = r4.f195041c
            java.lang.String r1 = "promotedRewardsGlow"
            java.lang.String r4 = lg0.g.a(r1, r4)
            r1 = 0
            if (r4 == 0) goto L26
            boolean r4 = java.lang.Boolean.parseBoolean(r4)
            r2 = 1
            if (r4 != r2) goto L26
            goto L27
        L26:
            r2 = r1
        L27:
            r0.<init>(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: edk.d.e(lg0.e):com.revolut.kompot.common.ParcelableDestination");
    }
}
