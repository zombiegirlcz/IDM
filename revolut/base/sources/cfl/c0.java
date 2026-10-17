package cfl;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f23732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f23733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f23734c;
    public final dj0.d d;
    public final dj0.d e;

    public c0(dj0.d minimumOnboardingTopUp, dj0.d minimumGeneralTopUp, dj0.d minimumRecurringTopUp, dj0.d minimumWithdrawal, dj0.d minimumPortfolioValue) {
        Intrinsics.checkNotNullParameter(minimumOnboardingTopUp, "minimumOnboardingTopUp");
        Intrinsics.checkNotNullParameter(minimumGeneralTopUp, "minimumGeneralTopUp");
        Intrinsics.checkNotNullParameter(minimumRecurringTopUp, "minimumRecurringTopUp");
        Intrinsics.checkNotNullParameter(minimumWithdrawal, "minimumWithdrawal");
        Intrinsics.checkNotNullParameter(minimumPortfolioValue, "minimumPortfolioValue");
        this.f23732a = minimumOnboardingTopUp;
        this.f23733b = minimumGeneralTopUp;
        this.f23734c = minimumRecurringTopUp;
        this.d = minimumWithdrawal;
        this.e = minimumPortfolioValue;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return Intrinsics.f(this.f23732a, c0Var.f23732a) && Intrinsics.f(this.f23733b, c0Var.f23733b) && Intrinsics.f(this.f23734c, c0Var.f23734c) && Intrinsics.f(this.d, c0Var.d) && Intrinsics.f(this.e, c0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + v7.c(v7.c(v7.c(this.f23732a.hashCode() * 31, 31, this.f23733b), 31, this.f23734c), 31, this.d);
    }
}
