package ipe;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f167744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f167745b;

    public f(wi0.b countryCode, e product) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(product, "product");
        this.f167744a = countryCode;
        this.f167745b = product;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f167744a, fVar.f167744a) && this.f167745b == fVar.f167745b;
    }

    public final int hashCode() {
        return this.f167745b.hashCode() + (this.f167744a.f297794a.hashCode() * 31);
    }
}
