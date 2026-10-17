package jzh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class x implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f179870a;

    public x(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f179870a = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof x) && Intrinsics.f(this.f179870a, ((x) obj2).f179870a);
    }

    public final int hashCode() {
        return this.f179870a.hashCode();
    }
}
