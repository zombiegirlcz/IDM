package vge;

import com.revolut.feature.tab.accounts.models.ProductId;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c0 implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductId f288876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tge.b f288877b;

    public c0(ProductId productId, tge.b source) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f288876a = productId;
        this.f288877b = source;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return this.f288876a == c0Var.f288876a && this.f288877b == c0Var.f288877b;
    }

    public final int hashCode() {
        return this.f288877b.hashCode() + (this.f288876a.hashCode() * 31);
    }
}
