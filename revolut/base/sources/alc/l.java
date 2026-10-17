package alc;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f6204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f6205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f6206c;

    public l(k onboardingStatus, dj0.d minimumWithdrawalAmount, dj0.d minimumBalanceAfterWithdraw) {
        Intrinsics.checkNotNullParameter(onboardingStatus, "onboardingStatus");
        Intrinsics.checkNotNullParameter(minimumWithdrawalAmount, "minimumWithdrawalAmount");
        Intrinsics.checkNotNullParameter(minimumBalanceAfterWithdraw, "minimumBalanceAfterWithdraw");
        this.f6204a = onboardingStatus;
        this.f6205b = minimumWithdrawalAmount;
        this.f6206c = minimumBalanceAfterWithdraw;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f6204a == lVar.f6204a && Intrinsics.f(this.f6205b, lVar.f6205b) && Intrinsics.f(this.f6206c, lVar.f6206c);
    }

    public final int hashCode() {
        return this.f6206c.hashCode() + v7.c(this.f6204a.hashCode() * 31, 31, this.f6205b);
    }
}
