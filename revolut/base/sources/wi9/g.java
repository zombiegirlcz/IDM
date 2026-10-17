package wi9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f297868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f297869b;

    public g(b productType, a category) {
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(category, "category");
        this.f297868a = productType;
        this.f297869b = category;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f297868a == gVar.f297868a && this.f297869b == gVar.f297869b;
    }

    public final int hashCode() {
        return this.f297869b.hashCode() + (this.f297868a.hashCode() * 31);
    }
}
