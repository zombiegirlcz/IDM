package com.revolut.retail.feature.learn.impl.ui.share_rewards;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.learn.shared.models.domain.LearnShareReward;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/learn/impl/ui/share_rewards/ShareRewardsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_learn_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ShareRewardsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ShareRewardsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LearnShareReward f101773a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ShareRewardsScreenContract$InputData((LearnShareReward) parcel.readParcelable(ShareRewardsScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ShareRewardsScreenContract$InputData[i];
        }
    }

    public ShareRewardsScreenContract$InputData(LearnShareReward learnShareReward) {
        Intrinsics.checkNotNullParameter(learnShareReward, "learnShareReward");
        this.f101773a = learnShareReward;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof ShareRewardsScreenContract$InputData) && Intrinsics.f(this.f101773a, ((ShareRewardsScreenContract$InputData) obj2).f101773a);
    }

    public final int hashCode() {
        return this.f101773a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f101773a, i);
    }
}
