package mj8;

import com.revolut.feature.junior_profile.impl.services.JuniorWorkflowBasedProfileService;
import kotlin.jvm.internal.Intrinsics;
import vc.s;

/* JADX INFO: loaded from: classes4.dex */
public abstract class k implements e4m.e {
    public static JuniorWorkflowBasedProfileService a(j jVar, ik0.b retrofitFactory, ek.a converterFactory) {
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(JuniorWorkflowBasedProfileService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        JuniorWorkflowBasedProfileService juniorWorkflowBasedProfileService = (JuniorWorkflowBasedProfileService) objCreate;
        s.k(juniorWorkflowBasedProfileService);
        return juniorWorkflowBasedProfileService;
    }
}
