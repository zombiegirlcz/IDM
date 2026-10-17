package com.revolut.feature.rewards.api.model.rewards;

import android.os.Parcel;
import android.os.Parcelable;
import ggc.x;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/rewards/api/model/rewards/RewardIcon;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "ggc/x", "feature_retail_rewards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RewardIcon implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RewardIcon> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f84879b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RewardIcon(parcel.readString(), x.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RewardIcon[i];
        }
    }

    public RewardIcon(String iconResourceName, x style) {
        Intrinsics.checkNotNullParameter(iconResourceName, "iconResourceName");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f84878a = iconResourceName;
        this.f84879b = style;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RewardIcon)) {
            return false;
        }
        RewardIcon rewardIcon = (RewardIcon) obj2;
        return Intrinsics.f(this.f84878a, rewardIcon.f84878a) && this.f84879b == rewardIcon.f84879b;
    }

    public final int hashCode() {
        return this.f84879b.hashCode() + (this.f84878a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f84878a);
        dest.writeString(this.f84879b.name());
    }
}
