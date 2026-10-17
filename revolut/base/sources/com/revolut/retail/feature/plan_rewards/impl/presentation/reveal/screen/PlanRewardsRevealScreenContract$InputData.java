package com.revolut.retail.feature.plan_rewards.impl.presentation.reveal.screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xck.o;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/plan_rewards/impl/presentation/reveal/screen/PlanRewardsRevealScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_plan_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlanRewardsRevealScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PlanRewardsRevealScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f102576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f102577b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PlanRewardsRevealScreenContract$InputData(o.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PlanRewardsRevealScreenContract$InputData[i];
        }
    }

    public PlanRewardsRevealScreenContract$InputData(o rewardType, String str) {
        Intrinsics.checkNotNullParameter(rewardType, "rewardType");
        this.f102576a = rewardType;
        this.f102577b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PlanRewardsRevealScreenContract$InputData)) {
            return false;
        }
        PlanRewardsRevealScreenContract$InputData planRewardsRevealScreenContract$InputData = (PlanRewardsRevealScreenContract$InputData) obj2;
        return this.f102576a == planRewardsRevealScreenContract$InputData.f102576a && Intrinsics.f(this.f102577b, planRewardsRevealScreenContract$InputData.f102577b);
    }

    public final int hashCode() {
        int iHashCode = this.f102576a.hashCode() * 31;
        String str = this.f102577b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f102576a.name());
        dest.writeString(this.f102577b);
    }
}
