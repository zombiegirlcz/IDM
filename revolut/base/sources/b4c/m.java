package b4c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d3c.p f12271a;

    public m(d3c.p ippProduct) {
        Intrinsics.checkNotNullParameter(ippProduct, "ippProduct");
        this.f12271a = ippProduct;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f12271a, ((m) obj2).f12271a);
    }

    public final int hashCode() {
        return this.f12271a.hashCode();
    }
}
