package com.revolut.feature.incentive_reward.impl.ui.redeem_reward.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/incentive_reward/impl/ui/redeem_reward/flow/RedeemRewardFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_incentive_reward_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RedeemRewardFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<RedeemRewardFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f74881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ze7.a f74882b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RedeemRewardFlowContract$InputData(parcel.readString(), ze7.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RedeemRewardFlowContract$InputData[i];
        }
    }

    public RedeemRewardFlowContract$InputData(String campaignId, ze7.a rewardType) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        Intrinsics.checkNotNullParameter(rewardType, "rewardType");
        this.f74881a = campaignId;
        this.f74882b = rewardType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RedeemRewardFlowContract$InputData)) {
            return false;
        }
        RedeemRewardFlowContract$InputData redeemRewardFlowContract$InputData = (RedeemRewardFlowContract$InputData) obj2;
        return Intrinsics.f(this.f74881a, redeemRewardFlowContract$InputData.f74881a) && this.f74882b == redeemRewardFlowContract$InputData.f74882b;
    }

    public final int hashCode() {
        return this.f74882b.hashCode() + (this.f74881a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f74881a);
        dest.writeString(this.f74882b.name());
    }
}
