package m58;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f202854a;

    public d(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f202854a = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f202854a, ((d) obj2).f202854a);
    }

    public final int hashCode() {
        return this.f202854a.hashCode();
    }
}
