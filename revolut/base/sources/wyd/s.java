package wyd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class s implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f301262a;

    public s(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f301262a = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && Intrinsics.f(this.f301262a, ((s) obj2).f301262a);
    }

    public final int hashCode() {
        return this.f301262a.hashCode();
    }
}
