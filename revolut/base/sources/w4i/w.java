package w4i;

import com.revolut.feature_market_data_api.navigation.TransactionUnitsType;
import com.revolut.shared.feature.market_data.models.domain.models.Asset;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class w implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Asset f294594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f294595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Asset f294596c;
    public final TransactionUnitsType.Lots d;

    public w(Asset baseAsset, BigDecimal expectedRate, Asset rateAsset, TransactionUnitsType.Lots unitsType) {
        Intrinsics.checkNotNullParameter(baseAsset, "baseAsset");
        Intrinsics.checkNotNullParameter(expectedRate, "expectedRate");
        Intrinsics.checkNotNullParameter(rateAsset, "rateAsset");
        Intrinsics.checkNotNullParameter(unitsType, "unitsType");
        this.f294594a = baseAsset;
        this.f294595b = expectedRate;
        this.f294596c = rateAsset;
        this.d = unitsType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f294594a, wVar.f294594a) && Intrinsics.f(this.f294595b, wVar.f294595b) && Intrinsics.f(this.f294596c, wVar.f294596c) && Intrinsics.f(this.d, wVar.d);
    }

    public final int hashCode() {
        return this.d.f97102a.hashCode() + ((this.f294596c.hashCode() + t61.a.d(this.f294595b, this.f294594a.hashCode() * 31, 31)) * 31);
    }
}
