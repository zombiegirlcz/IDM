package ru;

import com.revolut.business.feature.referrals.model.RewardTargetAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RewardTargetAccount f257353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f257354b;

    public a0(RewardTargetAccount rewardTargetAccount, String str) {
        Intrinsics.checkNotNullParameter(rewardTargetAccount, "rewardTargetAccount");
        this.f257353a = rewardTargetAccount;
        this.f257354b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f257353a, a0Var.f257353a) && Intrinsics.f(this.f257354b, a0Var.f257354b);
    }

    public final int hashCode() {
        int iHashCode = this.f257353a.hashCode() * 31;
        String str = this.f257354b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
