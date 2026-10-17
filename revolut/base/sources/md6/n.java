package md6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f204494a;

    public n(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f204494a = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f204494a, ((n) obj2).f204494a);
    }

    public final int hashCode() {
        return this.f204494a.hashCode();
    }
}
