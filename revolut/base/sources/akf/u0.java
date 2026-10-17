package akf;

import com.revolut.retail.feature.pricing_plans.ui.api.navigation.KompotPricingPlanFeatureConfig;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class u0 extends yji.n implements elf.s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f5906l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final klf.m1 f5907m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ffk.t f5908n;

    public u0(klf.h0 commonDataSource, klf.m1 juniorDataSource, ffk.t pricingPlanInteractor) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        this.f5906l = commonDataSource;
        this.f5907m = juniorDataSource;
        this.f5908n = pricingPlanInteractor;
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        boolean z;
        if (a10.b.B(v1.Companion, t1.MANAGE_PLAN, str)) {
            A2(KompotPricingPlanFeatureConfig.PlanSettingsDestination.f102885a);
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
