package amd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class q implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f6342a;

    public q(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f6342a = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f6342a, ((q) obj2).f6342a);
    }

    public final int hashCode() {
        return this.f6342a.hashCode();
    }
}
