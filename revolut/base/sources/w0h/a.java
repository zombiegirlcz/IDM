package w0h;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f293758a;

    public a(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f293758a = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f293758a, ((a) obj2).f293758a);
    }

    public final int hashCode() {
        return this.f293758a.hashCode();
    }
}
