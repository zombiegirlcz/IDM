package jxb;

import kotlin.jvm.internal.Intrinsics;
import m1c.f1;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f1 f179110a;

    public d(f1 product) {
        Intrinsics.checkNotNullParameter(product, "product");
        this.f179110a = product;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f179110a == ((d) obj2).f179110a;
    }

    public final int hashCode() {
        return this.f179110a.hashCode() * 31;
    }
}
