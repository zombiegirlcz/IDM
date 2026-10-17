package com.revolut.trading.orders.ui.invest.placement.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/trading/orders/ui/invest/placement/models/InvestOutputValue;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InvestOutputValue implements Parcelable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final InvestOutputValue f106855c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f106856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ChargeBreakdown f106857b;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<InvestOutputValue> CREATOR = new b();

    /* JADX INFO: renamed from: com.revolut.trading.orders.ui.invest.placement.models.InvestOutputValue$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InvestOutputValue((BigDecimal) parcel.readSerializable(), (ChargeBreakdown) parcel.readParcelable(InvestOutputValue.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InvestOutputValue[i];
        }
    }

    static {
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        f106855c = new InvestOutputValue(ZERO, null);
    }

    public InvestOutputValue(BigDecimal value, ChargeBreakdown chargeBreakdown) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f106856a = value;
        this.f106857b = chargeBreakdown;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InvestOutputValue)) {
            return false;
        }
        InvestOutputValue investOutputValue = (InvestOutputValue) obj2;
        return Intrinsics.f(this.f106856a, investOutputValue.f106856a) && Intrinsics.f(this.f106857b, investOutputValue.f106857b);
    }

    public final int hashCode() {
        int iHashCode = this.f106856a.hashCode() * 31;
        ChargeBreakdown chargeBreakdown = this.f106857b;
        return iHashCode + (chargeBreakdown == null ? 0 : chargeBreakdown.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f106856a);
        dest.writeParcelable(this.f106857b, i);
    }
}
