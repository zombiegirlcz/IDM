package zw5;

import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.flow.CryptoCommodityBuyCollectionFlowContract$CollectionQuoteNavigationData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoCommodityBuyCollectionFlowContract$CollectionQuoteNavigationData f325729a;

    public b(CryptoCommodityBuyCollectionFlowContract$CollectionQuoteNavigationData navigationData) {
        Intrinsics.checkNotNullParameter(navigationData, "navigationData");
        this.f325729a = navigationData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f325729a, ((b) obj2).f325729a);
    }

    public final int hashCode() {
        return this.f325729a.hashCode();
    }
}
