package com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.rewards;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/retail/cobranded_cards/impl/presentation/screens/plan_hub/rewards/CobrandedCardsPlanHubRewardsScreenContract$RewardSelectionParcel", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CobrandedCardsPlanHubRewardsScreenContract$RewardSelectionParcel implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CobrandedCardsPlanHubRewardsScreenContract$RewardSelectionParcel> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f82596a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CobrandedCardsPlanHubRewardsScreenContract$RewardSelectionParcel(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CobrandedCardsPlanHubRewardsScreenContract$RewardSelectionParcel[i];
        }
    }

    public CobrandedCardsPlanHubRewardsScreenContract$RewardSelectionParcel(String milestoneRewardCode) {
        Intrinsics.checkNotNullParameter(milestoneRewardCode, "milestoneRewardCode");
        this.f82596a = milestoneRewardCode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof CobrandedCardsPlanHubRewardsScreenContract$RewardSelectionParcel) && Intrinsics.f(this.f82596a, ((CobrandedCardsPlanHubRewardsScreenContract$RewardSelectionParcel) obj2).f82596a);
    }

    public final int hashCode() {
        return this.f82596a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f82596a);
    }
}
