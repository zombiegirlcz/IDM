package sgh;

import com.revolut.retail.core.navigation.feature.FeatureConfig;
import com.revolut.retail.feature.cryptocommoditydetails.api.navigation.CryptoCommodityDetailsFeatureConfig;
import com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination;
import kotlin.NoWhenBranchMatchedException;
import q0h.b;
import q0h.c;
import zh9.u0;

/* JADX INFO: loaded from: classes9.dex */
public final class a {
    public static FeatureConfig a(q0h.a aVar) {
        if (aVar instanceof b) {
            return new CryptoCommodityDetailsFeatureConfig(((b) aVar).f241270a, null, null, null, 62);
        }
        if (!(aVar instanceof c)) {
            throw new NoWhenBranchMatchedException();
        }
        return u0.d(new AssetDetailsDestination(((c) aVar).f241271a.f214596b, null, false, null, null, null, 54));
    }
}
