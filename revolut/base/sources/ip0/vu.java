package ip0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class vu implements uu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nw0.a f166893a;

    public vu(nw0.a price) {
        Intrinsics.checkNotNullParameter(price, "price");
        this.f166893a = price;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof vu) && Intrinsics.f(this.f166893a, ((vu) obj2).f166893a);
    }

    public final int hashCode() {
        return this.f166893a.hashCode();
    }
}
