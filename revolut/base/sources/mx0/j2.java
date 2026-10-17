package mx0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class j2 implements k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aw0.l6 f209770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e2 f209771b;

    public j2(aw0.l6 product, e2 state) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f209770a = product;
        this.f209771b = state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j2)) {
            return false;
        }
        j2 j2Var = (j2) obj2;
        return Intrinsics.f(this.f209770a, j2Var.f209770a) && Intrinsics.f(this.f209771b, j2Var.f209771b);
    }

    public final int hashCode() {
        return this.f209771b.hashCode() + (this.f209770a.hashCode() * 31);
    }
}
