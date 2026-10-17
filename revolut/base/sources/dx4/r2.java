package dx4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class r2 implements y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f120744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o2 f120745c;
    public final n2 d;
    public final p2 e;
    public final q2 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f120746g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final q f120747h;

    public r2(String title, String description, o2 descriptionStyle, n2 n2Var, p2 p2Var, q2 style, l lVar, q qVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(descriptionStyle, "descriptionStyle");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f120743a = title;
        this.f120744b = description;
        this.f120745c = descriptionStyle;
        this.d = n2Var;
        this.e = p2Var;
        this.f = style;
        this.f120746g = lVar;
        this.f120747h = qVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r2)) {
            return false;
        }
        r2 r2Var = (r2) obj2;
        return Intrinsics.f(this.f120743a, r2Var.f120743a) && Intrinsics.f(this.f120744b, r2Var.f120744b) && this.f120745c == r2Var.f120745c && this.d == r2Var.d && Intrinsics.f(this.e, r2Var.e) && this.f == r2Var.f && Intrinsics.f(this.f120746g, r2Var.f120746g) && this.f120747h == r2Var.f120747h;
    }

    public final int hashCode() {
        int iHashCode = (this.f120745c.hashCode() + p.a.c(this.f120743a.hashCode() * 31, 31, this.f120744b)) * 31;
        n2 n2Var = this.d;
        int iHashCode2 = (iHashCode + (n2Var == null ? 0 : n2Var.hashCode())) * 31;
        p2 p2Var = this.e;
        int iHashCode3 = (this.f.hashCode() + ((iHashCode2 + (p2Var == null ? 0 : p2Var.hashCode())) * 31)) * 31;
        l lVar = this.f120746g;
        int iHashCode4 = (iHashCode3 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        q qVar = this.f120747h;
        return iHashCode4 + (qVar != null ? qVar.hashCode() : 0);
    }
}
