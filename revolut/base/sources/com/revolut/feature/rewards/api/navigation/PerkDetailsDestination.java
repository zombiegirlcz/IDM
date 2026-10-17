package com.revolut.feature.rewards.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.rewards.api.model.rewards.RewardOutlet;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rewards/api/navigation/PerkDetailsDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_retail_rewards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PerkDetailsDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<PerkDetailsDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f84894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f84895c;
    public final RewardOutlet d;
    public final boolean e;
    public final boolean f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            RewardOutlet rewardOutletCreateFromParcel = parcel.readInt() == 0 ? null : RewardOutlet.CREATOR.createFromParcel(parcel);
            boolean z3 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z3 = true;
            } else {
                z = false;
            }
            return new PerkDetailsDestination(rewardOutletCreateFromParcel, string, string2, string3, z3, parcel.readInt() == 0 ? z : true);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PerkDetailsDestination[i];
        }
    }

    public PerkDetailsDestination(RewardOutlet rewardOutlet, String perkId, String source, String str, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(perkId, "perkId");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f84893a = perkId;
        this.f84894b = source;
        this.f84895c = str;
        this.d = rewardOutlet;
        this.e = z;
        this.f = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PerkDetailsDestination)) {
            return false;
        }
        PerkDetailsDestination perkDetailsDestination = (PerkDetailsDestination) obj2;
        return Intrinsics.f(this.f84893a, perkDetailsDestination.f84893a) && Intrinsics.f(this.f84894b, perkDetailsDestination.f84894b) && Intrinsics.f(this.f84895c, perkDetailsDestination.f84895c) && Intrinsics.f(this.d, perkDetailsDestination.d) && this.e == perkDetailsDestination.e && this.f == perkDetailsDestination.f;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f84893a.hashCode() * 31, 31, this.f84894b);
        String str = this.f84895c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        RewardOutlet rewardOutlet = this.d;
        return Boolean.hashCode(this.f) + j6.a.c((iHashCode + (rewardOutlet != null ? rewardOutlet.hashCode() : 0)) * 31, 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f84893a);
        dest.writeString(this.f84894b);
        dest.writeString(this.f84895c);
        RewardOutlet rewardOutlet = this.d;
        if (rewardOutlet == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            rewardOutlet.writeToParcel(dest, i);
        }
        dest.writeInt(this.e ? 1 : 0);
        dest.writeInt(this.f ? 1 : 0);
    }
}
