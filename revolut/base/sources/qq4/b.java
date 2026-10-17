package qq4;

import com.revolut.feature.credit.card.models.CreditCard;
import com.revolut.feature.rev_points.models.RevPointsEarningRate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCard f248481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f248482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yt8.c f248483c;
    public final RevPointsEarningRate d;

    public b(CreditCard creditCard, List cards, yt8.c kyc2, RevPointsEarningRate revPointsEarningRate) {
        Intrinsics.checkNotNullParameter(creditCard, "creditCard");
        Intrinsics.checkNotNullParameter(cards, "cards");
        Intrinsics.checkNotNullParameter(kyc2, "kyc");
        this.f248481a = creditCard;
        this.f248482b = cards;
        this.f248483c = kyc2;
        this.d = revPointsEarningRate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f248481a, bVar.f248481a) && Intrinsics.f(this.f248482b, bVar.f248482b) && Intrinsics.f(this.f248483c, bVar.f248483c) && Intrinsics.f(this.d, bVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f248483c.hashCode() + p.a.d(this.f248481a.hashCode() * 31, 31, this.f248482b)) * 31;
        RevPointsEarningRate revPointsEarningRate = this.d;
        return iHashCode + (revPointsEarningRate == null ? 0 : revPointsEarningRate.hashCode());
    }
}
