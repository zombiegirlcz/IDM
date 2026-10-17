package bt2;

import com.revolut.business.feature.referrals.model.RewardTargetAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RewardTargetAccount f18263a;

    public f(RewardTargetAccount rewardTargetAccount) {
        Intrinsics.checkNotNullParameter(rewardTargetAccount, "rewardTargetAccount");
        this.f18263a = rewardTargetAccount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f18263a, ((f) obj2).f18263a);
    }

    public final int hashCode() {
        return this.f18263a.hashCode();
    }
}
