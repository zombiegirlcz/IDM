package m1c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f1 f201375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f201376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f201377c;

    public h1(f1 product, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(product, "product");
        this.f201375a = product;
        this.f201376b = z;
        this.f201377c = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj2;
        return this.f201375a == h1Var.f201375a && this.f201376b == h1Var.f201376b && this.f201377c == h1Var.f201377c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f201377c) + j6.a.c(this.f201375a.hashCode() * 31, 31, this.f201376b);
    }
}
