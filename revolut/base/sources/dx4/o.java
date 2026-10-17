package dx4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class o implements e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f120695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f120696c;
    public final d1 d;
    public final l e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c0 f120697g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n f120698h;
    public final a1 i;

    public o(String id10, String title, String str, d1 d1Var, l lVar, String str2, c0 c0Var, n nVar, a1 a1Var) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f120694a = id10;
        this.f120695b = title;
        this.f120696c = str;
        this.d = d1Var;
        this.e = lVar;
        this.f = str2;
        this.f120697g = c0Var;
        this.f120698h = nVar;
        this.i = a1Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f120694a, oVar.f120694a) && Intrinsics.f(this.f120695b, oVar.f120695b) && Intrinsics.f(this.f120696c, oVar.f120696c) && Intrinsics.f(this.d, oVar.d) && Intrinsics.f(this.e, oVar.e) && Intrinsics.f(this.f, oVar.f) && this.f120697g == oVar.f120697g && this.f120698h == oVar.f120698h && this.i == oVar.i;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f120694a.hashCode() * 31, 31, this.f120695b);
        String str = this.f120696c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        d1 d1Var = this.d;
        int iHashCode2 = (iHashCode + (d1Var == null ? 0 : d1Var.hashCode())) * 31;
        l lVar = this.e;
        int iHashCode3 = (iHashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        c0 c0Var = this.f120697g;
        int iHashCode5 = (iHashCode4 + (c0Var == null ? 0 : c0Var.hashCode())) * 31;
        n nVar = this.f120698h;
        int iHashCode6 = (iHashCode5 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        a1 a1Var = this.i;
        return iHashCode6 + (a1Var != null ? a1Var.hashCode() : 0);
    }
}
