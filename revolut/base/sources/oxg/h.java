package oxg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f230827a;

    public h(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f230827a = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f230827a, ((h) obj2).f230827a);
    }

    public final int hashCode() {
        return this.f230827a.hashCode();
    }
}
