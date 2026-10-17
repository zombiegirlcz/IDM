package ux0;

import aw0.l6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l6 f283754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f283755b;

    public i0(l6 product, u0 introViewCommonModel) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(introViewCommonModel, "introViewCommonModel");
        this.f283754a = product;
        this.f283755b = introViewCommonModel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj2;
        return Intrinsics.f(this.f283754a, i0Var.f283754a) && this.f283755b.equals(i0Var.f283755b);
    }

    public final int hashCode() {
        return this.f283755b.hashCode() + (this.f283754a.hashCode() * 31);
    }
}
