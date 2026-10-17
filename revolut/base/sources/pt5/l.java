package pt5;

import com.revolut.feature.crypto_investments.api.navigation.CryptoInvestmentsFeatureConfig;
import kotlin.jvm.internal.Intrinsics;
import tof.i7;

/* JADX INFO: loaded from: classes3.dex */
public interface l {
    static efm.r a(dv5.l lVar, CryptoInvestmentsFeatureConfig.CurrencyMode currencyMode, i7 i7Var, ft5.a params, int i) {
        Integer num = (i & 2) != 0 ? null : 4;
        if ((i & 4) != 0) {
            i7Var = null;
        }
        if ((i & 8) != 0) {
            params = new ft5.a(null, 7);
        }
        lVar.getClass();
        Intrinsics.checkNotNullParameter(currencyMode, "currencyMode");
        Intrinsics.checkNotNullParameter(params, "params");
        return pd.b.r(nim.a.w(lVar.e.a(currencyMode, params), new dv5.g(i7Var, 0)), new doe.c(lVar, num, 16));
    }
}
