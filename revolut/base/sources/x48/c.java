package x48;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends v13.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f302802a;

    public c(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f302802a = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f302802a, ((c) obj2).f302802a);
    }

    public final int hashCode() {
        return this.f302802a.hashCode();
    }
}
