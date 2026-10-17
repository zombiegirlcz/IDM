package uoc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f281603a;

    public b(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f281603a = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f281603a, ((b) obj2).f281603a);
    }

    public final int hashCode() {
        return this.f281603a.hashCode();
    }
}
