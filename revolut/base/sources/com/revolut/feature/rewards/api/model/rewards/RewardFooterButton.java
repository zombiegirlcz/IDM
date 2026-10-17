package com.revolut.feature.rewards.api.model.rewards;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rewards/api/model/rewards/RewardFooterButton;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_rewards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RewardFooterButton implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RewardFooterButton> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f84865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RewardFooterAction f84866c;
    public final boolean d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RewardFooterButton(parcel.readString(), parcel.readString(), (RewardFooterAction) parcel.readParcelable(RewardFooterButton.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RewardFooterButton[i];
        }
    }

    public RewardFooterButton(String str, String text, RewardFooterAction action, boolean z) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f84864a = str;
        this.f84865b = text;
        this.f84866c = action;
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
        if (!(obj2 instanceof RewardFooterButton)) {
            return false;
        }
        RewardFooterButton rewardFooterButton = (RewardFooterButton) obj2;
        return Intrinsics.f(this.f84864a, rewardFooterButton.f84864a) && Intrinsics.f(this.f84865b, rewardFooterButton.f84865b) && Intrinsics.f(this.f84866c, rewardFooterButton.f84866c) && this.d == rewardFooterButton.d;
    }

    public final int hashCode() {
        String str = this.f84864a;
        return Boolean.hashCode(this.d) + ((this.f84866c.hashCode() + p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f84865b)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f84864a);
        dest.writeString(this.f84865b);
        dest.writeParcelable(this.f84866c, i);
        dest.writeInt(this.d ? 1 : 0);
    }
}
