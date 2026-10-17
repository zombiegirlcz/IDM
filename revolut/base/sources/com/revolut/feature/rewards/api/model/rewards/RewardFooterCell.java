package com.revolut.feature.rewards.api.model.rewards;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rewards/api/model/rewards/RewardFooterCell;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_rewards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RewardFooterCell implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RewardFooterCell> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RewardAvatar f84867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f84868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f84869c;
    public final String d;
    public final String e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RewardFooterCell((RewardAvatar) parcel.readParcelable(RewardFooterCell.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RewardFooterCell[i];
        }
    }

    public RewardFooterCell(RewardAvatar rewardAvatar, String title, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f84867a = rewardAvatar;
        this.f84868b = title;
        this.f84869c = str;
        this.d = str2;
        this.e = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RewardFooterCell)) {
            return false;
        }
        RewardFooterCell rewardFooterCell = (RewardFooterCell) obj2;
        return Intrinsics.f(this.f84867a, rewardFooterCell.f84867a) && Intrinsics.f(this.f84868b, rewardFooterCell.f84868b) && Intrinsics.f(this.f84869c, rewardFooterCell.f84869c) && Intrinsics.f(this.d, rewardFooterCell.d) && Intrinsics.f(this.e, rewardFooterCell.e);
    }

    public final int hashCode() {
        RewardAvatar rewardAvatar = this.f84867a;
        int iC = p.a.c((rewardAvatar == null ? 0 : rewardAvatar.hashCode()) * 31, 31, this.f84868b);
        String str = this.f84869c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f84867a, i);
        dest.writeString(this.f84868b);
        dest.writeString(this.f84869c);
        dest.writeString(this.d);
        dest.writeString(this.e);
    }
}
