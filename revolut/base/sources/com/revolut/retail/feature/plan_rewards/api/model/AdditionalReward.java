package com.revolut.retail.feature.plan_rewards.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/plan_rewards/api/model/AdditionalReward;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_plan_rewards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AdditionalReward implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AdditionalReward> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f102522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f102523b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AdditionalReward(parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AdditionalReward[i];
        }
    }

    public AdditionalReward(String title, int i) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f102522a = title;
        this.f102523b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AdditionalReward)) {
            return false;
        }
        AdditionalReward additionalReward = (AdditionalReward) obj2;
        return Intrinsics.f(this.f102522a, additionalReward.f102522a) && this.f102523b == additionalReward.f102523b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f102523b) + (this.f102522a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f102522a);
        dest.writeInt(this.f102523b);
    }
}
