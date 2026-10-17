package ht2;

import com.revolut.business.feature.referrals.model.RewardTargetAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class m extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RewardTargetAccount f155233a;

    public m(RewardTargetAccount rewardTargetAccount) {
        this.f155233a = rewardTargetAccount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f155233a, ((m) obj2).f155233a);
    }

    public final int hashCode() {
        RewardTargetAccount rewardTargetAccount = this.f155233a;
        if (rewardTargetAccount == null) {
            return 0;
        }
        return rewardTargetAccount.hashCode();
    }
}
