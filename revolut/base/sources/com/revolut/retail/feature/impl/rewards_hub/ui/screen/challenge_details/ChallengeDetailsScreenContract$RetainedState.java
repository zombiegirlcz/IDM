package com.revolut.retail.feature.impl.rewards_hub.ui.screen.challenge_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.vc.ui.States$PersistentDomain;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/impl/rewards_hub/ui/screen/challenge_details/ChallengeDetailsScreenContract$RetainedState", "Lcom/revolut/kompot/navigable/vc/ui/States$PersistentDomain;", "", "toString", "()Ljava/lang/String;", "feature_rewards_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChallengeDetailsScreenContract$RetainedState implements States$PersistentDomain {

    @NotNull
    public static final Parcelable.Creator<ChallengeDetailsScreenContract$RetainedState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f101576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f101577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f101578c;
    public final boolean d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ChallengeDetailsScreenContract$RetainedState(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ChallengeDetailsScreenContract$RetainedState[i];
        }
    }

    public ChallengeDetailsScreenContract$RetainedState(String currentCampaignId, String str, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(currentCampaignId, "currentCampaignId");
        this.f101576a = currentCampaignId;
        this.f101577b = str;
        this.f101578c = z;
        this.d = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ChallengeDetailsScreenContract$RetainedState)) {
            return false;
        }
        ChallengeDetailsScreenContract$RetainedState challengeDetailsScreenContract$RetainedState = (ChallengeDetailsScreenContract$RetainedState) obj2;
        return Intrinsics.f(this.f101576a, challengeDetailsScreenContract$RetainedState.f101576a) && Intrinsics.f(this.f101577b, challengeDetailsScreenContract$RetainedState.f101577b) && this.f101578c == challengeDetailsScreenContract$RetainedState.f101578c && this.d == challengeDetailsScreenContract$RetainedState.d;
    }

    public final int hashCode() {
        int iHashCode = this.f101576a.hashCode() * 31;
        String str = this.f101577b;
        return Boolean.hashCode(this.d) + j6.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f101578c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f101576a);
        dest.writeString(this.f101577b);
        dest.writeInt(this.f101578c ? 1 : 0);
        dest.writeInt(this.d ? 1 : 0);
    }

    public ChallengeDetailsScreenContract$RetainedState() {
        this("", null, false, false);
    }
}
