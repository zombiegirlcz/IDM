package glh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kel.b f144696a;

    public d(kel.b cashHolding) {
        Intrinsics.checkNotNullParameter(cashHolding, "cashHolding");
        this.f144696a = cashHolding;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f144696a, ((d) obj2).f144696a);
    }

    public final int hashCode() {
        return this.f144696a.hashCode();
    }
}
