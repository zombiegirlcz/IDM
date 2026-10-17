package com.revolut.trading.orders.ui.invest.placement.target_price;

import android.os.Parcel;
import android.os.Parcelable;
import bfl.g;
import com.revolut.data.database.models.openbanking.d;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import k4l.r0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/trading/orders/ui/invest/placement/target_price/TargetPriceScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TargetPriceScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TargetPriceScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f106996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f106997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r0 f106998c;
    public final Amount d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TargetPriceScreenContract$InputData(parcel.readString(), g.valueOf(parcel.readString()), r0.valueOf(parcel.readString()), (Amount) parcel.readParcelable(TargetPriceScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TargetPriceScreenContract$InputData[i];
        }
    }

    public TargetPriceScreenContract$InputData(String securityRef, g tradeSide, r0 orderType, Amount amount) {
        Intrinsics.checkNotNullParameter(securityRef, "securityRef");
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        this.f106996a = securityRef;
        this.f106997b = tradeSide;
        this.f106998c = orderType;
        this.d = amount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TargetPriceScreenContract$InputData)) {
            return false;
        }
        TargetPriceScreenContract$InputData targetPriceScreenContract$InputData = (TargetPriceScreenContract$InputData) obj2;
        return Intrinsics.f(this.f106996a, targetPriceScreenContract$InputData.f106996a) && this.f106997b == targetPriceScreenContract$InputData.f106997b && this.f106998c == targetPriceScreenContract$InputData.f106998c && Intrinsics.f(this.d, targetPriceScreenContract$InputData.d);
    }

    public final int hashCode() {
        int iF = d.f(this.f106998c, y.b(this.f106997b, this.f106996a.hashCode() * 31, 31), 31);
        Amount amount = this.d;
        return iF + (amount == null ? 0 : amount.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f106996a);
        dest.writeString(this.f106997b.name());
        dest.writeString(this.f106998c.name());
        dest.writeParcelable(this.d, i);
    }
}
