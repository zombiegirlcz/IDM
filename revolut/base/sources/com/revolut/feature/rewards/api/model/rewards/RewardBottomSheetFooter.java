package com.revolut.feature.rewards.api.model.rewards;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rewards/api/model/rewards/RewardBottomSheetFooter;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_rewards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RewardBottomSheetFooter implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RewardBottomSheetFooter> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RewardBottomSheetButton f84849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RewardBottomSheetButton f84850b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RewardBottomSheetFooter(parcel.readInt() == 0 ? null : RewardBottomSheetButton.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? RewardBottomSheetButton.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RewardBottomSheetFooter[i];
        }
    }

    public RewardBottomSheetFooter(RewardBottomSheetButton rewardBottomSheetButton, RewardBottomSheetButton rewardBottomSheetButton2) {
        this.f84849a = rewardBottomSheetButton;
        this.f84850b = rewardBottomSheetButton2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RewardBottomSheetFooter)) {
            return false;
        }
        RewardBottomSheetFooter rewardBottomSheetFooter = (RewardBottomSheetFooter) obj2;
        return Intrinsics.f(this.f84849a, rewardBottomSheetFooter.f84849a) && Intrinsics.f(this.f84850b, rewardBottomSheetFooter.f84850b);
    }

    public final int hashCode() {
        RewardBottomSheetButton rewardBottomSheetButton = this.f84849a;
        int iHashCode = (rewardBottomSheetButton == null ? 0 : rewardBottomSheetButton.hashCode()) * 31;
        RewardBottomSheetButton rewardBottomSheetButton2 = this.f84850b;
        return iHashCode + (rewardBottomSheetButton2 != null ? rewardBottomSheetButton2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        RewardBottomSheetButton rewardBottomSheetButton = this.f84849a;
        if (rewardBottomSheetButton == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            rewardBottomSheetButton.writeToParcel(dest, i);
        }
        RewardBottomSheetButton rewardBottomSheetButton2 = this.f84850b;
        if (rewardBottomSheetButton2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            rewardBottomSheetButton2.writeToParcel(dest, i);
        }
    }
}
