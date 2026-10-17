package g5b;

import com.revolut.retail.trading.core.domain.orders.TradingOrderExitStrategies;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f140723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f140724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f140725c;
    public final TradingOrderExitStrategies d;
    public final r2b.c e;

    public e(BigDecimal bigDecimal, BigDecimal bigDecimal2, List availableExitStrategies, TradingOrderExitStrategies tradingOrderExitStrategies, r2b.c cVar) {
        Intrinsics.checkNotNullParameter(availableExitStrategies, "availableExitStrategies");
        this.f140723a = bigDecimal;
        this.f140724b = bigDecimal2;
        this.f140725c = availableExitStrategies;
        this.d = tradingOrderExitStrategies;
        this.e = cVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f140723a, eVar.f140723a) && Intrinsics.f(this.f140724b, eVar.f140724b) && Intrinsics.f(this.f140725c, eVar.f140725c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e);
    }

    public final int hashCode() {
        BigDecimal bigDecimal = this.f140723a;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.f140724b;
        int iD = p.a.d((iHashCode + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31, 31, this.f140725c);
        TradingOrderExitStrategies tradingOrderExitStrategies = this.d;
        int iHashCode2 = (iD + (tradingOrderExitStrategies == null ? 0 : tradingOrderExitStrategies.hashCode())) * 31;
        r2b.c cVar = this.e;
        return iHashCode2 + (cVar != null ? cVar.hashCode() : 0);
    }
}
