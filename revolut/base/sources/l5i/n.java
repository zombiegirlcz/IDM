package l5i;

import com.revolut.feature_market_data_api.navigation.TransactionUnitsType;
import com.revolut.shared.feature.market_data.models.domain.models.Asset;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class n extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Asset f192291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f192292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Asset f192293c;
    public final TransactionUnitsType.Lots d;

    public n(Asset baseAsset, BigDecimal expectedRate, Asset rateAsset, TransactionUnitsType.Lots unitsType) {
        Intrinsics.checkNotNullParameter(baseAsset, "baseAsset");
        Intrinsics.checkNotNullParameter(expectedRate, "expectedRate");
        Intrinsics.checkNotNullParameter(rateAsset, "rateAsset");
        Intrinsics.checkNotNullParameter(unitsType, "unitsType");
        this.f192291a = baseAsset;
        this.f192292b = expectedRate;
        this.f192293c = rateAsset;
        this.d = unitsType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f192291a, nVar.f192291a) && Intrinsics.f(this.f192292b, nVar.f192292b) && Intrinsics.f(this.f192293c, nVar.f192293c) && this.d.equals(nVar.d);
    }

    public final int hashCode() {
        return this.d.f97102a.hashCode() + ((this.f192293c.hashCode() + t61.a.d(this.f192292b, this.f192291a.hashCode() * 31, 31)) * 31);
    }
}
