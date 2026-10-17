package mg7;

import com.revolut.feature.incentive_reward.impl.model.IncentiveRewardDetailsParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class l extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IncentiveRewardDetailsParams f205173a;

    public l(IncentiveRewardDetailsParams incentiveRewardDetailsParams) {
        Intrinsics.checkNotNullParameter(incentiveRewardDetailsParams, "incentiveRewardDetailsParams");
        this.f205173a = incentiveRewardDetailsParams;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f205173a, ((l) obj2).f205173a);
    }

    public final int hashCode() {
        return this.f205173a.f74850a.hashCode();
    }
}
