package com.revolut.feature_crypto_order_flow.impl.order_summary.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.staking.api.model.StakingAvailability;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_crypto_order_flow/impl/order_summary/models/ExchangeStakingData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_crypto_order_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ExchangeStakingData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ExchangeStakingData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f96799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StakingAvailability f96800b;

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
        this.f96799a = pocketId;
        this.f96800b = stakingAvailability;
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
        return Intrinsics.f(this.f96799a, exchangeStakingData.f96799a) && Intrinsics.f(this.f96800b, exchangeStakingData.f96800b);
    }

    public final int hashCode() {
        return this.f96800b.hashCode() + (this.f96799a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f96799a);
        dest.writeParcelable(this.f96800b, i);
    }
}
