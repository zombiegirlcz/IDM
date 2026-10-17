package cv3;

import dx4.b4;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class x implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f109275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f109276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f109277c;
    public final dx4.q d;
    public final dx4.l e;
    public final v f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b4 f109278g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f109279h;
    public final w i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f109280j;

    public x(String name, String title, String subtitle, dx4.q qVar, dx4.l lVar, v vVar, b4 b4Var, boolean z, w wVar, boolean z3) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f109275a = name;
        this.f109276b = title;
        this.f109277c = subtitle;
        this.d = qVar;
        this.e = lVar;
        this.f = vVar;
        this.f109278g = b4Var;
        this.f109279h = z;
        this.i = wVar;
        this.f109280j = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f109275a, xVar.f109275a) && Intrinsics.f(this.f109276b, xVar.f109276b) && Intrinsics.f(this.f109277c, xVar.f109277c) && this.d == xVar.d && Intrinsics.f(this.e, xVar.e) && Intrinsics.f(this.f, xVar.f) && Intrinsics.f(this.f109278g, xVar.f109278g) && this.f109279h == xVar.f109279h && Intrinsics.f(this.i, xVar.i) && this.f109280j == xVar.f109280j;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f109275a.hashCode() * 31, 31, this.f109276b), 31, this.f109277c);
        dx4.q qVar = this.d;
        int iHashCode = (iC + (qVar == null ? 0 : qVar.hashCode())) * 31;
        dx4.l lVar = this.e;
        int iHashCode2 = (iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31;
        v vVar = this.f;
        int iHashCode3 = (iHashCode2 + (vVar == null ? 0 : vVar.hashCode())) * 31;
        b4 b4Var = this.f109278g;
        int iC2 = j6.a.c((iHashCode3 + (b4Var == null ? 0 : b4Var.f120559a.hashCode())) * 31, 31, this.f109279h);
        w wVar = this.i;
        return Boolean.hashCode(this.f109280j) + ((iC2 + (wVar != null ? wVar.hashCode() : 0)) * 31);
    }
}
