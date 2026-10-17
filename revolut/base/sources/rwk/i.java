package rwk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f257990a;

    public i(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f257990a = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f257990a, ((i) obj2).f257990a);
    }

    public final int hashCode() {
        return this.f257990a.hashCode();
    }
}
