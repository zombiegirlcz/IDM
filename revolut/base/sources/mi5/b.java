package mi5;

import com.revolut.feature.crypto.onboarding.impl.service.CryptoOnboardingService;
import e4m.e;
import kotlin.jvm.internal.Intrinsics;
import vc.s;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements e {
    public static CryptoOnboardingService a(a aVar, ik0.b retrofitFactory, ek.a converterFactory) {
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(CryptoOnboardingService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        CryptoOnboardingService cryptoOnboardingService = (CryptoOnboardingService) objCreate;
        s.k(cryptoOnboardingService);
        return cryptoOnboardingService;
    }
}
