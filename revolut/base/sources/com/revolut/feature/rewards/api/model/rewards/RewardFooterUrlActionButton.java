package com.revolut.feature.rewards.api.model.rewards;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rewards/api/model/rewards/RewardFooterUrlActionButton;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_rewards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RewardFooterUrlActionButton implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RewardFooterUrlActionButton> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f84874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RewardFooterOpenUrlAction f84875c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RewardFooterUrlActionButton(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : RewardFooterOpenUrlAction.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RewardFooterUrlActionButton[i];
        }
    }

    public RewardFooterUrlActionButton(String str, String str2, RewardFooterOpenUrlAction rewardFooterOpenUrlAction) {
        this.f84873a = str;
        this.f84874b = str2;
        this.f84875c = rewardFooterOpenUrlAction;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RewardFooterUrlActionButton)) {
            return false;
        }
        RewardFooterUrlActionButton rewardFooterUrlActionButton = (RewardFooterUrlActionButton) obj2;
        return Intrinsics.f(this.f84873a, rewardFooterUrlActionButton.f84873a) && Intrinsics.f(this.f84874b, rewardFooterUrlActionButton.f84874b) && Intrinsics.f(this.f84875c, rewardFooterUrlActionButton.f84875c);
    }

    public final int hashCode() {
        String str = this.f84873a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f84874b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        RewardFooterOpenUrlAction rewardFooterOpenUrlAction = this.f84875c;
        return iHashCode2 + (rewardFooterOpenUrlAction != null ? rewardFooterOpenUrlAction.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f84873a);
        dest.writeString(this.f84874b);
        RewardFooterOpenUrlAction rewardFooterOpenUrlAction = this.f84875c;
        if (rewardFooterOpenUrlAction == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            rewardFooterOpenUrlAction.writeToParcel(dest, i);
        }
    }
}
