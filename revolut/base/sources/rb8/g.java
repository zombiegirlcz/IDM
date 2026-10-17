package rb8;

import com.revolut.feature.junior_allowance.impl.service.JuniorAllowanceStandingOrderService;
import kotlin.jvm.internal.Intrinsics;
import vc.s;

/* JADX INFO: loaded from: classes4.dex */
public abstract class g implements e4m.e {
    public static JuniorAllowanceStandingOrderService a(f fVar, ik0.b retrofitFactory, ek.a converterFactory) {
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(JuniorAllowanceStandingOrderService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        JuniorAllowanceStandingOrderService juniorAllowanceStandingOrderService = (JuniorAllowanceStandingOrderService) objCreate;
        s.k(juniorAllowanceStandingOrderService);
        return juniorAllowanceStandingOrderService;
    }
}
