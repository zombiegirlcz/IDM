package vge;

import com.revolut.feature.tab.accounts.api.model.spaces.ProductContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductContext f288889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sfe.a f288890b;

    public e1(ProductContext productContext, sfe.a loadingMode) {
        Intrinsics.checkNotNullParameter(productContext, "productContext");
        Intrinsics.checkNotNullParameter(loadingMode, "loadingMode");
        this.f288889a = productContext;
        this.f288890b = loadingMode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj2;
        return Intrinsics.f(this.f288889a, e1Var.f288889a) && this.f288890b == e1Var.f288890b;
    }

    public final int hashCode() {
        return this.f288890b.hashCode() + (this.f288889a.hashCode() * 31);
    }
}
