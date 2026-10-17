package txf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fxf.b f275393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gxf.b f275394b;

    public f(fxf.b product, gxf.b type) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f275393a = product;
        this.f275394b = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f275393a == fVar.f275393a && this.f275394b == fVar.f275394b;
    }

    public final int hashCode() {
        return this.f275394b.hashCode() + (this.f275393a.hashCode() * 31);
    }
}
