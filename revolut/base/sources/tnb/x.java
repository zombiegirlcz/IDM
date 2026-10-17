package tnb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class x extends do3.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f272421b;

    public x(String juniorId, String productId) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(productId, "productId");
        pie.a aVar = pie.a.RESTRICTED;
        this.f272420a = juniorId;
        this.f272421b = productId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f272420a, xVar.f272420a) && Intrinsics.f(this.f272421b, xVar.f272421b);
    }

    public final int hashCode() {
        return this.f272421b.hashCode() + (this.f272420a.hashCode() * 31);
    }
}
