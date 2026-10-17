package iab;

import com.revolut.feature.retail.junior.pricing_plans.impl.data.service.JuniorPricingPlansService;
import kotlin.jvm.internal.Intrinsics;
import vc.s;

/* JADX INFO: loaded from: classes6.dex */
public abstract class f implements e4m.e {
    public static JuniorPricingPlansService a(ek.a converterFactory, ik0.b retrofitFactory) {
        d.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(JuniorPricingPlansService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        JuniorPricingPlansService juniorPricingPlansService = (JuniorPricingPlansService) objCreate;
        s.k(juniorPricingPlansService);
        return juniorPricingPlansService;
    }
}
