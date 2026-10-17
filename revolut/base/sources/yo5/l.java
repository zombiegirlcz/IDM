package yo5;

import com.revolut.feature.crypto.withdraw.impl.network.CryptoWithdrawService;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Converter;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l implements e4m.e {
    public static CryptoWithdrawService a(ik0.b retrofitFactory, Converter.Factory converterFactory) {
        k.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(CryptoWithdrawService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        CryptoWithdrawService cryptoWithdrawService = (CryptoWithdrawService) objCreate;
        vc.s.k(cryptoWithdrawService);
        return cryptoWithdrawService;
    }
}
