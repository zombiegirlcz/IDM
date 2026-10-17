package com.revolut.feature.rewards.api.model.rewards;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rewards/api/model/rewards/RewardBottomSheet;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_rewards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RewardBottomSheet implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RewardBottomSheet> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RewardAvatar f84840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f84841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f84842c;
    public final RewardBottomSheetFooter d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RewardBottomSheet((RewardAvatar) parcel.readParcelable(RewardBottomSheet.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : RewardBottomSheetFooter.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RewardBottomSheet[i];
        }
    }

    public RewardBottomSheet(RewardAvatar rewardAvatar, String title, String str, RewardBottomSheetFooter rewardBottomSheetFooter) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f84840a = rewardAvatar;
        this.f84841b = title;
        this.f84842c = str;
        this.d = rewardBottomSheetFooter;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RewardBottomSheet)) {
            return false;
        }
        RewardBottomSheet rewardBottomSheet = (RewardBottomSheet) obj2;
        return Intrinsics.f(this.f84840a, rewardBottomSheet.f84840a) && Intrinsics.f(this.f84841b, rewardBottomSheet.f84841b) && Intrinsics.f(this.f84842c, rewardBottomSheet.f84842c) && Intrinsics.f(this.d, rewardBottomSheet.d);
    }

    public final int hashCode() {
        RewardAvatar rewardAvatar = this.f84840a;
        int iC = p.a.c((rewardAvatar == null ? 0 : rewardAvatar.hashCode()) * 31, 31, this.f84841b);
        String str = this.f84842c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        RewardBottomSheetFooter rewardBottomSheetFooter = this.d;
        return iHashCode + (rewardBottomSheetFooter != null ? rewardBottomSheetFooter.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f84840a, i);
        dest.writeString(this.f84841b);
        dest.writeString(this.f84842c);
        RewardBottomSheetFooter rewardBottomSheetFooter = this.d;
        if (rewardBottomSheetFooter == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            rewardBottomSheetFooter.writeToParcel(dest, i);
        }
    }
}
