package s5c;

import com.revolut.feature.revolut_x_promo.impl.service.CryptoExchangeEligibilityService;
import e4m.e;
import kotlin.jvm.internal.Intrinsics;
import vc.s;

/* JADX INFO: loaded from: classes6.dex */
public abstract class b implements e {
    public static CryptoExchangeEligibilityService a(a aVar, ik0.b retrofitFactory, ek.a jsonConverterFactory) {
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(jsonConverterFactory, "jsonConverterFactory");
        Object objCreate = ik0.b.a(retrofitFactory, null, null, jsonConverterFactory, null, 27).create(CryptoExchangeEligibilityService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        CryptoExchangeEligibilityService cryptoExchangeEligibilityService = (CryptoExchangeEligibilityService) objCreate;
        s.k(cryptoExchangeEligibilityService);
        return cryptoExchangeEligibilityService;
    }
}
