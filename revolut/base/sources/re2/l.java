package re2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f253502a;

    public l(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f253502a = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f253502a, ((l) obj2).f253502a);
    }

    public final int hashCode() {
        return this.f253502a.hashCode() * 31;
    }
}
