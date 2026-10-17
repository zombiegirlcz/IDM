package i4b;

import com.revolut.data.model.Data;
import com.revolut.feature.retail.cfd.impl.screens.common.ExpiryDate;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f158357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f158358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e2b.a f158359c;
    public final nel.n d;
    public final bfl.g e;
    public final BigDecimal f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final BigDecimal f158360g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ExpiryDate f158361h;
    public final Data i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final wi0.b f158362j;
    public final Data k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Data f158363l;

    public n(Data orderData, Data orderLimits, e2b.a orderType, nel.n instrument, bfl.g side, BigDecimal quantity, BigDecimal targetRate, ExpiryDate expiryDate, Data data, wi0.b bVar, Data data2, Data data3) {
        Intrinsics.checkNotNullParameter(orderData, "orderData");
        Intrinsics.checkNotNullParameter(orderLimits, "orderLimits");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(targetRate, "targetRate");
        this.f158357a = orderData;
        this.f158358b = orderLimits;
        this.f158359c = orderType;
        this.d = instrument;
        this.e = side;
        this.f = quantity;
        this.f158360g = targetRate;
        this.f158361h = expiryDate;
        this.i = data;
        this.f158362j = bVar;
        this.k = data2;
        this.f158363l = data3;
    }

    public static n a(n nVar, Data data, Data data2, Data data3, wi0.b bVar, Data data4, Data data5, int i) {
        Data orderData = (i & 1) != 0 ? nVar.f158357a : data;
        Data orderLimits = (i & 2) != 0 ? nVar.f158358b : data2;
        e2b.a orderType = nVar.f158359c;
        nel.n instrument = nVar.d;
        bfl.g side = nVar.e;
        BigDecimal quantity = nVar.f;
        BigDecimal targetRate = nVar.f158360g;
        ExpiryDate expiryDate = nVar.f158361h;
        Data data6 = (i & 256) != 0 ? nVar.i : data3;
        wi0.b bVar2 = (i & 512) != 0 ? nVar.f158362j : bVar;
        Data data7 = (i & 1024) != 0 ? nVar.k : data4;
        Data data8 = (i & 2048) != 0 ? nVar.f158363l : data5;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(orderData, "orderData");
        Intrinsics.checkNotNullParameter(orderLimits, "orderLimits");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(targetRate, "targetRate");
        return new n(orderData, orderLimits, orderType, instrument, side, quantity, targetRate, expiryDate, data6, bVar2, data7, data8);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f158357a, nVar.f158357a) && Intrinsics.f(this.f158358b, nVar.f158358b) && this.f158359c == nVar.f158359c && Intrinsics.f(this.d, nVar.d) && this.e == nVar.e && Intrinsics.f(this.f, nVar.f) && Intrinsics.f(this.f158360g, nVar.f158360g) && Intrinsics.f(this.f158361h, nVar.f158361h) && Intrinsics.f(this.i, nVar.i) && Intrinsics.f(this.f158362j, nVar.f158362j) && Intrinsics.f(this.k, nVar.k) && Intrinsics.f(this.f158363l, nVar.f158363l);
    }

    public final int hashCode() {
        int iD = t61.a.d(this.f158360g, t61.a.d(this.f, wp5.y.b(this.e, a10.b.d(this.d, (this.f158359c.hashCode() + kii.e.c(this.f158358b, this.f158357a.hashCode() * 31, 31)) * 31, 31), 31), 31), 31);
        ExpiryDate expiryDate = this.f158361h;
        int iHashCode = (iD + (expiryDate == null ? 0 : expiryDate.hashCode())) * 31;
        Data data = this.i;
        int iHashCode2 = (iHashCode + (data == null ? 0 : data.hashCode())) * 31;
        wi0.b bVar = this.f158362j;
        int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.f297794a.hashCode())) * 31;
        Data data2 = this.k;
        int iHashCode4 = (iHashCode3 + (data2 == null ? 0 : data2.hashCode())) * 31;
        Data data3 = this.f158363l;
        return iHashCode4 + (data3 != null ? data3.hashCode() : 0);
    }
}
