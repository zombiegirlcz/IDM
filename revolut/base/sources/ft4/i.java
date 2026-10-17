package ft4;

import ip0.v7;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import ql4.r0;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final whf.p f137907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f137908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f137909c;
    public final dj0.d d;
    public final r0 e;

    public i(whf.p transactionsContent, dj0.d maxPlanAmount, Set selectedTransactions, dj0.d selectedAmount, r0 transactionSelectionRule) {
        Intrinsics.checkNotNullParameter(transactionsContent, "transactionsContent");
        Intrinsics.checkNotNullParameter(maxPlanAmount, "maxPlanAmount");
        Intrinsics.checkNotNullParameter(selectedTransactions, "selectedTransactions");
        Intrinsics.checkNotNullParameter(selectedAmount, "selectedAmount");
        Intrinsics.checkNotNullParameter(transactionSelectionRule, "transactionSelectionRule");
        this.f137907a = transactionsContent;
        this.f137908b = maxPlanAmount;
        this.f137909c = selectedTransactions;
        this.d = selectedAmount;
        this.e = transactionSelectionRule;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f137907a, iVar.f137907a) && Intrinsics.f(this.f137908b, iVar.f137908b) && Intrinsics.f(this.f137909c, iVar.f137909c) && Intrinsics.f(this.d, iVar.d) && this.e == iVar.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + v7.c(p.a.f(v7.c(this.f137907a.hashCode() * 31, 31, this.f137908b), 31, this.f137909c), 31, this.d);
    }
}
