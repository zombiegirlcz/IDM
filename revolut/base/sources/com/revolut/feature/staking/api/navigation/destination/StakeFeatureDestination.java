package com.revolut.feature.staking.api.navigation.destination;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.staking.api.model.StakingPocket;
import com.revolut.feature.staking.api.model.StakingProduct;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/staking/api/navigation/destination/StakeFeatureDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_staking_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StakeFeatureDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<StakeFeatureDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f88095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StakingProduct f88096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StakingPocket f88097c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StakeFeatureDestination(parcel.readString(), StakingProduct.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StakingPocket.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StakeFeatureDestination[i];
        }
    }

    public StakeFeatureDestination(String str, StakingProduct stakingProduct, StakingPocket stakingPocket) {
        Intrinsics.checkNotNullParameter(stakingProduct, "stakingProduct");
        this.f88095a = str;
        this.f88096b = stakingProduct;
        this.f88097c = stakingPocket;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF88095a() {
        return this.f88095a;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final StakingPocket getF88097c() {
        return this.f88097c;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final StakingProduct getF88096b() {
        return this.f88096b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StakeFeatureDestination)) {
            return false;
        }
        StakeFeatureDestination stakeFeatureDestination = (StakeFeatureDestination) obj2;
        return Intrinsics.f(this.f88095a, stakeFeatureDestination.f88095a) && Intrinsics.f(this.f88096b, stakeFeatureDestination.f88096b) && Intrinsics.f(this.f88097c, stakeFeatureDestination.f88097c);
    }

    public final int hashCode() {
        String str = this.f88095a;
        int iHashCode = (this.f88096b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        StakingPocket stakingPocket = this.f88097c;
        return iHashCode + (stakingPocket != null ? stakingPocket.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f88095a);
        this.f88096b.writeToParcel(dest, i);
        StakingPocket stakingPocket = this.f88097c;
        if (stakingPocket == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            stakingPocket.writeToParcel(dest, i);
        }
    }
}
