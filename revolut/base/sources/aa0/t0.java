package aa0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class t0 implements v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f2742a;

    public t0(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f2742a = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t0) && Intrinsics.f(this.f2742a, ((t0) obj2).f2742a);
    }

    public final int hashCode() {
        return this.f2742a.hashCode();
    }
}
