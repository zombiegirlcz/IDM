package qb3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f244087a;

    public g(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f244087a = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f244087a, ((g) obj2).f244087a);
    }

    public final int hashCode() {
        return this.f244087a.hashCode();
    }
}
