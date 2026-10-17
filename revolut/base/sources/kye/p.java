package kye;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class p extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f190811a;

    public p(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f190811a = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f190811a, ((p) obj2).f190811a);
    }

    public final int hashCode() {
        return this.f190811a.hashCode();
    }
}
