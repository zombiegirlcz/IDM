package com.revolut.feature.staking.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/staking/api/model/StakingAvailability;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_staking_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StakingAvailability implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<StakingAvailability> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StakingProduct f88058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StakingPocket f88059b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StakingAvailability(parcel.readInt() == 0 ? null : StakingProduct.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StakingPocket.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StakingAvailability[i];
        }
    }

    public StakingAvailability(StakingProduct stakingProduct, StakingPocket stakingPocket) {
        this.f88058a = stakingProduct;
        this.f88059b = stakingPocket;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StakingAvailability)) {
            return false;
        }
        StakingAvailability stakingAvailability = (StakingAvailability) obj2;
        return Intrinsics.f(this.f88058a, stakingAvailability.f88058a) && Intrinsics.f(this.f88059b, stakingAvailability.f88059b);
    }

    public final int hashCode() {
        StakingProduct stakingProduct = this.f88058a;
        int iHashCode = (stakingProduct == null ? 0 : stakingProduct.hashCode()) * 31;
        StakingPocket stakingPocket = this.f88059b;
        return iHashCode + (stakingPocket != null ? stakingPocket.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        StakingProduct stakingProduct = this.f88058a;
        if (stakingProduct == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            stakingProduct.writeToParcel(dest, i);
        }
        StakingPocket stakingPocket = this.f88059b;
        if (stakingPocket == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            stakingPocket.writeToParcel(dest, i);
        }
    }
}
