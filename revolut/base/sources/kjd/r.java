package kjd;

import com.revolut.feature.shops.api.model.ShopsCampaignOffer;
import com.revolut.feature.shops.api.model.ShopsEarningRate;
import java.util.Comparator;
import kotlin.Pair;

/* JADX INFO: loaded from: classes7.dex */
public final class r implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        ShopsEarningRate shopsEarningRate = ((ShopsCampaignOffer) ((Pair) obj3).f186386b).f87030m;
        Double dValueOf = Double.valueOf(shopsEarningRate != null ? shopsEarningRate.f87045a : 0.0d);
        ShopsEarningRate shopsEarningRate2 = ((ShopsCampaignOffer) ((Pair) obj2).f186386b).f87030m;
        return cim.b.b(dValueOf, Double.valueOf(shopsEarningRate2 != null ? shopsEarningRate2.f87045a : 0.0d));
    }
}
