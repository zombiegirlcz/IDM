package c62;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dx1.b f21586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i02.c f21587b;

    public f(dx1.b product, i02.c accountType) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        this.f21586a = product;
        this.f21587b = accountType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f21586a, fVar.f21586a) && this.f21587b == fVar.f21587b;
    }

    public final int hashCode() {
        return this.f21587b.hashCode() + (this.f21586a.hashCode() * 31);
    }
}
