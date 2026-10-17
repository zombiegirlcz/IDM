package eu4;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import ql4.o0;

/* JADX INFO: loaded from: classes22.dex */
public final class l implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f129511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f129512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o0 f129513c;

    public l(boolean z, dj0.d minPayment, o0 o0Var) {
        Intrinsics.checkNotNullParameter(minPayment, "minPayment");
        this.f129511a = z;
        this.f129512b = minPayment;
        this.f129513c = o0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f129511a == lVar.f129511a && Intrinsics.f(this.f129512b, lVar.f129512b) && this.f129513c == lVar.f129513c;
    }

    public final int hashCode() {
        int iC = v7.c(Boolean.hashCode(this.f129511a) * 31, 31, this.f129512b);
        o0 o0Var = this.f129513c;
        return iC + (o0Var == null ? 0 : o0Var.hashCode());
    }
}
