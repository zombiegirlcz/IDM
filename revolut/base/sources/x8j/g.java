package x8j;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f303433a;

    public g(xi0.b pocketCurrency) {
        Intrinsics.checkNotNullParameter(pocketCurrency, "pocketCurrency");
        this.f303433a = pocketCurrency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f303433a, ((g) obj2).f303433a);
    }

    public final int hashCode() {
        return this.f303433a.hashCode();
    }
}
