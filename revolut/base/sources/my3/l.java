package my3;

import dx4.a1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f210329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f210330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a1 f210331c;

    public l(a1 a1Var, String id10, String title) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f210329a = id10;
        this.f210330b = title;
        this.f210331c = a1Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f210329a, lVar.f210329a) && Intrinsics.f(this.f210330b, lVar.f210330b) && this.f210331c == lVar.f210331c;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f210329a.hashCode() * 31, 31, this.f210330b);
        a1 a1Var = this.f210331c;
        return iC + (a1Var == null ? 0 : a1Var.hashCode());
    }
}
