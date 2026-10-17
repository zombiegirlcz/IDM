package vge;

import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class v3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductAccountDescriptor$Value f289042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tge.b f289043b;

    public v3(ProductAccountDescriptor$Value descriptor, tge.b source) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f289042a = descriptor;
        this.f289043b = source;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v3)) {
            return false;
        }
        v3 v3Var = (v3) obj2;
        return Intrinsics.f(this.f289042a, v3Var.f289042a) && this.f289043b == v3Var.f289043b;
    }

    public final int hashCode() {
        return this.f289043b.hashCode() + (this.f289042a.hashCode() * 31);
    }
}
