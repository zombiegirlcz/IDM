package dx4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class r0 implements e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f120736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f120737c;
    public final b4 d;
    public final List e;
    public final a1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j1 f120738g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l f120739h;
    public final n0 i;

    public r0(String id10, String title, String str, b4 b4Var, List values, a1 a1Var, j1 j1Var, l lVar, n0 n0Var) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(values, "values");
        this.f120735a = id10;
        this.f120736b = title;
        this.f120737c = str;
        this.d = b4Var;
        this.e = values;
        this.f = a1Var;
        this.f120738g = j1Var;
        this.f120739h = lVar;
        this.i = n0Var;
    }

    public static r0 a(r0 r0Var, String str, h1 h1Var, int i) {
        String id10 = r0Var.f120735a;
        String title = r0Var.f120736b;
        if ((i & 4) != 0) {
            str = r0Var.f120737c;
        }
        String str2 = str;
        b4 b4Var = r0Var.d;
        List values = r0Var.e;
        a1 a1Var = r0Var.f;
        j1 j1Var = h1Var;
        if ((i & 64) != 0) {
            j1Var = r0Var.f120738g;
        }
        l lVar = r0Var.f120739h;
        n0 n0Var = r0Var.i;
        r0Var.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(values, "values");
        return new r0(id10, title, str2, b4Var, values, a1Var, j1Var, lVar, n0Var);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj2;
        return Intrinsics.f(this.f120735a, r0Var.f120735a) && Intrinsics.f(this.f120736b, r0Var.f120736b) && Intrinsics.f(this.f120737c, r0Var.f120737c) && Intrinsics.f(this.d, r0Var.d) && Intrinsics.f(this.e, r0Var.e) && this.f == r0Var.f && Intrinsics.f(this.f120738g, r0Var.f120738g) && Intrinsics.f(this.f120739h, r0Var.f120739h) && this.i == r0Var.i;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f120735a.hashCode() * 31, 31, this.f120736b);
        String str = this.f120737c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        b4 b4Var = this.d;
        int iD = p.a.d((iHashCode + (b4Var == null ? 0 : b4Var.f120559a.hashCode())) * 31, 31, this.e);
        a1 a1Var = this.f;
        int iHashCode2 = (iD + (a1Var == null ? 0 : a1Var.hashCode())) * 31;
        j1 j1Var = this.f120738g;
        int iHashCode3 = (iHashCode2 + (j1Var == null ? 0 : j1Var.hashCode())) * 31;
        l lVar = this.f120739h;
        int iHashCode4 = (iHashCode3 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        n0 n0Var = this.i;
        return iHashCode4 + (n0Var != null ? n0Var.hashCode() : 0);
    }
}
