package bi9;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pair f15448a;

    public c(Pair lateInterestRate) {
        Intrinsics.checkNotNullParameter(lateInterestRate, "lateInterestRate");
        this.f15448a = lateInterestRate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f15448a, ((c) obj2).f15448a);
    }

    public final int hashCode() {
        return this.f15448a.hashCode();
    }
}
