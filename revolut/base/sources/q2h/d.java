package q2h;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f241653a;

    public d(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f241653a = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f241653a, ((d) obj2).f241653a);
    }

    public final int hashCode() {
        return this.f241653a.hashCode();
    }
}
