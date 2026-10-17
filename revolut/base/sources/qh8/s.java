package qh8;

import com.revolut.feature.junior_onboarding.impl.service.JuniorCreationService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class s implements e4m.e {
    public static JuniorCreationService a(ek.a converterFactory, ik0.b retrofitFactory) {
        r.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(JuniorCreationService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        JuniorCreationService juniorCreationService = (JuniorCreationService) objCreate;
        vc.s.k(juniorCreationService);
        return juniorCreationService;
    }
}
