package dx4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class l4 implements e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f120668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a1 f120669c;
    public final k4 d;
    public final j4 e;
    public final j4 f;

    public l4(String id10, String title, a1 a1Var, k4 k4Var, j4 j4Var, j4 j4Var2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f120667a = id10;
        this.f120668b = title;
        this.f120669c = a1Var;
        this.d = k4Var;
        this.e = j4Var;
        this.f = j4Var2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l4)) {
            return false;
        }
        l4 l4Var = (l4) obj2;
        return Intrinsics.f(this.f120667a, l4Var.f120667a) && Intrinsics.f(this.f120668b, l4Var.f120668b) && this.f120669c == l4Var.f120669c && this.d == l4Var.d && this.e == l4Var.e && this.f == l4Var.f;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f120667a.hashCode() * 31, 31, this.f120668b);
        a1 a1Var = this.f120669c;
        int iHashCode = (iC + (a1Var == null ? 0 : a1Var.hashCode())) * 31;
        k4 k4Var = this.d;
        int iHashCode2 = (iHashCode + (k4Var == null ? 0 : k4Var.hashCode())) * 31;
        j4 j4Var = this.e;
        int iHashCode3 = (iHashCode2 + (j4Var == null ? 0 : j4Var.hashCode())) * 31;
        j4 j4Var2 = this.f;
        return iHashCode3 + (j4Var2 != null ? j4Var2.hashCode() : 0);
    }
}
