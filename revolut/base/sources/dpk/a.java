package dpk;

import com.revolut.retail.feature.ratedetails.api.navigation.RateDetailsKompotFeatureConfig;
import kotlin.jvm.internal.Intrinsics;
import xi0.b;

/* JADX INFO: loaded from: classes11.dex */
public interface a {
    static RateDetailsKompotFeatureConfig.RateDetails a(a aVar, b currencyFrom, b currencyTo, boolean z, boolean z3) {
        ((qpk.b) aVar).getClass();
        Intrinsics.checkNotNullParameter(currencyFrom, "currencyFrom");
        Intrinsics.checkNotNullParameter(currencyTo, "currencyTo");
        return new RateDetailsKompotFeatureConfig.RateDetails(currencyFrom, currencyTo, z, z3, true, true, false, null, null);
    }
}
