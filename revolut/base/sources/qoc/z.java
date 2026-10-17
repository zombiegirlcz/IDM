package qoc;

import cfl.f0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class z implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0.a f248156a;

    public z(f0.a roboTradingProduct) {
        Intrinsics.checkNotNullParameter(roboTradingProduct, "roboTradingProduct");
        this.f248156a = roboTradingProduct;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof z) && Intrinsics.f(this.f248156a, ((z) obj2).f248156a);
    }

    public final int hashCode() {
        return this.f248156a.hashCode();
    }
}
