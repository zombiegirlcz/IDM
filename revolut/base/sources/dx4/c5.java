package dx4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c5 implements e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f120570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f120571c;
    public final l d;
    public final boolean e;
    public final l f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f120572g;

    public c5(String id10, String title, q qVar, l lVar, boolean z, l lVar2, String parameterKey) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(parameterKey, "parameterKey");
        this.f120569a = id10;
        this.f120570b = title;
        this.f120571c = qVar;
        this.d = lVar;
        this.e = z;
        this.f = lVar2;
        this.f120572g = parameterKey;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c5)) {
            return false;
        }
        c5 c5Var = (c5) obj2;
        return Intrinsics.f(this.f120569a, c5Var.f120569a) && Intrinsics.f(this.f120570b, c5Var.f120570b) && this.f120571c == c5Var.f120571c && Intrinsics.f(this.d, c5Var.d) && this.e == c5Var.e && Intrinsics.f(this.f, c5Var.f) && Intrinsics.f(this.f120572g, c5Var.f120572g);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f120569a.hashCode() * 31, 31, this.f120570b);
        q qVar = this.f120571c;
        int iHashCode = (iC + (qVar == null ? 0 : qVar.hashCode())) * 31;
        l lVar = this.d;
        int iC2 = j6.a.c((iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31, 31, this.e);
        l lVar2 = this.f;
        return this.f120572g.hashCode() + ((iC2 + (lVar2 != null ? lVar2.hashCode() : 0)) * 31);
    }
}
