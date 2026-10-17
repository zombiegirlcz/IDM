package ljb;

import aii.e;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f195618a;

    public c(String productId) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        this.f195618a = productId;
    }

    public final String b() {
        return this.f195618a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f195618a, ((c) obj2).f195618a);
    }

    public final int hashCode() {
        return this.f195618a.hashCode();
    }
}
