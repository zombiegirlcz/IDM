package jd8;

import com.revolut.feature.junior_consent.impl.data.service.JuniorConsentPromptService;
import kotlin.jvm.internal.Intrinsics;
import vc.s;

/* JADX INFO: loaded from: classes4.dex */
public abstract class i implements e4m.e {
    public static JuniorConsentPromptService a(h hVar, ik0.b retrofitFactory, ek.a converterFactory) {
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(JuniorConsentPromptService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        JuniorConsentPromptService juniorConsentPromptService = (JuniorConsentPromptService) objCreate;
        s.k(juniorConsentPromptService);
        return juniorConsentPromptService;
    }
}
