package ek5;

import com.revolut.feature.crypto.remittance.impl.network.CryptoCounterpartiesService;
import e4m.e;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Converter;
import vc.s;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d implements e {
    public static CryptoCounterpartiesService a(ik0.b retrofitFactory, Converter.Factory converterFactory) {
        b.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(CryptoCounterpartiesService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        CryptoCounterpartiesService cryptoCounterpartiesService = (CryptoCounterpartiesService) objCreate;
        s.k(cryptoCounterpartiesService);
        return cryptoCounterpartiesService;
    }
}
