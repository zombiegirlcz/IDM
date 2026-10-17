package dx4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class m2 implements y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f120678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d1 f120679c;
    public final c1 d;
    public final a1 e;
    public final l f;

    public m2(String title, String str, d1 d1Var, c1 c1Var, a1 a1Var, l lVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f120677a = title;
        this.f120678b = str;
        this.f120679c = d1Var;
        this.d = c1Var;
        this.e = a1Var;
        this.f = lVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m2)) {
            return false;
        }
        m2 m2Var = (m2) obj2;
        return Intrinsics.f(this.f120677a, m2Var.f120677a) && Intrinsics.f(this.f120678b, m2Var.f120678b) && Intrinsics.f(this.f120679c, m2Var.f120679c) && Intrinsics.f(this.d, m2Var.d) && this.e == m2Var.e && Intrinsics.f(this.f, m2Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.f120677a.hashCode() * 31;
        String str = this.f120678b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        d1 d1Var = this.f120679c;
        int iHashCode3 = (iHashCode2 + (d1Var == null ? 0 : d1Var.hashCode())) * 31;
        c1 c1Var = this.d;
        int iHashCode4 = (iHashCode3 + (c1Var == null ? 0 : c1Var.hashCode())) * 31;
        a1 a1Var = this.e;
        int iHashCode5 = (iHashCode4 + (a1Var == null ? 0 : a1Var.hashCode())) * 31;
        l lVar = this.f;
        return iHashCode5 + (lVar != null ? lVar.hashCode() : 0);
    }
}
