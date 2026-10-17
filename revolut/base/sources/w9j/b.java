package w9j;

import bbj.d;
import com.revolut.feature.wealth.api.declaration.DisclosuresFeatureConfig;
import com.revolut.retail.feature.crypto.disclaimer.api.navigation.RetailRevolutXDifferenceDestination;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends v9j.a {
    @Override // v9j.a
    public final void Z2(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        String str = clickData.f275445a;
        if (Intrinsics.f(str, "DISCLOSURES_LINK_ID")) {
            if (clickData.d instanceof d.b) {
                A2(u0.c(DisclosuresFeatureConfig.CryptoDisclosuresFeatureConfig.f95195a));
            }
        } else if (Intrinsics.f(str, "RETAIL_REVX_DIFFERENCE_LINK_ID")) {
            A2(RetailRevolutXDifferenceDestination.f100023a);
        }
    }
}
