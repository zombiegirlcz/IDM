package fh5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f135148a;

    public b(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f135148a = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f135148a, ((b) obj2).f135148a);
    }

    public final int hashCode() {
        return this.f135148a.hashCode();
    }
}
