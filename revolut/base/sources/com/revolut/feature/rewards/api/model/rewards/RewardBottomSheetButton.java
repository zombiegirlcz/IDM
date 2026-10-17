package com.revolut.feature.rewards.api.model.rewards;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rewards/api/model/rewards/RewardBottomSheetButton;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_rewards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RewardBottomSheetButton implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RewardBottomSheetButton> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f84847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RewardBottomSheetAction f84848c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RewardBottomSheetButton(parcel.readString(), parcel.readString(), (RewardBottomSheetAction) parcel.readParcelable(RewardBottomSheetButton.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RewardBottomSheetButton[i];
        }
    }

    public RewardBottomSheetButton(String str, String text, RewardBottomSheetAction action) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f84846a = str;
        this.f84847b = text;
        this.f84848c = action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RewardBottomSheetButton)) {
            return false;
        }
        RewardBottomSheetButton rewardBottomSheetButton = (RewardBottomSheetButton) obj2;
        return Intrinsics.f(this.f84846a, rewardBottomSheetButton.f84846a) && Intrinsics.f(this.f84847b, rewardBottomSheetButton.f84847b) && Intrinsics.f(this.f84848c, rewardBottomSheetButton.f84848c);
    }

    public final int hashCode() {
        String str = this.f84846a;
        return this.f84848c.hashCode() + p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f84847b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f84846a);
        dest.writeString(this.f84847b);
        dest.writeParcelable(this.f84848c, i);
    }
}
