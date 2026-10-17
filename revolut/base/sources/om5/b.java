package om5;

import com.revolut.feature.crypto.tfr.validation.impl.data.network.CryptoTfrService;
import e4m.e;
import kotlin.jvm.internal.Intrinsics;
import vc.s;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements e {
    public static CryptoTfrService a(a aVar, ik0.b retrofitFactory, ek.a jsonConverterFactory) {
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(jsonConverterFactory, "jsonConverterFactory");
        Object objCreate = ik0.b.a(retrofitFactory, null, null, jsonConverterFactory, null, 27).create(CryptoTfrService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        CryptoTfrService cryptoTfrService = (CryptoTfrService) objCreate;
        s.k(cryptoTfrService);
        return cryptoTfrService;
    }
}
