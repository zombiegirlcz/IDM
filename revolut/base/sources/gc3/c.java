package gc3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f142319a;

    public c(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f142319a = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f142319a, ((c) obj2).f142319a);
    }

    public final int hashCode() {
        return this.f142319a.hashCode();
    }
}
