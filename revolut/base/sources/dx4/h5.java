package dx4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h5 implements e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f120616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f120617c;
    public final q d;
    public final l e;
    public final g5 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f120618g;

    public h5(String name, String title, String subtitle, q qVar, l lVar, g5 g5Var, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f120615a = name;
        this.f120616b = title;
        this.f120617c = subtitle;
        this.d = qVar;
        this.e = lVar;
        this.f = g5Var;
        this.f120618g = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h5)) {
            return false;
        }
        h5 h5Var = (h5) obj2;
        return Intrinsics.f(this.f120615a, h5Var.f120615a) && Intrinsics.f(this.f120616b, h5Var.f120616b) && Intrinsics.f(this.f120617c, h5Var.f120617c) && this.d == h5Var.d && Intrinsics.f(this.e, h5Var.e) && Intrinsics.f(this.f, h5Var.f) && this.f120618g == h5Var.f120618g;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f120615a.hashCode() * 31, 31, this.f120616b), 31, this.f120617c);
        q qVar = this.d;
        int iHashCode = (iC + (qVar == null ? 0 : qVar.hashCode())) * 31;
        l lVar = this.e;
        int iHashCode2 = (iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31;
        g5 g5Var = this.f;
        return Boolean.hashCode(this.f120618g) + ((iHashCode2 + (g5Var != null ? g5Var.hashCode() : 0)) * 31);
    }
}
