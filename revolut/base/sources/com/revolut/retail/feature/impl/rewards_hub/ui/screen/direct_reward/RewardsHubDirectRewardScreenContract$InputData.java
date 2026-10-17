package com.revolut.retail.feature.impl.rewards_hub.ui.screen.direct_reward;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/impl/rewards_hub/ui/screen/direct_reward/RewardsHubDirectRewardScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_rewards_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RewardsHubDirectRewardScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<RewardsHubDirectRewardScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f101586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f101587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f101588c;
    public final boolean d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RewardsHubDirectRewardScreenContract$InputData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RewardsHubDirectRewardScreenContract$InputData[i];
        }
    }

    public RewardsHubDirectRewardScreenContract$InputData(String collectionId, String campaignId, String str, boolean z) {
        Intrinsics.checkNotNullParameter(collectionId, "collectionId");
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        this.f101586a = collectionId;
        this.f101587b = campaignId;
        this.f101588c = str;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RewardsHubDirectRewardScreenContract$InputData)) {
            return false;
        }
        RewardsHubDirectRewardScreenContract$InputData rewardsHubDirectRewardScreenContract$InputData = (RewardsHubDirectRewardScreenContract$InputData) obj2;
        return Intrinsics.f(this.f101586a, rewardsHubDirectRewardScreenContract$InputData.f101586a) && Intrinsics.f(this.f101587b, rewardsHubDirectRewardScreenContract$InputData.f101587b) && Intrinsics.f(this.f101588c, rewardsHubDirectRewardScreenContract$InputData.f101588c) && this.d == rewardsHubDirectRewardScreenContract$InputData.d;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f101586a.hashCode() * 31, 31, this.f101587b);
        String str = this.f101588c;
        return Boolean.hashCode(this.d) + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f101586a);
        dest.writeString(this.f101587b);
        dest.writeString(this.f101588c);
        dest.writeInt(this.d ? 1 : 0);
    }
}
