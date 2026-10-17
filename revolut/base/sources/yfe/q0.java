package yfe;

import com.revolut.core.ui_kit.models.Clause;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class q0 extends r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f313295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f313296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d1 f313297c;
    public final w1 d;
    public final boolean e;
    public final dj0.d f;

    public q0(Clause title, dj0.d balance, d1 supplementary, w1 w1Var, boolean z, dj0.d moneyToDisplay) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(balance, "balance");
        Intrinsics.checkNotNullParameter(supplementary, "supplementary");
        Intrinsics.checkNotNullParameter(moneyToDisplay, "moneyToDisplay");
        this.f313295a = title;
        this.f313296b = balance;
        this.f313297c = supplementary;
        this.d = w1Var;
        this.e = z;
        this.f = moneyToDisplay;
    }

    @Override // yfe.r0
    public final Clause a() {
        return this.f313295a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj2;
        return Intrinsics.f(this.f313295a, q0Var.f313295a) && Intrinsics.f(this.f313296b, q0Var.f313296b) && Intrinsics.f(this.f313297c, q0Var.f313297c) && Intrinsics.f(this.d, q0Var.d) && this.e == q0Var.e && Intrinsics.f(this.f, q0Var.f);
    }

    public final int hashCode() {
        int iHashCode = (this.f313297c.hashCode() + v7.c(this.f313295a.hashCode() * 31, 31, this.f313296b)) * 31;
        w1 w1Var = this.d;
        return this.f.hashCode() + j6.a.c((iHashCode + (w1Var == null ? 0 : w1Var.f313319b.hashCode())) * 31, 31, this.e);
    }

    public /* synthetic */ q0(Clause clause, dj0.d dVar, d1 d1Var, dj0.d dVar2, int i) {
        this(clause, dVar, d1Var, null, (i & 16) == 0, (i & 32) != 0 ? dVar : dVar2);
    }
}
