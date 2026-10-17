package q0h;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f241270a;

    public b(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f241270a = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f241270a, ((b) obj2).f241270a);
    }

    public final int hashCode() {
        return this.f241270a.hashCode();
    }
}
