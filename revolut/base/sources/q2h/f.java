package q2h;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f241656a;

    public f(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f241656a = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f241656a, ((f) obj2).f241656a);
    }

    public final int hashCode() {
        return this.f241656a.hashCode();
    }
}
