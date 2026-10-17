package zw5;

import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.flow.CryptoCommodityBuyCollectionFlowContract$CollectionQuoteNavigationData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f325730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CryptoCommodityBuyCollectionFlowContract$CollectionQuoteNavigationData f325731b;

    public c(String legalEntityId, CryptoCommodityBuyCollectionFlowContract$CollectionQuoteNavigationData navigationData) {
        Intrinsics.checkNotNullParameter(legalEntityId, "legalEntityId");
        Intrinsics.checkNotNullParameter(navigationData, "navigationData");
        this.f325730a = legalEntityId;
        this.f325731b = navigationData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f325730a, cVar.f325730a) && Intrinsics.f(this.f325731b, cVar.f325731b);
    }

    public final int hashCode() {
        return this.f325731b.hashCode() + (this.f325730a.hashCode() * 31);
    }
}
