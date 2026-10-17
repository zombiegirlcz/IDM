package com.revolut.feature_exchange.impl.ui.exchange.market_order.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.staking.api.model.StakingAvailability;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_exchange/impl/ui/exchange/market_order/model/ExchangeStakingData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_exchange_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ExchangeStakingData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ExchangeStakingData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f96895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StakingAvailability f96896b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ExchangeStakingData(parcel.readString(), (StakingAvailability) parcel.readParcelable(ExchangeStakingData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ExchangeStakingData[i];
        }
    }

    public ExchangeStakingData(String pocketId, StakingAvailability stakingAvailability) {
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        Intrinsics.checkNotNullParameter(stakingAvailability, "stakingAvailability");
        this.f96895a = pocketId;
        this.f96896b = stakingAvailability;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ExchangeStakingData)) {
            return false;
        }
        ExchangeStakingData exchangeStakingData = (ExchangeStakingData) obj2;
        return Intrinsics.f(this.f96895a, exchangeStakingData.f96895a) && Intrinsics.f(this.f96896b, exchangeStakingData.f96896b);
    }

    public final int hashCode() {
        return this.f96896b.hashCode() + (this.f96895a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f96895a);
        dest.writeParcelable(this.f96896b, i);
    }
}
