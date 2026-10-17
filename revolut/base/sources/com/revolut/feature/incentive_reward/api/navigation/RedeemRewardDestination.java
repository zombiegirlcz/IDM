package com.revolut.feature.incentive_reward.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/incentive_reward/api/navigation/RedeemRewardDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_retail_incentive_reward_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RedeemRewardDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<RedeemRewardDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f74848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ze7.a f74849b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RedeemRewardDestination(parcel.readString(), ze7.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RedeemRewardDestination[i];
        }
    }

    public RedeemRewardDestination(String campaignId, ze7.a rewardType) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        Intrinsics.checkNotNullParameter(rewardType, "rewardType");
        this.f74848a = campaignId;
        this.f74849b = rewardType;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF74848a() {
        return this.f74848a;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final ze7.a getF74849b() {
        return this.f74849b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RedeemRewardDestination)) {
            return false;
        }
        RedeemRewardDestination redeemRewardDestination = (RedeemRewardDestination) obj2;
        return Intrinsics.f(this.f74848a, redeemRewardDestination.f74848a) && this.f74849b == redeemRewardDestination.f74849b;
    }

    public final int hashCode() {
        return this.f74849b.hashCode() + (this.f74848a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f74848a);
        dest.writeString(this.f74849b.name());
    }
}
