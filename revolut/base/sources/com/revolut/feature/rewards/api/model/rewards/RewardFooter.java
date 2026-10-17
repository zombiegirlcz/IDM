package com.revolut.feature.rewards.api.model.rewards;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rewards/api/model/rewards/RewardFooter;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_rewards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RewardFooter implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RewardFooter> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RewardFooterButton f84852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RewardFooterButton f84853b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RewardFooter(parcel.readInt() == 0 ? null : RewardFooterButton.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? RewardFooterButton.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RewardFooter[i];
        }
    }

    public RewardFooter(RewardFooterButton rewardFooterButton, RewardFooterButton rewardFooterButton2) {
        this.f84852a = rewardFooterButton;
        this.f84853b = rewardFooterButton2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RewardFooter)) {
            return false;
        }
        RewardFooter rewardFooter = (RewardFooter) obj2;
        return Intrinsics.f(this.f84852a, rewardFooter.f84852a) && Intrinsics.f(this.f84853b, rewardFooter.f84853b);
    }

    public final int hashCode() {
        RewardFooterButton rewardFooterButton = this.f84852a;
        int iHashCode = (rewardFooterButton == null ? 0 : rewardFooterButton.hashCode()) * 31;
        RewardFooterButton rewardFooterButton2 = this.f84853b;
        return iHashCode + (rewardFooterButton2 != null ? rewardFooterButton2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        RewardFooterButton rewardFooterButton = this.f84852a;
        if (rewardFooterButton == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            rewardFooterButton.writeToParcel(dest, i);
        }
        RewardFooterButton rewardFooterButton2 = this.f84853b;
        if (rewardFooterButton2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            rewardFooterButton2.writeToParcel(dest, i);
        }
    }
}
