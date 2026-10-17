package com.revolut.feature.rewards.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rewards/api/navigation/PerkAccessDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_retail_rewards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PerkAccessDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<PerkAccessDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f84892b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PerkAccessDestination(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PerkAccessDestination[i];
        }
    }

    public PerkAccessDestination(String merchantRef, String planTier) {
        Intrinsics.checkNotNullParameter(merchantRef, "merchantRef");
        Intrinsics.checkNotNullParameter(planTier, "planTier");
        this.f84891a = merchantRef;
        this.f84892b = planTier;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PerkAccessDestination)) {
            return false;
        }
        PerkAccessDestination perkAccessDestination = (PerkAccessDestination) obj2;
        return Intrinsics.f(this.f84891a, perkAccessDestination.f84891a) && Intrinsics.f(this.f84892b, perkAccessDestination.f84892b);
    }

    public final int hashCode() {
        return this.f84892b.hashCode() + (this.f84891a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f84891a);
        dest.writeString(this.f84892b);
    }
}
