package ugh;

import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import com.revolut.retail.feature.cryptocommoditydetails.api.navigation.CryptoCommodityDetailsFeatureConfig;
import com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import w0h.b;
import w0h.c;

/* JADX INFO: loaded from: classes9.dex */
public final class a {
    public static FeatureConfig a(c token) {
        Intrinsics.checkNotNullParameter(token, "token");
        if (!(token instanceof b)) {
            if (!(token instanceof w0h.a)) {
                throw new NoWhenBranchMatchedException();
            }
            return new CryptoCommodityDetailsFeatureConfig(((w0h.a) token).f293758a, null, null, null, 62);
        }
        return new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new AssetDetailsDestination(((b) token).f293759a, null, false, null, null, null, 54), false, (Integer) null, 0, 61);
    }
}
