package dx4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class s extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f120758a;

    public s(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f120758a = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && Intrinsics.f(this.f120758a, ((s) obj2).f120758a);
    }

    public final int hashCode() {
        return this.f120758a.hashCode();
    }
}
