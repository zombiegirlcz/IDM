package vge;

import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d0 implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductAccountDescriptor$Value f288882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tge.b f288883b;

    public d0(ProductAccountDescriptor$Value descriptor, tge.b source) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f288882a = descriptor;
        this.f288883b = source;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.f288882a, d0Var.f288882a) && this.f288883b == d0Var.f288883b;
    }

    public final int hashCode() {
        return this.f288883b.hashCode() + (this.f288882a.hashCode() * 31);
    }
}
