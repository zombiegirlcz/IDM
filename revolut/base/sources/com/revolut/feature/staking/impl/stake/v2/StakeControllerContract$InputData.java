package com.revolut.feature.staking.impl.stake.v2;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.staking.api.model.StakingPocket;
import com.revolut.feature.staking.api.model.StakingProduct;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/staking/impl/stake/v2/StakeControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_staking_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StakeControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<StakeControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StakingProduct f88138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StakingPocket f88139b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StakeControllerContract$InputData((StakingProduct) parcel.readParcelable(StakeControllerContract$InputData.class.getClassLoader()), (StakingPocket) parcel.readParcelable(StakeControllerContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StakeControllerContract$InputData[i];
        }
    }

    public StakeControllerContract$InputData(StakingProduct stakingProduct, StakingPocket stakingPocket) {
        Intrinsics.checkNotNullParameter(stakingProduct, "stakingProduct");
        this.f88138a = stakingProduct;
        this.f88139b = stakingPocket;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StakeControllerContract$InputData)) {
            return false;
        }
        StakeControllerContract$InputData stakeControllerContract$InputData = (StakeControllerContract$InputData) obj2;
        return Intrinsics.f(this.f88138a, stakeControllerContract$InputData.f88138a) && Intrinsics.f(this.f88139b, stakeControllerContract$InputData.f88139b);
    }

    public final int hashCode() {
        int iHashCode = this.f88138a.hashCode() * 31;
        StakingPocket stakingPocket = this.f88139b;
        return iHashCode + (stakingPocket == null ? 0 : stakingPocket.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f88138a, i);
        dest.writeParcelable(this.f88139b, i);
    }
}
