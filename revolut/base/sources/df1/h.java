package df1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cd1.e f113751a;

    public h(cd1.e shoppingCart) {
        Intrinsics.checkNotNullParameter(shoppingCart, "shoppingCart");
        this.f113751a = shoppingCart;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f113751a, ((h) obj2).f113751a);
    }

    public final int hashCode() {
        return this.f113751a.hashCode();
    }
}
