package sdl;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class q1 {

    @NotNull
    public static final p1 Companion = new p1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f261993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f261994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f261995c;
    public final dj0.d d;
    public final dj0.d e;

    public /* synthetic */ q1(int i, dj0.d dVar, dj0.d dVar2, dj0.d dVar3, dj0.d dVar4, dj0.d dVar5) {
        if (31 != (i & 31)) {
            qlm.j1.f(o1.f261992a.getDescriptor(), i, 31);
            throw null;
        }
        this.f261993a = dVar;
        this.f261994b = dVar2;
        this.f261995c = dVar3;
        this.d = dVar4;
        this.e = dVar5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q1)) {
            return false;
        }
        q1 q1Var = (q1) obj2;
        return Intrinsics.f(this.f261993a, q1Var.f261993a) && Intrinsics.f(this.f261994b, q1Var.f261994b) && Intrinsics.f(this.f261995c, q1Var.f261995c) && Intrinsics.f(this.d, q1Var.d) && Intrinsics.f(this.e, q1Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + v7.c(v7.c(v7.c(this.f261993a.hashCode() * 31, 31, this.f261994b), 31, this.f261995c), 31, this.d);
    }

    public q1(dj0.d minimumOnboardingTopUp, dj0.d minimumGeneralTopUp, dj0.d minimumRecurringTopUp, dj0.d minimumWithdrawal, dj0.d minimumPortfolioValue) {
        Intrinsics.checkNotNullParameter(minimumOnboardingTopUp, "minimumOnboardingTopUp");
        Intrinsics.checkNotNullParameter(minimumGeneralTopUp, "minimumGeneralTopUp");
        Intrinsics.checkNotNullParameter(minimumRecurringTopUp, "minimumRecurringTopUp");
        Intrinsics.checkNotNullParameter(minimumWithdrawal, "minimumWithdrawal");
        Intrinsics.checkNotNullParameter(minimumPortfolioValue, "minimumPortfolioValue");
        this.f261993a = minimumOnboardingTopUp;
        this.f261994b = minimumGeneralTopUp;
        this.f261995c = minimumRecurringTopUp;
        this.d = minimumWithdrawal;
        this.e = minimumPortfolioValue;
    }
}
