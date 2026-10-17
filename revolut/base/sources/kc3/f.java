package kc3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f182654a;

    public f(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f182654a = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f182654a, ((f) obj2).f182654a);
    }

    public final int hashCode() {
        return this.f182654a.hashCode();
    }
}
