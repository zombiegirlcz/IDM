package dx4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class w3 implements e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v3 f120818b;

    public w3(String title, v3 v3Var) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f120817a = title;
        this.f120818b = v3Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w3)) {
            return false;
        }
        w3 w3Var = (w3) obj2;
        return Intrinsics.f(this.f120817a, w3Var.f120817a) && Intrinsics.f(this.f120818b, w3Var.f120818b);
    }

    public final int hashCode() {
        int iHashCode = this.f120817a.hashCode() * 31;
        v3 v3Var = this.f120818b;
        return iHashCode + (v3Var == null ? 0 : v3Var.hashCode());
    }
}
