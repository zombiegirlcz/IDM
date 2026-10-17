package ru;

import com.revolut.business.feature.referrals.model.RewardTargetAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f257367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f257368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RewardTargetAccount f257369c;
    public final String d;
    public final String e;

    public j(dj0.d rewardAmount, int i, RewardTargetAccount rewardTargetAccount, String str, String str2) {
        Intrinsics.checkNotNullParameter(rewardAmount, "rewardAmount");
        this.f257367a = rewardAmount;
        this.f257368b = i;
        this.f257369c = rewardTargetAccount;
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f257367a, jVar.f257367a) && this.f257368b == jVar.f257368b && Intrinsics.f(this.f257369c, jVar.f257369c) && Intrinsics.f(this.d, jVar.d) && Intrinsics.f(this.e, jVar.e);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f257368b, this.f257367a.hashCode() * 31, 31);
        RewardTargetAccount rewardTargetAccount = this.f257369c;
        int iHashCode = (iB + (rewardTargetAccount == null ? 0 : rewardTargetAccount.hashCode())) * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
