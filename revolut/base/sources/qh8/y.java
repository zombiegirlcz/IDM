package qh8;

import com.revolut.feature.junior_onboarding.impl.service.JuniorWorkflowService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class y implements e4m.e {
    public static JuniorWorkflowService a(ek.a converterFactory, ik0.b retrofitFactory) {
        x.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(JuniorWorkflowService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        JuniorWorkflowService juniorWorkflowService = (JuniorWorkflowService) objCreate;
        vc.s.k(juniorWorkflowService);
        return juniorWorkflowService;
    }
}
