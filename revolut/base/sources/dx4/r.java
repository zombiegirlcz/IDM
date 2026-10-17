package dx4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class r implements e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f120733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f120734c;
    public final d1 d;

    public r(String id10, String title, String str, d1 d1Var) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f120732a = id10;
        this.f120733b = title;
        this.f120734c = str;
        this.d = d1Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f120732a, rVar.f120732a) && Intrinsics.f(this.f120733b, rVar.f120733b) && Intrinsics.f(this.f120734c, rVar.f120734c) && Intrinsics.f(this.d, rVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f120732a.hashCode() * 31, 31, this.f120733b);
        String str = this.f120734c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        d1 d1Var = this.d;
        return iHashCode + (d1Var != null ? d1Var.hashCode() : 0);
    }
}
