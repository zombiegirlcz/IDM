package com.revolut.feature.staking.impl.flow.stake.v2;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.staking.api.model.StakingPocket;
import com.revolut.feature.staking.api.model.StakingProduct;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/staking/impl/flow/stake/v2/StakingControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_staking_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StakingControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<StakingControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f88125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StakingProduct f88126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StakingPocket f88127c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StakingControllerContract$InputData(parcel.readString(), (StakingProduct) parcel.readParcelable(StakingControllerContract$InputData.class.getClassLoader()), (StakingPocket) parcel.readParcelable(StakingControllerContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StakingControllerContract$InputData[i];
        }
    }

    public StakingControllerContract$InputData(String str, StakingProduct stakingProduct, StakingPocket stakingPocket) {
        Intrinsics.checkNotNullParameter(stakingProduct, "stakingProduct");
        this.f88125a = str;
        this.f88126b = stakingProduct;
        this.f88127c = stakingPocket;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StakingControllerContract$InputData)) {
            return false;
        }
        StakingControllerContract$InputData stakingControllerContract$InputData = (StakingControllerContract$InputData) obj2;
        return Intrinsics.f(this.f88125a, stakingControllerContract$InputData.f88125a) && Intrinsics.f(this.f88126b, stakingControllerContract$InputData.f88126b) && Intrinsics.f(this.f88127c, stakingControllerContract$InputData.f88127c);
    }

    public final int hashCode() {
        String str = this.f88125a;
        int iHashCode = (this.f88126b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        StakingPocket stakingPocket = this.f88127c;
        return iHashCode + (stakingPocket != null ? stakingPocket.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f88125a);
        dest.writeParcelable(this.f88126b, i);
        dest.writeParcelable(this.f88127c, i);
    }
}
