package v1e;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f285303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f285304b;

    public c(String productId, boolean z) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        this.f285303a = productId;
        this.f285304b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f285303a, cVar.f285303a) && this.f285304b == cVar.f285304b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f285304b) + (this.f285303a.hashCode() * 31);
    }
}
