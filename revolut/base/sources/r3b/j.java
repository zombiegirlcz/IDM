package r3b;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kel.b f251247a;

    public j(kel.b cashHolding) {
        Intrinsics.checkNotNullParameter(cashHolding, "cashHolding");
        this.f251247a = cashHolding;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f251247a, ((j) obj2).f251247a);
    }

    public final int hashCode() {
        return this.f251247a.hashCode();
    }
}
