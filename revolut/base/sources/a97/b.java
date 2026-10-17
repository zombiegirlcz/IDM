package a97;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f2365a;

    public b(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f2365a = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f2365a, ((b) obj2).f2365a);
    }

    public final int hashCode() {
        return this.f2365a.hashCode();
    }
}
