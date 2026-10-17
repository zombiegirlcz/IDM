package com.revolut.retail.trading.core.domain.orders;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/trading/core/domain/orders/InvestMutualFundOrderData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "trading_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InvestMutualFundOrderData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<InvestMutualFundOrderData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f104584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Instant f104585b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InvestMutualFundOrderData((Instant) parcel.readSerializable(), (Instant) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InvestMutualFundOrderData[i];
        }
    }

    public InvestMutualFundOrderData(Instant tradeDate, Instant settlementDate) {
        Intrinsics.checkNotNullParameter(tradeDate, "tradeDate");
        Intrinsics.checkNotNullParameter(settlementDate, "settlementDate");
        this.f104584a = tradeDate;
        this.f104585b = settlementDate;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InvestMutualFundOrderData)) {
            return false;
        }
        InvestMutualFundOrderData investMutualFundOrderData = (InvestMutualFundOrderData) obj2;
        return Intrinsics.f(this.f104584a, investMutualFundOrderData.f104584a) && Intrinsics.f(this.f104585b, investMutualFundOrderData.f104585b);
    }

    public final int hashCode() {
        return this.f104585b.hashCode() + (this.f104584a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f104584a);
        dest.writeSerializable(this.f104585b);
    }
}
