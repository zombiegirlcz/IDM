package wjh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class y implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final del.a f298131a;

    public y(del.a balance) {
        Intrinsics.checkNotNullParameter(balance, "balance");
        this.f298131a = balance;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof y) && Intrinsics.f(this.f298131a, ((y) obj2).f298131a);
    }

    public final int hashCode() {
        return this.f298131a.hashCode();
    }
}
