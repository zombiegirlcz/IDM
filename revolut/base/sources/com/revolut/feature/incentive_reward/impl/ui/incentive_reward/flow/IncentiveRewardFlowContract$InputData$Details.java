package com.revolut.feature.incentive_reward.impl.ui.incentive_reward.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.incentive_reward.impl.model.IncentiveRewardDetailsParams;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/incentive_reward/impl/ui/incentive_reward/flow/IncentiveRewardFlowContract$InputData$Details", "", "", "toString", "()Ljava/lang/String;", "feature_retail_incentive_reward_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IncentiveRewardFlowContract$InputData$Details implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<IncentiveRewardFlowContract$InputData$Details> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IncentiveRewardDetailsParams f74862a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new IncentiveRewardFlowContract$InputData$Details(IncentiveRewardDetailsParams.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new IncentiveRewardFlowContract$InputData$Details[i];
        }
    }

    public IncentiveRewardFlowContract$InputData$Details(IncentiveRewardDetailsParams rewardDetailsParams) {
        Intrinsics.checkNotNullParameter(rewardDetailsParams, "rewardDetailsParams");
        this.f74862a = rewardDetailsParams;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof IncentiveRewardFlowContract$InputData$Details) && Intrinsics.f(this.f74862a, ((IncentiveRewardFlowContract$InputData$Details) obj2).f74862a);
    }

    public final int hashCode() {
        return this.f74862a.f74850a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f74862a.writeToParcel(dest, i);
    }
}
