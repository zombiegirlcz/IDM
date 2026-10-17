package vge;

import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f0 implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductAccountDescriptor$Value f288894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tge.b f288895b;

    public f0(ProductAccountDescriptor$Value descriptor, tge.b source) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f288894a = descriptor;
        this.f288895b = source;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj2;
        return Intrinsics.f(this.f288894a, f0Var.f288894a) && this.f288895b == f0Var.f288895b;
    }

    public final int hashCode() {
        return this.f288895b.hashCode() + (this.f288894a.hashCode() * 31);
    }
}
