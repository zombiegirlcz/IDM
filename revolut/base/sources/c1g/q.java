package c1g;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class q implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f20506a;

    public q(xi0.b baseCurrency) {
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        this.f20506a = baseCurrency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f20506a, ((q) obj2).f20506a);
    }

    public final int hashCode() {
        return this.f20506a.hashCode();
    }
}
