package rwk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f257988a;

    public g(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f257988a = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f257988a, ((g) obj2).f257988a);
    }

    public final int hashCode() {
        return this.f257988a.hashCode();
    }
}
