package c2j;

import aii.r;
import com.revolut.retail.feature.balance.picker.impl.disclaimers.savings.flow.SavingWithDisclaimer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SavingWithDisclaimer f20819a;

    public c(SavingWithDisclaimer savingsWithDisclaimer) {
        Intrinsics.checkNotNullParameter(savingsWithDisclaimer, "savingsWithDisclaimer");
        this.f20819a = savingsWithDisclaimer;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f20819a, ((c) obj2).f20819a);
    }

    public final int hashCode() {
        return this.f20819a.hashCode();
    }
}
