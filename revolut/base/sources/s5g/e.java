package s5g;

import com.revolut.feature.travel.flights.models.domain.payment.PointsRedeemOption;
import java.util.Comparator;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Long.valueOf(((PointsRedeemOption) obj2).f93541c.f115082a), Long.valueOf(((PointsRedeemOption) obj3).f93541c.f115082a));
    }
}
