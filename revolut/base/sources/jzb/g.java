package jzb;

import kotlin.jvm.internal.Intrinsics;
import m1c.f1;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f1 f179712a;

    public g(f1 revPointsProduct) {
        Intrinsics.checkNotNullParameter(revPointsProduct, "revPointsProduct");
        this.f179712a = revPointsProduct;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && this.f179712a == ((g) obj2).f179712a;
    }

    public final int hashCode() {
        return this.f179712a.hashCode();
    }
}
