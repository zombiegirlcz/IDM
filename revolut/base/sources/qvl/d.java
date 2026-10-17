package qvl;

import com.revolut.feature.trading_orders.common.models.FrequencySettings;
import com.revolut.retail.trading.core.domain.orders.OrderExpiry;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.trading.orders.ui.trade.model.ExtendedHoursStatus;
import k4l.r0;
import kotlin.jvm.internal.Intrinsics;
import od0.i;

/* JADX INFO: loaded from: classes12.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r0 f249719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Amount f249720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f249721c;
    public final OrderExpiry d;
    public final boolean e;
    public final ExtendedHoursStatus f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final FrequencySettings f249722g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i f249723h;

    public d(r0 orderType, Amount amount, boolean z, OrderExpiry orderExpiry, boolean z3, ExtendedHoursStatus extendedHoursStatus, FrequencySettings frequencySettings, i iVar, int i) {
        amount = (i & 2) != 0 ? null : amount;
        z = (i & 4) != 0 ? true : z;
        orderExpiry = (i & 8) != 0 ? null : orderExpiry;
        z3 = (i & 16) != 0 ? true : z3;
        extendedHoursStatus = (i & 32) != 0 ? null : extendedHoursStatus;
        frequencySettings = (i & 64) != 0 ? null : frequencySettings;
        iVar = (i & 128) != 0 ? null : iVar;
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        this.f249719a = orderType;
        this.f249720b = amount;
        this.f249721c = z;
        this.d = orderExpiry;
        this.e = z3;
        this.f = extendedHoursStatus;
        this.f249722g = frequencySettings;
        this.f249723h = iVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f249719a == dVar.f249719a && Intrinsics.f(this.f249720b, dVar.f249720b) && this.f249721c == dVar.f249721c && Intrinsics.f(this.d, dVar.d) && this.e == dVar.e && Intrinsics.f(this.f, dVar.f) && Intrinsics.f(this.f249722g, dVar.f249722g) && Intrinsics.f(this.f249723h, dVar.f249723h);
    }

    public final int hashCode() {
        int iHashCode = this.f249719a.hashCode() * 31;
        Amount amount = this.f249720b;
        int iC = j6.a.c((iHashCode + (amount == null ? 0 : amount.hashCode())) * 31, 31, this.f249721c);
        OrderExpiry orderExpiry = this.d;
        int iC2 = j6.a.c((iC + (orderExpiry == null ? 0 : orderExpiry.hashCode())) * 31, 31, this.e);
        ExtendedHoursStatus extendedHoursStatus = this.f;
        int iHashCode2 = (iC2 + (extendedHoursStatus == null ? 0 : extendedHoursStatus.hashCode())) * 31;
        FrequencySettings frequencySettings = this.f249722g;
        int iHashCode3 = (iHashCode2 + (frequencySettings == null ? 0 : frequencySettings.hashCode())) * 31;
        i iVar = this.f249723h;
        return iHashCode3 + (iVar != null ? iVar.hashCode() : 0);
    }
}
