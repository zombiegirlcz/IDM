package uf7;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import tx0.f3;

/* JADX INFO: loaded from: classes22.dex */
public final class n implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f3 f279613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f279614b;

    public n(f3 f3Var, ArrayList pages) {
        Intrinsics.checkNotNullParameter(pages, "pages");
        this.f279613a = f3Var;
        this.f279614b = pages;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f279613a, nVar.f279613a) && this.f279614b.equals(nVar.f279614b);
    }

    public final int hashCode() {
        f3 f3Var = this.f279613a;
        return this.f279614b.hashCode() + ((f3Var == null ? 0 : f3Var.hashCode()) * 31);
    }
}
